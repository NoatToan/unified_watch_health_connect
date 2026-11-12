package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();
    private static final String c = "TrackGroup";
    private final Format[] a;
    private int b;
    public final int length;

    public class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroup createFromParcel(Parcel in) {
            return new TrackGroup(in);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroup[] newArray(int size) {
            return new TrackGroup[size];
        }
    }

    public TrackGroup(Format... formats) {
        Assertions.checkState(formats.length > 0);
        this.a = formats;
        this.length = formats.length;
        d();
    }

    private static void a(String mismatchField, @Nullable String valueIndex0, @Nullable String otherValue, int otherIndex) {
        StringBuilder sb = new StringBuilder(String.valueOf(mismatchField).length() + 78 + String.valueOf(valueIndex0).length() + String.valueOf(otherValue).length());
        sb.append("Different ");
        sb.append(mismatchField);
        sb.append(" combined in one TrackGroup: '");
        sb.append(valueIndex0);
        sb.append("' (track 0) and '");
        sb.append(otherValue);
        sb.append("' (track ");
        sb.append(otherIndex);
        sb.append(")");
        Log.e(c, "", new IllegalStateException(sb.toString()));
    }

    private static String b(@Nullable String language) {
        return (language == null || language.equals(C.LANGUAGE_UNDETERMINED)) ? "" : language;
    }

    private static int c(int roleFlags) {
        return roleFlags | 16384;
    }

    private void d() {
        String strB = b(this.a[0].language);
        int iC = c(this.a[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.a;
            if (i >= formatArr.length) {
                return;
            }
            if (!strB.equals(b(formatArr[i].language))) {
                Format[] formatArr2 = this.a;
                a("languages", formatArr2[0].language, formatArr2[i].language, i);
                return;
            } else {
                if (iC != c(this.a[i].roleFlags)) {
                    a("role flags", Integer.toBinaryString(this.a[0].roleFlags), Integer.toBinaryString(this.a[i].roleFlags), i);
                    return;
                }
                i++;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.length == trackGroup.length && Arrays.equals(this.a, trackGroup.a);
    }

    public Format getFormat(int index) {
        return this.a[index];
    }

    public int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.a;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.length);
        for (int i = 0; i < this.length; i++) {
            dest.writeParcelable(this.a[i], 0);
        }
    }

    public TrackGroup(Parcel in) {
        int i = in.readInt();
        this.length = i;
        this.a = new Format[i];
        for (int i2 = 0; i2 < this.length; i2++) {
            this.a[i2] = (Format) in.readParcelable(Format.class.getClassLoader());
        }
    }
}
