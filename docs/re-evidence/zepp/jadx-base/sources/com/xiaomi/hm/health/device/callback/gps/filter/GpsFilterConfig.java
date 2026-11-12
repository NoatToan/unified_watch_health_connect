package com.xiaomi.hm.health.device.callback.gps.filter;

import com.huami.moving.datacenter.TrackDataManager;
import com.huami.watch.dataflow.sync.gps.filter.Config;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/callback/gps/filter/GpsFilterConfig;", "", "", "isEnable", "", "setEnable", "a", "Z", "getEnable$devicex_zeppRelease", "()Z", "setEnable$devicex_zeppRelease", "(Z)V", "enable", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class GpsFilterConfig {

    @NotNull
    public static final GpsFilterConfig INSTANCE = new GpsFilterConfig();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static boolean enable;

    private GpsFilterConfig() {
    }

    public final boolean getEnable$devicex_zeppRelease() {
        return enable;
    }

    public final void setEnable(boolean isEnable) {
        enable = isEnable;
        TrackDataManager.getInstance().setFilterEnable(false);
        Config.INSTANCE.setEnable(enable);
    }

    public final void setEnable$devicex_zeppRelease(boolean z) {
        enable = z;
    }
}
