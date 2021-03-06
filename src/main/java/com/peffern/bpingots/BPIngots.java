package com.peffern.bpingots;


import com.bioxx.tfc.Core.Metal.Alloy.EnumTier;
import com.bioxx.tfc.api.Metal;
import com.bioxx.tfc.api.Crafting.AnvilReq;
import com.bluepowermod.init.BPItems;
import com.peffern.metals.ExpanderMetal;
import com.peffern.metals.IMetal;
import com.peffern.metals.Ingredient;
import com.peffern.metals.MetalData;
import com.peffern.metals.MetalsRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.item.Item;

/**
 * Mod to make blue power alloy ingots into proper tfc metals
 * @author peffern
 *
 */
@Mod(modid = BPIngots.MODID, name = BPIngots.MODNAME, version = BPIngots.VERSION, dependencies = "required-before:" + "terrafirmacraft" + ";" + "required-after:" + "tfcmetals" + "required-after:" + "bluepower" + ";")
public class BPIngots 
{
	
	/** Mod ID String */
	public static final String MODID = "bpingots";
	
	/** Mod Name */
	public static final String MODNAME = "BP Ingots";
	
	/** Mod Version */
	public static final String VERSION = "1.1";
	
	/** molten ingot */
	public static Item redAlloyUnshaped;
	
	/** welded ingot */
	public static Item redAlloyIngot2X;
	
	/** sheet */
	public static Item redAlloySheet;
	
	/** welded sheet */
	public static Item redAlloySheet2X;
	
	/** RA metal instance in the registry */
	public static Metal RED_ALLOY;
	
	/** molten ingot */
	public static Item blueAlloyUnshaped;
	
	/** welded ingot */
	public static Item blueAlloyIngot2X;
	
	/** sheet */
	public static Item blueAlloySheet;
	
	/** welded sheet */
	public static Item blueAlloySheet2X;
	
	/** BA metal instance in the registry */
	public static Metal BLUE_ALLOY;
	
	/** molten ingot */
	public static Item purpleAlloyUnshaped;
	
	/** welded ingot */
	public static Item purpleAlloyIngot2X;
	
	/** sheet */
	public static Item purpleAlloySheet;
	
	/** welded sheet */
	public static Item purpleAlloySheet2X;
	
	/** PA metal instance in the registry */
	public static Metal PURPLE_ALLOY;
	
	
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		

		//red aloy
		IMetal metal = new ExpanderMetal
		(
			"Red Alloy",
			"redAlloyUnshaped",
			BPIngots.MODID + ":" + "redUnshaped",
			BPItems.red_alloy_ingot,
			"redAlloyIngot2X",
			BPIngots.MODID + ":" + "redDoubleIngot",
			"redAlloySheet",
			BPIngots.MODID + ":" + "redSheet",
			"redAlloySheet2X",
			BPIngots.MODID + ":" + "redDoubleSheet",
			BPIngots.MODID + ":" + "metal/RedAlloy",
			BPIngots.MODID + ":" + "metal/RedAlloy Trap Door",
			BPIngots.MODID,
			"textures/blocks/metal/RedAlloy.png",
			null,
			0.35, 
			765,
			EnumTier.TierV,
			AnvilReq.WROUGHTIRON
		);
		MetalData data = MetalsRegistry.addMetal(metal);
		
		redAlloyUnshaped = data.unshaped;
		redAlloyIngot2X = data.ingot2X;
		redAlloySheet = data.sheet;
		redAlloySheet2X = data.sheet2X;
		RED_ALLOY = data.metal;
		
		//blue alloy
		metal = new ExpanderMetal
		(
			"Blue Alloy",
			"blueAlloyUnshaped",
			BPIngots.MODID + ":" + "blueUnshaped",
			BPItems.blue_alloy_ingot,
			"blueAlloyIngot2X",
			BPIngots.MODID + ":" + "blueDoubleIngot",
			"blueAlloySheet",
			BPIngots.MODID + ":" + "blueSheet",
			"blueAlloySheet2X",
			BPIngots.MODID + ":" + "blueDoubleSheet",
			BPIngots.MODID + ":" + "metal/BlueAlloy",
			BPIngots.MODID + ":" + "metal/BlueAlloy Trap Door",
			BPIngots.MODID,
			"textures/blocks/metal/BlueAlloy.png",
			null,
			0.35, 
			765,
			EnumTier.TierV,
			AnvilReq.WROUGHTIRON
		);
		data = MetalsRegistry.addMetal(metal);
		
		blueAlloyUnshaped = data.unshaped;
		blueAlloyIngot2X = data.ingot2X;
		blueAlloySheet = data.sheet;
		blueAlloySheet2X = data.sheet2X;
		BLUE_ALLOY = data.metal;
		
		//purple alloy
		metal = new ExpanderMetal
		(
			"Purple Alloy",
			"purpleAlloyUnshaped",
			BPIngots.MODID + ":" + "purpleUnshaped",
			BPItems.purple_alloy_ingot,
			"purpleAlloyIngot2X",
			BPIngots.MODID + ":" + "purpleDoubleIngot",
			"purpleAlloySheet",
			BPIngots.MODID + ":" + "purpleSheet",
			"purpleAlloySheet2X",
			BPIngots.MODID + ":" + "purpleDoubleSheet",
			BPIngots.MODID + ":" + "metal/PurpleAlloy",
			BPIngots.MODID + ":" + "metal/PurpleAlloy Trap Door",
			BPIngots.MODID,
			"textures/blocks/metal/PurpleAlloy.png",
			new Ingredient[]{new Ingredient(RED_ALLOY,49.99f,50.01f), new Ingredient(BLUE_ALLOY,49.99f,50.01f)},
			0.35, 
			765,
			EnumTier.TierV,
			AnvilReq.WROUGHTIRON
		);
		data = MetalsRegistry.addMetal(metal);
		
		purpleAlloyUnshaped = data.unshaped;
		purpleAlloyIngot2X = data.ingot2X;
		purpleAlloySheet = data.sheet;
		purpleAlloySheet2X = data.sheet2X;
		PURPLE_ALLOY = data.metal;

	
	}
	
}
