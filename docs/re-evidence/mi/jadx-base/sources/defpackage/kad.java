package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.mi.health.course.export.CourseApiKt;
import com.xiaomi.fitness.access.export.AccessManager;
import com.xiaomi.fitness.access.export.AccessManagerExtKt;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.common.utils.model.PackageNameWrapper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.SettingsPageUtilExtKt;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.login.export.PrivacyExtKt;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.main.export.MainExtKt;
import com.xiaomi.fitness.main.export.MainHelper;
import com.xiaomi.fitness.mine.export.IWebSync;
import com.xiaomi.fitness.notify.export.NotifyHelperExtKt;
import com.xiaomi.fitness.webview.WebPageUtil;
import com.xiaomi.fitness.webview.WebViewActivity;
import com.xiaomi.fitness.webview.bean.ModelSnWrapper;

/* JADX INFO: loaded from: classes10.dex */
public class kad {
    public static final String ACTION_SWITCH_DEVICE = "wear.action.SWITCH_DEVICE";
    private final Context mContext;
    public Runnable onGuideEndRunable;
    protected iqc webViewPage;
    private final String TAG = "InnerJavaScriptImpl";
    protected Handler mainHandler = new Handler(Looper.getMainLooper());

    public class a implements IWebSync {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f23655a;

        public a(FragmentActivity fragmentActivity) {
            this.f23655a = fragmentActivity;
        }

        @Override // com.xiaomi.fitness.mine.export.IWebSync
        public void onPrivacyNotAgree() {
            Logger.i("InnerJavaScriptImpl", "showHealthCloudSynRemindDialog onPrivacyNotAgree");
            PrivacyExtKt.showPrivacyActivity(kad.this.mContext, null, null);
            if (this.f23655a.isFinishing()) {
                return;
            }
            this.f23655a.lambda$onCreate$0();
        }

        @Override // com.xiaomi.fitness.mine.export.IWebSync
        public void onWebSyncAccepted() {
            Logger.i("InnerJavaScriptImpl", "showHealthCloudSynRemindDialog onWebSyncAccepted");
        }

        @Override // com.xiaomi.fitness.mine.export.IWebSync
        public void onWebSyncDenied() {
            Logger.i("InnerJavaScriptImpl", "showHealthCloudSynRemindDialog onWebSyncDenied");
            if (this.f23655a.isFinishing()) {
                return;
            }
            this.f23655a.lambda$onCreate$0();
        }
    }

    public kad(Context context, iqc iqcVar) {
        this.webViewPage = iqcVar;
        this.mContext = context;
    }

