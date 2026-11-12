package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.utils.Constants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.CommonUtil;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class dne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Set<String> f32048a;

    public static byte a(byte b2) {
        if (b2 == 2) {
            return (byte) 1;
        }
        return b2;
    }

    private static double b(double d, double d2) {
        double d3 = 10;
        if (((int) ((d / d2) % d3)) + ((int) ((d2 / d2) % d3)) == 10) {
            return 0.0d;
        }
        return d2;
    }

    public static int b(int i) {
        return (i == 94 || i == 95 || i == 140 || i == 168 || i == 385 || i == 672) ? 2 : 1;
    }

    static {
        HashSet hashSet = new HashSet();
        f32048a = hashSet;
        hashSet.add("zh_CN_#Hans");
        f32048a.add("zh_MO_#Hans");
        f32048a.add("zh_HK_#Hans");
        f32048a.add("zh_SG_#Hans");
        f32048a.add(ProfileRequestConstants.X_LANGUAGE_VALUE);
        f32048a.add("es_ES");
        f32048a.add("de_DE");
        f32048a.add("de_LU");
        f32048a.add("de_BE");
        f32048a.add("de_CH");
        f32048a.add("de_AT");
        f32048a.add("de_LI");
        f32048a.add("fr_BE");
        f32048a.add("fr_FR");
        f32048a.add("fr_CH");
        f32048a.add("pt_PT");
        f32048a.add("en_US");
        f32048a.add("en_GB");
    }

    private static String c(dnj dnjVar) {
        String strI = dnjVar.i();
        return d(strI) ? "0" : strI;
    }

    public static boolean d(String str) {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            LogUtil.a("WeightDataUtils", "isMainUser, uuid is empty");
            return true;
        }
        if (!Constants.NULL.equalsIgnoreCase(str) && !str.equals(accountInfo)) {
            return false;
        }
        LogUtil.a("WeightDataUtils", "isMainUser");
        return true;
    }

    public static void d(dnj dnjVar, HiAggregateListener hiAggregateListener) {
        if (dnjVar == null) {
            LogUtil.j("WeightDataUtils", "getUserLastWeightData user is null");
            return;
        }
        if (hiAggregateListener == null) {
            LogUtil.j("WeightDataUtils", "getUserLastWeightData hiAggregateListener is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(0L, jCurrentTimeMillis);
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        String strC = c(dnjVar);
        LogUtil.a("WeightDataUtils", "getUserLastWeightData userId:", CommonUtil.n(strC));
        hiAggregateOption.setFilter(strC);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        HiHealthManager.d(BaseApplication.getContext()).aggregateHiHealthData(hiAggregateOption, hiAggregateListener);
    }

    public static HiAggregateOption a() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setCount(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setSortOrder(1);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        hiAggregateOption.setTimeRange(0L, System.currentTimeMillis());
        return hiAggregateOption;
    }

    public static int c(double d, int i) {
        return (b(i) != 2 || (((e(d) - b(d)) > 0.0d ? 1 : ((e(d) - b(d)) == 0.0d ? 0 : -1)) == 0)) ? 1 : 2;
    }

    private static double e(double d) {
        try {
            return Double.parseDouble(String.valueOf(new BigDecimal(b(d, 1.0E-4d) + d).setScale(2, 4)));
        } catch (NumberFormatException e) {
            LogUtil.e("WeightDataUtils", "getTwoDecimalPlacesRoundHalfUp exception = ", e.getMessage());
            return d;
        }
    }

    private static double b(double d) {
        try {
            return Double.parseDouble(String.valueOf(new BigDecimal(b(d, 0.001d) + d).setScale(1, 4)));
        } catch (NumberFormatException e) {
            LogUtil.e("WeightDataUtils", "getOneDecimalRoundHalfUp exception = ", e.getMessage());
            return d;
        }
    }
}
