package com.xiaomi.hm.health.device.introduce;

import androidx.annotation.StringRes;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.introduce.introentity.BlancIntro;
import com.xiaomi.hm.health.device.introduce.introentity.BlancWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.BonnIntro;
import com.xiaomi.hm.health.device.introduce.introentity.BonnWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.CorsicaIntro;
import com.xiaomi.hm.health.device.introduce.introentity.CorsicaWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.HamburgIntro;
import com.xiaomi.hm.health.device.introduce.introentity.HamburgWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.LisbonIntro;
import com.xiaomi.hm.health.device.introduce.introentity.LisbonWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.NewtonIntro;
import com.xiaomi.hm.health.device.introduce.introentity.NewtonWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.OnyxIntro;
import com.xiaomi.hm.health.device.introduce.introentity.OnyxWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.OspreyIntro;
import com.xiaomi.hm.health.device.introduce.introentity.OspreyWIntro;
import com.xiaomi.hm.health.device.introduce.introentity.VolgaIntro;
import com.xiaomi.hm.health.device.introduce.introentity.VolgaWIntro;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/introduce/IntroduceDisplayConfig;", "createDisplayConfig", "", "res", "", "getString", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class IntroduceShuffleFactoryKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_LISBON.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_LISBON_W.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_LISBON_WL.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_NEWTON_WL.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_ONYX.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_ONYX_W.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_OSPREY.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_OSPREY_C.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_OSPREY_W.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_VOLGA.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_VOLGA_W.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_HAMBURG.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_HAMBURG_W.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_BONN_W.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_BLANC.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_BLANC_W.ordinal()] = 21;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final IntroduceDisplayConfig createDisplayConfig(@NotNull HMDeviceSource hMDeviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()]) {
            case 1:
                return new LisbonIntro(hMDeviceSource);
            case 2:
            case 3:
                return new LisbonWIntro(hMDeviceSource);
            case 4:
                return new NewtonIntro(hMDeviceSource);
            case 5:
            case 6:
                return new NewtonWIntro(hMDeviceSource);
            case 7:
                return new OnyxIntro(hMDeviceSource);
            case 8:
                return new OnyxWIntro(hMDeviceSource);
            case 9:
                return new CorsicaIntro(hMDeviceSource);
            case 10:
                return new CorsicaWIntro(hMDeviceSource);
            case 11:
                return new OspreyIntro(hMDeviceSource);
            case 12:
                return new OspreyIntro(hMDeviceSource);
            case 13:
                return new OspreyWIntro(hMDeviceSource);
            case 14:
                return new VolgaIntro(hMDeviceSource);
            case 15:
                return new VolgaWIntro(hMDeviceSource);
            case 16:
                return new HamburgIntro(hMDeviceSource);
            case 17:
                return new HamburgWIntro(hMDeviceSource);
            case 18:
                return new BonnIntro(hMDeviceSource);
            case 19:
                return new BonnWIntro(hMDeviceSource);
            case 20:
                return new BlancIntro(hMDeviceSource);
            case 21:
                return new BlancWIntro(hMDeviceSource);
            default:
                return new LisbonIntro(hMDeviceSource);
        }
    }

    @NotNull
    public static final String getString(@StringRes int i) {
        return DeviceXFunctionsKt.getContext().getString(i);
    }
}
