package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.xy9;

/* JADX INFO: loaded from: classes4.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8019b;

    public class a implements Parcelable.Creator<SmtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    public /* synthetic */ SmtaMetadataEntry(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.f8018a == smtaMetadataEntry.f8018a && this.f8019b == smtaMetadataEntry.f8019b;
    }

    public int hashCode() {
        return ((527 + xy9.a(this.f8018a)) * 31) + this.f8019b;
    }

    public String toString() {
        float f = this.f8018a;
        int i = this.f8019b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("smta: captureFrameRate=");
        sb.append(f);
        sb.append(", svcTemporalLayerCount=");
        sb.append(i);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f8018a);
        parcel.writeInt(this.f8019b);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.f8018a = f;
        this.f8019b = i;
    }

    public SmtaMetadataEntry(Parcel parcel) {
        this.f8018a = parcel.readFloat();
        this.f8019b = parcel.readInt();
    }
}
