package com.mrtrollnugnug.bearwithme.common.entity;

import com.mrtrollnugnug.bearwithme.handler.ContentHandler;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityPolarBear;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityBlackBear extends EntityPolarBear {
    public EntityBlackBear (World worldIn) {
        super(worldIn);
        this.setSize(1.3F, 1.4F);
    }
    
    @Override
    public EntityAgeable createChild (EntityAgeable ageable) {
        return new EntityBlackBear(this.getEntityWorld());
    }

    @Override
    protected void applyEntityAttributes () {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(25.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.30D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(8.0D);
    }

	@Override
    protected ResourceLocation getLootTable() {
        return ContentHandler.ENTITIES_BLACK_BEAR;
    }
}
