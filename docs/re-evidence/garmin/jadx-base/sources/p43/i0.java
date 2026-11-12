package p43;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends w1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t23.d1[] f135856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1[] f135857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f135858d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0(List<? extends t23.d1> list, List<? extends t1> list2) {
        this((t23.d1[]) list.toArray(new t23.d1[0]), (t1[]) list2.toArray(new t1[0]), false, 4, null);
        list.getClass();
        list2.getClass();
    }

    @Override // p43.w1
    public final boolean b() {
        return this.f135858d;
    }

    @Override // p43.w1
    public final t1 d(n0 n0Var) {
        t23.h hVarT = n0Var.F0().t();
        t23.d1 d1Var = hVarT instanceof t23.d1 ? (t23.d1) hVarT : null;
        if (d1Var != null) {
            int index = d1Var.getIndex();
            t23.d1[] d1VarArr = this.f135856b;
            if (index < d1VarArr.length && p005kotlin.jvm.internal.s.g(d1VarArr[index].h(), d1Var.h())) {
                return this.f135857c[index];
            }
        }
        return null;
    }

    @Override // p43.w1
    public final boolean e() {
        return this.f135857c.length == 0;
    }

    public /* synthetic */ i0(t23.d1[] d1VarArr, t1[] t1VarArr, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(d1VarArr, t1VarArr, (i14 & 4) != 0 ? false : z14);
    }

    public i0(t23.d1[] d1VarArr, t1[] t1VarArr, boolean z14) {
        d1VarArr.getClass();
        t1VarArr.getClass();
        this.f135856b = d1VarArr;
        this.f135857c = t1VarArr;
        this.f135858d = z14;
    }
}
