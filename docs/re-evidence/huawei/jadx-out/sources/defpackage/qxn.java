package defpackage;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class qxn {
    public static void b(String str, int i, String str2) {
        HashMap map = new HashMap(16);
        boolean zBg = CommonUtil.bg();
        map.put("click", "1");
        map.put("appName", str);
        map.put("isEMUI", Integer.valueOf(zBg ? 1 : 0));
        map.put("deviceName", str2);
        map.put("status", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.NOTIFICATION_APP_1090011.value(), map, 0);
    }

    public static void c(Context context, int i) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        map.put("status", Integer.valueOf(i));
        String strValue = AnalyticsValue.SETTING_1090004.value();
        lmf.d().c(context, strValue, map, 0);
        LogUtil.a("NotificationBiUtils", "BI save notification click event finish, value: ", strValue);
    }
}
