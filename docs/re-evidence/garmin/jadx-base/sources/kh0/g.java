package kh0;

import am.i1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.t2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import g02.n1;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.mh;
import i3.ve;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd0.h6;
import kd0.j5;
import lc.y;
import o53.b0;
import o53.f0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.components.FitnessAgeCurrentDetailsReportsPageKt$MetricsDetailsPage$1$3$1$1", f = "FitnessAgeCurrentDetailsReportsPage.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f104728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f104728b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f104728b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104727a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f104727a = 1;
                if (this.f104728b.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.fitness_age.presentation.components.FitnessAgeCurrentDetailsReportsPageKt$MetricsDetailsPage$1$5$1$1", f = "FitnessAgeCurrentDetailsReportsPage.kt", l = {168}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f104730b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f104730b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f104730b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f104729a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f104729a = 1;
                if (this.f104730b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104731a;

        static {
            int[] iArr = new int[dh0.m.values().length];
            try {
                iArr[dh0.m.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dh0.m.TARGET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[dh0.m.REAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f104731a = iArr;
        }
    }

    public static final void a(dh0.a aVar, ih0.s sVar, y yVar, p3.m mVar, int i14) {
        int i15;
        sVar.getClass();
        yVar.getClass();
        o0 o0VarE = mVar.E(-2028984602);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(sVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(yVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            b(aVar.f59547f, z3.f.c(-1384329823, new jt1.m((Object) sVar, (Object) aVar, (Object) yVar, false, 9), o0VarE), o0VarE, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(aVar, sVar, yVar, i14, 1);
        }
    }

    public static final void b(DateTime dateTime, z3.e eVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1498850103);
        int i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ve.a(null, null, tn.k.b(d92.b.f58623a, o0VarE), 0L, 0.0f, 0.0f, null, z3.f.c(1878032636, new kh0.c(dateTime, eVar), o0VarE), o0VarE, 12582912, 123);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kh0.c(dateTime, eVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0192  */
    /* JADX WARN: Code duplicated, block: B:101:0x0195  */
    /* JADX WARN: Code duplicated, block: B:130:0x0238  */
    /* JADX WARN: Code duplicated, block: B:81:0x015b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(u82.f<dh0.a> fVar, ih0.s sVar, y yVar, p3.m mVar, int i14) {
        boolean z14;
        Object eVar;
        ih0.s sVar2 = sVar;
        fVar.getClass();
        sVar2.getClass();
        yVar.getClass();
        o0 o0VarE = mVar.E(-2041427215);
        int i15 = (i14 & 6) == 0 ? ((i14 & 8) == 0 ? o0VarE.B(fVar) : o0VarE.r(fVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(sVar2) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(yVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            dh0.a aVarA = fVar.a();
            p1 p1VarG = f0.G(sVar2.f93489h, o0VarE);
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (aVarA != null) {
                o0VarE.C(645822148);
                Double d14 = aVarA.f59543b;
                boolean z15 = d14 != null && d14.doubleValue() > 0.0d;
                List<dh0.d> list = aVarA.f59546e;
                ArrayList arrayListL = androidx.core.view.j.l(list);
                for (Object obj : list) {
                    dh0.d dVar = (dh0.d) obj;
                    dVar.getClass();
                    Boolean bool = dVar.f59567d;
                    if ((bool != null ? bool.booleanValue() : false) || ih0.f.a(dVar)) {
                        arrayListL.add(obj);
                    }
                }
                dh0.f fVar2 = aVarA.f59549h;
                dh0.f.b bVar2 = dh0.f.b.f59586d;
                if (p005kotlin.jvm.internal.s.g(fVar2, bVar2)) {
                    z14 = true;
                } else {
                    f12.l lVar = sVar2.f93485d;
                    boolean z16 = lVar.l1() != null;
                    boolean z17 = lVar.w().length() > 0;
                    boolean z18 = lVar.t() > 0.0f;
                    if (z16 && z17 && z18) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                }
                if (fVar2 != null && !fVar2.equals(bVar2)) {
                    eVar = ih0.c.f93447a;
                } else if (!z15) {
                    eVar = new ih0.e(z15, z14, arrayListL);
                } else if (!arrayListL.isEmpty()) {
                    Iterator it = arrayListL.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            dh0.d dVar2 = (dh0.d) it.next();
                            dVar2.getClass();
                            Boolean bool2 = dVar2.f59567d;
                            if (bool2 != null ? bool2.booleanValue() : false) {
                            }
                        } else if (z14) {
                            eVar = ih0.d.f93448a;
                        }
                        eVar = new ih0.e(z15, z14, arrayListL);
                    }
                } else if (z14) {
                    eVar = new ih0.e(z15, z14, arrayListL);
                } else {
                    eVar = ih0.d.f93448a;
                }
                if (p005kotlin.jvm.internal.s.g(eVar, ih0.c.f93447a)) {
                    o0VarE.C(1683404928);
                    a(aVarA, sVar2, yVar, o0VarE, i15 & 1008);
                    o0VarE.g0(false);
                } else if (p005kotlin.jvm.internal.s.g(eVar, ih0.d.f93448a)) {
                    o0VarE.C(1683408896);
                    i(aVarA, sVar2, yVar, o0VarE, i15 & 1008);
                    o0VarE.g0(false);
                } else {
                    if (!(eVar instanceof ih0.e)) {
                        throw kg.f.h(o0VarE, 1683400958, false);
                    }
                    o0VarE.C(646198426);
                    ih0.e eVar2 = (ih0.e) eVar;
                    j(aVarA, eVar2.f93449a, eVar2.f93450b, eVar2.f93451c, sVar, o0VarE, 57344 & (i15 << 9));
                    sVar2 = sVar;
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(646376955);
                o0VarE.g0(false);
            }
            v60.a aVar3 = (v60.a) p1VarG.getF182175a();
            if (aVar3 != null && aVar3.f175792a) {
                o0VarE.C(646446116);
                v60.a aVar4 = (v60.a) p1VarG.getF182175a();
                String str = aVar4 != null ? aVar4.f175793b : null;
                boolean zR = o0VarE.r(sVar2);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new ih0.r(sVar2, 1);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ih0.r(sVar2, 1);
                        o0VarE.K(objQ);
                    }
                }
                l.a(0, (e23.a) objQ, str, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(646591227);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(fVar, sVar2, yVar, i14, 7);
        }
    }

    public static final void d(dh0.n nVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1296471525);
        int i15 = (o0VarE.B(nVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            lh0.n.f(c2.l.B(aVar, f14, 32, f14, 24), z3.f.c(1804222473, new d(nVar, 0), o0VarE), o0VarE, 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.c(nVar, i14, 26);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    public static final void e(DateTime dateTime, p3.m mVar, int i14) {
        o0 o0Var;
        ih0.i iVar;
        String strA;
        o0 o0VarE = mVar.E(446191926);
        int i15 = (o0VarE.r(dateTime) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(dateTime);
            Object objQ = o0VarE.q();
            if (zB) {
                iVar = new ih0.i(context);
                if (dateTime != null) {
                    strA = iVar.f93454a.a(R.string.lbl_updated_date, iVar.f93455b.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY));
                } else {
                    strA = "";
                }
                objQ = strA;
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    iVar = new ih0.i(context);
                    if (dateTime != null) {
                        strA = iVar.f93454a.a(R.string.lbl_updated_date, iVar.f93455b.a(dateTime, qi0.a.RELATIVE_YEAR_MONTH_DAY));
                    } else {
                        strA = "";
                    }
                    objQ = strA;
                    o0VarE.K(objQ);
                }
            }
            String str = (String) objQ;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, f14, f14, f14, 0.0f, 8);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(str, rVarC, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 48, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.c(dateTime, i14, 27);
        }
    }

    public static final void f(ih0.n nVar, p3.m mVar, int i14) {
        String strJ;
        String strP;
        x0 x0Var;
        nVar.getClass();
        o0 o0VarE = mVar.E(775798265);
        int i15 = (o0VarE.B(nVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (nVar.equals(ih0.n.c.f93467a)) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 233340477, R.string.msg_maintain_fitness_age, o0VarE, false);
            } else if (nVar.equals(ih0.n.a.f93464a)) {
                o0VarE.C(233479915);
                strJ = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(o0VarE, R.string.msg_reached_achievable_fitness_age), gl1.y.Q(o0VarE, R.string.msg_maintain_fitness_age)}, o0VarE);
                o0VarE.g0(false);
            } else if (nVar instanceof ih0.n.b) {
                o0VarE.C(233817319);
                ih0.n.b bVar = (ih0.n.b) nVar;
                double d14 = bVar.f93466b;
                if (d14 == 1.0d) {
                    strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 233958617, R.string.lbl_one_year, o0VarE, false);
                } else {
                    o0VarE.C(234043867);
                    strP = gl1.y.P(R.string.lbl_years_multiple, new Object[]{new ih0.i((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).b(Double.valueOf(d14))}, o0VarE);
                    o0VarE.g0(false);
                }
                if (bVar.f93465a) {
                    o0VarE.C(234261208);
                    strJ = gl1.y.P(R.string.string_space_string_pattern, new Object[]{gl1.y.Q(o0VarE, R.string.msg_fitness_age_right_direction), gl1.y.P(R.string.msg_reduce_fitness_age, new Object[]{strP}, o0VarE)}, o0VarE);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(234560823);
                    strJ = gl1.y.P(R.string.msg_reduce_fitness_age, new Object[]{strP}, o0VarE);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else if (nVar instanceof ih0.n.d) {
                o0VarE.C(234731075);
                strJ = gl1.y.Q(o0VarE, ((ih0.n.d) nVar).f93468a.f59585b);
                o0VarE.g0(false);
            } else {
                if (!nVar.equals(ih0.n.e.f93469a)) {
                    throw kg.f.h(o0VarE, 977357586, false);
                }
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 234852471, R.string.msg_fitness_age_need_more_info, o0VarE, false);
            }
            boolean z14 = nVar instanceof ih0.n.d;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarF = x2.f(c2.l.C(aVar, f14, 0.0f, f14, 0.0f, 10), 1.0f);
            if (z14) {
                o0VarE.C(-1782162969);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0Var = j92.f.f97932i;
            } else {
                o0VarE.C(-1782164089);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0Var = j92.f.f97931h;
            }
            x0 x0VarB = d92.c.b(x0Var, o0VarE);
            o0VarE.g0(false);
            d6.h.f57752b.getClass();
            mh.c(strJ, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 48, 0, 130044);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ik1.c(nVar, i14, 25);
        }
    }

    public static final void g(e23.a aVar, p3.m mVar, int i14) {
        aVar.getClass();
        o0 o0VarE = mVar.E(-928294090);
        int i15 = (o0VarE.k(R.string.lbl_more_about_fitness_age) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0 f0Var = l72.f0.f110999a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_more_about_fitness_age);
            g6.f.a aVar2 = g6.f.f75994b;
            float f14 = 16;
            f0Var.d(57344 & (i15 << 9), 9, aVar, c2.l.C(h4.r.S, f14, 24, f14, 0.0f, 8), strQ, o0VarE, null, false);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new hl1.i(aVar, i14, 18);
        }
    }

    public static final void h(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1814357038);
        int i15 = (o0VarE.k(R.string.lbl_no_fitness_age) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_fitness_age);
            g6.f.a aVar = g6.f.f75994b;
            float f14 = 16;
            h4.r rVarB = c2.l.B(h4.r.S, f14, 108, f14, 8);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97930g), o0VarE);
            d6.h.f57752b.getClass();
            o0Var = o0VarE;
            mh.c(strQ, rVarB, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, o0Var, 0, 0, 130044);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new kc0.a(i14, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(dh0.a aVar, ih0.s sVar, y yVar, p3.m mVar, int i14) {
        int i15;
        sVar.getClass();
        yVar.getClass();
        o0 o0VarE = mVar.E(-1469286888);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(sVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(yVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b(aVar.f59547f, z3.f.c(1576337181, new k41.e(10, sVar, aVar), o0VarE), o0VarE, 48);
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var2 = (b0) objQ;
            Object[] objArr = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new j5(4);
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ2, o0VarE, 48);
            List<dh0.d> list = aVar.f59546e;
            boolean zR = o0VarE.r(sVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new kh0.b(sVar, 1);
                o0VarE.K(objQ3);
            }
            e23.l lVar = (e23.l) objQ3;
            boolean zB = o0VarE.B(p1Var) | o0VarE.r(b0Var2) | o0VarE.B(mcVarF);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new e(p1Var, b0Var2, mcVarF, 0);
                o0VarE.K(objQ4);
            }
            s.e(list, lVar, (e23.l) objQ4, o0VarE, 0);
            dh0.g gVar = (dh0.g) p1Var.getF182175a();
            if (!mcVarF.e() || gVar == null) {
                o0VarE.C(-1256240864);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1256873202);
                boolean zR2 = o0VarE.r(yVar);
                Object objQ5 = o0VarE.q();
                if (zR2 || objQ5 == c2565a) {
                    objQ5 = new gk1.b(yVar, 3);
                    o0VarE.K(objQ5);
                }
                e23.a aVar4 = (e23.a) objQ5;
                boolean zR3 = o0VarE.r(b0Var2) | o0VarE.B(mcVarF) | o0VarE.r(sVar);
                Object objQ6 = o0VarE.q();
                if (zR3 || objQ6 == c2565a) {
                    objQ6 = new k62.k(b0Var2, 5, sVar, mcVarF);
                    o0VarE.K(objQ6);
                }
                lh0.j.a(mcVarF, b0Var2, gVar, aVar, aVar4, (e23.l) objQ6, o0VarE, (i15 << 9) & 7168);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(aVar, sVar, yVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0113  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x018c  */
    public static final void j(dh0.a aVar, boolean z14, boolean z15, List<dh0.d> list, ih0.s sVar, p3.m mVar, int i14) {
        List<dh0.h> list2;
        sVar.getClass();
        o0 o0VarE = mVar.E(-1409548255);
        int i15 = 2;
        int i16 = (i14 & 6) == 0 ? (o0VarE.r(aVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.h(z14) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z15) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(list) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(sVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            b(aVar.f59547f, z3.f.c(-1243793540, new i1(z14, sVar, aVar, 22), o0VarE), o0VarE, 48);
            ArrayList arrayList = new ArrayList();
            if (z15) {
                arrayList.add(ih0.o.b.f93471a);
            } else {
                dh0.d dVarA = ih0.g.a(list, dh0.g.BMI);
                dh0.h hVar = dh0.h.HEIGHT;
                hVar.getClass();
                if (dVarA != null && (list2 = dVarA.f59568e) != null && list2.contains(hVar)) {
                    arrayList.add(ih0.o.b.f93471a);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                dh0.d dVar = (dh0.d) obj;
                dVar.getClass();
                int i17 = ih0.f.a.f93452a[dVar.f59564a.ordinal()];
                if (i17 != 1 && i17 != i15) {
                    if (i17 != 3) {
                        arrayList2.add(obj);
                    } else {
                        dh0.h hVar2 = dh0.h.WEIGHT;
                        hVar2.getClass();
                        List<dh0.h> list3 = dVar.f59568e;
                        if ((list3 != null && list3.contains(hVar2)) || ih0.f.a(dVar)) {
                            arrayList2.add(obj);
                        }
                    }
                }
                i15 = 2;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new ih0.o.a(((dh0.d) it.next()).f59564a));
            }
            boolean zR = o0VarE.r(sVar);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new kh0.b(sVar, 0);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new kh0.b(sVar, 0);
                    o0VarE.K(objQ);
                }
            }
            w.b(arrayList, (e23.l) objQ, o0VarE, 0);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n1(aVar, z14, z15, list, sVar, i14);
        }
    }

    public static final void k(t2 t2Var, dh0.l lVar, ih0.i iVar, p3.m mVar, int i14) {
        int i15;
        l22.a aVar = iVar.f93454a;
        o0 o0VarE = mVar.E(-469411813);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(t2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(lVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (lVar != null) {
                o0VarE.C(166345045);
                Double d14 = lVar.f59609b;
                int i16 = c.f104731a[lVar.f59608a.ordinal()];
                if (i16 == 1) {
                    int i17 = i15;
                    o0VarE.C(166430109);
                    String strB = iVar.b(d14);
                    if (d14 == null || d14.doubleValue() <= 0.0d) {
                        o0VarE.C(166671847);
                        lh0.n.c(t2Var, aVar.getString(R.string.lbl_no_fitness_age), strB, o0VarE, i17 & 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(166546607);
                        lh0.n.b(t2Var, aVar.getString(R.string.lbl_fitness_age), strB, o0VarE, i17 & 14);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else if (i16 == 2) {
                    o0VarE.C(166857568);
                    if (d14 != null) {
                        o0VarE.C(166890769);
                        lh0.n.a(t2Var, aVar.getString(R.string.workout_target), iVar.b(d14), null, o0VarE, i15 & 14, 4);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(167104111);
                        lh0.n.d(t2Var, o0VarE, i15 & 14);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                } else {
                    if (i16 != 3) {
                        throw kg.f.h(o0VarE, -133179912, false);
                    }
                    o0VarE.C(167216176);
                    if (d14 != null) {
                        o0VarE.C(167249377);
                        lh0.n.g(t2Var, aVar.getString(R.string.lbl_age), iVar.b(d14), o0VarE, i15 & 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(167385839);
                        lh0.n.d(t2Var, o0VarE, i15 & 14);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(167476359);
                lh0.n.d(t2Var, o0VarE, i15 & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(t2Var, lVar, iVar, i14, 6);
        }
    }
}
