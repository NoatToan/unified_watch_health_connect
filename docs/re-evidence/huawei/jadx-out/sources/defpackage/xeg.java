package defpackage;

import android.content.Context;
import android.util.Pair;
import com.huawei.uikit.hwcolumnsystem.widget.bqmxo;

/* JADX INFO: loaded from: classes20.dex */
public class xeg extends bqmxo {
    private int ap;
    private int aq;
    private static final int[] ai = {4, 8, 12};
    private static final int[] ah = {4, 6, 8};
    private static final int[] af = {4, 6, 8};
    private static final int[] ae = {2, 3, 4};
    private static final int[] ag = {4, 6, 8};
    private static final int[] aj = {2, 3, 4};
    private static final int[] al = {4, 6, 8};
    private static final int[] ak = {4, 6, 8};
    private static final int[] am = {4, 6, 8};
    private static final int[] an = {4, 6, 6};
    private static final int[] ao = {4, 6, 6};
    private static final int[] e = {4, 6, 8};
    private static final int[] d = {4, 6, 8};
    private static final int[] i = {4, 6, 8};
    private static final int[] j = {4, 6, 8};
    private static final int[] g = {2, 2, 2};
    private static final int[] h = {4, 6, 6};
    private static final int[] l = {2, 2, 2};
    private static final int[] k = {4, 6, 6};
    private static final int[] o = {4, 6, 10};
    private static final int[] n = {4, 6, 10};
    private static final int[] m = {-2, 8, 12};
    private static final int[] p = {-2, 8, 12};
    private static final int[] t = {4, 6, 6};
    private static final int[] s = {4, 6, 6};
    private static final int[] r = {-2, 8, 8};
    private static final int[] q = {-2, 8, 8};
    private static final int[] u = {4, 6, 10};
    private static final int[] v = {4, 6, 10};
    private static final int[] w = {4, 6, 8};
    private static final int[] x = {4, 6, 8};
    private static final int[] y = {4, 6, 6};
    private static final int[] ad = {4, 6, 6};
    private static final int[] z = {-2, 6, 6};
    private static final int[] ab = {-2, 6, 6};
    private static final int[][] aa = {new int[]{4, 6, 8}, new int[]{2, 3, 4}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 6}, new int[]{2, 2, 2}, new int[]{4, 6, 6}, new int[]{-2, 8, 8}, new int[]{4, 6, 10}, new int[]{-2, 8, 12}, new int[]{2, 2, 2}, new int[]{4, 6, 8}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{2, 3, 4}, new int[]{4, 6, 8}, new int[]{-2, 6, 6}, new int[]{4, 6, 10}, new int[]{4, 6, 6}};
    private static final int[][] ac = {new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{4, 6, 6}, new int[]{4, 6, 6}, new int[]{4, 6, 6}, new int[]{-2, 8, 8}, new int[]{4, 6, 10}, new int[]{-2, 8, 12}, new int[]{4, 6, 6}, new int[]{4, 6, 8}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 4, 5}, new int[]{4, 6, 8}, new int[]{4, 6, 8}, new int[]{-2, 6, 6}, new int[]{4, 6, 10}, new int[]{4, 6, 6}};

    public xeg(Context context) {
        super(context);
        this.ap = 32;
        this.aq = 16;
        this.f29349a = 520;
        this.f29350b = 840;
    }

    private int p() {
        return a(this.aq);
    }

    private int q() {
        return a(this.ap);
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
    public int b(int i2, int i3, int i4) {
        return 0;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef b() {
        int iQ = q();
        int iP = p();
        int[] iArr = an;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], ao[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef c() {
        int iQ = q();
        int iP = p();
        int[] iArr = ae;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], ag[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef d() {
        int iQ = q();
        int iP = p();
        int[] iArr = aj;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], al[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef e() {
        int iQ = q();
        int iP = p();
        int[] iArr = ak;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], am[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef f() {
        int iQ = q();
        int iP = p();
        int[] iArr = i;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], j[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef g() {
        int iQ = q();
        int iP = p();
        int[] iArr = ah;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], af[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef h() {
        int iQ = q();
        int iP = p();
        int[] iArr = e;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], d[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef i() {
        int iQ = q();
        int iP = p();
        int[] iArr = m;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], p[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef j() {
        int iQ = q();
        int iP = p();
        int[] iArr = r;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], q[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef k() {
        int iQ = q();
        int iP = p();
        int[] iArr = l;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], k[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef l() {
        int iQ = q();
        int iP = p();
        int[] iArr = o;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], n[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef m() {
        int iQ = q();
        int iP = p();
        int[] iArr = t;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], s[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef n() {
        int iQ = q();
        int iP = p();
        int[] iArr = g;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], h[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public int o() {
        return ai[this.f29351c];
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public boolean b(int i2) {
        return i2 >= 0 && i2 < aa.length && i2 < ac.length;
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef c(int i2, int i3, int i4) {
        int iQ = q();
        int iP = p();
        int[] iArr = u;
        int i5 = this.f29351c;
        return new xef(iQ, iP, iArr[i5], v[i5]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef d(int i2, int i3, int i4) {
        int iQ = q();
        int iP = p();
        int[] iArr = y;
        int i5 = this.f29351c;
        return new xef(iQ, iP, iArr[i5], ad[i5]);
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
        int iQ = q();
        int iP = p();
        int[] iArr = w;
        int i5 = this.f29351c;
        return new xef(iQ, iP, iArr[i5], x[i5]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef a() {
        int iQ = q();
        int iP = p();
        int[] iArr = z;
        int i2 = this.f29351c;
        return new xef(iQ, iP, iArr[i2], ab[i2]);
    }

    @Override // com.huawei.uikit.hwcolumnsystem.widget.bqmxo
    public xef a(int i2, Pair<Integer, Integer> pair, int i3, int i4, float f) {
        return new xef(q(), p(), aa[i3][i4], ac[i3][i4]);
    }
}
