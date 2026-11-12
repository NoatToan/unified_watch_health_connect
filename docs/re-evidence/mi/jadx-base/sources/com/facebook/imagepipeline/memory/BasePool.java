package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.memory.MemoryTrimType;
import defpackage.b6i;
import defpackage.cm8;
import defpackage.f3i;
import defpackage.i0m;
import defpackage.j3i;
import defpackage.k3i;
import defpackage.r53;
import defpackage.spf;
import defpackage.wdp;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BasePool<V> implements f3i<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<?> f7112a = getClass();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final spf f7113b;
    public final j3i c;
    public final SparseArray<r53<V>> d;
    public final Set<V> e;
    public boolean f;
    public final a g;
    public final a h;
    public final k3i i;

    public static class InvalidSizeException extends RuntimeException {
        public InvalidSizeException(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class InvalidValueException extends RuntimeException {
        public InvalidValueException(Object obj) {
            super("Invalid value: " + obj.toString());
        }
    }

    public static class PoolSizeViolationException extends RuntimeException {
        public PoolSizeViolationException(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    public static class SizeTooLargeException extends InvalidSizeException {
        public SizeTooLargeException(Object obj) {
            super(obj);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7115b;

        public void a(int i) {
            int i2;
            int i3 = this.f7115b;
            if (i3 < i || (i2 = this.f7114a) <= 0) {
                cm8.I("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f7115b), Integer.valueOf(this.f7114a));
            } else {
                this.f7114a = i2 - 1;
                this.f7115b = i3 - i;
            }
        }

        public void b(int i) {
            this.f7114a++;
            this.f7115b += i;
        }

        public void c() {
            this.f7114a = 0;
            this.f7115b = 0;
        }
    }

    public BasePool(spf spfVar, j3i j3iVar, k3i k3iVar) {
        this.f7113b = (spf) b6i.g(spfVar);
        j3i j3iVar2 = (j3i) b6i.g(j3iVar);
        this.c = j3iVar2;
        this.i = (k3i) b6i.g(k3iVar);
        this.d = new SparseArray<>();
        if (j3iVar2.f) {
            m();
        } else {
            q(new SparseIntArray(0));
        }
        this.e = i0m.b();
        this.h = new a();
        this.g = new a();
    }

    public abstract V a(int i);

    public synchronized boolean b(int i) {
        j3i j3iVar = this.c;
        int i2 = j3iVar.f22380a;
        int i3 = this.g.f7115b;
        if (i > i2 - i3) {
            this.i.c();
            return false;
        }
        int i4 = j3iVar.f22381b;
        if (i > i4 - (i3 + this.h.f7115b)) {
            w(i4 - i);
        }
        if (i <= i2 - (this.g.f7115b + this.h.f7115b)) {
            return true;
        }
        this.i.c();
        return false;
    }

    public final synchronized void c() {
        try {
            b6i.i(!o() || this.h.f7115b == 0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.rpf
    public void d(MemoryTrimType memoryTrimType) {
        v();
    }

    public final void e(SparseIntArray sparseIntArray) {
        this.d.clear();
        for (int i = 0; i < sparseIntArray.size(); i++) {
            int iKeyAt = sparseIntArray.keyAt(i);
            this.d.put(iKeyAt, new r53<>(k(iKeyAt), sparseIntArray.valueAt(i), 0, this.c.f));
        }
    }

    public abstract void f(V v);

    public synchronized r53<V> g(int i) {
        try {
            r53<V> r53Var = this.d.get(i);
            if (r53Var == null && this.f) {
                if (cm8.o(2)) {
                    cm8.r(this.f7112a, "creating new bucket %s", Integer.valueOf(i));
                }
                r53<V> r53VarS = s(i);
                this.d.put(i, r53VarS);
                return r53VarS;
            }
            return r53Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.f3i
    public V get(int i) throws Throwable {
        V vA;
        V vL;
        c();
        int i2 = i(i);
        synchronized (this) {
            try {
                r53<V> r53VarG = g(i2);
                if (r53VarG != null && (vL = l(r53VarG)) != null) {
                    b6i.i(this.e.add(vL));
                    int iJ = j(vL);
                    int iK = k(iJ);
                    this.g.b(iK);
                    this.h.a(iK);
                    this.i.b(iK);
                    r();
                    if (cm8.o(2)) {
                        cm8.s(this.f7112a, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vL)), Integer.valueOf(iJ));
                    }
                    return vL;
                }
                int iK2 = k(i2);
                if (!b(iK2)) {
                    throw new PoolSizeViolationException(this.c.f22380a, this.g.f7115b, this.h.f7115b, iK2);
                }
                this.g.b(iK2);
                if (r53VarG != null) {
                    r53VarG.f();
                }
                try {
                    vA = a(i2);
                } catch (Throwable th) {
                    synchronized (this) {
                        try {
                            this.g.a(iK2);
                            r53<V> r53VarG2 = g(i2);
                            if (r53VarG2 != null) {
                                r53VarG2.b();
                            }
                            wdp.c(th);
                            vA = null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                synchronized (this) {
                    try {
                        b6i.i(this.e.add(vA));
                        x();
                        this.i.a(iK2);
                        r();
                        if (cm8.o(2)) {
                            cm8.s(this.f7112a, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(vA)), Integer.valueOf(i2));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return vA;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final synchronized r53<V> h(int i) {
        return this.d.get(i);
    }

    public abstract int i(int i);

    public abstract int j(V v);

    public abstract int k(int i);

    public synchronized V l(r53<V> r53Var) {
        return r53Var.c();
    }

    public final synchronized void m() {
        try {
            SparseIntArray sparseIntArray = this.c.c;
            if (sparseIntArray != null) {
                e(sparseIntArray);
                this.f = false;
            } else {
                this.f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void n() {
        this.f7113b.registerMemoryTrimmable(this);
        this.i.g(this);
    }

    public synchronized boolean o() {
        boolean z;
        z = this.g.f7115b + this.h.f7115b > this.c.f22381b;
        if (z) {
            this.i.d();
        }
        return z;
    }

    public boolean p(V v) {
        b6i.g(v);
        return true;
    }

    public final synchronized void q(SparseIntArray sparseIntArray) {
        try {
            b6i.g(sparseIntArray);
            this.d.clear();
            SparseIntArray sparseIntArray2 = this.c.c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int iKeyAt = sparseIntArray2.keyAt(i);
                    this.d.put(iKeyAt, new r53<>(k(iKeyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(iKeyAt, 0), this.c.f));
                }
                this.f = false;
            } else {
                this.f = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    public final void r() {
        if (cm8.o(2)) {
            cm8.u(this.f7112a, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.g.f7114a), Integer.valueOf(this.g.f7115b), Integer.valueOf(this.h.f7114a), Integer.valueOf(this.h.f7115b));
        }
    }

    @Override // defpackage.f3i, defpackage.frk
    public void release(V v) {
        b6i.g(v);
        int iJ = j(v);
        int iK = k(iJ);
        synchronized (this) {
            try {
                r53<V> r53VarH = h(iJ);
                if (!this.e.remove(v)) {
                    cm8.g(this.f7112a, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iJ));
                    f(v);
                    this.i.e(iK);
                } else if (r53VarH == null || r53VarH.g() || o() || !p(v)) {
                    if (r53VarH != null) {
                        r53VarH.b();
                    }
                    if (cm8.o(2)) {
                        cm8.s(this.f7112a, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iJ));
                    }
                    f(v);
                    this.g.a(iK);
                    this.i.e(iK);
                } else {
                    r53VarH.i(v);
                    this.h.b(iK);
                    this.g.a(iK);
                    this.i.f(iK);
                    if (cm8.o(2)) {
                        cm8.s(this.f7112a, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(iJ));
                    }
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public r53<V> s(int i) {
        return new r53<>(k(i), Integer.MAX_VALUE, 0, this.c.f);
    }

    public void t() {
    }

    public final List<r53<V>> u() {
        ArrayList arrayList = new ArrayList(this.d.size());
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            r53<V> r53VarValueAt = this.d.valueAt(i);
            int i2 = r53VarValueAt.f32195a;
            int i3 = r53VarValueAt.f32196b;
            int iE = r53VarValueAt.e();
            if (r53VarValueAt.d() > 0) {
                arrayList.add(r53VarValueAt);
            }
            this.d.setValueAt(i, new r53<>(k(i2), i3, iE, this.c.f));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void v() {
        int i;
        List arrayList;
        synchronized (this) {
            try {
                if (this.c.f) {
                    arrayList = u();
                } else {
                    arrayList = new ArrayList(this.d.size());
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    for (int i2 = 0; i2 < this.d.size(); i2++) {
                        r53<V> r53VarValueAt = this.d.valueAt(i2);
                        if (r53VarValueAt.d() > 0) {
                            arrayList.add(r53VarValueAt);
                        }
                        sparseIntArray.put(this.d.keyAt(i2), r53VarValueAt.e());
                    }
                    q(sparseIntArray);
                }
                this.h.c();
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
        t();
        for (i = 0; i < arrayList.size(); i++) {
            r53 r53Var = (r53) arrayList.get(i);
            while (true) {
                Object objH = r53Var.h();
                if (objH == null) {
                    break;
                } else {
                    f(objH);
                }
            }
        }
    }

    public synchronized void w(int i) {
        try {
            int i2 = this.g.f7115b;
            int i3 = this.h.f7115b;
            int iMin = Math.min((i2 + i3) - i, i3);
            if (iMin <= 0) {
                return;
            }
            if (cm8.o(2)) {
                cm8.t(this.f7112a, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.g.f7115b + this.h.f7115b), Integer.valueOf(iMin));
            }
            r();
            for (int i4 = 0; i4 < this.d.size() && iMin > 0; i4++) {
                r53<V> r53VarValueAt = this.d.valueAt(i4);
                while (iMin > 0) {
                    V vH = r53VarValueAt.h();
                    if (vH == null) {
                        break;
                    }
                    f(vH);
                    int i5 = r53VarValueAt.f32195a;
                    iMin -= i5;
                    this.h.a(i5);
                }
            }
            r();
            if (cm8.o(2)) {
                cm8.s(this.f7112a, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.g.f7115b + this.h.f7115b));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void x() {
        if (o()) {
            w(this.c.f22381b);
        }
    }
}
