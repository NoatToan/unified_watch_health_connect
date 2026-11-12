package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import defpackage.g6i;
import defpackage.ha1;
import defpackage.m0m;
import defpackage.p5d;
import defpackage.q4d;
import defpackage.we3;
import defpackage.ye3;
import defpackage.ze3;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class n implements p5d, f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public we3 f1784b;
    public p5d.a c;

    @GuardedBy("mLock")
    public boolean d;

    @GuardedBy("mLock")
    public final p5d e;

    @GuardedBy("mLock")
    public p5d.a f;

    @GuardedBy("mLock")
    public Executor g;

    @GuardedBy("mLock")
    public final LongSparseArray<q4d> h;

    @GuardedBy("mLock")
    public final LongSparseArray<m> i;

    @GuardedBy("mLock")
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mLock")
    public final List<m> f1785k;

    @GuardedBy("mLock")
    public final List<m> l;

    public class a extends we3 {
        public a() {
        }

        @Override // defpackage.we3
        public void b(ye3 ye3Var) {
            super.b(ye3Var);
            n.this.s(ye3Var);
        }
    }

    public n(int i, int i2, int i3, int i4) {
        this(k(i, i2, i3, i4));
    }

    public static p5d k(int i, int i2, int i3, int i4) {
        return new ha1(ImageReader.newInstance(i, i2, i3, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$enqueueImageProxy$1(p5d.a aVar) {
        aVar.a(this);
    }

    @Override // defpackage.p5d
    public Surface a() {
        Surface surfaceA;
        synchronized (this.f1783a) {
            surfaceA = this.e.a();
        }
        return surfaceA;
    }

    @Override // defpackage.p5d
    public int b() {
        int iB;
        synchronized (this.f1783a) {
            iB = this.e.b();
        }
        return iB;
    }

    @Override // defpackage.p5d
    public int c() {
        int iC;
        synchronized (this.f1783a) {
            iC = this.e.c();
        }
        return iC;
    }

    @Override // defpackage.p5d
    public void close() {
        synchronized (this.f1783a) {
            try {
                if (this.d) {
                    return;
                }
                Iterator it = new ArrayList(this.f1785k).iterator();
                while (it.hasNext()) {
                    ((m) it.next()).close();
                }
                this.f1785k.clear();
                this.e.close();
                this.d = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p5d
    public void d(p5d.a aVar, Executor executor) {
        synchronized (this.f1783a) {
            this.f = (p5d.a) g6i.g(aVar);
            this.g = (Executor) g6i.g(executor);
            this.e.d(this.c, executor);
        }
    }

    @Override // defpackage.p5d
    public m e() {
        synchronized (this.f1783a) {
            try {
                if (this.f1785k.isEmpty()) {
                    return null;
                }
                if (this.j >= this.f1785k.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<m> list = this.f1785k;
                int i = this.j;
                this.j = i + 1;
                m mVar = list.get(i);
                this.l.add(mVar);
                return mVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.f.a
    public void f(m mVar) {
        synchronized (this.f1783a) {
            l(mVar);
        }
    }

    @Override // defpackage.p5d
    public m g() {
        synchronized (this.f1783a) {
            try {
                if (this.f1785k.isEmpty()) {
                    return null;
                }
                if (this.j >= this.f1785k.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.f1785k.size() - 1; i++) {
                    if (!this.l.contains(this.f1785k.get(i))) {
                        arrayList.add(this.f1785k.get(i));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).close();
                }
                int size = this.f1785k.size();
                List<m> list = this.f1785k;
                this.j = size;
                m mVar = list.get(size - 1);
                this.l.add(mVar);
                return mVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.p5d
    public int getHeight() {
        int height;
        synchronized (this.f1783a) {
            height = this.e.getHeight();
        }
        return height;
    }

    @Override // defpackage.p5d
    public int getWidth() {
        int width;
        synchronized (this.f1783a) {
            width = this.e.getWidth();
        }
        return width;
    }

    @Override // defpackage.p5d
    public void h() {
        synchronized (this.f1783a) {
            this.f = null;
            this.g = null;
        }
    }

    public final void l(m mVar) {
        synchronized (this.f1783a) {
            try {
                int iIndexOf = this.f1785k.indexOf(mVar);
                if (iIndexOf >= 0) {
                    this.f1785k.remove(iIndexOf);
                    int i = this.j;
                    if (iIndexOf <= i) {
                        this.j = i - 1;
                    }
                }
                this.l.remove(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(m0m m0mVar) {
        final p5d.a aVar;
        Executor executor;
        synchronized (this.f1783a) {
            try {
                if (this.f1785k.size() < c()) {
                    m0mVar.addOnImageCloseListener(this);
                    this.f1785k.add(m0mVar);
                    aVar = this.f;
                    executor = this.g;
                } else {
                    zpe.a("TAG", "Maximum image number reached.");
                    m0mVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: ltf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25419a.lambda$enqueueImageProxy$1(aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    public we3 n() {
        return this.f1784b;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void p(p5d p5dVar) {
        m mVarE;
        synchronized (this.f1783a) {
            if (this.d) {
                return;
            }
            int i = 0;
            do {
                try {
                    mVarE = p5dVar.e();
                    if (mVarE != null) {
                        i++;
                        this.i.put(mVarE.H().getTimestamp(), mVarE);
                        q();
                    }
                } catch (IllegalStateException e) {
                    zpe.b("MetadataImageReader", "Failed to acquire next image.", e);
                    mVarE = null;
                }
                if (mVarE == null) {
                    break;
                }
            } while (i < p5dVar.c());
        }
    }

    public final void q() {
        synchronized (this.f1783a) {
            try {
                for (int size = this.h.size() - 1; size >= 0; size--) {
                    q4d q4dVarValueAt = this.h.valueAt(size);
                    long timestamp = q4dVarValueAt.getTimestamp();
                    m mVar = this.i.get(timestamp);
                    if (mVar != null) {
                        this.i.remove(timestamp);
                        this.h.removeAt(size);
                        m(new m0m(mVar, q4dVarValueAt));
                    }
                }
                r();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        synchronized (this.f1783a) {
            try {
                if (this.i.size() != 0 && this.h.size() != 0) {
                    long jKeyAt = this.i.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.h.keyAt(0);
                    g6i.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.i.size() - 1; size >= 0; size--) {
                            if (this.i.keyAt(size) < jKeyAt2) {
                                this.i.valueAt(size).close();
                                this.i.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.h.size() - 1; size2 >= 0; size2--) {
                            if (this.h.keyAt(size2) < jKeyAt) {
                                this.h.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(ye3 ye3Var) {
        synchronized (this.f1783a) {
            try {
                if (this.d) {
                    return;
                }
                this.h.put(ye3Var.getTimestamp(), new ze3(ye3Var));
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n(p5d p5dVar) {
        this.f1783a = new Object();
        this.f1784b = new a();
        this.c = new p5d.a() { // from class: ktf
            @Override // p5d.a
            public final void a(p5d p5dVar2) {
                this.f24280a.p(p5dVar2);
            }
        };
        this.d = false;
        this.h = new LongSparseArray<>();
        this.i = new LongSparseArray<>();
        this.l = new ArrayList();
        this.e = p5dVar;
        this.j = 0;
        this.f1785k = new ArrayList(c());
    }
}
