package com.xiaomi.hm.health.bt.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HealthRemindConfig;", "", "invalidTime", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "(Lcom/xiaomi/hm/health/bt/model/SimpleTime;)V", "getInvalidTime", "()Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "setInvalidTime", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class HealthRemindConfig {

    @Nullable
    private SimpleTime invalidTime;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthRemindConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    public final SimpleTime getInvalidTime() {
        return this.invalidTime;
    }

    public final void setInvalidTime(@Nullable SimpleTime simpleTime) {
        this.invalidTime = simpleTime;
    }

    public HealthRemindConfig(@Nullable SimpleTime simpleTime) {
        this.invalidTime = simpleTime;
    }

    public /* synthetic */ HealthRemindConfig(SimpleTime simpleTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : simpleTime);
    }
}
