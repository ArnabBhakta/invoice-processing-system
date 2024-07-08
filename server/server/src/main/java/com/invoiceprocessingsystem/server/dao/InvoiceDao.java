//The Data Access Object (DAO) support in Spring is aimed at making it easy to work
//with data access technologies like JDBC, Hibernate, JPA or JDO.

package com.invoiceprocessingsystem.server.dao;

import com.invoiceprocessingsystem.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {
}
