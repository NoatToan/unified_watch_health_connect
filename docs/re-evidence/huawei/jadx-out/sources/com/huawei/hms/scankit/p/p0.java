package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class p0 extends g5 {
    public static final char[] e = "0123456789-$:/.+ABCD".toCharArray();
    public static final int[] f = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] g = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f16251a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f16252b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f16253c = 0;
    private int d;

    private void c(int i) throws a {
        int i2 = 0;
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f16251a.length() - 1;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f[this.f16251a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) * 2);
                iArr[i7] = iArr[i7] + this.f16252b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            float f2 = iArr[i8] / iArr2[i8];
            float f3 = iArr[i9];
            float f4 = iArr2[i9];
            float f5 = (f2 + (f3 / f4)) / 2.0f;
            fArr2[i9] = f5;
            fArr[i8] = f5;
            fArr[i9] = ((f3 * 2.0f) + 1.5f) / f4;
        }
        loop3: while (true) {
            int i10 = f[this.f16251a.charAt(i2)];
            for (int i11 = 6; i11 >= 0; i11--) {
                int i12 = (i11 & 1) + ((i10 & 1) * 2);
                float f6 = this.f16252b[i + i11];
                if (f6 < fArr2[i12] || f6 > fArr[i12]) {
                    break loop3;
                }
                i10 >>= 1;
            }
            if (i2 >= length) {
                return;
            }
            i += 8;
            i2++;
        }
        throw a.a();
    }

    private int b() throws a {
        for (int i = 1; i < this.f16253c; i += 2) {
            int iB = b(i);
            if (iB != -1 && a(g, e[iB])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f16252b[i3];
                }
                if (i == 1 || this.f16252b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw a.a();
    }

    public static boolean a(char[] cArr, char c2) {
        if (cArr != null) {
            for (char c3 : cArr) {
                if (c3 == c2) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(int i) throws a {
        try {
            int[] iArr = this.f16252b;
            int i2 = this.f16253c;
            iArr[i2] = i;
            int i3 = i2 + 1;
            this.f16253c = i3;
            if (i3 >= iArr.length) {
                int[] iArr2 = new int[i3 * 2];
                System.arraycopy(iArr, 0, iArr2, 0, i3);
                this.f16252b = iArr2;
            }
        } catch (NumberFormatException unused) {
            throw a.a();
        }
    }

    private int b(int i) {
        int i2 = i + 7;
        if (i2 >= this.f16253c) {
            return -1;
        }
        int[] iArr = this.f16252b;
        HashSet hashSet = new HashSet();
        for (int i3 = i; i3 < i2; i3++) {
            hashSet.add(Integer.valueOf(iArr[i3]));
        }
        Iterator it = hashSet.iterator();
        int i4 = 0;
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        if (hashSet.size() > 0) {
            int size = iIntValue / hashSet.size();
            int i5 = 128;
            int i6 = 0;
            for (int i7 = 0; i7 < 7; i7++) {
                i5 >>= 1;
                if (iArr[i + i7] > size) {
                    i6 |= i5;
                }
            }
            while (true) {
                int[] iArr2 = f;
                if (i4 >= iArr2.length) {
                    break;
                }
                if (iArr2[i4] == i6) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) throws a {
        Arrays.fill(this.f16252b, 0);
        a(rVar);
        int[] iArrA = a();
        int i2 = iArrA[0];
        int i3 = iArrA[1];
        for (int i4 = 0; i4 < this.f16251a.length(); i4++) {
            StringBuilder sb = this.f16251a;
            sb.setCharAt(i4, e[sb.charAt(i4)]);
        }
        char cCharAt = this.f16251a.charAt(0);
        char[] cArr = g;
        if (a(cArr, cCharAt)) {
            StringBuilder sb2 = this.f16251a;
            if (a(cArr, sb2.charAt(sb2.length() - 1))) {
                if (this.f16251a.length() > 3) {
                    int i5 = this.d;
                    for (int i6 = 0; i6 < i2; i6++) {
                        i5 += this.f16252b[i6];
                    }
                    float f2 = i5;
                    while (i2 < i3 - 1) {
                        i5 += this.f16252b[i2];
                        i2++;
                    }
                    float f3 = i;
                    return new s6(this.f16251a.toString(), null, new u6[]{new u6(f2, f3), new u6(i5, f3)}, BarcodeFormat.CODABAR);
                }
                throw a.a();
            }
            throw a.a();
        }
        throw a.a();
    }

    private int[] a() throws a {
        int i;
        int iB = b();
        int i2 = 0;
        this.f16251a.setLength(0);
        int i3 = iB;
        while (true) {
            int iB2 = b(i3);
            if (iB2 != -1) {
                this.f16251a.append((char) iB2);
                i = i3 + 8;
                if ((this.f16251a.length() > 1 && a(g, e[iB2])) || i >= this.f16253c) {
                    break;
                }
                i3 = i;
            } else {
                throw a.a();
            }
        }
        int i4 = this.f16252b[i3 + 7];
        for (int i5 = -8; i5 < -1; i5++) {
            i2 += this.f16252b[i + i5];
        }
        if (i < this.f16253c && i4 < i2 / 2) {
            throw a.a();
        }
        c(iB);
        return new int[]{iB, i};
    }

    private void a(r rVar) throws a {
        int i = 0;
        this.f16253c = 0;
        int iD = rVar.d(0);
        this.d = iD;
        int iD2 = rVar.d();
        if (iD < iD2) {
            boolean z = true;
            while (iD < iD2) {
                if (rVar.b(iD) != z) {
                    i++;
                } else {
                    a(i);
                    z = !z;
                    i = 1;
                }
                iD++;
            }
            a(i);
            return;
        }
        throw a.a();
    }
}
