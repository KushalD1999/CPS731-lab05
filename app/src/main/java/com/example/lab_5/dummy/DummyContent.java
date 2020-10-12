package com.example.lab_5.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();
    private static ArrayList<String> movieNames = new ArrayList<>();
    private static ArrayList<String> movieDescription = new ArrayList<>();
    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 7;

    static {

        movieDescription.add("SpongeBob and Patrick travel to the lost city of Atlantic City to solve the mysterious kidnapping of Gary the snail. They soon prove that there's nothing stronger than the power of friendship as they encounter danger and delight at every turn.");
        movieNames.add("The SpongeBob Movie: Sponge on the Run");

        movieDescription.add("During World War II, Steve Rogers decides to volunteer in an experiment that transforms his weak body. He must now battle a secret Nazi organisation headed by Johann Schmidt to defend his nation.");
        movieNames.add("Captain America: The First Avenger");

        movieDescription.add("Fast & Furious is a media franchise centered on a series of action films that are largely concerned with illegal street racing, heists and spies.");
        movieNames.add("Fast & Furious");

        movieDescription.add("Mission: Impossible is a series of American action spy films both based on and a follow-on from the television series of the same name created by Bruce Geller. The series is mainly produced by and stars Tom Cruise, whose character is Ethan Hunt, an agent of the Impossible Missions Force.");
        movieNames.add("Mission: Impossible");

        movieDescription.add("Transformers is a series of American science fiction action films based on the Transformers franchise which began in the 1980s. Michael Bay has directed the first five films: Transformers, Revenge of the Fallen, Dark of the Moon, Age of Extinction, and The Last Knight.");
        movieNames.add("Transformers");

        movieDescription.add("Nick Fury is compelled to launch the Avengers Initiative when Loki poses a threat to planet Earth. His squad of superheroes put their minds together to accomplish the task.");
        movieNames.add("The Avengers");

        movieDescription.add("John Hammond, an entrepreneur, opens a wildlife park containing cloned dinosaurs. However, a breakdown of the island's security system causes the creatures to escape and bring about chaos.");
        movieNames.add("Jurassic Park");
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), movieNames.get(position-1), movieDescription.get(position-1));
    }


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}