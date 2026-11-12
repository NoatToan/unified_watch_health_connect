package k11;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.b0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.f0;
import l72.j0;
import o4.m1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import r1.c0;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(mc mcVar, l11.h hVar, l11.k kVar, e23.a aVar, e23.l lVar, p3.m mVar, int i14) {
        o0 o0Var;
        l11.k kVar2;
        int i15;
        l11.k kVar3;
        Object pVar;
        p1 p1Var;
        l11.k kVar4;
        Object oVar;
        p1 p1Var2;
        l11.k kVar5;
        p1 p1Var3;
        l11.k kVar6;
        mcVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1904562382);
        int i16 = 16;
        int i17 = i14 | (o0VarE.B(mcVar) ? 4 : 2) | (o0VarE.B(hVar) ? 32 : 16) | 128 | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(l11.k.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                i15 = i17 & (-897);
                kVar3 = (l11.k) u1VarResolveViewModel;
            } else {
                o0VarE.e();
                i15 = i17 & (-897);
                kVar3 = kVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = p0.c(kVar3.f108178c, o0VarE, 0);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var4 = (p1) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_thank_you_for_sharing);
            Boolean boolValueOf = Boolean.valueOf(((l11.i) p1VarC.getF182175a()).f108169f);
            int i18 = i15 & 7168;
            boolean zB = o0VarE.B(p1VarC) | o0VarE.r(kVar3) | (i18 == 2048) | ((i15 & 57344) == 16384) | o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                p1Var = p1Var4;
                kVar4 = kVar3;
                pVar = new p(kVar4, aVar, lVar, strQ, p1VarC, null);
                o0VarE.K(pVar);
            } else {
                p1Var = p1Var4;
                pVar = objQ2;
                kVar4 = kVar3;
            }
            l0.e((e23.p) pVar, boolValueOf, o0VarE);
            l11.k kVar7 = kVar4;
            int i19 = i15;
            c0.e(((l11.i) p1VarC.getF182175a()).f108170g, null, null, null, null, z3.f.c(-2013679782, new et1.v(kVar4, 28), o0VarE), o0VarE, 196608, 30);
            c0.e(((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, null, z3.f.c(1997224131, new gw1.e(kVar7, i16, aVar, p1Var), o0VarE), o0VarE, 196608, 30);
            boolean zE = mcVar.e();
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(kVar7) | (i18 == 2048);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                p1Var2 = p1Var;
                oVar = new o(p1VarC, p1Var2, kVar7, aVar, 0);
                kVar5 = kVar7;
                o0VarE.K(oVar);
            } else {
                oVar = objQ3;
                p1Var2 = p1Var;
                kVar5 = kVar7;
            }
            c.w.a(0, 0, (e23.a) oVar, o0VarE, zE);
            l72.w wVar = l72.w.f111301a;
            b.f102183a.getClass();
            z3.e eVar = b.f102184b;
            p1 p1Var5 = p1Var2;
            l11.k kVar8 = kVar5;
            z3.e eVarC = z3.f.c(1897426409, new jj2.c(p1VarC, kVar8, aVar, p1Var5, 7), o0VarE);
            boolean zB3 = o0VarE.B(p1VarC) | o0VarE.r(kVar8) | (i18 == 2048);
            Object objQ4 = o0VarE.q();
            if (zB3 || objQ4 == c2565a) {
                p1Var3 = p1VarC;
                objQ4 = new o(p1Var3, p1Var5, kVar8, aVar, 1);
                kVar6 = kVar8;
                o0VarE.K(objQ4);
            } else {
                kVar6 = kVar8;
                p1Var3 = p1VarC;
            }
            wVar.c(eVar, eVarC, (e23.a) objQ4, mcVar, null, null, z3.f.c(-1494345996, new gw1.e(kVar6, 17, hVar, p1Var3), o0VarE), o0VarE, ((i19 << 9) & 7168) | 1572918, 48);
            o0Var = o0VarE;
            kVar2 = kVar6;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            kVar2 = kVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ix.h(mcVar, hVar, kVar2, aVar, lVar, i14, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(p1 p1Var, p1 p1Var2, l11.k kVar, e23.a aVar) {
        if (((l11.i) p1Var.getF182175a()).f108168e) {
            p1Var2.setValue(Boolean.TRUE);
        } else {
            kVar.f108177b.k(null, new l11.i(null, null, null, false, false, false, false, 127, null));
            aVar.invoke();
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01c6  */
    public static final void c(h4.r rVar, List list, String str, e23.l lVar, p3.m mVar, int i14) {
        String str2;
        h4.r rVar2;
        e23.l lVar2 = lVar;
        o0 o0VarE = mVar.E(-650303926);
        int i15 = i14 | 6 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.B(str) ? 256 : 128) | (o0VarE.r(lVar2) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            rVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
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
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarA = c2.l.A(rVar2, eVar.f97920e, 0.0f, 2);
            bVar2.getClass();
            h4.r rVarC2 = c2.l.C(rVarA, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            String strQ = gl1.y.Q(o0VarE, R.string.whats_wrong_with_this_food_question);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(rVar2, eVar.f97920e, 0.0f, 2);
            bVar2.getClass();
            h4.r rVarC3 = c2.l.C(rVarA2, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j11.a aVar2 = (j11.a) it.next();
                boolean z14 = d53.w.z(str, aVar2.name(), false);
                context.getClass();
                String string = context.getString(aVar2.f96410a);
                string.getClass();
                arrayList.add(new j0(string, string, null, false, z14, 12, null));
            }
            str2 = str;
            i53.c cVarE = i53.a.e(arrayList);
            f82.b bVar3 = new f82.b();
            boolean zR = o0VarE.r(list) | ((i15 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                lVar2 = lVar;
                objQ = new c42.e0(lVar2, list);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    lVar2 = lVar;
                    objQ = new c42.e0(lVar2, list);
                    o0VarE.K(objQ);
                } else {
                    lVar2 = lVar;
                }
            }
            e82.a.a(cVarE, rVarC3, bVar3, (e23.p) objQ, o0VarE, 0, 0);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            str2 = str;
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(rVar2, list, str2, lVar2, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x011d  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    /* JADX WARN: Code duplicated, block: B:69:0x019c  */
    public static final void d(h4.r rVar, l11.i iVar, e23.l lVar, e23.l lVar2, e23.a aVar, p3.m mVar, int i14) {
        h4.r rVar2;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(113286008);
        int i15 = i14 | 6 | (o0VarE.r(iVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            h4.r.a aVar2 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(c2.l.p(aVar2), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
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
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            c2.l.f(c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), o0VarE);
            List<j11.a> list = iVar.f108164a;
            String str = iVar.f108165b;
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z14) {
                objQ = new fb0.d(lVar, 28);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fb0.d(lVar, 28);
                    o0VarE.K(objQ);
                }
            }
            c(null, list, str, (e23.l) objQ, o0VarE, 0);
            bVar2.getClass();
            c2.l.f(c2.l.C(aVar2, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), o0VarE);
            String str2 = iVar.f108166c;
            boolean z15 = (i15 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new fb0.d(lVar2, 29);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new fb0.d(lVar2, 29);
                    o0VarE.K(objQ2);
                }
            }
            e(null, str2, (e23.l) objQ2, o0VarE, 0);
            f0 f0Var = f0.f110999a;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            bVar2.getClass();
            h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
            String strQ = gl1.y.Q(o0VarE, R.string.common_send);
            boolean z16 = iVar.f108167d;
            boolean z17 = (i15 & 57344) == 16384;
            Object objQ3 = o0VarE.q();
            if (z17) {
                objQ3 = new j22.d(aVar, 19);
                o0VarE.K(objQ3);
            } else {
                aVar4.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new j22.d(aVar, 19);
                    o0VarE.K(objQ3);
                }
            }
            f0Var.d(0, 1, (e23.a) objQ3, rVarY, strQ, o0VarE, null, z16);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = aVar2;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(rVar2, iVar, lVar, lVar2, aVar, i14, 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:64:0x024e  */
    public static final void e(h4.r rVar, String str, e23.l lVar, p3.m mVar, int i14) {
        h4.r rVar2;
        int i15;
        o0 o0VarE = mVar.E(-209573461);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | 6 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            c2.z zVarA = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.additional_feedback_optional);
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            float f15 = eVar2.f97920e;
            h4.r rVarA = c2.l.A(aVar, f14, 0.0f, 2);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(strQ, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, o0VarE), o0VarE, 0, 0, 131068);
            h4.r rVarF = x2.f(aVar, 1.0f);
            bVar2.getClass();
            h4.r rVarE = u1.n.e(c2.l.A(rVarF, 0.0f, eVar2.f97918c, 1), ds.e0.w(o0VarE), m1.f128891a);
            c2.z zVarA2 = c2.y.a(kVar, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarE, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ2 = gl1.y.Q(o0VarE, R.string.add_feedback);
            boolean z14 = (i16 & 896) == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (z14) {
                i15 = 0;
                objQ = new n(lVar, i15);
                o0VarE.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    i15 = 0;
                    objQ = new n(lVar, i15);
                    o0VarE.K(objQ);
                } else {
                    i15 = 0;
                }
            }
            l72.p1.a(str, null, strQ2, 500, false, false, null, 0L, null, null, null, null, null, (e23.l) objQ, o0VarE, ((i16 >> 3) & 14) | 27648, 0, 16354);
            o0VarE.g0(true);
            String strP = gl1.y.P(R.string.x_of_y_characters, new Object[]{Integer.valueOf(str != null ? str.length() : 0), 500}, o0VarE);
            String strP2 = gl1.y.P(R.string.string_slash_string_no_space_pattern, new Object[]{Integer.valueOf(str != null ? str.length() : 0), 500}, o0VarE);
            bVar2.getClass();
            h4.r rVarA2 = c2.l.A(aVar, f15, 0.0f, 2);
            boolean zB = o0VarE.B(strP);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new jl0.e(strP, 4);
                o0VarE.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new jl0.e(strP, 4);
                    o0VarE.K(objQ2);
                }
            }
            h4.r rVarC3 = p5.v.c((e23.l) objQ2, rVarA2, false);
            fVar2.getClass();
            x0 x0Var = j92.f.f97933j;
            mh.c(strP2, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            bVar2.getClass();
            c2.l.f(c2.l.C(aVar, 0.0f, eVar2.f97920e, 0.0f, 0.0f, 13), o0VarE);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_add_feedback_disclaimer);
            bVar2.getClass();
            h4.r rVarA3 = c2.l.A(aVar, f15, 0.0f, 2);
            fVar2.getClass();
            mh.c(strQ3, rVarA3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, 0, 0, 131068);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.m(rVar2, str, false, lVar, i14, 3);
        }
    }
}
