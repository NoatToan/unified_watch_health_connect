package com.xiaomi.hm.health.bt.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/bt/model/HealthRemindConfig;", "", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "a", "Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "getInvalidTime", "()Lcom/xiaomi/hm/health/bt/model/SimpleTime;", "setInvalidTime", "(Lcom/xiaomi/hm/health/bt/model/SimpleTime;)V", "invalidTime", "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class HealthRemindConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private SimpleTime invalidTime;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthRemindConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HealthRemindConfig(@Nullable SimpleTime simpleTime) {
        this.invalidTime = simpleTime;
    }

    @Nullable
    public final SimpleTime getInvalidTime() {
        return this.invalidTime;
    }

    public final void setInvalidTime(@Nullable SimpleTime simpleTime) {
        this.invalidTime = simpleTime;
    }

    public /* synthetic */ HealthRemindConfig(SimpleTime simpleTime, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : simpleTime);
    }
}
