package defpackage;

import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.SharedPreferenceManager;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class pho {
    public static void e(String str, int i) {
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("MessageCenterSpUtil", "setMsgStatus huid null !");
            return;
        }
        SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(11001), c(accountInfo, str), String.valueOf(i), null);
    }

    public static String e(String str, String str2) {
        String strC = c(str);
        return TextUtils.isEmpty(strC) ? str2 : strC;
    }

    private static String c(String str) {
        if (str == null) {
            return "";
        }
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("MessageCenterSpUtil", "getMsgStatus huid null !");
            return "";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), String.valueOf(11001), c(accountInfo, str));
        return TextUtils.isEmpty(strE) ? "" : strE;
    }

    public static void a() {
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        if (TextUtils.isEmpty(accountInfo)) {
            LogUtil.a("MessageCenterSpUtil", "clearUserMsgs huid null !");
            return;
        }
        Set<String> setA = SharedPreferenceManager.a(BaseApplication.b(), String.valueOf(11001));
        if (njy.e(setA)) {
            return;
        }
        int size = setA.size();
        String[] strArr = new String[size];
        setA.toArray(strArr);
        String strC = c(accountInfo);
        for (int i = 0; i < size; i++) {
            if (strArr[i].contains(strC)) {
                SharedPreferenceManager.b(BaseApplication.b(), String.valueOf(11001), strArr[i]);
            }
        }
    }

    private static String c(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(strArr.length * 16);
        for (String str : strArr) {
            sb.append("_");
            sb.append(str);
        }
        return sb.toString();
    }
}
