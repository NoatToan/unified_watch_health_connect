package l33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class d implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f109717a;

    public d(e eVar) {
        this.f109717a = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        e eVar = this.f109717a;
        Collection collectionValues = ((Map) gl1.d.B(eVar.f109723c.f109729i, e0.f109726m[0])).values();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            n43.f0 f0VarA = eVar.f109722b.f102785a.f102754d.a(eVar.f109723c, (q33.x) it.next());
            if (f0VarA != null) {
                arrayList.add(f0VarA);
            }
        }
        return (i43.l[]) y43.a.b(arrayList).toArray(new i43.l[0]);
    }
}
