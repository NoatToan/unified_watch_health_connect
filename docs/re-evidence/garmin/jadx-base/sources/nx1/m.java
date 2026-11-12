package nx1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p13.d0;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnx1/m;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f128244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f128245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f128246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f128247d;

    public m() {
        p2 p2VarA = q2.a(new dy1.l(null, false, false, 7, null));
        this.f128244a = p2VarA;
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f128245b = p2VarA2;
        this.f128246c = r53.s.d(p2VarA);
        this.f128247d = r53.s.d(p2VarA2);
    }

    public final void a(mx1.b bVar) {
        p2 p2Var;
        Object value;
        ArrayList arrayList;
        i53.c cVar = (i53.c) this.f128247d.f150540a.getValue();
        Iterator<E> it = cVar.iterator();
        int i14 = 0;
        while (true) {
            if (!it.hasNext()) {
                i14 = -1;
                break;
            } else if (((dy1.k) it.next()).f61572a == bVar) {
                break;
            } else {
                i14++;
            }
        }
        dy1.k kVar = (dy1.k) h0.e0(i14, cVar);
        Object obj = null;
        Iterable iterable = kVar != null ? kVar.f61573b : null;
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        Set setG1 = h0.g1(iterable);
        ArrayList arrayList2 = new ArrayList();
        Iterator<E> it3 = cVar.iterator();
        while (it3.hasNext()) {
            d0.v(arrayList2, ((dy1.k) it3.next()).f61573b);
        }
        Set setG2 = h0.g1(h0.z0(arrayList2, setG1));
        w13.c cVar2 = mx1.a.f121350j;
        ArrayList arrayList3 = new ArrayList();
        Iterator<E> it4 = cVar.iterator();
        while (it4.hasNext()) {
            d0.v(arrayList3, ((dy1.k) it4.next()).f61573b);
        }
        boolean z14 = h0.z0(cVar2, h0.g1(arrayList3)).size() < cVar.size() - i14 && i14 != cVar.size() - 1;
        for (Object obj2 : cVar) {
            if (((dy1.k) obj2).f61572a == bVar) {
                obj = obj2;
                break;
            }
        }
        dy1.k kVar2 = (dy1.k) obj;
        boolean z15 = kVar2 != null && (kVar2.f61573b.isEmpty() ^ true);
        do {
            p2Var = this.f128244a;
            value = p2Var.getValue();
            w13.c cVar3 = mx1.a.f121350j;
            arrayList = new ArrayList(p13.y.r(cVar3, 10));
            p13.c.b bVar2 = new p13.c.b();
            while (bVar2.hasNext()) {
                mx1.a aVar = (mx1.a) bVar2.next();
                arrayList.add(new dy1.j(aVar, setG1.contains(aVar) || setG2.contains(aVar), !(setG2.contains(aVar) || z14) || setG1.contains(aVar)));
            }
        } while (!p2Var.b(value, new dy1.l(i53.a.e(arrayList), z14, z15)));
    }
}
