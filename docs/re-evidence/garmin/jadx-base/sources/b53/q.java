package b53;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n23.o4;
import n23.t3;
import p13.w;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d f16144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x33.c f16145b;

    public q(k23.d dVar, x33.c cVar) {
        this.f16144a = dVar;
        this.f16145b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        k23.d dVar = this.f16144a;
        x33.c cVar = this.f16145b;
        p pVar = (p) obj;
        pVar.getClass();
        List<k23.q> typeParameters = dVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(y.r(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            t3 t3Var = new t3(pVar, ((k23.q) it.next()).getF122625c(), (p005kotlin.jvm.internal.s.g(cVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.K) || p005kotlin.jvm.internal.s.g(cVar, kotlin.reflect.jvm.internal.impl.builtins.f.a.J)) ? k23.s.OUT : k23.s.INVARIANT, false);
            o4.f122553a.getClass();
            t3Var.f122628f = w.c(o4.f122555c);
            arrayList.add(t3Var);
        }
        return arrayList;
    }
}
