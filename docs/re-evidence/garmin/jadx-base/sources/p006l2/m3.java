package p006l2;

import e23.a;
import f5.a1;
import f5.b1;
import f5.y0;
import f5.z0;
import g6.b;
import g6.k;
import java.util.ArrayList;
import java.util.List;
import n4.d;
import o13.p;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll2/m3;", "Lf5/z0;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Ln4/d;", "placements", "<init>", "(Le23/a;Le23/a;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m3 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<Boolean> f108665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<List<d>> f108666b;

    /* JADX WARN: Multi-variable type inference failed */
    public m3(a<Boolean> aVar, a<? extends List<d>> aVar2) {
        this.f108665a = aVar;
        this.f108666b = aVar2;
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        ArrayList arrayList;
        p pVar;
        ArrayList arrayList2 = new ArrayList(list.size());
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            y0 y0Var = list.get(i14);
            if (!(y0Var.getA() instanceof q3)) {
                arrayList2.add(y0Var);
            }
        }
        List<d> listInvoke = this.f108666b.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i15 = 0; i15 < size2; i15++) {
                d dVar = listInvoke.get(i15);
                if (dVar != null) {
                    float f14 = dVar.f123548b;
                    float f15 = dVar.f123547a;
                    pVar = new p(((y0) arrayList2.get(i15)).Q(b.b((int) Math.floor(dVar.f123549c - f15), (int) Math.floor(dVar.f123550d - f14), 5)), k.a((((long) Math.round(f15)) << 32) | (((long) Math.round(f14)) & 4294967295L)));
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    arrayList3.add(pVar);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i16 = 0; i16 < size3; i16++) {
            y0 y0Var2 = list.get(i16);
            if (y0Var2.getA() instanceof q3) {
                arrayList4.add(y0Var2);
            }
        }
        return b1.h0(b1Var, g6.a.j(j8), g6.a.i(j8), new l3(arrayList, y.d(arrayList4, this.f108665a), 0));
    }
}
