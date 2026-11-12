package com.huami.watch.companion.watchface.cloud;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.huami.passport.AccountManager;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.watchface.bean.WatchFaceCloud;
import com.huami.watch.companion.watchface.bean.WatchFaceCloudResult;
import com.huami.watch.util.Log;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.HashMap;
import java.util.List;
import okhttp3.Response;

/* JADX INFO: loaded from: classes16.dex */
public class WatchFaceApi {
    public static final String CUSTOMIZABLE_DISABLE = "disable";
    public static final String CUSTOMIZABLE_ENABLE = "enable";
    public static final int PAGE = 1;
    public static final int PER_PAGE = 20;
    public static final String SORT_DOWNLOAD = "download";
    public static final String SORT_UPDATED = "updated_at";
    public static final String TYPE_WATCH_FACE = "1";
    public static final String TYPE_WATCH_WIDGET = "2";
    private static final String a = "WatchFaceApi";

    public class a extends TypeToken<List<WatchFaceCloud>> {
    }

    public static WatchFaceCloudResult<List<WatchFaceCloud>> getWatchFaceList(Context context) {
        return getWatchFaceList(context, null, false);
    }

    public static WatchFaceCloudResult<List<WatchFaceCloud>> getWatchFaceList(Context context, String str, boolean z) {
        WatchFaceCloudResult<List<WatchFaceCloud>> watchFaceCloudResult = new WatchFaceCloudResult<>();
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("app_ids", str);
        }
        map.put("customizable", z ? "enable" : CUSTOMIZABLE_DISABLE);
        map.put("sort", SORT_DOWNLOAD);
        map.put(DTransferConstants.PAGE, String.valueOf(1));
        map.put("per_page", String.valueOf(20));
        map.put("user_country", Account.getUserCountry(context));
        map.put("user_region", AccountManager.getDefault(context).getCurrentRegion());
        try {
            Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlMarketApps("1"), map));
            boolean zIsSuccessful = responseDoRequest.isSuccessful();
            Log.d(a, "getWatchFaceList:result: " + zIsSuccessful, new Object[0]);
            if (zIsSuccessful) {
                String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
                Log.d(a, "getWatchFaceList: success: body:" + strResponseBodyString, new Object[0]);
                if (!TextUtils.isEmpty(strResponseBodyString)) {
                    GsonBuilder gsonBuilder = new GsonBuilder();
                    gsonBuilder.excludeFieldsWithModifiers(16, 128, 8);
                    watchFaceCloudResult.setData((List) gsonBuilder.create().fromJson(strResponseBodyString, new a().getType()));
                    watchFaceCloudResult.setSuccessful(true);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(a, "getWatchFaceList:error: " + e, new Object[0]);
        }
        return watchFaceCloudResult;
    }
}
