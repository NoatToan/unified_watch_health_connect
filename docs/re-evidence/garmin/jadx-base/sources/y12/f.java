package y12;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import e23.l;
import e23.p;
import f4.s;
import java.util.ArrayList;
import kotlin.t1;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import w51.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    @SuppressLint({"MutableCollectionMutableState"})
    public static final void a(ArrayList arrayList, l lVar, e23.a aVar, m mVar, int i14) {
        o0 o0VarP = a0.p(lVar, aVar, mVar, -1271780491);
        int i15 = i14 | (o0VarP.r(arrayList) ? 4 : 2) | (o0VarP.r(lVar) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            float f75992b = ((g6.c) o0VarP.A(t1.f91490h)).getF75992b();
            int i16 = c22.b.e(context) ? 3 : 4;
            w13.c cVar = a.f194024f;
            Object objQ = o0VarP.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            Object obj = objQ;
            if (objQ == c2565a) {
                s sVar = new s();
                sVar.addAll(arrayList);
                o0VarP.K(sVar);
                obj = sVar;
            }
            s sVar2 = (s) obj;
            boolean zR = o0VarP.r(arrayList);
            Object objQ2 = o0VarP.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new b(sVar2, arrayList, null);
                o0VarP.K(objQ2);
            }
            l0.e((p) objQ2, arrayList, o0VarP);
            z02.d.a(false, z3.f.c(1029604794, new n0(aVar, 19), o0VarP), null, null, null, z3.f.c(2026718398, new bn1.f(i16, cVar, lVar, f75992b, sVar2), o0VarP), o0VarP, 196656, 29);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xk1.e(arrayList, lVar, aVar, i14, 7);
        }
    }
}
