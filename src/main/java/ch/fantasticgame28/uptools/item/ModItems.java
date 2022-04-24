package ch.fantasticgame28.uptools.item;

import ch.fantasticgame28.uptools.UpTools;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(UpTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + UpTools.MOD_ID);
    }

}
