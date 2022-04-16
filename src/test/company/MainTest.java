package company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static company.Main.guessLogic;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void main() {
        assertEquals("1", guessLogic("2"));
    }


}