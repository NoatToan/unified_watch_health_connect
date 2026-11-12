package m6;

import i3.e5;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.lang3.StringUtils;
import v.e0;

/* JADX INFO: loaded from: classes.dex */
public class g extends m6.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h[] f116847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h[] f116848g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f116849h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f116850i;

    public class a implements Comparator<h> {
        public a(g gVar) {
        }

        @Override // java.util.Comparator
        public final int compare(h hVar, h hVar2) {
            return hVar.f116855c - hVar2.f116855c;
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f116851a;

        public b(g gVar) {
        }

        public final String toString() {
            String strE = "[ ";
            if (this.f116851a != null) {
                for (int i14 = 0; i14 < 9; i14++) {
                    strE = e0.e(this.f116851a.f116861i[i14], StringUtils.SPACE, e5.k(strE));
                }
            }
            StringBuilder sbI = sn.a.i(strE, "] ");
            sbI.append(this.f116851a);
            return sbI.toString();
        }
    }

    public g(c cVar) {
        super(cVar);
        this.f116847f = new h[128];
        this.f116848g = new h[128];
        this.f116849h = 0;
        this.f116850i = new b(this);
    }

    @Override // m6.b, m6.d.a
    public final h a(boolean[] zArr) {
        int i14 = -1;
        for (int i15 = 0; i15 < this.f116849h; i15++) {
            h[] hVarArr = this.f116847f;
            h hVar = hVarArr[i15];
            if (!zArr[hVar.f116855c]) {
                b bVar = this.f116850i;
                bVar.f116851a = hVar;
                int i16 = 8;
                if (i14 != -1) {
                    h hVar2 = hVarArr[i14];
                    while (i16 >= 0) {
                        float f14 = hVar2.f116861i[i16];
                        float f15 = bVar.f116851a.f116861i[i16];
                        if (f15 != f14) {
                            if (f15 >= f14) {
                                break;
                            }
                            i14 = i15;
                            break;
                            break;
                        }
                        i16--;
                    }
                } else {
                    while (i16 >= 0) {
                        float f16 = bVar.f116851a.f116861i[i16];
                        if (f16 > 0.0f) {
                            break;
                        }
                        if (f16 < 0.0f) {
                            i14 = i15;
                            break;
                        }
                        i16--;
                    }
                }
            }
        }
        if (i14 == -1) {
            return null;
        }
        return this.f116847f[i14];
    }

    @Override // m6.b
    public final boolean e() {
        return this.f116849h == 0;
    }

    @Override // m6.b
    public final void i(d dVar, m6.b bVar, boolean z14) {
        h hVar = bVar.f116811a;
        if (hVar == null) {
            return;
        }
        float[] fArr = hVar.f116861i;
        m6.b.a aVar = bVar.f116814d;
        int iJ = aVar.j();
        for (int i14 = 0; i14 < iJ; i14++) {
            h hVarH = aVar.h(i14);
            float f14 = aVar.f(i14);
            b bVar2 = this.f116850i;
            bVar2.f116851a = hVarH;
            if (hVarH.f116853a) {
                boolean z15 = true;
                for (int i15 = 0; i15 < 9; i15++) {
                    float[] fArr2 = bVar2.f116851a.f116861i;
                    float f15 = (fArr[i15] * f14) + fArr2[i15];
                    fArr2[i15] = f15;
                    if (Math.abs(f15) < 1.0E-4f) {
                        bVar2.f116851a.f116861i[i15] = 0.0f;
                    } else {
                        z15 = false;
                    }
                }
                if (z15) {
                    g.this.k(bVar2.f116851a);
                }
            } else {
                for (int i16 = 0; i16 < 9; i16++) {
                    float f16 = fArr[i16];
                    if (f16 != 0.0f) {
                        float f17 = f16 * f14;
                        if (Math.abs(f17) < 1.0E-4f) {
                            f17 = 0.0f;
                        }
                        bVar2.f116851a.f116861i[i16] = f17;
                    } else {
                        bVar2.f116851a.f116861i[i16] = 0.0f;
                    }
                }
                j(hVarH);
            }
            this.f116812b = (bVar.f116812b * f14) + this.f116812b;
        }
        k(hVar);
    }

    public final void j(h hVar) {
        int i14;
        h[] hVarArr;
        int i15 = this.f116849h + 1;
        h[] hVarArr2 = this.f116847f;
        if (i15 > hVarArr2.length) {
            h[] hVarArr3 = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
            this.f116847f = hVarArr3;
            this.f116848g = (h[]) Arrays.copyOf(hVarArr3, hVarArr3.length * 2);
        }
        h[] hVarArr4 = this.f116847f;
        int i16 = this.f116849h;
        hVarArr4[i16] = hVar;
        int i17 = i16 + 1;
        this.f116849h = i17;
        if (i17 > 1 && hVarArr4[i16].f116855c > hVar.f116855c) {
            int i18 = 0;
            while (true) {
                i14 = this.f116849h;
                hVarArr = this.f116848g;
                if (i18 >= i14) {
                    break;
                }
                hVarArr[i18] = this.f116847f[i18];
                i18++;
            }
            Arrays.sort(hVarArr, 0, i14, new a(this));
            for (int i19 = 0; i19 < this.f116849h; i19++) {
                this.f116847f[i19] = this.f116848g[i19];
            }
        }
        hVar.f116853a = true;
        hVar.a(this);
    }

    public final void k(h hVar) {
        int i14 = 0;
        while (i14 < this.f116849h) {
            if (this.f116847f[i14] == hVar) {
                while (true) {
                    int i15 = this.f116849h;
                    if (i14 >= i15 - 1) {
                        this.f116849h = i15 - 1;
                        hVar.f116853a = false;
                        return;
                    } else {
                        h[] hVarArr = this.f116847f;
                        int i16 = i14 + 1;
                        hVarArr[i14] = hVarArr[i16];
                        i14 = i16;
                    }
                }
            } else {
                i14++;
            }
        }
    }

    @Override // m6.b
    public final String toString() {
        String strE = e0.e(this.f116812b, ") : ", new StringBuilder(" goal -> ("));
        for (int i14 = 0; i14 < this.f116849h; i14++) {
            h hVar = this.f116847f[i14];
            b bVar = this.f116850i;
            bVar.f116851a = hVar;
            strE = strE + bVar + StringUtils.SPACE;
        }
        return strE;
    }
}
