package com.huawei.maps.offlinedata.service.cloud;

import android.text.TextUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.hms.framework.network.grs.IQueryUrlsCallBack;
import com.huawei.maps.offlinedata.service.cloud.utils.CountryCodeUtil;
import com.huawei.maps.offlinedata.utils.g;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class GrsMapClient {
    private static final String GRS_KEY_HIANALYTICS = "HIANALYTICS";
    private static final String GRS_KEY_ROOT = "ROOT";
    private static final String GRS_SERVICE_HIANNLYTICS = "com.huawei.cloud.hianalytics";
    private static final String GRS_SERVICE_MAP = "commonService.maps.offlinedata";
    private static final String TAG = "GrsUtil";
    private static volatile GrsClient grsClient;
    private static volatile GrsMapClient mInstance;
    private String haAddress;
    private String serverAddress;

    private GrsMapClient() {
        initGrs();
    }

    public static GrsMapClient getInstance() {
        if (mInstance == null) {
            synchronized (GrsMapClient.class) {
                if (mInstance == null) {
                    mInstance = new GrsMapClient();
                }
            }
        }
        return mInstance;
    }

    private void initGrs() {
        String locationCountryCode = CountryCodeUtil.getLocationCountryCode();
        g.c(TAG, "initGrs countryCode:" + locationCountryCode);
        grsClient = new GrsClient(com.huawei.maps.offlinedata.utils.a.b(), initGrsParams(locationCountryCode));
    }

    private GrsBaseInfo initGrsParams(String str) {
        GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
        String strRemoveWhitespaceAll = removeWhitespaceAll(str);
        if (strRemoveWhitespaceAll.equals("AA") || strRemoveWhitespaceAll.equals("UNKNOWN")) {
            grsBaseInfo.setSerCountry(null);
            return grsBaseInfo;
        }
        grsBaseInfo.setSerCountry(strRemoveWhitespaceAll);
        return grsBaseInfo;
    }

    private String removeWhitespaceAll(String str) {
        return str != null ? str.replaceAll("\\s", "") : "";
    }

    public void ayncGetGrsUrls(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query from grs serviceName must not be null.");
        }
        ayncGetGrsUrls(str, iQueryUrlsCallBack);
    }

    public void cacheErrorLog(String str) {
        g.b(TAG, "GRS returns empty.");
        if (str.equals(GRS_SERVICE_HIANNLYTICS)) {
            return;
        }
        com.huawei.maps.offlinedata.logpush.c.a(new com.huawei.maps.offlinedata.logpush.dto.b.a().b("GET_GRS_URL_FAILED").a("GRS returns empty, service name is " + str).a());
    }

    public String getHaAddress() {
        if (TextUtils.isEmpty(this.haAddress)) {
            Map<String, String> mapSyncQueryGrs = syncQueryGrs(GRS_SERVICE_MAP);
            if (mapSyncQueryGrs.isEmpty()) {
                g.d(TAG, "query hianalytics from grs failed, url is empty.");
                return this.haAddress;
            }
            if (TextUtils.isEmpty(mapSyncQueryGrs.get(GRS_KEY_HIANALYTICS))) {
                g.d(TAG, "query hianalytics from grs failed, url is empty.");
            } else {
                this.haAddress = mapSyncQueryGrs.get(GRS_KEY_HIANALYTICS);
            }
            g.c(TAG, "HiAnalytics Address: " + this.haAddress);
        }
        return this.haAddress;
    }

    public String getServerAddress() {
        if (TextUtils.isEmpty(this.serverAddress)) {
            Map<String, String> mapSyncQueryGrs = syncQueryGrs(GRS_SERVICE_MAP);
            g.d(TAG, "getServerAddress: " + mapSyncQueryGrs.toString());
            if (mapSyncQueryGrs.isEmpty()) {
                g.d(TAG, "query url from grs failed, url is empty.");
            } else {
                String str = mapSyncQueryGrs.get("ROOT");
                if (TextUtils.isEmpty(str)) {
                    g.d(TAG, "query url from grs failed, root is empty.");
                } else {
                    this.serverAddress = str;
                }
            }
            g.c(TAG, "Address: " + this.serverAddress);
        }
        return this.serverAddress;
    }

    public Map<String, String> syncQueryGrs(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query from grs serviceName must not be null.");
        }
        Map<String, String> mapSynGetGrsUrls = grsClient.synGetGrsUrls(str);
        if (mapSynGetGrsUrls != null && !mapSynGetGrsUrls.isEmpty()) {
            return mapSynGetGrsUrls;
        }
        cacheErrorLog(str);
        return new HashMap();
    }
}
