package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new a();
    public static final String ID = "----";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8006b;
    public final String c;
    public final String d;

    public class a implements Parcelable.Creator<InternalFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super(ID);
        this.f8006b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return wlq.c(this.c, internalFrame.c) && wlq.c(this.f8006b, internalFrame.f8006b) && wlq.c(this.d, internalFrame.d);
    }

    public int hashCode() {
        String str = this.f8006b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.f8006b;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8005a);
        parcel.writeString(this.f8006b);
        parcel.writeString(this.d);
    }

    public InternalFrame(Parcel parcel) {
        super(ID);
        this.f8006b = (String) wlq.j(parcel.readString());
        this.c = (String) wlq.j(parcel.readString());
        this.d = (String) wlq.j(parcel.readString());
    }
}
