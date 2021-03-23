package jpabook.jpashop.domain.item;

import jpabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("B")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter @Setter
public class Book extends Item {
    private String author;
    private String isbn;

}
