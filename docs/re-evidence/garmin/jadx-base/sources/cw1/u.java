package cw1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import java.text.DecimalFormat;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<b82.j.a> f56221a = p13.x.k(new b82.j.a(bg0.a.b.MILE.toString(), null, null, "mi", false, null, "mile", 54, null), new b82.j.a(bg0.a.b.KILOMETER.toString(), null, null, "km", false, null, "kilometer", 54, null));

    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final h4.r rVar, final boolean z14, final Double d14, final bg0.a.b bVar, final List list, final e23.l lVar, final e23.l lVar2, final double d15, double d16, final e23.l lVar3, final e23.l lVar4, p3.m mVar, final int i14, final int i15) {
        int i16;
        boolean z15;
        List list2;
        int i17;
        final double d17;
        p3.o0 o0Var;
        final bg0.a.b bVar2;
        String strValueOf;
        Object obj;
        int i18;
        int i19;
        final double d18 = d16;
        bVar.getClass();
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        lVar4.getClass();
        p3.o0 o0VarE = mVar.E(-1382265315);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            z15 = z14;
            i16 |= o0VarE.h(z15) ? 32 : 16;
        } else {
            z15 = z14;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(d14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.k(bVar.ordinal()) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            list2 = list;
            i16 |= o0VarE.r(list2) ? 16384 : 8192;
        } else {
            list2 = list;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.r(lVar) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.r(lVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.m(d15) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.m(d18) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.r(lVar3) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(lVar4) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n("");
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            h4.r rVarF = x2.f(rVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (d14 != null) {
                double dDoubleValue = d14.doubleValue();
                strValueOf = dDoubleValue % 1.0d == 0.0d ? String.valueOf((int) dDoubleValue) : String.valueOf(dDoubleValue);
                if (strValueOf == null) {
                    strValueOf = "";
                }
            } else {
                strValueOf = "";
            }
            p1Var.setValue(strValueOf);
            String str = (String) p1Var.getF182175a();
            i53.f fVarJ = i53.a.j(list2);
            String string = bVar.toString();
            x5.v.f188954b.getClass();
            int i24 = x5.v.f188957e;
            boolean z16 = (3670016 & i16) == 1048576;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new a11.b0(lVar2, p1Var, 5);
                o0VarE.K(objQ2);
            }
            e23.l lVar5 = (e23.l) objQ2;
            boolean z17 = ((i16 & 896) == 256) | ((29360128 & i16) == 8388608) | ((234881024 & i16) == 67108864) | ((i17 & 14) == 4) | ((i16 & 7168) == 2048) | ((i16 & 112) == 32) | ((1879048192 & i16) == 536870912);
            Object objQ3 = o0VarE.q();
            if (z17 || objQ3 == c2565a) {
                d18 = d16;
                i18 = i16;
                final boolean z18 = z15;
                obj = new e23.a() { // from class: cw1.s
                    @Override // e23.a
                    public final Object invoke() {
                        double d19 = d15;
                        double d24 = d18;
                        Double d25 = d14;
                        boolean zB = m1.b(d19, d24, d25);
                        lVar4.invoke(Boolean.valueOf(zB));
                        if (zB) {
                            vt1.n nVar = z18 ? vt1.n.OTHER : null;
                            bg0.a.b bVar4 = bVar;
                            bVar4.getClass();
                            lVar3.invoke(new jv1.g(nVar, bVar4 == bg0.a.b.MILE ? gg0.i.MILE : gg0.i.KILOMETER, d25));
                        }
                        return Boolean.valueOf(zB);
                    }
                };
                bVar2 = bVar;
                d17 = d15;
                o0VarE.K(obj);
            } else {
                d17 = d15;
                d18 = d16;
                i18 = i16;
                obj = objQ3;
                bVar2 = bVar;
            }
            e23.a aVar2 = (e23.a) obj;
            boolean z19 = (i18 & 458752) == 131072;
            Object objQ4 = o0VarE.q();
            if (z19 || objQ4 == c2565a) {
                i19 = 2;
                objQ4 = new ci0.f(lVar, 2);
                o0VarE.K(objQ4);
            } else {
                i19 = 2;
            }
            w.a(null, str, fVarJ, lVar5, string, aVar2, (e23.l) objQ4, i24, o0VarE, 12582912);
            o0Var = o0VarE;
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            String str2 = decimalFormat.format(d17);
            String str3 = decimalFormat.format(d18);
            str2.getClass();
            str3.getClass();
            String strP = gl1.y.P(R.string.event_distance_range, new Object[]{str2, str3, bVar2.a(context)}, o0Var);
            String strP2 = gl1.y.P(R.string.event_distance_range, new Object[]{str2, str3, bVar2.b(context)}, o0Var);
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA = c2.l.A(aVar3, j92.b.f97899b.f97920e, 0.0f, i19);
            boolean zB = o0Var.B(strP2);
            Object objQ5 = o0Var.q();
            if (zB || objQ5 == c2565a) {
                objQ5 = new cq.t(strP2, 7);
                o0Var.K(objQ5);
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ5, rVarA, false);
            d92.b.f58624b.getClass();
            mh.c(strP, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0Var), o0Var, 0, 0, 131068);
            o0Var.g0(true);
        } else {
            d17 = d15;
            o0Var = o0VarE;
            bVar2 = bVar;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final double d19 = d18;
            p2VarI0.f135219d = new e23.p() { // from class: cw1.t
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iT = p3.p0.t(i14 | 1);
                    int iT2 = p3.p0.t(i15);
                    u.a(rVar, z14, d14, bVar2, list, lVar, lVar2, d17, d19, lVar3, lVar4, (p3.m) obj2, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
