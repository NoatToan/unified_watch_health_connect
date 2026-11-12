package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultTrackSelector extends MappingTrackSelector {
    private static final float f = 0.98f;
    private static final int[] g = new int[0];
    private static final Ordering<Integer> h = Ordering.from(new Comparator() { // from class: e61
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.p((Integer) obj, (Integer) obj2);
        }
    });
    private static final Ordering<Integer> i = Ordering.from(new Comparator() { // from class: d61
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return DefaultTrackSelector.q((Integer) obj, (Integer) obj2);
        }
    });
    private final ExoTrackSelection.Factory d;
    private final AtomicReference<Parameters> e;

    public static final class AudioTrackScore implements Comparable<AudioTrackScore> {

        @Nullable
        private final String a;
        private final Parameters b;
        private final boolean c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final boolean i;
        public final boolean isWithinConstraints;
        private final int j;
        private final int k;
        private final int l;
        private final int m;

        public AudioTrackScore(Format format, Parameters parameters, int formatSupport) {
            int i;
            int formatLanguageScore;
            int formatLanguageScore2;
            this.b = parameters;
            this.a = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(format.language);
            this.c = DefaultTrackSelector.isSupported(formatSupport, false);
            int i2 = 0;
            while (true) {
                i = Integer.MAX_VALUE;
                if (i2 >= parameters.preferredAudioLanguages.size()) {
                    i2 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(format, parameters.preferredAudioLanguages.get(i2), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.e = i2;
            this.d = formatLanguageScore;
            this.f = Integer.bitCount(format.roleFlags & parameters.preferredAudioRoleFlags);
            boolean z = true;
            this.i = (format.selectionFlags & 1) != 0;
            int i3 = format.channelCount;
            this.j = i3;
            this.k = format.sampleRate;
            int i4 = format.bitrate;
            this.l = i4;
            if ((i4 != -1 && i4 > parameters.maxAudioBitrate) || (i3 != -1 && i3 > parameters.maxAudioChannelCount)) {
                z = false;
            }
            this.isWithinConstraints = z;
            String[] systemLanguageCodes = Util.getSystemLanguageCodes();
            int i5 = 0;
            while (true) {
                if (i5 >= systemLanguageCodes.length) {
                    i5 = Integer.MAX_VALUE;
                    formatLanguageScore2 = 0;
                    break;
                } else {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(format, systemLanguageCodes[i5], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.g = i5;
            this.h = formatLanguageScore2;
            for (int i6 = 0; i6 < parameters.preferredAudioMimeTypes.size(); i6++) {
                String str = format.sampleMimeType;
                if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i6))) {
                    i = i6;
                    break;
                }
            }
            this.m = i;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackScore other) {
            Ordering orderingReverse = (this.isWithinConstraints && this.c) ? DefaultTrackSelector.h : DefaultTrackSelector.h.reverse();
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.c, other.c).compare(Integer.valueOf(this.e), Integer.valueOf(other.e), Ordering.natural().reverse()).compare(this.d, other.d).compare(this.f, other.f).compareFalseFirst(this.isWithinConstraints, other.isWithinConstraints).compare(Integer.valueOf(this.m), Integer.valueOf(other.m), Ordering.natural().reverse()).compare(Integer.valueOf(this.l), Integer.valueOf(other.l), this.b.forceLowestBitrate ? DefaultTrackSelector.h.reverse() : DefaultTrackSelector.i).compareFalseFirst(this.i, other.i).compare(Integer.valueOf(this.g), Integer.valueOf(other.g), Ordering.natural().reverse()).compare(this.h, other.h).compare(Integer.valueOf(this.j), Integer.valueOf(other.j), orderingReverse).compare(Integer.valueOf(this.k), Integer.valueOf(other.k), orderingReverse);
            Integer numValueOf = Integer.valueOf(this.l);
            Integer numValueOf2 = Integer.valueOf(other.l);
            if (!Util.areEqual(this.a, other.a)) {
                orderingReverse = DefaultTrackSelector.i;
            }
            return comparisonChainCompare.compare(numValueOf, numValueOf2, orderingReverse).result();
        }
    }

    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean a;
        private final boolean b;

        public OtherTrackScore(Format format, int trackFormatSupport) {
            this.a = (format.selectionFlags & 1) != 0;
            this.b = DefaultTrackSelector.isSupported(trackFormatSupport, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore other) {
            return ComparisonChain.start().compareFalseFirst(this.b, other.b).compareFalseFirst(this.a, other.a).result();
        }
    }

    public static final class Parameters extends TrackSelectionParameters implements Parcelable {
        public static final Parcelable.Creator<Parameters> CREATOR;

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> a;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        private final SparseBooleanArray b;
        public final int disabledTextTrackSelectionFlags;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        public final boolean tunnelingEnabled;

        public class a implements Parcelable.Creator<Parameters> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Parameters createFromParcel(Parcel in) {
                return new Parameters(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Parameters[] newArray(int size) {
                return new Parameters[size];
            }
        }

        static {
            Parameters parametersBuild = new ParametersBuilder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            CREATOR = new a();
        }

        private static boolean c(SparseBooleanArray first, SparseBooleanArray second) {
            int size = first.size();
            if (second.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (second.indexOfKey(first.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean d(SparseArray<Map<TrackGroupArray, SelectionOverride>> first, SparseArray<Map<TrackGroupArray, SelectionOverride>> second) {
            int size = first.size();
            if (second.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = second.indexOfKey(first.keyAt(i));
                if (iIndexOfKey < 0 || !e(first.valueAt(i), second.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean e(Map<TrackGroupArray, SelectionOverride> first, Map<TrackGroupArray, SelectionOverride> second) {
            if (second.size() != first.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : first.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (!second.containsKey(key) || !Util.areEqual(entry.getValue(), second.get(key))) {
                    return false;
                }
            }
            return true;
        }

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> f(Parcel in) {
            int i = in.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = in.readInt();
                int i4 = in.readInt();
                HashMap map = new HashMap(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    map.put((TrackGroupArray) Assertions.checkNotNull((TrackGroupArray) in.readParcelable(TrackGroupArray.class.getClassLoader())), (SelectionOverride) in.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(i3, map);
            }
            return sparseArray;
        }

        private static void g(Parcel dest, SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides) {
            int size = selectionOverrides.size();
            dest.writeInt(size);
            for (int i = 0; i < size; i++) {
                int iKeyAt = selectionOverrides.keyAt(i);
                Map<TrackGroupArray, SelectionOverride> mapValueAt = selectionOverrides.valueAt(i);
                int size2 = mapValueAt.size();
                dest.writeInt(iKeyAt);
                dest.writeInt(size2);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : mapValueAt.entrySet()) {
                    dest.writeParcelable(entry.getKey(), 0);
                    dest.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        public static Parameters getDefaults(Context context) {
            return new ParametersBuilder(context).build();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.disabledTextTrackSelectionFlags == parameters.disabledTextTrackSelectionFlags && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && c(this.b, parameters.b) && d(this.a, parameters.a);
        }

        public final boolean getRendererDisabled(int rendererIndex) {
            return this.b.get(rendererIndex);
        }

        @Nullable
        public final SelectionOverride getSelectionOverride(int rendererIndex, TrackGroupArray groups) {
            Map<TrackGroupArray, SelectionOverride> map = this.a.get(rendererIndex);
            if (map != null) {
                return map.get(groups);
            }
            return null;
        }

        public final boolean hasSelectionOverride(int rendererIndex, TrackGroupArray groups) {
            Map<TrackGroupArray, SelectionOverride> map = this.a.get(rendererIndex);
            return map != null && map.containsKey(groups);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + this.disabledTextTrackSelectionFlags) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            Util.writeBoolean(dest, this.exceedVideoConstraintsIfNecessary);
            Util.writeBoolean(dest, this.allowVideoMixedMimeTypeAdaptiveness);
            Util.writeBoolean(dest, this.allowVideoNonSeamlessAdaptiveness);
            Util.writeBoolean(dest, this.exceedAudioConstraintsIfNecessary);
            Util.writeBoolean(dest, this.allowAudioMixedMimeTypeAdaptiveness);
            Util.writeBoolean(dest, this.allowAudioMixedSampleRateAdaptiveness);
            Util.writeBoolean(dest, this.allowAudioMixedChannelCountAdaptiveness);
            dest.writeInt(this.disabledTextTrackSelectionFlags);
            Util.writeBoolean(dest, this.exceedRendererCapabilitiesIfNecessary);
            Util.writeBoolean(dest, this.tunnelingEnabled);
            Util.writeBoolean(dest, this.allowMultipleAdaptiveSelections);
            g(dest, this.a);
            dest.writeSparseBooleanArray(this.b);
        }

        private Parameters(ParametersBuilder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.w;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.x;
            this.allowVideoNonSeamlessAdaptiveness = builder.y;
            this.exceedAudioConstraintsIfNecessary = builder.z;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.A;
            this.allowAudioMixedSampleRateAdaptiveness = builder.B;
            this.allowAudioMixedChannelCountAdaptiveness = builder.C;
            this.disabledTextTrackSelectionFlags = builder.D;
            this.exceedRendererCapabilitiesIfNecessary = builder.E;
            this.tunnelingEnabled = builder.F;
            this.allowMultipleAdaptiveSelections = builder.G;
            this.a = builder.H;
            this.b = builder.I;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters
        public ParametersBuilder buildUpon() {
            return new ParametersBuilder(this);
        }

        public Parameters(Parcel in) {
            super(in);
            this.exceedVideoConstraintsIfNecessary = Util.readBoolean(in);
            this.allowVideoMixedMimeTypeAdaptiveness = Util.readBoolean(in);
            this.allowVideoNonSeamlessAdaptiveness = Util.readBoolean(in);
            this.exceedAudioConstraintsIfNecessary = Util.readBoolean(in);
            this.allowAudioMixedMimeTypeAdaptiveness = Util.readBoolean(in);
            this.allowAudioMixedSampleRateAdaptiveness = Util.readBoolean(in);
            this.allowAudioMixedChannelCountAdaptiveness = Util.readBoolean(in);
            this.disabledTextTrackSelectionFlags = in.readInt();
            this.exceedRendererCapabilitiesIfNecessary = Util.readBoolean(in);
            this.tunnelingEnabled = Util.readBoolean(in);
            this.allowMultipleAdaptiveSelections = Util.readBoolean(in);
            this.a = f(in);
            this.b = (SparseBooleanArray) Util.castNonNull(in.readSparseBooleanArray());
        }
    }

    public static final class ParametersBuilder extends TrackSelectionParameters.Builder {
        private boolean A;
        private boolean B;
        private boolean C;
        private int D;
        private boolean E;
        private boolean F;
        private boolean G;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> H;
        private final SparseBooleanArray I;
        private boolean w;
        private boolean x;
        private boolean y;
        private boolean z;

        private static SparseArray<Map<TrackGroupArray, SelectionOverride>> K(SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>();
            for (int i = 0; i < selectionOverrides.size(); i++) {
                sparseArray.put(selectionOverrides.keyAt(i), new HashMap(selectionOverrides.valueAt(i)));
            }
            return sparseArray;
        }

        private void L() {
            this.w = true;
            this.x = false;
            this.y = true;
            this.z = true;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = 0;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        public final ParametersBuilder clearSelectionOverride(int rendererIndex, TrackGroupArray groups) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(rendererIndex);
            if (map != null && map.containsKey(groups)) {
                map.remove(groups);
                if (map.isEmpty()) {
                    this.H.remove(rendererIndex);
                }
            }
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides(int rendererIndex) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(rendererIndex);
            if (map != null && !map.isEmpty()) {
                this.H.remove(rendererIndex);
            }
            return this;
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean allowAudioMixedChannelCountAdaptiveness) {
            this.C = allowAudioMixedChannelCountAdaptiveness;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean allowAudioMixedMimeTypeAdaptiveness) {
            this.A = allowAudioMixedMimeTypeAdaptiveness;
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean allowAudioMixedSampleRateAdaptiveness) {
            this.B = allowAudioMixedSampleRateAdaptiveness;
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean allowMultipleAdaptiveSelections) {
            this.G = allowMultipleAdaptiveSelections;
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean allowVideoMixedMimeTypeAdaptiveness) {
            this.x = allowVideoMixedMimeTypeAdaptiveness;
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean allowVideoNonSeamlessAdaptiveness) {
            this.y = allowVideoNonSeamlessAdaptiveness;
            return this;
        }

        public ParametersBuilder setDisabledTextTrackSelectionFlags(int disabledTextTrackSelectionFlags) {
            this.D = disabledTextTrackSelectionFlags;
            return this;
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean exceedAudioConstraintsIfNecessary) {
            this.z = exceedAudioConstraintsIfNecessary;
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean exceedRendererCapabilitiesIfNecessary) {
            this.E = exceedRendererCapabilitiesIfNecessary;
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean exceedVideoConstraintsIfNecessary) {
            this.w = exceedVideoConstraintsIfNecessary;
            return this;
        }

        public final ParametersBuilder setRendererDisabled(int rendererIndex, boolean disabled) {
            if (this.I.get(rendererIndex) == disabled) {
                return this;
            }
            if (disabled) {
                this.I.put(rendererIndex, true);
            } else {
                this.I.delete(rendererIndex);
            }
            return this;
        }

        public final ParametersBuilder setSelectionOverride(int rendererIndex, TrackGroupArray groups, @Nullable SelectionOverride override) {
            Map<TrackGroupArray, SelectionOverride> map = this.H.get(rendererIndex);
            if (map == null) {
                map = new HashMap<>();
                this.H.put(rendererIndex, map);
            }
            if (map.containsKey(groups) && Util.areEqual(map.get(groups), override)) {
                return this;
            }
            map.put(groups, override);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean tunnelingEnabled) {
            this.F = tunnelingEnabled;
            return this;
        }

        @Deprecated
        public ParametersBuilder() {
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            L();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public Parameters build() {
            return new Parameters(this);
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
        public ParametersBuilder setForceHighestSupportedBitrate(boolean forceHighestSupportedBitrate) {
            super.setForceHighestSupportedBitrate(forceHighestSupportedBitrate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setForceLowestBitrate(boolean forceLowestBitrate) {
            super.setForceLowestBitrate(forceLowestBitrate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioBitrate(int maxAudioBitrate) {
            super.setMaxAudioBitrate(maxAudioBitrate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxAudioChannelCount(int maxAudioChannelCount) {
            super.setMaxAudioChannelCount(maxAudioChannelCount);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoBitrate(int maxVideoBitrate) {
            super.setMaxVideoBitrate(maxVideoBitrate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoFrameRate(int maxVideoFrameRate) {
            super.setMaxVideoFrameRate(maxVideoFrameRate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSize(int maxVideoWidth, int maxVideoHeight) {
            super.setMaxVideoSize(maxVideoWidth, maxVideoHeight);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMaxVideoSizeSd() {
            super.setMaxVideoSizeSd();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoBitrate(int minVideoBitrate) {
            super.setMinVideoBitrate(minVideoBitrate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoFrameRate(int minVideoFrameRate) {
            super.setMinVideoFrameRate(minVideoFrameRate);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setMinVideoSize(int minVideoWidth, int minVideoHeight) {
            super.setMinVideoSize(minVideoWidth, minVideoHeight);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguage(@Nullable String preferredAudioLanguage) {
            super.setPreferredAudioLanguage(preferredAudioLanguage);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioLanguages(String... preferredAudioLanguages) {
            super.setPreferredAudioLanguages(preferredAudioLanguages);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeType(@Nullable String mimeType) {
            super.setPreferredAudioMimeType(mimeType);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioMimeTypes(String... mimeTypes) {
            super.setPreferredAudioMimeTypes(mimeTypes);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredAudioRoleFlags(int preferredAudioRoleFlags) {
            super.setPreferredAudioRoleFlags(preferredAudioRoleFlags);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguage(@Nullable String preferredTextLanguage) {
            super.setPreferredTextLanguage(preferredTextLanguage);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextLanguages(String... preferredTextLanguages) {
            super.setPreferredTextLanguages(preferredTextLanguages);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredTextRoleFlags(int preferredTextRoleFlags) {
            super.setPreferredTextRoleFlags(preferredTextRoleFlags);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeType(@Nullable String mimeType) {
            super.setPreferredVideoMimeType(mimeType);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setPreferredVideoMimeTypes(String... mimeTypes) {
            super.setPreferredVideoMimeTypes(mimeTypes);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean selectUndeterminedTextLanguage) {
            super.setSelectUndeterminedTextLanguage(selectUndeterminedTextLanguage);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSize(int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
            super.setViewportSize(viewportWidth, viewportHeight, viewportOrientationMayChange);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelectionParameters.Builder
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean viewportOrientationMayChange) {
            super.setViewportSizeToPhysicalDisplaySize(context, viewportOrientationMayChange);
            return this;
        }

        public final ParametersBuilder clearSelectionOverrides() {
            if (this.H.size() == 0) {
                return this;
            }
            this.H.clear();
            return this;
        }

        public ParametersBuilder(Context context) {
            super(context);
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            L();
        }

        private ParametersBuilder(Parameters initialValues) {
            super(initialValues);
            this.D = initialValues.disabledTextTrackSelectionFlags;
            this.w = initialValues.exceedVideoConstraintsIfNecessary;
            this.x = initialValues.allowVideoMixedMimeTypeAdaptiveness;
            this.y = initialValues.allowVideoNonSeamlessAdaptiveness;
            this.z = initialValues.exceedAudioConstraintsIfNecessary;
            this.A = initialValues.allowAudioMixedMimeTypeAdaptiveness;
            this.B = initialValues.allowAudioMixedSampleRateAdaptiveness;
            this.C = initialValues.allowAudioMixedChannelCountAdaptiveness;
            this.E = initialValues.exceedRendererCapabilitiesIfNecessary;
            this.F = initialValues.tunnelingEnabled;
            this.G = initialValues.allowMultipleAdaptiveSelections;
            this.H = K(initialValues.a);
            this.I = initialValues.b.clone();
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        public class a implements Parcelable.Creator<SelectionOverride> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SelectionOverride createFromParcel(Parcel in) {
                return new SelectionOverride(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SelectionOverride[] newArray(int size) {
                return new SelectionOverride[size];
            }
        }

        public SelectionOverride(int groupIndex, int... tracks) {
            this(groupIndex, tracks, 0);
        }

        public boolean containsTrack(int track) {
            for (int i : this.tracks) {
                if (i == track) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type;
        }

        public int hashCode() {
            return (((this.groupIndex * 31) + Arrays.hashCode(this.tracks)) * 31) + this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.groupIndex);
            dest.writeInt(this.tracks.length);
            dest.writeIntArray(this.tracks);
            dest.writeInt(this.type);
        }

        public SelectionOverride(int groupIndex, int[] tracks, int type) {
            this.groupIndex = groupIndex;
            int[] iArrCopyOf = Arrays.copyOf(tracks, tracks.length);
            this.tracks = iArrCopyOf;
            this.length = tracks.length;
            this.type = type;
            Arrays.sort(iArrCopyOf);
        }

        public SelectionOverride(Parcel in) {
            this.groupIndex = in.readInt();
            int i = in.readByte();
            this.length = i;
            int[] iArr = new int[i];
            this.tracks = iArr;
            in.readIntArray(iArr);
            this.type = in.readInt();
        }
    }

    public static final class TextTrackScore implements Comparable<TextTrackScore> {
        private final boolean a;
        private final boolean b;
        private final boolean c;
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final boolean h;
        public final boolean isWithinConstraints;

        public TextTrackScore(Format format, Parameters parameters, int trackFormatSupport, @Nullable String selectedAudioLanguage) {
            int formatLanguageScore;
            boolean z = false;
            this.a = DefaultTrackSelector.isSupported(trackFormatSupport, false);
            int i = format.selectionFlags & (~parameters.disabledTextTrackSelectionFlags);
            this.b = (i & 1) != 0;
            this.c = (i & 2) != 0;
            int i2 = Integer.MAX_VALUE;
            ImmutableList<String> immutableListOf = parameters.preferredTextLanguages.isEmpty() ? ImmutableList.of("") : parameters.preferredTextLanguages;
            int i3 = 0;
            while (true) {
                if (i3 >= immutableListOf.size()) {
                    formatLanguageScore = 0;
                    break;
                }
                formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(format, immutableListOf.get(i3), parameters.selectUndeterminedTextLanguage);
                if (formatLanguageScore > 0) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            this.d = i2;
            this.e = formatLanguageScore;
            int iBitCount = Integer.bitCount(format.roleFlags & parameters.preferredTextRoleFlags);
            this.f = iBitCount;
            this.h = (format.roleFlags & 1088) != 0;
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(format, selectedAudioLanguage, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(selectedAudioLanguage) == null);
            this.g = formatLanguageScore2;
            if (formatLanguageScore > 0 || ((parameters.preferredTextLanguages.isEmpty() && iBitCount > 0) || this.b || (this.c && formatLanguageScore2 > 0))) {
                z = true;
            }
            this.isWithinConstraints = z;
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackScore other) {
            ComparisonChain comparisonChainCompare = ComparisonChain.start().compareFalseFirst(this.a, other.a).compare(Integer.valueOf(this.d), Integer.valueOf(other.d), Ordering.natural().reverse()).compare(this.e, other.e).compare(this.f, other.f).compareFalseFirst(this.b, other.b).compare(Boolean.valueOf(this.c), Boolean.valueOf(other.c), this.e == 0 ? Ordering.natural() : Ordering.natural().reverse()).compare(this.g, other.g);
            if (this.f == 0) {
                comparisonChainCompare = comparisonChainCompare.compareTrueFirst(this.h, other.h);
            }
            return comparisonChainCompare.result();
        }
    }

    public static final class VideoTrackScore implements Comparable<VideoTrackScore> {
        private final Parameters a;
        private final boolean b;
        private final boolean c;
        private final int d;
        private final int e;
        private final int f;
        public final boolean isWithinMaxConstraints;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public VideoTrackScore(Format format, Parameters parameters, int formatSupport, boolean isSuitableForViewport) {
            boolean z;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            this.a = parameters;
            boolean z2 = true;
            if (!isSuitableForViewport || (((i4 = format.width) != -1 && i4 > parameters.maxVideoWidth) || ((i5 = format.height) != -1 && i5 > parameters.maxVideoHeight))) {
                z = false;
            } else {
                float f = format.frameRate;
                if ((f == -1.0f || f <= parameters.maxVideoFrameRate) && ((i6 = format.bitrate) == -1 || i6 <= parameters.maxVideoBitrate)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            this.isWithinMaxConstraints = z;
            if (!isSuitableForViewport || (((i = format.width) != -1 && i < parameters.minVideoWidth) || ((i2 = format.height) != -1 && i2 < parameters.minVideoHeight))) {
                z2 = false;
            } else {
                float f2 = format.frameRate;
                if ((f2 != -1.0f && f2 < parameters.minVideoFrameRate) || ((i3 = format.bitrate) != -1 && i3 < parameters.minVideoBitrate)) {
                    z2 = false;
                }
            }
            this.b = z2;
            this.c = DefaultTrackSelector.isSupported(formatSupport, false);
            this.d = format.bitrate;
            this.e = format.getPixelCount();
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < parameters.preferredVideoMimeTypes.size(); i8++) {
                String str = format.sampleMimeType;
                if (str != null && str.equals(parameters.preferredVideoMimeTypes.get(i8))) {
                    i7 = i8;
                    break;
                }
            }
            this.f = i7;
        }

        @Override // java.lang.Comparable
        public int compareTo(VideoTrackScore other) {
            Ordering orderingReverse = (this.isWithinMaxConstraints && this.c) ? DefaultTrackSelector.h : DefaultTrackSelector.h.reverse();
            return ComparisonChain.start().compareFalseFirst(this.c, other.c).compareFalseFirst(this.isWithinMaxConstraints, other.isWithinMaxConstraints).compareFalseFirst(this.b, other.b).compare(Integer.valueOf(this.f), Integer.valueOf(other.f), Ordering.natural().reverse()).compare(Integer.valueOf(this.d), Integer.valueOf(other.d), this.a.forceLowestBitrate ? DefaultTrackSelector.h.reverse() : DefaultTrackSelector.i).compare(Integer.valueOf(this.e), Integer.valueOf(other.e), orderingReverse).compare(Integer.valueOf(this.d), Integer.valueOf(other.d), orderingReverse).result();
        }
    }

    @Deprecated
    public DefaultTrackSelector() {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, new AdaptiveTrackSelection.Factory());
    }

    public static int getFormatLanguageScore(Format format, @Nullable String language, boolean allowUndeterminedFormatLanguage) {
        if (!TextUtils.isEmpty(language) && language.equals(format.language)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(language);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(format.language);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (allowUndeterminedFormatLanguage && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        return Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull2, Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0].equals(Util.splitAtFirst(strNormalizeUndeterminedLanguageToNull, Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0]) ? 2 : 0;
    }

    private static void h(TrackGroup group, int[] formatSupport, int requiredAdaptiveSupport, @Nullable String mimeType, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate, List<Integer> selectedTrackIndices) {
        for (int size = selectedTrackIndices.size() - 1; size >= 0; size--) {
            int iIntValue = selectedTrackIndices.get(size).intValue();
            if (!o(group.getFormat(iIntValue), mimeType, formatSupport[iIntValue], requiredAdaptiveSupport, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate, minVideoWidth, minVideoHeight, minVideoFrameRate, minVideoBitrate)) {
                selectedTrackIndices.remove(size);
            }
        }
    }

    private static int[] i(TrackGroup group, int[] formatSupport, int primaryTrackIndex, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
        Format format = group.getFormat(primaryTrackIndex);
        int[] iArr = new int[group.length];
        int i2 = 0;
        for (int i3 = 0; i3 < group.length; i3++) {
            if (i3 == primaryTrackIndex || n(group.getFormat(i3), formatSupport[i3], format, maxAudioBitrate, allowMixedMimeTypeAdaptiveness, allowMixedSampleRateAdaptiveness, allowAudioMixedChannelCountAdaptiveness)) {
                iArr[i2] = i3;
                i2++;
            }
        }
        return Arrays.copyOf(iArr, i2);
    }

    public static boolean isSupported(int formatSupport, boolean allowExceedsCapabilities) {
        int iD = q0.d(formatSupport);
        return iD == 4 || (allowExceedsCapabilities && iD == 3);
    }

    private static int j(TrackGroup group, int[] formatSupport, int requiredAdaptiveSupport, @Nullable String mimeType, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate, List<Integer> selectedTrackIndices) {
        int i2 = 0;
        for (int i3 = 0; i3 < selectedTrackIndices.size(); i3++) {
            int iIntValue = selectedTrackIndices.get(i3).intValue();
            if (o(group.getFormat(iIntValue), mimeType, formatSupport[iIntValue], requiredAdaptiveSupport, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate, minVideoWidth, minVideoHeight, minVideoFrameRate, minVideoBitrate)) {
                i2++;
            }
        }
        return i2;
    }

    private static int[] k(TrackGroup group, int[] formatSupport, boolean allowMixedMimeTypes, int requiredAdaptiveSupport, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate, int viewportWidth, int viewportHeight, boolean viewportOrientationMayChange) {
        String str;
        int i2;
        int i3;
        HashSet hashSet;
        if (group.length < 2) {
            return g;
        }
        List<Integer> listM = m(group, viewportWidth, viewportHeight, viewportOrientationMayChange);
        if (listM.size() < 2) {
            return g;
        }
        if (allowMixedMimeTypes) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i4 = 0;
            int i5 = 0;
            while (i5 < listM.size()) {
                String str3 = group.getFormat(listM.get(i5).intValue()).sampleMimeType;
                if (hashSet2.add(str3)) {
                    i2 = i4;
                    i3 = i5;
                    hashSet = hashSet2;
                    int iJ = j(group, formatSupport, requiredAdaptiveSupport, str3, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate, minVideoWidth, minVideoHeight, minVideoFrameRate, minVideoBitrate, listM);
                    if (iJ > i2) {
                        i4 = iJ;
                        str2 = str3;
                    }
                    i5 = i3 + 1;
                    hashSet2 = hashSet;
                } else {
                    i2 = i4;
                    i3 = i5;
                    hashSet = hashSet2;
                }
                i4 = i2;
                i5 = i3 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        h(group, formatSupport, requiredAdaptiveSupport, str, maxVideoWidth, maxVideoHeight, maxVideoFrameRate, maxVideoBitrate, minVideoWidth, minVideoHeight, minVideoFrameRate, minVideoBitrate, listM);
        return listM.size() < 2 ? g : Ints.toArray(listM);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    private static Point l(boolean orientationMayChange, int viewportWidth, int viewportHeight, int videoWidth, int videoHeight) {
        if (orientationMayChange) {
            if ((videoWidth > videoHeight) == (viewportWidth > viewportHeight)) {
                viewportHeight = viewportWidth;
                viewportWidth = viewportHeight;
            }
        } else {
            viewportHeight = viewportWidth;
            viewportWidth = viewportHeight;
        }
        int i2 = videoWidth * viewportWidth;
        int i3 = videoHeight * viewportHeight;
        return i2 >= i3 ? new Point(viewportHeight, Util.ceilDivide(i3, videoWidth)) : new Point(Util.ceilDivide(i2, videoHeight), viewportWidth);
    }

    private static List<Integer> m(TrackGroup group, int viewportWidth, int viewportHeight, boolean orientationMayChange) {
        int i2;
        ArrayList arrayList = new ArrayList(group.length);
        for (int i3 = 0; i3 < group.length; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        if (viewportWidth != Integer.MAX_VALUE && viewportHeight != Integer.MAX_VALUE) {
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < group.length; i5++) {
                Format format = group.getFormat(i5);
                int i6 = format.width;
                if (i6 > 0 && (i2 = format.height) > 0) {
                    Point pointL = l(orientationMayChange, viewportWidth, viewportHeight, i6, i2);
                    int i7 = format.width;
                    int i8 = format.height;
                    int i9 = i7 * i8;
                    if (i7 >= ((int) (pointL.x * f)) && i8 >= ((int) (pointL.y * f)) && i9 < i4) {
                        i4 = i9;
                    }
                }
            }
            if (i4 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int pixelCount = group.getFormat(((Integer) arrayList.get(size)).intValue()).getPixelCount();
                    if (pixelCount == -1 || pixelCount > i4) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    private static boolean n(Format format, int formatSupport, Format primaryFormat, int maxAudioBitrate, boolean allowMixedMimeTypeAdaptiveness, boolean allowMixedSampleRateAdaptiveness, boolean allowAudioMixedChannelCountAdaptiveness) {
        int i2;
        int i3;
        String str;
        int i4;
        if (!isSupported(formatSupport, false) || (i2 = format.bitrate) == -1 || i2 > maxAudioBitrate) {
            return false;
        }
        if (!allowAudioMixedChannelCountAdaptiveness && ((i4 = format.channelCount) == -1 || i4 != primaryFormat.channelCount)) {
            return false;
        }
        if (allowMixedMimeTypeAdaptiveness || ((str = format.sampleMimeType) != null && TextUtils.equals(str, primaryFormat.sampleMimeType))) {
            return allowMixedSampleRateAdaptiveness || ((i3 = format.sampleRate) != -1 && i3 == primaryFormat.sampleRate);
        }
        return false;
    }

    @Nullable
    public static String normalizeUndeterminedLanguageToNull(@Nullable String language) {
        if (TextUtils.isEmpty(language) || TextUtils.equals(language, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return language;
    }

    private static boolean o(Format format, @Nullable String mimeType, int formatSupport, int requiredAdaptiveSupport, int maxVideoWidth, int maxVideoHeight, int maxVideoFrameRate, int maxVideoBitrate, int minVideoWidth, int minVideoHeight, int minVideoFrameRate, int minVideoBitrate) {
        int i2;
        if ((format.roleFlags & 16384) != 0 || !isSupported(formatSupport, false) || (formatSupport & requiredAdaptiveSupport) == 0) {
            return false;
        }
        if (mimeType != null && !Util.areEqual(format.sampleMimeType, mimeType)) {
            return false;
        }
        int i3 = format.width;
        if (i3 != -1 && (minVideoWidth > i3 || i3 > maxVideoWidth)) {
            return false;
        }
        int i4 = format.height;
        if (i4 != -1 && (minVideoHeight > i4 || i4 > maxVideoHeight)) {
            return false;
        }
        float f2 = format.frameRate;
        return (f2 == -1.0f || (((float) minVideoFrameRate) <= f2 && f2 <= ((float) maxVideoFrameRate))) && (i2 = format.bitrate) != -1 && minVideoBitrate <= i2 && i2 <= maxVideoBitrate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int p(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int q(Integer num, Integer num2) {
        return 0;
    }

    private static void r(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] renderererFormatSupports, RendererConfiguration[] rendererConfigurations, ExoTrackSelection[] trackSelections) {
        boolean z;
        boolean z2 = false;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (true) {
            if (i2 >= mappedTrackInfo.getRendererCount()) {
                z = true;
                break;
            }
            int rendererType = mappedTrackInfo.getRendererType(i2);
            ExoTrackSelection exoTrackSelection = trackSelections[i2];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && s(renderererFormatSupports[i2], mappedTrackInfo.getTrackGroups(i2), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i4 != -1) {
                        z = false;
                        break;
                    }
                    i4 = i2;
                } else {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i2;
                }
            }
            i2++;
        }
        if (i4 != -1 && i3 != -1) {
            z2 = true;
        }
        if (z && z2) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(true);
            rendererConfigurations[i4] = rendererConfiguration;
            rendererConfigurations[i3] = rendererConfiguration;
        }
    }

    private static boolean s(int[][] formatSupport, TrackGroupArray trackGroups, ExoTrackSelection selection) {
        if (selection == null) {
            return false;
        }
        int iIndexOf = trackGroups.indexOf(selection.getTrackGroup());
        for (int i2 = 0; i2 < selection.length(); i2++) {
            if (q0.e(formatSupport[iIndexOf][selection.getIndexInTrackGroup(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    private static ExoTrackSelection.Definition t(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params) {
        Parameters parameters = params;
        int i2 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
        boolean z = parameters.allowVideoMixedMimeTypeAdaptiveness && (mixedMimeTypeAdaptationSupports & i2) != 0;
        int i3 = 0;
        while (i3 < groups.length) {
            TrackGroup trackGroup = groups.get(i3);
            int i4 = i3;
            int[] iArrK = k(trackGroup, formatSupport[i3], z, i2, parameters.maxVideoWidth, parameters.maxVideoHeight, parameters.maxVideoFrameRate, parameters.maxVideoBitrate, parameters.minVideoWidth, parameters.minVideoHeight, parameters.minVideoFrameRate, parameters.minVideoBitrate, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            if (iArrK.length > 0) {
                return new ExoTrackSelection.Definition(trackGroup, iArrK);
            }
            i3 = i4 + 1;
            parameters = params;
        }
        return null;
    }

    @Nullable
    private static ExoTrackSelection.Definition u(TrackGroupArray groups, int[][] formatSupport, Parameters params) {
        int i2 = -1;
        TrackGroup trackGroup = null;
        VideoTrackScore videoTrackScore = null;
        for (int i3 = 0; i3 < groups.length; i3++) {
            TrackGroup trackGroup2 = groups.get(i3);
            List<Integer> listM = m(trackGroup2, params.viewportWidth, params.viewportHeight, params.viewportOrientationMayChange);
            int[] iArr = formatSupport[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                Format format = trackGroup2.getFormat(i4);
                if ((format.roleFlags & 16384) == 0 && isSupported(iArr[i4], params.exceedRendererCapabilitiesIfNecessary)) {
                    VideoTrackScore videoTrackScore2 = new VideoTrackScore(format, params, iArr[i4], listM.contains(Integer.valueOf(i4)));
                    if ((videoTrackScore2.isWithinMaxConstraints || params.exceedVideoConstraintsIfNecessary) && (videoTrackScore == null || videoTrackScore2.compareTo(videoTrackScore) > 0)) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        videoTrackScore = videoTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i2);
    }

    public ParametersBuilder buildUponParameters() {
        return getParameters().buildUpon();
    }

    public Parameters getParameters() {
        return this.e.get();
    }

    public ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupports, Parameters params) throws ExoPlaybackException {
        int i2;
        String str;
        int i3;
        AudioTrackScore audioTrackScore;
        String str2;
        int i4;
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 1;
            if (i6 >= rendererCount) {
                break;
            }
            if (2 == mappedTrackInfo.getRendererType(i6)) {
                if (!z) {
                    definitionArr[i6] = selectVideoTrack(mappedTrackInfo.getTrackGroups(i6), rendererFormatSupports[i6], rendererMixedMimeTypeAdaptationSupports[i6], params, true);
                    z = definitionArr[i6] != null;
                }
                i7 |= mappedTrackInfo.getTrackGroups(i6).length <= 0 ? 0 : 1;
            }
            i6++;
        }
        AudioTrackScore audioTrackScore2 = null;
        String str3 = null;
        int i8 = -1;
        int i9 = 0;
        while (i9 < rendererCount) {
            if (i2 == mappedTrackInfo.getRendererType(i9)) {
                i3 = i8;
                audioTrackScore = audioTrackScore2;
                str2 = str3;
                i4 = i9;
                Pair<ExoTrackSelection.Definition, AudioTrackScore> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo.getTrackGroups(i9), rendererFormatSupports[i9], rendererMixedMimeTypeAdaptationSupports[i9], params, params.allowMultipleAdaptiveSelections || i7 == 0);
                if (pairSelectAudioTrack != null && (audioTrackScore == null || ((AudioTrackScore) pairSelectAudioTrack.second).compareTo(audioTrackScore) > 0)) {
                    if (i3 != -1) {
                        definitionArr[i3] = null;
                    }
                    ExoTrackSelection.Definition definition = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
                    definitionArr[i4] = definition;
                    str3 = definition.group.getFormat(definition.tracks[0]).language;
                    audioTrackScore2 = (AudioTrackScore) pairSelectAudioTrack.second;
                    i8 = i4;
                }
                i9 = i4 + 1;
                i2 = 1;
            } else {
                i3 = i8;
                audioTrackScore = audioTrackScore2;
                str2 = str3;
                i4 = i9;
            }
            i8 = i3;
            audioTrackScore2 = audioTrackScore;
            str3 = str2;
            i9 = i4 + 1;
            i2 = 1;
        }
        String str4 = str3;
        TextTrackScore textTrackScore = null;
        int i10 = -1;
        while (i5 < rendererCount) {
            int rendererType = mappedTrackInfo.getRendererType(i5);
            if (rendererType == 1) {
                str = str4;
            } else if (rendererType == 2) {
                str = str4;
            } else if (rendererType != 3) {
                definitionArr[i5] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i5), rendererFormatSupports[i5], params);
                str = str4;
            } else {
                str = str4;
                Pair<ExoTrackSelection.Definition, TextTrackScore> pairSelectTextTrack = selectTextTrack(mappedTrackInfo.getTrackGroups(i5), rendererFormatSupports[i5], params, str);
                if (pairSelectTextTrack != null && (textTrackScore == null || ((TextTrackScore) pairSelectTextTrack.second).compareTo(textTrackScore) > 0)) {
                    if (i10 != -1) {
                        definitionArr[i10] = null;
                    }
                    definitionArr[i5] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
                    textTrackScore = (TextTrackScore) pairSelectTextTrack.second;
                    i10 = i5;
                }
            }
            i5++;
            str4 = str;
        }
        return definitionArr;
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, AudioTrackScore> selectAudioTrack(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params, boolean enableAdaptiveTrackSelection) throws ExoPlaybackException {
        ExoTrackSelection.Definition definition = null;
        AudioTrackScore audioTrackScore = null;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < groups.length; i4++) {
            TrackGroup trackGroup = groups.get(i4);
            int[] iArr = formatSupport[i4];
            for (int i5 = 0; i5 < trackGroup.length; i5++) {
                if (isSupported(iArr[i5], params.exceedRendererCapabilitiesIfNecessary)) {
                    AudioTrackScore audioTrackScore2 = new AudioTrackScore(trackGroup.getFormat(i5), params, iArr[i5]);
                    if ((audioTrackScore2.isWithinConstraints || params.exceedAudioConstraintsIfNecessary) && (audioTrackScore == null || audioTrackScore2.compareTo(audioTrackScore) > 0)) {
                        i2 = i4;
                        i3 = i5;
                        audioTrackScore = audioTrackScore2;
                    }
                }
            }
        }
        if (i2 == -1) {
            return null;
        }
        TrackGroup trackGroup2 = groups.get(i2);
        if (!params.forceHighestSupportedBitrate && !params.forceLowestBitrate && enableAdaptiveTrackSelection) {
            int[] iArrI = i(trackGroup2, formatSupport[i2], i3, params.maxAudioBitrate, params.allowAudioMixedMimeTypeAdaptiveness, params.allowAudioMixedSampleRateAdaptiveness, params.allowAudioMixedChannelCountAdaptiveness);
            if (iArrI.length > 1) {
                definition = new ExoTrackSelection.Definition(trackGroup2, iArrI);
            }
        }
        if (definition == null) {
            definition = new ExoTrackSelection.Definition(trackGroup2, i3);
        }
        return Pair.create(definition, (AudioTrackScore) Assertions.checkNotNull(audioTrackScore));
    }

    @Nullable
    public ExoTrackSelection.Definition selectOtherTrack(int trackType, TrackGroupArray groups, int[][] formatSupport, Parameters params) throws ExoPlaybackException {
        TrackGroup trackGroup = null;
        OtherTrackScore otherTrackScore = null;
        int i2 = 0;
        for (int i3 = 0; i3 < groups.length; i3++) {
            TrackGroup trackGroup2 = groups.get(i3);
            int[] iArr = formatSupport[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (isSupported(iArr[i4], params.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(trackGroup2.getFormat(i4), iArr[i4]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(trackGroup, i2);
    }

    @Nullable
    public Pair<ExoTrackSelection.Definition, TextTrackScore> selectTextTrack(TrackGroupArray groups, int[][] formatSupport, Parameters params, @Nullable String selectedAudioLanguage) throws ExoPlaybackException {
        int i2 = -1;
        TrackGroup trackGroup = null;
        TextTrackScore textTrackScore = null;
        for (int i3 = 0; i3 < groups.length; i3++) {
            TrackGroup trackGroup2 = groups.get(i3);
            int[] iArr = formatSupport[i3];
            for (int i4 = 0; i4 < trackGroup2.length; i4++) {
                if (isSupported(iArr[i4], params.exceedRendererCapabilitiesIfNecessary)) {
                    TextTrackScore textTrackScore2 = new TextTrackScore(trackGroup2.getFormat(i4), params, iArr[i4], selectedAudioLanguage);
                    if (textTrackScore2.isWithinConstraints && (textTrackScore == null || textTrackScore2.compareTo(textTrackScore) > 0)) {
                        trackGroup = trackGroup2;
                        i2 = i4;
                        textTrackScore = textTrackScore2;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new ExoTrackSelection.Definition(trackGroup, i2), (TextTrackScore) Assertions.checkNotNull(textTrackScore));
    }

    @Override // com.google.android.exoplayer2.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] rendererFormatSupports, int[] rendererMixedMimeTypeAdaptationSupports, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) throws ExoPlaybackException {
        Parameters parameters = this.e.get();
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, rendererFormatSupports, rendererMixedMimeTypeAdaptationSupports, parameters);
        int i2 = 0;
        while (true) {
            if (i2 >= rendererCount) {
                break;
            }
            if (parameters.getRendererDisabled(i2)) {
                definitionArrSelectAllTracks[i2] = null;
            } else {
                TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i2);
                if (parameters.hasSelectionOverride(i2, trackGroups)) {
                    SelectionOverride selectionOverride = parameters.getSelectionOverride(i2, trackGroups);
                    definitionArrSelectAllTracks[i2] = selectionOverride != null ? new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type) : null;
                }
            }
            i2++;
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.d.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, timeline);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i3 = 0; i3 < rendererCount; i3++) {
            rendererConfigurationArr[i3] = !parameters.getRendererDisabled(i3) && (mappedTrackInfo.getRendererType(i3) == 7 || exoTrackSelectionArrCreateTrackSelections[i3] != null) ? RendererConfiguration.DEFAULT : null;
        }
        if (parameters.tunnelingEnabled) {
            r(mappedTrackInfo, rendererFormatSupports, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    @Nullable
    public ExoTrackSelection.Definition selectVideoTrack(TrackGroupArray groups, int[][] formatSupport, int mixedMimeTypeAdaptationSupports, Parameters params, boolean enableAdaptiveTrackSelection) throws ExoPlaybackException {
        ExoTrackSelection.Definition definitionT = (params.forceHighestSupportedBitrate || params.forceLowestBitrate || !enableAdaptiveTrackSelection) ? null : t(groups, formatSupport, mixedMimeTypeAdaptationSupports, params);
        return definitionT == null ? u(groups, formatSupport, params) : definitionT;
    }

    public void setParameters(Parameters parameters) {
        Assertions.checkNotNull(parameters);
        if (this.e.getAndSet(parameters).equals(parameters)) {
            return;
        }
        invalidate();
    }

    @Deprecated
    public DefaultTrackSelector(ExoTrackSelection.Factory trackSelectionFactory) {
        this(Parameters.DEFAULT_WITHOUT_CONTEXT, trackSelectionFactory);
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory trackSelectionFactory) {
        this(Parameters.getDefaults(context), trackSelectionFactory);
    }

    public void setParameters(ParametersBuilder parametersBuilder) {
        setParameters(parametersBuilder.build());
    }

    public DefaultTrackSelector(Parameters parameters, ExoTrackSelection.Factory trackSelectionFactory) {
        this.d = trackSelectionFactory;
        this.e = new AtomicReference<>(parameters);
    }
}
