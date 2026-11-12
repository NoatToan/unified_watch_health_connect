package jy0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.y1;
import c2.x2;
import c22.x0;
import i3.e5;
import i3.mh;
import l72.p2;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;
import v62.h9;
import v62.z4;

/* JADX INFO: loaded from: classes9.dex */
public final class i {
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    public static final void a(Context context, sy0.f fVar, boolean z14, e23.l<? super sy0.f, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        u4.d dVarA;
        context.getClass();
        fVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(948442908);
        int i15 = 2;
        int i16 = i14 | (o0VarE.r(context) ? 4 : 2) | (o0VarE.B(fVar) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        byte b14 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p2 p2Var = p2.f111205a;
            String strA = s20.d.a(context, fVar.f161213c);
            s20.d dVar = s20.d.f156005a;
            double d14 = fVar.f161214d;
            f12.l.f68084a.getClass();
            boolean zY = f12.l.a.a().y();
            dVar.getClass();
            String strD = s20.d.d(context, d14, zY, true);
            if (strD == null) {
                strD = "";
            }
            String str = strD;
            String strE = s20.d.e(context, fVar.f161215e, ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).g(), true, false);
            if (strE == null) {
                strE = "";
            }
            String strG = e5.g(str, "\t\t", strE);
            if (fVar.f161216f) {
                s62.a.f157643a.getClass();
                dVarA = h9.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = z4.a(t62.b.f162798a);
            }
            u4.d dVar2 = dVarA;
            z3.e eVarC = z3.f.c(-971033650, new ik1.c(fVar, 14), o0VarE);
            z3.e eVarC2 = z3.f.c(519535055, new j30.d(z14, i15, b14), o0VarE);
            int i17 = ((i16 & 896) == 256 ? (char) 1 : (char) 0) | ((i16 & 7168) == 2048 ? (char) 1 : (char) 0) | ((i16 & 112) == 32 ? (byte) 1 : (byte) 0);
            Object objQ = o0VarE.q();
            if (i17 == 0) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c.e(z14, lVar, fVar, 5);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new c.e(z14, lVar, fVar, 5);
                o0VarE.K(objQ);
            }
            o0Var = o0VarE;
            p2Var.h(strA, strG, dVar2, null, null, false, z14, eVarC, eVarC2, null, (e23.a) objQ, o0Var, ((i16 << 12) & 3670016) | 113246208, 0, 568);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ad0.g((Object) context, (Object) fVar, z14, (o13.h) lVar, i14, 23);
        }
    }

    public static final void b(i53.c<sy0.f> cVar, sy0.f fVar, e23.l<? super sy0.f, Unit> lVar, p3.m mVar, int i14) {
        Object obj;
        int i15;
        Object obj2;
        o0 o0Var;
        lVar.getClass();
        o0 o0VarE = mVar.E(-275356970);
        if ((i14 & 6) == 0) {
            obj = cVar;
            i15 = (o0VarE.B(obj) ? 4 : 2) | i14;
        } else {
            obj = cVar;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            obj2 = fVar;
            i15 |= o0VarE.B(obj2) ? 32 : 16;
        } else {
            obj2 = fVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            h4.r.a aVar = h4.r.S;
            h4.r rVarD = x2.d(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarD, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
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
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            bVar2.getClass();
            h4.r rVarZ = c2.l.z(aVar, eVar.f97920e, f14);
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.V9);
            d92.b.f58624b.getClass();
            s5.x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarE);
            d6.h.f57752b.getClass();
            mh.c(strW, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB, o0VarE, 0, 0, 130044);
            y1 y1Var = y1.f16902a;
            g gVar = g.MY_COURSES;
            y1Var.c(i53.a.a(gl1.y.Q(o0VarE, gVar.f101700a), gl1.y.Q(o0VarE, g.FAVORITES.f101700a)), gVar.ordinal(), false, false, true, 0L, 0L, z3.f.c(-2048722325, new fb0.b(obj, (Object) context, obj2, (e23.l) lVar, 16), o0VarE), o0VarE, 12607488, 108);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h82.p(cVar, fVar, lVar, i14, 23);
        }
    }
}
