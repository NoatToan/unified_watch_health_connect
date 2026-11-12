package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q7 extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f16286c = {1, 1, 1};
    public static final int[] d = {1, 1, 1, 1, 1};
    public static final int[] e = {1, 1, 1, 1, 1, 1};
    public static final int[][] f;
    public static final int[][] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f16287a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7 f16288b = new p7();

    protected abstract int a(r rVar, int[] iArr, StringBuilder sb);

    abstract BarcodeFormat a();

    abstract boolean a(int i, int i2, r rVar);

    abstract boolean a(int[] iArr, int[] iArr2);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f = iArr;
        int[][] iArr2 = new int[20][];
        g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            g[i] = iArr4;
        }
    }

    protected q7() {
    }

    static int[] b(r rVar, int i) {
        int[] iArr = new int[f16286c.length];
        int[] iArrA = null;
        boolean zA = false;
        while (!zA) {
            int[] iArr2 = f16286c;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrA = a(rVar, i, false, iArr2, iArr);
            int i2 = iArrA[0];
            int i3 = iArrA[1];
            int i4 = i2 - (i3 - i2);
            for (int i5 = i4; i5 <= i4 + 3 && (i5 < 0 || !(zA = rVar.a(i5, i2, false, true))); i5++) {
            }
            i = i3;
        }
        return iArrA;
    }

    static ArrayList b(r rVar) throws a {
        int iD = rVar.d() / 2;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < iD) {
            try {
                int[] iArrB = b(rVar, i);
                arrayList.add(iArrB);
                i = iArrB[0] + 1;
            } catch (a unused) {
            }
        }
        if (arrayList.size() != 0) {
            return arrayList;
        }
        throw a.a();
    }

    boolean a(String str) {
        return a((CharSequence) str);
    }

    private void a(s6 s6Var, int[] iArr, int i, r rVar, Map map) throws a {
        int length;
        try {
            s6 s6VarA = this.f16288b.a(i, rVar, iArr[1]);
            s6Var.a(s6VarA.j());
            length = s6VarA.k().length();
        } catch (a unused) {
            length = 0;
        }
        int[] iArr2 = map == null ? null : (int[]) map.get(m1.k);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                if (length == i2) {
                    return;
                }
            }
            throw a.a();
        }
    }

    public static int b(CharSequence charSequence) throws a {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw a.a();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw a.a();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }

    public static boolean a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return b(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    static int a(r rVar, int[] iArr, int i, int[][] iArr2) {
        g5.a(rVar, i, iArr);
        int length = iArr2.length;
        float f2 = 0.46f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float fA = g5.a(iArr, iArr2[i3], 0.8f);
            if (fA < f2) {
                i2 = i3;
                f2 = fA;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw a.a();
    }

    int[] a(r rVar, int i) {
        return a(rVar, i, false, f16286c);
    }

    @Override // com.huawei.hms.scankit.p.g5
    public s6 a(int i, r rVar, Map map) {
        return a(i, rVar, a(rVar), map);
    }

    public s6 a(int i, r rVar, int[] iArr, Map map) throws a {
        v6 v6Var = map == null ? null : (v6) map.get(m1.j);
        if (v6Var != null) {
            v6Var.a(new u6((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb = this.f16287a;
        sb.setLength(0);
        int iA = a(rVar, iArr, sb);
        if (v6Var != null) {
            v6Var.a(new u6(iA, i));
        }
        int[] iArrA = a(rVar, iA);
        if (iArrA[0] - iA <= 1) {
            if (v6Var != null) {
                v6Var.a(new u6((iArrA[0] + iArrA[1]) / 2.0f, i));
            }
            if (a(iArr, iArrA)) {
                int i2 = iArrA[1];
                if ((i2 - iArrA[0]) + i2 < rVar.d() && a(iArrA[0], i2, rVar)) {
                    String string = sb.toString();
                    if (string.length() >= 8) {
                        if (a(string)) {
                            float f2 = i;
                            s6 s6Var = new s6(string, null, new u6[]{new u6(iArr[0], f2), new u6(iArrA[1], f2)}, a());
                            a(s6Var, iArrA, i, rVar, map);
                            return s6Var;
                        }
                        throw a.a();
                    }
                    throw a.a();
                }
                throw a.a();
            }
            throw a.a();
        }
        throw a.a();
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1104)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1058)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    static int[] a(r rVar, int i, boolean z, int[] iArr) throws a {
        return a(rVar, i, z, iArr, new int[iArr.length]);
    }

    private static int[] a(r rVar, int i, boolean z, int[] iArr, int[] iArr2) throws a {
        int iD = rVar.d();
        int iD2 = z ? rVar.d(i) : rVar.c(i);
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = iD2;
        while (iD2 < iD) {
            if (rVar.b(iD2) != z2) {
                if (i2 >= 0 && i2 < iArr2.length) {
                    iArr2[i2] = iArr2[i2] + 1;
                } else {
                    throw a.a();
                }
            } else {
                if (i2 != length - 1) {
                    i2++;
                } else {
                    if (g5.a(iArr2, iArr, 0.8f) < 0.46f) {
                        return new int[]{i3, iD2};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            iD2++;
        }
        throw a.a();
    }

    static int[] a(r rVar) {
        return b(rVar, 0);
    }
}
