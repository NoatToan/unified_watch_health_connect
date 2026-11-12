package com.huawei.hianalytics.visual;

import android.content.Context;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;

/* JADX INFO: loaded from: classes33.dex */
public abstract class v {
    public static String a(Context context, String str) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        grsBaseInfo.setSerCountry(GrsApp.getInstance().getIssueCountryCode(context));
        try {
            return new GrsClient(context, grsBaseInfo).synGetGrsUrl("com.huawei.hianalytics.sdk", str);
        } catch (NullPointerException e) {
            HiLog.e("GrsUtils", "getRemoteUrl NullPointerException:" + e.getMessage());
            return "";
        }
    }
}
