package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f24264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24269g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f24270h;

    public r(int i14, String str) {
        str.getClass();
        this.f24263a = i14;
        this.f24264b = new ArrayList(0);
        this.f24265c = new ArrayList(0);
        new ArrayList(0);
        this.f24266d = new ArrayList();
        this.f24267e = new ArrayList();
        this.f24268f = new ArrayList(0);
        this.f24269g = new ArrayList(0);
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).g());
        }
        this.f24270h = arrayList;
    }
}
