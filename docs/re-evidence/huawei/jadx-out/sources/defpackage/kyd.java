package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.data.listener.HealthTrendListener;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class kyd {
    public static void e(List<String> list, int[] iArr, int i, HealthTrendListener healthTrendListener, boolean z) {
        ReleaseLogUtil.d("R_HealthTrendManager", "enter getHealthTrend dataTypes = ", list, ", periodTypes = ", Arrays.toString(iArr), ", timeOut = ", Integer.valueOf(i));
        if (healthTrendListener == null) {
            ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrend listener is null");
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrend dataTypes is null");
            healthTrendListener.onResult(2, new ArrayList());
        } else if (iArr == null || iArr.length == 0) {
            ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrend periodTypes is null");
            healthTrendListener.onResult(2, new ArrayList());
        } else if (i < 0) {
            ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrend timeOut is invalid");
            healthTrendListener.onResult(2, new ArrayList());
        } else {
            kxv.a(list, iArr, i, healthTrendListener, z);
        }
    }

    public static void b(List<String> list, int[] iArr, int i, HealthTrendListener healthTrendListener, String str) {
        ReleaseLogUtil.d("R_HealthTrendManager", "enter getHealthTrendWithRecordDay dataTypes = ", list, ", periodTypes = ", Arrays.toString(iArr), ", timeOut = ", Integer.valueOf(i));
        if (healthTrendListener == null) {
            ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrendWithRecordDay listener is null");
            return;
        }
        if (njy.e(list)) {
            ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrendWithRecordDay dataTypes is null");
            healthTrendListener.onResult(2, new ArrayList());
        } else {
            if (iArr == null || iArr.length == 0) {
                ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrendWithRecordDay periodTypes is null");
                healthTrendListener.onResult(2, new ArrayList());
                return;
            }
            if (TextUtils.isEmpty(str) || !c(str)) {
                ReleaseLogUtil.e("R_HealthTrendManager", "getHealthTrendWithRecordDay recordDay is invalid");
                healthTrendListener.onResult(2, new ArrayList());
            }
            kxv.d(list, iArr, i, healthTrendListener, str);
        }
    }

    private static boolean c(String str) {
        try {
            long jD = DateFormatUtil.d(Integer.parseInt(str));
            if (jD == 0) {
                return false;
            }
            return !lsl.ab(jD);
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
