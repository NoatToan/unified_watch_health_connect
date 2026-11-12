package h21;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n0;
import c2.n3;
import c2.x2;
import c22.o2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.nutrition.presentation.NutritionActivity;
import com.google.android.exoplayer2.C;
import com.google.common.base.Ascii;
import g2.m1;
import h5.e0;
import i3.e9;
import i3.fe;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.h4;
import kotlin.t1;
import l72.v2;
import o4.l1;
import o53.b0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import zd0.g1;

/* JADX INFO: loaded from: classes9.dex */
public final class t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.reports.screen.NutritionReportsScreenKt$NutritionReportsScreen$dismissWhatsNewSheet$1", f = "NutritionReportsScreen.kt", l = {132}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f81162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f81163b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mc mcVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f81163b = mcVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f81163b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f81162a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f81162a = 1;
                if (this.f81163b.d(this) == aVar) {
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

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81164a;

        static {
            int[] iArr = new int[o82.g.values().length];
            try {
                iArr[o82.g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o82.g.f130851d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o82.g.f130853f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o82.g.f130856i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f81164a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0306  */
    /* JADX WARN: Code duplicated, block: B:148:0x030d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0362  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:163:0x03df  */
    public static final void a(final x01.e eVar, final i21.d dVar, final fe feVar, final b63.o oVar, final o82.g gVar, final i21.c cVar, final boolean z14, final x01.a aVar, final NutritionActivity.g gVar2, final e23.p pVar, final e23.p pVar2, final e23.r rVar, final e23.r rVar2, final e23.r rVar3, final e23.a aVar2, final e23.a aVar3, final e23.a aVar4, final e23.a aVar5, p3.m mVar, final int i14) {
        o0 o0Var;
        ne.a aVar6;
        Context context;
        boolean zB;
        Object objQ;
        ArrayList arrayList;
        Object objQ2;
        Object objQ3;
        eVar.getClass();
        dVar.getClass();
        feVar.getClass();
        cVar.getClass();
        pVar.getClass();
        pVar2.getClass();
        rVar.getClass();
        rVar2.getClass();
        rVar3.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        o0 o0VarE = mVar.E(-670008107);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(eVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(feVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(oVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.k(gVar.ordinal()) ? 16384 : 8192;
        }
        int i16 = 196608 & i14;
        char c14 = Ascii.MIN;
        if (i16 == 0) {
            i15 |= o0VarE.r(cVar) ? 131072 : 65536;
        }
        int i17 = 1572864 & i14;
        char c15 = Ascii.MIN;
        if (i17 == 0) {
            i15 |= o0VarE.h(z14) ? 1048576 : 524288;
        }
        int i18 = i14 & 12582912;
        char c16 = Ascii.MIN;
        if (i18 == 0) {
            i15 |= o0VarE.r(aVar) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i15 |= o0VarE.r(gVar2) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i15 |= o0VarE.r(pVar) ? 536870912 : 268435456;
        }
        int i19 = (o0VarE.r(pVar2) ? (char) 4 : (char) 2) | (o0VarE.r(rVar) ? ' ' : (char) 16) | (o0VarE.r(rVar2) ? 256 : 128) | (o0VarE.r(rVar3) ? (char) 2048 : (char) 1024) | (o0VarE.r(aVar2) ? (char) 16384 : (char) 8192);
        if (o0VarE.r(aVar3)) {
            c14 = 0;
        }
        int i24 = i19 | c14;
        if (o0VarE.r(aVar4)) {
            c15 = 0;
        }
        int i25 = i24 | c15;
        if (o0VarE.r(aVar5)) {
            c16 = 0;
        }
        if (o0VarE.n(i15 & 1, ((i15 & 306783379) == 306783378 && (4793491 & (i25 | c16)) == 4793490) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ4 = o0VarE.q();
            p3.m.a aVar7 = p3.m.f135153a;
            aVar7.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                n82.f.a aVar8 = new n82.f.a(gVar, dVar.H4(gVar), oVar);
                o0VarE.K(aVar8);
                objQ4 = aVar8;
            }
            o82.g gVar3 = o82.g.f130850c;
            o13.p pVar3 = new o13.p(gVar3, oVar);
            o82.g gVar4 = o82.g.f130851d;
            o13.p pVar4 = new o13.p(gVar4, oVar);
            o82.g gVar5 = o82.g.f130853f;
            o13.p pVar5 = new o13.p(gVar5, oVar);
            o82.g gVar6 = o82.g.f130856i;
            n82.f fVarA = n82.j.a((n82.f.a) objQ4, n82.h.a(new o13.p[]{pVar3, pVar4, pVar5, new o13.p(gVar6, oVar)}, o0VarE), o0VarE, 0);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = (v21.e) KoinJavaComponent.get$default(v21.e.class, null, null, 6, null);
                o0VarE.K(objQ5);
            }
            v21.e eVar2 = (v21.e) objQ5;
            x1 x1Var2 = p3.n.f135158a;
            o0VarE.C(280825064);
            long jA = ((g6.c) o0VarE.A(t1.f91490h)).A(g6.n.c(((h4) o0VarE.A(t1.f91503u)).b()));
            o0VarE.f();
            List<Integer> list = ne.a.f125414c;
            j3.c.f96824a.getClass();
            Set<g6.f> set = j3.c.f96825b;
            j3.b.f96822a.getClass();
            Set<g6.f> set2 = j3.b.f96823b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set) {
                n82.f fVar = fVarA;
                v21.e eVar3 = eVar2;
                long j8 = jA;
                if (g6.f.b(g6.h.c(j8), ((g6.f) obj).f75997a) >= 0) {
                    arrayList2.add(obj);
                }
                fVarA = fVar;
                eVar2 = eVar3;
                jA = j8;
            }
            final n82.f fVar2 = fVarA;
            final v21.e eVar4 = eVar2;
            long j14 = jA;
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                float fMax = ((g6.f) it.next()).f75997a;
                while (it.hasNext()) {
                    fMax = Math.max(fMax, ((g6.f) it.next()).f75997a);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : set2) {
                    if (g6.f.b(g6.h.b(j14), ((g6.f) obj2).f75997a) >= 0) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    float fMax2 = ((g6.f) it3.next()).f75997a;
                    while (it3.hasNext()) {
                        fMax2 = Math.max(fMax2, ((g6.f) it3.next()).f75997a);
                    }
                    aVar6 = new ne.a(fMax, fMax2);
                } else {
                    c22.t.g();
                }
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                zB = o0VarE.B(context);
                objQ = o0VarE.q();
                if (zB) {
                    oe.g.f131220a.getClass();
                    r53.b bVarF = r53.s.f(new oe.i(oe.g.a.a(context), context, null));
                    x53.c cVar2 = s0.f129406a;
                    objQ = new j3.a(r53.s.A(bVarF, u53.o.f168762a));
                    o0VarE.K(objQ);
                } else {
                    aVar7.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        oe.g.f131220a.getClass();
                        r53.b bVarF2 = r53.s.f(new oe.i(oe.g.a.a(context), context, null));
                        x53.c cVar3 = s0.f129406a;
                        objQ = new j3.a(r53.s.A(bVarF2, u53.o.f168762a));
                        o0VarE.K(objQ);
                    }
                }
                List<oe.c> list2 = (List) p0.b((r53.i) objQ, j0.f134944a, null, o0VarE, 48, 2).getF182175a();
                arrayList = new ArrayList();
                boolean z15 = false;
                for (oe.c cVar4 : list2) {
                    if (!p005kotlin.jvm.internal.s.g(cVar4.getOrientation(), oe.c.b.f131202c) && p005kotlin.jvm.internal.s.g(cVar4.getState(), oe.c.C2494c.f131205c)) {
                        z15 = true;
                    }
                    arrayList.add(new j3.d(l1.j(cVar4.getBounds()), p005kotlin.jvm.internal.s.g(cVar4.getState(), oe.c.C2494c.f131204b), p005kotlin.jvm.internal.s.g(cVar4.getOrientation(), oe.c.b.f131201b), cVar4.a(), p005kotlin.jvm.internal.s.g(cVar4.b(), oe.c.a.f131199c)));
                }
                j3.e eVar5 = new j3.e(z15, arrayList);
                x1 x1Var3 = p3.n.f135158a;
                j3.f fVar3 = new j3.f(aVar6, eVar5);
                final mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ2);
                }
                final b0 b0Var = (b0) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = i53.a.a(gVar3, gVar4, gVar5, gVar6);
                    o0VarE.K(objQ3);
                }
                final i53.f fVar4 = (i53.f) objQ3;
                boolean z16 = cVar.f87263r;
                n0 n0Var = n3.f22788a;
                n0 n0Var2 = new n0(0, 0, 0, 0);
                z3.e eVarC = z3.f.c(18852912, new ci0.g(z14, gVar2, eVar, aVar4, aVar5, aVar3, aVar2, pVar, context2, aVar), o0VarE);
                z3.e eVarC2 = z3.f.c(1400013199, new ak0.o(feVar, 14), o0VarE);
                final ne.a aVar9 = fVar3.f96834a;
                z02.d.a(z16, eVarC, eVarC2, null, n0Var2, z3.f.c(1248526764, new e23.p() { // from class: h21.o
                    /* JADX WARN: Code duplicated, block: B:38:0x014e  */
                    /* JADX WARN: Code duplicated, block: B:47:0x01f7  */
                    /* JADX WARN: Code duplicated, block: B:54:0x022f  */
                    /* JADX WARN: Code duplicated, block: B:59:0x0256  */
                    @Override // e23.p
                    public final Object invoke(Object obj3, Object obj4) {
                        final i21.d dVar2;
                        final b0 b0Var2;
                        final mc mcVar;
                        p3.m mVar2 = (p3.m) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var4 = p3.n.f135158a;
                            h4.r.a aVar10 = h4.r.S;
                            h4.r rVarA = v2.a(x2.d(aVar10, 1.0f), z14, new fx0.a(23), mVar2, 6);
                            h4.d.f81522a.getClass();
                            h4.g.a aVar11 = h4.d.a.f81537o;
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            c2.z zVarA = c2.y.a(kVar, aVar11, mVar2, 48);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC = h4.k.c(rVarA, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar12 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar12);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar6 = h5.g.a.f81810g;
                            b4.c(eVar6, zVarA, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            h5.g.a.f fVar5 = h5.g.a.f81807d;
                            b4.c(fVar5, rVarC, mVar2);
                            c2.b0 b0Var3 = c2.b0.f22601a;
                            ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), c80.s0.NUTRITION, null, 6);
                            if (lVarU == null) {
                                mVar2.C(-1866459320);
                                mVar2.f();
                            } else {
                                mVar2.C(-1866459319);
                                h4.r rVarF = x2.f(aVar10, 1.0f);
                                c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                                int iHashCode2 = Long.hashCode(mVar2.getU());
                                i2 i2VarX2 = mVar2.x();
                                h4.r rVarC2 = h4.k.c(rVarF, mVar2);
                                if (mVar2.F() == null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar12);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar6, zVarA2, mVar2);
                                b4.c(c1623g, i2VarX2, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                    v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                                }
                                b4.c(fVar5, rVarC2, mVar2);
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                lVarU.a(c2.l.y(aVar10, j92.b.f97899b.f97920e), mVar2, 0);
                                mVar2.y();
                                Unit unit = Unit.INSTANCE;
                                mVar2.f();
                            }
                            final n82.f fVar6 = fVar2;
                            boolean zB2 = mVar2.B(fVar6);
                            final i21.d dVar3 = dVar;
                            boolean zR = zB2 | mVar2.r(dVar3);
                            Object objQ6 = mVar2.q();
                            p3.m.a aVar13 = p3.m.f135153a;
                            if (zR) {
                                objQ6 = new m1(13, fVar6, dVar3);
                                mVar2.K(objQ6);
                            } else {
                                aVar13.getClass();
                                if (objQ6 == p3.m.a.f135155b) {
                                    objQ6 = new m1(13, fVar6, dVar3);
                                    mVar2.K(objQ6);
                                }
                            }
                            o2.a(null, aVar9, fVar6, fVar4, (e23.l) objQ6, mVar2, 3072);
                            h4.r rVarA2 = b0Var3.a(aVar10, 1.0f, true);
                            final x01.e eVar7 = eVar;
                            final v21.e eVar8 = eVar4;
                            final i21.c cVar5 = cVar;
                            final e23.p pVar6 = pVar;
                            final e23.p pVar7 = pVar2;
                            final e23.r rVar4 = rVar;
                            final e23.r rVar5 = rVar2;
                            final e23.r rVar6 = rVar3;
                            final e23.a aVar14 = aVar2;
                            final e23.a aVar15 = aVar3;
                            n82.c.a(rVarA2, fVar6, 3, false, z3.f.c(1045582740, new e23.r() { // from class: h21.q
                                /* JADX WARN: Code duplicated, block: B:30:0x0074  */
                                @Override // e23.r
                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                    int i26;
                                    o82.g gVar7 = (o82.g) obj5;
                                    o82.a aVar16 = (o82.a) obj6;
                                    p3.m mVar3 = (p3.m) obj7;
                                    int iD = vb.h.d((Integer) obj8, gVar7, aVar16);
                                    if ((iD & 6) == 0) {
                                        i26 = (mVar3.k(gVar7.ordinal()) ? 4 : 2) | iD;
                                    } else {
                                        i26 = iD;
                                    }
                                    if ((iD & 48) == 0) {
                                        i26 |= mVar3.B(aVar16) ? 32 : 16;
                                    }
                                    if (mVar3.n(i26 & 1, (i26 & 147) != 146)) {
                                        x1 x1Var5 = p3.n.f135158a;
                                        n82.f fVar7 = fVar6;
                                        boolean zB3 = mVar3.B(fVar7);
                                        int i27 = i26;
                                        i21.d dVar4 = dVar3;
                                        boolean zR2 = zB3 | mVar3.r(dVar4) | ((i27 & 14) == 4);
                                        Object objQ7 = mVar3.q();
                                        if (zR2) {
                                            objQ7 = new s(fVar7, dVar4, gVar7, null);
                                            mVar3.K(objQ7);
                                        } else {
                                            p3.m.f135153a.getClass();
                                            if (objQ7 == p3.m.a.f135155b) {
                                                objQ7 = new s(fVar7, dVar4, gVar7, null);
                                                mVar3.K(objQ7);
                                            }
                                        }
                                        l0.e((e23.p) objQ7, gVar7, mVar3);
                                        int i28 = t.b.f81164a[gVar7.ordinal()];
                                        x01.e eVar9 = eVar7;
                                        v21.e eVar10 = eVar8;
                                        i21.c cVar6 = cVar5;
                                        if (i28 == 1) {
                                            mVar3.C(1853018903);
                                            y.c(aVar16, eVar9, dVar4, fVar7, eVar10, cVar6, pVar6, pVar7, rVar4, rVar5, rVar6, aVar14, aVar15, mVar3, (i27 >> 3) & 14);
                                            mVar3.f();
                                        } else if (i28 == 2 || i28 == 3) {
                                            mVar3.C(1854099191);
                                            dVar4.getClass();
                                            j.e(aVar16, eVar9, dVar4, fVar7, cVar6, i21.d.J4(), eVar10, mVar3, (i27 >> 3) & 14);
                                            mVar3.f();
                                        } else if (i28 != 4) {
                                            mVar3.C(1855169900);
                                            mVar3.f();
                                        } else {
                                            mVar3.C(1854655734);
                                            dVar4.getClass();
                                            a0.e(aVar16, eVar9, dVar4, fVar7, cVar6, i21.d.J4(), eVar10, mVar3, (i27 >> 3) & 14);
                                            mVar3.f();
                                        }
                                    } else {
                                        mVar3.e();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, mVar2), mVar2, 24960, 8);
                            mVar2.y();
                            if (fVar6.f124961b.a() == o82.g.f130850c) {
                                mVar2.C(448186178);
                                t.c(cVar5, dVar3, mVar2, 0);
                                if (cVar5.f87262q != null) {
                                    mVar2.C(448356926);
                                    i21.x xVar = cVar5.f87262q;
                                    i53.c<i21.w> cVar6 = xVar.f87375b;
                                    boolean z17 = xVar.f87374a;
                                    b0 b0Var4 = b0Var;
                                    boolean zR2 = mVar2.r(b0Var4);
                                    mc mcVar2 = mcVarF;
                                    boolean zB3 = zR2 | mVar2.B(mcVar2) | mVar2.r(dVar3);
                                    e23.a aVar16 = aVar4;
                                    boolean zB4 = zB3 | mVar2.B(aVar16);
                                    Object objQ7 = mVar2.q();
                                    if (zB4) {
                                        dVar2 = dVar3;
                                        af0.e eVar9 = new af0.e(dVar2, aVar16, b0Var4, mcVar2, 28);
                                        b0Var2 = b0Var4;
                                        mcVar = mcVar2;
                                        mVar2.K(eVar9);
                                        objQ7 = eVar9;
                                    } else {
                                        aVar13.getClass();
                                        if (objQ7 == p3.m.a.f135155b) {
                                            dVar2 = dVar3;
                                            af0.e eVar10 = new af0.e(dVar2, aVar16, b0Var4, mcVar2, 28);
                                            b0Var2 = b0Var4;
                                            mcVar = mcVar2;
                                            mVar2.K(eVar10);
                                            objQ7 = eVar10;
                                        } else {
                                            b0Var2 = b0Var4;
                                            mcVar = mcVar2;
                                            dVar2 = dVar3;
                                        }
                                    }
                                    e23.a aVar17 = (e23.a) objQ7;
                                    boolean zR3 = mVar2.r(b0Var2) | mVar2.B(mcVar) | mVar2.r(dVar2);
                                    Object objQ8 = mVar2.q();
                                    if (zR3) {
                                        final int i26 = 0;
                                        objQ8 = new e23.a() { // from class: h21.r
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i26) {
                                                    case 0:
                                                        t.b(new l(dVar2, 0), b0Var2, mcVar);
                                                        break;
                                                    default:
                                                        t.b(new l(dVar2, 1), b0Var2, mcVar);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ8);
                                    } else {
                                        aVar13.getClass();
                                        if (objQ8 == p3.m.a.f135155b) {
                                            final int i27 = 0;
                                            objQ8 = new e23.a() { // from class: h21.r
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i27) {
                                                        case 0:
                                                            t.b(new l(dVar2, 0), b0Var2, mcVar);
                                                            break;
                                                        default:
                                                            t.b(new l(dVar2, 1), b0Var2, mcVar);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar2.K(objQ8);
                                        }
                                    }
                                    e23.a aVar18 = (e23.a) objQ8;
                                    boolean zR4 = mVar2.r(b0Var2) | mVar2.B(mcVar) | mVar2.r(dVar2);
                                    Object objQ9 = mVar2.q();
                                    if (zR4) {
                                        final int i28 = 1;
                                        objQ9 = new e23.a() { // from class: h21.r
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i28) {
                                                    case 0:
                                                        t.b(new l(dVar2, 0), b0Var2, mcVar);
                                                        break;
                                                    default:
                                                        t.b(new l(dVar2, 1), b0Var2, mcVar);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ9);
                                    } else {
                                        aVar13.getClass();
                                        if (objQ9 == p3.m.a.f135155b) {
                                            final int i29 = 1;
                                            objQ9 = new e23.a() { // from class: h21.r
                                                @Override // e23.a
                                                public final Object invoke() {
                                                    switch (i29) {
                                                        case 0:
                                                            t.b(new l(dVar2, 0), b0Var2, mcVar);
                                                            break;
                                                        default:
                                                            t.b(new l(dVar2, 1), b0Var2, mcVar);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            mVar2.K(objQ9);
                                        }
                                    }
                                    t.d(mcVar, cVar6, z17, aVar17, aVar18, (e23.a) objQ9, mVar2, 0);
                                    mVar2 = mVar2;
                                    mVar2.f();
                                } else {
                                    mVar2.C(449056534);
                                    mVar2.f();
                                }
                                mVar2.f();
                            } else {
                                mVar2.C(449066454);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0VarE, 197040, 8);
                o0Var = o0VarE;
            } else {
                c22.t.g();
            }
            aVar6 = null;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            zB = o0VarE.B(context);
            objQ = o0VarE.q();
            if (zB) {
                aVar7.getClass();
                if (objQ == p3.m.a.f135155b) {
                    oe.g.f131220a.getClass();
                    r53.b bVarF3 = r53.s.f(new oe.i(oe.g.a.a(context), context, null));
                    x53.c cVar5 = s0.f129406a;
                    objQ = new j3.a(r53.s.A(bVarF3, u53.o.f168762a));
                    o0VarE.K(objQ);
                }
            } else {
                oe.g.f131220a.getClass();
                r53.b bVarF4 = r53.s.f(new oe.i(oe.g.a.a(context), context, null));
                x53.c cVar6 = s0.f129406a;
                objQ = new j3.a(r53.s.A(bVarF4, u53.o.f168762a));
                o0VarE.K(objQ);
            }
            List<oe.c> list3 = (List) p0.b((r53.i) objQ, j0.f134944a, null, o0VarE, 48, 2).getF182175a();
            arrayList = new ArrayList();
            boolean z17 = false;
            while (r7.hasNext()) {
                if (!p005kotlin.jvm.internal.s.g(cVar4.getOrientation(), oe.c.b.f131202c)) {
                }
                arrayList.add(new j3.d(l1.j(cVar4.getBounds()), p005kotlin.jvm.internal.s.g(cVar4.getState(), oe.c.C2494c.f131204b), p005kotlin.jvm.internal.s.g(cVar4.getOrientation(), oe.c.b.f131201b), cVar4.a(), p005kotlin.jvm.internal.s.g(cVar4.b(), oe.c.a.f131199c)));
            }
            j3.e eVar6 = new j3.e(z17, arrayList);
            x1 x1Var4 = p3.n.f135158a;
            j3.f fVar5 = new j3.f(aVar6, eVar6);
            final mc mcVarF2 = e9.f(true, null, o0VarE, 6, 2);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ2);
            }
            final b0 b0Var2 = (b0) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = i53.a.a(gVar3, gVar4, gVar5, gVar6);
                o0VarE.K(objQ3);
            }
            final i53.f fVar6 = (i53.f) objQ3;
            boolean z18 = cVar.f87263r;
            n0 n0Var3 = n3.f22788a;
            n0 n0Var4 = new n0(0, 0, 0, 0);
            z3.e eVarC3 = z3.f.c(18852912, new ci0.g(z14, gVar2, eVar, aVar4, aVar5, aVar3, aVar2, pVar, context2, aVar), o0VarE);
            z3.e eVarC4 = z3.f.c(1400013199, new ak0.o(feVar, 14), o0VarE);
            final ne.a aVar10 = fVar5.f96834a;
            z02.d.a(z18, eVarC3, eVarC4, null, n0Var4, z3.f.c(1248526764, new e23.p() { // from class: h21.o
                /* JADX WARN: Code duplicated, block: B:38:0x014e  */
                /* JADX WARN: Code duplicated, block: B:47:0x01f7  */
                /* JADX WARN: Code duplicated, block: B:54:0x022f  */
                /* JADX WARN: Code duplicated, block: B:59:0x0256  */
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    final i21.d dVar2;
                    final b0 b0Var3;
                    final mc mcVar;
                    p3.m mVar2 = (p3.m) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var5 = p3.n.f135158a;
                        h4.r.a aVar11 = h4.r.S;
                        h4.r rVarA = v2.a(x2.d(aVar11, 1.0f), z14, new fx0.a(23), mVar2, 6);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar12 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        c2.z zVarA = c2.y.a(kVar, aVar12, mVar2, 48);
                        int iHashCode = Long.hashCode(mVar2.getU());
                        i2 i2VarX = mVar2.x();
                        h4.r rVarC = h4.k.c(rVarA, mVar2);
                        h5.g.V.getClass();
                        e0.a aVar13 = h5.g.a.f81805b;
                        if (mVar2.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar13);
                        } else {
                            mVar2.c();
                        }
                        h5.g.a.e eVar7 = h5.g.a.f81810g;
                        b4.c(eVar7, zVarA, mVar2);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX, mVar2);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar2, iHashCode, bVar);
                        }
                        h5.g.a.f fVar7 = h5.g.a.f81807d;
                        b4.c(fVar7, rVarC, mVar2);
                        c2.b0 b0Var4 = c2.b0.f22601a;
                        ub1.l lVarU = g1.u((g1) KoinJavaComponent.get$default(g1.class, null, null, 6, null), c80.s0.NUTRITION, null, 6);
                        if (lVarU == null) {
                            mVar2.C(-1866459320);
                            mVar2.f();
                        } else {
                            mVar2.C(-1866459319);
                            h4.r rVarF = x2.f(aVar11, 1.0f);
                            c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            i2 i2VarX2 = mVar2.x();
                            h4.r rVarC2 = h4.k.c(rVarF, mVar2);
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar13);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar7, zVarA2, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                            }
                            b4.c(fVar7, rVarC2, mVar2);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            lVarU.a(c2.l.y(aVar11, j92.b.f97899b.f97920e), mVar2, 0);
                            mVar2.y();
                            Unit unit = Unit.INSTANCE;
                            mVar2.f();
                        }
                        final n82.f fVar8 = fVar2;
                        boolean zB2 = mVar2.B(fVar8);
                        final i21.d dVar3 = dVar;
                        boolean zR = zB2 | mVar2.r(dVar3);
                        Object objQ6 = mVar2.q();
                        p3.m.a aVar14 = p3.m.f135153a;
                        if (zR) {
                            objQ6 = new m1(13, fVar8, dVar3);
                            mVar2.K(objQ6);
                        } else {
                            aVar14.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                objQ6 = new m1(13, fVar8, dVar3);
                                mVar2.K(objQ6);
                            }
                        }
                        o2.a(null, aVar10, fVar8, fVar6, (e23.l) objQ6, mVar2, 3072);
                        h4.r rVarA2 = b0Var4.a(aVar11, 1.0f, true);
                        final x01.e eVar8 = eVar;
                        final v21.e eVar9 = eVar4;
                        final i21.c cVar7 = cVar;
                        final e23.p pVar6 = pVar;
                        final e23.p pVar7 = pVar2;
                        final e23.r rVar4 = rVar;
                        final e23.r rVar5 = rVar2;
                        final e23.r rVar6 = rVar3;
                        final e23.a aVar15 = aVar2;
                        final e23.a aVar16 = aVar3;
                        n82.c.a(rVarA2, fVar8, 3, false, z3.f.c(1045582740, new e23.r() { // from class: h21.q
                            /* JADX WARN: Code duplicated, block: B:30:0x0074  */
                            @Override // e23.r
                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i26;
                                o82.g gVar7 = (o82.g) obj5;
                                o82.a aVar17 = (o82.a) obj6;
                                p3.m mVar3 = (p3.m) obj7;
                                int iD = vb.h.d((Integer) obj8, gVar7, aVar17);
                                if ((iD & 6) == 0) {
                                    i26 = (mVar3.k(gVar7.ordinal()) ? 4 : 2) | iD;
                                } else {
                                    i26 = iD;
                                }
                                if ((iD & 48) == 0) {
                                    i26 |= mVar3.B(aVar17) ? 32 : 16;
                                }
                                if (mVar3.n(i26 & 1, (i26 & 147) != 146)) {
                                    x1 x1Var6 = p3.n.f135158a;
                                    n82.f fVar9 = fVar8;
                                    boolean zB3 = mVar3.B(fVar9);
                                    int i27 = i26;
                                    i21.d dVar4 = dVar3;
                                    boolean zR2 = zB3 | mVar3.r(dVar4) | ((i27 & 14) == 4);
                                    Object objQ7 = mVar3.q();
                                    if (zR2) {
                                        objQ7 = new s(fVar9, dVar4, gVar7, null);
                                        mVar3.K(objQ7);
                                    } else {
                                        p3.m.f135153a.getClass();
                                        if (objQ7 == p3.m.a.f135155b) {
                                            objQ7 = new s(fVar9, dVar4, gVar7, null);
                                            mVar3.K(objQ7);
                                        }
                                    }
                                    l0.e((e23.p) objQ7, gVar7, mVar3);
                                    int i28 = t.b.f81164a[gVar7.ordinal()];
                                    x01.e eVar10 = eVar8;
                                    v21.e eVar11 = eVar9;
                                    i21.c cVar8 = cVar7;
                                    if (i28 == 1) {
                                        mVar3.C(1853018903);
                                        y.c(aVar17, eVar10, dVar4, fVar9, eVar11, cVar8, pVar6, pVar7, rVar4, rVar5, rVar6, aVar15, aVar16, mVar3, (i27 >> 3) & 14);
                                        mVar3.f();
                                    } else if (i28 == 2 || i28 == 3) {
                                        mVar3.C(1854099191);
                                        dVar4.getClass();
                                        j.e(aVar17, eVar10, dVar4, fVar9, cVar8, i21.d.J4(), eVar11, mVar3, (i27 >> 3) & 14);
                                        mVar3.f();
                                    } else if (i28 != 4) {
                                        mVar3.C(1855169900);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(1854655734);
                                        dVar4.getClass();
                                        a0.e(aVar17, eVar10, dVar4, fVar9, cVar8, i21.d.J4(), eVar11, mVar3, (i27 >> 3) & 14);
                                        mVar3.f();
                                    }
                                } else {
                                    mVar3.e();
                                }
                                return Unit.INSTANCE;
                            }
                        }, mVar2), mVar2, 24960, 8);
                        mVar2.y();
                        if (fVar8.f124961b.a() == o82.g.f130850c) {
                            mVar2.C(448186178);
                            t.c(cVar7, dVar3, mVar2, 0);
                            if (cVar7.f87262q != null) {
                                mVar2.C(448356926);
                                i21.x xVar = cVar7.f87262q;
                                i53.c<i21.w> cVar8 = xVar.f87375b;
                                boolean z19 = xVar.f87374a;
                                b0 b0Var5 = b0Var2;
                                boolean zR2 = mVar2.r(b0Var5);
                                mc mcVar2 = mcVarF2;
                                boolean zB3 = zR2 | mVar2.B(mcVar2) | mVar2.r(dVar3);
                                e23.a aVar17 = aVar4;
                                boolean zB4 = zB3 | mVar2.B(aVar17);
                                Object objQ7 = mVar2.q();
                                if (zB4) {
                                    dVar2 = dVar3;
                                    af0.e eVar10 = new af0.e(dVar2, aVar17, b0Var5, mcVar2, 28);
                                    b0Var3 = b0Var5;
                                    mcVar = mcVar2;
                                    mVar2.K(eVar10);
                                    objQ7 = eVar10;
                                } else {
                                    aVar14.getClass();
                                    if (objQ7 == p3.m.a.f135155b) {
                                        dVar2 = dVar3;
                                        af0.e eVar11 = new af0.e(dVar2, aVar17, b0Var5, mcVar2, 28);
                                        b0Var3 = b0Var5;
                                        mcVar = mcVar2;
                                        mVar2.K(eVar11);
                                        objQ7 = eVar11;
                                    } else {
                                        b0Var3 = b0Var5;
                                        mcVar = mcVar2;
                                        dVar2 = dVar3;
                                    }
                                }
                                e23.a aVar18 = (e23.a) objQ7;
                                boolean zR3 = mVar2.r(b0Var3) | mVar2.B(mcVar) | mVar2.r(dVar2);
                                Object objQ8 = mVar2.q();
                                if (zR3) {
                                    final int i27 = 0;
                                    objQ8 = new e23.a() { // from class: h21.r
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i27) {
                                                case 0:
                                                    t.b(new l(dVar2, 0), b0Var3, mcVar);
                                                    break;
                                                default:
                                                    t.b(new l(dVar2, 1), b0Var3, mcVar);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ8);
                                } else {
                                    aVar14.getClass();
                                    if (objQ8 == p3.m.a.f135155b) {
                                        final int i28 = 0;
                                        objQ8 = new e23.a() { // from class: h21.r
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i28) {
                                                    case 0:
                                                        t.b(new l(dVar2, 0), b0Var3, mcVar);
                                                        break;
                                                    default:
                                                        t.b(new l(dVar2, 1), b0Var3, mcVar);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ8);
                                    }
                                }
                                e23.a aVar19 = (e23.a) objQ8;
                                boolean zR4 = mVar2.r(b0Var3) | mVar2.B(mcVar) | mVar2.r(dVar2);
                                Object objQ9 = mVar2.q();
                                if (zR4) {
                                    final int i29 = 1;
                                    objQ9 = new e23.a() { // from class: h21.r
                                        @Override // e23.a
                                        public final Object invoke() {
                                            switch (i29) {
                                                case 0:
                                                    t.b(new l(dVar2, 0), b0Var3, mcVar);
                                                    break;
                                                default:
                                                    t.b(new l(dVar2, 1), b0Var3, mcVar);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    mVar2.K(objQ9);
                                } else {
                                    aVar14.getClass();
                                    if (objQ9 == p3.m.a.f135155b) {
                                        final int i210 = 1;
                                        objQ9 = new e23.a() { // from class: h21.r
                                            @Override // e23.a
                                            public final Object invoke() {
                                                switch (i210) {
                                                    case 0:
                                                        t.b(new l(dVar2, 0), b0Var3, mcVar);
                                                        break;
                                                    default:
                                                        t.b(new l(dVar2, 1), b0Var3, mcVar);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        mVar2.K(objQ9);
                                    }
                                }
                                t.d(mcVar, cVar8, z19, aVar18, aVar19, (e23.a) objQ9, mVar2, 0);
                                mVar2 = mVar2;
                                mVar2.f();
                            } else {
                                mVar2.C(449056534);
                                mVar2.f();
                            }
                            mVar2.f();
                        } else {
                            mVar2.C(449066454);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), o0VarE, 197040, 8);
            o0Var = o0VarE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: h21.p
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iT = p0.t(i14 | 1);
                    t.a(eVar, dVar, feVar, oVar, gVar, cVar, z14, aVar, gVar2, pVar, pVar2, rVar, rVar2, rVar3, aVar2, aVar3, aVar4, aVar5, (p3.m) obj3, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(e23.a aVar, b0 b0Var, mc mcVar) {
        ge1.b.T(b0Var, null, null, new a(mcVar, null), 3).J(new n(mcVar, aVar, 0));
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    public static final void c(i21.c cVar, i21.d dVar, p3.m mVar, int i14) {
        boolean z14;
        o0 o0VarE = mVar.E(1559878585);
        int i15 = 2;
        int i16 = (o0VarE.r(cVar) ? 4 : 2) | i14 | (o0VarE.r(dVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z15 = cVar.f87260o;
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                o0VarE.C(-1203023419);
                g82.c cVar2 = g82.c.f76436a;
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_nutrition_guidance_pregnancy);
                String strQ2 = gl1.y.Q(o0VarE, R.string.msg_nutrition_guidance_pregnancy);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_change_my_goal);
                String strQ4 = gl1.y.Q(o0VarE, R.string.common_button_not_now);
                boolean zR = o0VarE.r(dVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new l(dVar, i15);
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new l(dVar, i15);
                        o0VarE.K(objQ);
                    }
                }
                e23.a aVar2 = (e23.a) objQ;
                boolean zR2 = o0VarE.r(dVar);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new l(dVar, 3);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l(dVar, 3);
                        o0VarE.K(objQ2);
                    }
                }
                e23.a aVar3 = (e23.a) objQ2;
                Object objQ3 = o0VarE.q();
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new go1.j(16);
                    o0VarE.K(objQ3);
                }
                z14 = false;
                cVar2.c(null, strQ, strQ2, 0, strQ3, aVar2, strQ4, aVar3, false, (e23.a) objQ3, o0VarE, 905969664, 9);
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(-1202521591);
                o0VarE.g0(false);
            }
            if (cVar.f87261p) {
                o0VarE.C(-1202442758);
                g82.c cVar3 = g82.c.f76436a;
                String strQ5 = gl1.y.Q(o0VarE, R.string.lbl_time_for_checkin);
                String strQ6 = gl1.y.Q(o0VarE, R.string.msg_time_for_checkin);
                String strQ7 = gl1.y.Q(o0VarE, R.string.lbl_review_my_goal);
                String strQ8 = gl1.y.Q(o0VarE, R.string.common_button_not_now);
                boolean zR3 = o0VarE.r(dVar);
                Object objQ4 = o0VarE.q();
                if (zR3) {
                    objQ4 = new l(dVar, 4);
                    o0VarE.K(objQ4);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new l(dVar, 4);
                        o0VarE.K(objQ4);
                    }
                }
                e23.a aVar4 = (e23.a) objQ4;
                boolean zR4 = o0VarE.r(dVar);
                Object objQ5 = o0VarE.q();
                if (zR4) {
                    objQ5 = new l(dVar, 5);
                    o0VarE.K(objQ5);
                } else {
                    aVar.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        objQ5 = new l(dVar, 5);
                        o0VarE.K(objQ5);
                    }
                }
                e23.a aVar5 = (e23.a) objQ5;
                Object objQ6 = o0VarE.q();
                aVar.getClass();
                if (objQ6 == p3.m.a.f135155b) {
                    objQ6 = new go1.j(17);
                    o0VarE.K(objQ6);
                }
                cVar3.c(null, strQ5, strQ6, 0, strQ7, aVar4, strQ8, aVar5, false, (e23.a) objQ6, o0VarE, 905969664, 9);
                o0VarE.g0(z14);
            } else {
                o0VarE.C(-1201961111);
                o0VarE.g0(z14);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g80.e(cVar, dVar, i14, 10);
        }
    }

    public static final void d(mc mcVar, i53.c cVar, boolean z14, e23.a aVar, e23.a aVar2, e23.a aVar3, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1020358802);
        int i15 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.r(cVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 16384 : 8192) | (o0VarE.r(aVar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            l72.w wVar = l72.w.f111301a;
            h21.b.f81034a.getClass();
            wVar.c(h21.b.f81035b, null, aVar3, mcVar, null, null, z3.f.c(-2132627628, new m(cVar, z14, aVar, aVar2, 0), o0VarE), o0VarE, ((i15 << 9) & 7168) | ((i15 >> 9) & 896) | 1572870, 50);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ck0.h(mcVar, cVar, z14, aVar, aVar2, aVar3, i14, 9);
        }
    }
}
