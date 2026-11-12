package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    private static final int A0 = 24;
    private static final int B0 = 25;
    private static final int C0 = 10;
    private static final int D0 = 1000;
    private static final long E0 = 2000;
    private static final String P = "ExoPlayerImplInternal";
    private static final int Q = 0;
    private static final int R = 1;
    private static final int S = 2;
    private static final int T = 3;
    private static final int U = 4;
    private static final int V = 5;
    private static final int W = 6;
    private static final int X = 7;
    private static final int Y = 8;
    private static final int Z = 9;
    private static final int m0 = 10;
    private static final int n0 = 11;
    private static final int o0 = 12;
    private static final int p0 = 13;
    private static final int q0 = 14;
    private static final int r0 = 15;
    private static final int s0 = 16;
    private static final int t0 = 17;
    private static final int u0 = 18;
    private static final int v0 = 19;
    private static final int w0 = 20;
    private static final int x0 = 21;
    private static final int y0 = 22;
    private static final int z0 = 23;
    private boolean A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int I;

    @Nullable
    private f J;
    private long K;
    private int L;
    private boolean M;

    @Nullable
    private ExoPlaybackException N;
    private long O;
    private final Renderer[] a;
    private final RendererCapabilities[] b;
    private final TrackSelector c;
    private final TrackSelectorResult d;
    private final LoadControl e;
    private final BandwidthMeter f;
    private final HandlerWrapper g;
    private final HandlerThread h;
    private final Looper i;
    private final Timeline.Window j;
    private final Timeline.Period k;
    private final long l;
    private final boolean m;
    private final DefaultMediaClock n;
    private final ArrayList<d> o;
    private final Clock p;
    private final PlaybackInfoUpdateListener q;
    private final i0 r;
    private final MediaSourceList s;
    private final LivePlaybackSpeedControl t;
    private final long u;
    private SeekParameters v;
    private l0 w;
    private PlaybackInfoUpdate x;
    private boolean y;
    private boolean z;

    public static final class PlaybackInfoUpdate {
        private boolean a;
        public int discontinuityReason;
        public boolean hasPlayWhenReadyChangeReason;
        public int operationAcks;
        public int playWhenReadyChangeReason;
        public l0 playbackInfo;
        public boolean positionDiscontinuity;

        public PlaybackInfoUpdate(l0 playbackInfo) {
            this.playbackInfo = playbackInfo;
        }

        public void incrementPendingOperationAcks(int operationAcks) {
            this.a |= operationAcks > 0;
            this.operationAcks += operationAcks;
        }

        public void setPlayWhenReadyChangeReason(int playWhenReadyChangeReason) {
            this.a = true;
            this.hasPlayWhenReadyChangeReason = true;
            this.playWhenReadyChangeReason = playWhenReadyChangeReason;
        }

        public void setPlaybackInfo(l0 playbackInfo) {
            this.a |= this.playbackInfo != playbackInfo;
            this.playbackInfo = playbackInfo;
        }

        public void setPositionDiscontinuity(int discontinuityReason) {
            if (this.positionDiscontinuity && this.discontinuityReason != 5) {
                Assertions.checkArgument(discontinuityReason == 5);
                return;
            }
            this.a = true;
            this.positionDiscontinuity = true;
            this.discontinuityReason = discontinuityReason;
        }
    }

    public interface PlaybackInfoUpdateListener {
        void onPlaybackInfoUpdate(PlaybackInfoUpdate playbackInfo);
    }

    public class a implements Renderer.WakeupListener {
        public a() {
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onSleep(long wakeupDeadlineMs) {
            if (wakeupDeadlineMs >= 2000) {
                ExoPlayerImplInternal.this.G = true;
            }
        }

        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
        public void onWakeup() {
            ExoPlayerImplInternal.this.g.sendEmptyMessage(2);
        }
    }

    public static final class b {
        private final List<MediaSourceList.c> a;
        private final ShuffleOrder b;
        private final int c;
        private final long d;

        public /* synthetic */ b(List list, ShuffleOrder shuffleOrder, int i, long j, a aVar) {
            this(list, shuffleOrder, i, j);
        }

        private b(List<MediaSourceList.c> mediaSourceHolders, ShuffleOrder shuffleOrder, int windowIndex, long positionUs) {
            this.a = mediaSourceHolders;
            this.b = shuffleOrder;
            this.c = windowIndex;
            this.d = positionUs;
        }
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final ShuffleOrder d;

        public c(int fromIndex, int toIndex, int newFromIndex, ShuffleOrder shuffleOrder) {
            this.a = fromIndex;
            this.b = toIndex;
            this.c = newFromIndex;
            this.d = shuffleOrder;
        }
    }

    public static final class d implements Comparable<d> {
        public final PlayerMessage a;
        public int b;
        public long c;

        @Nullable
        public Object d;

        public d(PlayerMessage message) {
            this.a = message;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d other) {
            Object obj = this.d;
            if ((obj == null) != (other.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - other.b;
            return i != 0 ? i : Util.compareLong(this.c, other.c);
        }

        public void b(int periodIndex, long periodTimeUs, Object periodUid) {
            this.b = periodIndex;
            this.c = periodTimeUs;
            this.d = periodUid;
        }
    }

    public static final class e {
        public final MediaSource.MediaPeriodId a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public e(MediaSource.MediaPeriodId periodId, long periodPositionUs, long requestedContentPositionUs, boolean forceBufferingState, boolean endPlayback, boolean setTargetLiveOffset) {
            this.a = periodId;
            this.b = periodPositionUs;
            this.c = requestedContentPositionUs;
            this.d = forceBufferingState;
            this.e = endPlayback;
            this.f = setTargetLiveOffset;
        }
    }

    public static final class f {
        public final Timeline a;
        public final int b;
        public final long c;

        public f(Timeline timeline, int windowIndex, long windowPositionUs) {
            this.a = timeline;
            this.b = windowIndex;
            this.c = windowPositionUs;
        }
    }

    public ExoPlayerImplInternal(Renderer[] renderers, TrackSelector trackSelector, TrackSelectorResult emptyTrackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int repeatMode, boolean shuffleModeEnabled, @Nullable AnalyticsCollector analyticsCollector, SeekParameters seekParameters, LivePlaybackSpeedControl livePlaybackSpeedControl, long releaseTimeoutMs, boolean pauseAtEndOfWindow, Looper applicationLooper, Clock clock, PlaybackInfoUpdateListener playbackInfoUpdateListener) {
        this.q = playbackInfoUpdateListener;
        this.a = renderers;
        this.c = trackSelector;
        this.d = emptyTrackSelectorResult;
        this.e = loadControl;
        this.f = bandwidthMeter;
        this.D = repeatMode;
        this.E = shuffleModeEnabled;
        this.v = seekParameters;
        this.t = livePlaybackSpeedControl;
        this.u = releaseTimeoutMs;
        this.O = releaseTimeoutMs;
        this.z = pauseAtEndOfWindow;
        this.p = clock;
        this.l = loadControl.getBackBufferDurationUs();
        this.m = loadControl.retainBackBufferFromKeyframe();
        l0 l0VarK = l0.k(emptyTrackSelectorResult);
        this.w = l0VarK;
        this.x = new PlaybackInfoUpdate(l0VarK);
        this.b = new RendererCapabilities[renderers.length];
        for (int i = 0; i < renderers.length; i++) {
            renderers[i].setIndex(i);
            this.b[i] = renderers[i].getCapabilities();
        }
        this.n = new DefaultMediaClock(this, clock);
        this.o = new ArrayList<>();
        this.j = new Timeline.Window();
        this.k = new Timeline.Period();
        trackSelector.init(this, bandwidthMeter);
        this.M = true;
        Handler handler = new Handler(applicationLooper);
        this.r = new i0(analyticsCollector, handler);
        this.s = new MediaSourceList(this, analyticsCollector, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.h = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.i = looper;
        this.g = clock.createHandler(looper, this);
    }

    private void A(IOException e2, int errorCode) {
        ExoPlaybackException exoPlaybackExceptionCreateForSource = ExoPlaybackException.createForSource(e2, errorCode);
        f0 f0VarP = this.r.p();
        if (f0VarP != null) {
            exoPlaybackExceptionCreateForSource = exoPlaybackExceptionCreateForSource.f(f0VarP.f.a);
        }
        Log.e(P, "Playback error", exoPlaybackExceptionCreateForSource);
        h1(false, false);
        this.w = this.w.f(exoPlaybackExceptionCreateForSource);
    }

    private long A0(MediaSource.MediaPeriodId periodId, long periodPositionUs, boolean forceDisableRenderers, boolean forceBufferingState) throws ExoPlaybackException {
        i1();
        this.B = false;
        if (forceBufferingState || this.w.e == 3) {
            Z0(2);
        }
        f0 f0VarP = this.r.p();
        f0 f0VarJ = f0VarP;
        while (f0VarJ != null && !periodId.equals(f0VarJ.f.a)) {
            f0VarJ = f0VarJ.j();
        }
        if (forceDisableRenderers || f0VarP != f0VarJ || (f0VarJ != null && f0VarJ.z(periodPositionUs) < 0)) {
            for (Renderer renderer : this.a) {
                i(renderer);
            }
            if (f0VarJ != null) {
                while (this.r.p() != f0VarJ) {
                    this.r.b();
                }
                this.r.z(f0VarJ);
                f0VarJ.x(0L);
                l();
            }
        }
        if (f0VarJ != null) {
            this.r.z(f0VarJ);
            if (f0VarJ.d) {
                long j = f0VarJ.f.e;
                if (j != C.TIME_UNSET && periodPositionUs >= j) {
                    periodPositionUs = Math.max(0L, j - 1);
                }
                if (f0VarJ.e) {
                    long jSeekToUs = f0VarJ.a.seekToUs(periodPositionUs);
                    f0VarJ.a.discardBuffer(jSeekToUs - this.l, this.m);
                    periodPositionUs = jSeekToUs;
                }
            } else {
                f0VarJ.f = f0VarJ.f.b(periodPositionUs);
            }
            o0(periodPositionUs);
            P();
        } else {
            this.r.f();
            o0(periodPositionUs);
        }
        B(false);
        this.g.sendEmptyMessage(2);
        return periodPositionUs;
    }

    private void B(boolean loadingTrackSelectionChanged) {
        f0 f0VarJ = this.r.j();
        MediaSource.MediaPeriodId mediaPeriodId = f0VarJ == null ? this.w.b : f0VarJ.f.a;
        boolean z = !this.w.k.equals(mediaPeriodId);
        if (z) {
            this.w = this.w.b(mediaPeriodId);
        }
        l0 l0Var = this.w;
        l0Var.q = f0VarJ == null ? l0Var.s : f0VarJ.i();
        this.w.r = x();
        if ((z || loadingTrackSelectionChanged) && f0VarJ != null && f0VarJ.d) {
            l1(f0VarJ.n(), f0VarJ.o());
        }
    }

    private void B0(PlayerMessage message) throws ExoPlaybackException {
        if (message.getPositionMs() == C.TIME_UNSET) {
            C0(message);
            return;
        }
        if (this.w.a.isEmpty()) {
            this.o.add(new d(message));
            return;
        }
        d dVar = new d(message);
        Timeline timeline = this.w.a;
        if (!q0(dVar, timeline, timeline, this.D, this.E, this.j, this.k)) {
            message.markAsProcessed(false);
        } else {
            this.o.add(dVar);
            Collections.sort(this.o);
        }
    }

    private void C(Timeline timeline, boolean isSourceRefresh) throws Throwable {
        boolean z;
        e eVarS0 = s0(timeline, this.w, this.J, this.r, this.D, this.E, this.j, this.k);
        MediaSource.MediaPeriodId mediaPeriodId = eVarS0.a;
        long j = eVarS0.c;
        boolean z2 = eVarS0.d;
        long jZ0 = eVarS0.b;
        boolean z3 = (this.w.b.equals(mediaPeriodId) && jZ0 == this.w.s) ? false : true;
        f fVar = null;
        long j2 = C.TIME_UNSET;
        try {
            if (eVarS0.e) {
                if (this.w.e != 1) {
                    Z0(4);
                }
                m0(false, false, false, true);
            }
            try {
                if (z3) {
                    z = false;
                    if (!timeline.isEmpty()) {
                        for (f0 f0VarP = this.r.p(); f0VarP != null; f0VarP = f0VarP.j()) {
                            if (f0VarP.f.a.equals(mediaPeriodId)) {
                                f0VarP.f = this.r.r(timeline, f0VarP.f);
                                f0VarP.A();
                            }
                        }
                        jZ0 = z0(mediaPeriodId, jZ0, z2);
                    }
                } else {
                    z = false;
                    if (!this.r.F(timeline, this.K, u())) {
                        x0(false);
                    }
                }
                l0 l0Var = this.w;
                k1(timeline, mediaPeriodId, l0Var.a, l0Var.b, eVarS0.f ? jZ0 : -9223372036854775807L);
                if (z3 || j != this.w.c) {
                    l0 l0Var2 = this.w;
                    Object obj = l0Var2.b.periodUid;
                    Timeline timeline2 = l0Var2.a;
                    this.w = G(mediaPeriodId, jZ0, j, this.w.d, z3 && isSourceRefresh && !timeline2.isEmpty() && !timeline2.getPeriodByUid(obj, this.k).isPlaceholder, timeline.getIndexOfPeriod(obj) == -1 ? 4 : 3);
                }
                n0();
                r0(timeline, this.w.a);
                this.w = this.w.j(timeline);
                if (!timeline.isEmpty()) {
                    this.J = null;
                }
                B(z);
            } catch (Throwable th) {
                th = th;
                fVar = null;
                l0 l0Var3 = this.w;
                Timeline timeline3 = l0Var3.a;
                MediaSource.MediaPeriodId mediaPeriodId2 = l0Var3.b;
                if (eVarS0.f) {
                    j2 = jZ0;
                }
                f fVar2 = fVar;
                k1(timeline, mediaPeriodId, timeline3, mediaPeriodId2, j2);
                if (z3 || j != this.w.c) {
                    l0 l0Var4 = this.w;
                    Object obj2 = l0Var4.b.periodUid;
                    Timeline timeline4 = l0Var4.a;
                    this.w = G(mediaPeriodId, jZ0, j, this.w.d, z3 && isSourceRefresh && !timeline4.isEmpty() && !timeline4.getPeriodByUid(obj2, this.k).isPlaceholder, timeline.getIndexOfPeriod(obj2) == -1 ? 4 : 3);
                }
                n0();
                r0(timeline, this.w.a);
                this.w = this.w.j(timeline);
                if (!timeline.isEmpty()) {
                    this.J = fVar2;
                }
                B(false);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void C0(PlayerMessage message) throws ExoPlaybackException {
        if (message.getLooper() != this.i) {
            this.g.obtainMessage(15, message).sendToTarget();
            return;
        }
        h(message);
        int i = this.w.e;
        if (i == 3 || i == 2) {
            this.g.sendEmptyMessage(2);
        }
    }

    private void D(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        if (this.r.v(mediaPeriod)) {
            f0 f0VarJ = this.r.j();
            f0VarJ.p(this.n.getPlaybackParameters().speed, this.w.a);
            l1(f0VarJ.n(), f0VarJ.o());
            if (f0VarJ == this.r.p()) {
                o0(f0VarJ.f.b);
                l();
                l0 l0Var = this.w;
                MediaSource.MediaPeriodId mediaPeriodId = l0Var.b;
                long j = f0VarJ.f.b;
                this.w = G(mediaPeriodId, j, l0Var.c, j, false, 5);
            }
            P();
        }
    }

    private void D0(final PlayerMessage message) {
        Looper looper = message.getLooper();
        if (looper.getThread().isAlive()) {
            this.p.createHandler(looper, null).post(new Runnable() { // from class: com.google.android.exoplayer2.e0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.O(message);
                }
            });
        } else {
            Log.w("TAG", "Trying to send message on a dead thread.");
            message.markAsProcessed(false);
        }
    }

    private void E(PlaybackParameters playbackParameters, float currentPlaybackSpeed, boolean updatePlaybackInfo, boolean acknowledgeCommand) throws ExoPlaybackException {
        if (updatePlaybackInfo) {
            if (acknowledgeCommand) {
                this.x.incrementPendingOperationAcks(1);
            }
            this.w = this.w.g(playbackParameters);
        }
        o1(playbackParameters.speed);
        for (Renderer renderer : this.a) {
            if (renderer != null) {
                renderer.setPlaybackSpeed(currentPlaybackSpeed, playbackParameters.speed);
            }
        }
    }

    private void E0(long streamEndPositionUs) {
        for (Renderer renderer : this.a) {
            if (renderer.getStream() != null) {
                F0(renderer, streamEndPositionUs);
            }
        }
    }

    private void F(PlaybackParameters playbackParameters, boolean acknowledgeCommand) throws ExoPlaybackException {
        E(playbackParameters, playbackParameters.speed, true, acknowledgeCommand);
    }

    private void F0(Renderer renderer, long streamEndPositionUs) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            ((TextRenderer) renderer).setFinalStreamEndPositionUs(streamEndPositionUs);
        }
    }

    @CheckResult
    private l0 G(MediaSource.MediaPeriodId mediaPeriodId, long positionUs, long contentPositionUs, long discontinuityStartPositionUs, boolean reportDiscontinuity, int discontinuityReason) {
        List<Metadata> listOf;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        this.M = (!this.M && positionUs == this.w.s && mediaPeriodId.equals(this.w.b)) ? false : true;
        n0();
        l0 l0Var = this.w;
        TrackGroupArray trackGroupArray2 = l0Var.h;
        TrackSelectorResult trackSelectorResult2 = l0Var.i;
        List<Metadata> list = l0Var.j;
        if (this.s.t()) {
            f0 f0VarP = this.r.p();
            TrackGroupArray trackGroupArrayN = f0VarP == null ? TrackGroupArray.EMPTY : f0VarP.n();
            TrackSelectorResult trackSelectorResultO = f0VarP == null ? this.d : f0VarP.o();
            ImmutableList<Metadata> immutableListQ = q(trackSelectorResultO.selections);
            if (f0VarP != null) {
                g0 g0Var = f0VarP.f;
                if (g0Var.c != contentPositionUs) {
                    f0VarP.f = g0Var.a(contentPositionUs);
                }
            }
            trackGroupArray = trackGroupArrayN;
            trackSelectorResult = trackSelectorResultO;
            listOf = immutableListQ;
        } else if (mediaPeriodId.equals(this.w.b)) {
            listOf = list;
            trackGroupArray = trackGroupArray2;
            trackSelectorResult = trackSelectorResult2;
        } else {
            trackGroupArray = TrackGroupArray.EMPTY;
            trackSelectorResult = this.d;
            listOf = ImmutableList.of();
        }
        if (reportDiscontinuity) {
            this.x.setPositionDiscontinuity(discontinuityReason);
        }
        return this.w.c(mediaPeriodId, positionUs, contentPositionUs, discontinuityStartPositionUs, x(), trackGroupArray, trackSelectorResult, listOf);
    }

    private boolean H(Renderer renderer, f0 reading) {
        f0 f0VarJ = reading.j();
        return reading.f.f && f0VarJ.d && ((renderer instanceof TextRenderer) || renderer.getReadingPositionUs() >= f0VarJ.m());
    }

    private void H0(boolean foregroundMode, @Nullable AtomicBoolean processedFlag) {
        if (this.F != foregroundMode) {
            this.F = foregroundMode;
            if (!foregroundMode) {
                for (Renderer renderer : this.a) {
                    if (!K(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (processedFlag != null) {
            synchronized (this) {
                processedFlag.set(true);
                notifyAll();
            }
        }
    }

    private boolean I() {
        f0 f0VarQ = this.r.q();
        if (!f0VarQ.d) {
            return false;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.a;
            if (i >= rendererArr.length) {
                return true;
            }
            Renderer renderer = rendererArr[i];
            SampleStream sampleStream = f0VarQ.c[i];
            if (renderer.getStream() != sampleStream || (sampleStream != null && !renderer.hasReadStreamToEnd() && !H(renderer, f0VarQ))) {
                return false;
            }
            i++;
        }
    }

    private void I0(b mediaSourceListUpdateMessage) throws Throwable {
        this.x.incrementPendingOperationAcks(1);
        if (mediaSourceListUpdateMessage.c != -1) {
            this.J = new f(new o0(mediaSourceListUpdateMessage.a, mediaSourceListUpdateMessage.b), mediaSourceListUpdateMessage.c, mediaSourceListUpdateMessage.d);
        }
        C(this.s.E(mediaSourceListUpdateMessage.a, mediaSourceListUpdateMessage.b), false);
    }

    private boolean J() {
        f0 f0VarJ = this.r.j();
        return (f0VarJ == null || f0VarJ.k() == Long.MIN_VALUE) ? false : true;
    }

    private static boolean K(Renderer renderer) {
        return renderer.getState() != 0;
    }

    private void K0(boolean offloadSchedulingEnabled) {
        if (offloadSchedulingEnabled == this.H) {
            return;
        }
        this.H = offloadSchedulingEnabled;
        l0 l0Var = this.w;
        int i = l0Var.e;
        if (offloadSchedulingEnabled || i == 4 || i == 1) {
            this.w = l0Var.d(offloadSchedulingEnabled);
        } else {
            this.g.sendEmptyMessage(2);
        }
    }

    private boolean L() {
        f0 f0VarP = this.r.p();
        long j = f0VarP.f.e;
        return f0VarP.d && (j == C.TIME_UNSET || this.w.s < j || !c1());
    }

    private static boolean M(l0 playbackInfo, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.b;
        Timeline timeline = playbackInfo.a;
        return timeline.isEmpty() || timeline.getPeriodByUid(mediaPeriodId.periodUid, period).isPlaceholder;
    }

    private void M0(boolean pauseAtEndOfWindow) throws ExoPlaybackException {
        this.z = pauseAtEndOfWindow;
        n0();
        if (!this.A || this.r.q() == this.r.p()) {
            return;
        }
        x0(true);
        B(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean N() {
        return Boolean.valueOf(this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(PlayerMessage playerMessage) {
        try {
            h(playerMessage);
        } catch (ExoPlaybackException e2) {
            Log.e(P, "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void O0(boolean z, int i, boolean z2, int i2) throws ExoPlaybackException {
        this.x.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.x.setPlayWhenReadyChangeReason(i2);
        this.w = this.w.e(z, i);
        this.B = false;
        b0(z);
        if (!c1()) {
            i1();
            n1();
            return;
        }
        int i3 = this.w.e;
        if (i3 == 3) {
            f1();
            this.g.sendEmptyMessage(2);
        } else if (i3 == 2) {
            this.g.sendEmptyMessage(2);
        }
    }

    private void P() {
        boolean zB1 = b1();
        this.C = zB1;
        if (zB1) {
            this.r.j().d(this.K);
        }
        j1();
    }

    private void Q() {
        this.x.setPlaybackInfo(this.w);
        if (this.x.a) {
            this.q.onPlaybackInfoUpdate(this.x);
            this.x = new PlaybackInfoUpdate(this.w);
        }
    }

    private void Q0(PlaybackParameters playbackParameters) throws ExoPlaybackException {
        this.n.setPlaybackParameters(playbackParameters);
        F(this.n.getPlaybackParameters(), true);
    }

    private boolean R(long operationStartTimeMs, long intervalMs) {
        if (this.H && this.G) {
            return false;
        }
        v0(operationStartTimeMs, intervalMs);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0074, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void S(long oldPeriodPositionUs, long newPeriodPositionUs) throws ExoPlaybackException {
        if (this.o.isEmpty() || this.w.b.isAd()) {
            return;
        }
        if (this.M) {
            oldPeriodPositionUs--;
            this.M = false;
        }
        l0 l0Var = this.w;
        int indexOfPeriod = l0Var.a.getIndexOfPeriod(l0Var.b.periodUid);
        int iMin = Math.min(this.L, this.o.size());
        if (iMin > 0) {
            d dVar = this.o.get(iMin - 1);
            while (dVar != null) {
                int i = dVar.b;
                if (i <= indexOfPeriod && (i != indexOfPeriod || dVar.c <= oldPeriodPositionUs)) {
                    break;
                }
                iMin--;
                dVar = iMin > 0 ? this.o.get(iMin - 1) : null;
            }
            if (iMin < this.o.size()) {
                d dVar2 = this.o.get(iMin);
                while (dVar2 != null && dVar2.d != null) {
                    int i2 = dVar2.b;
                    if (i2 >= indexOfPeriod && (i2 != indexOfPeriod || dVar2.c > oldPeriodPositionUs)) {
                        break;
                    }
                    iMin++;
                    dVar2 = iMin < this.o.size() ? this.o.get(iMin) : null;
                }
                while (dVar2 != null && dVar2.d != null && dVar2.b == indexOfPeriod) {
                    long j = dVar2.c;
                    if (j <= oldPeriodPositionUs || j > newPeriodPositionUs) {
                        break;
                    }
                    try {
                        C0(dVar2.a);
                        if (dVar2.a.getDeleteAfterDelivery() || dVar2.a.isCanceled()) {
                            this.o.remove(iMin);
                        } else {
                            iMin++;
                        }
                        dVar2 = iMin < this.o.size() ? this.o.get(iMin) : null;
                    } catch (Throwable th) {
                        if (dVar2.a.getDeleteAfterDelivery() || dVar2.a.isCanceled()) {
                            this.o.remove(iMin);
                        }
                        throw th;
                    }
                }
                this.L = iMin;
            }
        }
    }

    private void S0(int repeatMode) throws ExoPlaybackException {
        this.D = repeatMode;
        if (!this.r.G(this.w.a, repeatMode)) {
            x0(true);
        }
        B(false);
    }

    private void T() throws ExoPlaybackException {
        g0 g0VarO;
        this.r.y(this.K);
        if (this.r.D() && (g0VarO = this.r.o(this.K, this.w)) != null) {
            f0 f0VarG = this.r.g(this.b, this.c, this.e.getAllocator(), this.s, g0VarO, this.d);
            f0VarG.a.prepare(this, g0VarO.b);
            if (this.r.p() == f0VarG) {
                o0(f0VarG.m());
            }
            B(false);
        }
        if (!this.C) {
            P();
        } else {
            this.C = J();
            j1();
        }
    }

    private void U() throws ExoPlaybackException {
        boolean z = false;
        while (a1()) {
            if (z) {
                Q();
            }
            f0 f0VarP = this.r.p();
            f0 f0VarB = this.r.b();
            g0 g0Var = f0VarB.f;
            MediaSource.MediaPeriodId mediaPeriodId = g0Var.a;
            long j = g0Var.b;
            l0 l0VarG = G(mediaPeriodId, j, g0Var.c, j, true, 0);
            this.w = l0VarG;
            Timeline timeline = l0VarG.a;
            k1(timeline, f0VarB.f.a, timeline, f0VarP.f.a, C.TIME_UNSET);
            n0();
            n1();
            z = true;
        }
    }

    private void U0(SeekParameters seekParameters) {
        this.v = seekParameters;
    }

    private void V() {
        f0 f0VarQ = this.r.q();
        if (f0VarQ == null) {
            return;
        }
        int i = 0;
        if (f0VarQ.j() != null && !this.A) {
            if (I()) {
                if (f0VarQ.j().d || this.K >= f0VarQ.j().m()) {
                    TrackSelectorResult trackSelectorResultO = f0VarQ.o();
                    f0 f0VarC = this.r.c();
                    TrackSelectorResult trackSelectorResultO2 = f0VarC.o();
                    if (f0VarC.d && f0VarC.a.readDiscontinuity() != C.TIME_UNSET) {
                        E0(f0VarC.m());
                        return;
                    }
                    for (int i2 = 0; i2 < this.a.length; i2++) {
                        boolean zIsRendererEnabled = trackSelectorResultO.isRendererEnabled(i2);
                        boolean zIsRendererEnabled2 = trackSelectorResultO2.isRendererEnabled(i2);
                        if (zIsRendererEnabled && !this.a[i2].isCurrentStreamFinal()) {
                            boolean z = this.b[i2].getTrackType() == 7;
                            RendererConfiguration rendererConfiguration = trackSelectorResultO.rendererConfigurations[i2];
                            RendererConfiguration rendererConfiguration2 = trackSelectorResultO2.rendererConfigurations[i2];
                            if (!zIsRendererEnabled2 || !rendererConfiguration2.equals(rendererConfiguration) || z) {
                                F0(this.a[i2], f0VarC.m());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!f0VarQ.f.i && !this.A) {
            return;
        }
        while (true) {
            Renderer[] rendererArr = this.a;
            if (i >= rendererArr.length) {
                return;
            }
            Renderer renderer = rendererArr[i];
            SampleStream sampleStream = f0VarQ.c[i];
            if (sampleStream != null && renderer.getStream() == sampleStream && renderer.hasReadStreamToEnd()) {
                long j = f0VarQ.f.e;
                F0(renderer, (j == C.TIME_UNSET || j == Long.MIN_VALUE) ? -9223372036854775807L : f0VarQ.l() + f0VarQ.f.e);
            }
            i++;
        }
    }

    private void W() throws ExoPlaybackException {
        f0 f0VarQ = this.r.q();
        if (f0VarQ == null || this.r.p() == f0VarQ || f0VarQ.g || !k0()) {
            return;
        }
        l();
    }

    private void W0(boolean shuffleModeEnabled) throws ExoPlaybackException {
        this.E = shuffleModeEnabled;
        if (!this.r.H(this.w.a, shuffleModeEnabled)) {
            x0(true);
        }
        B(false);
    }

    private void X() throws Throwable {
        C(this.s.j(), true);
    }

    private void Y(c moveMediaItemsMessage) throws Throwable {
        this.x.incrementPendingOperationAcks(1);
        C(this.s.x(moveMediaItemsMessage.a, moveMediaItemsMessage.b, moveMediaItemsMessage.c, moveMediaItemsMessage.d), false);
    }

    private void Y0(ShuffleOrder shuffleOrder) throws Throwable {
        this.x.incrementPendingOperationAcks(1);
        C(this.s.F(shuffleOrder), false);
    }

    private void Z0(int state) {
        l0 l0Var = this.w;
        if (l0Var.e != state) {
            this.w = l0Var.h(state);
        }
    }

    private void a0() {
        for (f0 f0VarP = this.r.p(); f0VarP != null; f0VarP = f0VarP.j()) {
            for (ExoTrackSelection exoTrackSelection : f0VarP.o().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onDiscontinuity();
                }
            }
        }
    }

    private boolean a1() {
        f0 f0VarP;
        f0 f0VarJ;
        return c1() && !this.A && (f0VarP = this.r.p()) != null && (f0VarJ = f0VarP.j()) != null && this.K >= f0VarJ.m() && f0VarJ.g;
    }

    private void b0(boolean playWhenReady) {
        for (f0 f0VarP = this.r.p(); f0VarP != null; f0VarP = f0VarP.j()) {
            for (ExoTrackSelection exoTrackSelection : f0VarP.o().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlayWhenReadyChanged(playWhenReady);
                }
            }
        }
    }

    private boolean b1() {
        if (!J()) {
            return false;
        }
        f0 f0VarJ = this.r.j();
        return this.e.shouldContinueLoading(f0VarJ == this.r.p() ? f0VarJ.y(this.K) : f0VarJ.y(this.K) - f0VarJ.f.b, y(f0VarJ.k()), this.n.getPlaybackParameters().speed);
    }

    private void c0() {
        for (f0 f0VarP = this.r.p(); f0VarP != null; f0VarP = f0VarP.j()) {
            for (ExoTrackSelection exoTrackSelection : f0VarP.o().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onRebuffer();
                }
            }
        }
    }

    private boolean c1() {
        l0 l0Var = this.w;
        return l0Var.l && l0Var.m == 0;
    }

    private boolean d1(boolean renderersReadyOrEnded) {
        if (this.I == 0) {
            return L();
        }
        if (!renderersReadyOrEnded) {
            return false;
        }
        l0 l0Var = this.w;
        if (!l0Var.g) {
            return true;
        }
        long targetLiveOffsetUs = e1(l0Var.a, this.r.p().f.a) ? this.t.getTargetLiveOffsetUs() : C.TIME_UNSET;
        f0 f0VarJ = this.r.j();
        return (f0VarJ.q() && f0VarJ.f.i) || (f0VarJ.f.a.isAd() && !f0VarJ.d) || this.e.shouldStartPlayback(x(), this.n.getPlaybackParameters().speed, this.B, targetLiveOffsetUs);
    }

    private void e(b addMessage, int insertionIndex) throws Throwable {
        this.x.incrementPendingOperationAcks(1);
        MediaSourceList mediaSourceList = this.s;
        if (insertionIndex == -1) {
            insertionIndex = mediaSourceList.r();
        }
        C(mediaSourceList.f(insertionIndex, addMessage.a, addMessage.b), false);
    }

    private boolean e1(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.isAd() || timeline.isEmpty()) {
            return false;
        }
        timeline.getWindow(timeline.getPeriodByUid(mediaPeriodId.periodUid, this.k).windowIndex, this.j);
        if (!this.j.isLive()) {
            return false;
        }
        Timeline.Window window = this.j;
        return window.isDynamic && window.windowStartTimeMs != C.TIME_UNSET;
    }

    private void f0() {
        this.x.incrementPendingOperationAcks(1);
        m0(false, false, false, true);
        this.e.onPrepared();
        Z0(this.w.a.isEmpty() ? 4 : 2);
        this.s.y(this.f.getTransferListener());
        this.g.sendEmptyMessage(2);
    }

    private void f1() throws ExoPlaybackException {
        this.B = false;
        this.n.e();
        for (Renderer renderer : this.a) {
            if (K(renderer)) {
                renderer.start();
            }
        }
    }

    private void g() throws ExoPlaybackException {
        x0(true);
    }

    private void h(PlayerMessage message) throws ExoPlaybackException {
        if (message.isCanceled()) {
            return;
        }
        try {
            message.getTarget().handleMessage(message.getType(), message.getPayload());
        } finally {
            message.markAsProcessed(true);
        }
    }

    private void h0() {
        m0(true, false, true, false);
        this.e.onReleased();
        Z0(1);
        this.h.quit();
        synchronized (this) {
            this.y = true;
            notifyAll();
        }
    }

    private void h1(boolean z, boolean z2) {
        m0(z || !this.F, false, true, false);
        this.x.incrementPendingOperationAcks(z2 ? 1 : 0);
        this.e.onStopped();
        Z0(1);
    }

    private void i(Renderer renderer) throws ExoPlaybackException {
        if (K(renderer)) {
            this.n.a(renderer);
            n(renderer);
            renderer.disable();
            this.I--;
        }
    }

    private void i0(int fromIndex, int toIndex, ShuffleOrder shuffleOrder) throws Throwable {
        this.x.incrementPendingOperationAcks(1);
        C(this.s.C(fromIndex, toIndex, shuffleOrder), false);
    }

    private void i1() throws ExoPlaybackException {
        this.n.f();
        for (Renderer renderer : this.a) {
            if (K(renderer)) {
                n(renderer);
            }
        }
    }

    private void j() throws ExoPlaybackException, IOException {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        long jUptimeMillis = this.p.uptimeMillis();
        m1();
        int i2 = this.w.e;
        if (i2 == 1 || i2 == 4) {
            this.g.removeMessages(2);
            return;
        }
        f0 f0VarP = this.r.p();
        if (f0VarP == null) {
            v0(jUptimeMillis, 10L);
            return;
        }
        TraceUtil.beginSection("doSomeWork");
        n1();
        if (f0VarP.d) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            f0VarP.a.discardBuffer(this.w.s - this.l, this.m);
            int i3 = 0;
            z = true;
            z2 = true;
            while (true) {
                Renderer[] rendererArr = this.a;
                if (i3 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i3];
                if (K(renderer)) {
                    renderer.render(this.K, jElapsedRealtime);
                    z = z && renderer.isEnded();
                    boolean z4 = f0VarP.c[i3] != renderer.getStream();
                    boolean z5 = z4 || (!z4 && renderer.hasReadStreamToEnd()) || renderer.isReady() || renderer.isEnded();
                    z2 = z2 && z5;
                    if (!z5) {
                        renderer.maybeThrowStreamError();
                    }
                }
                i3++;
            }
        } else {
            f0VarP.a.maybeThrowPrepareError();
            z = true;
            z2 = true;
        }
        long j = f0VarP.f.e;
        boolean z6 = z && f0VarP.d && (j == C.TIME_UNSET || j <= this.w.s);
        if (z6 && this.A) {
            this.A = false;
            O0(false, this.w.m, false, 5);
        }
        if (z6 && f0VarP.f.i) {
            Z0(4);
            i1();
        } else if (this.w.e == 2 && d1(z2)) {
            Z0(3);
            this.N = null;
            if (c1()) {
                f1();
            }
        } else if (this.w.e == 3 && (this.I != 0 ? !z2 : !L())) {
            this.B = c1();
            Z0(2);
            if (this.B) {
                c0();
                this.t.notifyRebuffer();
            }
            i1();
        }
        if (this.w.e == 2) {
            int i4 = 0;
            while (true) {
                Renderer[] rendererArr2 = this.a;
                if (i4 >= rendererArr2.length) {
                    break;
                }
                if (K(rendererArr2[i4]) && this.a[i4].getStream() == f0VarP.c[i4]) {
                    this.a[i4].maybeThrowStreamError();
                }
                i4++;
            }
            l0 l0Var = this.w;
            if (!l0Var.g && l0Var.r < 500000 && J()) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z7 = this.H;
        l0 l0Var2 = this.w;
        if (z7 != l0Var2.o) {
            this.w = l0Var2.d(z7);
        }
        if ((c1() && this.w.e == 3) || (i = this.w.e) == 2) {
            z3 = !R(jUptimeMillis, 10L);
        } else {
            if (this.I == 0 || i == 4) {
                this.g.removeMessages(2);
            } else {
                v0(jUptimeMillis, 1000L);
            }
            z3 = false;
        }
        l0 l0Var3 = this.w;
        if (l0Var3.p != z3) {
            this.w = l0Var3.i(z3);
        }
        this.G = false;
        TraceUtil.endSection();
    }

    private void j1() {
        f0 f0VarJ = this.r.j();
        boolean z = this.C || (f0VarJ != null && f0VarJ.a.isLoading());
        l0 l0Var = this.w;
        if (z != l0Var.g) {
            this.w = l0Var.a(z);
        }
    }

    private void k(int rendererIndex, boolean wasRendererEnabled) throws ExoPlaybackException {
        Renderer renderer = this.a[rendererIndex];
        if (K(renderer)) {
            return;
        }
        f0 f0VarQ = this.r.q();
        boolean z = f0VarQ == this.r.p();
        TrackSelectorResult trackSelectorResultO = f0VarQ.o();
        RendererConfiguration rendererConfiguration = trackSelectorResultO.rendererConfigurations[rendererIndex];
        Format[] formatArrS = s(trackSelectorResultO.selections[rendererIndex]);
        boolean z2 = c1() && this.w.e == 3;
        boolean z3 = !wasRendererEnabled && z2;
        this.I++;
        renderer.enable(rendererConfiguration, formatArrS, f0VarQ.c[rendererIndex], this.K, z3, z, f0VarQ.m(), f0VarQ.l());
        renderer.handleMessage(103, new a());
        this.n.b(renderer);
        if (z2) {
            renderer.start();
        }
    }

    private boolean k0() throws ExoPlaybackException {
        f0 f0VarQ = this.r.q();
        TrackSelectorResult trackSelectorResultO = f0VarQ.o();
        int i = 0;
        boolean z = false;
        while (true) {
            Renderer[] rendererArr = this.a;
            if (i >= rendererArr.length) {
                return !z;
            }
            Renderer renderer = rendererArr[i];
            if (K(renderer)) {
                boolean z2 = renderer.getStream() != f0VarQ.c[i];
                if (!trackSelectorResultO.isRendererEnabled(i) || z2) {
                    if (!renderer.isCurrentStreamFinal()) {
                        renderer.replaceStream(s(trackSelectorResultO.selections[i]), f0VarQ.c[i], f0VarQ.m(), f0VarQ.l());
                    } else if (renderer.isEnded()) {
                        i(renderer);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    private void k1(Timeline newTimeline, MediaSource.MediaPeriodId newPeriodId, Timeline oldTimeline, MediaSource.MediaPeriodId oldPeriodId, long positionForTargetOffsetOverrideUs) {
        if (newTimeline.isEmpty() || !e1(newTimeline, newPeriodId)) {
            float f2 = this.n.getPlaybackParameters().speed;
            PlaybackParameters playbackParameters = this.w.n;
            if (f2 != playbackParameters.speed) {
                this.n.setPlaybackParameters(playbackParameters);
                return;
            }
            return;
        }
        newTimeline.getWindow(newTimeline.getPeriodByUid(newPeriodId.periodUid, this.k).windowIndex, this.j);
        this.t.setLiveConfiguration((MediaItem.LiveConfiguration) Util.castNonNull(this.j.liveConfiguration));
        if (positionForTargetOffsetOverrideUs != C.TIME_UNSET) {
            this.t.setTargetLiveOffsetOverrideUs(t(newTimeline, newPeriodId.periodUid, positionForTargetOffsetOverrideUs));
            return;
        }
        if (Util.areEqual(oldTimeline.isEmpty() ? null : oldTimeline.getWindow(oldTimeline.getPeriodByUid(oldPeriodId.periodUid, this.k).windowIndex, this.j).uid, this.j.uid)) {
            return;
        }
        this.t.setTargetLiveOffsetOverrideUs(C.TIME_UNSET);
    }

    private void l() throws ExoPlaybackException {
        m(new boolean[this.a.length]);
    }

    private void l0() throws ExoPlaybackException {
        float f2 = this.n.getPlaybackParameters().speed;
        f0 f0VarQ = this.r.q();
        boolean z = true;
        for (f0 f0VarP = this.r.p(); f0VarP != null && f0VarP.d; f0VarP = f0VarP.j()) {
            TrackSelectorResult trackSelectorResultV = f0VarP.v(f2, this.w.a);
            if (!trackSelectorResultV.isEquivalent(f0VarP.o())) {
                if (z) {
                    f0 f0VarP2 = this.r.p();
                    boolean z2 = this.r.z(f0VarP2);
                    boolean[] zArr = new boolean[this.a.length];
                    long jB = f0VarP2.b(trackSelectorResultV, this.w.s, z2, zArr);
                    l0 l0Var = this.w;
                    boolean z3 = (l0Var.e == 4 || jB == l0Var.s) ? false : true;
                    l0 l0Var2 = this.w;
                    this.w = G(l0Var2.b, jB, l0Var2.c, l0Var2.d, z3, 5);
                    if (z3) {
                        o0(jB);
                    }
                    boolean[] zArr2 = new boolean[this.a.length];
                    int i = 0;
                    while (true) {
                        Renderer[] rendererArr = this.a;
                        if (i >= rendererArr.length) {
                            break;
                        }
                        Renderer renderer = rendererArr[i];
                        zArr2[i] = K(renderer);
                        SampleStream sampleStream = f0VarP2.c[i];
                        if (zArr2[i]) {
                            if (sampleStream != renderer.getStream()) {
                                i(renderer);
                            } else if (zArr[i]) {
                                renderer.resetPosition(this.K);
                            }
                        }
                        i++;
                    }
                    m(zArr2);
                } else {
                    this.r.z(f0VarP);
                    if (f0VarP.d) {
                        f0VarP.a(trackSelectorResultV, Math.max(f0VarP.f.b, f0VarP.y(this.K)), false);
                    }
                }
                B(true);
                if (this.w.e != 4) {
                    P();
                    n1();
                    this.g.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            if (f0VarP == f0VarQ) {
                z = false;
            }
        }
    }

    private void l1(TrackGroupArray trackGroups, TrackSelectorResult trackSelectorResult) {
        this.e.onTracksSelected(this.a, trackGroups, trackSelectorResult.selections);
    }

    private void m(boolean[] rendererWasEnabledFlags) throws ExoPlaybackException {
        f0 f0VarQ = this.r.q();
        TrackSelectorResult trackSelectorResultO = f0VarQ.o();
        for (int i = 0; i < this.a.length; i++) {
            if (!trackSelectorResultO.isRendererEnabled(i)) {
                this.a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            if (trackSelectorResultO.isRendererEnabled(i2)) {
                k(i2, rendererWasEnabledFlags[i2]);
            }
        }
        f0VarQ.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009b A[PHI: r4 r5 r7
      0x009b: PHI (r4v3 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId) = 
      (r4v2 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
      (r4v8 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
     binds: [B:29:0x006e, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r5v2 long) = (r5v1 long), (r5v4 long) binds: [B:29:0x006e, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r7v3 long) = (r7v2 long), (r7v5 long) binds: [B:29:0x006e, B:31:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    private void m0(boolean resetRenderers, boolean resetPosition, boolean releaseMediaSourceList, boolean resetError) {
        MediaSource.MediaPeriodId mediaPeriodId;
        long j;
        boolean z;
        this.g.removeMessages(2);
        this.N = null;
        this.B = false;
        this.n.f();
        this.K = 0L;
        for (Renderer renderer : this.a) {
            try {
                i(renderer);
            } catch (ExoPlaybackException | RuntimeException e2) {
                Log.e(P, "Disable failed.", e2);
            }
        }
        if (resetRenderers) {
            for (Renderer renderer2 : this.a) {
                try {
                    renderer2.reset();
                } catch (RuntimeException e3) {
                    Log.e(P, "Reset failed.", e3);
                }
            }
        }
        this.I = 0;
        l0 l0Var = this.w;
        MediaSource.MediaPeriodId mediaPeriodId2 = l0Var.b;
        long jLongValue = l0Var.s;
        long j2 = (this.w.b.isAd() || M(this.w, this.k)) ? this.w.c : this.w.s;
        if (resetPosition) {
            this.J = null;
            Pair<MediaSource.MediaPeriodId, Long> pairV = v(this.w.a);
            mediaPeriodId2 = (MediaSource.MediaPeriodId) pairV.first;
            jLongValue = ((Long) pairV.second).longValue();
            j2 = C.TIME_UNSET;
            if (mediaPeriodId2.equals(this.w.b)) {
                mediaPeriodId = mediaPeriodId2;
                j = jLongValue;
                z = false;
            } else {
                z = true;
                mediaPeriodId = mediaPeriodId2;
                j = jLongValue;
            }
        } else {
            mediaPeriodId = mediaPeriodId2;
            j = jLongValue;
            z = false;
        }
        this.r.f();
        this.C = false;
        l0 l0Var2 = this.w;
        Timeline timeline = l0Var2.a;
        int i = l0Var2.e;
        ExoPlaybackException exoPlaybackException = resetError ? null : l0Var2.f;
        TrackGroupArray trackGroupArray = z ? TrackGroupArray.EMPTY : l0Var2.h;
        TrackSelectorResult trackSelectorResult = z ? this.d : l0Var2.i;
        List listOf = z ? ImmutableList.of() : l0Var2.j;
        l0 l0Var3 = this.w;
        this.w = new l0(timeline, mediaPeriodId, j2, j, i, exoPlaybackException, false, trackGroupArray, trackSelectorResult, listOf, mediaPeriodId, l0Var3.l, l0Var3.m, l0Var3.n, j, 0L, j, this.H, false);
        if (releaseMediaSourceList) {
            this.s.A();
        }
    }

    private void m1() throws ExoPlaybackException, IOException {
        if (this.w.a.isEmpty() || !this.s.t()) {
            return;
        }
        T();
        V();
        W();
        U();
    }

    private void n(Renderer renderer) throws ExoPlaybackException {
        if (renderer.getState() == 2) {
            renderer.stop();
        }
    }

    private void n0() {
        f0 f0VarP = this.r.p();
        this.A = f0VarP != null && f0VarP.f.h && this.z;
    }

    private void n1() throws ExoPlaybackException {
        f0 f0VarP = this.r.p();
        if (f0VarP == null) {
            return;
        }
        long discontinuity = f0VarP.d ? f0VarP.a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != C.TIME_UNSET) {
            o0(discontinuity);
            if (discontinuity != this.w.s) {
                l0 l0Var = this.w;
                this.w = G(l0Var.b, discontinuity, l0Var.c, discontinuity, true, 5);
            }
        } else {
            long jG = this.n.g(f0VarP != this.r.q());
            this.K = jG;
            long jY = f0VarP.y(jG);
            S(this.w.s, jY);
            this.w.s = jY;
        }
        this.w.q = this.r.j().i();
        this.w.r = x();
        l0 l0Var2 = this.w;
        if (l0Var2.l && l0Var2.e == 3 && e1(l0Var2.a, l0Var2.b) && this.w.n.speed == 1.0f) {
            float adjustedPlaybackSpeed = this.t.getAdjustedPlaybackSpeed(r(), x());
            if (this.n.getPlaybackParameters().speed != adjustedPlaybackSpeed) {
                this.n.setPlaybackParameters(this.w.n.withSpeed(adjustedPlaybackSpeed));
                E(this.w.n, this.n.getPlaybackParameters().speed, false, false);
            }
        }
    }

    private void o0(long periodPositionUs) throws ExoPlaybackException {
        f0 f0VarP = this.r.p();
        if (f0VarP != null) {
            periodPositionUs = f0VarP.z(periodPositionUs);
        }
        this.K = periodPositionUs;
        this.n.c(periodPositionUs);
        for (Renderer renderer : this.a) {
            if (K(renderer)) {
                renderer.resetPosition(this.K);
            }
        }
        a0();
    }

    private void o1(float playbackSpeed) {
        for (f0 f0VarP = this.r.p(); f0VarP != null; f0VarP = f0VarP.j()) {
            for (ExoTrackSelection exoTrackSelection : f0VarP.o().selections) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.onPlaybackSpeed(playbackSpeed);
                }
            }
        }
    }

    private static void p0(Timeline timeline, d messageInfo, Timeline.Window window, Timeline.Period period) {
        int i = timeline.getWindow(timeline.getPeriodByUid(messageInfo.d, period).windowIndex, window).lastPeriodIndex;
        Object obj = timeline.getPeriod(i, period, true).uid;
        long j = period.durationUs;
        messageInfo.b(i, j != C.TIME_UNSET ? j - 1 : Long.MAX_VALUE, obj);
    }

    private synchronized void p1(Supplier<Boolean> condition, long timeoutMs) {
        long jElapsedRealtime = this.p.elapsedRealtime() + timeoutMs;
        boolean z = false;
        while (!condition.get().booleanValue() && timeoutMs > 0) {
            try {
                this.p.onThreadBlocked();
                wait(timeoutMs);
            } catch (InterruptedException unused) {
                z = true;
            }
            timeoutMs = jElapsedRealtime - this.p.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private ImmutableList<Metadata> q(ExoTrackSelection[] trackSelections) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        boolean z = false;
        for (ExoTrackSelection exoTrackSelection : trackSelections) {
            if (exoTrackSelection != null) {
                Metadata metadata = exoTrackSelection.getFormat(0).metadata;
                if (metadata == null) {
                    builder.add(new Metadata(new Metadata.Entry[0]));
                } else {
                    builder.add(metadata);
                    z = true;
                }
            }
        }
        return z ? builder.build() : ImmutableList.of();
    }

    private static boolean q0(d pendingMessageInfo, Timeline newTimeline, Timeline previousTimeline, int repeatMode, boolean shuffleModeEnabled, Timeline.Window window, Timeline.Period period) {
        Object obj = pendingMessageInfo.d;
        if (obj == null) {
            Pair<Object, Long> pairT0 = t0(newTimeline, new f(pendingMessageInfo.a.getTimeline(), pendingMessageInfo.a.getWindowIndex(), pendingMessageInfo.a.getPositionMs() == Long.MIN_VALUE ? C.TIME_UNSET : C.msToUs(pendingMessageInfo.a.getPositionMs())), false, repeatMode, shuffleModeEnabled, window, period);
            if (pairT0 == null) {
                return false;
            }
            pendingMessageInfo.b(newTimeline.getIndexOfPeriod(pairT0.first), ((Long) pairT0.second).longValue(), pairT0.first);
            if (pendingMessageInfo.a.getPositionMs() == Long.MIN_VALUE) {
                p0(newTimeline, pendingMessageInfo, window, period);
            }
            return true;
        }
        int indexOfPeriod = newTimeline.getIndexOfPeriod(obj);
        if (indexOfPeriod == -1) {
            return false;
        }
        if (pendingMessageInfo.a.getPositionMs() == Long.MIN_VALUE) {
            p0(newTimeline, pendingMessageInfo, window, period);
            return true;
        }
        pendingMessageInfo.b = indexOfPeriod;
        previousTimeline.getPeriodByUid(pendingMessageInfo.d, period);
        if (period.isPlaceholder && previousTimeline.getWindow(period.windowIndex, window).firstPeriodIndex == previousTimeline.getIndexOfPeriod(pendingMessageInfo.d)) {
            Pair<Object, Long> periodPosition = newTimeline.getPeriodPosition(window, period, newTimeline.getPeriodByUid(pendingMessageInfo.d, period).windowIndex, pendingMessageInfo.c + period.getPositionInWindowUs());
            pendingMessageInfo.b(newTimeline.getIndexOfPeriod(periodPosition.first), ((Long) periodPosition.second).longValue(), periodPosition.first);
        }
        return true;
    }

    private long r() {
        l0 l0Var = this.w;
        return t(l0Var.a, l0Var.b.periodUid, l0Var.s);
    }

    private void r0(Timeline newTimeline, Timeline previousTimeline) {
        if (newTimeline.isEmpty() && previousTimeline.isEmpty()) {
            return;
        }
        for (int size = this.o.size() - 1; size >= 0; size--) {
            if (!q0(this.o.get(size), newTimeline, previousTimeline, this.D, this.E, this.j, this.k)) {
                this.o.get(size).a.markAsProcessed(false);
                this.o.remove(size);
            }
        }
        Collections.sort(this.o);
    }

    private static Format[] s(ExoTrackSelection newSelection) {
        int length = newSelection != null ? newSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = newSelection.getFormat(i);
        }
        return formatArr;
    }

    private static e s0(Timeline timeline, l0 playbackInfo, @Nullable f pendingInitialSeekPosition, i0 queue, int repeatMode, boolean shuffleModeEnabled, Timeline.Window window, Timeline.Period period) {
        MediaSource.MediaPeriodId mediaPeriodId;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int firstWindowIndex;
        int firstWindowIndex2;
        boolean z4;
        long j;
        int i3;
        boolean z5;
        int firstWindowIndex3;
        boolean z6;
        boolean z7;
        if (timeline.isEmpty()) {
            return new e(l0.l(), 0L, C.TIME_UNSET, false, true, false);
        }
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.b;
        Object obj = mediaPeriodId2.periodUid;
        boolean zM = M(playbackInfo, period);
        long jLongValue = (playbackInfo.b.isAd() || zM) ? playbackInfo.c : playbackInfo.s;
        boolean z8 = false;
        if (pendingInitialSeekPosition != null) {
            i = -1;
            Pair<Object, Long> pairT0 = t0(timeline, pendingInitialSeekPosition, true, repeatMode, shuffleModeEnabled, window, period);
            if (pairT0 == null) {
                firstWindowIndex3 = timeline.getFirstWindowIndex(shuffleModeEnabled);
                jLongValue = jLongValue;
                z5 = false;
                z6 = false;
                z7 = true;
            } else {
                if (pendingInitialSeekPosition.c == C.TIME_UNSET) {
                    firstWindowIndex3 = timeline.getPeriodByUid(pairT0.first, period).windowIndex;
                    jLongValue = jLongValue;
                    z5 = false;
                } else {
                    obj = pairT0.first;
                    jLongValue = ((Long) pairT0.second).longValue();
                    z5 = true;
                    firstWindowIndex3 = -1;
                }
                z6 = playbackInfo.e == 4;
                z7 = false;
            }
            z3 = z5;
            z = z6;
            z2 = z7;
            i2 = firstWindowIndex3;
            mediaPeriodId = mediaPeriodId2;
        } else {
            mediaPeriodId = mediaPeriodId2;
            i = -1;
            if (playbackInfo.a.isEmpty()) {
                firstWindowIndex = timeline.getFirstWindowIndex(shuffleModeEnabled);
            } else if (timeline.getIndexOfPeriod(obj) == -1) {
                Object objU0 = u0(window, period, repeatMode, shuffleModeEnabled, obj, playbackInfo.a, timeline);
                if (objU0 == null) {
                    firstWindowIndex2 = timeline.getFirstWindowIndex(shuffleModeEnabled);
                    z4 = true;
                } else {
                    firstWindowIndex2 = timeline.getPeriodByUid(objU0, period).windowIndex;
                    z4 = false;
                }
                i2 = firstWindowIndex2;
                z2 = z4;
                jLongValue = jLongValue;
                mediaPeriodId = mediaPeriodId;
                z = false;
                z3 = false;
            } else if (jLongValue == C.TIME_UNSET) {
                firstWindowIndex = timeline.getPeriodByUid(obj, period).windowIndex;
            } else if (zM) {
                mediaPeriodId = mediaPeriodId;
                playbackInfo.a.getPeriodByUid(mediaPeriodId.periodUid, period);
                if (playbackInfo.a.getWindow(period.windowIndex, window).firstPeriodIndex == playbackInfo.a.getIndexOfPeriod(mediaPeriodId.periodUid)) {
                    Pair<Object, Long> periodPosition = timeline.getPeriodPosition(window, period, timeline.getPeriodByUid(obj, period).windowIndex, jLongValue + period.getPositionInWindowUs());
                    obj = periodPosition.first;
                    jLongValue = ((Long) periodPosition.second).longValue();
                } else {
                    jLongValue = jLongValue;
                }
                i2 = -1;
                z = false;
                z2 = false;
                z3 = true;
            } else {
                i2 = -1;
                z = false;
                z2 = false;
                z3 = false;
            }
            i2 = firstWindowIndex;
            z = false;
            z2 = false;
            z3 = false;
        }
        if (i2 != i) {
            Pair<Object, Long> periodPosition2 = timeline.getPeriodPosition(window, period, i2, C.TIME_UNSET);
            obj = periodPosition2.first;
            jLongValue = ((Long) periodPosition2.second).longValue();
            j = -9223372036854775807L;
        } else {
            j = jLongValue;
        }
        MediaSource.MediaPeriodId mediaPeriodIdA = queue.A(timeline, obj, jLongValue);
        boolean z9 = mediaPeriodIdA.nextAdGroupIndex == i || ((i3 = mediaPeriodId.nextAdGroupIndex) != i && mediaPeriodIdA.adGroupIndex >= i3);
        boolean zEquals = mediaPeriodId.periodUid.equals(obj);
        boolean z10 = zEquals && !mediaPeriodId.isAd() && !mediaPeriodIdA.isAd() && z9;
        timeline.getPeriodByUid(obj, period);
        if (zEquals && !zM && jLongValue == j && ((mediaPeriodIdA.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodIdA.adGroupIndex)) || (mediaPeriodId.isAd() && period.isServerSideInsertedAdGroup(mediaPeriodId.adGroupIndex)))) {
            z8 = true;
        }
        if (z10 || z8) {
            mediaPeriodIdA = mediaPeriodId;
        }
        if (mediaPeriodIdA.isAd()) {
            if (mediaPeriodIdA.equals(mediaPeriodId)) {
                jLongValue = playbackInfo.s;
            } else {
                timeline.getPeriodByUid(mediaPeriodIdA.periodUid, period);
                jLongValue = mediaPeriodIdA.adIndexInAdGroup == period.getFirstAdIndexToPlay(mediaPeriodIdA.adGroupIndex) ? period.getAdResumePositionUs() : 0L;
            }
        }
        return new e(mediaPeriodIdA, jLongValue, j, z, z2, z3);
    }

    private long t(Timeline timeline, Object periodUid, long periodPositionUs) {
        timeline.getWindow(timeline.getPeriodByUid(periodUid, this.k).windowIndex, this.j);
        Timeline.Window window = this.j;
        if (window.windowStartTimeMs != C.TIME_UNSET && window.isLive()) {
            Timeline.Window window2 = this.j;
            if (window2.isDynamic) {
                return C.msToUs(window2.getCurrentUnixTimeMs() - this.j.windowStartTimeMs) - (periodPositionUs + this.k.getPositionInWindowUs());
            }
        }
        return C.TIME_UNSET;
    }

    @Nullable
    private static Pair<Object, Long> t0(Timeline timeline, f seekPosition, boolean trySubsequentPeriods, int repeatMode, boolean shuffleModeEnabled, Timeline.Window window, Timeline.Period period) {
        Object objU0;
        Timeline timeline2 = seekPosition.a;
        if (timeline.isEmpty()) {
            return null;
        }
        Timeline timeline3 = timeline2.isEmpty() ? timeline : timeline2;
        try {
            Pair<Object, Long> periodPosition = timeline3.getPeriodPosition(window, period, seekPosition.b, seekPosition.c);
            if (timeline.equals(timeline3)) {
                return periodPosition;
            }
            if (timeline.getIndexOfPeriod(periodPosition.first) != -1) {
                return (timeline3.getPeriodByUid(periodPosition.first, period).isPlaceholder && timeline3.getWindow(period.windowIndex, window).firstPeriodIndex == timeline3.getIndexOfPeriod(periodPosition.first)) ? timeline.getPeriodPosition(window, period, timeline.getPeriodByUid(periodPosition.first, period).windowIndex, seekPosition.c) : periodPosition;
            }
            if (trySubsequentPeriods && (objU0 = u0(window, period, repeatMode, shuffleModeEnabled, periodPosition.first, timeline3, timeline)) != null) {
                return timeline.getPeriodPosition(window, period, timeline.getPeriodByUid(objU0, period).windowIndex, C.TIME_UNSET);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private long u() {
        f0 f0VarQ = this.r.q();
        if (f0VarQ == null) {
            return 0L;
        }
        long jL = f0VarQ.l();
        if (!f0VarQ.d) {
            return jL;
        }
        int i = 0;
        while (true) {
            Renderer[] rendererArr = this.a;
            if (i >= rendererArr.length) {
                return jL;
            }
            if (K(rendererArr[i]) && this.a[i].getStream() == f0VarQ.c[i]) {
                long readingPositionUs = this.a[i].getReadingPositionUs();
                if (readingPositionUs == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jL = Math.max(readingPositionUs, jL);
            }
            i++;
        }
    }

    @Nullable
    public static Object u0(Timeline.Window window, Timeline.Period period, int repeatMode, boolean shuffleModeEnabled, Object oldPeriodUid, Timeline oldTimeline, Timeline newTimeline) {
        int indexOfPeriod = oldTimeline.getIndexOfPeriod(oldPeriodUid);
        int periodCount = oldTimeline.getPeriodCount();
        int nextPeriodIndex = indexOfPeriod;
        int indexOfPeriod2 = -1;
        for (int i = 0; i < periodCount && indexOfPeriod2 == -1; i++) {
            nextPeriodIndex = oldTimeline.getNextPeriodIndex(nextPeriodIndex, period, window, repeatMode, shuffleModeEnabled);
            if (nextPeriodIndex == -1) {
                break;
            }
            indexOfPeriod2 = newTimeline.getIndexOfPeriod(oldTimeline.getUidOfPeriod(nextPeriodIndex));
        }
        if (indexOfPeriod2 == -1) {
            return null;
        }
        return newTimeline.getUidOfPeriod(indexOfPeriod2);
    }

    private Pair<MediaSource.MediaPeriodId, Long> v(Timeline timeline) {
        if (timeline.isEmpty()) {
            return Pair.create(l0.l(), 0L);
        }
        Pair<Object, Long> periodPosition = timeline.getPeriodPosition(this.j, this.k, timeline.getFirstWindowIndex(this.E), C.TIME_UNSET);
        MediaSource.MediaPeriodId mediaPeriodIdA = this.r.A(timeline, periodPosition.first, 0L);
        long jLongValue = ((Long) periodPosition.second).longValue();
        if (mediaPeriodIdA.isAd()) {
            timeline.getPeriodByUid(mediaPeriodIdA.periodUid, this.k);
            jLongValue = mediaPeriodIdA.adIndexInAdGroup == this.k.getFirstAdIndexToPlay(mediaPeriodIdA.adGroupIndex) ? this.k.getAdResumePositionUs() : 0L;
        }
        return Pair.create(mediaPeriodIdA, Long.valueOf(jLongValue));
    }

    private void v0(long thisOperationStartTimeMs, long intervalMs) {
        this.g.removeMessages(2);
        this.g.sendEmptyMessageAtTime(2, thisOperationStartTimeMs + intervalMs);
    }

    private long x() {
        return y(this.w.q);
    }

    private void x0(boolean sendDiscontinuity) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.r.p().f.a;
        long jA0 = A0(mediaPeriodId, this.w.s, true, false);
        if (jA0 != this.w.s) {
            l0 l0Var = this.w;
            this.w = G(mediaPeriodId, jA0, l0Var.c, l0Var.d, sendDiscontinuity, 5);
        }
    }

    private long y(long bufferedPositionInLoadingPeriodUs) {
        f0 f0VarJ = this.r.j();
        if (f0VarJ == null) {
            return 0L;
        }
        return Math.max(0L, bufferedPositionInLoadingPeriodUs - f0VarJ.y(this.K));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00ab A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:74:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:74:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:74:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0 A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:74:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca A[Catch: all -> 0x0147, TryCatch #1 {all -> 0x0147, blocks: (B:22:0x00a1, B:24:0x00ab, B:27:0x00b1, B:29:0x00b7, B:30:0x00ba, B:32:0x00c0, B:34:0x00ca, B:36:0x00d2, B:40:0x00da, B:42:0x00e4, B:44:0x00f4, B:48:0x00fe, B:52:0x0110, B:56:0x0119), top: B:74:0x00a1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:51:0x010f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x0122  */
    private void y0(f seekPosition) throws Throwable {
        long jLongValue;
        long j;
        boolean z;
        MediaSource.MediaPeriodId mediaPeriodId;
        long adResumePositionUs;
        long j2;
        long j3;
        long adjustedSeekPositionUs;
        boolean z2;
        long jZ0;
        boolean z3;
        long j4;
        f0 f0VarP;
        l0 l0Var;
        int i;
        this.x.incrementPendingOperationAcks(1);
        Pair<Object, Long> pairT0 = t0(this.w.a, seekPosition, true, this.D, this.E, this.j, this.k);
        try {
            if (pairT0 != null) {
                Object obj = pairT0.first;
                jLongValue = ((Long) pairT0.second).longValue();
                long j5 = seekPosition.c == C.TIME_UNSET ? -9223372036854775807L : jLongValue;
                MediaSource.MediaPeriodId mediaPeriodIdA = this.r.A(this.w.a, obj, jLongValue);
                if (mediaPeriodIdA.isAd()) {
                    this.w.a.getPeriodByUid(mediaPeriodIdA.periodUid, this.k);
                    adResumePositionUs = this.k.getFirstAdIndexToPlay(mediaPeriodIdA.adGroupIndex) == mediaPeriodIdA.adIndexInAdGroup ? this.k.getAdResumePositionUs() : 0L;
                    j2 = j5;
                    z = true;
                    mediaPeriodId = mediaPeriodIdA;
                } else {
                    j = j5;
                    z = seekPosition.c == C.TIME_UNSET;
                    mediaPeriodId = mediaPeriodIdA;
                }
                if (this.w.a.isEmpty()) {
                    if (pairT0 == null) {
                        if (this.w.e != 1) {
                            Z0(4);
                        }
                        m0(false, true, false, true);
                    } else {
                        if (mediaPeriodId.equals(this.w.b)) {
                            f0VarP = this.r.p();
                            if (f0VarP == null && f0VarP.d && adResumePositionUs != 0) {
                                adjustedSeekPositionUs = f0VarP.a.getAdjustedSeekPositionUs(adResumePositionUs, this.v);
                            } else {
                                adjustedSeekPositionUs = adResumePositionUs;
                            }
                            if (C.usToMs(adjustedSeekPositionUs) == C.usToMs(this.w.s) && ((i = (l0Var = this.w).e) == 2 || i == 3)) {
                                long j6 = l0Var.s;
                                this.w = G(mediaPeriodId, j6, j2, j6, z, 2);
                                return;
                            }
                        } else {
                            adjustedSeekPositionUs = adResumePositionUs;
                        }
                        if (this.w.e == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        jZ0 = z0(mediaPeriodId, adjustedSeekPositionUs, z2);
                        z3 = (adResumePositionUs != jZ0) | z;
                        try {
                            l0 l0Var2 = this.w;
                            Timeline timeline = l0Var2.a;
                            k1(timeline, mediaPeriodId, timeline, l0Var2.b, j2);
                            z = z3;
                            j4 = jZ0;
                        } catch (Throwable th) {
                            th = th;
                            z = z3;
                            j3 = jZ0;
                            this.w = G(mediaPeriodId, j3, j2, j3, z, 2);
                            throw th;
                        }
                    }
                    this.w = G(mediaPeriodId, j4, j2, j4, z, 2);
                    return;
                }
                this.J = seekPosition;
                j4 = adResumePositionUs;
                this.w = G(mediaPeriodId, j4, j2, j4, z, 2);
                return;
            }
            Pair<MediaSource.MediaPeriodId, Long> pairV = v(this.w.a);
            mediaPeriodId = (MediaSource.MediaPeriodId) pairV.first;
            jLongValue = ((Long) pairV.second).longValue();
            z = !this.w.a.isEmpty();
            j = -9223372036854775807L;
            if (this.w.a.isEmpty()) {
                if (pairT0 == null) {
                    if (this.w.e != 1) {
                        Z0(4);
                    }
                    m0(false, true, false, true);
                } else {
                    if (mediaPeriodId.equals(this.w.b)) {
                        f0VarP = this.r.p();
                        if (f0VarP == null) {
                            adjustedSeekPositionUs = adResumePositionUs;
                        } else {
                            adjustedSeekPositionUs = adResumePositionUs;
                        }
                        if (C.usToMs(adjustedSeekPositionUs) == C.usToMs(this.w.s)) {
                            long j7 = l0Var.s;
                            this.w = G(mediaPeriodId, j7, j2, j7, z, 2);
                            return;
                        }
                    } else {
                        adjustedSeekPositionUs = adResumePositionUs;
                    }
                    if (this.w.e == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jZ0 = z0(mediaPeriodId, adjustedSeekPositionUs, z2);
                    z3 = (adResumePositionUs != jZ0) | z;
                    l0 l0Var3 = this.w;
                    Timeline timeline2 = l0Var3.a;
                    k1(timeline2, mediaPeriodId, timeline2, l0Var3.b, j2);
                    z = z3;
                    j4 = jZ0;
                }
                this.w = G(mediaPeriodId, j4, j2, j4, z, 2);
                return;
            }
            this.J = seekPosition;
            j4 = adResumePositionUs;
            this.w = G(mediaPeriodId, j4, j2, j4, z, 2);
            return;
        } catch (Throwable th2) {
            th = th2;
            j3 = adResumePositionUs;
        }
        adResumePositionUs = jLongValue;
        j2 = j;
    }

    private void z(MediaPeriod mediaPeriod) {
        if (this.r.v(mediaPeriod)) {
            this.r.y(this.K);
            P();
        }
    }

    private long z0(MediaSource.MediaPeriodId periodId, long periodPositionUs, boolean forceBufferingState) throws ExoPlaybackException {
        return A0(periodId, periodPositionUs, this.r.p() != this.r.q(), forceBufferingState);
    }

    public synchronized boolean G0(boolean foregroundMode) {
        if (!this.y && this.h.isAlive()) {
            if (foregroundMode) {
                this.g.obtainMessage(13, 1, 0).sendToTarget();
                return true;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.g.obtainMessage(13, 0, 0, atomicBoolean).sendToTarget();
            p1(new Supplier() { // from class: yw1
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, this.O);
            return atomicBoolean.get();
        }
        return true;
    }

    public void J0(List<MediaSourceList.c> mediaSources, int windowIndex, long positionUs, ShuffleOrder shuffleOrder) {
        this.g.obtainMessage(17, new b(mediaSources, shuffleOrder, windowIndex, positionUs, null)).sendToTarget();
    }

    public void L0(boolean z) {
        this.g.obtainMessage(23, z ? 1 : 0, 0).sendToTarget();
    }

    public void N0(boolean z, int i) {
        this.g.obtainMessage(1, z ? 1 : 0, i).sendToTarget();
    }

    public void P0(PlaybackParameters playbackParameters) {
        this.g.obtainMessage(4, playbackParameters).sendToTarget();
    }

    public void R0(int repeatMode) {
        this.g.obtainMessage(11, repeatMode, 0).sendToTarget();
    }

    public void T0(SeekParameters seekParameters) {
        this.g.obtainMessage(5, seekParameters).sendToTarget();
    }

    public void V0(boolean z) {
        this.g.obtainMessage(12, z ? 1 : 0, 0).sendToTarget();
    }

    public void X0(ShuffleOrder shuffleOrder) {
        this.g.obtainMessage(21, shuffleOrder).sendToTarget();
    }

    public void Z(int fromIndex, int toIndex, int newFromIndex, ShuffleOrder shuffleOrder) {
        this.g.obtainMessage(19, new c(fromIndex, toIndex, newFromIndex, shuffleOrder)).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void onContinueLoadingRequested(MediaPeriod source) {
        this.g.obtainMessage(9, source).sendToTarget();
    }

    public void e0() {
        this.g.obtainMessage(0).sendToTarget();
    }

    public void f(int index, List<MediaSourceList.c> mediaSources, ShuffleOrder shuffleOrder) {
        this.g.obtainMessage(18, index, 0, new b(mediaSources, shuffleOrder, -1, C.TIME_UNSET, null)).sendToTarget();
    }

    public synchronized boolean g0() {
        if (!this.y && this.h.isAlive()) {
            this.g.sendEmptyMessage(7);
            p1(new Supplier() { // from class: com.google.android.exoplayer2.d0
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return this.a.N();
                }
            }, this.u);
            return this.y;
        }
        return true;
    }

    public void g1() {
        this.g.obtainMessage(6).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message msg) throws Throwable {
        f0 f0VarQ;
        int i = 1000;
        try {
            switch (msg.what) {
                case 0:
                    f0();
                    break;
                case 1:
                    O0(msg.arg1 != 0, msg.arg2, true, 1);
                    break;
                case 2:
                    j();
                    break;
                case 3:
                    y0((f) msg.obj);
                    break;
                case 4:
                    Q0((PlaybackParameters) msg.obj);
                    break;
                case 5:
                    U0((SeekParameters) msg.obj);
                    break;
                case 6:
                    h1(false, true);
                    break;
                case 7:
                    h0();
                    return true;
                case 8:
                    D((MediaPeriod) msg.obj);
                    break;
                case 9:
                    z((MediaPeriod) msg.obj);
                    break;
                case 10:
                    l0();
                    break;
                case 11:
                    S0(msg.arg1);
                    break;
                case 12:
                    W0(msg.arg1 != 0);
                    break;
                case 13:
                    H0(msg.arg1 != 0, (AtomicBoolean) msg.obj);
                    break;
                case 14:
                    B0((PlayerMessage) msg.obj);
                    break;
                case 15:
                    D0((PlayerMessage) msg.obj);
                    break;
                case 16:
                    F((PlaybackParameters) msg.obj, false);
                    break;
                case 17:
                    I0((b) msg.obj);
                    break;
                case 18:
                    e((b) msg.obj, msg.arg1);
                    break;
                case 19:
                    Y((c) msg.obj);
                    break;
                case 20:
                    i0(msg.arg1, msg.arg2, (ShuffleOrder) msg.obj);
                    break;
                case 21:
                    Y0((ShuffleOrder) msg.obj);
                    break;
                case 22:
                    X();
                    break;
                case 23:
                    M0(msg.arg1 != 0);
                    break;
                case 24:
                    K0(msg.arg1 == 1);
                    break;
                case 25:
                    g();
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.type == 1 && (f0VarQ = this.r.q()) != null) {
                e = e.f(f0VarQ.f.a);
            }
            if (e.f && this.N == null) {
                Log.w(P, "Recoverable renderer error", e);
                this.N = e;
                HandlerWrapper handlerWrapper = this.g;
                handlerWrapper.sendMessageAtFrontOfQueue(handlerWrapper.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.N;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.N;
                }
                Log.e(P, "Playback error", e);
                h1(true, false);
                this.w = this.w.f(e);
            }
        } catch (ParserException e3) {
            int i2 = e3.dataType;
            if (i2 == 1) {
                i = e3.contentIsMalformed ? 3001 : 3003;
            } else if (i2 == 4) {
                i = e3.contentIsMalformed ? 3002 : 3004;
            }
            A(e3, i);
        } catch (DrmSession.DrmSessionException e4) {
            A(e4, e4.errorCode);
        } catch (BehindLiveWindowException e5) {
            A(e5, 1002);
        } catch (DataSourceException e6) {
            A(e6, e6.reason);
        } catch (IOException e7) {
            A(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackExceptionCreateForUnexpected = ExoPlaybackException.createForUnexpected(e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.e(P, "Playback error", exoPlaybackExceptionCreateForUnexpected);
            h1(true, false);
            this.w = this.w.f(exoPlaybackExceptionCreateForUnexpected);
        }
        Q();
        return true;
    }

    public void j0(int fromIndex, int toIndex, ShuffleOrder shuffleOrder) {
        this.g.obtainMessage(20, fromIndex, toIndex, shuffleOrder).sendToTarget();
    }

    public void o(long setForegroundModeTimeoutMs) {
        this.O = setForegroundModeTimeoutMs;
    }

    @Override // com.google.android.exoplayer2.DefaultMediaClock.PlaybackParametersListener
    public void onPlaybackParametersChanged(PlaybackParameters newPlaybackParameters) {
        this.g.obtainMessage(16, newPlaybackParameters).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.MediaSourceList.MediaSourceListInfoRefreshListener
    public void onPlaylistUpdateRequested() {
        this.g.sendEmptyMessage(22);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public void onPrepared(MediaPeriod source) {
        this.g.obtainMessage(8, source).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
    public void onTrackSelectionsInvalidated() {
        this.g.sendEmptyMessage(10);
    }

    public void p(boolean z) {
        this.g.obtainMessage(24, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public synchronized void sendMessage(PlayerMessage message) {
        if (!this.y && this.h.isAlive()) {
            this.g.obtainMessage(14, message).sendToTarget();
            return;
        }
        Log.w(P, "Ignoring messages sent after release.");
        message.markAsProcessed(false);
    }

    public Looper w() {
        return this.i;
    }

    public void w0(Timeline timeline, int windowIndex, long positionUs) {
        this.g.obtainMessage(3, new f(timeline, windowIndex, positionUs)).sendToTarget();
    }
}
