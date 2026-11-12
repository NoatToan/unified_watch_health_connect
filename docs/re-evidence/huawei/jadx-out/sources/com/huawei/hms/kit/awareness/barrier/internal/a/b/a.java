package com.huawei.hms.kit.awareness.barrier.internal.a.b;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.kit.awareness.barrier.internal.a.c;
import com.huawei.hms.kit.awareness.barrier.internal.b.d;
import com.huawei.hms.kit.awareness.barrier.internal.b.f;
import com.huawei.hms.kit.awareness.barrier.internal.e.b;

/* JADX INFO: loaded from: classes34.dex */
public class a extends c implements b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.b.a.1
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
    public static final String k = "com.huawei.hms.permission.ACTIVITY_RECOGNITION";
    private static final String l = "BehaviorCondition";
    private static final long m = 5000;
    private final int n;
    private int o;
    private int p;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int d() {
        return 3;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int o() {
        return 9;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(i(), i);
        parcel.writeInt(this.n);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final com.huawei.hms.kit.awareness.barrier.internal.d.c i() {
        return (com.huawei.hms.kit.awareness.barrier.internal.d.c) a(com.huawei.hms.kit.awareness.barrier.internal.d.c.class);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public boolean j() {
        return i().g() && com.huawei.hms.kit.awareness.barrier.internal.type.c.a(this.n);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public boolean c() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void b(f fVar) {
        if (fVar instanceof d) {
            int iA = ((d) fVar).a();
            this.o = iA;
            this.p = iA;
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void b() {
        t();
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int b(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            return c(context, k) ? 0 : 10103;
        }
        return c(context, "android.permission.ACTIVITY_RECOGNITION") ? 0 : 10103;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void a(f fVar) {
        if (fVar instanceof d) {
            this.o = ((d) fVar).a();
            s();
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a(Context context) {
        if (Build.VERSION.SDK_INT <= 28) {
            return a(context, k) ? 0 : 10103;
        }
        return a(context, "android.permission.ACTIVITY_RECOGNITION") ? 0 : 10103;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a() {
        int i = this.n;
        int i2 = 2;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    i2 = this.o;
                }
            } else if (y()) {
                b(5000L);
                i2 = 1;
            } else {
                i2 = 0;
            }
        } else if (x()) {
            b(5000L);
            i2 = 1;
        } else {
            i2 = 0;
        }
        com.huawei.hms.kit.awareness.b.a.c.a(l, "TransitionType:{0}; {1}; mState:{2}; check result:{3}", com.huawei.hms.kit.awareness.barrier.internal.type.c.b(this.n), i().toString(), Integer.valueOf(this.o), Integer.valueOf(i2));
        return i2;
    }

    private boolean y() {
        int i = this.o;
        boolean z = i != this.p && i == 0;
        this.p = i;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000a  */
    private boolean x() {
        boolean z;
        int i = this.o;
        if (i != this.p) {
            z = i == 1;
        }
        this.p = i;
        return z;
    }

    public static a a(int i, int... iArr) {
        if (com.huawei.hms.kit.awareness.barrier.internal.d.c.a(iArr) && com.huawei.hms.kit.awareness.barrier.internal.type.c.a(i)) {
            return new a(i, iArr);
        }
        com.huawei.hms.kit.awareness.b.a.c.d(l, "Invalid parameter.", new Object[0]);
        return null;
    }

    private a(Parcel parcel) {
        super(parcel);
        a((com.huawei.hms.kit.awareness.barrier.internal.d.f) parcel.readParcelable(com.huawei.hms.kit.awareness.barrier.internal.d.c.class.getClassLoader()));
        this.n = parcel.readInt();
        this.o = 2;
        this.p = 2;
    }

    private a(int i, int[] iArr) {
        a(new com.huawei.hms.kit.awareness.barrier.internal.d.c(iArr));
        this.n = i;
        this.o = 2;
        this.p = 2;
    }
}
