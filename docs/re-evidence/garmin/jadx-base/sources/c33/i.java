package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24241e;

    public i(int i14) {
        this.f24237a = i14;
        this.f24238b = new ArrayList();
        this.f24239c = new ArrayList(0);
        this.f24240d = new ArrayList(0);
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).a());
        }
        this.f24241e = arrayList;
    }

    public i() {
        this(0);
    }
}
