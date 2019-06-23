package OxBank;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.CustomeDetail;

@Repository
public interface OXBANK extends CrudRepository<CustomeDetail,String>
{

}
