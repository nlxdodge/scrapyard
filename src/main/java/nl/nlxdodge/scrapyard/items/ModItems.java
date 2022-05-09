package nl.nlxdodge.scrapyard.items;

import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import nl.nlxdodge.scrapyard.items.consumeables.CookedMeatSkewer;
import nl.nlxdodge.scrapyard.items.consumeables.RawMeatSkewer;
import nl.nlxdodge.scrapyard.items.consumeables.SweetBerrySoda;
import nl.nlxdodge.scrapyard.items.craftables.GoldRing;
import nl.nlxdodge.scrapyard.items.craftables.ScrapItem;
import nl.nlxdodge.scrapyard.items.craftables.SlimeCore;
import nl.nlxdodge.scrapyard.items.wearables.GlassSword;
import nl.nlxdodge.scrapyard.items.wearables.HandSaw;
import nl.nlxdodge.scrapyard.items.wearables.KingRing;
import nl.nlxdodge.scrapyard.items.wearables.SilverFishSpray;
import nl.nlxdodge.scrapyard.misc.ToolMaterials;

import static nl.nlxdodge.scrapyard.util.RegisterUtils.getIdentifier;

public class ModItems {

    public static final Item GLASS_SWORD = new GlassSword(ToolMaterials.GLASS, 2, 1.5f, new Item.Settings());
    public static final Item SILVERFISH_SPRAY = new SilverFishSpray(new Item.Settings());
    public static final Item SCRAP_ITEM = new ScrapItem(new Item.Settings());
    public static final Item SWEET_BERRY_SODA = new SweetBerrySoda(new Item.Settings());
    public static final Item RAW_MEAT_SKEWER = new RawMeatSkewer(new Item.Settings());
    public static final Item COOKED_MEAT_SKEWER = new CookedMeatSkewer(new Item.Settings());
    public static final Item GOLD_RING = new GoldRing(new Item.Settings());
    public static final Item KING_RING = new KingRing(new Item.Settings());
    public static final Item HAND_SAW = new HandSaw(new Item.Settings());
    public static final Item SLIME_CORE = new SlimeCore(new Item.Settings());

    public static void registerItems() {
        Registry.register(Registry.ITEM, getIdentifier("glass_sword"), GLASS_SWORD);
        Registry.register(Registry.ITEM, getIdentifier("silver_fish_spray"), SILVERFISH_SPRAY);
        Registry.register(Registry.ITEM, getIdentifier("scrap_item"), SCRAP_ITEM);
        Registry.register(Registry.ITEM, getIdentifier("sweet_berry_soda"), SWEET_BERRY_SODA);
        Registry.register(Registry.ITEM, getIdentifier("raw_meat_skewer"), RAW_MEAT_SKEWER);
        Registry.register(Registry.ITEM, getIdentifier("cooked_meat_skewer"), COOKED_MEAT_SKEWER);
        Registry.register(Registry.ITEM, getIdentifier("gold_ring"), GOLD_RING);
        Registry.register(Registry.ITEM, getIdentifier("king_ring"), KING_RING);
        Registry.register(Registry.ITEM, getIdentifier("hand_saw"), HAND_SAW);
        Registry.register(Registry.ITEM, getIdentifier("slime_core"), SLIME_CORE);
    }
}
