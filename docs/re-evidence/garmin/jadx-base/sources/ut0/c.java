package ut0;

import e2.i0;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.j0;
import o53.b0;
import ot0.g;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p13.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class c implements l<Boolean, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f172558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<j0> f172559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<g> f172560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<List<? extends g>, Unit> f172561d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f172562e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f172563f;

    /* JADX WARN: Multi-variable type inference failed */
    public c(j0 j0Var, List<j0> list, List<? extends g> list2, l<? super List<? extends g>, Unit> lVar, b0 b0Var, i0 i0Var) {
        this.f172558a = j0Var;
        this.f172559b = list;
        this.f172560c = list2;
        this.f172561d = lVar;
        this.f172562e = b0Var;
        this.f172563f = i0Var;
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        bool.getClass();
        j0 j0Var = this.f172558a;
        if (j0Var.f111075d) {
            ArrayList arrayList = new ArrayList();
            List<j0> list = this.f172559b;
            for (Object obj : list) {
                if (((j0) obj).f111075d) {
                    arrayList.add(obj);
                }
            }
            int iIndexOf = list.indexOf(j0Var);
            a aVar = new a();
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(list.indexOf((j0) it.next())));
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((j0) obj2).f111076e) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(y.r(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(list.indexOf((j0) it3.next())));
            }
            ArrayList arrayListA = aVar.a(arrayList2, arrayList4, iIndexOf);
            ArrayList arrayList5 = new ArrayList();
            int i14 = 0;
            for (Object obj3 : this.f172560c) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                if (arrayListA.contains(Integer.valueOf(i14))) {
                    arrayList5.add(obj3);
                }
                i14 = i15;
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj4 : arrayList5) {
                if (((g) obj4) != g.ALL_CHALLENGES) {
                    arrayList6.add(obj4);
                }
            }
            this.f172561d.invoke(arrayList6);
            if (arrayList5.contains(g.ALL_CHALLENGES)) {
                ge1.b.T(this.f172562e, null, null, new b(this.f172563f, null), 3);
            }
        }
        return Unit.INSTANCE;
    }
}
