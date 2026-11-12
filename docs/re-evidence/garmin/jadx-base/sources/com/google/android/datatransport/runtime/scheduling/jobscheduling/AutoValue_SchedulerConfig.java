package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import am.j;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import j20.x;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes13.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {
    private final Clock clock;
    private final Map<Priority, SchedulerConfig.ConfigValue> values;

    public AutoValue_SchedulerConfig(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        if (clock == null) {
            x.l("Null clock");
            throw null;
        }
        this.clock = clock;
        if (map != null) {
            this.values = map;
        } else {
            x.l("Null values");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            if (this.clock.equals(schedulerConfig.getClock()) && this.values.equals(schedulerConfig.getValues())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.ConfigValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        return ((this.clock.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("SchedulerConfig{clock=");
        sb3.append(this.clock);
        sb3.append(", values=");
        return j.s(sb3, this.values, StringSubstitutor.DEFAULT_VAR_END);
    }
}
