package com.google.android.exoplayer2.source;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.v;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class TrackGroup implements Bundleable {
    public static final Bundleable.Creator<TrackGroup> CREATOR = new k(3);
    private static final int FIELD_FORMATS = 0;
    private static final int FIELD_ID = 1;
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f53055id;
    public final int length;

    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.f53055id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        verifyCorrectness();
    }

    private static String keyForField(int i14) {
        return Integer.toString(i14, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TrackGroup lambda$static$0(Bundle bundle) {
        return new TrackGroup(bundle.getString(keyForField(1), ""), (Format[]) BundleableUtil.fromBundleNullableList(Format.CREATOR, bundle.getParcelableArrayList(keyForField(0)), ImmutableList.of()).toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, String str2, String str3, int i14) {
        StringBuilder sbD = v.d(v.a(v.a(v.a(78, str), str2), str3), "Different ", str, " combined in one TrackGroup: '", str2);
        sbD.append("' (track 0) and '");
        sbD.append(str3);
        sbD.append("' (track ");
        sbD.append(i14);
        sbD.append(")");
        Log.e(TAG, "", new IllegalStateException(sbD.toString()));
    }

    private static String normalizeLanguage(String str) {
        return (str == null || str.equals(C.LANGUAGE_UNDETERMINED)) ? "" : str;
    }

    private static int normalizeRoleFlags(int i14) {
        return i14 | 16384;
    }

    private void verifyCorrectness() {
        String strNormalizeLanguage = normalizeLanguage(this.formats[0].language);
        int iNormalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i14 = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i14 >= formatArr.length) {
                return;
            }
            boolean zEquals = strNormalizeLanguage.equals(normalizeLanguage(formatArr[i14].language));
            Format[] formatArr2 = this.formats;
            if (!zEquals) {
                logErrorMessage("languages", formatArr2[0].language, formatArr2[i14].language, i14);
                return;
            } else {
                if (iNormalizeRoleFlags != normalizeRoleFlags(formatArr2[i14].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i14].roleFlags), i14);
                    return;
                }
                i14++;
            }
        }
    }

    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TrackGroup.class == obj.getClass()) {
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.length == trackGroup.length && this.f53055id.equals(trackGroup.f53055id) && Arrays.equals(this.formats, trackGroup.formats)) {
                return true;
            }
        }
        return false;
    }

    public Format getFormat(int i14) {
        return this.formats[i14];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = wr.g.j(527, 31, this.f53055id) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    public int indexOf(Format format) {
        int i14 = 0;
        while (true) {
            Format[] formatArr = this.formats;
            if (i14 >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i14]) {
                return i14;
            }
            i14++;
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(keyForField(0), BundleableUtil.toBundleArrayList(Lists.newArrayList(this.formats)));
        bundle.putString(keyForField(1), this.f53055id);
        return bundle;
    }

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }
}
