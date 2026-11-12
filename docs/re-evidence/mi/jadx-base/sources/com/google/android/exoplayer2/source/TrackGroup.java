package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import defpackage.rk1;
import defpackage.toe;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Format[] f8077b;
    public int c;

    public class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        rk1.g(formatArr.length > 0);
        this.f8077b = formatArr;
        this.f8076a = formatArr.length;
        g();
    }

    public static void d(String str, String str2, String str3, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("Different ");
        sb.append(str);
        sb.append(" combined in one TrackGroup: '");
        sb.append(str2);
        sb.append("' (track 0) and '");
        sb.append(str3);
        sb.append("' (track ");
        sb.append(i);
        sb.append(")");
        toe.d("TrackGroup", "", new IllegalStateException(sb.toString()));
    }

    public static String e(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int f(int i) {
        return i | 16384;
    }

    public Format a(int i) {
        return this.f8077b[i];
    }

    public int c(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f8077b;
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
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f8076a == trackGroup.f8076a && Arrays.equals(this.f8077b, trackGroup.f8077b);
    }

    public final void g() {
        String strE = e(this.f8077b[0].c);
        int iF = f(this.f8077b[0].e);
        int i = 1;
        while (true) {
            Format[] formatArr = this.f8077b;
            if (i >= formatArr.length) {
                return;
            }
            if (!strE.equals(e(formatArr[i].c))) {
                Format[] formatArr2 = this.f8077b;
                d("languages", formatArr2[0].c, formatArr2[i].c, i);
                return;
            } else {
                if (iF != f(this.f8077b[i].e)) {
                    d("role flags", Integer.toBinaryString(this.f8077b[0].e), Integer.toBinaryString(this.f8077b[i].e), i);
                    return;
                }
                i++;
            }
        }
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = 527 + Arrays.hashCode(this.f8077b);
        }
        return this.c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8076a);
        for (int i2 = 0; i2 < this.f8076a; i2++) {
            parcel.writeParcelable(this.f8077b[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int i = parcel.readInt();
        this.f8076a = i;
        this.f8077b = new Format[i];
        for (int i2 = 0; i2 < this.f8076a; i2++) {
            this.f8077b[i2] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
