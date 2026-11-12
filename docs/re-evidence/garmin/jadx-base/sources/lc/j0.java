package lc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.text.StringSubstitutor;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.l1;
import p1.n1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\u0007B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Llc/j0;", "Llc/h0;", "", "Llc/v0;", "navGraphNavigator", "<init>", "(Llc/v0;)V", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class j0 extends h0 implements Iterable<h0>, f23.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f111790h = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qc.l f111791g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v0<? extends j0> v0Var) {
        super(v0Var);
        v0Var.getClass();
        this.f111791g = new qc.l(this);
    }

    @Override // lc.h0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j0) || !super.equals(obj)) {
            return false;
        }
        qc.l lVar = this.f111791g;
        int iF = lVar.f144353b.f();
        qc.l lVar2 = ((j0) obj).f111791g;
        if (iF != lVar2.f144353b.f() || lVar.f144354c != lVar2.f144354c) {
            return false;
        }
        l1<h0> l1Var = lVar.f144353b;
        l1Var.getClass();
        for (h0 h0Var : (c53.a) c53.q.b(new n1(l1Var))) {
            if (!h0Var.equals(lVar2.f144353b.c(h0Var.f111773b.f144346e))) {
                return false;
            }
        }
        return true;
    }

    @Override // lc.h0
    public final h0.b h(g0 g0Var) {
        h0.b bVarH = super.h(g0Var);
        qc.l lVar = this.f111791g;
        lVar.getClass();
        return lVar.e(bVarH, g0Var, false, lVar.f144352a);
    }

    @Override // lc.h0
    public final int hashCode() {
        qc.l lVar = this.f111791g;
        int iC = lVar.f144354c;
        l1<h0> l1Var = lVar.f144353b;
        int iF = l1Var.f();
        for (int i14 = 0; i14 < iF; i14++) {
            iC = e5.c(iC, 31, l1Var.d(i14), 31) + l1Var.g(i14).hashCode();
        }
        return iC;
    }

    @Override // lc.h0
    public final void i(Context context, AttributeSet attributeSet) {
        super.i(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, mc.a.f117764d);
        typedArrayObtainAttributes.getClass();
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        qc.l lVar = this.f111791g;
        lVar.f(resourceId);
        qc.f fVar = new qc.f(context);
        int i14 = lVar.f144354c;
        h0.f111771f.getClass();
        lVar.f144355d = h0.a.a(fVar, i14);
        Unit unit = Unit.INSTANCE;
        typedArrayObtainAttributes.recycle();
    }

    @Override // java.lang.Iterable
    public final Iterator<h0> iterator() {
        qc.l lVar = this.f111791g;
        lVar.getClass();
        return new qc.k(lVar);
    }

    public final h0 m(String str) {
        qc.l lVar = this.f111791g;
        lVar.getClass();
        if (str == null || d53.w.J(str)) {
            return null;
        }
        return lVar.c(str, true);
    }

    public final h0.b n(g0 g0Var, h0 h0Var) {
        return this.f111791g.e(super.h(g0Var), g0Var, true, h0Var);
    }

    public final h0.b o(String str, boolean z14, h0 h0Var) {
        h0.b bVarO;
        str.getClass();
        qc.l lVar = this.f111791g;
        lVar.getClass();
        j0 j0Var = lVar.f144352a;
        h0.b bVarA = j0Var.f111773b.a(str);
        ArrayList arrayList = new ArrayList();
        Iterator<h0> it = j0Var.iterator();
        while (true) {
            bVarO = null;
            if (!it.hasNext()) {
                break;
            }
            h0 next = it.next();
            if (!p005kotlin.jvm.internal.s.g(next, h0Var)) {
                if (next instanceof j0) {
                    bVarO = ((j0) next).o(str, false, j0Var);
                } else {
                    next.getClass();
                    bVarO = next.f111773b.a(str);
                }
            }
            if (bVarO != null) {
                arrayList.add(bVarO);
            }
        }
        h0.b bVar = (h0.b) p13.h0.o0(arrayList);
        j0 j0Var2 = j0Var.f111774c;
        if (j0Var2 != null && z14 && !j0Var2.equals(h0Var)) {
            bVarO = j0Var2.o(str, true, j0Var);
        }
        return (h0.b) p13.h0.o0(p13.u.C(new h0.b[]{bVarA, bVar, bVarO}));
    }

    public final void p(int i14) {
        this.f111791g.f(i14);
    }

    public final void q(Object obj) {
        obj.getClass();
        qc.l lVar = this.f111791g;
        lVar.getClass();
        i63.c cVarJ = gl1.y.J(p005kotlin.jvm.internal.s0.f105811a.b(obj.getClass()));
        e2.k kVar = new e2.k(obj, 3);
        lVar.getClass();
        int iB = rc.l.b(cVarJ);
        h0 h0VarB = lVar.b(iB);
        if (h0VarB == null) {
            n23.j.t("Cannot find startDestination ", cVarJ.getF158591b().getF103221c(), " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
        } else {
            lVar.g((String) kVar.invoke(h0VarB));
            lVar.f144354c = iB;
        }
    }

    @Override // lc.h0
    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(super.toString());
        qc.l lVar = this.f111791g;
        h0 h0VarM = m(lVar.f144356e);
        if (h0VarM == null) {
            h0VarM = lVar.b(lVar.f144354c);
        }
        sb3.append(" startDestination=");
        if (h0VarM == null) {
            String str = lVar.f144356e;
            if (str != null) {
                sb3.append(str);
            } else {
                String str2 = lVar.f144355d;
                if (str2 != null) {
                    sb3.append(str2);
                } else {
                    sb3.append("0x" + Integer.toHexString(lVar.f144354c));
                }
            }
        } else {
            sb3.append("{");
            sb3.append(h0VarM.toString());
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
        }
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llc/j0$a;", "", "<init>", "()V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static h0 a(j0 j0Var) {
            return (h0) c53.c0.n(c53.q.e(new l72.b1(12), j0Var));
        }

        private a() {
        }
    }
}
