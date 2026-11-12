package defpackage;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.item.BloodPressureItem;

/* JADX INFO: loaded from: classes10.dex */
public class pz2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f30923a = {90, 120, 140};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f30924b = {60, 80, 90};

    public static int a(BloodPressureItem bloodPressureItem) {
        int highPressure = bloodPressureItem.getHighPressure();
        int lowPressure = bloodPressureItem.getLowPressure();
        int iB = b(highPressure);
        int iC = c(lowPressure);
        int i = 4;
        if (iB != 4 && iC != 4) {
            i = 3;
            if (iB != 3 && iC != 3) {
                i = 1;
                if (iB != 1 && iC != 1) {
                    return 2;
                }
            }
        }
        return i;
    }

    public static int b(int i) {
        if (i <= 0) {
            return -1;
        }
        int[] iArr = f30923a;
        if (i <= iArr[0]) {
            return 1;
        }
        if (i < iArr[1]) {
            return 2;
        }
        return i < iArr[2] ? 3 : 4;
    }

    public static int c(int i) {
        if (i <= 0) {
            return -1;
        }
        int[] iArr = f30924b;
        if (i <= iArr[0]) {
            return 1;
        }
        if (i < iArr[1]) {
            return 2;
        }
        return i < iArr[2] ? 3 : 4;
    }

    public static String d(Context context, int i, boolean z) {
        int iB = z ? b(i) : c(i);
        if (iB == 4) {
            return context.getString(c0j.x2);
        }
        return iB == 1 ? context.getString(c0j.y2) : "";
    }

    public static boolean e(int i) {
        return i == 4 || i == 1;
    }
}
