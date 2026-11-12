package com.google.firebase.perf.transport;

import android.content.Context;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class RateLimiter {
    private final ConfigResolver configResolver;
    private final double fragmentBucketId;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final double samplingBucketId;
    private RateLimiterImpl traceLimiter;

    public static class RateLimiterImpl {
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private double tokenCount;
        private static final AndroidLogger logger = AndroidLogger.getInstance();
        private static final long MICROS_IN_A_SECOND = 1000000;

        public RateLimiterImpl(Rate rate, long j8, Clock clock, ConfigResolver configResolver, @ResourceType String str, boolean z14) {
            this.clock = clock;
            this.capacity = j8;
            this.rate = rate;
            this.tokenCount = j8;
            this.lastTimeTokenReplenished = clock.getTime();
            setRateByReadingRemoteConfigValues(configResolver, str, z14);
            this.isLogcatEnabled = z14;
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountBackground() : configResolver.getNetworkEventCountBackground();
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getTraceEventCountForeground() : configResolver.getNetworkEventCountForeground();
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            return str == ResourceType.TRACE ? configResolver.getRateLimitSec() : configResolver.getRateLimitSec();
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z14) {
            long flimitSec = getFlimitSec(configResolver, str);
            long flimitEvents = getFlimitEvents(configResolver, str);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            Rate rate = new Rate(flimitEvents, flimitSec, timeUnit);
            this.foregroundRate = rate;
            this.foregroundCapacity = flimitEvents;
            if (z14) {
                logger.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate, Long.valueOf(flimitEvents));
            }
            long blimitSec = getBlimitSec(configResolver, str);
            long blimitEvents = getBlimitEvents(configResolver, str);
            Rate rate2 = new Rate(blimitEvents, blimitSec, timeUnit);
            this.backgroundRate = rate2;
            this.backgroundCapacity = blimitEvents;
            if (z14) {
                logger.debug("Background %s logging rate:%f, capacity:%d", str, rate2, Long.valueOf(blimitEvents));
            }
        }

        public synchronized void changeRate(boolean z14) {
            try {
                this.rate = z14 ? this.foregroundRate : this.backgroundRate;
                this.capacity = z14 ? this.foregroundCapacity : this.backgroundCapacity;
            } catch (Throwable th3) {
                throw th3;
            }
        }

        public synchronized boolean check(PerfMetric perfMetric) {
            try {
                Timer time = this.clock.getTime();
                double durationMicros = (this.lastTimeTokenReplenished.getDurationMicros(time) * this.rate.getTokensPerSeconds()) / MICROS_IN_A_SECOND;
                if (durationMicros > 0.0d) {
                    this.tokenCount = Math.min(this.tokenCount + durationMicros, this.capacity);
                    this.lastTimeTokenReplenished = time;
                }
                double d14 = this.tokenCount;
                if (d14 >= 1.0d) {
                    this.tokenCount = d14 - 1.0d;
                    return true;
                }
                if (this.isLogcatEnabled) {
                    logger.warn("Exceeded log rate limit, dropping the log.");
                }
                return false;
            } catch (Throwable th3) {
                throw th3;
            }
        }

        public long getBackgroundCapacity() {
            return this.backgroundCapacity;
        }

        public Rate getBackgroundRate() {
            return this.backgroundRate;
        }

        public long getForegroundCapacity() {
            return this.foregroundCapacity;
        }

        public Rate getForegroundRate() {
            return this.foregroundRate;
        }

        public Rate getRate() {
            return this.rate;
        }

        public void setRate(Rate rate) {
            this.rate = rate;
        }
    }

    public RateLimiter(Rate rate, long j8, Clock clock, double d14, double d15, ConfigResolver configResolver) {
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean z14 = false;
        this.isLogcatEnabled = false;
        Utils.checkArgument(0.0d <= d14 && d14 < 1.0d, "Sampling bucket ID should be in range [0.0, 1.0).");
        if (0.0d <= d15 && d15 < 1.0d) {
            z14 = true;
        }
        Utils.checkArgument(z14, "Fragment sampling bucket ID should be in range [0.0, 1.0).");
        this.samplingBucketId = d14;
        this.fragmentBucketId = d15;
        this.configResolver = configResolver;
        this.traceLimiter = new RateLimiterImpl(rate, j8, clock, configResolver, ResourceType.TRACE, this.isLogcatEnabled);
        this.networkLimiter = new RateLimiterImpl(rate, j8, clock, configResolver, ResourceType.NETWORK, this.isLogcatEnabled);
    }

    public static double getSamplingBucketId() {
        return new Random().nextDouble();
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
        return list.size() > 0 && list.get(0).getSessionVerbosityCount() > 0 && list.get(0).getSessionVerbosity(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    private boolean isDeviceAllowedToSendFragmentScreenTraces() {
        return this.fragmentBucketId < this.configResolver.getFragmentSamplingRate();
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        return this.samplingBucketId < this.configResolver.getNetworkRequestSamplingRate();
    }

    private boolean isDeviceAllowedToSendTraces() {
        return this.samplingBucketId < this.configResolver.getTraceSamplingRate();
    }

    public void changeRate(boolean z14) {
        this.traceLimiter.changeRate(z14);
        this.networkLimiter.changeRate(z14);
    }

    public boolean getIsDeviceAllowedToSendFragmentScreenTraces() {
        return isDeviceAllowedToSendFragmentScreenTraces();
    }

    public boolean getIsDeviceAllowedToSendNetworkEvents() {
        return isDeviceAllowedToSendNetworkEvents();
    }

    public boolean getIsDeviceAllowedToSendTraces() {
        return isDeviceAllowedToSendTraces();
    }

    public boolean isEventRateLimited(PerfMetric perfMetric) {
        boolean zCheck;
        if (!isRateLimitApplicable(perfMetric)) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            zCheck = this.networkLimiter.check(perfMetric);
        } else {
            if (!perfMetric.hasTraceMetric()) {
                return true;
            }
            zCheck = this.traceLimiter.check(perfMetric);
        }
        return !zCheck;
    }

    public boolean isEventSampled(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !isDeviceAllowedToSendTraces() && !hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (!isFragmentScreenTrace(perfMetric) || isDeviceAllowedToSendFragmentScreenTraces() || hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return !perfMetric.hasNetworkRequestMetric() || isDeviceAllowedToSendNetworkEvents() || hasVerboseSessions(perfMetric.getNetworkRequestMetric().getPerfSessionsList());
        }
        return false;
    }

    public boolean isFragmentScreenTrace(PerfMetric perfMetric) {
        return perfMetric.hasTraceMetric() && perfMetric.getTraceMetric().getName().startsWith(Constants.SCREEN_TRACE_PREFIX) && perfMetric.getTraceMetric().containsCustomAttributes(Constants.ACTIVITY_ATTRIBUTE_KEY);
    }

    public boolean isRateLimitApplicable(PerfMetric perfMetric) {
        return (!perfMetric.hasTraceMetric() || (!(perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) || perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric();
    }

    public RateLimiter(Context context, Rate rate, long j8) {
        this(rate, j8, new Clock(), getSamplingBucketId(), getSamplingBucketId(), ConfigResolver.getInstance());
        this.isLogcatEnabled = Utils.isDebugLoggingEnabled(context);
    }
}
