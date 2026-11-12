package a3;

import f5.v1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class h implements f5.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f675b;

    public h(float f14, float f15) {
        this.f674a = f14;
        this.f675b = f15;
    }

    public static final void a(ArrayList arrayList, p005kotlin.jvm.internal.p0 p0Var, f5.b1 b1Var, float f14, ArrayList arrayList2, ArrayList arrayList3, p005kotlin.jvm.internal.p0 p0Var2, ArrayList arrayList4, p005kotlin.jvm.internal.p0 p0Var3, p005kotlin.jvm.internal.p0 p0Var4) {
        if (!arrayList.isEmpty()) {
            p0Var.f105807a = b1Var.f0(f14) + p0Var.f105807a;
        }
        arrayList.add(0, p13.h0.b1(arrayList2));
        arrayList3.add(Integer.valueOf(p0Var2.f105807a));
        arrayList4.add(Integer.valueOf(p0Var.f105807a));
        p0Var.f105807a += p0Var2.f105807a;
        p0Var3.f105807a = Math.max(p0Var3.f105807a, p0Var4.f105807a);
        arrayList2.clear();
        p0Var4.f105807a = 0;
        p0Var2.f105807a = 0;
    }

    @Override // f5.z0
    public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
        v1 v1Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
        p005kotlin.jvm.internal.p0 p0Var2 = new p005kotlin.jvm.internal.p0();
        ArrayList arrayList4 = new ArrayList();
        p005kotlin.jvm.internal.p0 p0Var3 = new p005kotlin.jvm.internal.p0();
        p005kotlin.jvm.internal.p0 p0Var4 = new p005kotlin.jvm.internal.p0();
        int i14 = 0;
        long jB = g6.b.b(g6.a.j(j8), 0, 13);
        int size = list.size();
        while (i14 < size) {
            v1 v1VarQ = list.get(i14).Q(jB);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i15 = size;
            float f14 = this.f674a;
            if (zIsEmpty) {
                v1Var = v1VarQ;
            } else {
                ArrayList arrayList5 = arrayList;
                p005kotlin.jvm.internal.p0 p0Var5 = p0Var2;
                if (b1Var.f0(f14) + p0Var3.f105807a + v1VarQ.f69144a <= g6.a.j(j8)) {
                    arrayList = arrayList5;
                    p0Var2 = p0Var5;
                    v1Var = v1VarQ;
                } else {
                    p0Var2 = p0Var5;
                    v1Var = v1VarQ;
                    arrayList = arrayList5;
                    a(arrayList, p0Var2, b1Var, this.f675b, arrayList4, arrayList2, p0Var4, arrayList3, p0Var, p0Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                p0Var3.f105807a = b1Var.f0(f14) + p0Var3.f105807a;
            }
            arrayList4.add(v1Var);
            p0Var3.f105807a += v1Var.f69144a;
            p0Var4.f105807a = Math.max(p0Var4.f105807a, v1Var.f69145b);
            i14++;
            size = i15;
        }
        if (!arrayList4.isEmpty()) {
            a(arrayList, p0Var2, b1Var, this.f675b, arrayList4, arrayList2, p0Var4, arrayList3, p0Var, p0Var3);
        }
        int iJ = g6.a.j(j8) != Integer.MAX_VALUE ? g6.a.j(j8) : Math.max(p0Var.f105807a, g6.a.l(j8));
        return f5.b1.h0(b1Var, iJ, Math.max(p0Var2.f105807a, g6.a.k(j8)), new g(arrayList, b1Var, this.f674a, iJ, arrayList3, 0));
    }
}
