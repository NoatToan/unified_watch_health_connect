package com.xiaomi.continuity.networking;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.j3s;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class BusinessServiceInfo implements Parcelable {
    public static final Parcelable.Creator<BusinessServiceInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11232b;
    public byte[] c;

    public class a implements Parcelable.Creator<BusinessServiceInfo> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusinessServiceInfo createFromParcel(Parcel parcel) {
            return new BusinessServiceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public BusinessServiceInfo[] newArray(int i) {
            return new BusinessServiceInfo[i];
        }
    }

    public BusinessServiceInfo() {
    }

    public BusinessServiceInfo(Parcel parcel) {
        this.f11231a = parcel.readString();
        this.f11232b = parcel.readString();
        this.c = parcel.createByteArray();
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if ((bArr == null || bArr.length == 0) && (bArr2 == null || bArr2.length == 0)) {
            return true;
        }
        return Arrays.equals(bArr, bArr2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusinessServiceInfo businessServiceInfo = (BusinessServiceInfo) obj;
        return Objects.equals(this.f11231a, businessServiceInfo.f11231a) && Objects.equals(this.f11232b, businessServiceInfo.f11232b) && a(this.c, businessServiceInfo.c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.c) + (Objects.hash(this.f11231a, this.f11232b) * 31);
    }

    public String toString() {
        StringBuilder sbA = j3s.a("BusinessServiceInfo{serviceName='");
        sbA.append(this.f11231a);
        sbA.append('\'');
        sbA.append(", packageName='");
        sbA.append(this.f11232b);
        sbA.append('\'');
        sbA.append(", serviceData=");
        sbA.append(Arrays.toString(this.c));
        sbA.append(AbstractJsonLexerKt.END_OBJ);
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11231a);
        parcel.writeString(this.f11232b);
        parcel.writeByteArray(this.c);
    }
}
