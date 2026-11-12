package com.xiaomi.hm.health.activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.chenenyu.router.annotation.Route;
import com.huami.account.HMLoginManager;
import com.huami.account.HMLogoutManager;
import com.huami.account.HMProcessLoginDataManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.service.AuthNavigation;
import com.huami.account.service.model.LoginViewOptions;
import com.huami.account.ui.common.BaseTitleOauthActivity;
import com.huami.datavaults.antidebug.AntiDebug;
import com.huami.datavaults.antirepack.AntiRepack;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.mifit.sportlib.core.GPSDataController;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.view.basetitle.SystemBarTintManager;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.datautil.HMDataCacheCenter;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMGt2SystemUpgradeActivity;
import com.xiaomi.hm.health.device.firmware.FwUnZipStatusHolder;
import com.xiaomi.hm.health.device.service.FindPhoneWrapper;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinListActivity;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinManager;
import com.xiaomi.hm.health.device.watchskinstore.ui.WatchSkinDetailActivity;
import com.xiaomi.hm.health.manager.HMAdManager;
import com.xiaomi.hm.health.privacy.AnonymousManager;
import com.xiaomi.hm.health.utils.BraceletForegroundCallBack;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.webapi.ServerFaultHelper;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.File;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes19.dex */
@Route({"launch/StartUpActivity"})
public class StartUpActivity extends BaseTitleOauthActivity {
    private static final String C = "outside_login_id";
    private static final String D = "outside_web_url";
    private static final String E = "hm_id";
    private static final String F = "login_type";
    public static final String FROM_JS_BRIDGE = "JS_BRIDGE";
    public static final String FROM_LOGOUT = "from_logout";
    public static final String FROM_LOGOUT_BY_USER = "from_logout_by_user";
    public static final String FROM_NOTIFY = "FROM_NOTIFY";
    public static final String FROM_NOTIFY_KEY = "FROM_NOTIFY_KEY";
    private static final String G = "ROOT_CHECK";
    public static final String KEY_INTENT_TYPE = "KEY_INTENT_TYPE";
    public static final String KEY_INTENT_URL = "KEY_INTENT_URL";
    public static final String KEY_IS_SYSTEM_UPGRADING = "KEY_IS_SYSTEM_UPGRADING";
    public static final String NFC_CARD_HOST = "nfccard";
    private final String A = "StartUpActivity";
    private Context B = this;
    public NavigationController mNavigationController;

    private boolean A() {
        return getIntent().getBooleanExtra(FROM_LOGOUT, false);
    }

