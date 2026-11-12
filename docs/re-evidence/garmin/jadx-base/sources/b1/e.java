package b1;

import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.j;
import b0.b0;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class e implements e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f14194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f14195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f14196e = new HashMap();

    public e(e1 e1Var, b0 b0Var) {
        this.f14194c = e1Var;
        this.f14195d = b0Var;
    }

    @Override // androidx.camera.core.impl.e1
    public final f1 a(int i14) {
        return c(i14);
    }

    @Override // androidx.camera.core.impl.e1
    public final boolean b(int i14) {
        return this.f14194c.b(i14) && c(i14) != null;
    }

    public final f1 c(int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        HashMap map = this.f14196e;
        if (map.containsKey(numValueOf)) {
            return (f1) map.get(Integer.valueOf(i14));
        }
        e1 e1Var = this.f14194c;
        j jVarE = null;
        if (e1Var.b(i14)) {
            f1 f1VarA = e1Var.a(i14);
            if (f1VarA != null) {
                ArrayList arrayList = new ArrayList();
                for (f1.c cVar : f1VarA.d()) {
                    if (h1.b.a(cVar, this.f14195d)) {
                        arrayList.add(cVar);
                    }
                }
                if (!arrayList.isEmpty()) {
                    jVarE = f1.b.e(f1VarA.c(), f1VarA.a(), f1VarA.b(), arrayList);
                }
            }
            map.put(Integer.valueOf(i14), jVarE);
        }
        return jVarE;
    }
}
