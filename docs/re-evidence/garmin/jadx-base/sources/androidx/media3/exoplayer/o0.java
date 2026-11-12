package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ja.q f9293a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f9297e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ja.a f9300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final fa.i f9301i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ha.n f9304l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.media3.exoplayer.source.t f9302j = new androidx.media3.exoplayer.source.t.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<androidx.media3.exoplayer.source.i, c> f9295c = new IdentityHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f9296d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9294b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<c, b> f9298f = new HashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashSet f9299g = new HashSet();

    public final class a implements androidx.media3.exoplayer.source.k, androidx.media3.exoplayer.drm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f9305a;

        public a(c cVar) {
            this.f9305a = cVar;
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void a(int i14, androidx.media3.exoplayer.source.j.b bVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new l0(this, pairK, 0));
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void b(int i14, androidx.media3.exoplayer.source.j.b bVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new l0(this, pairK, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void c(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new m0(this, pairK, iVar, jVar, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void d(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar, IOException iOException, boolean z14) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new n0(this, pairK, iVar, jVar, iOException, z14, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void e(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.j jVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new k0(this, pairK, jVar, 1));
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void f(int i14, androidx.media3.exoplayer.source.j.b bVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new l0(this, pairK, 3));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void g(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.j jVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new k0(this, pairK, jVar, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void h(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new m0(this, pairK, iVar, jVar, 2));
            }
        }

        @Override // androidx.media3.exoplayer.source.k
        public final void i(int i14, androidx.media3.exoplayer.source.j.b bVar, sa.i iVar, sa.j jVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new m0(this, pairK, iVar, jVar, 1));
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void j(int i14, androidx.media3.exoplayer.source.j.b bVar, int i15) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new androidx.camera.camera2.internal.compat.j(this, pairK, i15, 1));
            }
        }

        public final Pair<Integer, androidx.media3.exoplayer.source.j.b> k(int i14, androidx.media3.exoplayer.source.j.b bVar) {
            androidx.media3.exoplayer.source.j.b bVarA;
            c cVar = this.f9305a;
            androidx.media3.exoplayer.source.j.b bVar2 = null;
            if (bVar != null) {
                int i15 = 0;
                while (true) {
                    if (i15 >= cVar.f9312c.size()) {
                        bVarA = null;
                        break;
                    }
                    if (((androidx.media3.exoplayer.source.j.b) cVar.f9312c.get(i15)).f9522d == bVar.f9522d) {
                        Object obj = bVar.f9519a;
                        Object obj2 = cVar.f9311b;
                        int i16 = androidx.media3.exoplayer.a.f8662e;
                        bVarA = bVar.a(Pair.create(obj2, obj));
                        break;
                    }
                    i15++;
                }
                if (bVarA == null) {
                    return null;
                }
                bVar2 = bVarA;
            }
            return Pair.create(Integer.valueOf(i14 + cVar.f9313d), bVar2);
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void l(int i14, androidx.media3.exoplayer.source.j.b bVar) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new l0(this, pairK, 2));
            }
        }

        @Override // androidx.media3.exoplayer.drm.b
        public final void m(int i14, androidx.media3.exoplayer.source.j.b bVar, Exception exc) {
            Pair<Integer, androidx.media3.exoplayer.source.j.b> pairK = k(i14, bVar);
            if (pairK != null) {
                o0.this.f9301i.post(new a8.d(this, 8, pairK, exc));
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j f9307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.j.c f9308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f9309c;

        public b(androidx.media3.exoplayer.source.j jVar, androidx.media3.exoplayer.source.j.c cVar, a aVar) {
            this.f9307a = jVar;
            this.f9308b = cVar;
            this.f9309c = aVar;
        }
    }

    public static final class c implements i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.h f9310a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f9314e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f9312c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9311b = new Object();

        public c(androidx.media3.exoplayer.source.j jVar, boolean z14) {
            this.f9310a = new androidx.media3.exoplayer.source.h(jVar, z14);
        }

        @Override // androidx.media3.exoplayer.i0
        public final androidx.media3.common.d0 getTimeline() {
            return this.f9310a.f9510o;
        }

        @Override // androidx.media3.exoplayer.i0
        public final Object getUid() {
            return this.f9311b;
        }
    }

    public interface d {
    }

    public o0(d dVar, ja.a aVar, fa.i iVar, ja.q qVar) {
        this.f9293a = qVar;
        this.f9297e = dVar;
        this.f9300h = aVar;
        this.f9301i = iVar;
    }

    public final androidx.media3.common.d0 a(int i14, List<c> list, androidx.media3.exoplayer.source.t tVar) {
        if (!list.isEmpty()) {
            this.f9302j = tVar;
            for (int i15 = i14; i15 < list.size() + i14; i15++) {
                c cVar = list.get(i15 - i14);
                ArrayList arrayList = this.f9294b;
                if (i15 > 0) {
                    c cVar2 = (c) arrayList.get(i15 - 1);
                    cVar.f9313d = cVar2.f9310a.f9510o.f158114b.o() + cVar2.f9313d;
                    cVar.f9314e = false;
                    cVar.f9312c.clear();
                } else {
                    cVar.f9313d = 0;
                    cVar.f9314e = false;
                    cVar.f9312c.clear();
                }
                int iO = cVar.f9310a.f9510o.f158114b.o();
                for (int i16 = i15; i16 < arrayList.size(); i16++) {
                    ((c) arrayList.get(i16)).f9313d += iO;
                }
                arrayList.add(i15, cVar);
                this.f9296d.put(cVar.f9311b, cVar);
                if (this.f9303k) {
                    e(cVar);
                    if (this.f9295c.isEmpty()) {
                        this.f9299g.add(cVar);
                    } else {
                        b bVar = this.f9298f.get(cVar);
                        if (bVar != null) {
                            bVar.f9307a.f(bVar.f9308b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final androidx.media3.common.d0 b() {
        ArrayList arrayList = this.f9294b;
        if (arrayList.isEmpty()) {
            return androidx.media3.common.d0.f8186a;
        }
        int iO = 0;
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            c cVar = (c) arrayList.get(i14);
            cVar.f9313d = iO;
            iO += cVar.f9310a.f9510o.f158114b.o();
        }
        return new s0(arrayList, this.f9302j);
    }

    public final void c() {
        Iterator it = this.f9299g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f9312c.isEmpty()) {
                b bVar = this.f9298f.get(cVar);
                if (bVar != null) {
                    bVar.f9307a.f(bVar.f9308b);
                }
                it.remove();
            }
        }
    }

    public final void d(c cVar) {
        if (cVar.f9314e && cVar.f9312c.isEmpty()) {
            b bVarRemove = this.f9298f.remove(cVar);
            bVarRemove.getClass();
            a aVar = bVarRemove.f9309c;
            androidx.media3.exoplayer.source.j jVar = bVarRemove.f9307a;
            jVar.b(bVarRemove.f9308b);
            jVar.i(aVar);
            jVar.j(aVar);
            this.f9299g.remove(cVar);
        }
    }

    public final void e(c cVar) {
        androidx.media3.exoplayer.source.h hVar = cVar.f9310a;
        androidx.media3.exoplayer.source.j.c cVar2 = new androidx.media3.exoplayer.source.j.c() { // from class: androidx.media3.exoplayer.j0
            @Override // androidx.media3.exoplayer.source.j.c
            public final void a(androidx.media3.exoplayer.source.a aVar, androidx.media3.common.d0 d0Var) {
                fa.i iVar = ((z) this.f9184a.f9297e).f9893i;
                iVar.removeMessages(2);
                iVar.sendEmptyMessage(22);
            }
        };
        a aVar = new a(cVar);
        this.f9298f.put(cVar, new b(hVar, cVar2, aVar));
        int i14 = fa.z.f70071a;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        hVar.a(new Handler(looperMyLooper, null), aVar);
        Looper looperMyLooper2 = Looper.myLooper();
        if (looperMyLooper2 == null) {
            looperMyLooper2 = Looper.getMainLooper();
        }
        hVar.g(new Handler(looperMyLooper2, null), aVar);
        hVar.d(cVar2, this.f9304l, this.f9293a);
    }

    public final void f(androidx.media3.exoplayer.source.i iVar) {
        IdentityHashMap<androidx.media3.exoplayer.source.i, c> identityHashMap = this.f9295c;
        c cVarRemove = identityHashMap.remove(iVar);
        cVarRemove.getClass();
        cVarRemove.f9310a.h(iVar);
        cVarRemove.f9312c.remove(((androidx.media3.exoplayer.source.g) iVar).f9498a);
        if (!identityHashMap.isEmpty()) {
            c();
        }
        d(cVarRemove);
    }

    public final void g(int i14, int i15) {
        for (int i16 = i15 - 1; i16 >= i14; i16--) {
            ArrayList arrayList = this.f9294b;
            c cVar = (c) arrayList.remove(i16);
            this.f9296d.remove(cVar.f9311b);
            int i17 = -cVar.f9310a.f9510o.f158114b.o();
            for (int i18 = i16; i18 < arrayList.size(); i18++) {
                ((c) arrayList.get(i18)).f9313d += i17;
            }
            cVar.f9314e = true;
            if (this.f9303k) {
                d(cVar);
            }
        }
    }
}
