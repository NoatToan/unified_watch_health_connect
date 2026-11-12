package com.huawei.hms.kit.awareness.barrier.internal.a.g;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.ArraySet;
import com.huawei.hms.kit.awareness.b.a.f;
import com.huawei.hms.kit.awareness.b.a.g;
import com.huawei.hms.kit.awareness.barrier.internal.a.c;
import com.huawei.hms.kit.awareness.barrier.internal.d.h;
import com.huawei.hms.kit.awareness.barrier.internal.e.b;
import com.huawei.hms.kit.awareness.barrier.internal.f.d;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class a extends c implements b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.g.a.1
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
    private static final String k = "BluetoothCondition";
    private static final long m = 5000;
    private Set<String> n;
    private Set<String> o;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public boolean c() {
        return true;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int d() {
        return 9;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int o() {
        return 6;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public h i() {
        return (h) a(h.class);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(i(), i);
    }

    public Set<String> w() {
        return this.n;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void b() {
        t();
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int b(Context context) {
        if (!c(context, "android.permission.BLUETOOTH")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermissionByContext() -> calling BLUETOOTH denied", new Object[0]);
            return 10104;
        }
        if (!f.a(context)) {
            return 10104;
        }
        if (!g.a() || c(context, "android.permission.BLUETOOTH_CONNECT")) {
            return 0;
        }
        com.huawei.hms.kit.awareness.b.a.c.c(k, " checkPermissionByContext() -> BLUETOOTH_CONNECT denied", new Object[0]);
        return 10104;
    }

    public boolean a(String str) {
        return this.n.contains(str);
    }

    public void a(Set<String> set) {
        this.o = this.n;
        this.n = set;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void a(com.huawei.hms.kit.awareness.barrier.internal.b.f fVar) {
        if (fVar instanceof com.huawei.hms.kit.awareness.barrier.internal.b.a) {
            com.huawei.hms.kit.awareness.barrier.internal.b.a aVar = (com.huawei.hms.kit.awareness.barrier.internal.b.a) fVar;
            if (aVar.b()) {
                a(d.a(aVar.a()));
            }
            com.huawei.hms.kit.awareness.b.a.c.a(k, "rootConditionCheck check result:" + s(), new Object[0]);
        }
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a(Context context) {
        if (!a(context, "android.permission.BLUETOOTH")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkBluetoothPermission() ->  calling BLUETOOTH denied", new Object[0]);
            return 10104;
        }
        if (!g.a() && !b(context, "android.permission.BLUETOOTH")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermission-> BLUETOOTH denied", new Object[0]);
            return 10104;
        }
        if (g.a() && !b(context, "android.permission.BLUETOOTH_CONNECT")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermission-> BLUETOOTH_CONNECT denied", new Object[0]);
            return 10104;
        }
        if (!g.a() || a(context, "android.permission.BLUETOOTH_CONNECT")) {
            return 0;
        }
        com.huawei.hms.kit.awareness.b.a.c.c(k, " checkBluetoothPermission() ->  calling BLUETOOTH_CONNECT denied", new Object[0]);
        return 10104;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a() {
        int iA = i().a();
        int i = 1;
        if (iA != 0) {
            if (iA != 1) {
                if (iA != 2) {
                    return 0;
                }
                if (d.a((Set) this.o, (Set) this.n).isEmpty()) {
                    i = 0;
                } else {
                    b(5000L);
                }
            } else if (d.a((Set) this.n, (Set) this.o).isEmpty()) {
                i = 0;
            } else {
                b(5000L);
            }
        } else if ((this.n.isEmpty() || i().c() != 1) && (!this.n.isEmpty() || i().c() != 0)) {
            i = 0;
        }
        com.huawei.hms.kit.awareness.b.a.c.a(k, "-----BluetoothCondition check() end,barrier Tag is: " + l() + ",mCurrent bluetooth is:" + this.n + ", mPrevious bluetooth is:" + this.o + ",barrier Type is:" + i().a() + ",checkResult is:" + i, new Object[0]);
        return i;
    }

    public static a a(int i, int i2, int i3) {
        return new a(i, i2, i3);
    }

    public static a a(int i, int i2) {
        return new a(i, i2, -1);
    }

    private a(Parcel parcel) {
        super(parcel);
        this.n = new ArraySet();
        this.o = new ArraySet();
        a((com.huawei.hms.kit.awareness.barrier.internal.d.f) parcel.readParcelable(h.class.getClassLoader()));
    }

    private a(int i, int i2, int i3) {
        this.n = new ArraySet();
        this.o = new ArraySet();
        a(new h(i, i2, i3));
    }
}
