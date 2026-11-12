package f43;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p13.y;
import t23.j1;

/* JADX INFO: loaded from: classes3.dex */
public class a implements z43.b.InterfaceC3774b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f68877a = new a();

    @Override // z43.b.InterfaceC3774b
    public final Iterable a(Object obj) {
        int i14 = e.f68881a;
        Collection<? extends t23.a> collectionO = ((j1) obj).o();
        ArrayList arrayList = new ArrayList(y.r(collectionO, 10));
        Iterator<T> it = collectionO.iterator();
        while (it.hasNext()) {
            arrayList.add(((j1) it.next()).a());
        }
        return arrayList;
    }
}
