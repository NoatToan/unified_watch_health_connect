package com.google.android.exoplayer2.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.rk1;

/* JADX INFO: loaded from: classes4.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7988b;

    public class a implements Parcelable.Creator<AppInfoTable> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppInfoTable createFromParcel(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) rk1.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f7987a = i;
        this.f7988b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i = this.f7987a;
        String str = this.f7988b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
        sb.append("Ait(controlCode=");
        sb.append(i);
        sb.append(",url=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7988b);
        parcel.writeInt(this.f7987a);
    }
}
