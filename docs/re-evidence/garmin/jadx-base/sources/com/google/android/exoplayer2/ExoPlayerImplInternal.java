package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import o2.c;

/* JADX INFO: loaded from: classes13.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final int ACTIVE_INTERVAL_MS = 10;
    private static final int IDLE_INTERVAL_MS = 1000;
    private static final long MIN_RENDERER_SLEEP_DURATION_MS = 2000;
    private static final int MSG_ADD_MEDIA_SOURCES = 18;
    private static final int MSG_ATTEMPT_RENDERER_ERROR_RECOVERY = 25;
    private static final int MSG_DO_SOME_WORK = 2;
    private static final int MSG_MOVE_MEDIA_SOURCES = 19;
    private static final int MSG_PERIOD_PREPARED = 8;
    private static final int MSG_PLAYBACK_PARAMETERS_CHANGED_INTERNAL = 16;
    private static final int MSG_PLAYLIST_UPDATE_REQUESTED = 22;
    private static final int MSG_PREPARE = 0;
    private static final int MSG_RELEASE = 7;
    private static final int MSG_REMOVE_MEDIA_SOURCES = 20;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_MESSAGE = 14;
    private static final int MSG_SEND_MESSAGE_TO_TARGET_THREAD = 15;
    private static final int MSG_SET_FOREGROUND_MODE = 13;
    private static final int MSG_SET_MEDIA_SOURCES = 17;
    private static final int MSG_SET_OFFLOAD_SCHEDULING_ENABLED = 24;
    private static final int MSG_SET_PAUSE_AT_END_OF_WINDOW = 23;
    private static final int MSG_SET_PLAYBACK_PARAMETERS = 4;
    private static final int MSG_SET_PLAY_WHEN_READY = 1;
    private static final int MSG_SET_REPEAT_MODE = 11;
    private static final int MSG_SET_SEEK_PARAMETERS = 5;
    private static final int MSG_SET_SHUFFLE_ENABLED = 12;
    private static final int MSG_SET_SHUFFLE_ORDER = 21;
    private static final int MSG_SOURCE_CONTINUE_LOADING_REQUESTED = 9;
    private static final int MSG_STOP = 6;
    private static final int MSG_TRACK_SELECTION_INVALIDATED = 10;
    private static final long PLAYBACK_STUCK_AFTER_MS = 4000;
    private static final String TAG = "ExoPlayerImplInternal";
    private final long backBufferDurationUs;
    private final BandwidthMeter bandwidthMeter;
    private final Clock clock;
    private boolean deliverPendingMessageAtStartPositionRequired;
    private final TrackSelectorResult emptyTrackSelectorResult;
    private int enabledRendererCount;
    private boolean foregroundMode;
    private final HandlerWrapper handler;
    private final HandlerThread internalPlaybackThread;
    private boolean isRebuffering;
    private final LivePlaybackSpeedControl livePlaybackSpeedControl;
    private final LoadControl loadControl;
    private final DefaultMediaClock mediaClock;
    private final MediaSourceList mediaSourceList;
    private int nextPendingMessageIndexHint;
    private boolean offloadSchedulingEnabled;
    private boolean pauseAtEndOfWindow;
    private SeekPosition pendingInitialSeekPosition;
    private final ArrayList<PendingMessageInfo> pendingMessages;
    private boolean pendingPauseAtEndOfPeriod;
    private ExoPlaybackException pendingRecoverableRendererError;
    private final Timeline.Period period;
    private PlaybackInfo playbackInfo;
    private PlaybackInfoUpdate playbackInfoUpdate;
    private final PlaybackInfoUpdateListener playbackInfoUpdateListener;
    private final Looper playbackLooper;
    private long playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
    private final MediaPeriodQueue queue;
    private final long releaseTimeoutMs;
    private boolean released;
    private final RendererCapabilities[] rendererCapabilities;
    private long rendererPositionUs;
    private final Renderer[] renderers;
    private final Set<Renderer> renderersToReset;
    private int repeatMode;
    private boolean requestForRendererSleep;
    private final boolean retainBackBufferFromKeyframe;
    private SeekParameters seekParameters;
    private long setForegroundModeTimeoutMs;
    private boolean shouldContinueLoading;
    private boolean shuffleModeEnabled;
    private final TrackSelector trackSelector;
    private final Timeline.Window window;

    public static final class MediaSourceListUpdateMessage {
        private final List<MediaSourceList.MediaSourceHolder> mediaSourceHolders;
        private final long positionUs;
        private final ShuffleOrder shuffleOrder;
        private final int windowIndex;

        private MediaSourceListUpdateMessage(List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder, int i14, long j8) {
            this.mediaSourceHolders = list;
            this.shuffleOrder = shuffleOrder;
            this.windowIndex = i14;
            this.positionUs = j8;
        }
    }

    public static class MoveMediaItemsMessage {
        public final int fromIndex;
        public final int newFromIndex;
        public final ShuffleOrder shuffleOrder;
        public final int toIndex;

        public MoveMediaItemsMessage(int i14, int i15, int i16, ShuffleOrder shuffleOrder) {
            this.fromIndex = i14;
            this.toIndex = i15;
            this.newFromIndex = i16;
            this.shuffleOrder = shuffleOrder;
        }
    }

    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        public final PlayerMessage message;
        public int resolvedPeriodIndex;
        public long resolvedPeriodTimeUs;
        public Object resolvedPeriodUid;

        public PendingMessageInfo(PlayerMessage playerMessage) {
            this.message = playerMessage;
        }

        @Override // java.lang.Comparable
        public int compareTo(PendingMessageInfo pendingMessageInfo) {
            Object obj = this.resolvedPeriodUid;
            if ((obj == null) != (pendingMessageInfo.resolvedPeriodUid == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i14 = this.resolvedPeriodIndex - pendingMessageInfo.resolvedPeriodIndex;
            return i14 != 0 ? i14 : Util.compareLong(this.resolvedPeriodTimeUs, pendingMessageInfo.resolvedPeriodTimeUs);
        }

        public void setResolvedPosition(int i14, long j8, Object obj) {
            this.resolvedPeriodIndex = i14;
            this.resolvedPeriodTimeUs = j8;
            this.resolvedPeriodUid = obj;
        }
    }

    public static final class PlaybackInfoUpdate {
        public int discontinuityReason;
        private boolean hasPendingChange;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public PlaybackInfo playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int i14) {
            this.hasPendingChange |= i14 > 0;
            this.operationAcks += i14;
        }

        public void setPlayWhenReadyChangeReason(int i14) {
            this.hasPendingChange = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = i14;
        }

        public void setPlaybackInfo(PlaybackInfo playbackInfo) {
            this.hasPendingChange |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int i14) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(i14 == 5);
                return;
            }
            this.hasPendingChange = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = i14;
        }
    }

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfoUpdate);
    }

    public static final class PositionUpdateForPlaylistChange {
        public final boolean endPlayback;
        public final boolean forceBufferingState;
        public final MediaSource.MediaPeriodId periodId;
        public final long periodPositionUs;
        public final long requestedContentPositionUs;
        public final boolean setTargetLiveOffset;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j8, long j14, boolean z14, boolean z15, boolean z16) {
            this.periodId = mediaPeriodId;
            this.periodPositionUs = j8;
            this.requestedContentPositionUs = j14;
            this.forceBufferingState = z14;
            this.endPlayback = z15;
            this.setTargetLiveOffset = z16;
        }
    }

    public static final class SeekPosition {
        public final Timeline timeline;
        public final int windowIndex;
        public final long windowPositionUs;

        public SeekPosition(Timeline timeline, int i14, long j8) {
            this.timeline = timeline;
            this.windowIndex = i14;
            this.windowPositionUs = j8;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i14, boolean z14, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long j8, boolean z15, Looper looper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener, PlayerId playerId) {
        this.playbackInfoUpdateListener = playbackInfoUpdateListener;
        this.renderers = rendererArr;
        this.trackSelector = trackSelector;
        this.emptyTrackSelectorResult = trackSelectorResult;
        this.loadControl = loadControl;
        this.bandwidthMeter = bandwidthMeter;
        this.repeatMode = i14;
        this.shuffleModeEnabled = z14;
        this.seekParameters = seekParameters;
        this.livePlaybackSpeedControl = livePlaybackSpeedControl;
        this.releaseTimeoutMs = j8;
        this.setForegroundModeTimeoutMs = j8;
        this.pauseAtEndOfWindow = z15;
        this.clock = clock;
        this.backBufferDurationUs = loadControl.getBackBufferDurationUs();
        this.retainBackBufferFromKeyframe = loadControl.retainBackBufferFromKeyframe();
        PlaybackInfo playbackInfoCreateDummy = PlaybackInfo.createDummy(trackSelectorResult);
        this.playbackInfo = playbackInfoCreateDummy;
        this.playbackInfoUpdate = new PlaybackInfoUpdate(playbackInfoCreateDummy);
        this.rendererCapabilities = new RendererCapabilities[rendererArr.length];
        for (int i15 = 0; i15 < rendererArr.length; i15++) {
            rendererArr[i15].init(i15, playerId);
            this.rendererCapabilities[i15] = rendererArr[i15].getCapabilities();
        }
        this.mediaClock = new DefaultMediaClock(this, clock);
        this.pendingMessages = new ArrayList<>();
        this.renderersToReset = Sets.newIdentityHashSet();
        this.window = new Timeline.Window();
        this.period = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.deliverPendingMessageAtStartPositionRequired = true;
        Handler handler = new Handler(looper);
        this.queue = new MediaPeriodQueue(analyticsCollector, handler);
        this.mediaSourceList = new MediaSourceList(this, analyticsCollector, handler, playerId);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.internalPlaybackThread = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.playbackLooper = looper2;
        this.handler = clock.createHandler(looper2, this);
    }

    private void addMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i14) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.mediaSourceList;
        if (i14 == -1) {
            i14 = mediaSourceList.getSize();
        }
        handleMediaSourceListInfoRefreshed(mediaSourceList.addMediaSources(i14, mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void attemptRendererErrorRecovery() {
        seekToCurrentPosition(true);
    }

    private void deliverMessage(PlayerMessage playerMessage) {
        if (playerMessage.isCanceled()) {
            return;
        }
        try {
            playerMessage.getTarget().handleMessage(playerMessage.getType(), playerMessage.getPayload());
        } finally {
            playerMessage.markAsProcessed(true);
        }
    }

    private void disableRenderer(Renderer renderer) {
        if (isRendererEnabled(renderer)) {
            this.mediaClock.onRendererDisabled(renderer);
            ensureStopped(renderer);
            renderer.disable();
            this.enabledRendererCount--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x019c  */
    private void doSomeWork() {
        boolean z14;
        boolean z15;
        boolean z16;
        int i14;
        boolean zMaybeScheduleWakeup;
        boolean z17;
        long jUptimeMillis = this.clock.uptimeMillis();
        updatePeriods();
        int i15 = this.playbackInfo.playbackState;
        boolean z18 = true;
        if (i15 == 1 || i15 == 4) {
            this.handler.removeMessages(2);
            return;
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            scheduleNextWork(jUptimeMillis, 10L);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        updatePlaybackPositions();
        if (playingPeriod.prepared) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            playingPeriod.mediaPeriod.discardBuffer(this.playbackInfo.positionUs - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            z15 = true;
            z16 = true;
            int i16 = 0;
            while (true) {
                Renderer[] rendererArr = this.renderers;
                if (i16 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i16];
                if (isRendererEnabled(renderer)) {
                    z17 = z18;
                    renderer.render(this.rendererPositionUs, jElapsedRealtime);
                    z15 = (z15 && renderer.isEnded()) ? z17 : false;
                    boolean z19 = playingPeriod.sampleStreams[i16] != renderer.getStream() ? z17 : false;
                    boolean z24 = (z19 || ((z19 || !renderer.hasReadStreamToEnd()) ? false : z17) || renderer.isReady() || renderer.isEnded()) ? z17 : false;
                    z16 = (z16 && z24) ? z17 : false;
                    if (!z24) {
                        renderer.maybeThrowStreamError();
                    }
                } else {
                    z17 = z18;
                }
                i16++;
                z18 = z17;
            }
            z14 = z18;
        } else {
            z14 = true;
            playingPeriod.mediaPeriod.maybeThrowPrepareError();
            z15 = true;
            z16 = true;
        }
        long j8 = playingPeriod.info.durationUs;
        boolean z25 = (z15 && playingPeriod.prepared && (j8 == C.TIME_UNSET || j8 <= this.playbackInfo.positionUs)) ? z14 : false;
        if (z25 && this.pendingPauseAtEndOfPeriod) {
            this.pendingPauseAtEndOfPeriod = false;
            setPlayWhenReadyInternal(false, this.playbackInfo.playbackSuppressionReason, false, 5);
        }
        if (z25 && playingPeriod.info.isFinal) {
            setState(4);
            stopRenderers();
        } else if (this.playbackInfo.playbackState == 2 && shouldTransitionToReadyState(z16)) {
            setState(3);
            this.pendingRecoverableRendererError = null;
            if (shouldPlayWhenReady()) {
                startRenderers();
            }
        } else if (this.playbackInfo.playbackState == 3 && (this.enabledRendererCount != 0 ? !z16 : !isTimelineReady())) {
            this.isRebuffering = shouldPlayWhenReady();
            setState(2);
            if (this.isRebuffering) {
                notifyTrackSelectionRebuffer();
                this.livePlaybackSpeedControl.notifyRebuffer();
            }
            stopRenderers();
        }
        if (this.playbackInfo.playbackState == 2) {
            int i17 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.renderers;
                if (i17 >= rendererArr2.length) {
                    break;
                }
                if (isRendererEnabled(rendererArr2[i17]) && this.renderers[i17].getStream() == playingPeriod.sampleStreams[i17]) {
                    this.renderers[i17].maybeThrowStreamError();
                }
                i17++;
            }
            PlaybackInfo playbackInfo = this.playbackInfo;
            if (playbackInfo.isLoading || playbackInfo.totalBufferedDurationUs >= 500000 || !isLoadingPossible()) {
                this.playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
            } else {
                long j14 = this.playbackMaybeBecameStuckAtMs;
                Clock clock = this.clock;
                if (j14 == C.TIME_UNSET) {
                    this.playbackMaybeBecameStuckAtMs = clock.elapsedRealtime();
                } else if (clock.elapsedRealtime() - this.playbackMaybeBecameStuckAtMs >= PLAYBACK_STUCK_AFTER_MS) {
                    vb.h.z("Playback stuck buffering and not loading");
                    return;
                }
            }
        } else {
            this.playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
        }
        boolean z26 = this.offloadSchedulingEnabled;
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (z26 != playbackInfo2.offloadSchedulingEnabled) {
            this.playbackInfo = playbackInfo2.copyWithOffloadSchedulingEnabled(z26);
        }
        if ((shouldPlayWhenReady() && this.playbackInfo.playbackState == 3) || (i14 = this.playbackInfo.playbackState) == 2) {
            zMaybeScheduleWakeup = maybeScheduleWakeup(jUptimeMillis, 10L) ^ z14;
        } else {
            if (this.enabledRendererCount == 0 || i14 == 4) {
                this.handler.removeMessages(2);
            } else {
                scheduleNextWork(jUptimeMillis, 1000L);
            }
            zMaybeScheduleWakeup = false;
        }
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        if (playbackInfo3.sleepingForOffload != zMaybeScheduleWakeup) {
            this.playbackInfo = playbackInfo3.copyWithSleepingForOffload(zMaybeScheduleWakeup);
        }
        this.requestForRendererSleep = false;
        TraceUtil.endSection();
    }

    private void enableRenderer(int i14, boolean z14) {
        Renderer renderer = this.renderers[i14];
        if (isRendererEnabled(renderer)) {
            return;
        }
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z15 = readingPeriod == this.queue.getPlayingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i14];
        Format[] formats = getFormats(trackSelectorResult.selections[i14]);
        boolean z16 = shouldPlayWhenReady() && this.playbackInfo.playbackState == 3;
        boolean z17 = !z14 && z16;
        this.enabledRendererCount++;
        this.renderersToReset.add(renderer);
        renderer.enable(rendererConfiguration, formats, readingPeriod.sampleStreams[i14], this.rendererPositionUs, z17, z15, readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
        renderer.handleMessage(11, new Renderer.WakeupListener() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal.1
            @Override // com.google.android.exoplayer2.Renderer.WakeupListener
            public void onSleep(long j8) {
                if (j8 >= 2000) {
                    ExoPlayerImplInternal.this.requestForRendererSleep = true;
                }
            }

            @Override // com.google.android.exoplayer2.Renderer.WakeupListener
            public void onWakeup() {
                ExoPlayerImplInternal.this.handler.sendEmptyMessage(2);
            }
        });
        this.mediaClock.onRendererEnabled(renderer);
        if (z16) {
            renderer.start();
        }
    }

    private void enableRenderers(boolean[] zArr) {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        for (int i14 = 0; i14 < this.renderers.length; i14++) {
            if (!trackSelectorResult.isRendererEnabled(i14) && this.renderersToReset.remove(this.renderers[i14])) {
                this.renderers[i14].reset();
            }
        }
        for (int i15 = 0; i15 < this.renderers.length; i15++) {
            if (trackSelectorResult.isRendererEnabled(i15)) {
                enableRenderer(i15, zArr[i15]);
            }
        }
        readingPeriod.allRenderersInCorrectState = true;
    }

    private void ensureStopped(Renderer renderer) {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private ImmutableList<Metadata> extractMetadataFromTrackSelectionArray(ExoTrackSelection[] exoTrackSelectionArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z14 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    builder.add(new Metadata(new Metadata.Entry[0]));
                } else {
                    builder.add(metadata);
                    z14 = true;
                }
            }
        }
        return z14 ? builder.build() : ImmutableList.of();
    }

    private long getCurrentLiveOffsetUs() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return getLiveOffsetUs(playbackInfo.timeline, playbackInfo.periodId.periodUid, playbackInfo.positionUs);
    }

    private static Format[] getFormats(ExoTrackSelection exoTrackSelection) {
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i14 = 0; i14 < length; i14++) {
            formatArr[i14] = exoTrackSelection.getFormat(i14);
        }
        return formatArr;
    }

    private long getLiveOffsetUs(Timeline timeline, Object obj, long j8) {
        timeline.getWindow(timeline.getPeriodByUid(obj, this.period).windowIndex, this.window);
        Timeline.Window window = this.window;
        if (window.windowStartTimeMs != C.TIME_UNSET && window.isLive()) {
            Timeline.Window window2 = this.window;
            if (window2.isDynamic) {
                return Util.msToUs(window2.getCurrentUnixTimeMs() - this.window.windowStartTimeMs) - (this.period.getPositionInWindowUs() + j8);
            }
        }
        return C.TIME_UNSET;
    }

    private long getMaxRendererReadPositionUs() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null) {
            return 0L;
        }
        long rendererOffset = readingPeriod.getRendererOffset();
        if (!readingPeriod.prepared) {
            return rendererOffset;
        }
        int i14 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i14 >= rendererArr.length) {
                return rendererOffset;
            }
            if (isRendererEnabled(rendererArr[i14]) && this.renderers[i14].getStream() == readingPeriod.sampleStreams[i14]) {
                long readingPositionUs = this.renderers[i14].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                rendererOffset = Math.max(readingPositionUs, rendererOffset);
            }
            i14++;
        }
    }

    private Pair<MediaSource.MediaPeriodId, Long> getPlaceholderFirstMediaPeriodPositionUs(Timeline timeline) {
        if (timeline.isEmpty()) {
            return Pair.create(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L);
        }
        Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.period, timeline.getFirstWindowIndex(this.shuffleModeEnabled), C.TIME_UNSET);
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = this.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline, periodPositionUs.first, 0L);
        long jLongValue = ((Long) periodPositionUs.second).longValue();
        if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
            timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, this.period);
            jLongValue = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup == this.period.getFirstAdIndexToPlay(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) ? this.period.getAdResumePositionUs() : 0L;
        }
        return Pair.create(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, Long.valueOf(jLongValue));
    }

    private long getTotalBufferedDurationUs(long j8) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        if (loadingPeriod == null) {
            return 0L;
        }
        return Math.max(0L, j8 - loadingPeriod.toPeriodTime(this.rendererPositionUs));
    }

    private void handleContinueLoadingRequested(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            this.queue.reevaluateBuffer(this.rendererPositionUs);
            maybeContinueLoading();
        }
    }

    private void handleIoException(IOException iOException, int i14) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(iOException, i14);
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.copyWithMediaPeriodId(playingPeriod.info.f52877id);
        }
        Log.e(TAG, "Playback error", exoPlaybackExceptionCreateForSource);
        stopInternal(false, false);
        this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForSource);
    }

    private void handleLoadingMediaPeriodChanged(boolean z14) {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        MediaSource.MediaPeriodId mediaPeriodId = loadingPeriod == null ? this.playbackInfo.periodId : loadingPeriod.info.f52877id;
        boolean zEquals = this.playbackInfo.loadingMediaPeriodId.equals(mediaPeriodId);
        if (!zEquals) {
            this.playbackInfo = this.playbackInfo.copyWithLoadingMediaPeriodId(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        playbackInfo.bufferedPositionUs = loadingPeriod == null ? playbackInfo.positionUs : loadingPeriod.getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        if ((!zEquals || z14) && loadingPeriod != null && loadingPeriod.prepared) {
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
        }
    }

    private void handleMediaSourceListInfoRefreshed(Timeline timeline, boolean z14) throws Throwable {
        int i14;
        Timeline timeline2;
        Timeline timeline3;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChangeResolvePositionForPlaylistChange = resolvePositionForPlaylistChange(timeline, this.playbackInfo, this.pendingInitialSeekPosition, this.queue, this.repeatMode, this.shuffleModeEnabled, this.window, this.period);
        MediaSource.MediaPeriodId mediaPeriodId = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodId;
        long j8 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.requestedContentPositionUs;
        boolean z15 = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.forceBufferingState;
        long jSeekToPeriodPosition = positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.periodPositionUs;
        int i15 = 1;
        boolean z16 = (this.playbackInfo.periodId.equals(mediaPeriodId) && jSeekToPeriodPosition == this.playbackInfo.positionUs) ? false : true;
        Timeline timeline4 = null;
        try {
            if (positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.endPlayback) {
                if (this.playbackInfo.playbackState != 1) {
                    setState(4);
                }
                resetInternal(false, false, false, true);
            }
            try {
                if (z16) {
                    timeline3 = timeline;
                    i15 = -1;
                    i14 = 4;
                    if (!timeline3.isEmpty()) {
                        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
                            if (playingPeriod.info.f52877id.equals(mediaPeriodId)) {
                                playingPeriod.info = this.queue.getUpdatedMediaPeriodInfo(timeline3, playingPeriod.info);
                                playingPeriod.updateClipping();
                            }
                        }
                        jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, jSeekToPeriodPosition, z15);
                    }
                } else {
                    try {
                        try {
                            i14 = 4;
                            try {
                                i15 = -1;
                                try {
                                    timeline3 = timeline;
                                    if (!this.queue.updateQueuedPeriods(timeline, this.rendererPositionUs, getMaxRendererReadPositionUs())) {
                                        seekToCurrentPosition(false);
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    timeline4 = timeline;
                                    timeline2 = timeline4;
                                    PlaybackInfo playbackInfo = this.playbackInfo;
                                    Timeline timeline5 = playbackInfo.timeline;
                                    MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.periodId;
                                    Timeline timeline6 = timeline2;
                                    updatePlaybackSpeedSettingsForNewPeriod(timeline6, mediaPeriodId, timeline5, mediaPeriodId2, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : -9223372036854775807L);
                                    if (z16 || j8 != this.playbackInfo.requestedContentPositionUs) {
                                        PlaybackInfo playbackInfo2 = this.playbackInfo;
                                        Object obj = playbackInfo2.periodId.periodUid;
                                        Timeline timeline7 = playbackInfo2.timeline;
                                        this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j8, this.playbackInfo.discontinuityStartPositionUs, z16 && z14 && !timeline7.isEmpty() && !timeline7.getPeriodByUid(obj, this.period).isPlaceholder, timeline6.getIndexOfPeriod(obj) == i15 ? i14 : 3);
                                    }
                                    resetPendingPauseAtEndOfPeriod();
                                    resolvePendingMessagePositions(timeline6, this.playbackInfo.timeline);
                                    this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline6);
                                    if (!timeline6.isEmpty()) {
                                        this.pendingInitialSeekPosition = null;
                                    }
                                    handleLoadingMediaPeriodChanged(false);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                timeline4 = timeline;
                                i15 = -1;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            timeline4 = timeline;
                            i15 = -1;
                            i14 = 4;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        timeline4 = timeline;
                        i15 = -1;
                        i14 = 4;
                    }
                }
                PlaybackInfo playbackInfo3 = this.playbackInfo;
                updatePlaybackSpeedSettingsForNewPeriod(timeline3, mediaPeriodId, playbackInfo3.timeline, playbackInfo3.periodId, positionUpdateForPlaylistChangeResolvePositionForPlaylistChange.setTargetLiveOffset ? jSeekToPeriodPosition : -9223372036854775807L);
                if (z16 || j8 != this.playbackInfo.requestedContentPositionUs) {
                    PlaybackInfo playbackInfo4 = this.playbackInfo;
                    Object obj2 = playbackInfo4.periodId.periodUid;
                    Timeline timeline8 = playbackInfo4.timeline;
                    this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, j8, this.playbackInfo.discontinuityStartPositionUs, z16 && z14 && !timeline8.isEmpty() && !timeline8.getPeriodByUid(obj2, this.period).isPlaceholder, timeline3.getIndexOfPeriod(obj2) == i15 ? i14 : 3);
                }
                resetPendingPauseAtEndOfPeriod();
                resolvePendingMessagePositions(timeline3, this.playbackInfo.timeline);
                this.playbackInfo = this.playbackInfo.copyWithTimeline(timeline3);
                if (!timeline3.isEmpty()) {
                    this.pendingInitialSeekPosition = null;
                }
                handleLoadingMediaPeriodChanged(false);
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Throwable th8) {
            th = th8;
            i15 = -1;
            i14 = 4;
            timeline2 = timeline;
        }
    }

    private void handlePeriodPrepared(MediaPeriod mediaPeriod) {
        if (this.queue.isLoading(mediaPeriod)) {
            MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
            loadingPeriod.handlePrepared(this.mediaClock.getPlaybackParameters().speed, this.playbackInfo.timeline);
            updateLoadControlTrackSelection(loadingPeriod.getTrackGroups(), loadingPeriod.getTrackSelectorResult());
            if (loadingPeriod == this.queue.getPlayingPeriod()) {
                resetRendererPosition(loadingPeriod.info.startPositionUs);
                enableRenderers();
                PlaybackInfo playbackInfo = this.playbackInfo;
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
                long j8 = loadingPeriod.info.startPositionUs;
                this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, j8, playbackInfo.requestedContentPositionUs, j8, false, 5);
            }
            maybeContinueLoading();
        }
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, float f14, boolean z14, boolean z15) {
        if (z14) {
            if (z15) {
                this.playbackInfoUpdate.incrementPendingOperationAcks(1);
            }
            this.playbackInfo = this.playbackInfo.copyWithPlaybackParameters(playbackParameters);
        }
        updateTrackSelectionPlaybackSpeed(playbackParameters.speed);
        for (Renderer renderer : this.renderers) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(f14, playbackParameters.speed);
            }
        }
    }

    private PlaybackInfo handlePositionDiscontinuity(MediaSource.MediaPeriodId mediaPeriodId, long j8, long j14, long j15, boolean z14, int i14) {
        List<Metadata> list;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.deliverPendingMessageAtStartPositionRequired = (!this.deliverPendingMessageAtStartPositionRequired && j8 == this.playbackInfo.positionUs && mediaPeriodId.equals(this.playbackInfo.periodId)) ? false : true;
        resetPendingPauseAtEndOfPeriod();
        PlaybackInfo playbackInfo = this.playbackInfo;
        TrackGroupArray trackGroupArray2 = playbackInfo.trackGroups;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.trackSelectorResult;
        List<Metadata> listOf = playbackInfo.staticMetadata;
        if (this.mediaSourceList.isPrepared()) {
            MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
            TrackGroupArray trackGroups = playingPeriod == null ? TrackGroupArray.EMPTY : playingPeriod.getTrackGroups();
            TrackSelectorResult trackSelectorResult3 = playingPeriod == null ? this.emptyTrackSelectorResult : playingPeriod.getTrackSelectorResult();
            ImmutableList<Metadata> immutableListExtractMetadataFromTrackSelectionArray = extractMetadataFromTrackSelectionArray(trackSelectorResult3.selections);
            if (playingPeriod != null) {
                MediaPeriodInfo mediaPeriodInfo = playingPeriod.info;
                if (mediaPeriodInfo.requestedContentPositionUs != j14) {
                    playingPeriod.info = mediaPeriodInfo.copyWithRequestedContentPositionUs(j14);
                }
            }
            trackGroupArray = trackGroups;
            trackSelectorResult = trackSelectorResult3;
            list = immutableListExtractMetadataFromTrackSelectionArray;
        } else {
            if (!mediaPeriodId.equals(this.playbackInfo.periodId)) {
                trackGroupArray2 = TrackGroupArray.EMPTY;
                trackSelectorResult2 = this.emptyTrackSelectorResult;
                listOf = ImmutableList.of();
            }
            list = listOf;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        }
        if (z14) {
            this.playbackInfoUpdate.setPositionDiscontinuity(i14);
        }
        return this.playbackInfo.copyWithNewPosition(mediaPeriodId, j8, j14, j15, getTotalBufferedDurationUs(), trackGroupArray, trackSelectorResult, list);
    }

    private boolean hasReachedServerSideInsertedAdsTransition(Renderer renderer, MediaPeriodHolder mediaPeriodHolder) {
        MediaPeriodHolder next = mediaPeriodHolder.getNext();
        if (mediaPeriodHolder.info.isFollowedByTransitionToSameStream && next.prepared) {
            return (renderer instanceof TextRenderer) || (renderer instanceof MetadataRenderer) || renderer.getReadingPositionUs() >= next.getStartPositionRendererTime();
        }
        return false;
    }

    private boolean hasReadingPeriodFinishedReading() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (!readingPeriod.prepared) {
            return false;
        }
        int i14 = 0;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i14 >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i14];
            SampleStream sampleStream = readingPeriod.sampleStreams[i14];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !hasReachedServerSideInsertedAdsTransition(renderer, readingPeriod))) {
                return false;
            }
            i14++;
        }
    }

    private static boolean isIgnorableServerSideAdInsertionPeriodChange(boolean z14, MediaSource.MediaPeriodId mediaPeriodId, long j8, MediaSource.MediaPeriodId mediaPeriodId2, Timeline.Period period, long j14) {
        if (!z14 && j8 == j14 && mediaPeriodId.periodUid.equals(mediaPeriodId2.periodUid)) {
            if (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)) {
                return (period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 4 || period.getAdState(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) == 2) ? false : true;
            }
            if (mediaPeriodId2.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId2.adGroupIndex)) {
                return true;
            }
        }
        return false;
    }

    private boolean isLoadingPossible() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod == null || loadingPeriod.getNextLoadPositionUs() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean isRendererEnabled(Renderer renderer) {
        return renderer.getState() != 0;
    }

    private boolean isTimelineReady() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j8 = playingPeriod.info.durationUs;
        if (playingPeriod.prepared) {
            return j8 == C.TIME_UNSET || this.playbackInfo.positionUs < j8 || !shouldPlayWhenReady();
        }
        return false;
    }

    private static boolean isUsingPlaceholderPeriod(PlaybackInfo playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Timeline timeline = playbackInfo.timeline;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$release$0() {
        return Boolean.valueOf(this.released);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendMessageToTargetThread$1(PlayerMessage playerMessage) {
        try {
            deliverMessage(playerMessage);
        } catch (ExoPlaybackException e4) {
            Log.e(TAG, "Unexpected error delivering message on external thread.", e4);
            c.p(e4);
        }
    }

    private void maybeContinueLoading() {
        boolean zShouldContinueLoading = shouldContinueLoading();
        this.shouldContinueLoading = zShouldContinueLoading;
        if (zShouldContinueLoading) {
            this.queue.getLoadingPeriod().continueLoading(this.rendererPositionUs);
        }
        updateIsLoading();
    }

    private void maybeNotifyPlaybackInfoChanged() {
        this.playbackInfoUpdate.setPlaybackInfo(this.playbackInfo);
        if (this.playbackInfoUpdate.hasPendingChange) {
            this.playbackInfoUpdateListener.onPlaybackInfoUpdate(this.playbackInfoUpdate);
            this.playbackInfoUpdate = new PlaybackInfoUpdate(this.playbackInfo);
        }
    }

    private boolean maybeScheduleWakeup(long j8, long j14) {
        if (this.offloadSchedulingEnabled && this.requestForRendererSleep) {
            return false;
        }
        scheduleNextWork(j8, j14);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void maybeTriggerPendingMessages(long j8, long j14) {
        if (this.pendingMessages.isEmpty() || this.playbackInfo.periodId.isAd()) {
            return;
        }
        if (this.deliverPendingMessageAtStartPositionRequired) {
            j8--;
            this.deliverPendingMessageAtStartPositionRequired = false;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        int indexOfPeriod = playbackInfo.timeline.getIndexOfPeriod(playbackInfo.periodId.periodUid);
        int iMin = Math.min(this.nextPendingMessageIndexHint, this.pendingMessages.size());
        PendingMessageInfo pendingMessageInfo = iMin > 0 ? this.pendingMessages.get(iMin - 1) : null;
        while (pendingMessageInfo != null) {
            int i14 = pendingMessageInfo.resolvedPeriodIndex;
            if (i14 <= indexOfPeriod && (i14 != indexOfPeriod || pendingMessageInfo.resolvedPeriodTimeUs <= j8)) {
                break;
            }
            int i15 = iMin - 1;
            pendingMessageInfo = i15 > 0 ? this.pendingMessages.get(iMin - 2) : null;
            iMin = i15;
        }
        if (iMin < this.pendingMessages.size()) {
            PendingMessageInfo pendingMessageInfo2 = this.pendingMessages.get(iMin);
            while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null) {
                int i16 = pendingMessageInfo2.resolvedPeriodIndex;
                if (i16 >= indexOfPeriod && (i16 != indexOfPeriod || pendingMessageInfo2.resolvedPeriodTimeUs > j8)) {
                    break;
                }
                iMin++;
                pendingMessageInfo2 = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
            }
            while (pendingMessageInfo2 != null && pendingMessageInfo2.resolvedPeriodUid != null && pendingMessageInfo2.resolvedPeriodIndex == indexOfPeriod) {
                long j15 = pendingMessageInfo2.resolvedPeriodTimeUs;
                if (j15 <= j8 || j15 > j14) {
                    break;
                }
                try {
                    sendMessageToTarget(pendingMessageInfo2.message);
                    if (pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    } else {
                        iMin++;
                    }
                    pendingMessageInfo2 = iMin < this.pendingMessages.size() ? this.pendingMessages.get(iMin) : null;
                } catch (Throwable th3) {
                    if (pendingMessageInfo2.message.getDeleteAfterDelivery() || pendingMessageInfo2.message.isCanceled()) {
                        this.pendingMessages.remove(iMin);
                    }
                    throw th3;
                }
            }
            this.nextPendingMessageIndexHint = iMin;
        }
    }

    private void maybeUpdateLoadingPeriod() {
        MediaPeriodInfo nextMediaPeriodInfo;
        this.queue.reevaluateBuffer(this.rendererPositionUs);
        if (this.queue.shouldLoadNextMediaPeriod() && (nextMediaPeriodInfo = this.queue.getNextMediaPeriodInfo(this.rendererPositionUs, this.playbackInfo)) != null) {
            MediaPeriodHolder mediaPeriodHolderEnqueueNextMediaPeriodHolder = this.queue.enqueueNextMediaPeriodHolder(this.rendererCapabilities, this.trackSelector, this.loadControl.getAllocator(), this.mediaSourceList, nextMediaPeriodInfo, this.emptyTrackSelectorResult);
            mediaPeriodHolderEnqueueNextMediaPeriodHolder.mediaPeriod.prepare(this, nextMediaPeriodInfo.startPositionUs);
            if (this.queue.getPlayingPeriod() == mediaPeriodHolderEnqueueNextMediaPeriodHolder) {
                resetRendererPosition(nextMediaPeriodInfo.startPositionUs);
            }
            handleLoadingMediaPeriodChanged(false);
        }
        if (!this.shouldContinueLoading) {
            maybeContinueLoading();
        } else {
            this.shouldContinueLoading = isLoadingPossible();
            updateIsLoading();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    private void maybeUpdatePlayingPeriod() {
        boolean z14;
        boolean z15 = false;
        while (shouldAdvancePlayingPeriod()) {
            if (z15) {
                maybeNotifyPlaybackInfoChanged();
            }
            MediaPeriodHolder mediaPeriodHolder = (MediaPeriodHolder) Assertions.checkNotNull(this.queue.advancePlayingPeriod());
            if (this.playbackInfo.periodId.periodUid.equals(mediaPeriodHolder.info.f52877id.periodUid)) {
                MediaSource.MediaPeriodId mediaPeriodId = this.playbackInfo.periodId;
                if (mediaPeriodId.adGroupIndex == -1) {
                    MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolder.info.f52877id;
                    if (mediaPeriodId2.adGroupIndex != -1 || mediaPeriodId.nextAdGroupIndex == mediaPeriodId2.nextAdGroupIndex) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.info;
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.f52877id;
            long j8 = mediaPeriodInfo.startPositionUs;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId3, j8, mediaPeriodInfo.requestedContentPositionUs, j8, !z14, 0);
            resetPendingPauseAtEndOfPeriod();
            updatePlaybackPositions();
            z15 = true;
        }
    }

    private void maybeUpdateReadingPeriod() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod != null) {
            int i14 = 0;
            if (readingPeriod.getNext() == null || this.pendingPauseAtEndOfPeriod) {
                if (!readingPeriod.info.isFinal && !this.pendingPauseAtEndOfPeriod) {
                    return;
                }
                while (true) {
                    Renderer[] rendererArr = this.renderers;
                    if (i14 >= rendererArr.length) {
                        return;
                    }
                    Renderer renderer = rendererArr[i14];
                    SampleStream sampleStream = readingPeriod.sampleStreams[i14];
                    if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                        long j8 = readingPeriod.info.durationUs;
                        setCurrentStreamFinal(renderer, (j8 == C.TIME_UNSET || j8 == Long.MIN_VALUE) ? -9223372036854775807L : readingPeriod.getRendererOffset() + readingPeriod.info.durationUs);
                    }
                    i14++;
                }
            } else if (hasReadingPeriodFinishedReading() && (readingPeriod.getNext().prepared || this.rendererPositionUs >= readingPeriod.getNext().getStartPositionRendererTime())) {
                TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
                MediaPeriodHolder mediaPeriodHolderAdvanceReadingPeriod = this.queue.advanceReadingPeriod();
                TrackSelectorResult trackSelectorResult2 = mediaPeriodHolderAdvanceReadingPeriod.getTrackSelectorResult();
                Timeline timeline = this.playbackInfo.timeline;
                updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodHolderAdvanceReadingPeriod.info.f52877id, timeline, readingPeriod.info.f52877id, C.TIME_UNSET);
                if (mediaPeriodHolderAdvanceReadingPeriod.prepared && mediaPeriodHolderAdvanceReadingPeriod.mediaPeriod.readDiscontinuity() != C.TIME_UNSET) {
                    setAllRendererStreamsFinal(mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                    return;
                }
                for (int i15 = 0; i15 < this.renderers.length; i15++) {
                    boolean zIsRendererEnabled = trackSelectorResult.isRendererEnabled(i15);
                    boolean zIsRendererEnabled2 = trackSelectorResult2.isRendererEnabled(i15);
                    if (zIsRendererEnabled && !this.renderers[i15].isCurrentStreamFinal()) {
                        boolean z14 = this.rendererCapabilities[i15].getTrackType() == -2;
                        RendererConfiguration rendererConfiguration = trackSelectorResult.rendererConfigurations[i15];
                        RendererConfiguration rendererConfiguration2 = trackSelectorResult2.rendererConfigurations[i15];
                        if (!zIsRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z14) {
                            setCurrentStreamFinal(this.renderers[i15], mediaPeriodHolderAdvanceReadingPeriod.getStartPositionRendererTime());
                        }
                    }
                }
            }
        }
    }

    private void maybeUpdateReadingRenderers() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        if (readingPeriod == null || this.queue.getPlayingPeriod() == readingPeriod || readingPeriod.allRenderersInCorrectState || !replaceStreamsOrDisableRendererForTransition()) {
            return;
        }
        enableRenderers();
    }

    private void mediaSourceListUpdateRequestedInternal() throws Throwable {
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.createTimeline(), true);
    }

    private void moveMediaItemsInternal(MoveMediaItemsMessage moveMediaItemsMessage) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.moveMediaSourceRange(moveMediaItemsMessage.fromIndex, moveMediaItemsMessage.toIndex, moveMediaItemsMessage.newFromIndex, moveMediaItemsMessage.shuffleOrder), false);
    }

    private void notifyTrackSelectionDiscontinuity() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private void notifyTrackSelectionPlayWhenReadyChanged(boolean z14) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(z14);
                }
            }
        }
    }

    private void notifyTrackSelectionRebuffer() {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private void prepareInternal() {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        resetInternal(false, false, false, true);
        this.loadControl.onPrepared();
        setState(this.playbackInfo.timeline.isEmpty() ? 4 : 2);
        this.mediaSourceList.prepare(this.bandwidthMeter.getTransferListener());
        this.handler.sendEmptyMessage(2);
    }

    private void releaseInternal() {
        resetInternal(true, false, true, false);
        this.loadControl.onReleased();
        setState(1);
        this.internalPlaybackThread.quit();
        synchronized (this) {
            this.released = true;
            notifyAll();
        }
    }

    private void removeMediaItemsInternal(int i14, int i15, ShuffleOrder shuffleOrder) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.removeMediaSourceRange(i14, i15, shuffleOrder), false);
    }

    private boolean replaceStreamsOrDisableRendererForTransition() {
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        TrackSelectorResult trackSelectorResult = readingPeriod.getTrackSelectorResult();
        int i14 = 0;
        boolean z14 = false;
        while (true) {
            Renderer[] rendererArr = this.renderers;
            if (i14 >= rendererArr.length) {
                return !z14;
            }
            Renderer renderer = rendererArr[i14];
            if (isRendererEnabled(renderer)) {
                boolean z15 = renderer.getStream() != readingPeriod.sampleStreams[i14];
                if (!trackSelectorResult.isRendererEnabled(i14) || z15) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(getFormats(trackSelectorResult.selections[i14]), readingPeriod.sampleStreams[i14], readingPeriod.getStartPositionRendererTime(), readingPeriod.getRendererOffset());
                    } else if (renderer.isEnded()) {
                        disableRenderer(renderer);
                    } else {
                        z14 = true;
                    }
                }
            }
            i14++;
        }
    }

    private void reselectTracksInternal() {
        int i14;
        float f14 = this.mediaClock.getPlaybackParameters().speed;
        MediaPeriodHolder readingPeriod = this.queue.getReadingPeriod();
        boolean z14 = true;
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null && playingPeriod.prepared; playingPeriod = playingPeriod.getNext()) {
            TrackSelectorResult trackSelectorResultSelectTracks = playingPeriod.selectTracks(f14, this.playbackInfo.timeline);
            if (!trackSelectorResultSelectTracks.isEquivalent(playingPeriod.getTrackSelectorResult())) {
                MediaPeriodQueue mediaPeriodQueue = this.queue;
                if (z14) {
                    MediaPeriodHolder playingPeriod2 = mediaPeriodQueue.getPlayingPeriod();
                    boolean zRemoveAfter = this.queue.removeAfter(playingPeriod2);
                    boolean[] zArr = new boolean[this.renderers.length];
                    long jApplyTrackSelection = playingPeriod2.applyTrackSelection(trackSelectorResultSelectTracks, this.playbackInfo.positionUs, zRemoveAfter, zArr);
                    PlaybackInfo playbackInfo = this.playbackInfo;
                    boolean z15 = (playbackInfo.playbackState == 4 || jApplyTrackSelection == playbackInfo.positionUs) ? false : true;
                    PlaybackInfo playbackInfo2 = this.playbackInfo;
                    i14 = 4;
                    this.playbackInfo = handlePositionDiscontinuity(playbackInfo2.periodId, jApplyTrackSelection, playbackInfo2.requestedContentPositionUs, playbackInfo2.discontinuityStartPositionUs, z15, 5);
                    if (z15) {
                        resetRendererPosition(jApplyTrackSelection);
                    }
                    boolean[] zArr2 = new boolean[this.renderers.length];
                    int i15 = 0;
                    while (true) {
                        Renderer[] rendererArr = this.renderers;
                        if (i15 >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i15];
                        boolean zIsRendererEnabled = isRendererEnabled(renderer);
                        zArr2[i15] = zIsRendererEnabled;
                        SampleStream sampleStream = playingPeriod2.sampleStreams[i15];
                        if (zIsRendererEnabled) {
                            if (sampleStream != renderer.getStream()) {
                                disableRenderer(renderer);
                            } else if (zArr[i15]) {
                                renderer.resetPosition(this.rendererPositionUs);
                            }
                        }
                        i15++;
                    }
                    enableRenderers(zArr2);
                } else {
                    i14 = 4;
                    mediaPeriodQueue.removeAfter(playingPeriod);
                    if (playingPeriod.prepared) {
                        playingPeriod.applyTrackSelection(trackSelectorResultSelectTracks, Math.max(playingPeriod.info.startPositionUs, playingPeriod.toPeriodTime(this.rendererPositionUs)), false);
                    }
                }
                handleLoadingMediaPeriodChanged(true);
                if (this.playbackInfo.playbackState != i14) {
                    maybeContinueLoading();
                    updatePlaybackPositions();
                    this.handler.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (playingPeriod == readingPeriod) {
                z14 = false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a3 A[PHI: r4 r5 r7
      0x00a3: PHI (r4v3 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId) = 
      (r4v2 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
      (r4v8 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
     binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r5v2 long) = (r5v1 long), (r5v5 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:30:0x0078, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]] */
    private void resetInternal(boolean z14, boolean z15, boolean z16, boolean z17) {
        boolean z18;
        this.handler.removeMessages(2);
        this.pendingRecoverableRendererError = null;
        this.isRebuffering = false;
        this.mediaClock.stop();
        this.rendererPositionUs = MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US;
        for (Renderer renderer : this.renderers) {
            try {
                disableRenderer(renderer);
            } catch (ExoPlaybackException | RuntimeException e4) {
                Log.e(TAG, "Disable failed.", e4);
            }
        }
        if (z14) {
            for (Renderer renderer2 : this.renderers) {
                if (this.renderersToReset.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (RuntimeException e14) {
                        Log.e(TAG, "Reset failed.", e14);
                    }
                }
            }
        }
        this.enabledRendererCount = 0;
        PlaybackInfo playbackInfo = this.playbackInfo;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        long jLongValue = playbackInfo.positionUs;
        long j8 = (this.playbackInfo.periodId.isAd() || isUsingPlaceholderPeriod(this.playbackInfo, this.period)) ? this.playbackInfo.requestedContentPositionUs : this.playbackInfo.positionUs;
        if (z15) {
            this.pendingInitialSeekPosition = null;
            Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = getPlaceholderFirstMediaPeriodPositionUs(this.playbackInfo.timeline);
            mediaPeriodId = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
            jLongValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
            boolean zEquals = mediaPeriodId.equals(this.playbackInfo.periodId);
            j8 = C.TIME_UNSET;
            if (zEquals) {
                z18 = false;
            } else {
                z18 = true;
            }
        } else {
            z18 = false;
        }
        long j14 = jLongValue;
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
        this.queue.clear();
        this.shouldContinueLoading = false;
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        Timeline timeline = playbackInfo2.timeline;
        int i14 = playbackInfo2.playbackState;
        ExoPlaybackException exoPlaybackException = z17 ? null : playbackInfo2.playbackError;
        TrackGroupArray trackGroupArray = z18 ? TrackGroupArray.EMPTY : playbackInfo2.trackGroups;
        TrackSelectorResult trackSelectorResult = z18 ? this.emptyTrackSelectorResult : playbackInfo2.trackSelectorResult;
        List listOf = z18 ? ImmutableList.of() : playbackInfo2.staticMetadata;
        PlaybackInfo playbackInfo3 = this.playbackInfo;
        this.playbackInfo = new PlaybackInfo(timeline, mediaPeriodId2, j8, j14, i14, exoPlaybackException, false, trackGroupArray, trackSelectorResult, listOf, mediaPeriodId2, playbackInfo3.playWhenReady, playbackInfo3.playbackSuppressionReason, playbackInfo3.playbackParameters, j14, 0L, j14, this.offloadSchedulingEnabled, false);
        if (z16) {
            this.mediaSourceList.release();
        }
    }

    private void resetPendingPauseAtEndOfPeriod() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        this.pendingPauseAtEndOfPeriod = playingPeriod != null && playingPeriod.info.isLastInTimelineWindow && this.pauseAtEndOfWindow;
    }

    private void resetRendererPosition(long j8) {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long rendererTime = playingPeriod == null ? j8 + MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US : playingPeriod.toRendererTime(j8);
        this.rendererPositionUs = rendererTime;
        this.mediaClock.resetPosition(rendererTime);
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.resetPosition(this.rendererPositionUs);
            }
        }
        notifyTrackSelectionDiscontinuity();
    }

    private static void resolvePendingMessageEndOfStreamPosition(Timeline timeline, PendingMessageInfo pendingMessageInfo, Timeline.Window window, Timeline.Period period) {
        int i14 = timeline.getWindow(timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i14, period, true).uid;
        long j8 = period.durationUs;
        pendingMessageInfo.setResolvedPosition(i14, j8 != C.TIME_UNSET ? j8 - 1 : Long.MAX_VALUE, obj);
    }

    private static boolean resolvePendingMessagePosition(PendingMessageInfo pendingMessageInfo, Timeline timeline, Timeline timeline2, int i14, boolean z14, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.resolvedPeriodUid;
        if (obj == null) {
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(timeline, new SeekPosition(pendingMessageInfo.message.getTimeline(), pendingMessageInfo.message.getMediaItemIndex(), pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : Util.msToUs(pendingMessageInfo.message.getPositionMs())), false, i14, z14, window, period);
            if (pairResolveSeekPositionUs == null) {
                return false;
            }
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(pairResolveSeekPositionUs.first), ((Long) pairResolveSeekPositionUs.second).longValue(), pairResolveSeekPositionUs.first);
            if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
                resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.message.getPositionMs() == Long.MIN_VALUE) {
            resolvePendingMessageEndOfStreamPosition(timeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.resolvedPeriodIndex = indexOfPeriod;
        timeline2.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period);
        if (period.isPlaceholder && timeline2.getWindow(period.windowIndex, window).firstPeriodIndex == timeline2.getIndexOfPeriod(pendingMessageInfo.resolvedPeriodUid)) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(pendingMessageInfo.resolvedPeriodUid, period).windowIndex, period.getPositionInWindowUs() + pendingMessageInfo.resolvedPeriodTimeUs);
            pendingMessageInfo.setResolvedPosition(timeline.getIndexOfPeriod(periodPositionUs.first), ((Long) periodPositionUs.second).longValue(), periodPositionUs.first);
        }
        return true;
    }

    private void resolvePendingMessagePositions(Timeline timeline, Timeline timeline2) {
        if (timeline.isEmpty() && timeline2.isEmpty()) {
            return;
        }
        int size = this.pendingMessages.size() - 1;
        while (true) {
            ArrayList<PendingMessageInfo> arrayList = this.pendingMessages;
            if (size < 0) {
                Collections.sort(arrayList);
                return;
            }
            Timeline timeline3 = timeline;
            Timeline timeline4 = timeline2;
            if (!resolvePendingMessagePosition(arrayList.get(size), timeline3, timeline4, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
                this.pendingMessages.get(size).message.markAsProcessed(false);
                this.pendingMessages.remove(size);
            }
            size--;
            timeline = timeline3;
            timeline2 = timeline4;
        }
    }

    private static PositionUpdateForPlaylistChange resolvePositionForPlaylistChange(Timeline timeline, PlaybackInfo playbackInfo, SeekPosition seekPosition, MediaPeriodQueue mediaPeriodQueue, int i14, boolean z14, Timeline.Window window, Timeline.Period period) {
        int firstWindowIndex;
        boolean z15;
        boolean z16;
        boolean z17;
        int firstWindowIndex2;
        boolean z18;
        Timeline timeline2;
        Timeline.Period period2;
        long j8;
        int i15;
        boolean z19;
        boolean z24;
        boolean z25;
        if (timeline.isEmpty()) {
            return new PositionUpdateForPlaylistChange(PlaybackInfo.getDummyPeriodForEmptyTimeline(), 0L, C.TIME_UNSET, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.periodId;
        Object obj = mediaPeriodId.periodUid;
        boolean zIsUsingPlaceholderPeriod = isUsingPlaceholderPeriod(playbackInfo, period);
        long jLongValue = (playbackInfo.periodId.isAd() || zIsUsingPlaceholderPeriod) ? playbackInfo.requestedContentPositionUs : playbackInfo.positionUs;
        long j14 = C.TIME_UNSET;
        boolean z26 = false;
        if (seekPosition != null) {
            Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(timeline, seekPosition, true, i14, z14, window, period);
            if (pairResolveSeekPositionUs == null) {
                firstWindowIndex = timeline.getFirstWindowIndex(z14);
                jLongValue = jLongValue;
                z19 = false;
                z24 = false;
                z25 = true;
            } else {
                long j15 = seekPosition.windowPositionUs;
                Object obj2 = pairResolveSeekPositionUs.first;
                if (j15 == C.TIME_UNSET) {
                    firstWindowIndex = timeline.getPeriodByUid(obj2, period).windowIndex;
                    jLongValue = jLongValue;
                    z19 = false;
                } else {
                    jLongValue = ((Long) pairResolveSeekPositionUs.second).longValue();
                    obj = obj2;
                    firstWindowIndex = -1;
                    z19 = true;
                }
                z24 = playbackInfo.playbackState == 4;
                z25 = false;
            }
            z17 = z19;
            z15 = z24;
            z16 = z25;
        } else {
            j14 = -9223372036854775807L;
            if (playbackInfo.timeline.isEmpty()) {
                firstWindowIndex = timeline.getFirstWindowIndex(z14);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                Object objResolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i14, z14, obj, playbackInfo.timeline, timeline);
                if (objResolveSubsequentPeriod == null) {
                    firstWindowIndex2 = timeline.getFirstWindowIndex(z14);
                    z18 = true;
                } else {
                    firstWindowIndex2 = timeline.getPeriodByUid(objResolveSubsequentPeriod, period).windowIndex;
                    z18 = false;
                }
                firstWindowIndex = firstWindowIndex2;
                obj = obj;
                jLongValue = jLongValue;
                z16 = z18;
                z15 = false;
                z17 = false;
            } else if (jLongValue == C.TIME_UNSET) {
                firstWindowIndex = timeline.getPeriodByUid(obj, period).windowIndex;
                obj = obj;
            } else if (zIsUsingPlaceholderPeriod) {
                playbackInfo.timeline.getPeriodByUid(mediaPeriodId.periodUid, period);
                if (playbackInfo.timeline.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.timeline.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(obj, period).windowIndex, period.getPositionInWindowUs() + jLongValue);
                    obj = periodPositionUs.first;
                    jLongValue = ((Long) periodPositionUs.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = jLongValue;
                }
                firstWindowIndex = -1;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                obj = obj;
                firstWindowIndex = -1;
                z15 = false;
                z16 = false;
                z17 = false;
            }
            z15 = false;
            z16 = false;
            z17 = false;
        }
        if (firstWindowIndex != -1) {
            timeline2 = timeline;
            Pair<Object, Long> periodPositionUs2 = timeline2.getPeriodPositionUs(window, period, firstWindowIndex, C.TIME_UNSET);
            period2 = period;
            obj = periodPositionUs2.first;
            jLongValue = ((Long) periodPositionUs2.second).longValue();
            j8 = j14;
        } else {
            timeline2 = timeline;
            period2 = period;
            j8 = jLongValue;
        }
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodQueue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(timeline2, obj, jLongValue);
        int i16 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.nextAdGroupIndex;
        boolean z27 = i16 == -1 || ((i15 = mediaPeriodId.nextAdGroupIndex) != -1 && i16 >= i15);
        if (mediaPeriodId.periodUid.equals(obj) && !mediaPeriodId.isAd() && !mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd() && z27) {
            z26 = true;
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        boolean zIsIgnorableServerSideAdInsertionPeriodChange = isIgnorableServerSideAdInsertionPeriodChange(zIsUsingPlaceholderPeriod, mediaPeriodId, jLongValue, mediaPeriodId2, timeline2.getPeriodByUid(obj, period2), j8);
        if (z26 || zIsIgnorableServerSideAdInsertionPeriodChange) {
            mediaPeriodId2 = mediaPeriodId;
        }
        if (mediaPeriodId2.isAd()) {
            if (mediaPeriodId2.equals(mediaPeriodId)) {
                jLongValue = playbackInfo.positionUs;
            } else {
                timeline2.getPeriodByUid(mediaPeriodId2.periodUid, period2);
                jLongValue = mediaPeriodId2.adIndexInAdGroup == period2.getFirstAdIndexToPlay(mediaPeriodId2.adGroupIndex) ? period2.getAdResumePositionUs() : 0L;
            }
        }
        return new PositionUpdateForPlaylistChange(mediaPeriodId2, jLongValue, j8, z15, z16, z17);
    }

    private static Pair<Object, Long> resolveSeekPositionUs(Timeline timeline, SeekPosition seekPosition, boolean z14, int i14, boolean z15, Timeline.Window window, Timeline.Period period) {
        Timeline timeline2;
        Object objResolveSubsequentPeriod;
        Timeline timeline3 = seekPosition.timeline;
        if (timeline.isEmpty()) {
            return null;
        }
        if (timeline3.isEmpty()) {
            timeline2 = timeline3;
            timeline2 = timeline;
        }
        try {
            timeline2 = timeline3;
            Pair<Object, Long> periodPositionUs = timeline2.getPeriodPositionUs(window, period, seekPosition.windowIndex, seekPosition.windowPositionUs);
            Timeline timeline4 = timeline2;
            if (timeline.equals(timeline4)) {
                return periodPositionUs;
            }
            if (timeline.getIndexOfPeriod(periodPositionUs.first) != -1) {
                return (timeline4.getPeriodByUid(periodPositionUs.first, period).isPlaceholder && timeline4.getWindow(period.windowIndex, window).firstPeriodIndex == timeline4.getIndexOfPeriod(periodPositionUs.first)) ? timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(periodPositionUs.first, period).windowIndex, seekPosition.windowPositionUs) : periodPositionUs;
            }
            if (z14 && (objResolveSubsequentPeriod = resolveSubsequentPeriod(window, period, i14, z15, periodPositionUs.first, timeline4, timeline)) != null) {
                return timeline.getPeriodPositionUs(window, period, timeline.getPeriodByUid(objResolveSubsequentPeriod, period).windowIndex, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public static Object resolveSubsequentPeriod(Timeline.Window window, Timeline.Period period, int i14, boolean z14, Object obj, Timeline timeline, Timeline timeline2) {
        int indexOfPeriod = timeline.getIndexOfPeriod(obj);
        int periodCount = timeline.getPeriodCount();
        int i15 = 0;
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        while (i15 < periodCount && indexOfPeriod2 == -1) {
            Timeline.Window window2 = window;
            Timeline.Period period2 = period;
            int i16 = i14;
            boolean z15 = z14;
            Timeline timeline3 = timeline;
            nextPeriodIndex = timeline3.getNextPeriodIndex(nextPeriodIndex, period2, window2, i16, z15);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = timeline2.getIndexOfPeriod(timeline3.getUidOfPeriod(nextPeriodIndex));
            i15++;
            timeline = timeline3;
            period = period2;
            window = window2;
            i14 = i16;
            z14 = z15;
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return timeline2.getUidOfPeriod(indexOfPeriod2);
    }

    private void scheduleNextWork(long j8, long j14) {
        this.handler.removeMessages(2);
        this.handler.sendEmptyMessageAtTime(2, j8 + j14);
    }

    private void seekToCurrentPosition(boolean z14) {
        MediaSource.MediaPeriodId mediaPeriodId = this.queue.getPlayingPeriod().info.f52877id;
        long jSeekToPeriodPosition = seekToPeriodPosition(mediaPeriodId, this.playbackInfo.positionUs, true, false);
        if (jSeekToPeriodPosition != this.playbackInfo.positionUs) {
            PlaybackInfo playbackInfo = this.playbackInfo;
            this.playbackInfo = handlePositionDiscontinuity(mediaPeriodId, jSeekToPeriodPosition, playbackInfo.requestedContentPositionUs, playbackInfo.discontinuityStartPositionUs, z14, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a1 A[Catch: all -> 0x00a4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a4, blocks: (B:24:0x00a1, B:31:0x00af, B:33:0x00b3, B:34:0x00b6, B:41:0x00ce, B:45:0x00d6), top: B:96:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[Catch: all -> 0x00a4, TRY_ENTER, TryCatch #2 {all -> 0x00a4, blocks: (B:24:0x00a1, B:31:0x00af, B:33:0x00b3, B:34:0x00b6, B:41:0x00ce, B:45:0x00d6), top: B:96:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:24:0x00a1, B:31:0x00af, B:33:0x00b3, B:34:0x00b6, B:41:0x00ce, B:45:0x00d6), top: B:96:0x009f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00be A[Catch: all -> 0x010a, TRY_ENTER, TryCatch #5 {all -> 0x010a, blocks: (B:22:0x0097, B:37:0x00be, B:39:0x00c6, B:48:0x00e0, B:50:0x00f0, B:56:0x00fd), top: B:101:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6 A[Catch: all -> 0x010a, TRY_LEAVE, TryCatch #5 {all -> 0x010a, blocks: (B:22:0x0097, B:37:0x00be, B:39:0x00c6, B:48:0x00e0, B:50:0x00f0, B:56:0x00fd), top: B:101:0x0097 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:72:0x0122  */
    private void seekToInternal(SeekPosition seekPosition) throws Throwable {
        long jLongValue;
        MediaSource.MediaPeriodId mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        long j8;
        boolean z14;
        long j14;
        long j15;
        PlaybackInfo playbackInfo;
        long adjustedSeekPositionUs;
        boolean z15;
        long jSeekToPeriodPosition;
        MediaSource.MediaPeriodId mediaPeriodId;
        long j16;
        MediaSource.MediaPeriodId mediaPeriodId2;
        long j17;
        MediaPeriodHolder playingPeriod;
        PlaybackInfo playbackInfo2;
        int i14;
        int i15;
        boolean z16;
        long j18;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.playbackInfoUpdate.incrementPendingOperationAcks(1);
        Pair<Object, Long> pairResolveSeekPositionUs = resolveSeekPositionUs(exoPlayerImplInternal.playbackInfo.timeline, seekPosition, true, exoPlayerImplInternal.repeatMode, exoPlayerImplInternal.shuffleModeEnabled, exoPlayerImplInternal.window, exoPlayerImplInternal.period);
        try {
            try {
                if (pairResolveSeekPositionUs != null) {
                    Object obj = pairResolveSeekPositionUs.first;
                    jLongValue = ((Long) pairResolveSeekPositionUs.second).longValue();
                    long j19 = seekPosition.windowPositionUs == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                    mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = exoPlayerImplInternal.queue.resolveMediaPeriodIdForAdsAfterPeriodPositionChange(exoPlayerImplInternal.playbackInfo.timeline, obj, jLongValue);
                    if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.isAd()) {
                        exoPlayerImplInternal.playbackInfo.timeline.getPeriodByUid(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.periodUid, exoPlayerImplInternal.period);
                        jLongValue = exoPlayerImplInternal.period.getFirstAdIndexToPlay(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adGroupIndex) == mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.adIndexInAdGroup ? exoPlayerImplInternal.period.getAdResumePositionUs() : 0L;
                        z14 = true;
                        j14 = j19;
                    } else {
                        j8 = 0;
                        z14 = seekPosition.windowPositionUs == C.TIME_UNSET;
                        j14 = j19;
                    }
                    if (exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                        playbackInfo = exoPlayerImplInternal.playbackInfo;
                        if (pairResolveSeekPositionUs == null) {
                            if (playbackInfo.playbackState != 1) {
                                exoPlayerImplInternal.setState(4);
                            }
                            exoPlayerImplInternal.resetInternal(false, true, false, true);
                        } else {
                            if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(playbackInfo.periodId)) {
                                playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                                if (playingPeriod == null && playingPeriod.prepared && jLongValue != j8) {
                                    adjustedSeekPositionUs = playingPeriod.mediaPeriod.getAdjustedSeekPositionUs(jLongValue, exoPlayerImplInternal.seekParameters);
                                } else {
                                    adjustedSeekPositionUs = jLongValue;
                                }
                                if (Util.usToMs(adjustedSeekPositionUs) != Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs) && ((i14 = (playbackInfo2 = exoPlayerImplInternal.playbackInfo).playbackState) == 2 || i14 == 3)) {
                                    j17 = playbackInfo2.positionUs;
                                    mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                    i15 = 2;
                                    z16 = z14;
                                    j18 = j17;
                                }
                            } else {
                                adjustedSeekPositionUs = jLongValue;
                            }
                            try {
                                if (exoPlayerImplInternal.playbackInfo.playbackState == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                jSeekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, adjustedSeekPositionUs, z15);
                                z14 |= jLongValue != jSeekToPeriodPosition;
                                try {
                                    PlaybackInfo playbackInfo3 = exoPlayerImplInternal.playbackInfo;
                                    mediaPeriodId = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                                    try {
                                        Timeline timeline = playbackInfo3.timeline;
                                        j16 = j14;
                                        try {
                                            exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline, mediaPeriodId, timeline, playbackInfo3.periodId, j16);
                                            mediaPeriodId2 = mediaPeriodId;
                                            j14 = j16;
                                            j17 = jSeekToPeriodPosition;
                                            z16 = z14;
                                            i15 = 2;
                                            j18 = j17;
                                            exoPlayerImplInternal = this;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodId;
                                            j14 = j16;
                                            z14 = z14;
                                            j15 = jSeekToPeriodPosition;
                                            exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, j15, j14, j15, z14, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodId;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                j15 = jLongValue;
                                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, j15, j14, j15, z14, 2);
                                throw th;
                            }
                        }
                        exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j17, j14, j18, z16, i15);
                        return;
                    }
                    exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
                    mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                    j17 = jLongValue;
                    z16 = z14;
                    i15 = 2;
                    j18 = j17;
                    exoPlayerImplInternal = this;
                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j17, j14, j18, z16, i15);
                    return;
                }
                Pair<MediaSource.MediaPeriodId, Long> placeholderFirstMediaPeriodPositionUs = exoPlayerImplInternal.getPlaceholderFirstMediaPeriodPositionUs(exoPlayerImplInternal.playbackInfo.timeline);
                mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = (MediaSource.MediaPeriodId) placeholderFirstMediaPeriodPositionUs.first;
                jLongValue = ((Long) placeholderFirstMediaPeriodPositionUs.second).longValue();
                z14 = !exoPlayerImplInternal.playbackInfo.timeline.isEmpty();
                j14 = -9223372036854775807L;
                if (exoPlayerImplInternal.playbackInfo.timeline.isEmpty()) {
                    playbackInfo = exoPlayerImplInternal.playbackInfo;
                    if (pairResolveSeekPositionUs == null) {
                        if (playbackInfo.playbackState != 1) {
                            exoPlayerImplInternal.setState(4);
                        }
                        exoPlayerImplInternal.resetInternal(false, true, false, true);
                    } else {
                        if (mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange.equals(playbackInfo.periodId)) {
                            playingPeriod = exoPlayerImplInternal.queue.getPlayingPeriod();
                            if (playingPeriod == null) {
                                adjustedSeekPositionUs = jLongValue;
                            } else {
                                adjustedSeekPositionUs = jLongValue;
                            }
                            if (Util.usToMs(adjustedSeekPositionUs) != Util.usToMs(exoPlayerImplInternal.playbackInfo.positionUs)) {
                            }
                        } else {
                            adjustedSeekPositionUs = jLongValue;
                        }
                        if (exoPlayerImplInternal.playbackInfo.playbackState == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        jSeekToPeriodPosition = exoPlayerImplInternal.seekToPeriodPosition(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, adjustedSeekPositionUs, z15);
                        z14 |= jLongValue != jSeekToPeriodPosition;
                        PlaybackInfo playbackInfo4 = exoPlayerImplInternal.playbackInfo;
                        mediaPeriodId = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                        Timeline timeline2 = playbackInfo4.timeline;
                        j16 = j14;
                        exoPlayerImplInternal.updatePlaybackSpeedSettingsForNewPeriod(timeline2, mediaPeriodId, timeline2, playbackInfo4.periodId, j16);
                        mediaPeriodId2 = mediaPeriodId;
                        j14 = j16;
                        j17 = jSeekToPeriodPosition;
                        z16 = z14;
                        i15 = 2;
                        j18 = j17;
                        exoPlayerImplInternal = this;
                    }
                    exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j17, j14, j18, z16, i15);
                    return;
                }
                exoPlayerImplInternal.pendingInitialSeekPosition = seekPosition;
                mediaPeriodId2 = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                j17 = jLongValue;
                z16 = z14;
                i15 = 2;
                j18 = j17;
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodId2, j17, j14, j18, z16, i15);
                return;
            } catch (Throwable th7) {
                th = th7;
                mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
                j15 = jLongValue;
                exoPlayerImplInternal.playbackInfo = exoPlayerImplInternal.handlePositionDiscontinuity(mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange, j15, j14, j15, z14, 2);
                throw th;
            }
        } catch (Throwable th8) {
            th = th8;
            mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange = mediaPeriodIdResolveMediaPeriodIdForAdsAfterPeriodPositionChange;
        }
        j8 = 0;
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j8, boolean z14, boolean z15) {
        MediaPeriodQueue mediaPeriodQueue;
        stopRenderers();
        this.isRebuffering = false;
        if (z15 || this.playbackInfo.playbackState == 3) {
            setState(2);
        }
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        MediaPeriodHolder next = playingPeriod;
        while (next != null && !mediaPeriodId.equals(next.info.f52877id)) {
            next = next.getNext();
        }
        if (z14 || playingPeriod != next || (next != null && next.toRendererTime(j8) < 0)) {
            for (Renderer renderer : this.renderers) {
                disableRenderer(renderer);
            }
            if (next != null) {
                while (true) {
                    MediaPeriodHolder playingPeriod2 = this.queue.getPlayingPeriod();
                    mediaPeriodQueue = this.queue;
                    if (playingPeriod2 == next) {
                        break;
                    }
                    mediaPeriodQueue.advancePlayingPeriod();
                }
                mediaPeriodQueue.removeAfter(next);
                next.setRendererOffset(MediaPeriodQueue.INITIAL_RENDERER_POSITION_OFFSET_US);
                enableRenderers();
            }
        }
        MediaPeriodQueue mediaPeriodQueue2 = this.queue;
        if (next != null) {
            mediaPeriodQueue2.removeAfter(next);
            if (!next.prepared) {
                next.info = next.info.copyWithStartPositionUs(j8);
            } else if (next.hasEnabledTracks) {
                j8 = next.mediaPeriod.seekToUs(j8);
                next.mediaPeriod.discardBuffer(j8 - this.backBufferDurationUs, this.retainBackBufferFromKeyframe);
            }
            resetRendererPosition(j8);
            maybeContinueLoading();
        } else {
            mediaPeriodQueue2.clear();
            resetRendererPosition(j8);
        }
        handleLoadingMediaPeriodChanged(false);
        this.handler.sendEmptyMessage(2);
        return j8;
    }

    private void sendMessageInternal(PlayerMessage playerMessage) {
        if (playerMessage.getPositionMs() == C.TIME_UNSET) {
            sendMessageToTarget(playerMessage);
            return;
        }
        if (this.playbackInfo.timeline.isEmpty()) {
            this.pendingMessages.add(new PendingMessageInfo(playerMessage));
            return;
        }
        PendingMessageInfo pendingMessageInfo = new PendingMessageInfo(playerMessage);
        Timeline timeline = this.playbackInfo.timeline;
        if (!resolvePendingMessagePosition(pendingMessageInfo, timeline, timeline, this.repeatMode, this.shuffleModeEnabled, this.window, this.period)) {
            playerMessage.markAsProcessed(false);
        } else {
            this.pendingMessages.add(pendingMessageInfo);
            Collections.sort(this.pendingMessages);
        }
    }

    private void sendMessageToTarget(PlayerMessage playerMessage) {
        if (playerMessage.getLooper() != this.playbackLooper) {
            this.handler.obtainMessage(15, playerMessage).sendToTarget();
            return;
        }
        deliverMessage(playerMessage);
        int i14 = this.playbackInfo.playbackState;
        if (i14 == 3 || i14 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void sendMessageToTargetThread(PlayerMessage playerMessage) {
        Looper looper = playerMessage.getLooper();
        if (looper.getThread().isAlive()) {
            this.clock.createHandler(looper, null).post(new w(1, this, playerMessage));
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            playerMessage.markAsProcessed(false);
        }
    }

    private void setAllRendererStreamsFinal(long j8) {
        for (Renderer renderer : this.renderers) {
            if (renderer.getStream() != null) {
                setCurrentStreamFinal(renderer, j8);
            }
        }
    }

    private void setCurrentStreamFinal(Renderer renderer, long j8) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(j8);
        }
    }

    private void setForegroundModeInternal(boolean z14, AtomicBoolean atomicBoolean) {
        if (this.foregroundMode != z14) {
            this.foregroundMode = z14;
            if (!z14) {
                for (Renderer renderer : this.renderers) {
                    if (!isRendererEnabled(renderer) && this.renderersToReset.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void setMediaItemsInternal(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.windowIndex != -1) {
            this.pendingInitialSeekPosition = new SeekPosition(new PlaylistTimeline(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), mediaSourceListUpdateMessage.windowIndex, mediaSourceListUpdateMessage.positionUs);
        }
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setMediaSources(mediaSourceListUpdateMessage.mediaSourceHolders, mediaSourceListUpdateMessage.shuffleOrder), false);
    }

    private void setOffloadSchedulingEnabledInternal(boolean z14) {
        if (z14 == this.offloadSchedulingEnabled) {
            return;
        }
        this.offloadSchedulingEnabled = z14;
        PlaybackInfo playbackInfo = this.playbackInfo;
        int i14 = playbackInfo.playbackState;
        if (z14 || i14 == 4 || i14 == 1) {
            this.playbackInfo = playbackInfo.copyWithOffloadSchedulingEnabled(z14);
        } else {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPauseAtEndOfWindowInternal(boolean z14) {
        this.pauseAtEndOfWindow = z14;
        resetPendingPauseAtEndOfPeriod();
        if (!this.pendingPauseAtEndOfPeriod || this.queue.getReadingPeriod() == this.queue.getPlayingPeriod()) {
            return;
        }
        seekToCurrentPosition(true);
        handleLoadingMediaPeriodChanged(false);
    }

    private void setPlayWhenReadyInternal(boolean z14, int i14, boolean z15, int i15) {
        this.playbackInfoUpdate.incrementPendingOperationAcks(z15 ? 1 : 0);
        this.playbackInfoUpdate.setPlayWhenReadyChangeReason(i15);
        this.playbackInfo = this.playbackInfo.copyWithPlayWhenReady(z14, i14);
        this.isRebuffering = false;
        notifyTrackSelectionPlayWhenReadyChanged(z14);
        if (!shouldPlayWhenReady()) {
            stopRenderers();
            updatePlaybackPositions();
            return;
        }
        int i16 = this.playbackInfo.playbackState;
        if (i16 == 3) {
            startRenderers();
            this.handler.sendEmptyMessage(2);
        } else if (i16 == 2) {
            this.handler.sendEmptyMessage(2);
        }
    }

    private void setPlaybackParametersInternal(PlaybackParameters playbackParameters) {
        this.mediaClock.setPlaybackParameters(playbackParameters);
        handlePlaybackParameters(this.mediaClock.getPlaybackParameters(), true);
    }

    private void setRepeatModeInternal(int i14) {
        this.repeatMode = i14;
        if (!this.queue.updateRepeatMode(this.playbackInfo.timeline, i14)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setSeekParametersInternal(SeekParameters seekParameters) {
        this.seekParameters = seekParameters;
    }

    private void setShuffleModeEnabledInternal(boolean z14) {
        this.shuffleModeEnabled = z14;
        if (!this.queue.updateShuffleModeEnabled(this.playbackInfo.timeline, z14)) {
            seekToCurrentPosition(true);
        }
        handleLoadingMediaPeriodChanged(false);
    }

    private void setShuffleOrderInternal(ShuffleOrder shuffleOrder) throws Throwable {
        this.playbackInfoUpdate.incrementPendingOperationAcks(1);
        handleMediaSourceListInfoRefreshed(this.mediaSourceList.setShuffleOrder(shuffleOrder), false);
    }

    private void setState(int i14) {
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (playbackInfo.playbackState != i14) {
            if (i14 != 2) {
                this.playbackMaybeBecameStuckAtMs = C.TIME_UNSET;
            }
            this.playbackInfo = playbackInfo.copyWithPlaybackState(i14);
        }
    }

    private boolean shouldAdvancePlayingPeriod() {
        MediaPeriodHolder playingPeriod;
        MediaPeriodHolder next;
        return shouldPlayWhenReady() && !this.pendingPauseAtEndOfPeriod && (playingPeriod = this.queue.getPlayingPeriod()) != null && (next = playingPeriod.getNext()) != null && this.rendererPositionUs >= next.getStartPositionRendererTime() && next.allRenderersInCorrectState;
    }

    private boolean shouldContinueLoading() {
        if (!isLoadingPossible()) {
            return false;
        }
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        long totalBufferedDurationUs = getTotalBufferedDurationUs(loadingPeriod.getNextLoadPositionUs());
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        long j8 = this.rendererPositionUs;
        return this.loadControl.shouldContinueLoading(loadingPeriod == playingPeriod ? loadingPeriod.toPeriodTime(j8) : loadingPeriod.toPeriodTime(j8) - loadingPeriod.info.startPositionUs, totalBufferedDurationUs, this.mediaClock.getPlaybackParameters().speed);
    }

    private boolean shouldPlayWhenReady() {
        PlaybackInfo playbackInfo = this.playbackInfo;
        return playbackInfo.playWhenReady && playbackInfo.playbackSuppressionReason == 0;
    }

    private boolean shouldTransitionToReadyState(boolean z14) {
        if (this.enabledRendererCount == 0) {
            return isTimelineReady();
        }
        if (!z14) {
            return false;
        }
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (!playbackInfo.isLoading) {
            return true;
        }
        long targetLiveOffsetUs = shouldUseLivePlaybackSpeedControl(playbackInfo.timeline, this.queue.getPlayingPeriod().info.f52877id) ? this.livePlaybackSpeedControl.getTargetLiveOffsetUs() : C.TIME_UNSET;
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        return (loadingPeriod.isFullyBuffered() && loadingPeriod.info.isFinal) || (loadingPeriod.info.f52877id.isAd() && !loadingPeriod.prepared) || this.loadControl.shouldStartPlayback(getTotalBufferedDurationUs(), this.mediaClock.getPlaybackParameters().speed, this.isRebuffering, targetLiveOffsetUs);
    }

    private boolean shouldUseLivePlaybackSpeedControl(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (!mediaPeriodId.isAd() && !timeline.isEmpty()) {
            timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
            if (this.window.isLive()) {
                Timeline.Window window = this.window;
                if (window.isDynamic && window.windowStartTimeMs != C.TIME_UNSET) {
                    return true;
                }
            }
        }
        return false;
    }

    private void startRenderers() {
        this.isRebuffering = false;
        this.mediaClock.start();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                renderer.start();
            }
        }
    }

    private void stopInternal(boolean z14, boolean z15) {
        resetInternal(z14 || !this.foregroundMode, false, true, false);
        this.playbackInfoUpdate.incrementPendingOperationAcks(z15 ? 1 : 0);
        this.loadControl.onStopped();
        setState(1);
    }

    private void stopRenderers() {
        this.mediaClock.stop();
        for (Renderer renderer : this.renderers) {
            if (isRendererEnabled(renderer)) {
                ensureStopped(renderer);
            }
        }
    }

    private void updateIsLoading() {
        MediaPeriodHolder loadingPeriod = this.queue.getLoadingPeriod();
        boolean z14 = this.shouldContinueLoading || (loadingPeriod != null && loadingPeriod.mediaPeriod.isLoading());
        PlaybackInfo playbackInfo = this.playbackInfo;
        if (z14 != playbackInfo.isLoading) {
            this.playbackInfo = playbackInfo.copyWithIsLoading(z14);
        }
    }

    private void updateLoadControlTrackSelection(TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        this.loadControl.onTracksSelected(this.renderers, trackGroupArray, trackSelectorResult.selections);
    }

    private void updatePeriods() {
        if (this.playbackInfo.timeline.isEmpty() || !this.mediaSourceList.isPrepared()) {
            return;
        }
        maybeUpdateLoadingPeriod();
        maybeUpdateReadingPeriod();
        maybeUpdateReadingRenderers();
        maybeUpdatePlayingPeriod();
    }

    private void updatePlaybackPositions() {
        MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod();
        if (playingPeriod == null) {
            return;
        }
        long discontinuity = playingPeriod.prepared ? playingPeriod.mediaPeriod.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            resetRendererPosition(discontinuity);
            if (discontinuity != this.playbackInfo.positionUs) {
                PlaybackInfo playbackInfo = this.playbackInfo;
                long j8 = discontinuity;
                this.playbackInfo = handlePositionDiscontinuity(playbackInfo.periodId, j8, playbackInfo.requestedContentPositionUs, j8, true, 5);
            }
        } else {
            long jSyncAndGetPositionUs = this.mediaClock.syncAndGetPositionUs(playingPeriod != this.queue.getReadingPeriod());
            this.rendererPositionUs = jSyncAndGetPositionUs;
            long periodTime = playingPeriod.toPeriodTime(jSyncAndGetPositionUs);
            maybeTriggerPendingMessages(this.playbackInfo.positionUs, periodTime);
            this.playbackInfo.positionUs = periodTime;
        }
        this.playbackInfo.bufferedPositionUs = this.queue.getLoadingPeriod().getBufferedPositionUs();
        this.playbackInfo.totalBufferedDurationUs = getTotalBufferedDurationUs();
        PlaybackInfo playbackInfo2 = this.playbackInfo;
        if (playbackInfo2.playWhenReady && playbackInfo2.playbackState == 3 && shouldUseLivePlaybackSpeedControl(playbackInfo2.timeline, playbackInfo2.periodId) && this.playbackInfo.playbackParameters.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.livePlaybackSpeedControl.getAdjustedPlaybackSpeed(getCurrentLiveOffsetUs(), getTotalBufferedDurationUs());
            if (this.mediaClock.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                this.mediaClock.setPlaybackParameters(this.playbackInfo.playbackParameters.withSpeed(adjustedPlaybackSpeed));
                handlePlaybackParameters(this.playbackInfo.playbackParameters, this.mediaClock.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void updatePlaybackSpeedSettingsForNewPeriod(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j8) {
        if (!shouldUseLivePlaybackSpeedControl(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.isAd() ? PlaybackParameters.DEFAULT : this.playbackInfo.playbackParameters;
            if (this.mediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            this.mediaClock.setPlaybackParameters(playbackParameters);
            return;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.period).windowIndex, this.window);
        this.livePlaybackSpeedControl.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.window.liveConfiguration));
        if (j8 != C.TIME_UNSET) {
            this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(getLiveOffsetUs(timeline, mediaPeriodId.periodUid, j8));
            return;
        }
        if (Util.areEqual(!timeline2.isEmpty() ? timeline2.getWindow(timeline2.getPeriodByUid(mediaPeriodId2.periodUid, this.period).windowIndex, this.window).uid : null, this.window.uid)) {
            return;
        }
        this.livePlaybackSpeedControl.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
    }

    private void updateTrackSelectionPlaybackSpeed(float f14) {
        for (MediaPeriodHolder playingPeriod = this.queue.getPlayingPeriod(); playingPeriod != null; playingPeriod = playingPeriod.getNext()) {
            for (ExoTrackSelection exoTrackSelection : playingPeriod.getTrackSelectorResult().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(f14);
                }
            }
        }
    }

    private synchronized void waitUninterruptibly(Supplier<Boolean> supplier, long j8) {
        long jElapsedRealtime = this.clock.elapsedRealtime() + j8;
        boolean z14 = false;
        while (!supplier.get().booleanValue() && j8 > 0) {
            try {
                this.clock.onThreadBlocked();
                wait(j8);
            } catch (InterruptedException unused) {
                z14 = true;
            }
            j8 = jElapsedRealtime - this.clock.elapsedRealtime();
        }
        if (z14) {
            Thread.currentThread().interrupt();
        }
    }

    public void addMediaSources(int i14, List<MediaSourceList.MediaSourceHolder> list, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(18, i14, 0, new MediaSourceListUpdateMessage(list, shuffleOrder, -1, C.TIME_UNSET)).sendToTarget();
    }

    public void experimentalSetForegroundModeTimeoutMs(long j8) {
        this.setForegroundModeTimeoutMs = j8;
    }

    public void experimentalSetOffloadSchedulingEnabled(boolean z14) {
        this.handler.obtainMessage(24, z14 ? 1 : 0, 0).sendToTarget();
    }

    public Looper getPlaybackLooper() {
        return this.playbackLooper;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) throws Throwable {
        int i14;
        MediaPeriodHolder readingPeriod;
        int i15 = 1000;
        try {
            switch (message.what) {
                case 0:
                    prepareInternal();
                    break;
                case 1:
                    setPlayWhenReadyInternal(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    doSomeWork();
                    break;
                case 3:
                    seekToInternal((SeekPosition) message.obj);
                    break;
                case 4:
                    setPlaybackParametersInternal((PlaybackParameters) message.obj);
                    break;
                case 5:
                    setSeekParametersInternal((SeekParameters) message.obj);
                    break;
                case 6:
                    stopInternal(false, true);
                    break;
                case 7:
                    releaseInternal();
                    return true;
                case 8:
                    handlePeriodPrepared((MediaPeriod) message.obj);
                    break;
                case 9:
                    handleContinueLoadingRequested((MediaPeriod) message.obj);
                    break;
                case 10:
                    reselectTracksInternal();
                    break;
                case 11:
                    setRepeatModeInternal(message.arg1);
                    break;
                case 12:
                    setShuffleModeEnabledInternal(message.arg1 != 0);
                    break;
                case 13:
                    setForegroundModeInternal(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    sendMessageInternal((PlayerMessage) message.obj);
                    break;
                case 15:
                    sendMessageToTargetThread((PlayerMessage) message.obj);
                    break;
                case 16:
                    handlePlaybackParameters((PlaybackParameters) message.obj, false);
                    break;
                case 17:
                    setMediaItemsInternal((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    addMediaItemsInternal((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    moveMediaItemsInternal((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    removeMediaItemsInternal(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    setShuffleOrderInternal((ShuffleOrder) message.obj);
                    break;
                case 22:
                    mediaSourceListUpdateRequestedInternal();
                    break;
                case 23:
                    setPauseAtEndOfWindowInternal(message.arg1 != 0);
                    break;
                case 24:
                    setOffloadSchedulingEnabledInternal(message.arg1 == 1);
                    break;
                case 25:
                    attemptRendererErrorRecovery();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e4) {
            e = e4;
            if (e.type == 1 && (readingPeriod = this.queue.getReadingPeriod()) != null) {
                e = e.copyWithMediaPeriodId(readingPeriod.info.f52877id);
            }
            if (e.isRecoverable && this.pendingRecoverableRendererError == null) {
                Log.w(TAG, "Recoverable renderer error", e);
                this.pendingRecoverableRendererError = e;
                HandlerWrapper handlerWrapper = this.handler;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.pendingRecoverableRendererError;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.pendingRecoverableRendererError;
                }
                Log.e(TAG, "Playback error", e);
                stopInternal(true, false);
                this.playbackInfo = this.playbackInfo.copyWithPlaybackError(e);
            }
        } catch (ParserException e14) {
            int i16 = e14.dataType;
            if (i16 == 1) {
                i14 = e14.contentIsMalformed ? 3001 : 3003;
            } else {
                if (i16 == 4) {
                    i14 = e14.contentIsMalformed ? 3002 : 3004;
                }
                handleIoException(e14, i15);
            }
            i15 = i14;
            handleIoException(e14, i15);
        } catch (DrmSession.DrmSessionException e15) {
            handleIoException(e15, e15.errorCode);
        } catch (BehindLiveWindowException e16) {
            handleIoException(e16, 1002);
        } catch (DataSourceException e17) {
            handleIoException(e17, e17.reason);
        } catch (IOException e18) {
            handleIoException(e18, 2000);
        } catch (RuntimeException e19) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e19, ((e19 instanceof IllegalStateException) || (e19 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.e(TAG, "Playback error", exoPlaybackExceptionCreateForUnexpected);
            stopInternal(true, false);
            this.playbackInfo = this.playbackInfo.copyWithPlaybackError(exoPlaybackExceptionCreateForUnexpected);
        }
        maybeNotifyPlaybackInfoChanged();
        return true;
    }

    public void moveMediaSources(int i14, int i15, int i16, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(19, new MoveMediaItemsMessage(i14, i15, i16, shuffleOrder)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(9, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(16, playbackParameters).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.handler.sendEmptyMessage(22);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod mediaPeriod) {
        this.handler.obtainMessage(8, mediaPeriod).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.handler.sendEmptyMessage(10);
    }

    public void prepare() {
        this.handler.obtainMessage(0).sendToTarget();
    }

    public synchronized boolean release() {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.sendEmptyMessage(7);
            waitUninterruptibly(new z(this, 0), this.releaseTimeoutMs);
            return this.released;
        }
        return true;
    }

    public void removeMediaSources(int i14, int i15, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(20, i14, i15, shuffleOrder).sendToTarget();
    }

    public void seekTo(Timeline timeline, int i14, long j8) {
        this.handler.obtainMessage(3, new SeekPosition(timeline, i14, j8)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage playerMessage) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            this.handler.obtainMessage(14, playerMessage).sendToTarget();
            return;
        }
        Log.w(TAG, "Ignoring messages sent after release.");
        playerMessage.markAsProcessed(false);
    }

    public synchronized boolean setForegroundMode(boolean z14) {
        if (!this.released && this.internalPlaybackThread.isAlive()) {
            if (z14) {
                this.handler.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.handler.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            waitUninterruptibly(new z(atomicBoolean, 1), this.setForegroundModeTimeoutMs);
            return atomicBoolean.get();
        }
        return true;
    }

    public void setMediaSources(List<MediaSourceList.MediaSourceHolder> list, int i14, long j8, ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(17, new MediaSourceListUpdateMessage(list, shuffleOrder, i14, j8)).sendToTarget();
    }

    public void setPauseAtEndOfWindow(boolean z14) {
        this.handler.obtainMessage(23, z14 ? 1 : 0, 0).sendToTarget();
    }

    public void setPlayWhenReady(boolean z14, int i14) {
        this.handler.obtainMessage(1, z14 ? 1 : 0, i14).sendToTarget();
    }

    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.handler.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void setRepeatMode(int i14) {
        this.handler.obtainMessage(11, i14, 0).sendToTarget();
    }

    public void setSeekParameters(SeekParameters seekParameters) {
        this.handler.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void setShuffleModeEnabled(boolean z14) {
        this.handler.obtainMessage(12, z14 ? 1 : 0, 0).sendToTarget();
    }

    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        this.handler.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void stop() {
        this.handler.obtainMessage(6).sendToTarget();
    }

    private long getTotalBufferedDurationUs() {
        return getTotalBufferedDurationUs(this.playbackInfo.bufferedPositionUs);
    }

    private void handlePlaybackParameters(PlaybackParameters playbackParameters, boolean z14) {
        handlePlaybackParameters(playbackParameters, playbackParameters.speed, true, z14);
    }

    private void enableRenderers() {
        enableRenderers(new boolean[this.renderers.length]);
    }

    private long seekToPeriodPosition(MediaSource.MediaPeriodId mediaPeriodId, long j8, boolean z14) {
        return seekToPeriodPosition(mediaPeriodId, j8, this.queue.getPlayingPeriod() != this.queue.getReadingPeriod(), z14);
    }
}
