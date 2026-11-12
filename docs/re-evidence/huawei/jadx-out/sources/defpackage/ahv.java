package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public final class ahv implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ahv f431c = new ahv(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f433b;
    private final int d;

    private static final int e(int i) {
        if (i <= 5) {
            return 8;
        }
        if (i <= 12) {
            return 16;
        }
        int i2 = 32;
        while (i2 < (i >> 2) + i) {
            i2 += i2;
        }
        return i2;
    }

    private ahv(int i, int i2, Object[] objArr) {
        this.d = i;
        this.f433b = i2;
        this.f432a = objArr;
    }

    public static <T> ahv d(Map<String, T> map) {
        if (map.isEmpty()) {
            return f431c;
        }
        int iE = e(map.size());
        int i = iE - 1;
        int i2 = (iE >> 1) + iE;
        Object[] objArrCopyOf = new Object[i2 * 2];
        int i3 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int iHashCode = key.hashCode() & i;
                int i4 = iHashCode + iHashCode;
                if (objArrCopyOf[i4] != null) {
                    i4 = ((iHashCode >> 1) + iE) << 1;
                    if (objArrCopyOf[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i4] = key;
                objArrCopyOf[i4 + 1] = entry.getValue();
            }
        }
        return new ahv(i, i3, objArrCopyOf);
    }

    public Object b(String str) {
        int iHashCode = str.hashCode() & this.d;
        int i = iHashCode << 1;
        Object obj = this.f432a[i];
        if (obj == str || str.equals(obj)) {
            return this.f432a[i + 1];
        }
        return b(str, iHashCode, obj);
    }

    private final Object b(String str, int i, Object obj) {
        if (obj == null) {
            return null;
        }
        int i2 = this.d + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this.f432a[i3];
        if (str.equals(obj2)) {
            return this.f432a[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.f433b;
            for (int i6 = i4; i6 < i5 + i4; i6 += 2) {
                Object obj3 = this.f432a[i6];
                if (obj3 == str || str.equals(obj3)) {
                    return this.f432a[i6 + 1];
                }
            }
        }
        return null;
    }

    public Object e(String str) {
        int length = this.f432a.length;
        for (int i = 0; i < length; i += 2) {
            Object obj = this.f432a[i];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this.f432a[i + 1];
            }
        }
        return null;
    }

    public List<String> e() {
        int length = this.f432a.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i = 0; i < length; i += 2) {
            Object obj = this.f432a[i];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
