package guru.springframework.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;
import sun.tools.jconsole.Plotter;

/**
 * Created by dz on 15/03/21.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
