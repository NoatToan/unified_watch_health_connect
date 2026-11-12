package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.n;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8009b;
    public final String c;

    public class a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.f8009b = str2;
        this.c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return wlq.c(this.f8005a, textInformationFrame.f8005a) && wlq.c(this.f8009b, textInformationFrame.f8009b) && wlq.c(this.c, textInformationFrame.c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f8005a.hashCode()) * 31;
        String str = this.f8009b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        String str = this.f8005a;
        String str2 = this.f8009b;
        String str3 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8005a);
        parcel.writeString(this.f8009b);
        parcel.writeString(this.c);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void y(n.b bVar) {
        String str = this.f8005a;
        str.hashCode();
        switch (str) {
            case "TAL":
            case "TALB":
                bVar.o(this.c);
                break;
            case "TP1":
            case "TPE1":
                bVar.p(this.c);
                break;
            case "TP2":
            case "TPE2":
                bVar.n(this.c);
                break;
            case "TT2":
            case "TIT2":
                bVar.q(this.c);
                break;
        }
    }

    public TextInformationFrame(Parcel parcel) {
        super((String) wlq.j(parcel.readString()));
        this.f8009b = parcel.readString();
        this.c = (String) wlq.j(parcel.readString());
    }
}
