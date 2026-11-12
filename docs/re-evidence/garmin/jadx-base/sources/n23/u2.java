package n23;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class u2 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f122637a;

    public u2(f2 f2Var) {
        this.f122637a = f2Var;
    }

    @Override // e23.a
    public final Object invoke() {
        k23.l<Object>[] lVarArr = f2.b.f122443u;
        Annotation[] annotations = this.f122637a.f122441d.getAnnotations();
        annotations.getClass();
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotations) {
            if (!f2.f122440f.contains(dh.b.u(dh.b.s(annotation)).getName())) {
                arrayList.add(annotation);
            }
        }
        return s4.k(arrayList);
    }
}
