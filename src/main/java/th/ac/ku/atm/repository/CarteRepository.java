package th.ac.ku.atm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import th.ac.ku.atm.model.Carte;
import th.ac.ku.atm.model.User;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Integer> {
    // don't forget to change root password to the actual one

    @Query(value = " Select * FROM cartes where  pin=?1", nativeQuery = true)

    Carte getCartByPin(String pin);



}
