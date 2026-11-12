package com.huawei.health.interactor;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.common.C;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.huawei.common.util.AccountHelper;
import com.huawei.common.util.AccountInteractors;
import com.huawei.common.util.VersionIsCloud;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.BuildConfig;
import com.huawei.health.R;
import com.huawei.health.ServiceAreaAlertActivity;
import com.huawei.health.developerkit.TrackDeveloperKitProxy;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.utils.MainInteractorsUtils;
import com.huawei.health.utils.SyncCloudUtils;
import com.huawei.health.versionmgr.api.VersionMgrApi;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwadpaterhealthmgr.PluginAchieveAdapterImpl;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwauthutil.utils.PackageManagerHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataReq;
import com.huawei.hwcloudmodel.model.userprofile.MergeUserAllDataRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.security.SecurityChecker;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.HuaweiLoginManager;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.login.ui.login.util.SharedPreferenceUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.h5pro.jsmodules.EcgJsModule;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.operation.utils.SampleConfigUtils;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.interactors.GolfUpdateMapInteractor;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.ui.main.stories.health.sleep.SleepBaseBarLineChartProvider;
import com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController;
import com.huawei.up.callback.CommonCallback;
import com.huawei.up.request.HttpRequestBase;
import defpackage.ccy;
import defpackage.dmd;
import defpackage.ecu;
import defpackage.eif;
import defpackage.fdy;
import defpackage.ffv;
import defpackage.fga;
import defpackage.fno;
import defpackage.fnq;
import defpackage.fns;
import defpackage.foa;
import defpackage.fwy;
import defpackage.gyt;
import defpackage.ioi;
import defpackage.ioj;
import defpackage.iov;
import defpackage.ipf;
import defpackage.iqb;
import defpackage.iqu;
import defpackage.iyg;
import defpackage.iyn;
import defpackage.jaa;
import defpackage.jxb;
import defpackage.lqo;
import defpackage.lsg;
import defpackage.ltr;
import defpackage.ltz;
import defpackage.lub;
import defpackage.mal;
import defpackage.mbx;
import defpackage.nkb;
import defpackage.npr;
import defpackage.nsr;
import defpackage.nvd;
import defpackage.oru;
import defpackage.otx;
import defpackage.pal;
import defpackage.qji;
import defpackage.qpx;
import defpackage.qso;
import defpackage.tee;
import defpackage.tfk;
import defpackage.ubu;
import defpackage.unl;
import defpackage.uub;
import defpackage.wvi;
import defpackage.xka;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CloudImpl;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.HwEncryptUtil;
import health.compact.a.KeyManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.StorageResult;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes7.dex */
public class MainInteractors {
    private static boolean d = false;
    private Activity aa;
    private VersionMgrApi ab;
    private MergeUserAllDataReq ac;
    private Handler ad;
    private String ae;
    private String ag;
    private CustomTextAlertDialog e;
    private i g;
    private a h;
    private BroadcastReceiver i;
    private fno k;
    private ExecutorService l;
    private Context m;
    private BroadcastReceiver p;
    private UserProfileMgrApi u;
    private final UserLabelServiceApi v;
    private GolfUpdateMapInteractor w;
    private k x;
    private BroadcastReceiver y;
    private MainInteractorsUtils z;
    private AchieveMedalsBehaviorTriggedByUi f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7165a = "";
    private boolean j = false;
    private int af = 0;
    private boolean n = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7167c = false;
    private int ai = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ExecutorService f7166b = null;
    private boolean s = false;
    private boolean q = false;
    private String[] t = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.ACTIVITY_RECOGNITION"};
    private String[] r = {"android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACTIVITY_RECOGNITION"};
    private c o = new c(this);
    private int ah = -1;

    /* JADX INFO: loaded from: classes29.dex */
    interface UpdateType {
        public static final int GOOGLE_PLAY = 1;
        public static final int GOOGLE_PLAY_WAP = 2;
    }

    static class f extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MainInteractors> f7188c;

