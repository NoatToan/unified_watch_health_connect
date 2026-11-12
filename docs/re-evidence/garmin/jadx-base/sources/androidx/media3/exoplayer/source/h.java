package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.d0;
import com.google.android.exoplayer2.C;
import fa.z;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h extends x {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f9507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0.c f9508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d0.b f9509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f9510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g f9511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9514s;

    public static final class a extends sa.h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Object f9515e = new Object();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f9516c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f9517d;

        private a(d0 d0Var, Object obj, Object obj2) {
            super(d0Var);
            this.f9516c = obj;
            this.f9517d = obj2;
        }

        public static a r(androidx.media3.common.t tVar) {
            return new a(new b(tVar), d0.c.f8194q, f9515e);
        }

        public static a s(d0 d0Var, Object obj, Object obj2) {
            return new a(d0Var, obj, obj2);
        }

        @Override // sa.h, androidx.media3.common.d0
        public final int b(Object obj) {
            Object obj2;
            if (f9515e.equals(obj) && (obj2 = this.f9517d) != null) {
                obj = obj2;
            }
            return this.f158114b.b(obj);
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.b f(int i14, d0.b bVar, boolean z14) {
            this.f158114b.f(i14, bVar, z14);
            if (Objects.equals(bVar.f8188b, this.f9517d) && z14) {
                bVar.f8188b = f9515e;
            }
            return bVar;
        }

        @Override // sa.h, androidx.media3.common.d0
        public final Object l(int i14) {
            Object objL = this.f158114b.l(i14);
            int i15 = z.f70071a;
            return Objects.equals(objL, this.f9517d) ? f9515e : objL;
        }

        @Override // sa.h, androidx.media3.common.d0
        public final d0.c m(int i14, d0.c cVar, long j8) {
            this.f158114b.m(i14, cVar, j8);
            if (Objects.equals(cVar.f8196a, this.f9516c)) {
                cVar.f8196a = d0.c.f8194q;
            }
            return cVar;
        }

        public final a q(d0 d0Var) {
            return new a(d0Var, this.f9516c, this.f9517d);
        }
    }

    public static final class b extends d0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.t f9518b;

        public b(androidx.media3.common.t tVar) {
            this.f9518b = tVar;
        }

        @Override // androidx.media3.common.d0
        public final int b(Object obj) {
            return obj == a.f9515e ? 0 : -1;
        }

        @Override // androidx.media3.common.d0
        public final d0.b f(int i14, d0.b bVar, boolean z14) {
            bVar.i(z14 ? 0 : null, z14 ? a.f9515e : null, 0, C.TIME_UNSET, 0L, androidx.media3.common.b.f8153g, true);
            return bVar;
        }

        @Override // androidx.media3.common.d0
        public final int h() {
            return 1;
        }

        @Override // androidx.media3.common.d0
        public final Object l(int i14) {
            return a.f9515e;
        }

        @Override // androidx.media3.common.d0
        public final d0.c m(int i14, d0.c cVar, long j8) {
            Object obj = d0.c.f8194q;
            cVar.b(this.f9518b, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0L);
            cVar.f8206k = true;
            return cVar;
        }

        @Override // androidx.media3.common.d0
        public final int o() {
            return 1;
        }
    }

    public h(j jVar, boolean z14) {
        super(jVar);
        this.f9507l = z14 && jVar.isSingleWindow();
        this.f9508m = new d0.c();
        this.f9509n = new d0.b();
        d0 initialTimeline = jVar.getInitialTimeline();
        if (initialTimeline == null) {
            this.f9510o = a.r(jVar.getMediaItem());
        } else {
            this.f9510o = a.s(initialTimeline, null, null);
            this.f9514s = true;
        }
    }

    public final boolean A(long j8) {
        g gVar = this.f9511p;
        int iB = this.f9510o.b(gVar.f9498a.f9519a);
        if (iB == -1) {
            return false;
        }
        a aVar = this.f9510o;
        d0.b bVar = this.f9509n;
        aVar.f(iB, bVar, false);
        long j14 = bVar.f8190d;
        if (j14 != C.TIME_UNSET && j8 >= j14) {
            j8 = Math.max(0L, j14 - 1);
        }
        gVar.f9506i = j8;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.x, androidx.media3.exoplayer.source.j
    public final void h(i iVar) {
        ((g) iVar).h();
        if (iVar == this.f9511p) {
            this.f9511p = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.x, androidx.media3.exoplayer.source.j
    public final void k(androidx.media3.common.t tVar) {
        if (this.f9514s) {
            this.f9510o = this.f9510o.q(new sa.q(this.f9510o.f158114b, tVar));
        } else {
            this.f9510o = a.r(tVar);
        }
        this.f9691k.k(tVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.j
    public final void maybeThrowSourceInfoRefreshError() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.a
    public final void o(d0 d0Var) {
        long j8;
        j.b bVarA;
        if (this.f9513r) {
            this.f9510o = this.f9510o.q(d0Var);
            g gVar = this.f9511p;
            if (gVar != null) {
                A(gVar.f9506i);
            }
        } else {
            if (!d0Var.p()) {
                d0.c cVar = this.f9508m;
                d0Var.n(0, cVar);
                long j14 = cVar.f8207l;
                Object obj = cVar.f8196a;
                g gVar2 = this.f9511p;
                if (gVar2 != null) {
                    long j15 = gVar2.f9499b;
                    a aVar = this.f9510o;
                    Object obj2 = gVar2.f9498a.f9519a;
                    d0.b bVar = this.f9509n;
                    aVar.g(obj2, bVar);
                    long j16 = bVar.f8191e + j15;
                    this.f9510o.m(0, cVar, 0L);
                    if (j16 != cVar.f8207l) {
                        j8 = j16;
                    } else {
                        j8 = j14;
                    }
                } else {
                    j8 = j14;
                }
                Pair<Object, Long> pairI = d0Var.i(this.f9508m, this.f9509n, 0, j8);
                Object obj3 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                this.f9510o = this.f9514s ? this.f9510o.q(d0Var) : a.s(d0Var, obj, obj3);
                g gVar3 = this.f9511p;
                if (gVar3 != null && A(jLongValue)) {
                    j.b bVar2 = gVar3.f9498a;
                    Object obj4 = bVar2.f9519a;
                    if (this.f9510o.f9517d != null && obj4.equals(a.f9515e)) {
                        obj4 = this.f9510o.f9517d;
                    }
                    bVarA = bVar2.a(obj4);
                }
                this.f9514s = true;
                this.f9513r = true;
                q(this.f9510o);
                if (bVarA != null) {
                    g gVar4 = this.f9511p;
                    gVar4.getClass();
                    gVar4.g(bVarA);
                }
            }
            this.f9510o = this.f9514s ? this.f9510o.q(d0Var) : a.s(d0Var, d0.c.f8194q, a.f9515e);
        }
        bVarA = null;
        this.f9514s = true;
        this.f9513r = true;
        q(this.f9510o);
        if (bVarA != null) {
            g gVar5 = this.f9511p;
            gVar5.getClass();
            gVar5.g(bVarA);
        }
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    public final void r() {
        this.f9513r = false;
        this.f9512q = false;
        super.r();
    }

    @Override // androidx.media3.exoplayer.source.x
    public final j.b x(j.b bVar) {
        Object obj = bVar.f9519a;
        Object obj2 = this.f9510o.f9517d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.f9515e;
        }
        return bVar.a(obj);
    }

    @Override // androidx.media3.exoplayer.source.x
    public final void y() {
        if (this.f9507l) {
            return;
        }
        this.f9512q = true;
        w(null, this.f9691k);
    }

    @Override // androidx.media3.exoplayer.source.x, androidx.media3.exoplayer.source.j
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final g c(j.b bVar, xa.b bVar2, long j8) {
        g gVar = new g(bVar, bVar2, j8);
        j jVar = this.f9691k;
        gVar.i(jVar);
        if (!this.f9513r) {
            this.f9511p = gVar;
            if (!this.f9512q) {
                this.f9512q = true;
                w(null, jVar);
            }
            return gVar;
        }
        Object obj = bVar.f9519a;
        if (this.f9510o.f9517d != null && obj.equals(a.f9515e)) {
            obj = this.f9510o.f9517d;
        }
        gVar.g(bVar.a(obj));
        return gVar;
    }
}
