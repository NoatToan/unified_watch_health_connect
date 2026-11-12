package defpackage;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class fei {
    public static boolean d(String str, Map<String, String> map) {
        String strB = SharedPreferenceManager.b(Integer.toString(3041), "health_cloud_grayscale_switch", "");
        String strD = d();
        if ("".equals(strD)) {
            return Boolean.parseBoolean(strB);
        }
        if (Arrays.asList(strD.split(";")).contains(c(str, map))) {
            return Boolean.parseBoolean(strB);
        }
        return false;
    }

    private static String c(String str, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return str;
        }
        String str2 = null;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            str2 = entry.getKey() + ":" + entry.getValue();
        }
        if (str2 == null) {
            return str;
        }
        return str + "," + str2;
    }

    private static String d() {
        if (!CommonUtil.bu() && "1".equals(SharedPreferenceManager.e(BaseApplication.getContext(), "developeroptions", "developerswitch"))) {
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "app_enter_module", "app_health_cloud_gray_configs");
            if (!TextUtils.isEmpty(strE)) {
                return strE;
            }
        }
        return "";
    }
}
