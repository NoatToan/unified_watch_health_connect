package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class nlw {
    public static int e(int i) {
        switch (i) {
            case 287:
            case 288:
            case 289:
                return 287;
            default:
                return i;
        }
    }

    public static int e(double d, int i) {
        int i2;
        int i3 = 0;
        if (0.0d == d) {
            return 0;
        }
        long j = (long) d;
        String str = new SimpleDateFormat("HH").format(new Date(j));
        String str2 = new SimpleDateFormat("mm").format(new Date(j));
        try {
            i2 = Integer.parseInt(str);
            try {
                i3 = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                LogUtil.a("HWHealthDataMgrUtil", "calTime NumberFormatException");
            }
        } catch (NumberFormatException unused2) {
            i2 = 0;
        }
        LogUtil.a("HWHealthDataMgrUtil", ",hour = " + i2 + ",min = " + i3);
        if (1 == i && i2 < 12) {
            i2 += 24;
        }
        int i4 = (i2 * 60) + i3;
        LogUtil.a("HWHealthDataMgrUtil", "time = " + i4);
        return i4;
    }
}
