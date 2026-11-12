package fp0;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import ep0.d0;
import ep0.e0;
import ep0.t;
import et1.a2;
import fo.x;
import gl1.y;
import i3.mh;
import java.util.List;
import l72.c1;
import lc.u0;
import n70.a7;
import o53.b0;
import o53.s0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.Unit;
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
import r53.s;
import r70.q;
import r70.r;
import s5.x0;
import u1.w;
import yz1.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lfp0/h;", "Lr70/r;", "Lhp0/b;", "yesterdayStateHolder", "Lgp0/c;", "yesterdayNavigation", "<init>", "(Lhp0/b;Lgp0/c;)V", "", "hideSectionError", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hp0.b f73163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp0.c f73164b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.home.yesterday.presentation.dashboard.component.YesterdayComposable$DashboardItem$3$1$2$1$1", f = "YesterdayComposable.kt", l = {110}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f73165a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f73165a;
            if (i14 == 0) {
                o13.r.b(obj);
                a7 a7Var = h.this.f73163a.f84936c;
                o70.f fVar = o70.f.YESTERDAY;
                this.f73165a = 1;
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

    public h(hp0.b bVar, gp0.c cVar) {
        bVar.getClass();
        cVar.getClass();
        this.f73163a = bVar;
        this.f73164b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v20 */
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
    public final void a(final h4.r rVar, final q qVar, p3.m mVar, final int i14) {
        int i15;
        h hVar;
        q qVar2;
        o0 o0Var;
        p2 p2VarI0;
        p<? super p3.m, ? super Integer, Unit> pVar;
        float F;
        int i16;
        float f14;
        o0 o0Var2;
        char c14;
        Object obj;
        h4.r.a aVar;
        ?? r14;
        o0 o0Var3;
        o0 o0Var4;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -439119923);
        p3.c<?> cVar = o0VarQ.f135177b;
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
            x1 x1Var = n.f135158a;
            Object objQ = o0VarQ.q();
            p3.m.f135153a.getClass();
            Object obj2 = p3.m.a.f135155b;
            if (objQ == obj2) {
                objQ = l0.j(t13.h.f161748a, o0VarQ);
                o0VarQ.K(objQ);
            }
            Object obj3 = (b0) objQ;
            boolean zK = o0VarQ.k(LocalDate.now().getDayOfYear());
            Object objQ2 = o0VarQ.q();
            hp0.b bVar = this.f73163a;
            if (zK || objQ2 == obj2) {
                n70.m mVar2 = bVar.f84935b;
                LocalDate localDateMinusDays = LocalDate.now().minusDays(1);
                localDateMinusDays.getClass();
                objQ2 = s.A(new n70.n(mVar2.f124400a, mVar2, localDateMinusDays), s0.f129406a);
                o0VarQ.K(objQ2);
            }
            n70.a aVar2 = (n70.a) s9.c.b((r53.i) objQ2, null, o0VarQ, 48).getF182175a();
            if (aVar2 == null) {
                p2VarI0 = o0VarQ.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i17 = 0;
                pVar = new p(this) { // from class: fp0.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f73159b;

                    {
                        this.f73159b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        int i18 = i17;
                        p3.m mVar3 = (p3.m) obj4;
                        ((Integer) obj5).getClass();
                        switch (i18) {
                            case 0:
                                this.f73159b.a(rVar, qVar, mVar3, p0.t(i14 | 1));
                                break;
                            case 1:
                                this.f73159b.a(rVar, qVar, mVar3, p0.t(i14 | 1));
                                break;
                            default:
                                this.f73159b.a(rVar, qVar, mVar3, p0.t(i14 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                i53.c<r70.a> cVar2 = aVar2.f123996a;
                Object objQ3 = o0VarQ.q();
                if (objQ3 == obj2) {
                    ep0.s sVar = bVar.f84934a;
                    objQ3 = s.A(new t(sVar.f64892b, sVar), s0.f129406a);
                    o0VarQ.K(objQ3);
                }
                e0 e0Var = (e0) s9.c.b((r53.i) objQ3, null, o0VarQ, 48).getF182175a();
                if (e0Var == null) {
                    p2VarI0 = o0VarQ.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i18 = 1;
                    pVar = new p(this) { // from class: fp0.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ h f73159b;

                        {
                            this.f73159b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj4, Object obj5) {
                            int i19 = i18;
                            p3.m mVar3 = (p3.m) obj4;
                            ((Integer) obj5).getClass();
                            switch (i19) {
                                case 0:
                                    this.f73159b.a(rVar, qVar, mVar3, p0.t(i14 | 1));
                                    break;
                                case 1:
                                    this.f73159b.a(rVar, qVar, mVar3, p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f73159b.a(rVar, qVar, mVar3, p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    i53.c<d0> cVar3 = e0Var.f64879c;
                    u uVar = e0Var.f64880d.f200298a;
                    boolean z14 = uVar == u.LOADING;
                    if (z14) {
                        o0VarQ.C(-1087430812);
                        F = jg.b.F(o0VarQ);
                        o0VarQ.g0(false);
                    } else {
                        o0VarQ.C(1714764529);
                        o0VarQ.g0(false);
                        F = 1.0f;
                    }
                    boolean z15 = e0Var.f64877a && cVar2.isEmpty();
                    boolean z16 = cVar2.isEmpty() && cVar3.isEmpty();
                    boolean z17 = uVar == u.ERROR;
                    Object objQ4 = o0VarQ.q();
                    if (objQ4 == obj2) {
                        objQ4 = p0.n(Boolean.FALSE);
                        o0VarQ.K(objQ4);
                    }
                    p1 p1Var = (p1) objQ4;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0VarQ.C(649786880);
                        c1 c1Var = c1.f110940a;
                        String strQ = y.Q(o0VarQ, R.string.lbl_one_section_required);
                        String strQ2 = y.Q(o0VarQ, R.string.msg_one_section_required);
                        String strQ3 = y.Q(o0VarQ, R.string.lbl_ok);
                        Object objQ5 = o0VarQ.q();
                        if (objQ5 == obj2) {
                            objQ5 = new a2(p1Var, 21);
                            o0VarQ.K(objQ5);
                        }
                        e23.a<Unit> aVar3 = (e23.a) objQ5;
                        Object objQ6 = o0VarQ.q();
                        if (objQ6 == obj2) {
                            objQ6 = new fb1.d0(19);
                            o0VarQ.K(objQ6);
                        }
                        o0 o0Var5 = o0VarQ;
                        f14 = F;
                        i16 = 0;
                        c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ6, o0Var5, 100663302, 6, 728);
                        o0Var5.g0(false);
                        o0Var2 = o0Var5;
                    } else {
                        cVar = cVar;
                        i16 = 0;
                        f14 = F;
                        o0 o0Var6 = o0VarQ;
                        o0Var6.C(650237589);
                        o0Var6.g0(false);
                        o0Var2 = o0Var6;
                    }
                    d92.b.f58623a.getClass();
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97920e;
                    bVar2.getClass();
                    float f16 = eVar.f97920e;
                    bVar2.getClass();
                    float f17 = f14;
                    int i19 = i16;
                    h4.r rVarC = c2.l.C(rVar, f15, f16, eVar.f97920e, 0.0f, 8);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var2, i19);
                    int iHashCode = Long.hashCode(o0Var2.U);
                    i2 i2VarA0 = o0Var2.a0();
                    h4.r rVarC2 = h4.k.c(rVarC, o0Var2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
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
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0Var2, iHashCode, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, o0Var2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF = x2.f(aVar5, 1.0f);
                    bVar2.getClass();
                    h4.r rVarC3 = c2.l.C(rVarF, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                    s2 s2VarA = q2.a(c2.j.f22698h, h4.d.a.f81533k, o0Var2, 6);
                    int iHashCode2 = Long.hashCode(o0Var2.U);
                    i2 i2VarA1 = o0Var2.a0();
                    h4.r rVarC4 = h4.k.c(rVarC3, o0Var2);
                    if (cVar == null) {
                        p0.l();
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
                        v.h.A(iHashCode2, o0Var2, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC4, o0Var2);
                    u2 u2Var = u2.f22900a;
                    Object objQ7 = o0Var2.q();
                    if (objQ7 == obj2) {
                        objQ7 = new x(8);
                        o0Var2.K(objQ7);
                    }
                    h4.r rVarC5 = v.c((e23.l) objQ7, aVar5, false);
                    String strQ4 = y.Q(o0Var2, R.string.social_elapsed_time_yesterday);
                    j92.f fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    o0 o0Var7 = o0Var2;
                    mh.c(strQ4, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var2), o0Var7, 0, 0, 131068);
                    o0 o0Var8 = o0Var7;
                    if ((z16 || z15) && !z17) {
                        o0Var8.C(-901484863);
                        String strQ5 = y.Q(o0Var8, R.string.lbl_hide);
                        String strP = y.P(R.string.lbl_button_desc, new Object[]{strQ5}, o0Var8);
                        h4.r rVarC6 = u2Var.c(aVar5, h4.d.a.f81535m);
                        boolean zR = o0Var8.r(e0Var) | o0Var8.r(obj3) | o0Var8.r(this);
                        Object objQ8 = o0Var8.q();
                        if (zR || objQ8 == obj2) {
                            Object eVar3 = new af0.e((Object) e0Var, obj3, (Object) this, (Object) p1Var, 24);
                            o0Var8.K(eVar3);
                            objQ8 = eVar3;
                        }
                        h4.r rVarD = w.d(rVarC6, false, null, null, (e23.a) objQ8, 15);
                        boolean zB = o0Var8.B(strP);
                        Object objQ9 = o0Var8.q();
                        if (zB || objQ9 == obj2) {
                            c14 = 2;
                            objQ9 = new c(strP, 2);
                            o0Var8.K(objQ9);
                        } else {
                            c14 = 2;
                        }
                        h4.r rVarC7 = v.c((e23.l) objQ9, rVarD, false);
                        fVar2.getClass();
                        obj = obj2;
                        aVar = aVar5;
                        r14 = 0;
                        mh.c(strQ5, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, hb.a.e(o0Var8), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var8, 0, 0, 131068);
                        o0 o0Var9 = o0Var8;
                        o0Var9.g0(false);
                        o0Var3 = o0Var9;
                    } else {
                        obj = obj2;
                        aVar = aVar5;
                        r14 = 0;
                        o0Var8.C(-900445061);
                        o0Var8.g0(false);
                        o0Var3 = o0Var8;
                    }
                    o0Var3.g0(true);
                    if (z14) {
                        o0Var3.C(1011319797);
                        bVar2.getClass();
                        a02.f.b(x2.f(c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 1.0f), f17, o0Var3, 48);
                        o0Var3.g0(r14);
                    } else {
                        if (z17) {
                            o0Var3.C(1011713280);
                            bVar2.getClass();
                            h4.r rVarC8 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                            long jF = d92.b.a(o0Var3).c().f();
                            bVar2.getClass();
                            h4.r rVarX = x2.x(x2.f(u1.n.e(rVarC8, jF, k2.i.a(eVar.f97918c)), 1.0f), null, 3);
                            bVar2.getClass();
                            h4.r rVarA = c2.l.A(rVarX, 0.0f, eVar.f97920e, 1);
                            bVar2.getClass();
                            yz1.h.a(r14, 2, null, c2.l.A(rVarA, eVar.f97922g, 0.0f, 2), o0Var3);
                            o0Var3.g0(r14);
                        } else {
                            h4.r.a aVar6 = aVar;
                            if (z15) {
                                o0Var3.C(1012366667);
                                h4.r rVarX2 = x2.x(x2.f(aVar6, 1.0f), null, 3);
                                bVar2.getClass();
                                h4.r rVarC9 = c2.l.C(rVarX2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                                o4.d0 d0VarA = o4.d0.a(d92.b.a(o0Var3).f().b());
                                String strQ6 = y.Q(o0Var3, R.string.msg_no_data_available);
                                List listC = p13.w.c(y.Q(o0Var3, R.string.msg_turn_on_in_focus_or_at_a_glance));
                                String strQ7 = y.Q(o0Var3, R.string.lbl_home_settings);
                                boolean zR2 = o0Var3.r(qVar);
                                Object objQ10 = o0Var3.q();
                                if (zR2 || objQ10 == obj) {
                                    objQ10 = new d(qVar, 1);
                                    o0Var3.K(objQ10);
                                }
                                o0 o0Var10 = o0Var3;
                                yz1.g.a(rVarC9, R.drawable.other_activity, d0VarA, strQ6, listC, strQ7, (e23.a) objQ10, null, null, o0Var10, 0, 384);
                                o0Var3.g0(r14);
                                hVar = this;
                                qVar2 = qVar;
                                o0Var4 = o0Var10;
                            } else if (z16) {
                                o0Var3.C(1013262288);
                                h4.r rVarX3 = x2.x(x2.f(aVar6, 1.0f), null, 3);
                                bVar2.getClass();
                                h4.r rVarC10 = c2.l.C(rVarX3, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                                o4.d0 d0VarA2 = o4.d0.a(d92.b.a(o0Var3).f().b());
                                String strQ8 = y.Q(o0Var3, R.string.no_data_yesterday);
                                List listC2 = p13.w.c(y.Q(o0Var3, R.string.use_device_yesterday));
                                o0 o0Var11 = o0Var3;
                                qVar2 = qVar;
                                yz1.g.a(rVarC10, R.drawable.other_activity, d0VarA2, strQ8, listC2, null, null, null, null, o0Var11, 0, 480);
                                o0Var11.g0(r14);
                                hVar = this;
                                o0Var4 = o0Var11;
                            } else {
                                o0 o0Var12 = o0Var3;
                                qVar2 = qVar;
                                o0Var12.C(1013894285);
                                f.a(x2.d(aVar6, 1.0f), aVar2, qVar2, o0Var12, ((i15 << 3) & 896) | 70);
                                hVar = this;
                                m.a(x2.d(aVar6, 1.0f), cVar3, hVar.f73164b, o0Var12, 6);
                                o0Var12.g0(r14);
                                o0Var4 = o0Var12;
                            }
                        }
                        o0Var4.g0(true);
                        o0Var = o0Var4;
                    }
                    hVar = this;
                    o0Var4 = o0Var3;
                    qVar2 = qVar;
                    o0Var4.g0(true);
                    o0Var = o0Var4;
                }
            }
            p2VarI0.f135219d = pVar;
        }
        hVar = this;
        qVar2 = qVar;
        o0VarQ.e();
        o0Var = o0VarQ;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i24 = 2;
            final h hVar2 = hVar;
            final q qVar3 = qVar2;
            pVar = new p(hVar2) { // from class: fp0.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f73159b;

                {
                    this.f73159b = hVar2;
                }

                @Override // e23.p
                public final Object invoke(Object obj4, Object obj5) {
                    int i110 = i24;
                    p3.m mVar3 = (p3.m) obj4;
                    ((Integer) obj5).getClass();
                    switch (i110) {
                        case 0:
                            this.f73159b.a(rVar, qVar3, mVar3, p0.t(i14 | 1));
                            break;
                        case 1:
                            this.f73159b.a(rVar, qVar3, mVar3, p0.t(i14 | 1));
                            break;
                        default:
                            this.f73159b.a(rVar, qVar3, mVar3, p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
