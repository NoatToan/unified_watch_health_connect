package uf2;

import com.garmin.proto.generated.GDIDataTypes;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u1.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Luf2/s;", "Luf2/t;", "Lsf2/c;", "<init>", "()V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class s extends t<sf2.c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o13.t f170494c = o13.m.b(new p1(22));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f170495d = o13.m.b(new p1(23));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o13.t f170496e = o13.m.b(new p1(24));

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object h(s sVar, boolean z14, v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f170431c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f170431c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(sVar, cVar);
            }
        } else {
            mVar = new m(sVar, cVar);
        }
        Object obj = mVar.f170429a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f170431c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        u uVarC = sVar.c();
        dt2.g gVar = sVar.f170501b;
        mVar.f170431c = 1;
        Object objC = uVarC.c(gVar, z14, mVar);
        return objC == aVar ? aVar : objC;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object k(s sVar, v13.c cVar) {
        n nVar;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i14 = nVar.f170437c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f170437c = i14 - Integer.MIN_VALUE;
            } else {
                nVar = new n(sVar, cVar);
            }
        } else {
            nVar = new n(sVar, cVar);
        }
        Object obj = nVar.f170435a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = nVar.f170437c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        u uVarC = sVar.c();
        dt2.g gVar = sVar.f170501b;
        nVar.f170437c = 1;
        Object objD = uVarC.d(gVar, nVar);
        return objD == aVar ? aVar : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object o(s sVar, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f170445c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f170445c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(sVar, cVar);
            }
        } else {
            oVar = new o(sVar, cVar);
        }
        Object obj = oVar.f170443a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f170445c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        u uVarC = sVar.c();
        dt2.g gVar = sVar.f170501b;
        oVar.f170445c = 1;
        Object objE = uVarC.e(gVar, oVar);
        return objE == aVar ? aVar : objE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object q(s sVar, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f170458c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f170458c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(sVar, cVar);
            }
        } else {
            pVar = new p(sVar, cVar);
        }
        Object obj = pVar.f170456a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f170458c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        u uVarC = sVar.c();
        dt2.g gVar = sVar.f170501b;
        pVar.f170458c = 1;
        Object objF = uVarC.f(gVar, pVar);
        return objF == aVar ? aVar : objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object s(s sVar, Integer num, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f170462c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f170462c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(sVar, cVar);
            }
        } else {
            qVar = new q(sVar, cVar);
        }
        Object obj = qVar.f170460a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f170462c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        u uVarC = sVar.c();
        dt2.g gVar = sVar.f170501b;
        qVar.f170462c = 1;
        Object objG = uVarC.g(gVar, num, qVar);
        return objG == aVar ? aVar : objG;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object u(s sVar, Integer num, Integer num2, zf2.i iVar, v13.c cVar) {
        r rVar;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f170470c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f170470c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(sVar, cVar);
            }
        } else {
            rVar = new r(sVar, cVar);
        }
        r rVar2 = rVar;
        Object obj = rVar2.f170468a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar2.f170470c;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(obj);
                return ((o13.q) obj).f128597a;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        u uVarC = sVar.c();
        dt2.g gVar = sVar.f170501b;
        rVar2.f170470c = 1;
        Object objH = uVarC.h(num, num2, iVar, gVar, rVar2);
        return objH == aVar ? aVar : objH;
    }

    public abstract Object b(t13.d<? super Unit> dVar);

    public final u c() {
        return (u) this.f170495d.getValue();
    }

    public final l0 d() {
        return (l0) this.f170494c.getValue();
    }

    public abstract r0.b e();

    public void f() {
        u uVarC = c();
        dt2.g gVar = this.f170501b;
        uVarC.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorAppToDevice", "sendAdvanceWorkoutRequest - messenger:" + gVar);
        if (gVar != null) {
            ge1.b.T(uVarC.f170507b, null, null, new v(gVar, null), 3);
        }
    }

    public void g() {
        u uVarC = c();
        dt2.g gVar = this.f170501b;
        uVarC.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorAppToDevice", "sendCancelFinalizeTimerRequest - messenger:" + gVar);
        if (gVar != null) {
            ge1.b.T(uVarC.f170507b, null, null, new y(gVar, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    public void i(int i14, Integer num, Float f14, GDIDataTypes.MeasurementUnit measurementUnit, String str, String str2) {
        o13.p pVar;
        Object next;
        Object next2;
        o13.p pVar2;
        u uVarC = c();
        dt2.g gVar = this.f170501b;
        uVarC.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorAppToDevice", "sendConfirmFinalizeSetRequest - messenger:" + gVar);
        if (gVar != null) {
            List list = (List) ((vf2.q) uVarC.f170506a.getValue()).f178006a.f177995b.getValue();
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((vf2.d) next).getCategory().getName(), str));
                vf2.d dVar = (vf2.d) next;
                if (dVar != null) {
                    Iterator<T> it3 = dVar.b().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!p005kotlin.jvm.internal.s.g(((vf2.f) next2).getName(), str2));
                    vf2.f fVar = (vf2.f) next2;
                    if (fVar != null) {
                        pVar2 = new o13.p(Integer.valueOf(dVar.getCategory().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()), Integer.valueOf(fVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()));
                    } else {
                        pVar2 = new o13.p(Integer.valueOf(dVar.getCategory().getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()), null);
                    }
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
            } else {
                pVar = null;
            }
            ge1.b.T(uVarC.f170507b, null, null, new b0(i14, num, f14, measurementUnit, pVar, gVar, null), 3);
        }
    }

    public Object j(of2.n0 n0Var) {
        return k(this, n0Var);
    }

    public void l() {
        u uVarC = c();
        dt2.g gVar = this.f170501b;
        uVarC.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorAppToDevice", "sendLapRequest - messenger:" + gVar);
        if (gVar != null) {
            ge1.b.T(uVarC.f170507b, null, null, new d0(gVar, null), 3);
        }
    }

    public void m(rf2.d dVar) {
        dVar.getClass();
        u uVarC = c();
        dt2.g gVar = this.f170501b;
        uVarC.getClass();
        zg2.c.f204692a.getClass();
        zg2.c.a("LiveActivityInteractorAppToDevice", "sendModifyWorkoutRequest - messenger:" + gVar);
        if (gVar != null) {
            ge1.b.T(uVarC.f170507b, null, null, new e0(dVar, gVar, null), 3);
        }
    }

    public Object n(of2.r0 r0Var) {
        return o(this, r0Var);
    }

    public Object p(of2.s0 s0Var) {
        return q(this, s0Var);
    }

    public Object r(Integer num, of2.t0 t0Var) {
        return s(this, num, t0Var);
    }

    public Object t(Integer num, Integer num2, zf2.i iVar, of2.u0 u0Var) {
        return u(this, num, num2, iVar, u0Var);
    }
}
