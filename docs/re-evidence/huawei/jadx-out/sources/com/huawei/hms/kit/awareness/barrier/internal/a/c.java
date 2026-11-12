package com.huawei.hms.kit.awareness.barrier.internal.a;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.ContextCompat;
import androidx.core.content.PermissionChecker;
import com.huawei.hms.kit.awareness.barrier.AwarenessBarrier;
import com.huawei.hms.kit.awareness.barrier.BarrierStatus;
import com.huawei.hms.kit.awareness.barrier.internal.b.h;
import com.huawei.hms.kit.awareness.barrier.internal.d.f;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes34.dex */
public abstract class c extends AwarenessBarrier implements com.huawei.hms.kit.awareness.barrier.internal.e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f13925a = 28;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13926b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13927c = 24;
    public static final int d = 24;
    public static final int e = 24;
    public static final int f = 24;
    public static final int g = 24;
    public static final int j = 24;
    private static final String k = "Condition";
    public static final int r = 24;
    public static final int s = 24;
    public static final int t = 28;
    public static final int v = 24;
    public static final int w = 24;
    public static final int x = 24;
    public static final int y = 29;
    public static final int z = 24;
    private f n;
    private static final AtomicLong l = new AtomicLong(0);
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() { // from class: com.huawei.hms.kit.awareness.barrier.internal.a.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            ClassLoader classLoaderA = a(parcel.readString());
            if (classLoaderA == null) {
                return null;
            }
            parcel.setDataPosition(iDataPosition);
            return (c) parcel.readParcelable(classLoaderA);
        }

        private ClassLoader a(String str) {
            try {
                return Class.forName(str).getClassLoader();
            } catch (ClassNotFoundException unused) {
                com.huawei.hms.kit.awareness.b.a.c.d(c.k, "ClassNotFound: " + str, new Object[0]);
                return null;
            }
        }
    };
    private final String m = Long.toString(l.incrementAndGet());
    BarrierStatus h = com.huawei.hms.kit.awareness.barrier.internal.c.b.a();
    a i = com.huawei.hms.kit.awareness.barrier.internal.c.a.h();
    protected volatile long q = h.a();

    public abstract int a();

    public abstract int a(Context context);

    public abstract int b(Context context);

    public abstract boolean c();

    public abstract int d();

    @Override // com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return 1;
    }

    boolean f() {
        return true;
    }

    List<c> g() {
        return null;
    }

    int h() {
        return 0;
    }

    public abstract int o();

    public int p() {
        return 1;
    }

    public final long z() {
        return this.q;
    }

    @Override // com.huawei.hms.kit.awareness.barrier.AwarenessBarrier, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getClass().getName());
    }

    public final void v() {
        this.i.i().a(this, d());
    }

    protected final void u() {
        this.i.i().a(this, 8);
    }

    protected final void t() {
        d.a(this, 0);
    }

    protected final int s() {
        if (!f()) {
            return 2;
        }
        int iA = a();
        d.a(this, iA);
        return iA;
    }

    public final int r() {
        return d.c(this);
    }

    public final void q() {
        d.b(this);
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public final a n() {
        return this.i;
    }

    public final BarrierStatus m() {
        return this.h;
    }

    public final String l() {
        return this.i.d();
    }

    public final String k() {
        return this.m;
    }

    public boolean j() {
        return i().g();
    }

    protected final boolean d(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    protected final boolean c(Context context, String str) {
        String strN = n().n();
        return !com.huawei.hms.kit.awareness.barrier.internal.f.c.a(strN) && context.getPackageManager().checkPermission(str, strN) == 0;
    }

    protected final boolean b(Context context, String str) {
        if (!com.huawei.hms.kit.awareness.barrier.internal.f.c.a(n().o()) || "android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return ContextCompat.checkSelfPermission(context, str) == 0;
        }
        return ContextCompat.checkSelfPermission(context, str) == 0;
    }

    protected final void b(long j2) {
        this.q = h.a() + j2;
        u();
        com.huawei.hms.kit.awareness.b.a.c.a(k, "barrier: {0}, nextTime: {1}", l(), Long.valueOf(this.q));
    }

    @Override // com.huawei.hms.kit.awareness.barrier.internal.e.b
    public final void b(int i) {
        n().a(i);
    }

    protected final boolean a(Context context, String str) {
        String strN = n().n();
        if (com.huawei.hms.kit.awareness.barrier.internal.f.c.a(strN)) {
            return false;
        }
        if (!com.huawei.hms.kit.awareness.barrier.internal.f.c.a(n().o()) || "android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return context.getPackageManager().checkPermission(str, strN) == 0;
        }
        return PermissionChecker.checkCallingPermission(context, str, strN) == 0;
    }

    public final void a(f fVar) {
        this.n = fVar;
    }

    public final void a(a aVar) {
        d.a(this, aVar);
    }

    public final void a(long j2) {
        this.q = j2;
    }

    protected final <T extends f> T a(Class<T> cls) {
        return cls.cast(this.n);
    }

    public final void B() {
        this.i.i().a(l(), 102);
    }

    public final String A() {
        return n().o();
    }

    public c(Parcel parcel) {
        parcel.readString();
    }

    public c() {
    }
}
