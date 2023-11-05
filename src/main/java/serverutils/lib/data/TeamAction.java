package serverutils.lib.data;

import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ResourceLocation;

import serverutils.lib.icon.Icon;

public abstract class TeamAction extends Action {

    public TeamAction(String mod, String id, Icon icon, int order) {
        super(
                new ResourceLocation(mod, id),
                new ChatComponentTranslation("team_action." + mod + "." + id),
                icon,
                order);
    }

    @Override
    public TeamAction setTitle(IChatComponent t) {
        super.setTitle(t);
        return this;
    }

    @Override
    public TeamAction setRequiresConfirm() {
        super.setRequiresConfirm();
        return this;
    }
}
