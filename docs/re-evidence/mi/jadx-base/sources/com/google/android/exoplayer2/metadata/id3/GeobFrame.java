package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new a();
    public static final String ID = "GEOB";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8004b;
    public final String c;
    public final String d;
    public final byte[] e;

    public class a implements Parcelable.Creator<GeobFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(ID);
        this.f8004b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return wlq.c(this.f8004b, geobFrame.f8004b) && wlq.c(this.c, geobFrame.c) && wlq.c(this.d, geobFrame.d) && Arrays.equals(this.e, geobFrame.e);
    }

    public int hashCode() {
        String str = this.f8004b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.e);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.f8004b;
        String str3 = this.c;
        String str4 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append(str);
        sb.append(": mimeType=");
        sb.append(str2);
        sb.append(", filename=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8004b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public GeobFrame(Parcel parcel) {
        super(ID);
        this.f8004b = (String) wlq.j(parcel.readString());
        this.c = (String) wlq.j(parcel.readString());
        this.d = (String) wlq.j(parcel.readString());
        this.e = (byte[]) wlq.j(parcel.createByteArray());
    }
}
