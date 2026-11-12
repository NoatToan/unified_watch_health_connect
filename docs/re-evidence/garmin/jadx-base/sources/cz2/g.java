package cz2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import o53.j2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcz2/g;", "T", "", "", "timeout", "Lcz2/a;", "clock", "<init>", "(JLcz2/a;)V", "util-coroutines_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f56897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f56898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f56899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f56900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o53.s f56901e;

    public g(long j8, a aVar) {
        aVar.getClass();
        this.f56897a = j8;
        this.f56898b = aVar;
        this.f56899c = new AtomicLong(aVar.millis());
        this.f56900d = new AtomicBoolean(false);
        this.f56901e = gl.b.b();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b5 A[PHI: r2
      0x00b5: PHI (r2v3 cz2.g<T>) = (r2v4 cz2.g<T>), (r2v4 cz2.g<T>), (r2v5 cz2.g<T>) binds: [B:29:0x0051, B:38:0x007c, B:43:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0093, code lost:
    
        if (r14 == r1) goto L54;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0093 -> B:43:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00b1 -> B:28:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        e eVar;
        g<T> gVar;
        Object objC;
        o53.s sVar;
        long jMillis;
        long j8;
        Object objC2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i14 = eVar.f56894d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f56894d = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objC3 = eVar.f56892b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f56894d;
        if (i15 == 0) {
            o13.r.b(objC3);
            gVar = this;
            sVar = gVar.f56901e;
            if (!sVar.isActive()) {
                o53.s sVar2 = gVar.f56901e;
                eVar.f56891a = null;
                eVar.f56894d = 4;
                objC = sVar2.C(eVar);
                u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
                if (objC != aVar) {
                    return objC;
                }
            } else if (gVar.f56900d.get()) {
                eVar.f56891a = null;
                eVar.f56894d = 1;
                objC2 = sVar.C(eVar);
                u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
                if (objC2 != aVar) {
                    return objC2;
                }
            } else {
                jMillis = gVar.f56898b.millis() - gVar.f56899c.get();
                j8 = gVar.f56897a;
                if (jMillis > j8) {
                    sVar.O(new TimeoutException());
                    o53.s sVar3 = gVar.f56901e;
                    eVar.f56891a = null;
                    eVar.f56894d = 4;
                    objC = sVar3.C(eVar);
                    u13.a aVar4 = u13.a.COROUTINE_SUSPENDED;
                    if (objC != aVar) {
                        return objC;
                    }
                } else {
                    long j14 = j8 - jMillis;
                    f fVar = new f(gVar, null);
                    eVar.f56891a = gVar;
                    eVar.f56894d = 2;
                    objC3 = j2.c(j14, fVar, eVar);
                }
            }
            return aVar;
        }
        if (i15 == 1) {
            o13.r.b(objC3);
            return objC3;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                o13.r.b(objC3);
                return objC3;
            }
            if (i15 == 4) {
                o13.r.b(objC3);
                return objC3;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        gVar = eVar.f56891a;
        try {
            o13.r.b(objC3);
        } catch (CancellationException e4) {
            boolean z14 = gVar.f56900d.get();
            o53.s sVar4 = gVar.f56901e;
            if (z14) {
                eVar.f56891a = null;
                eVar.f56894d = 3;
                Object objC4 = sVar4.C(eVar);
                u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
                if (objC4 != aVar) {
                    return objC4;
                }
            } else {
                sVar4.O(e4);
                sVar = gVar.f56901e;
                if (!sVar.isActive()) {
                    o53.s sVar5 = gVar.f56901e;
                    eVar.f56891a = null;
                    eVar.f56894d = 4;
                    objC = sVar5.C(eVar);
                    u13.a aVar6 = u13.a.COROUTINE_SUSPENDED;
                    if (objC != aVar) {
                        return objC;
                    }
                } else if (gVar.f56900d.get()) {
                    eVar.f56891a = null;
                    eVar.f56894d = 1;
                    objC2 = sVar.C(eVar);
                    u13.a aVar7 = u13.a.COROUTINE_SUSPENDED;
                    if (objC2 != aVar) {
                        return objC2;
                    }
                } else {
                    jMillis = gVar.f56898b.millis() - gVar.f56899c.get();
                    j8 = gVar.f56897a;
                    if (jMillis > j8) {
                        sVar.O(new TimeoutException());
                        o53.s sVar6 = gVar.f56901e;
                        eVar.f56891a = null;
                        eVar.f56894d = 4;
                        objC = sVar6.C(eVar);
                        u13.a aVar8 = u13.a.COROUTINE_SUSPENDED;
                        if (objC != aVar) {
                            return objC;
                        }
                    } else {
                        long j15 = j8 - jMillis;
                        f fVar2 = new f(gVar, null);
                        eVar.f56891a = gVar;
                        eVar.f56894d = 2;
                        objC3 = j2.c(j15, fVar2, eVar);
                    }
                }
            }
            return aVar;
        }
        if (objC3 != null) {
            o53.s sVar7 = gVar.f56901e;
            eVar.f56891a = null;
            eVar.f56894d = 4;
            objC = sVar7.C(eVar);
            u13.a aVar9 = u13.a.COROUTINE_SUSPENDED;
            if (objC != aVar) {
                return objC;
            }
        } else {
            sVar = gVar.f56901e;
            if (!sVar.isActive()) {
                o53.s sVar8 = gVar.f56901e;
                eVar.f56891a = null;
                eVar.f56894d = 4;
                objC = sVar8.C(eVar);
                u13.a aVar10 = u13.a.COROUTINE_SUSPENDED;
                if (objC != aVar) {
                    return objC;
                }
            } else if (gVar.f56900d.get()) {
                eVar.f56891a = null;
                eVar.f56894d = 1;
                objC2 = sVar.C(eVar);
                u13.a aVar11 = u13.a.COROUTINE_SUSPENDED;
                if (objC2 != aVar) {
                    return objC2;
                }
            } else {
                jMillis = gVar.f56898b.millis() - gVar.f56899c.get();
                j8 = gVar.f56897a;
                if (jMillis > j8) {
                    sVar.O(new TimeoutException());
                    o53.s sVar9 = gVar.f56901e;
                    eVar.f56891a = null;
                    eVar.f56894d = 4;
                    objC = sVar9.C(eVar);
                    u13.a aVar12 = u13.a.COROUTINE_SUSPENDED;
                    if (objC != aVar) {
                        return objC;
                    }
                } else {
                    long j16 = j8 - jMillis;
                    f fVar3 = new f(gVar, null);
                    eVar.f56891a = gVar;
                    eVar.f56894d = 2;
                    objC3 = j2.c(j16, fVar3, eVar);
                }
            }
        }
        return aVar;
    }

    public final void b(T t7) {
        this.f56901e.g0(t7);
    }
}
