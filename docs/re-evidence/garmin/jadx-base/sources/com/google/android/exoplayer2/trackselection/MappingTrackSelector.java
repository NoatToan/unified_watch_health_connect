package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.TracksInfo;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import j20.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    public static TracksInfo buildTracksInfo(TrackSelection[] trackSelectionArr, MappedTrackInfo mappedTrackInfo) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (int i14 = 0; i14 < mappedTrackInfo.getRendererCount(); i14++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i14);
            TrackSelection trackSelection = trackSelectionArr[i14];
            for (int i15 = 0; i15 < trackGroups.length; i15++) {
                TrackGroup trackGroup = trackGroups.get(i15);
                int i16 = trackGroup.length;
                int[] iArr = new int[i16];
                boolean[] zArr = new boolean[i16];
                for (int i17 = 0; i17 < trackGroup.length; i17++) {
                    iArr[i17] = mappedTrackInfo.getTrackSupport(i14, i15, i17);
                    zArr[i17] = (trackSelection == null || !trackSelection.getTrackGroup().equals(trackGroup) || trackSelection.indexOf(i17) == -1) ? false : true;
                }
                builder.add(new TracksInfo.TrackGroupInfo(trackGroup, iArr, mappedTrackInfo.getRendererType(i14), zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i18 = 0; i18 < unmappedTrackGroups.length; i18++) {
            TrackGroup trackGroup2 = unmappedTrackGroups.get(i18);
            int[] iArr2 = new int[trackGroup2.length];
            Arrays.fill(iArr2, 0);
            builder.add(new TracksInfo.TrackGroupInfo(trackGroup2, iArr2, MimeTypes.getTrackType(trackGroup2.getFormat(0).sampleMimeType), new boolean[trackGroup2.length]));
        }
        return new TracksInfo(builder.build());
    }

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, TrackGroup trackGroup, int[] iArr, boolean z14) {
        int length = rendererCapabilitiesArr.length;
        int i14 = 0;
        boolean z15 = true;
        for (int i15 = 0; i15 < rendererCapabilitiesArr.length; i15++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i15];
            int iMax = 0;
            for (int i16 = 0; i16 < trackGroup.length; i16++) {
                iMax = Math.max(iMax, RendererCapabilities.getFormatSupport(rendererCapabilities.supportsFormat(trackGroup.getFormat(i16))));
            }
            boolean z16 = iArr[i15] == 0;
            if (iMax > i14 || (iMax == i14 && z14 && !z15 && z16)) {
                length = i15;
                z15 = z16;
                i14 = iMax;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, TrackGroup trackGroup) {
        int[] iArr = new int[trackGroup.length];
        for (int i14 = 0; i14 < trackGroup.length; i14++) {
            iArr[i14] = rendererCapabilities.supportsFormat(trackGroup.getFormat(i14));
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i14 = 0; i14 < length; i14++) {
            iArr[i14] = rendererCapabilitiesArr[i14].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline);

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i14 = 0; i14 < length; i14++) {
            int i15 = trackGroupArray.length;
            trackGroupArr[i14] = new TrackGroup[i15];
            iArr2[i14] = new int[i15][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i16 = 0; i16 < trackGroupArray.length; i16++) {
            TrackGroup trackGroup = trackGroupArray.get(i16);
            int iFindRenderer = findRenderer(rendererCapabilitiesArr, trackGroup, iArr, MimeTypes.getTrackType(trackGroup.getFormat(0).sampleMimeType) == 5);
            int[] formatSupport = iFindRenderer == rendererCapabilitiesArr.length ? new int[trackGroup.length] : getFormatSupport(rendererCapabilitiesArr[iFindRenderer], trackGroup);
            int i17 = iArr[iFindRenderer];
            trackGroupArr[iFindRenderer][i17] = trackGroup;
            iArr2[iFindRenderer][i17] = formatSupport;
            iArr[iFindRenderer] = i17 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i18 = 0; i18 < rendererCapabilitiesArr.length; i18++) {
            int i19 = iArr[i18];
            trackGroupArrayArr[i18] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i18], i19));
            iArr2[i18] = (int[][]) Util.nullSafeArrayCopy(iArr2[i18], i19);
            strArr[i18] = rendererCapabilitiesArr[i18].getName();
            iArr3[i18] = rendererCapabilitiesArr[i18].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilitiesArr.length], iArr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, timeline);
        return new TrackSelectorResult((RendererConfiguration[]) pairSelectTracks.first, (ExoTrackSelection[]) pairSelectTracks.second, buildTracksInfo((TrackSelection[]) pairSelectTracks.second, mappedTrackInfo), mappedTrackInfo);
    }

    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        public MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getAdaptiveSupport(int i14, int i15, int[] iArr) {
            int i16 = 0;
            int iMin = 16;
            String str = null;
            boolean z14 = false;
            int i17 = 0;
            while (i16 < iArr.length) {
                String str2 = this.rendererTrackGroups[i14].get(i15).getFormat(iArr[i16]).sampleMimeType;
                int i18 = i17 + 1;
                if (i17 == 0) {
                    str = str2;
                } else {
                    z14 |= !Util.areEqual(str, str2);
                }
                iMin = Math.min(iMin, RendererCapabilities.getAdaptiveSupport(this.rendererFormatSupports[i14][i15][i16]));
                i16++;
                i17 = i18;
            }
            return z14 ? Math.min(iMin, this.rendererMixedMimeTypeAdaptiveSupports[i14]) : iMin;
        }

        public int getCapabilities(int i14, int i15, int i16) {
            return this.rendererFormatSupports[i14][i15][i16];
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public String getRendererName(int i14) {
            return this.rendererNames[i14];
        }

        public int getRendererSupport(int i14) {
            int iMax = 0;
            for (int[] iArr : this.rendererFormatSupports[i14]) {
                for (int i15 : iArr) {
                    int formatSupport = RendererCapabilities.getFormatSupport(i15);
                    int i16 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            x.h();
                            return 0;
                        }
                        i16 = 2;
                    }
                    iMax = Math.max(iMax, i16);
                }
            }
            return iMax;
        }

        public int getRendererType(int i14) {
            return this.rendererTrackTypes[i14];
        }

        public TrackGroupArray getTrackGroups(int i14) {
            return this.rendererTrackGroups[i14];
        }

        public int getTrackSupport(int i14, int i15, int i16) {
            return RendererCapabilities.getFormatSupport(getCapabilities(i14, i15, i16));
        }

        public int getTypeSupport(int i14) {
            int iMax = 0;
            for (int i15 = 0; i15 < this.rendererCount; i15++) {
                if (this.rendererTrackTypes[i15] == i14) {
                    iMax = Math.max(iMax, getRendererSupport(i15));
                }
            }
            return iMax;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i14, int i15, boolean z14) {
            int i16 = this.rendererTrackGroups[i14].get(i15).length;
            int[] iArr = new int[i16];
            int i17 = 0;
            for (int i18 = 0; i18 < i16; i18++) {
                int trackSupport = getTrackSupport(i14, i15, i18);
                if (trackSupport == 4 || (z14 && trackSupport == 3)) {
                    iArr[i17] = i18;
                    i17++;
                }
            }
            return getAdaptiveSupport(i14, i15, Arrays.copyOf(iArr, i17));
        }
    }
}
