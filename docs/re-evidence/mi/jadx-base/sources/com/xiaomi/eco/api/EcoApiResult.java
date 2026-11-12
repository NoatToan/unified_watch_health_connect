package com.xiaomi.eco.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import defpackage.dsf;
import defpackage.pd7;
import defpackage.u7r;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class EcoApiResult implements Parcelable {
    public static final Parcelable.Creator<EcoApiResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u7r f11236b;
    public final byte[] c;

    public class a implements Parcelable.Creator<EcoApiResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EcoApiResult createFromParcel(Parcel parcel) {
            return new EcoApiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public EcoApiResult[] newArray(int i) {
            return new EcoApiResult[i];
        }
    }

    public EcoApiResult(int i, u7r u7rVar, byte[] bArr) {
        this.f11235a = i;
        this.c = bArr;
        this.f11236b = u7rVar;
    }

    public int a() {
        return this.f11235a;
    }

    public String c() {
        return pd7.a(this.f11235a);
    }

    public byte[] d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public u7r e() {
        return this.f11236b;
    }

    public boolean f() {
        return this.f11235a == 0;
    }

    public String toString() {
        return "EcoApiResult{mCode=" + c() + ", mPacket=" + this.f11236b + ", mData=" + Arrays.toString(this.c) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11235a);
        parcel.writeByteArray(this.c);
        u7r u7rVar = this.f11236b;
        if (u7rVar != null) {
            parcel.writeByteArray(dsf.i(u7rVar));
        }
    }

    public EcoApiResult(Parcel parcel) {
        this.f11235a = parcel.readInt();
        this.c = parcel.createByteArray();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray != null) {
            try {
                this.f11236b = u7r.y(bArrCreateByteArray);
            } catch (InvalidProtocolBufferNanoException unused) {
            }
        }
    }
}
