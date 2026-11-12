package com.linecorp.linesdk.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.linecorp.linesdk.a.f;

/* JADX INFO: loaded from: classes18.dex */
final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    @Nullable
    public f a;

    @Nullable
    public String b;
    public boolean c;

    @Nullable
    public String d;
    public boolean e;

    public static class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i) {
            return new d[i];
        }
    }

    public /* synthetic */ d(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        f fVar = this.a;
        parcel.writeString(fVar == null ? null : fVar.a);
        f fVar2 = this.a;
        parcel.writeString(fVar2 != null ? fVar2.b : null);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeString(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
    }

    public d() {
    }

    private d(Parcel parcel) {
        String string = parcel.readString();
        String string2 = parcel.readString();
        this.a = (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) ? null : new f(string, string2);
        this.b = parcel.readString();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readString();
        this.e = parcel.readByte() != 0;
    }
}
