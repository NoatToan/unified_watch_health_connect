package f11;

import androidx.lifecycle.u1;
import b11.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.h0;
import p13.j0;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf11/m;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<d11.f> f68014a = j0.f134944a;

    /* JADX WARN: Multi-variable type inference failed */
    public static d11.h y4(m mVar, b11.a aVar) {
        mVar.getClass();
        aVar.getClass();
        if ((aVar instanceof b11.a.C0202a) || (aVar instanceof b11.a.c)) {
            return mVar.x4((v) aVar, false);
        }
        if (!(aVar instanceof b11.a.b)) {
            u0.r();
            return null;
        }
        i53.c<v> cVar = ((b11.a.b) aVar).f14233i;
        ArrayList arrayList = new ArrayList(y.r(cVar, 10));
        Iterator<v> it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(mVar.x4(it.next(), true));
        }
        return z4(arrayList);
    }

    public static d11.h z4(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return d11.h.FoodAdded;
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((d11.h) it.next()) != d11.h.LimitReached) {
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            d11.h hVar = (d11.h) it3.next();
                            d11.h hVar2 = d11.h.FoodAdded;
                            if (hVar == hVar2) {
                                return hVar2;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            d11.h hVar3 = (d11.h) it4.next();
                            d11.h hVar4 = d11.h.RecipeAdded;
                            if (hVar3 == hVar4) {
                                return hVar4;
                            }
                        }
                    }
                    return d11.h.Updated;
                }
            }
        }
        return d11.h.LimitReached;
    }

    public final d11.h x4(v vVar, boolean z14) {
        d11.f fVar = new d11.f(vVar, false, 2, null);
        List<d11.f> list = this.f68014a;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((d11.f) it.next()).a().equals(fVar.a())) {
                    List<d11.f> list2 = this.f68014a;
                    ArrayList arrayList = new ArrayList(y.r(list2, 10));
                    for (d11.f fVarB : list2) {
                        if (fVarB.a().equals(fVar.a())) {
                            fVarB = fVar.b(fVarB);
                        }
                        arrayList.add(fVarB);
                    }
                    this.f68014a = arrayList;
                    return d11.h.Updated;
                }
            }
        }
        if (this.f68014a.size() >= 50 && !z14) {
            return d11.h.LimitReached;
        }
        this.f68014a = h0.D0(this.f68014a, fVar);
        return fVar.f57067a instanceof b11.a.c ? d11.h.RecipeAdded : d11.h.FoodAdded;
    }
}
