package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new a();
    public static final String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8012b;
    public final int c;
    public final int d;

    public class a implements Parcelable.Creator<MdtaMetadataEntry> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
        }
    }

    public /* synthetic */ MdtaMetadataEntry(Parcel parcel, a aVar) {
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.f8011a.equals(mdtaMetadataEntry.f8011a) && Arrays.equals(this.f8012b, mdtaMetadataEntry.f8012b) && this.c == mdtaMetadataEntry.c && this.d == mdtaMetadataEntry.d;
    }

    public int hashCode() {
        return ((((((527 + this.f8011a.hashCode()) * 31) + Arrays.hashCode(this.f8012b)) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f8011a);
        return strValueOf.length() != 0 ? "mdta: key=".concat(strValueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8011a);
        parcel.writeByteArray(this.f8012b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.f8011a = str;
        this.f8012b = bArr;
        this.c = i;
        this.d = i2;
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.f8011a = (String) wlq.j(parcel.readString());
        this.f8012b = (byte[]) wlq.j(parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
