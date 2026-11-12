package q43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.j0;
import p43.f2;

/* JADX INFO: loaded from: classes3.dex */
public class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f142799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f142800b;

    public l(m mVar, f fVar) {
        this.f142799a = mVar;
        this.f142800b = fVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // e23.a
    public final Object invoke() {
        Iterable iterable = (List) this.f142799a.f142805e.getValue();
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f2) it.next()).K0(this.f142800b));
        }
        return arrayList;
    }
}
