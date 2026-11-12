package n23;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class y2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2.b f122665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f122666b;

    public y2(f2.b bVar, f2 f2Var) {
        this.f122665a = bVar;
        this.f122666b = f2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        c33.f fVarB = this.f122665a.b();
        f2 f2Var = this.f122666b;
        if (fVarB == null) {
            Class<?>[] declaredClasses = f2Var.f122441d.getDeclaredClasses();
            declaredClasses.getClass();
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls : declaredClasses) {
                cls.getClass();
                arrayList.add(p005kotlin.jvm.internal.s0.f105811a.b(cls));
            }
            return arrayList;
        }
        String str = fVarB.f24202b;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("name");
            throw null;
        }
        x33.b bVarD = b0.d(str);
        ClassLoader classLoaderD = z23.f.d(f2Var.f122441d);
        ArrayList arrayList2 = fVarB.f24209i;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Class<?> clsG = s4.g(classLoaderD, bVarD.d(x33.f.e((String) it.next())), 0);
            k23.d dVarB = clsG != null ? p005kotlin.jvm.internal.s0.f105811a.b(clsG) : null;
            if (dVarB != null) {
                arrayList3.add(dVarB);
            }
        }
        return arrayList3;
    }
}
