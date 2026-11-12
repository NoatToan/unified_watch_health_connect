package p3;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lp3/s2;", "Lp3/p;", "Lt13/g;", "effectCoroutineContext", "<init>", "(Lt13/g;)V", "d", "c", "b", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s2 extends p {
    public static final r53.p2 A;
    public static final AtomicReference<Boolean> B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final a f135273z = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p3.d f135274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f135275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f135276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.l1 f135277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f135278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f135279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f135280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p1.u0<Object> f135281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q3.c<c0> f135282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f135283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f135284k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p1.t0<Object, Object> f135285l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r1 f135286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p1.t0<j1, i1> f135287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p1.t0<Object, Object> f135288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f135289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p1.u0<c0> f135290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o53.k f135291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r53.p2 f135292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f135293t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final r53.p2 f135294u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z3.m<p1.u0<p2>> f135295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o53.m1 f135296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t13.g f135297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f135298y;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp3/s2$b;", "", "", "cause", "", "isRecoverable", "<init>", "(Ljava/lang/Throwable;Z)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f135299a;

        public b(Throwable th3, boolean z14) {
            this.f135299a = th3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/s2$c;", "", "<init>", "(Lp3/s2;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class c {
        public c(s2 s2Var) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/s2$d;", "", "<init>", "(Ljava/lang/String;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    static {
        x3.b.f188546e.getClass();
        A = r53.q2.a(x3.b.f188547f);
        B = new AtomicReference<>(Boolean.FALSE);
    }

    public s2(t13.g gVar) {
        final int i14 = 0;
        p3.d dVar = new p3.d(new e23.a(this) { // from class: p3.r2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f135263b;

            {
                this.f135263b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                s2 s2Var = this.f135263b;
                switch (i15) {
                    case 0:
                        s2.a aVar = s2.f135273z;
                        s2Var.I();
                        break;
                    default:
                        s2.a aVar2 = s2.f135273z;
                        s2Var.I();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.f135274a = dVar;
        final int i15 = 1;
        this.f135275b = new u1(new e23.a(this) { // from class: p3.r2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s2 f135263b;

            {
                this.f135263b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                s2 s2Var = this.f135263b;
                switch (i16) {
                    case 0:
                        s2.a aVar = s2.f135273z;
                        s2Var.I();
                        break;
                    default:
                        s2.a aVar2 = s2.f135273z;
                        s2Var.I();
                        break;
                }
                return Unit.INSTANCE;
            }
        });
        this.f135276c = new Object();
        this.f135279f = new ArrayList();
        this.f135281h = new p1.u0<>(0, 1, null);
        this.f135282i = new q3.c<>(new c0[16], 0);
        this.f135283j = new ArrayList();
        this.f135284k = new ArrayList();
        this.f135285l = q3.b.c();
        this.f135286m = new r1();
        this.f135287n = p1.g1.b();
        this.f135288o = q3.b.c();
        this.f135292s = r53.q2.a(null);
        this.f135294u = r53.q2.a(d.Inactive);
        this.f135295v = new z3.m<>();
        o53.m1 m1Var = new o53.m1((o53.l1) gVar.get(o53.l1.f129368i0));
        m1Var.J(new q1(this, 2));
        this.f135296w = m1Var;
        this.f135297x = gVar.plus(dVar).plus(m1Var);
        this.f135298y = new c(this);
    }

    public static final void B(s2 s2Var, j1 j1Var, j1 j1Var2) {
        List<j1> list = j1Var2.f135130h;
        if (list != null) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                j1 j1Var3 = list.get(i14);
                r1 r1Var = s2Var.f135286m;
                h1<Object> h1Var = j1Var3.f135123a;
                s1 s1Var = new s1(j1Var3, j1Var);
                q3.b.a(r1Var.f135260a, h1Var, s1Var);
                q3.b.a(r1Var.f135261b, s1Var.f135272b, h1Var);
                B(s2Var, j1Var, j1Var3);
            }
        }
    }

    public static final void K(ArrayList arrayList, s2 s2Var, c0 c0Var) {
        arrayList.clear();
        synchronized (s2Var.f135276c) {
            try {
                Iterator it = s2Var.f135284k.iterator();
                while (it.hasNext()) {
                    j1 j1Var = (j1) it.next();
                    if (p005kotlin.jvm.internal.s.g(j1Var.f135125c, c0Var)) {
                        arrayList.add(j1Var);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static /* synthetic */ void O(s2 s2Var, Throwable th3, int i14) throws Throwable {
        s2Var.N(th3, null, (i14 & 4) == 0);
    }

    public static void z(f4.a aVar) {
        try {
            if (aVar.w() instanceof f4.g.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            aVar.c();
        } catch (Throwable th3) {
            aVar.c();
            throw th3;
        }
    }

    public final void A() {
        synchronized (this.f135276c) {
            try {
                if (((d) this.f135294u.getValue()).compareTo(d.Idle) >= 0) {
                    this.f135294u.setValue(d.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f135296w.c(null);
    }

    public final o53.j<Unit> C() {
        d dVar;
        r53.p2 p2Var = this.f135294u;
        int iCompareTo = ((d) p2Var.getValue()).compareTo(d.ShuttingDown);
        r53.p2 p2Var2 = this.f135292s;
        ArrayList arrayList = this.f135284k;
        ArrayList arrayList2 = this.f135283j;
        q3.c<c0> cVar = this.f135282i;
        if (iCompareTo > 0) {
            if (p2Var2.getValue() != null) {
                dVar = d.Inactive;
            } else if (this.f135277d == null) {
                this.f135281h = new p1.u0<>(0, 1, null);
                cVar.g();
                dVar = (D() || F()) ? d.InactivePendingWork : d.Inactive;
            } else {
                dVar = (cVar.f142358c != 0 || this.f135281h.c() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.f135285l.f()) ? d.PendingWork : d.Idle;
            }
            p2Var.setValue(dVar);
            if (dVar != d.PendingWork) {
                return null;
            }
            o53.k kVar = this.f135291r;
            this.f135291r = null;
            return kVar;
        }
        List<c0> listH = H();
        int size = listH.size();
        for (int i14 = 0; i14 < size; i14++) {
            listH.get(i14);
        }
        this.f135279f.clear();
        this.f135280g = p13.j0.f134944a;
        this.f135281h = new p1.u0<>(0, 1, null);
        cVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.f135289p = null;
        o53.k kVar2 = this.f135291r;
        if (kVar2 != null) {
            kVar2.u(null);
        }
        this.f135291r = null;
        p2Var2.setValue(null);
        return null;
    }

    public final boolean D() {
        return !this.f135293t && (this.f135274a.f135051b.f202081c.get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.f135282i.f142358c != 0 || D() || F() || this.f135285l.f();
    }

    public final boolean F() {
        return !this.f135293t && (this.f135275b.f135322b.f202081c.get() & 134217727) > 0;
    }

    public final boolean G() {
        boolean z14;
        synchronized (this.f135276c) {
            z14 = this.f135281h.c() || this.f135282i.f142358c != 0 || D() || F();
        }
        return z14;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<p3.c0>] */
    public final List<c0> H() {
        ?? r14 = this.f135280g;
        if (r14 != 0) {
            return r14;
        }
        ArrayList arrayList = this.f135279f;
        List<c0> arrayList2 = arrayList.isEmpty() ? p13.j0.f134944a : new ArrayList(arrayList);
        this.f135280g = arrayList2;
        return arrayList2;
    }

    public final void I() {
        o53.j<Unit> jVarC;
        synchronized (this.f135276c) {
            jVarC = C();
            if (((d) this.f135294u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                throw gl1.d.a("Recomposer shutdown; frame clock awaiter will never resume", this.f135278e);
            }
        }
        if (jVarC != null) {
            int i14 = o13.q.f128596b;
            ((o53.k) jVarC).resumeWith(Unit.INSTANCE);
        }
    }

    public final void J(c0 c0Var) {
        synchronized (this.f135276c) {
            ArrayList arrayList = this.f135284k;
            int size = arrayList.size();
            for (int i14 = 0; i14 < size; i14++) {
                if (p005kotlin.jvm.internal.s.g(((j1) arrayList.get(i14)).f135125c, c0Var)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, c0Var);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, c0Var);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<c0> L(List<j1> list, p1.u0<Object> u0Var) {
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            j1 j1Var = list.get(i14);
            c0 c0Var = j1Var.f135125c;
            Object arrayList2 = map.get(c0Var);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(c0Var, arrayList2);
            }
            ((ArrayList) arrayList2).add(j1Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            c0 c0Var2 = (c0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (c0Var2.u()) {
                n.a("Check failed");
            }
            f4.f.a aVar = f4.f.f68735e;
            q1 q1Var = new q1(c0Var2, 1);
            o50.a aVar2 = new o50.a(20, c0Var2, u0Var);
            aVar.getClass();
            f4.a aVarG = f4.f.a.g(q1Var, aVar2);
            try {
                f4.f fVarJ = aVarG.j();
                try {
                    synchronized (this.f135276c) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i15 = 0; i15 < size2; i15++) {
                                j1 j1Var2 = (j1) list2.get(i15);
                                Object objD = q3.b.d(this.f135285l, j1Var2.f135123a);
                                j1 j1Var3 = (j1) objD;
                                if (j1Var3 != null) {
                                    this.f135286m.a(j1Var3);
                                }
                                arrayList.add(new o13.p(j1Var2, objD));
                            }
                            int size3 = arrayList.size();
                            for (int i16 = 0; i16 < size3; i16++) {
                                o13.p pVar = (o13.p) arrayList.get(i16);
                                if (pVar.f128595b == 0) {
                                    if (this.f135286m.f135260a.a(((j1) pVar.f128594a).f135123a)) {
                                        ArrayList arrayList3 = new ArrayList(arrayList.size());
                                        int size4 = arrayList.size();
                                        for (int i17 = 0; i17 < size4; i17++) {
                                            o13.p pVar2 = (o13.p) arrayList.get(i17);
                                            if (pVar2.f128595b == 0) {
                                                r1 r1Var = this.f135286m;
                                                h1<Object> h1Var = ((j1) pVar2.f128594a).f135123a;
                                                p1.t0<Object, Object> t0Var = r1Var.f135260a;
                                                s1 s1Var = (s1) q3.b.d(t0Var, h1Var);
                                                if (t0Var.e()) {
                                                    r1Var.f135261b.g();
                                                }
                                                if (s1Var != null) {
                                                    j1 j1Var4 = s1Var.f135271a;
                                                    q3.b.a(this.f135288o, s1Var.f135272b, j1Var4);
                                                    pVar2 = new o13.p(pVar2.f128594a, j1Var4);
                                                }
                                            }
                                            arrayList3.add(pVar2);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i18 = 0; i18 < size5; i18++) {
                        if (((o13.p) arrayList.get(i18)).f128595b != 0) {
                            int size6 = arrayList.size();
                            for (int i19 = 0; i19 < size6; i19++) {
                                if (((o13.p) arrayList.get(i19)).f128595b == 0) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i24 = 0; i24 < size7; i24++) {
                                        o13.p pVar3 = (o13.p) arrayList.get(i24);
                                        j1 j1Var5 = pVar3.f128595b == 0 ? (j1) pVar3.f128594a : null;
                                        if (j1Var5 != null) {
                                            arrayList4.add(j1Var5);
                                        }
                                    }
                                    synchronized (this.f135276c) {
                                        p13.d0.v(this.f135284k, arrayList4);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i25 = 0; i25 < size8; i25++) {
                                        Object obj = arrayList.get(i25);
                                        if (((o13.p) obj).f128595b != 0) {
                                            arrayList5.add(obj);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    c0Var2.c(arrayList);
                    Unit unit2 = Unit.INSTANCE;
                    f4.f.q(fVarJ);
                    z(aVarG);
                } catch (Throwable th4) {
                    f4.f.q(fVarJ);
                    throw th4;
                }
            } catch (Throwable th5) {
                z(aVarG);
                throw th5;
            }
        }
        return p13.h0.b1(map.keySet());
    }

    public final c0 M(c0 c0Var, p1.u0<Object> u0Var) {
        if (c0Var.u() || c0Var.b()) {
            return null;
        }
        p1.u0<c0> u0Var2 = this.f135290q;
        if (u0Var2 != null && u0Var2.a(c0Var)) {
            return null;
        }
        f4.f.a aVar = f4.f.f68735e;
        q1 q1Var = new q1(c0Var, 1);
        o50.a aVar2 = new o50.a(20, c0Var, u0Var);
        aVar.getClass();
        f4.a aVarG = f4.f.a.g(q1Var, aVar2);
        try {
            f4.f fVarJ = aVarG.j();
            if (u0Var != null) {
                try {
                    if (u0Var.c()) {
                        c0Var.h(new oe.j(28, u0Var, c0Var));
                    }
                } catch (Throwable th3) {
                    f4.f.q(fVarJ);
                    throw th3;
                }
            }
            boolean zF = c0Var.f();
            f4.f.q(fVarJ);
            z(aVarG);
            if (zF) {
                return c0Var;
            }
            return null;
        } catch (Throwable th4) {
            z(aVarG);
            throw th4;
        }
    }

    public final void N(Throwable th3, c0 c0Var, boolean z14) throws Throwable {
        if (!B.get().booleanValue() || (th3 instanceof ComposeRuntimeError)) {
            synchronized (this.f135276c) {
                b bVar = (b) this.f135292s.getValue();
                if (bVar != null) {
                    throw bVar.f135299a;
                }
                this.f135292s.k(null, new b(th3, false));
                Unit unit = Unit.INSTANCE;
            }
            throw th3;
        }
        synchronized (this.f135276c) {
            try {
                this.f135283j.clear();
                this.f135282i.g();
                this.f135281h = new p1.u0<>(0, 1, null);
                this.f135284k.clear();
                this.f135285l.g();
                this.f135287n.g();
                this.f135292s.k(null, new b(th3, z14));
                if (c0Var != null) {
                    Q(c0Var);
                }
                if (C() != null) {
                    n.a("expected to go to inactive state due to composition error");
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean P() {
        boolean zE;
        p13.j0 j0Var = p13.j0.f134944a;
        synchronized (this.f135276c) {
            if (this.f135281h.b()) {
                return E();
            }
            List<c0> listH = H();
            q3.e eVar = new q3.e(this.f135281h);
            this.f135281h = new p1.u0<>(0, 1, null);
            try {
                int size = listH.size();
                for (int i14 = 0; i14 < size; i14++) {
                    listH.get(i14).d(eVar);
                    if (((d) this.f135294u.getValue()).compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.f135276c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zE = E();
                }
                return zE;
            } catch (Throwable th3) {
                synchronized (this.f135276c) {
                    p1.u0<Object> u0Var = this.f135281h;
                    u0Var.getClass();
                    Iterator<T> it = eVar.iterator();
                    while (it.hasNext()) {
                        u0Var.j(it.next());
                    }
                    throw th3;
                }
            }
        }
    }

    public final void Q(c0 c0Var) {
        ArrayList arrayList = this.f135289p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f135289p = arrayList;
        }
        if (!arrayList.contains(c0Var)) {
            arrayList.add(c0Var);
        }
        if (this.f135279f.remove(c0Var)) {
            this.f135280g = null;
        }
    }

    @Override // p3.p
    public final void a(c0 c0Var, e23.p<? super m, ? super Integer, Unit> pVar) throws Throwable {
        d dVar;
        int i14;
        boolean z14;
        boolean zU = c0Var.u();
        synchronized (this.f135276c) {
            d dVar2 = (d) this.f135294u.getValue();
            dVar = d.ShuttingDown;
            i14 = 1;
            z14 = dVar2.compareTo(dVar) > 0 ? !H().contains(c0Var) : true;
        }
        try {
            f4.f.a aVar = f4.f.f68735e;
            q1 q1Var = new q1(c0Var, i14);
            o50.a aVar2 = new o50.a(20, c0Var, null);
            aVar.getClass();
            f4.a aVarG = f4.f.a.g(q1Var, aVar2);
            try {
                f4.f fVarJ = aVarG.j();
                try {
                    c0Var.j(pVar);
                    Unit unit = Unit.INSTANCE;
                    f4.f.q(fVarJ);
                    z(aVarG);
                    synchronized (this.f135276c) {
                        if (((d) this.f135294u.getValue()).compareTo(dVar) > 0 && !H().contains(c0Var)) {
                            this.f135279f.add(c0Var);
                            this.f135280g = null;
                        }
                    }
                    if (!zU) {
                        f4.l.i().m();
                    }
                    try {
                        J(c0Var);
                        try {
                            c0Var.i();
                            c0Var.o();
                            if (zU) {
                                return;
                            }
                            f4.l.i().m();
                        } catch (Throwable th3) {
                            O(this, th3, 6);
                        }
                    } catch (Throwable th4) {
                        N(th4, c0Var, true);
                    }
                } catch (Throwable th5) {
                    f4.f.q(fVarJ);
                    throw th5;
                }
            } catch (Throwable th6) {
                z(aVarG);
                throw th6;
            }
        } catch (Throwable th7) {
            if (z14) {
                synchronized (this.f135276c) {
                    Unit unit2 = Unit.INSTANCE;
                }
            }
            N(th7, c0Var, true);
        }
    }

    @Override // p3.p
    public final p1.h1<p2> b(c0 c0Var, e3 e3Var, e23.p<? super m, ? super Integer, Unit> pVar) {
        z3.m<p1.u0<p2>> mVar = this.f135295v;
        try {
            e3 e3VarG = c0Var.g(e3Var);
            try {
                a(c0Var, pVar);
                p1.u0<Object> u0VarA = mVar.a();
                if (u0VarA == null) {
                    u0VarA = p1.i1.f134743a;
                    u0VarA.getClass();
                }
                c0Var.g(e3VarG);
                mVar.b(null);
                return u0VarA;
            } catch (Throwable th3) {
                c0Var.g(e3VarG);
                throw th3;
            }
        } catch (Throwable th4) {
            mVar.b(null);
            throw th4;
        }
    }

    @Override // p3.p
    public final void c(j1 j1Var) {
        o53.j<Unit> jVarC;
        synchronized (this.f135276c) {
            try {
                q3.b.a(this.f135285l, j1Var.f135123a, j1Var);
                if (j1Var.f135130h != null) {
                    B(this, j1Var, j1Var);
                }
                jVarC = C();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (jVarC != null) {
            int i14 = o13.q.f128596b;
            ((o53.k) jVarC).resumeWith(Unit.INSTANCE);
        }
    }

    @Override // p3.p
    public final boolean e() {
        return B.get().booleanValue();
    }

    @Override // p3.p
    /* JADX INFO: renamed from: f */
    public final boolean getF135204b() {
        return false;
    }

    @Override // p3.p
    /* JADX INFO: renamed from: g */
    public final boolean getF135205c() {
        x1 x1Var = n.f135158a;
        g4.e.f75736b.getClass();
        return g4.e.f75737c == 0;
    }

    @Override // p3.p
    /* JADX INFO: renamed from: h */
    public final long getF135203a() {
        return 1000;
    }

    @Override // p3.p
    public final o i() {
        return null;
    }

    @Override // p3.p
    /* JADX INFO: renamed from: k, reason: from getter */
    public final t13.g getF135297x() {
        return this.f135297x;
    }

    @Override // p3.p
    public final boolean l() {
        x1 x1Var = n.f135158a;
        g4.e.f75736b.getClass();
        return false;
    }

    @Override // p3.p
    public final void m(j1 j1Var) {
        o53.j<Unit> jVarC;
        synchronized (this.f135276c) {
            this.f135284k.add(j1Var);
            jVarC = C();
        }
        if (jVarC != null) {
            int i14 = o13.q.f128596b;
            ((o53.k) jVarC).resumeWith(Unit.INSTANCE);
        }
    }

    @Override // p3.p
    public final void n(c0 c0Var) {
        o53.j<Unit> jVarC;
        synchronized (this.f135276c) {
            if (this.f135282i.h(c0Var)) {
                jVarC = null;
            } else {
                this.f135282i.b(c0Var);
                jVarC = C();
            }
        }
        if (jVarC != null) {
            int i14 = o13.q.f128596b;
            ((o53.k) jVarC).resumeWith(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0088 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008a A[Catch: all -> 0x0080, LOOP:0: B:16:0x004a->B:28:0x008a, LOOP_END, TryCatch #0 {all -> 0x0080, blocks: (B:4:0x0009, B:6:0x0016, B:11:0x002f, B:13:0x0035, B:16:0x004a, B:18:0x005a, B:20:0x0066, B:22:0x006f, B:25:0x0082, B:28:0x008a, B:29:0x008d, B:7:0x001c, B:9:0x0020, B:10:0x0023), top: B:34:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008d A[EDGE_INSN: B:37:0x008d->B:29:0x008d BREAK  A[LOOP:0: B:16:0x004a->B:28:0x008a], SYNTHETIC] */
    @Override // p3.p
    public final void o(j1 j1Var, i1 i1Var, p3.c<?> cVar) {
        p1.a1 a1Var;
        synchronized (this.f135276c) {
            try {
                this.f135287n.m(j1Var, i1Var);
                Object objD = this.f135288o.d(j1Var);
                if (objD == null) {
                    a1Var = p1.b1.f134678b;
                    a1Var.getClass();
                } else if (objD instanceof p1.q0) {
                    a1Var = (p1.a1) objD;
                } else {
                    Object[] objArr = p1.b1.f134677a;
                    p1.q0 q0Var = new p1.q0(1);
                    q0Var.g(objD);
                    a1Var = q0Var;
                }
                if (a1Var.e()) {
                    p1.t0 t0VarB = i1Var.f135114a.b(cVar, a1Var);
                    Object[] objArr2 = t0VarB.f134721b;
                    Object[] objArr3 = t0VarB.f134722c;
                    long[] jArr = t0VarB.f134720a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j8 = jArr[i14];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((255 & j8) < 128) {
                                        int i17 = (i14 << 3) + i16;
                                        Object obj = objArr2[i17];
                                        this.f135287n.m((j1) obj, (i1) objArr3[i17]);
                                    }
                                    j8 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                } else if (i14 != length) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p3.p
    public final i1 p(j1 j1Var) {
        i1 i1VarK;
        synchronized (this.f135276c) {
            i1VarK = this.f135287n.k(j1Var);
        }
        return i1VarK;
    }

    @Override // p3.p
    public final p1.h1<p2> q(c0 c0Var, e3 e3Var, p1.h1<p2> h1Var) {
        z3.m<p1.u0<p2>> mVar = this.f135295v;
        try {
            P();
            c0Var.d(new q3.e(h1Var));
            e3 e3VarG = c0Var.g(e3Var);
            try {
                c0 c0VarM = M(c0Var, null);
                if (c0VarM != null) {
                    J(c0Var);
                    c0VarM.i();
                    c0VarM.o();
                }
                p1.u0<Object> u0VarA = mVar.a();
                if (u0VarA == null) {
                    u0VarA = p1.i1.f134743a;
                    u0VarA.getClass();
                }
                c0Var.g(e3VarG);
                mVar.b(null);
                return u0VarA;
            } catch (Throwable th3) {
                c0Var.g(e3VarG);
                throw th3;
            }
        } catch (Throwable th4) {
            mVar.b(null);
            throw th4;
        }
    }

    @Override // p3.p
    public final void r(Set<g4.g> set) {
    }

    @Override // p3.p
    public final void t(p2 p2Var) {
        z3.m<p1.u0<p2>> mVar = this.f135295v;
        p1.u0<p2> u0VarA = mVar.a();
        if (u0VarA == null) {
            u0VarA = p1.i1.a();
            mVar.b(u0VarA);
        }
        u0VarA.d(p2Var);
    }

    @Override // p3.p
    public final void u(c0 c0Var) {
        synchronized (this.f135276c) {
            try {
                p1.u0<c0> u0VarA = this.f135290q;
                if (u0VarA == null) {
                    u0VarA = p1.i1.a();
                    this.f135290q = u0VarA;
                }
                u0VarA.d(c0Var);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p3.p
    public final e v(kotlin.s2 s2Var) {
        u1 u1Var = this.f135275b;
        return u1Var.f135322b.a(new u1.a(s2Var), u1Var.f135323c);
    }

    @Override // p3.p
    public final void y(r rVar) {
        synchronized (this.f135276c) {
            if (this.f135279f.remove(rVar)) {
                this.f135280g = null;
            }
            this.f135282i.j(rVar);
            this.f135283j.remove(rVar);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0006R\u00020\u00070\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp3/s2$a;", "", "<init>", "()V", "Lr53/z1;", "Lu3/e;", "Lp3/s2$c;", "Lp3/s2;", "_runningRecomposers", "Lr53/z1;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
