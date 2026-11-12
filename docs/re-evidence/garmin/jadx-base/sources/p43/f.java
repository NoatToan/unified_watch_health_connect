package p43;

import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f135825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f135826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t43.p f135827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t43.i f135828d;

    public f(Collection collection, l1 l1Var, t43.p pVar, t43.i iVar) {
        this.f135825a = collection;
        this.f135826b = l1Var;
        this.f135827c = pVar;
        this.f135828d = iVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        l1.a aVar = (l1.a) obj;
        h hVar = h.f135849a;
        aVar.getClass();
        Iterator it = this.f135825a.iterator();
        while (it.hasNext()) {
            aVar.a(new g(this.f135826b, this.f135827c, (t43.i) it.next(), this.f135828d));
        }
        return Unit.INSTANCE;
    }
}
