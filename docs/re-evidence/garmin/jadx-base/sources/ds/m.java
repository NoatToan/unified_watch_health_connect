package ds;

import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f61008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f61009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f61010c;

    public m(float f14, float f15, int i14) {
        this.f61008a = f14;
        this.f61009b = f15;
        this.f61010c = i14;
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        int i14;
        b1Var.getClass();
        list.getClass();
        final int iF0 = b1Var.f0(this.f61008a);
        final int iF1 = b1Var.f0(this.f61009b);
        final int iJ = g6.a.j(j8);
        int size = list.size();
        int i15 = size - 1;
        int size2 = 0;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = i15 * iF0;
        if (size > 0) {
            int i17 = (iJ - i16) / size;
            if (i17 < 0) {
                i17 = 0;
            }
            i14 = i17;
        } else {
            i14 = 0;
        }
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((y0) it.next()).l0(Integer.MAX_VALUE) > i14) {
                    int i18 = this.f61010c;
                    int i19 = (iJ - ((i18 - 1) * iF0)) / i18;
                    int i24 = i19 < 0 ? 0 : i19;
                    long jC = g6.a.c(i24, i24, 0, 0, 12, j8);
                    ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(((y0) it3.next()).Q(jC));
                    }
                    final ArrayList arrayListI1 = p13.h0.i1(arrayList, i18, i18, true);
                    if (!arrayList.isEmpty()) {
                        Iterator it4 = arrayListI1.iterator();
                        while (it4.hasNext()) {
                            Iterator it5 = ((List) it4.next()).iterator();
                            if (!it5.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            int i25 = ((v1) it5.next()).f69145b;
                            while (it5.hasNext()) {
                                int i26 = ((v1) it5.next()).f69145b;
                                if (i25 < i26) {
                                    i25 = i26;
                                }
                            }
                            size2 += i25;
                        }
                        size2 += (arrayListI1.size() - 1) * iF1;
                    }
                    final int i27 = this.f61010c;
                    return b1.h0(b1Var, iJ, size2, new e23.l() { // from class: ds.l
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            v1.a aVar = (v1.a) obj;
                            aVar.getClass();
                            int i28 = 0;
                            for (List<v1> list2 : arrayListI1) {
                                Iterator it6 = list2.iterator();
                                if (!it6.hasNext()) {
                                    c22.t.g();
                                    return null;
                                }
                                int i29 = ((v1) it6.next()).f69145b;
                                while (it6.hasNext()) {
                                    int i30 = ((v1) it6.next()).f69145b;
                                    if (i29 < i30) {
                                        i29 = i30;
                                    }
                                }
                                int size3 = list2.size();
                                int i34 = i27;
                                int i35 = iF0;
                                if (size3 == i34) {
                                    int i36 = 0;
                                    for (v1 v1Var : list2) {
                                        v1.a.B(aVar, v1Var, i36, i28);
                                        i36 += v1Var.f69144a + i35;
                                    }
                                } else {
                                    Iterator it7 = list2.iterator();
                                    int i37 = 0;
                                    while (it7.hasNext()) {
                                        i37 += ((v1) it7.next()).f69144a;
                                    }
                                    int size4 = (iJ - (((list2.size() - 1) * i35) + i37)) / 2;
                                    for (v1 v1Var2 : list2) {
                                        v1.a.B(aVar, v1Var2, size4, i28);
                                        size4 += v1Var2.f69144a + i35;
                                    }
                                }
                                i28 += i29 + iF1;
                            }
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
        }
        long jC2 = g6.a.c(i14, i14, 0, 0, 12, j8);
        ArrayList arrayList2 = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((y0) it6.next()).Q(jC2));
        }
        if (!arrayList2.isEmpty()) {
            Iterator it7 = arrayList2.iterator();
            if (!it7.hasNext()) {
                c22.t.g();
                return null;
            }
            int i28 = ((v1) it7.next()).f69145b;
            loop5: while (true) {
                size2 = i28;
                do {
                    if (!it7.hasNext()) {
                        break loop5;
                    }
                    i28 = ((v1) it7.next()).f69145b;
                } while (size2 >= i28);
            }
        }
        return b1.h0(b1Var, iJ, size2, new k(arrayList2, iF0, 0));
    }
}
