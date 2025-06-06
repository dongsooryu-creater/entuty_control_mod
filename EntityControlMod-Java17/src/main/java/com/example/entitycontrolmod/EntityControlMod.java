package com.yourname.entitycontrolmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod("entitycontrolmod")
public class EntityControlMod {

    public EntityControlMod() {
        // 모드 초기화 코드
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        // 클라이언트 설정 초기화
    }
}
