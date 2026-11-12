package com.google.android.exoplayer2.analytics;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
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

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStatsListener implements AnalyticsListener, PlaybackSessionManager.Listener {
    private final PlaybackSessionManager a;
    private final Map<String, a> b;
    private final Map<String, AnalyticsListener.EventTime> c;

    @Nullable
    private final Callback d;
    private final boolean e;
    private final Timeline.Period f;
    private PlaybackStats g;

    @Nullable
    private String h;
    private long i;
    private int j;
    private int k;

    @Nullable
    private Exception l;
    private long m;
    private long n;

    @Nullable
    private Format o;

    @Nullable
    private Format p;
    private VideoSize q;

    public interface Callback {
        void onPlaybackStatsReady(AnalyticsListener.EventTime eventTime, PlaybackStats playbackStats);
    }

    public static final class a {
        private long A;
        private long B;
        private long C;
        private long D;
        private long E;
        private int F;
        private int G;
        private int H;
        private long I;
        private boolean J;
        private boolean K;
        private boolean L;
        private boolean M;
        private boolean N;
        private long O;

        @Nullable
        private Format P;

        @Nullable
        private Format Q;
        private long R;
        private long S;
        private float T;
        private final boolean a;
        private final long[] b = new long[16];
        private final List<PlaybackStats.EventTimeAndPlaybackState> c;
        private final List<long[]> d;
        private final List<PlaybackStats.EventTimeAndFormat> e;
        private final List<PlaybackStats.EventTimeAndFormat> f;
        private final List<PlaybackStats.EventTimeAndException> g;
        private final List<PlaybackStats.EventTimeAndException> h;
        private final boolean i;
        private long j;
        private boolean k;
        private boolean l;
        private boolean m;
        private int n;
        private int o;
        private int p;
        private int q;
        private long r;
        private int s;
        private long t;
        private long u;
        private long v;
        private long w;
        private long x;
        private long y;
        private long z;

        public a(boolean keepHistory, AnalyticsListener.EventTime startTime) {
            this.a = keepHistory;
            this.c = keepHistory ? new ArrayList<>() : Collections.emptyList();
            this.d = keepHistory ? new ArrayList<>() : Collections.emptyList();
            this.e = keepHistory ? new ArrayList<>() : Collections.emptyList();
            this.f = keepHistory ? new ArrayList<>() : Collections.emptyList();
            this.g = keepHistory ? new ArrayList<>() : Collections.emptyList();
            this.h = keepHistory ? new ArrayList<>() : Collections.emptyList();
            boolean z = false;
            this.H = 0;
            this.I = startTime.realtimeMs;
            this.j = C.TIME_UNSET;
            this.r = C.TIME_UNSET;
            MediaSource.MediaPeriodId mediaPeriodId = startTime.mediaPeriodId;
            if (mediaPeriodId != null && mediaPeriodId.isAd()) {
                z = true;
            }
            this.i = z;
            this.u = -1L;
            this.t = -1L;
            this.s = -1;
            this.T = 1.0f;
        }

        private long[] b(long realtimeMs) {
            List<long[]> list = this.d;
            long[] jArr = list.get(list.size() - 1);
            return new long[]{realtimeMs, jArr[1] + ((long) ((realtimeMs - jArr[0]) * this.T))};
        }

        private static boolean c(int oldState, int newState) {
            return ((oldState != 1 && oldState != 2 && oldState != 14) || newState == 1 || newState == 2 || newState == 14 || newState == 3 || newState == 4 || newState == 9 || newState == 11) ? false : true;
        }

        private static boolean d(int state) {
            return state == 4 || state == 7;
        }

        private static boolean e(int state) {
            return state == 3 || state == 4 || state == 9;
        }

        private static boolean f(int state) {
            return state == 6 || state == 7 || state == 10;
        }

        private void g(long nowMs) {
            Format format;
            int i;
            if (this.H == 3 && (format = this.Q) != null && (i = format.bitrate) != -1) {
                long j = (long) ((nowMs - this.S) * this.T);
                this.z += j;
                this.A += j * ((long) i);
            }
            this.S = nowMs;
        }

        private void h(long nowMs) {
            Format format;
            if (this.H == 3 && (format = this.P) != null) {
                long j = (long) ((nowMs - this.R) * this.T);
                int i = format.height;
                if (i != -1) {
                    this.v += j;
                    this.w += ((long) i) * j;
                }
                int i2 = format.bitrate;
                if (i2 != -1) {
                    this.x += j;
                    this.y += j * ((long) i2);
                }
            }
            this.R = nowMs;
        }

        private void i(AnalyticsListener.EventTime eventTime, @Nullable Format newFormat) {
            int i;
            if (Util.areEqual(this.Q, newFormat)) {
                return;
            }
            g(eventTime.realtimeMs);
            if (newFormat != null && this.u == -1 && (i = newFormat.bitrate) != -1) {
                this.u = i;
            }
            this.Q = newFormat;
            if (this.a) {
                this.f.add(new PlaybackStats.EventTimeAndFormat(eventTime, newFormat));
            }
        }

        private void j(long nowMs) {
            if (f(this.H)) {
                long j = nowMs - this.O;
                long j2 = this.r;
                if (j2 == C.TIME_UNSET || j > j2) {
                    this.r = j;
                }
            }
        }

        private void k(long realtimeMs, long mediaTimeMs) {
            if (this.a) {
                if (this.H != 3) {
                    if (mediaTimeMs == C.TIME_UNSET) {
                        return;
                    }
                    if (!this.d.isEmpty()) {
                        List<long[]> list = this.d;
                        long j = list.get(list.size() - 1)[1];
                        if (j != mediaTimeMs) {
                            this.d.add(new long[]{realtimeMs, j});
                        }
                    }
                }
                this.d.add(mediaTimeMs == C.TIME_UNSET ? b(realtimeMs) : new long[]{realtimeMs, mediaTimeMs});
            }
        }

        private void l(AnalyticsListener.EventTime eventTime, @Nullable Format newFormat) {
            int i;
            int i2;
            if (Util.areEqual(this.P, newFormat)) {
                return;
            }
            h(eventTime.realtimeMs);
            if (newFormat != null) {
                if (this.s == -1 && (i2 = newFormat.height) != -1) {
                    this.s = i2;
                }
                if (this.t == -1 && (i = newFormat.bitrate) != -1) {
                    this.t = i;
                }
            }
            this.P = newFormat;
            if (this.a) {
                this.e.add(new PlaybackStats.EventTimeAndFormat(eventTime, newFormat));
            }
        }

        private int q(Player player) {
            int playbackState = player.getPlaybackState();
            if (this.J && this.K) {
                return 5;
            }
            if (this.M) {
                return 13;
            }
            if (!this.K) {
                return this.N ? 1 : 0;
            }
            if (this.L) {
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
                if (playbackState != 1 || this.H == 0) {
                    return this.H;
                }
                return 12;
            }
            int i = this.H;
            if (i == 0 || i == 1 || i == 2 || i == 14) {
                return 2;
            }
            if (player.getPlayWhenReady()) {
                return player.getPlaybackSuppressionReason() != 0 ? 10 : 6;
            }
            return 7;
        }

        private void r(int newPlaybackState, AnalyticsListener.EventTime eventTime) {
            Assertions.checkArgument(eventTime.realtimeMs >= this.I);
            long j = eventTime.realtimeMs;
            long j2 = j - this.I;
            long[] jArr = this.b;
            int i = this.H;
            jArr[i] = jArr[i] + j2;
            if (this.j == C.TIME_UNSET) {
                this.j = j;
            }
            this.m |= c(i, newPlaybackState);
            this.k |= e(newPlaybackState);
            this.l |= newPlaybackState == 11;
            if (!d(this.H) && d(newPlaybackState)) {
                this.n++;
            }
            if (newPlaybackState == 5) {
                this.p++;
            }
            if (!f(this.H) && f(newPlaybackState)) {
                this.q++;
                this.O = eventTime.realtimeMs;
            }
            if (f(this.H) && this.H != 7 && newPlaybackState == 7) {
                this.o++;
            }
            j(eventTime.realtimeMs);
            this.H = newPlaybackState;
            this.I = eventTime.realtimeMs;
            if (this.a) {
                this.c.add(new PlaybackStats.EventTimeAndPlaybackState(eventTime, newPlaybackState));
            }
        }

        public PlaybackStats a(boolean z) {
            long[] jArr;
            List<long[]> list;
            long[] jArr2 = this.b;
            List<long[]> list2 = this.d;
            if (z) {
                jArr = jArr2;
                list = list2;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long[] jArrCopyOf = Arrays.copyOf(this.b, 16);
                long jMax = Math.max(0L, jElapsedRealtime - this.I);
                int i = this.H;
                jArrCopyOf[i] = jArrCopyOf[i] + jMax;
                j(jElapsedRealtime);
                h(jElapsedRealtime);
                g(jElapsedRealtime);
                ArrayList arrayList = new ArrayList(this.d);
                if (this.a && this.H == 3) {
                    arrayList.add(b(jElapsedRealtime));
                }
                jArr = jArrCopyOf;
                list = arrayList;
            }
            int i2 = (this.m || !this.k) ? 1 : 0;
            long j = i2 != 0 ? C.TIME_UNSET : jArr[2];
            int i3 = jArr[1] > 0 ? 1 : 0;
            List arrayList2 = z ? this.e : new ArrayList(this.e);
            List arrayList3 = z ? this.f : new ArrayList(this.f);
            List arrayList4 = z ? this.c : new ArrayList(this.c);
            long j2 = this.j;
            boolean z2 = this.K;
            int i4 = !this.k ? 1 : 0;
            boolean z3 = this.l;
            int i5 = i2 ^ 1;
            int i6 = this.n;
            int i7 = this.o;
            int i8 = this.p;
            int i9 = this.q;
            long j3 = this.r;
            boolean z4 = this.i;
            long[] jArr3 = jArr;
            long j4 = this.v;
            long j5 = this.w;
            long j6 = this.x;
            long j7 = this.y;
            long j8 = this.z;
            long j9 = this.A;
            int i10 = this.s;
            int i11 = i10 == -1 ? 0 : 1;
            long j10 = this.t;
            int i12 = j10 == -1 ? 0 : 1;
            long j11 = this.u;
            int i13 = j11 == -1 ? 0 : 1;
            long j12 = this.B;
            long j13 = this.C;
            long j14 = this.D;
            long j15 = this.E;
            int i14 = this.F;
            return new PlaybackStats(1, jArr3, arrayList4, list, j2, z2 ? 1 : 0, i4, z3 ? 1 : 0, i3, j, i5, i6, i7, i8, i9, j3, z4 ? 1 : 0, arrayList2, arrayList3, j4, j5, j6, j7, j8, j9, i11, i12, i10, j10, i13, j11, j12, j13, j14, j15, i14 > 0 ? 1 : 0, i14, this.G, this.g, this.h);
        }

        public void m(Player player, AnalyticsListener.EventTime eventTime, boolean belongsToPlayback, long discontinuityFromPositionMs, boolean hasDiscontinuity, int droppedFrameCount, boolean hasAudioUnderun, boolean startedLoading, @Nullable PlaybackException fatalError, @Nullable Exception nonFatalException, long bandwidthTimeMs, long bandwidthBytes, @Nullable Format videoFormat, @Nullable Format audioFormat, @Nullable VideoSize videoSize) {
            if (discontinuityFromPositionMs != C.TIME_UNSET) {
                k(eventTime.realtimeMs, discontinuityFromPositionMs);
                this.J = true;
            }
            if (player.getPlaybackState() != 2) {
                this.J = false;
            }
            int playbackState = player.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || hasDiscontinuity) {
                this.L = false;
            }
            if (fatalError != null) {
                this.M = true;
                this.F++;
                if (this.a) {
                    this.g.add(new PlaybackStats.EventTimeAndException(eventTime, fatalError));
                }
            } else if (player.getPlayerError() == null) {
                this.M = false;
            }
            if (this.K && !this.L) {
                boolean z = false;
                boolean z2 = false;
                for (TrackSelection trackSelection : player.getCurrentTrackSelections().getAll()) {
                    if (trackSelection != null && trackSelection.length() > 0) {
                        int trackType = MimeTypes.getTrackType(trackSelection.getFormat(0).sampleMimeType);
                        if (trackType == 2) {
                            z = true;
                        } else if (trackType == 1) {
                            z2 = true;
                        }
                    }
                }
                if (!z) {
                    l(eventTime, null);
                }
                if (!z2) {
                    i(eventTime, null);
                }
            }
            if (videoFormat != null) {
                l(eventTime, videoFormat);
            }
            if (audioFormat != null) {
                i(eventTime, audioFormat);
            }
            Format format = this.P;
            if (format != null && format.height == -1 && videoSize != null) {
                l(eventTime, format.buildUpon().setWidth(videoSize.width).setHeight(videoSize.height).build());
            }
            if (startedLoading) {
                this.N = true;
            }
            if (hasAudioUnderun) {
                this.E++;
            }
            this.D += (long) droppedFrameCount;
            this.B += bandwidthTimeMs;
            this.C += bandwidthBytes;
            if (nonFatalException != null) {
                this.G++;
                if (this.a) {
                    this.h.add(new PlaybackStats.EventTimeAndException(eventTime, nonFatalException));
                }
            }
            int iQ = q(player);
            float f = player.getPlaybackParameters().speed;
            if (this.H != iQ || this.T != f) {
                k(eventTime.realtimeMs, belongsToPlayback ? eventTime.eventPlaybackPositionMs : C.TIME_UNSET);
                h(eventTime.realtimeMs);
                g(eventTime.realtimeMs);
            }
            this.T = f;
            if (this.H != iQ) {
                r(iQ, eventTime);
            }
        }

        public void n(AnalyticsListener.EventTime eventTime, boolean automaticTransition, long discontinuityFromPositionMs) {
            int i = 11;
            if (this.H != 11 && !automaticTransition) {
                i = 15;
            }
            k(eventTime.realtimeMs, discontinuityFromPositionMs);
            h(eventTime.realtimeMs);
            g(eventTime.realtimeMs);
            r(i, eventTime);
        }

        public void o() {
            this.K = true;
        }

        public void p() {
            this.L = true;
            this.J = false;
        }
    }

    public PlaybackStatsListener(boolean keepHistory, @Nullable Callback callback) {
        this.d = callback;
        this.e = keepHistory;
        DefaultPlaybackSessionManager defaultPlaybackSessionManager = new DefaultPlaybackSessionManager();
        this.a = defaultPlaybackSessionManager;
        this.b = new HashMap();
        this.c = new HashMap();
        this.g = PlaybackStats.EMPTY;
        this.f = new Timeline.Period();
        this.q = VideoSize.UNKNOWN;
        defaultPlaybackSessionManager.setListener(this);
    }

    private Pair<AnalyticsListener.EventTime, Boolean> a(AnalyticsListener.Events events, String session) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTime = null;
        boolean zBelongsToSession = false;
        for (int i = 0; i < events.size(); i++) {
            AnalyticsListener.EventTime eventTime2 = events.getEventTime(events.get(i));
            boolean zBelongsToSession2 = this.a.belongsToSession(eventTime2, session);
            if (eventTime == null || ((zBelongsToSession2 && !zBelongsToSession) || (zBelongsToSession2 == zBelongsToSession && eventTime2.realtimeMs > eventTime.realtimeMs))) {
                eventTime = eventTime2;
                zBelongsToSession = zBelongsToSession2;
            }
        }
        Assertions.checkNotNull(eventTime);
        if (!zBelongsToSession && (mediaPeriodId = eventTime.mediaPeriodId) != null && mediaPeriodId.isAd()) {
            long adGroupTimeUs = eventTime.timeline.getPeriodByUid(eventTime.mediaPeriodId.periodUid, this.f).getAdGroupTimeUs(eventTime.mediaPeriodId.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                adGroupTimeUs = this.f.durationUs;
            }
            long positionInWindowUs = adGroupTimeUs + this.f.getPositionInWindowUs();
            long j = eventTime.realtimeMs;
            Timeline timeline = eventTime.timeline;
            int i2 = eventTime.windowIndex;
            MediaSource.MediaPeriodId mediaPeriodId2 = eventTime.mediaPeriodId;
            AnalyticsListener.EventTime eventTime3 = new AnalyticsListener.EventTime(j, timeline, i2, new MediaSource.MediaPeriodId(mediaPeriodId2.periodUid, mediaPeriodId2.windowSequenceNumber, mediaPeriodId2.adGroupIndex), C.usToMs(positionInWindowUs), eventTime.timeline, eventTime.currentWindowIndex, eventTime.currentMediaPeriodId, eventTime.currentPlaybackPositionMs, eventTime.totalBufferedDurationMs);
            zBelongsToSession = this.a.belongsToSession(eventTime3, session);
            eventTime = eventTime3;
        }
        return Pair.create(eventTime, Boolean.valueOf(zBelongsToSession));
    }

    private boolean b(AnalyticsListener.Events events, String session, int event) {
        return events.contains(event) && this.a.belongsToSession(events.getEventTime(event), session);
    }

    private void c(AnalyticsListener.Events events) {
        for (int i = 0; i < events.size(); i++) {
            int i2 = events.get(i);
            AnalyticsListener.EventTime eventTime = events.getEventTime(i2);
            if (i2 == 0) {
                this.a.updateSessionsWithTimelineChange(eventTime);
            } else if (i2 == 12) {
                this.a.updateSessionsWithDiscontinuity(eventTime, this.j);
            } else {
                this.a.updateSessions(eventTime);
            }
        }
    }

    public PlaybackStats getCombinedPlaybackStats() {
        int i = 1;
        PlaybackStats[] playbackStatsArr = new PlaybackStats[this.b.size() + 1];
        playbackStatsArr[0] = this.g;
        Iterator<a> it2 = this.b.values().iterator();
        while (it2.hasNext()) {
            playbackStatsArr[i] = it2.next().a(false);
            i++;
        }
        return PlaybackStats.merge(playbackStatsArr);
    }

    @Nullable
    public PlaybackStats getPlaybackStats() {
        String activeSessionId = this.a.getActiveSessionId();
        a aVar = activeSessionId == null ? null : this.b.get(activeSessionId);
        if (aVar == null) {
            return null;
        }
        return aVar.a(false);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String contentSessionId, String adSessionId) {
        ((a) Assertions.checkNotNull(this.b.get(contentSessionId))).p();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        com.google.android.exoplayer2.analytics.a.a(this, eventTime, audioAttributes);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        com.google.android.exoplayer2.analytics.a.b(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        com.google.android.exoplayer2.analytics.a.c(this, eventTime, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        com.google.android.exoplayer2.analytics.a.d(this, eventTime, str, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        com.google.android.exoplayer2.analytics.a.e(this, eventTime, str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.f(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.g(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        com.google.android.exoplayer2.analytics.a.h(this, eventTime, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        com.google.android.exoplayer2.analytics.a.i(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.a.j(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.k(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        com.google.android.exoplayer2.analytics.a.l(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        com.google.android.exoplayer2.analytics.a.m(this, eventTime, i, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        com.google.android.exoplayer2.analytics.a.n(this, eventTime, commands);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int totalLoadTimeMs, long totalBytesLoaded, long bitrateEstimate) {
        this.m = totalLoadTimeMs;
        this.n = totalBytesLoaded;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.p(this, eventTime, i, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.q(this, eventTime, i, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        com.google.android.exoplayer2.analytics.a.r(this, eventTime, i, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
        com.google.android.exoplayer2.analytics.a.s(this, eventTime, i, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        int i = mediaLoadData.trackType;
        if (i == 2 || i == 0) {
            this.o = mediaLoadData.trackFormat;
        } else if (i == 1) {
            this.p = mediaLoadData.trackFormat;
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.u(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.v(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.w(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.x(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.y(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception error) {
        this.l = error;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.A(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int droppedFrames, long elapsedMs) {
        this.k = droppedFrames;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onEvents(Player player, AnalyticsListener.Events events) {
        if (events.size() == 0) {
            return;
        }
        c(events);
        for (String str : this.b.keySet()) {
            Pair<AnalyticsListener.EventTime, Boolean> pairA = a(events, str);
            a aVar = this.b.get(str);
            boolean zB = b(events, str, 12);
            boolean zB2 = b(events, str, 1023);
            boolean zB3 = b(events, str, 1012);
            boolean zB4 = b(events, str, 1000);
            boolean zB5 = b(events, str, 11);
            boolean z = b(events, str, 1003) || b(events, str, 1032);
            boolean zB6 = b(events, str, 1006);
            boolean zB7 = b(events, str, 1004);
            aVar.m(player, (AnalyticsListener.EventTime) pairA.first, ((Boolean) pairA.second).booleanValue(), str.equals(this.h) ? this.i : C.TIME_UNSET, zB, zB2 ? this.k : 0, zB3, zB4, zB5 ? player.getPlayerError() : null, z ? this.l : null, zB6 ? this.m : 0L, zB6 ? this.n : 0L, zB7 ? this.o : null, zB7 ? this.p : null, b(events, str, 1028) ? this.q : null);
        }
        this.o = null;
        this.p = null;
        this.h = null;
        if (events.contains(1036)) {
            this.a.finishAllSessions(events.getEventTime(1036));
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.a.D(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.a.E(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.a.F(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.a.G(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException error, boolean wasCanceled) {
        this.l = error;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.a.I(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.a.J(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.K(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        com.google.android.exoplayer2.analytics.a.L(this, eventTime, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.analytics.a.M(this, eventTime, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        com.google.android.exoplayer2.analytics.a.N(this, eventTime, metadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        com.google.android.exoplayer2.analytics.a.O(this, eventTime, z, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        com.google.android.exoplayer2.analytics.a.P(this, eventTime, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.Q(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.R(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        com.google.android.exoplayer2.analytics.a.S(this, eventTime, playbackException);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.T(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        com.google.android.exoplayer2.analytics.a.U(this, eventTime, z, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.analytics.a.V(this, eventTime, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.W(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo oldPosition, Player.PositionInfo newPosition, int reason) {
        if (this.h == null) {
            this.h = this.a.getActiveSessionId();
            this.i = oldPosition.positionMs;
        }
        this.j = reason;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        com.google.android.exoplayer2.analytics.a.Y(this, eventTime, obj, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.Z(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.a.a0(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
        com.google.android.exoplayer2.analytics.a.b0(this, eventTime, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.c0(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        com.google.android.exoplayer2.analytics.a.d0(this, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionActive(AnalyticsListener.EventTime eventTime, String sessionId) {
        ((a) Assertions.checkNotNull(this.b.get(sessionId))).o();
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionCreated(AnalyticsListener.EventTime eventTime, String sessionId) {
        this.b.put(sessionId, new a(this.e, eventTime));
        this.c.put(sessionId, eventTime);
    }

    @Override // com.google.android.exoplayer2.analytics.PlaybackSessionManager.Listener
    public void onSessionFinished(AnalyticsListener.EventTime eventTime, String sessionId, boolean automaticTransitionToNextPlayback) {
        a aVar = (a) Assertions.checkNotNull(this.b.remove(sessionId));
        AnalyticsListener.EventTime eventTime2 = (AnalyticsListener.EventTime) Assertions.checkNotNull(this.c.remove(sessionId));
        aVar.n(eventTime, automaticTransitionToNextPlayback, sessionId.equals(this.h) ? this.i : C.TIME_UNSET);
        PlaybackStats playbackStatsA = aVar.a(true);
        this.g = PlaybackStats.merge(this.g, playbackStatsA);
        Callback callback = this.d;
        if (callback != null) {
            callback.onPlaybackStatsReady(eventTime2, playbackStatsA);
        }
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.a.e0(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        com.google.android.exoplayer2.analytics.a.f0(this, eventTime, z);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onStaticMetadataChanged(AnalyticsListener.EventTime eventTime, List list) {
        com.google.android.exoplayer2.analytics.a.g0(this, eventTime, list);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        com.google.android.exoplayer2.analytics.a.h0(this, eventTime, i, i2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        com.google.android.exoplayer2.analytics.a.i0(this, eventTime, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onTracksChanged(AnalyticsListener.EventTime eventTime, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
        com.google.android.exoplayer2.analytics.a.j0(this, eventTime, trackGroupArray, trackSelectionArray);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        com.google.android.exoplayer2.analytics.a.k0(this, eventTime, mediaLoadData);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        com.google.android.exoplayer2.analytics.a.l0(this, eventTime, exc);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        com.google.android.exoplayer2.analytics.a.m0(this, eventTime, str, j);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        com.google.android.exoplayer2.analytics.a.n0(this, eventTime, str, j, j2);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        com.google.android.exoplayer2.analytics.a.o0(this, eventTime, str);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.p0(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        com.google.android.exoplayer2.analytics.a.q0(this, eventTime, decoderCounters);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
        com.google.android.exoplayer2.analytics.a.r0(this, eventTime, j, i);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        com.google.android.exoplayer2.analytics.a.s0(this, eventTime, format);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        com.google.android.exoplayer2.analytics.a.t0(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        com.google.android.exoplayer2.analytics.a.u0(this, eventTime, i, i2, i3, f);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        this.q = videoSize;
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsListener
    public /* synthetic */ void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        com.google.android.exoplayer2.analytics.a.w0(this, eventTime, f);
    }
}
