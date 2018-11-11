package moving.domain;

import java.util.List;

public class Box implements Thing{
    private int maxCapacity;

    private List<Thing> box;

    public Box(int maximumCapacity) {
        this.maxCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing){
        if(!(thing.getVolume() > (this.getVolume() + thing.getVolume()))){
            box.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        int volume = 0;

        for (Thing thing: box
             ) {
            volume += thing.getVolume();
        }

        return volume;
    }
}
