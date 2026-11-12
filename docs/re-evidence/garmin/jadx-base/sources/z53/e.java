package z53;

import am.j;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ds.e0;
import e23.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o53.k;
import o53.n2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import u53.u;
import u53.v;
import u53.x;
import xn.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\u00018\u0002X\u0082\u0004R\u0011\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004R\u000b\u0010\f\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lz53/e;", "", "", "permits", "acquiredPermits", "<init>", "(II)V", "Lh53/b;", "Lz53/i;", TtmlNode.TAG_HEAD, "deqIdx", "tail", "enqIdx", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f202559c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f202560d = AtomicLongFieldUpdater.newUpdater(e.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f202561e = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f202562f = AtomicLongFieldUpdater.newUpdater(e.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f202563g = AtomicIntegerFieldUpdater.newUpdater(e.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f202565b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a extends q implements p<Long, i, i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f202566a = new a();

        public a() {
            super(2, h.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // e23.p
        public final i invoke(Long l14, i iVar) {
            int i14 = h.f202568a;
            return new i(l14.longValue(), iVar, 0);
        }
    }

    public e(int i14, int i15) {
        this.f202564a = i14;
        if (i14 <= 0) {
            vb.h.x(j.h(i14, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i15 < 0 || i15 > i14) {
            vb.h.x(j.h(i14, "The number of acquired permits should be in 0.."));
            throw null;
        }
        i iVar = new i(0L, null, 2);
        this.head$volatile = iVar;
        this.tail$volatile = iVar;
        this._availablePermits$volatile = i14 - i15;
        this.f202565b = new t(this, 20);
    }

    public final Object b(v13.c cVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i14;
        do {
            atomicIntegerFieldUpdater = f202563g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i14 = this.f202564a;
        } while (andDecrement > i14);
        if (andDecrement > 0) {
            return Unit.INSTANCE;
        }
        k kVarA = gg.b.A(u13.f.b(cVar));
        try {
            if (!d(kVarA)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i14) {
                        if (andDecrement2 > 0) {
                            kVarA.y(Unit.INSTANCE, this.f202565b);
                            break;
                        }
                        if (d(kVarA)) {
                            break;
                        }
                    }
                }
            }
            Object objP = kVarA.p();
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (objP != aVar) {
                objP = Unit.INSTANCE;
            }
            return objP == aVar ? objP : Unit.INSTANCE;
        } catch (Throwable th3) {
            kVarA.z();
            throw th3;
        }
    }

    public final boolean d(n2 n2Var) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f202561e;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f202562f.getAndIncrement(this);
        a aVar = a.f202566a;
        long j8 = andIncrement / ((long) h.f202573f);
        loop0: while (true) {
            objA = u53.b.a(iVar, j8, aVar);
            if (!v.b(objA)) {
                u uVarA = v.a(objA);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
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
        i iVar2 = (i) v.a(objA);
        AtomicReferenceArray atomicReferenceArray = iVar2.f202574e;
        int i14 = (int) (andIncrement % ((long) h.f202573f));
        while (!atomicReferenceArray.compareAndSet(i14, null, n2Var)) {
            if (atomicReferenceArray.get(i14) != null) {
                x xVar = h.f202569b;
                x xVar2 = h.f202570c;
                while (!atomicReferenceArray.compareAndSet(i14, xVar, xVar2)) {
                    if (atomicReferenceArray.get(i14) != xVar) {
                        return false;
                    }
                }
                ((o53.j) n2Var).y(Unit.INSTANCE, this.f202565b);
                return true;
            }
        }
        n2Var.b(iVar2, i14);
        return true;
    }

    public final void release() {
        int i14;
        Object objA;
        boolean zD;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f202563g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i15 = this.f202564a;
            if (andIncrement >= i15) {
                do {
                    i14 = atomicIntegerFieldUpdater.get(this);
                    if (i14 <= i15) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, i15));
                sn.a.k(i15, "The number of released permits cannot be greater than ");
                return;
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f202559c;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f202560d.getAndIncrement(this);
            long j8 = andIncrement2 / ((long) h.f202573f);
            f fVar = f.f202567a;
            while (true) {
                objA = u53.b.a(iVar, j8, fVar);
                if (!v.b(objA)) {
                    u uVarA = v.a(objA);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
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
            i iVar2 = (i) v.a(objA);
            AtomicReferenceArray atomicReferenceArray = iVar2.f202574e;
            iVar2.b();
            zD = false;
            if (iVar2.f168771c <= j8) {
                int i16 = (int) (andIncrement2 % ((long) h.f202573f));
                Object andSet = atomicReferenceArray.getAndSet(i16, h.f202569b);
                if (andSet == null) {
                    int i17 = h.f202568a;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= i17) {
                            x xVar = h.f202569b;
                            x xVar2 = h.f202571d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i16, xVar, xVar2)) {
                                    zD = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i16) == xVar);
                            zD = !zD;
                            break;
                        }
                        if (atomicReferenceArray.get(i16) == h.f202570c) {
                            zD = true;
                            break;
                        }
                        i18++;
                    }
                } else if (andSet != h.f202572e) {
                    if (andSet instanceof o53.j) {
                        o53.j jVar = (o53.j) andSet;
                        x xVarO = jVar.o(Unit.INSTANCE, this.f202565b);
                        if (xVarO != null) {
                            jVar.B(xVarO);
                            zD = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof y53.h)) {
                            e0.t(andSet, "unexpected: ");
                            return;
                        }
                        zD = ((y53.h) andSet).d(this, Unit.INSTANCE);
                    }
                }
            }
        } while (!zD);
    }
}
