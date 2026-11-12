package m33;

import a43.w;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import i43.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import o72.t;
import org.slf4j.Marker;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.y;
import p43.f0;
import p43.f2;
import p43.k1;
import p43.n0;
import p43.s1;
import p43.t1;
import p43.v0;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends f0 {
    private j(v0 v0Var, v0 v0Var2, boolean z14) {
        super(v0Var, v0Var2);
        if (z14) {
            return;
        }
        q43.d.f142786a.d(v0Var, v0Var2);
    }

    public static final ArrayList P0(w wVar, n0 n0Var) {
        List<t1> listD0 = n0Var.D0();
        ArrayList arrayList = new ArrayList(y.r(listD0, 10));
        Iterator<T> it = listD0.iterator();
        while (it.hasNext()) {
            arrayList.add(wVar.c0((t1) it.next()));
        }
        return arrayList;
    }

    public static final String Q0(String str, String str2) {
        if (!d53.w.A(str, '<')) {
            return str;
        }
        return d53.w.f0(str, '<') + '<' + str2 + '>' + d53.w.d0('>', str, str);
    }

    @Override // p43.f2
    public final f2 J0(boolean z14) {
        return new j(this.f135829b.J0(z14), this.f135830c.J0(z14));
    }

    @Override // p43.f2
    public final f2 L0(k1 k1Var) {
        k1Var.getClass();
        return new j(this.f135829b.L0(k1Var), this.f135830c.L0(k1Var));
    }

    @Override // p43.f0
    public final v0 M0() {
        return this.f135829b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p43.f0
    public final String N0(w wVar, w wVar2) {
        v0 v0Var = this.f135829b;
        String strW = wVar.W(v0Var);
        v0 v0Var2 = this.f135830c;
        String strW2 = wVar.W(v0Var2);
        if (wVar2.f1180e.n()) {
            return "raw (" + strW + CallerDataConverter.DEFAULT_RANGE_DELIMITER + strW2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        if (v0Var2.D0().isEmpty()) {
            return wVar.F(strW, strW2, t.D(this));
        }
        ArrayList arrayListP0 = P0(wVar, v0Var);
        ArrayList arrayListP1 = P0(wVar, v0Var2);
        String strK0 = h0.k0(arrayListP0, ", ", null, null, i.f116448a, 30);
        ArrayList arrayListK1 = h0.k1(arrayListP0, arrayListP1);
        if (!arrayListK1.isEmpty()) {
            Iterator it = arrayListK1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strW2 = Q0(strW2, strK0);
                    break;
                }
                p pVar = (p) it.next();
                String str = (String) pVar.f128594a;
                String str2 = (String) pVar.f128595b;
                if (!s.g(str, d53.w.O(str2, "out ")) && !str2.equals(Marker.ANY_MARKER)) {
                    break;
                }
            }
        } else {
            strW2 = Q0(strW2, strK0);
            break;
        }
        String strQ0 = Q0(strW, strK0);
        return strQ0.equals(strW2) ? strQ0 : wVar.F(strQ0, strW2, t.D(this));
    }

    @Override // p43.f2
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final f0 K0(q43.f fVar) {
        fVar.getClass();
        return new j((v0) fVar.f(this.f135829b), (v0) fVar.f(this.f135830c), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p43.f0, p43.n0
    public final l i() {
        t23.h hVarT = F0().t();
        s1 s1Var = null;
        Object[] objArr = 0;
        t23.e eVar = hVarT instanceof t23.e ? (t23.e) hVarT : null;
        if (eVar == null) {
            androidx.core.view.j.x(F0().t(), "Incorrect classifier: ");
            return null;
        }
        l lVarT = eVar.t(new h(s1Var, 1, objArr == true ? 1 : 0));
        lVarT.getClass();
        return lVarT;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(v0 v0Var, v0 v0Var2) {
        this(v0Var, v0Var2, false);
        v0Var.getClass();
        v0Var2.getClass();
    }
}
