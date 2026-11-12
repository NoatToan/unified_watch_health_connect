package com.huawei.hms.kit.awareness.barrier.internal.a.a;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.ArraySet;
import com.huawei.hms.kit.awareness.AwarenessStatusCodes;
import com.huawei.hms.kit.awareness.b.a.f;
import com.huawei.hms.kit.awareness.b.a.g;
import com.huawei.hms.kit.awareness.barrier.internal.a.c;
import com.huawei.hms.kit.awareness.barrier.internal.e.b;
import com.huawei.hms.kit.awareness.barrier.internal.f.d;
import com.huawei.hms.kit.awareness.status.BeaconStatus;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class a extends c implements b {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.a.a.1
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
    private static final String k = "BeaconCondition";
    private static final long l = 5000;
    private Set<String> m;
    private Set<String> n;
    private Set<String> o;
    private Set<String> p;
    private long u;

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public boolean c() {
        return true;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int d() {
        return 7;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int o() {
        return 9;
    }

    public void y() {
        b(new ArraySet());
        this.u = SystemClock.elapsedRealtime();
    }

    public void x() {
        a((Set<String>) new ArraySet());
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c, com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(i(), i);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final com.huawei.hms.kit.awareness.barrier.internal.d.b i() {
        return (com.huawei.hms.kit.awareness.barrier.internal.d.b) a(com.huawei.hms.kit.awareness.barrier.internal.d.b.class);
    }

    public boolean c(long j) {
        ArraySet arraySet = new ArraySet();
        if (SystemClock.elapsedRealtime() - this.u > j) {
            this.p.clear();
        } else {
            arraySet.addAll(this.p);
        }
        arraySet.addAll(this.o);
        if (arraySet.equals(this.m)) {
            return false;
        }
        a((Set<String>) arraySet);
        return true;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void b() {
        t();
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int b(Context context) {
        if (!c(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE;
        }
        if (!c(context, "android.permission.BLUETOOTH")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermissionByContext-> calling BLUETOOTH denied", new Object[0]);
            return 10104;
        }
        if (g.a() && !c(context, "android.permission.BLUETOOTH_CONNECT")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermissionByContext-> calling BLUETOOTH_CONNECT denied", new Object[0]);
            return 10104;
        }
        if (d(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return !f.a(context) ? 10104 : 0;
        }
        return 10102;
    }

    public void a(String str) {
        this.o.add(str);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public void a(com.huawei.hms.kit.awareness.barrier.internal.b.f fVar) {
        com.huawei.hms.kit.awareness.b.a.c.a(k, "BeaconCondition check result:" + s(), new Object[0]);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a(Context context) {
        if (!a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return AwarenessStatusCodes.AWARENESS_LOCATION_PERMISSION_CODE;
        }
        if (!a(context, "android.permission.BLUETOOTH")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermission-> calling BLUETOOTH denied", new Object[0]);
            return 10104;
        }
        if (g.a() && !a(context, "android.permission.BLUETOOTH_CONNECT")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkPermission-> calling BLUETOOTH_CONNECT denied", new Object[0]);
            return 10104;
        }
        if (!b(context, "android.permission.ACCESS_FINE_LOCATION")) {
            return 10102;
        }
        if (!g.a() && !b(context, "android.permission.BLUETOOTH")) {
            com.huawei.hms.kit.awareness.b.a.c.c(k, "checkCoreSelfBlueToothPermission()-> BLUETOOTH denied", new Object[0]);
            return 10104;
        }
        if (!g.a() || b(context, "android.permission.BLUETOOTH_CONNECT")) {
            return 0;
        }
        com.huawei.hms.kit.awareness.b.a.c.c(k, "checkCoreSelfBlueToothPermission()-> BLUETOOTH_CONNECT denied", new Object[0]);
        return 10104;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    @Override // com.huawei.hms.kit.awareness.barrier.internal.a.c
    public int a() {
        int iB = i().b();
        int iB2 = 1;
        if (iB != 0) {
            if (iB != 1) {
                if (iB == 2) {
                    if (this.m.isEmpty()) {
                        iB2 = n().l() ? n().b(this) : 0;
                    }
                    n().a(this, iB2);
                }
            } else if (!d.a((Set) this.n, (Set) this.m).isEmpty()) {
                b(5000L);
            }
            iB2 = 0;
        } else if (d.a((Set) this.m, (Set) this.n).isEmpty()) {
            iB2 = 0;
        } else {
            b(5000L);
        }
        com.huawei.hms.kit.awareness.b.a.c.a(k, "BeaconCondition enter,mCurrentBeacons is:" + this.m + ", mPreviousBeacons is:" + this.n + ",beaconType is:" + i().b() + ",checkResult is:" + iB2, new Object[0]);
        return iB2;
    }

    private void b(Set<String> set) {
        this.p = this.o;
        this.o = set;
    }

    private void a(Set<String> set) {
        this.n = this.m;
        this.m = set;
    }

    private static List<com.huawei.hms.kit.awareness.a.a.b> a(Collection<BeaconStatus.Filter> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (BeaconStatus.Filter filter : collection) {
            if (filter instanceof com.huawei.hms.kit.awareness.a.a.b) {
                com.huawei.hms.kit.awareness.a.a.b bVar = (com.huawei.hms.kit.awareness.a.a.b) filter;
                if (bVar.d()) {
                    arrayList.add(new com.huawei.hms.kit.awareness.a.a.b(bVar));
                }
            }
            com.huawei.hms.kit.awareness.b.a.c.d(k, "filter is not BeaconFilter type or the param is invalid.", new Object[0]);
            throw new IllegalArgumentException();
        }
        return arrayList;
    }

    public static a a(Collection<BeaconStatus.Filter> collection, int i) {
        List<com.huawei.hms.kit.awareness.a.a.b> listA = a(collection);
        if (com.huawei.hms.kit.awareness.barrier.internal.f.a.a(listA) == listA.size()) {
            return new a(listA, i);
        }
        com.huawei.hms.kit.awareness.b.a.c.d(k, "convert to hash failed.", new Object[0]);
        throw new IllegalArgumentException();
    }

    private a(List<com.huawei.hms.kit.awareness.a.a.b> list, int i) {
        this.m = new ArraySet();
        this.n = new ArraySet();
        this.o = new ArraySet();
        this.p = new ArraySet();
        this.u = SystemClock.elapsedRealtime();
        a(new com.huawei.hms.kit.awareness.barrier.internal.d.b(list, i));
    }

    private a(Parcel parcel) {
        super(parcel);
        this.m = new ArraySet();
        this.n = new ArraySet();
        this.o = new ArraySet();
        this.p = new ArraySet();
        this.u = SystemClock.elapsedRealtime();
        a((com.huawei.hms.kit.awareness.barrier.internal.d.f) parcel.readParcelable(com.huawei.hms.kit.awareness.barrier.internal.d.b.class.getClassLoader()));
    }
}
