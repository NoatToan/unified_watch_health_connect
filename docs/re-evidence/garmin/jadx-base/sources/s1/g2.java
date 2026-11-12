package s1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ls1/g2;", "Ls1/s;", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0[] f155587a;

    /* JADX WARN: Multi-variable type inference failed */
    public g2(Object obj, float f14, float f15) {
        int f155674c = obj.getF155674c();
        j0[] j0VarArr = new j0[f155674c];
        for (int i14 = 0; i14 < f155674c; i14++) {
            j0VarArr[i14] = new j0(f14, f15, obj.a(i14));
        }
        this.f155587a = j0VarArr;
    }

    @Override // s1.s
    public final g0 get(int i14) {
        return this.f155587a[i14];
    }
}
