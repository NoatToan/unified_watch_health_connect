package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class h implements MediaPeriod {
    private static final int u = 3;
    private final Allocator a;
    private final Handler b = Util.createHandlerForCurrentLooper();
    private final b c;
    private final RtspClient d;
    private final List<e> e;
    private final List<d> f;
    private final c g;
    private final RtpDataChannel.Factory h;
    private MediaPeriod.Callback i;
    private ImmutableList<TrackGroup> j;

    @Nullable
    private IOException k;

    @Nullable
    private RtspMediaSource.RtspPlaybackException l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private boolean t;

    public final class b implements ExtractorOutput, Loader.Callback<RtpDataLoadable>, SampleQueue.UpstreamFormatChangedListener, RtspClient.SessionInfoListener, RtspClient.PlaybackEventListener {
        private b() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onLoadCanceled(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            Handler handler = h.this.b;
            final h hVar = h.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.i
                @Override // java.lang.Runnable
                public final void run() {
                    h.k(hVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onLoadCompleted(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs) {
            if (h.this.getBufferedPositionUs() == 0) {
                if (h.this.t) {
                    return;
                }
                h.this.F();
                h.this.t = true;
                return;
            }
            for (int i = 0; i < h.this.e.size(); i++) {
                e eVar = (e) h.this.e.get(i);
                if (eVar.a.b == loadable) {
                    eVar.c();
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.Callback
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Loader.LoadErrorAction onLoadError(RtpDataLoadable loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
            if (!h.this.q) {
                h.this.k = error;
            } else if (!(error.getCause() instanceof BindException)) {
                h.this.l = new RtspMediaSource.RtspPlaybackException(loadable.b.b.toString(), error);
            } else if (h.a(h.this) < 3) {
                return Loader.RETRY;
            }
            return Loader.DONT_RETRY;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackError(RtspMediaSource.RtspPlaybackException error) {
            h.this.l = error;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onPlaybackStarted(long startPositionUs, ImmutableList<v> trackTimingList) {
            ArrayList arrayList = new ArrayList(trackTimingList.size());
            for (int i = 0; i < trackTimingList.size(); i++) {
                arrayList.add((String) Assertions.checkNotNull(trackTimingList.get(i).c.getPath()));
            }
            for (int i2 = 0; i2 < h.this.f.size(); i2++) {
                d dVar = (d) h.this.f.get(i2);
                if (!arrayList.contains(dVar.c().getPath())) {
                    h hVar = h.this;
                    String strValueOf = String.valueOf(dVar.c());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
                    sb.append("Server did not provide timing for track ");
                    sb.append(strValueOf);
                    hVar.l = new RtspMediaSource.RtspPlaybackException(sb.toString());
                    return;
                }
            }
            for (int i3 = 0; i3 < trackTimingList.size(); i3++) {
                v vVar = trackTimingList.get(i3);
                RtpDataLoadable rtpDataLoadableX = h.this.x(vVar.c);
                if (rtpDataLoadableX != null) {
                    rtpDataLoadableX.f(vVar.a);
                    rtpDataLoadableX.e(vVar.b);
                    if (h.this.A()) {
                        rtpDataLoadableX.d(startPositionUs, vVar.a);
                    }
                }
            }
            if (h.this.A()) {
                h.this.n = C.TIME_UNSET;
            }
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.PlaybackEventListener
        public void onRtspSetupCompleted() {
            h.this.d.H(0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineRequestFailed(String message, @Nullable Throwable cause) {
            h.this.k = cause == null ? new IOException(message) : new IOException(message, cause);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.RtspClient.SessionInfoListener
        public void onSessionTimelineUpdated(t timing, ImmutableList<m> tracks) {
            for (int i = 0; i < tracks.size(); i++) {
                m mVar = tracks.get(i);
                h hVar = h.this;
                e eVar = hVar.new e(mVar, i, hVar.h);
                h.this.e.add(eVar);
                eVar.i();
            }
            h.this.g.a(timing);
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
        public void onUpstreamFormatChanged(Format format) {
            Handler handler = h.this.b;
            final h hVar = h.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.source.rtsp.j
                @Override // java.lang.Runnable
                public final void run() {
                    h.k(hVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public TrackOutput track(int id, int type) {
            return ((e) Assertions.checkNotNull((e) h.this.e.get(id))).c;
        }
    }

    public interface c {
        void a(t timing);
    }

    public final class d {
        public final m a;
        private final RtpDataLoadable b;

        @Nullable
        private String c;

        public d(m mediaTrack, int trackId, RtpDataChannel.Factory rtpDataChannelFactory) {
            this.a = mediaTrack;
            this.b = new RtpDataLoadable(trackId, mediaTrack, new RtpDataLoadable.EventListener() { // from class: com.google.android.exoplayer2.source.rtsp.k
                @Override // com.google.android.exoplayer2.source.rtsp.RtpDataLoadable.EventListener
                public final void onTransportReady(String str, RtpDataChannel rtpDataChannel) {
                    this.a.f(str, rtpDataChannel);
                }
            }, h.this.c, rtpDataChannelFactory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(String str, RtpDataChannel rtpDataChannel) {
            this.c = str;
            RtspMessageChannel.InterleavedBinaryDataListener interleavedBinaryDataListenerB = rtpDataChannel.b();
            if (interleavedBinaryDataListenerB != null) {
                h.this.d.B(rtpDataChannel.getLocalPort(), interleavedBinaryDataListenerB);
                h.this.t = true;
            }
            h.this.C();
        }

        public Uri c() {
            return this.b.b.b;
        }

        public String d() {
            Assertions.checkStateNotNull(this.c);
            return this.c;
        }

        public boolean e() {
            return this.c != null;
        }
    }

    public final class e {
        public final d a;
        private final Loader b;
        private final SampleQueue c;
        private boolean d;
        private boolean e;

        public e(m mediaTrack, int trackId, RtpDataChannel.Factory rtpDataChannelFactory) {
            this.a = h.this.new d(mediaTrack, trackId, rtpDataChannelFactory);
            StringBuilder sb = new StringBuilder(55);
            sb.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb.append(trackId);
            this.b = new Loader(sb.toString());
            SampleQueue sampleQueueCreateWithoutDrm = SampleQueue.createWithoutDrm(h.this.a);
            this.c = sampleQueueCreateWithoutDrm;
            sampleQueueCreateWithoutDrm.setUpstreamFormatChangeListener(h.this.c);
        }

        public void c() {
            if (this.d) {
                return;
            }
            this.a.b.cancelLoad();
            this.d = true;
            h.this.H();
        }

        public long d() {
            return this.c.getLargestQueuedTimestampUs();
        }

        public boolean e() {
            return this.c.isReady(this.d);
        }

        public int f(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            return this.c.read(formatHolder, buffer, readFlags, this.d);
        }

        public void g() {
            if (this.e) {
                return;
            }
            this.b.release();
            this.c.release();
            this.e = true;
        }

        public void h(long positionUs) {
            if (this.d) {
                return;
            }
            this.a.b.c();
            this.c.reset();
            this.c.setStartTimeUs(positionUs);
        }

        public void i() {
            this.b.startLoading(this.a.b, h.this.c, 0);
        }
    }

    public final class f implements SampleStream {
        private final int a;

        public f(int track) {
            this.a = track;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public boolean isReady() {
            return h.this.z(this.a);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public void maybeThrowError() throws RtspMediaSource.RtspPlaybackException {
            if (h.this.l != null) {
                throw h.this.l;
            }
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int readData(FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
            return h.this.D(this.a, formatHolder, buffer, readFlags);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public int skipData(long positionUs) {
            return 0;
        }
    }

    public h(Allocator allocator, RtpDataChannel.Factory rtpDataChannelFactory, Uri uri, c listener, String userAgent) {
        this.a = allocator;
        this.h = rtpDataChannelFactory;
        this.g = listener;
        b bVar = new b();
        this.c = bVar;
        this.d = new RtspClient(bVar, bVar, userAgent, uri);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.n = C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A() {
        return this.n != C.TIME_UNSET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        if (this.p || this.q) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            if (this.e.get(i).c.getUpstreamFormat() == null) {
                return;
            }
        }
        this.q = true;
        this.j = w(ImmutableList.copyOf((Collection) this.e));
        ((MediaPeriod.Callback) Assertions.checkNotNull(this.i)).onPrepared(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        boolean zE = true;
        for (int i = 0; i < this.f.size(); i++) {
            zE &= this.f.get(i).e();
        }
        if (zE && this.r) {
            this.d.F(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void F() {
        this.d.C();
        RtpDataChannel.Factory factoryCreateFallbackDataChannelFactory = this.h.createFallbackDataChannelFactory();
        if (factoryCreateFallbackDataChannelFactory == null) {
            this.l = new RtspMediaSource.RtspPlaybackException("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.e.size());
        ArrayList arrayList2 = new ArrayList(this.f.size());
        for (int i = 0; i < this.e.size(); i++) {
            e eVar = this.e.get(i);
            if (eVar.d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.a.a, i, factoryCreateFallbackDataChannelFactory);
                arrayList.add(eVar2);
                eVar2.i();
                if (this.f.contains(eVar.a)) {
                    arrayList2.add(eVar2.a);
                }
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.e);
        this.e.clear();
        this.e.addAll(arrayList);
        this.f.clear();
        this.f.addAll(arrayList2);
        for (int i2 = 0; i2 < immutableListCopyOf.size(); i2++) {
            ((e) immutableListCopyOf.get(i2)).c();
        }
    }

    private boolean G(long positionUs) {
        for (int i = 0; i < this.e.size(); i++) {
            if (!this.e.get(i).c.seekTo(positionUs, false)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.o = true;
        for (int i = 0; i < this.e.size(); i++) {
            this.o &= this.e.get(i).d;
        }
    }

    public static /* synthetic */ int a(h hVar) {
        int i = hVar.s;
        hVar.s = i + 1;
        return i;
    }

    public static /* synthetic */ void k(h hVar) {
        hVar.B();
    }

    private static ImmutableList<TrackGroup> w(ImmutableList<e> rtspLoaderWrappers) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i = 0; i < rtspLoaderWrappers.size(); i++) {
            builder.add(new TrackGroup((Format) Assertions.checkNotNull(rtspLoaderWrappers.get(i).c.getUpstreamFormat())));
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public RtpDataLoadable x(Uri trackUri) {
        for (int i = 0; i < this.e.size(); i++) {
            if (!this.e.get(i).d) {
                d dVar = this.e.get(i).a;
                if (dVar.c().equals(trackUri)) {
                    return dVar.b;
                }
            }
        }
        return null;
    }

    public int D(int sampleQueueIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        return this.e.get(sampleQueueIndex).f(formatHolder, buffer, readFlags);
    }

    public void E() {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).g();
        }
        Util.closeQuietly(this.d);
        this.p = true;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        return isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        if (A()) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            e eVar = this.e.get(i);
            if (!eVar.d) {
                eVar.c.discardTo(positionUs, toKeyframe, true);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.o || this.e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.n;
        }
        long jMin = Long.MAX_VALUE;
        boolean z = true;
        for (int i = 0; i < this.e.size(); i++) {
            e eVar = this.e.get(i);
            if (!eVar.d) {
                jMin = Math.min(jMin, eVar.d());
                z = false;
            }
        }
        return (z || jMin == Long.MIN_VALUE) ? this.m : jMin;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        Assertions.checkState(this.q);
        return new TrackGroupArray((TrackGroup[]) ((ImmutableList) Assertions.checkNotNull(this.j)).toArray(new TrackGroup[0]));
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return !this.o;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        IOException iOException = this.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.i = callback;
        try {
            this.d.G();
        } catch (IOException e2) {
            this.k = e2;
            Util.closeQuietly(this.d);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        if (A()) {
            return this.n;
        }
        if (G(positionUs)) {
            return positionUs;
        }
        this.m = positionUs;
        this.n = positionUs;
        this.d.D(positionUs);
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).h(positionUs);
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        for (int i = 0; i < selections.length; i++) {
            if (streams[i] != null && (selections[i] == null || !mayRetainStreamFlags[i])) {
                streams[i] = null;
            }
        }
        this.f.clear();
        for (int i2 = 0; i2 < selections.length; i2++) {
            ExoTrackSelection exoTrackSelection = selections[i2];
            if (exoTrackSelection != null) {
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                int iIndexOf = ((ImmutableList) Assertions.checkNotNull(this.j)).indexOf(trackGroup);
                this.f.add(((e) Assertions.checkNotNull(this.e.get(iIndexOf))).a);
                if (this.j.contains(trackGroup) && streams[i2] == null) {
                    streams[i2] = new f(iIndexOf);
                    streamResetFlags[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            e eVar = this.e.get(i3);
            if (!this.f.contains(eVar.a)) {
                eVar.c();
            }
        }
        this.r = true;
        C();
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ImmutableList<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
        return ImmutableList.of();
    }

    public boolean z(int trackGroupIndex) {
        return this.e.get(trackGroupIndex).e();
    }
}
