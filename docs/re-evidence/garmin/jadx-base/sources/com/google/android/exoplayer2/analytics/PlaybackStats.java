package com.google.android.exoplayer2.analytics;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return this.exception.hashCode() + (this.eventTime.hashCode() * 31);
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;
        public final Format format;

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTimeAndFormat.class == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                Format format = this.format;
                Format format2 = eventTimeAndFormat.format;
                if (format != null) {
                    return format.equals(format2);
                }
                if (format2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return iHashCode + (format != null ? format.hashCode() : 0);
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i14) {
            this.eventTime = eventTime;
            this.playbackState = i14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }
    }

    public PlaybackStats(int i14, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j8, int i15, int i16, int i17, int i18, long j14, int i19, int i24, int i25, int i26, int i27, long j15, int i28, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j16, long j17, long j18, long j19, long j24, long j25, int i29, int i30, int i34, long j26, int i35, long j27, long j28, long j29, long j34, long j35, int i36, int i37, int i38, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i14;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j8;
        this.foregroundPlaybackCount = i15;
        this.abandonedBeforeReadyCount = i16;
        this.endedCount = i17;
        this.backgroundJoiningCount = i18;
        this.totalValidJoinTimeMs = j14;
        this.validJoinTimeCount = i19;
        this.totalPauseCount = i24;
        this.totalPauseBufferCount = i25;
        this.totalSeekCount = i26;
        this.totalRebufferCount = i27;
        this.maxRebufferTimeMs = j15;
        this.adPlaybackCount = i28;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j16;
        this.totalVideoFormatHeightTimeProduct = j17;
        this.totalVideoFormatBitrateTimeMs = j18;
        this.totalVideoFormatBitrateTimeProduct = j19;
        this.totalAudioFormatTimeMs = j24;
        this.totalAudioFormatBitrateTimeProduct = j25;
        this.initialVideoFormatHeightCount = i29;
        this.initialVideoFormatBitrateCount = i30;
        this.totalInitialVideoFormatHeight = i34;
        this.totalInitialVideoFormatBitrate = j26;
        this.initialAudioFormatBitrateCount = i35;
        this.totalInitialAudioFormatBitrate = j27;
        this.totalBandwidthTimeMs = j28;
        this.totalBandwidthBytes = j29;
        this.totalDroppedFrames = j34;
        this.totalAudioUnderruns = j35;
        this.fatalErrorPlaybackCount = i36;
        this.fatalErrorCount = i37;
        this.nonFatalErrorCount = i38;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i34 = 0;
        long j8 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        long j19 = 0;
        long j24 = 0;
        long j25 = 0;
        long j26 = 0;
        long j27 = -1;
        long j28 = -1;
        long jMax = C.TIME_UNSET;
        long jMin = C.TIME_UNSET;
        long j29 = C.TIME_UNSET;
        int i35 = -1;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        while (i36 < length) {
            PlaybackStats playbackStats = playbackStatsArr2[i36];
            int i44 = i14 + playbackStats.playbackCount;
            for (int i45 = 0; i45 < 16; i45++) {
                jArr[i45] = jArr[i45] + playbackStats.playbackStateDurationsMs[i45];
            }
            long j34 = playbackStats.firstReportedTimeMs;
            if (jMin == C.TIME_UNSET) {
                jMin = j34;
            } else if (j34 != C.TIME_UNSET) {
                jMin = Math.min(jMin, j34);
            }
            i37 += playbackStats.foregroundPlaybackCount;
            i38 += playbackStats.abandonedBeforeReadyCount;
            i39 += playbackStats.endedCount;
            i15 += playbackStats.backgroundJoiningCount;
            long j35 = playbackStats.totalValidJoinTimeMs;
            if (j29 == C.TIME_UNSET) {
                j29 = j35;
            } else if (j35 != C.TIME_UNSET) {
                j29 += j35;
            }
            i16 += playbackStats.validJoinTimeCount;
            i17 += playbackStats.totalPauseCount;
            i18 += playbackStats.totalPauseBufferCount;
            i19 += playbackStats.totalSeekCount;
            i24 += playbackStats.totalRebufferCount;
            long j36 = playbackStats.maxRebufferTimeMs;
            if (jMax == C.TIME_UNSET) {
                jMax = j36;
            } else if (j36 != C.TIME_UNSET) {
                jMax = Math.max(jMax, j36);
            }
            i25 += playbackStats.adPlaybackCount;
            j8 += playbackStats.totalVideoFormatHeightTimeMs;
            j14 += playbackStats.totalVideoFormatHeightTimeProduct;
            j15 += playbackStats.totalVideoFormatBitrateTimeMs;
            j16 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j17 += playbackStats.totalAudioFormatTimeMs;
            j18 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i26 += playbackStats.initialVideoFormatHeightCount;
            i27 += playbackStats.initialVideoFormatBitrateCount;
            int i46 = playbackStats.totalInitialVideoFormatHeight;
            int i47 = i35;
            int i48 = length;
            if (i47 != -1) {
                i46 = i46 != -1 ? i46 + i47 : i47;
            }
            long j37 = playbackStats.totalInitialVideoFormatBitrate;
            if (j27 == -1) {
                j27 = j37;
            } else if (j37 != -1) {
                j27 += j37;
            }
            i28 += playbackStats.initialAudioFormatBitrateCount;
            long j38 = playbackStats.totalInitialAudioFormatBitrate;
            if (j28 == -1) {
                j28 = j38;
            } else if (j38 != -1) {
                j28 += j38;
            }
            j19 += playbackStats.totalBandwidthTimeMs;
            j24 += playbackStats.totalBandwidthBytes;
            j25 += playbackStats.totalDroppedFrames;
            j26 += playbackStats.totalAudioUnderruns;
            i29 += playbackStats.fatalErrorPlaybackCount;
            i30 += playbackStats.fatalErrorCount;
            i34 += playbackStats.nonFatalErrorCount;
            i36++;
            length = i48;
            i14 = i44;
            i35 = i46;
            playbackStatsArr2 = playbackStatsArr;
        }
        int i49 = i37;
        long j39 = jMin;
        int i54 = i15;
        long j44 = j29;
        int i55 = i16;
        int i56 = i17;
        int i57 = i18;
        int i58 = i19;
        int i59 = i24;
        long j45 = jMax;
        List list = Collections.EMPTY_LIST;
        return new PlaybackStats(i14, jArr, list, list, j39, i49, i38, i39, i54, j44, i55, i56, i57, i58, i59, j45, i25, list, list, j8, j14, j15, j16, j17, j18, i26, i27, i35, j27, i28, j28, j19, j24, j25, j26, i29, i30, i34, list, list);
    }

    public float getAbandonedBeforeReadyRatio() {
        int i14 = this.abandonedBeforeReadyCount;
        int i15 = this.playbackCount;
        int i16 = this.foregroundPlaybackCount;
        int i17 = i14 - (i15 - i16);
        if (i16 == 0) {
            return 0.0f;
        }
        return i17 / i16;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getEndedRatio() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.endedCount / i14;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRatio() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i14;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public int getMeanAudioFormatBitrate() {
        long j8 = this.totalAudioFormatTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j8);
    }

    public int getMeanBandwidth() {
        long j8 = this.totalBandwidthTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j8);
    }

    public long getMeanElapsedTimeMs() {
        return this.playbackCount == 0 ? C.TIME_UNSET : getTotalElapsedTimeMs() / ((long) this.playbackCount);
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i14 = this.initialAudioFormatBitrateCount;
        if (i14 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / ((long) i14));
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i14 = this.initialVideoFormatBitrateCount;
        if (i14 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / ((long) i14));
    }

    public int getMeanInitialVideoFormatHeight() {
        int i14 = this.initialVideoFormatHeightCount;
        if (i14 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i14;
    }

    public long getMeanJoinTimeMs() {
        int i14 = this.validJoinTimeCount;
        return i14 == 0 ? C.TIME_UNSET : this.totalValidJoinTimeMs / ((long) i14);
    }

    public float getMeanNonFatalErrorCount() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i14;
    }

    public float getMeanPauseBufferCount() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i14;
    }

    public float getMeanPauseCount() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i14;
    }

    public long getMeanPausedTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPausedTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayAndWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayAndWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalPlayTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanRebufferCount() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i14;
    }

    public long getMeanRebufferTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalRebufferTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanSeekCount() {
        int i14 = this.foregroundPlaybackCount;
        if (i14 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i14;
    }

    public long getMeanSeekTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanSingleRebufferTimeMs() {
        if (this.totalRebufferCount == 0) {
            return C.TIME_UNSET;
        }
        return (getPlaybackStateDurationMs(7) + getPlaybackStateDurationMs(6)) / ((long) this.totalRebufferCount);
    }

    public long getMeanSingleSeekTimeMs() {
        return this.totalSeekCount == 0 ? C.TIME_UNSET : getTotalSeekTimeMs() / ((long) this.totalSeekCount);
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j8 = this.totalVideoFormatBitrateTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j8);
    }

    public int getMeanVideoFormatHeight() {
        long j8 = this.totalVideoFormatHeightTimeMs;
        if (j8 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j8);
    }

    public long getMeanWaitTimeMs() {
        return this.foregroundPlaybackCount == 0 ? C.TIME_UNSET : getTotalWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMediaTimeMsAtRealtimeMs(long j8) {
        if (this.mediaTimeHistory.isEmpty()) {
            return C.TIME_UNSET;
        }
        int i14 = 0;
        while (i14 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i14)[0] <= j8) {
            i14++;
        }
        List<long[]> list = this.mediaTimeHistory;
        if (i14 == 0) {
            return list.get(0)[1];
        }
        int size = list.size();
        List<long[]> list2 = this.mediaTimeHistory;
        if (i14 == size) {
            return ((long[]) com.airbnb.lottie.animation.keyframe.a.c(1, list2))[1];
        }
        int i15 = i14 - 1;
        long j14 = list2.get(i15)[0];
        long j15 = this.mediaTimeHistory.get(i15)[1];
        long j16 = this.mediaTimeHistory.get(i14)[0];
        long j17 = this.mediaTimeHistory.get(i14)[1];
        long j18 = j16 - j14;
        if (j18 == 0) {
            return j15;
        }
        return j15 + ((long) ((j17 - j15) * ((j8 - j14) / j18)));
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public int getPlaybackStateAtTime(long j8) {
        int i14 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j8) {
                break;
            }
            i14 = eventTimeAndPlaybackState.playbackState;
        }
        return i14;
    }

    public long getPlaybackStateDurationMs(int i14) {
        return this.playbackStateDurationsMs[i14];
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalElapsedTimeMs() {
        long j8 = 0;
        for (int i14 = 0; i14 < 16; i14++) {
            j8 += this.playbackStateDurationsMs[i14];
        }
        return j8;
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(7) + getPlaybackStateDurationMs(4);
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalWaitTimeMs() + getTotalPlayTimeMs();
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(5) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(2);
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
