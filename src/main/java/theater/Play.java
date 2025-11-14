package theater;

/**
 * Represents a play with a name and a type (e.g., tragedy or comedy).
 *
 * <p>This class is immutable and cannot be null.</p>
 *
 * @null this class should not be null
 */

public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
