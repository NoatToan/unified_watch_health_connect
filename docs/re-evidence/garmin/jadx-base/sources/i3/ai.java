package i3;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ai implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f87513a;

    public ai(float f14) {
        this.f87513a = f14;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, final long j8) {
        f5.y0 y0Var;
        f5.y0 y0Var2;
        final float fI = g6.a.i(j8) * this.f87513a;
        int i14 = 0;
        long jC = g6.a.c(0, 0, 0, 0, 10, j8);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            f5.y0 y0Var3 = list.get(i15);
            f5.y0 y0Var4 = y0Var3;
            if (f5.g0.b(y0Var4) != q7.Selector && f5.g0.b(y0Var4) != q7.InnerCircle) {
                arrayList.add(y0Var3);
            }
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i16 = 0; i16 < size2; i16++) {
            arrayList2.add(((f5.y0) arrayList.get(i16)).Q(jC));
        }
        int size3 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size3) {
                y0Var = null;
                break;
            }
            y0Var = list.get(i17);
            if (f5.g0.b(y0Var) == q7.Selector) {
                break;
            }
            i17++;
        }
        f5.y0 y0Var5 = y0Var;
        int size4 = list.size();
        while (true) {
            if (i14 >= size4) {
                y0Var2 = null;
                break;
            }
            y0Var2 = list.get(i14);
            if (f5.g0.b(y0Var2) == q7.InnerCircle) {
                break;
            }
            i14++;
        }
        f5.y0 y0Var6 = y0Var2;
        final float size5 = 6.2831855f / arrayList2.size();
        f5.v1 v1VarQ = y0Var5 != null ? y0Var5.Q(jC) : null;
        final f5.v1 v1VarQ2 = y0Var6 != null ? y0Var6.Q(jC) : null;
        final f5.v1 v1Var = v1VarQ;
        return f5.b1.h0(b1Var, g6.a.l(j8), g6.a.k(j8), new e23.l() { // from class: i3.zh
            @Override // e23.l
            public final Object invoke(Object obj) {
                long j14;
                f5.v1.a aVar = (f5.v1.a) obj;
                int i18 = 0;
                f5.v1 v1Var2 = v1Var;
                if (v1Var2 != null) {
                    aVar.r(v1Var2, 0, 0, 0.0f);
                }
                ArrayList arrayList3 = arrayList2;
                int size6 = arrayList3.size();
                while (true) {
                    j14 = j8;
                    if (i18 >= size6) {
                        break;
                    }
                    f5.v1 v1Var3 = (f5.v1) arrayList3.get(i18);
                    int iJ = (g6.a.j(j14) / 2) - (v1Var3.f69144a / 2);
                    int i19 = (g6.a.i(j14) / 2) - (v1Var3.f69145b / 2);
                    double d14 = fI;
                    double d15 = ((double) (size5 * i18)) - 1.5707963267948966d;
                    aVar.r(v1Var3, MathKt.b((Math.cos(d15) * d14) + ((double) iJ)), MathKt.b((Math.sin(d15) * d14) + ((double) i19)), 0.0f);
                    i18++;
                    arrayList3 = arrayList3;
                }
                f5.v1 v1Var4 = v1VarQ2;
                if (v1Var4 != null) {
                    aVar.r(v1Var4, (g6.a.l(j14) - v1Var4.f69144a) / 2, (g6.a.k(j14) - v1Var4.f69145b) / 2, 0.0f);
                }
                return Unit.INSTANCE;
            }
        });
    }
}
