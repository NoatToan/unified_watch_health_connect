package ox;

import c2.x2;
import c2.y;
import c2.z;
import e23.p;
import gs1.t;
import h4.k;
import h5.e0;
import i3.e9;
import i3.mc;
import ix.j;
import ix.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: ox.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.bodybattery.presentation.details.BodyBatteryDetailsReportsPageKt$BodyBatteryDetailsReportsPage$1$1$1$1", f = "BodyBatteryDetailsReportsPage.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class C2549a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f134313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f134314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2549a(mc mcVar, t13.d<? super C2549a> dVar) {
            super(2, dVar);
            this.f134314b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2549a(this.f134314b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2549a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f134313a;
            if (i14 == 0) {
                r.b(obj);
                this.f134313a = 1;
                if (this.f134314b.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.ArrayList] */
    public static final void a(bx.a aVar, DateTime dateTime, j jVar, m mVar, int i14) {
        ?? arrayList;
        List<bx.b> list;
        jVar.getClass();
        o0 o0VarE = mVar.E(-537263773);
        int i15 = i14 | (o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(dateTime) ? 32 : 16) | (o0VarE.r(jVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            p1 p1VarC = s9.c.c(jVar.f95628h, o0VarE);
            t tVar = aVar != null ? aVar.f21603b : null;
            if (aVar == null || (list = aVar.f21604c) == null) {
                arrayList = j0.f134944a;
            } else {
                arrayList = new ArrayList();
                for (Object obj : list) {
                    hx.b event = ((bx.b) obj).getEvent();
                    if ((event != null ? event.b() : null) != null) {
                        arrayList.add(obj);
                    }
                }
            }
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (((l) p1VarC.getF182175a()).f95667g) {
                o0VarE.C(1587805018);
                f.a(g22.k.k(dateTime), aVar, o0VarE, (i15 << 3) & 112);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1587880937);
                o0VarE.g0(false);
            }
            int i16 = t.f78871l;
            d.a(dateTime, jVar, tVar, o0VarE, ((i15 >> 3) & 126) | (i16 << 6));
            if (((l) p1VarC.getF182175a()).f95667g) {
                o0VarE.C(1588030295);
                if (((Collection) arrayList).isEmpty()) {
                    o0VarE.C(1588898729);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(1588073230);
                    Object objQ = o0VarE.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ);
                    }
                    b0 b0Var2 = (b0) objQ;
                    mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
                    Object objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(null);
                        o0VarE.K(objQ2);
                    }
                    p1 p1Var = (p1) objQ2;
                    boolean zR = o0VarE.r(b0Var2) | o0VarE.B(mcVarF);
                    Object objQ3 = o0VarE.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new kh0.e(b0Var2, p1Var, mcVarF, 3);
                        o0VarE.K(objQ3);
                    }
                    qx.h.a(aVar, (e23.l) objQ3, o0VarE, i15 & 14);
                    if (!mcVarF.e() || ((bx.b) p1Var.getF182175a()) == null) {
                        o0VarE.C(1588884841);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(1588562906);
                        qx.f.a(mcVarF, b0Var2, (bx.b) p1Var.getF182175a(), tVar, jVar, o0VarE, (i16 << 9) | ((i15 << 6) & 57344));
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(1588908649);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(aVar, dateTime, jVar, i14, 23);
        }
    }
}
