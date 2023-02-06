package fruitninja;

import cs15.prj.fruitNinjaSupport.CS15FruitNinjaGame;

public class Game extends CS15FruitNinjaGame {

    public void updateChoppable(Object object) {
    }

    public void changeBlade(){
    }

    @Override
    public Object launchItem() {
        return null;
    }

    /* Do not modify anything below this line! */
    @Override
    public void updateChoppableHelper() {
        this.updateChoppable(this.getCurrentItem());
    }

    @Override
    public void changeBladeHelper() {
        this.changeBlade();
    }
}
