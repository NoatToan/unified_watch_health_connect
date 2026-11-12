package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Booleans;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class TracksInfo implements Bundleable {
    private static final int FIELD_TRACK_GROUP_INFOS = 0;
    private final ImmutableList<TrackGroupInfo> trackGroupInfos;
    public static final TracksInfo EMPTY = new TracksInfo(ImmutableList.of());
    public static final Bundleable.Creator<TracksInfo> CREATOR = new v(27);

    public TracksInfo(List<TrackGroupInfo> list) {
        this.trackGroupInfos = ImmutableList.copyOf((Collection) list);
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TracksInfo lambda$static$0(Bundle bundle) {
        return new TracksInfo(BundleableUtil.fromBundleNullableList(TrackGroupInfo.CREATOR, bundle.getParcelableArrayList(keyForField(0)), ImmutableList.of()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TracksInfo.class != obj.getClass()) {
            return false;
        }
        return this.trackGroupInfos.equals(((TracksInfo) obj).trackGroupInfos);
    }

    public ImmutableList<TrackGroupInfo> getTrackGroupInfos() {
        return this.trackGroupInfos;
    }

    public int hashCode() {
        return this.trackGroupInfos.hashCode();
    }

    public boolean isTypeSelected(int i14) {
        for (int i15 = 0; i15 < this.trackGroupInfos.size(); i15++) {
            TrackGroupInfo trackGroupInfo = this.trackGroupInfos.get(i15);
            if (trackGroupInfo.isSelected() && trackGroupInfo.getTrackType() == i14) {
                return true;
            }
        }
        return false;
    }

    public boolean isTypeSupportedOrEmpty(int i14, boolean z14) {
        boolean z15 = true;
        for (int i15 = 0; i15 < this.trackGroupInfos.size(); i15++) {
            if (this.trackGroupInfos.get(i15).trackType == i14) {
                if (this.trackGroupInfos.get(i15).isSupported(z14)) {
                    return true;
                }
                z15 = false;
            }
        }
        return z15;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(this.trackGroupInfos));
        return bundle;
    }

    public static final class TrackGroupInfo implements Bundleable {
        public static final Bundleable.Creator<TrackGroupInfo> CREATOR = new v(28);
        private static final int FIELD_TRACK_GROUP = 0;
        private static final int FIELD_TRACK_SELECTED = 3;
        private static final int FIELD_TRACK_SUPPORT = 1;
        private static final int FIELD_TRACK_TYPE = 2;
        private final TrackGroup trackGroup;
        private final boolean[] trackSelected;
        private final int[] trackSupport;
        private final int trackType;

        public TrackGroupInfo(TrackGroup trackGroup, int[] iArr, int i14, boolean[] zArr) {
            int i15 = trackGroup.length;
            Assertions.checkArgument(i15 == iArr.length && i15 == zArr.length);
            this.trackGroup = trackGroup;
            this.trackSupport = (int[]) iArr.clone();
            this.trackType = i14;
            this.trackSelected = (boolean[]) zArr.clone();
        }

        private static String keyForField(int i14) {
            return Integer.toString(i14, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ TrackGroupInfo lambda$static$0(Bundle bundle) {
            TrackGroup trackGroup = (TrackGroup) BundleableUtil.fromNullableBundle(TrackGroup.CREATOR, bundle.getBundle(keyForField(0)));
            Assertions.checkNotNull(trackGroup);
            return new TrackGroupInfo(trackGroup, (int[]) MoreObjects.firstNonNull(bundle.getIntArray(keyForField(1)), new int[trackGroup.length]), bundle.getInt(keyForField(2), -1), (boolean[]) MoreObjects.firstNonNull(bundle.getBooleanArray(keyForField(3)), new boolean[trackGroup.length]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && TrackGroupInfo.class == obj.getClass()) {
                TrackGroupInfo trackGroupInfo = (TrackGroupInfo) obj;
                if (this.trackType == trackGroupInfo.trackType && this.trackGroup.equals(trackGroupInfo.trackGroup) && Arrays.equals(this.trackSupport, trackGroupInfo.trackSupport) && Arrays.equals(this.trackSelected, trackGroupInfo.trackSelected)) {
                    return true;
                }
            }
            return false;
        }

        public TrackGroup getTrackGroup() {
            return this.trackGroup;
        }

        public int getTrackSupport(int i14) {
            return this.trackSupport[i14];
        }

        public int getTrackType() {
            return this.trackType;
        }

        public int hashCode() {
            return Arrays.hashCode(this.trackSelected) + ((((Arrays.hashCode(this.trackSupport) + (this.trackGroup.hashCode() * 31)) * 31) + this.trackType) * 31);
        }

        public boolean isSelected() {
            return Booleans.contains(this.trackSelected, true);
        }

        public boolean isSupported(boolean z14) {
            for (int i14 = 0; i14 < this.trackSupport.length; i14++) {
                if (isTrackSupported(i14, z14)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isTrackSelected(int i14) {
            return this.trackSelected[i14];
        }

        public boolean isTrackSupported(int i14, boolean z14) {
            int i15 = this.trackSupport[i14];
            if (i15 != 4) {
                return z14 && i15 == 3;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putBundle(keyForField(0), this.trackGroup.toBundle());
            bundle.putIntArray(keyForField(1), this.trackSupport);
            bundle.putInt(keyForField(2), this.trackType);
            bundle.putBooleanArray(keyForField(3), this.trackSelected);
            return bundle;
        }

        public boolean isTrackSupported(int i14) {
            return isTrackSupported(i14, false);
        }

        public boolean isSupported() {
            return isSupported(false);
        }
    }

    public boolean isTypeSupportedOrEmpty(int i14) {
        return isTypeSupportedOrEmpty(i14, false);
    }
}
