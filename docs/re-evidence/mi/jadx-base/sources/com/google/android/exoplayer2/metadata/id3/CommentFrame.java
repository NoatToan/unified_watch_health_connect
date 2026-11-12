package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new a();
    public static final String ID = "COMM";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8003b;
    public final String c;
    public final String d;

    public class a implements Parcelable.Creator<CommentFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super(ID);
        this.f8003b = str;
        this.c = str2;
        this.d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return wlq.c(this.c, commentFrame.c) && wlq.c(this.f8003b, commentFrame.f8003b) && wlq.c(this.d, commentFrame.d);
    }

    public int hashCode() {
        String str = this.f8003b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.f8003b;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8005a);
        parcel.writeString(this.f8003b);
        parcel.writeString(this.d);
    }

    public CommentFrame(Parcel parcel) {
        super(ID);
        this.f8003b = (String) wlq.j(parcel.readString());
        this.c = (String) wlq.j(parcel.readString());
        this.d = (String) wlq.j(parcel.readString());
    }
}
