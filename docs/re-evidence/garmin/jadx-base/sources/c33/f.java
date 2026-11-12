package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f24202b;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public w f24213m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ArrayList f24217q;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f24203c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24204d = new ArrayList(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24205e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24206f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24207g = new ArrayList(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f24208h = new ArrayList(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24209i = new ArrayList(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f24210j = new ArrayList(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f24211k = new ArrayList(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f24212l = new ArrayList(0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f24214n = new ArrayList(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f24215o = new ArrayList(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f24216p = new ArrayList(0);

    public f() {
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).j());
        }
        this.f24217q = arrayList;
    }

    @Override // c33.k
    public final ArrayList a() {
        return this.f24207g;
    }

    @Override // c33.k
    public final ArrayList b() {
        return this.f24206f;
    }

    @Override // c33.k
    public final ArrayList c() {
        return this.f24205e;
    }
}
