package com.xiaomi.hm.health.play.card.intelligence.watchface;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceSizeManager;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "Lkotlin/Pair;", "", "getDialCardSize", "getDialItemWidth", "getDialTopMargin", "getNewTipsStartMargin", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceSizeManager {

    @NotNull
    public static final WatchFaceSizeManager INSTANCE = new WatchFaceSizeManager();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SizeType.values().length];
            iArr[SizeType.BAND.ordinal()] = 1;
            iArr[SizeType.RECT.ordinal()] = 2;
            iArr[SizeType.COMO.ordinal()] = 3;
            iArr[SizeType.NESS.ordinal()] = 4;
            iArr[SizeType.LONG_BAND.ordinal()] = 5;
            iArr[SizeType.SQUARE.ordinal()] = 6;
            iArr[SizeType.CIRCLE.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private WatchFaceSizeManager() {
    }

    @NotNull
    public final Pair<Integer, Integer> getDialCardSize(@NotNull HMDeviceSource deviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[WatchFaceSizeManagerKt.a(deviceSource).ordinal()]) {
            case 1:
                return TuplesKt.to(64, 149);
            case 2:
                return TuplesKt.to(87, 110);
            case 3:
                return TuplesKt.to(104, 110);
            case 4:
                return TuplesKt.to(95, 110);
            case 5:
                return TuplesKt.to(50, 160);
            case 6:
                return TuplesKt.to(100, 100);
            case 7:
                return TuplesKt.to(110, 110);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getDialItemWidth(@NotNull HMDeviceSource deviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[WatchFaceSizeManagerKt.a(deviceSource).ordinal()]) {
            case 1:
            case 5:
                return 100;
            case 2:
                return 119;
            case 3:
                return 124;
            case 4:
                return 127;
            case 6:
            case 7:
                return 120;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getDialTopMargin(@NotNull HMDeviceSource deviceSource) {
        return WhenMappings.$EnumSwitchMapping$0[WatchFaceSizeManagerKt.a(deviceSource).ordinal()] == 7 ? 0 : 10;
    }

    public final int getNewTipsStartMargin(@NotNull HMDeviceSource deviceSource) {
        switch (WhenMappings.$EnumSwitchMapping$0[WatchFaceSizeManagerKt.a(deviceSource).ordinal()]) {
            case 1:
                return 44;
            case 2:
                return 67;
            case 3:
                return 78;
            case 4:
                return 75;
            case 5:
                return 26;
            case 6:
            case 7:
                return 74;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
