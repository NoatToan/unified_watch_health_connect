package defpackage;

import android.util.Pair;
import com.xiaomi.onetrack.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f25702a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f25703b = {"", "A", c.f13755a, "C"};

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String c(pkh pkhVar) {
        pkhVar.l(24);
        int iE = pkhVar.e(2);
        boolean zD = pkhVar.d();
        int iE2 = pkhVar.e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (pkhVar.d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = pkhVar.e(8);
        }
        int iE3 = pkhVar.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f25703b[iE];
        objArr[1] = Integer.valueOf(iE2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(zD ? 'H' : 'L');
        objArr[4] = Integer.valueOf(iE3);
        StringBuilder sb = new StringBuilder(wlq.D("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f25702a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static int e(byte[] bArr, int i) {
        int length = bArr.length - f25702a.length;
        while (i <= length) {
            if (f(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static boolean f(byte[] bArr, int i) {
        if (bArr.length - i <= f25702a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f25702a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair<Integer, Integer> g(byte[] bArr) {
        okh okhVar = new okh(bArr);
        okhVar.P(9);
        int iD = okhVar.D();
        okhVar.P(20);
        return Pair.create(Integer.valueOf(okhVar.H()), Integer.valueOf(iD));
    }

    public static boolean h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] i(byte[] bArr) {
        if (!f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(bArr, iE + f25702a.length);
        } while (iE != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i = 0;
        while (i < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i)).intValue();
            int iIntValue2 = (i < arrayList.size() + (-1) ? ((Integer) arrayList.get(i + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i] = bArr3;
            i++;
        }
        return bArr2;
    }
}
