package c33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes3.dex */
public final class u {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f24275l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f24277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f24278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f24279d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f24280e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f24281f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f24282g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f24283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f24284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f24285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f24286k;

    static {
        p005kotlin.jvm.internal.b0 b0Var = new p005kotlin.jvm.internal.b0(u.class, "_hasSetter", "get_hasSetter()Z", 0);
        t0 t0Var = s0.f105811a;
        f24275l = new k23.l[]{t0Var.f(b0Var), kg.f.g(u.class, "_hasGetter", "get_hasGetter()Z", 0, t0Var)};
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public u(int i14, String str, int i15, int i16) {
        str.getClass();
        this.f24276a = i14;
        u33.b.C3157b c3157b = u33.b.A;
        c3157b.getClass();
        d33.l lVar = new d33.l(c3157b);
        d33.g gVar = d33.g.f57403a;
        d33.a aVar = new d33.a(gVar, lVar);
        u33.b.C3157b c3157b2 = u33.b.f168320z;
        c3157b2.getClass();
        d33.a aVar2 = new d33.a(gVar, new d33.l(c3157b2));
        v vVar = new v(i15);
        k23.l<?>[] lVarArr = f24275l;
        lVarArr[1].getClass();
        k23.j<Node, Integer> jVar = aVar2.f57392a;
        jVar.p((Node) this, Integer.valueOf(aVar2.f57394c | jVar.get((Node) this).intValue()));
        this.f24277b = vVar;
        this.f24278c = aVar.a(this, lVarArr[0]) ? new v(i16) : null;
        this.f24279d = new ArrayList(0);
        this.f24280e = new ArrayList(0);
        new ArrayList(0);
        this.f24281f = new ArrayList();
        this.f24282g = new ArrayList(0);
        this.f24283h = new ArrayList(0);
        this.f24284i = new ArrayList(0);
        this.f24285j = new ArrayList(0);
        e33.k.f62827a.getClass();
        List listA = e33.k.a.a();
        ArrayList arrayList = new ArrayList(p13.y.r(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(((e33.k) it.next()).q());
        }
        this.f24286k = arrayList;
    }
}
