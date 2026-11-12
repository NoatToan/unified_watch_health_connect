package com.xiaomi.fitness.main;

import com.xiaomi.fitness.cache.sp.PreferenceSupport;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/main/KeepaliveTimePreference;", "Lcom/xiaomi/fitness/cache/sp/PreferenceSupport;", "<init>", "()V", "spName", "", "getSpName", "()Ljava/lang/String;", "KEY_KEEPALIVE_LAST_TIME", "setKeepaliveLastTime", "", "value", "", "getKeepaliveLastTime", "main_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KeepaliveTimePreference extends PreferenceSupport {

    @NotNull
    public static final KeepaliveTimePreference INSTANCE = new KeepaliveTimePreference();

    @NotNull
    private static final String KEY_KEEPALIVE_LAST_TIME = "key_keepalive_last_time";

    private KeepaliveTimePreference() {
    }

    public final long getKeepaliveLastTime() {
        return ((Number) getValue(getSpName(), KEY_KEEPALIVE_LAST_TIME, 86400L)).longValue();
    }

    @Override // com.xiaomi.fitness.cache.sp.PreferenceSupport
    @NotNull
    public String getSpName() {
        return "keepalive_time_preference";
    }

    public final void setKeepaliveLastTime(long value) {
        putValue(KEY_KEEPALIVE_LAST_TIME, Long.valueOf(value));
    }
}
