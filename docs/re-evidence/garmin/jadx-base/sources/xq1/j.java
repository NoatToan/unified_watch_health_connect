package xq1;

import aa2.q;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.g1;
import b82.k1;
import c2.b0;
import c2.x2;
import c2.z;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.y;
import p3.b4;
import p3.i2;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import w52.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f191931a;

        static {
            int[] iArr = new int[yd1.b.values().length];
            try {
                iArr[yd1.b.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yd1.b.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f191931a = iArr;
        }
    }

    public static final void a(yd1.b bVar, yq1.e eVar, o82.a aVar, n82.f fVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        bVar.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-600512375);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(eVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(aVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(fVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(aVar2) ? 16384 : 8192;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                w13.c cVar = yd1.b.f196759f;
                ArrayList arrayList = new ArrayList(y.r(cVar, 10));
                p13.c.b bVar2 = new p13.c.b();
                while (bVar2.hasNext()) {
                    String string = context.getString(((yd1.b) bVar2.next()).f196760a);
                    string.getClass();
                    arrayList.add(new g1(string, null, null, null, 14, null));
                }
                objQ = i53.a.j(arrayList);
                o0VarE.K(objQ);
            }
            i53.f fVar2 = (i53.f) objQ;
            int i17 = a.f191931a[bVar.ordinal()];
            if (i17 == 1) {
                o0VarE.C(-1566759257);
                u82.e.b(aVar, eVar.f198809j, null, false, z3.f.c(1667789153, new q(14, aVar2, fVar2, bVar, eVar, aVar, fVar), o0VarE), o0VarE, ((i16 >> 6) & 14) | 24576, 12);
                o0VarE.g0(false);
            } else {
                if (i17 != 2) {
                    throw kg.f.h(o0VarE, -1566760560, false);
                }
                o0VarE.C(-1566726218);
                u82.e.b(aVar, eVar.f198810k, null, false, z3.f.c(-405654262, new v70.a(fVar2, bVar, eVar, aVar, aVar2), o0VarE), o0VarE, ((i16 >> 6) & 14) | 24576, 12);
                o0VarE.g0(false);
            }
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j0(bVar, eVar, aVar, fVar, aVar2, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e3  */
    public static final void b(i53.f fVar, yd1.b bVar, e23.l lVar, z3.e eVar, p3.m mVar, int i14) {
        z3.e eVar2;
        o0 o0VarE = mVar.E(727138183);
        int i15 = i14 | (o0VarE.B(fVar) ? 4 : 2) | (o0VarE.k(bVar.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarF = x2.f(aVar, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarF, o0VarE);
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar3 = d92.b.f58625c;
            bVar3.getClass();
            j92.e eVar3 = j92.b.f97899b;
            float f14 = eVar3.f97920e;
            bVar3.getClass();
            r rVarZ = c2.l.z(aVar, f14, eVar3.f97918c);
            boolean z14 = false;
            int iOrdinal = bVar.ordinal();
            if ((i15 & 896) == 256) {
                z14 = true;
            }
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new wr1.d(lVar, 5);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new wr1.d(lVar, 5);
                    o0VarE.K(objQ);
                }
            }
            k1.a(fVar, iOrdinal, rVarZ, null, 0.0f, (e23.l) objQ, o0VarE, 3072 | (i15 & 14), 16);
            eVar2 = eVar;
            b71.i.n(6, eVar2, o0VarE, true);
        } else {
            eVar2 = eVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.q(fVar, bVar, lVar, eVar2, i14, 1);
        }
    }
}
