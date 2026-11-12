package r53;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u000eB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lr53/e2;", "T", "Ls53/a;", "Lr53/h2;", "Lr53/y1;", "Lr53/c;", "Ls53/t;", "", "replay", "bufferCapacity", "Lq53/a;", "onBufferOverflow", "<init>", "(IILq53/a;)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e2<T> extends s53.a<h2> implements y1<T>, c<T>, s53.t<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f150581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f150582f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q53.a f150583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f150584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f150585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f150586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f150587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f150588l;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lr53/e2$a;", "Lo53/u0;", "Lr53/e2;", "flow", "", FirebaseAnalytics.Param.INDEX, "", "value", "Lt13/d;", "", "cont", "<init>", "(Lr53/e2;JLjava/lang/Object;Lt13/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements o53.u0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e2<?> f150589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f150590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f150591c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t13.d<Unit> f150592d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e2<?> e2Var, long j8, Object obj, t13.d<? super Unit> dVar) {
            this.f150589a = e2Var;
            this.f150590b = j8;
            this.f150591c = obj;
            this.f150592d = dVar;
        }

        @Override // o53.u0
        public final void dispose() {
            e2<?> e2Var = this.f150589a;
            synchronized (e2Var) {
                if (this.f150590b < e2Var.q()) {
                    return;
                }
                Object[] objArr = e2Var.f150584h;
                objArr.getClass();
                long j8 = this.f150590b;
                u53.x xVar = g2.f150633a;
                if (objArr[((int) j8) & (objArr.length - 1)] != this) {
                    return;
                }
                g2.c(objArr, j8, g2.f150633a);
                e2Var.l();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150593a;

        static {
            int[] iArr = new int[q53.a.values().length];
            try {
                iArr[q53.a.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q53.a.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q53.a.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f150593a = iArr;
        }
    }

    public e2(int i14, int i15, q53.a aVar) {
        this.f150581e = i14;
        this.f150582f = i15;
        this.f150583g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (((r53.t2) r9).a(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u13.a m(e2 e2Var, j jVar, t13.d dVar) throws Throwable {
        f2 f2Var;
        e2 e2Var2;
        Throwable th3;
        h2 h2Var;
        j jVar2;
        o53.l1 l1Var;
        j jVar3;
        if (dVar instanceof f2) {
            f2Var = (f2) dVar;
            int i14 = f2Var.f150614g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f2Var.f150614g = i14 - Integer.MIN_VALUE;
            } else {
                f2Var = new f2(e2Var, dVar);
            }
        } else {
            f2Var = new f2(e2Var, dVar);
        }
        Object obj = f2Var.f150612e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f2Var.f150614g;
        if (i15 != 0) {
            if (i15 == 1) {
                h2Var = f2Var.f150610c;
                j jVar4 = f2Var.f150609b;
                e2 e2Var3 = f2Var.f150608a;
                try {
                    o13.r.b(obj);
                    jVar2 = jVar4;
                    e2Var = e2Var3;
                    try {
                        l1Var = (o53.l1) f2Var.getF129302c().get(o53.l1.f129368i0);
                        jVar3 = jVar2;
                    } catch (Throwable th4) {
                        e2Var2 = e2Var;
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    th3 = th5;
                    e2Var2 = e2Var3;
                }
            } else {
                if (i15 != 2 && i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o53.l1 l1Var2 = f2Var.f150611d;
                h2Var = f2Var.f150610c;
                j jVar5 = f2Var.f150609b;
                e2Var2 = f2Var.f150608a;
                try {
                    o13.r.b(obj);
                    jVar3 = jVar5;
                    l1Var = l1Var2;
                    e2Var = e2Var2;
                } catch (Throwable th6) {
                    th3 = th6;
                }
            }
            e2Var2.j(h2Var);
            throw th3;
        }
        o13.r.b(obj);
        h2 h2VarG = e2Var.g();
        try {
            if (jVar instanceof t2) {
                f2Var.f150608a = e2Var;
                f2Var.f150609b = jVar;
                f2Var.f150610c = h2VarG;
                f2Var.f150614g = 1;
            }
            jVar2 = jVar;
            h2Var = h2VarG;
            l1Var = (o53.l1) f2Var.getF129302c().get(o53.l1.f129368i0);
            jVar3 = jVar2;
        } catch (Throwable th7) {
            e2Var2 = e2Var;
            th3 = th7;
            h2Var = h2VarG;
        }
        while (true) {
            Object objV = e2Var.v(h2Var);
            if (objV == g2.f150633a) {
                f2Var.f150608a = e2Var;
                f2Var.f150609b = jVar3;
                f2Var.f150610c = h2Var;
                f2Var.f150611d = l1Var;
                f2Var.f150614g = 2;
                if (e2Var.k(h2Var, f2Var) == aVar) {
                    break;
                }
            } else {
                if (l1Var != null && !l1Var.isActive()) {
                    throw l1Var.Q();
                }
                f2Var.f150608a = e2Var;
                f2Var.f150609b = jVar3;
                f2Var.f150610c = h2Var;
                f2Var.f150611d = l1Var;
                f2Var.f150614g = 3;
                if (jVar3.emit(objV, f2Var) == aVar) {
                    break;
                }
            }
        }
        return aVar;
    }

    @Override // r53.d2
    public final List<T> a() {
        synchronized (this) {
            int iQ = (int) ((q() + ((long) this.f150587k)) - this.f150585i);
            if (iQ == 0) {
                return p13.j0.f134944a;
            }
            ArrayList arrayList = new ArrayList(iQ);
            Object[] objArr = this.f150584h;
            objArr.getClass();
            for (int i14 = 0; i14 < iQ; i14++) {
                long j8 = this.f150585i + ((long) i14);
                u53.x xVar = g2.f150633a;
                arrayList.add(objArr[((int) j8) & (objArr.length - 1)]);
            }
            return arrayList;
        }
    }

    @Override // r53.y1
    public final void c() throws Throwable {
        synchronized (this) {
            try {
                try {
                    w(q() + ((long) this.f150587k), this.f150586j, q() + ((long) this.f150587k), q() + ((long) this.f150587k) + ((long) this.f150588l));
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // r53.i
    public final Object collect(j<? super T> jVar, t13.d<?> dVar) {
        return m(this, jVar, dVar);
    }

    @Override // r53.y1
    public final boolean d(T t7) {
        int i14;
        boolean z14;
        t13.d<Unit>[] dVarArrP = s53.b.f157467a;
        synchronized (this) {
            if (t(t7)) {
                dVarArrP = p(dVarArrP);
                z14 = true;
            } else {
                z14 = false;
            }
        }
        for (t13.d<Unit> dVar : dVarArrP) {
            if (dVar != null) {
                int i15 = o13.q.f128596b;
                dVar.resumeWith(Unit.INSTANCE);
            }
        }
        return z14;
    }

    @Override // s53.t
    public final i<T> e(t13.g gVar, int i14, q53.a aVar) {
        return g2.d(this, gVar, i14, aVar);
    }

    @Override // r53.y1, r53.j
    public final Object emit(T t7, t13.d<? super Unit> dVar) throws Throwable {
        Throwable th3;
        t13.d<Unit>[] dVarArrP;
        a aVar;
        if (d(t7)) {
            return Unit.INSTANCE;
        }
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        t13.d<Unit>[] dVarArrP2 = s53.b.f157467a;
        synchronized (this) {
            try {
                if (t(t7)) {
                    try {
                        int i14 = o13.q.f128596b;
                        kVar.resumeWith(Unit.INSTANCE);
                        dVarArrP = p(dVarArrP2);
                        aVar = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                        throw th3;
                    }
                } else {
                    try {
                        a aVar2 = new a(this, q() + ((long) (this.f150587k + this.f150588l)), t7, kVar);
                        o(aVar2);
                        this.f150588l++;
                        if (this.f150582f == 0) {
                            dVarArrP2 = p(dVarArrP2);
                        }
                        dVarArrP = dVarArrP2;
                        aVar = aVar2;
                    } catch (Throwable th5) {
                        th = th5;
                        th3 = th;
                        throw th3;
                    }
                }
                if (aVar != null) {
                    kVar.t(new o53.v0(aVar));
                }
                for (t13.d<Unit> dVar2 : dVarArrP) {
                    if (dVar2 != null) {
                        int i15 = o13.q.f128596b;
                        dVar2.resumeWith(Unit.INSTANCE);
                    }
                }
                Object objP = kVar.p();
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                if (objP != aVar3) {
                    objP = Unit.INSTANCE;
                }
                return objP == aVar3 ? objP : Unit.INSTANCE;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // s53.a
    public final s53.c h() {
        return new h2();
    }

    @Override // s53.a
    public final s53.c[] i() {
        return new h2[2];
    }

    public final Object k(h2 h2Var, f2 f2Var) throws Throwable {
        o53.k kVar = new o53.k(u13.f.b(f2Var), 1);
        kVar.q();
        synchronized (this) {
            try {
                if (u(h2Var) < 0) {
                    h2Var.f150642b = kVar;
                } else {
                    int i14 = o13.q.f128596b;
                    kVar.resumeWith(Unit.INSTANCE);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    public final void l() {
        if (this.f150582f != 0 || this.f150588l > 1) {
            Object[] objArr = this.f150584h;
            objArr.getClass();
            while (this.f150588l > 0) {
                long jQ = q();
                int i14 = this.f150587k;
                int i15 = this.f150588l;
                if (objArr[((int) ((jQ + ((long) (i14 + i15))) - 1)) & (objArr.length - 1)] != g2.f150633a) {
                    return;
                }
                this.f150588l = i15 - 1;
                g2.c(objArr, q() + ((long) (this.f150587k + this.f150588l)), null);
            }
        }
    }

    public final void n() {
        Object[] objArr;
        Object[] objArr2 = this.f150584h;
        objArr2.getClass();
        g2.c(objArr2, q(), null);
        this.f150587k--;
        long jQ = q() + 1;
        if (this.f150585i < jQ) {
            this.f150585i = jQ;
        }
        if (this.f150586j < jQ) {
            if (this.f157462b != 0 && (objArr = this.f157461a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        h2 h2Var = (h2) obj;
                        long j8 = h2Var.f150641a;
                        if (j8 >= 0 && j8 < jQ) {
                            h2Var.f150641a = jQ;
                        }
                    }
                }
            }
            this.f150586j = jQ;
        }
    }

    public final void o(Object obj) {
        int i14 = this.f150587k + this.f150588l;
        Object[] objArrS = this.f150584h;
        if (objArrS == null) {
            objArrS = s(0, 2, null);
        } else if (i14 >= objArrS.length) {
            objArrS = s(i14, objArrS.length * 2, objArrS);
        }
        g2.c(objArrS, q() + ((long) i14), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [t13.d<kotlin.Unit>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final t13.d<Unit>[] p(t13.d<Unit>[] dVarArr) {
        Object[] objArr;
        h2 h2Var;
        o53.k kVar;
        int length = dVarArr.length;
        if (this.f157462b != 0 && (objArr = this.f157461a) != null) {
            int length2 = objArr.length;
            int i14 = 0;
            while (i14 < length2) {
                Object obj = objArr[i14];
                if (obj == null || (kVar = (h2Var = (h2) obj).f150642b) == null || u(h2Var) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        dVarArr = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((t13.d[]) dVarArr)[length] = kVar;
                    h2Var.f150642b = null;
                    length++;
                }
                i14++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (t13.d[]) dVarArr;
    }

    public final long q() {
        return Math.min(this.f150586j, this.f150585i);
    }

    public final T r() {
        Object[] objArr = this.f150584h;
        objArr.getClass();
        long jQ = (this.f150585i + ((long) ((int) ((q() + ((long) this.f150587k)) - this.f150585i)))) - 1;
        u53.x xVar = g2.f150633a;
        return (T) objArr[((int) jQ) & (objArr.length - 1)];
    }

    public final Object[] s(int i14, int i15, Object[] objArr) {
        if (i15 <= 0) {
            vb.h.z("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i15];
        this.f150584h = objArr2;
        if (objArr != null) {
            long jQ = q();
            for (int i16 = 0; i16 < i14; i16++) {
                long j8 = ((long) i16) + jQ;
                g2.c(objArr2, j8, objArr[((int) j8) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    public final boolean t(T t7) {
        int i14;
        long jQ;
        long j8;
        int i15 = this.f157462b;
        int i16 = this.f150581e;
        if (i15 != 0) {
            int i17 = this.f150587k;
            int i18 = this.f150582f;
            if (i17 < i18 || this.f150586j > this.f150585i) {
                o(t7);
                i14 = this.f150587k + 1;
                this.f150587k = i14;
                if (i14 > i18) {
                    n();
                }
                jQ = q() + ((long) this.f150587k);
                j8 = this.f150585i;
                if (((int) (jQ - j8)) > i16) {
                    w(1 + j8, this.f150586j, q() + ((long) this.f150587k), q() + ((long) this.f150587k) + ((long) this.f150588l));
                }
            } else {
                int i19 = b.f150593a[this.f150583g.ordinal()];
                if (i19 == 1) {
                    return false;
                }
                if (i19 != 2) {
                    if (i19 != 3) {
                        lc.u0.r();
                        return false;
                    }
                    o(t7);
                    i14 = this.f150587k + 1;
                    this.f150587k = i14;
                    if (i14 > i18) {
                        n();
                    }
                    jQ = q() + ((long) this.f150587k);
                    j8 = this.f150585i;
                    if (((int) (jQ - j8)) > i16) {
                        w(1 + j8, this.f150586j, q() + ((long) this.f150587k), q() + ((long) this.f150587k) + ((long) this.f150588l));
                    }
                }
            }
        } else if (i16 != 0) {
            o(t7);
            int i24 = this.f150587k + 1;
            this.f150587k = i24;
            if (i24 > i16) {
                n();
            }
            this.f150586j = q() + ((long) this.f150587k);
            return true;
        }
        return true;
    }

    public final long u(h2 h2Var) {
        long j8 = h2Var.f150641a;
        if (j8 < q() + ((long) this.f150587k)) {
            return j8;
        }
        if (this.f150582f <= 0 && j8 <= q() && this.f150588l != 0) {
            return j8;
        }
        return -1L;
    }

    public final Object v(h2 h2Var) {
        Object obj;
        t13.d<Unit>[] dVarArrX = s53.b.f157467a;
        synchronized (this) {
            try {
                long jU = u(h2Var);
                if (jU < 0) {
                    obj = g2.f150633a;
                } else {
                    long j8 = h2Var.f150641a;
                    Object[] objArr = this.f150584h;
                    objArr.getClass();
                    u53.x xVar = g2.f150633a;
                    Object obj2 = objArr[((int) jU) & (objArr.length - 1)];
                    if (obj2 instanceof a) {
                        obj2 = ((a) obj2).f150591c;
                    }
                    h2Var.f150641a = jU + 1;
                    Object obj3 = obj2;
                    dVarArrX = x(j8);
                    obj = obj3;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        for (t13.d<Unit> dVar : dVarArrX) {
            if (dVar != null) {
                int i14 = o13.q.f128596b;
                dVar.resumeWith(Unit.INSTANCE);
            }
        }
        return obj;
    }

    public final void w(long j8, long j14, long j15, long j16) {
        long jMin = Math.min(j14, j8);
        for (long jQ = q(); jQ < jMin; jQ++) {
            Object[] objArr = this.f150584h;
            objArr.getClass();
            g2.c(objArr, jQ, null);
        }
        this.f150585i = j8;
        this.f150586j = j14;
        this.f150587k = (int) (j15 - jMin);
        this.f150588l = (int) (j16 - j15);
    }

    public final t13.d<Unit>[] x(long j8) {
        int i14;
        long j14;
        long j15;
        t13.d<Unit>[] dVarArr;
        t13.d<Unit>[] dVarArr2;
        Object[] objArr;
        long j16 = this.f150586j;
        t13.d<Unit>[] dVarArr3 = s53.b.f157467a;
        if (j8 <= j16) {
            long jQ = q();
            long j17 = ((long) this.f150587k) + jQ;
            int i15 = this.f150582f;
            if (i15 == 0 && this.f150588l > 0) {
                j17++;
            }
            int i16 = 0;
            if (this.f157462b != 0 && (objArr = this.f157461a) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j18 = ((h2) obj).f150641a;
                        if (j18 >= 0 && j18 < j17) {
                            j17 = j18;
                        }
                    }
                }
            }
            if (j17 > this.f150586j) {
                long jQ2 = q() + ((long) this.f150587k);
                int i17 = this.f157462b;
                int iMin = this.f150588l;
                if (i17 > 0) {
                    iMin = Math.min(iMin, i15 - ((int) (jQ2 - j17)));
                }
                long j19 = ((long) this.f150588l) + jQ2;
                if (iMin > 0) {
                    t13.d<Unit>[] dVarArr4 = new t13.d[iMin];
                    Object[] objArr2 = this.f150584h;
                    objArr2.getClass();
                    j15 = 1;
                    long j24 = jQ2;
                    while (true) {
                        if (jQ2 >= j19) {
                            i14 = i15;
                            dVarArr2 = dVarArr4;
                            j14 = jQ;
                            jQ2 = j24;
                            break;
                        }
                        i14 = i15;
                        Object obj2 = objArr2[((int) jQ2) & (objArr2.length - 1)];
                        dVarArr2 = dVarArr4;
                        u53.x xVar = g2.f150633a;
                        if (obj2 != xVar) {
                            obj2.getClass();
                            a aVar = (a) obj2;
                            j14 = jQ;
                            int i18 = i16 + 1;
                            dVarArr2[i16] = aVar.f150592d;
                            g2.c(objArr2, jQ2, xVar);
                            g2.c(objArr2, j24, aVar.f150591c);
                            long j25 = j24 + 1;
                            if (i18 >= iMin) {
                                jQ2 = j25;
                                break;
                            }
                            j24 = j25;
                            i16 = i18;
                        } else {
                            j14 = jQ;
                        }
                        jQ2++;
                        i15 = i14;
                        dVarArr4 = dVarArr2;
                        jQ = j14;
                    }
                    dVarArr = dVarArr2;
                } else {
                    i14 = i15;
                    j14 = jQ;
                    j15 = 1;
                    dVarArr = dVarArr3;
                }
                int i19 = (int) (jQ2 - j14);
                long j26 = this.f157462b == 0 ? jQ2 : j17;
                long jMax = Math.max(this.f150585i, jQ2 - ((long) Math.min(this.f150581e, i19)));
                if (i14 == 0 && jMax < j19) {
                    Object[] objArr3 = this.f150584h;
                    objArr3.getClass();
                    if (p005kotlin.jvm.internal.s.g(objArr3[((int) jMax) & (objArr3.length - 1)], g2.f150633a)) {
                        jQ2 += j15;
                        jMax += j15;
                    }
                }
                w(jMax, j26, jQ2, j19);
                l();
                return dVarArr.length == 0 ? dVarArr : p(dVarArr);
            }
        }
        return dVarArr3;
    }
}
