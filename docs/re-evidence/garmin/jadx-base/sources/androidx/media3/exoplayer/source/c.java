package androidx.media3.exoplayer.source;

import android.os.Handler;
import androidx.media3.common.d0;
import fa.z;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import o62.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap<T, b<T>> f9435h = new HashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f9436i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ha.n f9437j;

    public final class a implements k, androidx.media3.exoplayer.drm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f9438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k.a f9439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.media3.exoplayer.drm.b.a f9440c;

        public a(T t7) {
            this.f9439b = c.this.l(null);
            this.f9440c = c.this.f9401d.g(0, null);
            this.f9438a = t7;
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void a(int i14, j.b bVar) {
            if (k(i14, bVar)) {
                this.f9440c.a();
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void b(int i14, j.b bVar) {
            if (k(i14, bVar)) {
                this.f9440c.f();
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void c(int i14, j.b bVar, sa.i iVar, sa.j jVar) {
            if (k(i14, bVar)) {
                k.a aVar = this.f9439b;
                sa.j jVarN = n(jVar, bVar);
                aVar.getClass();
                aVar.a(new sa.k(aVar, iVar, jVarN, 2));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void d(int i14, j.b bVar, sa.i iVar, sa.j jVar, IOException iOException, boolean z14) {
            if (k(i14, bVar)) {
                k.a aVar = this.f9439b;
                sa.j jVarN = n(jVar, bVar);
                aVar.getClass();
                aVar.a(new com.google.android.exoplayer2.analytics.n(aVar, iVar, jVarN, iOException, z14));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void e(int i14, j.b bVar, sa.j jVar) {
            if (k(i14, bVar)) {
                k.a aVar = this.f9439b;
                sa.j jVarN = n(jVar, bVar);
                aVar.getClass();
                aVar.a(new b0(12, aVar, jVarN));
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void f(int i14, j.b bVar) {
            if (k(i14, bVar)) {
                this.f9440c.c();
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void g(int i14, j.b bVar, sa.j jVar) {
            if (k(i14, bVar)) {
                k.a aVar = this.f9439b;
                sa.j jVarN = n(jVar, bVar);
                j.b bVar2 = aVar.f9525b;
                bVar2.getClass();
                aVar.a(new p62.e(aVar, 9, bVar2, jVarN));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void h(int i14, j.b bVar, sa.i iVar, sa.j jVar) {
            if (k(i14, bVar)) {
                k.a aVar = this.f9439b;
                sa.j jVarN = n(jVar, bVar);
                aVar.getClass();
                aVar.a(new sa.k(aVar, iVar, jVarN, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void i(int i14, j.b bVar, sa.i iVar, sa.j jVar) {
            if (k(i14, bVar)) {
                k.a aVar = this.f9439b;
                sa.j jVarN = n(jVar, bVar);
                aVar.getClass();
                aVar.a(new sa.k(aVar, iVar, jVarN, 0));
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void j(int i14, j.b bVar, int i15) {
            if (k(i14, bVar)) {
                this.f9440c.d(i15);
            }
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0023  */
        public final boolean k(int i14, j.b bVar) {
            j.b bVarS;
            T t7 = this.f9438a;
            c cVar = c.this;
            if (bVar != null) {
                bVarS = cVar.s(t7, bVar);
                if (bVarS == null) {
                    return false;
                }
            } else {
                bVarS = null;
            }
            int iU = cVar.u(t7, i14);
            k.a aVar = this.f9439b;
            if (aVar.f9524a == iU) {
                j.b bVar2 = aVar.f9525b;
                int i15 = z.f70071a;
                if (!Objects.equals(bVar2, bVarS)) {
                    this.f9439b = cVar.f9400c.g(iU, bVarS);
                }
            } else {
                this.f9439b = cVar.f9400c.g(iU, bVarS);
            }
            androidx.media3.exoplayer.drm.b.a aVar2 = this.f9440c;
            if (aVar2.f8894a == iU) {
                j.b bVar3 = aVar2.f8895b;
                int i16 = z.f70071a;
                if (Objects.equals(bVar3, bVarS)) {
                    return true;
                }
            }
            this.f9440c = cVar.f9401d.g(iU, bVarS);
            return true;
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void l(int i14, j.b bVar) {
            if (k(i14, bVar)) {
                this.f9440c.b();
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void m(int i14, j.b bVar, Exception exc) {
            if (k(i14, bVar)) {
                this.f9440c.e(exc);
            }
        }

        public final sa.j n(sa.j jVar, j.b bVar) {
            long j8 = jVar.f158123f;
            c cVar = c.this;
            T t7 = this.f9438a;
            long jT = cVar.t(t7, j8);
            long j14 = jVar.f158124g;
            long jT2 = cVar.t(t7, j14);
            return (jT == j8 && jT2 == j14) ? jVar : new sa.j(jVar.f158118a, jVar.f158119b, jVar.f158120c, jVar.f158121d, jVar.f158122e, jT, jT2);
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f9442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j.c f9443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c<T>.a f9444c;

        public b(j jVar, j.c cVar, c<T>.a aVar) {
            this.f9442a = jVar;
            this.f9443b = cVar;
            this.f9444c = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void m() {
        for (b<T> bVar : this.f9435h.values()) {
            bVar.f9442a.f(bVar.f9443b);
        }
    }

    @Override // androidx.media3.exoplayer.source.j
    public void maybeThrowSourceInfoRefreshError() {
        Iterator<b<T>> it = this.f9435h.values().iterator();
        while (it.hasNext()) {
            it.next().f9442a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void n() {
        for (b<T> bVar : this.f9435h.values()) {
            bVar.f9442a.e(bVar.f9443b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public void p(ha.n nVar) {
        this.f9437j = nVar;
        this.f9436i = z.m(null);
    }

    @Override // androidx.media3.exoplayer.source.a
    public void r() {
        HashMap<T, b<T>> map = this.f9435h;
        for (b<T> bVar : map.values()) {
            j jVar = bVar.f9442a;
            c<T>.a aVar = bVar.f9444c;
            j jVar2 = bVar.f9442a;
            jVar.b(bVar.f9443b);
            jVar2.i(aVar);
            jVar2.j(aVar);
        }
        map.clear();
    }

    public j.b s(T t7, j.b bVar) {
        return bVar;
    }

    public long t(Object obj, long j8) {
        return j8;
    }

    public int u(T t7, int i14) {
        return i14;
    }

    public abstract void v(Object obj, androidx.media3.exoplayer.source.a aVar, d0 d0Var);

    public final void w(final T t7, j jVar) {
        HashMap<T, b<T>> map = this.f9435h;
        fa.a.a(!map.containsKey(t7));
        j.c cVar = new j.c() { // from class: sa.b
            @Override // androidx.media3.exoplayer.source.j.c
            public final void a(androidx.media3.exoplayer.source.a aVar, d0 d0Var) {
                this.f158105a.v(t7, aVar, d0Var);
            }
        };
        a aVar = new a(t7);
        map.put(t7, new b<>(jVar, cVar, aVar));
        Handler handler = this.f9436i;
        handler.getClass();
        jVar.a(handler, aVar);
        Handler handler2 = this.f9436i;
        handler2.getClass();
        jVar.g(handler2, aVar);
        ha.n nVar = this.f9437j;
        ja.q qVar = this.f9404g;
        fa.a.f(qVar);
        jVar.d(cVar, nVar, qVar);
        if (this.f9399b.isEmpty()) {
            jVar.f(cVar);
        }
    }
}
