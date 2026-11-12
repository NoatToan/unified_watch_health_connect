package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class SchedulerConfig {
    private static final long a = 86400000;
    private static final long b = 30000;
    private static final long c = 1000;
    private static final long d = 10000;

    public static class Builder {
        private Clock a;
        private Map<Priority, ConfigValue> b = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.b.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            Objects.requireNonNull(this.a, "missing required property: clock");
            if (this.b.keySet().size() < Priority.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<Priority, ConfigValue> map = this.b;
            this.b = new HashMap();
            return SchedulerConfig.b(this.a, map);
        }

        public Builder setClock(Clock clock) {
            this.a = clock;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j);
        }

        public static Builder builder() {
            return new b.C0141b().setFlags(Collections.emptySet());
        }

        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i, long j) {
        int i2 = i - 1;
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log((j > 1 ? j : 2L) * ((long) i2))));
    }

    public static SchedulerConfig b(Clock clock, Map<Priority, ConfigValue> map) {
        return new a(clock, map);
    }

    public static Builder builder() {
        return new Builder();
    }

    private static <T> Set<T> e(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    private void f(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(e(Flag.NETWORK_UNMETERED, Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    public abstract Clock c();

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(priority, j, i));
        f(builder, d().get(priority).b());
        return builder;
    }

    public abstract Map<Priority, ConfigValue> d();

    public Set<Flag> getFlags(Priority priority) {
        return d().get(priority).b();
    }

    public long getScheduleDelay(Priority priority, long j, int i) {
        long time = j - c().getTime();
        ConfigValue configValue = d().get(priority);
        return Math.min(Math.max(a(i, configValue.a()), time), configValue.c());
    }
}
