package com.xiaomi.continuity.netbus;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DiscoveryData implements Parcelable {
    public static final Parcelable.Creator<DiscoveryData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f11211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11212b;
    public byte[] c;
    public byte[] d;

    public class a implements Parcelable.Creator<DiscoveryData> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public DiscoveryData createFromParcel(Parcel parcel) {
            return new DiscoveryData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DiscoveryData[] newArray(int i) {
            return new DiscoveryData[i];
        }
    }

    public DiscoveryData() {
    }

    public DiscoveryData(Parcel parcel) {
        this.f11211a = parcel.readInt();
        this.f11212b = parcel.readInt();
        int i = parcel.readInt();
        if (i > 0) {
            byte[] bArr = new byte[i];
            this.c = bArr;
            parcel.readByteArray(bArr);
        }
        int i2 = parcel.readInt();
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            this.d = bArr2;
            parcel.readByteArray(bArr2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sbA = j3s.a("DiscoveryData{mMediumType=");
        sbA.append(this.f11211a);
        sbA.append(", mDataType=");
        sbA.append(this.f11212b);
        sbA.append(", mData=");
        sbA.append(Arrays.toString(this.c));
        sbA.append(", mExtendData=");
        sbA.append(Arrays.toString(this.d));
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11211a);
        parcel.writeInt(this.f11212b);
        byte[] bArr = this.c;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.c);
        } else {
            parcel.writeInt(0);
        }
        byte[] bArr2 = this.d;
        if (bArr2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr2.length);
            parcel.writeByteArray(this.d);
        }
    }

    public /* synthetic */ DiscoveryData(Parcel parcel, a aVar) {
        this(parcel);
    }
}
