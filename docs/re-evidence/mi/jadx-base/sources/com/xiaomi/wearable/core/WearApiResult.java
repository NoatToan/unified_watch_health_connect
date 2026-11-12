package com.xiaomi.wearable.core;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class WearApiResult implements Parcelable {
    public static final Parcelable.Creator<WearApiResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14379b;

    public class a implements Parcelable.Creator<WearApiResult> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public WearApiResult createFromParcel(Parcel parcel) {
            return new WearApiResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public WearApiResult[] newArray(int i) {
            return new WearApiResult[i];
        }
    }

    public WearApiResult(int i) {
        this(i, null);
    }

    public int a() {
        return this.f14378a;
    }

    public byte[] c() {
        return this.f14379b;
    }

    public boolean d() {
        return this.f14378a == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WearApiResult{mCode=" + this.f14378a + ", mData=" + Arrays.toString(this.f14379b) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14378a);
        parcel.writeByteArray(this.f14379b);
    }

    public WearApiResult(int i, byte[] bArr) {
        this.f14378a = i;
        this.f14379b = bArr;
    }

    public WearApiResult(Parcel parcel) {
        this.f14378a = parcel.readInt();
        this.f14379b = parcel.createByteArray();
    }
}
