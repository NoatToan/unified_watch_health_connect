package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import com.huawei.uikit.hwcolumnsystem.widget.bqmxo;

/* JADX INFO: loaded from: classes20.dex */
public class xec extends bqmxo {
    private Context cg;
    private static final int[] bb = {4, 8, 12};
    private static final int[] bh = {24, 24, 24};
    private static final int[] bg = {24, 24, 24};
    private static final int[] bd = {4, 6, 8};
    private static final int[] bm = {4, 6, 8};
    private static final int[] bi = {24, 24, 24};
    private static final int[] bp = {24, 24, 24};
    private static final int[] bo = {2, 3, 4};
    private static final int[] bn = {4, 6, 8};
    private static final int[] bs = {12, 12, 12};
    private static final int[] bt = {12, 12, 12};
    private static final int[] bz = {2, 3, 4};
    private static final int[] bx = {4, 6, 8};
    private static final int[] ca = {12, 12, 12};
    private static final int[] e = {12, 12, 12};
    private static final int[] h = {4, 6, 8};
    private static final int[] i = {4, 6, 8};
    private static final int[] l = {24, 24, 24};
    private static final int[] n = {24, 24, 24};
    private static final int[] m = {4, 6, 6};
    private static final int[] t = {4, 6, 6};
    private static final int[] p = {24, 24, 24};
    private static final int[] r = {24, 24, 24};
    private static final int[] v = {4, 6, 8};
    private static final int[] w = {4, 6, 8};
    private static final int[] u = {12, 12, 12};
    private static final int[] y = {12, 12, 12};
    private static final int[] ac = {4, 6, 8};
    private static final int[] aa = {4, 6, 8};
    private static final int[] ah = {24, 24, 24};
    private static final int[] af = {24, 24, 24};
    private static final int[] ag = {2, 2, 2};
    private static final int[] ae = {4, 6, 6};
    private static final int[] ai = {24, 24, 24};
    private static final int[] aj = {24, 24, 24};
    private static final int[] ak = {2, 2, 2};
    private static final int[] an = {4, 6, 8};
    private static final int[] am = {24, 24, 24};
    private static final int[] al = {24, 24, 24};
    private static final int[] ap = {4, 6, 10};
    private static final int[] ar = {4, 6, 10};
    private static final int[] aq = {24, 24, 24};
    private static final int[] as = {24, 24, 24};
    private static final int[] ao = {-2, 8, 12};
    private static final int[] aw = {-2, 8, 12};
    private static final int[] au = {24, 24, 24};
    private static final int[] av = {24, 24, 24};
    private static final int[] at = {4, 6, 6};
    private static final int[] ax = {4, 6, 6};
    private static final int[] bc = {24, 24, 24};
    private static final int[] ay = {24, 24, 24};
    private static final int[] ba = {-2, 8, 8};
    private static final int[] az = {-2, 8, 8};
    private static final int[] be = {12, 12, 12};
    private static final int[] bf = {12, 12, 12};
    private static final int[] bj = {3, 4, 5};
    private static final int[] bl = {3, 4, 5};
    private static final int[] bk = {12, 12, 12};
    private static final int[] bq = {12, 12, 12};
    private static final int[] br = {4, 5, 6};
    private static final int[] bu = {4, 5, 6};
    private static final int[] bw = {12, 12, 12};
    private static final int[] bv = {12, 12, 12};
    private static final int[] by = {2, 3, 4};
    private static final int[] cb = {2, 3, 4};
    private static final int[] cf = {12, 12, 12};
    private static final int[] d = {12, 12, 12};
    private static final int[] g = {3, 4, 5};
    private static final int[] j = {3, 4, 5};
    private static final int[] o = {12, 12, 12};
    private static final int[] k = {12, 12, 12};
    private static final int[] s = {-2, 6, 6};
    private static final int[] q = {-2, 6, 6};
    private static final int[][] x = {new int[]{4, 6, 8}, new int[]{2, 3, 4}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 6}, new int[]{2, 2, 2}, new int[]{4, 6, 6}, new int[]{-2, 8, 8}, new int[]{4, 6, 10}, new int[]{-2, 8, 12}, new int[]{2, 2, 2}, new int[]{4, 6, 8}, new int[]{4, 4, 5}, new int[]{3, 4, 5}, new int[]{4, 5, 6}, new int[]{2, 3, 4}, new int[]{3, 4, 5}, new int[]{2, 3, 4}, new int[]{4, 6, 8}, new int[]{-2, 6, 6}};
    private static final int[][] ab = {new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 6}, new int[]{4, 6, 6}, new int[]{4, 6, 6}, new int[]{-2, 8, 8}, new int[]{4, 6, 10}, new int[]{-2, 8, 12}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 4, 5}, new int[]{3, 4, 5}, new int[]{4, 5, 6}, new int[]{2, 3, 4}, new int[]{3, 4, 5}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{-2, 6, 6}};
    private static final int[][] ad = {new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{12, 12, 12}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{16, 16, 16}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}};
    private static final int[][] z = {new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{12, 12, 12}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{24, 24, 24}, new int[]{16, 16, 16}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}, new int[]{12, 12, 12}};

    public xec(Context context) {
        super(context);
        this.cg = context;
        this.f29349a = 520;
        this.f29350b = 840;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x001e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x001f A[RETURN] */
    private int c(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 4) {
            if (i3 * 16 > i4 * 9) {
                return i5;
            }
            return i6;
        }
        if (i2 == 8) {
            if (i3 * 4 > i4 * 3) {
                return i5;
            }
            return i6;
        }
        if (i2 != 12) {
            return 12;
        }
        if (i3 * 3 > i4 * 4) {
            return i5;
        }
        return i6;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public Pair<Integer, String> a(int i2, String[] strArr, float f) {
        String str;
        int i3;
        if (i2 >= a(840, f)) {
            str = strArr[2];
            i3 = 12;
        } else if (i2 >= a(520, f)) {
            str = strArr[1];
            i3 = 8;
        } else {
            str = strArr[0];
            i3 = 4;
        }
        return new Pair<>(Integer.valueOf(i3), str);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef b() {
        int iA = a(l[this.f29351c]);
        int iA2 = a(n[this.f29351c]);
        int[] iArr = m;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], t[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef c() {
        int iA = a(bi[this.f29351c]);
        int iA2 = a(bp[this.f29351c]);
        int[] iArr = bo;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], bn[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef d() {
        int iA = a(bs[this.f29351c]);
        int iA2 = a(bt[this.f29351c]);
        int[] iArr = bz;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], bx[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef e() {
        int iA = a(ca[this.f29351c]);
        int iA2 = a(e[this.f29351c]);
        int[] iArr = h;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], i[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef f() {
        int iA = a(u[this.f29351c]);
        int iA2 = a(y[this.f29351c]);
        int[] iArr = ac;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], aa[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef g() {
        int iA = a(bh[this.f29351c]);
        int iA2 = a(bg[this.f29351c]);
        int[] iArr = bd;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], bm[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef h() {
        int iA = a(p[this.f29351c]);
        int iA2 = a(r[this.f29351c]);
        int[] iArr = v;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], w[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef i() {
        int iA = a(aq[this.f29351c]);
        int iA2 = a(as[this.f29351c]);
        int[] iArr = ao;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], aw[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef j() {
        int iA = a(bc[this.f29351c]);
        int iA2 = a(ay[this.f29351c]);
        int[] iArr = ba;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], az[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef k() {
        int iA = a(ai[this.f29351c]);
        int iA2 = a(aj[this.f29351c]);
        int[] iArr = ak;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], an[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef l() {
        int iA = a(am[this.f29351c]);
        int iA2 = a(al[this.f29351c]);
        int[] iArr = ap;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], ar[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef m() {
        int iA = a(au[this.f29351c]);
        int iA2 = a(av[this.f29351c]);
        int[] iArr = at;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], ax[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef n() {
        int iA = a(ah[this.f29351c]);
        int iA2 = a(af[this.f29351c]);
        int[] iArr = ag;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], ae[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public int o() {
        return bb[this.f29351c];
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public int b(int i2, int i3, int i4) {
        if (Double.compare(a(i2, i3), 12.0d) < 0) {
            return c(i4, i2, i3, 13, 14);
        }
        return c(i4, i2, i3, 15, 16);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef c(int i2, int i3, int i4) {
        return a(i2, i3, i4);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef d(int i2, int i3, int i4) {
        return a(i2, i3, i4);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public boolean b(int i2) {
        return i2 >= 0 && i2 < ad.length;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public Pair<Integer, Integer> a(float f) {
        int i2;
        int i3;
        if (f > 840.0f || a(f, 840.0f)) {
            i2 = 12;
            i3 = 2;
        } else if (f > 520.0f || a(f, 520.0f)) {
            i2 = 8;
            i3 = 1;
        } else {
            i2 = 4;
            i3 = 0;
        }
        return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef a(int i2, int i3, int i4) {
        int iA;
        int iA2;
        int i5;
        int i6;
        switch (b(i3, i4, i2)) {
            case 13:
                iA = a(be[this.f29351c]);
                iA2 = a(bf[this.f29351c]);
                int[] iArr = bj;
                int i7 = this.f29351c;
                i5 = iArr[i7];
                i6 = bl[i7];
                break;
            case 14:
                iA = a(bk[this.f29351c]);
                iA2 = a(bq[this.f29351c]);
                int[] iArr2 = br;
                int i8 = this.f29351c;
                i5 = iArr2[i8];
                i6 = bu[i8];
                break;
            case 15:
                iA = a(bw[this.f29351c]);
                iA2 = a(bv[this.f29351c]);
                int[] iArr3 = by;
                int i9 = this.f29351c;
                i5 = iArr3[i9];
                i6 = cb[i9];
                break;
            case 16:
                iA = a(cf[this.f29351c]);
                iA2 = a(d[this.f29351c]);
                int[] iArr4 = g;
                int i10 = this.f29351c;
                i5 = iArr4[i10];
                i6 = j[i10];
                break;
            default:
                iA = 0;
                iA2 = 0;
                i5 = 0;
                i6 = 0;
                break;
        }
        return new xef(iA, iA2, i5, i6);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef a() {
        int iA = a(o[this.f29351c]);
        int iA2 = a(k[this.f29351c]);
        int[] iArr = s;
        int i2 = this.f29351c;
        return new xef(iA, iA2, iArr[i2], q[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef a(int i2, Pair<Integer, Integer> pair, int i3, int i4, float f) {
        if (i3 == 20 || i3 == 21) {
            i3 = 12;
        }
        if (i3 >= 12 && i3 <= 16) {
            i3 = b(((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), i2);
        }
        return new xef(a(ad[i3][i4], f), a(z[i3][i4], f), x[i3][i4], ab[i3][i4]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private double a(int i2, int i3) {
        float f;
        DisplayMetrics displayMetrics = this.cg.getResources().getDisplayMetrics();
        float f2 = displayMetrics.xdpi;
        float f3 = 0.0f;
        if (f2 != 0.0f) {
            float f4 = displayMetrics.ydpi;
            if (f4 != 0.0f) {
                f3 = i2 / f2;
                f = i3 / f4;
            } else {
                Log.w("HwColumnDelegate", "displayMetrics.xdpi or displayMetrics.ydpi get failed.");
                f = 0.0f;
            }
        } else {
            Log.w("HwColumnDelegate", "displayMetrics.xdpi or displayMetrics.ydpi get failed.");
            f = 0.0f;
        }
        return Math.sqrt((f3 * f3) + (f * f));
    }
}
