package com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr;

import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.coq;
import defpackage.fcw;
import defpackage.fcz;
import defpackage.fda;
import defpackage.fdy;
import defpackage.fek;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes18.dex */
public class WalletAppCloudService {
    private static final long CONFIG_UPDATE_CHECK_INTERVAL = 30000;
    private static final int ERROR_FILE_VERSION = Integer.MIN_VALUE;
    private static final String HEALTH_CLOUD_WALLET_CONFIG_FLAG = "com.huawei.health_common_config";
    private static final String RULE_KEY = "resources";
    private static final String RULE_VALUE = "home_page_resources";
    private static final String TAG = "WalletAppCloudService";
    private static final String TAG_RELEASE = "R_WalletAppCloudService";
    private static final String WALLET_APPLICATION_ICON_FILE_ID = "wearable_nfc_payment_device_whitelist_zip";
    private static final String WALLET_APPLICATION_LIST_FILE_ID = "wearable_nfc_payment_device_whitelist";
    private static final String WALLET_APPLICATION_MODULE_ID = "wallet_application";
    private static final String WALLET_ICON_DIR_NAME = "wallet_icon";
    private Map<String, Integer> mConfigLatestVersionMap;
    private long mLastUpdateTime;

    static class SingletonHolder {
        private static final WalletAppCloudService INSTANCE = new WalletAppCloudService();

        private SingletonHolder() {
        }
    }

    private WalletAppCloudService() {
        this.mLastUpdateTime = 0L;
        this.mConfigLatestVersionMap = new ConcurrentHashMap();
    }

    public static WalletAppCloudService getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void downloadWalletAppListConfig(final String str, final ResponseCallback<CloudWalletApplicationConfig> responseCallback) {
        LogUtil.a(TAG, "downloadCloudWalletAppConfig enter");
        File file = new File(str);
        if (file.exists() && !isNeedUpdateConfig(WALLET_APPLICATION_LIST_FILE_ID)) {
            LogUtil.a(TAG, "downloadWalletAppListConfig from local cache");
            CloudWalletApplicationConfig cloudWalletApplicationConfigCovertToWalletConfig = covertToWalletConfig(file);
            if (cloudWalletApplicationConfigCovertToWalletConfig == null) {
                responseCallback.onResponse(-1, null);
                return;
            } else {
                responseCallback.onResponse(0, cloudWalletApplicationConfigCovertToWalletConfig);
                return;
            }
        }
        LogUtil.a(TAG, "downloadWalletAppListConfig from cloud");
        getInstance().downloadHealthCloudWalletConfig(WALLET_APPLICATION_LIST_FILE_ID, new ResponseCallback() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppCloudService$$ExternalSyntheticLambda0
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1696xbf2a3330(responseCallback, str, i, (File) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$downloadWalletAppListConfig$0$com-huawei-ui-homewear21-home-manager-hwnfcwalletmgr-WalletAppCloudService, reason: not valid java name */
    /* synthetic */ void m1696xbf2a3330(ResponseCallback responseCallback, String str, int i, File file) {
        if (i != 0) {
            responseCallback.onResponse(i, null);
            return;
        }
        try {
            FileUtils.e(file, new File(str));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "downloadWalletAppListConfig copy json file error:", ExceptionUtils.c(e));
        }
        CloudWalletApplicationConfig cloudWalletApplicationConfigCovertToWalletConfig = covertToWalletConfig(file);
        if (cloudWalletApplicationConfigCovertToWalletConfig == null) {
            responseCallback.onResponse(-1, null);
        } else {
            responseCallback.onResponse(0, cloudWalletApplicationConfigCovertToWalletConfig);
        }
    }

    public void downloadIconResources(final String str, final Runnable runnable) {
        LogUtil.a(TAG, "downloadIconResources enter");
        if (new File(str, WALLET_ICON_DIR_NAME).exists() && !isNeedUpdateConfig(WALLET_APPLICATION_ICON_FILE_ID)) {
            LogUtil.a(TAG, "downloadIconResources from local cache");
            runnable.run();
        } else {
            getInstance().downloadHealthCloudWalletConfig(WALLET_APPLICATION_ICON_FILE_ID, new ResponseCallback() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppCloudService$$ExternalSyntheticLambda1
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    WalletAppCloudService.lambda$downloadIconResources$1(runnable, str, i, (File) obj);
                }
            });
        }
    }

