package at.madeha.intelliinvoice.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String storeName;

    public Double totalAmount;

    public LocalDate invoiceDate;

    public String currency;

    public String taxNumber;
}