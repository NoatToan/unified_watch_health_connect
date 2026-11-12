package com.huawei.hms.kit.awareness.barrier.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.AwarenessBarrier;

/* JADX INFO: loaded from: classes34.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f13922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AwarenessBarrier f13924c;
    private final PendingIntent d;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13922a);
        parcel.writeInt(this.f13923b);
        parcel.writeParcelable(this.f13924c, i);
        parcel.writeParcelable(this.d, i);
    }

    public int f() {
        AwarenessBarrier awarenessBarrier = this.f13924c;
        if (awarenessBarrier instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c) {
            return ((com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrier).n().b();
        }
        return 10007;
    }

    public PendingIntent e() {
        return this.d;
    }

    public String d() {
        return this.f13922a;
    }

    public int c() {
        return this.f13923b;
    }

    public AwarenessBarrier b() {
        return this.f13924c;
    }

    public boolean a() {
        AwarenessBarrier awarenessBarrier = this.f13924c;
        if (awarenessBarrier instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c) {
            return ((com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrier).n().a();
        }
        return false;
    }

    int a(Context context) {
        if (c() != 1 && this.f13924c == null) {
            return 0;
        }
        if (c() != 1 || this.d == null) {
            return 10007;
        }
        AwarenessBarrier awarenessBarrier = this.f13924c;
        if (!(awarenessBarrier instanceof com.huawei.hms.kit.awareness.barrier.internal.a.c)) {
            return 10007;
        }
        com.huawei.hms.kit.awareness.barrier.internal.a.c cVar = (com.huawei.hms.kit.awareness.barrier.internal.a.c) awarenessBarrier;
        if (cVar.j()) {
            return cVar.a(context);
        }
        return 10006;
    }

    public static a a(String str, int i, AwarenessBarrier awarenessBarrier, PendingIntent pendingIntent) {
        return new a(str, i, awarenessBarrier, pendingIntent);
    }

    private a(String str, int i, AwarenessBarrier awarenessBarrier, PendingIntent pendingIntent) {
        this.f13922a = str;
        this.f13923b = i;
        this.f13924c = awarenessBarrier;
        this.d = pendingIntent;
    }

    private a(Parcel parcel) {
        this.f13922a = parcel.readString();
        this.f13923b = parcel.readInt();
        this.f13924c = (AwarenessBarrier) parcel.readParcelable(AwarenessBarrier.class.getClassLoader());
        this.d = (PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader());
    }
}