    static /* synthetic */ void lambda$downloadIconResources$1(Runnable runnable, String str, int i, File file) {
        if (i != 0) {
            runnable.run();
            return;
        }
        LogUtil.a(TAG, "downloadIconResources unzip save to local");
        try {
            int iA = fek.a(file.getCanonicalPath(), FileUtils.c(new File(str)).getCanonicalPath());
            if (iA < 0) {
                ReleaseLogUtil.a(TAG_RELEASE, "downloadIconResources unzip error");
            }
            LogUtil.a(TAG, "downloadIconResources unzip amount:", Integer.valueOf(iA));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "downloadIconResources unzip io error:", ExceptionUtils.c(e));
        }
        runnable.run();
    }

    private void downloadHealthCloudWalletConfig(final String str, final ResponseCallback<File> responseCallback) {
        LogUtil.a(TAG, "downloadHealthCloudWalletConfig enter ", str);
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final Integer num = this.mConfigLatestVersionMap.get(str);
        fdy.d(getRequestBody(), str, new DownloadCallback<File>() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppCloudService.1
            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onProgress(long j, long j2, boolean z, String str2) {
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFinish(File file) {
                ReleaseLogUtil.d(WalletAppCloudService.TAG_RELEASE, "downloadCallback ", str, " finish size:", Long.valueOf(file.length()), " cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                Integer num2 = num;
                if (num2 != null) {
                    ReleaseLogUtil.d(WalletAppCloudService.TAG_RELEASE, "downloadCallback file update to:", num2);
                    WalletAppCloudService.this.saveResourceVersion(str, num.intValue());
                }
                responseCallback.onResponse(0, file);
            }

            @Override // com.huawei.health.healthcloudconfig.listener.DownloadCallback
            public void onFail(int i, Throwable th) {
                ReleaseLogUtil.a(WalletAppCloudService.TAG_RELEASE, "downloadHealthCloudWalletConfig ", str, " error:", Integer.valueOf(i));
                responseCallback.onResponse(-1, null);
            }
        });
    }

    private void updateFileLatestVersion() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.mLastUpdateTime < 30000) {
            ReleaseLogUtil.d(TAG_RELEASE, "isNeedUpdateConfig skip version update");
            return;
        }
        fcz fczVarD = fdy.d(HEALTH_CLOUD_WALLET_CONFIG_FLAG, getRequestBody());
        ReleaseLogUtil.d(TAG_RELEASE, "updateFileLatestVersion get version info");
        if (fczVarD == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "updateFileLatestVersion response is null");
            return;
        }
        List<fcw> listA = fczVarD.a();
        if (coq.d(listA)) {
            ReleaseLogUtil.e(TAG_RELEASE, "updateFileLatestVersion fileList is empty.");
            return;
        }
        this.mLastUpdateTime = jElapsedRealtime;
        for (fcw fcwVar : listA) {
            String strC = fcwVar.c();
            if (WALLET_APPLICATION_LIST_FILE_ID.equals(strC) || WALLET_APPLICATION_ICON_FILE_ID.equals(strC)) {
                int i = Integer.parseInt(fcwVar.e());
                this.mConfigLatestVersionMap.put(strC, Integer.valueOf(i));
                ReleaseLogUtil.d(TAG_RELEASE, "updateFileLatestVersion ", strC, " version:", Integer.valueOf(i));
            }
        }
    }

    private boolean isNeedUpdateConfig(String str) {
        updateFileLatestVersion();
        int resourceVersion = getResourceVersion(str);
        Integer num = this.mConfigLatestVersionMap.get(str);
        return num == null || num.intValue() > resourceVersion;
    }

    private CloudWalletApplicationConfig covertToWalletConfig(File file) {
        try {
            String strA = FileUtils.a(file, file.length());
            if (TextUtils.isEmpty(strA)) {
                ReleaseLogUtil.a(TAG_RELEASE, "covertToWalletConfig config json is empty");
                return null;
            }
            CloudWalletApplicationConfig cloudWalletApplicationConfigLoads = CloudWalletApplicationConfig.loads(strA);
            ReleaseLogUtil.a(TAG_RELEASE, "covertToWalletConfig obj:", cloudWalletApplicationConfigLoads);
            if (cloudWalletApplicationConfigLoads == null) {
                ReleaseLogUtil.a(TAG_RELEASE, "covertToWalletConfig json loads error");
                return null;
            }
            LogUtil.a(TAG, "covertToWalletConfig success");
            return cloudWalletApplicationConfigLoads;
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "covertToWalletConfig read app list io error:", ExceptionUtils.c(e));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveResourceVersion(String str, int i) {
        LogUtil.a(TAG, "saveResourceVersion", str, " version:", Integer.valueOf(i));
        SharedPreferenceManager.d(WALLET_APPLICATION_MODULE_ID, str, i);
    }

    private int getResourceVersion(String str) {
        int iC = SharedPreferenceManager.c(WALLET_APPLICATION_MODULE_ID, str, Integer.MIN_VALUE);
        LogUtil.a(TAG, "getResourceVersion ", str, " version:", Integer.valueOf(iC));
        return iC;
    }

    private fda getRequestBody() {
        HashMap map = new HashMap();
        map.put(RULE_KEY, RULE_VALUE);
        return new fda(HEALTH_CLOUD_WALLET_CONFIG_FLAG, map);
    }
}
