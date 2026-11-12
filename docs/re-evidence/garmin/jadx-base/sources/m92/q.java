package m92;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Unit;
import p13.u0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f117429b;

    public /* synthetic */ q(i53.c cVar, int i14) {
        this.f117428a = i14;
        this.f117429b = cVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        Object obj2;
        switch (this.f117428a) {
            case 0:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<E> it = this.f117429b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e23.l) it.next()).invoke(fVar));
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    Object next = it3.next();
                    while (it3.hasNext()) {
                        next = u0.h((Map) next, (Map) it3.next());
                    }
                    obj2 = next;
                } else {
                    obj2 = null;
                }
                Map map = (Map) obj2;
                return map != null ? i53.a.k(map) : i53.a.c();
            case 1:
                q4.f fVar2 = (q4.f) obj;
                fVar2.getClass();
                return u.d(fVar2, this.f117429b, Float.valueOf(481.0f), Float.valueOf(0.0f), Float.valueOf(100.0f), 36);
            case 2:
                p5.k0 k0Var = (p5.k0) obj;
                k0Var.getClass();
                p5.h0.p(k0Var, this.f117429b);
                return Unit.INSTANCE;
            default:
                p5.k0 k0Var2 = (p5.k0) obj;
                k0Var2.getClass();
                p5.h0.n(k0Var2, p13.h0.k0(this.f117429b, null, null, null, null, 63));
                return Unit.INSTANCE;
        }
    }
}
