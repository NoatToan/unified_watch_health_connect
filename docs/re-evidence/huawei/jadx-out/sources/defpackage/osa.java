package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class osa {
    public static void b(Context context, String str, String str2) {
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("SharedPreferenceUtil", "setSharedPreference huid null");
            return;
        }
        SharedPreferenceManager.e(context, String.valueOf(20003), accountInfo + str, str2, null);
    }

    public static String e(Context context, String str) {
        if (str == null) {
            return "";
        }
        String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("SharedPreferenceUtil", "getSharedPreference huid null");
            return "";
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(20003), accountInfo + str);
        return TextUtils.isEmpty(strE) ? "" : strE;
    }

    public static void b(Context context, Map<String, String> map) {
        if (context == null || map == null) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                b(context, key, value);
            }
        }
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        SharedPreferenceManager.b(context, String.valueOf(20003), str);
    }

    public static String c(Context context, String str, String str2) {
        String strE = e(context, str);
        return TextUtils.isEmpty(strE) ? str2 : strE;
    }

    public static void e() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("PLGACHIEVE_SharedPreferenceUtil", "deleteAllAchieveSpKeys: huid is empty");
            return;
        }
        Set<String> setA = SharedPreferenceManager.a(BaseApplication.getContext(), String.valueOf(20003));
        if (setA == null || setA.isEmpty()) {
            LogUtil.a("PLGACHIEVE_SharedPreferenceUtil", "deleteAllAchieveSpKeys: achieveAllSpKeys is empty");
            return;
        }
        ArrayList<String> arrayListA = a(setA, accountInfo);
        if (arrayListA.isEmpty()) {
            LogUtil.a("PLGACHIEVE_SharedPreferenceUtil", "deleteAllAchieveSpKeys: userAchieveAllKeys is empty");
            return;
        }
        try {
            SharedPreferenceManager.d(String.valueOf(20003), (String[]) arrayListA.toArray(new String[0]));
            LogUtil.a("PLGACHIEVE_SharedPreferenceUtil", "deleteAllAchieveSpKeys: deleted " + arrayListA.size() + " keys");
        } catch (Exception e) {
            LogUtil.e("PLGACHIEVE_SharedPreferenceUtil", "deleteAllAchieveSpKeys: error deleting keys", e);
        }
    }

    private static ArrayList<String> a(Set<String> set, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : set) {
            if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }
}
