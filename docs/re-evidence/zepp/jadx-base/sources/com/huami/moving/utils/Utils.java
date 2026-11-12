package com.huami.moving.utils;

import android.os.Build;
import com.huami.mifit.sportlib.model.RunnerData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.xiaomi.hm.health.baseutil.Language;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class Utils {
    private static final String a = "Zepp";
    private static final String b = "Zepp Life";

    public static String appName() {
        return isMidong() ? a : b;
    }

    public static boolean isChinaUser() {
        String str = Build.BRAND;
        if (str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("huawei")) {
            if (Build.VERSION.SDK_INT >= 21) {
                if (Locale.getDefault().getLanguage().equals(Locale.SIMPLIFIED_CHINESE.getLanguage()) && Locale.getDefault().getScript().equals("Hans") && RunnerData.getRunner().isMainlandUser()) {
                    return true;
                }
            } else if (Language.isChinese() && RunnerData.getRunner().isMainlandUser()) {
                return true;
            }
        } else if (Language.isSimplifiedChinese() && RunnerData.getRunner().isMainlandUser()) {
            return true;
        }
        return false;
    }

    public static boolean isMidong() {
        return HMAppConfig.getPackageName().contains("midong");
    }
}
