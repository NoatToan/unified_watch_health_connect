package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.h;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n0;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.c;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public class AnalyticsCollector implements Player.Listener, AudioRendererEventListener, VideoRendererEventListener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    private final Clock a;
    private final Timeline.Period b;
    private final Timeline.Window c;
    private final a d;
    private final SparseArray<AnalyticsListener.EventTime> e;
    private ListenerSet<AnalyticsListener> f;
    private Player g;
    private HandlerWrapper h;
    private boolean i;

    public static final class a {
        private final Timeline.Period a;
        private ImmutableList<MediaSource.MediaPeriodId> b = ImmutableList.of();
        private ImmutableMap<MediaSource.MediaPeriodId, Timeline> c = ImmutableMap.of();

        @Nullable
        private MediaSource.MediaPeriodId d;
        private MediaSource.MediaPeriodId e;
        private MediaSource.MediaPeriodId f;

        public a(Timeline.Period period) {
            this.a = period;
        }

        private void b(ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> mediaPeriodTimelinesBuilder, @Nullable MediaSource.MediaPeriodId mediaPeriodId, Timeline preferredTimeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (preferredTimeline.getIndexOfPeriod(mediaPeriodId.periodUid) != -1) {
                mediaPeriodTimelinesBuilder.put(mediaPeriodId, preferredTimeline);
                return;
            }
            Timeline timeline = this.c.get(mediaPeriodId);
            if (timeline != null) {
                mediaPeriodTimelinesBuilder.put(mediaPeriodId, timeline);
            }
        }

        @Nullable
        private static MediaSource.MediaPeriodId c(Player player, ImmutableList<MediaSource.MediaPeriodId> mediaPeriodQueue, @Nullable MediaSource.MediaPeriodId playingMediaPeriod, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object uidOfPeriod = currentTimeline.isEmpty() ? null : currentTimeline.getUidOfPeriod(currentPeriodIndex);
            int adGroupIndexAfterPositionUs = (player.isPlayingAd() || currentTimeline.isEmpty()) ? -1 : currentTimeline.getPeriod(currentPeriodIndex, period).getAdGroupIndexAfterPositionUs(C.msToUs(player.getCurrentPosition()) - period.getPositionInWindowUs());
            for (int i = 0; i < mediaPeriodQueue.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodQueue.get(i);
                if (i(mediaPeriodId, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return mediaPeriodId;
                }
            }
            if (mediaPeriodQueue.isEmpty() && playingMediaPeriod != null) {
                if (i(playingMediaPeriod, uidOfPeriod, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), adGroupIndexAfterPositionUs)) {
                    return playingMediaPeriod;
                }
            }
            return null;
        }

        private static boolean i(MediaSource.MediaPeriodId mediaPeriodId, @Nullable Object playerPeriodUid, boolean isPlayingAd, int playerAdGroupIndex, int playerAdIndexInAdGroup, int playerNextAdGroupIndex) {
            if (mediaPeriodId.periodUid.equals(playerPeriodUid)) {
                return (isPlayingAd && mediaPeriodId.adGroupIndex == playerAdGroupIndex && mediaPeriodId.adIndexInAdGroup == playerAdIndexInAdGroup) || (!isPlayingAd && mediaPeriodId.adGroupIndex == -1 && mediaPeriodId.nextAdGroupIndex == playerNextAdGroupIndex);
            }
            return false;
        }

        private void m(Timeline preferredTimeline) {
            ImmutableMap.Builder<MediaSource.MediaPeriodId, Timeline> builder = ImmutableMap.builder();
            if (this.b.isEmpty()) {
                b(builder, this.e, preferredTimeline);
                if (!Objects.equal(this.f, this.e)) {
                    b(builder, this.f, preferredTimeline);
                }
                if (!Objects.equal(this.d, this.e) && !Objects.equal(this.d, this.f)) {
                    b(builder, this.d, preferredTimeline);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    b(builder, this.b.get(i), preferredTimeline);
                }
                if (!this.b.contains(this.d)) {
                    b(builder, this.d, preferredTimeline);
                }
            }
            this.c = builder.build();
        }

        @Nullable
        public MediaSource.MediaPeriodId d() {
            return this.d;
        }

        @Nullable
        public MediaSource.MediaPeriodId e() {
            if (this.b.isEmpty()) {
                return null;
            }
            return (MediaSource.MediaPeriodId) Iterables.getLast(this.b);
        }

        @Nullable
        public Timeline f(MediaSource.MediaPeriodId mediaPeriodId) {
            return this.c.get(mediaPeriodId);
        }

        @Nullable
        public MediaSource.MediaPeriodId g() {
            return this.e;
        }

        @Nullable
        public MediaSource.MediaPeriodId h() {
            return this.f;
        }

        public void j(Player player) {
            this.d = c(player, this.b, this.e, this.a);
        }

        public void k(List<MediaSource.MediaPeriodId> queue, @Nullable MediaSource.MediaPeriodId readingPeriod, Player player) {
            this.b = ImmutableList.copyOf((Collection) queue);
            if (!queue.isEmpty()) {
                this.e = queue.get(0);
                this.f = (MediaSource.MediaPeriodId) Assertions.checkNotNull(readingPeriod);
            }
            if (this.d == null) {
                this.d = c(player, this.b, this.e, this.a);
            }
            m(player.getCurrentTimeline());
        }

        public void l(Player player) {
            this.d = c(player, this.b, this.e, this.a);
            m(player.getCurrentTimeline());
        }
    }

    public AnalyticsCollector(Clock clock) {
        this.a = (Clock) Assertions.checkNotNull(clock);
        this.f = new ListenerSet<>(Util.getCurrentOrMainLooper(), clock, new ListenerSet.IterationFinishedEvent() { // from class: xf
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                AnalyticsCollector.s0((AnalyticsListener) obj, flagSet);
            }
        });
        Timeline.Period period = new Timeline.Period();
        this.b = period;
        this.c = new Timeline.Window();
        this.d = new a(period);
        this.e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A0(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioInputFormatChanged(eventTime, format);
        analyticsListener.onAudioInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 1, format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void A1(AnalyticsListener.EventTime eventTime, VideoSize videoSize, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoSizeChanged(eventTime, videoSize);
        analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D1() {
        this.f.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E1(Player player, AnalyticsListener analyticsListener, FlagSet flagSet) {
        analyticsListener.onEvents(player, new AnalyticsListener.Events(flagSet, this.e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L0(AnalyticsListener.EventTime eventTime, int i, AnalyticsListener analyticsListener) {
        analyticsListener.onDrmSessionAcquired(eventTime);
        analyticsListener.onDrmSessionAcquired(eventTime, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P0(AnalyticsListener.EventTime eventTime, boolean z, AnalyticsListener analyticsListener) {
        analyticsListener.onLoadingChanged(eventTime, z);
        analyticsListener.onIsLoadingChanged(eventTime, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g1(AnalyticsListener.EventTime eventTime, int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, AnalyticsListener analyticsListener) {
        analyticsListener.onPositionDiscontinuity(eventTime, i);
        analyticsListener.onPositionDiscontinuity(eventTime, positionInfo, positionInfo2, i);
    }

    private AnalyticsListener.EventTime n0(@Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.g);
        Timeline timelineF = mediaPeriodId == null ? null : this.d.f(mediaPeriodId);
        if (mediaPeriodId != null && timelineF != null) {
            return generateEventTime(timelineF, timelineF.getPeriodByUid(mediaPeriodId.periodUid, this.b).windowIndex, mediaPeriodId);
        }
        int currentWindowIndex = this.g.getCurrentWindowIndex();
        Timeline currentTimeline = this.g.getCurrentTimeline();
        if (!(currentWindowIndex < currentTimeline.getWindowCount())) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, currentWindowIndex, null);
    }

    private AnalyticsListener.EventTime o0() {
        return n0(this.d.e());
    }

    private AnalyticsListener.EventTime p0(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Assertions.checkNotNull(this.g);
        if (mediaPeriodId != null) {
            return this.d.f(mediaPeriodId) != null ? n0(mediaPeriodId) : generateEventTime(Timeline.EMPTY, windowIndex, mediaPeriodId);
        }
        Timeline currentTimeline = this.g.getCurrentTimeline();
        if (!(windowIndex < currentTimeline.getWindowCount())) {
            currentTimeline = Timeline.EMPTY;
        }
        return generateEventTime(currentTimeline, windowIndex, null);
    }

    private AnalyticsListener.EventTime q0() {
        return n0(this.d.g());
    }

    private AnalyticsListener.EventTime r0() {
        return n0(this.d.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s0(AnalyticsListener analyticsListener, FlagSet flagSet) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u1(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j);
        analyticsListener.onVideoDecoderInitialized(eventTime, str, j2, j);
        analyticsListener.onDecoderInitialized(eventTime, 2, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w0(AnalyticsListener.EventTime eventTime, String str, long j, long j2, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j);
        analyticsListener.onAudioDecoderInitialized(eventTime, str, j2, j);
        analyticsListener.onDecoderInitialized(eventTime, 1, str, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w1(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 2, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x1(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 2, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioDisabled(eventTime, decoderCounters);
        analyticsListener.onDecoderDisabled(eventTime, 1, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z0(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters, AnalyticsListener analyticsListener) {
        analyticsListener.onAudioEnabled(eventTime, decoderCounters);
        analyticsListener.onDecoderEnabled(eventTime, 1, decoderCounters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z1(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation, AnalyticsListener analyticsListener) {
        analyticsListener.onVideoInputFormatChanged(eventTime, format);
        analyticsListener.onVideoInputFormatChanged(eventTime, format, decoderReuseEvaluation);
        analyticsListener.onDecoderInputFormatChanged(eventTime, 2, format);
    }

    @CallSuper
    public void addListener(AnalyticsListener listener) {
        Assertions.checkNotNull(listener);
        this.f.add(listener);
    }

    public final AnalyticsListener.EventTime generateCurrentPlayerMediaPeriodEventTime() {
        return n0(this.d.d());
    }

    @RequiresNonNull({"player"})
    public final AnalyticsListener.EventTime generateEventTime(Timeline timeline, int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        long contentPosition;
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.isEmpty() ? null : mediaPeriodId;
        long jElapsedRealtime = this.a.elapsedRealtime();
        boolean z = timeline.equals(this.g.getCurrentTimeline()) && windowIndex == this.g.getCurrentWindowIndex();
        long defaultPositionMs = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.isAd()) {
            if (z) {
                contentPosition = this.g.getContentPosition();
            } else if (!timeline.isEmpty()) {
                defaultPositionMs = timeline.getWindow(windowIndex, this.c).getDefaultPositionMs();
            }
            return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, windowIndex, mediaPeriodId2, contentPosition, this.g.getCurrentTimeline(), this.g.getCurrentWindowIndex(), this.d.d(), this.g.getCurrentPosition(), this.g.getTotalBufferedDuration());
        }
        if (z && this.g.getCurrentAdGroupIndex() == mediaPeriodId2.adGroupIndex && this.g.getCurrentAdIndexInAdGroup() == mediaPeriodId2.adIndexInAdGroup) {
            defaultPositionMs = this.g.getCurrentPosition();
        }
        contentPosition = defaultPositionMs;
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, windowIndex, mediaPeriodId2, contentPosition, this.g.getCurrentTimeline(), this.g.getCurrentWindowIndex(), this.d.d(), this.g.getCurrentPosition(), this.g.getTotalBufferedDuration());
    }

    public final void notifySeekStarted() {
        if (this.i) {
            return;
        }
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.i = true;
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: be
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekStarted(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onAudioAttributesChanged(final AudioAttributes audioAttributes) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1016, new ListenerSet.Event() { // from class: pe
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioAttributesChanged(eventTimeR0, audioAttributes);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioCodecError(final Exception audioCodecError) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1037, new ListenerSet.Event() { // from class: hf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioCodecError(eventTimeR0, audioCodecError);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderInitialized(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1009, new ListenerSet.Event() { // from class: nf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.w0(eventTimeR0, decoderName, initializationDurationMs, initializedTimestampMs, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDecoderReleased(final String decoderName) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1013, new ListenerSet.Event() { // from class: kf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioDecoderReleased(eventTimeR0, decoderName);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioDisabled(final DecoderCounters counters) {
        final AnalyticsListener.EventTime eventTimeQ0 = q0();
        sendEvent(eventTimeQ0, 1014, new ListenerSet.Event() { // from class: se
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.y0(eventTimeQ0, counters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioEnabled(final DecoderCounters counters) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1008, new ListenerSet.Event() { // from class: re
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.z0(eventTimeR0, counters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public /* synthetic */ void onAudioInputFormatChanged(Format format) {
        com.google.android.exoplayer2.audio.b.f(this, format);
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1010, new ListenerSet.Event() { // from class: ge
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.A0(eventTimeR0, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioPositionAdvancing(final long playoutStartSystemTimeMs) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1011, new ListenerSet.Event() { // from class: ee
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioPositionAdvancing(eventTimeR0, playoutStartSystemTimeMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onAudioSessionIdChanged(final int audioSessionId) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1015, new ListenerSet.Event() { // from class: rd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSessionIdChanged(eventTimeR0, audioSessionId);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioSinkError(final Exception audioSinkError) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1018, new ListenerSet.Event() { // from class: ff
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioSinkError(eventTimeR0, audioSinkError);
            }
        });
    }

    @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
    public final void onAudioUnderrun(final int bufferSize, final long bufferSizeMs, final long elapsedSinceLastFeedMs) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1012, new ListenerSet.Event() { // from class: zd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAudioUnderrun(eventTimeR0, bufferSize, bufferSizeMs, elapsedSinceLastFeedMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onAvailableCommandsChanged(final Player.Commands availableCommands) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 14, new ListenerSet.Event() { // from class: oe
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onAvailableCommandsChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, availableCommands);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(final int elapsedMs, final long bytesTransferred, final long bitrateEstimate) {
        final AnalyticsListener.EventTime eventTimeO0 = o0();
        sendEvent(eventTimeO0, 1006, new ListenerSet.Event() { // from class: yd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onBandwidthEstimate(eventTimeO0, elapsedMs, bytesTransferred, bitrateEstimate);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.text.TextOutput
    public /* synthetic */ void onCues(List list) {
        n0.d(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        n0.e(this, deviceInfo);
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.device.DeviceListener
    public /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
        n0.f(this, i, z);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onDownstreamFormatChanged(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1004, new ListenerSet.Event() { // from class: bf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDownstreamFormatChanged(eventTimeP0, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysLoaded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1031, new ListenerSet.Event() { // from class: me
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysLoaded(eventTimeP0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRemoved(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1034, new ListenerSet.Event() { // from class: if
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRemoved(eventTimeP0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmKeysRestored(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1033, new ListenerSet.Event() { // from class: qd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmKeysRestored(eventTimeP0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public /* synthetic */ void onDrmSessionAcquired(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        h.d(this, i, mediaPeriodId);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionAcquired(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final int state) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1030, new ListenerSet.Event() { // from class: sd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.L0(eventTimeP0, state, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionManagerError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final Exception error) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1032, new ListenerSet.Event() { // from class: gf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionManagerError(eventTimeP0, error);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void onDrmSessionReleased(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1035, new ListenerSet.Event() { // from class: xe
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDrmSessionReleased(eventTimeP0);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(final int count, final long elapsedMs) {
        final AnalyticsListener.EventTime eventTimeQ0 = q0();
        sendEvent(eventTimeQ0, 1023, new ListenerSet.Event() { // from class: xd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onDroppedVideoFrames(eventTimeQ0, count, elapsedMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        n0.g(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onIsLoadingChanged(final boolean isLoading) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 4, new ListenerSet.Event() { // from class: pf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.P0(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, isLoading, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onIsPlayingChanged(final boolean isPlaying) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 8, new ListenerSet.Event() { // from class: sf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onIsPlayingChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, isPlaying);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCanceled(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1002, new ListenerSet.Event() { // from class: ye
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCanceled(eventTimeP0, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadCompleted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1001, new ListenerSet.Event() { // from class: ve
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadCompleted(eventTimeP0, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadError(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final IOException error, final boolean wasCanceled) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1003, new ListenerSet.Event() { // from class: ze
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadError(eventTimeP0, loadEventInfo, mediaLoadData, error, wasCanceled);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onLoadStarted(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1000, new ListenerSet.Event() { // from class: we
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onLoadStarted(eventTimeP0, loadEventInfo, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onLoadingChanged(boolean z) {
        m0.e(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public void onMaxSeekToPreviousPositionChanged(final int maxSeekToPreviousPositionMs) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 19, new ListenerSet.Event() { // from class: cg
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMaxSeekToPreviousPositionChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, maxSeekToPreviousPositionMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onMediaItemTransition(@Nullable final MediaItem mediaItem, final int reason) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1, new ListenerSet.Event() { // from class: ie
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaItemTransition(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaItem, reason);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onMediaMetadataChanged(final MediaMetadata mediaMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 15, new ListenerSet.Event() { // from class: je
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMediaMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, mediaMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.metadata.MetadataOutput
    public final void onMetadata(final Metadata metadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1007, new ListenerSet.Event() { // from class: ue
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onMetadata(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlayWhenReadyChanged(final boolean playWhenReady, final int reason) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 6, new ListenerSet.Event() { // from class: vf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayWhenReadyChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playWhenReady, reason);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackParametersChanged(final PlaybackParameters playbackParameters) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 13, new ListenerSet.Event() { // from class: ne
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackParametersChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackParameters);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackStateChanged(final int playbackState) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 5, new ListenerSet.Event() { // from class: td
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackState);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlaybackSuppressionReasonChanged(final int playbackSuppressionReason) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 7, new ListenerSet.Event() { // from class: bg
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaybackSuppressionReasonChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playbackSuppressionReason);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerError(final PlaybackException error) {
        MediaPeriodId mediaPeriodId;
        final AnalyticsListener.EventTime eventTimeN0 = (!(error instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) error).mediaPeriodId) == null) ? null : n0(new MediaSource.MediaPeriodId(mediaPeriodId));
        if (eventTimeN0 == null) {
            eventTimeN0 = generateCurrentPlayerMediaPeriodEventTime();
        }
        sendEvent(eventTimeN0, 11, new ListenerSet.Event() { // from class: le
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerError(eventTimeN0, error);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        n0.r(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onPlayerStateChanged(final boolean playWhenReady, final int playbackState) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: uf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerStateChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playWhenReady, playbackState);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onPlaylistMetadataChanged(final MediaMetadata playlistMetadata) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 16, new ListenerSet.Event() { // from class: ke
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlaylistMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, playlistMetadata);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public /* synthetic */ void onPositionDiscontinuity(int i) {
        m0.q(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onPositionDiscontinuity(final Player.PositionInfo oldPosition, final Player.PositionInfo newPosition, final int reason) {
        if (reason == 1) {
            this.i = false;
        }
        this.d.j((Player) Assertions.checkNotNull(this.g));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 12, new ListenerSet.Event() { // from class: ae
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.g1(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, reason, oldPosition, newPosition, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
    public /* synthetic */ void onRenderedFirstFrame() {
        n0.u(this);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(final Object output, final long renderTimeMs) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1027, new ListenerSet.Event() { // from class: jf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRenderedFirstFrame(eventTimeR0, output, renderTimeMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onRepeatModeChanged(final int repeatMode) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 9, new ListenerSet.Event() { // from class: vd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onRepeatModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, repeatMode);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onSeekBackIncrementChanged(final long seekBackIncrementMs) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 17, new ListenerSet.Event() { // from class: de
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekBackIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, seekBackIncrementMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public void onSeekForwardIncrementChanged(final long seekForwardIncrementMs) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 18, new ListenerSet.Event() { // from class: ce
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekForwardIncrementChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, seekForwardIncrementMs);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    public final void onSeekProcessed() {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, -1, new ListenerSet.Event() { // from class: zf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSeekProcessed(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onShuffleModeEnabledChanged(final boolean shuffleModeEnabled) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 10, new ListenerSet.Event() { // from class: qf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onShuffleModeChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, shuffleModeEnabled);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onSkipSilenceEnabledChanged(final boolean skipSilenceEnabled) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1017, new ListenerSet.Event() { // from class: rf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSkipSilenceEnabledChanged(eventTimeR0, skipSilenceEnabled);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.EventListener
    @Deprecated
    public final void onStaticMetadataChanged(final List<Metadata> metadataList) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 3, new ListenerSet.Event() { // from class: of
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onStaticMetadataChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, metadataList);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
    public void onSurfaceSizeChanged(final int width, final int height) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1029, new ListenerSet.Event() { // from class: wd
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onSurfaceSizeChanged(eventTimeR0, width, height);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onTimelineChanged(Timeline timeline, final int reason) {
        this.d.l((Player) Assertions.checkNotNull(this.g));
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 0, new ListenerSet.Event() { // from class: ud
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTimelineChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, reason);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.Player.EventListener
    public final void onTracksChanged(final TrackGroupArray trackGroups, final TrackSelectionArray trackSelections) {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 2, new ListenerSet.Event() { // from class: cf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onTracksChanged(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, trackGroups, trackSelections);
            }
        });
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void onUpstreamDiscarded(int windowIndex, @Nullable MediaSource.MediaPeriodId mediaPeriodId, final MediaLoadData mediaLoadData) {
        final AnalyticsListener.EventTime eventTimeP0 = p0(windowIndex, mediaPeriodId);
        sendEvent(eventTimeP0, 1005, new ListenerSet.Event() { // from class: af
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onUpstreamDiscarded(eventTimeP0, mediaLoadData);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoCodecError(final Exception videoCodecError) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1038, new ListenerSet.Event() { // from class: ef
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoCodecError(eventTimeR0, videoCodecError);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(final String decoderName, final long initializedTimestampMs, final long initializationDurationMs) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1021, new ListenerSet.Event() { // from class: mf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.u1(eventTimeR0, decoderName, initializationDurationMs, initializedTimestampMs, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderReleased(final String decoderName) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1024, new ListenerSet.Event() { // from class: lf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoDecoderReleased(eventTimeR0, decoderName);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(final DecoderCounters counters) {
        final AnalyticsListener.EventTime eventTimeQ0 = q0();
        sendEvent(eventTimeQ0, 1025, new ListenerSet.Event() { // from class: te
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.w1(eventTimeQ0, counters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(final DecoderCounters counters) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1020, new ListenerSet.Event() { // from class: qe
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.x1(eventTimeR0, counters, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoFrameProcessingOffset(final long totalProcessingOffsetUs, final int frameCount) {
        final AnalyticsListener.EventTime eventTimeQ0 = q0();
        sendEvent(eventTimeQ0, 1026, new ListenerSet.Event() { // from class: fe
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVideoFrameProcessingOffset(eventTimeQ0, totalProcessingOffsetUs, frameCount);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public /* synthetic */ void onVideoInputFormatChanged(Format format) {
        c.i(this, format);
    }

    @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(final Format format, @Nullable final DecoderReuseEvaluation decoderReuseEvaluation) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1022, new ListenerSet.Event() { // from class: he
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.z1(eventTimeR0, format, decoderReuseEvaluation, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.video.VideoListener
    public /* synthetic */ void onVideoSizeChanged(int i, int i2, int i3, float f) {
        com.google.android.exoplayer2.video.b.c(this, i, i2, i3, f);
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.video.VideoListener
    public final void onVideoSizeChanged(final VideoSize videoSize) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1028, new ListenerSet.Event() { // from class: df
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                AnalyticsCollector.A1(eventTimeR0, videoSize, (AnalyticsListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.audio.AudioListener
    public final void onVolumeChanged(final float volume) {
        final AnalyticsListener.EventTime eventTimeR0 = r0();
        sendEvent(eventTimeR0, 1019, new ListenerSet.Event() { // from class: ag
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onVolumeChanged(eventTimeR0, volume);
            }
        });
    }

    @CallSuper
    public void release() {
        final AnalyticsListener.EventTime eventTimeGenerateCurrentPlayerMediaPeriodEventTime = generateCurrentPlayerMediaPeriodEventTime();
        this.e.put(1036, eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
        sendEvent(eventTimeGenerateCurrentPlayerMediaPeriodEventTime, 1036, new ListenerSet.Event() { // from class: tf
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).onPlayerReleased(eventTimeGenerateCurrentPlayerMediaPeriodEventTime);
            }
        });
        ((HandlerWrapper) Assertions.checkStateNotNull(this.h)).post(new Runnable() { // from class: yf
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D1();
            }
        });
    }

    @CallSuper
    public void removeListener(AnalyticsListener listener) {
        this.f.remove(listener);
    }

    public final void sendEvent(AnalyticsListener.EventTime eventTime, int eventFlag, ListenerSet.Event<AnalyticsListener> eventInvocation) {
        this.e.put(eventFlag, eventTime);
        this.f.sendEvent(eventFlag, eventInvocation);
    }

    @CallSuper
    public void setPlayer(final Player player, Looper looper) {
        Assertions.checkState(this.g == null || this.d.b.isEmpty());
        this.g = (Player) Assertions.checkNotNull(player);
        this.h = this.a.createHandler(looper, null);
        this.f = this.f.copy(looper, new ListenerSet.IterationFinishedEvent() { // from class: wf
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                this.a.E1(player, (AnalyticsListener) obj, flagSet);
            }
        });
    }

    public final void updateMediaPeriodQueueInfo(List<MediaSource.MediaPeriodId> queue, @Nullable MediaSource.MediaPeriodId readingPeriod) {
        this.d.k(queue, readingPeriod, (Player) Assertions.checkNotNull(this.g));
    }
}
