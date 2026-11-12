package i3;

import com.google.firebase.messaging.Constants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li3/d2;", "Lf5/z0;", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d2 implements f5.z0 {
    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        int size = list.size();
        int iO = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iO += list.get(i15).O(i14);
        }
        return iO;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        f5.y0 y0Var;
        f5.y0 y0Var2;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                y0Var = null;
                break;
            }
            y0Var = list.get(i14);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "leadingIcon")) {
                break;
            }
            i14++;
        }
        f5.y0 y0Var3 = y0Var;
        final f5.v1 v1VarQ = y0Var3 != null ? y0Var3.Q(g6.a.c(0, 0, 0, 0, 10, j8)) : null;
        int i15 = v1VarQ != null ? v1VarQ.f69144a : 0;
        final int i16 = v1VarQ != null ? v1VarQ.f69145b : 0;
        int size2 = list.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size2) {
                y0Var2 = null;
                break;
            }
            y0Var2 = list.get(i17);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "trailingIcon")) {
                break;
            }
            i17++;
        }
        f5.y0 y0Var4 = y0Var2;
        final f5.v1 v1VarQ2 = y0Var4 != null ? y0Var4.Q(g6.a.c(0, 0, 0, 0, 10, j8)) : null;
        int i18 = v1VarQ2 != null ? v1VarQ2.f69144a : 0;
        final int i19 = v1VarQ2 != null ? v1VarQ2.f69145b : 0;
        int size3 = list.size();
        int i24 = 0;
        while (i24 < size3) {
            f5.y0 y0Var5 = list.get(i24);
            if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var5), Constants.ScionAnalytics.PARAM_LABEL)) {
                final f5.v1 v1VarQ3 = y0Var5.Q(g6.b.j(-(i15 + i18), 0, 2, j8));
                int i25 = v1VarQ3.f69144a + i15 + i18;
                final int iMax = Math.max(i16, Math.max(v1VarQ3.f69145b, i19));
                final int i26 = i15;
                return f5.b1.h0(b1Var, i25, iMax, new e23.l() { // from class: i3.c2
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        f5.v1.a aVar = (f5.v1.a) obj;
                        f5.v1 v1Var = v1VarQ;
                        int i27 = iMax;
                        if (v1Var != null) {
                            h4.d.f81522a.getClass();
                            f5.v1.a.B(aVar, v1Var, 0, h4.d.a.f81534l.a(i16, i27));
                        }
                        f5.v1 v1Var2 = v1VarQ3;
                        int i28 = i26;
                        f5.v1.a.B(aVar, v1Var2, i28, 0);
                        f5.v1 v1Var3 = v1VarQ2;
                        if (v1Var3 != null) {
                            int i29 = i28 + v1Var2.f69144a;
                            h4.d.f81522a.getClass();
                            f5.v1.a.B(aVar, v1Var3, i29, h4.d.a.f81534l.a(i19, i27));
                        }
                        return Unit.INSTANCE;
                    }
                });
            }
            i24++;
            i15 = i15;
        }
        throw hb.a.m("Collection contains no element matching the predicate.");
    }

    @Override // f5.z0
    public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).e0(i14));
            int i15 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i15).e0(i14));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i15 == size) {
                        break;
                    }
                    i15++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // f5.z0
    public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).a0(i14));
            int i15 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i15).a0(i14));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i15 == size) {
                        break;
                    }
                    i15++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // f5.z0
    public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
        int size = list.size();
        int iL0 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            iL0 += list.get(i15).l0(i14);
        }
        return iL0;
    }
}
