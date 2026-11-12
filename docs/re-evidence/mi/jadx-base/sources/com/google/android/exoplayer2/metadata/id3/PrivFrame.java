package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new a();
    public static final String ID = "PRIV";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8008b;
    public final byte[] c;

    public class a implements Parcelable.Creator<PrivFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super(ID);
        this.f8008b = str;
        this.c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return wlq.c(this.f8008b, privFrame.f8008b) && Arrays.equals(this.c, privFrame.c);
    }

    public int hashCode() {
        String str = this.f8008b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.c);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.f8008b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": owner=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8008b);
        parcel.writeByteArray(this.c);
    }

    public PrivFrame(Parcel parcel) {
        super(ID);
        this.f8008b = (String) wlq.j(parcel.readString());
        this.c = (byte[]) wlq.j(parcel.createByteArray());
    }
}
