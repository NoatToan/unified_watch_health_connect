package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.util.Calendar;

/* JADX INFO: loaded from: classes7.dex */
public class dor {
    public static int a(int i, int i2) {
        if (i <= 0 || i2 >= 18) {
            return i2;
        }
        int iD = d(i, 0, 4);
        int iD2 = d(i, 4, 6);
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1) - iD;
        return (calendar.get(2) + 1) - iD2 < 0 ? i3 - 1 : i3;
    }

    public static int e(int i) {
        if (i <= 0) {
            return 0;
        }
        int iD = d(i, 4, 6);
        int i2 = Calendar.getInstance().get(2);
        int i3 = (i2 + 1) - iD;
        return i3 < 0 ? (i2 + 13) - iD : i3;
    }

    private static int d(int i, int i2, int i3) {
        try {
            return Integer.parseInt(String.valueOf(i).substring(i2, i3));
        } catch (NumberFormatException unused) {
            LogUtil.e("HealthChildrenUitl", "dataConversion exception");
            return 0;
        }
    }

    public static boolean b(String str) {
        return drk.b(str, 20);
    }

    public static boolean e(String str, int i) {
        return !b(str) && i < 18;
    }
}
