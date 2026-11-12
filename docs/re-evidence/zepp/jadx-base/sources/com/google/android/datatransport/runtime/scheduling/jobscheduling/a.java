package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.alipay.sdk.m.u.i;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class a extends SchedulerConfig {
    private final Clock e;
    private final Map<Priority, SchedulerConfig.ConfigValue> f;

    public a(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        Objects.requireNonNull(clock, "Null clock");
        this.e = clock;
        Objects.requireNonNull(map, "Null values");
        this.f = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Clock c() {
        return this.e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.ConfigValue> d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.e.equals(schedulerConfig.c()) && this.f.equals(schedulerConfig.d());
    }

    public int hashCode() {
        return ((this.e.hashCode() ^ 1000003) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.e + ", values=" + this.f + i.d;
    }
}
