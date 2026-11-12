package g11;

import c22.t;
import f5.a1;
import f5.b1;
import f5.v1;
import f5.y0;
import f5.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.p0;
import p13.h0;
import p13.w;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class b implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f74844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f74845b;

    public b(float f14, float f15) {
        this.f74844a = f14;
        this.f74845b = f15;
    }

    @Override // f5.z0
    public final a1 f(b1 b1Var, List<? extends y0> list, long j8) {
        boolean z14;
        int size;
        b1Var.getClass();
        list.getClass();
        int iF0 = b1Var.f0(this.f74844a);
        int iJ = (g6.a.j(j8) - iF0) / 2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list.isEmpty()) {
            z14 = true;
            break;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z14 = true;
                break;
            }
            if (((y0) it.next()).l0(Integer.MAX_VALUE) > iJ) {
                z14 = false;
                break;
            }
        }
        for (y0 y0Var : list) {
            if (z14) {
                arrayList2.add(y0Var.Q(g6.a.c(iJ, iJ, 0, 0, 12, j8)));
                if (arrayList2.size() == 2) {
                    arrayList.add(h0.b1(arrayList2));
                    arrayList2.clear();
                }
            } else {
                arrayList.add(w.c(y0Var.Q(g6.a.c(g6.a.j(j8), g6.a.j(j8), 0, 0, 12, j8))));
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(h0.b1(arrayList2));
        }
        int iF1 = b1Var.f0(this.f74845b);
        p0 p0Var = new p0();
        if (arrayList.isEmpty()) {
            size = 0;
        } else {
            Iterator it3 = arrayList.iterator();
            int i14 = 0;
            while (it3.hasNext()) {
                Iterator it4 = ((List) it3.next()).iterator();
                if (!it4.hasNext()) {
                    t.g();
                    return null;
                }
                int i15 = ((v1) it4.next()).f69145b;
                while (it4.hasNext()) {
                    int i16 = ((v1) it4.next()).f69145b;
                    if (i15 < i16) {
                        i15 = i16;
                    }
                }
                i14 += i15;
            }
            size = i14 + ((arrayList.size() - 1) * iF1);
        }
        return b1.h0(b1Var, g6.a.j(j8), size, new a11.e(arrayList, p0Var, iF1, iF0));
    }
}
