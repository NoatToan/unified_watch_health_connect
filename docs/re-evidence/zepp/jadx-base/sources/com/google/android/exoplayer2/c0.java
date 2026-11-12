package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.device.DeviceInfo;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.MediaSourceFactory;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
final class c0 extends BasePlayer implements ExoPlayer {
    private static final String K = "ExoPlayerImpl";
    private SeekParameters A;
    private ShuffleOrder B;
    private boolean C;
    private Player.Commands D;
    private MediaMetadata E;
    private MediaMetadata F;
    private l0 G;
    private int H;
    private int I;
    private long J;
    public final TrackSelectorResult a;
    public final Player.Commands b;
    private final Renderer[] c;
    private final TrackSelector d;
    private final HandlerWrapper e;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener f;
    private final ExoPlayerImplInternal g;
    private final ListenerSet<Player.EventListener> h;
    private final CopyOnWriteArraySet<ExoPlayer.AudioOffloadListener> i;
    private final Timeline.Period j;
    private final List<a> k;
    private final boolean l;
    private final MediaSourceFactory m;

    @Nullable
    private final AnalyticsCollector n;
    private final Looper o;
    private final BandwidthMeter p;
    private final long q;
    private final long r;
    private final Clock s;
    private int t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private int y;
    private boolean z;

    public static final class a implements j0 {
        private final Object a;
        private Timeline b;

        public a(Object uid, Timeline timeline) {
            this.a = uid;
            this.b = timeline;
        }

        @Override // com.google.android.exoplayer2.j0
        public Timeline a() {
            return this.b;
        }