    private boolean B() {
        if (TextUtils.isEmpty(WatchSkinManager.getWatchSkinPath(getIntent()))) {
            return false;
        }
        return HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_PEYTO) || HMDeviceConfig.isCincoSeries() || HMDeviceManager.getInstance().hasBound(HMDeviceSource.MILI_TEMPO);
    }

    private boolean C() {
        long longExtra = getIntent().getLongExtra(E, -1L);
        long longExtra2 = getIntent().getLongExtra(C, -1L);
        return !(TextUtils.isEmpty((longExtra > (-1L) ? 1 : (longExtra == (-1L) ? 0 : -1)) == 0 ? null : String.valueOf(longExtra)) && TextUtils.isEmpty(longExtra2 != -1 ? String.valueOf(longExtra2) : null)) && HMLoginManager.isUserValid();
    }

    private boolean D() {
        Intent intent = getIntent();
        Uri data = intent == null ? null : intent.getData();
        return data != null && NFC_CARD_HOST.equals(data.getHost());
    }

    private boolean E() {
        Bundle extras = getIntent().getExtras();
        return !isTaskRoot() && !isFromOauth() && getIntent().getData() == null && (extras == null || y(extras) || z(extras));
    }

    private boolean F() {
        String str = Build.TAGS;
        if ((str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return new File("/system/xbin/su").exists();
        }
        return true;
    }

    private boolean G() {
        return HMLoginManager.isOldUser() && HMAccountKeeper.INSTANCE.getAppRestart();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        FwUnZipStatusHolder.INSTANCE.setStarting(true);
        HMAdManager.initAdLogic();
        ServerFaultHelper.resetStatus();
        if (x()) {
            FindPhoneWrapper.INSTANCE.stopFindPhone(this, false);
        }
        I();
        HMLogoutManager.dealDataIfAppRestart();
        if (HMLoginManager.isOldUser() && GPSDataController.getInstance().isRunning()) {
            if (!E()) {
                goNextPage();
                return;
            }
            if (isFromSystemUpgrade(getIntent())) {
                HMGt2SystemUpgradeActivity.launch(this, false, false, false);
            }
            finish();
            return;
        }
        this.mNavigationController = new NavigationController(this);
        if (!G()) {
            if (C()) {
                u();
                return;
            } else if (A()) {
                goNextPage();
                return;
            } else {
                J();
                return;
            }
        }
        if (E()) {
            if (isFromSystemUpgrade(getIntent())) {
                HMGt2SystemUpgradeActivity.launch(this, false, false, false);
            }
            finish();
        } else {
            setContentView(R.layout.activity_start_up);
            setStyle(BaseTitleActivity.STYLE.NONE, 0, false);
            this.mNavigationController.navigateToAd(Utils.shouldShowAd());
            HMDataCacheCenter.getInstance().checkNeedSyncData();
        }
    }

    private void I() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        SystemBarTintManager.SystemBarConfig config = new SystemBarTintManager(this).getConfig();
        int i3 = 0;
        if (config.hasNavigtionBar()) {
            int navigationBarHeight = config.getNavigationBarHeight();
            HMLog.i("StartUpActivity", "barHeight = " + navigationBarHeight, new Object[0]);
            i3 = navigationBarHeight;
        }
        Utils.setBarHeight(i3);
        Utils.setScreenWidth(i);
        Utils.setScreenHeight(i2 + i3);
    }

    private void J() {
        setContentView(R.layout.activity_start_up);
        setStyle(BaseTitleActivity.STYLE.NONE, ContextCompat.getColor(this, R.color.trans), false);
        this.mNavigationController.navigateToAd(false);
    }

    public static boolean isFromSystemUpgrade(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.getBooleanExtra(KEY_IS_SYSTEM_UPGRADING, false);
    }

    private void t() {
        if (F()) {
            Analytics.recordEvent(new CountEventBuilder(G));
        }
    }

    private void u() {
        String stringExtra = getIntent().getStringExtra(D);
        if (TextUtils.isEmpty(stringExtra)) {
            w();
        } else {
            v(stringExtra);
        }
    }

    private void v(String url) {
        HMIntentHandler.HMAction hMAction = HMIntentHandler.parse(Uri.parse(url));
        if (hMAction == null || !hMAction.isValid()) {
            return;
        }
        HMLog.d("StartUpActivity", "deal protocol: " + url, new Object[0]);
        HMIntentHandler.doAction(this, hMAction);
    }

    private void w() {
        long longExtra = getIntent().getLongExtra(E, -1L);
        long longExtra2 = getIntent().getLongExtra(C, -1L);
        if (HMLoginManager.theSameUser(longExtra == -1 ? null : String.valueOf(longExtra), longExtra2 != -1 ? String.valueOf(longExtra2) : null, getIntent().getStringExtra(F))) {
            goNextPage();
        } else {
            IconToast.showError(this.B, getString(R.string.watch_req_with_diff_user));
        }
    }

    private boolean x() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return false;
        }
        return y(extras);
    }

    private boolean y(@NonNull Bundle extras) {
        return FROM_NOTIFY.equals(extras.getString(FROM_NOTIFY_KEY));
    }

    private boolean z(@NonNull Bundle extras) {
        return getIntent().hasCategory("android.intent.category.LAUNCHER") && "android.intent.action.MAIN".equals(getIntent().getAction()) && extras.getSerializable(PushMessageHelper.KEY_MESSAGE) == null;
    }

    public void goNextPage() {
        HMLog.d("StartUpActivity", "goNextPage: ", new Object[0]);
        Intent intent = new Intent();
        intent.setAction(getIntent().getAction());
        Uri data = getIntent().getData();
        Bundle extras = getIntent().getExtras();
        if (data != null) {
            intent.setData(data);
        }
        if (extras != null) {
            intent.putExtras(extras);
        }
        if (AnonymousManager.isAnonymousLogin()) {
            AnonymousManager.initAnonymousUser(this);
            intent.setClass(this, MainTabActivity.class);
            startActivity(intent);
            finish();
            return;
        }
        if (HMLoginManager.isUnInit()) {
            AuthNavigation authNavigation = (AuthNavigation) KoinJavaComponent.get(AuthNavigation.class);
            LoginViewOptions loginViewOptions = new LoginViewOptions();
            if (D()) {
                loginViewOptions = LoginViewOptions.showTip();
            }
            loginViewOptions.setShowBack(false);
            if (intent.getBooleanExtra(FROM_LOGOUT_BY_USER, false)) {
                authNavigation.navigateToNormalLogin(this, loginViewOptions, intent.getExtras());
            } else {
                authNavigation.navigateToLogin(this, loginViewOptions, intent.getExtras());
            }
            finish();
            return;
        }
        if (HMLoginManager.isNewUser()) {
            HMProcessLoginDataManager.goBindPhoneOrSetInfoPage(this, getIntent());
            finish();
            return;
        }
        if (B()) {
            HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
            if (boundDeviceSource == HMDeviceSource.MILI_CINCO || boundDeviceSource == HMDeviceSource.MILI_CINCO_L) {
                intent.setClass(this, WatchSkinDetailActivity.class);
                intent.putExtra("device", boundDeviceSource);
                intent.putExtra(WatchSkinDetailActivity.KEY_FROM_OUTSIDE, true);
            } else {
                intent.setClass(this, WatchSkinListActivity.class);
            }
        } else {
            if (BraceletForegroundCallBack.getInstance().isForeground() && HMIntentHandler.processIntent(this, intent)) {
                HMLog.i("StartUpActivity", "isForeground:" + BraceletForegroundCallBack.getInstance().isForeground() + " isPush:true", new Object[0]);
                finish();
                return;
            }
            if (isFromSystemUpgrade(getIntent())) {
                intent.setClass(this, MainTabActivity.class);
                intent.putExtra(KEY_IS_SYSTEM_UPGRADING, true);
            } else {
                intent.setClass(this, MainTabActivity.class);
            }
        }
        startActivity(intent);
        finish();
    }

    @Override // com.huami.account.ui.common.BaseTitleOauthActivity, com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HMLog.i("StartUpActivity", "onCreate", new Object[0]);
        StartupAgreementChecker.checkAgreement(this, new StartupAgreementChecker.OnAgreementAllPassed() { // from class: gf7
            @Override // com.xiaomi.hm.health.activity.StartupAgreementChecker.OnAgreementAllPassed
            public final void onPassed() {
                this.a.H();
            }
        });
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMAccountKeeper.INSTANCE.saveAppRestart(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            t();
            AntiDebug.INSTANCE.method01();
            AntiRepack.INSTANCE.method01();
        }
    }
}
