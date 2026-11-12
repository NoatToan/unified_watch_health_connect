package l43;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class t implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f110105a;

    public t(u uVar) {
        this.f110105a = uVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Set setKeySet = this.f110105a.f110110j.f110074d.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            x33.b bVar = (x33.b) obj;
            if (!bVar.g()) {
                l.f110040c.getClass();
                if (!l.f110041d.contains(bVar)) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x33.b) it.next()).f());
        }
        return arrayList2;
    }
}
