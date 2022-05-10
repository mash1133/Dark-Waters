package mod.azure.darkwaters.client.models;

import mod.azure.darkwaters.DarkWatersMod;
import mod.azure.darkwaters.entity.SightHunterEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;

public class SightHunterModel extends AnimatedTickingGeoModel<SightHunterEntity> {

	@Override
	public Identifier getAnimationResource(SightHunterEntity animatable) {
		return new Identifier(DarkWatersMod.MODID, "animations/sight_hunter.animation.json");
	}

	@Override
	public Identifier getModelResource(SightHunterEntity object) {
		return new Identifier(DarkWatersMod.MODID, "geo/sight_hunter.geo.json");
	}

	@Override
	public Identifier getTextureResource(SightHunterEntity object) {
		return new Identifier(DarkWatersMod.MODID, "textures/entity/sight_hunter.png");
	}

}
