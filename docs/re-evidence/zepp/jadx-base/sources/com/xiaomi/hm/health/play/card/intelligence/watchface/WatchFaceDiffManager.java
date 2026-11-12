package com.xiaomi.hm.health.play.card.intelligence.watchface;

import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/watchface/WatchFaceDiffManager;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "deviceSource", "", "isSupportShowDialData", "", "a", "Ljava/util/List;", "notSupportDeviceSource", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchFaceDiffManager {

    @NotNull
    public static final WatchFaceDiffManager INSTANCE = new WatchFaceDiffManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final List<HMDeviceSource> notSupportDeviceSource = CollectionsKt__CollectionsKt.listOf((Object[]) new HMDeviceSource[]{HMDeviceSource.MILI_DTH, HMDeviceSource.MILI_DTH_W, HMDeviceSource.MILI_PEYTO, HMDeviceSource.MILI_PEYTO_L, HMDeviceSource.MILI_PEYTO_WL, HMDeviceSource.MILI_TONLESAP, HMDeviceSource.MILI_TONLESAP_L, HMDeviceSource.MILI_TONLESAP_O, HMDeviceSource.MILI_TONLESAP_OL, HMDeviceSource.MILI_BEATS, HMDeviceSource.MILI_BEATS_P, HMDeviceSource.MILI_BEATS_W, HMDeviceSource.MILI_TEMPO});

    private WatchFaceDiffManager() {
    }

    public final boolean isSupportShowDialData(@NotNull HMDeviceSource deviceSource) {
        return deviceSource.getType() == HMDeviceType.MILI && !notSupportDeviceSource.contains(deviceSource);
    }
}
