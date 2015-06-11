package latmod.ftbu.core.event;

import java.util.UUID;

import latmod.ftbu.client.FTBURenderHandler;
import latmod.ftbu.core.client.badges.Badge;
import cpw.mods.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class CustomBadgesEvent extends EventLM
{
	public void register(UUID user, Badge b)
	{ FTBURenderHandler.playerBadges.put(user, b); }
}