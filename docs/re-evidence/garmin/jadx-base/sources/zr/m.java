package zr;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import i3.mc;
import l72.w;
import p005kotlin.jvm.internal.s;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import sr.r;
import w52.z0;
import zo1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(PrivacyType privacyType, Integer num, Integer num2, mc mcVar, e23.l lVar, e23.a aVar, p pVar, p3.m mVar, int i14) {
        o0 o0Var;
        Object kVar;
        Context context;
        Integer num3;
        p1 p1Var;
        p1 p1Var2;
        int i15;
        e23.a aVar2 = aVar;
        privacyType.getClass();
        mcVar.getClass();
        lVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-824437858);
        int i16 = (o0VarE.k(privacyType.ordinal()) ? 4 : 2) | i14;
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(num) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(num2) ? 256 : 128;
        }
        int i17 = i16 | (o0VarE.B(mcVar) ? 2048 : 1024) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            x1 x1Var = n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            r rVar = new r(new l22.a(context2));
            if (mcVar.e()) {
                o0VarE.C(2090338432);
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(num);
                    o0VarE.K(objQ);
                }
                p1 p1Var3 = (p1) objQ;
                Object objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(num2);
                    o0VarE.K(objQ2);
                }
                p1 p1Var4 = (p1) objQ2;
                boolean z14 = (s.g((Integer) p1Var3.getF182175a(), num) && s.g((Integer) p1Var4.getF182175a(), num2)) ? false : true;
                Integer num4 = (Integer) p1Var3.getF182175a();
                Integer num5 = (Integer) p1Var4.getF182175a();
                boolean z15 = ((i17 & 112) == 32) | ((i17 & 896) == 256);
                Object objQ3 = o0VarE.q();
                if (z15 || objQ3 == c2565a) {
                    context = context2;
                    num3 = num4;
                    p1Var = p1Var3;
                    p1Var2 = p1Var4;
                    i15 = 131072;
                    kVar = new k(lVar, num, num2, p1Var, p1Var2, null);
                    o0VarE.K(kVar);
                } else {
                    context = context2;
                    kVar = objQ3;
                    num3 = num4;
                    p1Var = p1Var3;
                    p1Var2 = p1Var4;
                    i15 = 131072;
                }
                l0.f(num3, num5, (p) kVar, o0VarE);
                w wVar = w.f111301a;
                a.f206700a.getClass();
                Context context3 = context;
                z3.e eVar = a.f206701b;
                p1 p1Var5 = p1Var2;
                p1 p1Var6 = p1Var;
                aVar2 = aVar;
                z3.e eVarC = z3.f.c(-1797414694, new z0(z14, pVar, lVar, aVar, p1Var6, p1Var5, 3), o0VarE);
                boolean z16 = (458752 & i17) == i15;
                Object objQ4 = o0VarE.q();
                if (z16 || objQ4 == c2565a) {
                    objQ4 = new y0(aVar2, 8);
                    o0VarE.K(objQ4);
                }
                wVar.e(eVar, eVarC, (e23.a) objQ4, mcVar, false, null, z3.f.c(-536953340, new x91.n(rVar, context3, privacyType, p1Var6, p1Var5, 6), o0VarE), o0VarE, (i17 & 7168) | 12582966, 112);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(2095231844);
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z3.d(privacyType, num, num2, mcVar, lVar, aVar2, pVar, i14, 2);
        }
    }
}
