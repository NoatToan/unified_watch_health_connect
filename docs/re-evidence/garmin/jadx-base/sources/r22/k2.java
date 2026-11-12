package r22;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k2 implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Integer, Unit> f149745b;

    /* JADX WARN: Multi-variable type inference failed */
    public k2(int i14, e23.l<? super Integer, Unit> lVar) {
        this.f149744a = i14;
        this.f149745b = lVar;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        int i14;
        b1Var.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        int iJ = g6.a.j(j8);
        int i15 = 0;
        int iMax = 0;
        int i16 = 0;
        while (true) {
            i14 = this.f149744a;
            if (iJ > 0 && i15 < list.size()) {
                f5.v1 v1VarQ = list.get(i15).Q(j8);
                int i17 = v1VarQ.f69144a;
                if ((i15 != 0 ? i14 : 0) + i17 > iJ) {
                    break;
                }
                iJ -= (i15 != 0 ? i14 : 0) + i17;
                if (i15 == 0) {
                    i14 = 0;
                }
                i16 += i17 + i14;
                iMax = Math.max(iMax, v1VarQ.f69145b);
                arrayList.add(v1VarQ);
                i15++;
            } else {
                break;
            }
        }
        this.f149745b.invoke(Integer.valueOf(i15));
        return f5.b1.h0(b1Var, i16, iMax, new ds.k(arrayList, i14, 3));
    }
}
