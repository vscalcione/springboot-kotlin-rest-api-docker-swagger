package it.vscalcione.springboot.crudapplication.repositories;

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {

    fun findByEmailAddressOrPhoneNumber(emailAddress: String?, phoneNumber: String?): List<User>
    fun findByActiveTrueOrderByUsernameDesc(): List<User>
    fun findByActiveFalseOrderByUsernameAsc(): List<User>
    fun findByPhoneNumberContaining(searchForPhone: String): List<User>
}