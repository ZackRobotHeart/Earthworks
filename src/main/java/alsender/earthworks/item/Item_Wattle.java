package alsender.earthworks.item;

import alsender.earthworks.main.Earthworks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/12/16.
 */
public class Item_Wattle extends Item {
    public Item_Wattle () {
        setCreativeTab(CreativeTabs.MATERIALS);
        setRegistryName("item_wattle");
        setUnlocalizedName(Earthworks.mod_id + ".item_wattle");
        GameRegistry.register(this);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
