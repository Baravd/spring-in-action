package tutorial.model;

import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Before");
    }

    public void singAfterQuest() {
        stream.println("After");
    }
}
