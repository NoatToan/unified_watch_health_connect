package l33;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class c0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f109716a;

    public c0(e0 e0Var) {
        this.f109716a = e0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        p13.j0 j0VarI = this.f109716a.f109727g.i();
        ArrayList arrayList = new ArrayList(p13.y.r(j0VarI, 10));
        Iterator<E> it = j0VarI.iterator();
        while (it.hasNext()) {
            arrayList.add(((o33.r) it.next()).c());
        }
        return arrayList;
    }
}
