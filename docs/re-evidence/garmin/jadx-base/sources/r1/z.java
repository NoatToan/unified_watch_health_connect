package r1;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr1/z;", "Lf5/z0;", "Lr1/f0;", Action.SCOPE_ATTRIBUTE, "<init>", "(Lr1/f0;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f149319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f149320b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<f5.v1> f149321a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends f5.v1> list) {
            super(1);
            this.f149321a = list;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            f5.v1.a aVar2 = aVar;
            List<f5.v1> list = this.f149321a;
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                aVar2.r(list.get(i14), 0, 0, 0.0f);
            }
            return Unit.INSTANCE;
        }
    }

    public z(f0 f0Var) {
        this.f149319a = f0Var;
    }

    @Override // f5.z0
    public final int c(f5.x xVar, List<? extends f5.w> list, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iO = list.get(0).O(i14);
        int i15 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iO2 = list.get(i15).O(i14);
                if (iO2 > iO) {
                    iO = iO2;
                }
                if (i15 == size) {
                    break;
                }
                i15++;
            }
        }
        return iO;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            f5.v1 v1VarQ = list.get(i14).Q(j8);
            iMax = Math.max(iMax, v1VarQ.f69144a);
            iMax2 = Math.max(iMax2, v1VarQ.f69145b);
            arrayList.add(v1VarQ);
        }
        boolean zT1 = b1Var.t1();
        f0 f0Var = this.f149319a;
        if (zT1) {
            this.f149320b = true;
            f0Var.f149081a.setValue(g6.m.a((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        } else if (!this.f149320b) {
            f0Var.f149081a.setValue(g6.m.a((4294967295L & ((long) iMax2)) | (((long) iMax) << 32)));
        }
        return f5.b1.h0(b1Var, iMax, iMax2, new a(arrayList));
    }

    @Override // f5.z0
    public final int g(f5.x xVar, List<? extends f5.w> list, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iE0 = list.get(0).e0(i14);
        int i15 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iE1 = list.get(i15).e0(i14);
                if (iE1 > iE0) {
                    iE0 = iE1;
                }
                if (i15 == size) {
                    break;
                }
                i15++;
            }
        }
        return iE0;
    }

    @Override // f5.z0
    public final int h(f5.x xVar, List<? extends f5.w> list, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA0 = list.get(0).a0(i14);
        int i15 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iA1 = list.get(i15).a0(i14);
                if (iA1 > iA0) {
                    iA0 = iA1;
                }
                if (i15 == size) {
                    break;
                }
                i15++;
            }
        }
        return iA0;
    }

    @Override // f5.z0
    public final int i(f5.x xVar, List<? extends f5.w> list, int i14) {
        if (list.isEmpty()) {
            return 0;
        }
        int iL0 = list.get(0).l0(i14);
        int i15 = 1;
        int size = list.size() - 1;
        if (1 <= size) {
            while (true) {
                int iL1 = list.get(i15).l0(i14);
                if (iL1 > iL0) {
                    iL0 = iL1;
                }
                if (i15 == size) {
                    break;
                }
                i15++;
            }
        }
        return iL0;
    }
}
