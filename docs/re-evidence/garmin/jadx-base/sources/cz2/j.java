package cz2;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicReference;
import o13.t;
import o53.b0;
import o53.l1;
import o53.m0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;
import r1.q2;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\tB\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcz2/j;", "T", "", "", "enableLogging", "Lcz2/a;", "clock", "<init>", "(ZLcz2/a;)V", "a", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f56916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cz2.a f56917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f56918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f56919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z53.b f56920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<j<T>.a> f56921f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcz2/j$a;", "", "", "timestamp", "Lo53/l1;", "scheduledTask", "Lo53/r;", "completion", "<init>", "(Lcz2/j;JLo53/l1;Lo53/r;)V", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f56922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l1 f56923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o53.r<T> f56924c;

        public a(j jVar, long j8, l1 l1Var, o53.r<T> rVar) {
            l1Var.getClass();
            rVar.getClass();
            this.f56922a = j8;
            this.f56923b = l1Var;
            this.f56924c = rVar;
        }

        public final String toString() {
            return "ScheduledRun(timestamp=" + this.f56922a + ", scheduledTask=" + this.f56923b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lo53/b0;", "invoke", "()Lo53/b0;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends w implements e23.a<b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f56925a = new b();

        public b() {
            super(0);
        }

        @Override // e23.a
        public final b0 invoke() {
            return q2.l("ScheduledSingleRunner");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "T", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class c extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<T> f56926a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(j<T> jVar) {
            super(0);
            this.f56926a = jVar;
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger("ScheduledSingleRunner@" + this.f56926a.hashCode());
        }
    }

    public j(boolean z14, cz2.a aVar) {
        aVar.getClass();
        this.f56916a = z14;
        this.f56917b = aVar;
        this.f56918c = o13.m.b(new c(this));
        this.f56919d = o13.m.b(b.f56925a);
        this.f56920e = z53.c.a();
        this.f56921f = new AtomicReference<>(null);
    }

    public final void a(String str) {
        if (this.f56916a) {
            ((Logger) this.f56918c.getValue()).debug(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b(v13.c cVar) {
        k kVar;
        j<T> jVar;
        z53.b bVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f56931e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f56931e = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f56929c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f56931e;
        if (i15 == 0) {
            o13.r.b(obj);
            kVar.f56927a = this;
            z53.b bVar2 = this.f56920e;
            kVar.f56928b = bVar2;
            kVar.f56931e = 1;
            if (bVar2.c(kVar) == aVar) {
                return aVar;
            }
            jVar = this;
            bVar = bVar2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = kVar.f56928b;
            jVar = kVar.f56927a;
            o13.r.b(obj);
        }
        try {
            jVar.a("expectedExecutionTime: " + jVar.f56921f.get());
            j<T>.a aVar2 = jVar.f56921f.get();
            if (aVar2 == null || !aVar2.f56924c.isActive()) {
                return null;
            }
            return new Long(aVar2.f56922a);
        } finally {
            bVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0146  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [T, o53.l1, o53.r<T>] */
    public final Object c(long j8, e23.l lVar, v13.c cVar) throws Throwable {
        l lVar2;
        z53.b bVar;
        long j14;
        e23.l lVar3;
        r0 r0Var;
        j<T> jVar;
        long j15;
        AtomicReference<j<T>.a> atomicReference;
        long jMillis;
        j<T>.a aVar;
        AtomicReference<j<T>.a> atomicReference2;
        long j16;
        j<T> jVar2;
        if (cVar instanceof l) {
            lVar2 = (l) cVar;
            int i14 = lVar2.f56939h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                lVar2.f56939h = i14 - Integer.MIN_VALUE;
            } else {
                lVar2 = new l(this, cVar);
            }
        } else {
            lVar2 = new l(this, cVar);
        }
        Object objAwait = lVar2.f56937f;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = lVar2.f56939h;
        try {
            try {
                if (i15 == 0) {
                    r0 r0VarS = wr.g.s(objAwait);
                    lVar2.f56932a = this;
                    lVar2.f56933b = (v13.i) lVar;
                    lVar2.f56934c = r0VarS;
                    bVar = this.f56920e;
                    lVar2.f56935d = bVar;
                    j14 = j8;
                    lVar2.f56936e = j14;
                    lVar2.f56939h = 1;
                    if (bVar.c(lVar2) != aVar2) {
                        lVar3 = lVar;
                        r0Var = r0VarS;
                        jVar = this;
                    }
                    return aVar2;
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j16 = lVar2.f56936e;
                    jVar2 = lVar2.f56932a;
                    try {
                        o13.r.b(objAwait);
                        jVar2.a("Return result for " + j16);
                        return objAwait;
                    } catch (Throwable th3) {
                        th = th3;
                        jVar2.a("Return result for " + j16);
                        throw th;
                    }
                }
                j14 = lVar2.f56936e;
                bVar = lVar2.f56935d;
                r0Var = lVar2.f56934c;
                e23.l lVar4 = (e23.l) lVar2.f56933b;
                jVar = lVar2.f56932a;
                o13.r.b(objAwait);
                lVar3 = lVar4;
                if (aVar != null) {
                    o53.r<T> rVar = aVar.f56924c;
                    atomicReference2 = atomicReference;
                    if (aVar.f56922a <= jMillis && rVar.isActive()) {
                        jVar.a("Task already scheduled before delay " + j15);
                        r0Var.f105810a = rVar;
                    }
                    Unit unit = Unit.INSTANCE;
                    bVar.e(null);
                    o53.r rVar2 = (o53.r) r0Var.f105810a;
                    lVar2.f56932a = jVar;
                    lVar2.f56933b = null;
                    lVar2.f56934c = null;
                    lVar2.f56935d = null;
                    lVar2.f56936e = j15;
                    lVar2.f56939h = 2;
                    objAwait = rVar2.await(lVar2);
                    if (objAwait != aVar2) {
                        j16 = j15;
                        jVar2 = jVar;
                        jVar2.a("Return result for " + j16);
                        return objAwait;
                    }
                    return aVar2;
                }
                atomicReference2 = atomicReference;
                o53.r rVar3 = (o53.r) r0Var.f105810a;
                lVar2.f56932a = jVar;
                lVar2.f56933b = null;
                lVar2.f56934c = null;
                lVar2.f56935d = null;
                lVar2.f56936e = j15;
                lVar2.f56939h = 2;
                objAwait = rVar3.await(lVar2);
                if (objAwait != aVar2) {
                    j16 = j15;
                    jVar2 = jVar;
                    jVar2.a("Return result for " + j16);
                    return objAwait;
                }
                return aVar2;
            } catch (Throwable th4) {
                th = th4;
                j16 = j15;
                jVar2 = jVar;
                jVar2.a("Return result for " + j16);
                throw th;
            }
            cz2.a aVar3 = jVar.f56917b;
            atomicReference = jVar.f56921f;
            jMillis = aVar3.millis() + j15;
            aVar = atomicReference.get();
            jVar.a("Schedule task for delay " + j15);
            if (aVar != null) {
                aVar.f56923b.c(null);
            }
            r0Var.f105810a = aVar != null ? aVar.f56924c : (T) gl.b.b();
            b0 b0Var = (b0) jVar.f56919d.getValue();
            x53.c cVar2 = s0.f129406a;
            AtomicReference<j<T>.a> atomicReference3 = atomicReference2;
            j<T> jVar3 = jVar;
            j<T>.a aVar4 = new a(jVar3, jMillis, ge1.b.T(b0Var, x53.b.f189152a, null, new m(j15, jVar, r0Var, lVar3, null), 2), (o53.r) r0Var.f105810a);
            jVar = jVar3;
            atomicReference3.set(aVar4);
            jVar.a("Scheduled task for delay " + j15 + ", " + atomicReference3.get());
            Unit unit2 = Unit.INSTANCE;
            bVar.e(null);
        } catch (Throwable th5) {
            bVar.e(null);
            throw th5;
        }
        j15 = j14;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e1 A[PHI: r1 r4 r8 r9
      0x00e1: PHI (r1v15 java.lang.Object) = (r1v14 java.lang.Object), (r1v1 java.lang.Object) binds: [B:42:0x00de, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r4v5 java.lang.Long) = (r4v3 java.lang.Long), (r4v9 java.lang.Long) binds: [B:42:0x00de, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r8v4 e23.l) = (r8v2 e23.l), (r8v5 e23.l) binds: [B:42:0x00de, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00e1: PHI (r9v6 cz2.j<T>) = (r9v3 cz2.j<T>), (r9v8 cz2.j<T>) binds: [B:42:0x00de, B:18:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:48:0x0100  */
    /* JADX WARN: Code duplicated, block: B:55:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00e5, please report this as an issue */
    public final Object d(ok2.q.d dVar, Long l14, long j8, v13.c cVar) {
        n nVar;
        Long l15;
        long j14;
        e23.l lVar;
        j<T> jVar;
        e23.l lVar2;
        j<T> jVar2;
        e23.l lVar3;
        j<T> jVar3;
        Long l16;
        long jLongValue;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f56952g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f56952g = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objB = nVar.f56950e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f56952g;
        if (i15 == 0) {
            o13.r.b(objB);
            nVar.f56946a = this;
            nVar.f56947b = dVar;
            l15 = l14;
            nVar.f56948c = l15;
            j14 = j8;
            nVar.f56949d = j14;
            nVar.f56952g = 1;
            Object objB2 = b(nVar);
            if (objB2 != aVar) {
                lVar = dVar;
                objB = objB2;
                jVar = this;
            }
            return aVar;
        }
        if (i15 == 1) {
            j14 = nVar.f56949d;
            l15 = nVar.f56948c;
            lVar = nVar.f56947b;
            jVar = nVar.f56946a;
            o13.r.b(objB);
        } else {
            if (i15 == 2) {
                l15 = nVar.f56948c;
                lVar3 = nVar.f56947b;
                jVar3 = nVar.f56946a;
                o13.r.b(objB);
                lVar2 = lVar3;
                jVar2 = jVar3;
                nVar.f56946a = jVar2;
                nVar.f56947b = lVar2;
                nVar.f56948c = l15;
                nVar.f56952g = 3;
                objB = jVar2.b(nVar);
                if (objB != aVar) {
                }
                return aVar;
            }
            if (i15 != 3) {
                if (i15 == 4) {
                    o13.r.b(objB);
                    return null;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l15 = nVar.f56948c;
            lVar2 = nVar.f56947b;
            jVar2 = nVar.f56946a;
            o13.r.b(objB);
        }
        l16 = (Long) objB;
        if (l16 != null) {
            jLongValue = l16.longValue();
            jVar2.a("runIfUnscheduled: " + jLongValue + ", " + l15);
            if (l15 != null || jLongValue < l15.longValue()) {
                return new Long(jLongValue - jVar2.f56917b.millis());
            }
        }
        nVar.f56946a = null;
        nVar.f56947b = null;
        nVar.f56948c = null;
        nVar.f56952g = 4;
        if (lVar2.invoke(nVar) == aVar) {
            return aVar;
        }
        return null;
        Long l17 = (Long) objB;
        if (l17 != null) {
            long jLongValue2 = l17.longValue();
            jVar.a("runIfUnscheduled: " + jLongValue2 + ", " + l15);
            if (l15 == null || jLongValue2 < l15.longValue()) {
                return new Long(jLongValue2 - jVar.f56917b.millis());
            }
        }
        if (j14 > 0) {
            nVar.f56946a = jVar;
            nVar.f56947b = lVar;
            nVar.f56948c = l15;
            nVar.f56952g = 2;
            if (m0.b(j14, nVar) != aVar) {
                lVar3 = lVar;
                jVar3 = jVar;
                lVar2 = lVar3;
                jVar2 = jVar3;
                nVar.f56946a = jVar2;
                nVar.f56947b = lVar2;
                nVar.f56948c = l15;
                nVar.f56952g = 3;
                objB = jVar2.b(nVar);
                if (objB != aVar) {
                    l16 = (Long) objB;
                    if (l16 != null) {
                        jLongValue = l16.longValue();
                        jVar2.a("runIfUnscheduled: " + jLongValue + ", " + l15);
                        if (l15 != null) {
                        }
                        return new Long(jLongValue - jVar2.f56917b.millis());
                    }
                    nVar.f56946a = null;
                    nVar.f56947b = null;
                    nVar.f56948c = null;
                    nVar.f56952g = 4;
                    if (lVar2.invoke(nVar) == aVar) {
                        return null;
                    }
                }
            }
        } else {
            lVar2 = lVar;
            jVar2 = jVar;
            nVar.f56946a = jVar2;
            nVar.f56947b = lVar2;
            nVar.f56948c = l15;
            nVar.f56952g = 3;
            objB = jVar2.b(nVar);
            if (objB != aVar) {
                l16 = (Long) objB;
                if (l16 != null) {
                    jLongValue = l16.longValue();
                    jVar2.a("runIfUnscheduled: " + jLongValue + ", " + l15);
                    if (l15 != null) {
                    }
                    return new Long(jLongValue - jVar2.f56917b.millis());
                }
                nVar.f56946a = null;
                nVar.f56947b = null;
                nVar.f56948c = null;
                nVar.f56952g = 4;
                if (lVar2.invoke(nVar) == aVar) {
                    return null;
                }
            }
        }
        return aVar;
    }

    public j() {
        this(false, null, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j(boolean z14, cz2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        z14 = (i14 & 1) != 0 ? false : z14;
        if ((i14 & 2) != 0) {
            cz2.a.f56879a.getClass();
            aVar = cz2.a.C1219a.f56881b;
        }
        this(z14, aVar);
    }
}
