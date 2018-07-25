package hello.service;

import hello.Person;
import hello.PersonService;
import org.springframework.stereotype.Service;



@Service
final class HelloPersonService
implements PersonService
{
    @Override
    public Person johnSmith()
    {
        final Person person = new Person();

        person.setFirstname( "John" );
        person.setLastname( "Smith" );

        return person;
    }


    @Override
    public String hello( final Person person )
    {
        return "Hello " + person.getFirstname() + " " + person.getLastname() + "!";
    }
}
