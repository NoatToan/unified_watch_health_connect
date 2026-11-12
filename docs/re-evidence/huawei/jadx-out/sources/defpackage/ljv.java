package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class ljv {
    private static Context d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap<String, Integer> f40358c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Integer f40357b = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f40356a = "lastSetOpEventDate";

    static class a {
        private static final ljv d = new ljv();
    }

    public static ljv d(Context context) {
        if (context != null) {
            d = context.getApplicationContext();
        }
        return a.d;
    }

    private ljv() {
        this.f40358c = new HashMap<>(16);
    }

    public void b(Context context, String str, Map<String, Object> map, int i) {
        if (CommonUtil.ap()) {
            String accountInfo = LoginInit.getInstance(context).getAccountInfo(1011);
            if (!TextUtils.isEmpty(accountInfo) && !HuaweiHealth.c().equals(accountInfo) && accountInfo.length() > 4) {
                int length = accountInfo.length();
                int i2 = length / 3;
                String strSubstring = accountInfo.substring(0, i2);
                int i3 = length / 2;
                String strSubstring2 = accountInfo.substring(i2, i3);
                String strSubstring3 = accountInfo.substring(i3, length);
                map.put("HF", strSubstring);
                map.put("HS", strSubstring2);
                map.put("HT", strSubstring3);
            }
        }
        lmf.d().c(context, str, map, i);
    }

    public void c(String str, LinkedHashMap<String, String> linkedHashMap, boolean z) {
        if (CommonUtil.ap()) {
            String accountInfo = LoginInit.getInstance(d).getAccountInfo(1011);
            if (!TextUtils.isEmpty(accountInfo) && !HuaweiHealth.c().equals(accountInfo) && accountInfo.length() > 4) {
                int length = accountInfo.length();
                int i = length / 3;
                String strSubstring = accountInfo.substring(0, i);
                int i2 = length / 2;
                String strSubstring2 = accountInfo.substring(i, i2);
                String strSubstring3 = accountInfo.substring(i2, length);
                linkedHashMap.put("HF", strSubstring);
                linkedHashMap.put("HS", strSubstring2);
                linkedHashMap.put("HT", strSubstring3);
            }
            if (!Utils.o()) {
                linkedHashMap.put(OpAnalyticsConstants.DEVICE_SERIAL_NUMBER, CommonUtil.i());
            }
        }
        if (d(str + linkedHashMap.hashCode())) {
            return;
        }
        if (z) {
            OpAnalyticsUtil.getInstance().setEventWithReportImmediately(str, linkedHashMap);
        } else {
            OpAnalyticsUtil.getInstance().setEvent(str, linkedHashMap);
        }
    }

    private boolean d(String str) {
        int iD = HiDateUtil.d(System.currentTimeMillis());
        if (iD != SharedPreferenceManager.c("HiHealthService", f40356a, 0)) {
            SharedPreferenceManager.d("HiHealthService", f40356a, iD);
            this.f40358c.clear();
        }
        if (this.f40358c.containsKey(str)) {
            Integer num = this.f40358c.get(str);
            if (num.intValue() > f40357b.intValue()) {
                return true;
            }
            this.f40358c.put(str, Integer.valueOf(num.intValue() + 1));
        } else {
            this.f40358c.put(str, 1);
        }
        return false;
    }
}
