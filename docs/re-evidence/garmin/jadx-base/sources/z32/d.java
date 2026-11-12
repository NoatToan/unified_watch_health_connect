package z32;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import g6.o;
import gl1.y;
import h4.r;
import j53.l;
import java.util.List;
import kotlin.t1;
import m92.c0;
import m92.h0;
import n92.g;
import n92.i;
import n92.j;
import o13.p;
import o4.d0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.s0;
import s5.x0;
import w5.q;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final q71.e eVar, final q71.c cVar, final r rVar, float f14, float f15, int i14, float f16, m mVar, final int i15) {
        int i16;
        o0 o0Var;
        final float f17;
        final float f18;
        final int i17;
        final float f19;
        i53.c<h0.e.a> cVar2;
        i53.c cVarB;
        List listB;
        o0 o0VarE = mVar.E(-1949231955);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.k(eVar == null ? -1 : eVar.ordinal()) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        int i18 = i16 | 1797120;
        if (o0VarE.n(i18 & 1, (599187 & i18) != 599186)) {
            v32.a aVar = v32.a.f175413a;
            aVar.getClass();
            float f22 = v32.a.f175416d;
            aVar.getClass();
            float f24 = v32.a.f175417e;
            aVar.getClass();
            float f25 = v32.a.f175418f;
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            boolean zB = o0VarE.B(cVar != null ? cVar.f143233a : null);
            Object objQ = o0VarE.q();
            if (zB) {
                if (cVar != null) {
                    cVar2 = cVar.f143233a;
                } else {
                    cVar2 = null;
                }
                objQ = new v32.b(cVar2).e(5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    if (cVar != null) {
                        cVar2 = cVar.f143233a;
                    } else {
                        cVar2 = null;
                    }
                    objQ = new v32.b(cVar2).e(5);
                    o0VarE.K(objQ);
                }
            }
            p pVar = (p) objQ;
            r rVarH = x2.h(x2.f(rVar, 1.0f), f22);
            if (cVar == null || (cVarB = cVar.f143233a) == null) {
                cVarB = l.b();
            }
            gl.c.f77766a.getClass();
            m92.m.d dVar = new m92.m.d(gl.c.a(o0VarE).f(), null);
            long jF = gl.c.a(o0VarE).f();
            Float f26 = cVar != null ? cVar.f143237e : null;
            i53.c<h0.e.a> cVar3 = cVar != null ? cVar.f143233a : null;
            j jVar = !(cVar3 == null || cVar3.isEmpty()) ? new j(new d02.b(), (Float) pVar.f128594a, (Float) pVar.f128595b, 5) : null;
            y3 y3Var = t1.f91493k;
            q.b bVar = (q.b) o0VarE.A(y3Var);
            y3 y3Var2 = t1.f91490h;
            g6.d dVar2 = new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f);
            y3 y3Var3 = t1.f91496n;
            s0 s0Var = new s0(bVar, dVar2, (o) o0VarE.A(y3Var3), 0, 8, null);
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97935l;
            g gVar = new g(sn.a.c(o0VarE), s0Var, d92.c.f(x0Var, o0VarE), null, 8, null);
            if (cVar == null || (listB = cVar.f143235c) == null) {
                listB = l.b();
            }
            List list = listB;
            o82.g gVar2 = cVar != null ? cVar.f143236d : null;
            o82.g gVar3 = o82.g.f130855h;
            boolean z14 = gVar2 != gVar3;
            boolean z15 = (cVar != null ? cVar.f143236d : null) != gVar3;
            s0 s0Var2 = new s0((q.b) o0VarE.A(y3Var), new g6.d(((g6.c) o0VarE.A(y3Var2)).getF75991a(), 1.0f), (o) o0VarE.A(y3Var3), 0, 8, null);
            fVar.getClass();
            o0Var = o0VarE;
            c0.a(rVarH, "", f24, dVar, true, f25, d0.a(jF), cVarB, f26, null, false, y.Q(o0VarE, R.string.common_no_data), new n92.a(jVar, null, gVar, new i(list, z14, z15, s0Var2, d92.c.f(x0Var, o0VarE), null, 0.0f, 0.0f, 224, null), 2, null), null, z3.f.c(1390819761, new vd0.s0(cVar, 22, eVar, context), o0VarE), o0Var, ((i18 >> 6) & 896) | 24624 | ((i18 >> 3) & 458752), 1572864, 44544);
            f17 = f22;
            i17 = 5;
            f18 = f24;
            f19 = f25;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            f17 = f14;
            f18 = f15;
            i17 = i14;
            f19 = f16;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: z32.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.a(eVar, cVar, rVar, f17, f18, i17, f19, (m) obj, p0.t(i15 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
