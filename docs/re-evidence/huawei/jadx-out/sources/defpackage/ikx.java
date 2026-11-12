package defpackage;

import android.text.TextUtils;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ikx {
    public static Calendar c(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, i);
        int iNextInt = pil.b().nextInt(((i3 - i2) * 60) + 1);
        calendar.set(11, i2 + (iNextInt / 60));
        calendar.set(12, iNextInt % 60);
        calendar.set(13, 0);
        ReleaseLogUtil.d("R_TC_ThreeCircleUtils", "getRandomTime:", Integer.valueOf(calendar.get(11)), " ", Integer.valueOf(calendar.get(12)), " ", Long.valueOf(calendar.getTimeInMillis()));
        return calendar;
    }

    public static String a(final String str) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final String[] strArr = new String[1];
        qhp.c(arrayList, new IBaseResponseCallback() { // from class: ikv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                ikx.d(countDownLatch, strArr, str, i, obj);
            }
        });
        try {
            if (!countDownLatch.await(2000L, TimeUnit.MILLISECONDS)) {
                ReleaseLogUtil.e("R_TC_ThreeCircleUtils", "getSwitchStatusFromDb wait timeout");
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("R_TC_ThreeCircleUtils", "interrupted while waiting for getSwitchStatusFromDb");
        }
        ReleaseLogUtil.d("R_TC_ThreeCircleUtils", "IsRemindSwitchOpen id:", str, " status:", strArr[0]);
        if (strArr[0] == null) {
            strArr[0] = "1";
        }
        return strArr[0];
    }

    static /* synthetic */ void d(CountDownLatch countDownLatch, String[] strArr, String str, int i, Object obj) {
        if (!(obj instanceof HashMap)) {
            ReleaseLogUtil.e("R_TC_ThreeCircleUtils", "onResponse: objData is not instanceof HashMap");
            countDownLatch.countDown();
        } else {
            strArr[0] = (String) ((HashMap) obj).get(str);
            countDownLatch.countDown();
        }
    }

    public static void a(String str, long j, int i) {
        ReleaseLogUtil.d("R_TC_ThreeCircleUtils", "updateCacheState key:", str, " timeMills", Long.valueOf(j), " state:", Integer.valueOf(i));
        SharedPreferenceManager.c("threeCircleSp", str, DateFormatUtil.a(j, TimeZone.getDefault()) + "_" + i);
    }

    public static int a(String str, long j) {
        String strB = SharedPreferenceManager.b("threeCircleSp", str, "");
        ReleaseLogUtil.d("R_TC_ThreeCircleUtils", "getCacheState key:", str, " timeMills", Long.valueOf(j), " spValue:", strB);
        if (!TextUtils.isEmpty(strB) && strB.contains("_")) {
            String[] strArrSplit = strB.split("_");
            if (strArrSplit.length != 2) {
                return 0;
            }
            String str2 = strArrSplit[0];
            int iJ = CommonUtil.j(strArrSplit[1]);
            if (Integer.toString(DateFormatUtil.a(j)).equals(str2)) {
                return iJ;
            }
        }
        return 0;
    }

    public static boolean d(int i, int i2) {
        Calendar calendar = Calendar.getInstance();
        int i3 = (calendar.get(11) * 100) + calendar.get(12);
        return i3 >= i * 100 && i3 <= i2 * 100;
    }

    public static boolean c() {
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(5) == 15) {
            return true;
        }
        return calendar.get(5) > 15 && calendar.get(7) == 1;
    }

    public static boolean a() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(7) == 4 || calendar.get(7) == 6;
    }
}
