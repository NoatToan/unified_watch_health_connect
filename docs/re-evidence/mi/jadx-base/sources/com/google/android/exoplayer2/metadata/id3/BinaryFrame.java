package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f8000b;

    public class a implements Parcelable.Creator<BinaryFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f8000b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.f8005a.equals(binaryFrame.f8005a) && Arrays.equals(this.f8000b, binaryFrame.f8000b);
    }

    public int hashCode() {
        return ((527 + this.f8005a.hashCode()) * 31) + Arrays.hashCode(this.f8000b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8005a);
        parcel.writeByteArray(this.f8000b);
    }

    public BinaryFrame(Parcel parcel) {
        super((String) wlq.j(parcel.readString()));
        this.f8000b = (byte[]) wlq.j(parcel.createByteArray());
    }
}
