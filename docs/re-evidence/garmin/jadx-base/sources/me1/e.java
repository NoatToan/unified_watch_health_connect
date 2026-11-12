package me1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import f2.q0;
import java.util.Comparator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((be1.b) t14).f17738a, ((be1.b) t7).f17738a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    public static final void a(List<be1.b> list, int i14, o oVar, o oVar2, e23.l<? super o, Unit> lVar, p3.m mVar, int i15) {
        oVar.getClass();
        oVar2.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(622239943);
        int i16 = i15 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.r(oVar) ? 256 : 128) | (o0VarE.r(oVar2) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            a10.a aVar = new a10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            boolean zR = o0VarE.r(list) | ((i16 & 112) == 32) | o0VarE.r(oVar) | o0VarE.r(oVar2) | o0VarE.r(aVar) | ((i16 & 57344) == 16384);
            Object objQ = o0VarE.q();
            if (zR) {
                q0 q0Var = new q0(list, i14, oVar, oVar2, aVar, lVar);
                o0VarE.K(q0Var);
                objQ = q0Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    q0 q0Var2 = new q0(list, i14, oVar, oVar2, aVar, lVar);
                    o0VarE.K(q0Var2);
                    objQ = q0Var2;
                }
            }
            e2.c.b(null, null, null, null, null, null, false, null, (e23.l) objQ, o0VarE, 0, 511);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g02.q0(list, i14, oVar, oVar2, lVar, i15, 19);
        }
    }
}
