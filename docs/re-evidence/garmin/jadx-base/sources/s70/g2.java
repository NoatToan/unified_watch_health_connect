package s70;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class g2 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.presentation.component.WhatsNewComposableKt$WhatsNewCard$1$1", f = "WhatsNewComposable.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<j70.a0, Unit> f157699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j70.a0 f157700b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super j70.a0, Unit> lVar, j70.a0 a0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f157699a = lVar;
            this.f157700b = a0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f157699a, this.f157700b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f157699a.invoke(this.f157700b);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:125:0x020e  */
    /* JADX WARN: Code duplicated, block: B:127:0x024a  */
    /* JADX WARN: Code duplicated, block: B:129:0x0251  */
    /* JADX WARN: Code duplicated, block: B:130:0x0257  */
    /* JADX WARN: Code duplicated, block: B:135:0x0272  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:141:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:143:0x031d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0324  */
    /* JADX WARN: Code duplicated, block: B:146:0x032a  */
    /* JADX WARN: Code duplicated, block: B:151:0x0345  */
    /* JADX WARN: Code duplicated, block: B:153:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:155:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:162:0x0491  */
    /* JADX WARN: Code duplicated, block: B:164:0x0495  */
    /* JADX WARN: Code duplicated, block: B:170:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:173:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:176:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:177:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:179:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v7, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r8v14, types: [c2.u2] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v33 */
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
    public static final void a(h4.r rVar, final j70.a0 a0Var, List<? extends j70.a0> list, final e23.l<? super j70.a0, Unit> lVar, e23.l<? super j70.a0, Unit> lVar2, e23.l<? super j70.a0, Unit> lVar3, p3.m mVar, int i14) {
        int i15;
        ?? r15;
        Object obj;
        boolean z14;
        Object obj2;
        int i16;
        h5.g.a.f fVar;
        h4.r.a aVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        String str;
        String str2;
        int i17;
        float f14;
        u4.d dVar;
        boolean z15;
        boolean z16;
        p3.o0 o0Var;
        f5.z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        final ?? r14;
        p3.o0 o0Var2;
        boolean z17;
        ?? r16;
        ?? r18;
        int i18;
        Object objQ;
        Object obj3;
        f5.z0 z0VarD2;
        int iHashCode3;
        i2 i2VarA2;
        h4.r rVarC3;
        final e23.l<? super j70.a0, Unit> lVar4 = lVar2;
        p3.o0 o0VarE = mVar.E(1699647669);
        p3.c<?> cVar = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(a0Var) : o0VarE.r(a0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(list) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar4) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(lVar3) ? 131072 : 65536;
        }
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            Unit unit = Unit.INSTANCE;
            int i19 = i15 & 112;
            boolean z18 = ((458752 & i15) == 131072) | (i19 == 32 || ((i15 & 64) != 0 && o0VarE.r(a0Var)));
            Object objQ2 = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z18) {
                obj = objQ2;
                a aVar3 = new a(lVar3, a0Var, null);
                o0VarE.K(aVar3);
                obj = aVar3;
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    obj = objQ2;
                    a aVar4 = new a(lVar3, a0Var, null);
                    o0VarE.K(aVar4);
                    obj = aVar4;
                }
            }
            obj = objQ2;
            p3.l0.e((e23.p) obj, unit, o0VarE);
            long jA = am.j.A(d92.b.f58623a, o0VarE);
            f02.h.f67736a.getClass();
            long jA2 = f02.h.a(o0VarE);
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            h4.r rVarE = u1.n.e(rVar, jA, k2.i.a(j92.b.f97900c.f97911c));
            boolean z19 = ((a0Var instanceof j70.a0.d) && p005kotlin.jvm.internal.s.g(a0Var.f97489o, c80.a0.f25291b)) ? false : true;
            boolean z24 = ((i15 & 7168) == 2048) | (i19 == 32 || ((i15 & 64) != 0 && o0VarE.r(a0Var)));
            Object objQ3 = o0VarE.q();
            if (z24) {
                z14 = false;
                final boolean z25 = false ? 1 : 0;
                e23.a aVar5 = new e23.a() { // from class: s70.f2
                    @Override // e23.a
                    public final Object invoke() {
                        switch (z25) {
                            case 0:
                                lVar.invoke(a0Var);
                                break;
                            default:
                                lVar.invoke(a0Var);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(aVar5);
                obj2 = aVar5;
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    z14 = false;
                    final int z26 = false ? 1 : 0;
                    e23.a aVar6 = new e23.a() { // from class: s70.f2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (z26) {
                                case 0:
                                    lVar.invoke(a0Var);
                                    break;
                                default:
                                    lVar.invoke(a0Var);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(aVar6);
                    obj2 = aVar6;
                } else {
                    z14 = false;
                    obj2 = objQ3;
                }
            }
            h4.r rVarD = u1.w.d(rVarE, z19, null, null, (e23.a) obj2, 14);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD3 = c2.q.d(gVar, z14);
            int iHashCode4 = Long.hashCode(o0VarE.U);
            i2 i2VarA3 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0VarD3, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA3, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                i16 = i15;
            } else {
                i16 = i15;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC4, o0VarE);
                c2.u uVar = c2.u.f22885a;
                aVar = h4.r.S;
                c2.j.f22691a.getClass();
                s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                ?? r17 = u2.f22900a;
                str = a0Var.f97485k;
                str2 = a0Var.f97484j;
                if (g22.n.d(str)) {
                    o0VarE.C(1950467381);
                    bVar.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
                    bVar.getClass();
                    h4.r rVarC5 = c2.l.C(rVarA, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13);
                    z0VarD2 = c2.q.d(gVar, false);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarC5, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    wf.f.a aVar8 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar8.f184930c = a0Var.f97485k;
                    wf.g.a(aVar8);
                    wf.f fVarA = aVar8.a();
                    f5.k.f68985a.getClass();
                    f5.k.a.C1427a c1427a = f5.k.a.f68987b;
                    bVar.getClass();
                    jf.r.a(fVarA, null, l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), k2.i.f102406a), null, null, c1427a, null, o0VarE, 1572912, 1976);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                    z16 = false;
                    f14 = 0.0f;
                    i17 = 16384;
                    r14 = 1;
                    o0Var2 = o0VarE;
                } else if (g22.n.d(str2)) {
                    o0VarE.C(1951440502);
                    bVar.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarA2 = c2.l.A(aVar, eVar3.f97920e, 0.0f, 2);
                    bVar.getClass();
                    h4.r rVarC6 = c2.l.C(rVarA2, 0.0f, eVar3.f97920e, 0.0f, 0.0f, 13);
                    z0VarD = c2.q.d(gVar, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC6, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar7);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    wf.f.a aVar9 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar9.f184930c = str2;
                    wf.g.a(aVar9);
                    wf.f fVarA2 = aVar9.a();
                    f5.k.f68985a.getClass();
                    f5.k.a.C1427a c1427a2 = f5.k.a.f68987b;
                    bVar.getClass();
                    h4.r rVarB = l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), k2.i.f102406a);
                    gl.c.f77766a.getClass();
                    g6.f.a aVar10 = g6.f.f75994b;
                    i17 = 16384;
                    jf.r.a(fVarA2, null, c2.l.y(u1.n.e(rVarB, gl.c.a(o0VarE).b(), o4.m1.f128891a), 8), null, null, c1427a2, o4.e0.a.a(o4.e0.f128843b, jA2), o0VarE, 1572912, 1720);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                    Unit unit2 = Unit.INSTANCE;
                    f14 = 0.0f;
                    r14 = 1;
                    z16 = false;
                    o0Var2 = o0VarE;
                } else {
                    i17 = 16384;
                    f14 = 0.0f;
                    o0VarE.C(1952447196);
                    dVar = a0Var.f97477c;
                    if (dVar == null) {
                        o0VarE.C(1952447195);
                        o0VarE.g0(false);
                        z16 = false;
                        z15 = true;
                        o0Var = o0VarE;
                    } else {
                        o0VarE.C(1952447196);
                        bVar.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        h4.r rVarA3 = c2.l.A(aVar, eVar4.f97920e, 0.0f, 2);
                        bVar.getClass();
                        h4.r rVarC7 = c2.l.C(rVarA3, 0.0f, eVar4.f97920e, 0.0f, 0.0f, 13);
                        gl.c.f77766a.getClass();
                        long jB = gl.c.a(o0VarE).b();
                        bVar.getClass();
                        z15 = true;
                        g02.i.a(rVarC7, dVar, jA2, jB, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, 0, 224);
                        p3.o0 o0Var3 = o0VarE;
                        z16 = false;
                        o0Var3.g0(false);
                        o0Var = o0Var3;
                    }
                    o0Var.g0(z16);
                    r14 = z15;
                    o0Var2 = o0Var;
                }
                bVar.getClass();
                j92.e eVar5 = j92.b.f97899b;
                z17 = z16;
                c2.v.a(x2.c(r17.a(c2.l.A(aVar, f14, eVar5.f97920e, r14), 1.0f, r14), 1.0f), null, false, z3.f.c(-639344651, new ry0.g(5, list, a0Var), o0Var2), o0Var2, 3072, 6);
                bVar.getClass();
                float f15 = eVar5.f97917b;
                bVar.getClass();
                h4.r rVarC8 = c2.l.C(aVar, 0.0f, f15, eVar5.f97917b, 0.0f, 9);
                if ((i16 & 57344) == i17) {
                    r16 = r14;
                } else {
                    r16 = z17 ? 1 : 0;
                }
                if (i19 != 32 || ((i16 & 64) != 0 && o0Var2.r(a0Var))) {
                    r18 = z17;
                    r18 = z17;
                    r18 = r14;
                }
                r18 = z17;
                r18 = z17;
                r18 = z17;
                i18 = r16 | r18;
                objQ = o0Var2.q();
                if (i18 == 0) {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        lVar4 = lVar2;
                        e23.a aVar11 = new e23.a() { // from class: s70.f2
                            @Override // e23.a
                            public final Object invoke() {
                                switch (r14) {
                                    case 0:
                                        lVar4.invoke(a0Var);
                                        break;
                                    default:
                                        lVar4.invoke(a0Var);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0Var2.K(aVar11);
                        obj3 = aVar11;
                    } else {
                        lVar4 = lVar2;
                        obj3 = objQ;
                    }
                } else {
                    lVar4 = lVar2;
                    e23.a aVar12 = new e23.a() { // from class: s70.f2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (r14) {
                                case 0:
                                    lVar4.invoke(a0Var);
                                    break;
                                default:
                                    lVar4.invoke(a0Var);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(aVar12);
                    obj3 = aVar12;
                }
                p3.o0 o0Var4 = o0Var2;
                l72.u0.a(rVarC8, null, null, null, (e23.a) obj3, o0Var4, 0, 14);
                ?? r19 = o0Var4;
                r19.g0(r14);
                r19.g0(r14);
                p3.x1 x1Var2 = p3.n.f135158a;
                r15 = r19;
            }
            v.h.A(iHashCode4, o0VarE, iHashCode4, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC4, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            aVar = h4.r.S;
            c2.j.f22691a.getClass();
            s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            ?? r110 = u2.f22900a;
            str = a0Var.f97485k;
            str2 = a0Var.f97484j;
            if (g22.n.d(str)) {
                o0VarE.C(1950467381);
                bVar.getClass();
                j92.e eVar6 = j92.b.f97899b;
                h4.r rVarA4 = c2.l.A(aVar, eVar6.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC9 = c2.l.C(rVarA4, 0.0f, eVar6.f97920e, 0.0f, 0.0f, 13);
                z0VarD2 = c2.q.d(gVar, false);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC9, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
                }
                b4.c(fVar, rVarC3, o0VarE);
                wf.f.a aVar13 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar13.f184930c = a0Var.f97485k;
                wf.g.a(aVar13);
                wf.f fVarA3 = aVar13.a();
                f5.k.f68985a.getClass();
                f5.k.a.C1427a c1427a3 = f5.k.a.f68987b;
                bVar.getClass();
                jf.r.a(fVarA3, null, l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), k2.i.f102406a), null, null, c1427a3, null, o0VarE, 1572912, 1976);
                o0VarE.g0(true);
                o0VarE.g0(false);
                z16 = false;
                f14 = 0.0f;
                i17 = 16384;
                r14 = 1;
                o0Var2 = o0VarE;
            } else if (g22.n.d(str2)) {
                o0VarE.C(1951440502);
                bVar.getClass();
                j92.e eVar7 = j92.b.f97899b;
                h4.r rVarA5 = c2.l.A(aVar, eVar7.f97920e, 0.0f, 2);
                bVar.getClass();
                h4.r rVarC10 = c2.l.C(rVarA5, 0.0f, eVar7.f97920e, 0.0f, 0.0f, 13);
                z0VarD = c2.q.d(gVar, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC10, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                wf.f.a aVar14 = new wf.f.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
                aVar14.f184930c = str2;
                wf.g.a(aVar14);
                wf.f fVarA4 = aVar14.a();
                f5.k.f68985a.getClass();
                f5.k.a.C1427a c1427a4 = f5.k.a.f68987b;
                bVar.getClass();
                h4.r rVarB2 = l4.k.b(x2.q(aVar, j92.b.f97901d.f97906e), k2.i.f102406a);
                gl.c.f77766a.getClass();
                g6.f.a aVar15 = g6.f.f75994b;
                i17 = 16384;
                jf.r.a(fVarA4, null, c2.l.y(u1.n.e(rVarB2, gl.c.a(o0VarE).b(), o4.m1.f128891a), 8), null, null, c1427a4, o4.e0.a.a(o4.e0.f128843b, jA2), o0VarE, 1572912, 1720);
                o0VarE.g0(true);
                o0VarE.g0(false);
                Unit unit3 = Unit.INSTANCE;
                f14 = 0.0f;
                r14 = 1;
                z16 = false;
                o0Var2 = o0VarE;
            } else {
                i17 = 16384;
                f14 = 0.0f;
                o0VarE.C(1952447196);
                dVar = a0Var.f97477c;
                if (dVar == null) {
                    o0VarE.C(1952447195);
                    o0VarE.g0(false);
                    z16 = false;
                    z15 = true;
                    o0Var = o0VarE;
                } else {
                    o0VarE.C(1952447196);
                    bVar.getClass();
                    j92.e eVar8 = j92.b.f97899b;
                    h4.r rVarA6 = c2.l.A(aVar, eVar8.f97920e, 0.0f, 2);
                    bVar.getClass();
                    h4.r rVarC11 = c2.l.C(rVarA6, 0.0f, eVar8.f97920e, 0.0f, 0.0f, 13);
                    gl.c.f77766a.getClass();
                    long jB2 = gl.c.a(o0VarE).b();
                    bVar.getClass();
                    z15 = true;
                    g02.i.a(rVarC11, dVar, jA2, jB2, j92.b.f97901d.f97906e, 0.0f, null, o0VarE, 0, 224);
                    p3.o0 o0Var5 = o0VarE;
                    z16 = false;
                    o0Var5.g0(false);
                    o0Var = o0Var5;
                }
                o0Var.g0(z16);
                r14 = z15;
                o0Var2 = o0Var;
            }
            bVar.getClass();
            j92.e eVar9 = j92.b.f97899b;
            z17 = z16;
            c2.v.a(x2.c(r110.a(c2.l.A(aVar, f14, eVar9.f97920e, r14), 1.0f, r14), 1.0f), null, false, z3.f.c(-639344651, new ry0.g(5, list, a0Var), o0Var2), o0Var2, 3072, 6);
            bVar.getClass();
            float f16 = eVar9.f97917b;
            bVar.getClass();
            h4.r rVarC12 = c2.l.C(aVar, 0.0f, f16, eVar9.f97917b, 0.0f, 9);
            if ((i16 & 57344) == i17) {
                r16 = r14;
            } else {
                r16 = z17 ? 1 : 0;
            }
            if (i19 != 32) {
                r18 = z17;
                r18 = z17;
                r18 = r14;
            } else {
                r18 = z17;
                r18 = z17;
                r18 = r14;
            }
            r18 = z17;
            r18 = z17;
            r18 = z17;
            i18 = r16 | r18;
            objQ = o0Var2.q();
            if (i18 == 0) {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lVar4 = lVar2;
                    e23.a aVar16 = new e23.a() { // from class: s70.f2
                        @Override // e23.a
                        public final Object invoke() {
                            switch (r14) {
                                case 0:
                                    lVar4.invoke(a0Var);
                                    break;
                                default:
                                    lVar4.invoke(a0Var);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var2.K(aVar16);
                    obj3 = aVar16;
                } else {
                    lVar4 = lVar2;
                    obj3 = objQ;
                }
            } else {
                lVar4 = lVar2;
                e23.a aVar17 = new e23.a() { // from class: s70.f2
                    @Override // e23.a
                    public final Object invoke() {
                        switch (r14) {
                            case 0:
                                lVar4.invoke(a0Var);
                                break;
                            default:
                                lVar4.invoke(a0Var);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0Var2.K(aVar17);
                obj3 = aVar17;
            }
            p3.o0 o0Var6 = o0Var2;
            l72.u0.a(rVarC12, null, null, null, (e23.a) obj3, o0Var6, 0, 14);
            ?? r111 = o0Var6;
            r111.g0(r14);
            r111.g0(r14);
            p3.x1 x1Var3 = p3.n.f135158a;
            r15 = r111;
        } else {
            o0VarE.e();
            r15 = o0VarE;
        }
        p2 p2VarI0 = r15.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, a0Var, list, lVar, lVar4, lVar3, i14, 7);
        }
    }
}
