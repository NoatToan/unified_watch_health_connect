package jf;

import android.os.Trace;
import ch.qos.logback.core.joran.action.Action;
import lc.u0;
import o4.e0;
import o53.b0;
import o53.c0;
import o53.d0;
import o53.l1;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import p3.y2;
import r53.b2;
import r53.e2;
import r53.g2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0007\b\tB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Ljf/d;", "Lt4/d;", "Lp3/y2;", "Ljf/d$b;", "input", "<init>", "(Ljf/d$b;)V", "b", "c", "a", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d extends t4.d implements y2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f98614r = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final j02.r f98615t = new j02.r(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f98616a = p0.n(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f98617b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f98618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f98619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l1 f98620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e2 f98621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f98622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b0 f98623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e23.l<? super c, ? extends c> f98624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e23.l<? super c, Unit> f98625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f5.k f98626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f98627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f98628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f98629n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p2 f98630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f98631p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f98632q;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljf/d$b;", "", "Lhf/j;", "imageLoader", "Lwf/f;", "request", "Ljf/c;", "modelEqualityDelegate", "<init>", "(Lhf/j;Lwf/f;Ljf/c;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hf.j f98633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wf.f f98634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final jf.c f98635c;

        public b(hf.j jVar, wf.f fVar, jf.c cVar) {
            this.f98633a = jVar;
            this.f98634b = fVar;
            this.f98635c = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!p005kotlin.jvm.internal.s.g(this.f98633a, bVar.f98633a)) {
                return false;
            }
            jf.c cVar = bVar.f98635c;
            jf.c cVar2 = this.f98635c;
            return p005kotlin.jvm.internal.s.g(cVar2, cVar) && cVar2.equals(this.f98634b, bVar.f98634b);
        }

        public final int hashCode() {
            int iHashCode = this.f98633a.hashCode() * 31;
            jf.c cVar = this.f98635c;
            return cVar.hashCode(this.f98634b) + ((cVar.hashCode() + iHashCode) * 31);
        }

        public final String toString() {
            return "Input(imageLoader=" + this.f98633a + ", request=" + this.f98634b + ", modelEqualityDelegate=" + this.f98635c + ")";
        }
    }

    public interface c {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljf/d$c$a;", "Ljf/d$c;", "<init>", "()V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f98636a = new a();

            private a() {
            }

            @Override // jf.d.c
            /* JADX INFO: renamed from: b */
            public final t4.d getF98640a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1625786264;
            }

            public final String toString() {
                return "Empty";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljf/d$c$b;", "Ljf/d$c;", "Lt4/d;", "painter", "Lwf/e;", "result", "<init>", "(Lt4/d;Lwf/e;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t4.d f98637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final wf.e f98638b;

            public b(t4.d dVar, wf.e eVar) {
                this.f98637a = dVar;
                this.f98638b = eVar;
            }

            @Override // jf.d.c
            /* JADX INFO: renamed from: b, reason: from getter */
            public final t4.d getF98640a() {
                return this.f98637a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p005kotlin.jvm.internal.s.g(this.f98637a, bVar.f98637a) && p005kotlin.jvm.internal.s.g(this.f98638b, bVar.f98638b);
            }

            public final int hashCode() {
                t4.d dVar = this.f98637a;
                return this.f98638b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
            }

            public final String toString() {
                return "Error(painter=" + this.f98637a + ", result=" + this.f98638b + ")";
            }
        }

        /* JADX INFO: renamed from: jf.d$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljf/d$c$c;", "Ljf/d$c;", "Lt4/d;", "painter", "<init>", "(Lt4/d;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1893c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t4.d f98639a;

            public C1893c(t4.d dVar) {
                this.f98639a = dVar;
            }

            @Override // jf.d.c
            /* JADX INFO: renamed from: b, reason: from getter */
            public final t4.d getF98640a() {
                return this.f98639a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1893c) && p005kotlin.jvm.internal.s.g(this.f98639a, ((C1893c) obj).f98639a);
            }

            public final int hashCode() {
                t4.d dVar = this.f98639a;
                if (dVar == null) {
                    return 0;
                }
                return dVar.hashCode();
            }

            public final String toString() {
                return "Loading(painter=" + this.f98639a + ")";
            }
        }

        /* JADX INFO: renamed from: jf.d$c$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljf/d$c$d;", "Ljf/d$c;", "Lt4/d;", "painter", "Lwf/p;", "result", "<init>", "(Lt4/d;Lwf/p;)V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1894d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final t4.d f98640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final wf.p f98641b;

            public C1894d(t4.d dVar, wf.p pVar) {
                this.f98640a = dVar;
                this.f98641b = pVar;
            }

            @Override // jf.d.c
            /* JADX INFO: renamed from: b, reason: from getter */
            public final t4.d getF98640a() {
                return this.f98640a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1894d)) {
                    return false;
                }
                C1894d c1894d = (C1894d) obj;
                return p005kotlin.jvm.internal.s.g(this.f98640a, c1894d.f98640a) && p005kotlin.jvm.internal.s.g(this.f98641b, c1894d.f98641b);
            }

            public final int hashCode() {
                return this.f98641b.hashCode() + (this.f98640a.hashCode() * 31);
            }

            public final String toString() {
                return "Success(painter=" + this.f98640a + ", result=" + this.f98641b + ")";
            }
        }

        /* JADX INFO: renamed from: b */
        t4.d getF98640a();
    }

    /* JADX INFO: renamed from: jf.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 2, 0})
    @v13.e(c = "coil3.compose.AsyncImagePainter$launchJob$1", f = "AsyncImagePainter.kt", l = {234, 238}, m = "invokeSuspend")
    public static final class C1895d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f98642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f98643b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ b f98645d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1895d(b bVar, t13.d<? super C1895d> dVar) {
            super(2, dVar);
            this.f98645d = bVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C1895d(this.f98645d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1895d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x005c  */
        /* JADX WARN: Code duplicated, block: B:24:0x0071  */
        /* JADX WARN: Code duplicated, block: B:26:0x0075  */
        /* JADX WARN: Code duplicated, block: B:28:0x007d  */
        /* JADX WARN: Code duplicated, block: B:32:0x0091  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r7 == r0) goto L18;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d dVar;
            c cVar;
            wf.i iVar;
            c bVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f98643b;
            d dVar2 = d.this;
            if (i14 == 0) {
                o13.r.b(obj);
                i iVar2 = dVar2.f98628m;
                b bVar2 = this.f98645d;
                if (iVar2 != null) {
                    wf.f fVarA = d.a(dVar2, bVar2.f98634b, true);
                    hf.j jVar = bVar2.f98633a;
                    this.f98643b = 1;
                    obj = iVar2.a(jVar, fVarA, this);
                } else {
                    wf.f fVarA2 = d.a(dVar2, bVar2.f98634b, false);
                    hf.j jVar2 = bVar2.f98633a;
                    this.f98642a = dVar2;
                    this.f98643b = 2;
                    obj = jVar2.a(fVarA2, this);
                    if (obj != aVar) {
                        dVar = dVar2;
                        iVar = (wf.i) obj;
                        a aVar2 = d.f98614r;
                        dVar.getClass();
                        if (iVar instanceof wf.p) {
                            wf.p pVar = (wf.p) iVar;
                            bVar = new c.C1894d(n.a(pVar.f185006a, pVar.f185007b.f184902a, dVar.f98627l), pVar);
                        } else {
                            if (iVar instanceof wf.e) {
                                u0.r();
                                return null;
                            }
                            wf.e eVar = (wf.e) iVar;
                            hf.h hVar = eVar.f184899a;
                            bVar = new c.b(hVar != null ? n.a(hVar, eVar.f184900b.f184902a, dVar.f98627l) : null, eVar);
                        }
                        cVar = bVar;
                    }
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                cVar = (c) obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = this.f98642a;
                o13.r.b(obj);
                iVar = (wf.i) obj;
                a aVar3 = d.f98614r;
                dVar.getClass();
                if (iVar instanceof wf.p) {
                    wf.p pVar2 = (wf.p) iVar;
                    bVar = new c.C1894d(n.a(pVar2.f185006a, pVar2.f185007b.f184902a, dVar.f98627l), pVar2);
                } else {
                    if (iVar instanceof wf.e) {
                        u0.r();
                        return null;
                    }
                    wf.e eVar2 = (wf.e) iVar;
                    hf.h hVar2 = eVar2.f184899a;
                    bVar = new c.b(hVar2 != null ? n.a(hVar2, eVar2.f184900b.f184902a, dVar.f98627l) : null, eVar2);
                }
                cVar = bVar;
            }
            d.b(dVar2, cVar);
            return Unit.INSTANCE;
        }
    }

    public d(b bVar) {
        n4.g.f123559b.getClass();
        this.f98622g = n4.g.f123560c;
        this.f98624i = f98615t;
        f5.k.f68985a.getClass();
        this.f98626k = f5.k.a.f68988c;
        q4.f.f142555o0.getClass();
        this.f98627l = q4.f.a.f142558c;
        this.f98629n = bVar;
        p2 p2VarA = q2.a(bVar);
        this.f98630o = p2VarA;
        r53.s.d(p2VarA);
        p2 p2VarA2 = q2.a(c.a.f98636a);
        this.f98631p = p2VarA2;
        this.f98632q = r53.s.d(p2VarA2);
    }

    public static final wf.f a(d dVar, wf.f fVar, boolean z14) {
        dVar.getClass();
        xf.h hVar = fVar.f184922u;
        wf.f.c cVar = fVar.f184926y;
        if (hVar instanceof l) {
            l lVar = (l) hVar;
            if (dVar.f98621f == null) {
                e2 e2VarB = g2.b(1, 0, q53.a.DROP_OLDEST, 2);
                long j8 = dVar.f98622g;
                if (j8 != 9205357640488583168L) {
                    e2VarB.d(n4.g.a(j8));
                }
                dVar.f98621f = e2VarB;
            }
            lVar.connect();
        }
        wf.f.a aVarA = wf.f.a(fVar);
        aVarA.f184931d = new e(fVar, dVar);
        if (cVar.f184978k == null) {
            aVarA.f184949v = xf.h.E0;
        }
        if (cVar.f184979l == null) {
            f5.k kVar = dVar.f98626k;
            kf.j.a aVar = kf.j.f104590a;
            f5.k.f68985a.getClass();
            aVarA.f184950w = (p005kotlin.jvm.internal.s.g(kVar, f5.k.a.f68988c) || p005kotlin.jvm.internal.s.g(kVar, f5.k.a.f68991f)) ? xf.f.FIT : xf.f.FILL;
        }
        if (cVar.f184980m == null) {
            aVarA.f184951x = xf.c.INEXACT;
        }
        if (z14) {
            t13.h hVar2 = t13.h.f161748a;
            aVarA.f184939l = hVar2;
            aVarA.f184940m = hVar2;
            aVarA.f184941n = hVar2;
        }
        return aVarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static final void b(d dVar, c cVar) {
        wf.i iVar;
        t4.d f98640a;
        e23.l<? super c, Unit> lVar;
        Object f98640a2;
        y2 y2Var;
        y2 y2Var2;
        p2 p2Var = dVar.f98631p;
        c cVar2 = (c) p2Var.getValue();
        c cVarInvoke = dVar.f98624i.invoke(cVar);
        p2Var.setValue(cVarInvoke);
        f5.k kVar = dVar.f98626k;
        g.a aVar = g.f98648a;
        if (!(cVarInvoke instanceof c.C1894d)) {
            if (cVarInvoke instanceof c.b) {
                iVar = ((c.b) cVarInvoke).f98638b;
            } else {
                f98640a = null;
            }
            if (f98640a == null) {
                f98640a = cVarInvoke.getF98640a();
            }
            dVar.f98616a.setValue(f98640a);
            if (cVar2.getF98640a() != cVarInvoke.getF98640a()) {
                f98640a2 = cVar2.getF98640a();
                if (f98640a2 instanceof y2) {
                    y2Var = (y2) f98640a2;
                } else {
                    y2Var = null;
                }
                if (y2Var != null) {
                    y2Var.onForgotten();
                }
                Object f98640a3 = cVarInvoke.getF98640a();
                y2Var2 = f98640a3 instanceof y2 ? (y2) f98640a3 : null;
                if (y2Var2 != null) {
                    y2Var2.onRemembered();
                }
            }
            lVar = dVar.f98625j;
            if (lVar != null) {
                lVar.invoke(cVarInvoke);
            }
        }
        iVar = ((c.C1894d) cVarInvoke).f98641b;
        cg.d dVarA = ((cg.d.a) hf.g.a(iVar.getF185007b(), wf.h.f184985a)).a(g.f98648a, iVar);
        if (dVarA instanceof cg.b) {
            t4.d f98640a4 = cVar2.getF98640a();
            if (!(cVar2 instanceof c.C1893c)) {
                f98640a4 = null;
            }
            t4.d f98640a5 = cVarInvoke.getF98640a();
            e53.c.a aVar2 = e53.c.f63094b;
            cg.b bVar = (cg.b) dVarA;
            f98640a = new k(f98640a4, f98640a5, kVar, e53.e.e(bVar.f27109c, e53.f.MILLISECONDS), null, ((iVar instanceof wf.p) && ((wf.p) iVar).f185012g) ? false : true, bVar.f27110d, 16, null);
        } else {
            f98640a = null;
        }
        if (f98640a == null) {
            f98640a = cVarInvoke.getF98640a();
        }
        dVar.f98616a.setValue(f98640a);
        if (cVar2.getF98640a() != cVarInvoke.getF98640a()) {
            f98640a2 = cVar2.getF98640a();
            if (f98640a2 instanceof y2) {
                y2Var = (y2) f98640a2;
            } else {
                y2Var = null;
            }
            if (y2Var != null) {
                y2Var.onForgotten();
            }
            Object f98640a6 = cVarInvoke.getF98640a();
            if (f98640a6 instanceof y2) {
            }
            if (y2Var2 != null) {
                y2Var2.onRemembered();
            }
        }
        lVar = dVar.f98625j;
        if (lVar != null) {
            lVar.invoke(cVarInvoke);
        }
    }

    @Override // t4.d
    public final boolean applyAlpha(float f14) {
        this.f98617b = f14;
        return true;
    }

    @Override // t4.d
    public final boolean applyColorFilter(e0 e0Var) {
        this.f98618c = e0Var;
        return true;
    }

    public final void c() {
        b bVar = this.f98629n;
        if (bVar == null) {
            return;
        }
        b0 b0Var = this.f98623h;
        if (b0Var == null) {
            p005kotlin.jvm.internal.s.m(Action.SCOPE_ATTRIBUTE);
            throw null;
        }
        C1895d c1895d = new C1895d(bVar, null);
        t13.g f136462d = b0Var.getF195311f();
        kf.j.a aVar = kf.j.f104590a;
        z zVar = (z) f136462d.get(z.INSTANCE);
        o53.c2 c2VarS = (zVar == null || zVar.equals(s0.f129407b)) ? ge1.b.S(b0Var, s0.f129407b, d0.UNDISPATCHED, c1895d) : ge1.b.S(c0.a(new kf.e(b0Var.getF195311f())), new kf.f(zVar), d0.UNDISPATCHED, c1895d);
        l1 l1Var = this.f98620e;
        if (l1Var != null) {
            l1Var.c(null);
        }
        this.f98620e = c2VarS;
    }

    public final void d(b bVar) {
        if (p005kotlin.jvm.internal.s.g(this.f98629n, bVar)) {
            return;
        }
        this.f98629n = bVar;
        if (bVar == null) {
            l1 l1Var = this.f98620e;
            if (l1Var != null) {
                l1Var.c(null);
            }
            this.f98620e = null;
        } else if (this.f98619d) {
            c();
        }
        if (bVar != null) {
            this.f98630o.k(null, bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF98674l() {
        t4.d dVar = (t4.d) this.f98616a.getF182175a();
        if (dVar != null) {
            return dVar.getF98674l();
        }
        n4.g.f123559b.getClass();
        return n4.g.f123560c;
    }

    @Override // p3.y2
    public final void onAbandoned() {
        l1 l1Var = this.f98620e;
        if (l1Var != null) {
            l1Var.c(null);
        }
        this.f98620e = null;
        Object obj = (t4.d) this.f98616a.getF182175a();
        y2 y2Var = obj instanceof y2 ? (y2) obj : null;
        if (y2Var != null) {
            y2Var.onAbandoned();
        }
        this.f98619d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t4.d
    public final void onDraw(q4.f fVar) {
        long jB = fVar.b();
        if (!n4.g.c(this.f98622g, jB)) {
            this.f98622g = jB;
            e2 e2Var = this.f98621f;
            if (e2Var != null) {
                e2Var.d(n4.g.a(jB));
            }
        }
        t4.d dVar = (t4.d) this.f98616a.getF182175a();
        if (dVar != null) {
            dVar.m501drawx_KDEd0(fVar, fVar.b(), this.f98617b, this.f98618c);
        }
    }

    @Override // p3.y2
    public final void onForgotten() {
        l1 l1Var = this.f98620e;
        if (l1Var != null) {
            l1Var.c(null);
        }
        this.f98620e = null;
        Object obj = (t4.d) this.f98616a.getF182175a();
        y2 y2Var = obj instanceof y2 ? (y2) obj : null;
        if (y2Var != null) {
            y2Var.onForgotten();
        }
        this.f98619d = false;
    }

    @Override // p3.y2
    public final void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (t4.d) this.f98616a.getF182175a();
            y2 y2Var = obj instanceof y2 ? (y2) obj : null;
            if (y2Var != null) {
                y2Var.onRemembered();
            }
            c();
            this.f98619d = true;
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljf/d$a;", "", "<init>", "()V", "coil-compose-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
