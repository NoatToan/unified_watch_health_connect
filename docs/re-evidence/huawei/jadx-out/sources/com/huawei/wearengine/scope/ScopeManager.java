package com.huawei.wearengine.scope;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.wearengine.scope.cache.ScopeCache;
import defpackage.yit;
import defpackage.yiv;
import defpackage.yku;
import defpackage.yln;
import defpackage.ylo;
import defpackage.yly;
import defpackage.ymd;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class ScopeManager {
    private static final long DEFAULT_EXPIRED_TIME = 86400000;
    private static final String TAG = "ScopeManager";
    private Map<String, String> mAppIdMap;
    private final Object mAppIdMapLock = new Object();
    private Map<Integer, String> mAppUidMap;
    private ScopeCache mScopeCache;
    private Map<String, String> mScopeUrlMap;

    public ScopeManager(Context context) {
        yiv.c(context);
        this.mScopeUrlMap = new ConcurrentHashMap();
        this.mAppUidMap = new ConcurrentHashMap();
        this.mAppIdMap = new ConcurrentHashMap();
        this.mScopeCache = new yku();
    }

    public void setScopeServerUrl(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.mScopeUrlMap.put(str, str2);
    }

    private void clearAppIdMap(String str) {
        if (!TextUtils.isEmpty(str) && this.mAppIdMap.containsValue(str)) {
            this.mAppIdMap.values().remove(str);
        }
    }

    public void setAppId(int i, int i2, String str) {
        if (i2 == 0 || TextUtils.isEmpty(str)) {
            return;
        }
        String appKey = getAppKey(i, i2);
        synchronized (this.mAppIdMapLock) {
            clearAppIdMap(str);
            this.mAppIdMap.put(appKey, str);
        }
    }

    private String getAppKey(int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i);
        stringBuffer.append("_");
        stringBuffer.append(i2);
        return stringBuffer.toString();
    }

    public void setAppUid(int i, String str) {
        if (str != null) {
            this.mAppUidMap.put(Integer.valueOf(i), str);
        }
    }

    public boolean checkScopeAvailability(String str, int i, int i2, String str2) {
        if (TextUtils.isEmpty(str)) {
            yit.c(TAG, "checkScopeAvailability permission isEmpty");
            return false;
        }
        String appKey = getAppKey(i, i2);
        synchronized (this.mAppIdMapLock) {
            if (!this.mAppIdMap.containsKey(appKey)) {
                yit.c(TAG, "checkScopeAvailability mAppIdMap not containsKey:" + appKey);
                return false;
            }
            String str3 = this.mAppIdMap.get(appKey);
            return checkScopeInfoResponseAvailability(str, str3, i2, getScope(str3, str2));
        }
    }

    public boolean checkScopeAvailability(String str, int i) {
        int iJ;
        yit.a(TAG, "checkScopeAvailability enter!");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!this.mAppUidMap.containsKey(Integer.valueOf(i))) {
            String strD = yln.d(i, yiv.a());
            if (TextUtils.isEmpty(strD) || (iJ = yln.j(yiv.a(), strD)) == 0) {
                return false;
            }
            this.mAppUidMap.put(Integer.valueOf(i), String.valueOf(iJ));
        }
        yit.a(TAG, "checkScopeAvailability permission:" + str);
        return checkScopeInfoResponseAvailability(str, this.mAppUidMap.get(Integer.valueOf(i)), i, getScope(this.mAppUidMap.get(Integer.valueOf(i)), ""));
    }

    private boolean checkScopeInfoResponseAvailability(String str, String str2, int i, ScopeInfoResponse scopeInfoResponse) {
        String str3;
        if (scopeInfoResponse == null) {
            yit.c(TAG, "checkScopeInfoResponseAvailability appScope isEmpty");
            return false;
        }
        yit.a(TAG, "ScopeInfoResponse:" + scopeInfoResponse.toString());
        String[] packagesForUid = yiv.a().getPackageManager().getPackagesForUid(i);
        if (packagesForUid.length == 1) {
            str3 = packagesForUid[0];
        } else {
            String str4 = null;
            for (String str5 : packagesForUid) {
                if (String.valueOf(yln.j(yiv.a(), str5)).equals(str2)) {
                    str4 = str5;
                }
            }
            str3 = str4;
        }
        if (TextUtils.isEmpty(str3)) {
            yit.c(TAG, "packageName == null");
            return false;
        }
        if (ylo.e(str3, scopeInfoResponse) && checkPermission(str, scopeInfoResponse)) {
            return true;
        }
        yit.c(TAG, "checkScopeInfoResponseAvailability checkCertFingerprint or checkPermission fail");
        return false;
    }

    public ScopeInfoResponse getScope(String str, String str2) {
        yit.e(TAG, "getScope:" + str);
        ScopeInfoResponse scope = this.mScopeCache.getScope((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? str : getScopeKey(str, str2));
        if (scope == null) {
            return getScopeFromServer(str, str2);
        }
        return isExpired(scope) ? getScopeFromServer(str, str2) : scope;
    }

    private String getScopeKey(String str, String str2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append("_");
        stringBuffer.append(str2);
        return stringBuffer.toString();
    }

    private ScopeInfoResponse getScopeFromServer(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            yit.c(TAG, "getScopeFromServer appId isEmpty! appId=" + str);
            return null;
        }
        if (!this.mScopeUrlMap.containsKey(str)) {
            yit.c(TAG, "getScopeFromServer ScopeUrl isEmpty! appId=" + str);
            return null;
        }
        String str3 = this.mScopeUrlMap.get(str);
        if (!isUrlLegal(str3)) {
            yit.c(TAG, "getScopeFromServer ScopeUrl Illegal! appId=" + str);
            return null;
        }
        Response responseC = ymd.c(str3, str);
        yit.e(TAG, "getScopeFromServer end of response");
        try {
            if (responseC == null) {
                yit.c(TAG, "get scope is failed!");
                return null;
            }
            if (responseC.isSuccessful() && responseC.getBody() != null) {
                String str4 = new String(((ResponseBody) responseC.getBody()).bytes(), "UTF-8");
                yit.a(TAG, "getScope response.body:".concat(str4));
                ScopeInfoResponse scopeInfoResponse = (ScopeInfoResponse) yly.c(str4, ScopeInfoResponse.class);
                saveScopeToMemoryAndDatabase(str, str2, scopeInfoResponse);
                try {
                    return scopeInfoResponse;
                } catch (IOException unused) {
                    return scopeInfoResponse;
                }
            }
            yit.c(TAG, "get scope is failed!");
            responseC.close();
            try {
                return null;
            } catch (IOException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            yit.a(TAG, " handlerResponse IOException");
            return null;
        } finally {
            try {
                responseC.close();
            } catch (IOException unused4) {
                yit.a(TAG, " handlerResponse close IOException");
            }
        }
    }

    private void saveScopeToMemoryAndDatabase(String str, String str2, ScopeInfoResponse scopeInfoResponse) {
        if (scopeInfoResponse == null || TextUtils.isEmpty(str) || scopeInfoResponse.getScopes() == null || scopeInfoResponse.getScopes().isEmpty()) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            str = getScopeKey(str, str2);
        }
        scopeInfoResponse.setTimeStamp(System.currentTimeMillis());
        scopeInfoResponse.setAppId(str);
        this.mScopeCache.saveScope(str, scopeInfoResponse);
    }

    private boolean isExpired(ScopeInfoResponse scopeInfoResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis() - scopeInfoResponse.getTimeStamp();
        if (jCurrentTimeMillis < 86400000 && jCurrentTimeMillis >= 0) {
            return false;
        }
        yit.a(TAG, "isExpired, appID: " + scopeInfoResponse.getAppId() + ", cacheExpiryTimestamp: 86400000, interval: " + jCurrentTimeMillis);
        return true;
    }

    private boolean checkPermission(String str, ScopeInfoResponse scopeInfoResponse) {
        if (TextUtils.isEmpty(str) || scopeInfoResponse == null) {
            yit.c(TAG, "checkPermission permission is empty or scopeInfoResponse is null");
            return false;
        }
        List<ScopeInfo> scopes = scopeInfoResponse.getScopes();
        if (scopes == null || scopes.isEmpty()) {
            yit.c(TAG, "checkPermission scopes is null or scopes is empty");
            return false;
        }
        Iterator<ScopeInfo> it = scopes.iterator();
        while (it.hasNext()) {
            List<String> permissions = it.next().getPermissions();
            if (permissions != null && permissions.contains(str)) {
                yit.a(TAG, "checkPermission permissionList.contains(permission), permission=" + str);
                return true;
            }
        }
        yit.c(TAG, "checkPermissionscopes fail");
        return false;
    }

    private boolean isUrlLegal(String str) {
        if (TextUtils.isEmpty(str)) {
            yit.c(TAG, "isUrlLegal urlString isEmpty");
            return false;
        }
        return Patterns.WEB_URL.matcher(str).matches();
    }
}
