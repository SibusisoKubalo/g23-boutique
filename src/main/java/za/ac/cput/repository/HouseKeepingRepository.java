package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Housekeeping;

public interface HouseKeepingRepository extends JpaRepository<Housekeeping, Long> {
}
