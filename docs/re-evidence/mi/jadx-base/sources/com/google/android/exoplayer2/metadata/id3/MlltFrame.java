package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wlq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new a();
    public static final String ID = "MLLT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8007b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public class a implements Parcelable.Creator<MlltFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(ID);
        this.f8007b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.f8007b == mlltFrame.f8007b && this.c == mlltFrame.c && this.d == mlltFrame.d && Arrays.equals(this.e, mlltFrame.e) && Arrays.equals(this.f, mlltFrame.f);
    }

    public int hashCode() {
        return ((((((((527 + this.f8007b) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8007b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeIntArray(this.e);
        parcel.writeIntArray(this.f);
    }

    public MlltFrame(Parcel parcel) {
        super(ID);
        this.f8007b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = (int[]) wlq.j(parcel.createIntArray());
        this.f = (int[]) wlq.j(parcel.createIntArray());
    }
}
