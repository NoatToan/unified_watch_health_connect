package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class EventMessage implements Metadata.Entry {

    @VisibleForTesting
    public static final String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";

    @VisibleForTesting
    public static final String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7990b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;
    public static final Format g = new Format.b().e0("application/id3").E();
    public static final Format h = new Format.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();

    public class a implements Parcelable.Creator<EventMessage> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f7989a = str;
        this.f7990b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public byte[] N() {
        if (U() != null) {
            return this.e;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public Format U() {
        String str = this.f7989a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
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
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.c == eventMessage.c && this.d == eventMessage.d && wlq.c(this.f7989a, eventMessage.f7989a) && wlq.c(this.f7990b, eventMessage.f7990b) && Arrays.equals(this.e, eventMessage.e);
    }

    public int hashCode() {
        if (this.f == 0) {
            String str = this.f7989a;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f7990b;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.c;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public String toString() {
        String str = this.f7989a;
        long j = this.d;
        long j2 = this.c;
        String str2 = this.f7990b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7989a);
        parcel.writeString(this.f7990b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    public EventMessage(Parcel parcel) {
        this.f7989a = (String) wlq.j(parcel.readString());
        this.f7990b = (String) wlq.j(parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) wlq.j(parcel.createByteArray());
    }
}
