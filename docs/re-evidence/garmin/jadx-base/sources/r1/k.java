package r1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr1/k;", "Lf5/z0;", "Lr1/q;", "rootScope", "<init>", "(Lr1/q;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q<?> f149128a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.v1[] f149129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f149130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f149131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f149132d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f5.v1[] v1VarArr, k kVar, int i14, int i15) {
            super(1);
            this.f149129a = v1VarArr;
            this.f149130b = kVar;
            this.f149131c = i14;
            this.f149132d = i15;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            f5.v1.a aVar2 = aVar;
            for (f5.v1 v1Var : this.f149129a) {
                if (v1Var != null) {
                    h4.d dVar = this.f149130b.f149128a.f149192b;
                    long j8 = (((long) v1Var.f69144a) << 32) | (((long) v1Var.f69145b) & 4294967295L);
                    g6.m.a aVar3 = g6.m.f76012b;
                    long jA = dVar.a(j8, (((long) this.f149131c) << 32) | (((long) this.f149132d) & 4294967295L), g6.o.Ltr);
                    g6.k.a aVar4 = g6.k.f76003b;
                    aVar2.r(v1Var, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public k(q<?> qVar) {
        this.f149128a = qVar;
    }

    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).O(i14));
            int i15 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i15).O(i14));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        f5.v1 v1Var;
        int i14;
        f5.v1 v1Var2;
        int i15;
        int i16;
        int size = list.size();
        f5.v1[] v1VarArr = new f5.v1[size];
        g6.m.f76012b.getClass();
        int size2 = list.size();
        long j14 = 0;
        int i17 = 0;
        while (true) {
            v1Var = null;
            i14 = 1;
            if (i17 >= size2) {
                break;
            }
            f5.y0 y0Var = list.get(i17);
            Object a14 = y0Var.getA();
            q.a aVar = a14 instanceof q.a ? (q.a) a14 : null;
            if (aVar != null && ((Boolean) aVar.f149197a.getF182175a()).booleanValue()) {
                f5.v1 v1VarQ = y0Var.Q(j8);
                long j15 = (((long) v1VarQ.f69145b) & 4294967295L) | (((long) v1VarQ.f69144a) << 32);
                Unit unit = Unit.INSTANCE;
                v1VarArr[i17] = v1VarQ;
                j14 = j15;
            }
            i17++;
        }
        int size3 = list.size();
        for (int i18 = 0; i18 < size3; i18++) {
            f5.y0 y0Var2 = list.get(i18);
            if (v1VarArr[i18] == null) {
                v1VarArr[i18] = y0Var2.Q(j8);
            }
        }
        if (b1Var.t1()) {
            i15 = (int) (j14 >> 32);
        } else {
            if (size != 0) {
                v1Var2 = v1VarArr[0];
                int i19 = size - 1;
                if (i19 != 0) {
                    int i24 = v1Var2 != null ? v1Var2.f69144a : 0;
                    if (1 <= i19) {
                        int i25 = 1;
                        while (true) {
                            f5.v1 v1Var3 = v1VarArr[i25];
                            int i26 = v1Var3 != null ? v1Var3.f69144a : 0;
                            if (i24 < i26) {
                                v1Var2 = v1Var3;
                                i24 = i26;
                            }
                            if (i25 == i19) {
                                break;
                            }
                            i25++;
                        }
                    }
                }
            } else {
                v1Var2 = null;
            }
            i15 = v1Var2 != null ? v1Var2.f69144a : 0;
        }
        if (b1Var.t1()) {
            i16 = (int) (j14 & 4294967295L);
        } else {
            if (size != 0) {
                v1Var = v1VarArr[0];
                int i27 = size - 1;
                if (i27 != 0) {
                    int i28 = v1Var != null ? v1Var.f69145b : 0;
                    if (1 <= i27) {
                        while (true) {
                            f5.v1 v1Var4 = v1VarArr[i14];
                            int i29 = v1Var4 != null ? v1Var4.f69145b : 0;
                            if (i28 < i29) {
                                v1Var = v1Var4;
                                i28 = i29;
                            }
                            if (i14 == i27) {
                                break;
                            }
                            i14++;
                        }
                    }
                }
            }
            i16 = v1Var != null ? v1Var.f69145b : 0;
        }
        if (!b1Var.t1()) {
            this.f149128a.f149194d.setValue(g6.m.a((((long) i15) << 32) | (((long) i16) & 4294967295L)));
        }
        return f5.b1.h0(b1Var, i15, i16, new a(v1VarArr, this, i15, i16));
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
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).l0(i14));
            int i15 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i15).l0(i14));
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
}
