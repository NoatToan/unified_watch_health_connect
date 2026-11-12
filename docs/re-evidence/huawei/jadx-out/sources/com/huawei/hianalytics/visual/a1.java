package com.huawei.hianalytics.visual;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes33.dex */
public abstract class a1 {
    public static String a(Context context, HAAutoConfigOptions hAAutoConfigOptions) {
        if (context == null) {
            HiLog.e("RemoteConfigRequestBackend", "build request url but context is null");
            return "";
        }
        String remoteConfigUrl = hAAutoConfigOptions.getRemoteConfigUrl();
        if (TextUtils.isEmpty(remoteConfigUrl)) {
            HiLog.d("RemoteConfigRequestBackend", "build remote url is null, get url from grs");
            remoteConfigUrl = v.a(context, "ABCONFIGURL");
        }
        return (remoteConfigUrl + "/abtest/1.0/${package_name}/WiseUBA/config").replace("${package_name}", i1.a(context));
    }
}
