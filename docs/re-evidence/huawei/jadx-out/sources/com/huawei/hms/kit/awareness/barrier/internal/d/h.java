package com.huawei.hms.kit.awareness.barrier.internal.d;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes34.dex */
public class h extends f {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.d.h.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i) {
            return new h[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f13991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13993c;

    public static boolean a(int i) {
        return i == 1 || i == 0 || i == -1;
    }

    public static boolean b(int i) {
        return i >= 0;
    }

    private boolean c(int i) {
        return i == 0 || i == 1 || i == 2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13991a);
        parcel.writeInt(this.f13992b);
        parcel.writeInt(this.f13993c);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.d.f
    public boolean g() {
        return c(this.f13991a) && b(this.f13992b) && a(this.f13993c);
    }

    public int c() {
        return this.f13993c;
    }

    public int b() {
        return this.f13992b;
    }

    public int a() {
        return this.f13991a;
    }

    private h(Parcel parcel) {
        this.f13991a = parcel.readInt();
        this.f13992b = parcel.readInt();
        this.f13993c = parcel.readInt();
    }

    public h(int i, int i2, int i3) {
        this.f13991a = i;
        this.f13992b = i2;
        this.f13993c = i3;
    }
}
