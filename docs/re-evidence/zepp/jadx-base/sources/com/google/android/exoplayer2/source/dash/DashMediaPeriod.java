package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.EmptySampleStream;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.Descriptor;
import com.google.android.exoplayer2.source.dash.manifest.EventStream;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.Callback<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.ReleaseCallback<DashChunkSource> {
    private static final Pattern x = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern y = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int a;
    private final DashChunkSource.Factory b;

    @Nullable
    private final TransferListener c;
    private final DrmSessionManager d;
    private final LoadErrorHandlingPolicy e;
    private final BaseUrlExclusionList f;
    private final long g;
    private final LoaderErrorThrower h;
    private final Allocator i;
    private final TrackGroupArray j;
    private final TrackGroupInfo[] k;
    private final CompositeSequenceableLoaderFactory l;
    private final PlayerEmsgHandler m;
    private final MediaSourceEventListener.EventDispatcher o;
    private final DrmSessionEventListener.EventDispatcher p;

    @Nullable
    private MediaPeriod.Callback q;
    private SequenceableLoader t;
    private DashManifest u;
    private int v;
    private List<EventStream> w;
    private ChunkSampleStream<DashChunkSource>[] r = n(0);
    private a[] s = new a[0];
    private final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.PlayerTrackEmsgHandler> n = new IdentityHashMap<>();

    public static final class TrackGroupInfo {
        private static final int h = 0;
        private static final int i = 1;
        private static final int j = 2;
        public final int[] a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface TrackGroupCategory {
        }

        private TrackGroupInfo(int trackType, int trackGroupCategory, int[] adaptationSetIndices, int primaryTrackGroupIndex, int embeddedEventMessageTrackGroupIndex, int embeddedClosedCaptionTrackGroupIndex, int eventStreamGroupIndex) {
            this.b = trackType;
            this.a = adaptationSetIndices;
            this.c = trackGroupCategory;
            this.e = primaryTrackGroupIndex;
            this.f = embeddedEventMessageTrackGroupIndex;
            this.g = embeddedClosedCaptionTrackGroupIndex;
            this.d = eventStreamGroupIndex;
        }

        public static TrackGroupInfo a(int[] adaptationSetIndices, int primaryTrackGroupIndex) {
            return new TrackGroupInfo(3, 1, adaptationSetIndices, primaryTrackGroupIndex, -1, -1, -1);
        }

        public static TrackGroupInfo b(int[] adaptationSetIndices, int primaryTrackGroupIndex) {
            return new TrackGroupInfo(5, 1, adaptationSetIndices, primaryTrackGroupIndex, -1, -1, -1);
        }

        public static TrackGroupInfo c(int eventStreamIndex) {
            return new TrackGroupInfo(5, 2, new int[0], -1, -1, -1, eventStreamIndex);
        }

        public static TrackGroupInfo d(int trackType, int[] adaptationSetIndices, int primaryTrackGroupIndex, int embeddedEventMessageTrackGroupIndex, int embeddedClosedCaptionTrackGroupIndex) {
            return new TrackGroupInfo(trackType, 0, adaptationSetIndices, primaryTrackGroupIndex, embeddedEventMessageTrackGroupIndex, embeddedClosedCaptionTrackGroupIndex, -1);
        }
    }

    public DashMediaPeriod(int id, DashManifest manifest, BaseUrlExclusionList baseUrlExclusionList, int periodIndex, DashChunkSource.Factory chunkSourceFactory, @Nullable TransferListener transferListener, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher mediaSourceEventDispatcher, long elapsedRealtimeOffsetMs, LoaderErrorThrower manifestLoaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.PlayerEmsgCallback playerEmsgCallback) {
        this.a = id;
        this.u = manifest;
        this.f = baseUrlExclusionList;
        this.v = periodIndex;
        this.b = chunkSourceFactory;
        this.c = transferListener;
        this.d = drmSessionManager;
        this.p = drmEventDispatcher;
        this.e = loadErrorHandlingPolicy;
        this.o = mediaSourceEventDispatcher;
        this.g = elapsedRealtimeOffsetMs;
        this.h = manifestLoaderErrorThrower;
        this.i = allocator;
        this.l = compositeSequenceableLoaderFactory;
        this.m = new PlayerEmsgHandler(manifest, playerEmsgCallback, allocator);
        this.t = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(this.r);
        Period period = manifest.getPeriod(periodIndex);
        List<EventStream> list = period.eventStreams;
        this.w = list;
        Pair<TrackGroupArray, TrackGroupInfo[]> pairD = d(drmSessionManager, period.adaptationSets, list);
        this.j = (TrackGroupArray) pairD.first;
        this.k = (TrackGroupInfo[]) pairD.second;
    }

    private static void a(List<EventStream> eventStreams, TrackGroup[] trackGroups, TrackGroupInfo[] trackGroupInfos, int existingTrackGroupCount) {
        int i = 0;
        while (i < eventStreams.size()) {
            trackGroups[existingTrackGroupCount] = new TrackGroup(new Format.Builder().setId(eventStreams.get(i).id()).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
            trackGroupInfos[existingTrackGroupCount] = TrackGroupInfo.c(i);
            i++;
            existingTrackGroupCount++;
        }
    }

    private static int b(DrmSessionManager drmSessionManager, List<AdaptationSet> adaptationSets, int[][] groupedAdaptationSetIndices, int primaryGroupCount, boolean[] primaryGroupHasEventMessageTrackFlags, Format[][] primaryGroupClosedCaptionTrackFormats, TrackGroup[] trackGroups, TrackGroupInfo[] trackGroupInfos) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < primaryGroupCount) {
            int[] iArr = groupedAdaptationSetIndices[i3];
            ArrayList arrayList = new ArrayList();
            for (int i5 : iArr) {
                arrayList.addAll(adaptationSets.get(i5).representations);
            }
            int size = arrayList.size();
            Format[] formatArr = new Format[size];
            for (int i6 = 0; i6 < size; i6++) {
                Format format = ((Representation) arrayList.get(i6)).format;
                formatArr[i6] = format.copyWithExoMediaCryptoType(drmSessionManager.getExoMediaCryptoType(format));
            }
            AdaptationSet adaptationSet = adaptationSets.get(iArr[0]);
            int i7 = i4 + 1;
            if (primaryGroupHasEventMessageTrackFlags[i3]) {
                i = i7 + 1;
            } else {
                i = i7;
                i7 = -1;
            }
            if (primaryGroupClosedCaptionTrackFormats[i3].length != 0) {
                i2 = i + 1;
            } else {
                i2 = i;
                i = -1;
            }
            trackGroups[i4] = new TrackGroup(formatArr);
            trackGroupInfos[i4] = TrackGroupInfo.d(adaptationSet.type, iArr, i4, i7, i);
            if (i7 != -1) {
                Format.Builder builder = new Format.Builder();
                int i8 = adaptationSet.id;
                StringBuilder sb = new StringBuilder(16);
                sb.append(i8);
                sb.append(":emsg");
                trackGroups[i7] = new TrackGroup(builder.setId(sb.toString()).setSampleMimeType(MimeTypes.APPLICATION_EMSG).build());
                trackGroupInfos[i7] = TrackGroupInfo.b(iArr, i4);
            }
            if (i != -1) {
                trackGroups[i] = new TrackGroup(primaryGroupClosedCaptionTrackFormats[i3]);
                trackGroupInfos[i] = TrackGroupInfo.a(iArr, i4);
            }
            i3++;
            i4 = i2;
        }
        return i4;
    }

    private ChunkSampleStream<DashChunkSource> c(TrackGroupInfo trackGroupInfo, ExoTrackSelection selection, long positionUs) {
        TrackGroup trackGroup;
        int i;
        TrackGroup trackGroup2;
        int i2;
        int i3 = trackGroupInfo.f;
        boolean z = i3 != -1;
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = null;
        if (z) {
            trackGroup = this.j.get(i3);
            i = 1;
        } else {
            trackGroup = null;
            i = 0;
        }
        int i4 = trackGroupInfo.g;
        boolean z2 = i4 != -1;
        if (z2) {
            trackGroup2 = this.j.get(i4);
            i += trackGroup2.length;
        } else {
            trackGroup2 = null;
        }
        Format[] formatArr = new Format[i];
        int[] iArr = new int[i];
        if (z) {
            formatArr[0] = trackGroup.getFormat(0);
            iArr[0] = 5;
            i2 = 1;
        } else {
            i2 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i5 = 0; i5 < trackGroup2.length; i5++) {
                formatArr[i2] = trackGroup2.getFormat(i5);
                iArr[i2] = 3;
                arrayList.add(formatArr[i2]);
                i2++;
            }
        }
        if (this.u.dynamic && z) {
            playerTrackEmsgHandlerNewPlayerTrackEmsgHandler = this.m.newPlayerTrackEmsgHandler();
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = playerTrackEmsgHandlerNewPlayerTrackEmsgHandler;
        ChunkSampleStream<DashChunkSource> chunkSampleStream = new ChunkSampleStream<>(trackGroupInfo.b, iArr, formatArr, this.b.createDashChunkSource(this.h, this.u, this.f, this.v, trackGroupInfo.a, selection, trackGroupInfo.b, this.g, z, arrayList, playerTrackEmsgHandler, this.c), this, this.i, positionUs, this.d, this.p, this.e, this.o);
        synchronized (this) {
            this.n.put(chunkSampleStream, playerTrackEmsgHandler);
        }
        return chunkSampleStream;
    }

    private static Pair<TrackGroupArray, TrackGroupInfo[]> d(DrmSessionManager drmSessionManager, List<AdaptationSet> adaptationSets, List<EventStream> eventStreams) {
        int[][] iArrI = i(adaptationSets);
        int length = iArrI.length;
        boolean[] zArr = new boolean[length];
        Format[][] formatArr = new Format[length][];
        int iM = m(length, adaptationSets, iArrI, zArr, formatArr) + length + eventStreams.size();
        TrackGroup[] trackGroupArr = new TrackGroup[iM];
        TrackGroupInfo[] trackGroupInfoArr = new TrackGroupInfo[iM];
        a(eventStreams, trackGroupArr, trackGroupInfoArr, b(drmSessionManager, adaptationSets, iArrI, length, zArr, formatArr, trackGroupArr, trackGroupInfoArr));
        return Pair.create(new TrackGroupArray(trackGroupArr), trackGroupInfoArr);
    }

    @Nullable
    private static Descriptor e(List<Descriptor> descriptors) {
        return f(descriptors, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @Nullable
    private static Descriptor f(List<Descriptor> descriptors, String schemeIdUri) {
        for (int i = 0; i < descriptors.size(); i++) {
            Descriptor descriptor = descriptors.get(i);
            if (schemeIdUri.equals(descriptor.schemeIdUri)) {
                return descriptor;
            }
        }
        return null;
    }

    @Nullable
    private static Descriptor g(List<Descriptor> descriptors) {
        return f(descriptors, "http://dashif.org/guidelines/trickmode");
    }

    private static Format[] h(List<AdaptationSet> adaptationSets, int[] adaptationSetIndices) {
        for (int i : adaptationSetIndices) {
            AdaptationSet adaptationSet = adaptationSets.get(i);
            List<Descriptor> list = adaptationSets.get(i).accessibilityDescriptors;
            for (int i2 = 0; i2 < list.size(); i2++) {
                Descriptor descriptor = list.get(i2);
                if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri)) {
                    Format.Builder sampleMimeType = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA608);
                    int i3 = adaptationSet.id;
                    StringBuilder sb = new StringBuilder(18);
                    sb.append(i3);
                    sb.append(":cea608");
                    return p(descriptor, x, sampleMimeType.setId(sb.toString()).build());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri)) {
                    Format.Builder sampleMimeType2 = new Format.Builder().setSampleMimeType(MimeTypes.APPLICATION_CEA708);
                    int i4 = adaptationSet.id;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append(i4);
                    sb2.append(":cea708");
                    return p(descriptor, y, sampleMimeType2.setId(sb2.toString()).build());
                }
            }
        }
        return new Format[0];
    }

    private static int[][] i(List<AdaptationSet> adaptationSets) {
        int iMin;
        Descriptor descriptorE;
        int size = adaptationSets.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i = 0; i < size; i++) {
            sparseIntArray.put(adaptationSets.get(i).id, i);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i));
            arrayList.add(arrayList2);
            sparseArray.put(i, arrayList2);
        }
        for (int i2 = 0; i2 < size; i2++) {
            AdaptationSet adaptationSet = adaptationSets.get(i2);
            Descriptor descriptorG = g(adaptationSet.essentialProperties);
            if (descriptorG == null) {
                descriptorG = g(adaptationSet.supplementalProperties);
            }
            if (descriptorG == null || (iMin = sparseIntArray.get(Integer.parseInt(descriptorG.value), -1)) == -1) {
                iMin = i2;
            }
            if (iMin == i2 && (descriptorE = e(adaptationSet.supplementalProperties)) != null) {
                for (String str : Util.split(descriptorE.value, ",")) {
                    int i3 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i3 != -1) {
                        iMin = Math.min(iMin, i3);
                    }
                }
            }
            if (iMin != i2) {
                List list = (List) sparseArray.get(i2);
                List list2 = (List) sparseArray.get(iMin);
                list2.addAll(list);
                sparseArray.put(i2, list2);
                arrayList.remove(list);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i4 = 0; i4 < size2; i4++) {
            iArr[i4] = Ints.toArray((Collection) arrayList.get(i4));
            Arrays.sort(iArr[i4]);
        }
        return iArr;
    }

    private int j(int embeddedStreamIndex, int[] streamIndexToTrackGroupIndex) {
        int i = streamIndexToTrackGroupIndex[embeddedStreamIndex];
        if (i == -1) {
            return -1;
        }
        int i2 = this.k[i].e;
        for (int i3 = 0; i3 < streamIndexToTrackGroupIndex.length; i3++) {
            int i4 = streamIndexToTrackGroupIndex[i3];
            if (i4 == i2 && this.k[i4].c == 0) {
                return i3;
            }
        }
        return -1;
    }

    private int[] k(ExoTrackSelection[] selections) {
        int[] iArr = new int[selections.length];
        for (int i = 0; i < selections.length; i++) {
            if (selections[i] != null) {
                iArr[i] = this.j.indexOf(selections[i].getTrackGroup());
            } else {
                iArr[i] = -1;
            }
        }
        return iArr;
    }

    private static boolean l(List<AdaptationSet> adaptationSets, int[] adaptationSetIndices) {
        for (int i : adaptationSetIndices) {
            List<Representation> list = adaptationSets.get(i).representations;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (!list.get(i2).inbandEventStreams.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int m(int primaryGroupCount, List<AdaptationSet> adaptationSets, int[][] groupedAdaptationSetIndices, boolean[] primaryGroupHasEventMessageTrackFlags, Format[][] primaryGroupClosedCaptionTrackFormats) {
        int i = 0;
        for (int i2 = 0; i2 < primaryGroupCount; i2++) {
            if (l(adaptationSets, groupedAdaptationSetIndices[i2])) {
                primaryGroupHasEventMessageTrackFlags[i2] = true;
                i++;
            }
            primaryGroupClosedCaptionTrackFormats[i2] = h(adaptationSets, groupedAdaptationSetIndices[i2]);
            if (primaryGroupClosedCaptionTrackFormats[i2].length != 0) {
                i++;
            }
        }
        return i;
    }

    private static ChunkSampleStream<DashChunkSource>[] n(int length) {
        return new ChunkSampleStream[length];
    }

    private static Format[] p(Descriptor descriptor, Pattern serviceDescriptorRegex, Format baseFormat) {
        String str = descriptor.value;
        if (str == null) {
            return new Format[]{baseFormat};
        }
        String[] strArrSplit = Util.split(str, ";");
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i = 0; i < strArrSplit.length; i++) {
            Matcher matcher = serviceDescriptorRegex.matcher(strArrSplit[i]);
            if (!matcher.matches()) {
                return new Format[]{baseFormat};
            }
            int i2 = Integer.parseInt(matcher.group(1));
            Format.Builder builderBuildUpon = baseFormat.buildUpon();
            String str2 = baseFormat.id;
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 12);
            sb.append(str2);
            sb.append(":");
            sb.append(i2);
            formatArr[i] = builderBuildUpon.setId(sb.toString()).setAccessibilityChannel(i2).setLanguage(matcher.group(2)).build();
        }
        return formatArr;
    }

    private void r(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams) {
        for (int i = 0; i < selections.length; i++) {
            if (selections[i] == null || !mayRetainStreamFlags[i]) {
                if (streams[i] instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) streams[i]).release(this);
                } else if (streams[i] instanceof ChunkSampleStream.EmbeddedSampleStream) {
                    ((ChunkSampleStream.EmbeddedSampleStream) streams[i]).release();
                }
                streams[i] = null;
            }
        }
    }

    private void s(ExoTrackSelection[] selections, SampleStream[] streams, int[] streamIndexToTrackGroupIndex) {
        for (int i = 0; i < selections.length; i++) {
            if ((streams[i] instanceof EmptySampleStream) || (streams[i] instanceof ChunkSampleStream.EmbeddedSampleStream)) {
                int iJ = j(i, streamIndexToTrackGroupIndex);
                if (!(iJ == -1 ? streams[i] instanceof EmptySampleStream : (streams[i] instanceof ChunkSampleStream.EmbeddedSampleStream) && ((ChunkSampleStream.EmbeddedSampleStream) streams[i]).parent == streams[iJ])) {
                    if (streams[i] instanceof ChunkSampleStream.EmbeddedSampleStream) {
                        ((ChunkSampleStream.EmbeddedSampleStream) streams[i]).release();
                    }
                    streams[i] = null;
                }
            }
        }
    }

    private void t(ExoTrackSelection[] selections, SampleStream[] streams, boolean[] streamResetFlags, long positionUs, int[] streamIndexToTrackGroupIndex) {
        for (int i = 0; i < selections.length; i++) {
            ExoTrackSelection exoTrackSelection = selections[i];
            if (exoTrackSelection != null) {
                if (streams[i] == null) {
                    streamResetFlags[i] = true;
                    TrackGroupInfo trackGroupInfo = this.k[streamIndexToTrackGroupIndex[i]];
                    int i2 = trackGroupInfo.c;
                    if (i2 == 0) {
                        streams[i] = c(trackGroupInfo, exoTrackSelection, positionUs);
                    } else if (i2 == 2) {
                        streams[i] = new a(this.w.get(trackGroupInfo.d), exoTrackSelection.getTrackGroup().getFormat(0), this.u.dynamic);
                    }
                } else if (streams[i] instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) streams[i]).getChunkSource()).updateTrackSelection(exoTrackSelection);
                }
            }
        }
        for (int i3 = 0; i3 < selections.length; i3++) {
            if (streams[i3] == null && selections[i3] != null) {
                TrackGroupInfo trackGroupInfo2 = this.k[streamIndexToTrackGroupIndex[i3]];
                if (trackGroupInfo2.c == 1) {
                    int iJ = j(i3, streamIndexToTrackGroupIndex);
                    if (iJ == -1) {
                        streams[i3] = new EmptySampleStream();
                    } else {
                        streams[i3] = ((ChunkSampleStream) streams[iJ]).selectEmbeddedTrack(positionUs, trackGroupInfo2.b);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        return this.t.continueLoading(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.r) {
            chunkSampleStream.discardBuffer(positionUs, toKeyframe);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.r) {
            if (chunkSampleStream.primaryTrackType == 2) {
                return chunkSampleStream.getAdjustedSeekPositionUs(positionUs, seekParameters);
            }
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.t.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.t.getNextLoadPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> trackSelections) {
        List<AdaptationSet> list = this.u.getPeriod(this.v).adaptationSets;
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection exoTrackSelection : trackSelections) {
            TrackGroupInfo trackGroupInfo = this.k[this.j.indexOf(exoTrackSelection.getTrackGroup())];
            if (trackGroupInfo.c == 0) {
                int[] iArr = trackGroupInfo.a;
                int length = exoTrackSelection.length();
                int[] iArr2 = new int[length];
                for (int i = 0; i < exoTrackSelection.length(); i++) {
                    iArr2[i] = exoTrackSelection.getIndexInTrackGroup(i);
                }
                Arrays.sort(iArr2);
                int size = list.get(iArr[0]).representations.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < length; i4++) {
                    int i5 = iArr2[i4];
                    while (true) {
                        int i6 = i3 + size;
                        if (i5 >= i6) {
                            i2++;
                            size = list.get(iArr[i2]).representations.size();
                            i3 = i6;
                        }
                    }
                    arrayList.add(new StreamKey(this.v, iArr[i2], i5 - i3));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.t.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        this.h.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onContinueLoadingRequested(ChunkSampleStream<DashChunkSource> sampleStream) {
        this.q.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSampleStream.ReleaseCallback
    public synchronized void onSampleStreamReleased(ChunkSampleStream<DashChunkSource> stream) {
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandlerRemove = this.n.remove(stream);
        if (playerTrackEmsgHandlerRemove != null) {
            playerTrackEmsgHandlerRemove.release();
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.q = callback;
        callback.onPrepared(this);
    }

    public void q() {
        this.m.release();
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.r) {
            chunkSampleStream.release(this);
        }
        this.q = null;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        this.t.reevaluateBuffer(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.r) {
            chunkSampleStream.seekToUs(positionUs);
        }
        for (a aVar : this.s) {
            aVar.b(positionUs);
        }
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        int[] iArrK = k(selections);
        r(selections, mayRetainStreamFlags, streams);
        s(selections, streams, iArrK);
        t(selections, streams, streamResetFlags, positionUs, iArrK);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (SampleStream sampleStream : streams) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof a) {
                arrayList2.add((a) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArrN = n(arrayList.size());
        this.r = chunkSampleStreamArrN;
        arrayList.toArray(chunkSampleStreamArrN);
        a[] aVarArr = new a[arrayList2.size()];
        this.s = aVarArr;
        arrayList2.toArray(aVarArr);
        this.t = this.l.createCompositeSequenceableLoader(this.r);
        return positionUs;
    }

    public void u(DashManifest manifest, int periodIndex) {
        this.u = manifest;
        this.v = periodIndex;
        this.m.updateManifest(manifest);
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = this.r;
        if (chunkSampleStreamArr != null) {
            for (ChunkSampleStream<DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                ((DashChunkSource) chunkSampleStream.getChunkSource()).updateManifest(manifest, periodIndex);
            }
            this.q.onContinueLoadingRequested(this);
        }
        this.w = manifest.getPeriod(periodIndex).eventStreams;
        for (a aVar : this.s) {
            for (EventStream eventStream : this.w) {
                if (eventStream.id().equals(aVar.a())) {
                    aVar.c(eventStream, manifest.dynamic && periodIndex == manifest.getPeriodCount() - 1);
                    break;
                }
            }
        }
    }
}
