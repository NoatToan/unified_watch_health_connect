package uu0;

import c80.p;
import c80.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;
import r53.z1;
import wd2.f0;
import wd2.k;
import wd2.o1;
import zd0.j1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Luu0/h;", "", "Lwd2/o1;", "mobcoreApi", "Lzd0/j1;", "subscriptionProvider", "<init>", "(Lwd2/o1;Lzd0/j1;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f172819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f172820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f172821c;

    public h(o1 o1Var, j1 j1Var) {
        o1Var.getClass();
        j1Var.getClass();
        this.f172819a = o1Var;
        this.f172820b = j1Var;
        this.f172821c = q2.a(new ou0.d(null, null, null, null, 15, null));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x009d  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00db, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(v13.c cVar) {
        f fVar;
        p pVar;
        p pVar2;
        boolean z14;
        z1 z1Var;
        Object objL;
        p pVar3;
        z1 z1Var2;
        p pVar4;
        Boolean bool;
        p pVar5;
        z1 z1Var3;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f172814i;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f172814i = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f172812g;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f172814i;
        j1 j1Var = this.f172820b;
        if (i15 == 0) {
            r.b(objJ);
            q qVar = q.LIVE_TRACK_PLUS;
            fVar.f172814i = 1;
            objJ = j1Var.j(qVar, fVar);
            if (objJ != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            r.b(objJ);
        } else {
            if (i15 == 2) {
                p pVar6 = fVar.f172806a;
                r.b(objJ);
                pVar = pVar6;
                pVar2 = (p) objJ;
                z14 = pVar instanceof p.c;
                z1Var = this.f172821c;
                if (z14) {
                    pVar4 = pVar2;
                    bool = null;
                    fVar.f172806a = null;
                    fVar.f172807b = null;
                    fVar.f172808c = z1Var;
                    fVar.f172809d = bool;
                    fVar.f172810e = pVar;
                    fVar.f172811f = pVar4;
                    fVar.f172814i = 4;
                    objJ = this.f172819a.g(fVar);
                    if (objJ != aVar) {
                        pVar5 = pVar;
                        z1Var3 = z1Var;
                        ou0.d dVar = new ou0.d(bool, pVar5, pVar4, (k) ((f0) objJ).f184457a);
                        fVar.f172806a = null;
                        fVar.f172807b = null;
                        fVar.f172808c = null;
                        fVar.f172809d = null;
                        fVar.f172810e = null;
                        fVar.f172811f = null;
                        fVar.f172814i = 5;
                    }
                } else {
                    q qVar2 = q.LIVE_TRACK_PLUS;
                    fVar.f172806a = pVar;
                    fVar.f172807b = pVar2;
                    fVar.f172808c = z1Var;
                    fVar.f172814i = 3;
                    objL = j1Var.l(qVar2, fVar);
                    if (objL != aVar) {
                        pVar3 = pVar2;
                        objJ = objL;
                        z1Var2 = z1Var;
                        z1Var = z1Var2;
                        pVar4 = pVar3;
                        bool = (Boolean) objJ;
                        fVar.f172806a = null;
                        fVar.f172807b = null;
                        fVar.f172808c = z1Var;
                        fVar.f172809d = bool;
                        fVar.f172810e = pVar;
                        fVar.f172811f = pVar4;
                        fVar.f172814i = 4;
                        objJ = this.f172819a.g(fVar);
                        if (objJ != aVar) {
                            pVar5 = pVar;
                            z1Var3 = z1Var;
                            ou0.d dVar2 = new ou0.d(bool, pVar5, pVar4, (k) ((f0) objJ).f184457a);
                            fVar.f172806a = null;
                            fVar.f172807b = null;
                            fVar.f172808c = null;
                            fVar.f172809d = null;
                            fVar.f172810e = null;
                            fVar.f172811f = null;
                            fVar.f172814i = 5;
                        }
                    }
                }
                return aVar;
            }
            if (i15 == 3) {
                z1Var2 = fVar.f172808c;
                pVar3 = fVar.f172807b;
                pVar = fVar.f172806a;
                r.b(objJ);
                z1Var = z1Var2;
                pVar4 = pVar3;
                bool = (Boolean) objJ;
                fVar.f172806a = null;
                fVar.f172807b = null;
                fVar.f172808c = z1Var;
                fVar.f172809d = bool;
                fVar.f172810e = pVar;
                fVar.f172811f = pVar4;
                fVar.f172814i = 4;
                objJ = this.f172819a.g(fVar);
                if (objJ != aVar) {
                    pVar5 = pVar;
                    z1Var3 = z1Var;
                    ou0.d dVar3 = new ou0.d(bool, pVar5, pVar4, (k) ((f0) objJ).f184457a);
                    fVar.f172806a = null;
                    fVar.f172807b = null;
                    fVar.f172808c = null;
                    fVar.f172809d = null;
                    fVar.f172810e = null;
                    fVar.f172811f = null;
                    fVar.f172814i = 5;
                }
                return aVar;
            }
            if (i15 == 4) {
                pVar4 = fVar.f172811f;
                pVar5 = fVar.f172810e;
                bool = fVar.f172809d;
                z1Var3 = fVar.f172808c;
                r.b(objJ);
                ou0.d dVar4 = new ou0.d(bool, pVar5, pVar4, (k) ((f0) objJ).f184457a);
                fVar.f172806a = null;
                fVar.f172807b = null;
                fVar.f172808c = null;
                fVar.f172809d = null;
                fVar.f172810e = null;
                fVar.f172811f = null;
                fVar.f172814i = 5;
            } else {
                if (i15 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objJ);
            }
        }
        return Unit.INSTANCE;
        p pVar7 = (p) objJ;
        q qVar3 = q.LIVE_TRACK_SMS;
        fVar.f172806a = pVar7;
        fVar.f172814i = 2;
        Object objJ2 = j1Var.j(qVar3, fVar);
        if (objJ2 != aVar) {
            pVar = pVar7;
            objJ = objJ2;
            pVar2 = (p) objJ;
            z14 = pVar instanceof p.c;
            z1Var = this.f172821c;
            if (z14) {
                pVar4 = pVar2;
                bool = null;
                fVar.f172806a = null;
                fVar.f172807b = null;
                fVar.f172808c = z1Var;
                fVar.f172809d = bool;
                fVar.f172810e = pVar;
                fVar.f172811f = pVar4;
                fVar.f172814i = 4;
                objJ = this.f172819a.g(fVar);
                if (objJ != aVar) {
                    pVar5 = pVar;
                    z1Var3 = z1Var;
                    ou0.d dVar5 = new ou0.d(bool, pVar5, pVar4, (k) ((f0) objJ).f184457a);
                    fVar.f172806a = null;
                    fVar.f172807b = null;
                    fVar.f172808c = null;
                    fVar.f172809d = null;
                    fVar.f172810e = null;
                    fVar.f172811f = null;
                    fVar.f172814i = 5;
                }
            } else {
                q qVar4 = q.LIVE_TRACK_PLUS;
                fVar.f172806a = pVar;
                fVar.f172807b = pVar2;
                fVar.f172808c = z1Var;
                fVar.f172814i = 3;
                objL = j1Var.l(qVar4, fVar);
                if (objL != aVar) {
                    pVar3 = pVar2;
                    objJ = objL;
                    z1Var2 = z1Var;
                    z1Var = z1Var2;
                    pVar4 = pVar3;
                    bool = (Boolean) objJ;
                    fVar.f172806a = null;
                    fVar.f172807b = null;
                    fVar.f172808c = z1Var;
                    fVar.f172809d = bool;
                    fVar.f172810e = pVar;
                    fVar.f172811f = pVar4;
                    fVar.f172814i = 4;
                    objJ = this.f172819a.g(fVar);
                    if (objJ != aVar) {
                        pVar5 = pVar;
                        z1Var3 = z1Var;
                        ou0.d dVar6 = new ou0.d(bool, pVar5, pVar4, (k) ((f0) objJ).f184457a);
                        fVar.f172806a = null;
                        fVar.f172807b = null;
                        fVar.f172808c = null;
                        fVar.f172809d = null;
                        fVar.f172810e = null;
                        fVar.f172811f = null;
                        fVar.f172814i = 5;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(v13.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f172818d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f172818d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f172816b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f172818d;
        if (i15 == 0) {
            r.b(obj);
            p2 p2Var = this.f172821c;
            gVar.f172815a = p2Var;
            gVar.f172818d = 1;
            return a(gVar) == obj2 ? obj2 : p2Var;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p2 p2Var2 = gVar.f172815a;
        r.b(obj);
        return p2Var2;
    }
}
