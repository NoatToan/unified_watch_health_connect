package com.loc;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.hm.health.device.event.StatEvent;

/* JADX INFO: loaded from: classes18.dex */
public final class dl implements Parcelable {
    public static final Parcelable.Creator<dl> CREATOR = new Parcelable.Creator<dl>() { // from class: com.loc.dl.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ dl createFromParcel(Parcel parcel) {
            dl dlVar = new dl();
            dlVar.c(parcel.readString());
            dlVar.d(parcel.readString());
            dlVar.e(parcel.readString());
            dlVar.f(parcel.readString());
            dlVar.b(parcel.readString());
            dlVar.c(parcel.readLong());
            dlVar.d(parcel.readLong());
            dlVar.a(parcel.readLong());
            dlVar.b(parcel.readLong());
            dlVar.a(parcel.readString());
            return dlVar;
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ dl[] newArray(int i) {
            return new dl[i];
        }
    };
    private String e;
    private String f;
    private long a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private String g = StatEvent.TP_FIRST;
    private String h = "";
    private String i = "";
    private String j = null;

    public final long a() {
        long j = this.d;
        long j2 = this.c;
        if (j - j2 <= 0) {
            return 0L;
        }
        return j - j2;
    }

    public final void a(long j) {
        this.c = j;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final String b() {
        return this.i;
    }

    public final void b(long j) {
        this.d = j;
    }

    public final void b(String str) {
        this.j = str;
    }

    public final String c() {
        return this.j;
    }

    public final void c(long j) {
        this.a = j;
    }

    public final void c(String str) {
        this.e = str;
    }

    public final String d() {
        return this.e;
    }

    public final void d(long j) {
        this.b = j;
    }

    public final void d(String str) {
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f;
    }

    public final void e(String str) {
        this.g = str;
    }

    public final String f() {
        return this.g;
    }

    public final void f(String str) {
        this.h = str;
    }

    public final String g() {
        return this.h;
    }

    public final long h() {
        long j = this.b;
        long j2 = this.a;
        if (j <= j2) {
            return 0L;
        }
        return j - j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.j);
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeString(this.i);
        } catch (Throwable unused) {
        }
    }
}
