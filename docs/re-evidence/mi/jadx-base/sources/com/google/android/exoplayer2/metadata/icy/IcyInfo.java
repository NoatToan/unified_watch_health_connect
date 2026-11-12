package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.n;
import defpackage.rk1;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f7997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7998b;
    public final String c;

    public class a implements Parcelable.Creator<IcyInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.f7997a = bArr;
        this.f7998b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyInfo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7997a, ((IcyInfo) obj).f7997a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7997a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f7998b, this.c, Integer.valueOf(this.f7997a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f7997a);
        parcel.writeString(this.f7998b);
        parcel.writeString(this.c);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void y(n.b bVar) {
        String str = this.f7998b;
        if (str != null) {
            bVar.q(str);
        }
    }

    public IcyInfo(Parcel parcel) {
        this.f7997a = (byte[]) rk1.e(parcel.createByteArray());
        this.f7998b = parcel.readString();
        this.c = parcel.readString();
    }
}
