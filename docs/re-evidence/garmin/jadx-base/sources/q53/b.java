package q53;

import ch.qos.logback.core.CoreConstants;
import com.google.common.primitives.Longs;
import d53.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o53.n2;
import o62.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.y0;
import v.e0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0017\u0018B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nR\u000b\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004R\u000b\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004R\u000b\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004R\u000b\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082\u0004R\u0017\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004R\u0017\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004R\u0017\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u00108\u0002X\u0082\u0004R\u0013\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00108\u0002X\u0082\u0004R\u0013\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00108\u0002X\u0082\u0004¨\u0006\u0019"}, d2 = {"Lq53/b;", "E", "Lq53/i;", "", "capacity", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILe23/l;)V", "", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lh53/b;", "Lq53/n;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b<E> implements i<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f142949d = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f142950e = AtomicLongFieldUpdater.newUpdater(b.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f142951f = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f142952g = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f142953h = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f142954i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f142955j = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f142956k = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f142957l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<E, Unit> f142959b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s0 f142960c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lq53/b$a;", "Lq53/k;", "Lo53/n2;", "<init>", "(Lq53/b;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements k<E>, n2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f142961a = h.f142990p;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.k<? super Boolean> f142962b;

        public a() {
        }

        @Override // q53.k
        public final Object a(v13.c cVar) throws Throwable {
            n<E> nVarS;
            Boolean bool;
            Object obj = this.f142961a;
            boolean z14 = true;
            if (obj == h.f142990p || obj == h.f142986l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f142954i;
                b<E> bVar = b.this;
                n<E> nVar = (n) atomicReferenceFieldUpdater.get(bVar);
                while (!bVar.z()) {
                    long andIncrement = b.f142950e.getAndIncrement(bVar);
                    long j8 = h.f142976b;
                    long j14 = andIncrement / j8;
                    int i14 = (int) (andIncrement % j8);
                    if (nVar.f168771c != j14) {
                        nVarS = bVar.s(j14, nVar);
                        if (nVarS == null) {
                            continue;
                        }
                    } else {
                        nVarS = nVar;
                    }
                    Object objJ = bVar.J(nVarS, i14, andIncrement, null);
                    u53.x xVar = h.f142987m;
                    o72.b bVar2 = null;
                    if (objJ == xVar) {
                        vb.h.z("unreachable");
                        return null;
                    }
                    u53.x xVar2 = h.f142989o;
                    if (objJ == xVar2) {
                        if (andIncrement < bVar.w()) {
                            nVarS.b();
                        }
                        nVar = nVarS;
                    } else {
                        if (objJ == h.f142988n) {
                            b<E> bVar3 = b.this;
                            o53.k<? super Boolean> kVarA = gg.b.A(u13.f.b(cVar));
                            try {
                                this.f142962b = kVarA;
                                Object objJ2 = bVar3.J(nVarS, i14, andIncrement, this);
                                e23.l<E, Unit> lVar = bVar3.f142959b;
                                if (objJ2 != xVar) {
                                    if (objJ2 == xVar2) {
                                        if (andIncrement < bVar3.w()) {
                                            nVarS.b();
                                        }
                                        n<E> nVar2 = (n) b.f142954i.get(bVar3);
                                        while (true) {
                                            if (bVar3.z()) {
                                                o53.k<? super Boolean> kVar = this.f142962b;
                                                kVar.getClass();
                                                this.f142962b = null;
                                                this.f142961a = h.f142986l;
                                                Throwable thT = bVar.t();
                                                if (thT != null) {
                                                    int i15 = o13.q.f128596b;
                                                    kVar.resumeWith(new o13.q.b(thT));
                                                    break;
                                                }
                                                int i16 = o13.q.f128596b;
                                                kVar.resumeWith(Boolean.FALSE);
                                                break;
                                            }
                                            long andIncrement2 = b.f142950e.getAndIncrement(bVar3);
                                            long j15 = h.f142976b;
                                            long j16 = andIncrement2 / j15;
                                            int i17 = (int) (andIncrement2 % j15);
                                            if (nVar2.f168771c != j16) {
                                                n<E> nVarS2 = bVar3.s(j16, nVar2);
                                                if (nVarS2 != null) {
                                                    nVar2 = nVarS2;
                                                }
                                            }
                                            Object objJ3 = bVar3.J(nVar2, i17, andIncrement2, this);
                                            if (objJ3 == h.f142987m) {
                                                b(nVar2, i17);
                                                break;
                                            }
                                            if (objJ3 == h.f142989o) {
                                                if (andIncrement2 < bVar3.w()) {
                                                    nVar2.b();
                                                }
                                            } else {
                                                if (objJ3 == h.f142988n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                nVar2.b();
                                                this.f142961a = objJ3;
                                                this.f142962b = null;
                                                bool = Boolean.TRUE;
                                                if (lVar != null) {
                                                    bVar2 = new o72.b(12, lVar, objJ3);
                                                }
                                            }
                                        }
                                    } else {
                                        nVarS.b();
                                        this.f142961a = objJ2;
                                        this.f142962b = null;
                                        bool = Boolean.TRUE;
                                        if (lVar != null) {
                                            bVar2 = new o72.b(12, lVar, objJ2);
                                        }
                                    }
                                    kVarA.y(bool, bVar2);
                                    break;
                                }
                                b(nVarS, i14);
                                Object objP = kVarA.p();
                                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                                return objP;
                            } catch (Throwable th3) {
                                kVarA.z();
                                throw th3;
                            }
                        }
                        nVarS.b();
                        this.f142961a = objJ;
                    }
                }
                this.f142961a = h.f142986l;
                Throwable thT2 = bVar.t();
                if (thT2 != null) {
                    int i18 = u53.w.f168773a;
                    throw thT2;
                }
                z14 = false;
            }
            return Boolean.valueOf(z14);
        }

        @Override // o53.n2
        public final void b(u53.u<?> uVar, int i14) {
            o53.k<? super Boolean> kVar = this.f142962b;
            if (kVar != null) {
                kVar.b(uVar, i14);
            }
        }

        @Override // q53.k
        public final E next() throws Throwable {
            E e4 = (E) this.f142961a;
            u53.x xVar = h.f142990p;
            if (e4 == xVar) {
                vb.h.z("`hasNext()` has not been invoked");
                return null;
            }
            this.f142961a = xVar;
            if (e4 != h.f142986l) {
                return e4;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f142949d;
            Throwable thU = b.this.u();
            int i14 = u53.w.f168773a;
            throw thU;
        }
    }

    /* JADX INFO: renamed from: q53.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lq53/b$b;", "Lo53/n2;", "Lo53/j;", "", "cont", "<init>", "(Lo53/j;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2689b implements n2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o53.k<Boolean> f142964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o53.j<Boolean> f142965b;

        /* JADX WARN: Multi-variable type inference failed */
        public C2689b(o53.j<? super Boolean> jVar) {
            jVar.getClass();
            this.f142964a = (o53.k) jVar;
            this.f142965b = jVar;
        }

        @Override // o53.n2
        public final void b(u53.u<?> uVar, int i14) {
            this.f142964a.b(uVar, i14);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.q<b<?>, y53.h<?>, Object, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f142966a = new c();

        public c() {
            super(3, b.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // e23.q
        public final Unit invoke(b<?> bVar, y53.h<?> hVar, Object obj) {
            n<?> nVar;
            b<?> bVar2 = bVar;
            y53.h<?> hVar2 = hVar;
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f142949d;
            bVar2.getClass();
            n<?> nVar2 = (n) b.f142954i.get(bVar2);
            while (!bVar2.z()) {
                long andIncrement = b.f142950e.getAndIncrement(bVar2);
                long j8 = h.f142976b;
                long j14 = andIncrement / j8;
                int i14 = (int) (andIncrement % j8);
                if (nVar2.f168771c != j14) {
                    n<?> nVarS = bVar2.s(j14, nVar2);
                    if (nVarS == null) {
                        continue;
                    } else {
                        nVar = nVarS;
                    }
                } else {
                    nVar = nVar2;
                }
                Object objJ = bVar2.J(nVar, i14, andIncrement, hVar2);
                n<?> nVar3 = nVar;
                if (objJ == h.f142987m) {
                    n2 n2Var = hVar2 instanceof n2 ? (n2) hVar2 : null;
                    if (n2Var != null) {
                        n2Var.b(nVar3, i14);
                    }
                } else if (objJ == h.f142989o) {
                    if (andIncrement < bVar2.w()) {
                        nVar3.b();
                    }
                    nVar2 = nVar3;
                } else {
                    if (objJ == h.f142988n) {
                        vb.h.z("unexpected");
                        return null;
                    }
                    nVar3.b();
                    hVar2.c(objJ);
                }
                return Unit.INSTANCE;
            }
            hVar2.c(h.f142986l);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.q<b<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f142967a = new d();

        public d() {
            super(3, b.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // e23.q
        public final Object invoke(b<?> bVar, Object obj, Object obj2) {
            b<?> bVar2 = bVar;
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f142949d;
            bVar2.getClass();
            if (obj2 == h.f142986l) {
                m.b bVar3 = m.f142998b;
                Throwable thT = bVar2.t();
                bVar3.getClass();
                obj2 = m.b.a(thT);
            } else {
                m.f142998b.getClass();
            }
            return m.a(obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(int i14, e23.l<? super E, Unit> lVar) {
        long j8;
        this.f142958a = i14;
        this.f142959b = lVar;
        if (i14 < 0) {
            vb.h.x(e0.f(i14, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        n<Object> nVar = h.f142975a;
        if (i14 != 0) {
            j8 = i14 != Integer.MAX_VALUE ? i14 : Long.MAX_VALUE;
        } else {
            j8 = 0;
        }
        this.bufferEnd$volatile = j8;
        this.completedExpandBuffersAndPauseFlag$volatile = f142951f.get(this);
        n<Object> nVar2 = new n<>(0L, null, this, 3);
        this.sendSegment$volatile = nVar2;
        this.receiveSegment$volatile = nVar2;
        if (B()) {
            nVar2 = h.f142975a;
            nVar2.getClass();
        }
        this.bufferEndSegment$volatile = nVar2;
        this.f142960c = lVar != 0 ? new s0(this, 9) : null;
        this._closeCause$volatile = h.f142993s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object E(b bVar, v13.c cVar) throws Throwable {
        e eVar;
        n<E> nVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f142970c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f142970c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(bVar, cVar);
            }
        } else {
            eVar = new e(bVar, cVar);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f142968a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar2.f142970c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((m) obj).f143000a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        n<E> nVar2 = (n) f142954i.get(bVar);
        while (!bVar.z()) {
            long andIncrement = f142950e.getAndIncrement(bVar);
            long j8 = h.f142976b;
            long j14 = andIncrement / j8;
            int i16 = (int) (andIncrement % j8);
            if (nVar2.f168771c != j14) {
                n<E> nVarS = bVar.s(j14, nVar2);
                if (nVarS == null) {
                    continue;
                } else {
                    nVar = nVarS;
                }
            } else {
                nVar = nVar2;
            }
            b bVar2 = bVar;
            Object objJ = bVar2.J(nVar, i16, andIncrement, null);
            if (objJ == h.f142987m) {
                vb.h.z("unexpected");
                return null;
            }
            if (objJ != h.f142989o) {
                if (objJ == h.f142988n) {
                    eVar2.f142970c = 1;
                    Object objF = bVar2.F(nVar, i16, andIncrement, eVar2);
                    return objF == aVar ? aVar : objF;
                }
                nVar.b();
                m.f142998b.getClass();
                return objJ;
            }
            if (andIncrement < bVar2.w()) {
                nVar.b();
            }
            bVar = bVar2;
            nVar2 = nVar;
        }
        m.b bVar3 = m.f142998b;
        Throwable thT = bVar.t();
        bVar3.getClass();
        return m.b.a(thT);
    }

    public static final n a(b bVar, long j8, n nVar) {
        Object objA;
        b bVar2;
        n<Object> nVar2 = h.f142975a;
        g gVar = g.f142974a;
        loop0: while (true) {
            objA = u53.b.a(nVar, j8, gVar);
            if (!u53.v.b(objA)) {
                u53.u uVarA = u53.v.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142953h;
                    u53.u uVar = (u53.u) atomicReferenceFieldUpdater.get(bVar);
                    if (uVar.f168771c >= uVarA.f168771c) {
                        break loop0;
                    }
                    if (!uVarA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bVar, uVar, uVarA)) {
                            if (!uVar.f()) {
                                break loop0;
                            }
                            uVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bVar) == uVar);
                    if (uVarA.f()) {
                        uVarA.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB = u53.v.b(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f142950e;
        if (zB) {
            bVar.d();
            if (nVar.f168771c * ((long) h.f142976b) < atomicLongFieldUpdater.get(bVar)) {
                nVar.b();
                return null;
            }
        } else {
            n nVar3 = (n) u53.v.a(objA);
            long j14 = nVar3.f168771c;
            if (j14 <= j8) {
                return nVar3;
            }
            long j15 = ((long) h.f142976b) * j14;
            while (true) {
                long j16 = f142949d.get(bVar);
                long j17 = 1152921504606846975L & j16;
                if (j17 >= j15) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (f142949d.compareAndSet(bVar2, j16, (((long) ((int) (j16 >> 60))) << 60) + j17)) {
                    break;
                }
                bVar = bVar2;
            }
            if (j14 * ((long) h.f142976b) < atomicLongFieldUpdater.get(bVar2)) {
                nVar3.b();
            }
        }
        return null;
    }

    public static final void e(b bVar, Object obj, o53.k kVar) {
        e23.l<E, Unit> lVar = bVar.f142959b;
        if (lVar != null) {
            og.a.t(lVar, obj, kVar.f129362e);
        }
        Throwable thV = bVar.v();
        int i14 = o13.q.f128596b;
        kVar.resumeWith(new o13.q.b(thV));
    }

    public static final int f(b bVar, n nVar, int i14, Object obj, long j8, Object obj2, boolean z14) {
        nVar.n(i14, obj);
        if (z14) {
            return bVar.K(nVar, i14, obj, j8, obj2, z14);
        }
        Object objL = nVar.l(i14);
        if (objL == null) {
            if (bVar.l(j8)) {
                if (nVar.k(i14, null, h.f142978d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (nVar.k(i14, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof n2) {
            nVar.n(i14, null);
            if (bVar.H(objL, obj)) {
                nVar.o(i14, h.f142983i);
                return 0;
            }
            u53.x xVar = h.f142985k;
            if (nVar.f143003f.getAndSet((i14 * 2) + 1, xVar) == xVar) {
                return 5;
            }
            nVar.m(i14, true);
            return 5;
        }
        return bVar.K(nVar, i14, obj, j8, obj2, z14);
    }

    public static void x(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f142952g;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & Longs.MAX_POWER_OF_TWO) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & Longs.MAX_POWER_OF_TWO) != 0) {
            }
        }
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long j8 = f142951f.get(this);
        return j8 == 0 || j8 == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(long j8, n<E> nVar) {
        n<E> nVar2;
        n<E> nVar3;
        while (nVar.f168771c < j8 && (nVar3 = (n) nVar.c()) != null) {
            nVar = nVar3;
        }
        while (true) {
            if (!nVar.d() || (nVar2 = (n) nVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142955j;
                    u53.u uVar = (u53.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f168771c >= nVar.f168771c) {
                        return;
                    }
                    if (!nVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, nVar)) {
                            if (uVar.f()) {
                                uVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (nVar.f()) {
                        nVar.e();
                    }
                }
            } else {
                nVar = nVar2;
            }
        }
    }

    public final Object D(E e4, t13.d<? super Unit> dVar) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionU;
        o53.k kVar = new o53.k(u13.f.b(dVar), 1);
        kVar.q();
        e23.l<E, Unit> lVar = this.f142959b;
        if (lVar == null || (undeliveredElementExceptionU = og.a.u(lVar, e4, null)) == null) {
            Throwable thV = v();
            int i14 = o13.q.f128596b;
            kVar.resumeWith(new o13.q.b(thV));
        } else {
            o13.g.a(undeliveredElementExceptionU, v());
            int i15 = o13.q.f128596b;
            kVar.resumeWith(new o13.q.b(undeliveredElementExceptionU));
        }
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object F(n nVar, int i14, long j8, v13.c cVar) throws Throwable {
        f fVar;
        m mVarA;
        n<E> nVarS;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f142973c;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f142973c = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objP = fVar.f142971a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f142973c;
        q53.d dVar = null;
        if (i16 == 0) {
            o13.r.b(objP);
            fVar.f142973c = 1;
            o53.k kVarA = gg.b.A(u13.f.b(fVar));
            try {
                u uVar = new u(kVarA);
                Object objJ = J(nVar, i14, j8, uVar);
                if (objJ != h.f142987m) {
                    u53.x xVar = h.f142989o;
                    e23.l<E, Unit> lVar = this.f142959b;
                    if (objJ == xVar) {
                        if (j8 < w()) {
                            nVar.b();
                        }
                        n<E> nVar2 = (n) f142954i.get(this);
                        while (true) {
                            if (z()) {
                                int i17 = o13.q.f128596b;
                                m.b bVar = m.f142998b;
                                Throwable thT = t();
                                bVar.getClass();
                                kVarA.resumeWith(m.a(m.b.a(thT)));
                                break;
                            }
                            long andIncrement = f142950e.getAndIncrement(this);
                            long j14 = h.f142976b;
                            long j15 = andIncrement / j14;
                            int i18 = (int) (andIncrement % j14);
                            if (nVar2.f168771c != j15) {
                                nVarS = s(j15, nVar2);
                                if (nVarS == null) {
                                }
                            } else {
                                nVarS = nVar2;
                            }
                            Object objJ2 = J(nVarS, i18, andIncrement, uVar);
                            if (objJ2 == h.f142987m) {
                                uVar.b(nVarS, i18);
                                break;
                            }
                            if (objJ2 == h.f142989o) {
                                if (andIncrement < w()) {
                                    nVarS.b();
                                }
                                nVar2 = nVarS;
                            } else {
                                if (objJ2 == h.f142988n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                nVarS.b();
                                m.f142998b.getClass();
                                mVarA = m.a(objJ2);
                                if (lVar != null) {
                                    dVar = new q53.d(this);
                                }
                            }
                        }
                    } else {
                        nVar.b();
                        m.f142998b.getClass();
                        mVarA = m.a(objJ);
                        if (lVar != null) {
                            dVar = new q53.d(this);
                        }
                    }
                    kVarA.y(mVarA, dVar);
                    break;
                }
                uVar.b(nVar, i14);
                objP = kVarA.p();
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                if (objP == aVar) {
                    return aVar;
                }
            } catch (Throwable th3) {
                kVarA.z();
                throw th3;
            }
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objP);
        }
        return ((m) objP).f143000a;
    }

    public final void G(n2 n2Var, boolean z14) {
        if (n2Var instanceof C2689b) {
            o53.j<Boolean> jVar = ((C2689b) n2Var).f142965b;
            int i14 = o13.q.f128596b;
            jVar.resumeWith(Boolean.FALSE);
            return;
        }
        if (n2Var instanceof o53.j) {
            t13.d dVar = (t13.d) n2Var;
            int i15 = o13.q.f128596b;
            dVar.resumeWith(new o13.q.b(z14 ? u() : v()));
            return;
        }
        if (n2Var instanceof u) {
            o53.k<m<? extends E>> kVar = ((u) n2Var).f143015a;
            int i16 = o13.q.f128596b;
            m.b bVar = m.f142998b;
            Throwable thT = t();
            bVar.getClass();
            kVar.resumeWith(m.a(m.b.a(thT)));
            return;
        }
        if (!(n2Var instanceof a)) {
            if (n2Var instanceof y53.h) {
                ((y53.h) n2Var).d(this, h.f142986l);
                return;
            } else {
                ds.e0.t(n2Var, "Unexpected waiter: ");
                return;
            }
        }
        a aVar = (a) n2Var;
        o53.k<? super Boolean> kVar2 = aVar.f142962b;
        kVar2.getClass();
        aVar.f142962b = null;
        aVar.f142961a = h.f142986l;
        Throwable thT2 = b.this.t();
        if (thT2 == null) {
            int i17 = o13.q.f128596b;
            kVar2.resumeWith(Boolean.FALSE);
        } else {
            int i18 = o13.q.f128596b;
            kVar2.resumeWith(new o13.q.b(thT2));
        }
    }

    public final boolean H(Object obj, E e4) {
        if (obj instanceof y53.h) {
            return ((y53.h) obj).d(this, e4);
        }
        boolean z14 = obj instanceof u;
        e23.l<E, Unit> lVar = this.f142959b;
        if (z14) {
            o53.k<m<? extends E>> kVar = ((u) obj).f143015a;
            m.f142998b.getClass();
            return h.a(kVar, m.a(e4), lVar != null ? new q53.d(this) : null);
        }
        if (!(obj instanceof a)) {
            if (obj instanceof o53.j) {
                return h.a((o53.j) obj, e4, lVar != null ? new q53.c(this) : null);
            }
            ds.e0.t(obj, "Unexpected receiver type: ");
            return false;
        }
        a aVar = (a) obj;
        o53.k<? super Boolean> kVar2 = aVar.f142962b;
        kVar2.getClass();
        aVar.f142962b = null;
        aVar.f142961a = e4;
        Boolean bool = Boolean.TRUE;
        e23.l<E, Unit> lVar2 = b.this.f142959b;
        return h.a(kVar2, bool, lVar2 != null ? new o72.b(12, lVar2, e4) : null);
    }

    public final boolean I(Object obj, n<E> nVar, int i14) {
        y53.j jVar;
        if (obj instanceof o53.j) {
            return h.a((o53.j) obj, Unit.INSTANCE, null);
        }
        if (!(obj instanceof y53.h)) {
            if (obj instanceof C2689b) {
                return h.a(((C2689b) obj).f142965b, Boolean.TRUE, null);
            }
            ds.e0.t(obj, "Unexpected waiter: ");
            return false;
        }
        int i15 = ((y53.f) obj).i(this, Unit.INSTANCE);
        y53.i.a aVar = y53.i.f194575a;
        if (i15 == 0) {
            jVar = y53.j.SUCCESSFUL;
        } else if (i15 == 1) {
            jVar = y53.j.REREGISTER;
        } else if (i15 == 2) {
            jVar = y53.j.CANCELLED;
        } else {
            if (i15 != 3) {
                sn.a.k(i15, "Unexpected internal result: ");
                return false;
            }
            jVar = y53.j.ALREADY_SELECTED;
        }
        if (jVar == y53.j.REREGISTER) {
            nVar.n(i14, null);
        }
        return jVar == y53.j.SUCCESSFUL;
    }

    public final Object J(n<E> nVar, int i14, long j8, Object obj) {
        Object objL = nVar.l(i14);
        AtomicReferenceArray atomicReferenceArray = nVar.f143003f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f142949d;
        if (objL == null) {
            if (j8 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return h.f142988n;
                }
                if (nVar.k(i14, objL, obj)) {
                    r();
                    return h.f142987m;
                }
            }
        } else if (objL == h.f142978d && nVar.k(i14, objL, h.f142983i)) {
            r();
            Object obj2 = atomicReferenceArray.get(i14 * 2);
            nVar.n(i14, null);
            return obj2;
        }
        while (true) {
            Object objL2 = nVar.l(i14);
            if (objL2 == null || objL2 == h.f142979e) {
                if (j8 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (nVar.k(i14, objL2, h.f142982h)) {
                        r();
                        return h.f142989o;
                    }
                } else {
                    if (obj == null) {
                        return h.f142988n;
                    }
                    if (nVar.k(i14, objL2, obj)) {
                        r();
                        return h.f142987m;
                    }
                }
            } else {
                if (objL2 != h.f142978d) {
                    u53.x xVar = h.f142984j;
                    if (objL2 != xVar && objL2 != h.f142982h) {
                        if (objL2 == h.f142986l) {
                            r();
                            return h.f142989o;
                        }
                        if (objL2 != h.f142981g && nVar.k(i14, objL2, h.f142980f)) {
                            boolean z14 = objL2 instanceof x;
                            if (z14) {
                                objL2 = ((x) objL2).f143016a;
                            }
                            if (I(objL2, nVar, i14)) {
                                nVar.o(i14, h.f142983i);
                                r();
                                Object obj3 = atomicReferenceArray.get(i14 * 2);
                                nVar.n(i14, null);
                                return obj3;
                            }
                            nVar.o(i14, xVar);
                            nVar.i();
                            if (z14) {
                                r();
                            }
                            return h.f142989o;
                        }
                    }
                    return h.f142989o;
                }
                if (nVar.k(i14, objL2, h.f142983i)) {
                    r();
                    Object obj4 = atomicReferenceArray.get(i14 * 2);
                    nVar.n(i14, null);
                    return obj4;
                }
            }
        }
    }

    public final int K(n<E> nVar, int i14, E e4, long j8, Object obj, boolean z14) {
        while (true) {
            Object objL = nVar.l(i14);
            if (objL == null) {
                if (!l(j8) || z14) {
                    if (z14) {
                        if (nVar.k(i14, null, h.f142984j)) {
                            nVar.i();
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (nVar.k(i14, null, obj)) {
                            return 2;
                        }
                    }
                } else if (nVar.k(i14, null, h.f142978d)) {
                    break;
                }
            } else {
                if (objL != h.f142979e) {
                    u53.x xVar = h.f142985k;
                    if (objL == xVar) {
                        nVar.n(i14, null);
                        return 5;
                    }
                    if (objL == h.f142982h) {
                        nVar.n(i14, null);
                        return 5;
                    }
                    if (objL == h.f142986l) {
                        nVar.n(i14, null);
                        d();
                        return 4;
                    }
                    nVar.n(i14, null);
                    if (objL instanceof x) {
                        objL = ((x) objL).f143016a;
                    }
                    if (H(objL, e4)) {
                        nVar.o(i14, h.f142983i);
                        return 0;
                    }
                    if (nVar.f143003f.getAndSet((i14 * 2) + 1, xVar) != xVar) {
                        nVar.m(i14, true);
                    }
                    return 5;
                }
                if (nVar.k(i14, objL, h.f142978d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void L(long j8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b<E> bVar = this;
        if (bVar.B()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f142951f;
            if (atomicLongFieldUpdater.get(bVar) > j8) {
                break;
            } else {
                bVar = this;
            }
        }
        int i14 = h.f142977c;
        int i15 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f142952g;
            if (i15 < i14) {
                long j14 = atomicLongFieldUpdater.get(bVar);
                if (j14 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j14 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i15++;
                }
            } else {
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j15, (j15 & 4611686018427387903L) + Longs.MAX_POWER_OF_TWO)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j16 = atomicLongFieldUpdater.get(bVar);
                    long j17 = atomicLongFieldUpdater2.get(bVar);
                    long j18 = j17 & 4611686018427387903L;
                    boolean z14 = (j17 & Longs.MAX_POWER_OF_TWO) != 0;
                    if (j16 == j18 && j16 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z14) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j17, Longs.MAX_POWER_OF_TWO + j18);
                    }
                }
                while (true) {
                    long j19 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j19, j19 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    @Override // q53.v
    public final Object b(v13.i iVar) {
        return E(this, iVar);
    }

    @Override // q53.v
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(cancellationException, true);
    }

    @Override // q53.w
    public final boolean d() {
        return y(f142949d.get(this), false);
    }

    @Override // q53.v
    public final Object g(t13.d<? super E> dVar) throws Throwable {
        n<E> nVar;
        Throwable th3;
        n<E> nVar2;
        b<E> bVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142954i;
        n<E> nVar3 = (n) atomicReferenceFieldUpdater.get(this);
        while (!z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f142950e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j8 = h.f142976b;
            long j14 = andIncrement / j8;
            int i14 = (int) (andIncrement % j8);
            if (nVar3.f168771c != j14) {
                n<E> nVarS = s(j14, nVar3);
                if (nVarS == null) {
                    continue;
                } else {
                    nVar = nVarS;
                }
            } else {
                nVar = nVar3;
            }
            Object objJ = J(nVar, i14, andIncrement, null);
            u53.x xVar = h.f142987m;
            q53.c cVar = null;
            if (objJ == xVar) {
                vb.h.z("unexpected");
                return null;
            }
            u53.x xVar2 = h.f142989o;
            if (objJ == xVar2) {
                if (andIncrement < w()) {
                    nVar.b();
                }
                nVar3 = nVar;
            } else {
                if (objJ != h.f142988n) {
                    nVar.b();
                    return objJ;
                }
                o53.k kVarA = gg.b.A(u13.f.b(dVar));
                b<E> bVar2 = this;
                try {
                    Object objJ2 = bVar2.J(nVar, i14, andIncrement, kVarA);
                    if (objJ2 != xVar) {
                        e23.l<E, Unit> lVar = bVar2.f142959b;
                        if (objJ2 == xVar2) {
                            if (andIncrement < w()) {
                                nVar.b();
                            }
                            n<E> nVar4 = (n) atomicReferenceFieldUpdater.get(this);
                            while (true) {
                                if (z()) {
                                    int i15 = o13.q.f128596b;
                                    kVarA.resumeWith(new o13.q.b(u()));
                                    break;
                                }
                                o53.k kVar = kVarA;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                    long j15 = h.f142976b;
                                    long j16 = andIncrement2 / j15;
                                    int i16 = (int) (andIncrement2 % j15);
                                    try {
                                        if (nVar4.f168771c != j16) {
                                            try {
                                                n<E> nVarS2 = s(j16, nVar4);
                                                if (nVarS2 == null) {
                                                    kVarA = kVar;
                                                } else {
                                                    nVar2 = nVarS2;
                                                }
                                            } catch (Throwable th4) {
                                                th3 = th4;
                                                kVarA = kVar;
                                                kVarA.z();
                                                throw th3;
                                            }
                                        } else {
                                            nVar2 = nVar4;
                                        }
                                        objJ2 = bVar.J(nVar2, i16, andIncrement2, kVar);
                                        bVar2 = bVar;
                                        n<E> nVar5 = nVar2;
                                        kVarA = kVar;
                                        if (objJ2 == h.f142987m) {
                                            kVarA.b(nVar5, i16);
                                            break;
                                        }
                                        if (objJ2 == h.f142989o) {
                                            if (andIncrement2 < w()) {
                                                nVar5.b();
                                            }
                                            nVar4 = nVar5;
                                        } else {
                                            if (objJ2 == h.f142988n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            nVar5.b();
                                            if (lVar != null) {
                                                cVar = new q53.c(this);
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        kVarA = kVar;
                                        th3 = th;
                                        kVarA.z();
                                        throw th3;
                                    }
                                    bVar = bVar2;
                                } catch (Throwable th6) {
                                    th = th6;
                                }
                            }
                        } else {
                            nVar.b();
                            if (lVar != null) {
                                cVar = new q53.c(this);
                            }
                        }
                        kVarA.y(objJ2, cVar);
                        break;
                    }
                    kVarA.b(nVar, i14);
                    Object objP = kVarA.p();
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    return objP;
                } catch (Throwable th7) {
                    th = th7;
                }
            }
        }
        Throwable thU = u();
        int i17 = u53.w.f168773a;
        throw thU;
    }

    /* JADX WARN: Code duplicated, block: B:94:0x016f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0173 A[RETURN] */
    @Override // q53.w
    public Object h(E e4, t13.d<? super Unit> dVar) throws Throwable {
        Object objP;
        u13.a aVar;
        E e14;
        b<E> bVar;
        n nVar;
        boolean z14;
        b<E> bVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142953h;
        n nVar2 = (n) atomicReferenceFieldUpdater.get(bVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f142949d;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
            long j8 = andIncrement & 1152921504606846975L;
            boolean zY = bVar2.y(andIncrement, false);
            int i14 = h.f142976b;
            long j14 = i14;
            long j15 = j8 / j14;
            int i15 = (int) (j8 % j14);
            if (nVar2.f168771c != j15) {
                n nVarA = a(bVar2, j15, nVar2);
                if (nVarA != null) {
                    nVar2 = nVarA;
                } else if (zY) {
                    Object objD = D(e4, dVar);
                    if (objD != u13.a.COROUTINE_SUSPENDED) {
                        break;
                    }
                    return objD;
                }
            }
            int iF = f(bVar2, nVar2, i15, e4, j8, null, zY);
            if (iF == 0) {
                nVar2.b();
            } else {
                if (iF == 1) {
                    break;
                }
                if (iF != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f142950e;
                    if (iF == 3) {
                        o53.k kVarA = gg.b.A(u13.f.b(dVar));
                        E e15 = e4;
                        try {
                            int iF2 = f(bVar2, nVar2, i15, e15, j8, kVarA, false);
                            try {
                                if (iF2 == 0) {
                                    nVar2.b();
                                    int i16 = o13.q.f128596b;
                                } else if (iF2 != 1) {
                                    if (iF2 != 2) {
                                        if (iF2 != 4) {
                                            String str = "unexpected";
                                            if (iF2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            nVar2.b();
                                            n nVar3 = (n) atomicReferenceFieldUpdater.get(bVar2);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bVar2);
                                                long j16 = andIncrement2 & 1152921504606846975L;
                                                boolean zY2 = bVar2.y(andIncrement2, false);
                                                int i17 = h.f142976b;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                                long j17 = i17;
                                                str = str;
                                                long j18 = j16 / j17;
                                                int i18 = (int) (j16 % j17);
                                                if (nVar3.f168771c != j18) {
                                                    n nVarA2 = a(bVar2, j18, nVar3);
                                                    if (nVarA2 != null) {
                                                        z14 = zY2;
                                                        nVar = nVarA2;
                                                    } else if (zY2) {
                                                        e(bVar2, e15, kVarA);
                                                    }
                                                } else {
                                                    nVar = nVar3;
                                                    z14 = zY2;
                                                }
                                                int iF3 = f(bVar2, nVar, i18, e15, j16, kVarA, z14);
                                                E e16 = e15;
                                                bVar = bVar2;
                                                n nVar4 = nVar;
                                                e14 = e16;
                                                if (iF3 == 0) {
                                                    nVar4.b();
                                                    int i19 = o13.q.f128596b;
                                                } else if (iF3 == 1) {
                                                    int i24 = o13.q.f128596b;
                                                } else if (iF3 != 2) {
                                                    if (iF3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iF3 != 4) {
                                                        if (iF3 == 5) {
                                                            nVar4.b();
                                                        }
                                                        nVar3 = nVar4;
                                                        bVar2 = bVar;
                                                        e15 = e14;
                                                    } else if (j16 < atomicLongFieldUpdater2.get(bVar)) {
                                                        nVar4.b();
                                                    }
                                                } else if (z14) {
                                                    nVar4.i();
                                                } else {
                                                    kVarA.b(nVar4, i18 + i17);
                                                }
                                            }
                                            kVarA.z();
                                            throw th;
                                        }
                                        e14 = e15;
                                        bVar = bVar2;
                                        if (j8 < atomicLongFieldUpdater2.get(bVar)) {
                                            nVar2.b();
                                        }
                                        e(bVar, e14, kVarA);
                                    } else {
                                        kVarA.b(nVar2, i15 + i14);
                                    }
                                    objP = kVarA.p();
                                    aVar = u13.a.COROUTINE_SUSPENDED;
                                    if (objP != aVar) {
                                        objP = Unit.INSTANCE;
                                    }
                                    if (objP == aVar) {
                                        return objP;
                                    }
                                } else {
                                    int i25 = o13.q.f128596b;
                                }
                                kVarA.resumeWith(Unit.INSTANCE);
                                objP = kVarA.p();
                                aVar = u13.a.COROUTINE_SUSPENDED;
                                if (objP != aVar) {
                                    objP = Unit.INSTANCE;
                                }
                                if (objP == aVar) {
                                    return objP;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        if (iF == 4) {
                            if (j8 < atomicLongFieldUpdater2.get(bVar2)) {
                                nVar2.b();
                            }
                            Object objD2 = D(e4, dVar);
                            if (objD2 != u13.a.COROUTINE_SUSPENDED) {
                                break;
                            }
                            return objD2;
                        }
                        if (iF == 5) {
                            nVar2.b();
                        }
                    }
                } else if (zY) {
                    nVar2.i();
                    Object objD3 = D(e4, dVar);
                    if (objD3 == u13.a.COROUTINE_SUSPENDED) {
                        return objD3;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x005f A[SYNTHETIC] */
    @Override // q53.w
    public Object i(E e4) {
        int iF;
        n2 n2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f142949d;
        long j8 = atomicLongFieldUpdater.get(this);
        long j14 = 1152921504606846975L;
        if (y(j8, false) ? false : !l(j8 & 1152921504606846975L)) {
            m.f142998b.getClass();
            return m.f142999c;
        }
        Object obj = h.f142984j;
        n nVar = (n) f142953h.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j15 = andIncrement & j14;
            boolean zY = y(andIncrement, false);
            int i14 = h.f142976b;
            long j16 = i14;
            long j17 = j15 / j16;
            int i15 = (int) (j15 % j16);
            if (nVar.f168771c == j17) {
                iF = f(this, nVar, i15, e4, j15, obj, zY);
                if (iF != 0) {
                    nVar.b();
                } else if (iF != 1) {
                    if (iF != 2) {
                        if (zY) {
                            nVar.i();
                            m.b bVar = m.f142998b;
                            Throwable thV = v();
                            bVar.getClass();
                            return m.b.a(thV);
                        }
                        if (obj instanceof n2) {
                            n2Var = (n2) obj;
                        } else {
                            n2Var = null;
                        }
                        if (n2Var != null) {
                            n2Var.b(nVar, i15 + i14);
                        }
                        nVar.i();
                        m.f142998b.getClass();
                        return m.f142999c;
                    }
                    if (iF != 3) {
                        vb.h.z("unexpected");
                        return null;
                    }
                    if (iF != 4) {
                        if (j15 < f142950e.get(this)) {
                            nVar.b();
                        }
                        m.b bVar2 = m.f142998b;
                        Throwable thV2 = v();
                        bVar2.getClass();
                        return m.b.a(thV2);
                    }
                    if (iF != 5) {
                        nVar.b();
                    }
                }
                m.b bVar3 = m.f142998b;
                Unit unit = Unit.INSTANCE;
                bVar3.getClass();
                return unit;
            }
            n nVarA = a(this, j17, nVar);
            if (nVarA != null) {
                nVar = nVarA;
                iF = f(this, nVar, i15, e4, j15, obj, zY);
                if (iF != 0) {
                    nVar.b();
                } else if (iF != 1) {
                    if (iF != 2) {
                        if (zY) {
                            nVar.i();
                            m.b bVar4 = m.f142998b;
                            Throwable thV3 = v();
                            bVar4.getClass();
                            return m.b.a(thV3);
                        }
                        if (obj instanceof n2) {
                            n2Var = (n2) obj;
                        } else {
                            n2Var = null;
                        }
                        if (n2Var != null) {
                            n2Var.b(nVar, i15 + i14);
                        }
                        nVar.i();
                        m.f142998b.getClass();
                        return m.f142999c;
                    }
                    if (iF != 3) {
                        vb.h.z("unexpected");
                        return null;
                    }
                    if (iF != 4) {
                        if (j15 < f142950e.get(this)) {
                            nVar.b();
                        }
                        m.b bVar5 = m.f142998b;
                        Throwable thV4 = v();
                        bVar5.getClass();
                        return m.b.a(thV4);
                    }
                    if (iF != 5) {
                        nVar.b();
                    }
                }
                m.b bVar6 = m.f142998b;
                Unit unit2 = Unit.INSTANCE;
                bVar6.getClass();
                return unit2;
            }
            if (zY) {
                m.b bVar7 = m.f142998b;
                Throwable thV5 = v();
                bVar7.getClass();
                return m.b.a(thV5);
            }
            j14 = 1152921504606846975L;
        }
    }

    @Override // q53.v
    public final k<E> iterator() {
        return new a();
    }

    @Override // q53.v
    public final y53.d j() {
        c cVar = c.f142966a;
        cVar.getClass();
        y0.e(3, cVar);
        d dVar = d.f142967a;
        dVar.getClass();
        y0.e(3, dVar);
        return new y53.d(this, cVar, dVar, this.f142960c);
    }

    @Override // q53.v
    public final Object k() {
        n<E> nVarS;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f142950e;
        long j8 = atomicLongFieldUpdater.get(this);
        long j14 = f142949d.get(this);
        if (y(j14, true)) {
            m.b bVar = m.f142998b;
            Throwable thT = t();
            bVar.getClass();
            return m.b.a(thT);
        }
        if (j8 >= (j14 & 1152921504606846975L)) {
            m.f142998b.getClass();
            return m.f142999c;
        }
        Object obj = h.f142985k;
        n<E> nVar = (n) f142954i.get(this);
        while (!z()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j15 = h.f142976b;
            long j16 = andIncrement / j15;
            int i14 = (int) (andIncrement % j15);
            if (nVar.f168771c != j16) {
                nVarS = s(j16, nVar);
                if (nVarS == null) {
                    continue;
                }
            } else {
                nVarS = nVar;
            }
            Object objJ = J(nVarS, i14, andIncrement, obj);
            nVar = nVarS;
            if (objJ == h.f142987m) {
                n2 n2Var = obj instanceof n2 ? (n2) obj : null;
                if (n2Var != null) {
                    n2Var.b(nVar, i14);
                }
                L(andIncrement);
                nVar.i();
                m.f142998b.getClass();
                return m.f142999c;
            }
            if (objJ != h.f142989o) {
                if (objJ == h.f142988n) {
                    vb.h.z("unexpected");
                    return null;
                }
                nVar.b();
                m.f142998b.getClass();
                return objJ;
            }
            if (andIncrement < w()) {
                nVar.b();
            }
        }
        m.b bVar2 = m.f142998b;
        Throwable thT2 = t();
        bVar2.getClass();
        return m.b.a(thT2);
    }

    public final boolean l(long j8) {
        return j8 < f142951f.get(this) || j8 < f142950e.get(this) + ((long) this.f142958a);
    }

    @Override // q53.w
    public final void m(e23.l<? super Throwable, Unit> lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = f142957l;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            u53.x xVar = h.f142991q;
            if (obj != xVar) {
                if (obj == h.f142992r) {
                    vb.h.z("Another handler was already registered and successfully invoked");
                    return;
                } else {
                    ds.e0.t(obj, "Another handler is already registered: ");
                    return;
                }
            }
            u53.x xVar2 = h.f142992r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, xVar, xVar2)) {
                    lVar.invoke(t());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == xVar);
        }
    }

    public final boolean n(Throwable th3, boolean z14) {
        b<E> bVar;
        boolean z15;
        long j8;
        long j14;
        long j15;
        Object obj;
        long j16;
        long j17;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f142949d;
        if (!z14) {
            bVar = this;
            break;
        }
        do {
            j17 = atomicLongFieldUpdater.get(this);
            if (((int) (j17 >> 60)) != 0) {
                bVar = this;
                break;
            }
            n<Object> nVar = h.f142975a;
            bVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j17, (j17 & 1152921504606846975L) + (((long) 1) << 60)));
        u53.x xVar = h.f142993s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142956k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, xVar, th3)) {
                z15 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != xVar) {
                z15 = false;
                break;
            }
        }
        if (z14) {
            do {
                j16 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j16, (((long) 3) << 60) + (j16 & 1152921504606846975L)));
        } else {
            do {
                j8 = atomicLongFieldUpdater.get(this);
                int i14 = (int) (j8 >> 60);
                if (i14 == 0) {
                    j14 = j8 & 1152921504606846975L;
                    j15 = 2;
                } else {
                    if (i14 != 1) {
                        break;
                    }
                    j14 = j8 & 1152921504606846975L;
                    j15 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j8, (j15 << 60) + j14));
        }
        d();
        if (z15) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f142957l;
                obj = atomicReferenceFieldUpdater2.get(this);
                u53.x xVar2 = obj == null ? h.f142991q : h.f142992r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, xVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                y0.e(1, obj);
                ((e23.l) obj).invoke(t());
                return z15;
            }
        }
        return z15;
    }

    public final n<E> o(long j8) {
        Object objA;
        long j14;
        Object obj = f142955j.get(this);
        n nVar = (n) f142953h.get(this);
        if (nVar.f168771c > ((n) obj).f168771c) {
            obj = nVar;
        }
        n nVar2 = (n) f142954i.get(this);
        if (nVar2.f168771c > ((n) obj).f168771c) {
            obj = nVar2;
        }
        u53.c cVar = (u53.c) obj;
        u53.x xVar = u53.b.f168719a;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u53.c.f168721a;
            Object obj2 = atomicReferenceFieldUpdater.get(cVar);
            u53.x xVar2 = u53.b.f168719a;
            objA = null;
            if (obj2 == xVar2) {
                break;
            }
            u53.c cVar2 = (u53.c) obj2;
            if (cVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, xVar2)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        n<E> nVar3 = (n) cVar;
        if (A()) {
            n<E> nVar4 = nVar3;
            loop2: while (true) {
                int i14 = h.f142976b - 1;
                while (true) {
                    if (-1 < i14) {
                        j14 = (nVar4.f168771c * ((long) h.f142976b)) + ((long) i14);
                        if (j14 >= f142950e.get(this)) {
                            while (true) {
                                Object objL = nVar4.l(i14);
                                if (objL != null && objL != h.f142979e) {
                                    if (objL != h.f142978d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (nVar4.k(i14, objL, h.f142986l)) {
                                    nVar4.i();
                                    break;
                                }
                            }
                            i14--;
                        }
                    } else {
                        nVar4 = (n) ((u53.c) u53.c.f168722b.get(nVar4));
                        if (nVar4 == null) {
                        }
                    }
                    j14 = -1;
                    break;
                }
            }
            if (j14 != -1) {
                p(j14);
            }
        }
        loop5: for (n<E> nVar5 = nVar3; nVar5 != null; nVar5 = (n) ((u53.c) u53.c.f168722b.get(nVar5))) {
            for (int i15 = h.f142976b - 1; -1 < i15; i15--) {
                if ((nVar5.f168771c * ((long) h.f142976b)) + ((long) i15) < j8) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = nVar5.l(i15);
                    if (objL2 != null && objL2 != h.f142979e) {
                        if (!(objL2 instanceof x)) {
                            if (!(objL2 instanceof n2)) {
                                break;
                            }
                            if (nVar5.k(i15, objL2, h.f142986l)) {
                                objA = u53.h.a(objA, objL2);
                                nVar5.m(i15, true);
                                break;
                            }
                        } else {
                            if (nVar5.k(i15, objL2, h.f142986l)) {
                                objA = u53.h.a(objA, ((x) objL2).f143016a);
                                nVar5.m(i15, true);
                                break;
                            }
                        }
                    } else {
                        if (nVar5.k(i15, objL2, h.f142986l)) {
                            nVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (!(objA instanceof ArrayList)) {
                G((n2) objA, true);
                return nVar3;
            }
            ArrayList arrayList = (ArrayList) objA;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                G((n2) arrayList.get(size), true);
            }
        }
        return nVar3;
    }

    public final void p(long j8) {
        UndeliveredElementException undeliveredElementExceptionU;
        n<E> nVar = (n) f142954i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f142950e;
            long j14 = atomicLongFieldUpdater.get(this);
            if (j8 < Math.max(((long) this.f142958a) + j14, f142951f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j14, 1 + j14)) {
                long j15 = h.f142976b;
                long j16 = j14 / j15;
                int i14 = (int) (j14 % j15);
                if (nVar.f168771c != j16) {
                    n<E> nVarS = s(j16, nVar);
                    if (nVarS == null) {
                        continue;
                    } else {
                        nVar = nVarS;
                    }
                }
                n<E> nVar2 = nVar;
                Object objJ = J(nVar2, i14, j14, null);
                if (objJ != h.f142989o) {
                    nVar2.b();
                    e23.l<E, Unit> lVar = this.f142959b;
                    if (lVar != null && (undeliveredElementExceptionU = og.a.u(lVar, objJ, null)) != null) {
                        throw undeliveredElementExceptionU;
                    }
                } else if (j14 < w()) {
                    nVar2.b();
                }
                nVar = nVar2;
            }
        }
    }

    @Override // q53.w
    public final boolean q(Throwable th3) {
        return n(th3, false);
    }

    public final void r() {
        Object objA;
        if (B()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142955j;
        n<E> nVar = (n) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f142951f.getAndIncrement(this);
            long j8 = andIncrement / ((long) h.f142976b);
            if (w() <= andIncrement) {
                if (nVar.f168771c < j8 && nVar.c() != 0) {
                    C(j8, nVar);
                }
                x(this);
                return;
            }
            if (nVar.f168771c != j8) {
                g gVar = g.f142974a;
                while (true) {
                    objA = u53.b.a(nVar, j8, gVar);
                    if (!u53.v.b(objA)) {
                        u53.u uVarA = u53.v.a(objA);
                        while (true) {
                            u53.u uVar = (u53.u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f168771c >= uVarA.f168771c) {
                                break;
                            }
                            if (!uVarA.j()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarA)) {
                                    if (!uVar.f()) {
                                        break;
                                    }
                                    uVar.e();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == uVar);
                            if (uVarA.f()) {
                                uVarA.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                n<E> nVar2 = null;
                if (u53.v.b(objA)) {
                    d();
                    C(j8, nVar);
                    x(this);
                } else {
                    n<E> nVar3 = (n) u53.v.a(objA);
                    long j14 = nVar3.f168771c;
                    if (j14 > j8) {
                        long j15 = j14 * ((long) h.f142976b);
                        if (f142951f.compareAndSet(this, 1 + andIncrement, j15)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f142952g;
                            if ((atomicLongFieldUpdater.addAndGet(this, j15 - andIncrement) & Longs.MAX_POWER_OF_TWO) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & Longs.MAX_POWER_OF_TWO) != 0) {
                                }
                            }
                        } else {
                            x(this);
                        }
                    } else {
                        nVar2 = nVar3;
                    }
                }
                if (nVar2 == null) {
                    continue;
                } else {
                    nVar = nVar2;
                }
            }
            int i14 = (int) (andIncrement % ((long) h.f142976b));
            Object objL = nVar.l(i14);
            boolean z14 = objL instanceof n2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f142950e;
            if (!z14 || andIncrement < atomicLongFieldUpdater2.get(this) || !nVar.k(i14, objL, h.f142981g)) {
                while (true) {
                    Object objL2 = nVar.l(i14);
                    if (objL2 instanceof n2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (nVar.k(i14, objL2, new x((n2) objL2))) {
                                x(this);
                                return;
                            }
                        } else if (nVar.k(i14, objL2, h.f142981g)) {
                            if (!I(objL2, nVar, i14)) {
                                nVar.o(i14, h.f142984j);
                                nVar.i();
                                break;
                            } else {
                                nVar.o(i14, h.f142978d);
                                x(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == h.f142984j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (nVar.k(i14, objL2, h.f142979e)) {
                                x(this);
                                return;
                            }
                        } else if (objL2 == h.f142978d || objL2 == h.f142982h || objL2 == h.f142983i || objL2 == h.f142985k || objL2 == h.f142986l) {
                            x(this);
                            return;
                        } else if (objL2 != h.f142980f) {
                            ds.e0.t(objL2, "Unexpected cell state: ");
                            return;
                        }
                    }
                }
                x(this);
            } else if (I(objL, nVar, i14)) {
                nVar.o(i14, h.f142978d);
                x(this);
                return;
            } else {
                nVar.o(i14, h.f142984j);
                nVar.i();
                x(this);
            }
        }
    }

    public final n<E> s(long j8, n<E> nVar) {
        Object objA;
        long j14;
        n<Object> nVar2 = h.f142975a;
        g gVar = g.f142974a;
        loop0: while (true) {
            objA = u53.b.a(nVar, j8, gVar);
            if (!u53.v.b(objA)) {
                u53.u uVarA = u53.v.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142954i;
                    u53.u uVar = (u53.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f168771c >= uVarA.f168771c) {
                        break loop0;
                    }
                    if (!uVarA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarA)) {
                            if (!uVar.f()) {
                                break loop0;
                            }
                            uVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (uVarA.f()) {
                        uVarA.e();
                    }
                }
            } else {
                break;
            }
        }
        if (u53.v.b(objA)) {
            d();
            if (nVar.f168771c * ((long) h.f142976b) < w()) {
                nVar.b();
                return null;
            }
        } else {
            n<E> nVar3 = (n) u53.v.a(objA);
            long j15 = nVar3.f168771c;
            if (!B() && j8 <= f142951f.get(this) / ((long) h.f142976b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f142955j;
                    u53.u uVar2 = (u53.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f168771c >= j15 || !nVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, nVar3)) {
                            if (!uVar2.f()) {
                                break loop3;
                            }
                            uVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == uVar2);
                    if (nVar3.f()) {
                        nVar3.e();
                    }
                }
            }
            if (j15 <= j8) {
                return nVar3;
            }
            long j16 = j15 * ((long) h.f142976b);
            do {
                j14 = f142950e.get(this);
                if (j14 >= j16) {
                    break;
                }
            } while (!f142950e.compareAndSet(this, j14, j16));
            if (j15 * ((long) h.f142976b) < w()) {
                nVar3.b();
            }
        }
        return null;
    }

    public final Throwable t() {
        return (Throwable) f142956k.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb3 = new StringBuilder();
        int i14 = (int) (f142949d.get(this) >> 60);
        if (i14 == 2) {
            sb3.append("closed,");
        } else if (i14 == 3) {
            sb3.append("cancelled,");
        }
        sb3.append("capacity=" + this.f142958a + CoreConstants.COMMA_CHAR);
        sb3.append("data=[");
        int i15 = 0;
        boolean z14 = true;
        List listK = p13.x.k(f142954i.get(this), f142953h.get(this), f142955j.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((n) obj) != h.f142975a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            c22.t.g();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j8 = ((n) next).f168771c;
            do {
                Object next2 = it.next();
                long j14 = ((n) next2).f168771c;
                if (j8 > j14) {
                    next = next2;
                    j8 = j14;
                }
            } while (it.hasNext());
        }
        n nVar = (n) next;
        long j15 = f142950e.get(this);
        long jW = w();
        loop2: while (true) {
            int i16 = h.f142976b;
            int i17 = i15;
            while (i17 < i16) {
                long j16 = (nVar.f168771c * ((long) h.f142976b)) + ((long) i17);
                if (j16 >= jW && j16 >= j15) {
                    break loop2;
                }
                Object objL = nVar.l(i17);
                boolean z15 = z14;
                Object obj2 = nVar.f143003f.get(i17 * 2);
                if (objL instanceof o53.j) {
                    string = (j16 >= j15 || j16 < jW) ? (j16 >= jW || j16 < j15) ? "cont" : "send" : "receive";
                } else if (objL instanceof y53.h) {
                    string = (j16 >= j15 || j16 < jW) ? (j16 >= jW || j16 < j15) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof u) {
                    string = "receiveCatching";
                } else if (objL instanceof C2689b) {
                    string = "sendBroadcast";
                } else if (objL instanceof x) {
                    string = "EB(" + objL + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                } else if (p005kotlin.jvm.internal.s.g(objL, h.f142980f) || p005kotlin.jvm.internal.s.g(objL, h.f142981g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(h.f142979e) && !objL.equals(h.f142983i) && !objL.equals(h.f142982h) && !objL.equals(h.f142985k) && !objL.equals(h.f142984j) && !objL.equals(h.f142986l)) {
                        string = objL.toString();
                    }
                    i17++;
                    z14 = z15;
                }
                if (obj2 != null) {
                    sb3.append("(" + string + CoreConstants.COMMA_CHAR + obj2 + "),");
                } else {
                    sb3.append(string + CoreConstants.COMMA_CHAR);
                }
                i17++;
                z14 = z15;
            }
            boolean z16 = z14;
            nVar = (n) nVar.c();
            if (nVar == null) {
                break;
            }
            z14 = z16;
            i15 = 0;
        }
        if (y.r0(sb3) == ',') {
            sb3.deleteCharAt(sb3.length() - 1).getClass();
        }
        sb3.append("]");
        return sb3.toString();
    }

    public final Throwable u() {
        Throwable thT = t();
        return thT == null ? new ClosedReceiveChannelException("Channel was closed") : thT;
    }

    public final Throwable v() {
        Throwable thT = t();
        return thT == null ? new ClosedSendChannelException("Channel was closed") : thT;
    }

    public final long w() {
        return f142949d.get(this) & 1152921504606846975L;
    }

    public final boolean y(long j8, boolean z14) {
        boolean z15;
        boolean z16;
        b<E> bVar = this;
        int i14 = (int) (j8 >> 60);
        if (i14 != 0) {
            boolean z17 = true;
            if (i14 != 1) {
                AtomicLongFieldUpdater atomicLongFieldUpdater = f142950e;
                if (i14 == 2) {
                    z15 = true;
                    bVar.o(j8 & 1152921504606846975L);
                    if (z14) {
                        while (true) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f142954i;
                            n<E> nVarS = (n) atomicReferenceFieldUpdater.get(bVar);
                            long j14 = atomicLongFieldUpdater.get(bVar);
                            if (bVar.w() <= j14) {
                                break;
                            }
                            long j15 = h.f142976b;
                            long j16 = j14 / j15;
                            if (nVarS.f168771c != j16 && (nVarS = bVar.s(j16, nVarS)) == null) {
                                if (((n) atomicReferenceFieldUpdater.get(bVar)).f168771c < j16) {
                                    break;
                                }
                            } else {
                                nVarS.b();
                                int i15 = (int) (j14 % j15);
                                while (true) {
                                    Object objL = nVarS.l(i15);
                                    if (objL != null && objL != h.f142979e) {
                                        if (objL != h.f142978d && (objL == h.f142984j || objL == h.f142986l || objL == h.f142983i || objL == h.f142982h || (objL != h.f142981g && (objL == h.f142980f || j14 != atomicLongFieldUpdater.get(bVar))))) {
                                            break;
                                            break;
                                            break;
                                            break;
                                            break;
                                            break;
                                        }
                                    } else {
                                        if (nVarS.k(i15, objL, h.f142982h)) {
                                            bVar.r();
                                            break;
                                        }
                                        bVar = this;
                                    }
                                }
                                f142950e.compareAndSet(bVar, j14, 1 + j14);
                                bVar = this;
                            }
                        }
                    }
                } else {
                    if (i14 != 3) {
                        e0.n(am.j.h(i14, "unexpected close status: "));
                        return false;
                    }
                    n<E> nVarO = bVar.o(j8 & 1152921504606846975L);
                    UndeliveredElementException undeliveredElementExceptionU = null;
                    Object objA = null;
                    loop0: while (true) {
                        AtomicReferenceArray atomicReferenceArray = nVarO.f143003f;
                        int i16 = h.f142976b - (z17 ? 1 : 0);
                        while (true) {
                            if (-1 < i16) {
                                long j17 = (nVarO.f168771c * ((long) h.f142976b)) + ((long) i16);
                                while (true) {
                                    Object objL2 = nVarO.l(i16);
                                    if (objL2 != h.f142983i) {
                                        u53.x xVar = h.f142978d;
                                        e23.l<E, Unit> lVar = bVar.f142959b;
                                        if (objL2 == xVar) {
                                            if (j17 >= atomicLongFieldUpdater.get(bVar)) {
                                                if (nVarO.k(i16, objL2, h.f142986l)) {
                                                    if (lVar != null) {
                                                        undeliveredElementExceptionU = og.a.u(lVar, atomicReferenceArray.get(i16 * 2), undeliveredElementExceptionU);
                                                    }
                                                    nVarO.n(i16, null);
                                                    nVarO.i();
                                                    z16 = z17 ? 1 : 0;
                                                    i16--;
                                                    z17 = z16;
                                                }
                                            }
                                        } else if (objL2 == h.f142979e || objL2 == null) {
                                            z16 = z17 ? 1 : 0;
                                            if (nVarO.k(i16, objL2, h.f142986l)) {
                                                nVarO.i();
                                                i16--;
                                                z17 = z16;
                                            }
                                            z17 = z16;
                                        } else if (!(objL2 instanceof n2) && !(objL2 instanceof x)) {
                                            u53.x xVar2 = h.f142981g;
                                            if (objL2 != xVar2 && objL2 != h.f142980f) {
                                                if (objL2 != xVar2) {
                                                    z16 = z17 ? 1 : 0;
                                                    i16--;
                                                    z17 = z16;
                                                }
                                            }
                                        } else if (j17 >= atomicLongFieldUpdater.get(bVar)) {
                                            n2 n2Var = objL2 instanceof x ? ((x) objL2).f143016a : (n2) objL2;
                                            z16 = z17 ? 1 : 0;
                                            if (nVarO.k(i16, objL2, h.f142986l)) {
                                                if (lVar != null) {
                                                    undeliveredElementExceptionU = og.a.u(lVar, atomicReferenceArray.get(i16 * 2), undeliveredElementExceptionU);
                                                }
                                                objA = u53.h.a(objA, n2Var);
                                                nVarO.n(i16, null);
                                                nVarO.i();
                                                i16--;
                                                z17 = z16;
                                            }
                                            z17 = z16;
                                        }
                                    }
                                    z15 = z17 ? 1 : 0;
                                    break loop0;
                                }
                            }
                            z15 = z17;
                            nVarO = (n) ((u53.c) u53.c.f168722b.get(nVarO));
                            if (nVarO == null) {
                                break;
                            }
                            z17 = z15 ? 1 : 0;
                        }
                    }
                    if (objA != null) {
                        if (objA instanceof ArrayList) {
                            ArrayList arrayList = (ArrayList) objA;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                bVar.G((n2) arrayList.get(size), false);
                            }
                        } else {
                            bVar.G((n2) objA, false);
                        }
                    }
                    if (undeliveredElementExceptionU != null) {
                        throw undeliveredElementExceptionU;
                    }
                }
                return z15;
            }
        }
        return false;
    }

    public final boolean z() {
        return y(f142949d.get(this), true);
    }

    public /* synthetic */ b(int i14, e23.l lVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(i14, (i15 & 2) != 0 ? null : lVar);
    }
}
