package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.d0;
import fa.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class d extends androidx.media3.exoplayer.source.c<e> {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final androidx.media3.common.t f9445w;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f9446k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final HashSet f9447l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Handler f9448m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9449n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final IdentityHashMap<i, e> f9450o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HashMap f9451p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final HashSet f9452q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9453r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f9454s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9455t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HashSet f9456u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public t f9457v;

    public static final class b extends androidx.media3.exoplayer.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f9458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9459g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int[] f9460h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int[] f9461i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final d0[] f9462j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Object[] f9463k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final HashMap<Object, Integer> f9464l;

        public b(Collection<e> collection, t tVar, boolean z14) {
            super(z14, tVar);
            int size = collection.size();
            this.f9460h = new int[size];
            this.f9461i = new int[size];
            this.f9462j = new d0[size];
            this.f9463k = new Object[size];
            this.f9464l = new HashMap<>();
            int iO = 0;
            int iH = 0;
            int i14 = 0;
            for (e eVar : collection) {
                d0[] d0VarArr = this.f9462j;
                h.a aVar = eVar.f9467a.f9510o;
                d0VarArr[i14] = aVar;
                this.f9461i[i14] = iO;
                this.f9460h[i14] = iH;
                iO += aVar.o();
                iH += this.f9462j[i14].h();
                Object[] objArr = this.f9463k;
                Object obj = eVar.f9468b;
                objArr[i14] = obj;
                this.f9464l.put(obj, Integer.valueOf(i14));
                i14++;
            }
            this.f9458f = iO;
            this.f9459g = iH;
        }

        @Override // androidx.media3.common.d0
        public final int h() {
            return this.f9459g;
        }

        @Override // androidx.media3.common.d0
        public final int o() {
            return this.f9458f;
        }

        @Override // androidx.media3.exoplayer.a
        public final int q(Object obj) {
            Integer num = this.f9464l.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.exoplayer.a
        public final int r(int i14) {
            return z.d(this.f9460h, i14 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.a
        public final int s(int i14) {
            return z.d(this.f9461i, i14 + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.a
        public final Object t(int i14) {
            return this.f9463k[i14];
        }

        @Override // androidx.media3.exoplayer.a
        public final int u(int i14) {
            return this.f9460h[i14];
        }

        @Override // androidx.media3.exoplayer.a
        public final int v(int i14) {
            return this.f9461i[i14];
        }

        @Override // androidx.media3.exoplayer.a
        public final d0 x(int i14) {
            return this.f9462j[i14];
        }
    }

    public static final class c extends androidx.media3.exoplayer.source.a {
        private c() {
        }

        @Override // androidx.media3.exoplayer.source.j
        public final i c(j.b bVar, xa.b bVar2, long j8) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.j
        public final androidx.media3.common.t getMediaItem() {
            return d.f9445w;
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void h(i iVar) {
        }

        @Override // androidx.media3.exoplayer.source.j
        public final void maybeThrowSourceInfoRefreshError() {
        }

        @Override // androidx.media3.exoplayer.source.a
        public final void p(ha.n nVar) {
        }

        @Override // androidx.media3.exoplayer.source.a
        public final void r() {
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.source.d$d, reason: collision with other inner class name */
    public static final class C0127d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f9465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f9466b;

        public C0127d(Handler handler, Runnable runnable) {
            this.f9465a = handler;
            this.f9466b = runnable;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f9467a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f9472f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f9469c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f9468b = new Object();

        public e(j jVar, boolean z14) {
            this.f9467a = new h(jVar, z14);
        }
    }

    public static final class f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final T f9474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0127d f9475c;

        public f(int i14, T t7, C0127d c0127d) {
            this.f9473a = i14;
            this.f9474b = t7;
            this.f9475c = c0127d;
        }
    }

    static {
        androidx.media3.common.t.c cVar = new androidx.media3.common.t.c();
        cVar.f8447b = Uri.EMPTY;
        f9445w = cVar.a();
    }

    public d(boolean z14, boolean z15, t tVar, j... jVarArr) {
        for (j jVar : jVarArr) {
            jVar.getClass();
        }
        this.f9457v = tVar.getLength() > 0 ? tVar.cloneAndClear() : tVar;
        this.f9450o = new IdentityHashMap<>();
        this.f9451p = new HashMap();
        ArrayList arrayList = new ArrayList();
        this.f9446k = arrayList;
        this.f9449n = new ArrayList();
        this.f9456u = new HashSet();
        this.f9447l = new HashSet();
        this.f9452q = new HashSet();
        this.f9453r = z14;
        this.f9454s = z15;
        List listAsList = Arrays.asList(jVarArr);
        synchronized (this) {
            y(arrayList.size(), listAsList);
        }
    }

    public final void A() {
        Iterator it = this.f9452q.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.f9469c.isEmpty()) {
                androidx.media3.exoplayer.source.c.b bVar = (androidx.media3.exoplayer.source.c.b) this.f9435h.get(eVar);
                bVar.getClass();
                bVar.f9442a.f(bVar.f9443b);
                it.remove();
            }
        }
    }

    public final synchronized void B(Set<C0127d> set) {
        try {
            for (C0127d c0127d : set) {
                c0127d.f9465a.post(c0127d.f9466b);
            }
            this.f9447l.removeAll(set);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void C(C0127d c0127d) {
        if (!this.f9455t) {
            Handler handler = this.f9448m;
            handler.getClass();
            handler.obtainMessage(5).sendToTarget();
            this.f9455t = true;
        }
        if (c0127d != null) {
            this.f9456u.add(c0127d);
        }
    }

    public final void D() {
        this.f9455t = false;
        HashSet hashSet = this.f9456u;
        this.f9456u = new HashSet();
        q(new b(this.f9449n, this.f9457v, this.f9453r));
        Handler handler = this.f9448m;
        handler.getClass();
        handler.obtainMessage(6, hashSet).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.source.j
    public final i c(j.b bVar, xa.b bVar2, long j8) {
        Object obj = bVar.f9519a;
        int i14 = androidx.media3.exoplayer.a.f8662e;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        j.b bVarA = bVar.a(pair.second);
        e eVar = (e) this.f9451p.get(obj2);
        if (eVar == null) {
            eVar = new e(new c(), this.f9454s);
            eVar.f9472f = true;
            w(eVar, eVar.f9467a);
        }
        this.f9452q.add(eVar);
        androidx.media3.exoplayer.source.c.b bVar3 = (androidx.media3.exoplayer.source.c.b) this.f9435h.get(eVar);
        bVar3.getClass();
        bVar3.f9442a.e(bVar3.f9443b);
        eVar.f9469c.add(bVarA);
        g gVarZ = eVar.f9467a.c(bVarA, bVar2, j8);
        this.f9450o.put(gVarZ, eVar);
        A();
        return gVarZ;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final synchronized d0 getInitialTimeline() {
        t tVarCloneAndInsert;
        try {
            int length = this.f9457v.getLength();
            int size = this.f9446k.size();
            tVarCloneAndInsert = this.f9457v;
            if (length != size) {
                tVarCloneAndInsert = tVarCloneAndInsert.cloneAndClear().cloneAndInsert(0, this.f9446k.size());
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return new b(this.f9446k, tVarCloneAndInsert, this.f9453r);
    }

    @Override // androidx.media3.exoplayer.source.j
    public final androidx.media3.common.t getMediaItem() {
        return f9445w;
    }

    @Override // androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        IdentityHashMap<i, e> identityHashMap = this.f9450o;
        e eVarRemove = identityHashMap.remove(iVar);
        eVarRemove.getClass();
        eVarRemove.f9467a.h(iVar);
        ArrayList arrayList = eVarRemove.f9469c;
        arrayList.remove(((g) iVar).f9498a);
        if (!identityHashMap.isEmpty()) {
            A();
        }
        if (eVarRemove.f9472f && arrayList.isEmpty()) {
            this.f9452q.remove(eVarRemove);
            androidx.media3.exoplayer.source.c.b bVar = (androidx.media3.exoplayer.source.c.b) this.f9435h.remove(eVarRemove);
            bVar.getClass();
            j jVar = bVar.f9442a;
            jVar.b(bVar.f9443b);
            androidx.media3.exoplayer.source.c<T>.a aVar = bVar.f9444c;
            jVar.i(aVar);
            jVar.j(aVar);
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void m() {
        super.m();
        this.f9452q.clear();
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void n() {
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final synchronized void p(ha.n nVar) {
        try {
            super.p(nVar);
            this.f9448m = new Handler(new com.google.android.exoplayer2.util.a(this, 2));
            if (this.f9446k.isEmpty()) {
                D();
            } else {
                this.f9457v = this.f9457v.cloneAndInsert(0, this.f9446k.size());
                x(0, this.f9446k);
                C(null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final synchronized void r() {
        try {
            super.r();
            this.f9449n.clear();
            this.f9452q.clear();
            this.f9451p.clear();
            this.f9457v = this.f9457v.cloneAndClear();
            Handler handler = this.f9448m;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f9448m = null;
            }
            this.f9455t = false;
            this.f9456u.clear();
            B(this.f9447l);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // androidx.media3.exoplayer.source.c
    public final j.b s(e eVar, j.b bVar) {
        e eVar2 = eVar;
        for (int i14 = 0; i14 < eVar2.f9469c.size(); i14++) {
            if (((j.b) eVar2.f9469c.get(i14)).f9522d == bVar.f9522d) {
                Object obj = bVar.f9519a;
                Object obj2 = eVar2.f9468b;
                int i15 = androidx.media3.exoplayer.a.f8662e;
                return bVar.a(Pair.create(obj2, obj));
            }
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final int u(e eVar, int i14) {
        return i14 + eVar.f9471e;
    }

    @Override // androidx.media3.exoplayer.source.c
    public final void v(Object obj, androidx.media3.exoplayer.source.a aVar, d0 d0Var) {
        e eVar = (e) obj;
        int i14 = eVar.f9470d + 1;
        ArrayList arrayList = this.f9449n;
        if (i14 < arrayList.size()) {
            int iO = d0Var.o() - (((e) arrayList.get(eVar.f9470d + 1)).f9471e - eVar.f9471e);
            if (iO != 0) {
                z(eVar.f9470d + 1, 0, iO);
            }
        }
        C(null);
    }

    public final void x(int i14, Collection<e> collection) {
        for (e eVar : collection) {
            int i15 = i14 + 1;
            ArrayList arrayList = this.f9449n;
            if (i14 > 0) {
                e eVar2 = (e) arrayList.get(i14 - 1);
                int iO = eVar2.f9467a.f9510o.f158114b.o() + eVar2.f9471e;
                eVar.f9470d = i14;
                eVar.f9471e = iO;
                eVar.f9472f = false;
                eVar.f9469c.clear();
            } else {
                eVar.f9470d = i14;
                eVar.f9471e = 0;
                eVar.f9472f = false;
                eVar.f9469c.clear();
            }
            z(i14, 1, eVar.f9467a.f9510o.f158114b.o());
            arrayList.add(i14, eVar);
            this.f9451p.put(eVar.f9468b, eVar);
            w(eVar, eVar.f9467a);
            if (this.f9399b.isEmpty() || !this.f9450o.isEmpty()) {
                androidx.media3.exoplayer.source.c.b bVar = (androidx.media3.exoplayer.source.c.b) this.f9435h.get(eVar);
                bVar.getClass();
                bVar.f9442a.f(bVar.f9443b);
            } else {
                this.f9452q.add(eVar);
            }
            i14 = i15;
        }
    }

    public final void y(int i14, List list) {
        Handler handler = this.f9448m;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((j) it.next()).getClass();
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList.add(new e((j) it3.next(), this.f9454s));
        }
        this.f9446k.addAll(i14, arrayList);
        if (handler == null || list.isEmpty()) {
            return;
        }
        handler.obtainMessage(1, new f(i14, arrayList, null)).sendToTarget();
    }

    public final void z(int i14, int i15, int i16) {
        while (true) {
            ArrayList arrayList = this.f9449n;
            if (i14 >= arrayList.size()) {
                return;
            }
            e eVar = (e) arrayList.get(i14);
            eVar.f9470d += i15;
            eVar.f9471e += i16;
            i14++;
        }
    }

    public d(boolean z14, j... jVarArr) {
        this(z14, new t.a(0), jVarArr);
    }

    public d(boolean z14, t tVar, j... jVarArr) {
        this(z14, false, tVar, jVarArr);
    }

    public d(j... jVarArr) {
        this(false, jVarArr);
    }
}
