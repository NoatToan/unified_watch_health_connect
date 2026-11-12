package com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.HwGetDevicesParameter;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.ui.homewear21.R;
import com.huawei.wear.oversea.overseamanger.OverSeaMangerUtil;
import com.huawei.wear.oversea.overseamanger.OverSeaQueryCallBack;
import defpackage.ddv;
import defpackage.ecu;
import defpackage.nio;
import defpackage.njy;
import defpackage.rgd;
import defpackage.tqp;
import defpackage.xjl;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public class WalletAppManager {
    private static final String ANDROID_FLAG = "android";
    private static final String BASE64_IMG_PREFIX = "data:image/png;base64,";
    private static final String H5_PATH = "#/wallet";
    private static final String HUAWEI_WALLET_ICON = "wallet_huawei_wallet";
    private static final String HUAWEI_WALLET_NAME = "HUAWEI Wallet";
    private static final String ICON_LOCAL_RESOURCE_SUFFIX = ".png";
    private static final String SUPPORT_WALLET_CACHE_KEY_PREFIX = "support_wallet";
    private static final String TAG = "NfcWalletManager";
    private static final String TAG_RELEASE = "R_NfcWalletManager";
    private static final String WALLET_APPLICATION_MODULE_ID = "wallet_application";
    private static final String WALLET_CONFIG_JSON_NAME = "wallet_app.json";
    private static final String WALLET_DEFAULT_ICON_NAME = "default_wallet_app.png";
    private static final String WALLET_HUAWEI_ICON_NAME = "oversea_wallet_huawei_icon.png";
    private static final String WALLET_ICON_DIR_NAME = "wallet_icon";
    private static final String WALLET_ROOT_DIR_NAME = "walletApplication";
    private String mWalletIconDir;
    private String mWalletJsonFilePath;
    private String mWalletManagerRootDir;

    /* JADX INFO: loaded from: classes18.dex */
    static class SingletonHolder {
        private static final WalletAppManager INSTANCE = new WalletAppManager();

        private SingletonHolder() {
        }
    }

    public static WalletAppManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private WalletAppManager() {
        try {
            this.mWalletManagerRootDir = BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + WALLET_ROOT_DIR_NAME;
            this.mWalletIconDir = this.mWalletManagerRootDir + File.separator + WALLET_ICON_DIR_NAME;
            this.mWalletJsonFilePath = this.mWalletManagerRootDir + File.separator + WALLET_CONFIG_JSON_NAME;
            FileUtils.c(new File(this.mWalletManagerRootDir));
        } catch (IOException e) {
            ReleaseLogUtil.a(TAG_RELEASE, "NfcWalletManager mWalletManagerRootDir IOException:", ExceptionUtils.c(e));
        }
    }

    public void startNfcWalletH5() {
        ReleaseLogUtil.d(TAG_RELEASE, "startNfcWalletH5 enter");
        if (ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE) == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "startNfcWalletH5 device not connected");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        ddv ddvVarB = ddv.b();
        builder.addPath(H5_PATH);
        builder.addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi"));
        builder.addCustomizeJsModule("device", ddvVarB.getCommonJsModule("device"));
        builder.addCustomizeJsModule("BasePairManager", BasePairManagerJsApi.class);
        builder.setImmerse().showStatusBar();
        builder.setForceDarkMode(1);
        ddvVarB.initH5Pro();
        H5ProClient.getServiceManager().registerService(WalletAppJs.class);
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
        H5ProClient.startH5MiniProgram(BaseApplication.getContext(), "com.huawei.health.h5.dm-ccbk", builder.build());
    }

    public void startHuaweiWalletActivity() {
        ReleaseLogUtil.d(TAG_RELEASE, "startHuaweiWalletActivity enter");
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
        Context context = BaseApplication.getContext();
        tqp.b(context);
        tqp.d(context, deviceInfo.getDeviceIdentify());
    }

    public void getWalletApplicationList(final ResponseCallback<List<WalletApplication>> responseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "getWalletApplicationList enter");
        if (responseCallback == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWalletApplicationList callback is null");
            return;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG_RELEASE);
        if (deviceInfo == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWalletApplicationList device info is null");
            responseCallback.onResponse(-1, null);
        } else {
            getValidWalletApplication(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager$$ExternalSyntheticLambda0
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f$0.m1700xbe81bed7(responseCallback, i, (List) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$getWalletApplicationList$1$com-huawei-ui-homewear21-home-manager-hwnfcwalletmgr-WalletAppManager, reason: not valid java name */
    /* synthetic */ void m1700xbe81bed7(final ResponseCallback responseCallback, int i, final List list) {
        if (njy.e(list)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getWalletApplicationList support wallet is empty");
            responseCallback.onResponse(-1, list);
        } else {
            WalletAppCloudService.getInstance().downloadIconResources(this.mWalletManagerRootDir, new Runnable() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1699xdb560b96(list, responseCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$getWalletApplicationList$0$com-huawei-ui-homewear21-home-manager-hwnfcwalletmgr-WalletAppManager, reason: not valid java name */
    /* synthetic */ void m1699xdb560b96(List list, ResponseCallback responseCallback) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WalletApplication walletApplication = (WalletApplication) it.next();
            walletApplication.getIcon();
            walletApplication.setIcon(getIconBase64(walletApplication));
        }
        ReleaseLogUtil.d(TAG_RELEASE, "getWalletApplicationList response");
        responseCallback.onResponse(0, list);
    }

    public void getValidWalletApplication(String str, final ResponseCallback<List<WalletApplication>> responseCallback) {
        ReleaseLogUtil.d(TAG_RELEASE, "getValidWalletApplication enter");
        HwGetDevicesParameter hwGetDevicesParameter = new HwGetDevicesParameter();
        hwGetDevicesParameter.setDeviceIdentify(str);
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.IDENTIFY_DEVICES, hwGetDevicesParameter, TAG);
        if (njy.e(deviceList)) {
            ReleaseLogUtil.e(TAG_RELEASE, "getValidWalletApplication device info is empty");
            responseCallback.onResponse(-1, null);
        } else {
            final DeviceInfo deviceInfo = deviceList.get(0);
            final CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            ThreadPoolManager.d(1, 1).a(TAG_RELEASE, new Runnable() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m1698x2b0b692(deviceInfo, copyOnWriteArrayList, responseCallback);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$getValidWalletApplication$4$com-huawei-ui-homewear21-home-manager-hwnfcwalletmgr-WalletAppManager, reason: not valid java name */
    /* synthetic */ void m1698x2b0b692(DeviceInfo deviceInfo, final List list, ResponseCallback responseCallback) {
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        isSupportOverseaHuaweiWallet(deviceInfo, new ResponseCallback() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager$$ExternalSyntheticLambda3
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WalletAppManager.lambda$getValidWalletApplication$2(list, countDownLatch, i, (Boolean) obj);
            }
        });
        getValidThirdPartWallet(deviceInfo, new ResponseCallback() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager$$ExternalSyntheticLambda4
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                WalletAppManager.lambda$getValidWalletApplication$3(list, countDownLatch, i, (List) obj);
            }
        });
        try {
            countDownLatch.await();
            ReleaseLogUtil.d(TAG_RELEASE, "getValidWalletApplication size:", Integer.valueOf(list.size()));
            responseCallback.onResponse(0, list);
        } catch (InterruptedException unused) {
            responseCallback.onResponse(-1, list);
        }
    }

    static /* synthetic */ void lambda$getValidWalletApplication$2(List list, CountDownLatch countDownLatch, int i, Boolean bool) {
        if (bool.booleanValue()) {
            list.add(0, new WalletApplication(HUAWEI_WALLET_NAME, HUAWEI_WALLET_ICON));
        }
        countDownLatch.countDown();
    }

    static /* synthetic */ void lambda$getValidWalletApplication$3(List list, CountDownLatch countDownLatch, int i, List list2) {
        if (njy.b(list2)) {
            list.addAll(list2);
        }
        countDownLatch.countDown();
    }

    public boolean isOverseaService() {
        return !Objects.equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014), "CN");
    }

    public boolean getIsSupportWalletApp(String str) {
        String strC = nio.c(SUPPORT_WALLET_CACHE_KEY_PREFIX + str);
        boolean zB = SharedPreferenceManager.b(WALLET_APPLICATION_MODULE_ID, strC, false);
        ReleaseLogUtil.d(TAG_RELEASE, "getIsSupportWalletApp ", strC, " support:", Boolean.valueOf(zB));
        return zB;
    }

    public void setIsSupportWalletApp(String str, boolean z) {
        String strC = nio.c(SUPPORT_WALLET_CACHE_KEY_PREFIX + str);
        SharedPreferenceManager.a(WALLET_APPLICATION_MODULE_ID, strC, z);
        ReleaseLogUtil.d(TAG_RELEASE, "setIsSupportWalletApp ", strC, " support:", Boolean.valueOf(z));
    }

    private void isSupportOverseaHuaweiWallet(DeviceInfo deviceInfo, final ResponseCallback<Boolean> responseCallback) {
        if (!rgd.a(deviceInfo.getDeviceIdentify())) {
            responseCallback.onResponse(0, false);
        } else {
            OverSeaMangerUtil.a(BaseApplication.getContext()).e(rgd.a(deviceInfo), new OverSeaQueryCallBack() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager.1
                @Override // com.huawei.wear.oversea.overseamanger.OverSeaQueryCallBack
                public int onSuccess(int i) {
                    ReleaseLogUtil.d(WalletAppManager.TAG_RELEASE, "getHuaweiWallet onSuccess");
                    responseCallback.onResponse(0, true);
                    return i;
                }

                @Override // com.huawei.wear.oversea.overseamanger.OverSeaQueryCallBack
                public int onFail(int i) {
                    ReleaseLogUtil.d(WalletAppManager.TAG_RELEASE, "getHuaweiWallet onFail returnCode is:", Integer.valueOf(i));
                    responseCallback.onResponse(-1, false);
                    return i;
                }
            });
        }
    }

    private void getValidThirdPartWallet(DeviceInfo deviceInfo, final ResponseCallback<List<WalletApplication>> responseCallback) {
        final String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
        ReleaseLogUtil.d(TAG_RELEASE, "getValidThirdPartWallet enter: ", accountInfo);
        final String deviceModel = deviceInfo.getDeviceModel();
        final ArrayList arrayList = new ArrayList();
        WalletAppCloudService.getInstance().downloadWalletAppListConfig(this.mWalletJsonFilePath, new ResponseCallback() { // from class: com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager$$ExternalSyntheticLambda5
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f$0.m1697xa9e4b40f(responseCallback, arrayList, accountInfo, deviceModel, i, (CloudWalletApplicationConfig) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$getValidThirdPartWallet$5$com-huawei-ui-homewear21-home-manager-hwnfcwalletmgr-WalletAppManager, reason: not valid java name */
    /* synthetic */ void m1697xa9e4b40f(ResponseCallback responseCallback, List list, String str, String str2, int i, CloudWalletApplicationConfig cloudWalletApplicationConfig) {
        if (i != 0 || cloudWalletApplicationConfig == null) {
            ReleaseLogUtil.a(TAG_RELEASE, "getWalletApplicationList error:", Integer.valueOf(i));
            responseCallback.onResponse(-1, list);
            return;
        }
        List<CloudWalletApplicationConfig.WalletApplicationCountryConfig> walletConfig = cloudWalletApplicationConfig.getWalletConfig();
        if (njy.e(walletConfig)) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWalletApplicationList app country config is empty");
            responseCallback.onResponse(-1, list);
            return;
        }
        ReleaseLogUtil.d(TAG_RELEASE, "getValidThirdPartWallet handle config");
        for (CloudWalletApplicationConfig.WalletApplicationCountryConfig walletApplicationCountryConfig : walletConfig) {
            if (walletApplicationCountryConfig.getCountryCode().equalsIgnoreCase(str)) {
                ReleaseLogUtil.d(TAG_RELEASE, "getWalletApplicationList country found");
                List<CloudWalletApplicationConfig.WalletApplicationConfig> applications = walletApplicationCountryConfig.getApplications();
                if (njy.e(applications)) {
                    ReleaseLogUtil.e(TAG_RELEASE, "getWalletApplicationList applications is empty");
                    break;
                }
                for (CloudWalletApplicationConfig.WalletApplicationConfig walletApplicationConfig : applications) {
                    List<String> platforms = walletApplicationConfig.getPlatforms();
                    List<String> deviceModels = walletApplicationConfig.getDeviceModels();
                    if (njy.e(platforms) || njy.e(deviceModels)) {
                        ReleaseLogUtil.e(TAG_RELEASE, "getWalletApplicationList platforms or device models is empty");
                    } else if (containsIgnoreCase(platforms, "android") && containsIgnoreCase(deviceModels, str2)) {
                        ReleaseLogUtil.d(TAG_RELEASE, "getWalletApplicationList found:", walletApplicationConfig.getName());
                        list.add(new WalletApplication(walletApplicationConfig.getName(), walletApplicationConfig.getIcon(), walletApplicationConfig.getDeeplink()));
                    }
                }
            }
        }
        responseCallback.onResponse(0, list);
    }

    private String getIconBase64(WalletApplication walletApplication) throws Throwable {
        String icon = walletApplication.getIcon();
        if (walletApplication.isHuaweiWallet()) {
            return getWalletIconResourceBase64(WALLET_HUAWEI_ICON_NAME);
        }
        File file = new File(this.mWalletIconDir, icon + ".png");
        if (!file.exists()) {
            LogUtil.a(TAG, "getIconBase64 icon not found:", icon);
            return getWalletIconResourceBase64(WALLET_DEFAULT_ICON_NAME);
        }
        byte[] bArrA = xjl.a(file);
        if (bArrA == null) {
            ReleaseLogUtil.a(TAG_RELEASE, "getIconBase64 read file error");
            return getWalletIconResourceBase64(WALLET_DEFAULT_ICON_NAME);
        }
        return BASE64_IMG_PREFIX + Base64.encodeToString(bArrA, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    private String getWalletIconResourceBase64(String str) throws Throwable {
        Bitmap bitmapDecodeResource;
        Throwable th;
        FileOutputStream fileOutputStream;
        File file = new File(this.mWalletManagerRootDir, str);
        ?? r5 = 0;
        if (!file.exists()) {
            if (WALLET_HUAWEI_ICON_NAME.equals(str)) {
                bitmapDecodeResource = BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.oversea_wallet_huawei_icon);
            } else {
                bitmapDecodeResource = WALLET_DEFAULT_ICON_NAME.equals(str) ? BitmapFactory.decodeResource(BaseApplication.getContext().getResources(), R.drawable.default_wallet_app) : null;
            }
            try {
                if (bitmapDecodeResource == null) {
                    ReleaseLogUtil.a(TAG_RELEASE, "getWalletIconResourceBase64 bitmap is null, icon:", str);
                    return null;
                }
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmapDecodeResource.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused) {
                            ReleaseLogUtil.a(TAG_RELEASE, "getDefaultIconBase64 close file error");
                        }
                    } catch (FileNotFoundException unused2) {
                        ReleaseLogUtil.a(TAG_RELEASE, "getDefaultIconBase64 create file error");
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                                ReleaseLogUtil.a(TAG_RELEASE, "getDefaultIconBase64 close file error");
                            }
                        }
                        return null;
                    }
                } catch (FileNotFoundException unused4) {
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (r5 != 0) {
                        try {
                            r5.close();
                        } catch (IOException unused5) {
                            ReleaseLogUtil.a(TAG_RELEASE, "getDefaultIconBase64 close file error");
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                r5 = str;
                th = th3;
            }
        }
        byte[] bArrA = xjl.a(file);
        if (bArrA == null) {
            ReleaseLogUtil.a(TAG_RELEASE, "getDefaultIconBase64 read file error");
            return null;
        }
        return BASE64_IMG_PREFIX + Base64.encodeToString(bArrA, 0);
    }

    private boolean containsIgnoreCase(List<String> list, String str) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
