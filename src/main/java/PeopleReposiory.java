import SolfugaSoft.demoHeroku.Person;
import org.springframework.data.repository.CrudRepository;


public interface PeopleReposiory extends CrudRepository<Person, Long> {
}
