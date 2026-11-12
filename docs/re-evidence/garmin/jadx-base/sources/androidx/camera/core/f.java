package androidx.camera.core;

import a73.j;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.s;
import b0.a1;
import b0.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import k7.h;

/* JADX INFO: loaded from: classes.dex */
public class f implements o1, b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f5444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o1 f5446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o1.a f5447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Executor f5448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LongSparseArray<m0> f5449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LongSparseArray<e> f5450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f5452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f5453m;

    public class a extends s {
        public a() {
        }

        @Override // androidx.camera.core.impl.s
        public final void b(int i14, c0 c0Var) {
            f fVar = f.this;
            synchronized (fVar.f5441a) {
                try {
                    if (fVar.f5445e) {
                        return;
                    }
                    fVar.f5449i.put(c0Var.getTimestamp(), new m0.b(c0Var));
                    fVar.k();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public f(o1 o1Var) {
        this.f5441a = new Object();
        this.f5442b = new a();
        this.f5443c = 0;
        this.f5444d = new j(this, 29);
        this.f5445e = false;
        this.f5449i = new LongSparseArray<>();
        this.f5450j = new LongSparseArray<>();
        this.f5453m = new ArrayList();
        this.f5446f = o1Var;
        this.f5451k = 0;
        this.f5452l = new ArrayList(g());
    }

    @Override // androidx.camera.core.impl.o1
    public final e a() {
        synchronized (this.f5441a) {
            try {
                if (this.f5452l.isEmpty()) {
                    return null;
                }
                if (this.f5451k >= this.f5452l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = this.f5452l;
                int i14 = this.f5451k;
                this.f5451k = i14 + 1;
                e eVar = (e) arrayList.get(i14);
                this.f5453m.add(eVar);
                return eVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final e b() {
        synchronized (this.f5441a) {
            try {
                if (this.f5452l.isEmpty()) {
                    return null;
                }
                if (this.f5451k >= this.f5452l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < this.f5452l.size() - 1; i14++) {
                    if (!this.f5453m.contains(this.f5452l.get(i14))) {
                        arrayList.add((e) this.f5452l.get(i14));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).close();
                }
                int size = this.f5452l.size();
                ArrayList arrayList2 = this.f5452l;
                this.f5451k = size;
                e eVar = (e) arrayList2.get(size - 1);
                this.f5453m.add(eVar);
                return eVar;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void c() {
        synchronized (this.f5441a) {
            this.f5446f.c();
            this.f5447g = null;
            this.f5448h = null;
            this.f5443c = 0;
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void close() {
        synchronized (this.f5441a) {
            try {
                if (this.f5445e) {
                    return;
                }
                Iterator it = new ArrayList(this.f5452l).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).close();
                }
                this.f5452l.clear();
                this.f5446f.close();
                this.f5445e = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final void d(o1.a aVar, Executor executor) {
        synchronized (this.f5441a) {
            aVar.getClass();
            this.f5447g = aVar;
            executor.getClass();
            this.f5448h = executor;
            this.f5446f.d(this.f5444d, executor);
        }
    }

    @Override // androidx.camera.core.b.a
    public final void e(b bVar) {
        synchronized (this.f5441a) {
            h(bVar);
        }
    }

    @Override // androidx.camera.core.impl.o1
    public final int f() {
        int iF;
        synchronized (this.f5441a) {
            iF = this.f5446f.f();
        }
        return iF;
    }

    @Override // androidx.camera.core.impl.o1
    public final int g() {
        int iG;
        synchronized (this.f5441a) {
            iG = this.f5446f.g();
        }
        return iG;
    }

    @Override // androidx.camera.core.impl.o1
    public final int getHeight() {
        int height;
        synchronized (this.f5441a) {
            height = this.f5446f.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.o1
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f5441a) {
            surface = this.f5446f.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.o1
    public final int getWidth() {
        int width;
        synchronized (this.f5441a) {
            width = this.f5446f.getWidth();
        }
        return width;
    }

    public final void h(b bVar) {
        synchronized (this.f5441a) {
            try {
                int iIndexOf = this.f5452l.indexOf(bVar);
                if (iIndexOf >= 0) {
                    this.f5452l.remove(iIndexOf);
                    int i14 = this.f5451k;
                    if (iIndexOf <= i14) {
                        this.f5451k = i14 - 1;
                    }
                }
                this.f5453m.remove(bVar);
                if (this.f5443c > 0) {
                    j(this.f5446f);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void i(a1 a1Var) {
        o1.a aVar;
        Executor executor;
        synchronized (this.f5441a) {
            try {
                if (this.f5452l.size() < g()) {
                    a1Var.a(this);
                    this.f5452l.add(a1Var);
                    aVar = this.f5447g;
                    executor = this.f5448h;
                } else {
                    a1Var.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new ab.j(19, this, aVar));
            } else {
                aVar.a(this);
            }
        }
    }

    public final void j(o1 o1Var) {
        e eVarA;
        synchronized (this.f5441a) {
            try {
                if (this.f5445e) {
                    return;
                }
                int size = this.f5450j.size() + this.f5452l.size();
                if (size >= o1Var.g()) {
                    return;
                }
                do {
                    try {
                        eVarA = o1Var.a();
                        if (eVarA != null) {
                            this.f5443c--;
                            size++;
                            this.f5450j.put(eVarA.A0().getTimestamp(), eVarA);
                            k();
                        }
                    } catch (IllegalStateException unused) {
                        eVarA = null;
                    }
                    if (eVarA == null || this.f5443c <= 0) {
                        break;
                    }
                } while (size < o1Var.g());
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k() {
        synchronized (this.f5441a) {
            try {
                for (int size = this.f5449i.size() - 1; size >= 0; size--) {
                    m0 m0VarValueAt = this.f5449i.valueAt(size);
                    long timestamp = m0VarValueAt.getTimestamp();
                    e eVar = this.f5450j.get(timestamp);
                    if (eVar != null) {
                        this.f5450j.remove(timestamp);
                        this.f5449i.removeAt(size);
                        i(new a1(eVar, m0VarValueAt));
                    }
                }
                l();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void l() {
        synchronized (this.f5441a) {
            try {
                if (this.f5450j.size() != 0 && this.f5449i.size() != 0) {
                    long jKeyAt = this.f5450j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f5449i.keyAt(0);
                    h.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f5450j.size() - 1; size >= 0; size--) {
                            if (this.f5450j.keyAt(size) < jKeyAt2) {
                                this.f5450j.valueAt(size).close();
                                this.f5450j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f5449i.size() - 1; size2 >= 0; size2--) {
                            if (this.f5449i.keyAt(size2) < jKeyAt) {
                                this.f5449i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public f(int i14, int i15, int i16, int i17) {
        this(new b0.b(ImageReader.newInstance(i14, i15, i16, i17)));
    }
}