    private boolean isSupportFeature(WearableDeviceModel wearableDeviceModel, String str) {
        return wearableDeviceModel.getProduct().getFeatures().contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showHealthCloudSynRemindDialog$0(FragmentActivity fragmentActivity) {
        MainExtKt.getInstance(MainHelper.INSTANCE).showSportHealthCloudSynDialogIfNeed(fragmentActivity, new a(fragmentActivity));
    }

    private void notifyGuide() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || !isSupportFeature(wearableDeviceModel, "notification")) {
            NotifyHelperExtKt.getNotificationManagerExport().toGoalPage(this.mContext);
        } else {
            SettingsPageUtilExtKt.getSettingsPageUtil().gotoGuideSettingPage(this.mContext);
        }
    }

    @JavascriptInterface
    public void authorize() {
        Logger.i("InnerJavaScriptImpl", "js:authorize authorize");
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).grantAndJumpToPinganRedirectUrl(this.mContext);
        ((FragmentActivity) this.mContext).finish();
    }

    @JavascriptInterface
    public boolean canNavigateToSingleSportLaunchPage() {
        return true;
    }

    @JavascriptInterface
    public void exitPage() {
        finish();
    }

    @JavascriptInterface
    public void finish() {
        this.webViewPage.finishFromWeb();
    }

    @JavascriptInterface
    public String getAppRegion() {
        return RegionExtKt.getInstance(RegionManager.INSTANCE).getLocalCountry();
    }

    @JavascriptInterface
    public String getBrand() {
        StringBuilder sb = new StringBuilder();
        sb.append("getBrandSpecial is ");
        RomUtils romUtils = RomUtils.INSTANCE;
        sb.append(romUtils.getBrandSpecial());
        Logger.i("InnerJavaScriptImpl", sb.toString());
        return romUtils.getBrandSpecial();
    }

    @JavascriptInterface
    public String getCurrentDeviceModel() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        return wearableDeviceModel == null ? "" : wearableDeviceModel.getDeviceInfo().getModel();
    }

    @JavascriptInterface
    public String getCurrentDeviceModelSN() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        Gson gson = new Gson();
        if (wearableDeviceModel == null) {
            Logger.i("InnerJavaScriptImpl", "js:getCurrentDeviceModelSN curtDeviceModel is null");
            return gson.toJson(new ModelSnWrapper(null, null));
        }
        String model = wearableDeviceModel.getDeviceInfo().getModel();
        String sn = wearableDeviceModel.getDeviceInfo().getSn();
        Logger.i("InnerJavaScriptImpl", "js:getCurrentDeviceModelSN model=" + model + " sn=" + sn);
        return gson.toJson(new ModelSnWrapper(model, sn));
    }

    @JavascriptInterface
    public boolean getHealthCloudSynSwitch() {
        return RegionPreference.INSTANCE.getSyncWeb();
    }

    @JavascriptInterface
    public String getUserId() {
        return AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
    }

    @JavascriptInterface
    public void goToAppInfoActivity(String str) {
        Logger.i("InnerJavaScriptImpl", "goToAppInfoActivity jsonData=" + str);
        d2m.b(this.mContext, ((PackageNameWrapper) new Gson().fromJson(str, PackageNameWrapper.class)).getPackageName());
    }

    @JavascriptInterface
    public void goToSettingPage() {
        d2m.w(AppUtil.getApp());
    }

    @JavascriptInterface
    public void goToZeppLifeActivity() {
        AccessManagerExtKt.getInstance(AccessManager.INSTANCE).gotoMiSportImportActivity((Activity) this.mContext);
    }

    @JavascriptInterface
    public void gotoAutostartPage() {
        d2m.d(AppUtil.getApp());
    }

    @JavascriptInterface
    public void gotoBatteryOptimizePage() {
        d2m.j(AppUtil.getApp());
    }

    @JavascriptInterface
    public void gotoNotifyPage() {
        NotifyHelperExtKt.getNotificationManagerExport().requestNotificationPermission(null);
    }

    @JavascriptInterface
    public void gotoPage(String str) {
        WebPageUtil.INSTANCE.gotoPage(this.mContext, str);
    }

    @JavascriptInterface
    public void gotoPowSavePage() {
        d2m.o(AppUtil.getApp());
    }

    @JavascriptInterface
    public void gotoRunBgPage() {
        d2m.r(AppUtil.getApp());
    }

    @JavascriptInterface
    public boolean isConnected() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected();
    }

    @JavascriptInterface
    public boolean isDeviceBound() {
        return !DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceList().isEmpty();
    }

    @JavascriptInterface
    public void isIgnoringBatteryOptimizations() {
        d2m.y(AppUtil.getApp());
    }

    @JavascriptInterface
    public boolean isThirdPartyApkInstalled(String str) {
        return MarketUtil.checkAppInstalled(this.mContext, ((PackageNameWrapper) new Gson().fromJson(str, PackageNameWrapper.class)).getPackageName());
    }

    @JavascriptInterface
    public void navigateToCourseInfoPage(String str) {
        Logger.i("InnerJavaScriptImpl", "navigateToCourseInfoPage jsonData=" + str);
        CourseApiKt.getCourseApi().goToCourseInfoPage(str);
    }

    @JavascriptInterface
    public void onDeviceGuidFinish() {
        Runnable runnable = this.onGuideEndRunable;
        if (runnable != null) {
            this.mainHandler.post(runnable);
        }
    }

    @JavascriptInterface
    public void popHistory() {
        Logger.d("|WEBVIEW|JavascriptInterface，popHistory", new Object[0]);
        iqc iqcVar = this.webViewPage;
        if (iqcVar == null) {
            return;
        }
        iqcVar.popHistory();
    }

    @JavascriptInterface
    public void requestIgnoreBatteryOptimizations() {
        d2m.A(AppUtil.getApp());
    }

    @JavascriptInterface
    public void showHealthCloudSynRemindDialog() {
        Context context = this.mContext;
        if (context instanceof WebViewActivity) {
            final FragmentActivity fragmentActivity = (FragmentActivity) context;
            this.mainHandler.post(new Runnable() { // from class: jad
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22589a.lambda$showHealthCloudSynRemindDialog$0(fragmentActivity);
                }
            });
        }
    }
}
