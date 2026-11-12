package fi;

import ci.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.w;
import p13.d0;
import p13.h0;
import p13.t0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
public final class b extends w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f71636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Collection<n> f71637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<Set<String>> f71638c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Long f71639d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Collection<n> collection, r0<Set<String>> r0Var, Long l14) {
        super(0);
        this.f71636a = cVar;
        this.f71637b = collection;
        this.f71638c = r0Var;
        this.f71639d = l14;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.Set] */
    @Override // e23.a
    public final Unit invoke() {
        Set<String> setA;
        Collection<n> collection = this.f71637b;
        ArrayList arrayList = new ArrayList(y.r(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((n) it.next()).f27616a);
        }
        int i14 = c.f71640c;
        c cVar = this.f71636a;
        ArrayList arrayListG = cVar.g(arrayList);
        gi.d dVar = cVar.f71641b;
        int iA = t0.a(y.r(arrayListG, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : arrayListG) {
            linkedHashMap.put(((n) obj).f27616a, obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (n nVar : collection) {
            n nVar2 = (n) linkedHashMap.get(nVar.f27616a);
            Long l14 = this.f71639d;
            if (nVar2 == null) {
                dVar.d(c.f(cVar, nVar, l14));
                setA = nVar.a();
            } else {
                p<n, Set<String>> pVarB = nVar2.b(nVar, l14);
                n nVar3 = pVarB.f128594a;
                setA = pVarB.f128595b;
                if (!nVar3.f27617b.isEmpty()) {
                    dVar.c(nVar3);
                }
            }
            d0.v(arrayList2, setA);
        }
        this.f71638c.f105810a = h0.g1(arrayList2);
        return Unit.INSTANCE;
    }
}
