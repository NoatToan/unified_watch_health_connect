package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class AdPlaybackState implements Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    private static final int FIELD_AD_GROUPS = 1;
    private static final int FIELD_AD_RESUME_POSITION_US = 2;
    private static final int FIELD_CONTENT_DURATION_US = 3;
    private static final int FIELD_REMOVED_AD_GROUP_COUNT = 4;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, C.TIME_UNSET, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    public static final Bundleable.Creator<AdPlaybackState> CREATOR = new com.garmin.proto.generated.a(18);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, C.TIME_UNSET, 0);
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i14 = 0; i14 < length; i14++) {
            adGroupArr[i14] = new AdGroup(jArr[i14]);
        }
        return adGroupArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AdPlaybackState fromBundle(Bundle bundle) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(1));
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i14 = 0; i14 < parcelableArrayList.size(); i14++) {
                adGroupArr2[i14] = (AdGroup) AdGroup.CREATOR.fromBundle((Bundle) parcelableArrayList.get(i14));
            }
            adGroupArr = adGroupArr2;
        }
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(keyForField(2), 0L), bundle.getLong(keyForField(3), C.TIME_UNSET), bundle.getInt(keyForField(4)));
    }

    private boolean isPositionBeforeAdGroup(long j8, long j14, int i14) {
        if (j8 == Long.MIN_VALUE) {
            return false;
        }
        long j15 = getAdGroup(i14).timeUs;
        if (j15 == Long.MIN_VALUE) {
            return j14 == C.TIME_UNSET || j8 < j14;
        }
        return j8 < j15;
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdPlaybackState.class == obj.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
            if (Util.areEqual(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public AdGroup getAdGroup(int i14) {
        int i15 = this.removedAdGroupCount;
        return i14 < i15 ? REMOVED_AD_GROUP : this.adGroups[i14 - i15];
    }

    public int getAdGroupIndexAfterPositionUs(long j8, long j14) {
        if (j8 != Long.MIN_VALUE && (j14 == C.TIME_UNSET || j8 < j14)) {
            int i14 = this.removedAdGroupCount;
            while (i14 < this.adGroupCount && ((getAdGroup(i14).timeUs != Long.MIN_VALUE && getAdGroup(i14).timeUs <= j8) || !getAdGroup(i14).shouldPlayAdGroup())) {
                i14++;
            }
            if (i14 < this.adGroupCount) {
                return i14;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j8, long j14) {
        int i14 = this.adGroupCount - 1;
        while (i14 >= 0) {
            long j15 = j8;
            long j16 = j14;
            if (!isPositionBeforeAdGroup(j15, j16, i14)) {
                break;
            }
            i14--;
            j8 = j15;
            j14 = j16;
        }
        if (i14 < 0 || !getAdGroup(i14).hasUnplayedAds()) {
            return -1;
        }
        return i14;
    }

    public int hashCode() {
        int i14 = this.adGroupCount * 31;
        Object obj = this.adsId;
        return ((((((((i14 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + Arrays.hashCode(this.adGroups);
    }

    public boolean isAdInErrorState(int i14, int i15) {
        AdGroup adGroup;
        int i16;
        return i14 < this.adGroupCount && (i16 = (adGroup = getAdGroup(i14)).count) != -1 && i15 < i16 && adGroup.states[i15] == 4;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle());
        }
        bundle.putParcelableArrayList(keyForField(1), arrayList);
        bundle.putLong(keyForField(2), this.adResumePositionUs);
        bundle.putLong(keyForField(3), this.contentDurationUs);
        bundle.putInt(keyForField(4), this.removedAdGroupCount);
        return bundle;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("AdPlaybackState(adsId=");
        sb3.append(this.adsId);
        sb3.append(", adResumePositionUs=");
        sb3.append(this.adResumePositionUs);
        sb3.append(", adGroups=[");
        for (int i14 = 0; i14 < this.adGroups.length; i14++) {
            sb3.append("adGroup(timeUs=");
            sb3.append(this.adGroups[i14].timeUs);
            sb3.append(", ads=[");
            for (int i15 = 0; i15 < this.adGroups[i14].states.length; i15++) {
                sb3.append("ad(state=");
                int i16 = this.adGroups[i14].states[i15];
                if (i16 == 0) {
                    sb3.append('_');
                } else if (i16 == 1) {
                    sb3.append('R');
                } else if (i16 == 2) {
                    sb3.append('S');
                } else if (i16 == 3) {
                    sb3.append('P');
                } else if (i16 != 4) {
                    sb3.append('?');
                } else {
                    sb3.append('!');
                }
                sb3.append(", durationUs=");
                sb3.append(this.adGroups[i14].durationsUs[i15]);
                sb3.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
                if (i15 < this.adGroups[i14].states.length - 1) {
                    sb3.append(", ");
                }
            }
            sb3.append("])");
            if (i14 < this.adGroups.length - 1) {
                sb3.append(", ");
            }
        }
        sb3.append("])");
        return sb3.toString();
    }

    public AdPlaybackState withAdCount(int i14, int i15) {
        Assertions.checkArgument(i15 > 0);
        int i16 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i16].count == i15) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i16] = this.adGroups[i16].withAdCount(i15);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        Assertions.checkState(this.removedAdGroupCount == 0);
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i14 = 0; i14 < this.adGroupCount; i14++) {
            adGroupArr2[i14] = adGroupArr2[i14].withAdDurationsUs(jArr[i14]);
        }
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdGroupTimeUs(int i14, long j8) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i15] = this.adGroups[i15].withTimeUs(j8);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdLoadError(int i14, int i15) {
        int i16 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i16] = adGroupArr2[i16].withAdState(4, i15);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdResumePositionUs(long j8) {
        return this.adResumePositionUs == j8 ? this : new AdPlaybackState(this.adsId, this.adGroups, j8, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withAdUri(int i14, int i15, Uri uri) {
        int i16 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i16] = adGroupArr2[i16].withAdUri(uri, i15);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withContentDurationUs(long j8) {
        return this.contentDurationUs == j8 ? this : new AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j8, this.removedAdGroupCount);
    }

    public AdPlaybackState withContentResumeOffsetUs(int i14, long j8) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i15].contentResumeOffsetUs == j8) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i15] = adGroupArr2[i15].withContentResumeOffsetUs(j8);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withIsServerSideInserted(int i14, boolean z14) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i15].isServerSideInserted == z14) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i15] = adGroupArr2[i15].withIsServerSideInserted(z14);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withNewAdGroup(int i14, long j8) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup adGroup = new AdGroup(j8);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.adGroups, adGroup);
        System.arraycopy(adGroupArr, i15, adGroupArr, i15 + 1, this.adGroups.length - i15);
        adGroupArr[i15] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withPlayedAd(int i14, int i15) {
        int i16 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i16] = adGroupArr2[i16].withAdState(3, i15);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withRemovedAdGroupCount(int i14) {
        int i15 = this.removedAdGroupCount;
        if (i15 == i14) {
            return this;
        }
        Assertions.checkArgument(i14 > i15);
        int i16 = this.adGroupCount - i14;
        AdGroup[] adGroupArr = new AdGroup[i16];
        System.arraycopy(this.adGroups, i14 - this.removedAdGroupCount, adGroupArr, 0, i16);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i14);
    }

    public AdPlaybackState withResetAdGroup(int i14) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i15] = adGroupArr2[i15].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAd(int i14, int i15) {
        int i16 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i16] = adGroupArr2[i16].withAdState(2, i15);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public AdPlaybackState withSkippedAdGroup(int i14) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i15] = adGroupArr2[i15].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    private AdPlaybackState(Object obj, AdGroup[] adGroupArr, long j8, long j14, int i14) {
        this.adsId = obj;
        this.adResumePositionUs = j8;
        this.contentDurationUs = j14;
        this.adGroupCount = adGroupArr.length + i14;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i14;
    }

    public static final class AdGroup implements Bundleable {
        public static final Bundleable.Creator<AdGroup> CREATOR = new com.garmin.proto.generated.a(19);
        private static final int FIELD_CONTENT_RESUME_OFFSET_US = 5;
        private static final int FIELD_COUNT = 1;
        private static final int FIELD_DURATIONS_US = 4;
        private static final int FIELD_IS_SERVER_SIDE_INSERTED = 6;
        private static final int FIELD_STATES = 3;
        private static final int FIELD_TIME_US = 0;
        private static final int FIELD_URIS = 2;
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int[] states;
        public final long timeUs;
        public final Uri[] uris;

        private AdGroup(long j8, int i14, int[] iArr, Uri[] uriArr, long[] jArr, long j14, boolean z14) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.timeUs = j8;
            this.count = i14;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j14;
            this.isServerSideInserted = z14;
        }

        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i14) {
            int length = jArr.length;
            int iMax = Math.max(i14, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, C.TIME_UNSET);
            return jArrCopyOf;
        }

        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i14) {
            int length = iArr.length;
            int iMax = Math.max(i14, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static AdGroup fromBundle(Bundle bundle) {
            long j8 = bundle.getLong(keyForField(0));
            int i14 = bundle.getInt(keyForField(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(keyForField(2));
            int[] intArray = bundle.getIntArray(keyForField(3));
            long[] longArray = bundle.getLongArray(keyForField(4));
            long j14 = bundle.getLong(keyForField(5));
            boolean z14 = bundle.getBoolean(keyForField(6));
            int[] iArr = intArray;
            if (iArr == null) {
                iArr = new int[0];
            }
            Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            if (longArray == null) {
                longArray = new long[0];
            }
            return new AdGroup(j8, i14, iArr, uriArr, longArray, j14, z14);
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AdGroup.class == obj.getClass()) {
                AdGroup adGroup = (AdGroup) obj;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && Arrays.equals(this.uris, adGroup.uris) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(int i14) {
            int i15;
            int i16 = i14 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i16 >= iArr.length || this.isServerSideInserted || (i15 = iArr[i16]) == 0 || i15 == 1) {
                    break;
                }
                i16++;
            }
            return i16;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i14 = 0; i14 < this.count; i14++) {
                int i15 = this.states[i14];
                if (i15 == 0 || i15 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i14 = this.count * 31;
            long j8 = this.timeUs;
            int iHashCode = (Arrays.hashCode(this.durationsUs) + ((Arrays.hashCode(this.states) + ((((i14 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + Arrays.hashCode(this.uris)) * 31)) * 31)) * 31;
            long j14 = this.contentResumeOffsetUs;
            return ((iHashCode + ((int) (j14 ^ (j14 >>> 32)))) * 31) + (this.isServerSideInserted ? 1 : 0);
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(keyForField(0), this.timeUs);
            bundle.putInt(keyForField(1), this.count);
            bundle.putParcelableArrayList(keyForField(2), new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putIntArray(keyForField(3), this.states);
            bundle.putLongArray(keyForField(4), this.durationsUs);
            bundle.putLong(keyForField(5), this.contentResumeOffsetUs);
            bundle.putBoolean(keyForField(6), this.isServerSideInserted);
            return bundle;
        }

        public AdGroup withAdCount(int i14) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i14);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i14);
            return new AdGroup(this.timeUs, i14, iArrCopyStatesWithSpaceForAdCount, (Uri[]) Arrays.copyOf(this.uris, i14), jArrCopyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, uriArr.length);
            } else if (this.count != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new AdGroup(this.timeUs, this.count, this.states, this.uris, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup withAdState(int i14, int i15) {
            int i16 = this.count;
            Assertions.checkArgument(i16 == -1 || i15 < i16);
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i15 + 1);
            int i17 = iArrCopyStatesWithSpaceForAdCount[i15];
            Assertions.checkArgument(i17 == 0 || i17 == 1 || i17 == i14);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            Uri[] uriArr = this.uris;
            if (uriArr.length != iArrCopyStatesWithSpaceForAdCount.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrCopyStatesWithSpaceForAdCount.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrCopyStatesWithSpaceForAdCount[i15] = i14;
            return new AdGroup(this.timeUs, this.count, iArrCopyStatesWithSpaceForAdCount, uriArr2, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup withAdUri(Uri uri, int i14) {
            int[] iArrCopyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i14 + 1);
            long[] jArrCopyDurationsUsWithSpaceForAdCount = this.durationsUs;
            if (jArrCopyDurationsUsWithSpaceForAdCount.length != iArrCopyStatesWithSpaceForAdCount.length) {
                jArrCopyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(jArrCopyDurationsUsWithSpaceForAdCount, iArrCopyStatesWithSpaceForAdCount.length);
            }
            long[] jArr = jArrCopyDurationsUsWithSpaceForAdCount;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, iArrCopyStatesWithSpaceForAdCount.length);
            uriArr[i14] = uri;
            iArrCopyStatesWithSpaceForAdCount[i14] = 1;
            return new AdGroup(this.timeUs, this.count, iArrCopyStatesWithSpaceForAdCount, uriArr, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArrCopyOf[i14];
                if (i15 == 3 || i15 == 2 || i15 == 4) {
                    iArrCopyOf[i14] = this.uris[i14] == null ? 0 : 1;
                }
            }
            return new AdGroup(this.timeUs, length, iArrCopyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, new int[0], new Uri[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArrCopyOf[i14];
                if (i15 == 1 || i15 == 0) {
                    iArrCopyOf[i14] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, iArrCopyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup withContentResumeOffsetUs(long j8) {
            return new AdGroup(this.timeUs, this.count, this.states, this.uris, this.durationsUs, j8, this.isServerSideInserted);
        }

        public AdGroup withIsServerSideInserted(boolean z14) {
            return new AdGroup(this.timeUs, this.count, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, z14);
        }

        public AdGroup withTimeUs(long j8) {
            return new AdGroup(j8, this.count, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup(long j8) {
            this(j8, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }
    }

    public AdPlaybackState withAdDurationsUs(int i14, long... jArr) {
        int i15 = i14 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i15] = adGroupArr2[i15].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }
}
