package defpackage;

import com.facebook.soloader.MinElf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public final class nhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f27937a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27938b = 3;
    public static volatile boolean d = false;
    public static byte[] e = null;
    public static List<Integer> f = null;
    public static Map<Integer, List<Integer>> g = null;
    public static volatile boolean h = false;
    public static final int c = 3 + 3;
    public static final ReentrantReadWriteLock i = new ReentrantReadWriteLock();

    public static String[] a(String str) {
        if (d) {
            return h(str);
        }
        if (!h) {
            return null;
        }
        i.readLock().lock();
        try {
            return h(str);
        } finally {
            i.readLock().unlock();
        }
    }

    public static String[] b(String str, w68 w68Var) throws IOException {
        String[] strArrA = a(str);
        return strArrA != null ? strArrA : MinElf.a(w68Var);
    }

    public static String[] c(int i2, int i3) {
        byte b2;
        ArrayList arrayList = new ArrayList();
        int i4 = (i2 + i3) - c;
        int i5 = 0;
        boolean z = false;
        while (true) {
            byte[] bArr = e;
            if (i4 >= bArr.length || (b2 = bArr[i4]) == 10) {
                break;
            }
            if (b2 == 32) {
                if (z) {
                    String strD = d(i5);
                    if (strD == null) {
                        return null;
                    }
                    arrayList.add(strD);
                    i5 = 0;
                    z = false;
                } else {
                    continue;
                }
            } else {
                if (b2 < 48 || b2 > 57) {
                    return null;
                }
                i5 = (i5 * 10) + (b2 - 48);
                z = true;
            }
            i4++;
        }
        if (z) {
            String strD2 = d(i5);
            if (strD2 == null) {
                return null;
            }
            arrayList.add(strD2);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String d(int i2) {
        if (i2 >= f.size()) {
            return null;
        }
        int iIntValue = f.get(i2).intValue();
        int i3 = iIntValue;
        while (true) {
            byte[] bArr = e;
            if (i3 >= bArr.length || bArr[i3] <= 32) {
                break;
            }
            i3++;
        }
        int i4 = (i3 - iIntValue) + c;
        char[] cArr = new char[i4];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i5 = 0; i5 < i4 - c; i5++) {
            cArr[f27937a + i5] = (char) e[iIntValue + i5];
        }
        cArr[i4 - 3] = '.';
        cArr[i4 - 2] = 's';
        cArr[i4 - 1] = 'o';
        return new String(cArr);
    }

    public static int e(String str) {
        List<Integer> list = g.get(Integer.valueOf(f(str)));
        if (list == null) {
            return -1;
        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (g(str, iIntValue)) {
                return iIntValue;
            }
        }
        return -1;
    }

    public static int f(String str) {
        int iCodePointAt = 5381;
        for (int i2 = f27937a; i2 < str.length() - f27938b; i2++) {
            iCodePointAt = str.codePointAt(i2) + (iCodePointAt << 5) + iCodePointAt;
        }
        return iCodePointAt;
    }

    public static boolean g(String str, int i2) {
        int i3;
        int i4 = f27937a;
        while (true) {
            int length = str.length();
            i3 = f27938b;
            if (i4 >= length - i3 || i2 >= e.length || (str.codePointAt(i4) & 255) != e[i2]) {
                break;
            }
            i4++;
            i2++;
        }
        return i4 == str.length() - i3;
    }

    public static String[] h(String str) {
        int iE;
        if (d && str.length() > c && (iE = e(str)) != -1) {
            return c(iE, str.length());
        }
        return null;
    }
}
