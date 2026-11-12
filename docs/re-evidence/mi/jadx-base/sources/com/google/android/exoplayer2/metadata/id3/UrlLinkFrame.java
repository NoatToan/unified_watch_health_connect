package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8010b;
    public final String c;

    public class a implements Parcelable.Creator<UrlLinkFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.f8010b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.f8005a.equals(urlLinkFrame.f8005a) && wlq.c(this.f8010b, urlLinkFrame.f8010b) && wlq.c(this.c, urlLinkFrame.c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f8005a.hashCode()) * 31;
        String str = this.f8010b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8005a);
        parcel.writeString(this.f8010b);
        parcel.writeString(this.c);
    }

    public UrlLinkFrame(Parcel parcel) {
        super((String) wlq.j(parcel.readString()));
        this.f8010b = parcel.readString();
        this.c = (String) wlq.j(parcel.readString());
    }
}
