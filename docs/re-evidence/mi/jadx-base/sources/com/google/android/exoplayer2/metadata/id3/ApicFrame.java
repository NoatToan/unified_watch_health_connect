package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new a();
    public static final String ID = "APIC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7999b;
    public final String c;
    public final int d;
    public final byte[] e;

    public class a implements Parcelable.Creator<ApicFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(ID);
        this.f7999b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.d == apicFrame.d && wlq.c(this.f7999b, apicFrame.f7999b) && wlq.c(this.c, apicFrame.c) && Arrays.equals(this.e, apicFrame.e);
    }

    public int hashCode() {
        int i = (527 + this.d) * 31;
        String str = this.f7999b;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.f7999b;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7999b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeByteArray(this.e);
    }

    public ApicFrame(Parcel parcel) {
        super(ID);
        this.f7999b = (String) wlq.j(parcel.readString());
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = (byte[]) wlq.j(parcel.createByteArray());
    }
}