        @Override // com.google.android.exoplayer2.j0
        public Object getUid() {
            return this.a;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public c0(Renderer[] renderers, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter, @Nullable AnalyticsCollector analyticsCollector, boolean useLazyPreparation, SeekParameters seekParameters, long seekBackIncrementMs, long seekForwardIncrementMs, LivePlaybackSpeedControl livePlaybackSpeedControl, long releaseTimeoutMs, boolean pauseAtEndOfMediaItems, Clock clock, Looper applicationLooper, @Nullable Player wrappingPlayer, Player.Commands additionalPermanentAvailableCommands) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = Util.DEVICE_DEBUG_INFO;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [");
        sb.append(ExoPlayerLibraryInfo.VERSION_SLASHY);
        sb.append("] [");
        sb.append(str);
        sb.append("]");
        Log.i(K, sb.toString());
        Assertions.checkState(renderers.length > 0);
        this.c = (Renderer[]) Assertions.checkNotNull(renderers);
        this.d = (TrackSelector) Assertions.checkNotNull(trackSelector);
        this.m = mediaSourceFactory;
        this.p = bandwidthMeter;
        this.n = analyticsCollector;
        this.l = useLazyPreparation;
        this.A = seekParameters;
        this.q = seekBackIncrementMs;
        this.r = seekForwardIncrementMs;
        this.C = pauseAtEndOfMediaItems;
        this.o = applicationLooper;
        this.s = clock;
        this.t = 0;
        final Player player = wrappingPlayer != null ? wrappingPlayer : this;
        this.h = new ListenerSet<>(applicationLooper, clock, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.s
            @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                c0.P(player, (Player.EventListener) obj, flagSet);
            }
        });
        this.i = new CopyOnWriteArraySet<>();
        this.k = new ArrayList();
        this.B = new ShuffleOrder.DefaultShuffleOrder(0);
        TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[renderers.length], new ExoTrackSelection[renderers.length], null);
        this.a = trackSelectorResult;
        this.j = new Timeline.Period();
        Player.Commands commandsBuild = new Player.Commands.Builder().addAll(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).addAll(additionalPermanentAvailableCommands).build();
        this.b = commandsBuild;
        this.D = new Player.Commands.Builder().addAll(commandsBuild).add(3).add(9).build();
        MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
        this.E = mediaMetadata;
        this.F = mediaMetadata;
        this.H = -1;
        this.e = clock.createHandler(applicationLooper, null);
        ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener = new ExoPlayerImplInternal.PlaybackInfoUpdateListener() { // from class: com.google.android.exoplayer2.d
            @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
            public final void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
                this.a.R(playbackInfoUpdate);
            }
        };
        this.f = playbackInfoUpdateListener;
        this.G = l0.k(trackSelectorResult);
        if (analyticsCollector != null) {
            analyticsCollector.setPlayer(player, applicationLooper);
            addListener((Player.Listener) analyticsCollector);
            bandwidthMeter.addEventListener(new Handler(applicationLooper), analyticsCollector);
        }
        this.g = new ExoPlayerImplInternal(renderers, trackSelector, trackSelectorResult, loadControl, bandwidthMeter, this.t, this.u, analyticsCollector, seekParameters, livePlaybackSpeedControl, releaseTimeoutMs, pauseAtEndOfMediaItems, applicationLooper, clock, playbackInfoUpdateListener);
    }

    private List<MediaSourceList.c> A(int index, List<MediaSource> mediaSources) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mediaSources.size(); i++) {
            MediaSourceList.c cVar = new MediaSourceList.c(mediaSources.get(i), this.l);
            arrayList.add(cVar);
            this.k.add(i + index, new a(cVar.b, cVar.a.getTimeline()));
        }
        this.B = this.B.cloneAndInsert(index, arrayList.size());
        return arrayList;
    }

    private Timeline B() {
        return new o0(this.k, this.B);
    }

    private List<MediaSource> C(List<MediaItem> mediaItems) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mediaItems.size(); i++) {
            arrayList.add(this.m.createMediaSource(mediaItems.get(i)));
        }
        return arrayList;
    }

    private Pair<Boolean, Integer> D(l0 playbackInfo, l0 oldPlaybackInfo, boolean positionDiscontinuity, int positionDiscontinuityReason, boolean timelineChanged) {
        Timeline timeline = oldPlaybackInfo.a;
        Timeline timeline2 = playbackInfo.a;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(oldPlaybackInfo.b.periodUid, this.j).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(playbackInfo.b.periodUid, this.j).windowIndex, this.window).uid)) {
            return (positionDiscontinuity && positionDiscontinuityReason == 0 && oldPlaybackInfo.b.windowSequenceNumber < playbackInfo.b.windowSequenceNumber) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (positionDiscontinuity && positionDiscontinuityReason == 0) {
            i = 1;
        } else if (positionDiscontinuity && positionDiscontinuityReason == 1) {
            i = 2;
        } else if (!timelineChanged) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i));
    }

    private long G(l0 playbackInfo) {
        if (playbackInfo.a.isEmpty()) {
            return C.msToUs(this.J);
        }
        return playbackInfo.b.isAd() ? playbackInfo.s : p0(playbackInfo.a, playbackInfo.b, playbackInfo.s);
    }

    private int H() {
        if (this.G.a.isEmpty()) {
            return this.H;
        }
        l0 l0Var = this.G;
        return l0Var.a.getPeriodByUid(l0Var.b.periodUid, this.j).windowIndex;
    }

    @Nullable
    private Pair<Object, Long> I(Timeline oldTimeline, Timeline newTimeline) {
        long contentPosition = getContentPosition();
        if (oldTimeline.isEmpty() || newTimeline.isEmpty()) {
            boolean z = !oldTimeline.isEmpty() && newTimeline.isEmpty();
            int iH = z ? -1 : H();
            if (z) {
                contentPosition = -9223372036854775807L;
            }
            return J(newTimeline, iH, contentPosition);
        }
        Pair<Object, Long> periodPosition = oldTimeline.getPeriodPosition(this.window, this.j, getCurrentWindowIndex(), C.msToUs(contentPosition));
        Object obj = ((Pair) Util.castNonNull(periodPosition)).first;
        if (newTimeline.getIndexOfPeriod(obj) != -1) {
            return periodPosition;
        }
        Object objU0 = ExoPlayerImplInternal.u0(this.window, this.j, this.t, this.u, obj, oldTimeline, newTimeline);
        if (objU0 == null) {
            return J(newTimeline, -1, C.TIME_UNSET);
        }
        newTimeline.getPeriodByUid(objU0, this.j);
        int i = this.j.windowIndex;
        return J(newTimeline, i, newTimeline.getWindow(i, this.window).getDefaultPositionMs());
    }

    @Nullable
    private Pair<Object, Long> J(Timeline timeline, int windowIndex, long windowPositionMs) {
        if (timeline.isEmpty()) {
            this.H = windowIndex;
            if (windowPositionMs == C.TIME_UNSET) {
                windowPositionMs = 0;
            }
            this.J = windowPositionMs;
            this.I = 0;
            return null;
        }
        if (windowIndex == -1 || windowIndex >= timeline.getWindowCount()) {
            windowIndex = timeline.getFirstWindowIndex(this.u);
            windowPositionMs = timeline.getWindow(windowIndex, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPosition(this.window, this.j, windowIndex, C.msToUs(windowPositionMs));
    }

    private Player.PositionInfo K(long discontinuityWindowStartPositionUs) {
        Object obj;
        int indexOfPeriod;
        int currentWindowIndex = getCurrentWindowIndex();
        Object obj2 = null;
        if (this.G.a.isEmpty()) {
            obj = null;
            indexOfPeriod = -1;
        } else {
            l0 l0Var = this.G;
            Object obj3 = l0Var.b.periodUid;
            l0Var.a.getPeriodByUid(obj3, this.j);
            indexOfPeriod = this.G.a.getIndexOfPeriod(obj3);
            obj = obj3;
            obj2 = this.G.a.getWindow(currentWindowIndex, this.window).uid;
        }
        long jUsToMs = C.usToMs(discontinuityWindowStartPositionUs);
        long jUsToMs2 = this.G.b.isAd() ? C.usToMs(M(this.G)) : jUsToMs;
        MediaSource.MediaPeriodId mediaPeriodId = this.G.b;
        return new Player.PositionInfo(obj2, currentWindowIndex, obj, indexOfPeriod, jUsToMs, jUsToMs2, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    private Player.PositionInfo L(int positionDiscontinuityReason, l0 oldPlaybackInfo, int oldMaskingWindowIndex) {
        int i;
        Object obj;
        Object obj2;
        int indexOfPeriod;
        long jM;
        long jM2;
        Timeline.Period period = new Timeline.Period();
        if (oldPlaybackInfo.a.isEmpty()) {
            i = oldMaskingWindowIndex;
            obj = null;
            obj2 = null;
            indexOfPeriod = -1;
        } else {
            Object obj3 = oldPlaybackInfo.b.periodUid;
            oldPlaybackInfo.a.getPeriodByUid(obj3, period);
            int i2 = period.windowIndex;
            i = i2;
            obj2 = obj3;
            indexOfPeriod = oldPlaybackInfo.a.getIndexOfPeriod(obj3);
            obj = oldPlaybackInfo.a.getWindow(i2, this.window).uid;
        }
        if (positionDiscontinuityReason == 0) {
            jM = period.positionInWindowUs + period.durationUs;
            if (oldPlaybackInfo.b.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId = oldPlaybackInfo.b;
                jM = period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                jM2 = M(oldPlaybackInfo);
            } else {
                if (oldPlaybackInfo.b.nextAdGroupIndex != -1 && this.G.b.isAd()) {
                    jM = M(this.G);
                }
                jM2 = jM;
            }
        } else if (oldPlaybackInfo.b.isAd()) {
            jM = oldPlaybackInfo.s;
            jM2 = M(oldPlaybackInfo);
        } else {
            jM = period.positionInWindowUs + oldPlaybackInfo.s;
            jM2 = jM;
        }
        long jUsToMs = C.usToMs(jM);
        long jUsToMs2 = C.usToMs(jM2);
        MediaSource.MediaPeriodId mediaPeriodId2 = oldPlaybackInfo.b;
        return new Player.PositionInfo(obj, i, obj2, indexOfPeriod, jUsToMs, jUsToMs2, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private static long M(l0 playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.a.getPeriodByUid(playbackInfo.b.periodUid, period);
        return playbackInfo.c == C.TIME_UNSET ? playbackInfo.a.getWindow(period.windowIndex, window).getDefaultPositionUs() : period.getPositionInWindowUs() + playbackInfo.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public void Q(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        long j;
        boolean z;
        long jP0;
        int i = this.v - playbackInfoUpdate.operationAcks;
        this.v = i;
        boolean z2 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.w = playbackInfoUpdate.discontinuityReason;
            this.x = true;
        }
        if (playbackInfoUpdate.hasPlayWhenReadyChangeReason) {
            this.y = playbackInfoUpdate.playWhenReadyChangeReason;
        }
        if (i == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.a;
            if (!this.G.a.isEmpty() && timeline.isEmpty()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!timeline.isEmpty()) {
                List<Timeline> listH = ((o0) timeline).h();
                Assertions.checkState(listH.size() == this.k.size());
                for (int i2 = 0; i2 < listH.size(); i2++) {
                    this.k.get(i2).b = listH.get(i2);
                }
            }
            if (this.x) {
                if (playbackInfoUpdate.playbackInfo.b.equals(this.G.b) && playbackInfoUpdate.playbackInfo.d == this.G.s) {
                    z2 = false;
                }
                if (z2) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.b.isAd()) {
                        jP0 = playbackInfoUpdate.playbackInfo.d;
                    } else {
                        l0 l0Var = playbackInfoUpdate.playbackInfo;
                        jP0 = p0(timeline, l0Var.b, l0Var.d);
                    }
                    j = jP0;
                } else {
                    j = -9223372036854775807L;
                }
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            this.x = false;
            w0(playbackInfoUpdate.playbackInfo, 1, this.y, false, z, this.w, j, -1);
        }
    }

    private static boolean O(l0 playbackInfo) {
        return playbackInfo.e == 3 && playbackInfo.l && playbackInfo.m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void P(Player player, Player.EventListener eventListener, FlagSet flagSet) {
        eventListener.onEvents(player, new Player.Events(flagSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(final ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        this.e.post(new Runnable() { // from class: com.google.android.exoplayer2.t
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q(playbackInfoUpdate);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(Player.EventListener eventListener) {
        eventListener.onMediaMetadataChanged(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T(Player.EventListener eventListener) {
        eventListener.onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(Player.EventListener eventListener) {
        eventListener.onPlaylistMetadataChanged(this.F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(Player.EventListener eventListener) {
        eventListener.onAvailableCommandsChanged(this.D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void Z(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onPlayerErrorChanged(l0Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onPlayerError(l0Var.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b0(l0 l0Var, TrackSelectionArray trackSelectionArray, Player.EventListener eventListener) {
        eventListener.onTracksChanged(l0Var.h, trackSelectionArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onStaticMetadataChanged(l0Var.j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onLoadingChanged(l0Var.g);
        eventListener.onIsLoadingChanged(l0Var.g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onPlayerStateChanged(l0Var.l, l0Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onPlaybackStateChanged(l0Var.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h0(l0 l0Var, int i, Player.EventListener eventListener) {
        eventListener.onPlayWhenReadyChanged(l0Var.l, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onPlaybackSuppressionReasonChanged(l0Var.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onIsPlayingChanged(O(l0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k0(l0 l0Var, Player.EventListener eventListener) {
        eventListener.onPlaybackParametersChanged(l0Var.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(l0 l0Var, int i, Player.EventListener eventListener) {
        eventListener.onTimelineChanged(l0Var.a, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.EventListener eventListener) {
        eventListener.onPositionDiscontinuity(i);
        eventListener.onPositionDiscontinuity(positionInfo, positionInfo2, i);
    }

    private l0 n0(l0 playbackInfo, Timeline timeline, @Nullable Pair<Object, Long> periodPosition) {
        Assertions.checkArgument(timeline.isEmpty() || periodPosition != null);
        Timeline timeline2 = playbackInfo.a;
        l0 l0VarJ = playbackInfo.j(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId mediaPeriodIdL = l0.l();
            long jMsToUs = C.msToUs(this.J);
            l0 l0VarB = l0VarJ.c(mediaPeriodIdL, jMsToUs, jMsToUs, jMsToUs, 0L, TrackGroupArray.EMPTY, this.a, ImmutableList.of()).b(mediaPeriodIdL);
            l0VarB.q = l0VarB.s;
            return l0VarB;
        }
        Object obj = l0VarJ.b.periodUid;
        boolean z = !obj.equals(((Pair) Util.castNonNull(periodPosition)).first);
        MediaSource.MediaPeriodId mediaPeriodId = z ? new MediaSource.MediaPeriodId(periodPosition.first) : l0VarJ.b;
        long jLongValue = ((Long) periodPosition.second).longValue();
        long jMsToUs2 = C.msToUs(getContentPosition());
        if (!timeline2.isEmpty()) {
            jMsToUs2 -= timeline2.getPeriodByUid(obj, this.j).getPositionInWindowUs();
        }
        if (z || jLongValue < jMsToUs2) {
            Assertions.checkState(!mediaPeriodId.isAd());
            l0 l0VarB2 = l0VarJ.c(mediaPeriodId, jLongValue, jLongValue, jLongValue, 0L, z ? TrackGroupArray.EMPTY : l0VarJ.h, z ? this.a : l0VarJ.i, z ? ImmutableList.of() : l0VarJ.j).b(mediaPeriodId);
            l0VarB2.q = jLongValue;
            return l0VarB2;
        }
        if (jLongValue == jMsToUs2) {
            int indexOfPeriod = timeline.getIndexOfPeriod(l0VarJ.k.periodUid);
            if (indexOfPeriod == -1 || timeline.getPeriod(indexOfPeriod, this.j).windowIndex != timeline.getPeriodByUid(mediaPeriodId.periodUid, this.j).windowIndex) {
                timeline.getPeriodByUid(mediaPeriodId.periodUid, this.j);
                long adDurationUs = mediaPeriodId.isAd() ? this.j.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : this.j.durationUs;
                l0VarJ = l0VarJ.c(mediaPeriodId, l0VarJ.s, l0VarJ.s, l0VarJ.d, adDurationUs - l0VarJ.s, l0VarJ.h, l0VarJ.i, l0VarJ.j).b(mediaPeriodId);
                l0VarJ.q = adDurationUs;
            }
        } else {
            Assertions.checkState(!mediaPeriodId.isAd());
            long jMax = Math.max(0L, l0VarJ.r - (jLongValue - jMsToUs2));
            long j = l0VarJ.q;
            if (l0VarJ.k.equals(l0VarJ.b)) {
                j = jLongValue + jMax;
            }
            l0VarJ = l0VarJ.c(mediaPeriodId, jLongValue, jLongValue, jLongValue, jMax, l0VarJ.h, l0VarJ.i, l0VarJ.j);
            l0VarJ.q = j;
        }
        return l0VarJ;
    }

    private long p0(Timeline timeline, MediaSource.MediaPeriodId periodId, long positionUs) {
        timeline.getPeriodByUid(periodId.periodUid, this.j);
        return positionUs + this.j.getPositionInWindowUs();
    }

    private l0 q0(int fromIndex, int toIndex) {
        boolean z = false;
        Assertions.checkArgument(fromIndex >= 0 && toIndex >= fromIndex && toIndex <= this.k.size());
        int currentWindowIndex = getCurrentWindowIndex();
        Timeline currentTimeline = getCurrentTimeline();
        int size = this.k.size();
        this.v++;
        r0(fromIndex, toIndex);
        Timeline timelineB = B();
        l0 l0VarN0 = n0(this.G, timelineB, I(currentTimeline, timelineB));
        int i = l0VarN0.e;
        if (i != 1 && i != 4 && fromIndex < toIndex && toIndex == size && currentWindowIndex >= l0VarN0.a.getWindowCount()) {
            z = true;
        }
        if (z) {
            l0VarN0 = l0VarN0.h(4);
        }
        this.g.j0(fromIndex, toIndex, this.B);
        return l0VarN0;
    }

    private void r0(int fromIndex, int toIndexExclusive) {
        for (int i = toIndexExclusive - 1; i >= fromIndex; i--) {
            this.k.remove(i);
        }
        this.B = this.B.cloneAndRemove(fromIndex, toIndexExclusive);
    }

    private void s0(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs, boolean resetToDefaultPosition) {
        int i;
        long j;
        int iH = H();
        long currentPosition = getCurrentPosition();
        this.v++;
        if (!this.k.isEmpty()) {
            r0(0, this.k.size());
        }
        List<MediaSourceList.c> listA = A(0, mediaSources);
        Timeline timelineB = B();
        if (!timelineB.isEmpty() && startWindowIndex >= timelineB.getWindowCount()) {
            throw new IllegalSeekPositionException(timelineB, startWindowIndex, startPositionMs);
        }
        if (resetToDefaultPosition) {
            int firstWindowIndex = timelineB.getFirstWindowIndex(this.u);
            j = C.TIME_UNSET;
            i = firstWindowIndex;
        } else if (startWindowIndex == -1) {
            i = iH;
            j = currentPosition;
        } else {
            i = startWindowIndex;
            j = startPositionMs;
        }
        l0 l0VarN0 = n0(this.G, timelineB, J(timelineB, i, j));
        int i2 = l0VarN0.e;
        if (i != -1 && i2 != 1) {
            i2 = (timelineB.isEmpty() || i >= timelineB.getWindowCount()) ? 4 : 2;
        }
        l0 l0VarH = l0VarN0.h(i2);
        this.g.J0(listA, i, C.msToUs(j), this.B);
        w0(l0VarH, 0, 1, false, (this.G.b.periodUid.equals(l0VarH.b.periodUid) || this.G.a.isEmpty()) ? false : true, 4, G(l0VarH), -1);
    }

    private void v0() {
        Player.Commands commands = this.D;
        Player.Commands availableCommands = getAvailableCommands(this.b);
        this.D = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.h.queueEvent(14, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.x
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.a.X((Player.EventListener) obj);
            }
        });
    }

    private void w0(final l0 playbackInfo, final int timelineChangeReason, final int playWhenReadyChangeReason, boolean seekProcessed, boolean positionDiscontinuity, final int positionDiscontinuityReason, long discontinuityWindowStartPositionUs, int oldMaskingWindowIndex) {
        l0 l0Var = this.G;
        this.G = playbackInfo;
        Pair<Boolean, Integer> pairD = D(playbackInfo, l0Var, positionDiscontinuity, positionDiscontinuityReason, !l0Var.a.equals(playbackInfo.a));
        boolean zBooleanValue = ((Boolean) pairD.first).booleanValue();
        final int iIntValue = ((Integer) pairD.second).intValue();
        MediaMetadata mediaMetadataBuild = this.E;
        final MediaItem mediaItem = null;
        if (zBooleanValue) {
            if (!playbackInfo.a.isEmpty()) {
                mediaItem = playbackInfo.a.getWindow(playbackInfo.a.getPeriodByUid(playbackInfo.b.periodUid, this.j).windowIndex, this.window).mediaItem;
            }
            mediaMetadataBuild = mediaItem != null ? mediaItem.mediaMetadata : MediaMetadata.EMPTY;
        }
        if (!l0Var.j.equals(playbackInfo.j)) {
            mediaMetadataBuild = mediaMetadataBuild.buildUpon().populateFromMetadata(playbackInfo.j).build();
        }
        boolean z = !mediaMetadataBuild.equals(this.E);
        this.E = mediaMetadataBuild;
        if (!l0Var.a.equals(playbackInfo.a)) {
            this.h.queueEvent(0, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.m
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.l0(playbackInfo, timelineChangeReason, (Player.EventListener) obj);
                }
            });
        }
        if (positionDiscontinuity) {
            final Player.PositionInfo positionInfoL = L(positionDiscontinuityReason, l0Var, oldMaskingWindowIndex);
            final Player.PositionInfo positionInfoK = K(discontinuityWindowStartPositionUs);
            this.h.queueEvent(12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.u
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.m0(positionDiscontinuityReason, positionInfoL, positionInfoK, (Player.EventListener) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.h.queueEvent(1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.y
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onMediaItemTransition(mediaItem, iIntValue);
                }
            });
        }
        if (l0Var.f != playbackInfo.f) {
            this.h.queueEvent(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.Z(playbackInfo, (Player.EventListener) obj);
                }
            });
            if (playbackInfo.f != null) {
                this.h.queueEvent(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.a0
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        c0.a0(playbackInfo, (Player.EventListener) obj);
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = l0Var.i;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.i;
        if (trackSelectorResult != trackSelectorResult2) {
            this.d.onSelectionActivated(trackSelectorResult2.info);
            final TrackSelectionArray trackSelectionArray = new TrackSelectionArray(playbackInfo.i.selections);
            this.h.queueEvent(2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.n
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.b0(playbackInfo, trackSelectionArray, (Player.EventListener) obj);
                }
            });
        }
        if (!l0Var.j.equals(playbackInfo.j)) {
            this.h.queueEvent(3, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.f
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.c0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (z) {
            final MediaMetadata mediaMetadata = this.E;
            this.h.queueEvent(15, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.z
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onMediaMetadataChanged(mediaMetadata);
                }
            });
        }
        if (l0Var.g != playbackInfo.g) {
            this.h.queueEvent(4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.i
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.e0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (l0Var.e != playbackInfo.e || l0Var.l != playbackInfo.l) {
            this.h.queueEvent(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.b0
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.f0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (l0Var.e != playbackInfo.e) {
            this.h.queueEvent(5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.g0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (l0Var.l != playbackInfo.l) {
            this.h.queueEvent(6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.l
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.h0(playbackInfo, playWhenReadyChangeReason, (Player.EventListener) obj);
                }
            });
        }
        if (l0Var.m != playbackInfo.m) {
            this.h.queueEvent(7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.j
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.i0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (O(l0Var) != O(playbackInfo)) {
            this.h.queueEvent(8, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.g
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.j0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (!l0Var.n.equals(playbackInfo.n)) {
            this.h.queueEvent(13, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.h
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.k0(playbackInfo, (Player.EventListener) obj);
                }
            });
        }
        if (seekProcessed) {
            this.h.queueEvent(-1, new ListenerSet.Event() { // from class: xw1
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onSeekProcessed();
                }
            });
        }
        v0();
        this.h.flushEvents();
        if (l0Var.o != playbackInfo.o) {
            Iterator<ExoPlayer.AudioOffloadListener> it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next().onExperimentalOffloadSchedulingEnabledChanged(playbackInfo.o);
            }
        }
        if (l0Var.p != playbackInfo.p) {
            Iterator<ExoPlayer.AudioOffloadListener> it3 = this.i.iterator();
            while (it3.hasNext()) {
                it3.next().onExperimentalSleepingForOffloadChanged(playbackInfo.p);
            }
        }
    }

    public void E(long timeoutMs) {
        this.g.o(timeoutMs);
    }

    @Override // com.google.android.exoplayer2.Player
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public ImmutableList<Cue> getCurrentCues() {
        return ImmutableList.of();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
        this.i.add(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.Listener listener) {
        addListener((Player.EventListener) listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int index, List<MediaItem> mediaItems) {
        addMediaSources(Math.min(index, this.k.size()), C(mediaItems));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        addMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List<MediaSource> mediaSources) {
        addMediaSources(this.k.size(), mediaSources);
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface() {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface(@Nullable Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoTextureView(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        return new PlayerMessage(this.g, target, this.G.a, getCurrentWindowIndex(), this.s, this.g.w());
    }

    @Override // com.google.android.exoplayer2.Player
    public void decreaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
        return this.G.p;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean offloadSchedulingEnabled) {
        this.g.p(offloadSchedulingEnabled);
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.Player
    public AudioAttributes getAudioAttributes() {
        return AudioAttributes.DEFAULT;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.AudioComponent getAudioComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
        return this.D;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        if (!isPlayingAd()) {
            return getContentBufferedPosition();
        }
        l0 l0Var = this.G;
        return l0Var.k.equals(l0Var.b) ? C.usToMs(this.G.q) : getDuration();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Clock getClock() {
        return this.s;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
        if (this.G.a.isEmpty()) {
            return this.J;
        }
        l0 l0Var = this.G;
        if (l0Var.k.windowSequenceNumber != l0Var.b.windowSequenceNumber) {
            return l0Var.a.getWindow(getCurrentWindowIndex(), this.window).getDurationMs();
        }
        long j = l0Var.q;
        if (this.G.k.isAd()) {
            l0 l0Var2 = this.G;
            Timeline.Period periodByUid = l0Var2.a.getPeriodByUid(l0Var2.k.periodUid, this.j);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.G.k.adGroupIndex);
            j = adGroupTimeUs == Long.MIN_VALUE ? periodByUid.durationUs : adGroupTimeUs;
        }
        l0 l0Var3 = this.G;
        return C.usToMs(p0(l0Var3.a, l0Var3.k, j));
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        l0 l0Var = this.G;
        l0Var.a.getPeriodByUid(l0Var.b.periodUid, this.j);
        l0 l0Var2 = this.G;
        return l0Var2.c == C.TIME_UNSET ? l0Var2.a.getWindow(getCurrentWindowIndex(), this.window).getDefaultPositionMs() : this.j.getPositionInWindowMs() + C.usToMs(this.G.c);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        if (isPlayingAd()) {
            return this.G.b.adGroupIndex;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        if (isPlayingAd()) {
            return this.G.b.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        if (this.G.a.isEmpty()) {
            return this.I;
        }
        l0 l0Var = this.G;
        return l0Var.a.getIndexOfPeriod(l0Var.b.periodUid);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        return C.usToMs(G(this.G));
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public List<Metadata> getCurrentStaticMetadata() {
        return this.G.j;
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        return this.G.a;
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackGroupArray getCurrentTrackGroups() {
        return this.G.h;
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionArray getCurrentTrackSelections() {
        return new TrackSelectionArray(this.G.i.selections);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentWindowIndex() {
        int iH = H();
        if (iH == -1) {
            return 0;
        }
        return iH;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.DeviceComponent getDeviceComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public DeviceInfo getDeviceInfo() {
        return DeviceInfo.UNKNOWN;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getDeviceVolume() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        if (!isPlayingAd()) {
            return getContentDuration();
        }
        l0 l0Var = this.G;
        MediaSource.MediaPeriodId mediaPeriodId = l0Var.b;
        l0Var.a.getPeriodByUid(mediaPeriodId.periodUid, this.j);
        return C.usToMs(this.j.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
    }

    @Override // com.google.android.exoplayer2.Player
    public int getMaxSeekToPreviousPosition() {
        return 3000;
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getMediaMetadata() {
        return this.E;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.MetadataComponent getMetadataComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.G.l;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.g.w();
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.G.n;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        return this.G.e;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        return this.G.m;
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
        return this.F;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
        return this.c.length;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int index) {
        return this.c[index].getTrackType();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        return this.t;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
        return this.q;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
        return this.r;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public SeekParameters getSeekParameters() {
        return this.A;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        return this.u;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.TextComponent getTextComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        return C.usToMs(this.G.r);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public TrackSelector getTrackSelector() {
        return this.d;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Nullable
    public ExoPlayer.VideoComponent getVideoComponent() {
        return null;
    }

    @Override // com.google.android.exoplayer2.Player
    public VideoSize getVideoSize() {
        return VideoSize.UNKNOWN;
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
        return 1.0f;
    }

    @Override // com.google.android.exoplayer2.Player
    public void increaseDeviceVolume() {
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isDeviceMuted() {
        return false;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        return this.G.g;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        return this.G.b.isAd();
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int fromIndex, int toIndex, int newFromIndex) {
        Assertions.checkArgument(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= this.k.size() && newFromIndex >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.v++;
        int iMin = Math.min(newFromIndex, this.k.size() - (toIndex - fromIndex));
        Util.moveItems(this.k, fromIndex, toIndex, iMin);
        Timeline timelineB = B();
        l0 l0VarN0 = n0(this.G, timelineB, I(currentTimeline, timelineB));
        this.g.Z(fromIndex, toIndex, iMin, this.B);
        w0(l0VarN0, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    public void o0(Metadata metadata) {
        MediaMetadata mediaMetadataBuild = this.E.buildUpon().populateFromMetadata(metadata).build();
        if (mediaMetadataBuild.equals(this.E)) {
            return;
        }
        this.E = mediaMetadataBuild;
        this.h.sendEvent(15, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.w
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.a.S((Player.EventListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        l0 l0Var = this.G;
        if (l0Var.e != 1) {
            return;
        }
        l0 l0VarF = l0Var.f(null);
        l0 l0VarH = l0VarF.h(l0VarF.a.isEmpty() ? 4 : 2);
        this.v++;
        this.g.e0();
        w0(l0VarH, 1, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = Util.DEVICE_DEBUG_INFO;
        String strRegisteredModules = ExoPlayerLibraryInfo.registeredModules();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 36 + String.valueOf(str).length() + String.valueOf(strRegisteredModules).length());
        sb.append("Release ");
        sb.append(hexString);
        sb.append(" [");
        sb.append(ExoPlayerLibraryInfo.VERSION_SLASHY);
        sb.append("] [");
        sb.append(str);
        sb.append("] [");
        sb.append(strRegisteredModules);
        sb.append("]");
        Log.i(K, sb.toString());
        if (!this.g.g0()) {
            this.h.sendEvent(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.q
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    c0.T((Player.EventListener) obj);
                }
            });
        }
        this.h.release();
        this.e.removeCallbacksAndMessages(null);
        AnalyticsCollector analyticsCollector = this.n;
        if (analyticsCollector != null) {
            this.p.removeEventListener(analyticsCollector);
        }
        l0 l0VarH = this.G.h(1);
        this.G = l0VarH;
        l0 l0VarB = l0VarH.b(l0VarH.b);
        this.G = l0VarB;
        l0VarB.q = l0VarB.s;
        this.G.r = 0L;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener listener) {
        this.i.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
        removeListener((Player.EventListener) listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int fromIndex, int toIndex) {
        l0 l0VarQ0 = q0(fromIndex, Math.min(toIndex, this.k.size()));
        w0(l0VarQ0, 0, 1, false, !l0VarQ0.b.periodUid.equals(this.G.b.periodUid), 4, G(l0VarQ0), -1);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void retry() {
        prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int windowIndex, long positionMs) {
        Timeline timeline = this.G.a;
        if (windowIndex < 0 || (!timeline.isEmpty() && windowIndex >= timeline.getWindowCount())) {
            throw new IllegalSeekPositionException(timeline, windowIndex, positionMs);
        }
        this.v++;
        if (isPlayingAd()) {
            Log.w(K, "seekTo ignored because an ad is playing");
            ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.G);
            playbackInfoUpdate.incrementPendingOperationAcks(1);
            this.f.onPlaybackInfoUpdate(playbackInfoUpdate);
            return;
        }
        int i = getPlaybackState() != 1 ? 2 : 1;
        int currentWindowIndex = getCurrentWindowIndex();
        l0 l0VarN0 = n0(this.G.h(i), timeline, J(timeline, windowIndex, positionMs));
        this.g.w0(timeline, windowIndex, C.msToUs(positionMs));
        w0(l0VarN0, 0, 1, true, true, 1, G(l0VarN0), currentWindowIndex);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceMuted(boolean muted) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceVolume(int volume) {
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean foregroundMode) {
        if (this.z != foregroundMode) {
            this.z = foregroundMode;
            if (this.g.G0(foregroundMode)) {
                return;
            }
            u0(false, ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, boolean resetPosition) {
        setMediaSources(C(mediaItems), resetPosition);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        setMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources) {
        setMediaSources(mediaSources, true);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean pauseAtEndOfMediaItems) {
        if (this.C == pauseAtEndOfMediaItems) {
            return;
        }
        this.C = pauseAtEndOfMediaItems;
        this.g.L0(pauseAtEndOfMediaItems);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean playWhenReady) {
        t0(playWhenReady, 0, 1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (this.G.n.equals(playbackParameters)) {
            return;
        }
        l0 l0VarG = this.G.g(playbackParameters);
        this.v++;
        this.g.P0(playbackParameters);
        w0(l0VarG, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata playlistMetadata) {
        Assertions.checkNotNull(playlistMetadata);
        if (playlistMetadata.equals(this.F)) {
            return;
        }
        this.F = playlistMetadata;
        this.h.sendEvent(16, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.v
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                this.a.U((Player.EventListener) obj);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(final int repeatMode) {
        if (this.t != repeatMode) {
            this.t = repeatMode;
            this.g.R0(repeatMode);
            this.h.queueEvent(9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.o
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onRepeatModeChanged(repeatMode);
                }
            });
            v0();
            this.h.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(@Nullable SeekParameters seekParameters) {
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (this.A.equals(seekParameters)) {
            return;
        }
        this.A = seekParameters;
        this.g.T0(seekParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(final boolean shuffleModeEnabled) {
        if (this.u != shuffleModeEnabled) {
            this.u = shuffleModeEnabled;
            this.g.V0(shuffleModeEnabled);
            this.h.queueEvent(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.p
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.EventListener) obj).onShuffleModeEnabledChanged(shuffleModeEnabled);
                }
            });
            v0();
            this.h.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        Timeline timelineB = B();
        l0 l0VarN0 = n0(this.G, timelineB, J(timelineB, getCurrentWindowIndex(), getCurrentPosition()));
        this.v++;
        this.B = shuffleOrder;
        this.g.X0(shuffleOrder);
        w0(l0VarN0, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurface(@Nullable Surface surface) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(@Nullable TextureView textureView) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float audioVolume) {
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean reset) {
        u0(reset, null);
    }

    public void t0(boolean playWhenReady, int playbackSuppressionReason, int playWhenReadyChangeReason) {
        l0 l0Var = this.G;
        if (l0Var.l == playWhenReady && l0Var.m == playbackSuppressionReason) {
            return;
        }
        this.v++;
        l0 l0VarE = l0Var.e(playWhenReady, playbackSuppressionReason);
        this.g.N0(playWhenReady, playbackSuppressionReason);
        w0(l0VarE, 0, playWhenReadyChangeReason, false, false, 5, C.TIME_UNSET, -1);
    }

    public void u0(boolean reset, @Nullable ExoPlaybackException error) {
        l0 l0VarB;
        if (reset) {
            l0VarB = q0(0, this.k.size()).f(null);
        } else {
            l0 l0Var = this.G;
            l0VarB = l0Var.b(l0Var.b);
            l0VarB.q = l0VarB.s;
            l0VarB.r = 0L;
        }
        l0 l0VarH = l0VarB.h(1);
        if (error != null) {
            l0VarH = l0VarH.f(error);
        }
        l0 l0Var2 = l0VarH;
        this.v++;
        this.g.g1();
        w0(l0Var2, 0, 1, false, l0Var2.a.isEmpty() && !this.G.a.isEmpty(), 4, G(l0Var2), -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.EventListener listener) {
        this.h.add(listener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int index, MediaSource mediaSource) {
        addMediaSources(index, Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int index, List<MediaSource> mediaSources) {
        Assertions.checkArgument(index >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.v++;
        List<MediaSourceList.c> listA = A(index, mediaSources);
        Timeline timelineB = B();
        l0 l0VarN0 = n0(this.G, timelineB, I(currentTimeline, timelineB));
        this.g.f(index, listA, this.B);
        w0(l0VarN0, 0, 1, false, false, 5, C.TIME_UNSET, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public ExoPlaybackException getPlayerError() {
        return this.G.f;
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.EventListener listener) {
        this.h.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> mediaItems, int startWindowIndex, long startPositionMs) {
        setMediaSources(C(mediaItems), startWindowIndex, startPositionMs);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long startPositionMs) {
        setMediaSources(Collections.singletonList(mediaSource), 0, startPositionMs);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, boolean resetPosition) {
        s0(mediaSources, -1, C.TIME_UNSET, resetPosition);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List<MediaSource> mediaSources, int startWindowIndex, long startPositionMs) {
        s0(mediaSources, startWindowIndex, startPositionMs, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean resetPosition) {
        setMediaSources(Collections.singletonList(mediaSource), resetPosition);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource) {
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    @Deprecated
    public void prepare(MediaSource mediaSource, boolean resetPosition, boolean resetState) {
        setMediaSource(mediaSource, resetPosition);
        prepare();
    }
}
