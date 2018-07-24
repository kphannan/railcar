package hello;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/person")
class PersonController
{

    @GetMapping("/hello")
    public Person hello()
    {
        final Person person = new Person();

        person.setFirstname( "John" );
        person.setLastname( "Smith" );

        return person;
    }
}
