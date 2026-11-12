package wt0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import h4.k;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.c1;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
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
import p5.v;
import r1.q2;
import r70.q;
import r70.r;
import s5.x0;
import w51.j0;
import wn1.d0;
import yz1.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f²\u0006\u000e\u0010\n\u001a\u00020\t8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000b\u001a\u00020\t8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lwt0/h;", "Lr70/r;", "Lxt0/a;", "stateHolder", "Lkt0/a;", "challengesDelegate", "<init>", "(Lxt0/a;Lkt0/a;)V", "a", "", "hideSectionError", "showCreateChallengeNotSupported", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f187018c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xt0.a f187019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kt0.a f187020b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.presentation.dashboard.component.ChallengesSectionComposable$DashboardItem$3$1$4$1$1", f = "ChallengesSectionComposable.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f187021a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return h.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f187021a;
            if (i14 == 0) {
                o13.r.b(obj);
                kt0.a aVar2 = h.this.f187020b;
                this.f187021a = 1;
                if (aVar2.r(this) == aVar) {
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

    static {
        new a(null);
    }

    public h(xt0.a aVar, kt0.a aVar2) {
        aVar.getClass();
        aVar2.getClass();
        this.f187019a = aVar;
        this.f187020b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0384  */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r7v10 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(ReferencePipeline.java:306)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1701)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.accept(ReferencePipeline.java:291)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1701)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r10v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r1v1, types: [wt0.h] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [int] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r75v0, types: [java.lang.Object, wt0.h] */
    /* JADX WARN: Type inference failed for: r7v21 */
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
    public final void a(final h4.r rVar, final q qVar, m mVar, final int i14) {
        ?? r14;
        ?? r15;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar;
        int i15;
        Context context;
        b0 b0Var;
        int i16;
        String str;
        int i17;
        o0 o0Var;
        ?? r16;
        Context context2;
        m.a.C2565a c2565a;
        h4.r.a aVar;
        ?? r17;
        float F;
        p1 p1Var;
        p1 p1Var2;
        m.a.C2565a c2565a2;
        String str2;
        boolean zB;
        Object objQ;
        o0 o0VarQ = u0.q(rVar, qVar, mVar, -276380853);
        p3.c<?> cVar = o0VarQ.f135177b;
        int iA = o0VarQ.a();
        int i18 = (i14 & 6) == 0 ? (o0VarQ.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 384) == 0) {
            i18 |= o0VarQ.r(this) ? 256 : 128;
        }
        if (o0VarQ.n(i18 & 1, (i18 & 131) != 130)) {
            x1 x1Var = n.f135158a;
            Context context3 = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ2 = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a3 = m.a.f135155b;
            if (objQ2 == c2565a3) {
                objQ2 = l0.j(t13.h.f161748a, o0VarQ);
                o0VarQ.K(objQ2);
            }
            b0 b0Var2 = (b0) objQ2;
            String strQ = y.Q(o0VarQ, R.string.see_all_camel_case);
            String strP = y.P(R.string.lbl_button_desc, new Object[]{strQ}, o0VarQ);
            g.h hVar = new g.h();
            boolean zR = o0VarQ.r(this);
            Object objQ3 = o0VarQ.q();
            if (zR || objQ3 == c2565a3) {
                objQ3 = new vu1.b((Object) this, 21);
                o0VarQ.K(objQ3);
            }
            c.q qVarC = w.c(hVar, (l) objQ3, o0VarQ, 0);
            Object objQ4 = o0VarQ.q();
            if (objQ4 == c2565a3) {
                objQ4 = p0.n(Boolean.FALSE);
                o0VarQ.K(objQ4);
            }
            p1 p1Var3 = (p1) objQ4;
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                o0VarQ.C(-209048766);
                c1 c1Var = c1.f110940a;
                String strQ2 = y.Q(o0VarQ, R.string.lbl_one_section_required);
                String strQ3 = y.Q(o0VarQ, R.string.msg_one_section_required);
                String strQ4 = y.Q(o0VarQ, R.string.lbl_ok);
                Object objQ5 = o0VarQ.q();
                if (objQ5 == c2565a3) {
                    objQ5 = new j0(p1Var3, 14);
                    o0VarQ.K(objQ5);
                }
                e23.a<Unit> aVar2 = (e23.a) objQ5;
                Object objQ6 = o0VarQ.q();
                if (objQ6 == c2565a3) {
                    objQ6 = new d0(4);
                    o0VarQ.K(objQ6);
                }
                e23.a<Unit> aVar3 = (e23.a) objQ6;
                b0Var = b0Var2;
                context = context3;
                i15 = iA;
                str = strP;
                i16 = 0;
                i17 = 1;
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar2, null, aVar3, o0VarQ, 100663302, 6, 728);
                o0 o0Var2 = o0VarQ;
                o0Var2.g0(false);
                o0Var = o0Var2;
            } else {
                i15 = iA;
                context = context3;
                b0Var = b0Var2;
                i16 = 0;
                str = strP;
                i17 = 1;
                o0VarQ.C(-208598057);
                o0VarQ.g0(false);
                o0Var = o0VarQ;
            }
            Object objQ7 = o0Var.q();
            if (objQ7 == c2565a3) {
                objQ7 = this.f187019a.f192158a.invoke();
                o0Var.K(objQ7);
            }
            tt0.d dVar = (tt0.d) s9.c.b((r53.i) objQ7, null, o0Var, 48).getF182175a();
            if (dVar == null) {
                p2VarI0 = o0Var.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i19 = 0;
                pVar = new p(this) { // from class: wt0.g

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ h f187014b;

                    {
                        this.f187014b = this;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        int i24 = i19;
                        int i25 = i14;
                        q qVar2 = qVar;
                        h4.r rVar2 = rVar;
                        h hVar2 = this.f187014b;
                        m mVar2 = (m) obj;
                        ((Integer) obj2).getClass();
                        int i26 = h.f187018c;
                        switch (i24) {
                            case 0:
                                hVar2.a(rVar2, qVar2, mVar2, p0.t(i25 | 1));
                                break;
                            case 1:
                                hVar2.a(rVar2, qVar2, mVar2, p0.t(i25 | 1));
                                break;
                            case 2:
                                hVar2.a(rVar2, qVar2, mVar2, p0.t(i25 | 1));
                                break;
                            default:
                                hVar2.a(rVar2, qVar2, mVar2, p0.t(i25 | 1));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                i53.c<tt0.b> cVar2 = dVar.f166370c;
                u uVar = dVar.f166369b.f200298a;
                int i24 = uVar == u.LOADING ? i17 : i16;
                int i25 = uVar == u.ERROR ? i17 : i16;
                Object objQ8 = o0Var.q();
                if (objQ8 == c2565a3) {
                    objQ8 = p0.n(Boolean.FALSE);
                    o0Var.K(objQ8);
                }
                p1 p1Var4 = (p1) objQ8;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                float f15 = eVar.f97918c;
                bVar.getClass();
                int i26 = i16;
                float f16 = eVar.f97921f;
                bVar.getClass();
                h4.r rVarC = c2.l.C(rVar, f14, f16, eVar.f97920e, 0.0f, 8);
                c2.j.i iVarG = q2.g(bVar, c2.j.f22691a, f15);
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(iVarG, h4.d.a.f81536n, o0Var, i26);
                int iHashCode = Long.hashCode(o0Var.U);
                i2 i2VarA0 = o0Var.a0();
                h4.r rVarC2 = k.c(rVarC, o0Var);
                h5.g.V.getClass();
                e0.a aVar4 = h5.g.a.f81805b;
                if (cVar == 0) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar4);
                } else {
                    o0Var.c();
                }
                h5.g.a.e eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA, o0Var);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0Var);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0Var);
                c2.b0 b0Var3 = c2.b0.f22601a;
                o0Var.C(46477915);
                h4.r.a aVar5 = h4.r.S;
                h4.r rVarF = x2.f(aVar5, 1.0f);
                bVar.getClass();
                h4.r rVarC3 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar.f97918c, 7);
                s2 s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81533k, o0Var, 6);
                int iHashCode2 = Long.hashCode(o0Var.U);
                i2 i2VarA1 = o0Var.a0();
                h4.r rVarC4 = k.c(rVarC3, o0Var);
                if (cVar == null) {
                    p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar4);
                } else {
                    o0Var.c();
                }
                b4.c(eVar2, s2VarA, o0Var);
                b4.c(c1623g, i2VarA1, o0Var);
                if (o0Var.T || !s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC4, o0Var);
                u2 u2Var = u2.f22900a;
                Object objQ9 = o0Var.q();
                if (objQ9 == c2565a3) {
                    objQ9 = new wp.b(15);
                    o0Var.K(objQ9);
                }
                h4.r rVarC5 = v.c((l) objQ9, aVar5, false);
                String strQ5 = y.Q(o0Var, R.string.lbl_feature_tour_challenges);
                j92.f fVar2 = d92.b.f58624b;
                fVar2.getClass();
                o0 o0Var3 = o0Var;
                mh.c(strQ5, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var), o0Var3, 0, 0, 131068);
                o0 o0Var4 = o0Var3;
                if (cVar2.isEmpty()) {
                    r16 = 0;
                    if (i25 == 0) {
                        o0Var4.C(-140919080);
                        String strQ6 = y.Q(o0Var4, R.string.lbl_hide);
                        String strP2 = y.P(R.string.lbl_button_desc, new Object[]{strQ6}, o0Var4);
                        h4.r rVarC6 = u2Var.c(aVar5, h4.d.a.f81535m);
                        b0 b0Var4 = b0Var;
                        boolean zR2 = o0Var4.r(dVar) | o0Var4.r(b0Var4) | o0Var4.r(this);
                        Object objQ10 = o0Var4.q();
                        if (zR2 || objQ10 == c2565a3) {
                            ug2.k kVar = new ug2.k(dVar, b0Var4, this, p1Var3, 14);
                            o0Var4.K(kVar);
                            objQ10 = kVar;
                        }
                        r16 = 0;
                        h4.r rVarD = u1.w.d(rVarC6, false, null, null, (e23.a) objQ10, 15);
                        boolean zB2 = o0Var4.B(strP2);
                        Object objQ11 = o0Var4.q();
                        if (zB2 || objQ11 == c2565a3) {
                            objQ11 = new u91.c(strP2, 20);
                            o0Var4.K(objQ11);
                        }
                        h4.r rVarC7 = v.c((l) objQ11, rVarD, false);
                        fVar2.getClass();
                        context2 = context;
                        c2565a = c2565a3;
                        aVar = aVar5;
                        mh.c(strQ6, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, hb.a.e(o0Var4), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var4, 0, 0, 131068);
                        o0 o0Var5 = o0Var4;
                        o0Var5.g0(false);
                        r17 = o0Var5;
                    } else {
                        context2 = context;
                        c2565a = c2565a3;
                        aVar = aVar5;
                        o0Var4.C(-139910991);
                        o0Var4.g0(false);
                        r17 = o0Var4;
                    }
                } else {
                    o0Var4.C(-141512017);
                    h4.r rVarC8 = u2Var.c(aVar5, h4.d.a.f81535m);
                    Context context4 = context;
                    boolean zR3 = o0Var4.r(context4);
                    Object objQ12 = o0Var4.q();
                    if (zR3) {
                        c2565a2 = c2565a3;
                    } else {
                        c2565a2 = c2565a3;
                        if (objQ12 == c2565a2) {
                        }
                        h4.r rVarD2 = u1.w.d(rVarC8, false, null, null, (e23.a) objQ12, 15);
                        str2 = str;
                        zB = o0Var4.B(str2);
                        objQ = o0Var4.q();
                        if (zB || objQ == c2565a2) {
                            objQ = new u91.c(str2, 19);
                            o0Var4.K(objQ);
                        }
                        h4.r rVarC9 = v.c((l) objQ, rVarD2, false);
                        fVar2.getClass();
                        r16 = 0;
                        mh.c(strQ, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, hb.a.e(o0Var4), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var4, 0, 0, 131068);
                        o0 o0Var6 = o0Var4;
                        o0Var6.g0(false);
                        context2 = context4;
                        c2565a = c2565a2;
                        aVar = aVar5;
                        r17 = o0Var6;
                    }
                    objQ12 = new tz1.h(context4, 17);
                    o0Var4.K(objQ12);
                    h4.r rVarD3 = u1.w.d(rVarC8, false, null, null, (e23.a) objQ12, 15);
                    str2 = str;
                    zB = o0Var4.B(str2);
                    objQ = o0Var4.q();
                    if (zB) {
                        objQ = new u91.c(str2, 19);
                        o0Var4.K(objQ);
                    } else {
                        objQ = new u91.c(str2, 19);
                        o0Var4.K(objQ);
                    }
                    h4.r rVarC10 = v.c((l) objQ, rVarD3, false);
                    fVar2.getClass();
                    r16 = 0;
                    mh.c(strQ, rVarC10, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97932i, hb.a.e(o0Var4), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var4, 0, 0, 131068);
                    o0 o0Var7 = o0Var4;
                    o0Var7.g0(false);
                    context2 = context4;
                    c2565a = c2565a2;
                    aVar = aVar5;
                    r17 = o0Var7;
                }
                r17.g0(true);
                if (i24 != 0) {
                    r17.C(555756492);
                    F = jg.b.F(r17);
                    r17.g0(r16);
                } else {
                    r17.C(1113963401);
                    r17.g0(r16);
                    F = 1.0f;
                }
                if (i24 != 0) {
                    r17.C(48654331);
                    h4.r.a aVar6 = aVar;
                    f.a(x2.f(aVar6, 1.0f), F, r17, 6);
                    f.a(x2.f(aVar6, 1.0f), F, r17, 6);
                    f.a(x2.f(aVar6, 1.0f), F, r17, 6);
                    r17.w(i15);
                    p2VarI0 = r17.i0();
                    if (p2VarI0 == null) {
                        return;
                    }
                    final int i27 = 1;
                    pVar = new p(this) { // from class: wt0.g

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ h f187014b;

                        {
                            this.f187014b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            int i28 = i27;
                            int i29 = i14;
                            q qVar2 = qVar;
                            h4.r rVar2 = rVar;
                            h hVar2 = this.f187014b;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            int i210 = h.f187018c;
                            switch (i28) {
                                case 0:
                                    hVar2.a(rVar2, qVar2, mVar2, p0.t(i29 | 1));
                                    break;
                                case 1:
                                    hVar2.a(rVar2, qVar2, mVar2, p0.t(i29 | 1));
                                    break;
                                case 2:
                                    hVar2.a(rVar2, qVar2, mVar2, p0.t(i29 | 1));
                                    break;
                                default:
                                    hVar2.a(rVar2, qVar2, mVar2, p0.t(i29 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    int i28 = i15;
                    h4.r.a aVar7 = aVar;
                    r17.C(49163661);
                    r17.g0(r16);
                    if (i25 != 0) {
                        r17.C(49207681);
                        long jF = d92.b.a(r17).c().f();
                        bVar.getClass();
                        h4.r rVarX = x2.x(x2.f(u1.n.e(aVar7, jF, k2.i.a(f15)), 1.0f), null, 3);
                        bVar.getClass();
                        h4.r rVarA = c2.l.A(rVarX, 0.0f, eVar.f97920e, 1);
                        bVar.getClass();
                        h4.r rVarA2 = c2.l.A(rVarA, eVar.f97922g, 0.0f, 2);
                        Context context5 = context2;
                        boolean zR4 = r17.r(qVarC) | r17.r(context5);
                        Object objQ13 = r17.q();
                        if (zR4 || objQ13 == c2565a) {
                            objQ13 = new fv0.d(qVarC, context5, 8);
                            r17.K(objQ13);
                        }
                        yz1.h.a(r16, r16, (e23.a) objQ13, rVarA2, r17);
                        r17.w(i28);
                        p2VarI0 = r17.i0();
                        if (p2VarI0 == null) {
                            return;
                        }
                        final int i29 = 2;
                        pVar = new p(this) { // from class: wt0.g

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ h f187014b;

                            {
                                this.f187014b = this;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                int i210 = i29;
                                int i211 = i14;
                                q qVar2 = qVar;
                                h4.r rVar2 = rVar;
                                h hVar2 = this.f187014b;
                                m mVar2 = (m) obj;
                                ((Integer) obj2).getClass();
                                int i212 = h.f187018c;
                                switch (i210) {
                                    case 0:
                                        hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                                        break;
                                    case 1:
                                        hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                                        break;
                                    case 2:
                                        hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                                        break;
                                    default:
                                        hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        Context context6 = context2;
                        m.a.C2565a c2565a4 = c2565a;
                        r17.C(49803501);
                        r17.g0(r16);
                        if (cVar2.isEmpty()) {
                            r17.C(50517958);
                            h4.r rVarX2 = x2.x(x2.f(aVar7, 1.0f), null, 3);
                            o4.d0 d0VarA = o4.d0.a(d92.b.a(r17).f().b());
                            String strQ7 = y.Q(r17, R.string.lbl_ready_for_a_challenge);
                            List listC = p13.w.c(y.Q(r17, R.string.msg_join_or_create_challenge));
                            String strQ8 = y.Q(r17, R.string.lbl_find_a_challenge);
                            boolean zR5 = r17.r(qVarC) | r17.r(context6);
                            Object objQ14 = r17.q();
                            if (zR5 || objQ14 == c2565a4) {
                                objQ14 = new fv0.d(qVarC, context6, 9);
                                r17.K(objQ14);
                            }
                            e23.a aVar8 = (e23.a) objQ14;
                            String strQ9 = y.Q(r17, R.string.lbl_create_a_challenge);
                            boolean zR6 = r17.r(qVarC) | r17.r(context6);
                            Object objQ15 = r17.q();
                            if (zR6 || objQ15 == c2565a4) {
                                p1Var = p1Var4;
                                objQ15 = new c42.f(qVarC, context6, p1Var, 4);
                                r17.K(objQ15);
                            } else {
                                p1Var = p1Var4;
                            }
                            p1Var2 = p1Var;
                            yz1.g.a(rVarX2, R.drawable.challenges, d0VarA, strQ7, listC, strQ8, aVar8, strQ9, (e23.a) objQ15, r17, 6, 0);
                            r17.g0(r16);
                        } else {
                            r17.C(49884070);
                            ?? r18 = r16;
                            for (tt0.b bVar3 : cVar2) {
                                int i30 = r18 + 1;
                                if (r18 < 0) {
                                    x.q();
                                    throw null;
                                }
                                tt0.b bVar4 = bVar3;
                                if (r18 < 3) {
                                    r17.C(444369404);
                                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                                    boolean zR7 = r17.r(this) | r17.r(context6) | r17.r(bVar4) | r17.r(qVarC);
                                    Object objQ16 = r17.q();
                                    if (zR7 || objQ16 == m.a.f135155b) {
                                        objQ16 = new ug2.b0((h) this, context6, bVar4, qVarC);
                                        r17.K(objQ16);
                                    }
                                    e.a(rVarF2, bVar4, (e23.a) objQ16, r17, 6);
                                    r17.g0(r16);
                                } else {
                                    r17.C(444782634);
                                    r17.g0(r16);
                                }
                                r18 = i30;
                            }
                            r17.g0(r16);
                            p1Var2 = p1Var4;
                        }
                        r17.g0(r16);
                        r17.g0(true);
                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                            r17.C(-202511982);
                            Object objQ17 = r17.q();
                            if (objQ17 == m.a.f135155b) {
                                objQ17 = new j0(p1Var2, 13);
                                r17.K(objQ17);
                            }
                            b((e23.a) objQ17, r17, ((i18 >> 3) & 112) | 6);
                            r17.g0(r16);
                        } else {
                            r17.C(-202414921);
                            r17.g0(r16);
                        }
                        x1 x1Var2 = n.f135158a;
                        r15 = r17;
                        r14 = r7;
                    }
                }
            }
            p2VarI0.f135219d = pVar;
        }
        r14 = this;
        o0VarQ.e();
        r15 = o0VarQ;
        p2VarI0 = r15.i0();
        if (p2VarI0 != null) {
            final int i34 = 3;
            final ?? r19 = r14;
            pVar = new p(r19) { // from class: wt0.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h f187014b;

                {
                    this.f187014b = r19;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    int i210 = i34;
                    int i211 = i14;
                    q qVar2 = qVar;
                    h4.r rVar2 = rVar;
                    h hVar2 = this.f187014b;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    int i212 = h.f187018c;
                    switch (i210) {
                        case 0:
                            hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                            break;
                        case 1:
                            hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                            break;
                        case 2:
                            hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                            break;
                        default:
                            hVar2.a(rVar2, qVar2, mVar2, p0.t(i211 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    public final void b(e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-2038549472);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.lbl_feature_not_supported);
            String strQ2 = y.Q(o0VarE, R.string.msg_create_challenge_not_supported);
            String strQ3 = y.Q(o0VarE, R.string.lbl_ok);
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new w51.j(aVar, 21);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new w51.j(aVar, 21);
                    o0VarE.K(objQ);
                }
            }
            c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, (e23.a) objQ, null, null, o0VarE, 6, 0, 1752);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.a(this, aVar, i14, 11);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwt0/h$a;", "", "<init>", "()V", "", "MAX_NUM_CHALLENGES_TO_SHOW", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
