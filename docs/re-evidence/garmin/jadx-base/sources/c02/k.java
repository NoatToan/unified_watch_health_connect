package c02;

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
import p13.y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class k implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f22394a = new k();

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, final long j8) {
        Integer num;
        b1Var.getClass();
        list.getClass();
        final int iJ = (int) (((double) g6.a.j(j8)) / 2.67d);
        long jA = g6.b.a(iJ, iJ, iJ, iJ);
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((y0) it.next()).Q(jA));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Integer numValueOf = Integer.valueOf(((v1) it3.next()).f69145b);
            while (it3.hasNext()) {
                Integer numValueOf2 = Integer.valueOf(((v1) it3.next()).f69145b);
                if (numValueOf.compareTo(numValueOf2) < 0) {
                    numValueOf = numValueOf2;
                }
            }
            num = numValueOf;
        } else {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        final v1 v1Var = (v1) arrayList.get(0);
        final v1 v1Var2 = (v1) arrayList.get(1);
        final v1 v1Var3 = (v1) arrayList.get(2);
        final int i14 = (int) (((double) iJ) * 0.4d);
        double d14 = iIntValue;
        return b1.h0(b1Var, g6.a.j(j8), (int) ((0.4d * d14) + d14), new e23.l() { // from class: c02.j
            @Override // e23.l
            public final Object invoke(Object obj) {
                v1.a aVar = (v1.a) obj;
                k kVar = k.f22394a;
                aVar.getClass();
                v1 v1Var4 = v1Var;
                int i15 = i14;
                aVar.r(v1Var4, 0, i15, 0.0f);
                long j14 = j8;
                int iJ2 = g6.a.j(j14);
                int i16 = iJ;
                aVar.r(v1Var3, iJ2 - i16, i15, 0.0f);
                aVar.r(v1Var2, (g6.a.j(j14) - i16) / 2, 0, 0.0f);
                return Unit.INSTANCE;
            }
        });
    }
}
