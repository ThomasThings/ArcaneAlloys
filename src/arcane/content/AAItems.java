package arcane.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.type.*;

public class AAItems implements ContentList{
    public static Item
        arcanite; arcum; arcaneAlloy; electronite; volatite; wintirium; blastAlloy; plastidAlloy; electrumAlloy; ultimAlloy;

    @Override
    public void load(){
        arcanite = new Item("arcanite", Color.valueOf("845f92")){{
            radioactivity = 0.05f;
            cost = 1f;
            hideDetails = false;
        }};
        arcum = new Item("arcum", Color.valueOf("4d3058")){{
            cost = 1.5f;
            hideDetails = false;
        }};
        arcaneAlloy = new Item("arcane-alloy", Color.valueOf("291a2e")){{
            radioactivity = 0.2f;
            charge = 0.1
            cost = 2.5f;
            hideDetails = false;
        }};
        electronite = new Item("electronite", Color.valueOf("666a74")){{
            charge: 2
            cost = 1.5f;
            hideDetails = false;
        }};
        volatite = new Item("volatite", Color.valueOf("810b39")){{
            explosiveness = 2.7f;
            cost = 2f;
            hideDetails = false;
        }};
        wintirium = new Item("wintirium", Color.valueOf("ffffff")){{
            radioactivity = 0.5f;
            cost = 1.5f;
            hideDetails = false;
        }};
        blastAlloy = new Item("blast-alloy", Color.valueOf("a15148")){{
            explosiveness = 6f;
            flammability = 0.3f;
            cost = 2f;
            hideDetails = false;
        }};
        plastidAlloy = new Item("plastid-alloy", Color.valueOf("9cb664")){{
            explosiveness = 0.4f;
            flammability = 0.2f;
            cost = 2f;
            hideDetails = false;
        }};
        electrumAlloy = new Item("electrum-alloy", Color.valueOf("3a3a50")){{
            explosiveness = 0.3f;
            charge = 5;
            cost = 2f;
            hideDetails = false;
        }};
        ultimAlloy = new Item("ultim-alloy", Color.valueOf("4f7497")){{
            explosiveness = 0.2f;
            charge = 1;
            radioactivity = 0.8;
            cost = 4f;
            hideDetails = false;
        }};
    }
}