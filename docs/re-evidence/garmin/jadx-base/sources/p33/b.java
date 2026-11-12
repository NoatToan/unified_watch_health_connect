package p33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f135414b;

    public b(List list, f fVar) {
        this.f135413a = list;
        this.f135414b = fVar;
    }

    @Override // e23.a
    public final Object invoke() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f135413a.iterator();
        while (it.hasNext()) {
            p43.n0 n0VarH = this.f135414b.h((t43.h) it.next());
            if (n0VarH != null) {
                arrayList.add(n0VarH);
            }
        }
        return arrayList;
    }
}
