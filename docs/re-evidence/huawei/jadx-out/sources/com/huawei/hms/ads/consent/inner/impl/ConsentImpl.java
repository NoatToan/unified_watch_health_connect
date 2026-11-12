package com.huawei.hms.ads.consent.inner.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.ads.consent.bean.ConsentSyncRsp;
import com.huawei.hms.ads.consent.bean.network.ApiStatisticsReq;
import com.huawei.hms.ads.consent.bean.network.ApiStatisticsRsp;
import com.huawei.hms.ads.consent.bean.network.ConfirmResultReq;
import com.huawei.hms.ads.consent.bean.network.ConfirmResultRsp;
import com.huawei.hms.ads.consent.bean.network.ConsentConfigReq;
import com.huawei.hms.ads.consent.bean.network.ConsentConfigRsp;
import com.huawei.openalliance.ad.analysis.c;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.beans.inner.CountryCodeBean;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.fi;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.ipc.CallResult;
import com.huawei.openalliance.ad.ipc.RemoteCallResultCallback;
import com.huawei.openalliance.ad.na;
import com.huawei.openalliance.ad.rk;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.cn;
import com.huawei.openalliance.ad.utils.d;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.k;
import com.huawei.operation.utils.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ConsentImpl {
    public static void reportConsentToKit(Context context, String str, String str2, RemoteCallResultCallback<String> remoteCallResultCallback, Class<String> cls) {
        if (context != null && !TextUtils.isEmpty(str2)) {
            na.a(context.getApplicationContext()).a(str, str2, remoteCallResultCallback, cls);
        } else {
            hw.d("ConsentImpl", "reportConsentToKit req is empty, please check it!");
            b(remoteCallResultCallback, str, -1, null);
        }
    }

    public static void reportConsentStatus(Context context, String str, String str2, RemoteCallResultCallback<ConsentSyncRsp> remoteCallResultCallback, Class<ConsentSyncRsp> cls) {
        Log.i("ConsentImpl", "reportConsentStatus");
        if (context != null && !TextUtils.isEmpty(str2)) {
            na.a(context.getApplicationContext()).a(str, str2, remoteCallResultCallback, cls);
        } else {
            hw.d("ConsentImpl", "reportConsentStatus req is empty, please check it!");
            b(remoteCallResultCallback, str, -1, null);
        }
    }

    public static void reportConfirmResult(Context context, final String str, String str2, final RemoteCallResultCallback<ConfirmResultRsp> remoteCallResultCallback, Class<ConfirmResultRsp> cls) {
        if (dg.b(str2)) {
            hw.d("ConsentImpl", "confirmResult req is empty, please check it!");
            b(remoteCallResultCallback, str, -1, null);
            return;
        }
        ConfirmResultReq confirmResultReq = (ConfirmResultReq) bk.b(str2, ConfirmResultReq.class, new Class[0]);
        if (confirmResultReq == null || confirmResultReq.getCaches() == null) {
            b(remoteCallResultCallback, str, -1, null);
            return;
        }
        i iVar = new i(context);
        String packageName = context.getPackageName();
        String strE = k.e(context, packageName);
        if (TextUtils.isEmpty(packageName) || !WhiteListPkgList.inWhiteList(packageName, strE)) {
            hw.a("ConsentImpl", "app set app package name: %s", packageName);
        } else {
            if (confirmResultReq.getCaches().get(0) != null) {
                try {
                    String strOptString = new JSONObject(confirmResultReq.getCaches().get(0).getParams()).optString(MapKeyNames.FAST_APP_PACAKAE);
                    if (!TextUtils.isEmpty(strOptString)) {
                        packageName = strOptString;
                    }
                } catch (JSONException unused) {
                    hw.c("ConsentImpl", "get pkgName failed, params is not valid json");
                }
            }
            hw.a("ConsentImpl", "fast app set app package name: %s", packageName);
        }
        iVar.a(packageName, confirmResultReq, new rk() { // from class: com.huawei.hms.ads.consent.inner.impl.ConsentImpl.1
            @Override // com.huawei.openalliance.ad.rk
            public void a() {
                ConfirmResultRsp confirmResultRsp = new ConfirmResultRsp();
                confirmResultRsp.setRetcode(200);
                ConsentImpl.b(remoteCallResultCallback, str, 200, confirmResultRsp);
            }
        });
    }

    public static void reportApiStistics(Context context, String str, String str2, RemoteCallResultCallback<ApiStatisticsRsp> remoteCallResultCallback, Class<ApiStatisticsRsp> cls) {
        if (context == null || TextUtils.isEmpty(str2)) {
            hw.d("ConsentImpl", "reportApiStistics req is empty, please check it!");
            b(remoteCallResultCallback, str, -1, null);
            return;
        }
        ApiStatisticsReq apiStatisticsReq = (ApiStatisticsReq) bk.b(str2, ApiStatisticsReq.class, new Class[0]);
        String packageName = context.getPackageName();
        String strE = k.e(context, packageName);
        if (TextUtils.isEmpty(packageName) || !WhiteListPkgList.inWhiteList(packageName, strE)) {
            hw.a("ConsentImpl", "app set app package name: %s", packageName);
        } else {
            try {
                String strOptString = new JSONObject(apiStatisticsReq.getParams()).optString(MapKeyNames.FAST_APP_PACAKAE);
                if (!TextUtils.isEmpty(strOptString)) {
                    packageName = strOptString;
                }
            } catch (JSONException unused) {
                hw.c("ConsentImpl", "get pkgName failed, params is not valid json");
            }
            hw.a("ConsentImpl", "fast app set app package name: %s", packageName);
        }
        new c(context).a(packageName, new com.huawei.openalliance.ad.beans.inner.ApiStatisticsReq(apiStatisticsReq));
        ApiStatisticsRsp apiStatisticsRsp = new ApiStatisticsRsp();
        apiStatisticsRsp.setRetcode(200);
        b(remoteCallResultCallback, str, 200, apiStatisticsRsp);
    }

    public static void lookUpConsent(Context context, String str, String str2, RemoteCallResultCallback<ConsentConfigRsp> remoteCallResultCallback, Class<ConsentConfigRsp> cls) {
        hw.a("ConsentImpl", "begin to lookup consent config");
        if (dg.b(str2)) {
            hw.d("ConsentImpl", "consent req is empty, please check it!");
            b(remoteCallResultCallback, str, -1, null);
            return;
        }
        ConsentConfigReq consentConfigReq = (ConsentConfigReq) bk.b(str2, ConsentConfigReq.class, new Class[0]);
        if (consentConfigReq == null) {
            hw.d("ConsentImpl", "req is null: " + str2);
            b(remoteCallResultCallback, str, -1, null);
            return;
        }
        String strCc = fp.b(context).cc();
        if (!TextUtils.isEmpty(strCc)) {
            consentConfigReq.setCountryCode(strCc);
        } else if (dg.b(consentConfigReq.getCountryCode())) {
            strCc = new CountryCodeBean(context).a();
            cn.a(context).z(strCc);
            hw.a("ConsentImpl", "look up consent, countryCode is: %s", strCc);
            consentConfigReq.setCountryCode(strCc);
        }
        consentConfigReq.setLangCode(d.a());
        String packageName = context.getPackageName();
        String strE = k.e(context, packageName);
        if (TextUtils.isEmpty(consentConfigReq.getPkgName()) || !WhiteListPkgList.inWhiteList(packageName, strE)) {
            consentConfigReq.setPkgName(packageName);
            hw.a("ConsentImpl", "app set app package name: %s", packageName);
        } else {
            packageName = consentConfigReq.getPkgName();
            hw.a("ConsentImpl", "fast app set app package name:  %s", packageName);
        }
        com.huawei.openalliance.ad.beans.server.ConsentConfigRsp consentConfigRspA = fi.a(context).a(packageName, new com.huawei.openalliance.ad.beans.server.ConsentConfigReq(consentConfigReq));
        StringBuilder sb = new StringBuilder("responseCode:");
        sb.append(consentConfigRspA == null ? Constants.NULL : Integer.valueOf(consentConfigRspA.responseCode));
        hw.b("ConsentImpl", sb.toString());
        if (consentConfigRspA == null || consentConfigRspA.responseCode != 0) {
            b(remoteCallResultCallback, str, -1, null);
        } else {
            b(remoteCallResultCallback, str, 200, new ConsentConfigRsp(consentConfigRspA));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void b(RemoteCallResultCallback<T> remoteCallResultCallback, String str, int i, T t) {
        if (remoteCallResultCallback != null) {
            CallResult<T> callResult = new CallResult<>();
            callResult.setCode(i);
            try {
                if (i == 200) {
                    callResult.setData(t);
                } else {
                    callResult.setMsg("");
                }
            } catch (Throwable th) {
                hw.c("ConsentImpl", "onCallResult fail " + th.getClass().getSimpleName());
                callResult.setCode(-1);
                callResult.setMsg(th.getMessage());
            }
            remoteCallResultCallback.onRemoteCallResult(str, callResult);
        }
    }
}
