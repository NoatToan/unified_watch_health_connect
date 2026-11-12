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
import n70.k2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Ls70/u0;", "Lr70/r;", "Ly70/k;", "stateHolder", "Ln70/g;", "dashboardDelegate", "<init>", "(Ly70/k;Ln70/g;)V", "", "hideSectionError", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 implements r70.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y70.k f157806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n70.g f157807b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.EventsSectionComposable$DashboardItem$3$1$1$2$1$1", f = "EventsSectionComposable.kt", l = {114}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f157808a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return u0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f157808a;
            if (i14 == 0) {
                o13.r.b(obj);
                a7 a7Var = u0.this.f157806a.f194667c;
                o70.f fVar = o70.f.EVENTS;
                this.f157808a = 1;
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

    public u0(y70.k kVar, n70.g gVar) {
        kVar.getClass();
        gVar.getClass();
        this.f157806a = kVar;
        this.f157807b = gVar;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0433  */
    /* JADX WARN: Code duplicated, block: B:110:0x043c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x0456  */
    /* JADX WARN: Code duplicated, block: B:116:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0479  */
    /* JADX WARN: Code duplicated, block: B:119:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:122:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:123:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:125:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:127:0x0518  */
    /* JADX WARN: Code duplicated, block: B:130:0x0529  */
    /* JADX WARN: Code duplicated, block: B:132:0x0538  */
    /* JADX WARN: Code duplicated, block: B:135:0x057d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0595  */
    /* JADX WARN: Code duplicated, block: B:139:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:142:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:145:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:150:0x0609  */
    /* JADX WARN: Code duplicated, block: B:155:0x0664  */
    /* JADX WARN: Code duplicated, block: B:159:0x068e  */
    /* JADX WARN: Code duplicated, block: B:163:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:171:0x06dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x05d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0298  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ce  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r10v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v7, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r4v26, types: [r70.r] */
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
        final u0 u0Var;
        r70.q qVar2;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        ?? r14;
        Object obj;
        o53.b0 b0Var;
        boolean z14;
        p3.m.a.C2565a c2565a;
        String str;
        p3.o0 o0Var;
        j70.q qVar3;
        h5.g.a.f fVar;
        h4.r.a aVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        u2 u2Var;
        Object objQ;
        Object obj2;
        j92.f fVar2;
        j70.q qVar4;
        j92.e eVar;
        h4.d.c cVar;
        p3.o0 o0Var2;
        int i16;
        float f14;
        final ?? r15;
        final Context context;
        boolean z15;
        boolean zR;
        Object objQ2;
        Object obj3;
        String str2;
        boolean zB;
        Object obj4;
        ?? r16;
        float F;
        boolean zR2;
        Object obj5;
        boolean zR3;
        Object obj6;
        ?? r17;
        boolean z16;
        Iterator<r70.s> it;
        ?? A;
        boolean zR4;
        Object objQ3;
        Object obj7;
        Object dVar;
        h4.d.c cVar2;
        boolean z17;
        float f15;
        boolean z18;
        Object obj8;
        ?? r18;
        Object obj9;
        Object obj10;
        p3.o0 o0VarQ = lc.u0.q(rVar, qVar, mVar, -1631347520);
        p3.c<?> cVar3 = o0VarQ.f135177b;
        int iA = o0VarQ.a();
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
            Object objQ4 = o0VarQ.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ4 == c2565a2) {
                obj = objQ4;
                o53.b0 b0VarJ = p3.l0.j(t13.h.f161748a, o0VarQ);
                o0VarQ.K(b0VarJ);
                obj = b0VarJ;
            }
            obj = objQ4;
            o53.b0 b0Var2 = (o53.b0) obj;
            String strQ = gl1.y.Q(o0VarQ, R.string.see_all_camel_case);
            String strP = gl1.y.P(R.string.lbl_button_desc, new Object[]{strQ}, o0VarQ);
            g.h hVar = new g.h();
            boolean zR5 = o0VarQ.r(this);
            Object objQ5 = o0VarQ.q();
            Object obj11 = objQ5;
            if (zR5 || objQ5 == c2565a2) {
                b0 b0Var3 = new b0(this, 1);
                o0VarQ.K(b0Var3);
                obj11 = b0Var3;
            }
            final c.q qVarC = c.w.c(hVar, (e23.l) obj11, o0VarQ, 0);
            Object objQ6 = o0VarQ.q();
            Object obj12 = objQ6;
            if (objQ6 == c2565a2) {
                p3.c2 c2VarN = p3.p0.n(Boolean.FALSE);
                o0VarQ.K(c2VarN);
                obj12 = c2VarN;
            }
            p3.p1 p1Var = (p3.p1) obj12;
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarQ.C(-1918377555);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ2 = gl1.y.Q(o0VarQ, R.string.lbl_one_section_required);
                String strQ3 = gl1.y.Q(o0VarQ, R.string.msg_one_section_required);
                String strQ4 = gl1.y.Q(o0VarQ, R.string.lbl_ok);
                Object objQ7 = o0VarQ.q();
                if (objQ7 == c2565a2) {
                    obj9 = objQ7;
                    rk0.w wVar = new rk0.w(p1Var, 18);
                    o0VarQ.K(wVar);
                    obj9 = wVar;
                }
                obj9 = objQ7;
                e23.a<Unit> aVar2 = (e23.a) obj9;
                Object objQ8 = o0VarQ.q();
                if (objQ8 == c2565a2) {
                    ro0.h hVar2 = new ro0.h(20);
                    o0VarQ.K(hVar2);
                    obj10 = hVar2;
                } else {
                    obj10 = objQ8;
                }
                e23.a<Unit> aVar3 = (e23.a) obj10;
                c2565a = c2565a2;
                b0Var = b0Var2;
                str = strP;
                z14 = false;
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar2, null, aVar3, o0VarQ, 100663302, 6, 728);
                p3.o0 o0Var3 = o0VarQ;
                o0Var3.g0(false);
                o0Var = o0Var3;
            } else {
                b0Var = b0Var2;
                z14 = false;
                c2565a = c2565a2;
                str = strP;
                o0VarQ.C(-1917926846);
                o0VarQ.g0(false);
                o0Var = o0VarQ;
            }
            Object objQ9 = o0Var.q();
            Object obj13 = objQ9;
            if (objQ9 == c2565a) {
                k2 k2Var = this.f157806a.f194665a;
                r53.i iVarA = r53.s.A(new n70.g2(k2Var.f124358a, k2Var), o53.s0.f129406a);
                o0Var.K(iVarA);
                obj13 = iVarA;
            }
            j70.q qVar5 = (j70.q) s9.c.b((r53.i) obj13, null, o0Var, 48).getF182175a();
            if (qVar5 != null) {
                i53.c<r70.s> cVar4 = qVar5.f97621c;
                o0Var.C(-1917612723);
                yz1.u uVar = qVar5.f97619a.f200298a;
                boolean z19 = uVar == yz1.u.LOADING ? true : z14;
                boolean z24 = uVar == yz1.u.ERROR ? true : z14;
                d92.b.f58623a.getClass();
                j92.b bVar = d92.b.f58625c;
                bVar.getClass();
                j92.e eVar2 = j92.b.f97899b;
                float f16 = eVar2.f97920e;
                float f17 = eVar2.f97918c;
                bVar.getClass();
                int i17 = i15;
                float f18 = eVar2.f97921f;
                bVar.getClass();
                p3.m.a.C2565a c2565a3 = c2565a;
                h4.r rVarC2 = c2.l.C(rVar, f16, f18, eVar2.f97920e, 0.0f, 8);
                c2.j.i iVarG = q2.g(bVar, c2.j.f22691a, f17);
                h4.d.f81522a.getClass();
                c2.z zVarA = c2.y.a(iVarG, h4.d.a.f81536n, o0Var, z14 ? 1 : 0);
                int iHashCode2 = Long.hashCode(o0Var.U);
                i2 i2VarA1 = o0Var.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0Var);
                h5.g.V.getClass();
                h5.e0.a aVar4 = h5.g.a.f81805b;
                if (cVar3 == 0) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar4);
                } else {
                    o0Var.c();
                }
                h5.g.a.e eVar3 = h5.g.a.f81810g;
                b4.c(eVar3, zVarA, o0Var);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA1, o0Var);
                h5.g.a.b bVar2 = h5.g.a.f81813j;
                if (!o0Var.T) {
                    qVar3 = qVar5;
                    if (!p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode2))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, o0Var);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    o0Var.C(-1889250136);
                    aVar = h4.r.S;
                    h4.r rVarF = x2.f(aVar, 1.0f);
                    bVar.getClass();
                    h4.r rVarC4 = c2.l.C(rVarF, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7);
                    s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81533k, o0Var, 6);
                    iHashCode = Long.hashCode(o0Var.U);
                    i2VarA0 = o0Var.a0();
                    rVarC = h4.k.c(rVarC4, o0Var);
                    if (cVar3 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var.z();
                    if (o0Var.T) {
                        o0Var.M(aVar4);
                    } else {
                        o0Var.c();
                    }
                    b4.c(eVar3, s2VarA, o0Var);
                    b4.c(c1623g, i2VarA0, o0Var);
                    if (o0Var.T || !p005kotlin.jvm.internal.s.g(o0Var.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, o0Var);
                    u2Var = u2.f22900a;
                    objQ = o0Var.q();
                    obj2 = objQ;
                    if (objQ == c2565a3) {
                        s5.e0 e0Var = new s5.e0(17);
                        o0Var.K(e0Var);
                        obj2 = e0Var;
                    }
                    h4.r rVarC5 = p5.v.c((e23.l) obj2, aVar, false);
                    String strQ5 = gl1.y.Q(o0Var, R.string.lbl_events);
                    fVar2 = d92.b.f58624b;
                    fVar2.getClass();
                    qVar4 = qVar3;
                    p3.o0 o0Var4 = o0Var;
                    eVar = eVar2;
                    cVar = null;
                    mh.c(strQ5, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var), o0Var4, 0, 0, 131068);
                    o0Var2 = o0Var4;
                    if (cVar4.isEmpty() || z24) {
                        i16 = 3;
                        f14 = 1.0f;
                        r15 = 1;
                        r15 = 1;
                        if (qVar4.f97620b) {
                            o0Var2.C(790970105);
                            h4.r rVarC6 = u2Var.c(aVar, h4.d.a.f81535m);
                            context = context2;
                            zR = o0Var2.r(context);
                            objQ2 = o0Var2.q();
                            if (zR || objQ2 == c2565a3) {
                                obj3 = objQ2;
                                r rVar2 = new r(context, 3);
                                o0Var2.K(rVar2);
                                obj3 = rVar2;
                            }
                            h4.r rVarD = u1.w.d(rVarC6, false, null, null, (e23.a) obj3, 15);
                            str2 = str;
                            zB = o0Var2.B(str2);
                            Object objQ10 = o0Var2.q();
                            obj4 = objQ10;
                            if (zB || objQ10 == c2565a3) {
                                r0 r0Var = new r0(str2, 1);
                                o0Var2.K(r0Var);
                                obj4 = r0Var;
                            }
                            h4.r rVarC7 = p5.v.c((e23.l) obj4, rVarD, false);
                            fVar2.getClass();
                            mh.c(strQ, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 0, 0, 131068);
                            p3.o0 o0Var5 = o0Var2;
                            z15 = false;
                            o0Var5.g0(false);
                            r16 = o0Var5;
                        } else {
                            context = context2;
                            z15 = false;
                            o0Var2.C(791548348);
                            o0Var2.g0(false);
                            r16 = o0Var2;
                        }
                    } else {
                        o0Var2.C(789788168);
                        String strQ6 = gl1.y.Q(o0Var2, R.string.lbl_hide);
                        String strP2 = gl1.y.P(R.string.lbl_button_desc, new Object[]{strQ6}, o0Var2);
                        h4.r rVarC8 = u2Var.c(aVar, h4.d.a.f81535m);
                        boolean zR6 = o0Var2.r(qVar4) | o0Var2.r(b0Var) | o0Var2.r(this);
                        Object objQ11 = o0Var2.q();
                        if (zR6 || objQ11 == c2565a3) {
                            cVar2 = null;
                            z17 = true;
                            f15 = 1.0f;
                            dVar = new ok0.d(qVar4, b0Var, this, p1Var, 18);
                            o0Var2.K(dVar);
                        } else {
                            dVar = objQ11;
                            z17 = true;
                            f15 = 1.0f;
                            cVar2 = null;
                        }
                        h4.r rVarD2 = u1.w.d(rVarC8, false, null, null, (e23.a) dVar, 15);
                        boolean zB2 = o0Var2.B(strP2);
                        Object objQ12 = o0Var2.q();
                        if (zB2 || objQ12 == c2565a3) {
                            z18 = false;
                            r0 r0Var2 = new r0(strP2, 0);
                            o0Var2.K(r0Var2);
                            obj8 = r0Var2;
                        } else {
                            z18 = false;
                            obj8 = objQ12;
                        }
                        h4.r rVarC9 = p5.v.c((e23.l) obj8, rVarD2, z18);
                        fVar2.getClass();
                        i16 = 3;
                        cVar = cVar2;
                        eVar = eVar;
                        r15 = z17;
                        f14 = f15;
                        mh.c(strQ6, rVarC9, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 0, 0, 131068);
                        p3.o0 o0Var6 = o0Var2;
                        z15 = false;
                        o0Var6.g0(false);
                        context = context2;
                        r16 = o0Var6;
                    }
                    r16.g0(r15);
                    if (z19) {
                        r16.C(-199416679);
                        F = jg.b.F(r16);
                        r16.g0(z15);
                    } else {
                        r16.C(-821568420);
                        r16.g0(z15);
                        F = f14;
                    }
                    if (z19) {
                        r16.C(-1886885457);
                        a02.g.a(x2.f(aVar, f14), F, r16, 6);
                        r16.w(iA);
                        p2VarI0 = r16.i0();
                        if (p2VarI0 != null) {
                            return;
                        }
                        final int i18 = 0;
                        pVar = new e23.p(this) { // from class: s70.s0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ u0 f157794b;

                            {
                                this.f157794b = this;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj14, Object obj15) {
                                int i19 = i18;
                                p3.m mVar2 = (p3.m) obj14;
                                ((Integer) obj15).getClass();
                                switch (i19) {
                                    case 0:
                                        this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    case 1:
                                        this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    default:
                                        this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        r16.C(-1886746112);
                        r16.g0(false);
                        if (z24) {
                            r16.C(-1886696357);
                            long jF = d92.b.a(r16).c().f();
                            bVar.getClass();
                            h4.r rVarX = x2.x(x2.f(u1.n.e(aVar, jF, k2.i.a(f17)), f14), cVar, i16);
                            bVar.getClass();
                            h4.r rVarA = c2.l.A(rVarX, 0.0f, eVar.f97920e, r15);
                            bVar.getClass();
                            h4.r rVarA2 = c2.l.A(rVarA, eVar.f97922g, 0.0f, 2);
                            zR4 = r16.r(context);
                            objQ3 = r16.q();
                            if (zR4 || objQ3 == c2565a3) {
                                obj7 = objQ3;
                                r rVar3 = new r(context, 4);
                                r16.K(rVar3);
                                obj7 = rVar3;
                            }
                            yz1.h.a(0, 0, (e23.a) obj7, rVarA2, r16);
                            r16.w(iA);
                            p2VarI0 = r16.i0();
                            if (p2VarI0 != null) {
                                return;
                            }
                            final int i19 = 1;
                            pVar = new e23.p(this) { // from class: s70.s0

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ u0 f157794b;

                                {
                                    this.f157794b = this;
                                }

                                @Override // e23.p
                                public final Object invoke(Object obj14, Object obj15) {
                                    int i110 = i19;
                                    p3.m mVar2 = (p3.m) obj14;
                                    ((Integer) obj15).getClass();
                                    switch (i110) {
                                        case 0:
                                            this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                            break;
                                        case 1:
                                            this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                            break;
                                        default:
                                            this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                        } else {
                            u0Var = this;
                            qVar2 = qVar;
                            r16.C(-1886045760);
                            r16.g0(false);
                            if (cVar4.isEmpty()) {
                                r16.C(-1885510886);
                                h4.r rVarX2 = x2.x(x2.f(aVar, f14), cVar, i16);
                                o4.d0 d0VarA = o4.d0.a(d92.b.a(r16).f().b());
                                String strQ7 = gl1.y.Q(r16, R.string.lbl_no_events_added);
                                List listK = p13.x.k(gl1.y.Q(r16, R.string.msg_add_races_or_events), gl1.y.Q(r16, R.string.msg_search_for_an_event));
                                String strQ8 = gl1.y.Q(r16, R.string.find_an_event_v2);
                                zR2 = r16.r(qVarC) | r16.r(u0Var) | r16.r(context);
                                Object objQ13 = r16.q();
                                if (!zR2 || objQ13 == c2565a3) {
                                    final int i24 = 0;
                                    e23.a aVar5 = new e23.a() { // from class: s70.t0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i24) {
                                                case 0:
                                                    qVarC.a(u0Var.f157807b.j(context), null);
                                                    break;
                                                default:
                                                    qVarC.a(u0Var.f157807b.e(context), null);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    r16.K(aVar5);
                                    obj5 = aVar5;
                                } else {
                                    obj5 = objQ13;
                                }
                                e23.a aVar6 = (e23.a) obj5;
                                String strQ9 = gl1.y.Q(r16, R.string.create_an_event_v2);
                                zR3 = r16.r(qVarC) | r16.r(u0Var) | r16.r(context);
                                Object objQ14 = r16.q();
                                obj6 = objQ14;
                                if (zR3 || objQ14 == c2565a3) {
                                    e23.a aVar7 = new e23.a() { // from class: s70.t0
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (r15) {
                                                case 0:
                                                    qVarC.a(u0Var.f157807b.j(context), null);
                                                    break;
                                                default:
                                                    qVarC.a(u0Var.f157807b.e(context), null);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    r16.K(aVar7);
                                    obj6 = aVar7;
                                }
                                r17 = r15 == true ? 1 : 0;
                                z16 = false;
                                yz1.g.a(rVarX2, R.drawable.ic_checkered_flag, d0VarA, strQ7, listK, strQ8, aVar6, strQ9, (e23.a) obj6, r16, 6, 0);
                                r16.g0(false);
                            } else {
                                r16.C(-1885979513);
                                it = cVar4.iterator();
                                while (it.hasNext()) {
                                    A = m70.f.a(it.next());
                                    if (A == 0) {
                                        r16.C(1343859876);
                                        r16.g0(false);
                                    } else {
                                        r16.C(-1619217667);
                                        A.a(x2.x(x2.f(h4.r.S, f14), cVar, i16), qVar2, r16, (i17 & 112) | 6);
                                        r16.g0(false);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                                r16.g0(false);
                                r17 = r15;
                                z16 = false;
                            }
                            r16.g0(z16);
                            r16.g0(r17);
                            Unit unit2 = Unit.INSTANCE;
                            r16.g0(z16);
                            r18 = r16;
                        }
                    }
                    p2VarI0.f135219d = pVar;
                }
                qVar3 = qVar5;
                v.h.A(iHashCode2, o0Var, iHashCode2, bVar2);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0Var);
                c2.b0 b0Var5 = c2.b0.f22601a;
                o0Var.C(-1889250136);
                aVar = h4.r.S;
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                bVar.getClass();
                h4.r rVarC10 = c2.l.C(rVarF2, 0.0f, 0.0f, 0.0f, eVar2.f97918c, 7);
                s2VarA = c2.q2.a(c2.j.f22698h, h4.d.a.f81533k, o0Var, 6);
                iHashCode = Long.hashCode(o0Var.U);
                i2VarA0 = o0Var.a0();
                rVarC = h4.k.c(rVarC10, o0Var);
                if (cVar3 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var.z();
                if (o0Var.T) {
                    o0Var.M(aVar4);
                } else {
                    o0Var.c();
                }
                b4.c(eVar3, s2VarA, o0Var);
                b4.c(c1623g, i2VarA0, o0Var);
                if (o0Var.T) {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                } else {
                    v.h.A(iHashCode, o0Var, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0Var);
                u2Var = u2.f22900a;
                objQ = o0Var.q();
                obj2 = objQ;
                if (objQ == c2565a3) {
                    s5.e0 e0Var2 = new s5.e0(17);
                    o0Var.K(e0Var2);
                    obj2 = e0Var2;
                }
                h4.r rVarC11 = p5.v.c((e23.l) obj2, aVar, false);
                String strQ10 = gl1.y.Q(o0Var, R.string.lbl_events);
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                qVar4 = qVar3;
                p3.o0 o0Var7 = o0Var;
                eVar = eVar2;
                cVar = null;
                mh.c(strQ10, rVarC11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0Var), o0Var7, 0, 0, 131068);
                o0Var2 = o0Var7;
                if (cVar4.isEmpty()) {
                    i16 = 3;
                    f14 = 1.0f;
                    r15 = 1;
                    r15 = 1;
                    if (qVar4.f97620b) {
                        o0Var2.C(790970105);
                        h4.r rVarC12 = u2Var.c(aVar, h4.d.a.f81535m);
                        context = context2;
                        zR = o0Var2.r(context);
                        objQ2 = o0Var2.q();
                        if (zR) {
                            obj3 = objQ2;
                            r rVar4 = new r(context, 3);
                            o0Var2.K(rVar4);
                            obj3 = rVar4;
                        } else {
                            obj3 = objQ2;
                            r rVar5 = new r(context, 3);
                            o0Var2.K(rVar5);
                            obj3 = rVar5;
                        }
                        h4.r rVarD3 = u1.w.d(rVarC12, false, null, null, (e23.a) obj3, 15);
                        str2 = str;
                        zB = o0Var2.B(str2);
                        Object objQ15 = o0Var2.q();
                        obj4 = objQ15;
                        if (zB) {
                            r0 r0Var3 = new r0(str2, 1);
                            o0Var2.K(r0Var3);
                            obj4 = r0Var3;
                        } else {
                            r0 r0Var4 = new r0(str2, 1);
                            o0Var2.K(r0Var4);
                            obj4 = r0Var4;
                        }
                        h4.r rVarC13 = p5.v.c((e23.l) obj4, rVarD3, false);
                        fVar2.getClass();
                        mh.c(strQ, rVarC13, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 0, 0, 131068);
                        p3.o0 o0Var8 = o0Var2;
                        z15 = false;
                        o0Var8.g0(false);
                        r16 = o0Var8;
                    } else {
                        context = context2;
                        z15 = false;
                        o0Var2.C(791548348);
                        o0Var2.g0(false);
                        r16 = o0Var2;
                    }
                } else {
                    i16 = 3;
                    f14 = 1.0f;
                    r15 = 1;
                    r15 = 1;
                    if (qVar4.f97620b) {
                        o0Var2.C(790970105);
                        h4.r rVarC14 = u2Var.c(aVar, h4.d.a.f81535m);
                        context = context2;
                        zR = o0Var2.r(context);
                        objQ2 = o0Var2.q();
                        if (zR) {
                            obj3 = objQ2;
                            r rVar6 = new r(context, 3);
                            o0Var2.K(rVar6);
                            obj3 = rVar6;
                        } else {
                            obj3 = objQ2;
                            r rVar7 = new r(context, 3);
                            o0Var2.K(rVar7);
                            obj3 = rVar7;
                        }
                        h4.r rVarD4 = u1.w.d(rVarC14, false, null, null, (e23.a) obj3, 15);
                        str2 = str;
                        zB = o0Var2.B(str2);
                        Object objQ16 = o0Var2.q();
                        obj4 = objQ16;
                        if (zB) {
                            r0 r0Var5 = new r0(str2, 1);
                            o0Var2.K(r0Var5);
                            obj4 = r0Var5;
                        } else {
                            r0 r0Var6 = new r0(str2, 1);
                            o0Var2.K(r0Var6);
                            obj4 = r0Var6;
                        }
                        h4.r rVarC15 = p5.v.c((e23.l) obj4, rVarD4, false);
                        fVar2.getClass();
                        mh.c(strQ, rVarC15, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97932i, hb.a.e(o0Var2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0Var2, 0, 0, 131068);
                        p3.o0 o0Var9 = o0Var2;
                        z15 = false;
                        o0Var9.g0(false);
                        r16 = o0Var9;
                    } else {
                        context = context2;
                        z15 = false;
                        o0Var2.C(791548348);
                        o0Var2.g0(false);
                        r16 = o0Var2;
                    }
                }
                r16.g0(r15);
                if (z19) {
                    r16.C(-199416679);
                    F = jg.b.F(r16);
                    r16.g0(z15);
                } else {
                    r16.C(-821568420);
                    r16.g0(z15);
                    F = f14;
                }
                if (z19) {
                    r16.C(-1886885457);
                    a02.g.a(x2.f(aVar, f14), F, r16, 6);
                    r16.w(iA);
                    p2VarI0 = r16.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i110 = 0;
                    pVar = new e23.p(this) { // from class: s70.s0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ u0 f157794b;

                        {
                            this.f157794b = this;
                        }

                        @Override // e23.p
                        public final Object invoke(Object obj14, Object obj15) {
                            int i111 = i110;
                            p3.m mVar2 = (p3.m) obj14;
                            ((Integer) obj15).getClass();
                            switch (i111) {
                                case 0:
                                    this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                case 1:
                                    this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                                default:
                                    this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    r16.C(-1886746112);
                    r16.g0(false);
                    if (z24) {
                        r16.C(-1886696357);
                        long jF2 = d92.b.a(r16).c().f();
                        bVar.getClass();
                        h4.r rVarX3 = x2.x(x2.f(u1.n.e(aVar, jF2, k2.i.a(f17)), f14), cVar, i16);
                        bVar.getClass();
                        h4.r rVarA3 = c2.l.A(rVarX3, 0.0f, eVar.f97920e, r15);
                        bVar.getClass();
                        h4.r rVarA4 = c2.l.A(rVarA3, eVar.f97922g, 0.0f, 2);
                        zR4 = r16.r(context);
                        objQ3 = r16.q();
                        if (zR4) {
                            obj7 = objQ3;
                            r rVar8 = new r(context, 4);
                            r16.K(rVar8);
                            obj7 = rVar8;
                        } else {
                            obj7 = objQ3;
                            r rVar9 = new r(context, 4);
                            r16.K(rVar9);
                            obj7 = rVar9;
                        }
                        yz1.h.a(0, 0, (e23.a) obj7, rVarA4, r16);
                        r16.w(iA);
                        p2VarI0 = r16.i0();
                        if (p2VarI0 != null) {
                            return;
                        }
                        final int i111 = 1;
                        pVar = new e23.p(this) { // from class: s70.s0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ u0 f157794b;

                            {
                                this.f157794b = this;
                            }

                            @Override // e23.p
                            public final Object invoke(Object obj14, Object obj15) {
                                int i112 = i111;
                                p3.m mVar2 = (p3.m) obj14;
                                ((Integer) obj15).getClass();
                                switch (i112) {
                                    case 0:
                                        this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    case 1:
                                        this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                    default:
                                        this.f157794b.a(rVar, qVar, mVar2, p3.p0.t(i14 | 1));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                    } else {
                        u0Var = this;
                        qVar2 = qVar;
                        r16.C(-1886045760);
                        r16.g0(false);
                        if (cVar4.isEmpty()) {
                            r16.C(-1885979513);
                            it = cVar4.iterator();
                            while (it.hasNext()) {
                                A = m70.f.a(it.next());
                                if (A == 0) {
                                    r16.C(1343859876);
                                    r16.g0(false);
                                } else {
                                    r16.C(-1619217667);
                                    A.a(x2.x(x2.f(h4.r.S, f14), cVar, i16), qVar2, r16, (i17 & 112) | 6);
                                    r16.g0(false);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                            }
                            r16.g0(false);
                            r17 = r15;
                            z16 = false;
                        } else {
                            r16.C(-1885510886);
                            h4.r rVarX4 = x2.x(x2.f(aVar, f14), cVar, i16);
                            o4.d0 d0VarA2 = o4.d0.a(d92.b.a(r16).f().b());
                            String strQ11 = gl1.y.Q(r16, R.string.lbl_no_events_added);
                            List listK2 = p13.x.k(gl1.y.Q(r16, R.string.msg_add_races_or_events), gl1.y.Q(r16, R.string.msg_search_for_an_event));
                            String strQ12 = gl1.y.Q(r16, R.string.find_an_event_v2);
                            zR2 = r16.r(qVarC) | r16.r(u0Var) | r16.r(context);
                            Object objQ17 = r16.q();
                            if (zR2) {
                                final int i25 = 0;
                                e23.a aVar8 = new e23.a() { // from class: s70.t0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i25) {
                                            case 0:
                                                qVarC.a(u0Var.f157807b.j(context), null);
                                                break;
                                            default:
                                                qVarC.a(u0Var.f157807b.e(context), null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r16.K(aVar8);
                                obj5 = aVar8;
                            } else {
                                final int i26 = 0;
                                e23.a aVar9 = new e23.a() { // from class: s70.t0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (i26) {
                                            case 0:
                                                qVarC.a(u0Var.f157807b.j(context), null);
                                                break;
                                            default:
                                                qVarC.a(u0Var.f157807b.e(context), null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r16.K(aVar9);
                                obj5 = aVar9;
                            }
                            e23.a aVar10 = (e23.a) obj5;
                            String strQ13 = gl1.y.Q(r16, R.string.create_an_event_v2);
                            zR3 = r16.r(qVarC) | r16.r(u0Var) | r16.r(context);
                            Object objQ18 = r16.q();
                            obj6 = objQ18;
                            if (zR3) {
                                e23.a aVar11 = new e23.a() { // from class: s70.t0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (r15) {
                                            case 0:
                                                qVarC.a(u0Var.f157807b.j(context), null);
                                                break;
                                            default:
                                                qVarC.a(u0Var.f157807b.e(context), null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r16.K(aVar11);
                                obj6 = aVar11;
                            } else {
                                e23.a aVar12 = new e23.a() { // from class: s70.t0
                                    @Override // e23.a
                                    public final Object invoke() {
                                        switch (r15) {
                                            case 0:
                                                qVarC.a(u0Var.f157807b.j(context), null);
                                                break;
                                            default:
                                                qVarC.a(u0Var.f157807b.e(context), null);
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                r16.K(aVar12);
                                obj6 = aVar12;
                            }
                            r17 = r15 == true ? 1 : 0;
                            z16 = false;
                            yz1.g.a(rVarX4, R.drawable.ic_checkered_flag, d0VarA2, strQ11, listK2, strQ12, aVar10, strQ13, (e23.a) obj6, r16, 6, 0);
                            r16.g0(false);
                        }
                        r16.g0(z16);
                        r16.g0(r17);
                        Unit unit4 = Unit.INSTANCE;
                        r16.g0(z16);
                        r18 = r16;
                    }
                }
                p2VarI0.f135219d = pVar;
            }
            o0Var.C(-1917612724);
            o0Var.g0(z14);
            u0Var = this;
            qVar2 = qVar;
            r18 = o0Var;
            p3.x1 x1Var2 = p3.n.f135158a;
            r14 = r18;
        } else {
            u0Var = this;
            qVar2 = qVar;
            o0VarQ.e();
            r14 = o0VarQ;
        }
        p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            final int i27 = 2;
            final u0 u0Var2 = u0Var;
            final r70.q qVar6 = qVar2;
            pVar = new e23.p(u0Var2) { // from class: s70.s0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ u0 f157794b;

                {
                    this.f157794b = u0Var2;
                }

                @Override // e23.p
                public final Object invoke(Object obj14, Object obj15) {
                    int i112 = i27;
                    p3.m mVar2 = (p3.m) obj14;
                    ((Integer) obj15).getClass();
                    switch (i112) {
                        case 0:
                            this.f157794b.a(rVar, qVar6, mVar2, p3.p0.t(i14 | 1));
                            break;
                        case 1:
                            this.f157794b.a(rVar, qVar6, mVar2, p3.p0.t(i14 | 1));
                            break;
                        default:
                            this.f157794b.a(rVar, qVar6, mVar2, p3.p0.t(i14 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }
}
