package defpackage;

import com.google.typography.font.sfntly.Font;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class oac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Font.b f28919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f28920b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f28922b;

        public a(int i, int i2) {
            this.f28921a = i;
            this.f28922b = i2;
        }
    }

    public oac(Font.b bVar, List<a> list) {
        this.f28919a = bVar;
        this.f28920b = list;
    }

    public void a() {
        int size = this.f28920b.size();
        if (size <= 0) {
            throw new IllegalArgumentException("nMetrics must be positive");
        }
        int i = this.f28920b.get(size - 1).f28921a;
        int i2 = size;
        while (i2 > 1 && this.f28920b.get(i2 - 2).f28921a == i) {
            i2--;
        }
        apr aprVarC = apr.C((i2 * 4) + ((size - i2) * 2));
        int iMax = 0;
        int iN = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f28920b.get(i3).f28921a;
            iMax = Math.max(i4, iMax);
            int iQ = iN + aprVarC.Q(iN, i4);
            iN = iQ + aprVarC.N(iQ, this.f28920b.get(i3).f28922b);
        }
        for (int i5 = i2; i5 < size; i5++) {
            iN += aprVarC.N(iN, this.f28920b.get(i5).f28922b);
        }
        this.f28919a.l(tzo.e, aprVarC);
        mac.b bVar = (mac.b) this.f28919a.f(tzo.d);
        bVar.B(i2);
        bVar.A(iMax);
    }
}
