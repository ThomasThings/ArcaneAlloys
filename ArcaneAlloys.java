package arcane;

import arc.*;
import arc.func.*;
import mindustry.ctype.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.mod.Mods.*;
import arcane.content.*;
import arcane.content.items.*;

import static arc.Core.*;
import static mindustry.Vars.*;

public class ArcaneAlloys extends Mod{

    private final ContentList[] aaContent = {
        new AAItems(),
    };

    @Override
    public void loadContent(){
        for(ContentList list : aaContent){
            list.load();

            //Log.info("@: Loaded content list: @", getClass().getSimpleName(), list.getClass().getSimpleName());
        }
    }
}