package com.google.android.exoplayer2.trackselection;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MappingTrackSelector extends TrackSelector {

    @Nullable
    private MappedTrackInfo c;

    private static int a(RendererCapabilities[] rendererCapabilities, TrackGroup group, int[] rendererTrackGroupCounts, boolean preferUnassociatedRenderer) throws ExoPlaybackException {
        int length = rendererCapabilities.length;
        int i = 0;
        boolean z = true;
        for (int i2 = 0; i2 < rendererCapabilities.length; i2++) {
            RendererCapabilities rendererCapabilities2 = rendererCapabilities[i2];
            int iMax = 0;
            for (int i3 = 0; i3 < group.length; i3++) {
                iMax = Math.max(iMax, q0.d(rendererCapabilities2.supportsFormat(group.getFormat(i3))));
            }
            boolean z2 = rendererTrackGroupCounts[i2] == 0;
            if (iMax > i || (iMax == i && preferUnassociatedRenderer && !z && z2)) {
                length = i2;
                z = z2;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] b(RendererCapabilities rendererCapabilities, TrackGroup group) throws ExoPlaybackException {
        int[] iArr = new int[group.length];
        for (int i = 0; i < group.length; i++) {
            iArr[i] = rendererCapabilities.supportsFormat(group.getFormat(i));
        }
        return iArr;
    }

    private static int[] c(RendererCapabilities[] rendererCapabilities) throws ExoPlaybackException {
        int length = rendererCapabilities.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rendererCapabilities[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    @Nullable
    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.c;
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final void onSelectionActivated(@Nullable Object info) {
        this.c = (MappedTrackInfo) info;
    }

    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupport, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException;

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilities, TrackGroupArray trackGroups, MediaSource.MediaPeriodId periodId, Timeline timeline) throws ExoPlaybackException {
        int[] iArr = new int[rendererCapabilities.length + 1];
        int length = rendererCapabilities.length + 1;
        TrackGroup[][] trackGroupArr = new TrackGroup[length][];
        int[][][] iArr2 = new int[rendererCapabilities.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = trackGroups.length;
            trackGroupArr[i] = new TrackGroup[i2];
            iArr2[i] = new int[i2][];
        }
        int[] iArrC = c(rendererCapabilities);
        for (int i3 = 0; i3 < trackGroups.length; i3++) {
            TrackGroup trackGroup = trackGroups.get(i3);
            int iA = a(rendererCapabilities, trackGroup, iArr, MimeTypes.getTrackType(trackGroup.getFormat(0).sampleMimeType) == 5);
            int[] iArrB = iA == rendererCapabilities.length ? new int[trackGroup.length] : b(rendererCapabilities[iA], trackGroup);
            int i4 = iArr[iA];
            trackGroupArr[iA][i4] = trackGroup;
            iArr2[iA][i4] = iArrB;
            iArr[iA] = iArr[iA] + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilities.length];
        String[] strArr = new String[rendererCapabilities.length];
        int[] iArr3 = new int[rendererCapabilities.length];
        for (int i5 = 0; i5 < rendererCapabilities.length; i5++) {
            int i6 = iArr[i5];
            trackGroupArrayArr[i5] = new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[i5], i6));
            iArr2[i5] = (int[][]) Util.nullSafeArrayCopy(iArr2[i5], i6);
            strArr[i5] = rendererCapabilities[i5].getName();
            iArr3[i5] = rendererCapabilities[i5].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, iArrC, iArr2, new TrackGroupArray((TrackGroup[]) Util.nullSafeArrayCopy(trackGroupArr[rendererCapabilities.length], iArr[rendererCapabilities.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, iArrC, periodId, timeline);
        return new TrackSelectorResult((RendererConfiguration[]) pairSelectTracks.first, (ExoTrackSelection[]) pairSelectTracks.second, mappedTrackInfo);
    }

    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int a;
        private final String[] b;
        private final int[] c;
        private final TrackGroupArray[] d;
        private final int[] e;
        private final int[][][] f;
        private final TrackGroupArray g;

        public MappedTrackInfo(String[] rendererNames, int[] rendererTrackTypes, TrackGroupArray[] rendererTrackGroups, int[] rendererMixedMimeTypeAdaptiveSupports, int[][][] rendererFormatSupports, TrackGroupArray unmappedTrackGroups) {
            this.b = rendererNames;
            this.c = rendererTrackTypes;
            this.d = rendererTrackGroups;
            this.f = rendererFormatSupports;
            this.e = rendererMixedMimeTypeAdaptiveSupports;
            this.g = unmappedTrackGroups;
            this.a = rendererTrackTypes.length;
        }

        public int getAdaptiveSupport(int rendererIndex, int groupIndex, boolean includeCapabilitiesExceededTracks) {
            int i = this.d[rendererIndex].get(groupIndex).length;
            int[] iArr = new int[i];
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                int trackSupport = getTrackSupport(rendererIndex, groupIndex, i3);
                if (trackSupport == 4 || (includeCapabilitiesExceededTracks && trackSupport == 3)) {
                    iArr[i2] = i3;
                    i2++;
                }
            }
            return getAdaptiveSupport(rendererIndex, groupIndex, Arrays.copyOf(iArr, i2));
        }

        public int getRendererCount() {
            return this.a;
        }

        public String getRendererName(int rendererIndex) {
            return this.b[rendererIndex];
        }

        public int getRendererSupport(int rendererIndex) {
            int iMax = 0;
            for (int[] iArr : this.f[rendererIndex]) {
                for (int i : iArr) {
                    int iD = q0.d(i);
                    int i2 = 2;
                    if (iD == 0 || iD == 1 || iD == 2) {
                        i2 = 1;
                    } else if (iD != 3) {
                        if (iD == 4) {
                            return 3;
                        }
                        throw new IllegalStateException();
                    }
                    iMax = Math.max(iMax, i2);
                }
            }
            return iMax;
        }

        public int getRendererType(int rendererIndex) {
            return this.c[rendererIndex];
        }

        public TrackGroupArray getTrackGroups(int rendererIndex) {
            return this.d[rendererIndex];
        }

        public int getTrackSupport(int rendererIndex, int groupIndex, int trackIndex) {
            return q0.d(this.f[rendererIndex][groupIndex][trackIndex]);
        }

        public int getTypeSupport(int trackType) {
            int iMax = 0;
            for (int i = 0; i < this.a; i++) {
                if (this.c[i] == trackType) {
                    iMax = Math.max(iMax, getRendererSupport(i));
                }
            }
            return iMax;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.g;
        }

        public int getAdaptiveSupport(int rendererIndex, int groupIndex, int[] trackIndices) {
            int i = 0;
            String str = null;
            boolean z = false;
            int i2 = 0;
            int iMin = 16;
            while (i < trackIndices.length) {
                String str2 = this.d[rendererIndex].get(groupIndex).getFormat(trackIndices[i]).sampleMimeType;
                int i3 = i2 + 1;
                if (i2 == 0) {
                    str = str2;
                } else {
                    z |= !Util.areEqual(str, str2);
                }
                iMin = Math.min(iMin, q0.c(this.f[rendererIndex][groupIndex][i]));
                i++;
                i2 = i3;
            }
            return z ? Math.min(iMin, this.e[rendererIndex]) : iMin;
        }
    }
}
