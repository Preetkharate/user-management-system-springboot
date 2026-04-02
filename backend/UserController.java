// REST controller for handling user APIs
// Supports CRUD operations: create, fetch, delete users
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repo;

    @GetMapping
    public List<User> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        return repo.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
    
    // Simple login API for user authentication
    @PostMapping("/login")
    public String login(@RequestBody User user) {
    if(user.getEmail().equals("test@gmail.com") && user.getName().equals("admin")) {
        return "Login successful";
      }
    return "Invalid credentials";
    }
}
