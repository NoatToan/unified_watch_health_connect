package com.google.android.exoplayer2.trackselection;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.q;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private final AtomicReference<Parameters> parametersReference;
    private final ExoTrackSelection.Factory trackSelectionFactory;
    private static final Ordering<Integer> FORMAT_VALUE_ORDERING = Ordering.from(new a(6));
    private static final Ordering<Integer> NO_ORDER = Ordering.from(new a(7));

    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int i14, TrackGroup trackGroup, int i15, Parameters parameters, int i16, boolean z14) {
            int i17;
            int formatLanguageScore;
            int formatLanguageScore2;
            super(i14, trackGroup, i15);
            this.parameters = parameters;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.language);
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i16, false);
            int i18 = 0;
            while (true) {
                i17 = Integer.MAX_VALUE;
                if (i18 >= parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, parameters.preferredAudioLanguages.get(i18), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.preferredLanguageIndex = i18;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredAudioRoleFlags);
            Format format = this.format;
            int i19 = format.roleFlags;
            this.hasMainOrNoRoleFlag = i19 == 0 || (i19 & 1) != 0;
            this.isDefaultSelectionFlag = (format.selectionFlags & 1) != 0;
            int i24 = format.channelCount;
            this.channelCount = i24;
            this.sampleRate = format.sampleRate;
            int i25 = format.bitrate;
            this.bitrate = i25;
            this.isWithinConstraints = (i25 == -1 || i25 <= parameters.maxAudioBitrate) && (i24 == -1 || i24 <= parameters.maxAudioChannelCount);
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i26 = 0;
            while (true) {
                if (i26 >= systemLanguageCodes.length) {
                    formatLanguageScore2 = 0;
                    i26 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, systemLanguageCodes[i26], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i26++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i26;
            this.localeLanguageScore = formatLanguageScore2;
            for (int i27 = 0; i27 < parameters.preferredAudioMimeTypes.size(); i27++) {
                String str = this.format.sampleMimeType;
                if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i27))) {
                    i17 = i27;
                    break;
                }
            }
            this.preferredMimeTypeMatchIndex = i17;
            this.usesPrimaryDecoder = RendererCapabilities.getDecoderSupport(i16) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i16) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i16, z14);
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }

        public static ImmutableList<AudioTrackInfo> createForTrackGroup(int i14, TrackGroup trackGroup, Parameters parameters, int[] iArr, boolean z14) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                builder.add(new AudioTrackInfo(i14, trackGroup, i15, parameters, iArr[i15], z14));
            }
            return builder.build();
        }

        private int evaluateSelectionEligibility(int i14, boolean z14) {
            if (!DefaultTrackSelector.isSupported(i14, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            if (!DefaultTrackSelector.isSupported(i14, false) || !this.isWithinConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.parameters;
            if (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate) {
                return 1;
            }
            return (parameters.allowMultipleAdaptiveSelections || !z14) ? 2 : 1;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackInfo audioTrackInfo) {
            Ordering orderingReverse = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(audioTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).compareFalseFirst(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).compare(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), Ordering.natural().reverse()).compare(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).compareFalseFirst(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).compare(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), Ordering.natural().reverse()).compare(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), this.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : DefaultTrackSelector.NO_ORDER).compareFalseFirst(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).compareFalseFirst(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).compare(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), orderingReverse).compare(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), orderingReverse);
            Integer numValueOf = Integer.valueOf(this.bitrate);
            Integer numValueOf2 = Integer.valueOf(audioTrackInfo.bitrate);
            if (!Util.areEqual(this.language, audioTrackInfo.language)) {
                orderingReverse = DefaultTrackSelector.NO_ORDER;
            }
            return comparisonChainCompare.compare(numValueOf, numValueOf2, orderingReverse).result();
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            int i14;
            String str;
            int i15;
            Parameters parameters = this.parameters;
            if (!parameters.allowAudioMixedChannelCountAdaptiveness && ((i15 = this.format.channelCount) == -1 || i15 != audioTrackInfo.format.channelCount)) {
                return false;
            }
            if (!parameters.allowAudioMixedMimeTypeAdaptiveness && ((str = this.format.sampleMimeType) == null || !TextUtils.equals(str, audioTrackInfo.format.sampleMimeType))) {
                return false;
            }
            Parameters parameters2 = this.parameters;
            if (!parameters2.allowAudioMixedSampleRateAdaptiveness && ((i14 = this.format.sampleRate) == -1 || i14 != audioTrackInfo.format.sampleRate)) {
                return false;
            }
            if (parameters2.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(Format format, int i14) {
            this.isDefault = (format.selectionFlags & 1) != 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i14, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).compareFalseFirst(this.isDefault, otherTrackScore.isDefault).result();
        }
    }

    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final Format format;
        public final int rendererIndex;
        public final TrackGroup trackGroup;
        public final int trackIndex;

        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i14, TrackGroup trackGroup, int[] iArr);
        }

        public TrackInfo(int i14, TrackGroup trackGroup, int i15) {
            this.rendererIndex = i14;
            this.trackGroup = trackGroup;
            this.trackIndex = i15;
            this.format = trackGroup.getFormat(i15);
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t7);
    }

    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        /* JADX WARN: Code duplicated, block: B:31:0x004b  */
        /* JADX WARN: Code duplicated, block: B:51:0x0079  */
        public VideoTrackInfo(int i14, TrackGroup trackGroup, int i15, Parameters parameters, int i16, int i17, boolean z14) {
            boolean z15;
            boolean z16;
            Format format;
            int i18;
            int i19;
            int i24;
            Format format2;
            int i25;
            int i26;
            int i27;
            super(i14, trackGroup, i15);
            this.parameters = parameters;
            int i28 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i17 & i28) != 0;
            if (!z14 || (((i25 = (format2 = this.format).width) != -1 && i25 > parameters.maxVideoWidth) || ((i26 = format2.height) != -1 && i26 > parameters.maxVideoHeight))) {
                z15 = false;
            } else {
                float f14 = format2.frameRate;
                if ((f14 == -1.0f || f14 <= parameters.maxVideoFrameRate) && ((i27 = format2.bitrate) == -1 || i27 <= parameters.maxVideoBitrate)) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            this.isWithinMaxConstraints = z15;
            if (!z14 || (((i18 = (format = this.format).width) != -1 && i18 < parameters.minVideoWidth) || ((i19 = format.height) != -1 && i19 < parameters.minVideoHeight))) {
                z16 = false;
            } else {
                float f15 = format.frameRate;
                if ((f15 == -1.0f || f15 >= parameters.minVideoFrameRate) && ((i24 = format.bitrate) == -1 || i24 >= parameters.minVideoBitrate)) {
                    z16 = true;
                } else {
                    z16 = false;
                }
            }
            this.isWithinMinConstraints = z16;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i16, false);
            Format format3 = this.format;
            this.bitrate = format3.bitrate;
            this.pixelCount = format3.getPixelCount();
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredVideoRoleFlags);
            int i29 = this.format.roleFlags;
            this.hasMainOrNoRoleFlag = i29 == 0 || (i29 & 1) != 0;
            int i30 = 0;
            while (true) {
                if (i30 >= parameters.preferredVideoMimeTypes.size()) {
                    i30 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.format.sampleMimeType;
                if (str != null && str.equals(parameters.preferredVideoMimeTypes.get(i30))) {
                    break;
                } else {
                    i30++;
                }
            }
            this.preferredMimeTypeMatchIndex = i30;
            this.usesPrimaryDecoder = RendererCapabilities.getDecoderSupport(i16) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i16) == 64;
            this.codecPreferenceScore = DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.sampleMimeType);
            this.selectionEligibility = evaluateSelectionEligibility(i16, i28);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            ComparisonChain comparisonChainCompareFalseFirst = ComparisonChain.start().compareFalseFirst(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).compare(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).compareFalseFirst(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).compareFalseFirst(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).compareFalseFirst(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).compare(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), Ordering.natural().reverse()).compareFalseFirst(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).compareFalseFirst(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                comparisonChainCompareFalseFirst = comparisonChainCompareFalseFirst.compare(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return comparisonChainCompareFalseFirst.result();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            Ordering orderingReverse = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse();
            return ComparisonChain.start().compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), videoTrackInfo.parameters.forceLowestBitrate ? DefaultTrackSelector.FORMAT_VALUE_ORDERING.reverse() : DefaultTrackSelector.NO_ORDER).compare(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), orderingReverse).compare(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), orderingReverse).result();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            int i14 = 4;
            return ComparisonChain.start().compare((VideoTrackInfo) Collections.max(list, new a(3)), (VideoTrackInfo) Collections.max(list2, new a(3)), new a(3)).compare(list.size(), list2.size()).compare((VideoTrackInfo) Collections.max(list, new a(i14)), (VideoTrackInfo) Collections.max(list2, new a(i14)), new a(i14)).result();
        }

        public static ImmutableList<VideoTrackInfo> createForTrackGroup(int i14, TrackGroup trackGroup, Parameters parameters, int[] iArr, int i15) {
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(trackGroup, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i16 = 0; i16 < trackGroup.length; i16++) {
                int pixelCount = trackGroup.getFormat(i16).getPixelCount();
                builder.add(new VideoTrackInfo(i14, trackGroup, i16, parameters, iArr[i16], i15, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (pixelCount != -1 && pixelCount <= maxVideoPixelsToRetainForViewport)));
            }
            return builder.build();
        }

        private int evaluateSelectionEligibility(int i14, int i15) {
            if ((this.format.roleFlags & 16384) != 0 || !DefaultTrackSelector.isSupported(i14, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinMaxConstraints && !this.parameters.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!DefaultTrackSelector.isSupported(i14, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.bitrate == -1) {
                return 1;
            }
            Parameters parameters = this.parameters;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i14 & i15) == 0) ? 1 : 2;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes && !Util.areEqual(this.format.sampleMimeType, videoTrackInfo.format.sampleMimeType)) {
                return false;
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }
    }

    public DefaultTrackSelector(Parameters parameters, ExoTrackSelection.Factory factory) {
        this.trackSelectionFactory = factory;
        this.parametersReference = new AtomicReference<>(parameters);
    }

    private void applyTrackTypeOverride(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, ExoTrackSelection.Definition[] definitionArr, int i14, TrackSelectionOverrides.TrackSelectionOverride trackSelectionOverride, int i15) {
        for (int i16 = 0; i16 < definitionArr.length; i16++) {
            if (i15 == i16) {
                definitionArr[i16] = new ExoTrackSelection.Definition(trackSelectionOverride.trackGroup, Ints.toArray(trackSelectionOverride.trackIndices));
            } else if (mappedTrackInfo.getRendererType(i16) == i14) {
                definitionArr[i16] = null;
            }
        }
    }

    private SparseArray<Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer>> getApplicableOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters) {
        SparseArray<Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer>> sparseArray = new SparseArray<>();
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i14 = 0; i14 < rendererCount; i14++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i14);
            for (int i15 = 0; i15 < trackGroups.length; i15++) {
                maybeUpdateApplicableOverrides(sparseArray, parameters.trackSelectionOverrides.getOverride(trackGroups.get(i15)), i14);
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i16 = 0; i16 < unmappedTrackGroups.length; i16++) {
            maybeUpdateApplicableOverrides(sparseArray, parameters.trackSelectionOverrides.getOverride(unmappedTrackGroups.get(i16)), -1);
        }
        return sparseArray;
    }

    public static int getFormatLanguageScore(Format format, String str, boolean z14) {
        if (!TextUtils.isEmpty(str) && str.equals(format.language)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z14 && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, "-")[0].equals(Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, "-")[0]) ? 2 : 0;
    }

    private ExoTrackSelection.Definition getLegacyRendererOverride(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, int i14) {
        TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i14);
        SelectionOverride selectionOverride = parameters.getSelectionOverride(i14, trackGroups);
        if (selectionOverride == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(TrackGroup trackGroup, int i14, int i15, boolean z14) {
        int i16;
        int i17 = Integer.MAX_VALUE;
        if (i14 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            for (int i18 = 0; i18 < trackGroup.length; i18++) {
                Format format = trackGroup.getFormat(i18);
                int i19 = format.width;
                if (i19 > 0 && (i16 = format.height) > 0) {
                    Point maxVideoSizeInViewport = getMaxVideoSizeInViewport(z14, i14, i15, i19, i16);
                    int i24 = format.width;
                    int i25 = format.height;
                    int i26 = i24 * i25;
                    if (i24 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i25 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i26 < i17) {
                        i17 = i26;
                    }
                }
            }
        }
        return i17;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000f  */
    private static Point getMaxVideoSizeInViewport(boolean z14, int i14, int i15, int i16, int i17) {
        if (z14) {
            if ((i16 > i17) == (i14 > i15)) {
                i15 = i14;
                i14 = i15;
            }
        } else {
            i15 = i14;
            i14 = i15;
        }
        int i18 = i16 * i14;
        int i19 = i17 * i15;
        return i18 >= i19 ? new Point(i15, Util.ceilDivide(i19, i16)) : new Point(Util.ceilDivide(i18, i17), i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i14, int i15) {
        if (i14 == 0 || i14 != i15) {
            return Integer.bitCount(i14 & i15);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    private boolean hasLegacyRendererOverride(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, int i14) {
        return parameters.hasSelectionOverride(i14, mappedTrackInfo.getTrackGroups(i14));
    }

    private boolean isRendererDisabled(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, int i14) {
        return parameters.getRendererDisabled(i14) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i14)));
    }

    public static boolean isSupported(int i14, boolean z14) {
        int formatSupport = RendererCapabilities.getFormatSupport(i14);
        if (formatSupport != 4) {
            return z14 && formatSupport == 3;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectAudioTrack$3(Parameters parameters, boolean z14, int i14, TrackGroup trackGroup, int[] iArr) {
        return AudioTrackInfo.createForTrackGroup(i14, trackGroup, parameters, iArr, z14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTextTrack$4(Parameters parameters, String str, int i14, TrackGroup trackGroup, int[] iArr) {
        return TextTrackInfo.createForTrackGroup(i14, trackGroup, parameters, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectVideoTrack$2(Parameters parameters, int[] iArr, int i14, TrackGroup trackGroup, int[] iArr2) {
        return VideoTrackInfo.createForTrackGroup(i14, trackGroup, parameters, iArr2, iArr[i14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Integer num, Integer num2) {
        return 0;
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z14;
        boolean z15 = false;
        int i14 = -1;
        int i15 = -1;
        int i16 = 0;
        while (true) {
            if (i16 >= mappedTrackInfo.getRendererCount()) {
                z14 = true;
                break;
            }
            int rendererType = mappedTrackInfo.getRendererType(i16);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i16];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i16], mappedTrackInfo.getTrackGroups(i16), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i15 != -1) {
                        z14 = false;
                        break;
                    }
                    i15 = i16;
                } else {
                    if (i14 != -1) {
                        z14 = false;
                        break;
                    }
                    i14 = i16;
                }
            }
            i16++;
        }
        if (i15 != -1 && i14 != -1) {
            z15 = true;
        }
        if (z14 && z15) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
            rendererConfigurationArr[i15] = rendererConfiguration;
            rendererConfigurationArr[i14] = rendererConfiguration;
        }
    }

    private void maybeUpdateApplicableOverrides(SparseArray<Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer>> sparseArray, TrackSelectionOverrides.TrackSelectionOverride trackSelectionOverride, int i14) {
        if (trackSelectionOverride == null) {
            return;
        }
        int trackType = trackSelectionOverride.getTrackType();
        Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer> pair = sparseArray.get(trackType);
        if (pair == null || ((TrackSelectionOverrides.TrackSelectionOverride) pair.first).trackIndices.isEmpty()) {
            sparseArray.put(trackType, Pair.create(trackSelectionOverride, Integer.valueOf(i14)));
        }
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i14 = 0; i14 < exoTrackSelection.length(); i14++) {
            if (RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i14)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i14, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i15;
        RandomAccess randomAccessOf;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i16 = 0;
        while (i16 < rendererCount) {
            if (i14 == mappedTrackInfo2.getRendererType(i16)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i16);
                for (int i17 = 0; i17 < trackGroups.length; i17++) {
                    TrackGroup trackGroup = trackGroups.get(i17);
                    List<T> listCreate = factory.create(i16, trackGroup, iArr[i16][i17]);
                    boolean[] zArr = new boolean[trackGroup.length];
                    int i18 = 0;
                    while (i18 < trackGroup.length) {
                        T t7 = listCreate.get(i18);
                        int selectionEligibility = t7.getSelectionEligibility();
                        if (zArr[i18] || selectionEligibility == 0) {
                            i15 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessOf = ImmutableList.of(t7);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t7);
                                int i19 = i18 + 1;
                                while (i19 < trackGroup.length) {
                                    T t14 = listCreate.get(i19);
                                    int i24 = rendererCount;
                                    if (t14.getSelectionEligibility() == 2 && t7.isCompatibleForAdaptationWith(t14)) {
                                        arrayList2.add(t14);
                                        zArr[i19] = true;
                                    }
                                    i19++;
                                    rendererCount = i24;
                                }
                                randomAccessOf = arrayList2;
                            }
                            i15 = rendererCount;
                            arrayList.add(randomAccessOf);
                        }
                        i18++;
                        rendererCount = i15;
                    }
                }
            }
            i16++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i25 = 0; i25 < list.size(); i25++) {
            iArr2[i25] = ((TrackInfo) list.get(i25)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    private void setParametersInternal(Parameters parameters) {
        Assertions.checkNotNull(parameters);
        if (this.parametersReference.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    public ParametersBuilder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public Parameters getParameters() {
        return this.parametersReference.get();
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    public ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) {
        String str;
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectVideoTrack != null) {
            definitionArr[((Integer) pairSelectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((Integer) pairSelectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        if (pairSelectAudioTrack == null) {
            str = null;
        } else {
            Object obj = pairSelectAudioTrack.first;
            str = ((ExoTrackSelection.Definition) obj).group.getFormat(((ExoTrackSelection.Definition) obj).tracks[0]).language;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str);
        if (pairSelectTextTrack != null) {
            definitionArr[((Integer) pairSelectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i14 = 0; i14 < rendererCount; i14++) {
            int rendererType = mappedTrackInfo.getRendererType(i14);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3) {
                definitionArr[i14] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i14), iArr[i14], parameters);
            }
        }
        return definitionArr;
    }

    @SuppressLint({"WrongConstant"})
    public Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) {
        boolean z14 = false;
        for (int i14 = 0; i14 < mappedTrackInfo.getRendererCount(); i14++) {
            if (2 == mappedTrackInfo.getRendererType(i14) && mappedTrackInfo.getTrackGroups(i14).length > 0) {
                z14 = true;
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new b(parameters, z14, 0), new a(1));
    }

    public ExoTrackSelection.Definition selectOtherTrack(int i14, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        int i15 = 0;
        for (int i16 = 0; i16 < trackGroupArray.length; i16++) {
            TrackGroup trackGroup2 = trackGroupArray.get(i16);
            int[] iArr2 = iArr[i16];
            for (int i17 = 0; i17 < trackGroup2.length; i17++) {
                if (isSupported(iArr2[i17], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i17), iArr2[i17]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i15 = i17;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i15);
    }

    @SuppressLint({"WrongConstant"})
    public Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters, String str) {
        return selectTracksForType(3, mappedTrackInfo, iArr, new q(6, parameters, str), new a(2));
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
        Parameters parameters = this.parametersReference.get();
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        SparseArray<Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer>> applicableOverrides = getApplicableOverrides(mappedTrackInfo, parameters);
        for (int i14 = 0; i14 < applicableOverrides.size(); i14++) {
            Pair<TrackSelectionOverrides.TrackSelectionOverride, Integer> pairValueAt = applicableOverrides.valueAt(i14);
            applyTrackTypeOverride(mappedTrackInfo, definitionArrSelectAllTracks, applicableOverrides.keyAt(i14), (TrackSelectionOverrides.TrackSelectionOverride) pairValueAt.first, ((Integer) pairValueAt.second).intValue());
        }
        for (int i15 = 0; i15 < rendererCount; i15++) {
            if (hasLegacyRendererOverride(mappedTrackInfo, parameters, i15)) {
                definitionArrSelectAllTracks[i15] = getLegacyRendererOverride(mappedTrackInfo, parameters, i15);
            }
        }
        for (int i16 = 0; i16 < rendererCount; i16++) {
            if (isRendererDisabled(mappedTrackInfo, parameters, i16)) {
                definitionArrSelectAllTracks[i16] = null;
            }
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i17 = 0; i17 < rendererCount; i17++) {
            rendererConfigurationArr[i17] = (parameters.getRendererDisabled(i17) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i17))) || (mappedTrackInfo.getRendererType(i17) != -2 && exoTrackSelectionArrCreateTrackSelections[i17] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    @SuppressLint({"WrongConstant"})
    public Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) {
        return selectTracksForType(2, mappedTrackInfo, iArr, new q(5, parameters, iArr2), new a(0));
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelector
    public void setParameters(TrackSelectionParameters trackSelectionParameters) {
        if (trackSelectionParameters instanceof Parameters) {
            setParametersInternal((Parameters) trackSelectionParameters);
        }
        setParametersInternal(new ParametersBuilder(this.parametersReference.get()).set(trackSelectionParameters).build());
    }

    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private boolean allowAudioMixedChannelCountAdaptiveness;
        private boolean allowAudioMixedDecoderSupportAdaptiveness;
        private boolean allowAudioMixedMimeTypeAdaptiveness;
        private boolean allowAudioMixedSampleRateAdaptiveness;
        private boolean allowMultipleAdaptiveSelections;
        private boolean allowVideoMixedDecoderSupportAdaptiveness;
        private boolean allowVideoMixedMimeTypeAdaptiveness;
        private boolean allowVideoNonSeamlessAdaptiveness;
        private int disabledTextTrackSelectionFlags;
        private boolean exceedAudioConstraintsIfNecessary;
        private boolean exceedRendererCapabilitiesIfNecessary;
        private boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        private boolean tunnelingEnabled;

        private ParametersBuilder(Bundle bundle) {
            super(bundle);
            Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
            setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.keyForField(1000), parameters.exceedVideoConstraintsIfNecessary));
            setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.keyForField(1001), parameters.allowVideoMixedMimeTypeAdaptiveness));
            setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.keyForField(1002), parameters.allowVideoNonSeamlessAdaptiveness));
            setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.keyForField(1015), parameters.allowVideoMixedDecoderSupportAdaptiveness));
            setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.keyForField(1003), parameters.exceedAudioConstraintsIfNecessary));
            setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.keyForField(1004), parameters.allowAudioMixedMimeTypeAdaptiveness));
            setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.keyForField(1005), parameters.allowAudioMixedSampleRateAdaptiveness));
            setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.keyForField(1006), parameters.allowAudioMixedChannelCountAdaptiveness));
            setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.keyForField(1016), parameters.allowAudioMixedDecoderSupportAdaptiveness));
            setDisabledTextTrackSelectionFlags(bundle.getInt(Parameters.keyForField(1007), parameters.disabledTextTrackSelectionFlags));
            setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.keyForField(1008), parameters.exceedRendererCapabilitiesIfNecessary));
            setTunnelingEnabled(bundle.getBoolean(Parameters.keyForField(1009), parameters.tunnelingEnabled));
            setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.keyForField(1010), parameters.allowMultipleAdaptiveSelections));
            this.selectionOverrides = new SparseArray<>();
            setSelectionOverridesFromBundle(bundle);
            this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.keyForField(1014)));
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                sparseArray2.put(sparseArray.keyAt(i14), new HashMap(sparseArray.valueAt(i14)));
            }
            return sparseArray2;
        }

        private void init() {
            this.exceedVideoConstraintsIfNecessary = true;
            this.allowVideoMixedMimeTypeAdaptiveness = false;
            this.allowVideoNonSeamlessAdaptiveness = true;
            this.allowVideoMixedDecoderSupportAdaptiveness = false;
            this.exceedAudioConstraintsIfNecessary = true;
            this.allowAudioMixedMimeTypeAdaptiveness = false;
            this.allowAudioMixedSampleRateAdaptiveness = false;
            this.allowAudioMixedChannelCountAdaptiveness = false;
            this.allowAudioMixedDecoderSupportAdaptiveness = false;
            this.disabledTextTrackSelectionFlags = 0;
            this.exceedRendererCapabilitiesIfNecessary = true;
            this.tunnelingEnabled = false;
            this.allowMultipleAdaptiveSelections = true;
        }

        private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i14 : iArr) {
                sparseBooleanArray.append(i14, true);
            }
            return sparseBooleanArray;
        }

        private void setSelectionOverridesFromBundle(Bundle bundle) {
            int[] intArray = bundle.getIntArray(Parameters.keyForField(1011));
            List listFromBundleNullableList = BundleableUtil.fromBundleNullableList(TrackGroupArray.CREATOR, bundle.getParcelableArrayList(Parameters.keyForField(1012)), ImmutableList.of());
            SparseArray sparseArrayFromBundleNullableSparseArray = BundleableUtil.fromBundleNullableSparseArray(SelectionOverride.CREATOR, bundle.getSparseParcelableArray(Parameters.keyForField(1013)), new SparseArray());
            if (intArray == null || intArray.length != listFromBundleNullableList.size()) {
                return;
            }
            for (int i14 = 0; i14 < intArray.length; i14++) {
                setSelectionOverride(intArray[i14], (TrackGroupArray) listFromBundleNullableList.get(i14), (SelectionOverride) sparseArrayFromBundleNullableSparseArray.get(i14));
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
            return new Parameters(this);
        }

        @Deprecated
        public final ParametersBuilder clearSelectionOverride(int i14, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i14);
            if (map != null && map.containsKey(trackGroupArray)) {
                map.remove(trackGroupArray);
                if (map.isEmpty()) {
                    this.selectionOverrides.remove(i14);
                }
            }
            return this;
        }

        @Deprecated
        public final ParametersBuilder clearSelectionOverrides(int i14) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i14);
            if (map != null && !map.isEmpty()) {
                this.selectionOverrides.remove(i14);
            }
            return this;
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z14) {
            this.allowAudioMixedChannelCountAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z14) {
            this.allowAudioMixedDecoderSupportAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z14) {
            this.allowAudioMixedMimeTypeAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z14) {
            this.allowAudioMixedSampleRateAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z14) {
            this.allowMultipleAdaptiveSelections = z14;
            return this;
        }

        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z14) {
            this.allowVideoMixedDecoderSupportAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z14) {
            this.allowVideoMixedMimeTypeAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z14) {
            this.allowVideoNonSeamlessAdaptiveness = z14;
            return this;
        }

        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i14) {
            this.disabledTextTrackSelectionFlags = i14;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public /* bridge */ /* synthetic */ TrackSelectionParameters.Builder setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z14) {
            this.exceedAudioConstraintsIfNecessary = z14;
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z14) {
            this.exceedRendererCapabilitiesIfNecessary = z14;
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z14) {
            this.exceedVideoConstraintsIfNecessary = z14;
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int i14, boolean z14) {
            if (this.rendererDisabledFlags.get(i14) == z14) {
                return this;
            }
            SparseBooleanArray sparseBooleanArray = this.rendererDisabledFlags;
            if (z14) {
                sparseBooleanArray.put(i14, true);
                return this;
            }
            sparseBooleanArray.delete(i14);
            return this;
        }

        @Deprecated
        public final ParametersBuilder setSelectionOverride(int i14, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i14);
            if (map == null) {
                map = new HashMap<>();
                this.selectionOverrides.put(i14, map);
            }
            if (map.containsKey(trackGroupArray) && Util.areEqual(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean z14) {
            this.tunnelingEnabled = z14;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearVideoSizeConstraints() {
            super.clearVideoSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder clearViewportSizeConstraints() {
            super.clearViewportSizeConstraints();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder set(TrackSelectionParameters trackSelectionParameters) {
            super.set(trackSelectionParameters);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            super.setDisabledTrackTypes(set);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z14) {
            super.setForceHighestSupportedBitrate(z14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceLowestBitrate(boolean z14) {
            super.setForceLowestBitrate(z14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioBitrate(int i14) {
            super.setMaxAudioBitrate(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioChannelCount(int i14) {
            super.setMaxAudioChannelCount(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoBitrate(int i14) {
            super.setMaxVideoBitrate(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoFrameRate(int i14) {
            super.setMaxVideoFrameRate(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSize(int i14, int i15) {
            super.setMaxVideoSize(i14, i15);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSizeSd() {
            super.setMaxVideoSizeSd();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoBitrate(int i14) {
            super.setMinVideoBitrate(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoFrameRate(int i14) {
            super.setMinVideoFrameRate(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoSize(int i14, int i15) {
            super.setMinVideoSize(i14, i15);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(String str) {
            super.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            super.setPreferredAudioLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeType(String str) {
            super.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            super.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int i14) {
            super.setPreferredAudioRoleFlags(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(String str) {
            super.setPreferredTextLanguage(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            super.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int i14) {
            super.setPreferredTextRoleFlags(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeType(String str) {
            super.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            super.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoRoleFlags(int i14) {
            super.setPreferredVideoRoleFlags(i14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z14) {
            super.setSelectUndeterminedTextLanguage(z14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setTrackSelectionOverrides(TrackSelectionOverrides trackSelectionOverrides) {
            super.setTrackSelectionOverrides(trackSelectionOverrides);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSize(int i14, int i15, boolean z14) {
            super.setViewportSize(i14, i15, z14);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z14) {
            super.setViewportSizeToPhysicalDisplaySize(context, z14);
            return this;
        }

        @Deprecated
        public final ParametersBuilder clearSelectionOverrides() {
            if (this.selectionOverrides.size() == 0) {
                return this;
            }
            this.selectionOverrides.clear();
            return this;
        }

        @Deprecated
        public ParametersBuilder() {
            this.selectionOverrides = new SparseArray<>();
            this.rendererDisabledFlags = new SparseBooleanArray();
            init();
        }

        public ParametersBuilder(Context context) {
            super(context);
            this.selectionOverrides = new SparseArray<>();
            this.rendererDisabledFlags = new SparseBooleanArray();
            init();
        }

        private ParametersBuilder(Parameters parameters) {
            super(parameters);
            this.disabledTextTrackSelectionFlags = parameters.disabledTextTrackSelectionFlags;
            this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
            this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = parameters.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
            this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
            this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
        }
    }

    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int i14, TrackGroup trackGroup, int i15, Parameters parameters, int i16, String str) {
            int formatLanguageScore;
            super(i14, trackGroup, i15);
            int i17 = 0;
            this.isWithinRendererCapabilities = DefaultTrackSelector.isSupported(i16, false);
            int i18 = this.format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
            this.isDefault = (i18 & 1) != 0;
            this.isForced = (i18 & 2) != 0;
            ImmutableList<String> immutableListOf = parameters.preferredTextLanguages.isEmpty() ? ImmutableList.of("") : parameters.preferredTextLanguages;
            int i19 = 0;
            while (true) {
                if (i19 >= immutableListOf.size()) {
                    i19 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, immutableListOf.get(i19), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            this.preferredLanguageIndex = i19;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.roleFlags, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.roleFlags & 1088) != 0;
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            boolean z14 = formatLanguageScore > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore2 > 0);
            if (DefaultTrackSelector.isSupported(i16, parameters.exceedRendererCapabilitiesIfNecessary) && z14) {
                i17 = 1;
            }
            this.selectionEligibility = i17;
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static ImmutableList<TextTrackInfo> createForTrackGroup(int i14, TrackGroup trackGroup, Parameters parameters, int[] iArr, String str) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (int i15 = 0; i15 < trackGroup.length; i15++) {
                builder.add(new TextTrackInfo(i14, trackGroup, i15, parameters, iArr[i15], str));
            }
            return builder.build();
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackInfo textTrackInfo) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities).compare(Integer.valueOf(this.preferredLanguageIndex), Integer.valueOf(textTrackInfo.preferredLanguageIndex), Ordering.natural().reverse()).compare(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).compare(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).compareFalseFirst(this.isDefault, textTrackInfo.isDefault).compare(Boolean.valueOf(this.isForced), Boolean.valueOf(textTrackInfo.isForced), this.preferredLanguageScore == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return comparisonChainCompare.result();
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // com.google.android.exoplayer2.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }
    }

    @Deprecated
    public DefaultTrackSelector(ExoTrackSelection.Factory factory) {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, factory);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(Parameters.getDefaults(context), factory);
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new AdaptiveTrackSelection.Factory());
    }

    public static final class SelectionOverride implements Bundleable {
        public static final Bundleable.Creator<SelectionOverride> CREATOR = new c(1);
        private static final int FIELD_GROUP_INDEX = 0;
        private static final int FIELD_TRACKS = 1;
        private static final int FIELD_TRACK_TYPE = 2;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public SelectionOverride(int i14, int[] iArr, int i15) {
            this.groupIndex = i14;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i15;
            Arrays.sort(iArrCopyOf);
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ SelectionOverride lambda$static$0(Bundle bundle) {
            boolean z14 = false;
            int i14 = bundle.getInt(keyForField(0), -1);
            int[] intArray = bundle.getIntArray(keyForField(1));
            int i15 = bundle.getInt(keyForField(2), -1);
            if (i14 >= 0 && i15 >= 0) {
                z14 = true;
            }
            Assertions.checkArgument(z14);
            Assertions.checkNotNull(intArray);
            return new SelectionOverride(i14, intArray, i15);
        }

        public boolean containsTrack(int i14) {
            for (int i15 : this.tracks) {
                if (i15 == i14) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.tracks) + (this.groupIndex * 31)) * 31) + this.type;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(keyForField(0), this.groupIndex);
            bundle.putIntArray(keyForField(1), this.tracks);
            bundle.putInt(keyForField(2), this.type);
            return bundle;
        }

        public SelectionOverride(int i14, int... iArr) {
            this(i14, iArr, 0);
        }
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    public static final class Parameters extends TrackSelectionParameters implements Bundleable {
        public static final Bundleable.Creator<Parameters> CREATOR;

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final int FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = 1006;
        private static final int FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1016;
        private static final int FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = 1004;
        private static final int FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = 1005;
        private static final int FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = 1010;
        private static final int FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = 1015;
        private static final int FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = 1001;
        private static final int FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = 1002;
        private static final int FIELD_DISABLED_TEXT_TRACK_SELECTION_FLAGS = 1007;
        private static final int FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NCESSARY = 1003;
        private static final int FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = 1008;
        private static final int FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = 1000;
        private static final int FIELD_RENDERER_DISABLED_INDICES = 1014;
        private static final int FIELD_SELECTION_OVERRIDES = 1013;
        private static final int FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = 1011;
        private static final int FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = 1012;
        private static final int FIELD_TUNNELING_ENABLED = 1009;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        static {
            Parameters parametersBuild = new ParametersBuilder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            CREATOR = new c(0);
        }

        private Parameters(ParametersBuilder parametersBuilder) {
            super(parametersBuilder);
            this.exceedVideoConstraintsIfNecessary = parametersBuilder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = parametersBuilder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = parametersBuilder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = parametersBuilder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = parametersBuilder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = parametersBuilder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = parametersBuilder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = parametersBuilder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = parametersBuilder.allowAudioMixedDecoderSupportAdaptiveness;
            this.disabledTextTrackSelectionFlags = parametersBuilder.disabledTextTrackSelectionFlags;
            this.exceedRendererCapabilitiesIfNecessary = parametersBuilder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = parametersBuilder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = parametersBuilder.allowMultipleAdaptiveSelections;
            this.selectionOverrides = parametersBuilder.selectionOverrides;
            this.rendererDisabledFlags = parametersBuilder.rendererDisabledFlags;
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i14)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!map2.containsKey(key) || !Util.areEqual(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters getDefaults(Context context) {
            return new ParametersBuilder(context).build();
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
                iArr[i14] = sparseBooleanArray.keyAt(i14);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Parameters lambda$static$0(Bundle bundle) {
            return new ParametersBuilder(bundle).build();
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                int iKeyAt = sparseArray.keyAt(i14);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i14).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(keyForField(1011), Ints.toArray(arrayList));
                bundle.putParcelableArrayList(keyForField(1012), BundleableUtil.toBundleArrayList(arrayList2));
                bundle.putSparseParcelableArray(keyForField(1013), BundleableUtil.toBundleSparseArray(sparseArray2));
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public ParametersBuilder buildUpon() {
            return new ParametersBuilder(this);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.disabledTextTrackSelectionFlags == parameters.disabledTextTrackSelectionFlags && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean getRendererDisabled(int i14) {
            return this.rendererDisabledFlags.get(i14);
        }

        @Deprecated
        public final SelectionOverride getSelectionOverride(int i14, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i14);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Deprecated
        public final boolean hasSelectionOverride(int i14, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i14);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + this.disabledTextTrackSelectionFlags) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(keyForField(1000), this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(keyForField(1001), this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(keyForField(1002), this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(keyForField(1015), this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(keyForField(1003), this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(keyForField(1004), this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(keyForField(1005), this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(keyForField(1006), this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(keyForField(1016), this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putInt(keyForField(1007), this.disabledTextTrackSelectionFlags);
            bundle.putBoolean(keyForField(1008), this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(keyForField(1009), this.tunnelingEnabled);
            bundle.putBoolean(keyForField(1010), this.allowMultipleAdaptiveSelections);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(keyForField(1014), getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i14 = 0; i14 < size; i14++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i14));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i14), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }
    }
}
