package com.huami.watch.companion.cloud.api;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.cloud.bean.CloudAppUpgradeInfo;
import com.huami.watch.util.AppUtil;
import com.huami.watch.util.Log;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.Response;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
public class AppUpgradeAPI {
    private static final String a = "Cloud-API-AppUpgrade";

    public static class AppUpgradeResult {
        public boolean success;
        public CloudAppUpgradeInfo upgradeInfo;

        public String toString() {
            return "<Success : " + this.success + ", UpgradeInfo : " + this.upgradeInfo + SearchCriteria.GT;
        }
    }

    public static AppUpgradeResult getAppUpgrade(Context context) {
        AppUpgradeResult appUpgradeResult = new AppUpgradeResult();
        HashMap map = new HashMap();
        map.put("versionCode", Integer.toString(AppUtil.getVersionCode(context)));
        map.put("appChannel", AppUtil.getMetaDataChannel(context));
        map.put("appType", "android_phone");
        map.put("versionCodeSearch", "true");
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlUserForceUpgradeAPI(), map));
            String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
            if (responseDoRequest.isSuccessful()) {
                appUpgradeResult.success = true;
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    try {
                        appUpgradeResult.upgradeInfo = (CloudAppUpgradeInfo) new Gson().fromJson(strResponseBodyString, CloudAppUpgradeInfo.class);
                    } catch (Exception e) {
                        Log.e(a, "Get AppUpgradeResult Failed!!", e, new Object[0]);
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e2) {
            Log.e(a, "Get AppUpgradeResult Failed!!", e2, new Object[0]);
            e2.printStackTrace();
        }
        Log.d(a, "Result : " + appUpgradeResult, new Object[0]);
        return appUpgradeResult;
    }
}
