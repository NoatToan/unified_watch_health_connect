package com.google.firebase.crashlytics.internal.settings;

/* JADX INFO: loaded from: classes2.dex */
public class Settings {
    public final int cacheDuration;
    public final long expiresAtMillis;
    public final FeatureFlagData featureFlagData;
    public final double onDemandBackoffBase;
    public final int onDemandBackoffStepDurationSeconds;
    public final double onDemandUploadRatePerMinute;
    public final SessionData sessionData;
    public final int settingsVersion;

    public static class FeatureFlagData {
        public final boolean collectAnrs;
        public final boolean collectBuildIds;
        public final boolean collectReports;

        public FeatureFlagData(boolean z14, boolean z15, boolean z16) {
            this.collectReports = z14;
            this.collectAnrs = z15;
            this.collectBuildIds = z16;
        }
    }

    public static class SessionData {
        public final int maxCompleteSessionsCount;
        public final int maxCustomExceptionEvents;

        public SessionData(int i14, int i15) {
            this.maxCustomExceptionEvents = i14;
            this.maxCompleteSessionsCount = i15;
        }
    }

    public Settings(long j8, SessionData sessionData, FeatureFlagData featureFlagData, int i14, int i15, double d14, double d15, int i16) {
        this.expiresAtMillis = j8;
        this.sessionData = sessionData;
        this.featureFlagData = featureFlagData;
        this.settingsVersion = i14;
        this.cacheDuration = i15;
        this.onDemandUploadRatePerMinute = d14;
        this.onDemandBackoffBase = d15;
        this.onDemandBackoffStepDurationSeconds = i16;
    }

    public boolean isExpired(long j8) {
        return this.expiresAtMillis < j8;
    }
}
