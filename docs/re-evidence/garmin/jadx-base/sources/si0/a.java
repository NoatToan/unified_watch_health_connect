package si0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import j70.x;
import lc.u0;
import o70.t;
import oi0.c;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import u4.d;
import yz1.z;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:106:0x0184  */
    public static final void a(r rVar, t tVar, String str, d dVar, String str2, ti0.a aVar, m mVar, int i14) {
        int i15;
        t tVar2;
        o0 o0Var;
        String strJ;
        String strL;
        tVar.getClass();
        str.getClass();
        str2.getClass();
        o0 o0VarE = mVar.E(-322466824);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(tVar.ordinal()) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(dVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.B(str2) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= (262144 & i14) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 131072 : 65536;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (74899 & i16) != 74898)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String str3 = aVar != null ? aVar.f164568b : null;
            x.a aVar2 = x.f97667d;
            Integer num = aVar != null ? aVar.f164572f : null;
            aVar2.getClass();
            x xVarA = x.a.a(num);
            o0VarE.C(-652959018);
            Integer num2 = aVar != null ? aVar.f164571e : null;
            m.a aVar3 = m.f135153a;
            if (str3 == null || num2 == null) {
                strJ = null;
            } else {
                int iIntValue = num2.intValue();
                Object objQ = o0VarE.q();
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new se0.a(5);
                    o0VarE.K(objQ);
                }
                String strB = c.B(str3, (l) objQ, o0VarE);
                String strQ = y.Q(o0VarE, iIntValue);
                Integer numValueOf = xVarA != null ? Integer.valueOf(xVarA.f97673b) : null;
                if (numValueOf == null) {
                    o0VarE.C(1890314022);
                    o0VarE.g0(false);
                    strL = null;
                } else {
                    strL = u0.l(o0VarE, 1890314023, numValueOf, o0VarE, false);
                }
                if (strL == null) {
                    strL = "";
                }
                strJ = c.P(p13.x.k(strB, strQ, strL));
            }
            o0VarE.g0(false);
            if (strJ == null) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -652946013, R.string.no_data_label, o0VarE, false);
            } else {
                o0VarE.C(-652958971);
                o0VarE.g0(false);
            }
            yz1.d dVar2 = aVar != null ? aVar.f164567a : null;
            z zVar = (aVar == null || aVar.f164568b == null) ? z.EMPTY : z.VALID_DATA;
            z zVar2 = zVar;
            e eVarC = f.c(-2077640267, new qy0.d(strJ, str3, aVar, xVarA, 28), o0VarE);
            boolean zR = o0VarE.r(context) | ((i16 & 112) == 32);
            Object objQ2 = o0VarE.q();
            if (zR) {
                tVar2 = tVar;
                objQ2 = new q32.a(tVar2, context, 1);
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    tVar2 = tVar;
                    objQ2 = new q32.a(tVar2, context, 1);
                    o0VarE.K(objQ2);
                } else {
                    tVar2 = tVar;
                }
            }
            o0Var = o0VarE;
            yz1.y.c(rVar, dVar2, str, null, dVar, null, 0.0f, 0, null, 0.0f, null, null, null, null, eVarC, (e23.a) objQ2, zVar2, str2, null, null, o0Var, (i16 & 910) | ((i16 << 3) & 57344), ((i16 << 9) & 29360128) | 24576, 802792);
        } else {
            tVar2 = tVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar, tVar2, str, dVar, str2, (Object) aVar, i14, 8);
        }
    }
}
