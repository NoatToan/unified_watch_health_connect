package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import j20.x;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@AutoValue
public abstract class SchedulerConfig {
    private static final long BACKOFF_LOG_BASE = 10000;
    private static final long ONE_SECOND = 1000;
    private static final long THIRTY_SECONDS = 30000;
    private static final long TWENTY_FOUR_HOURS = 86400000;

    public static class Builder {
        private Clock clock;
        private Map<Priority, ConfigValue> values = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.values.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.clock == null) {
                x.l("missing required property: clock");
                return null;
            }
            if (this.values.keySet().size() < Priority.values().length) {
                h.z("Not all priorities have been configured");
                return null;
            }
            Map<Priority, ConfigValue> map = this.values;
            this.values = new HashMap();
            return SchedulerConfig.create(this.clock, map);
        }

        public Builder setClock(Clock clock) {
            this.clock = clock;
            return this;
        }
    }

    @AutoValue
    public static abstract class ConfigValue {

        @AutoValue.Builder
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j8);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j8);
        }

        public static Builder builder() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.EMPTY_SET);
        }

        public abstract long getDelta();

        public abstract Set<Flag> getFlags();

        public abstract long getMaxAllowedDelay();
    }

    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long adjustedExponentialBackoff(int i14, long j8) {
        int i15 = i14 - 1;
        return (long) (Math.pow(3.0d, i15) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j8 > 1 ? j8 : 2L) * ((long) i15))));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchedulerConfig create(Clock clock, Map<Priority, ConfigValue> map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(immutableSetOf(Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    private static <T> Set<T> immutableSetOf(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void populateFlags(JobInfo.Builder builder, Set<Flag> set) {
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

    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j8, int i14) {
        builder.setMinimumLatency(getScheduleDelay(priority, j8, i14));
        populateFlags(builder, getValues().get(priority).getFlags());
        return builder;
    }

    public abstract Clock getClock();

    public Set<Flag> getFlags(Priority priority) {
        return getValues().get(priority).getFlags();
    }

    public long getScheduleDelay(Priority priority, long j8, int i14) {
        long time = j8 - getClock().getTime();
        ConfigValue configValue = getValues().get(priority);
        return Math.min(Math.max(adjustedExponentialBackoff(i14, configValue.getDelta()), time), configValue.getMaxAllowedDelay());
    }

    public abstract Map<Priority, ConfigValue> getValues();
}
