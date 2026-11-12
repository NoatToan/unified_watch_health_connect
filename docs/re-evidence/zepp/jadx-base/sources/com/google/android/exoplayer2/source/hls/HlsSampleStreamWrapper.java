package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionUtil;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public final class HlsSampleStreamWrapper implements Loader.Callback<Chunk>, Loader.ReleaseCallback, SequenceableLoader, ExtractorOutput, SampleQueue.UpstreamFormatChangedListener {
    private static final String X = "HlsSampleStreamWrapper";
    public static final int Y = -1;
    public static final int Z = -2;
    public static final int m0 = -3;
    private static final Set<Integer> n0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private int A;
    private boolean B;
    private boolean C;
    private int D;
    private Format E;

    @Nullable
    private Format F;
    private boolean G;
    private TrackGroupArray H;
    private Set<TrackGroup> I;
    private int[] J;
    private int K;
    private boolean L;
    private boolean[] M;
    private boolean[] N;
    private long O;
    private long P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private long U;

    @Nullable
    private DrmInitData V;

    @Nullable
    private com.google.android.exoplayer2.source.hls.c W;
    private final int a;
    private final Callback b;
    private final HlsChunkSource c;
    private final Allocator d;

    @Nullable
    private final Format e;
    private final DrmSessionManager f;
    private final DrmSessionEventListener.EventDispatcher g;
    private final LoadErrorHandlingPolicy h;
    private final MediaSourceEventListener.EventDispatcher j;
    private final int k;
    private final ArrayList<com.google.android.exoplayer2.source.hls.c> m;
    private final List<com.google.android.exoplayer2.source.hls.c> n;
    private final Runnable o;
    private final Runnable p;
    private final Handler q;
    private final ArrayList<d> r;
    private final Map<String, DrmInitData> s;

    @Nullable
    private Chunk t;
    private c[] u;
    private Set<Integer> w;
    private SparseIntArray x;
    private TrackOutput y;
    private int z;
    private final Loader i = new Loader("Loader:HlsSampleStreamWrapper");
    private final HlsChunkSource.HlsChunkHolder l = new HlsChunkSource.HlsChunkHolder();
    private int[] v = new int[0];

    public interface Callback extends SequenceableLoader.Callback<HlsSampleStreamWrapper> {
        void onPlaylistRefreshRequired(Uri playlistUrl);

        void onPrepared();
    }

    public static final class c extends SampleQueue {
        private final Map<String, DrmInitData> K;

        @Nullable
        private DrmInitData L;

        @Nullable
        private Metadata t(@Nullable Metadata metadata) {
            if (metadata == null) {
                return null;
            }
            int length = metadata.length();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                Metadata.Entry entry = metadata.get(i2);
                if ((entry instanceof PrivFrame) && com.google.android.exoplayer2.source.hls.c.B.equals(((PrivFrame) entry).owner)) {
                    break;
                }
                i2++;
            }
            if (i2 == -1) {
                return metadata;
            }
            if (length == 1) {
                return null;
            }
            Metadata.Entry[] entryArr = new Metadata.Entry[length - 1];
            while (i < length) {
                if (i != i2) {
                    entryArr[i < i2 ? i : i - 1] = metadata.get(i);
                }
                i++;
            }
            return new Metadata(entryArr);
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue
        public Format getAdjustedUpstreamFormat(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.L;
            if (drmInitData2 == null) {
                drmInitData2 = format.drmInitData;
            }
            if (drmInitData2 != null && (drmInitData = this.K.get(drmInitData2.schemeType)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadataT = t(format.metadata);
            if (drmInitData2 != format.drmInitData || metadataT != format.metadata) {
                format = format.buildUpon().setDrmInitData(drmInitData2).setMetadata(metadataT).build();
            }
            return super.getAdjustedUpstreamFormat(format);
        }

        @Override // com.google.android.exoplayer2.source.SampleQueue, com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
            super.sampleMetadata(timeUs, flags, size, offset, cryptoData);
        }

        public void u(@Nullable DrmInitData drmInitData) {
            this.L = drmInitData;
            invalidateUpstreamFormatAdjustment();
        }

        public void v(com.google.android.exoplayer2.source.hls.c chunk) {
            sourceId(chunk.a);
        }

        private c(Allocator allocator, Looper playbackLooper, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher eventDispatcher, Map<String, DrmInitData> overridingDrmInitData) {
            super(allocator, playbackLooper, drmSessionManager, eventDispatcher);
            this.K = overridingDrmInitData;
        }
    }

    public HlsSampleStreamWrapper(int trackType, Callback callback, HlsChunkSource chunkSource, Map<String, DrmInitData> overridingDrmInitData, Allocator allocator, long positionUs, @Nullable Format muxedAudioFormat, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, int metadataType) {
        this.a = trackType;
        this.b = callback;
        this.c = chunkSource;
        this.s = overridingDrmInitData;
        this.d = allocator;
        this.e = muxedAudioFormat;
        this.f = drmSessionManager;
        this.g = drmEventDispatcher;
        this.h = loadErrorHandlingPolicy;
        this.j = mediaSourceEventDispatcher;
        this.k = metadataType;
        Set<Integer> set = n0;
        this.w = new HashSet(set.size());
        this.x = new SparseIntArray(set.size());
        this.u = new c[0];
        this.N = new boolean[0];
        this.M = new boolean[0];
        ArrayList<com.google.android.exoplayer2.source.hls.c> arrayList = new ArrayList<>();
        this.m = arrayList;
        this.n = Collections.unmodifiableList(arrayList);
        this.r = new ArrayList<>();
        this.o = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.f
            @Override // java.lang.Runnable
            public final void run() {
                this.a.y();
            }
        };
        this.p = new Runnable() { // from class: com.google.android.exoplayer2.source.hls.e
            @Override // java.lang.Runnable
            public final void run() {
                this.a.H();
            }
        };
        this.q = Util.createHandlerForCurrentLooper();
        this.O = positionUs;
        this.P = positionUs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.B = true;
        y();
    }

    private void L() {
        for (c cVar : this.u) {
            cVar.reset(this.Q);
        }
        this.Q = false;
    }

    private boolean M(long positionUs) {
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            if (!this.u[i].seekTo(positionUs, false) && (this.N[i] || !this.L)) {
                return false;
            }
        }
        return true;
    }

    @RequiresNonNull({"trackGroups", "optionalTrackGroups"})
    private void Q() {
        this.C = true;
    }

    private void V(SampleStream[] streams) {
        this.r.clear();
        for (SampleStream sampleStream : streams) {
            if (sampleStream != null) {
                this.r.add((d) sampleStream);
            }
        }
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    private void c() {
        Assertions.checkState(this.C);
        Assertions.checkNotNull(this.H);
        Assertions.checkNotNull(this.I);
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups", "trackGroupToSampleQueueIndex"})
    private void e() {
        int length = this.u.length;
        int i = 0;
        int i2 = 7;
        int i3 = -1;
        while (true) {
            int i4 = 2;
            if (i >= length) {
                break;
            }
            String str = ((Format) Assertions.checkStateNotNull(this.u[i].getUpstreamFormat())).sampleMimeType;
            if (!MimeTypes.isVideo(str)) {
                i4 = MimeTypes.isAudio(str) ? 1 : MimeTypes.isText(str) ? 3 : 7;
            }
            if (s(i4) > s(i2)) {
                i3 = i;
                i2 = i4;
            } else if (i4 == i2 && i3 != -1) {
                i3 = -1;
            }
            i++;
        }
        TrackGroup trackGroupI = this.c.i();
        int i5 = trackGroupI.length;
        this.K = -1;
        this.J = new int[length];
        for (int i6 = 0; i6 < length; i6++) {
            this.J[i6] = i6;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        for (int i7 = 0; i7 < length; i7++) {
            Format format = (Format) Assertions.checkStateNotNull(this.u[i7].getUpstreamFormat());
            if (i7 == i3) {
                Format[] formatArr = new Format[i5];
                if (i5 == 1) {
                    formatArr[0] = format.withManifestFormatInfo(trackGroupI.getFormat(0));
                } else {
                    for (int i8 = 0; i8 < i5; i8++) {
                        formatArr[i8] = k(trackGroupI.getFormat(i8), format, true);
                    }
                }
                trackGroupArr[i7] = new TrackGroup(formatArr);
                this.K = i7;
            } else {
                trackGroupArr[i7] = new TrackGroup(k((i2 == 2 && MimeTypes.isAudio(format.sampleMimeType)) ? this.e : null, format, false));
            }
        }
        this.H = j(trackGroupArr);
        Assertions.checkState(this.I == null);
        this.I = Collections.emptySet();
    }

    private boolean f(int mediaChunkIndex) {
        for (int i = mediaChunkIndex; i < this.m.size(); i++) {
            if (this.m.get(i).d) {
                return false;
            }
        }
        com.google.android.exoplayer2.source.hls.c cVar = this.m.get(mediaChunkIndex);
        for (int i2 = 0; i2 < this.u.length; i2++) {
            if (this.u[i2].getReadIndex() > cVar.getFirstSampleIndex(i2)) {
                return false;
            }
        }
        return true;
    }

    private static DummyTrackOutput h(int id, int type) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(id);
        sb.append(" of type ");
        sb.append(type);
        Log.w(X, sb.toString());
        return new DummyTrackOutput();
    }

    private SampleQueue i(int id, int type) {
        int length = this.u.length;
        boolean z = true;
        if (type != 1 && type != 2) {
            z = false;
        }
        c cVar = new c(this.d, this.q.getLooper(), this.f, this.g, this.s);
        cVar.setStartTimeUs(this.O);
        if (z) {
            cVar.u(this.V);
        }
        cVar.setSampleOffsetUs(this.U);
        com.google.android.exoplayer2.source.hls.c cVar2 = this.W;
        if (cVar2 != null) {
            cVar.v(cVar2);
        }
        cVar.setUpstreamFormatChangeListener(this);
        int i = length + 1;
        int[] iArrCopyOf = Arrays.copyOf(this.v, i);
        this.v = iArrCopyOf;
        iArrCopyOf[length] = id;
        this.u = (c[]) Util.nullSafeArrayAppend(this.u, cVar);
        boolean[] zArrCopyOf = Arrays.copyOf(this.N, i);
        this.N = zArrCopyOf;
        zArrCopyOf[length] = z;
        this.L = zArrCopyOf[length] | this.L;
        this.w.add(Integer.valueOf(type));
        this.x.append(type, length);
        if (s(type) > s(this.z)) {
            this.A = length;
            this.z = type;
        }
        this.M = Arrays.copyOf(this.M, i);
        return cVar;
    }

    private TrackGroupArray j(TrackGroup[] trackGroups) {
        for (int i = 0; i < trackGroups.length; i++) {
            TrackGroup trackGroup = trackGroups[i];
            Format[] formatArr = new Format[trackGroup.length];
            for (int i2 = 0; i2 < trackGroup.length; i2++) {
                Format format = trackGroup.getFormat(i2);
                formatArr[i2] = format.copyWithExoMediaCryptoType(this.f.getExoMediaCryptoType(format));
            }
            trackGroups[i] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroups);
    }

    private static Format k(@Nullable Format playlistFormat, Format sampleFormat, boolean propagateBitrates) {
        String codecsCorrespondingToMimeType;
        String mediaMimeType;
        if (playlistFormat == null) {
            return sampleFormat;
        }
        int trackType = MimeTypes.getTrackType(sampleFormat.sampleMimeType);
        if (Util.getCodecCountOfType(playlistFormat.codecs, trackType) == 1) {
            codecsCorrespondingToMimeType = Util.getCodecsOfType(playlistFormat.codecs, trackType);
            mediaMimeType = MimeTypes.getMediaMimeType(codecsCorrespondingToMimeType);
        } else {
            codecsCorrespondingToMimeType = MimeTypes.getCodecsCorrespondingToMimeType(playlistFormat.codecs, sampleFormat.sampleMimeType);
            mediaMimeType = sampleFormat.sampleMimeType;
        }
        Format.Builder codecs = sampleFormat.buildUpon().setId(playlistFormat.id).setLabel(playlistFormat.label).setLanguage(playlistFormat.language).setSelectionFlags(playlistFormat.selectionFlags).setRoleFlags(playlistFormat.roleFlags).setAverageBitrate(propagateBitrates ? playlistFormat.averageBitrate : -1).setPeakBitrate(propagateBitrates ? playlistFormat.peakBitrate : -1).setCodecs(codecsCorrespondingToMimeType);
        if (trackType == 2) {
            codecs.setWidth(playlistFormat.width).setHeight(playlistFormat.height).setFrameRate(playlistFormat.frameRate);
        }
        if (mediaMimeType != null) {
            codecs.setSampleMimeType(mediaMimeType);
        }
        int i = playlistFormat.channelCount;
        if (i != -1 && trackType == 1) {
            codecs.setChannelCount(i);
        }
        Metadata metadataCopyWithAppendedEntriesFrom = playlistFormat.metadata;
        if (metadataCopyWithAppendedEntriesFrom != null) {
            Metadata metadata = sampleFormat.metadata;
            if (metadata != null) {
                metadataCopyWithAppendedEntriesFrom = metadata.copyWithAppendedEntriesFrom(metadataCopyWithAppendedEntriesFrom);
            }
            codecs.setMetadata(metadataCopyWithAppendedEntriesFrom);
        }
        return codecs.build();
    }

    private void l(int preferredQueueSize) {
        Assertions.checkState(!this.i.isLoading());
        while (true) {
            if (preferredQueueSize >= this.m.size()) {
                preferredQueueSize = -1;
                break;
            } else if (f(preferredQueueSize)) {
                break;
            } else {
                preferredQueueSize++;
            }
        }
        if (preferredQueueSize == -1) {
            return;
        }
        long j = p().endTimeUs;
        com.google.android.exoplayer2.source.hls.c cVarM = m(preferredQueueSize);
        if (this.m.isEmpty()) {
            this.P = this.O;
        } else {
            ((com.google.android.exoplayer2.source.hls.c) Iterables.getLast(this.m)).f();
        }
        this.S = false;
        this.j.upstreamDiscarded(this.z, cVarM.startTimeUs, j);
    }

    private com.google.android.exoplayer2.source.hls.c m(int chunkIndex) {
        com.google.android.exoplayer2.source.hls.c cVar = this.m.get(chunkIndex);
        ArrayList<com.google.android.exoplayer2.source.hls.c> arrayList = this.m;
        Util.removeRange(arrayList, chunkIndex, arrayList.size());
        for (int i = 0; i < this.u.length; i++) {
            this.u[i].discardUpstreamSamples(cVar.getFirstSampleIndex(i));
        }
        return cVar;
    }

    private boolean n(com.google.android.exoplayer2.source.hls.c chunk) {
        int i = chunk.a;
        int length = this.u.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (this.M[i2] && this.u[i2].peekSourceId() == i) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(Format manifestFormat, Format sampleFormat) {
        String str = manifestFormat.sampleMimeType;
        String str2 = sampleFormat.sampleMimeType;
        int trackType = MimeTypes.getTrackType(str);
        if (trackType != 3) {
            return trackType == MimeTypes.getTrackType(str2);
        }
        if (Util.areEqual(str, str2)) {
            return !(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str)) || manifestFormat.accessibilityChannel == sampleFormat.accessibilityChannel;
        }
        return false;
    }

    private com.google.android.exoplayer2.source.hls.c p() {
        ArrayList<com.google.android.exoplayer2.source.hls.c> arrayList = this.m;
        return arrayList.get(arrayList.size() - 1);
    }

    @Nullable
    private TrackOutput q(int id, int type) {
        Assertions.checkArgument(n0.contains(Integer.valueOf(type)));
        int i = this.x.get(type, -1);
        if (i == -1) {
            return null;
        }
        if (this.w.add(Integer.valueOf(type))) {
            this.v[i] = id;
        }
        return this.v[i] == id ? this.u[i] : h(id, type);
    }

    private static int s(int trackType) {
        if (trackType == 1) {
            return 2;
        }
        if (trackType != 2) {
            return trackType != 3 ? 0 : 1;
        }
        return 3;
    }

    private void t(com.google.android.exoplayer2.source.hls.c chunk) {
        this.W = chunk;
        this.E = chunk.trackFormat;
        this.P = C.TIME_UNSET;
        this.m.add(chunk);
        ImmutableList.Builder builder = ImmutableList.builder();
        for (c cVar : this.u) {
            builder.add(Integer.valueOf(cVar.getWriteIndex()));
        }
        chunk.e(this, builder.build());
        for (c cVar2 : this.u) {
            cVar2.v(chunk);
            if (chunk.d) {
                cVar2.splice();
            }
        }
    }

    private static boolean u(Chunk chunk) {
        return chunk instanceof com.google.android.exoplayer2.source.hls.c;
    }

    private boolean v() {
        return this.P != C.TIME_UNSET;
    }

    @EnsuresNonNull({"trackGroupToSampleQueueIndex"})
    @RequiresNonNull({"trackGroups"})
    private void x() {
        int i = this.H.length;
        int[] iArr = new int[i];
        this.J = iArr;
        Arrays.fill(iArr, -1);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            while (true) {
                c[] cVarArr = this.u;
                if (i3 >= cVarArr.length) {
                    break;
                }
                if (o((Format) Assertions.checkStateNotNull(cVarArr[i3].getUpstreamFormat()), this.H.get(i2).getFormat(0))) {
                    this.J[i2] = i3;
                    break;
                }
                i3++;
            }
        }
        Iterator<d> it2 = this.r.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (!this.G && this.J == null && this.B) {
            for (c cVar : this.u) {
                if (cVar.getUpstreamFormat() == null) {
                    return;
                }
            }
            if (this.H != null) {
                x();
                return;
            }
            e();
            Q();
            this.b.onPrepared();
        }
    }

    public void A(int sampleQueueIndex) throws IOException {
        z();
        this.u[sampleQueueIndex].maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void onLoadCanceled(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, boolean released) {
        this.t = null;
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.h.onLoadTaskConcluded(loadable.loadTaskId);
        this.j.loadCanceled(loadEventInfo, loadable.type, this.a, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, loadable.startTimeUs, loadable.endTimeUs);
        if (released) {
            return;
        }
        if (v() || this.D == 0) {
            L();
        }
        if (this.D > 0) {
            this.b.onContinueLoadingRequested(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void onLoadCompleted(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs) {
        this.t = null;
        this.c.o(loadable);
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, loadable.bytesLoaded());
        this.h.onLoadTaskConcluded(loadable.loadTaskId);
        this.j.loadCompleted(loadEventInfo, loadable.type, this.a, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, loadable.startTimeUs, loadable.endTimeUs);
        if (this.C) {
            this.b.onContinueLoadingRequested(this);
        } else {
            continueLoading(this.O);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Callback
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public Loader.LoadErrorAction onLoadError(Chunk loadable, long elapsedRealtimeMs, long loadDurationMs, IOException error, int errorCount) {
        Loader.LoadErrorAction loadErrorActionCreateRetryAction;
        int i;
        boolean zU = u(loadable);
        if (zU && !((com.google.android.exoplayer2.source.hls.c) loadable).h() && (error instanceof HttpDataSource.InvalidResponseCodeException) && ((i = ((HttpDataSource.InvalidResponseCodeException) error).responseCode) == 410 || i == 404)) {
            return Loader.RETRY;
        }
        long jBytesLoaded = loadable.bytesLoaded();
        LoadEventInfo loadEventInfo = new LoadEventInfo(loadable.loadTaskId, loadable.dataSpec, loadable.getUri(), loadable.getResponseHeaders(), elapsedRealtimeMs, loadDurationMs, jBytesLoaded);
        LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo = new LoadErrorHandlingPolicy.LoadErrorInfo(loadEventInfo, new MediaLoadData(loadable.type, this.a, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, C.usToMs(loadable.startTimeUs), C.usToMs(loadable.endTimeUs)), error, errorCount);
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor = this.h.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.c.j()), loadErrorInfo);
        boolean zL = (fallbackSelectionFor == null || fallbackSelectionFor.type != 2) ? false : this.c.l(loadable, fallbackSelectionFor.exclusionDurationMs);
        if (zL) {
            if (zU && jBytesLoaded == 0) {
                ArrayList<com.google.android.exoplayer2.source.hls.c> arrayList = this.m;
                Assertions.checkState(arrayList.remove(arrayList.size() - 1) == loadable);
                if (this.m.isEmpty()) {
                    this.P = this.O;
                } else {
                    ((com.google.android.exoplayer2.source.hls.c) Iterables.getLast(this.m)).f();
                }
            }
            loadErrorActionCreateRetryAction = Loader.DONT_RETRY;
        } else {
            long retryDelayMsFor = this.h.getRetryDelayMsFor(loadErrorInfo);
            loadErrorActionCreateRetryAction = retryDelayMsFor != C.TIME_UNSET ? Loader.createRetryAction(false, retryDelayMsFor) : Loader.DONT_RETRY_FATAL;
        }
        Loader.LoadErrorAction loadErrorAction = loadErrorActionCreateRetryAction;
        boolean z = !loadErrorAction.isRetry();
        this.j.loadError(loadEventInfo, loadable.type, this.a, loadable.trackFormat, loadable.trackSelectionReason, loadable.trackSelectionData, loadable.startTimeUs, loadable.endTimeUs, error, z);
        if (z) {
            this.t = null;
            this.h.onLoadTaskConcluded(loadable.loadTaskId);
        }
        if (zL) {
            if (this.C) {
                this.b.onContinueLoadingRequested(this);
            } else {
                continueLoading(this.O);
            }
        }
        return loadErrorAction;
    }

    public void E() {
        this.w.clear();
    }

    public boolean F(Uri playlistUrl, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!this.c.n(playlistUrl)) {
            return true;
        }
        long j = C.TIME_UNSET;
        if (!forceRetry && (fallbackSelectionFor = this.h.getFallbackSelectionFor(TrackSelectionUtil.createFallbackOptions(this.c.j()), loadErrorInfo)) != null && fallbackSelectionFor.type == 2) {
            j = fallbackSelectionFor.exclusionDurationMs;
        }
        return this.c.p(playlistUrl, j);
    }

    public void G() {
        if (this.m.isEmpty()) {
            return;
        }
        com.google.android.exoplayer2.source.hls.c cVar = (com.google.android.exoplayer2.source.hls.c) Iterables.getLast(this.m);
        int iB = this.c.b(cVar);
        if (iB == 1) {
            cVar.m();
        } else if (iB == 2 && !this.S && this.i.isLoading()) {
            this.i.cancelLoading();
        }
    }

    public void I(TrackGroup[] trackGroups, int primaryTrackGroupIndex, int... optionalTrackGroupsIndices) {
        this.H = j(trackGroups);
        this.I = new HashSet();
        for (int i : optionalTrackGroupsIndices) {
            this.I.add(this.H.get(i));
        }
        this.K = primaryTrackGroupIndex;
        Handler handler = this.q;
        final Callback callback = this.b;
        Objects.requireNonNull(callback);
        handler.post(new Runnable() { // from class: c24
            @Override // java.lang.Runnable
            public final void run() {
                callback.onPrepared();
            }
        });
        Q();
    }

    public int J(int sampleQueueIndex, FormatHolder formatHolder, DecoderInputBuffer buffer, int readFlags) {
        if (v()) {
            return -3;
        }
        int i = 0;
        if (!this.m.isEmpty()) {
            int i2 = 0;
            while (i2 < this.m.size() - 1 && n(this.m.get(i2))) {
                i2++;
            }
            Util.removeRange(this.m, 0, i2);
            com.google.android.exoplayer2.source.hls.c cVar = this.m.get(0);
            Format format = cVar.trackFormat;
            if (!format.equals(this.F)) {
                this.j.downstreamFormatChanged(this.a, format, cVar.trackSelectionReason, cVar.trackSelectionData, cVar.startTimeUs);
            }
            this.F = format;
        }
        if (!this.m.isEmpty() && !this.m.get(0).h()) {
            return -3;
        }
        int i3 = this.u[sampleQueueIndex].read(formatHolder, buffer, readFlags, this.S);
        if (i3 == -5) {
            Format formatWithManifestFormatInfo = (Format) Assertions.checkNotNull(formatHolder.format);
            if (sampleQueueIndex == this.A) {
                int iPeekSourceId = this.u[sampleQueueIndex].peekSourceId();
                while (i < this.m.size() && this.m.get(i).a != iPeekSourceId) {
                    i++;
                }
                formatWithManifestFormatInfo = formatWithManifestFormatInfo.withManifestFormatInfo(i < this.m.size() ? this.m.get(i).trackFormat : (Format) Assertions.checkNotNull(this.E));
            }
            formatHolder.format = formatWithManifestFormatInfo;
        }
        return i3;
    }

    public void K() {
        if (this.C) {
            for (c cVar : this.u) {
                cVar.preRelease();
            }
        }
        this.i.release(this);
        this.q.removeCallbacksAndMessages(null);
        this.G = true;
        this.r.clear();
    }

    public boolean N(long positionUs, boolean forceReset) {
        this.O = positionUs;
        if (v()) {
            this.P = positionUs;
            return true;
        }
        if (this.B && !forceReset && M(positionUs)) {
            return false;
        }
        this.P = positionUs;
        this.S = false;
        this.m.clear();
        if (this.i.isLoading()) {
            if (this.B) {
                for (c cVar : this.u) {
                    cVar.discardToEnd();
                }
            }
            this.i.cancelLoading();
        } else {
            this.i.clearFatalError();
            L();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0124  */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    public boolean O(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs, boolean forceReset) {
        boolean z;
        boolean z2;
        c();
        int i = this.D;
        int i2 = 0;
        for (int i3 = 0; i3 < selections.length; i3++) {
            d dVar = (d) streams[i3];
            if (dVar != null && (selections[i3] == null || !mayRetainStreamFlags[i3])) {
                this.D--;
                dVar.c();
                streams[i3] = null;
            }
        }
        boolean z3 = forceReset || (!this.R ? positionUs == this.O : i != 0);
        ExoTrackSelection exoTrackSelectionJ = this.c.j();
        boolean z4 = z3;
        ExoTrackSelection exoTrackSelection = exoTrackSelectionJ;
        for (int i4 = 0; i4 < selections.length; i4++) {
            ExoTrackSelection exoTrackSelection2 = selections[i4];
            if (exoTrackSelection2 != null) {
                int iIndexOf = this.H.indexOf(exoTrackSelection2.getTrackGroup());
                if (iIndexOf == this.K) {
                    this.c.t(exoTrackSelection2);
                    exoTrackSelection = exoTrackSelection2;
                }
                if (streams[i4] == null) {
                    this.D++;
                    streams[i4] = new d(this, iIndexOf);
                    streamResetFlags[i4] = true;
                    if (this.J != null) {
                        ((d) streams[i4]).a();
                        if (!z4) {
                            c cVar = this.u[this.J[iIndexOf]];
                            z4 = (cVar.seekTo(positionUs, true) || cVar.getReadIndex() == 0) ? false : true;
                        }
                    }
                }
            }
        }
        if (this.D == 0) {
            this.c.q();
            this.F = null;
            this.Q = true;
            this.m.clear();
            if (this.i.isLoading()) {
                if (this.B) {
                    c[] cVarArr = this.u;
                    int length = cVarArr.length;
                    while (i2 < length) {
                        cVarArr[i2].discardToEnd();
                        i2++;
                    }
                }
                this.i.cancelLoading();
            } else {
                L();
            }
        } else {
            if (this.m.isEmpty() || Util.areEqual(exoTrackSelection, exoTrackSelectionJ)) {
                z = forceReset;
            } else {
                if (this.R) {
                    z2 = true;
                } else {
                    long j = positionUs < 0 ? -positionUs : 0L;
                    com.google.android.exoplayer2.source.hls.c cVarP = p();
                    exoTrackSelection.updateSelectedTrack(positionUs, j, C.TIME_UNSET, this.n, this.c.a(cVarP, positionUs));
                    if (exoTrackSelection.getSelectedIndexInTrackGroup() != this.c.i().indexOf(cVarP.trackFormat)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    this.Q = true;
                    z = true;
                    z4 = true;
                } else {
                    z = forceReset;
                }
            }
            if (z4) {
                N(positionUs, z);
                while (i2 < streams.length) {
                    if (streams[i2] != null) {
                        streamResetFlags[i2] = true;
                    }
                    i2++;
                }
            }
        }
        V(streams);
        this.R = true;
        return z4;
    }

    public void P(@Nullable DrmInitData drmInitData) {
        if (Util.areEqual(this.V, drmInitData)) {
            return;
        }
        this.V = drmInitData;
        int i = 0;
        while (true) {
            c[] cVarArr = this.u;
            if (i >= cVarArr.length) {
                return;
            }
            if (this.N[i]) {
                cVarArr[i].u(drmInitData);
            }
            i++;
        }
    }

    public void R(boolean isTimestampMaster) {
        this.c.s(isTimestampMaster);
    }

    public void S(long sampleOffsetUs) {
        if (this.U != sampleOffsetUs) {
            this.U = sampleOffsetUs;
            for (c cVar : this.u) {
                cVar.setSampleOffsetUs(sampleOffsetUs);
            }
        }
    }

    public int T(int sampleQueueIndex, long positionUs) {
        if (v()) {
            return 0;
        }
        c cVar = this.u[sampleQueueIndex];
        int skipCount = cVar.getSkipCount(positionUs, this.S);
        com.google.android.exoplayer2.source.hls.c cVar2 = (com.google.android.exoplayer2.source.hls.c) Iterables.getLast(this.m, null);
        if (cVar2 != null && !cVar2.h()) {
            skipCount = Math.min(skipCount, cVar2.getFirstSampleIndex(sampleQueueIndex) - cVar.getReadIndex());
        }
        cVar.skip(skipCount);
        return skipCount;
    }

    public void U(int trackGroupIndex) {
        c();
        Assertions.checkNotNull(this.J);
        int i = this.J[trackGroupIndex];
        Assertions.checkState(this.M[i]);
        this.M[i] = false;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        List<com.google.android.exoplayer2.source.hls.c> listEmptyList;
        long jMax;
        if (this.S || this.i.isLoading() || this.i.hasFatalError()) {
            return false;
        }
        if (v()) {
            listEmptyList = Collections.emptyList();
            jMax = this.P;
            for (c cVar : this.u) {
                cVar.setStartTimeUs(this.P);
            }
        } else {
            listEmptyList = this.n;
            com.google.android.exoplayer2.source.hls.c cVarP = p();
            jMax = cVarP.isLoadCompleted() ? cVarP.endTimeUs : Math.max(this.O, cVarP.startTimeUs);
        }
        List<com.google.android.exoplayer2.source.hls.c> list = listEmptyList;
        long j = jMax;
        this.l.clear();
        this.c.d(positionUs, j, list, this.C || !list.isEmpty(), this.l);
        HlsChunkSource.HlsChunkHolder hlsChunkHolder = this.l;
        boolean z = hlsChunkHolder.endOfStream;
        Chunk chunk = hlsChunkHolder.chunk;
        Uri uri = hlsChunkHolder.playlistUrl;
        if (z) {
            this.P = C.TIME_UNSET;
            this.S = true;
            return true;
        }
        if (chunk == null) {
            if (uri != null) {
                this.b.onPlaylistRefreshRequired(uri);
            }
            return false;
        }
        if (u(chunk)) {
            t((com.google.android.exoplayer2.source.hls.c) chunk);
        }
        this.t = chunk;
        this.j.loadStarted(new LoadEventInfo(chunk.loadTaskId, chunk.dataSpec, this.i.startLoading(chunk, this, this.h.getMinimumLoadableRetryCount(chunk.type))), chunk.type, this.a, chunk.trackFormat, chunk.trackSelectionReason, chunk.trackSelectionData, chunk.startTimeUs, chunk.endTimeUs);
        return true;
    }

    public int d(int trackGroupIndex) {
        c();
        Assertions.checkNotNull(this.J);
        int i = this.J[trackGroupIndex];
        if (i == -1) {
            return this.I.contains(this.H.get(trackGroupIndex)) ? -3 : -2;
        }
        boolean[] zArr = this.M;
        if (zArr[i]) {
            return -2;
        }
        zArr[i] = true;
        return i;
    }

    public void discardBuffer(long positionUs, boolean toKeyframe) {
        if (!this.B || v()) {
            return;
        }
        int length = this.u.length;
        for (int i = 0; i < length; i++) {
            this.u[i].discardTo(positionUs, toKeyframe, this.M[i]);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.T = true;
        this.q.post(this.p);
    }

    public void g() {
        if (this.C) {
            return;
        }
        continueLoading(this.O);
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        if (this.S) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.P;
        }
        long jMax = this.O;
        com.google.android.exoplayer2.source.hls.c cVarP = p();
        if (!cVarP.isLoadCompleted()) {
            if (this.m.size() > 1) {
                ArrayList<com.google.android.exoplayer2.source.hls.c> arrayList = this.m;
                cVarP = arrayList.get(arrayList.size() - 2);
            } else {
                cVarP = null;
            }
        }
        if (cVarP != null) {
            jMax = Math.max(jMax, cVarP.endTimeUs);
        }
        if (this.B) {
            for (c cVar : this.u) {
                jMax = Math.max(jMax, cVar.getLargestQueuedTimestampUs());
            }
        }
        return jMax;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        if (v()) {
            return this.P;
        }
        if (this.S) {
            return Long.MIN_VALUE;
        }
        return p().endTimeUs;
    }

    public TrackGroupArray getTrackGroups() {
        c();
        return this.H;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.i.isLoading();
    }

    public void maybeThrowPrepareError() throws IOException {
        z();
        if (this.S && !this.C) {
            throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.ReleaseCallback
    public void onLoaderReleased() {
        for (c cVar : this.u) {
            cVar.release();
        }
    }

    @Override // com.google.android.exoplayer2.source.SampleQueue.UpstreamFormatChangedListener
    public void onUpstreamFormatChanged(Format format) {
        this.q.post(this.o);
    }

    public int r() {
        return this.K;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        if (this.i.hasFatalError() || v()) {
            return;
        }
        if (this.i.isLoading()) {
            Assertions.checkNotNull(this.t);
            if (this.c.u(positionUs, this.t, this.n)) {
                this.i.cancelLoading();
                return;
            }
            return;
        }
        int size = this.n.size();
        while (size > 0 && this.c.b(this.n.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.n.size()) {
            l(size);
        }
        int iG = this.c.g(positionUs, this.n);
        if (iG < this.m.size()) {
            l(iG);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int id, int type) {
        TrackOutput trackOutputI;
        if (!n0.contains(Integer.valueOf(type))) {
            int i = 0;
            while (true) {
                TrackOutput[] trackOutputArr = this.u;
                if (i >= trackOutputArr.length) {
                    trackOutputI = null;
                    break;
                }
                if (this.v[i] == id) {
                    trackOutputI = trackOutputArr[i];
                    break;
                }
                i++;
            }
        } else {
            trackOutputI = q(id, type);
        }
        if (trackOutputI == null) {
            if (this.T) {
                return h(id, type);
            }
            trackOutputI = i(id, type);
        }
        if (type != 5) {
            return trackOutputI;
        }
        if (this.y == null) {
            this.y = new b(trackOutputI, this.k);
        }
        return this.y;
    }

    public boolean w(int sampleQueueIndex) {
        return !v() && this.u[sampleQueueIndex].isReady(this.S);
    }

    public void z() throws IOException {
        this.i.maybeThrowError();
        this.c.m();
    }

    public static class b implements TrackOutput {
        private static final String g = "EmsgUnwrappingTrackOutput";
        private static final Format h = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_ID3).build();
        private static final Format i = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_EMSG).build();
        private final EventMessageDecoder a = new EventMessageDecoder();
        private final TrackOutput b;
        private final Format c;
        private Format d;
        private byte[] e;
        private int f;

        public b(TrackOutput delegate, int metadataType) {
            this.b = delegate;
            if (metadataType == 1) {
                this.c = h;
            } else {
                if (metadataType != 3) {
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Unknown metadataType: ");
                    sb.append(metadataType);
                    throw new IllegalArgumentException(sb.toString());
                }
                this.c = i;
            }
            this.e = new byte[0];
            this.f = 0;
        }

        private boolean a(EventMessage emsg) {
            Format wrappedMetadataFormat = emsg.getWrappedMetadataFormat();
            return wrappedMetadataFormat != null && Util.areEqual(this.c.sampleMimeType, wrappedMetadataFormat.sampleMimeType);
        }

        private void b(int requiredLength) {
            byte[] bArr = this.e;
            if (bArr.length < requiredLength) {
                this.e = Arrays.copyOf(bArr, requiredLength + (requiredLength / 2));
            }
        }

        private ParsableByteArray c(int size, int offset) {
            int i2 = this.f - offset;
            ParsableByteArray parsableByteArray = new ParsableByteArray(Arrays.copyOfRange(this.e, i2 - size, i2));
            byte[] bArr = this.e;
            System.arraycopy(bArr, i2, bArr, 0, offset);
            this.f = offset;
            return parsableByteArray;
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void format(Format format) {
            this.d = format;
            this.b.format(this.c);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ int sampleData(DataReader dataReader, int i2, boolean z) {
            return com.google.android.exoplayer2.extractor.b.a(this, dataReader, i2, z);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public int sampleData(DataReader input, int length, boolean allowEndOfInput, int sampleDataPart) throws IOException {
            b(this.f + length);
            int i2 = input.read(this.e, this.f, length);
            if (i2 != -1) {
                this.f += i2;
                return i2;
            }
            if (allowEndOfInput) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i2) {
            com.google.android.exoplayer2.extractor.b.b(this, parsableByteArray, i2);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleMetadata(long timeUs, int flags, int size, int offset, @Nullable TrackOutput.CryptoData cryptoData) {
            Assertions.checkNotNull(this.d);
            ParsableByteArray parsableByteArrayC = c(size, offset);
            if (!Util.areEqual(this.d.sampleMimeType, this.c.sampleMimeType)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.d.sampleMimeType)) {
                    String strValueOf = String.valueOf(this.d.sampleMimeType);
                    Log.w(g, strValueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(strValueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                } else {
                    EventMessage eventMessageDecode = this.a.decode(parsableByteArrayC);
                    if (!a(eventMessageDecode)) {
                        Log.w(g, String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.c.sampleMimeType, eventMessageDecode.getWrappedMetadataFormat()));
                        return;
                    }
                    parsableByteArrayC = new ParsableByteArray((byte[]) Assertions.checkNotNull(eventMessageDecode.getWrappedMetadataBytes()));
                }
            }
            int iBytesLeft = parsableByteArrayC.bytesLeft();
            this.b.sampleData(parsableByteArrayC, iBytesLeft);
            this.b.sampleMetadata(timeUs, flags, iBytesLeft, offset, cryptoData);
        }

        @Override // com.google.android.exoplayer2.extractor.TrackOutput
        public void sampleData(ParsableByteArray data, int length, int sampleDataPart) {
            b(this.f + length);
            data.readBytes(this.e, this.f, length);
            this.f += length;
        }
    }
}