        public f(MainInteractors mainInteractors) {
            this.f7188c = new WeakReference<>(mainInteractors);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainInteractors mainInteractors = this.f7188c.get();
            if (mainInteractors != null) {
                LogUtil.a("Login_MainInteractors", "mLoginSuccessReceiver intent = ", intent.getAction());
                if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                    mainInteractors.ai();
                    MainInteractorsUtils.e(context);
                    foa.d().e();
                    if (CommonUtil.ap()) {
                        mainInteractors.f();
                    }
                    fdy.c(0L, "com.huawei.health_common_config_coldStart");
                }
            }
        }
    }

    public void f() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.5
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.e("Login_MainInteractors", "initCrowdSdk mContext == null?", Boolean.valueOf(MainInteractors.this.m == null));
                if (MainInteractors.this.m == null) {
                    LogUtil.e("Login_MainInteractors", "initCrowdSdk final mContext == null");
                    MainInteractors.this.m = BaseApplication.getContext();
                }
                ltr.b().init(MainInteractors.this.m);
                if (Utils.o()) {
                    ltr.b().setProductType(20);
                } else {
                    ltr.b().setProductType(1);
                }
            }
        });
    }

    public boolean n() {
        return this.s;
    }

    public static boolean e() {
        return d;
    }

    public void c(Handler handler) {
        this.ad = handler;
        GolfUpdateMapInteractor golfUpdateMapInteractor = this.w;
        if (golfUpdateMapInteractor != null) {
            golfUpdateMapInteractor.e(handler);
        }
        LogUtil.a("Login_MainInteractors", "setMainHandler() mainHandler = ", handler);
    }

    public void c(ExecutorService executorService) {
        this.l = executorService;
    }

    public MainInteractors(Context context) {
        this.m = context;
        MainInteractorsUtils mainInteractorsUtils = new MainInteractorsUtils();
        this.z = mainInteractorsUtils;
        mainInteractorsUtils.j(context);
        this.aa = (Activity) context;
        this.u = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        this.v = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        this.k = fno.c(context);
        this.h = new a(this);
        AccountHelper.setIsNoCloudTermsUpdate(fns.d(context));
        af();
        ap();
        ao();
        this.w = new GolfUpdateMapInteractor();
    }

    private void ap() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("sync_cloud_data_again_action");
            i iVar = new i(this);
            this.g = iVar;
            BroadcastManagerUtil.e(this.m, iVar, intentFilter);
        } catch (Exception unused) {
            LogUtil.e("Login_MainInteractors", "registerSyncCloudDataReceiver Exception");
        }
    }

    private void af() {
        iyn.b(new TrackDeveloperKitProxy(), new n());
        ffv.x();
    }

    static class n implements IBaseResponseCallback {
        private n() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (i == 0) {
                iyn.b(new TrackDeveloperKitProxy());
            }
        }
    }

    public void e(boolean z) {
        this.q = z;
    }

    public void c(boolean z) {
        if ("health_app_first_start".equals(SharedPreferenceManager.e(this.m, Integer.toString(10005), "health_guide_page"))) {
            if (z) {
                i();
                return;
            } else {
                LogUtil.a("Login_MainInteractors", "checkFirstStart isNeedJump = false");
                return;
            }
        }
        this.z.e();
        if (z) {
            this.ad.sendEmptyMessage(7);
        }
    }

    public static void b() {
        MainInteractorsUtils.b();
    }

    public void i() {
        ExecutorService executorService = this.l;
        if (executorService != null) {
            if (executorService.isShutdown()) {
                this.l = Executors.newSingleThreadExecutor();
            }
            this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.15
                @Override // java.lang.Runnable
                public void run() {
                    fga.d(MainInteractors.this.m).d();
                    MainInteractors.this.ab = (VersionMgrApi) Services.b("HWVersionMgr", VersionMgrApi.class);
                    MainInteractors.this.ag();
                    MainInteractors.this.z.ac();
                }
            });
        }
        this.z.y();
    }

    static class e implements HiCommonListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MainInteractors> f7186b;

        e(MainInteractors mainInteractors) {
            this.f7186b = new WeakReference<>(mainInteractors);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) throws Throwable {
            MainInteractors mainInteractors = this.f7186b.get();
            if (mainInteractors != null) {
                if (!mainInteractors.e(0, true)) {
                    return;
                }
                mainInteractors.ae();
                if (!mainInteractors.s) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: checkAccountSync isSameAccount = false");
                    HiHealthManager.d(mainInteractors.m).checkDataStatus(HiSyncType.d(), new b(mainInteractors));
                }
                UserProfileMgrApi userProfileMgrApi = mainInteractors.u;
                LoginInit.getInstance(BaseApplication.getContext());
                userProfileMgrApi.init(new ioj(LoginInit.shouldLogin()));
                mainInteractors.at();
                if (Utils.h()) {
                    LogUtil.a("Login_MainInteractors", "goto downloadUserPrivacy.");
                    ioi.d().a(new j(this.f7186b.get()));
                    fwy.e(mainInteractors.m).b();
                }
                LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit onSuccess");
                mainInteractors.k.a(mainInteractors.m);
                if (LoginInit.getInstance(mainInteractors.m).isLoginedByWear()) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit isLoginedByWear");
                    if (AccountHelper.getAccountAidlInfoWear() != null && !mainInteractors.l.isShutdown()) {
                        mainInteractors.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.e.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MainInteractors mainInteractors2 = (MainInteractors) e.this.f7186b.get();
                                if (mainInteractors2 != null) {
                                    mainInteractors2.av();
                                }
                            }
                        });
                    } else {
                        LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit null == accountAidlInfoWear ", "mExecutorService.isShutdown() = ", Boolean.valueOf(mainInteractors.l.isShutdown()));
                        return;
                    }
                }
            }
            jaa.c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
            if (CommonUtil.z(BaseApplication.getContext())) {
                ThirdPartyLoginManager.getInstance().saveUserInfo();
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit onFailure");
            MainInteractors mainInteractors = this.f7186b.get();
            if (mainInteractors != null) {
                UserProfileMgrApi userProfileMgrApi = mainInteractors.u;
                LoginInit.getInstance(BaseApplication.getContext());
                userProfileMgrApi.init(new ioj(LoginInit.shouldLogin()));
            }
        }
    }

    public void j() {
        this.z.r();
        this.ai = 0;
        this.f7167c = false;
        AccountHelper.setIsNoCloudNeedLogin(false);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            LogUtil.a("Login_MainInteractors", "doInitPluginLoginHiHealth mainThread");
            ExecutorService executorService = this.l;
            if (executorService == null || executorService.isShutdown()) {
                LogUtil.a("Login_MainInteractors", "mExecutorService is null or shutdown");
                this.l = Executors.newSingleThreadExecutor();
            }
            this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.14
                @Override // java.lang.Runnable
                public void run() {
                    MainInteractors.this.j();
                }
            });
            return;
        }
        if (fns.e()) {
            ReleaseLogUtil.d("Login_MainInteractors", "doInitPluginLoginHiHealth isNeedShowAfterLogin = true");
            this.ad.sendEmptyMessage(Constants.FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5);
            return;
        }
        ak();
        HttpRequestBase.resetBaseUrl(GRSManager.c(this.m), "domainSettingHicloud");
        this.v.subscribeTrackDataChanged(this.m);
        iqb.b().c(-1);
        al();
        if (!iov.d(this.aa)) {
            LogUtil.a("Login_MainInteractors", "activity.isDestroyed() || activity.isFinishing()");
            return;
        }
        ah();
        if (Utils.d(this.m)) {
            mbx.a(BaseApplication.getContext()).a();
        }
        HandlerCenter.a().d(new Runnable() { // from class: fnl
            @Override // java.lang.Runnable
            public final void run() {
                MainInteractors.c();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public static /* synthetic */ void c() {
        if (SecurityChecker.e()) {
            ReleaseLogUtil.a("Login_MainInteractors", "App is error");
            System.exit(0);
        }
    }

    private void am() {
        this.v.registerCallback(3);
    }

    public void h() {
        iqb.b().c(this.m, this.ad);
    }

    public void k() {
        ExecutorService executorService = this.l;
        if (executorService == null || executorService.isShutdown()) {
            LogUtil.a("Login_MainInteractors", "initMigrateData mExecutorService is null or shutdown");
        } else {
            this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.11
                @Override // java.lang.Runnable
                public void run() {
                    MainInteractors.this.aa();
                    MainInteractors.this.z.b(3, MainInteractors.this.ae, MainInteractors.this.ad);
                    MainInteractors.this.z.e(MainInteractors.this.l, MainInteractors.this.ad);
                    String accountInfo = LoginInit.getInstance(MainInteractors.this.m).getAccountInfo(1011);
                    String oldHid = AccountHelper.getOldHid();
                    ReleaseLogUtil.d("Login_MainInteractors", "initMigrateData oldValue is:", SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(oldHid), " currentValue:", SharedPreferenceUtil.getInstance(BaseApplication.getContext()).maskValue(accountInfo));
                    if ((("0".equals(oldHid) || "com.huawei.health".equals(oldHid)) && !oldHid.equals(accountInfo)) || AccountHelper.isNeedShowMigrateDataDig(accountInfo)) {
                        ccy.a(true);
                        MainInteractors.this.ad.sendEmptyMessage(SleepBaseBarLineChartProvider.MESSAGE_JUMP_TO_DAY_TAB);
                    }
                }
            });
        }
    }

    private static void h(boolean z) {
        d = z;
    }

    public void y() {
        this.z.a(this.ad);
        if (this.ad != null) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit MSG_UPDATE_VIEW");
            this.ad.sendMessage(this.ad.obtainMessage(1));
            return;
        }
        LogUtil.a("Login_MainInteractors", "sendMsgShowView() mainHandler = null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        Bitmap bitmapDecodeByteArray;
        LoginInit.getInstance(this.m).setAccountInfo(1002, AccountHelper.getAccountAidlInfoWear().getUserName(), new StorageDataCallback() { // from class: com.huawei.health.interactor.MainInteractors.13
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit UserName result = ", storageResult);
            }
        });
        byte[] headPicByts = AccountHelper.getAccountAidlInfoWear().getHeadPicByts();
        if (headPicByts != null) {
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(headPicByts, 0, headPicByts.length);
            LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit = 3 headpicbytes != not null");
        } else {
            bitmapDecodeByteArray = null;
        }
        if (bitmapDecodeByteArray != null) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit = 3 headImage != null");
            Context context = this.m;
            this.f7165a = AccountInteractors.saveImage(context, LoginInit.getInstance(context).getAccountInfo(1011), bitmapDecodeByteArray);
            LogUtil.d("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit = 3 headImage != null newPath = " + this.f7165a);
        } else {
            LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit = 3 headImage = null");
        }
        if (!"".equals(this.f7165a)) {
            LoginInit.getInstance(this.m).setAccountInfo(1003, this.f7165a, new StorageDataCallback() { // from class: com.huawei.health.interactor.MainInteractors.12
                @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
                public void onProcessed(StorageResult storageResult) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit headPicPath result = ", storageResult);
                }
            });
        }
        Intent intent = new Intent();
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setAction("com.huawei.plugin.account.login");
        if (LocalBroadcastManager.getInstance() != null) {
            LocalBroadcastManager.getInstance().sendBroadcast(intent);
        }
        if (this.m != null) {
            LogUtil.a("Login_MainInteractors", "----send broadcast to social----");
            this.m.sendBroadcast(intent, LocalBroadcast.f36595c);
        } else {
            LogUtil.a("Login_MainInteractors", "----mContext is null----");
        }
    }

    public void b(String str, String str2, String str3, int i2) {
        this.z.a(str, str2, str3, i2);
    }

    public void b(final boolean z, String str) {
        if (this.n) {
            return;
        }
        this.n = true;
        LogUtil.a("Login_MainInteractors", "showNoTitleSingleButtonDialog goto downloadUserPrivacy");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.m).a(str).a(this.m.getString(R.string.IDS_user_permission_know), new View.OnClickListener() { // from class: com.huawei.health.interactor.MainInteractors.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractors", "showNoTitleSingleButtonDialog click known button");
                if (!Utils.k()) {
                    if (z) {
                        MainInteractors.this.z.a();
                    } else {
                        MainInteractors.this.ac();
                    }
                }
                KeyManager.a();
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void s() {
        CustomTextAlertDialog customTextAlertDialog = this.e;
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            this.e = null;
        }
    }

    public void b(final int i2) {
        LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateDialogHaveDownHMS enter type = ", Integer.valueOf(i2));
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.m);
        builder.e(this.m.getString(R.string.IDS_hw_wechat_rank_show_common_title)).a(this.m.getString(R.string.IDS_hwh_home_other_login_cancel_down_tips)).b(this.m.getString(R.string.IDS_hwh_home_other_login_keep_down_load), new View.OnClickListener() { // from class: com.huawei.health.interactor.MainInteractors.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateDialogHaveDownHMS OK");
                if (MainInteractors.this.l != null && !MainInteractors.this.l.isShutdown()) {
                    MainInteractors.this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.16.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (i2 == 1) {
                                MainInteractors.this.ab();
                            } else if (i2 == 2) {
                                MainInteractors.this.i(2);
                            }
                        }
                    });
                } else {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateDialogHaveDownHMS mExecutorService is null or shutdown");
                }
            }
        }).a(this.m.getString(R.string.IDS_ota_update_button_cancel_done), new View.OnClickListener() { // from class: com.huawei.health.interactor.MainInteractors.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateDialogHaveDownHMS cancel");
                MainInteractors.this.u();
                LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "cancel download HMS ...");
                MainInteractors.b();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        this.e = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.e.show();
    }

    public void v() {
        LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateToastCloudTimeout() enter" + this.af);
        if (this.af == 1) {
            this.af = 2;
            MergeUserAllDataReq mergeUserAllDataReq = this.ac;
            if (mergeUserAllDataReq != null) {
                AccountInteractors.saveMigrateInfoToDb(mergeUserAllDataReq.getOriginalHuid(), this.ac.getOriginalServiceToken(), LoginInit.getInstance(this.m).getAccountInfo(1011), false);
            }
            String upperCase = this.m.getString(R.string.IDS_common_notification_know_tips).toUpperCase();
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.m);
            builder.e(this.m.getString(R.string.IDS_hw_wechat_rank_show_common_title)).a(this.m.getString(R.string.IDS_hwh_home_other_login_net_work_error)).b(upperCase, new View.OnClickListener() { // from class: com.huawei.health.interactor.MainInteractors.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("Login_MainActivity", "finish MainAcitivity for cause:", "accountmigrate: showDataMigrateToastCloudTimeout() ok..");
                    MainInteractors.b();
                    SharedPreferenceManager.e(MainInteractors.this.m, Integer.toString(10015), "last_exception_exit", "1", new StorageParams(0));
                }
            });
            CustomTextAlertDialog customTextAlertDialogB = builder.b();
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
        }
    }

    public void d(final int i2) {
        LogUtil.a("Login_MainInteractors", "accountmigrate: doagainToBranchCheckIsLoginForHealth(final int type) type = ", Integer.valueOf(i2));
        ExecutorService executorService = this.l;
        if (executorService == null || executorService.isShutdown()) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: doagainToBranchCheckIsLoginForHealth mExecutorService is null or shutdown");
        } else {
            this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.1
                @Override // java.lang.Runnable
                public void run() {
                    MainInteractors.this.u();
                    int i3 = i2;
                    if (i3 == 1) {
                        MainInteractors.this.i(1);
                    } else if (i3 == 2) {
                        MainInteractors.this.i(2);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aa() {
        LogUtil.a("Login_MainInteractors", "accountmigrate: checkLastException enter");
        ArrayList<ltz> arrayListA = lub.c().a(LoginInit.getInstance(this.m).getAccountInfo(1011));
        if (arrayListA == null) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: null == migrateTables");
            return;
        }
        int size = arrayListA.size();
        for (int i2 = 0; i2 < size; i2++) {
            LogUtil.d("Login_MainInteractors", "accountmigrate: checkLastException enter migrateTables = ", arrayListA.get(i2).toString());
            if (!arrayListA.get(i2).d()) {
                this.j = true;
                this.ae = arrayListA.get(i2).a();
                this.ag = arrayListA.get(i2).e();
                ExecutorService executorService = this.l;
                if (executorService == null || executorService.isShutdown()) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: checkLastException mExecutorService is null or shutdown! ");
                    return;
                } else {
                    this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.4
                        @Override // java.lang.Runnable
                        public void run() {
                            LogUtil.a("Login_MainInteractors", "accountmigrate: checkLastException sendMigrageDataToCloud");
                            MainInteractors.this.aw();
                        }
                    });
                    return;
                }
            }
            final ltz ltzVar = arrayListA.get(i2);
            if (!ltzVar.j() && ltzVar.b().equals(LoginInit.getInstance(this.m).getAccountInfo(1011))) {
                ExecutorService executorService2 = this.l;
                if (executorService2 == null || executorService2.isShutdown()) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: checkLastException mExecutorService is null or shutdown.. ");
                    return;
                }
                this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.2
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a("Login_MainInteractors", "accountmigrate: checkLastException copyByHuid");
                        MainInteractors.this.z.c(ltzVar.a(), MainInteractors.this.ad);
                    }
                });
            }
        }
    }

    static class b implements HiCommonListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MainInteractors> f7183a;

        b(MainInteractors mainInteractors) {
            this.f7183a = new WeakReference<>(mainInteractors);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            MainInteractors mainInteractors = this.f7183a.get();
            if (mainInteractors == null || obj == null) {
                return;
            }
            LogUtil.a("Login_MainInteractors", "accountmigrate: checkAccountSync and onsuccess");
            if (((Boolean) obj).booleanValue()) {
                LogUtil.a("Login_MainInteractors", "accountmigrate: checkAccountSync and onsuccess show dialog");
                mainInteractors.ad.sendMessage(mainInteractors.ad.obtainMessage(2));
                LogUtil.a("Login_MainInteractors", "checkDataStatus_data_false2 ", mainInteractors.ad);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: checkAccountSync onFailure errMsg = " + obj + ",errCode = " + i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String ae() {
        String strC;
        String strE = SharedPreferenceManager.e(this.m, "main_id", "main_key");
        String accountInfo = LoginInit.getInstance(this.m).getAccountInfo(1011);
        StorageParams storageParams = new StorageParams();
        this.s = false;
        try {
            try {
                String strE2 = HwEncryptUtil.b(this.m).e(1, accountInfo);
                if (strE2 != null) {
                    try {
                        strC = HwEncryptUtil.b(this.m).c(1, strE);
                    } catch (Exception unused) {
                        SharedPreferenceManager.e(this.m, "main_id", "main_key", strE2, storageParams);
                        strC = "";
                    }
                    if (strC.equals(HwEncryptUtil.b(this.m).c(1, strE2))) {
                        this.s = true;
                    } else {
                        SharedPreferenceManager.e(this.m, "main_id", "main_key", strE2, storageParams);
                    }
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } catch (Exception unused2) {
            LogUtil.e("Login_MainInteractors", "getUserId Exception");
        }
        return accountInfo;
    }

    static class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MainInteractors> f7184a;

        c(MainInteractors mainInteractors) {
            this.f7184a = new WeakReference<>(mainInteractors);
        }

        @Override // java.lang.Runnable
        public void run() {
            MainInteractors mainInteractors = this.f7184a.get();
            if (mainInteractors != null) {
                mainInteractors.ag();
            }
        }
    }

    public void z() {
        ExecutorService executorService = this.l;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.l.execute(this.o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        AccountHelper.checkLogin(this.m, new a(this));
    }

    static class a implements MainLoginCallBack {
        private WeakReference<MainInteractors> e;

        a(MainInteractors mainInteractors) {
            this.e = new WeakReference<>(mainInteractors);
        }

        @Override // com.huawei.login.ui.login.MainLoginCallBack
        public boolean isNoAgreePrivacy(int i) {
            return fns.a(i, true);
        }

        @Override // com.huawei.login.ui.login.MainLoginCallBack
        public boolean isHmsUsableVersion(Context context) {
            return Utils.d(context);
        }

        @Override // com.huawei.login.ui.login.MainLoginCallBack
        public void browseCallback(boolean z) {
            qji.e(z);
        }

        @Override // com.huawei.login.ui.login.MainLoginCallBack
        public void handlerMessage(int i) {
            MainInteractors mainInteractors = this.e.get();
            if (mainInteractors == null) {
                return;
            }
            mainInteractors.c(i);
        }

        @Override // com.huawei.login.ui.login.MainLoginCallBack
        public void handlerPhase(int i) {
            MainInteractors mainInteractors = this.e.get();
            if (mainInteractors == null) {
                LogUtil.a("Login_MainInteractors", "CheckLoginCallBack handlerPhase mainInteractors == null");
            } else {
                mainInteractors.e(i);
            }
        }
    }

    public void c(int i2) {
        int i3;
        switch (i2) {
            case 8000:
                i3 = 4010;
                break;
            case 8001:
                i3 = 4007;
                break;
            case 8002:
                i3 = WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED;
                break;
            case MainLoginCallBack.MSG_HMS_VERSION_ERROR /* 8003 */:
                i3 = 4019;
                break;
            case MainLoginCallBack.MSG_HWID_ACCOUNT_NOT_LOGIN /* 8004 */:
                i3 = 6006;
                break;
            case MainLoginCallBack.MSG_NO_NETWORK /* 8005 */:
                i3 = 4;
                break;
            case MainLoginCallBack.MSG_HWID_STOPED /* 8006 */:
                i3 = FitnessStatusCodes.DATASET_TIMESTAMP_INCONSISTENT_WITH_UPDATE_TIME_RANGE;
                break;
            case MainLoginCallBack.MSG_START_APK_SERVICE_ERROR /* 8007 */:
                i3 = FitnessStatusCodes.INVALID_DATA_POINT;
                break;
            case MainLoginCallBack.MSG_SHOW_HMS_DIALOG /* 8008 */:
                i3 = FitnessStatusCodes.INVALID_SESSION_TIMESTAMPS;
                break;
            case MainLoginCallBack.MSG_HWID_IS_LOW_VERSION /* 8009 */:
                this.f7167c = true;
                this.ai++;
                return;
            default:
                return;
        }
        this.ad.sendEmptyMessage(i3);
    }

    public void e(int i2) {
        switch (i2) {
            case 9000:
                bd();
                break;
            case 9001:
                Intent intent = new Intent(this.aa, (Class<?>) ServiceAreaAlertActivity.class);
                intent.setFlags(65536);
                this.aa.startActivityForResult(intent, 6004);
                break;
            case 9002:
                j();
                break;
            case 9003:
                this.z.j();
                break;
            case 9004:
                aw();
                break;
            case 9006:
                this.u.getUserInfo();
                break;
            case MainLoginCallBack.PHASE_NOCLOUD_NOLOGIN /* 9007 */:
                UserProfileMgrApi userProfileMgrApi = this.u;
                LoginInit.getInstance(BaseApplication.getContext());
                userProfileMgrApi.init(new ioj(LoginInit.shouldLogin()));
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i2, boolean z) {
        return AccountHelper.isNeedDoCallBack(i2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bd() {
        d(false);
    }

    public void d(boolean z) {
        LogUtil.a("Login_MainInteractors", "todoCheckLogin():ifHeadImageTrigger = ", Boolean.valueOf(z));
        String ifNeedShowAreaAlert = VersionIsCloud.getIfNeedShowAreaAlert(this.m);
        ReleaseLogUtil.d("Login_MainInteractors", "todoCheckLogin():ifNeedShowAreaAlert = ", ifNeedShowAreaAlert);
        if ("1".equals(ifNeedShowAreaAlert)) {
            a(false);
            return;
        }
        if (!fns.b()) {
            ReleaseLogUtil.d("Login_MainInteractors", "todoCheckLogin:isNeedShowBeforeLogin = true");
            ay();
            this.ad.sendEmptyMessage(Constants.FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5);
        } else {
            KeyValDbManager.d(this.m).b("key_wether_to_auth", String.valueOf(true));
            SharedPreferenceManager.a(this.m, true);
            iqb.b().b(this.m, true);
            this.f7165a = "";
            AccountHelper.todoCheckLogin(this.m, z);
            uub.d(com.huawei.health.messagecenter.model.CommonUtil.isSystemBarNoticeSwitchOnOrDefault(this.m));
        }
    }

    private void ay() {
        KeyValDbManager.d(this.m).b("key_wether_to_auth", String.valueOf(false));
        SharedPreferenceManager.a(this.m, false);
        SharedPreferenceManager.e(this.m, Integer.toString(10000), "key_wether_to_auth", String.valueOf(false), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bb() {
        if (!LoginInit.getInstance(this.m).getIsLogined() || LoginInit.getInstance(this.m).getHealthLoginChannel() == -1) {
            return;
        }
        LogUtil.a("Login_MainInteractors", "accountmigrate: loginByAccountType backgroundAutoSync ", Boolean.valueOf(LoginInit.getInstance(this.m).getIsLogined()));
        if (KeyManager.g()) {
            String strD = KeyManager.d();
            String accountInfo = LoginInit.getInstance(this.m).getAccountInfo(1011);
            if (TextUtils.isEmpty(strD) || !strD.equals(accountInfo) || this.z.t()) {
                KeyManager.a();
                this.z.a();
                return;
            } else {
                this.ad.sendEmptyMessage(10088);
                return;
            }
        }
        this.z.a();
    }

    static class j implements CommonCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MainInteractors> f7191b;

        j(MainInteractors mainInteractors) {
            this.f7191b = new WeakReference<>(mainInteractors);
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onSuccess(Bundle bundle) {
            LogUtil.a("Login_MainInteractors", "toGetPrivacySportData from cloud success.");
            MainInteractors mainInteractors = this.f7191b.get();
            if (mainInteractors != null) {
                mainInteractors.az();
                mainInteractors.aj();
                mainInteractors.bb();
            }
            wvi.d();
            fns.f();
            MainInteractorsUtils.d(BaseApplication.getContext());
            if (mainInteractors != null) {
                mainInteractors.au();
            }
        }

        @Override // com.huawei.up.callback.CommonCallback
        public void onFail(int i) {
            LogUtil.a("Login_MainInteractors", "toGetPrivacySportData from cloud failure.");
            MainInteractors mainInteractors = this.f7191b.get();
            if (mainInteractors != null) {
                mainInteractors.bb();
            }
            wvi.d();
            MainInteractorsUtils.d(BaseApplication.getContext());
            if (mainInteractors != null) {
                mainInteractors.au();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        this.ad.sendEmptyMessage(10092);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az() {
        this.z.j(this.ad);
    }

    public void g() {
        this.z.b(this.l, this.ad);
    }

    public void j(final int i2) {
        LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateTipsDialog(final int type) type = ", Integer.valueOf(i2));
        LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateTipsDialog isPackgeNameHuid = ", Boolean.valueOf(AccountHelper.getIsPackgeNameHuid()));
        if (AccountHelper.getIsPackgeNameHuid()) {
            ExecutorService executorService = this.l;
            if (executorService == null || executorService.isShutdown()) {
                LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateTipsDialog mExecutorService is null or shutdown");
            } else {
                this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (i2 == 0) {
                            LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateTipsDialog(final int type) type = 0");
                            MainInteractors mainInteractors = MainInteractors.this;
                            mainInteractors.f(LoginInit.getInstance(mainInteractors.m).getLoginByWear());
                            MainInteractors.this.aw();
                            return;
                        }
                        LogUtil.a("Login_MainInteractors", "accountmigrate: showDataMigrateTipsDialog(final int type) type = else");
                        MainInteractors.this.g(0);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud enter");
        this.ac = new MergeUserAllDataReq();
        an();
        this.af = 1;
        if (!Utils.m() && !"com.huawei.health".equals(this.ac.getOriginalHuid())) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud mergeUserAllData enter mergeUserAllDataReq origalHuid is ", this.ac.getOriginalHuid());
            lqo.b(this.m).e(this.ac, new ICloudOperationResult<MergeUserAllDataRsp>() { // from class: com.huawei.health.interactor.MainInteractors.7
                @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void operationResult(MergeUserAllDataRsp mergeUserAllDataRsp, String str, boolean z) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud mergeUserAllData back");
                    if (MainInteractors.this.af != 2) {
                        MainInteractors.this.af = 0;
                        MainInteractors.this.b(mergeUserAllDataRsp, str);
                    } else {
                        LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloudmergeUserAllDataback but already timeout,exit app");
                    }
                }
            });
        } else {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but is no cloud or default packgehuid");
            lub.c().c(this.ac.getOriginalHuid(), LoginInit.getInstance(this.m).getAccountInfo(1011));
            this.af = 0;
            this.z.a(this.ac, Boolean.valueOf(this.j), this.ae, this.ad);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i2) {
        AccountHelper.loginByAccountType(this.m, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        AccountHelper.branchCheckIsLoginForHealth(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        AccountHelper.branchMobileHwid(this.m, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i2) {
        AccountHelper.branchGuidUserDownLoadHms(this.m, i2);
    }

    public void o() {
        nsr.b(this.m).b();
    }

    public void l() {
        dmd.b().setAdapter(eif.a());
        dmd.b().init(this.m);
    }

    public void d() {
        ar();
        aq();
        Context context = this.m;
        if (fnq.c(context, context.getPackageName())) {
            LogUtil.a("Login_MainInteractors", "addPermissions() is SystemApp");
            if (fnq.c()) {
                LogUtil.a("Login_MainInteractors", "addPermissions() supportNewPermissionCheck");
                boolean zE = fnq.e();
                if (fnq.a()) {
                    LogUtil.a("Login_MainInteractors", "addPermissions() is ChinaRom, has wear device");
                    d(this.m, fnq.c(zE));
                    return;
                }
                d(this.m, b(this.t));
                return;
            }
            d(this.m, b(this.r));
            return;
        }
        LogUtil.a("Login_MainInteractors", "addPermissions() is not SystemApp");
        if (CommonUtil.af(this.m)) {
            d(this.m, b(this.t));
        } else {
            d(this.m, b(this.r));
        }
    }

    private String[] b(String[] strArr) {
        long jD = SharedPreferenceManager.d(Integer.toString(10000), "HAS_APPLY_ACTIVITY_RECOGNITION", 0L);
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (System.currentTimeMillis() - jD <= com.huawei.openalliance.ad.constant.Constants.ANALYSIS_EVENT_KEEP_TIME) {
            LogUtil.a("Login_MainInteractors", "checkHavePermission getApplyPermissionsLists index  size ", Integer.valueOf(arrayList.size()));
            arrayList.remove("android.permission.ACTIVITY_RECOGNITION");
        }
        if (PermissionUtil.f()) {
            arrayList.add(com.huawei.openalliance.ad.constant.Constants.POST_NOTIFICATIONS);
            arrayList.remove("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
        LogUtil.a("Login_MainInteractors", "checkHavePermission getApplyPermissionsLists permissions size ", Integer.valueOf(strArr2.length));
        return strArr2;
    }

    private void d(Context context, String[] strArr) {
        if (!lsg.d(context, strArr)) {
            String[] strArrA = ipf.a(strArr, this.aa);
            lsg.d(this.aa, strArrA, new h(strArrA), 1);
            for (String str : strArrA) {
                if ("android.permission.WRITE_EXTERNAL_STORAGE".equals(str)) {
                    CommonUtil.k(context, "android.permission.WRITE_EXTERNAL_STORAGE");
                } else if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                    CommonUtil.k(context, "android.permission.ACCESS_COARSE_LOCATION");
                }
            }
            return;
        }
        this.z.f();
        LogUtil.a("Login_MainInteractors", "checkHavePermission isHasPermissions");
    }

    public void b(boolean z) {
        if (!z) {
            this.ad.sendEmptyMessageDelayed(14, 5000L);
        } else {
            this.z.c(this.ad, this.l, this.ab);
        }
    }

    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<MainInteractors> f7185c;

        public d(MainInteractors mainInteractors) {
            this.f7185c = new WeakReference<>(mainInteractors);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainInteractors mainInteractors = this.f7185c.get();
            if (mainInteractors == null || intent == null) {
                LogUtil.j("Login_MainInteractors", "AppAutoCheckNewVersionReceiver onReceive mainInteractors or intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("Login_MainInteractors", "mAppAutoCheckNewVersionReceiver onReceive: action = " + action);
            if (!"action_band_auto_check_new_version_result".equals(action)) {
                LogUtil.j("Login_MainInteractors", "mAppAutoCheckNewVersionReceiver onReceive: action nonconformity");
                return;
            }
            int intExtra = intent.getIntExtra("result", 6);
            LogUtil.a("Login_MainInteractors", "result = " + intExtra);
            if (intExtra == 5) {
                LogUtil.a("Login_MainInteractors", "ACTION_APP_AUTO_CHECK_NEW_VERSION_RESULT:AUTO_CHECK_SUCCESS ");
                Intent intent2 = new Intent();
                if (CommonUtil.ap()) {
                    intent2.putExtra("hasNewBetaVersion", intent.getBooleanExtra("hasNewBetaVersion", false));
                    intent2.putExtra("isManual", intent.getBooleanExtra("isManual", false));
                    mainInteractors.ab.showNewVersionDialog(mainInteractors.m, intent2);
                    return;
                }
                if (!CommonUtil.bg() || nvd.j()) {
                    String stringExtra = intent.getStringExtra("name");
                    if (stringExtra != null) {
                        if (CommonUtil.af(mainInteractors.m) && stringExtra.contains("Beta")) {
                            LogUtil.a("Login_MainInteractors", "mAppNewVersion is " + stringExtra);
                            return;
                        } else {
                            if (CommonUtil.ap() && !stringExtra.contains("Beta")) {
                                LogUtil.a("Login_MainInteractors", "version is " + stringExtra);
                                return;
                            }
                            int intExtra2 = intent.getIntExtra("size", -1);
                            String stringExtra2 = intent.getStringExtra("changelog");
                            boolean booleanExtra = intent.getBooleanExtra("isForced", false);
                            intent2.putExtra("name", stringExtra);
                            intent2.putExtra("size", intExtra2);
                            intent2.putExtra("message", stringExtra2);
                            intent2.putExtra("isForced", Boolean.valueOf(booleanExtra));
                            mainInteractors.ab.showNewVersionDialog(mainInteractors.m, intent2);
                        }
                    } else {
                        LogUtil.e("Login_MainInteractors", "mCheckNewVersionName is null");
                        return;
                    }
                }
                mainInteractors.ab.makeMessage(context);
            }
        }
    }

    private void ar() {
        LogUtil.a("Login_MainInteractors", "registerAutoCheckBroadcast()");
        if (this.i == null) {
            this.i = new d(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_band_auto_check_new_version_result");
        BroadcastManagerUtil.d(this.aa.getApplicationContext(), this.i, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void bf() {
        if (this.i != null) {
            try {
                this.aa.getApplicationContext().unregisterReceiver(this.i);
            } catch (Exception unused) {
                LogUtil.d("Login_MainInteractors", "unRegisterAppCheckBroadcast exception");
            }
            this.i = null;
        }
    }

    static class o extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<MainInteractors> f7193c;

        public o(MainInteractors mainInteractors) {
            this.f7193c = new WeakReference<>(mainInteractors);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainInteractors mainInteractors = this.f7193c.get();
            if (mainInteractors == null || intent == null) {
                return;
            }
            String action = intent.getAction();
            LogUtil.a("Login_MainInteractors", "mScaleAutoCheckNewVersionReceiver onReceive: action = " + action);
            if (!"action_start_check_scale".equals(action)) {
                LogUtil.j("Login_MainInteractors", "mScaleAutoCheckNewVersionReceiver onReceive: action nonconformity");
                return;
            }
            ContentValues contentValues = (ContentValues) intent.getParcelableExtra("commonDeviceInfo");
            if (contentValues == null) {
                LogUtil.j("Login_MainInteractors", "mScaleAutoCheckNewVersionReceiver onReceive: deviceInfo == null");
            } else {
                LogUtil.a("Login_MainInteractors", "mScaleAutoCheckNewVersionReceiver onReceive deviceName:", contentValues.getAsString("name"), "  code:", CommonUtil.n(contentValues.getAsString("uniqueId")));
                mainInteractors.z.e(mainInteractors.l, contentValues);
            }
        }
    }

    private void aq() {
        LogUtil.a("Login_MainInteractors", "registerScaleCheckBroadcast()");
        if (this.y == null) {
            this.y = new o(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("action_start_check_scale");
            BroadcastManagerUtil.c(this.aa.getApplicationContext(), this.y, intentFilter, LocalBroadcast.f36595c, null);
        }
    }

    private void bh() {
        if (this.y != null) {
            try {
                this.aa.getApplicationContext().unregisterReceiver(this.y);
            } catch (Exception unused) {
                LogUtil.j("Login_MainInteractors", "unRegisterScaleCheckBroadcast exception");
            }
            this.y = null;
        }
    }

    public void ac() {
        at();
        SyncCloudUtils.e(0, 20000, 0);
        tfk.c(true);
        SharedPreferenceManager.e(this.m, Integer.toString(10000), "sync_cloud_data_show_process_flag", "true", null);
    }

    public void e(Intent intent) {
        LogUtil.a("Login_MainInteractors", "updateSyncCloudDataStatus to enter");
        if (intent == null) {
            LogUtil.j("Login_MainInteractors", "updateSyncCloudDataStatus intent null");
        } else if ("true".equals(SharedPreferenceManager.e(this.m, Integer.toString(10000), "sync_cloud_data_show_process_flag"))) {
            d(intent);
        } else {
            a(intent);
        }
    }

    private void as() {
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Login_MainInteractors");
        ThreadPoolManager.c().execute(new Runnable() { // from class: fnm
            @Override // java.lang.Runnable
            public final void run() {
                MainInteractors.a();
            }
        });
        SampleConfigUtils.resendAsyncWhenReconnect(deviceInfo, "Login_MainInteractors");
    }

    public static /* synthetic */ void a() {
        EcgJsModule.setFeatureReminder("com.huawei.health.h5.ecg");
        EcgJsModule.setFeatureReminder("com.huawei.health.h5.ecgce");
        EcgJsModule.setFeatureReminder("com.huawei.health.h5.vascular-health");
    }

    private void d(Intent intent) {
        LogUtil.a("Login_MainInteractors", "updateSyncStatusInView sync cloud data process flag is true");
        int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
        if (2 == intExtra) {
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInView HiBroadcastAction.SyncStatusAction.DONE");
            this.ad.sendEmptyMessage(6400);
            SharedPreferenceManager.e(this.m, Integer.toString(10000), "sync_cloud_data_show_process_flag", "false", null);
            Context context = this.m;
            qpx.e(context, context.getResources().getString(com.huawei.ui.main.R.string.IDS_hw_show_synchronous_success));
            oru.a(this.m).a();
            otx.b(this.m).a(pal.c(-4, System.currentTimeMillis(), 1), System.currentTimeMillis(), 11, null);
            tfk.c(false);
            c("sync_cloud_data_finish", 100.0d);
            npr.d(2);
            as();
            return;
        }
        if (3 == intExtra) {
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInView HiBroadcastAction.SyncStatusAction.FAIL");
            if (CommonUtil.aq()) {
                tfk.c(false);
            } else {
                tfk.c(true);
            }
            SharedPreferenceManager.e(this.m, Integer.toString(10000), "sync_cloud_data_show_process_flag", "false", null);
            c("sync_cloud_data_fail", 0.0d);
            return;
        }
        if (1 == intExtra) {
            double doubleExtra = intent.getDoubleExtra("com.huawei.hihealth.action_sync_process", 0.0d);
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInView HiBroadcastAction.SyncStatusAction.ONGOING process = ", Double.valueOf(doubleExtra));
            tfk.c(true);
            c("ongoing_sync_cloud_data", doubleExtra);
            return;
        }
        if (intExtra == 0) {
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInView HiBroadcastAction.SyncStatusAction.BEGIN");
            tfk.c(true);
            c("start_sync_cloud_data", 0.0d);
        }
    }

    private void a(Intent intent) {
        LogUtil.a("Login_MainInteractors", "updateSyncStatusInBackstage sync cloud data process flag is false");
        int intExtra = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
        if (2 == intExtra) {
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInBackstage HiBroadcastAction.SyncStatusAction.DONE backstage");
            oru.a(this.m).a();
            this.ad.sendEmptyMessage(6400);
            c("sync_cloud_data_backstage", 100.0d);
            npr.d(2);
            as();
            return;
        }
        if (3 == intExtra) {
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInBackstage HiBroadcastAction.SyncStatusAction.FAIL backstage");
        } else if (1 == intExtra) {
            LogUtil.d("Login_MainInteractors", "updateSyncStatusInBackstage HiBroadcastAction.SyncStatusAction.ONGOING backstage process = ", Double.valueOf(intent.getDoubleExtra("com.huawei.hihealth.action_sync_process", 0.0d)));
        } else if (intExtra == 0) {
            LogUtil.a("Login_MainInteractors", "updateSyncStatusInBackstage HiBroadcastAction.SyncStatusAction.BEGIN backstage");
        }
    }

    private void c(String str, double d2) {
        Intent intent = new Intent();
        intent.setAction("sync_cloud_data_action");
        intent.putExtra("sync_cloud_data_status", str);
        intent.putExtra("sync_cloud_data_process", d2);
        BroadcastManagerUtil.a(this.m, intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void at() {
        LogUtil.a("Login_MainInteractors", "registerSyncBroadcastReceiver enter");
        if (this.x == null) {
            this.x = new k(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        intentFilter.addAction("com.huawei.hihealth.action_sqlite_upgrade_done");
        intentFilter.addAction("com.huawei.hihealth.action_sqlite_upgrade_working");
        intentFilter.addAction("com.huawei.hihealth.action_sqlite_upgrade_exception");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.x, intentFilter);
        LogUtil.a("Login_MainInteractors", "registerSyncBroadcastReceiver end");
    }

    private void ao() {
        LogUtil.a("Login_MainInteractors", "registerLoginSuccessReceiver enter");
        if (this.p == null) {
            this.p = new f(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        LocalBroadcastManager.getInstance().registerReceiver(this.p, intentFilter);
        LogUtil.a("Login_MainInteractors", "registerLoginSuccessReceiver end");
    }

    private void bg() {
        if (this.p != null) {
            LogUtil.a("Login_MainInteractors", "unregisterLoginSuccessReceiver mReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.p);
        }
    }

    private void be() {
        if (this.x != null) {
            LogUtil.a("Login_MainInteractors", "unregisterSyncBroadcastReceiver mReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.x);
            this.x = null;
        }
    }

    static class k extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<MainInteractors> f7192a;

        public k(MainInteractors mainInteractors) {
            this.f7192a = new WeakReference<>(mainInteractors);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            LogUtil.d("Login_MainInteractors", "SyncBroadcastReceiver onReceive()");
            MainInteractors mainInteractors = this.f7192a.get();
            if (mainInteractors != null) {
                if (intent == null) {
                    LogUtil.e("Login_MainInteractors", "onReceive mReceiver intent null");
                    return;
                }
                try {
                    action = intent.getAction();
                } catch (Exception unused) {
                    LogUtil.e("Login_MainInteractors", "SyncBroadcastReceiver getAction exception");
                    action = null;
                }
                Handler handler = mainInteractors.ad;
                if (handler == null) {
                    return;
                }
                mainInteractors.c(action, handler, intent);
                if ("com.huawei.plugin.account.logout".equals(action)) {
                    iyg.b();
                    if (!LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                        mainInteractors.ai();
                    } else {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 18;
                        messageObtain.obj = false;
                        mainInteractors.ad.sendMessage(messageObtain);
                    }
                    mainInteractors.z.e(context, intent);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        gyt.d(this.ad);
    }

    public void p() {
        AchieveMedalsBehaviorTriggedByUi achieveMedalsBehaviorTriggedByUi = new AchieveMedalsBehaviorTriggedByUi(this.m);
        this.f = achieveMedalsBehaviorTriggedByUi;
        achieveMedalsBehaviorTriggedByUi.behave();
        oru.a(this.m).setAdapter(new PluginAchieveAdapterImpl());
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.8
            @Override // java.lang.Runnable
            public void run() {
                oru.a(MainInteractors.this.m).r();
                oru.a(MainInteractors.this.m).m();
                if (MainInteractors.this.f.a()) {
                    return;
                }
                LogUtil.a("Login_MainInteractors", "sync again,toReadSingleTrackData");
                MainInteractors.this.f.b();
            }
        });
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    public void r() {
        this.z.b(this.l);
        NpsUserShowController.getInstance(BaseApplication.getContext()).threadExecuteNpsModule();
    }

    public void q() {
        be();
        bf();
        bg();
        GolfUpdateMapInteractor golfUpdateMapInteractor = this.w;
        if (golfUpdateMapInteractor != null) {
            golfUpdateMapInteractor.c();
        }
        bh();
        ba();
        BroadcastManagerUtil.b(this.m, this.g);
        bc();
        nsr.b(this.m).a();
        PluginOperationAdapterImpl.destroy();
        u();
        s();
        this.v.unSubscribeTrackData(this.m);
        this.v.unRegisterCallback(3);
        AccountHelper.setIsHmsVersionOutDate(false);
        if (PluginSuggestion.getInstance() != null) {
            PluginSuggestion.getInstance().finish();
        }
        nkb.d().b();
        ExecutorService executorService = this.l;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.l.shutdown();
    }

    private void bc() {
        LogUtil.a("Login_MainInteractors", "stopService()");
        BroadcastManagerUtil.b(this.aa.getApplicationContext(), new Intent("ACTION_ACTIVITY_PAUSE_CITY_AS"));
    }

    private boolean e(Context context) {
        boolean z = new PackageManagerHelper(context).a(CommonUtil.x()) >= 20501300;
        LogUtil.e("Login_MainInteractors", "isHMSUpdated:" + z);
        return z;
    }

    private void c(Activity activity) {
        LogUtil.a("Login_MainInteractors", "Enter gotoGooglePlayWeb");
        this.ah = 2;
        try {
            String[] stringArray = BaseApplication.getContext().getResources().getStringArray(R.array.google_play_store_apps_url);
            activity.startActivityForResult(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(((stringArray == null || stringArray.length != 1) ? "" : stringArray[0]) + "com.huawei.hwid")), this.z.h());
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Login_MainInteractors", "can not find web to hold update hms apk");
        }
    }

    public void a(int i2) {
        Activity activity = this.aa;
        if (activity == null || activity.isFinishing()) {
            return;
        }
        int i3 = this.ah;
        if (i3 == 1 && i2 == 2002) {
            if (e(activity)) {
                i(AccountHelper.getGuidType());
                return;
            } else {
                c(activity);
                return;
            }
        }
        if (i3 == 2 && i2 == 2003) {
            if (e(activity)) {
                i(AccountHelper.getGuidType());
                return;
            }
            int iG = this.z.g();
            LogUtil.a("Login_MainInteractors", "onActivityResult mTryCount:" + iG);
            if (iG >= 5) {
                a(true);
            } else {
                this.z.u();
            }
        }
    }

    public static void c(String str) {
        LogUtil.a("Login_MainInteractors", "Enter originalProcess");
        new GuideInteractors(BaseApplication.getContext()).a(str);
    }

    public void t() {
        boolean z = this.f7167c;
        if (z) {
            LogUtil.a("Login_MainInteractors", "loginAfterUpdateHMS(),hwid_is_low_version :", Boolean.valueOf(z), ",timeCount = ", Integer.valueOf(this.ai));
            this.f7167c = false;
            if (this.ai >= 2) {
                LogUtil.j("Login_MainInteractors", "cancel update hms...");
                this.ai = 0;
                b();
                return;
            }
            z();
        }
    }

    public void a(boolean z) {
        AccountHelper.startUserSelectForResult(this.m, z, this.h);
    }

    public void x() {
        LogUtil.a("Login_MainInteractors", "showAccountLoginAlertDialog");
        String upperCase = this.m.getString(R.string.IDS_settings_button_cancal).toUpperCase();
        String upperCase2 = this.m.getString(R.string.IDS_hwh_login_account_login_immediately).toUpperCase();
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.m);
        builder.e(this.m.getString(R.string.IDS_hwh_login_account_hwid_not_login)).a(this.m.getString(R.string.IDS_hwh_login_account_alert_dialog_content)).b(upperCase2, new View.OnClickListener() { // from class: com.huawei.health.interactor.MainInteractors.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractors", "onClick(): login immediately.");
                if (MainInteractors.this.l == null || MainInteractors.this.l.isShutdown()) {
                    return;
                }
                MainInteractors.this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.10.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AccountHelper.setIsNoCloudNeedLogin(true);
                        MainInteractors.this.bd();
                    }
                });
            }
        }).a(upperCase, new View.OnClickListener() { // from class: com.huawei.health.interactor.MainInteractors.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("Login_MainInteractors", "onClick(): cancel");
                AccountHelper.setIsFirstOpenApp(false);
                MainInteractors.this.ax();
                MainInteractors.this.u.init(new ioj(true));
                HuaweiLoginManager.setCloudVersion("0", null);
                CommonUtil.ab("0");
                VersionIsCloud.setIfNeedShowAreaAlert(MainInteractors.this.m, "0");
                MainInteractors.this.z.b("if_need_set_account_login_entry", true);
                if (MainInteractors.this.l == null || MainInteractors.this.l.isShutdown()) {
                    return;
                }
                MainInteractors.this.l.execute(new Runnable() { // from class: com.huawei.health.interactor.MainInteractors.6.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MainInteractors.this.bd();
                    }
                });
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ax() {
        String strE = SharedPreferenceManager.e(this.m, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        boolean zIsOverseaJudgeByCountry = CloudImpl.e(this.m).isOverseaJudgeByCountry(strE);
        LogUtil.a("Login_MainInteractors", "resetAllowedLoginToDB countryCode:", strE, " allowLogin:", Boolean.valueOf(zIsOverseaJudgeByCountry));
        if (zIsOverseaJudgeByCountry) {
            HuaweiLoginManager.setIsAllowedLoginValueToDB(this.m, "1");
        } else {
            HuaweiLoginManager.setIsAllowedLoginValueToDB(this.m, "0");
        }
    }

    public void u() {
        SharedPreferenceManager.e(this.m, Integer.toString(10015), "key_ui_login_exit_hms_apk", "", new StorageParams(0));
        LogUtil.a("Login_MainInteractors", "set KEY_UI_LOGIN_EXIT_HMS_APK null.");
    }

    public void d(long j2) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("duration", String.valueOf(j2));
        linkedHashMap.put("status", "0");
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_BOOTING_90010001.value(), linkedHashMap);
    }

    public void w() {
        this.z.d(this.f7166b);
    }

    private void ba() {
        ExecutorService executorService = this.f7166b;
        if (executorService != null) {
            executorService.shutdownNow();
            this.f7166b = null;
        }
    }

    public void m() {
        HwEncryptUtil.e();
    }

    public void ad() {
        AccountHelper.updateAccountInfo(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        this.z.k();
    }

    static class i extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<MainInteractors> f7190b;

        public i(MainInteractors mainInteractors) {
            this.f7190b = new WeakReference<>(mainInteractors);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            MainInteractors mainInteractors = this.f7190b.get();
            if (mainInteractors != null) {
                if (intent == null) {
                    LogUtil.j("Login_MainInteractors", "onReceive intent is null");
                    return;
                }
                LogUtil.a("Login_MainInteractors", "RequestAgainSyncCloudDataReceiver onReceive to enter, action = ", intent.getAction());
                if (intent.getBooleanExtra("sync_cloud_data_again", false)) {
                    mainInteractors.ac();
                }
            }
        }
    }

    private void al() {
        ThreadPoolManager.c().execute(new g(this));
    }

    static class g implements Runnable {
        private final WeakReference<MainInteractors> d;

        g(MainInteractors mainInteractors) {
            this.d = new WeakReference<>(mainInteractors);
        }

        @Override // java.lang.Runnable
        public void run() {
            MainInteractors mainInteractors = this.d.get();
            if (mainInteractors == null) {
                LogUtil.j("Login_MainInteractors", "SaveLoginDataRunnable mainInteractors is null");
                return;
            }
            Context context = BaseApplication.getContext();
            boolean zH = Utils.h();
            String strE = SharedPreferenceManager.e(context, String.valueOf(20000), "huawei_account_login_init");
            LogUtil.a("Login_MainInteractors", "loginFlag：", strE);
            boolean zIsBrowseMode = LoginInit.getInstance(context).isBrowseMode();
            LogUtil.a("Login_MainInteractors", "isBrowse: ", Boolean.valueOf(zIsBrowseMode));
            if (!zIsBrowseMode && (zH || !TextUtils.isEmpty(strE))) {
                LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit isAllowedLogin");
                HiAccountInfo hiAccountInfoX = mainInteractors.z.x();
                AccountInteractors.saveAccountInfo(context, hiAccountInfoX);
                HiHealthNativeApi.a(context).hiLogin(hiAccountInfoX, new e(mainInteractors));
            }
            if (zH) {
                return;
            }
            LogUtil.a("Login_MainInteractors", "accountmigrate: hiloginAndPluginInit setNotAllowLogin");
            mainInteractors.z.h(mainInteractors.ad);
        }
    }

    private void ah() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!Utils.m()) {
            this.z.s();
        }
        this.z.o();
        this.z.q();
        p();
        h(true);
        if (this.z.e(false, BuildConfig.VERSION_CODE)) {
            this.z.c(BuildConfig.VERSION_CODE);
        } else {
            y();
        }
        OpAnalyticsUtil.getInstance().init(this.m);
        this.z.f();
        this.z.n();
        this.z.l();
        this.z.aa();
        MainInteractorsUtils.d();
        this.z.c(this.ad);
        this.z.ag();
        am();
        if (mal.b() != null) {
            mal.b();
            mal.a(this.m, false);
        }
        this.z.b(this.ad);
        ubu.c(this.m);
        this.v.clickRecord(1010001, LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        tee.a();
        qso.d().b();
        jxb.b();
        iqu.g();
        SampleConfigUtils.resendAsyncWhenReconnect(ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "Login_MainInteractors"), "Login_MainInteractors");
        xka.e();
        SyncCloudUtils.d(this.ad);
        b(false);
        OnlineImUtil.downloadOnlineConfig();
        LogUtil.a("Login_MainInteractors", "initAdapterAndView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void ak() {
        if (gyt.e() && !this.q) {
            e(true);
            unl.c();
        }
        MainInteractorsUtils.e(this.m);
    }

    private void an() {
        if (AccountHelper.getAccountType() == 2) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud accountType == 2   2.0account");
            this.ac.setOriginalHuid(AccountHelper.getHiAccountInfo().getHuid());
            this.ac.setOriginalServiceToken(AccountHelper.getHiAccountInfo().getServiceToken());
        } else {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud all null");
        }
        if (this.j) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud isSendMigrateCommandTimeOut");
            if (TextUtils.isEmpty(this.ae) || TextUtils.isEmpty(this.ag)) {
                return;
            }
            this.ac.setOriginalHuid(this.ae);
            this.ac.setOriginalServiceToken(this.ag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MergeUserAllDataRsp mergeUserAllDataRsp, String str) {
        if (mergeUserAllDataRsp == null) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud cancel var1 = null");
            try {
                long jStringToLong = AccountInteractors.stringToLong(str);
                LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but cloud return faild error_coed = ", Long.valueOf(jStringToLong));
                lub.c().c(this.ae, LoginInit.getInstance(this.m).getAccountInfo(1011));
                if (jStringToLong == 999) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() = 999 ");
                    this.ad.sendEmptyMessage(4011);
                } else if (jStringToLong == 31005) {
                    LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() = 31005 ");
                    SharedPreferenceManager.e(this.m, Integer.toString(10015), "is_auth_failed_migrate", "is_auth_failed_migrate_true", new StorageParams(0));
                    this.z.a(this.ac, Boolean.valueOf(this.j), this.ae, this.ad);
                }
                AccountInteractors.uploadMigrateerrorCode(jStringToLong);
                return;
            } catch (NumberFormatException e2) {
                this.af = 1;
                AccountInteractors.uploadMigrateerrorCode(1003L);
                LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but cloud return faild var2.getResultCode() NumberFormatException : " + e2.getMessage());
                return;
            }
        }
        lub.c().c(this.ae, LoginInit.getInstance(this.m).getAccountInfo(1011));
        if (mergeUserAllDataRsp.getResultCode().intValue() == 0) {
            LogUtil.a("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but cloud return  var1.getResultCode() = 0");
            this.z.a(this.ac, Boolean.valueOf(this.j), this.ae, this.ad);
        } else {
            LogUtil.e("Login_MainInteractors", "accountmigrate: sendMigrageDataToCloud but cloud return var1 != null but var1.getResultCode() ! = 0");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, Handler handler, Intent intent) {
        if ("com.huawei.hihealth.action_sync".equals(str)) {
            this.z.b(handler, intent);
        } else if ("com.huawei.hihealth.action_sqlite_upgrade_done".equals(str) || "com.huawei.hihealth.action_sqlite_upgrade_exception".equals(str)) {
            this.z.b(this.ae, this.ad);
        } else {
            LogUtil.a("Login_MainInteractors", "equalsAction: not action");
        }
    }

    public void c(long j2) {
        if (!CommonUtil.ap() || j2 > 8000) {
            LogUtil.j("Login_MainInteractors", "setColdStartEvent not betaVersion or costTime invalid");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.COLD_START_COST_TIME, String.valueOf(j2));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_BOOTING_90010001.value(), linkedHashMap);
    }

    static class h extends PermissionsResultAction {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f7189c;

        private h(String[] strArr) {
            this.f7189c = strArr;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("Login_MainInteractors", "checkHavePermission onGranted()");
            for (String str : this.f7189c) {
                if ("android.permission.ACTIVITY_RECOGNITION".equals(str)) {
                    LogUtil.a("Login_MainInteractors", "ACTIVITY_RECOGNITION onGranted");
                    Intent intent = new Intent();
                    intent.setPackage(BaseApplication.getAppPackage());
                    intent.setAction("com.huawei.health.start_step_counter");
                    BaseApplication.getContext().sendBroadcast(intent, SecurityConstant.f5920a);
                    ipf.a(2);
                }
            }
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            LogUtil.a("Login_MainInteractors", "checkHavePermission onDenied() ");
            for (String str2 : this.f7189c) {
                if ("android.permission.ACTIVITY_RECOGNITION".equals(str2)) {
                    LogUtil.a("Login_MainInteractors", "ACTIVITY_RECOGNITION onDenied");
                    ipf.d();
                }
            }
        }
    }
}
