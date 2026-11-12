package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.drm.DrmSessionManager;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.CompositeSequenceableLoaderFactory;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSourceEventListener;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.playlist.HlsMasterPlaylist;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import org.cybergarage.upnp.std.av.server.object.format.ID3Format;

/* JADX INFO: loaded from: classes3.dex */
public final class HlsMediaPeriod implements MediaPeriod, HlsSampleStreamWrapper.Callback, HlsPlaylistTracker.PlaylistEventListener {
    private final HlsExtractorFactory a;
    private final HlsPlaylistTracker b;
    private final HlsDataSourceFactory c;

    @Nullable
    private final TransferListener d;
    private final DrmSessionManager e;
    private final DrmSessionEventListener.EventDispatcher f;
    private final LoadErrorHandlingPolicy g;
    private final MediaSourceEventListener.EventDispatcher h;
    private final Allocator i;
    private final CompositeSequenceableLoaderFactory l;
    private final boolean m;
    private final int n;
    private final boolean o;

    @Nullable
    private MediaPeriod.Callback p;
    private int q;
    private TrackGroupArray r;
    private int v;
    private SequenceableLoader w;
    private final IdentityHashMap<SampleStream, Integer> j = new IdentityHashMap<>();
    private final TimestampAdjusterProvider k = new TimestampAdjusterProvider();
    private HlsSampleStreamWrapper[] s = new HlsSampleStreamWrapper[0];
    private HlsSampleStreamWrapper[] t = new HlsSampleStreamWrapper[0];
    private int[][] u = new int[0][];

    public HlsMediaPeriod(HlsExtractorFactory extractorFactory, HlsPlaylistTracker playlistTracker, HlsDataSourceFactory dataSourceFactory, @Nullable TransferListener mediaTransferListener, DrmSessionManager drmSessionManager, DrmSessionEventListener.EventDispatcher drmEventDispatcher, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.EventDispatcher eventDispatcher, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean allowChunklessPreparation, int metadataType, boolean useSessionKeys) {
        this.a = extractorFactory;
        this.b = playlistTracker;
        this.c = dataSourceFactory;
        this.d = mediaTransferListener;
        this.e = drmSessionManager;
        this.f = drmEventDispatcher;
        this.g = loadErrorHandlingPolicy;
        this.h = eventDispatcher;
        this.i = allocator;
        this.l = compositeSequenceableLoaderFactory;
        this.m = allowChunklessPreparation;
        this.n = metadataType;
        this.o = useSessionKeys;
        this.w = compositeSequenceableLoaderFactory.createCompositeSequenceableLoader(new SequenceableLoader[0]);
    }

