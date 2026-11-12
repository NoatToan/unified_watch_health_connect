package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import n70.a7;
import n70.d6;
import n70.h6;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ls70/z1;", "Lr70/r;", "Ly70/v;", "stateHolder", "Ln70/g;", "dashboardDelegate", "<init>", "(Ly70/v;Ln70/g;)V", "", "hideSectionError", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z1 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.v f157846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n70.g f157847b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.TrainingPlanSectionComposable$DashboardItem$3$1$3$1$1", f = "TrainingPlanSectionComposable.kt", l = {116}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157848a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return z1.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157848a;
            if (i14 == 0) {
                o13.r.b(obj);
                a7 a7Var = z1.this.f157846a.f194685c;
                o70.f fVar = o70.f.TRAINING;
                this.f157848a = 1;
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

    public z1(y70.v vVar, n70.g gVar) {
        vVar.getClass();
        gVar.getClass();
        this.f157846a = vVar;
        this.f157847b = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v26 */
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
    public final void a(final h4.r rVar, final r70.q qVar, p3.m mVar, final int i14) {
        int i15;
        final z1 z1Var;
        p3.o0 o0Var;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        int i16;
        int i17;
        c.q qVar2;
        Context context;
        Object obj;
        int i18;
        Object obj2;
        int i19;
        p3.o0 o0Var2;
        Object obj3;
        h4.r.a aVar;
        final ?? r14;
        p3.o0 o0Var3;
        float F;
        u2 u2Var;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -1183862444);
        p3.c<?> cVar = o0VarQ.f135177b;
        int iA = o0VarQ.a();
        int i24 = 4;
        if ((i14 & 6) == 0) {
            i15 = (o0VarQ.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarQ.r(qVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            Object obj4 = p3.m.a.f135155b;
            if (objQ == obj4) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarQ);
                o0VarQ.K(objQ);
            }
            Object obj5 = (o53.b0) objQ;
            g.h hVar = new g.h();
            boolean zR = o0VarQ.r(this);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == obj4) {
                objQ2 = new b0(this, i24);
                o0VarQ.K(objQ2);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ2, o0VarQ, 0);
            Object objQ3 = o0VarQ.q();
            if (objQ3 == obj4) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarQ.K(objQ3);
            }
            p3.p1 p1Var = (p3.p1) objQ3;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarQ.C(1825847321);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarQ, R.string.lbl_one_section_required);
                String strQ2 = gl1.y.Q(o0VarQ, R.string.msg_one_section_required);
                String strQ3 = gl1.y.Q(o0VarQ, R.string.lbl_ok);
                Object objQ4 = o0VarQ.q();
                if (objQ4 == obj4) {
                    objQ4 = new rk0.w(p1Var, 24);
                    o0VarQ.K(objQ4);
                }
                e23.a<Unit> aVar2 = (e23.a) objQ4;
                Object objQ5 = o0VarQ.q();
                if (objQ5 == obj4) {
                    objQ5 = new ro0.h(26);
                    o0VarQ.K(objQ5);
                }
                e23.a<Unit> aVar3 = (e23.a) objQ5;
                i19 = 1;
                i16 = iA;
                obj = obj5;
                obj2 = obj4;
                context = context2;
                qVar2 = qVarC;
                i18 = 0;
                i17 = i15;
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar2, null, aVar3, o0VarQ, 100663302, 6, 728);
                p3.o0 o0Var4 = o0VarQ;
                o0Var4.g0(false);
                o0Var2 = o0Var4;
            } else {
                i16 = iA;
                i17 = i15;
                qVar2 = qVarC;
                context = context2;
                obj = obj5;
                i18 = 0;
                obj2 = obj4;
                i19 = 1;
                o0VarQ.C(1826298030);
                o0VarQ.g0(false);
                o0Var2 = o0VarQ;
            }
            Object objQ6 = o0Var2.q();
            if (objQ6 == obj2) {
                h6 h6Var = this.f157846a.f194683a;
                objQ6 = r53.s.A(new d6(h6Var.f124265a, h6Var), o53.s0.f129406a);
                o0Var2.K(objQ6);
            }
            o70.c0 c0Var = (o70.c0) s9.c.b((r53.i) objQ6, null, o0Var2, 48).getF182175a();
            if (c0Var == null) {
                p2VarI0 = o0Var2.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i25 = 3;
                pVar = new e23.p(this) { // from class: s70.w1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ z1 f157817b;

                    {
                        this.f157817b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj6, Object obj7) {
                        int i26 = i25;
                        p3.m mVar2 = (p3.m) obj6;
                        ((Integer) obj7).getClass();
                        switch (i26) {
                            case 0:
                                this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            case 1:
                                this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            case 2:
                                this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                            default:
                                this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                List<r70.s> list = c0Var.f129945c;
                yz1.u uVar = c0Var.f129944b.f200298a;
                int i26 = uVar == yz1.u.LOADING ? i19 : i18;
                int i27 = uVar == yz1.u.ERROR ? i19 : i18;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97918c;
                bVar.getClass();
                Object obj6 = obj2;
                float f16 = eVar.f97921f;
                bVar.getClass();
                final Context context3 = context;
                h4.r rVarC = c2.l.C(rVar, f14, f16, eVar.f97920e, 0.0f, 8);
                c2.j.i iVarG = q2.g(bVar, c2.j.f22691a, f15);
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(iVarG, h4.d.a.f81536n, o0Var2, i18);
                int iHashCode = Long.hashCode(o0Var2.U);
                i2 i2VarA0 = o0Var2.a0();
                h4.r rVarC2 = h4.k.c(rVarC, o0Var2);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == 0) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA, o0Var2);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0Var2);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var2, iHashCode, bVar2);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0Var2);
                c2.b0 b0Var = c2.b0.f22601a;
                o0Var2.C(34432159);
                h4.r.a aVar5 = h4.r.S;
                h4.r rVarF = x2.f(aVar5, 1.0f);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                s2 s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81533k, o0Var2, 6);
                int iHashCode2 = Long.hashCode(o0Var2.U);
                i2 i2VarA1 = o0Var2.a0();
                h4.r rVarC4 = h4.k.c(rVarC3, o0Var2);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar4);
                } else {
                    o0Var2.c();
                }
                b4.c(eVar2, s2VarA, o0Var2);
                b4.c(c1623g, i2VarA1, o0Var2);
                if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC4, o0Var2);
                u2 u2Var2 = u2.f22900a;
                boolean z14 = (list.isEmpty() && i27 == 0) ? i19 : 0;
                Object objQ7 = o0Var2.q();
                if (objQ7 == obj6) {
                    objQ7 = new s5.e0(23);
                    o0Var2.K(objQ7);
                }
                h4.r rVarE = wz1.i.e(p5.v.c((e23.l) objQ7, aVar5, false), z14, new y1(u2Var2, 0), o0Var2, 0);
                String strQ4 = gl1.y.Q(o0Var2, R.string.atp_lbl_plans_section_title);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                boolean z15 = z14;
                p3.o0 o0Var5 = o0Var2;
                int i28 = i16;
                mh.c(strQ4, rVarE, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var2), o0Var5, 0, 0, 131068);
                p3.o0 o0Var6 = o0Var5;
                if (z15) {
                    o0Var6.C(-1983015268);
                    String strQ5 = gl1.y.Q(o0Var6, R.string.lbl_hide);
                    String strP = gl1.y.P(R.string.lbl_button_desc, new Object[]{strQ5}, o0Var6);
                    h4.r rVarC5 = u2Var2.c(aVar5, h4.d.a.f81535m);
                    Object obj7 = obj;
                    boolean zR2 = o0Var6.r(c0Var) | o0Var6.r(obj7) | o0Var6.r(this);
                    Object objQ8 = o0Var6.q();
                    if (zR2 || objQ8 == obj6) {
                        u2Var = u2Var2;
                        Object dVar = new ok0.d(c0Var, obj7, this, p1Var, 21);
                        o0Var6.K(dVar);
                        objQ8 = dVar;
                    } else {
                        u2Var = u2Var2;
                    }
                    u2 u2Var3 = u2Var;
                    h4.r rVarD = u1.w.d(rVarC5, false, null, null, (e23.a) objQ8, 15);
                    boolean zB = o0Var6.B(strP);
                    Object objQ9 = o0Var6.q();
                    if (zB || objQ9 == obj6) {
                        objQ9 = new r0(strP, 4);
                        o0Var6.K(objQ9);
                    }
                    h4.r rVarA = u2Var3.a(p5.v.c((e23.l) objQ9, rVarD, false), 0.3f, true);
                    fVar2.getClass();
                    s5.x0 x0VarA = s5.x0.a(j92.f.f97932i, hb.a.e(o0Var6), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    d6.h.f57752b.getClass();
                    aVar = aVar5;
                    obj3 = obj6;
                    r14 = 0;
                    mh.c(strQ5, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarA, o0Var6, 0, 0, 130044);
                    p3.o0 o0Var7 = o0Var6;
                    o0Var7.g0(false);
                    o0Var3 = o0Var7;
                } else {
                    obj3 = obj6;
                    aVar = aVar5;
                    r14 = 0;
                    o0Var6.C(-1981896664);
                    o0Var6.g0(false);
                    o0Var3 = o0Var6;
                }
                o0Var3.g0(true);
                if (i26 != 0) {
                    o0Var3.C(1386642805);
                    F = jg.b.F(o0Var3);
                    o0Var3.g0(r14);
                } else {
                    o0Var3.C(1101635328);
                    o0Var3.g0(r14);
                    F = 1.0f;
                }
                if (i26 != 0) {
                    o0Var3.C(36321050);
                    h4.r.a aVar6 = aVar;
                    a02.i.a(x2.f(aVar6, 1.0f), F, o0Var3, 6);
                    a02.i.a(x2.f(aVar6, 1.0f), F, o0Var3, 6);
                    o0Var3.w(i28);
                    p2VarI0 = o0Var3.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i29 = 0;
                    pVar = new e23.p(this) { // from class: s70.w1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ z1 f157817b;

                        {
                            this.f157817b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj8, Object obj9) {
                            int i210 = i29;
                            p3.m mVar2 = (p3.m) obj8;
                            ((Integer) obj9).getClass();
                            switch (i210) {
                                case 0:
                                    this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                case 1:
                                    this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                case 2:
                                    this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    h4.r.a aVar7 = aVar;
                    o0Var3.C(36668932);
                    o0Var3.g0(r14);
                    if (i27 != 0) {
                        o0Var3.C(36712983);
                        long jF = d92.b.a(o0Var3).c().f();
                        bVar.getClass();
                        h4.r rVarX = x2.x(x2.f(u1.n.e(aVar7, jF, k2.i.a(f15)), 1.0f), null, 3);
                        bVar.getClass();
                        h4.r rVarA2 = c2.l.A(rVarX, 0.0f, eVar.f97920e, 1);
                        bVar.getClass();
                        h4.r rVarA3 = c2.l.A(rVarA2, eVar.f97922g, 0.0f, 2);
                        final c.q qVar3 = qVar2;
                        boolean zR3 = o0Var3.r(qVar3) | o0Var3.r(this) | o0Var3.r(context3);
                        Object objQ10 = o0Var3.q();
                        if (zR3 || objQ10 == obj3) {
                            objQ10 = new e23.a() { // from class: s70.x1
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (r14) {
                                        case 0:
                                            qVar3.a(this.f157847b.p(context3), null);
                                            break;
                                        default:
                                            qVar3.a(this.f157847b.p(context3), null);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var3.K(objQ10);
                        }
                        yz1.h.a(r14, r14, (e23.a) objQ10, rVarA3, o0Var3);
                        o0Var3.w(i28);
                        p2VarI0 = o0Var3.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        final int i30 = 1;
                        pVar = new e23.p(this) { // from class: s70.w1

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ z1 f157817b;

                            {
                                this.f157817b = this;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj8, Object obj9) {
                                int i210 = i30;
                                p3.m mVar2 = (p3.m) obj8;
                                ((Integer) obj9).getClass();
                                switch (i210) {
                                    case 0:
                                        this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    case 1:
                                        this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    case 2:
                                        this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    default:
                                        this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        z1Var = this;
                        final c.q qVar4 = qVar2;
                        Object obj8 = obj3;
                        o0Var3.C(37309764);
                        o0Var3.g0(r14);
                        if (list.isEmpty()) {
                            o0Var3.C(37765867);
                            h4.r rVarX2 = x2.x(x2.f(aVar7, 1.0f), null, 3);
                            o4.d0 d0VarA = o4.d0.a(d92.b.a(o0Var3).f().b());
                            String strQ6 = gl1.y.Q(o0Var3, R.string.lbl_lets_start_training);
                            List listC = p13.w.c(gl1.y.Q(o0Var3, R.string.msg_choose_training_plan));
                            String strQ7 = gl1.y.Q(o0Var3, R.string.itp_find_a_plan);
                            boolean zR4 = o0Var3.r(qVar4) | o0Var3.r(z1Var) | o0Var3.r(context3);
                            Object objQ11 = o0Var3.q();
                            if (zR4 || objQ11 == obj8) {
                                final int i34 = 1;
                                objQ11 = new e23.a() { // from class: s70.x1
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i34) {
                                            case 0:
                                                qVar4.a(z1Var.f157847b.p(context3), null);
                                                break;
                                            default:
                                                qVar4.a(z1Var.f157847b.p(context3), null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                o0Var3.K(objQ11);
                            }
                            yz1.g.a(rVarX2, R.drawable.stopwatch_outline, d0VarA, strQ6, listC, strQ7, (e23.a) objQ11, null, null, o0Var3, 6, 384);
                            o0Var3.g0(r14);
                        } else {
                            o0Var3.C(37364417);
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                r70.r rVarA4 = m70.f.a((r70.s) it.next());
                                if (rVarA4 == null) {
                                    o0Var3.C(-4955215);
                                    o0Var3.g0(r14);
                                } else {
                                    o0Var3.C(1800955472);
                                    rVarA4.a(x2.f(h4.r.S, 1.0f), qVar, o0Var3, (i17 & 112) | 6);
                                    o0Var3.g0(r14);
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                            o0Var3.g0(r14);
                        }
                        o0Var3.g0(r14);
                        o0Var3.g0(true);
                        p3.x1 x1Var2 = p3.n.f135158a;
                        o0Var = o0Var3;
                    }
                }
            }
            p2VarI0.f135219d = pVar;
        }
        z1Var = this;
        o0VarQ.e();
        o0Var = o0VarQ;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i35 = 2;
            final z1 z1Var2 = z1Var;
            pVar = new e23.p(z1Var2) { // from class: s70.w1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ z1 f157817b;

                {
                    this.f157817b = z1Var2;
                }

                @Override // e23.p
                public final Object invoke(Object obj9, Object obj10) {
                    int i210 = i35;
                    p3.m mVar2 = (p3.m) obj9;
                    ((Integer) obj10).getClass();
                    switch (i210) {
                        case 0:
                            this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        case 1:
                            this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        case 2:
                            this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157817b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
