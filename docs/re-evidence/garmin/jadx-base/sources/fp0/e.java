package fp0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.material.internal.ViewUtils;
import e23.p;
import ep0.y;
import ep0.z;
import et1.a2;
import fo.x;
import h5.e0;
import i3.e5;
import i3.mh;
import i3.v5;
import java.util.List;
import l72.c1;
import lc.u0;
import n70.a7;
import o4.d0;
import o53.b0;
import o70.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p5.v;
import r1.q2;
import r70.q;
import r70.r;
import s5.x0;
import u1.w;
import yz1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lfp0/e;", "Lr70/r;", "Lhp0/a;", "stateHolder", "Lgp0/a;", "lastSevenDaysNavigation", "<init>", "(Lhp0/a;Lgp0/a;)V", "", "hideSectionError", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp0.a f73154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp0.a f73155b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.yesterday.presentation.dashboard.component.LastSevenDaysStatsComposable$DashboardItem$3$1$2$1$1", f = "LastSevenDaysStatsComposable.kt", l = {115}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73156a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73156a;
            if (i14 == 0) {
                o13.r.b(obj);
                a7 a7Var = e.this.f73154a.f84933b;
                o70.f fVar = o70.f.LAST_SEVEN_DAYS;
                this.f73156a = 1;
                if (a7Var.a(fVar, this) == aVar) {
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

    public e(hp0.a aVar, gp0.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f73154a = aVar;
        this.f73155b = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // r70.r
    public final void a(final h4.r rVar, final q qVar, p3.m mVar, final int i14) throws Throwable {
        o0 o0Var;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        Object obj;
        float F;
        i53.c<y> cVar;
        float f14;
        Context context;
        Object obj2;
        Object obj3;
        int i15;
        Object obj4;
        boolean z14;
        Object obj5;
        o0 o0Var2;
        boolean z15;
        d0 d0VarE;
        d0 d0Var;
        long jC;
        Object obj6;
        int i16;
        float f15;
        float f16;
        Object obj7;
        Object obj8;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -556591639);
        p3.c<?> cVar2 = o0VarQ.f135177b;
        int i17 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i17 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            Object obj9 = p3.m.a.f135155b;
            if (objQ == obj9) {
                obj = objQ;
                Object objJ = l0.j(t13.h.f161748a, o0VarQ);
                o0VarQ.K(objJ);
                obj = objJ;
            }
            obj = objQ;
            Object obj10 = (b0) obj;
            Object objQ2 = o0VarQ.q();
            if (objQ2 == obj9) {
                ep0.b bVar = this.f73154a.f84932a;
                Object gVar = new ep0.g(bVar.f64862b, bVar);
                o0VarQ.K(gVar);
                objQ2 = gVar;
            }
            z zVar = (z) s9.c.b((r53.i) objQ2, null, o0VarQ, 48).getF182175a();
            if (zVar == null) {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i18 = 0;
                pVar = new p(this) { // from class: fp0.b

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ e f73146b;

                    {
                        this.f73146b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj11, Object obj12) throws Throwable {
                        int i19 = i18;
                        p3.m mVar2 = (p3.m) obj11;
                        ((Integer) obj12).getClass();
                        switch (i19) {
                            case 0:
                                this.f73146b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                            default:
                                this.f73146b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                u uVar = zVar.f64918d.f200298a;
                i53.c<y> cVar3 = zVar.f64917c;
                boolean z16 = uVar == u.LOADING;
                if (z16) {
                    o0VarQ.C(1986360032);
                    F = jg.b.F(o0VarQ);
                    o0VarQ.g0(false);
                } else {
                    o0VarQ.C(-1781967115);
                    o0VarQ.g0(false);
                    F = 1.0f;
                }
                boolean zIsEmpty = cVar3.isEmpty();
                boolean z17 = zVar.f64915a && zIsEmpty;
                boolean z18 = uVar == u.ERROR;
                Object objQ3 = o0VarQ.q();
                Object obj11 = objQ3;
                if (objQ3 == obj9) {
                    Object objN = p0.n(Boolean.FALSE);
                    o0VarQ.K(objN);
                    obj11 = objN;
                }
                p1 p1Var = (p1) obj11;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarQ.C(1447971940);
                    c1 c1Var = c1.f110940a;
                    String strQ = gl1.y.Q(o0VarQ, R.string.lbl_one_section_required);
                    String strQ2 = gl1.y.Q(o0VarQ, R.string.msg_one_section_required);
                    String strQ3 = gl1.y.Q(o0VarQ, R.string.lbl_ok);
                    Object objQ4 = o0VarQ.q();
                    if (objQ4 == obj9) {
                        obj8 = objQ4;
                        Object a2Var = new a2(p1Var, 20);
                        o0VarQ.K(a2Var);
                        obj8 = a2Var;
                    }
                    obj8 = objQ4;
                    e23.a<Unit> aVar = (e23.a) obj8;
                    Object objQ5 = o0VarQ.q();
                    Object obj12 = objQ5;
                    if (objQ5 == obj9) {
                        Object d0Var2 = new fb1.d0(18);
                        o0VarQ.K(d0Var2);
                        obj12 = d0Var2;
                    }
                    context = context2;
                    obj2 = obj10;
                    obj3 = obj9;
                    f14 = F;
                    obj4 = zVar;
                    i15 = 0;
                    cVar = cVar3;
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar, null, (e23.a) obj12, o0VarQ, 100663302, 6, 728);
                    o0VarQ.g0(false);
                } else {
                    cVar = cVar3;
                    f14 = F;
                    context = context2;
                    obj2 = obj10;
                    obj3 = obj9;
                    i15 = 0;
                    obj4 = zVar;
                    o0VarQ.C(1448422649);
                    o0VarQ.g0(false);
                }
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f17 = eVar.f97920e;
                float f18 = eVar.f97918c;
                bVar2.getClass();
                float f19 = eVar.f97920e;
                bVar2.getClass();
                int i19 = i15;
                h4.r rVarC = c2.l.C(rVar, f17, f19, eVar.f97920e, 0.0f, 8);
                c2.j.i iVarG = q2.g(bVar2, c2.j.f22691a, f18);
                h4.d.f81522a.getClass();
                h4.g.a aVar2 = h4.d.a.f81536n;
                c2.z zVarA = c2.y.a(iVarG, aVar2, o0VarQ, i19);
                int iHashCode = Long.hashCode(o0VarQ.U);
                i2 i2VarA0 = o0VarQ.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0VarQ);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar3);
                } else {
                    o0VarQ.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA, o0VarQ);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarQ);
                h5.g.a.b bVar3 = h5.g.a.f81813j;
                if (o0VarQ.T || !s.g(o0VarQ.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarQ, iHashCode, bVar3);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarQ);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r.a aVar4 = h4.r.S;
                h4.r rVarF = x2.f(aVar4, 1.0f);
                bVar2.getClass();
                float f22 = eVar.f97918c;
                bVar2.getClass();
                h4.r rVarC3 = c2.l.C(rVarF, 0.0f, f22, 0.0f, eVar.f97918c, 5);
                s2 s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81533k, o0VarQ, 6);
                int iHashCode2 = Long.hashCode(o0VarQ.U);
                i2 i2VarA1 = o0VarQ.a0();
                h4.r rVarC4 = h4.k.c(rVarC3, o0VarQ);
                if (cVar2 == null) {
                    p0.l();
                    throw null;
                }
                o0VarQ.z();
                if (o0VarQ.T) {
                    o0VarQ.M(aVar3);
                } else {
                    o0VarQ.c();
                }
                b4.c(eVar2, s2VarA, o0VarQ);
                b4.c(c1623g, i2VarA1, o0VarQ);
                if (o0VarQ.T || !s.g(o0VarQ.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarQ, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC4, o0VarQ);
                u2 u2Var = u2.f22900a;
                Object objQ6 = o0VarQ.q();
                Object obj13 = obj3;
                Object obj14 = objQ6;
                if (objQ6 == obj13) {
                    Object xVar = new x(7);
                    o0VarQ.K(xVar);
                    obj14 = xVar;
                }
                h4.r rVarC5 = v.c((e23.l) obj14, aVar4, false);
                String strQ4 = gl1.y.Q(o0VarQ, R.string.lbl_last_7_days);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                Object obj15 = obj13;
                h4.r.a aVar5 = aVar4;
                mh.c(strQ4, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarQ), o0VarQ, 0, 0, 131068);
                o0 o0Var3 = o0VarQ;
                if ((z17 || zIsEmpty) && !z18) {
                    o0Var3.C(1435115272);
                    String strQ5 = gl1.y.Q(o0Var3, R.string.lbl_hide);
                    String strP = gl1.y.P(R.string.lbl_button_desc, new Object[]{strQ5}, o0Var3);
                    h4.r rVarC6 = u2Var.c(aVar5, h4.d.a.f81535m);
                    Object obj16 = obj4;
                    Object obj17 = obj2;
                    boolean zR = o0Var3.r(obj16) | o0Var3.r(obj17) | o0Var3.r(this);
                    Object objQ7 = o0Var3.q();
                    if (zR || objQ7 == obj15) {
                        Object eVar3 = new af0.e(obj16, obj17, (Object) this, (Object) p1Var, 23);
                        o0Var3.K(eVar3);
                        objQ7 = eVar3;
                    }
                    h4.r rVarD = w.d(rVarC6, false, null, null, (e23.a) objQ7, 15);
                    boolean zB = o0Var3.B(strP);
                    Object objQ8 = o0Var3.q();
                    if (zB || objQ8 == obj15) {
                        z14 = false;
                        Object cVar4 = new c(strP, 0);
                        o0Var3.K(cVar4);
                        obj5 = cVar4;
                    } else {
                        z14 = false;
                        obj5 = objQ8;
                    }
                    h4.r rVarC7 = v.c((e23.l) obj5, rVarD, z14);
                    fVar2.getClass();
                    obj15 = r12;
                    boolean z19 = z14;
                    mh.c(strQ5, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, hb.a.e(o0Var3), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var3, 0, 0, 131068);
                    o0 o0Var4 = o0Var3;
                    o0Var4.g0(z19);
                    z15 = z19;
                    o0Var2 = o0Var4;
                } else {
                    aVar5 = aVar5;
                    z15 = false;
                    o0Var3.C(1436152191);
                    o0Var3.g0(false);
                    o0Var2 = o0Var3;
                }
                boolean z24 = true;
                o0Var2.g0(true);
                if (z16) {
                    o0Var2.C(842522622);
                    a02.f.b(x2.f(aVar5, 1.0f), f14, o0Var2, 54);
                    o0Var2.g0(z15);
                } else {
                    h4.r.a aVar6 = aVar5;
                    float f24 = 1.0f;
                    int i24 = 3;
                    float f25 = 0.0f;
                    if (z18) {
                        o0Var2.C(842693773);
                        long jF = d92.b.a(o0Var2).c().f();
                        bVar2.getClass();
                        h4.r rVarX = x2.x(x2.f(u1.n.e(aVar6, jF, k2.i.a(f18)), 1.0f), null, 3);
                        bVar2.getClass();
                        h4.r rVarA = c2.l.A(rVarX, 0.0f, eVar.f97920e, 1);
                        bVar2.getClass();
                        yz1.h.a(z15 ? 1 : 0, 2, null, c2.l.A(rVarA, eVar.f97922g, 0.0f, 2), o0Var2);
                        o0Var2.g0(z15);
                    } else {
                        Throwable th3 = null;
                        if (z17) {
                            o0Var2.C(843274744);
                            h4.r rVarX2 = x2.x(x2.f(aVar6, 1.0f), null, 3);
                            d0 d0VarA = d0.a(d92.b.a(o0Var2).f().b());
                            String strQ6 = gl1.y.Q(o0Var2, R.string.msg_no_data_available);
                            List listC = p13.w.c(gl1.y.Q(o0Var2, R.string.msg_turn_on_in_focus_or_at_a_glance));
                            String strQ7 = gl1.y.Q(o0Var2, R.string.lbl_home_settings);
                            boolean zR2 = o0Var2.r(qVar);
                            Object objQ9 = o0Var2.q();
                            if (zR2 || objQ9 == obj15) {
                                obj7 = objQ9;
                                Object dVar = new d(qVar, z15 ? 1 : 0);
                                o0Var2.K(dVar);
                                obj7 = dVar;
                            }
                            obj7 = objQ9;
                            yz1.g.a(rVarX2, R.drawable.other_activity, d0VarA, strQ6, listC, strQ7, (e23.a) obj7, null, null, o0Var2, 6, 384);
                            o0Var2.g0(z15);
                        } else if (zIsEmpty) {
                            o0Var2.C(844097825);
                            yz1.g.a(x2.x(x2.f(aVar6, 1.0f), null, 3), R.drawable.other_activity, d0.a(d92.b.a(o0Var2).f().b()), gl1.y.Q(o0Var2, R.string.no_data_week), p13.w.c(gl1.y.Q(o0Var2, R.string.use_device_seven_days)), null, null, null, null, o0Var2, 6, 480);
                            o0Var2.g0(z15);
                        } else {
                            o0Var2.C(844724583);
                            h4.r rVarF2 = x2.f(aVar6, 1.0f);
                            long jF2 = d92.b.a(o0Var2).c().f();
                            bVar2.getClass();
                            h4.r rVarE = u1.n.e(rVarF2, jF2, k2.i.a(f18));
                            c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar2, o0Var2, z15 ? 1 : 0);
                            int iHashCode3 = Long.hashCode(o0Var2.U);
                            i2 i2VarA2 = o0Var2.a0();
                            h4.r rVarC8 = h4.k.c(rVarE, o0Var2);
                            if (cVar2 == null) {
                                p0.l();
                                throw null;
                            }
                            o0Var2.z();
                            if (o0Var2.T) {
                                o0Var2.M(aVar3);
                            } else {
                                o0Var2.c();
                            }
                            b4.c(eVar2, zVarA2, o0Var2);
                            b4.c(c1623g, i2VarA2, o0Var2);
                            if (o0Var2.T || !s.g(o0Var2.q(), Integer.valueOf(iHashCode3))) {
                                v.h.A(iHashCode3, o0Var2, iHashCode3, bVar3);
                            }
                            b4.c(fVar, rVarC8, o0Var2);
                            o0Var2.C(742592305);
                            int i25 = z15 ? 1 : 0;
                            ?? r14 = z15;
                            for (y yVar : cVar) {
                                int i26 = i25 + 1;
                                if (i25 < 0) {
                                    Throwable th4 = th3;
                                    p13.x.q();
                                    throw th4;
                                }
                                y yVar2 = yVar;
                                int i27 = yVar2.f64914k;
                                ep0.b0 b0Var2 = yVar2.f64909f;
                                if (i27 != 0) {
                                    o0Var2.C(-478162952);
                                    jC = n5.a.a(o0Var2, yVar2.f64914k);
                                    o0Var2.g0(r14);
                                } else {
                                    o0Var2.C(-1938066759);
                                    t.a aVar7 = t.f130062f;
                                    String str = b0Var2.f64868a;
                                    aVar7.getClass();
                                    t tVarA = t.a.a(str);
                                    t.b bVarD = t.a.d(b0Var2.f64869b);
                                    if (tVarA == 0) {
                                        o0Var2.C(-1937681616);
                                        o0Var2.g0(r14);
                                        d0Var = th3;
                                    } else {
                                        o0Var2.C(-478147855);
                                        d0VarE = tVarA.e(bVarD, o0Var2, r14);
                                        o0Var2.g0(r14);
                                    }
                                    if (d0Var == 0) {
                                        d0Var = d0VarE;
                                        o0Var2.C(-478146487);
                                        gl.c.f77766a.getClass();
                                        jC = gl.c.a(o0Var2).c();
                                        o0Var2.g0(r14);
                                    } else {
                                        d0Var = d0VarE;
                                        o0Var2.C(-478148409);
                                        o0Var2.g0(r14);
                                        jC = d0Var.f128833a;
                                    }
                                    o0Var2.g0(r14);
                                }
                                u4.d dVar2 = yVar2.f64913j;
                                if (dVar2 == null) {
                                    o0Var2.C(-1937494903);
                                    o0Var2.g0(r14);
                                    f15 = f24;
                                    i16 = i24;
                                    f16 = f25;
                                } else {
                                    o0Var2.C(-1937494902);
                                    h4.r rVarF3 = x2.f(h4.r.S, f24);
                                    String str2 = yVar2.f64908e;
                                    long j8 = jC;
                                    String str3 = yVar2.f64904a;
                                    String str4 = yVar2.f64905b;
                                    float f26 = f24;
                                    String str5 = yVar2.f64906c;
                                    String str6 = yVar2.f64907d;
                                    Context context3 = context;
                                    boolean zR3 = o0Var2.r(this) | o0Var2.r(context3) | o0Var2.r(yVar2);
                                    Object objQ10 = o0Var2.q();
                                    if (zR3 || objQ10 == p3.m.a.f135155b) {
                                        obj6 = objQ10;
                                        fk0.a aVar8 = new fk0.a(i24, context3, this, yVar2);
                                        o0Var2.K(aVar8);
                                        obj6 = aVar8;
                                    }
                                    obj6 = objQ10;
                                    context = context3;
                                    i16 = i24;
                                    f15 = f26;
                                    f16 = 0.0f;
                                    j.a(rVarF3, dVar2, j8, str2, str3, str4, str5, str6, null, null, (e23.a) obj6, o0Var2, 6, ViewUtils.EDGE_TO_EDGE_FLAGS);
                                    Unit unit = Unit.INSTANCE;
                                    o0Var2.g0(false);
                                }
                                z24 = true;
                                h4.r rVarA2 = l4.k.a(x2.f(h4.r.S, f15), i25 < cVar.size() - 1 ? f15 : f16);
                                d92.b.f58623a.getClass();
                                v5.a(0.0f, 0, 2, d92.b.a(o0Var2).j().c(), rVarA2, o0Var2);
                                f24 = f15;
                                i25 = i26;
                                i24 = i16;
                                f25 = f16;
                                th3 = th3;
                                r14 = 0;
                            }
                            e5.u(o0Var2, r14, z24, r14);
                        }
                    }
                }
                o0Var2.g0(z24);
                x1 x1Var2 = n.f135158a;
                o0Var = o0Var2;
            }
            p2VarI0.f135219d = pVar;
        }
        o0VarQ.e();
        o0Var = o0VarQ;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i28 = 1;
            pVar = new p(this) { // from class: fp0.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e f73146b;

                {
                    this.f73146b = this;
                }

                @Override // e23.p
                public final Object invoke(Object obj18, Object obj19) throws Throwable {
                    int i110 = i28;
                    p3.m mVar2 = (p3.m) obj18;
                    ((Integer) obj19).getClass();
                    switch (i110) {
                        case 0:
                            this.f73146b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                            break;
                        default:
                            this.f73146b.a(rVar, qVar, mVar2, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
