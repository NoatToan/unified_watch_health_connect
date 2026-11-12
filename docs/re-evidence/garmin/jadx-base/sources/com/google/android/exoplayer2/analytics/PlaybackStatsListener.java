package com.google.android.exoplayer2.analytics;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private Format audioFormat;
    private long bandwidthBytes;
    private long bandwidthTimeMs;
    private final Callback callback;
    private long discontinuityFromPositionMs;
    private String discontinuityFromSession;
    private int discontinuityReason;
    private int droppedFrames;
    private PlaybackStats finishedPlaybackStats;
    private final boolean keepHistory;
    private Exception nonFatalException;
    private final Timeline.Period period;
    private final Map<String, PlaybackStatsTracker> playbackStatsTrackers;
    private final PlaybackSessionManager sessionManager;
    private final Map<String, AnalyticsListener.EventTime> sessionStartEventTimes;
    private Format videoFormat;
    private VideoSize videoSize;

    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    public static final class PlaybackStatsTracker {
        private long audioFormatBitrateTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> audioFormatHistory;
        private long audioFormatTimeMs;
        private long audioUnderruns;
        private long bandwidthBytes;
        private long bandwidthTimeMs;
        private Format currentAudioFormat;
        private float currentPlaybackSpeed;
        private int currentPlaybackState;
        private long currentPlaybackStateStartTimeMs;
        private Format currentVideoFormat;
        private long droppedFrames;
        private int fatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> fatalErrorHistory;
        private long firstReportedTimeMs;
        private boolean hasBeenReady;
        private boolean hasEnded;
        private boolean hasFatalError;
        private long initialAudioFormatBitrate;
        private long initialVideoFormatBitrate;
        private int initialVideoFormatHeight;
        private final boolean isAd;
        private boolean isForeground;
        private boolean isInterruptedByAd;
        private boolean isJoinTimeInvalid;
        private boolean isSeeking;
        private final boolean keepHistory;
        private long lastAudioFormatStartTimeMs;
        private long lastRebufferStartTimeMs;
        private long lastVideoFormatStartTimeMs;
        private long maxRebufferTimeMs;
        private final List<long[]> mediaTimeHistory;
        private int nonFatalErrorCount;
        private final List<PlaybackStats.EventTimeAndException> nonFatalErrorHistory;
        private int pauseBufferCount;
        private int pauseCount;
        private final long[] playbackStateDurationsMs = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> playbackStateHistory;
        private int rebufferCount;
        private int seekCount;
        private boolean startedLoading;
        private long videoFormatBitrateTimeMs;
        private long videoFormatBitrateTimeProduct;
        private long videoFormatHeightTimeMs;
        private long videoFormatHeightTimeProduct;
        private final List<PlaybackStats.EventTimeAndFormat> videoFormatHistory;

        public PlaybackStatsTracker(boolean z14, AnalyticsListener.EventTime eventTime) {
            this.keepHistory = z14;
            this.playbackStateHistory = z14 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.mediaTimeHistory = z14 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.videoFormatHistory = z14 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.audioFormatHistory = z14 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.fatalErrorHistory = z14 ? new ArrayList<>() : Collections.EMPTY_LIST;
            this.nonFatalErrorHistory = z14 ? new ArrayList<>() : Collections.EMPTY_LIST;
            boolean z15 = false;
            this.currentPlaybackState = 0;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            this.firstReportedTimeMs = C.TIME_UNSET;
            this.maxRebufferTimeMs = C.TIME_UNSET;
            MediaSource.MediaPeriodId mediaPeriodId = eventTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z15 = true;
            }
            this.isAd = z15;
            this.initialAudioFormatBitrate = -1L;
            this.initialVideoFormatBitrate = -1L;
            this.initialVideoFormatHeight = -1;
            this.currentPlaybackSpeed = 1.0f;
        }

        private long[] guessMediaTimeBasedOnElapsedRealtime(long j8) {
            long[] jArr = (long[]) com.airbnb.lottie.animation.keyframe.a.c(1, this.mediaTimeHistory);
            return new long[]{j8, jArr[1] + ((long) ((j8 - jArr[0]) * this.currentPlaybackSpeed))};
        }

        private static boolean isInvalidJoinTransition(int i14, int i15) {
            return ((i14 != 1 && i14 != 2 && i14 != 14) || i15 == 1 || i15 == 2 || i15 == 14 || i15 == 3 || i15 == 4 || i15 == 9 || i15 == 11) ? false : true;
        }

        private static boolean isPausedState(int i14) {
            return i14 == 4 || i14 == 7;
        }

        private static boolean isReadyState(int i14) {
            return i14 == 3 || i14 == 4 || i14 == 9;
        }

        private static boolean isRebufferingState(int i14) {
            return i14 == 6 || i14 == 7 || i14 == 10;
        }

        private void maybeRecordAudioFormatTime(long j8) {
            Format format;
            int i14;
            if (this.currentPlaybackState == 3 && (format = this.currentAudioFormat) != null && (i14 = format.bitrate) != -1) {
                long j14 = (long) ((j8 - this.lastAudioFormatStartTimeMs) * this.currentPlaybackSpeed);
                this.audioFormatTimeMs += j14;
                this.audioFormatBitrateTimeProduct = (j14 * ((long) i14)) + this.audioFormatBitrateTimeProduct;
            }
            this.lastAudioFormatStartTimeMs = j8;
        }

        private void maybeRecordVideoFormatTime(long j8) {
            Format format;
            if (this.currentPlaybackState == 3 && (format = this.currentVideoFormat) != null) {
                long j14 = (long) ((j8 - this.lastVideoFormatStartTimeMs) * this.currentPlaybackSpeed);
                int i14 = format.height;
                if (i14 != -1) {
                    this.videoFormatHeightTimeMs += j14;
                    this.videoFormatHeightTimeProduct = (((long) i14) * j14) + this.videoFormatHeightTimeProduct;
                }
                int i15 = format.bitrate;
                if (i15 != -1) {
                    this.videoFormatBitrateTimeMs += j14;
                    this.videoFormatBitrateTimeProduct = (j14 * ((long) i15)) + this.videoFormatBitrateTimeProduct;
                }
            }
            this.lastVideoFormatStartTimeMs = j8;
        }

        private void maybeUpdateAudioFormat(AnalyticsListener.EventTime eventTime, Format format) {
            int i14;
            if (Util.areEqual(this.currentAudioFormat, format)) {
                return;
            }
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            if (format != null && this.initialAudioFormatBitrate == -1 && (i14 = format.bitrate) != -1) {
                this.initialAudioFormatBitrate = i14;
            }
            this.currentAudioFormat = format;
            if (this.keepHistory) {
                this.audioFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private void maybeUpdateMaxRebufferTimeMs(long j8) {
            if (isRebufferingState(this.currentPlaybackState)) {
                long j14 = j8 - this.lastRebufferStartTimeMs;
                long j15 = this.maxRebufferTimeMs;
                if (j15 == C.TIME_UNSET || j14 > j15) {
                    this.maxRebufferTimeMs = j14;
                }
            }
        }

        private void maybeUpdateMediaTimeHistory(long j8, long j14) {
            if (this.keepHistory) {
                if (this.currentPlaybackState != 3) {
                    if (j14 == C.TIME_UNSET) {
                        return;
                    }
                    if (!this.mediaTimeHistory.isEmpty()) {
                        long j15 = ((long[]) com.airbnb.lottie.animation.keyframe.a.c(1, this.mediaTimeHistory))[1];
                        if (j15 != j14) {
                            this.mediaTimeHistory.add(new long[]{j8, j15});
                        }
                    }
                }
                List<long[]> list = this.mediaTimeHistory;
                if (j14 != C.TIME_UNSET) {
                    list.add(new long[]{j8, j14});
                } else {
                    if (list.isEmpty()) {
                        return;
                    }
                    this.mediaTimeHistory.add(guessMediaTimeBasedOnElapsedRealtime(j8));
                }
            }
        }

        private void maybeUpdateVideoFormat(AnalyticsListener.EventTime eventTime, Format format) {
            int i14;
            int i15;
            if (Util.areEqual(this.currentVideoFormat, format)) {
                return;
            }
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            if (format != null) {
                if (this.initialVideoFormatHeight == -1 && (i15 = format.height) != -1) {
                    this.initialVideoFormatHeight = i15;
                }
                if (this.initialVideoFormatBitrate == -1 && (i14 = format.bitrate) != -1) {
                    this.initialVideoFormatBitrate = i14;
                }
            }
            this.currentVideoFormat = format;
            if (this.keepHistory) {
                this.videoFormatHistory.add(new PlaybackStats.EventTimeAndFormat(eventTime, format));
            }
        }

        private int resolveNewPlaybackState(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.isSeeking && this.isForeground) {
                return 5;
            }
            if (this.hasFatalError) {
                return 13;
            }
            if (!this.isForeground) {
                return this.startedLoading ? 1 : 0;
            }
            if (this.isInterruptedByAd) {
                return 14;
            }
            if (playbackState == 4) {
                return 11;
            }
            if (playbackState != 2) {
                if (playbackState == 3) {
                    if (player.getPlayWhenReady()) {
                        return player.getPlaybackSuppressionReason() != 0 ? 9 : 3;
                    }
                    return 4;
                }
                if (playbackState != 1 || this.currentPlaybackState == 0) {
                    return this.currentPlaybackState;
                }
                return 12;
            }
            int i14 = this.currentPlaybackState;
            if (i14 == 0 || i14 == 1 || i14 == 2 || i14 == 14) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void updatePlaybackState(int i14, AnalyticsListener.EventTime eventTime) {
            Assertions.checkArgument(eventTime.realtimeMs >= this.currentPlaybackStateStartTimeMs);
            long j8 = eventTime.realtimeMs;
            long j14 = j8 - this.currentPlaybackStateStartTimeMs;
            long[] jArr = this.playbackStateDurationsMs;
            int i15 = this.currentPlaybackState;
            jArr[i15] = jArr[i15] + j14;
            if (this.firstReportedTimeMs == C.TIME_UNSET) {
                this.firstReportedTimeMs = j8;
            }
            this.isJoinTimeInvalid |= isInvalidJoinTransition(i15, i14);
            this.hasBeenReady |= isReadyState(i14);
            this.hasEnded |= i14 == 11;
            if (!isPausedState(this.currentPlaybackState) && isPausedState(i14)) {
                this.pauseCount++;
            }
            if (i14 == 5) {
                this.seekCount++;
            }
            if (!isRebufferingState(this.currentPlaybackState) && isRebufferingState(i14)) {
                this.rebufferCount++;
                this.lastRebufferStartTimeMs = eventTime.realtimeMs;
            }
            if (isRebufferingState(this.currentPlaybackState) && this.currentPlaybackState != 7 && i14 == 7) {
                this.pauseBufferCount++;
            }
            maybeUpdateMaxRebufferTimeMs(eventTime.realtimeMs);
            this.currentPlaybackState = i14;
            this.currentPlaybackStateStartTimeMs = eventTime.realtimeMs;
            if (this.keepHistory) {
                this.playbackStateHistory.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, i14));
            }
        }

        public PlaybackStats build(boolean z14) {
            long[] jArr;
            List list;
            long[] jArr2 = this.playbackStateDurationsMs;
            List<long[]> list2 = this.mediaTimeHistory;
            if (z14) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.playbackStateDurationsMs, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.currentPlaybackStateStartTimeMs);
                int i14 = this.currentPlaybackState;
                jArrCopyOf[i14] = jArrCopyOf[i14] + jMax;
                maybeUpdateMaxRebufferTimeMs(jElapsedRealtime);
                maybeRecordVideoFormatTime(jElapsedRealtime);
                maybeRecordAudioFormatTime(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.mediaTimeHistory);
                if (this.keepHistory && this.currentPlaybackState == 3) {
                    arrayList.add(guessMediaTimeBasedOnElapsedRealtime(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i15 = (this.isJoinTimeInvalid || !this.hasBeenReady) ? 1 : 0;
            long j8 = i15 != 0 ? C.TIME_UNSET : jArr[2];
            int i16 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z14 ? this.videoFormatHistory : new ArrayList(this.videoFormatHistory);
            List arrayList3 = z14 ? this.audioFormatHistory : new ArrayList(this.audioFormatHistory);
            List arrayList4 = z14 ? this.playbackStateHistory : new ArrayList(this.playbackStateHistory);
            long j14 = this.firstReportedTimeMs;
            boolean z15 = this.isForeground;
            int i17 = !this.hasBeenReady ? 1 : 0;
            boolean z16 = this.hasEnded;
            int i18 = i15 ^ 1;
            int i19 = this.pauseCount;
            int i24 = this.pauseBufferCount;
            int i25 = this.seekCount;
            int i26 = this.rebufferCount;
            long j15 = this.maxRebufferTimeMs;
            boolean z17 = this.isAd;
            long j16 = this.videoFormatHeightTimeMs;
            long j17 = this.videoFormatHeightTimeProduct;
            long j18 = this.videoFormatBitrateTimeMs;
            long j19 = this.videoFormatBitrateTimeProduct;
            long j24 = this.audioFormatTimeMs;
            long j25 = this.audioFormatBitrateTimeProduct;
            int i27 = this.initialVideoFormatHeight;
            int i28 = i27 == -1 ? 0 : 1;
            long j26 = this.initialVideoFormatBitrate;
            int i29 = j26 == -1 ? 0 : 1;
            long j27 = this.initialAudioFormatBitrate;
            int i30 = j27 == -1 ? 0 : 1;
            long j28 = this.bandwidthTimeMs;
            long j29 = this.bandwidthBytes;
            long j34 = this.droppedFrames;
            long j35 = this.audioUnderruns;
            int i34 = this.fatalErrorCount;
            return new PlaybackStats(1, jArr, arrayList4, list, j14, z15 ? 1 : 0, i17, z16 ? 1 : 0, i16, j8, i18, i19, i24, i25, i26, j15, z17 ? 1 : 0, arrayList2, arrayList3, j16, j17, j18, j19, j24, j25, i28, i29, i27, j26, i30, j27, j28, j29, j34, j35, i34 > 0 ? 1 : 0, i34, this.nonFatalErrorCount, this.fatalErrorHistory, this.nonFatalErrorHistory);
        }

        public void onEvents(Player player, AnalyticsListener.EventTime eventTime, boolean z14, long j8, boolean z15, int i14, boolean z16, boolean z17, PlaybackException playbackException, Exception exc, long j14, long j15, Format format, Format format2, VideoSize videoSize) {
            long j16 = C.TIME_UNSET;
            if (j8 != C.TIME_UNSET) {
                maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j8);
                this.isSeeking = true;
            }
            if (player.getPlaybackState() != 2) {
                this.isSeeking = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || z15) {
                this.isInterruptedByAd = false;
            }
            if (playbackException != null) {
                this.hasFatalError = true;
                this.fatalErrorCount++;
                if (this.keepHistory) {
                    this.fatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, playbackException));
                }
            } else if (player.getPlayerError() == null) {
                this.hasFatalError = false;
            }
            if (this.isForeground && !this.isInterruptedByAd) {
                TracksInfo currentTracksInfo = player.getCurrentTracksInfo();
                if (!currentTracksInfo.isTypeSelected(2)) {
                    maybeUpdateVideoFormat(eventTime, null);
                }
                if (!currentTracksInfo.isTypeSelected(1)) {
                    maybeUpdateAudioFormat(eventTime, null);
                }
            }
            if (format != null) {
                maybeUpdateVideoFormat(eventTime, format);
            }
            if (format2 != null) {
                maybeUpdateAudioFormat(eventTime, format2);
            }
            Format format3 = this.currentVideoFormat;
            if (format3 != null && format3.height == -1 && videoSize != null) {
                maybeUpdateVideoFormat(eventTime, format3.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build());
            }
            if (z17) {
                this.startedLoading = true;
            }
            if (z16) {
                this.audioUnderruns++;
            }
            this.droppedFrames += (long) i14;
            this.bandwidthTimeMs += j14;
            this.bandwidthBytes += j15;
            if (exc != null) {
                this.nonFatalErrorCount++;
                if (this.keepHistory) {
                    this.nonFatalErrorHistory.add(new PlaybackStats.EventTimeAndException(eventTime, exc));
                }
            }
            int iResolveNewPlaybackState = resolveNewPlaybackState(player);
            float f14 = player.getPlaybackParameters().speed;
            if (this.currentPlaybackState != iResolveNewPlaybackState || this.currentPlaybackSpeed != f14) {
                long j17 = eventTime.realtimeMs;
                if (z14) {
                    j16 = eventTime.eventPlaybackPositionMs;
                }
                maybeUpdateMediaTimeHistory(j17, j16);
                maybeRecordVideoFormatTime(eventTime.realtimeMs);
                maybeRecordAudioFormatTime(eventTime.realtimeMs);
            }
            this.currentPlaybackSpeed = f14;
            if (this.currentPlaybackState != iResolveNewPlaybackState) {
                updatePlaybackState(iResolveNewPlaybackState, eventTime);
            }
        }

        public void onFinished(AnalyticsListener.EventTime eventTime, boolean z14, long j8) {
            int i14 = 11;
            if (this.currentPlaybackState != 11 && !z14) {
                i14 = 15;
            }
            maybeUpdateMediaTimeHistory(eventTime.realtimeMs, j8);
            maybeRecordVideoFormatTime(eventTime.realtimeMs);
            maybeRecordAudioFormatTime(eventTime.realtimeMs);
            updatePlaybackState(i14, eventTime);
        }

        public void onForeground() {
            this.isForeground = true;
        }

        public void onInterruptedByAd() {
            this.isInterruptedByAd = true;
            this.isSeeking = false;
        }
    }

    public PlaybackStatsListener(boolean z14, Callback callback) {
        this.callback = callback;
        this.keepHistory = z14;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.sessionManager = defaultPlaybackSessionManager;
        this.playbackStatsTrackers = new HashMap();
        this.sessionStartEventTimes = new HashMap();
        this.finishedPlaybackStats = PlaybackStats.EMPTY;
        this.period = new Timeline.Period();
        this.videoSize = VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    private Pair<AnalyticsListener.EventTime, Boolean> findBestEventTime(AnalyticsListener.Events events, String str) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = null;
        boolean zBelongsToSession = false;
        for (int i14 = 0; i14 < events.size(); i14++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i14));
            boolean zBelongsToSession2 = this.sessionManager.belongsToSession(eventTime2, str);
            if (eventTime == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        Assertions.checkNotNull(eventTime);
        if (!zBelongsToSession && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.period).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.period.durationUs;
            }
            long positionInWindowUs = this.period.getPositionInWindowUs() + adGroupTimeUs;
            long j8 = eventTime.realtimeMs;
            Timeline timeline = eventTime.timeline;
            int i15 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j8, timeline, i15, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), Util.usToMs(positionInWindowUs), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            zBelongsToSession = this.sessionManager.belongsToSession(eventTime3, str);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(zBelongsToSession));
    }

    private boolean hasEvent(AnalyticsListener.Events events, String str, int i14) {
        return events.contains(i14) && this.sessionManager.belongsToSession(events.getEventTime(i14), str);
    }

    private void maybeAddSessions(AnalyticsListener.Events events) {
        for (int i14 = 0; i14 < events.size(); i14++) {
            int i15 = events.get(i14);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i15);
            if (i15 == 0) {
                this.sessionManager.updateSessionsWithTimelineChange(eventTime);
            } else {
                PlaybackSessionManager playbackSessionManager = this.sessionManager;
                if (i15 == 11) {
                    playbackSessionManager.updateSessionsWithDiscontinuity(eventTime, this.discontinuityReason);
                } else {
                    playbackSessionManager.updateSessions(eventTime);
                }
            }
        }
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i14 = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.playbackStatsTrackers.size() + 1];
        playbackStatsArr[0] = this.finishedPlaybackStats;
        Iterator<PlaybackStatsTracker> it = this.playbackStatsTrackers.values().iterator();
        while (it.hasNext()) {
            playbackStatsArr[i14] = it.next().build(false);
            i14++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.sessionManager.getActiveSessionId();
        PlaybackStatsTracker playbackStatsTracker = activeSessionId == null ? null : this.playbackStatsTrackers.get(activeSessionId);
        if (playbackStatsTracker == null) {
            return null;
        }
        return playbackStatsTracker.build(false);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2) {
        ((PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onInterruptedByAd();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i14, long j8, long j14) {
        this.bandwidthTimeMs = i14;
        this.bandwidthBytes = j8;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i14 = mediaLoadData.trackType;
        if (i14 == 2 || i14 == 0) {
            this.videoFormat = mediaLoadData.trackFormat;
        } else if (i14 == 1) {
            this.audioFormat = mediaLoadData.trackFormat;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        this.nonFatalException = exc;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i14, long j8) {
        this.droppedFrames = i14;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        maybeAddSessions(events);
        Iterator<String> it = this.playbackStatsTrackers.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Pair<AnalyticsListener.EventTime, Boolean> pairFindBestEventTime = findBestEventTime(events, next);
            PlaybackStatsTracker playbackStatsTracker = this.playbackStatsTrackers.get(next);
            boolean zHasEvent = hasEvent(events, next, 11);
            boolean zHasEvent2 = hasEvent(events, next, 1018);
            boolean zHasEvent3 = hasEvent(events, next, 1011);
            boolean zHasEvent4 = hasEvent(events, next, 1000);
            boolean zHasEvent5 = hasEvent(events, next, 10);
            boolean z14 = hasEvent(events, next, 1003) || hasEvent(events, next, 1024);
            boolean zHasEvent6 = hasEvent(events, next, 1006);
            boolean zHasEvent7 = hasEvent(events, next, 1004);
            boolean zHasEvent8 = hasEvent(events, next, 25);
            Iterator<String> it3 = it;
            playbackStatsTracker.onEvents(player, (AnalyticsListener.EventTime) pairFindBestEventTime.first, ((Boolean) pairFindBestEventTime.second).booleanValue(), next.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : C.TIME_UNSET, zHasEvent, zHasEvent2 ? this.droppedFrames : 0, zHasEvent3, zHasEvent4, zHasEvent5 ? player.getPlayerError() : null, z14 ? this.nonFatalException : null, zHasEvent6 ? this.bandwidthTimeMs : 0L, zHasEvent6 ? this.bandwidthBytes : 0L, zHasEvent7 ? this.videoFormat : null, zHasEvent7 ? this.audioFormat : null, zHasEvent8 ? this.videoSize : null);
            it = it3;
        }
        this.videoFormat = null;
        this.audioFormat = null;
        this.discontinuityFromSession = null;
        if (events.contains(1028)) {
            this.sessionManager.finishAllSessions(events.getEventTime(1028));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z14) {
        this.nonFatalException = iOException;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i14) {
        if (this.discontinuityFromSession == null) {
            this.discontinuityFromSession = this.sessionManager.getActiveSessionId();
            this.discontinuityFromPositionMs = positionInfo.positionMs;
        }
        this.discontinuityReason = i14;
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String str) {
        ((PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.get(str))).onForeground();
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String str) {
        this.playbackStatsTrackers.put(str, new PlaybackStatsTracker(this.keepHistory, eventTime));
        this.sessionStartEventTimes.put(str, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z14) {
        PlaybackStatsTracker playbackStatsTracker = (PlaybackStatsTracker) Assertions.checkNotNull(this.playbackStatsTrackers.remove(str));
        AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) Assertions.checkNotNull(this.sessionStartEventTimes.remove(str));
        playbackStatsTracker.onFinished(eventTime, z14, str.equals(this.discontinuityFromSession) ? this.discontinuityFromPositionMs : C.TIME_UNSET);
        PlaybackStats playbackStatsBuild = playbackStatsTracker.build(true);
        this.finishedPlaybackStats = PlaybackStats.merge(this.finishedPlaybackStats, playbackStatsBuild);
        Callback callback = this.callback;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, playbackStatsBuild);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        this.videoSize = videoSize;
    }
}
