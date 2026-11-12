package com.xiaomi.hm.health.play.card.intelligence.watchface;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¨\u0006\u0003"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/play/card/intelligence/watchface/SizeType;", "a", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class WatchFaceSizeManagerKt {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceSource.values().length];
            iArr[HMDeviceSource.MILI_YORK.ordinal()] = 1;
            iArr[HMDeviceSource.MILI_KESTREL.ordinal()] = 2;
            iArr[HMDeviceSource.MILI_KESTREL_W.ordinal()] = 3;
            iArr[HMDeviceSource.MILI_KESTREL_L.ordinal()] = 4;
            iArr[HMDeviceSource.MILI_KESTREL_WL.ordinal()] = 5;
            iArr[HMDeviceSource.MILI_CORSICA.ordinal()] = 6;
            iArr[HMDeviceSource.MILI_CORSICA_W.ordinal()] = 7;
            iArr[HMDeviceSource.MILI_NEWTON.ordinal()] = 8;
            iArr[HMDeviceSource.MILI_NEWTON_W.ordinal()] = 9;
            iArr[HMDeviceSource.MILI_BONN.ordinal()] = 10;
            iArr[HMDeviceSource.MILI_BONN_W.ordinal()] = 11;
            iArr[HMDeviceSource.MILI_COMO.ordinal()] = 12;
            iArr[HMDeviceSource.MILI_COMO_W.ordinal()] = 13;
            iArr[HMDeviceSource.MILI_COMO_L.ordinal()] = 14;
            iArr[HMDeviceSource.MILI_COMO_WL.ordinal()] = 15;
            iArr[HMDeviceSource.MILI_NESS.ordinal()] = 16;
            iArr[HMDeviceSource.MILI_NESS_W.ordinal()] = 17;
            iArr[HMDeviceSource.MILI_NESS_L.ordinal()] = 18;
            iArr[HMDeviceSource.MILI_NESS_WL.ordinal()] = 19;
            iArr[HMDeviceSource.MILI_VENICE.ordinal()] = 20;
            iArr[HMDeviceSource.MILI_VENICE_W.ordinal()] = 21;
            iArr[HMDeviceSource.MILI_DTH.ordinal()] = 22;
            iArr[HMDeviceSource.MILI_DTH_W.ordinal()] = 23;
            iArr[HMDeviceSource.MILI_ANETO.ordinal()] = 24;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SizeType a(HMDeviceSource hMDeviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[hMDeviceSource.ordinal()]) {
            case 1:
                return SizeType.BAND;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return SizeType.RECT;
            case 12:
            case 13:
            case 14:
            case 15:
                return SizeType.COMO;
            case 16:
            case 17:
            case 18:
            case 19:
                return SizeType.NESS;
            case 20:
            case 21:
                return SizeType.LONG_BAND;
            case 22:
            case 23:
            case 24:
                return SizeType.SQUARE;
            default:
                return SizeType.CIRCLE;
        }
    }
}
