package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public class p9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<Integer, jgj> f30149a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q9g f30150b = new q9g();

    public static int e(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static void f(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public static void g(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 8);
        bArr[i + 1] = (byte) i2;
    }

    public static int h(int i) {
        return Integer.highestOneBit(i);
    }

    public void a(int i, jgj jgjVar) {
        this.f30149a.put(Integer.valueOf(i), jgjVar);
    }

    public void b(int i, byte[] bArr) {
        a(i, jgj.l(bArr));
    }

    public byte[] c() {
        a(tzo.c, this.f30150b.a());
        TreeSet<Integer> treeSet = new TreeSet(this.f30149a.keySet());
        int size = this.f30149a.size();
        int i = 12;
        int i2 = (size * 16) + 12;
        int iE = i2;
        for (Map.Entry<Integer, jgj> entry : this.f30149a.entrySet()) {
            if (entry.getValue() != null) {
                iE += (entry.getValue().e() + 3) & (-4);
            }
        }
        byte[] bArr = new byte[iE];
        f(bArr, 0, 65536);
        g(bArr, 4, size);
        int iH = h(size);
        g(bArr, 6, iH * 16);
        g(bArr, 8, e(iH));
        g(bArr, 10, (size - iH) * 16);
        for (Integer num : treeSet) {
            jgj jgjVar = this.f30149a.get(num);
            f(bArr, i, num.intValue());
            f(bArr, i + 4, 0);
            if (jgjVar == null) {
                f(bArr, i + 8, 0);
                f(bArr, i + 12, 0);
            } else {
                f(bArr, i + 8, i2);
                int iE2 = jgjVar.e();
                f(bArr, i + 12, iE2);
                jgjVar.n(0, bArr, i2, iE2);
                i2 += (iE2 + 3) & (-4);
            }
            i += 16;
        }
        return bArr;
    }

    public q9g d() {
        return this.f30150b;
    }
}
