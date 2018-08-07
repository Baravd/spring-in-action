package tutorial.model;

import org.springframework.stereotype.Component;

import java.io.PrintStream;

@Component
public class SlayDragonQuest implements Quest{


    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on slay dragon");
    }
}
