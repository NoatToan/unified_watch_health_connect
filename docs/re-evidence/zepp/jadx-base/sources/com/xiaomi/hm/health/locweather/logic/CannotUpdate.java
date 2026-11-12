package com.xiaomi.hm.health.locweather.logic;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/locweather/logic/CannotUpdate;", "Lcom/xiaomi/hm/health/locweather/logic/UpdateLocationStrategy;", "", "a", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "reason", "<init>", "(Ljava/lang/String;)V", "locweather_release"}, k = 1, mv = {1, 5, 1})
public final class CannotUpdate extends UpdateLocationStrategy {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String reason;

    public CannotUpdate(@NotNull String str) {
        super(null);
        this.reason = str;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }
}
