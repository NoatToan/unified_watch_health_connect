package defpackage;

import com.google.typography.font.sfntly.Font;
import com.google.typography.font.sfntly.table.core.FontHeaderTable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class r9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Integer> f32332a = b();

    public static Set<Integer> b() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(tzo.E));
        hashSet.add(Integer.valueOf(tzo.l));
        hashSet.add(Integer.valueOf(tzo.j));
        hashSet.add(Integer.valueOf(tzo.m));
        hashSet.add(Integer.valueOf(tzo.A));
        hashSet.add(Integer.valueOf(tzo.c));
        return Collections.unmodifiableSet(hashSet);
    }

    public static byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int iMax = Math.max(bArr.length, Math.max(bArr2.length, bArr3.length)) + iwe.i();
        byte[] bArrA = iwe.a(bArr);
        byte[] bArrA2 = iwe.a(bArr2);
        byte[] bArrA3 = iwe.a(bArr3);
        byte[] bArr4 = new byte[bArrA.length + 10 + bArrA2.length + bArrA3.length];
        bArr4[0] = 3;
        d(bArr4, iMax, 1);
        int length = bArrA.length + 10;
        int length2 = bArrA2.length + length;
        d(bArr4, length, 4);
        d(bArr4, length2, 7);
        System.arraycopy(bArrA, 0, bArr4, 10, bArrA.length);
        System.arraycopy(bArrA2, 0, bArr4, length, bArrA2.length);
        System.arraycopy(bArrA3, 0, bArr4, length2, bArrA3.length);
        return bArr4;
    }

    public static void d(byte[] bArr, int i, int i2) {
        bArr[i2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) (i & 255);
    }

    public byte[] a(Font font) {
        p9g p9gVar = new p9g();
        for (Map.Entry<Integer, ? extends dzo> entry : font.p().entrySet()) {
            Integer key = entry.getKey();
            if (!f32332a.contains(key)) {
                p9gVar.a(key.intValue(), entry.getValue().f());
            }
        }
        p9gVar.d().b((FontHeaderTable) font.h(tzo.c));
        q0b q0bVar = new q0b();
        q0bVar.a(font);
        p9gVar.b(tzo.l, q0bVar.d());
        p9gVar.a(tzo.m, null);
        int i = tzo.j;
        rj4 rj4Var = (rj4) font.h(i);
        if (rj4Var != null) {
            qf5 qf5Var = new qf5();
            qf5Var.a(rj4Var);
            p9gVar.b(i, qf5Var.b());
        }
        int i2 = tzo.A;
        if (((lac) font.h(i2)) != null) {
            p9gVar.a(i2, new rlb().a(font));
        }
        return c(p9gVar.c(), q0bVar.e(), q0bVar.c());
    }
}
