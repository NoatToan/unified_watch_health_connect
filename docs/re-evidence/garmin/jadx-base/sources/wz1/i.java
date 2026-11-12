package wz1;

import a2.j;
import android.text.TextUtils;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b5.s0;
import e23.l;
import h4.k;
import h4.r;
import java.util.Locale;
import kotlin.k2;
import kotlin.m3;
import kotlin.t1;
import m4.q;
import o4.n0;
import o4.z0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
    public static final r a(l lVar, r rVar, boolean z14) {
        rVar.getClass();
        lVar.getClass();
        return z14 ? (r) lVar.invoke(rVar) : rVar;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x001d  */
    public static final r b(r rVar, e23.a aVar, m mVar) {
        rVar.getClass();
        aVar.getClass();
        x1 x1Var = n.f135158a;
        Unit unit = Unit.INSTANCE;
        boolean zB = mVar.B(aVar);
        Object objQ = mVar.q();
        if (zB) {
            objQ = new d(aVar);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new d(aVar);
                mVar.K(objQ);
            }
        }
        return s0.b(rVar, unit, (PointerInputEventHandler) objQ);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0031  */
    public static final r c(r rVar, m mVar) {
        rVar.getClass();
        x1 x1Var = n.f135158a;
        q qVar = (q) mVar.A(t1.f91491i);
        m3 m3Var = (m3) mVar.A(t1.f91499q);
        r.a aVar = r.S;
        Unit unit = Unit.INSTANCE;
        boolean zR = mVar.r(qVar) | mVar.B(m3Var);
        Object objQ = mVar.q();
        if (zR) {
            objQ = new e(qVar, m3Var);
            mVar.K(objQ);
        } else {
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new e(qVar, m3Var);
                mVar.K(objQ);
            }
        }
        return rVar.then(s0.b(aVar, unit, (PointerInputEventHandler) objQ));
    }

    public static final r d(r rVar, j jVar, e23.a<Unit> aVar) {
        rVar.getClass();
        jVar.getClass();
        aVar.getClass();
        return k.a(rVar, k2.f91249a, new l72.r(jVar, aVar, 2));
    }

    public static final r e(r rVar, boolean z14, e23.q<? super r, ? super m, ? super Integer, ? extends r> qVar, m mVar, int i14) {
        rVar.getClass();
        x1 x1Var = n.f135158a;
        if (!z14) {
            mVar.C(-1445745475);
            mVar.f();
            return rVar;
        }
        mVar.C(-1445790487);
        r rVarThen = rVar.then(qVar.invoke(r.S, mVar, Integer.valueOf(((i14 >> 3) & 112) | 6)));
        mVar.f();
        return rVarThen;
    }

    public static final r f(r rVar, z0 z0Var) {
        rVar.getClass();
        n0.f128892b.getClass();
        return l4.k.f(o4.s0.c(rVar, 0.0f, 0.0f, 0.0f, 0.0f, null, n0.f128893c, 458751), new ck0.g(z0Var, 6));
    }

    public static final r g(r rVar) {
        rVar.getClass();
        Locale locale = Locale.getDefault();
        locale.getClass();
        return TextUtils.getLayoutDirectionFromLocale(locale) == 1 ? l4.k.h(rVar, -1.0f, 1.0f) : rVar;
    }
}
