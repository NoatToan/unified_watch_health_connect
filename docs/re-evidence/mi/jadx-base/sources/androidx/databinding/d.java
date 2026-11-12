package androidx.databinding;

import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes.dex */
public class d extends c<f.a, f, b> {
    public static final Pools.SynchronizedPool<b> f = new Pools.SynchronizedPool<>(10);
    public static final c.a<f.a, f, b> g = new a();

    public class a extends c.a<f.a, f, b> {
        @Override // androidx.databinding.c.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f.a aVar, f fVar, int i, b bVar) {
            if (i == 1) {
                aVar.onItemRangeChanged(fVar, bVar.f2152a, bVar.f2153b);
                return;
            }
            if (i == 2) {
                aVar.onItemRangeInserted(fVar, bVar.f2152a, bVar.f2153b);
                return;
            }
            if (i == 3) {
                aVar.onItemRangeMoved(fVar, bVar.f2152a, bVar.c, bVar.f2153b);
            } else if (i != 4) {
                aVar.onChanged(fVar);
            } else {
                aVar.onItemRangeRemoved(fVar, bVar.f2152a, bVar.f2153b);
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2153b;
        public int c;
    }

    public d() {
        super(g);
    }

    public static b l(int i, int i2, int i3) {
        b bVarAcquire = f.acquire();
        if (bVarAcquire == null) {
            bVarAcquire = new b();
        }
        bVarAcquire.f2152a = i;
        bVarAcquire.c = i2;
        bVarAcquire.f2153b = i3;
        return bVarAcquire;
    }

    @Override // androidx.databinding.c
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public synchronized void d(f fVar, int i, b bVar) {
        super.d(fVar, i, bVar);
        if (bVar != null) {
            f.release(bVar);
        }
    }

    public void p(f fVar) {
        d(fVar, 0, null);
    }

    public void q(f fVar, int i, int i2) {
        d(fVar, 1, l(i, 0, i2));
    }

    public void r(f fVar, int i, int i2) {
        d(fVar, 2, l(i, 0, i2));
    }

    public void s(f fVar, int i, int i2, int i3) {
        d(fVar, 3, l(i, i2, i3));
    }

    public void t(f fVar, int i, int i2) {
        d(fVar, 4, l(i, 0, i2));
    }
}
