package me.bank.satader_dev_week_2024.domain.repository;

import me.bank.satader_dev_week_2024.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
