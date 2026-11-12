package n23;

import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class k0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f122518a;

    public k0(p0 p0Var) {
        this.f122518a = p0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        int iJ;
        p0 p0Var = this.f122518a;
        List<k23.k> parameters = p0Var.getParameters();
        int size = (p0Var.isSuspend() ? 1 : 0) + parameters.size();
        if (((Boolean) p0Var.f122565g.getValue()).booleanValue()) {
            iJ = 0;
            for (k23.k kVar : parameters) {
                iJ += kVar.getF122430c() == k23.k.a.VALUE ? p0Var.j(kVar) : 0;
            }
        } else if (parameters.isEmpty()) {
            iJ = 0;
        } else {
            Iterator<T> it = parameters.iterator();
            iJ = 0;
            while (it.hasNext()) {
                if (((k23.k) it.next()).getF122430c() == k23.k.a.VALUE && (iJ = iJ + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        }
        int i14 = (iJ + 31) / 32;
        Object[] objArr = new Object[size + i14 + 1];
        for (k23.k kVar2 : parameters) {
            if (kVar2.d()) {
                b53.l type = kVar2.getType();
                x33.c cVar = s4.f122608a;
                k23.e f105782a = type.getF105782a();
                f2 f2Var = f105782a instanceof f2 ? (f2) f105782a : null;
                if (f2Var != null) {
                    c33.f fVarV = f2Var.V();
                    if ((fVarV != null ? fVarV.f24213m : null) != null) {
                    }
                }
                int index = kVar2.getF122429b();
                b53.l type2 = kVar2.getType();
                Type typeU = type2.u();
                if (typeU == null) {
                    typeU = k23.w.b(type2, false);
                }
                objArr[index] = s4.d(typeU);
            }
            if (kVar2.a()) {
                objArr[kVar2.getF122429b()] = p0.c(kVar2.getType());
            }
        }
        for (int i15 = 0; i15 < i14; i15++) {
            objArr[size + i15] = 0;
        }
        return objArr;
    }
}
