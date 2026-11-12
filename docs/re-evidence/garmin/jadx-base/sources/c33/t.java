package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f24271a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24272b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24273c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24274d;

    public t() {
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).i());
        }
        this.f24274d = arrayList;
    }

    @Override // c33.k
    public final ArrayList a() {
        return this.f24273c;
    }

    @Override // c33.k
    public final ArrayList b() {
        return this.f24272b;
    }

    @Override // c33.k
    public final ArrayList c() {
        return this.f24271a;
    }
}
