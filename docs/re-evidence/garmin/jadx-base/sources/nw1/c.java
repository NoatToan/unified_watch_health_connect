package nw1;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.v1;
import ca0.s0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import i3.fe;
import ky0.w;
import l72.d3;
import lc.m0;
import lc.v;
import lc.v0;
import lc.y;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p1;
import p3.x1;
import p3.x3;
import r1.u1;
import r1.w1;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.navigation.FindTrainingPlanNavHostKt$FindTrainingPlanNavHost$1$1$1$1$1$1", f = "FindTrainingPlanNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0 f128149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<lw1.a> f128150b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0 m0Var, x3<lw1.a> x3Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f128149a = m0Var;
            this.f128150b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f128149a, this.f128150b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            nw1.d dVar = this.f128150b.getF182175a().f115078d;
            if (dVar != null) {
                m0 m0Var = this.f128149a;
                m0Var.h(new w(m0Var, 13), dVar);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.navigation.FindTrainingPlanNavHostKt$FindTrainingPlanNavHost$1$1$2$1$1", f = "FindTrainingPlanNavHost.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lw1.f f128151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<lw1.a> f128152b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lw1.f fVar, x3<lw1.a> x3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f128151a = fVar;
            this.f128152b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f128151a, this.f128152b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            fy1.c.f73884a.getClass();
            fy1.c.b("GarminCoachFindAPlanPageDisplayed");
            if (!this.f128152b.getF182175a().f115077c) {
                lw1.f fVar = this.f128151a;
                fVar.getClass();
                ge1.b.T(v1.a(fVar), null, null, new lw1.e(fVar, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: nw1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.navigation.FindTrainingPlanNavHostKt$FindTrainingPlanNavHost$1$1$2$2$1", f = "FindTrainingPlanNavHost.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "invokeSuspend", v = 2)
    public static final class C2456c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fe f128154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f128155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lw1.f f128156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x3<lw1.a> f128157e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2456c(fe feVar, String str, lw1.f fVar, x3<lw1.a> x3Var, t13.d<? super C2456c> dVar) {
            super(2, dVar);
            this.f128154b = feVar;
            this.f128155c = str;
            this.f128156d = fVar;
            this.f128157e = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C2456c(this.f128154b, this.f128155c, this.f128156d, this.f128157e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C2456c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128153a;
            if (i14 == 0) {
                r.b(obj);
                if (this.f128157e.getF182175a().f115076b) {
                    this.f128153a = 1;
                    if (d3.c(this.f128154b, this.f128155c, null, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            p2 p2Var = this.f128156d.f115117j;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, lw1.a.a((lw1.a) value, false, false, false, null, 0, null, null, null, false, false, false, false, 4093)));
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.findplan.presentation.navigation.FindTrainingPlanNavHostKt$FindTrainingPlanNavHost$1$1$2$gcPlusPaywallLauncher$1$1$1", f = "FindTrainingPlanNavHost.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f128158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lw1.f f128159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0 f128160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<lw1.a> f128161d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(lw1.f fVar, m0 m0Var, x3<lw1.a> x3Var, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f128159b = fVar;
            this.f128160c = m0Var;
            this.f128161d = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f128159b, this.f128160c, this.f128161d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object objX4;
            Object value;
            Object value2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f128158a;
            lw1.f fVar = this.f128159b;
            if (i14 == 0) {
                r.b(obj);
                this.f128158a = 1;
                objX4 = fVar.x4(this);
                if (objX4 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                objX4 = obj;
            }
            if (((Boolean) objX4).booleanValue()) {
                p2 p2Var = fVar.f115117j;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, lw1.a.a((lw1.a) value, false, false, false, null, 0, null, null, null, false, false, true, false, 3071)));
                p2 p2Var2 = fVar.f115117j;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, lw1.a.a((lw1.a) value2, false, false, false, null, 0, null, null, null, false, false, false, false, 2047)));
                x3<lw1.a> x3Var = this.f128161d;
                boolean z14 = x3Var.getF182175a().f115084j;
                m0 m0Var = this.f128160c;
                if (z14 || x3Var.getF182175a().f115082h == null) {
                    y.l(m0Var, nw1.d.c.INSTANCE);
                } else {
                    y.l(m0Var, nw1.d.C2458d.INSTANCE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f128162a = new e();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(0, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f128163a = new f();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), r1.o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f128164a = new g();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f128165a = new h();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(0, s1.l.d(500, 0, null, 6), r1.o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f128166a = new i();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(0, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f128167a = new j();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), r1.o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f128168a = new k();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f128169a = new l();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(0, s1.l.d(500, 0, null, 6), r1.o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final m f128170a = new m();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(0, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class n implements e23.l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f128171a = new n();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), r1.o.f149178a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class o implements e23.l<r1.n<v>, w1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f128172a = new o();

        @Override // e23.l
        public final w1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.b(r1.n.a.f149169c, s1.l.d(500, 0, null, 6), r1.p.f149188a);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class p implements e23.l<r1.n<v>, u1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f128173a = new p();

        @Override // e23.l
        public final u1 invoke(r1.n<v> nVar) {
            r1.n<v> nVar2 = nVar;
            nVar2.getClass();
            r1.n.a.f149168b.getClass();
            return nVar2.e(0, s1.l.d(500, 0, null, 6), r1.o.f149178a);
        }
    }

    public static final void a(lw1.f fVar, ub1.g gVar, e23.a<Unit> aVar, e23.p<? super Integer, ? super Intent, Unit> pVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        o0 o0Var;
        Object s0Var;
        m0 m0Var;
        fVar.getClass();
        gVar.getClass();
        aVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-79751121);
        int i15 = i14 | (o0VarE.r(fVar) ? 4 : 2) | (o0VarE.r(gVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            m0 m0VarI = gl1.y.I(new v0[0], o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.generic_error_message);
            p1 p1VarC = s9.c.c(fVar.f115118k, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            b0 b0Var = (b0) objQ2;
            nw1.d.b bVar = nw1.d.b.INSTANCE;
            boolean zR = ((i15 & 896) == 256) | o0VarE.r(fVar) | o0VarE.B(p1VarC) | o0VarE.r(m0VarI) | o0VarE.r(context) | ((i15 & 57344) == 16384) | o0VarE.r(b0Var) | o0VarE.B(strQ) | o0VarE.r(gVar) | ((i15 & 7168) == 2048);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                s0Var = new s0(fVar, p1VarC, m0VarI, context, aVar2, b0Var, strQ, feVar, gVar, aVar, pVar);
                m0Var = m0VarI;
                o0VarE.K(s0Var);
            } else {
                s0Var = objQ3;
                m0Var = m0VarI;
            }
            o0Var = o0VarE;
            nc.y.a(m0Var, bVar, null, null, null, null, null, null, null, (e23.l) s0Var, o0Var, 0, 2044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(fVar, gVar, aVar, pVar, aVar2, i14, 29);
        }
    }
}
