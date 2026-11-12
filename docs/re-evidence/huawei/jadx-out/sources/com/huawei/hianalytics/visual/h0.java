package com.huawei.hianalytics.visual;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.framework.utils.JsonUtils;
import com.huawei.hianalytics.util.HwSfpPolicyUtils;
import java.io.File;

/* JADX INFO: loaded from: classes33.dex */
public abstract class h0 {
    public static void a(final Context context, final HAAutoConfigOptions hAAutoConfigOptions) {
        h1.a().execute(new Runnable() { // from class: com.huawei.hianalytics.visual.h0$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                h0.b(context, hAAutoConfigOptions);
            }
        });
    }

    public static void b(Context context, HAAutoConfigOptions hAAutoConfigOptions) {
        String str;
        String strA;
        String str2;
        String strCreateABReqDefaultJson = JsonUtils.createABReqDefaultJson();
        if (context == null) {
            HiLog.e("JsCodeUtils", "get h5 js code url but context is null");
            str2 = null;
        } else {
            String jsSdkUrlAndVersion = hAAutoConfigOptions.getJsSdkUrlAndVersion();
            if (TextUtils.isEmpty(jsSdkUrlAndVersion)) {
                HiLog.d("JsCodeUtils", "get h5 js sdk url or version is null, get url from grs");
                strA = v.a(context, "H5JSCODEURL");
                if (TextUtils.isEmpty(strA)) {
                    str2 = "";
                } else {
                    str = "ha_2.2.8-500";
                    str2 = strA + "/cch5/apms/{jssdk_version}/h5/autotracker.min.js".replace("{jssdk_version}", str);
                }
            } else {
                String[] strArrSplit = jsSdkUrlAndVersion.split("\\|");
                if (strArrSplit.length != 2) {
                    HiLog.e("JsCodeUtils", "please set right h5 js sdk url or version");
                    str2 = "";
                } else {
                    String str3 = strArrSplit[0];
                    str = strArrSplit[1];
                    strA = str3;
                    str2 = strA + "/cch5/apms/{jssdk_version}/h5/autotracker.min.js".replace("{jssdk_version}", str);
                }
            }
        }
        if (TextUtils.isEmpty(str2)) {
            HiLog.d("JsCodeRequestBackend", "url is inValid");
            return;
        }
        String strA2 = b1.a(strCreateABReqDefaultJson, str2, "GET");
        if (TextUtils.isEmpty(strA2)) {
            HiLog.e("JsCodeRequestBackend", "fail to request h5 js code");
            return;
        }
        HiLog.d("JsCodeRequestBackend", "success to request h5 js code");
        StringBuilder sb = new StringBuilder();
        sb.append(w.a().h().getFilesDir());
        String str4 = File.separator;
        sb.append(str4);
        sb.append("haJsSdk");
        String string = sb.toString();
        o.a(string, "haJsCode.js", strA2);
        HwSfpPolicyUtils.setPublicProtectionLevel(w.a().h(), string + str4 + "haJsCode.js", 0);
    }
}
