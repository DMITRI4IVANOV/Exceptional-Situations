package repository;

import domain.Book;
import domain.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {
    ProductRepository repository = new ProductRepository();
    private Book first = new Book(001, "Возрождение", 1000, "Данке");
    private Book second = new Book(002, "Кто ты", 245, "Анкин");
    private Book third = new Book(003, "Голая правда", 450, "Горд");
    private Book fourth = new Book(004, "Голая правда", 450, "Горд");
    private Book fifth = new Book(005, "Автоматизированное тестирование программного обеспечения", 1000, "Элфрид Дастин, Джефф Рэшка, Джон Пол");
    private Smartphone sixth = new Smartphone(006, "S22", 59000, "Samsung");
    private Smartphone seventh = new Smartphone(007, "T9", 25000, "Xiaomi");
    private Smartphone tenth = new Smartphone(010, "Z7", 16000, "Sony");


    @BeforeEach
    public void setup() {
        repository.save(first);
        repository.save(second);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(tenth);

    }

    @Test
    // Тест сохранить и найти все
    public void testSaveAndFindAll() {
        assertEquals(repository.findAll().length, 5);
    }

    @Test
    public void removalFromTheListId() {
//Удаление существуещего Id
        assertThrows(NotFoundException.class, () -> {
            repository.removeById(001);
        });
    }

    @Test
    public void deletingAnonExistentId() {
//Удаление не существуещего Id
        assertThrows(NotFoundException.class, () -> {
            repository.removeById(011);
        });
    }

}