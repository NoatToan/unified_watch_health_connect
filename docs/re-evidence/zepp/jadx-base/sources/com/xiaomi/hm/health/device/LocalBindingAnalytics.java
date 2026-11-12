package com.xiaomi.hm.health.device;

import com.facebook.appevents.integrity.IntegrityManager;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0002J\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\r\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006R\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/LocalBindingAnalytics;", "", "", "code", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "", "sn", "deviceId", "", "a", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "cacheRecord", "postRecord", "", "J", "EXPIRE_TIME", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/xiaomi/hm/health/device/r;", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "cachedMap", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class LocalBindingAnalytics {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final long EXPIRE_TIME = 60000;

    @NotNull
    public static final LocalBindingAnalytics INSTANCE = new LocalBindingAnalytics();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ConcurrentHashMap<String, r> cachedMap = new ConcurrentHashMap<>();

    private LocalBindingAnalytics() {
    }

    private final void a(int code, HMDeviceSource source, String sn, String deviceId) {
    }

    public final void cacheRecord(@NotNull String address, int code, @NotNull HMDeviceSource source) {
        cachedMap.put(address, new r(code, source, System.currentTimeMillis()));
    }

    public final void postRecord(@NotNull String address, @NotNull String sn, @NotNull String deviceId) {
        r rVar = cachedMap.get(address);
        if (rVar != null && System.currentTimeMillis() - rVar.getTimestamp() <= 60000) {
            a(rVar.getCode(), rVar.getSource(), sn, deviceId);
        }
    }
}
