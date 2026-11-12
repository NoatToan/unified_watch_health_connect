package com.huawei.health.ecologydevice.manager;

import android.text.TextUtils;
import com.huawei.common.util.Utils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.ecologydevice.networkclient.AuthorizationData;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.ecologydevice.networkclient.OnRequestCallBack;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProAppLoader;
import com.huawei.health.h5pro.webkit.QuickPackageManager;
import com.huawei.health.main.api.CloudAuthApi;
import com.huawei.hms.hihealth.data.Scopes;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import defpackage.fwp;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class HpkPermissionManager {
    private String d = "";
    private String e;

    public interface PermissionAuthenticationListener {
        void onResult(boolean z);
    }

    public HpkPermissionManager(String str) {
        this.e = str;
    }

    public void a(String str, PermissionAuthenticationListener permissionAuthenticationListener) {
        LogUtil.a("FittingsPermissionManager", "permissionAuthentication");
        QuickPackageManager quickPackageManager = new QuickPackageManager(BaseApplication.b());
        String str2 = "com.huawei.health.device." + this.e;
        H5ProAppInfo appInfo = quickPackageManager.getAppInfo(str2);
        LogUtil.a("FittingsPermissionManager", "h5ProAppInfo is null? ", Boolean.valueOf(appInfo == null));
        if (appInfo != null) {
            String appId = appInfo.getAppId();
            this.d = appId;
            ReleaseLogUtil.d("DEVMGR_FittingsPermissionManager", "appId:", appId);
            if (TextUtils.isEmpty(this.d)) {
                permissionAuthenticationListener.onResult(e(this.e));
                return;
            } else {
                d(str, permissionAuthenticationListener);
                return;
            }
        }
        d(quickPackageManager, str2, str, permissionAuthenticationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(String str) {
        return SharedPreferenceManager.b("ecology_device_module", str, false);
    }

    private void d(final QuickPackageManager quickPackageManager, final String str, final String str2, final PermissionAuthenticationListener permissionAuthenticationListener) {
        LogUtil.a("FittingsPermissionManager", "downLoadHpk");
        quickPackageManager.installApp(str2, new H5ProAppLoader.H5ProPreloadCbk() { // from class: com.huawei.health.ecologydevice.manager.HpkPermissionManager.2
            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onSuccess() {
                LogUtil.a("FittingsPermissionManager", "getAppIdWithDownloadHpk download hpk success");
                H5ProAppInfo appInfo = quickPackageManager.getAppInfo(str2);
                if (appInfo == null) {
                    LogUtil.j("FittingsPermissionManager", "getAppIdWithDownloadHpk downSuccess but h5ProAppInfo is null");
                    PermissionAuthenticationListener permissionAuthenticationListener2 = permissionAuthenticationListener;
                    HpkPermissionManager hpkPermissionManager = HpkPermissionManager.this;
                    permissionAuthenticationListener2.onResult(hpkPermissionManager.e(hpkPermissionManager.e));
                    return;
                }
                HpkPermissionManager.this.d = appInfo.getAppId();
                ReleaseLogUtil.d("DEVMGR_FittingsPermissionManager", "appId:", HpkPermissionManager.this.d);
                if (!TextUtils.isEmpty(HpkPermissionManager.this.d)) {
                    HpkPermissionManager.this.d(str, permissionAuthenticationListener);
                    return;
                }
                PermissionAuthenticationListener permissionAuthenticationListener3 = permissionAuthenticationListener;
                HpkPermissionManager hpkPermissionManager2 = HpkPermissionManager.this;
                permissionAuthenticationListener3.onResult(hpkPermissionManager2.e(hpkPermissionManager2.e));
            }

            @Override // com.huawei.health.h5pro.vengine.H5ProAppLoader.H5ProPreloadCbk
            public void onFailure(int i, String str3) {
                LogUtil.e("FittingsPermissionManager", "getAppIdWithDownloadHpk download hpk fail ", str3);
                PermissionAuthenticationListener permissionAuthenticationListener2 = permissionAuthenticationListener;
                HpkPermissionManager hpkPermissionManager = HpkPermissionManager.this;
                permissionAuthenticationListener2.onResult(hpkPermissionManager.e(hpkPermissionManager.e));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final String str, final PermissionAuthenticationListener permissionAuthenticationListener) {
        ReleaseLogUtil.d("DEVMGR_FittingsPermissionManager", "checkPlatformPermission");
        HashMap map = new HashMap(10);
        map.put("nsp_svc", "nsp.scope.app.get");
        map.put("nsp_fmt", "json");
        map.put("appid", this.d);
        map.put("type", "2");
        new HealthEngineRequestManager.RequestParamsBuilder().setTag("FittingsPermissionManager").setUrl(Utils.getUrl("com.huawei.health", "domainScopeOauth")).setQueryParams(map).setHeaderParam(new HashMap(10)).setMethod("GET").setRequestCallBack(new OnRequestCallBack<AuthorizationData>() { // from class: com.huawei.health.ecologydevice.manager.HpkPermissionManager.4
            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AuthorizationData authorizationData) {
                LogUtil.a("FittingsPermissionManager", "checkPlatformPermission success");
                if (HpkPermissionManager.this.b(authorizationData.getScopes(), str)) {
                    HpkPermissionManager.this.b(permissionAuthenticationListener);
                    return;
                }
                LogUtil.a("FittingsPermissionManager", "The user does not apply for permission.");
                PermissionAuthenticationListener permissionAuthenticationListener2 = permissionAuthenticationListener;
                HpkPermissionManager hpkPermissionManager = HpkPermissionManager.this;
                permissionAuthenticationListener2.onResult(hpkPermissionManager.e(hpkPermissionManager.e));
            }

            @Override // com.huawei.health.ecologydevice.networkclient.OnRequestCallBack
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a("DEVMGR_FittingsPermissionManager", "checkPlatformPermission fail:", Integer.valueOf(i));
                PermissionAuthenticationListener permissionAuthenticationListener2 = permissionAuthenticationListener;
                HpkPermissionManager hpkPermissionManager = HpkPermissionManager.this;
                permissionAuthenticationListener2.onResult(hpkPermissionManager.e(hpkPermissionManager.e));
            }
        }).create().request();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(List<AuthorizationData.Scopes> list, String str) {
        LogUtil.a("FittingsPermissionManager", "checkScopeUrl");
        if (njy.e(list)) {
            return false;
        }
        Iterator<AuthorizationData.Scopes> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getUri())) {
                LogUtil.a("FittingsPermissionManager", "checkScopeUrl Has HEALTH_KIT_EXTEND_SPORT_READ_SCOPE_URL");
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final PermissionAuthenticationListener permissionAuthenticationListener) {
        LogUtil.a("DEVMGR_FittingsPermissionManager", "checkAuthorizationStatus");
        final CloudAuthApi cloudAuthApi = (CloudAuthApi) Services.b("Main", CloudAuthApi.class);
        final String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1015);
        cloudAuthApi.constructInstance(BaseApplication.b(), accountInfo);
        final String scopeLangItemUrl = cloudAuthApi.getScopeLangItemUrl(this.d, cloudAuthApi.getLang());
        LogUtil.a("FittingsPermissionManager", "Get cloudAuthApi in ThirdPartServiceActivity: ", scopeLangItemUrl);
        ThreadPoolManager.c().execute(new Runnable() { // from class: ekw
            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(cloudAuthApi, accountInfo, scopeLangItemUrl, permissionAuthenticationListener);
            }
        });
    }

    public /* synthetic */ void c(CloudAuthApi cloudAuthApi, String str, String str2, PermissionAuthenticationListener permissionAuthenticationListener) {
        fwp scopeLangItem = cloudAuthApi.getScopeLangItem(str, "GET", str2);
        if (scopeLangItem == null || scopeLangItem.j() == null) {
            LogUtil.j("FittingsPermissionManager", "scopeLangItem get null.");
            permissionAuthenticationListener.onResult(e(this.e));
            return;
        }
        Map<String, String> mapJ = scopeLangItem.j();
        LogUtil.a("FittingsPermissionManager", "getScopeLangItem scopeLangItem:", scopeLangItem);
        boolean zContains = mapJ.keySet().contains(Scopes.HEALTHKIT_EXTEND_SPORT_READ);
        LogUtil.a("FittingsPermissionManager", "HEALTH_KIT_EXTEND_SPORT_READ_SCOPE_URL HasPermission: ", Boolean.valueOf(zContains));
        permissionAuthenticationListener.onResult(zContains);
    }
}
