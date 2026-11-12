package cy1;

import a03.n0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b.u;
import b.w;
import by1.i;
import c.p;
import c.q;
import ca0.j1;
import cw1.g0;
import dy1.g;
import e23.l;
import g.h;
import i3.fe;
import lc.m0;
import lc.v;
import p005kotlin.Metadata;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcy1/c;", "Lzx1/a;", "<init>", "()V", "Ldy1/g;", "editPrimaryLiftScreenState", "", "editedExerciseKey", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends zx1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f56798a = new c();

    private c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zx1.a
    public final void a(v vVar, m0 m0Var, fe feVar, m mVar, int i14) {
        o0 o0VarQ = a0.q(vVar, m0Var, mVar, -1859504307);
        int i15 = i14 & 1;
        if (o0VarQ.n(i15, i15 != 0)) {
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarQ.A(AndroidCompositionLocals_androidKt.f6042b);
            p.f22335a.getClass();
            w wVarA = p.a(o0VarQ);
            u onBackPressedDispatcher = wVarA != null ? wVarA.getOnBackPressedDispatcher() : null;
            ey1.a aVarN = zf.b.N(o0VarQ);
            p1 p1VarC = s9.c.c(aVarN.B, o0VarQ);
            Object[] objArr = new Object[0];
            Object objQ = o0VarQ.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new com.google.accompanist.drawablepainter.a(21);
                o0VarQ.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarQ, 48);
            h hVar = new h();
            boolean zR = o0VarQ.r(aVarN) | o0VarQ.B(p1Var);
            Object objQ2 = o0VarQ.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new i(aVarN, p1Var, 1);
                o0VarQ.K(objQ2);
            }
            q qVarC = c.w.c(hVar, (l) objQ2, o0VarQ, 0);
            h hVar2 = new h();
            boolean zR2 = o0VarQ.r(aVarN) | o0VarQ.r(context);
            Object objQ3 = o0VarQ.q();
            if (zR2 || objQ3 == c2565a) {
                objQ3 = new cn1.d(15, aVarN, context);
                o0VarQ.K(objQ3);
            }
            q qVarC2 = c.w.c(hVar2, (l) objQ3, o0VarQ, 0);
            g gVar = (g) p1VarC.getF182175a();
            boolean zR3 = o0VarQ.r(aVarN);
            Object objQ4 = o0VarQ.q();
            int i16 = 2;
            if (zR3 || objQ4 == c2565a) {
                objQ4 = new by1.d(aVarN, 2);
                o0VarQ.K(objQ4);
            }
            e23.p pVar = (e23.p) objQ4;
            boolean zR4 = o0VarQ.r(aVarN);
            Object objQ5 = o0VarQ.q();
            if (zR4 || objQ5 == c2565a) {
                objQ5 = new by1.a(aVarN, 6);
                o0VarQ.K(objQ5);
            }
            l lVar = (l) objQ5;
            boolean zB = o0VarQ.B(p1Var) | o0VarQ.r(aVarN) | o0VarQ.r(context) | o0VarQ.r(qVarC);
            Object objQ6 = o0VarQ.q();
            if (zB || objQ6 == c2565a) {
                n0 n0Var = new n0(aVarN, context, p1Var, qVarC, 20);
                o0VarQ.K(n0Var);
                objQ6 = n0Var;
            }
            l lVar2 = (l) objQ6;
            boolean zR5 = o0VarQ.r(aVarN) | o0VarQ.r(context) | o0VarQ.r(qVarC2);
            Object objQ7 = o0VarQ.q();
            if (zR5 || objQ7 == c2565a) {
                objQ7 = new g0(aVarN, i16, context, qVarC2);
                o0VarQ.K(objQ7);
            }
            e23.a aVar = (e23.a) objQ7;
            boolean zR6 = o0VarQ.r(aVarN) | o0VarQ.r(onBackPressedDispatcher);
            Object objQ8 = o0VarQ.q();
            if (zR6 || objQ8 == c2565a) {
                objQ8 = new j1(21, aVarN, onBackPressedDispatcher);
                o0VarQ.K(objQ8);
            }
            e23.a aVar2 = (e23.a) objQ8;
            boolean zR7 = o0VarQ.r(onBackPressedDispatcher);
            Object objQ9 = o0VarQ.q();
            if (zR7 || objQ9 == c2565a) {
                objQ9 = new ak0.i(onBackPressedDispatcher, 21);
                o0VarQ.K(objQ9);
            }
            xx1.f.a(gVar, pVar, lVar, lVar2, aVar, aVar2, (e23.a) objQ9, o0VarQ, 0);
        } else {
            o0VarQ.e();
        }
        p2 p2VarI0 = o0VarQ.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.u(this, vVar, m0Var, feVar, i14, 2);
        }
    }
}
