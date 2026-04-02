// Entity class for user table
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    // getters & setters
}
