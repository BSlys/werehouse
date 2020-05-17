package com.sda.werehouse.unit303.repository;

import com.sda.werehouse.unit303.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