    private void a(long positionUs, List<HlsMasterPlaylist.Rendition> audioRenditions, List<HlsSampleStreamWrapper> sampleStreamWrappers, List<int[]> manifestUrlsIndicesPerWrapper, Map<String, DrmInitData> overridingDrmInitData) {
        ArrayList arrayList = new ArrayList(audioRenditions.size());
        ArrayList arrayList2 = new ArrayList(audioRenditions.size());
        ArrayList arrayList3 = new ArrayList(audioRenditions.size());
        HashSet hashSet = new HashSet();
        for (int i = 0; i < audioRenditions.size(); i++) {
            String str = audioRenditions.get(i).name;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i2 = 0; i2 < audioRenditions.size(); i2++) {
                    if (Util.areEqual(str, audioRenditions.get(i2).name)) {
                        HlsMasterPlaylist.Rendition rendition = audioRenditions.get(i2);
                        arrayList3.add(Integer.valueOf(i2));
                        arrayList.add(rendition.url);
                        arrayList2.add(rendition.format);
                        z &= Util.getCodecCountOfType(rendition.format.codecs, 1) == 1;
                    }
                }
                HlsSampleStreamWrapper hlsSampleStreamWrapperD = d(1, (Uri[]) arrayList.toArray((Uri[]) Util.castNonNullTypeArray(new Uri[0])), (Format[]) arrayList2.toArray(new Format[0]), null, Collections.emptyList(), overridingDrmInitData, positionUs);
                manifestUrlsIndicesPerWrapper.add(Ints.toArray(arrayList3));
                sampleStreamWrappers.add(hlsSampleStreamWrapperD);
                if (this.m && z) {
                    hlsSampleStreamWrapperD.I(new TrackGroup[]{new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))}, 0, new int[0]);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    private void b(HlsMasterPlaylist masterPlaylist, long positionUs, List<HlsSampleStreamWrapper> sampleStreamWrappers, List<int[]> manifestUrlIndicesPerWrapper, Map<String, DrmInitData> overridingDrmInitData) {
        boolean z;
        boolean z2;
        Uri[] uriArr;
        Format[] formatArr;
        int[] iArr;
        int i;
        int i2;
        int codecCountOfType;
        boolean z3;
        int i3;
        int size = masterPlaylist.variants.size();
        int[] iArr2 = new int[size];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < masterPlaylist.variants.size(); i6++) {
            Format format = masterPlaylist.variants.get(i6).format;
            if (format.height > 0 || Util.getCodecsOfType(format.codecs, 2) != null) {
                iArr2[i6] = 2;
                i4++;
            } else if (Util.getCodecsOfType(format.codecs, 1) != null) {
                iArr2[i6] = 1;
                i5++;
            } else {
                iArr2[i6] = -1;
            }
        }
        if (i4 <= 0) {
            if (i5 < size) {
                size -= i5;
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            uriArr = new Uri[size];
            formatArr = new Format[size];
            iArr = new int[size];
            i2 = 0;
            for (i = 0; i < masterPlaylist.variants.size(); i++) {
                if ((z || iArr2[i] == 2) && (!z2 || iArr2[i] != 1)) {
                    HlsMasterPlaylist.Variant variant = masterPlaylist.variants.get(i);
                    uriArr[i2] = variant.url;
                    formatArr[i2] = variant.format;
                    iArr[i2] = i;
                    i2++;
                }
            }
            String str = formatArr[0].codecs;
            int codecCountOfType2 = Util.getCodecCountOfType(str, 2);
            codecCountOfType = Util.getCodecCountOfType(str, 1);
            if (codecCountOfType <= 1 || codecCountOfType2 > 1 || codecCountOfType + codecCountOfType2 <= 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z || codecCountOfType <= 0) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapperD = d(i3, uriArr, formatArr, masterPlaylist.muxedAudioFormat, masterPlaylist.muxedCaptionFormats, overridingDrmInitData, positionUs);
            sampleStreamWrappers.add(hlsSampleStreamWrapperD);
            manifestUrlIndicesPerWrapper.add(iArr);
            if (this.m || !z3) {
            }
            ArrayList arrayList = new ArrayList();
            if (codecCountOfType2 > 0) {
                Format[] formatArr2 = new Format[size];
                for (int i7 = 0; i7 < size; i7++) {
                    formatArr2[i7] = g(formatArr[i7]);
                }
                arrayList.add(new TrackGroup(formatArr2));
                if (codecCountOfType > 0 && (masterPlaylist.muxedAudioFormat != null || masterPlaylist.audios.isEmpty())) {
                    arrayList.add(new TrackGroup(e(formatArr[0], masterPlaylist.muxedAudioFormat, false)));
                }
                List<Format> list = masterPlaylist.muxedCaptionFormats;
                if (list != null) {
                    for (int i8 = 0; i8 < list.size(); i8++) {
                        arrayList.add(new TrackGroup(list.get(i8)));
                    }
                }
            } else {
                Format[] formatArr3 = new Format[size];
                for (int i9 = 0; i9 < size; i9++) {
                    formatArr3[i9] = e(formatArr[i9], masterPlaylist.muxedAudioFormat, true);
                }
                arrayList.add(new TrackGroup(formatArr3));
            }
            TrackGroup trackGroup = new TrackGroup(new Format.Builder().setId(ID3Format.HEADER_ID).setSampleMimeType(MimeTypes.APPLICATION_ID3).build());
            arrayList.add(trackGroup);
            hlsSampleStreamWrapperD.I((TrackGroup[]) arrayList.toArray(new TrackGroup[0]), 0, arrayList.indexOf(trackGroup));
            return;
        }
        size = i4;
        z = true;
        z2 = false;
        uriArr = new Uri[size];
        formatArr = new Format[size];
        iArr = new int[size];
        i2 = 0;
        while (i < masterPlaylist.variants.size()) {
            if (z) {
                HlsMasterPlaylist.Variant variant2 = masterPlaylist.variants.get(i);
                uriArr[i2] = variant2.url;
                formatArr[i2] = variant2.format;
                iArr[i2] = i;
                i2++;
            } else {
                HlsMasterPlaylist.Variant variant3 = masterPlaylist.variants.get(i);
                uriArr[i2] = variant3.url;
                formatArr[i2] = variant3.format;
                iArr[i2] = i;
                i2++;
            }
        }
        String str2 = formatArr[0].codecs;
        int codecCountOfType3 = Util.getCodecCountOfType(str2, 2);
        codecCountOfType = Util.getCodecCountOfType(str2, 1);
        if (codecCountOfType <= 1) {
            z3 = false;
        } else {
            z3 = false;
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = 0;
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapperD2 = d(i3, uriArr, formatArr, masterPlaylist.muxedAudioFormat, masterPlaylist.muxedCaptionFormats, overridingDrmInitData, positionUs);
        sampleStreamWrappers.add(hlsSampleStreamWrapperD2);
        manifestUrlIndicesPerWrapper.add(iArr);
        if (this.m) {
        }
    }

    private void c(long positionUs) {
        HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) Assertions.checkNotNull(this.b.getMasterPlaylist());
        Map<String, DrmInitData> mapF = this.o ? f(hlsMasterPlaylist.sessionKeyDrmInitData) : Collections.emptyMap();
        boolean z = !hlsMasterPlaylist.variants.isEmpty();
        List<HlsMasterPlaylist.Rendition> list = hlsMasterPlaylist.audios;
        List<HlsMasterPlaylist.Rendition> list2 = hlsMasterPlaylist.subtitles;
        this.q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            b(hlsMasterPlaylist, positionUs, arrayList, arrayList2, mapF);
        }
        a(positionUs, list, arrayList, arrayList2, mapF);
        this.v = arrayList.size();
        int i = 0;
        while (i < list2.size()) {
            HlsMasterPlaylist.Rendition rendition = list2.get(i);
            int i2 = i;
            HlsSampleStreamWrapper hlsSampleStreamWrapperD = d(3, new Uri[]{rendition.url}, new Format[]{rendition.format}, null, Collections.emptyList(), mapF, positionUs);
            arrayList2.add(new int[]{i2});
            arrayList.add(hlsSampleStreamWrapperD);
            hlsSampleStreamWrapperD.I(new TrackGroup[]{new TrackGroup(rendition.format)}, 0, new int[0]);
            i = i2 + 1;
        }
        this.s = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        this.u = (int[][]) arrayList2.toArray(new int[0][]);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.s;
        this.q = hlsSampleStreamWrapperArr.length;
        hlsSampleStreamWrapperArr[0].R(true);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            hlsSampleStreamWrapper.g();
        }
        this.t = this.s;
    }

    private HlsSampleStreamWrapper d(int trackType, Uri[] playlistUrls, Format[] playlistFormats, @Nullable Format muxedAudioFormat, @Nullable List<Format> muxedCaptionFormats, Map<String, DrmInitData> overridingDrmInitData, long positionUs) {
        return new HlsSampleStreamWrapper(trackType, this, new HlsChunkSource(this.a, this.b, playlistUrls, playlistFormats, this.c, this.d, this.k, muxedCaptionFormats), overridingDrmInitData, this.i, positionUs, muxedAudioFormat, this.e, this.f, this.g, this.h, this.n);
    }

    private static Format e(Format variantFormat, @Nullable Format mediaTagFormat, boolean isPrimaryTrackInVariant) {
        String str;
        Metadata metadata;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        if (mediaTagFormat != null) {
            str2 = mediaTagFormat.codecs;
            metadata = mediaTagFormat.metadata;
            int i4 = mediaTagFormat.channelCount;
            i2 = mediaTagFormat.selectionFlags;
            int i5 = mediaTagFormat.roleFlags;
            String str4 = mediaTagFormat.language;
            str3 = mediaTagFormat.label;
            i3 = i4;
            i = i5;
            str = str4;
        } else {
            String codecsOfType = Util.getCodecsOfType(variantFormat.codecs, 1);
            Metadata metadata2 = variantFormat.metadata;
            if (isPrimaryTrackInVariant) {
                int i6 = variantFormat.channelCount;
                int i7 = variantFormat.selectionFlags;
                int i8 = variantFormat.roleFlags;
                str = variantFormat.language;
                str2 = codecsOfType;
                str3 = variantFormat.label;
                i3 = i6;
                i2 = i7;
                metadata = metadata2;
                i = i8;
            } else {
                str = null;
                metadata = metadata2;
                i = 0;
                i2 = 0;
                i3 = -1;
                str2 = codecsOfType;
                str3 = null;
            }
        }
        return new Format.Builder().setId(variantFormat.id).setLabel(str3).setContainerMimeType(variantFormat.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(str2)).setCodecs(str2).setMetadata(metadata).setAverageBitrate(isPrimaryTrackInVariant ? variantFormat.averageBitrate : -1).setPeakBitrate(isPrimaryTrackInVariant ? variantFormat.peakBitrate : -1).setChannelCount(i3).setSelectionFlags(i2).setRoleFlags(i).setLanguage(str).build();
    }

    private static Map<String, DrmInitData> f(List<DrmInitData> sessionKeyDrmInitData) {
        ArrayList arrayList = new ArrayList(sessionKeyDrmInitData);
        HashMap map = new HashMap();
        int i = 0;
        while (i < arrayList.size()) {
            DrmInitData drmInitDataMerge = sessionKeyDrmInitData.get(i);
            String str = drmInitDataMerge.schemeType;
            i++;
            int i2 = i;
            while (i2 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i2);
                if (TextUtils.equals(drmInitData.schemeType, str)) {
                    drmInitDataMerge = drmInitDataMerge.merge(drmInitData);
                    arrayList.remove(i2);
                } else {
                    i2++;
                }
            }
            map.put(str, drmInitDataMerge);
        }
        return map;
    }

    private static Format g(Format variantFormat) {
        String codecsOfType = Util.getCodecsOfType(variantFormat.codecs, 2);
        return new Format.Builder().setId(variantFormat.id).setLabel(variantFormat.label).setContainerMimeType(variantFormat.containerMimeType).setSampleMimeType(MimeTypes.getMediaMimeType(codecsOfType)).setCodecs(codecsOfType).setMetadata(variantFormat.metadata).setAverageBitrate(variantFormat.averageBitrate).setPeakBitrate(variantFormat.peakBitrate).setWidth(variantFormat.width).setHeight(variantFormat.height).setFrameRate(variantFormat.frameRate).setSelectionFlags(variantFormat.selectionFlags).setRoleFlags(variantFormat.roleFlags).build();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean continueLoading(long positionUs) {
        if (this.r != null) {
            return this.w.continueLoading(positionUs);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            hlsSampleStreamWrapper.g();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void discardBuffer(long positionUs, boolean toKeyframe) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.t) {
            hlsSampleStreamWrapper.discardBuffer(positionUs, toKeyframe);
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long getAdjustedSeekPositionUs(long positionUs, SeekParameters seekParameters) {
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getBufferedPositionUs() {
        return this.w.getBufferedPositionUs();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public long getNextLoadPositionUs() {
        return this.w.getNextLoadPositionUs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public List<StreamKey> getStreamKeys(List<ExoTrackSelection> list) {
        int[] iArr;
        TrackGroupArray trackGroups;
        int iR;
        HlsMediaPeriod hlsMediaPeriod = this;
        HlsMasterPlaylist hlsMasterPlaylist = (HlsMasterPlaylist) Assertions.checkNotNull(hlsMediaPeriod.b.getMasterPlaylist());
        boolean z = !hlsMasterPlaylist.variants.isEmpty();
        int length = hlsMediaPeriod.s.length - hlsMasterPlaylist.subtitles.size();
        int i = 0;
        if (z) {
            HlsSampleStreamWrapper hlsSampleStreamWrapper = hlsMediaPeriod.s[0];
            iArr = hlsMediaPeriod.u[0];
            trackGroups = hlsSampleStreamWrapper.getTrackGroups();
            iR = hlsSampleStreamWrapper.r();
        } else {
            iArr = new int[0];
            trackGroups = TrackGroupArray.EMPTY;
            iR = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (ExoTrackSelection exoTrackSelection : list) {
            TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
            int iIndexOf = trackGroups.indexOf(trackGroup);
            if (iIndexOf == -1) {
                ?? r15 = z;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = hlsMediaPeriod.s;
                    if (r15 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[r15].getTrackGroups().indexOf(trackGroup) != -1) {
                        int i2 = r15 < length ? 1 : 2;
                        int[] iArr2 = hlsMediaPeriod.u[r15];
                        for (int i3 = 0; i3 < exoTrackSelection.length(); i3++) {
                            arrayList.add(new StreamKey(i2, iArr2[exoTrackSelection.getIndexInTrackGroup(i3)]));
                        }
                        break;
                    }
                    hlsMediaPeriod = this;
                    r15++;
                }
            } else if (iIndexOf == iR) {
                for (int i4 = 0; i4 < exoTrackSelection.length(); i4++) {
                    arrayList.add(new StreamKey(i, iArr[exoTrackSelection.getIndexInTrackGroup(i4)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
            hlsMediaPeriod = this;
            i = 0;
        }
        if (z2 && !z3) {
            int i5 = iArr[0];
            int i6 = hlsMasterPlaylist.variants.get(iArr[0]).format.bitrate;
            for (int i7 = 1; i7 < iArr.length; i7++) {
                int i8 = hlsMasterPlaylist.variants.get(iArr[i7]).format.bitrate;
                if (i8 < i6) {
                    i5 = iArr[i7];
                    i6 = i8;
                }
            }
            arrayList.add(new StreamKey(0, i5));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public TrackGroupArray getTrackGroups() {
        return (TrackGroupArray) Assertions.checkNotNull(this.r);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public boolean isLoading() {
        return this.w.isLoading();
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void maybeThrowPrepareError() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            hlsSampleStreamWrapper.maybeThrowPrepareError();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public void onPlaylistChanged() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            hlsSampleStreamWrapper.G();
        }
        this.p.onContinueLoadingRequested(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.PlaylistEventListener
    public boolean onPlaylistError(Uri url, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, boolean forceRetry) {
        boolean zF = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            zF &= hlsSampleStreamWrapper.F(url, loadErrorInfo, forceRetry);
        }
        this.p.onContinueLoadingRequested(this);
        return zF;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    public void onPlaylistRefreshRequired(Uri url) {
        this.b.refreshPlaylist(url);
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsSampleStreamWrapper.Callback
    public void onPrepared() {
        int i = this.q - 1;
        this.q = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            i2 += hlsSampleStreamWrapper.getTrackGroups().length;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : this.s) {
            int i4 = hlsSampleStreamWrapper2.getTrackGroups().length;
            int i5 = 0;
            while (i5 < i4) {
                trackGroupArr[i3] = hlsSampleStreamWrapper2.getTrackGroups().get(i5);
                i5++;
                i3++;
            }
        }
        this.r = new TrackGroupArray(trackGroupArr);
        this.p.onPrepared(this);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public void prepare(MediaPeriod.Callback callback, long positionUs) {
        this.p = callback;
        this.b.addListener(this);
        c(positionUs);
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long readDiscontinuity() {
        return C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod, com.google.android.exoplayer2.source.SequenceableLoader
    public void reevaluateBuffer(long positionUs) {
        this.w.reevaluateBuffer(positionUs);
    }

    public void release() {
        this.b.removeListener(this);
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.s) {
            hlsSampleStreamWrapper.K();
        }
        this.p = null;
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long seekToUs(long positionUs) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.t;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zN = hlsSampleStreamWrapperArr[0].N(positionUs, false);
            int i = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.t;
                if (i >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i].N(positionUs, zN);
                i++;
            }
            if (zN) {
                this.k.reset();
            }
        }
        return positionUs;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    @Override // com.google.android.exoplayer2.source.MediaPeriod
    public long selectTracks(ExoTrackSelection[] selections, boolean[] mayRetainStreamFlags, SampleStream[] streams, boolean[] streamResetFlags, long positionUs) {
        SampleStream[] sampleStreamArr = streams;
        int[] iArr = new int[selections.length];
        int[] iArr2 = new int[selections.length];
        for (int i = 0; i < selections.length; i++) {
            iArr[i] = sampleStreamArr[i] == null ? -1 : this.j.get(sampleStreamArr[i]).intValue();
            iArr2[i] = -1;
            if (selections[i] != null) {
                TrackGroup trackGroup = selections[i].getTrackGroup();
                int i2 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.s;
                    if (i2 >= hlsSampleStreamWrapperArr.length) {
                        break;
                    }
                    if (hlsSampleStreamWrapperArr[i2].getTrackGroups().indexOf(trackGroup) != -1) {
                        iArr2[i] = i2;
                        break;
                    }
                    i2++;
                }
            }
        }
        this.j.clear();
        int length = selections.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length];
        SampleStream[] sampleStreamArr3 = new SampleStream[selections.length];
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[selections.length];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = new HlsSampleStreamWrapper[this.s.length];
        int i3 = 0;
        int i4 = 0;
        boolean z = false;
        while (i4 < this.s.length) {
            for (int i5 = 0; i5 < selections.length; i5++) {
                ExoTrackSelection exoTrackSelection = null;
                sampleStreamArr3[i5] = iArr[i5] == i4 ? sampleStreamArr[i5] : null;
                if (iArr2[i5] == i4) {
                    exoTrackSelection = selections[i5];
                }
                exoTrackSelectionArr[i5] = exoTrackSelection;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper = this.s[i4];
            int i6 = i3;
            int i7 = length;
            int i8 = i4;
            ExoTrackSelection[] exoTrackSelectionArr2 = exoTrackSelectionArr;
            HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = hlsSampleStreamWrapperArr2;
            boolean zO = hlsSampleStreamWrapper.O(exoTrackSelectionArr, mayRetainStreamFlags, sampleStreamArr3, streamResetFlags, positionUs, z);
            int i9 = 0;
            boolean z2 = false;
            while (true) {
                if (i9 >= selections.length) {
                    break;
                }
                SampleStream sampleStream = sampleStreamArr3[i9];
                if (iArr2[i9] == i8) {
                    Assertions.checkNotNull(sampleStream);
                    sampleStreamArr2[i9] = sampleStream;
                    this.j.put(sampleStream, Integer.valueOf(i8));
                    z2 = true;
                } else if (iArr[i9] == i8) {
                    Assertions.checkState(sampleStream == null);
                }
                i9++;
            }
            if (z2) {
                hlsSampleStreamWrapperArr3[i6] = hlsSampleStreamWrapper;
                i3 = i6 + 1;
                if (i6 == 0) {
                    hlsSampleStreamWrapper.R(true);
                    if (zO) {
                        this.k.reset();
                        z = true;
                    } else {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = this.t;
                        if (hlsSampleStreamWrapperArr4.length == 0 || hlsSampleStreamWrapper != hlsSampleStreamWrapperArr4[0]) {
                            this.k.reset();
                            z = true;
                        }
                    }
                } else {
                    hlsSampleStreamWrapper.R(i8 < this.v);
                }
            } else {
                i3 = i6;
            }
            i4 = i8 + 1;
            hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr3;
            length = i7;
            exoTrackSelectionArr = exoTrackSelectionArr2;
            sampleStreamArr = streams;
        }
        System.arraycopy(sampleStreamArr2, 0, sampleStreamArr, 0, length);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr5 = (HlsSampleStreamWrapper[]) Util.nullSafeArrayCopy(hlsSampleStreamWrapperArr2, i3);
        this.t = hlsSampleStreamWrapperArr5;
        this.w = this.l.createCompositeSequenceableLoader(hlsSampleStreamWrapperArr5);
        return positionUs;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public void onContinueLoadingRequested(HlsSampleStreamWrapper sampleStreamWrapper) {
        this.p.onContinueLoadingRequested(this);
    }
}
