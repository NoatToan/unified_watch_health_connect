package io.sentry.android.replay;

import com.miui.tsmclient.database.DatabaseConstants;
import io.sentry.SentryReplayEvent;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0006\u0010\u001e\u001a\u00020\u000b\u0012\u0006\u0010\u001f\u001a\u00020\u000e\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJh\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\u000e2\b\b\u0002\u0010 \u001a\u00020\u00112\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u0010\u0010&\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b&\u0010\rJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010\u0004R\u0017\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010-\u001a\u0004\b.\u0010\u0007R\u0017\u0010\u001d\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u0010\nR\u0017\u0010\u001e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b2\u0010\rR\u0017\u0010\u001f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u0010\u0010R\u0017\u0010 \u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b \u00105\u001a\u0004\b6\u0010\u0013R\u0019\u0010!\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b8\u0010\u0016R\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\b:\u0010\u001a¨\u0006="}, d2 = {"Lio/sentry/android/replay/LastSegmentData;", "", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "component1", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Lio/sentry/android/replay/ReplayCache;", "component2", "()Lio/sentry/android/replay/ReplayCache;", "Ljava/util/Date;", "component3", "()Ljava/util/Date;", "", "component4", "()I", "", "component5", "()J", "Lio/sentry/SentryReplayEvent$ReplayType;", "component6", "()Lio/sentry/SentryReplayEvent$ReplayType;", "", "component7", "()Ljava/lang/String;", "", "Lio/sentry/rrweb/b;", "component8", "()Ljava/util/List;", "recorderConfig", DatabaseConstants.TABLE_CACHE, "timestamp", "id", "duration", "replayType", "screenAtStart", "events", "copy", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/ReplayCache;Ljava/util/Date;IJLio/sentry/SentryReplayEvent$ReplayType;Ljava/lang/String;Ljava/util/List;)Lio/sentry/android/replay/LastSegmentData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getRecorderConfig", "Lio/sentry/android/replay/ReplayCache;", "getCache", "Ljava/util/Date;", "getTimestamp", "I", "getId", "J", "getDuration", "Lio/sentry/SentryReplayEvent$ReplayType;", "getReplayType", "Ljava/lang/String;", "getScreenAtStart", "Ljava/util/List;", "getEvents", "<init>", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/android/replay/ReplayCache;Ljava/util/Date;IJLio/sentry/SentryReplayEvent$ReplayType;Ljava/lang/String;Ljava/util/List;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LastSegmentData {

    @NotNull
    private final ReplayCache cache;
    private final long duration;

    @NotNull
    private final List<io.sentry.rrweb.b> events;
    private final int id;

    @NotNull
    private final ScreenshotRecorderConfig recorderConfig;

    @NotNull
    private final SentryReplayEvent.ReplayType replayType;

    @Nullable
    private final String screenAtStart;

    @NotNull
    private final Date timestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public LastSegmentData(@NotNull ScreenshotRecorderConfig recorderConfig, @NotNull ReplayCache cache, @NotNull Date timestamp, int i, long j, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable String str, @NotNull List<? extends io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        this.recorderConfig = recorderConfig;
        this.cache = cache;
        this.timestamp = timestamp;
        this.id = i;
        this.duration = j;
        this.replayType = replayType;
        this.screenAtStart = str;
        this.events = events;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReplayCache getCache() {
        return this.cache;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    @NotNull
    public final List<io.sentry.rrweb.b> component8() {
        return this.events;
    }

    @NotNull
    public final LastSegmentData copy(@NotNull ScreenshotRecorderConfig recorderConfig, @NotNull ReplayCache cache, @NotNull Date timestamp, int id, long duration, @NotNull SentryReplayEvent.ReplayType replayType, @Nullable String screenAtStart, @NotNull List<? extends io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return new LastSegmentData(recorderConfig, cache, timestamp, id, duration, replayType, screenAtStart, events);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastSegmentData)) {
            return false;
        }
        LastSegmentData lastSegmentData = (LastSegmentData) other;
        return Intrinsics.areEqual(this.recorderConfig, lastSegmentData.recorderConfig) && Intrinsics.areEqual(this.cache, lastSegmentData.cache) && Intrinsics.areEqual(this.timestamp, lastSegmentData.timestamp) && this.id == lastSegmentData.id && this.duration == lastSegmentData.duration && this.replayType == lastSegmentData.replayType && Intrinsics.areEqual(this.screenAtStart, lastSegmentData.screenAtStart) && Intrinsics.areEqual(this.events, lastSegmentData.events);
    }

    @NotNull
    public final ReplayCache getCache() {
        return this.cache;
    }

    public final long getDuration() {
        return this.duration;
    }

    @NotNull
    public final List<io.sentry.rrweb.b> getEvents() {
        return this.events;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final ScreenshotRecorderConfig getRecorderConfig() {
        return this.recorderConfig;
    }

    @NotNull
    public final SentryReplayEvent.ReplayType getReplayType() {
        return this.replayType;
    }

    @Nullable
    public final String getScreenAtStart() {
        return this.screenAtStart;
    }

    @NotNull
    public final Date getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.recorderConfig.hashCode() * 31) + this.cache.hashCode()) * 31) + this.timestamp.hashCode()) * 31) + Integer.hashCode(this.id)) * 31) + Long.hashCode(this.duration)) * 31) + this.replayType.hashCode()) * 31;
        String str = this.screenAtStart;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.events.hashCode();
    }

    @NotNull
    public String toString() {
        return "LastSegmentData(recorderConfig=" + this.recorderConfig + ", cache=" + this.cache + ", timestamp=" + this.timestamp + ", id=" + this.id + ", duration=" + this.duration + ", replayType=" + this.replayType + ", screenAtStart=" + this.screenAtStart + ", events=" + this.events + ')';
    }
}
