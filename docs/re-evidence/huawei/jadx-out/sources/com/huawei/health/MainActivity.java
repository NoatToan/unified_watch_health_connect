package com.huawei.health;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.ActivityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.media3.common.C;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.braintreepayments.api.PayPalPaymentIntent;
import com.bumptech.glide.Glide;
import com.google.android.gms.fitness.FitnessStatusCodes;
import com.google.android.gms.wearable.WearableStatusCodes;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.common.util.AccountHelper;
import com.huawei.common.util.AccountInteractors;
import com.huawei.common.util.StorageIsCloud;
import com.huawei.common.util.VersionIsCloud;
import com.huawei.featureuserprofile.target.cloud.ActiveTargetManager;
import com.huawei.framework.servicemgr.Consumer;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.common.dfx.storage.StorageMonitor;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.MainActivity;
import com.huawei.health.arkuix.IntentParams;
import com.huawei.health.arkuix.engine.StageDelegateProxy;
import com.huawei.health.arkuix.utils.ArkUIXConstants;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.health.group.api.GroupApi;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.health.constants.BundleTransferdDataContants;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.health.health.player.MiniBottomPlayer;
import com.huawei.health.interactor.MainInteractors;
import com.huawei.health.interactor.OperationAdInteractor;
import com.huawei.health.interactor.WeiXinInteractor;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.motiontrack.api.MotionTrackPretreatmentService;
import com.huawei.health.plan.api.PlanApi;
import com.huawei.health.plan.association.SportEventAssociator;
import com.huawei.health.receiver.AccountChangeReceiver;
import com.huawei.health.receiver.DeviceBindReceiver;
import com.huawei.health.receiver.OperationFeatureReceiver;
import com.huawei.health.receiver.PermissionDialogReceiver;
import com.huawei.health.receiver.TriggerLoginReceiver;
import com.huawei.health.service.HandoffService;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sport.utils.SportSupportUtil;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.health.suggestion.h5pro.AiSportVoiceHelper;
import com.huawei.health.suggestion.model.FitRunPlayAudio;
import com.huawei.health.taskplatform.TaskPlatformMgr;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.utils.MainInteractorsUtils;
import com.huawei.health.utils.NavigationHelper;
import com.huawei.health.utils.SyncCloudUtils;
import com.huawei.health.vip.datatypes.UserMemberInfo;
import com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper;
import com.huawei.healthcloud.plugintrack.runningroute.utils.RunningRouteUtils;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener;
import com.huawei.hihealth.data.type.HiSyncType;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hwauthutil.utils.PackageManagerHelper;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.application.RunningForegroundListener;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwwatchfacemgr.SmartClipManager;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwfoundationmodel.trackmodel.ISportDataCallback;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.openalliance.ad.constant.Action;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.beans.TitleBean;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.audiocontrol.AudioControlOperate;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.operation.utils.WebViewHelp;
import com.huawei.pluginachievement.manager.service.LanguageResReceiver;
import com.huawei.pluginachievement.manager.service.OnceMovementReceiver;
import com.huawei.pluginachievement.ui.AchieveMedalNewActivity;
import com.huawei.pluginfitnessadvice.FitWorkout;
import com.huawei.pluginsport.helper.AbsAiModelConfigHelper;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.HuaweiMobileServiceSetDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import com.huawei.ui.commonui.transition.ActivityTransitionAnimator;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity;
import com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity;
import com.huawei.ui.homehealth.HomeFragment;
import com.huawei.ui.homehealth.HomeOverseaPrivacyDialog;
import com.huawei.ui.homehealth.device.DeviceFragment;
import com.huawei.ui.homehealth.device.DeviceMainFragment;
import com.huawei.ui.homehealth.device.NewDeviceFragment;
import com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView;
import com.huawei.ui.homehealth.healthtrend.HealthTrendCardData;
import com.huawei.ui.homehealth.interactors.GolfUpdateMapInteractor;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeSchemeActivity;
import com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment;
import com.huawei.ui.main.stories.discover.fragment.DiscoverFragment;
import com.huawei.ui.main.stories.fitness.activity.coresleep.KnitSleepDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.HeartRateDetailActivity;
import com.huawei.ui.main.stories.fitness.activity.heartrate.KnitHeartRateActivity;
import com.huawei.ui.main.stories.history.SportHistoryActivity;
import com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil;
import com.huawei.ui.main.stories.smartcenter.activity.SmartMsgSkipActivity;
import com.huawei.ui.main.stories.template.health.module.HealthDataDetailActivity;
import com.huawei.ui.main.stories.userprofile.activity.PersonalCenterFragment;
import com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView;
import com.huawei.uikit.hwviewpager.widget.HwViewPager;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.buh;
import defpackage.dcb;
import defpackage.dcf;
import defpackage.dcq;
import defpackage.ddv;
import defpackage.ddy;
import defpackage.det;
import defpackage.dxm;
import defpackage.eam;
import defpackage.ecs;
import defpackage.eyo;
import defpackage.fai;
import defpackage.ffv;
import defpackage.fns;
import defpackage.foa;
import defpackage.fua;
import defpackage.fwx;
import defpackage.get;
import defpackage.gsn;
import defpackage.gsx;
import defpackage.gsz;
import defpackage.gtc;
import defpackage.gtg;
import defpackage.gvd;
import defpackage.gyt;
import defpackage.hcb;
import defpackage.idy;
import defpackage.igf;
import defpackage.ino;
import defpackage.ioi;
import defpackage.iov;
import defpackage.ipc;
import defpackage.ipl;
import defpackage.ipu;
import defpackage.iqa;
import defpackage.iqc;
import defpackage.iqd;
import defpackage.iqx;
import defpackage.ire;
import defpackage.irl;
import defpackage.irz;
import defpackage.isa;
import defpackage.ive;
import defpackage.iwy;
import defpackage.izg;
import defpackage.izt;
import defpackage.jaa;
import defpackage.jae;
import defpackage.jaq;
import defpackage.jcg;
import defpackage.lfm;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.lsb;
import defpackage.ltd;
import defpackage.ltr;
import defpackage.mal;
import defpackage.mgg;
import defpackage.mgm;
import defpackage.mgu;
import defpackage.mih;
import defpackage.njy;
import defpackage.nwa;
import defpackage.ohf;
import defpackage.oru;
import defpackage.pea;
import defpackage.pjd;
import defpackage.pvb;
import defpackage.qdm;
import defpackage.qjb;
import defpackage.qkz;
import defpackage.qpb;
import defpackage.qpx;
import defpackage.qqu;
import defpackage.qre;
import defpackage.qrs;
import defpackage.qsi;
import defpackage.qsk;
import defpackage.qso;
import defpackage.qsp;
import defpackage.qst;
import defpackage.qtv;
import defpackage.rhc;
import defpackage.sio;
import defpackage.smp;
import defpackage.sub;
import defpackage.sxx;
import defpackage.tfi;
import defpackage.tfk;
import defpackage.tpb;
import defpackage.tqp;
import defpackage.unl;
import defpackage.utd;
import defpackage.vft;
import defpackage.vhb;
import defpackage.vng;
import defpackage.vwh;
import defpackage.wjs;
import defpackage.wsp;
import defpackage.wss;
import defpackage.wud;
import defpackage.xeq;
import defpackage.xeu;
import defpackage.xjo;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BuildConfigProperties;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.DeviceConfigInit;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HiDateUtil;
import health.compact.a.KeyManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class MainActivity extends BaseActivity implements ActivityCompat.OnRequestPermissionsResultCallback, RunningForegroundListener, SportEntranceFragment.SportEntranceCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f6128b = new Object();
    private static boolean d = false;
    private static Uri e;
    private static Uri f;
    private static Uri g;
    private static Uri h;
    private static Uri i;
    private static String j;
    private Uri aa;
    private String ab;
    private HuaweiMobileServiceSetDialog.Builder ag;
    private ExecutorService aj;
    private LinearLayout ak;
    private Handler as;
    private xeu ay;
    private sxx az;
    private HuaweiApiClient bb;
    private b bd;
    private boolean bs;
    private boolean bt;
    private MainInteractors ce;
    private ViewGroup cg;
    private TextView cj;
    private NavigationHelper cl;
    private HuaweiMobileServiceSetDialog co;
    private String cp;
    private NoTitleCustomAlertDialog cq;
    private fns cr;
    private PersonalCenterFragment cu;
    private PermissionDialogReceiver cv;
    private i cw;
    private int cz;
    private int dg;
    private String di;
    private int dj;
    private String dk;
    private HealthBottomView dl;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private SportEntranceFragment f0do;
    private TriggerLoginReceiver dr;
    private Uri dt;
    private UserLabelServiceApi du;
    private iqx dw;
    private WeiXinInteractor dz;
    private ViewStub ec;
    private e k;
    private g l;
    private a o;
    private irl p;
    private HealthApplication q;
    private OperationAdInteractor r;
    private NoTitleCustomAlertDialog u;
    private NoTitleCustomAlertDialog v;
    private NoTitleCustomAlertDialog w;
    private Context x;
    private NoTitleCustomAlertDialog y;
    private int n = Color.rgb(MachineControlPointResponse.OP_CODE_EXTENSION_SET_SUPPRESS_AUTO_PAUSE, 127, 50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f6129a = Constants.HOME;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f6130c = 0;
    private dcq av = null;
    private HomeFragment bc = null;
    private DiscoverFragment af = null;
    private DeviceMainFragment ac = null;
    private HealthViewPager dq = null;
    private MainInteractorsUtils dy = new MainInteractorsUtils();
    private gtc cf = new gtc();
    private String dx = null;
    private int at = -1;
    private Uri dv = null;
    private String ch = null;
    private String t = null;
    private String ci = null;
    private String cs = null;
    private String an = null;
    private String db = null;
    private String de = null;
    private String dc = null;
    private String df = null;
    private String da = null;
    private String cy = null;
    private String dh = null;
    private String ae = null;
    private String dd = null;
    private String ah = null;
    private Uri cx = null;
    private boolean bf = false;
    private long am = 0;
    private long aq = 0;
    private long ck = 0;
    private long s = 0;
    private int ad = -1;
    private String ct = "";
    private boolean bn = false;
    private boolean bo = false;
    private boolean bl = false;
    private int cn = -1;
    private long dn = 0;
    private boolean by = false;
    private boolean bx = false;
    private boolean ca = false;
    private boolean bz = false;
    private boolean bu = false;
    private boolean cd = false;
    private int cc = -1;
    private boolean bw = false;
    private boolean bq = false;
    private boolean bp = false;
    private boolean cb = false;
    private boolean bg = false;
    private boolean bk = false;
    private boolean ap = true;
    private long cm = 0;
    private boolean bi = false;
    private boolean au = false;
    private boolean bj = false;
    private boolean bm = false;
    private boolean ax = false;
    private boolean bh = false;
    private String ds = null;
    private int ba = 0;
    private long dp = 0;
    private long dm = 0;
    private ipu ar = new ipu();
    private List<Integer> z = new ArrayList();
    private ArrayList<Fragment> al = new ArrayList<>();
    private int ai = -1;
    private boolean aw = false;
    private boolean br = false;
    private boolean bv = false;
    private boolean be = false;
    private boolean m = false;
    private Observer ao = new Observer() { // from class: com.huawei.health.MainActivity.5
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            MainActivity.this.bs = false;
            MainActivity.this.ex();
            MainActivity.this.bw();
            Iterator it = MainActivity.this.z.iterator();
            while (it.hasNext()) {
                MainActivity.this.as.sendEmptyMessage(((Integer) it.next()).intValue());
            }
        }
    };

    private void e(Object obj) {
        if (obj instanceof Intent) {
            Intent intent = (Intent) obj;
            if (TextUtils.isEmpty(intent.getAction())) {
                return;
            }
            t();
            if (Action.ACTION_HW_ACCOUNT_LOGOUT.equals(intent.getAction())) {
                ReleaseLogUtil.c("Login_MainActivity", "receive the not static BroadcastReceiver , logout");
                iqd.b().e(this, intent);
                this.bf = true;
                KeyValDbManager.d(this.x).b("cloud_st_invalid_flag", "0", new StorageParams(1));
                this.bk = false;
            }
        }
    }

    private void t() {
        if (this.dl == null || isa.d() == this.bt) {
            return;
        }
        boolean zD = isa.d();
        this.bt = zD;
        if (zD) {
            if (irz.i()) {
                this.dl.d(R.string.IDS_vip, qre.c(R.drawable.ic_bottomtab_1_xxxhdpi), this.ai, false);
            } else {
                this.dl.d(R.string.IDS_vip, qre.c(R.drawable.main_member_drawable), this.ai, false);
            }
            if (this.cj == null) {
                this.cj = aw();
            }
            int i2 = this.cn;
            if (i2 == this.ai && i2 != -1) {
                qsp.c(this.cj, this.n);
            }
            en();
            return;
        }
        this.dl.d(R.string.IDS_hw_show_main_home_page_discover, this.x.getResources().getDrawable(R.drawable.main_discover_drawable), this.ai, false);
    }

    private TextView aw() {
        for (View view : b(this.dl.getChildAt(this.ai))) {
            if (view instanceof TextView) {
                return (TextView) view;
            }
        }
        return null;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        LogUtil.b("Login_MainActivity", "Enter attachBaseContext");
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        LogUtil.b("Login_MainActivity", "Enter onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ReleaseLogUtil.c("Login_MainActivity", "Enter MainActivity onCreate");
        this.ap = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        qrs.c(this, bundle);
        super.onCreate(bundle);
        this.as = new j(Looper.getMainLooper(), this);
        BaseDialog.sSplashAdViewId = R.id.splash_ad_view;
        BaseActivity.setNavigationBarVisibility(this, 0);
        this.cm = System.currentTimeMillis();
        this.x = this;
        this.dy.j(this);
        bq();
        bv();
        m();
        StorageIsCloud.storageIsCloud(getApplicationContext());
        StorageIsCloud.isAllowedLogin(getApplicationContext());
        bf();
        cancelAdaptRingRegion();
        if (!bs()) {
            if (this.cc == 5) {
                LogUtil.b("Login_MainActivity", "isActivityStackRoot don't continue, handleLaunchFromSportingNotification");
                bg();
            }
            LogUtil.e("Login_MainActivity", "there is already a MainActivity, this are abundant and will be finished");
            this.ap = false;
            finish();
            return;
        }
        di();
        bu();
        if (Process.is64Bit() && !ipc.b()) {
            StageDelegateProxy.getInstance().loadAllBridgePlugin(this);
        }
        dm();
        dt();
        gsn.e(this, this.as);
        dr();
        this.cf.a(BaseApplication.getContext());
        TriggerLoginReceiver triggerLoginReceiver = new TriggerLoginReceiver(this.as);
        this.dr = triggerLoginReceiver;
        triggerLoginReceiver.c(this.as);
        ObserverManagerUtil.e("com.huawei.plugin.trigger.checklogin", new Object[0]);
        e(0);
        if (wsp.g()) {
            fl();
        } else {
            dcb.d(this, this.as);
        }
        utd.e();
        vng.d();
        fb();
        this.bq = true;
        d = false;
        this.du = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        this.cl = new NavigationHelper(this);
        setMinibarBottomMargin(getResources().getDimensionPixelSize(R.dimen.health_common_56dp));
        ReleaseLogUtil.c("Login_MainActivity", "onCreate finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        du();
        dq();
        dl();
        if (AuthorizationUtils.c(this.x)) {
            igf.e(this);
        }
        fai.e(false);
    }

    private void bv() {
        LogUtil.b("Login_MainActivity", "start initWeightSwitch");
        SharedPreferenceManager.e(this.x, Integer.toString(10000), "health_weight_auto_update", "1", new StorageParams());
        vwh.c(true);
    }

    private void bu() {
        overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
        setContentView(R.layout.layout_activity_mainui);
        getWindow().setBackgroundDrawableResource(R.color.colorSubBackground);
        HealthViewPager healthViewPager = (HealthViewPager) findViewById(R.id.hw_health_main_viewpager);
        this.dq = healthViewPager;
        healthViewPager.setIsScroll(false);
        this.dl = (HealthBottomView) findViewById(R.id.hw_main_tabs);
        this.ec = (ViewStub) findViewById(R.id.viewstub_mainui_startpage);
        this.dw = new iqx(this, this.ec);
        this.ak = (LinearLayout) findViewById(R.id.member_guide_view);
    }

    private void fl() {
        String ifNeedShowAreaAlert = VersionIsCloud.getIfNeedShowAreaAlert(this.x);
        LogUtil.b("Login_MainActivity", "todoCheckLogin():ifNeedShowAreaAlert = ", ifNeedShowAreaAlert);
        if ("1".equals(ifNeedShowAreaAlert)) {
            this.ce.a(false);
        } else {
            dcb.d(this, this.as);
        }
    }

    private void dr() {
        boolean zCf;
        if (CommonUtil.v(this.x)) {
            zCf = f();
        } else {
            zCf = CommonUtil.cf();
            ReleaseLogUtil.c("Login_MainActivity", "registerPermissionReceiver isSupport:", Boolean.valueOf(zCf));
        }
        ltd.e().e(zCf);
        if (zCf) {
            ReleaseLogUtil.c("Login_MainActivity", "registerPermissionReceiver don't need dialog");
            return;
        }
        ReleaseLogUtil.c("Login_MainActivity", "registerPermissionReceiver");
        this.cv = new PermissionDialogReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.ACTION_PERMISSION_REQUEST");
        intentFilter.addAction("com.huawei.health.action.ACTION_PERMISSION_REQUEST_FINISH");
        LocalBroadcastManager.getInstance().registerReceiver(this.cv, intentFilter);
    }

    public boolean f() {
        boolean zAv = CommonUtil.av();
        boolean z = CommonUtil.bd() && !CommonUtil.aj();
        ReleaseLogUtil.c("Login_MainActivity", "isPermissionReasonSupported isSupportHuawei=", Boolean.valueOf(zAv), " isSupportHonor=", Boolean.valueOf(z));
        return zAv || z;
    }

    private void fp() {
        if (this.cv == null) {
            return;
        }
        LogUtil.b("Login_MainActivity", "unRegisterPermissionReceiver");
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.cv);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("Login_MainActivity", "unRegisterPermissionReceiver IllegalArgumentException");
        }
    }

    private void m() {
        PlanApi planApi;
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.MainActivity.12
            @Override // java.lang.Runnable
            public void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                pvb.e(MainActivity.this.x);
                MainActivity.this.fz();
                rhc.c(MainActivity.this.x, MainActivity.this.bs());
                KeyManager.h();
                vft.b();
                H5proUtil.initH5ProAndRefreshVersionDataOnce();
                if (fua.k()) {
                    HealthTrendCardData.a();
                    LogUtil.b("Login_MainActivity", "loading h5 health trend");
                }
                MainActivity.dh();
                MultiUsersManager.INSTANCE.regUserInfoListener();
                AbsAiModelConfigHelper.preDownloadConfig();
                MainActivity.this.dw();
                MainActivity.this.dy();
                mgm.d().c();
                buh.c(false);
                ReleaseLogUtil.c("Login_MainActivity", "asyncInit finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        });
        if (ae()) {
            qsi.d(new WeakReference(this), R.layout.knit_fragment_layout, 12);
        }
        if (AuthorizationUtils.c(BaseApplication.getContext()) && ae() && tfi.f(this.x) == 2 && LoginInit.getInstance(this.x).getIsLogined() && (planApi = (PlanApi) Services.d("CoursePlanService", PlanApi.class)) != null) {
            planApi.preLoadPlan();
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: dbp
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.d();
            }
        });
    }

    public static /* synthetic */ void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.preCreateMarketingEventDbMgr();
        }
        ReleaseLogUtil.c("Login_MainActivity", "preCreateMarketingEventDbMgr time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dy() {
        final WeakReference weakReference = new WeakReference(this);
        HandlerCenter.a().d(new Runnable() { // from class: dbt
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.d(weakReference);
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    public static /* synthetic */ void d(WeakReference weakReference) {
        MainActivity mainActivity = (MainActivity) weakReference.get();
        if (mainActivity == null) {
            LogUtil.e("Login_MainActivity", "requestDeviceWebNps activity is null");
            return;
        }
        DeviceInfo connectDevice = DeviceWebNpsUtil.getConnectDevice();
        if (connectDevice != null && DeviceWebNpsUtil.curDeviceIsSupportWebNps(connectDevice.getDeviceModel())) {
            DeviceWebNpsUtil.stratToGetWearDeviceNpsLink(mainActivity, connectDevice);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dw() {
        if ("HTY".equals(BuildConfigProperties.d())) {
            try {
                ReflectionUtils.e(ReflectionUtils.e("com.huawei.health.developer.util.dataexport.HtyDataExportHelper"), "reflectResetAlarm");
            } catch (ClassNotFoundException unused) {
                LogUtil.d("Login_MainActivity", "resetHtyAlarm() ClassNotFoundException");
            }
        }
    }

    private void k() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.health.MainActivity.24
            @Override // java.lang.Runnable
            public void run() {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                AbsAiModelConfigHelper.preDownloadConfig();
                foa.d().e();
                ReleaseLogUtil.c("Login_MainActivity", "asyncInitAfterAgreement finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dh() {
        SharedPreferenceManager.e(com.huawei.haf.application.BaseApplication.b(), Integer.toString(10000), "apk_build_time", BuildConfig.BUILD_TIME, new StorageParams());
    }

    private void bq() {
        this.cr = new fns(this.x, this.as);
        MainInteractors mainInteractors = new MainInteractors(this.x);
        this.ce = mainInteractors;
        mainInteractors.c(this.as);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.aj = executorServiceNewSingleThreadExecutor;
        this.ce.c(executorServiceNewSingleThreadExecutor);
        this.ce.u();
        this.ce.e(false);
        this.r = new OperationAdInteractor(this);
        HealthApplication healthApplication = (HealthApplication) getApplication();
        this.q = healthApplication;
        healthApplication.c(this);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m820do() {
        boolean zC = ire.c();
        this.bs = zC;
        if (zC) {
            ObserverManagerUtil.d(this.ao, "MAIN_GUIDE_VIEW_COMPLETED");
        }
    }

    private void fo() {
        if (this.bs) {
            ObserverManagerUtil.a(this.ao, "MAIN_GUIDE_VIEW_COMPLETED");
        }
    }

    private void ed() {
        LogUtil.b("Login_MainActivity", "saveBindingDeviceToOdmf enter");
        HiHealthManager.d(this.x).readDeviceInfo(new d());
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class d implements HiDataHiDeviceInfoListener {
        private d() {
        }

        @Override // com.huawei.hihealth.data.listener.HiDataHiDeviceInfoListener
        public void onResult(List<HiDeviceInfo> list) {
            if (list == null) {
                LogUtil.e("Login_MainActivity", "saveBindingDeviceToOdmf deviceInfos = null");
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getDeviceTypeMapping() != -1) {
                    ((UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class)).saveBindingDeviceToOdmf(list.get(i).getDeviceInfoToODMF());
                }
            }
        }
    }

    private void eo() {
        LogUtil.b("Login_MainActivity", "showHmsErrorDialog");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(this.x);
        builder.e("").b(R.string.IDS_hw_hms_install_alert).a(R.string.IDS_hw_hms_install_alert_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.22
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("Login_MainActivity", "showHmsErrorDialog ok");
                MainInteractors.b();
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void bf() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        if (intent != null) {
            try {
                a(intent);
                if (TextUtils.isEmpty(this.dc) && TextUtils.isEmpty(this.df) && TextUtils.isEmpty(this.da)) {
                    TextUtils.isEmpty(this.di);
                }
                TextUtils.isEmpty(this.di);
                SharedPreferenceManager.e(this.x, String.valueOf(20000), "from", intent.getStringExtra("from"), null);
                this.ah = intent.getStringExtra("moduleName");
            } catch (Exception unused) {
                LogUtil.b("Login_MainActivity", "handleIntentData MainActivity encounteredClassNotFoundException");
            }
            e(intent);
            boolean booleanExtra = intent.getBooleanExtra("isFromTrainDetail", false);
            this.bi = booleanExtra;
            LogUtil.b("Login_MainActivity", "handleIntentData mIsFromTrainDetail = ", Boolean.valueOf(booleanExtra));
            b(intent);
        }
        String str = this.db;
        int i2 = this.dg;
        int i3 = this.dj;
        String str2 = this.dk;
        int i4 = this.ad;
        String str3 = this.ct;
        boolean z = this.bo;
        LogUtil.c("Login_MainActivity", "handleIntentData mSchemeUrl : ", str, ", mSmartMsgId = ", Integer.valueOf(i2), ", mSmartMsgType = ", Integer.valueOf(i3), ", mSmartMsgContent = ", str2, ", mDeviceType : ", Integer.valueOf(i4), ", mProductName : ", str3, ", mIsPorc : ", Boolean.valueOf(z), ", sSchemeGroup : ", j, ", mSchemeQrCode : ", this.de, ", mIsNeedLogin : ", Boolean.valueOf(this.bn), ", sSchemeKaKaUri = ", i, ", sSchemeAchieveUri = ", e, ", sSchemeNfcUri = ", h, ", sSchemeQrCodeUri = ", f, ", sSchemeColumnUri = ", g, ", mDownloadPluginModuleName = ", this.ah);
        SharedPreferenceManager.e(this.x, String.valueOf(20000), "needLogin", String.valueOf(this.bn), null);
        LogUtil.b("Login_MainActivity", "handleIntentData finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void a(Intent intent) {
        this.dx = intent.getStringExtra("webUrl");
        this.dc = intent.getStringExtra("entrance");
        this.df = intent.getStringExtra("sleepDetail");
        if (fua.d(this.x)) {
            this.da = intent.getStringExtra("ecgDetail");
        } else {
            this.da = intent.getStringExtra("ecgDetail");
        }
        this.cy = intent.getStringExtra("extra_service_id");
        this.dh = intent.getStringExtra("walletUri");
        this.db = intent.getStringExtra("schemeUrl");
        j = intent.getStringExtra("healthgroup");
        this.de = intent.getStringExtra("schemeQrCode");
        this.cz = intent.getIntExtra("schemeDataType", -1);
        this.cx = (Uri) intent.getParcelableExtra(" schemeParamUri");
        i = (Uri) intent.getParcelableExtra("schemeKaKa");
        e = (Uri) intent.getParcelableExtra("schemeAchieve");
        h = (Uri) intent.getParcelableExtra("schemeNfc");
        f = (Uri) intent.getParcelableExtra("schemeQrCodeUri");
        g = (Uri) intent.getParcelableExtra("schemeColumnUri");
        this.dd = intent.getStringExtra("schemeTrackFilePath");
        this.dv = (Uri) intent.getParcelableExtra("weekMonthReportUri");
        this.ch = intent.getStringExtra("achieveMedal");
        this.ae = intent.getStringExtra("directConnectDevice");
        this.dg = intent.getIntExtra("health_smartmsg_id", -1);
        this.dj = intent.getIntExtra("health_smartmsg_type", -1);
        this.dk = intent.getStringExtra("health_smartmsg_content");
        this.dt = intent.getData();
        this.at = intent.getIntExtra(com.huawei.health.messagecenter.model.CommonUtil.PARAM_HEALTH_TYPE, -1);
        this.ad = intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -1);
        this.ct = intent.getStringExtra("dname");
        this.bo = intent.getBooleanExtra("isPorc", false);
        this.cp = intent.getStringExtra("pairGuideSelectAddress");
        String stringExtra = intent.getStringExtra(Constants.HOME_TAB_NAME);
        this.ab = stringExtra;
        this.bx = Constants.HOME.equals(stringExtra);
        this.di = pvb.b(intent);
        this.bn = intent.getBooleanExtra("needLogin", false);
        this.ci = intent.getStringExtra("memberUri");
        this.t = intent.getStringExtra("activeTarget");
        this.cs = intent.getStringExtra("orderCode");
        this.ds = intent.getStringExtra("type");
        this.an = intent.getStringExtra("from");
    }

    private void bk() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ds();
        sxx sxxVar = new sxx();
        this.az = sxxVar;
        sxxVar.c();
        gtg.d().a();
        gsx.e(this);
        ReleaseLogUtil.c("Login_MainActivity", "handleStartFirstStep finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        DeviceBindReceiver.a();
        gsz.b(this);
        AccountChangeReceiver.c(this.as);
    }

    private void bi() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        StorageMonitor.b();
        foa.d().e();
        ThreadPoolManager.c().execute(new Runnable() { // from class: dby
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.b();
            }
        });
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).registerContactChangeObserver();
        ReleaseLogUtil.c("Login_MainActivity", "handleStartSecondStep finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public static /* synthetic */ void b() {
        dxm.r();
        dxm.k();
    }

    public void e(int i2) {
        ReleaseLogUtil.c("Login_MainActivity", "setStartPageVisibility visibility:", Integer.valueOf(i2));
        if (i2 != 0) {
            be();
        }
        a(i2);
    }

    private void a(int i2) {
        iqx iqxVar = this.dw;
        if (iqxVar == null) {
            LogUtil.e("Login_MainActivity", "showOrHideStartPage startPageHelper is null");
        } else if (i2 != 0 && this.bc == null) {
            LogUtil.e("Login_MainActivity", "showOrHideStartPage mHomeFragment is null");
        } else {
            iqxVar.d(i2);
        }
    }

    private void fu() {
        HomeFragment homeFragment = this.bc;
        if (homeFragment == null) {
            ReleaseLogUtil.c("Login_MainActivity", "updateHomeFloatView return, mHomeFragment is null");
        } else {
            homeFragment.f();
            ReleaseLogUtil.c("Login_MainActivity", "show HomeFragment float button");
        }
    }

    private void fy() {
        if (this.f0do == null) {
            ReleaseLogUtil.c("Login_MainActivity", "updateHomeFloatView return, mHomeFragment is null");
        }
    }

    private void be() {
        BaseActivity.setNavigationBarVisibility(this, 0);
        c(true);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws Throwable {
        LanguageInstallHelper.updateResources(this);
        ReleaseLogUtil.c("Login_MainActivity", "onConfigurationChanged: ", configuration);
        iqx iqxVar = this.dw;
        if (iqxVar != null) {
            iqxVar.b();
        }
        c(false);
        ire.e(this);
        dj();
        super.onConfigurationChanged(configuration);
    }

    private void dj() throws Throwable {
        if (wsp.c()) {
            d(this.x);
        } else if (fns.c() || (LoginInit.getInstance(this.x).getIsLogined() && fns.e())) {
            ew();
        }
    }

    private void d(Context context) {
        ViewStub viewStub;
        boolean z = false;
        BaseActivity.setNavigationBarVisibility(this, 0);
        if (isInMultiWindowMode()) {
            LogUtil.b("Login_MainActivity", "isInMultiWindowMode is true");
            viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_beta_user_agreement_half_screen);
            z = true;
        } else {
            viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_beta_user_agreement);
        }
        this.cr.b(context, z, viewStub);
    }

    private void f(boolean z) throws Throwable {
        boolean z2;
        ViewStub viewStub;
        BaseActivity.setNavigationBarVisibility(this, 0);
        if (isInMultiWindowMode()) {
            LogUtil.b("Login_MainActivity", "isInMultiWindowMode is true");
            viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_startpage_half_screen);
            z2 = true;
        } else {
            LogUtil.b("Login_MainActivity", "isInMultiWindowMode is false");
            z2 = false;
            viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_startpage);
        }
        this.cr.c(z, this.ce, viewStub, z2);
    }

    private void eg() {
        ViewStub viewStub;
        ViewStub viewStub2;
        boolean z = false;
        BaseActivity.setNavigationBarVisibility(this, 0);
        if (isInMultiWindowMode()) {
            LogUtil.b("Login_MainActivity", "isInMultiWindowMode is true");
            z = true;
        }
        if (fns.g()) {
            if (z) {
                viewStub2 = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_hong_kong_half_screen);
            } else {
                viewStub2 = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_hong_kong_startpage);
            }
            this.cr.d(viewStub2, this.ce, z);
            return;
        }
        if (z) {
            viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_overseas_half_screen);
        } else {
            viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_privacy_startpage_overseas);
        }
        this.cr.a(viewStub, this.ce, z);
    }

    private void ba() {
        SportDataOutputApi sportDataOutputApi;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.dy.w();
        this.ce.i();
        fu();
        fy();
        e(0);
        ReleaseLogUtil.c("Login_MainActivity", "gotoMain, show StartPage");
        boolean zO = Utils.o();
        boolean isLogined = LoginInit.getInstance(this.x).getIsLogined();
        if (!zO) {
            OperationFeatureReceiver.b(this.as);
        }
        if (isLogined && gyt.e()) {
            this.ce.e(true);
            unl.c();
        }
        this.dl.setVisibility(8);
        this.dq.setVisibility(8);
        if (isLogined && AuthorizationUtils.c(this.x) && (sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)) != null && sportDataOutputApi.isSportServiceRunning()) {
            det.d(det.e());
        }
        LogUtil.b("Login_MainActivity", "gotoMain finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.ui.homehealth.runcard.trackfragments.SportEntranceFragment.SportEntranceCallback
    public void onSportEntranceCallback() {
        if (cb()) {
            this.dq.setCurrentItem(2, false);
        } else {
            this.dq.setCurrentItem(3, false);
        }
        this.dl.setItemChecked(this.dq.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bs() {
        int i2;
        if (af() || aa() || ac() || v() || ai() || this.de != null || this.at != -1 || isTaskRoot() || ab() || r() || ipl.e(getIntent()) != -1 || ipl.c(getIntent()) != null || ad() || this.cs != null || PayPalPaymentIntent.ORDER.equals(this.an) || this.aa != null || (i2 = this.cc) == 4) {
            return true;
        }
        LogUtil.e("Login_MainActivity", "isActivityStackRoot isTaskRoot: false! mLaunchSource : ", Integer.valueOf(i2));
        return false;
    }

    private boolean ad() {
        return (this.dh == null && g == null && this.ci == null) ? false : true;
    }

    private boolean r() {
        return (this.ae == null && this.dd == null && this.t == null) ? false : true;
    }

    private boolean ab() {
        return (this.df == null && this.da == null && this.ch == null) ? false : true;
    }

    private boolean ai() {
        return this.by || this.ca || this.bi || this.bz || this.bx;
    }

    private boolean v() {
        return (this.dj == -1 && this.cz == -1) ? false : true;
    }

    private boolean ac() {
        return (h == null && f == null && this.dc == null) ? false : true;
    }

    private boolean aa() {
        return (j == null && i == null && e == null) ? false : true;
    }

    private boolean af() {
        return (this.dx == null && this.dv == null && this.db == null) ? false : true;
    }

    private void bg() {
        LogUtil.b("Login_MainActivity", "handleLaunchFromSportingNotification handleClick");
        if (iwy.a(BaseApplication.getContext()).p() == 1) {
            ive.c().z();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        MainInteractors mainInteractors;
        super.onNewIntent(intent);
        LogUtil.b("Login_MainActivity", "onNewIntent ", this);
        try {
            d(intent);
            Parcelable parcelableExtra = intent.getParcelableExtra("schemeQrCodeUri");
            if (Constants.HOME_TAB_DEVICE.equals(this.f6129a) && this.dq != null) {
                c(Constants.HOME_TAB_DEVICE);
            } else if (!"ME".equals(this.f6129a) || this.dq == null) {
                if (Constants.HOME.equals(this.f6129a) && this.dq != null) {
                    this.bx = true;
                    c(Constants.HOME);
                }
            } else {
                c(intent);
            }
            if (parcelableExtra instanceof Uri) {
                f = (Uri) parcelableExtra;
            }
            if (this.bh && (mainInteractors = this.ce) != null) {
                mainInteractors.y();
            }
            e(intent);
            b(intent);
            fb();
        } catch (BadParcelableException e2) {
            LogUtil.d("Login_MainActivity", "MainActivity BadParcelableException : ", e2.getMessage());
        }
        LogUtil.c("Login_MainActivity", "mSmartMsgId = ", Integer.valueOf(this.dg), ", mSmartMsgType = ", Integer.valueOf(this.dj), ", mSmartMsgContent = ", this.dk, ", mProductName = ", this.ct, ", mDeviceType = ", Integer.valueOf(this.ad));
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10000), "key_wether_to_auth");
        if (!TextUtils.isEmpty(this.di) && "true".equals(strE)) {
            x();
            this.di = "";
        }
        ag();
        if (!Utils.m()) {
            OperationFeatureReceiver.b(this.as);
        }
        f(intent);
        al();
        fn();
        g(intent);
        ev();
    }

    private void d(Intent intent) {
        this.dg = intent.getIntExtra("health_smartmsg_id", -1);
        this.dj = intent.getIntExtra("health_smartmsg_type", -1);
        this.dk = intent.getStringExtra("health_smartmsg_content");
        this.di = pvb.b(intent);
        this.f6129a = intent.getStringExtra(Constants.HOME_TAB_NAME);
        this.ad = intent.getIntExtra(DeviceCategoryFragment.DEVICE_TYPE, -1);
        this.ct = intent.getStringExtra("dname");
        this.bo = intent.getBooleanExtra("isPorc", false);
        this.bl = intent.getBooleanExtra("from_update_version", false);
        this.ae = intent.getStringExtra("directConnectDevice");
        this.bh = intent.getBooleanExtra("from_oobe", false);
        this.an = intent.getStringExtra("from");
        setIntent(getIntent().putExtra("TOAST", intent.getStringExtra("TOAST")));
    }

    private void c(Intent intent) {
        c("ME");
    }

    private void g(Intent intent) {
        Uri data = intent.getData();
        if (intent.getBooleanExtra("start_my_watchface", false) || e(data)) {
            LoginInit.getInstance(this.x).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.health.MainActivity.25
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.e("Login_MainActivity", "goToLogin onResponse errorCode = ", Integer.valueOf(i2));
                }
            }, "");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.mIsPageNeedShowMinibar = (this.bt && this.dq.getCurrentItem() == this.ai) ? false : true;
        if ((qjb.c().b() instanceof BottomPlayerView) && !fua.q() && "true".equalsIgnoreCase(SharedPreferenceManager.b(Integer.toString(10000), "ShowHealthHeadLinesData", "")) && this.dq.getCurrentItem() == 0) {
            this.mIsPageNeedShowMinibar = false;
        }
        LogUtil.b("Login_MainActivity", "mIsPageNeedShowMinibar:" + this.mIsPageNeedShowMinibar);
        super.onResume();
        this.bp = true;
        lmf.d().c(LoginInit.getInstance(this.x).getAccountInfo(1011));
        lmf.d().c(this.x, AnalyticsValue.HEALTH_SHOW_APP_PAGE_2050003.value(), new HashMap(), 0);
        if (CommonUtil.ap()) {
            n();
        }
        OpAnalyticsUtil.getInstance().isSetIgnoringBatteryOptimizations(this.x, "e1");
        this.dm = System.currentTimeMillis();
        HealthViewPager healthViewPager = this.dq;
        if (healthViewPager == null) {
            Process.killProcess(Process.myPid());
            return;
        }
        if (!this.bm) {
            this.dl.setItemChecked(healthViewPager.getCurrentItem());
        }
        boolean zCb = cb();
        d(!zCb);
        at();
        OperationAdInteractor operationAdInteractor = this.r;
        if (operationAdInteractor != null) {
            operationAdInteractor.e();
        }
        DeviceMainFragment deviceMainFragment = this.ac;
        if (deviceMainFragment != null) {
            deviceMainFragment.d();
        }
        MainInteractors mainInteractors = this.ce;
        if (mainInteractors != null) {
            mainInteractors.t();
        }
        q();
        ak();
        if (d) {
            d = false;
        } else {
            s();
        }
        if (this.bl) {
            this.dq.setCurrentItem(0, false);
            this.dl.setItemChecked(this.dq.getCurrentItem());
        }
        b(zCb);
        aq();
        dcq dcqVar = this.av;
        if (dcqVar != null) {
            dcqVar.a(this.dq.getCurrentItem());
        }
        ReleaseLogUtil.c("Login_MainActivity", "onResume finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void d(boolean z) {
        DiscoverFragment discoverFragment;
        if (z && this.dq.getCurrentItem() == 2 && (discoverFragment = this.af) != null) {
            discoverFragment.setUserVisibleHint(true);
            if (this.bu) {
                this.af.b(true);
                this.bu = false;
            }
        }
    }

    private void dp() {
        get getVarC = get.c();
        if (qjb.c().b() == null && getVarC.i() == 3 && !njy.e(getVarC.g())) {
            LogUtil.b("Login_MainActivity", "player is playing, init minibar:");
            qjb.c().c(new MiniBottomPlayer(BaseApplication.getContext()));
            qjb.c().d(true);
            initMinibar();
        }
    }

    private void ak() {
        if (this.co == null || this.ag == null) {
            return;
        }
        LogUtil.b("Login_MainActivity", "dismissNoteDialog, noteDialog is not null, dismiss dialog first....");
        this.ag.b(this.co);
        this.ag = null;
        this.co = null;
        LogUtil.b("Login_MainActivity", "dismissNoteDialog, login once to check if 40....");
        MainInteractors mainInteractors = this.ce;
        if (mainInteractors != null) {
            mainInteractors.z();
        }
    }

    private void at() {
        if (this.bq) {
            this.as.sendEmptyMessage(8);
            this.as.sendEmptyMessageDelayed(9, 2000L);
            Message messageObtainMessage = this.as.obtainMessage();
            messageObtainMessage.what = 6300;
            messageObtainMessage.obj = false;
            this.as.sendMessageDelayed(messageObtainMessage, 5000L);
            this.as.sendEmptyMessageDelayed(6500, 10000L);
            this.bq = false;
            return;
        }
        LogUtil.e("Login_MainActivity", "firstEntryOperation is other condition");
    }

    private void al() {
        if (this.ae == null) {
            LogUtil.e("Login_MainActivity", "directConnectLogin mDirectConnectDetail is null");
        } else if (LoginInit.getInstance(this.x).isBrowseMode()) {
            LoginInit.getInstance(this.x).browsingToLogin(new IBaseResponseCallback() { // from class: dbz
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    this.e.e(i2, obj);
                }
            }, "");
        }
    }

    public /* synthetic */ void e(int i2, Object obj) {
        LogUtil.e("Login_MainActivity", "directConnectLogin browsingToLogin onResponse errorCode : ", Integer.valueOf(i2));
        if (i2 != 0) {
            this.ae = null;
        }
    }

    private void fn() {
        if (f == null) {
            LogUtil.e("Login_MainActivity", "toCheckScanLogin sSchemeQrCodeUri is null");
        } else if (LoginInit.getInstance(this.x).isBrowseMode()) {
            LoginInit.getInstance(this.x).browsingToLogin(new IBaseResponseCallback() { // from class: dbq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i2, Object obj) {
                    MainActivity.b(i2, obj);
                }
            }, "");
        }
    }

    public static /* synthetic */ void b(int i2, Object obj) {
        LogUtil.e("Login_MainActivity", "toCheckScanLogin onResponse errorCode : ", Integer.valueOf(i2));
        if (i2 != 0) {
            f = null;
        }
    }

    private void b(boolean z) {
        HealthViewPager healthViewPager;
        String str = this.ab;
        if (str == null || z) {
            return;
        }
        LogUtil.b("Login_MainActivity", "intellLifeHandover mCurrentFragmentName = ", str);
        if (!Constants.HOME_TAB_DEVICE.equals(this.ab) || (healthViewPager = this.dq) == null) {
            return;
        }
        healthViewPager.setCurrentItem(3, false);
        this.dl.setItemChecked(this.dq.getCurrentItem());
    }

    private boolean cb() {
        if (Utils.o()) {
            return !OperationUtils.isOperation(LoginInit.getInstance(this.x).getAccountInfo(1010));
        }
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        LogUtil.b("Login_MainActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        super.onPause();
        this.bp = false;
        OperationAdInteractor operationAdInteractor = this.r;
        if (operationAdInteractor != null) {
            operationAdInteractor.j();
        }
        dcq dcqVar = this.av;
        if (dcqVar != null) {
            dcqVar.a(-1);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        LogUtil.b("Login_MainActivity", "onStop");
        super.onStop();
        if (!com.huawei.haf.application.BaseApplication.h()) {
            LogUtil.b("Login_MainActivity", "MainActivity_isForeground_stop");
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "health_click_home", Integer.toString(1), new StorageParams());
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "health_show_smartcard", "true", new StorageParams());
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "health_bi_opera", "1", new StorageParams());
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "health_report_click_home", Integer.toString(1), new StorageParams());
        }
        Handler handler = this.as;
        if (handler != null) {
            handler.removeMessages(16);
        }
    }

    @Override // android.app.Activity
    protected void onRestart() {
        super.onRestart();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void onTrimMemory(int i2, boolean z) {
        super.onTrimMemory(i2, z);
        if (!AuthorizationUtils.c(this.x)) {
            ReleaseLogUtil.d("Login_MainActivity", "onTrimMemory hasAuth false");
            return;
        }
        Glide.get(this).trimMemory(i2);
        if (i2 == 20) {
            Glide.get(this).clearMemory();
        }
    }

    private void s() {
        LogUtil.b("Login_MainActivity", "enter checkAuthRelogin:");
    }

    private void q() {
        if (CommonUtil.z(this.x)) {
            ThirdPartyLoginManager.getInstance().queryUserInfo(new IBaseResponseCallback() { // from class: com.huawei.health.MainActivity.29
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i2, Object obj) {
                    LogUtil.b("Login_MainActivity", "checkIsInstallHmsApk queryUserInfo errorCode = ", Integer.valueOf(i2));
                }
            }, false);
            return;
        }
        MainInteractors mainInteractors = this.ce;
        if (mainInteractors != null) {
            mainInteractors.s();
        }
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10015), "key_ui_login_exit_hms_apk");
        LogUtil.b("Login_MainActivity", "accountmigrate: checkIsInstallHmsApk() isDownLoadHmsApk = ", strE);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.e("Login_MainActivity", "checkIsInstallHmsApk() isDownLoadHmsApk is empty");
            return;
        }
        if ("1".equals(strE)) {
            if (AccountInteractors.isInstallHwIdApk(this.x)) {
                LogUtil.b("Login_MainActivity", "accountmigrate: checkIsInstallHmsApk() isDownLoadHmsApk = 1,install HWIdAPK");
                this.as.sendEmptyMessage(5016);
                return;
            } else {
                LogUtil.b("Login_MainActivity", "accountmigrate: checkIsInstallHmsApk() isDownLoadHmsApk = 1,not install HWIdAPK");
                this.as.sendEmptyMessage(FitnessStatusCodes.UNSUPPORTED_ACCOUNT);
                return;
            }
        }
        if ("2".equals(strE)) {
            if (AccountInteractors.isInstallHwIdApk(this.x)) {
                LogUtil.b("Login_MainActivity", "accountmigrate: checkIsInstallHmsApk() isDownLoadHmsApk = 2, install HWIdAPK");
                this.as.sendEmptyMessage(5017);
                return;
            } else {
                LogUtil.b("Login_MainActivity", "accountmigrate: checkIsInstallHmsApk() isDownLoadHmsApk = 2,not install HWIdAPK");
                this.as.sendEmptyMessage(FitnessStatusCodes.DISABLED_BLUETOOTH);
                return;
            }
        }
        LogUtil.e("Login_MainActivity", "accountmigrate: checkIsInstallHmsApk() is other condition");
    }

    private void bn() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SharedPreferenceManager.e(this.x, Integer.toString(10000), "hw_health_start_count_key", String.valueOf(((long) CommonUtil.j(SharedPreferenceManager.e(this.x, Integer.toString(10000), "hw_health_start_count_key"))) + 1), null);
        bt();
        bp();
        ReleaseLogUtil.c("Login_MainActivity", "initOtherLoginedData finished");
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        ffv.o();
        ReleaseLogUtil.c("Login_MainActivity", "initHealthModel finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime2));
        DeviceConfigInit.create();
        vhb.b().c();
        qrs.a();
        ReleaseLogUtil.c("Login_MainActivity", "initLoginedData finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        WheelChairStateManager.a().c();
        ThreadPoolManager.c().execute(new Runnable() { // from class: dca
            @Override // java.lang.Runnable
            public final void run() {
                TaskPlatformMgr.d().e();
            }
        });
        ThreadPoolManager.c().execute(new Runnable() { // from class: dbw
            @Override // java.lang.Runnable
            public final void run() {
                this.f31601c.bc();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bc() {
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        if (Utils.h()) {
            if (this.bb == null) {
                int iA = new PackageManagerHelper(this.x).a(CommonUtil.x());
                LogUtil.b("Login_MainActivity", "connectHuaweiApiClient hms versionCode : ", Integer.valueOf(iA));
                if (iA >= 30000000) {
                    messageCenterApi.initHms();
                }
            }
            LogUtil.b("Login_MainActivity", "getPushToken");
        }
    }

    private void fa() {
        if (CommonUtil.bx()) {
            LogUtil.b("Login_MainActivity", "initLoginedData, isRooted phone");
            this.dy.g(this.x);
        }
    }

    private void bp() {
        if (this.bk) {
            return;
        }
        this.bk = !LoginInit.getInstance(this.x).isBrowseMode();
        ExecutorService executorService = this.aj;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: dbo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31595b.j();
                }
            });
        }
        this.ab = null;
    }

    public /* synthetic */ void j() {
        an();
        Handler handler = this.as;
        MainInteractors mainInteractors = this.ce;
        if (handler == null || mainInteractors == null) {
            return;
        }
        if (!this.bs) {
            ex();
        }
        this.dy.d(this.as);
        if (!Utils.m() || OperationUtils.isOperation(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1010))) {
            e(handler);
            SharedPreferenceManager.e(this.x, Integer.toString(10009), "health_is_first_in", "health_is_first_in", new StorageParams());
        }
        handler.sendEmptyMessage(11);
        c(handler);
    }

    private void c(Handler handler) {
        if (this.cn != 0) {
            ReleaseLogUtil.d("Login_MainActivity", "not homeTab not to showAssociationDialog");
            return;
        }
        ReleaseLogUtil.c("Login_MainActivity", "check showAssociationDialog or not");
        if (njy.e(SportEventAssociator.b(HwExerciseConstants.MATCHED_COMPETITION))) {
            return;
        }
        ReleaseLogUtil.c("Login_MainActivity", "send showAssociationDialog msg");
        handler.sendEmptyMessage(6227);
    }

    private void e(Handler handler) {
        if (this.dz == null) {
            this.dz = new WeiXinInteractor(this.x);
        }
        boolean zD = this.dz.d();
        LogUtil.b("Login_MainActivity", "initLoginedData queryIsShowBindDialog : ", Boolean.valueOf(zD));
        if (zD) {
            handler.sendEmptyMessage(204);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ex() {
        LogUtil.b("Login_MainActivity", "enter showPermissionDialog mIsOnResume = ", Boolean.valueOf(this.bp));
        if (this.dj != 3) {
            try {
                if (this.bp) {
                    this.ce.d();
                }
            } catch (Exception unused) {
                LogUtil.b("Login_MainActivity", "initOtherLoginedData mainInteractors addPermissions exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ef() {
        synchronized (f6128b) {
            if (Utils.o() && (!Utils.o() || (Utils.h() && !OperationUtils.switchToMarketingTwo()))) {
                LogUtil.b("Login_MainActivity", "showAdvDialog mIsShowedAd = ", Boolean.valueOf(this.cb));
                if (this.cb) {
                    return;
                }
                if (!VersionControlUtil.isSupportOperationAccount()) {
                    LogUtil.b("Login_MainActivity", "showAdvDialog isKidAccount");
                    return;
                }
                if ("true".equals(SharedPreferenceManager.e(this.x, Integer.toString(10000), "sync_cloud_data_show_process_flag"))) {
                    LogUtil.b("Login_MainActivity", "showAdvDialog progress dialog is showing");
                    return;
                }
                String strE = SharedPreferenceManager.e(this.x, Integer.toString(10009), "health_is_first_in");
                LogUtil.b("Login_MainActivity", "showAdvDialog isFirstIn = ", strE);
                if ("health_is_first_in".equals(strE)) {
                    this.cb = true;
                }
                ExecutorService executorService = this.aj;
                if (executorService != null) {
                    executorService.execute(new Runnable() { // from class: com.huawei.health.MainActivity.30
                        @Override // java.lang.Runnable
                        public void run() {
                            MainActivity.this.fc();
                        }
                    });
                    return;
                }
                return;
            }
            LogUtil.b("Login_MainActivity", "showAdvDialog not oversea or isNoCloudVersion or switchToMarketingTwo");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fc() {
        if (this.dz == null) {
            this.dz = new WeiXinInteractor(this.x);
        }
        boolean zD = this.dz.d();
        LogUtil.b("Login_MainActivity", "showAdvDialog queryIsShowBindDialog : ", Boolean.valueOf(zD));
        if (!zD || OperationUtils.isOperation(LoginInit.getInstance(this.x).getAccountInfo(1010))) {
            cd();
        }
    }

    private void cd() {
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10009), "health_is_first_in");
        LogUtil.b("Login_MainActivity", "judgeShowAdvDialog isFirstIn = ", strE);
        if ("health_is_first_in".equals(strE)) {
            LogUtil.b("Login_MainActivity", "judgeShowAdvDialog getHomeDialogMessage after wechat");
            OperationAdInteractor operationAdInteractor = this.r;
            if (operationAdInteractor != null) {
                operationAdInteractor.a(this.as);
                synchronized (f6128b) {
                    this.cb = true;
                }
                return;
            }
            LogUtil.b("Login_MainActivity", "judgeShowAdvDialog adInteactor is null");
        }
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        try {
            super.onRestoreInstanceState(bundle);
        } catch (Exception e2) {
            ReleaseLogUtil.b("Login_MainActivity", "onRestoreInstanceState with exception", LogAnonymous.b(e2));
        }
    }

    private void bt() {
        ReleaseLogUtil.c("Login_MainActivity", "initViewFrame");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        unl.c(false);
        this.dy.e(this.as);
        dcf.c(this);
        new iqa().a(this.x);
        if (Utils.h()) {
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (eam.a()) {
                eam.d().b();
            }
            ReleaseLogUtil.c("Login_MainActivity", "UpdateDeviceControl finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime2));
            wjs.f(this.x, this.as);
        }
        be();
        this.dq.setVisibility(0);
        this.dl.setVisibility(0);
        boolean zAe = ae();
        m820do();
        a(cb(), zAe);
        a(8);
        if (this.bs) {
            ReleaseLogUtil.c("Login_MainActivity", "initViewFrame loadGuideView");
            dg();
        } else {
            bw();
            ev();
            qkz.e(fwx.f34658b);
            ReleaseLogUtil.c("Login_MainActivity", "initViewFrame finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void dg() {
        if (this.bc.getUserVisibleHint()) {
            if (this.cg == null) {
                ViewStub viewStub = (ViewStub) findViewById(R.id.viewstub_mainui_update_guide);
                if (viewStub == null) {
                    return;
                }
                View viewInflate = viewStub.inflate();
                if (!(viewInflate instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) viewInflate;
                this.cg = viewGroup;
                HomeFragment homeFragment = this.bc;
                if (homeFragment != null) {
                    homeFragment.b(viewGroup);
                }
            }
            ire.b(this.cg, this.dl.getChildCount(), this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bw() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ei();
        bl();
        if (this.dq.getOffscreenPageLimit() <= 1) {
            this.dq.setOffscreenPageLimit(1);
        }
        if (!cb()) {
            ej();
        }
        cf();
        ee();
        ea();
        if (CommonUtil.ap()) {
            this.ce.w();
        }
        boolean zAe = ae();
        HealthViewPager healthViewPager = this.dq;
        if (healthViewPager != null && zAe) {
            healthViewPager.setCurrentItem(1, false);
            this.dl.setItemChecked(this.dq.getCurrentItem());
        }
        this.di = "";
        if (!this.cb && this.bg) {
            c();
        }
        fa();
        ReleaseLogUtil.c("Login_MainActivity", "initViewsAferGuideViewHide finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void c(Bundle bundle, boolean z, boolean z2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.bc == null) {
            HomeFragment homeFragment = new HomeFragment();
            this.bc = homeFragment;
            boolean z3 = !z2;
            homeFragment.a(z3);
            this.bc.setArguments(bundle);
            this.bc.c(z3);
            fu();
            this.al.add(this.bc);
        }
        Utils.o();
        if (this.f0do == null && !SportSupportUtil.g()) {
            SportEntranceFragment sportEntranceFragment = new SportEntranceFragment();
            this.f0do = sportEntranceFragment;
            sportEntranceFragment.a(this.ak);
            this.al.add(this.f0do);
            fy();
        }
        if (!z && this.af == null) {
            DiscoverFragment discoverFragment = new DiscoverFragment(this.dl);
            this.af = discoverFragment;
            discoverFragment.setArguments(bundle);
            this.al.add(this.af);
        }
        if (this.ac == null && !EnvironmentInfo.m()) {
            if (qst.c()) {
                this.ac = new NewDeviceFragment(this, this.dl);
            } else {
                this.ac = new DeviceFragment(this, this.dl);
            }
            this.al.add(this.ac);
        }
        if (this.cu == null) {
            PersonalCenterFragment personalCenterFragment = new PersonalCenterFragment(this.dl);
            this.cu = personalCenterFragment;
            personalCenterFragment.setArguments(bundle);
            this.al.add(this.cu);
        }
        LogUtil.b("Login_MainActivity", "initFragments finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void a(boolean z, boolean z2) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iS = qrs.s(this.x);
        Window window = getWindow();
        if (window != null) {
            ReleaseLogUtil.c("Login_MainActivity", "initViewPager, statusBarColor is : ", Integer.valueOf(window.getStatusBarColor()), " statusBarHeight is : ", Integer.valueOf(iS));
        }
        AppBundle.e().loadResources(this);
        LogUtil.b("Login_MainActivity", "initViewPager loadResources time cost：", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        Bundle bundle = new Bundle();
        bundle.putInt("statusBarHeight", iS);
        bundle.putBoolean(BundleTransferdDataContants.IS_SHOW_GUIDE, this.bs);
        bundle.putString("pairGuideSelectAddress", this.cp);
        ReleaseLogUtil.c("Login_MainActivity", "start to load some fragments");
        int size = this.al.size();
        c(bundle, z, z2);
        if (this.av == null) {
            this.av = new dcq(getSupportFragmentManager(), this.al);
            this.dq.setOffscreenPageLimit(1);
            this.dq.setAdapter(this.av);
            this.dq.addOnPageChangeListener(new HwViewPager.OnPageChangeListener() { // from class: com.huawei.health.MainActivity.28
                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageScrollStateChanged(int i2) {
                }

                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageScrolled(int i2, float f2, int i3) {
                }

                @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
                public void onPageSelected(int i2) {
                    ReleaseLogUtil.c("Login_MainActivity", "main page been selected: " + i2);
                    MainActivity.this.d(i2);
                    MainActivity.this.av.a(i2);
                }
            });
            e(z);
        } else if (this.al.size() != size) {
            ReleaseLogUtil.d("Login_MainActivity", "view pager size changed, before: ", Integer.valueOf(size), ", now we have: ", Integer.valueOf(this.al.size()));
            this.av.a(this.al);
        }
        LogUtil.b("Login_MainActivity", "initViewPager finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i2) {
        ViewGroup viewGroup = this.cg;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || i2 == 0) {
            return;
        }
        this.cg.setVisibility(8);
        ObserverManagerUtil.e("MAIN_GUIDE_VIEW_COMPLETED", new Object[0]);
    }

    private void ei() {
        this.dl.setBottomNavListener(new HwBottomNavigationView.BottomNavListener() { // from class: com.huawei.health.MainActivity.26
            @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavListener
            public void onBottomNavItemReselected(MenuItem menuItem, int i2) {
            }

            @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavListener
            public void onBottomNavItemSelected(MenuItem menuItem, int i2) {
                ReleaseLogUtil.c("Login_MainActivity", "main tab been selected:" + ((Object) menuItem.getTitle()));
                MainActivity.this.cn = i2;
                if (!MainActivity.this.aw) {
                    MainActivity.this.f(i2);
                }
                if (i2 == MainActivity.this.ai && MainActivity.this.bt) {
                    qsp.c(MainActivity.this.cj, MainActivity.this.n);
                }
                if (i2 == 1) {
                    MainActivity.this.ec();
                } else {
                    MainActivity.this.dq.setCurrentItem(i2, false);
                }
                MainActivity.this.b(i2);
            }

            @Override // com.huawei.uikit.hwbottomnavigationview.widget.HwBottomNavigationView.BottomNavListener
            public void onBottomNavItemUnselected(MenuItem menuItem, int i2) {
                ReleaseLogUtil.c("Login_MainActivity", "main tab been unselected:" + ((Object) menuItem.getTitle()));
            }
        });
        Window window = getWindow();
        if (window == null) {
            ReleaseLogUtil.d("Login_MainActivity", "setTabsListener window is null");
            return;
        }
        if (this.bd == null) {
            ReleaseLogUtil.c("Login_MainActivity", "setTabsListener mInnerAccessibilityNodeInfoCallback is null");
            this.bd = new b(this);
        }
        lrd.d(window.getDecorView(), this.bd);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class b implements AccessibilityNodeInfoCallback {
        private final WeakReference<MainActivity> d;

        b(MainActivity mainActivity) {
            this.d = new WeakReference<>(mainActivity);
        }

        @Override // com.huawei.hwcommonmodel.accessibility.AccessibilityNodeInfoCallback
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            MainActivity mainActivity = this.d.get();
            if (mainActivity != null && !mainActivity.isDestroyed() && !mainActivity.isFinishing() && accessibilityNodeInfoCompat != null) {
                int iD = mainActivity.d(Constants.HOME_TAB_DEVICE);
                int iD2 = mainActivity.d("ME");
                LogUtil.b("Login_MainActivity", "InnerAccessibilityNodeInfoCallback onInitializeAccessibilityNodeInfo indexOfDevice ", Integer.valueOf(iD), " indexOfMe ", Integer.valueOf(iD2), " activity.mNowBottomItemIndex ", Integer.valueOf(mainActivity.cn));
                if (mainActivity.cn != iD) {
                    if (mainActivity.cn == iD2) {
                        lrd.a(accessibilityNodeInfoCompat, mainActivity.findViewById(R.id.personal_scroll));
                    }
                } else {
                    lrd.a(accessibilityNodeInfoCompat, mainActivity.findViewById(R.id.device_health_scrollview));
                }
                lrd.a(accessibilityNodeInfoCompat, mainActivity.findViewById(R.id.hw_main_tabs_layout));
                return;
            }
            LogUtil.e("Login_MainActivity", "InnerAccessibilityNodeInfoCallback onInitializeAccessibilityNodeInfo activity ", mainActivity, " infoCompat ", accessibilityNodeInfoCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i2) {
        if (this.dq.getCurrentItem() >= 2 || i2 >= 2) {
            ReleaseLogUtil.c("Login_MainActivity", "click too fast, processing lazyLoadAllFragment");
            dd();
        } else if (i2 == 0) {
            ReleaseLogUtil.c("Login_MainActivity", "from sport to health,should forceLoad health");
            this.bc.tryToLoad(true);
        }
    }

    private void bl() {
        if (TextUtils.isEmpty(this.di)) {
            if (this.bh) {
                bm();
                return;
            } else {
                if (this.bj) {
                    return;
                }
                LogUtil.b("Login_MainActivity", "handleShortcutsData, set selected item to HomeFragment");
                this.dq.setCurrentItem(0, false);
                this.dl.setItemChecked(this.dq.getCurrentItem());
                return;
            }
        }
        x();
    }

    private void ej() {
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10009), "health_is_first_in_home");
        boolean zIsFinishing = isFinishing();
        LogUtil.c("Login_MainActivity", "setFirstInSpValue isFirstInHome = ", strE, "isFinishing = ", Boolean.valueOf(zIsFinishing));
        if ("health_is_first_in_home".equals(strE) || zIsFinishing) {
            return;
        }
        SharedPreferenceManager.e(this.x, Integer.toString(10009), "health_is_first_in_home", "health_is_first_in_home", new StorageParams());
    }

    private void cf() {
        boolean zO = Utils.o();
        h(zO);
        j(zO);
        el();
        wud.d((WeakReference<Context>) new WeakReference(this.x));
        ipl.d(zO, this.bf, this.as);
    }

    private void el() {
        if (au() <= System.currentTimeMillis()) {
            LogUtil.b("Login_MainActivity", "showEfficientRest rest is over");
            return;
        }
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10000), "sp_key_briefs_is_resting");
        try {
            if (TextUtils.isEmpty(strE) || !Boolean.parseBoolean(strE)) {
                return;
            }
            AppRouter.c("/PluginSleepBriefs/EfficientRestActivity").b(this.x);
        } catch (NumberFormatException e2) {
            LogUtil.d("Login_MainActivity", "showEfficientRest exception : ", e2.getMessage());
        }
    }

    private long au() {
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10000), "sp_key_briefs_over_time");
        if (TextUtils.isEmpty(strE)) {
            return 0L;
        }
        return CommonUtils.i(strE);
    }

    private void ee() {
        if (!Utils.i()) {
            this.as.removeMessages(4024);
            this.as.sendEmptyMessageDelayed(4024, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
        }
        Handler handler = this.as;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(MainLoginCallBack.MSG_HMS_VERSION_ERROR, 1000L);
            this.as.sendEmptyMessageDelayed(8002, 900L);
            this.as.sendEmptyMessageDelayed(8001, 1000L);
            this.as.sendEmptyMessageDelayed(16, 5000L);
        }
    }

    private void ea() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.q.o() != 0) {
            long j2 = this.cm;
            if (j2 != 0) {
                long j3 = jCurrentTimeMillis - j2;
                if (j3 <= 8000) {
                    this.ce.d(j3);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        r0 = health.compact.a.SharedPreferenceManager.e(r5.x, java.lang.Integer.toString(20002), "EXIT_APP_AT_SPORT_TAB");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean ae() {
        String strE;
        if (!jaq.e() && TextUtils.isEmpty(this.di) && strE != null) {
            try {
                if (!strE.isEmpty() && Boolean.parseBoolean(strE)) {
                    return jaa.h() || izt.d(this.x) || !Utils.o();
                }
            } catch (NumberFormatException e2) {
                LogUtil.b("Login_MainActivity", "numberFormatException, src: " + strE + ", error: " + e2.getMessage());
            }
        }
        return false;
    }

    private void bm() {
        if ("DISCOVER".equals(this.f6129a) && this.dq != null) {
            c("DISCOVER");
        } else {
            if (!"SPORT".equals(this.f6129a) || this.dq == null) {
                return;
            }
            c("SPORT");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bb  */
    private void x() {
        byte b2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.dq == null || this.dl == null) {
            LogUtil.e("Login_MainActivity", "checkJumpFragmentAndActivity, mViewPager == null || tabs == null");
            return;
        }
        if (!jaq.e()) {
            pvb.b(this.x, this.di);
            String str = this.di;
            str.hashCode();
            switch (str) {
                case "SC_KAKA":
                    b2 = 0;
                    break;
                case "SC_MALL":
                    b2 = 1;
                    break;
                case "SC_EXERCISE":
                    b2 = 2;
                    break;
                case "SC_FA_CARD_MAIN":
                    b2 = 3;
                    break;
                case "SC_FA_CARD_EXERCISE":
                    b2 = 4;
                    break;
                case "SC_DEVICE":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                xjo.e(this.x);
            } else if (b2 == 1) {
                xjo.a(this.x);
            } else if (b2 == 2) {
                if (!SportSupportUtil.g()) {
                    this.dl.setItemChecked(1);
                    y();
                } else {
                    this.dl.setItemChecked(0);
                }
            } else if (b2 == 3) {
                this.dl.setItemChecked(0);
            } else if (b2 != 4) {
                if (b2 == 5) {
                    if (cb()) {
                        this.dq.setCurrentItem(2, false);
                    } else {
                        this.dq.setCurrentItem(3, false);
                    }
                    this.dl.setItemChecked(this.dq.getCurrentItem());
                } else {
                    LogUtil.e("Login_MainActivity", "checkJumpFragmentAndActivity, Shortcuts id is not support!");
                }
            } else if (!SportSupportUtil.g()) {
                this.dl.setItemChecked(1);
                y();
            } else {
                this.dl.setItemChecked(0);
            }
        }
        LogUtil.b("Login_MainActivity", "checkJumpFragmentAndActivity finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void y() {
        if (qrs.ah(this.x)) {
            Bundle bundle = new Bundle();
            bundle.putString("SKIP_ALL_COURSE_KEY", "");
            AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).b(this.x);
            overridePendingTransition(R.anim.activity_no_animation, android.R.anim.fade_out);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ec() {
        this.bm = true;
        if (Utils.o()) {
            u();
            izg.d(this.x);
        } else {
            izg.e(this.x);
            w();
        }
        ObserverManagerUtil.e("RUN_PLAN_UPDATE_HELLO_TIME", "");
    }

    private void u() {
        if (!CommonUtil.bg() || (jaa.h() && !izt.d(this.x))) {
            qqu.c(this.x, 2);
            bo();
            es();
            bh();
            return;
        }
        if (!jaa.h() && izt.d(this.x)) {
            qqu.c(this.x, 3);
            if (!jaa.j(this.x)) {
                bo();
                et();
            }
            bh();
            return;
        }
        if (!jaa.h() && !izt.d(this.x)) {
            qqu.c(this.x, -1);
            er();
            return;
        }
        qqu.b(this.x);
        if (qqu.b()) {
            if (jaa.i(this.x)) {
                fd();
                return;
            }
            if (bz()) {
                bo();
                this.v.show();
                bh();
                return;
            } else {
                if (by()) {
                    bo();
                    this.u.show();
                    bh();
                    return;
                }
                bh();
                return;
            }
        }
        if (qqu.c()) {
            if (jaa.h(this.x)) {
                fd();
                return;
            } else {
                bh();
                return;
            }
        }
        LogUtil.b("Login_MainActivity", "checkOverseaMapType, auto map type");
        bh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void es() {
        if (bz() || bx()) {
            this.v.show();
        } else if (by()) {
            this.u.show();
        } else {
            LogUtil.b("Login_MainActivity", "showNotSupportGoogleDialog, No Dialog show");
        }
    }

    private void er() {
        bh();
        if (SportSupportUtil.g()) {
            return;
        }
        new NoTitleCustomAlertDialog.Builder(this.x).a(this.x.getString(R.string.IDS_hwh_motiontrack_map_type_area_remind_auto)).c(R.string.IDS_kn_lost_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).c().show();
    }

    public void c() {
        if (Utils.o() && !Utils.h()) {
            LogUtil.b("Login_MainActivity", "checkSyncStatus isNoCloudVersion");
            return;
        }
        MainInteractors mainInteractors = this.ce;
        if (mainInteractors != null && mainInteractors.n()) {
            LogUtil.b("Login_MainActivity", "checkSyncStatus and showAdvDialog");
            ef();
        } else {
            HiHealthManager.d(this.x).checkDataStatus(HiSyncType.d(), new c(this));
        }
    }

    private boolean bz() {
        return !ecs.h(this.x) && qqu.a(this.x) && jcg.c(this.x);
    }

    private boolean bx() {
        return qqu.c(this.x) == 1 && jcg.c(this.x) && qqu.a(this.x) && !ecs.h(this.x);
    }

    private boolean by() {
        return qqu.c(this.x) == 1 || (!Utils.o() && qqu.c(this.x) == 0 && ecs.h(this.x));
    }

    private boolean e(Uri uri) {
        if (uri == null) {
            return false;
        }
        LogUtil.b("Login_MainActivity", "FromWatchFaceShare uri is ", uri);
        return uri.toString().contains("com.huawei.health.h5.watchface") && TitleBean.RIGHT_BTN_TYPE_SHARE.equals(uri.getQueryParameter(WebViewHelp.BI_KEY_PULL_FROM));
    }

    private void e(boolean z) {
        NavigationHelper navigationHelper;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.dl.a();
        b(R.string.IDS_hw_show_main_home_page_health, R.drawable.main_health_drawable);
        if (!z) {
            if (!SportSupportUtil.g()) {
                b(R.string.IDS_hw_show_main_home_page_sport, LanguageUtil.ba(this.x) ? R.drawable.main_featured_drawable_mirror : R.drawable.main_featured_drawable);
                this.ai = 2;
            } else {
                this.ai = 1;
            }
            this.af.a(this.ai);
            ez();
        } else {
            this.ai = -1;
            if (!SportSupportUtil.g()) {
                b(R.string.IDS_hw_show_main_home_page_sport, LanguageUtil.ba(this.x) ? R.drawable.main_featured_drawable_mirror : R.drawable.main_featured_drawable);
            }
        }
        if (!EnvironmentInfo.m()) {
            b(R.string.IDS_device_title_use, R.drawable.main_device_drawable);
        }
        b(R.string.IDS_hw_show_main_home_page_mine, R.drawable.main_me_drawable);
        PersonalCenterFragment personalCenterFragment = this.cu;
        if (personalCenterFragment != null) {
            personalCenterFragment.e(this.dl);
        }
        this.dl.setItemChecked(this.dq.getCurrentItem());
        if (this.af != null && (navigationHelper = this.cl) != null) {
            navigationHelper.c(this.dl);
        }
        LogUtil.b("Login_MainActivity", "initTabsMenus finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void ez() {
        boolean zD = isa.d();
        this.bt = zD;
        LogUtil.b("Login_MainActivity", "showVipOrDiscover mIsShowVipPage is :", Boolean.valueOf(zD));
        if (this.bt) {
            boolean zI = irz.i();
            LogUtil.b("Login_MainActivity", "showVipOrDiscover vipUser is :", Boolean.valueOf(zI));
            if (zI) {
                LogUtil.b("Login_MainActivity", "showVipOrDiscover 1 :");
                b(R.string.IDS_vip, R.drawable.ic_bottomtab_1_xxxhdpi);
            } else {
                LogUtil.b("Login_MainActivity", "showVipOrDiscover 2 :");
                b(R.string.IDS_vip, R.drawable.main_member_drawable);
            }
            if (this.cj == null) {
                this.cj = aw();
            }
            en();
            return;
        }
        b(R.string.IDS_hw_show_main_home_page_discover, R.drawable.main_discover_drawable);
    }

    private void en() {
        if (TextUtils.isEmpty(SharedPreferenceManager.e(this.x, Integer.toString(10000), "show_member_tab"))) {
            this.dl.e(this.ai, true);
        } else {
            this.dl.e(this.ai, false);
        }
    }

    private void b(int i2, int i3) {
        this.dl.a(i2, getResources().getDrawable(i3), false);
    }

    private void h(boolean z) {
        if (z) {
            LogUtil.b("Login_MainActivity", "showRecommentDialog is Oversea version");
        } else {
            b("show_personalized_recomment", SharedPreferenceManager.e(this.x, Integer.toString(10000), "show_personalized_recomment"));
        }
    }

    private void b(String str, String str2) {
        str.hashCode();
        if (str.equals("show_personalized_recomment")) {
            if (TextUtils.isEmpty(str2)) {
                Context context = this.x;
                String string = Integer.toString(10000);
                long jCurrentTimeMillis = System.currentTimeMillis();
                SharedPreferenceManager.e(context, string, "show_personalized_recomment", String.valueOf(jCurrentTimeMillis), new StorageParams());
                return;
            }
            String string2 = this.x.getString(R.string.IDS_open_analysis_name);
            String string3 = this.x.getString(R.string.IDS_open_personalized_recommendation_tips_cn);
            if (Utils.o()) {
                string2 = this.x.getString(R.string.IDS_smartcard_product_recommendations);
                string3 = this.x.getString(R.string.IDS_open_personalized_recommendation_tips);
            }
            c(str2, string3, "show_personalized_recomment", "personalized_recommend", string2);
        }
    }

    private void c(String str, String str2, String str3, String str4, String str5) {
        long j2;
        try {
            j2 = Long.parseLong(str);
        } catch (Exception unused) {
            LogUtil.d("Login_MainActivity", "recommentDialogShow parseLong Exception");
            j2 = 0;
        }
        if (j2 != 0) {
            float fCurrentTimeMillis = (System.currentTimeMillis() - j2) / 60000.0f;
            LogUtil.b("Login_MainActivity", "recommentDialogShow minutes = ", Float.valueOf(fCurrentTimeMillis));
            if (fCurrentTimeMillis < 10080.0f) {
                return;
            }
            String strE = SharedPreferenceManager.e(this.x, Integer.toString(10000), str4);
            ioi ioiVarD = ioi.d();
            if ("1".equals(strE)) {
                return;
            }
            if ("personalized_recommend".equals(str4) && TextUtils.isEmpty(strE)) {
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = e(ioiVarD, str2, str5, str4).b();
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
            SharedPreferenceManager.e(this.x, Integer.toString(10000), str3, String.valueOf(0), new StorageParams());
        }
    }

    private CustomTextAlertDialog.Builder e(final ioi ioiVar, String str, String str2, final String str3) {
        return new CustomTextAlertDialog.Builder(this).e(str2).a(str).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.c(ioiVar, str3, true, "1");
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.c(ioiVar, str3, false, "0");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ioi ioiVar, String str, boolean z, String str2) {
        if ("health_product_recommend".equals(str)) {
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "health_product_recommend", str2, new StorageParams());
            ioiVar.e(10, z, String.valueOf(10), null);
        } else if ("personalized_recommend".equals(str)) {
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "personalized_recommend", str2, new StorageParams());
            ioiVar.e(12, z, String.valueOf(12), null);
        } else {
            LogUtil.e("Login_MainActivity", "saveRecommendSwitchStatus is other condition");
        }
    }

    private void j(boolean z) {
        long j2;
        if (!z) {
            LogUtil.b("Login_MainActivity", "showOverseaOperationDialog Is Chinese version");
            return;
        }
        if (!Utils.h()) {
            LogUtil.b("Login_MainActivity", "showOverseaOperationDialog Not allowed to login version");
            return;
        }
        if (!VersionControlUtil.isSupportOperationAccount()) {
            LogUtil.b("Login_MainActivity", "showOverseaOperationDialog Is isKidAccount version");
            return;
        }
        if (!OperationUtils.isOperation(LoginInit.getInstance(this.x).getAccountInfo(1010))) {
            LogUtil.b("Login_MainActivity", "showOverseaOperationDialog isOperation is false");
            return;
        }
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10000), "show_oversea");
        if (TextUtils.isEmpty(strE)) {
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "show_oversea", String.valueOf(System.currentTimeMillis()), new StorageParams());
            return;
        }
        try {
            j2 = Long.parseLong(strE);
        } catch (NumberFormatException unused) {
            LogUtil.d("Login_MainActivity", "showOverseaOperationDialog NumberFormatException");
            j2 = 0;
        }
        if (j2 != 0) {
            float fCurrentTimeMillis = (System.currentTimeMillis() - j2) / 60000.0f;
            LogUtil.b("Login_MainActivity", "showOverseaOperationDialog minutes = ", Float.valueOf(fCurrentTimeMillis));
            if (fCurrentTimeMillis >= 10080.0f && !com.huawei.health.messagecenter.model.CommonUtil.isSystemBarNoticeSwitchOnOrDefault(this.x)) {
                l().show();
                SharedPreferenceManager.e(this.x, Integer.toString(10000), "show_oversea", String.valueOf(0), new StorageParams());
            }
        }
    }

    private CustomTextAlertDialog l() {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this).a(R.string.IDS_hw_me_settings_message_noticebar).a(this.x.getString(R.string.IDS_hwh_agreement_ove_msg)).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.huawei.health.messagecenter.model.CommonUtil.setPushSwitch(MainActivity.this.x, true);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.huawei.health.messagecenter.model.CommonUtil.setPushSwitch(MainActivity.this.x, false);
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        return customTextAlertDialogB;
    }

    @Override // com.huawei.hwcommonmodel.application.RunningForegroundListener
    public void goForegroundTime(long j2) {
        this.aq = j2;
        this.s += j2 - this.am;
    }

    @Override // com.huawei.hwcommonmodel.application.RunningForegroundListener
    public void goBackgroundTime(long j2) {
        this.ck += j2 - this.aq;
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static class j extends BaseHandler<MainActivity> {
        public j(Looper looper, MainActivity mainActivity) {
            super(looper, mainActivity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(MainActivity mainActivity, Message message) throws Throwable {
            if (mainActivity == null || message == null) {
                ReleaseLogUtil.d("Login_MainActivity", "MainActivityHandler handleMessageWhenReferenceNotNull obj or msg is null.");
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            ReleaseLogUtil.c("Login_MainActivity", "MainActivityHandler receive msg:" + message.what);
            mainActivity.b(mainActivity, message);
            ReleaseLogUtil.c("Login_MainActivity", "MainActivityHandler msg:" + message.what + " finished, time cost:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
        }
    }

    private void d(Message message) {
        switch (message.what) {
            case 6500:
                if (LogConfig.b() && !Utils.o()) {
                    lfm.b().e("");
                    break;
                }
                break;
            case MainActivityHandlerMsg.ON_AGREEMENT_GRANTED /* 20230625 */:
                k();
                break;
            case MainActivityHandlerMsg.CHECK_BETA_AGREEMENTS_UPDATE /* 20231122 */:
                wjs.c(BaseApplication.getContext(), this.as);
                break;
            case 20231123:
                dcb.c(this, this.as);
                break;
            case 20241105:
                GolfUpdateMapInteractor.d(this, message);
                break;
            case 20251106:
                c((Context) this, message);
                break;
            case MainActivityHandlerMsg.ON_ACCOUNT_CHANGE_BROADCAST /* 2023060703 */:
                e(message.obj);
                break;
        }
    }

    private void d(MainActivity mainActivity, Message message) {
        switch (message.what) {
            case 16:
                dd();
                break;
            case 17:
                ohf.e().c(this.x, this.ah);
                this.ah = null;
                break;
            case 19:
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                ThreadPoolManager.c().execute(new Runnable() { // from class: dbx
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.b(countDownLatch);
                    }
                });
                try {
                    ReleaseLogUtil.c("Login_MainActivity", "DeviceConfigInit create isOnTime:", Boolean.valueOf(countDownLatch.await(2000L, TimeUnit.MILLISECONDS)));
                } catch (InterruptedException unused) {
                    LogUtil.d("Login_MainActivity", "DeviceConfigInit create catch InterruptedException");
                    return;
                }
                break;
            case 4022:
                if (this.dq.getCurrentItem() == 0 && this.bc != null) {
                    this.ar.e(this.x);
                    break;
                }
                break;
            case 4023:
                this.ar.a(this.x, this.as);
                break;
            case 4024:
                this.ar.e(this.as);
                break;
            case FitnessStatusCodes.INVALID_TIMESTAMP /* 5022 */:
                ar();
                break;
            case MainActivityHandlerMsg.AFTER_LAUNCH_CHECK /* 20230214 */:
                ba();
                break;
            case MainActivityHandlerMsg.REFRESH_START_PAGE /* 20230604 */:
                this.dw.d(message.arg1);
                break;
            case MainActivityHandlerMsg.ON_OPERATION_FEATURE_BROADCAST /* 2023060701 */:
                p();
                break;
            default:
                d(message);
                break;
        }
    }

    public static /* synthetic */ void b(CountDownLatch countDownLatch) {
        DeviceConfigInit.create();
        countDownLatch.countDown();
    }

    private void g(MainActivity mainActivity, Message message) {
        int i2 = message.what;
        if (i2 == 15) {
            SyncCloudUtils.e(4, 10004, 0);
            return;
        }
        if (i2 == 4025) {
            ipl.d(this.x, message.getData());
            return;
        }
        if (i2 == 6300) {
            if (!(message.obj instanceof Boolean)) {
                LogUtil.e("Login_MainActivity", "DFX_START_UPLOAD msg.obj convert fail");
                return;
            } else {
                i(((Boolean) message.obj).booleanValue());
                return;
            }
        }
        if (i2 == 6400) {
            gb();
            return;
        }
        if (i2 == 8005) {
            if (this.bs || (wjs.a() && !wjs.e())) {
                this.z.add(Integer.valueOf(message.what));
                return;
            } else {
                em();
                return;
            }
        }
        if (i2 == 4020) {
            ipl.a(this.x);
            return;
        }
        if (i2 == 4021) {
            ipl.e(this.x);
            return;
        }
        if (i2 == 6007) {
            LogUtil.b("Login_MainActivity", "Enter REQ_TRIGGER_ACCOUNT_LOGIN()");
            this.bj = true;
            fj();
        } else if (i2 == 6008) {
            LogUtil.b("Login_MainActivity", "Enter REQ_TRIGGER_HMS_PUSH_UPDATE_ALERT()");
            an();
        } else if (i2 == 8002) {
            bj();
        } else if (i2 == 8003) {
            br();
        } else {
            d(mainActivity, message);
        }
    }

    private void c(MainActivity mainActivity, Message message) {
        WeiXinInteractor weiXinInteractor;
        int i2 = message.what;
        if (i2 == 204) {
            if (((Activity) this.x).isDestroyed() || ((Activity) this.x).isFinishing() || (weiXinInteractor = mainActivity.dz) == null) {
                return;
            }
            weiXinInteractor.c();
            return;
        }
        if (i2 == 300) {
            LogUtil.c("Login_MainActivity", "get message MSG_DISMISS_ADS");
            mainActivity.r.c();
            return;
        }
        if (i2 == 4013) {
            mainActivity.ce.b(this.x.getString(R.string.IDS_hw_wechat_rank_show_common_title), this.x.getString(R.string.IDS_hwh_home_other_login_no_history_data), this.x.getString(R.string.IDS_common_notification_know_tips).toUpperCase(), 0);
            return;
        }
        if (i2 == 4017) {
            mainActivity.ce.g();
            return;
        }
        if (i2 == 5020) {
            mainActivity.dy.u();
            return;
        }
        if (i2 == 6001) {
            LogUtil.b("Login_MainActivity", "get message MSG_GET_HW_USERINFO_SUCCESS");
            mainActivity.dy.z();
            return;
        }
        if (i2 == 6006) {
            this.ce.x();
            return;
        }
        if (i2 == 6010) {
            this.dy.f(this.as);
            return;
        }
        if (i2 == 6014) {
            ReleaseLogUtil.c("Login_MainActivity", "get message SERVICE_DEREGISTERED_ALERT");
            mainActivity.dy.ab();
        } else if (i2 == 6227) {
            this.dy.v();
        } else {
            g(mainActivity, message);
        }
    }

    private void e(MainActivity mainActivity, Message message) {
        int i2 = message.what;
        if (i2 == 4011) {
            mainActivity.ce.b(this.x.getString(R.string.IDS_hw_wechat_rank_show_common_title), this.x.getString(R.string.IDS_hwh_home_other_login_this_version_too_old), this.x.getString(R.string.IDS_common_notification_know_tips).toUpperCase(), 1);
            return;
        }
        if (i2 == 4012) {
            mainActivity.ce.v();
            return;
        }
        if (i2 == 5013) {
            mainActivity.ce.b(1);
            return;
        }
        if (i2 == 5014) {
            mainActivity.ce.b(2);
            return;
        }
        if (i2 == 5016) {
            mainActivity.ce.d(1);
            return;
        }
        if (i2 != 5017) {
            switch (i2) {
                case 4014:
                    mainActivity.dy.b(message.arg1, this.aj);
                    break;
                case 4015:
                    mainActivity.ce.b(this.x.getString(R.string.IDS_hw_wechat_rank_show_common_title), this.x.getString(R.string.IDS_hw_show_no_cloud_account_tips), this.x.getString(R.string.IDS_common_notification_know_tips).toUpperCase(), 0);
                    break;
                case 4016:
                    int appAllowAge = LoginInit.getAppAllowAge();
                    mainActivity.ce.b(this.x.getString(R.string.IDS_hw_wechat_rank_show_common_title), qre.a(R.string.IDS_hw_account_age_not_allow_new, qre.e(R.plurals.IDS_hw_account_age_unit_string, appAllowAge, Integer.valueOf(appAllowAge))), this.x.getString(R.string.IDS_common_notification_know_tips).toUpperCase(), 0);
                    break;
                default:
                    c(mainActivity, message);
                    break;
            }
            return;
        }
        mainActivity.ce.d(2);
    }

    private void h(MainActivity mainActivity, Message message) {
        int i2 = message.what;
        if (i2 == 203) {
            wss.d(this.x).a();
            Context context = this.x;
            Toast.makeText(context, context.getResources().getText(com.huawei.ui.main.R.string.IDS_update_server_bussy), 0).show();
            return;
        }
        if (i2 == 4018) {
            mainActivity.ce.ad();
            return;
        }
        if (i2 == 5019) {
            this.dy.ad();
            return;
        }
        if (i2 != 40091) {
            switch (i2) {
                case 4007:
                    mainActivity.ce.j(0);
                    break;
                case WearableStatusCodes.WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED /* 4008 */:
                    mainActivity.ce.j(1);
                    break;
                case 4009:
                    mainActivity.ce.b(this.x.getString(R.string.IDS_hw_show_other_account_migrate_successful), this.x.getString(R.string.IDS_hwh_home_other_login_data_has_copy_to_now_account), this.x.getString(R.string.IDS_common_notification_know_tips).toUpperCase(), 0);
                    break;
                case 4010:
                    mainActivity.ce.b(this.x.getString(R.string.IDS_hw_wechat_rank_show_common_title), this.x.getString(R.string.IDS_hw_show_account_migrate_tips_new), this.x.getString(R.string.IDS_common_notification_know_tips).toUpperCase(), 0);
                    break;
                default:
                    e(mainActivity, message);
                    break;
            }
            return;
        }
        Context context2 = this.x;
        Toast.makeText(context2, context2.getResources().getText(com.huawei.ui.main.R.string.IDS_hw_show_other_account_migrate_failed), 0).show();
    }

    private void a(MainActivity mainActivity, Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            ak(mainActivity);
            return;
        }
        if (i2 == 2) {
            LogUtil.c("Login_MainActivity", "handle_checkDataStatus_and_show_dialog");
            al(mainActivity);
            return;
        }
        if (i2 == 3) {
            mainActivity.ce.e((Intent) message.obj);
            return;
        }
        if (i2 == 6) {
            LogUtil.b("Login_MainActivity", "accountmigrate: MSG_DATA_SYNC_AFTER_MIGRAGE");
            mainActivity.dy.f();
            return;
        }
        if (i2 == 7) {
            mainActivity.ce.i();
            this.dl.setVisibility(8);
            this.dq.setVisibility(8);
            return;
        }
        if (i2 != 202) {
            switch (i2) {
                case 10088:
                    b(mainActivity, true);
                    break;
                case 10089:
                    ah(mainActivity);
                    break;
                case 10090:
                    LogUtil.b("Login_MainActivity", "get message MSG_SHOW_PRIVACY_UPDATE_DIALOG");
                    a(message);
                    break;
                case 10091:
                    this.bv = true;
                    eu();
                    break;
                case 10092:
                    this.be = true;
                    eu();
                    break;
                default:
                    h(mainActivity, message);
                    break;
            }
            return;
        }
        wss.d(this.x).a();
        Context context = this.x;
        Toast.makeText(context, context.getResources().getText(com.huawei.ui.main.R.string.IDS_confirm_network_whether_connected), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MainActivity mainActivity, Message message) throws Throwable {
        int i2 = message.what;
        if (i2 == 4) {
            ep();
            return;
        }
        if (i2 == 14) {
            LogUtil.b("Login_MainActivity", "get message MSG_CHECK_NEW_VERSION_OR_RESOURCE");
            this.ce.b(true);
            return;
        }
        if (i2 == 4019) {
            eo();
            return;
        }
        if (i2 == 5021) {
            eq();
            return;
        }
        switch (i2) {
            case 8:
                LogUtil.b("Login_MainActivity", "get message MSG_START_APP_FIRST_STEP");
                bk();
                break;
            case 9:
                LogUtil.b("Login_MainActivity", "get message MSG_START_APP_SECOND_STEP");
                bi();
                break;
            case 10:
                LogUtil.b("Login_MainActivity", "get message MSG_JUMP_TO_DEEPLINK_TARGET");
                f(getIntent());
                break;
            case 11:
                LogUtil.b("Login_MainActivity", "get message MSG_CHECK_LANGUAGE_UPDATE_STATUS");
                this.ce.h();
                break;
            case 12:
                LogUtil.b("Login_MainActivity", "get message MSG_NEED_START_MAINACTIVITY");
                dz();
                break;
            default:
                switch (i2) {
                    case Constants.ON_PAGE_STARTED /* 10085 */:
                        LogUtil.b("Login_MainActivity", "get message MSG_SHOW_PRIVACY_BETA_USER_DLG");
                        d(this.x);
                        break;
                    case 10086:
                        LogUtil.b("Login_MainActivity", "get message MSG_SHOW_PRIVACY_DLG");
                        ey();
                        break;
                    case Constants.FILE_CHOOSER_RESULT_CODE_FOR_ANDROID_5 /* 10087 */:
                        LogUtil.b("Login_MainActivity", "get message MSG_SHOW_PRIVACY_DIALOG");
                        aj(mainActivity);
                        break;
                    default:
                        a(mainActivity, message);
                        break;
                }
                break;
        }
    }

    private void eu() {
        if (this.bv && this.be && !ino.f37871b) {
            this.bv = false;
            this.be = false;
            HomeOverseaPrivacyDialog.e(this.x);
            LogUtil.b("Login_MainActivity", "showPrivacyDialog");
        }
    }

    private List<View> b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                arrayList.add(childAt);
                arrayList.addAll(b(childAt));
            }
        }
        return arrayList;
    }

    private void dd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.aw) {
            LogUtil.d("Login_MainActivity", "all fragments have been loaded");
            return;
        }
        this.aw = true;
        HealthViewPager healthViewPager = this.dq;
        if (healthViewPager != null) {
            healthViewPager.setOffscreenPageLimit(4);
            LogUtil.b("Login_MainActivity", "load other three fragment finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
            return;
        }
        LogUtil.d("Login_MainActivity", "load all fragment failed, mViewPager is null");
    }

    private void br() {
        MainInteractors mainInteractors = this.ce;
        if (mainInteractors != null) {
            mainInteractors.r();
            this.ce.o();
            this.ce.l();
            this.ce.m();
        }
    }

    private void bj() {
        MainInteractors mainInteractors = this.ce;
        if (mainInteractors != null) {
            mainInteractors.k();
        }
    }

    private void fj() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: dbr
            @Override // java.lang.Runnable
            public final void run() {
                this.e.i();
            }
        });
    }

    public /* synthetic */ void i() {
        this.ce.d(true);
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str) || this.dl == null) {
            return;
        }
        int iD = d(str);
        if (iD >= 0) {
            this.dl.setItemChecked(iD);
        } else {
            LogUtil.e("Login_MainActivity", str, " tab name not exist.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d(String str) {
        ArrayList<Fragment> arrayList;
        byte b2;
        if (TextUtils.isEmpty(str) || (arrayList = this.al) == null || arrayList.isEmpty()) {
            return -1;
        }
        str.hashCode();
        switch (str) {
            case "ME":
                b2 = 0;
                break;
            case "HOME":
                b2 = 1;
                break;
            case "SPORT":
                b2 = 2;
                break;
            case "DISCOVER":
                b2 = 3;
                break;
            case "DEVICE":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return this.al.indexOf(this.cu);
        }
        if (b2 == 1) {
            return this.al.indexOf(this.bc);
        }
        if (b2 == 2) {
            return this.al.indexOf(this.f0do);
        }
        if (b2 == 3) {
            return this.al.indexOf(this.af);
        }
        if (b2 != 4) {
            return -1;
        }
        return this.al.indexOf(this.ac);
    }

    private void ak(MainActivity mainActivity) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.bn = Boolean.parseBoolean(SharedPreferenceManager.e(this.x, String.valueOf(20000), "needLogin"));
        mainActivity.bn();
        f(getIntent());
        cp();
        ce();
        cm();
        cu();
        cw();
        ct();
        cg();
        cx();
        cz();
        cv();
        bd();
        dc();
        de();
        cj();
        cn();
        ag();
        cl();
        db();
        cy();
        ci();
        co();
        cs();
        cr();
        cc();
        gyt.d(this.as);
        this.ce.c(System.currentTimeMillis() - this.q.o());
        this.q.c(0L);
        dp();
        ReleaseLogUtil.c("Login_MainActivity", "jumpToTargetPage finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void aq() {
        LogUtil.e("Login_MainActivity", "enter downloadPlugin");
        this.as.removeMessages(17);
        this.as.removeMessages(19);
        this.as.sendEmptyMessageDelayed(19, 4000L);
        if (TextUtils.isEmpty(this.ah)) {
            LogUtil.e("Login_MainActivity", "downloadPlugin mDownloadPluginModuleName is empty");
        } else {
            this.as.sendEmptyMessageDelayed(17, 5000L);
        }
    }

    private void ah(MainActivity mainActivity) {
        String string = this.x.getString(R.string.IDS_personal_data_by_protected_cannot_cloned);
        if (qrs.ah(this.x)) {
            string = this.x.getString(R.string.IDS_hw_old_pad_cloned_notice);
        }
        mainActivity.ce.b(true, string);
    }

    private void a(Message message) {
        Bundle data = message.getData();
        if (data != null) {
            e(data.getString("agrUrl"), data.getString("token"));
        }
    }

    private void aj(MainActivity mainActivity) throws Throwable {
        ReleaseLogUtil.c("Login_MainActivity", "showPrivacyDialog");
        this.au = true;
        mainActivity.e(8);
        if (fns.d()) {
            f(false);
        } else {
            eg();
        }
    }

    private void ey() throws Throwable {
        if (this.au) {
            ReleaseLogUtil.c("Login_MainActivity", "showPrivacyDlg mHasPrivacyShowed true");
        } else if (fns.d()) {
            f(true);
        } else {
            eg();
        }
    }

    private void ew() throws Throwable {
        LogUtil.b("Login_MainActivity", "showPrivacyWindowChangeDialog enter");
        if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(20000), "hw_health_last_login_site_id"))) {
            LogUtil.b("Login_MainActivity", "do not need show privacy dialog");
        } else if (fns.d()) {
            f(false);
        } else {
            eg();
        }
    }

    private void ep() {
        if (!LoginInit.getInstance(this.x).getIsLogined()) {
            this.ce.b(this.x.getString(R.string.IDS_hw_app_name), this.x.getString(R.string.IDS_hw_health_no_network_remind), this.x.getString(R.string.IDS_settings_button_ok).toUpperCase(), 1);
        }
        this.ce.j();
    }

    private void ar() {
        LogUtil.b("Login_MainActivity", "doAbTestAction");
        if (this.dq == null || this.dl == null) {
            LogUtil.e("Login_MainActivity", "doAbTestAction mViewPager || tabs is null");
            return;
        }
        String strB = gyt.b();
        if ("[A]".equals(strB)) {
            this.dq.setCurrentItem(1, false);
            this.dl.setItemChecked(this.dq.getCurrentItem());
        } else if ("[B]".equals(strB)) {
            this.dq.setCurrentItem(2, false);
            this.dl.setItemChecked(this.dq.getCurrentItem());
        } else {
            LogUtil.b("Login_MainActivity", "doAbTestAction strategy C do nothing");
        }
    }

    private void gb() {
        LogUtil.b("Login_MainActivity", "get message BINDING_DEVICE_UPLOAD_TO_ODMF");
        String strE = SharedPreferenceManager.e(this.x, Integer.toString(10000), "SAVE_BIND_TO_ODMF");
        LogUtil.b("Login_MainActivity", "uploadBindingDevices mSaveBindToOdmfFlag = ", strE);
        if ("".equals(strE)) {
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "SAVE_BIND_TO_ODMF", "TRUE", null);
            ed();
            this.du.saveThirtyDaysTrackDataToOdmf(this.x);
        }
    }

    private void em() {
        if (MainInteractorsUtils.f10361a) {
            ReleaseLogUtil.d("Login_MainActivity", "showDataSyncDialog is true.");
        } else {
            ino.b(this.x);
        }
    }

    private void i(boolean z) {
        LogUtil.b("Login_MainActivity", "uploadTodayLog, Enter check dfx isClicked = ", Boolean.valueOf(z));
        if (!AuthorizationUtils.c(this.x) && !z) {
            LogUtil.e("Login_MainActivity", "uploadTodayLog, not authorized privacy");
            return;
        }
        if (CommonUtil.ap()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: dbm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f31593b.o();
                }
            });
        }
        Utils.o();
        LogUtil.b("Login_MainActivity", "uploadTodayLog, notifyHistoryRecord when goto mianActivity.");
        ExecutorService executorService = this.aj;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.aj.execute(new Runnable() { // from class: com.huawei.health.MainActivity.6
            @Override // java.lang.Runnable
            public void run() {
                mgu.a();
                mal.a(MainActivity.this.x);
            }
        });
    }

    public /* synthetic */ void o() {
        ltr.b().init(this.x);
        if (Utils.o()) {
            ltr.b().setProductType(20);
        } else {
            ltr.b().setProductType(1);
        }
    }

    private void cl() {
        if (this.cz == -1 || !AuthorizationUtils.c(this.x)) {
            return;
        }
        am();
    }

    private void db() {
        Intent intent = getIntent();
        Context context = this.x;
        if (context == null || intent == null || this.dh == null || !AuthorizationUtils.c(context)) {
            return;
        }
        Uri uri = Uri.parse(intent.getStringExtra("walletUri"));
        if (mih.e()) {
            if (!ComponentInfo.PluginPay_A_119.equals(this.dh)) {
                ReleaseLogUtil.d("Login_MainActivity", "jumpToWalletMarket not TARTET_WALLET_ACTIVITY mSchemeWalletMarket: ", this.dh);
                finish();
                return;
            }
            ddy.e().initHealthPayAdapter(this);
            Intent intent2 = new Intent();
            intent2.putExtra("activityCode", uri.getQueryParameter("activityCode"));
            intent2.setClassName(BaseApplication.getContext().getPackageName(), this.dh);
            LogUtil.b("Login_MainActivity", "jumpToWalletMarket go to ", this.dh);
            try {
                ddy.e().launchActivity(this, intent2);
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Login_MainActivity", "jumpToWalletMarket is activityNotFoundException.");
            }
            finish();
            return;
        }
        Intent intent3 = new Intent();
        intent3.setPackage(BaseApplication.getContext().getPackageName());
        intent3.setClassName(BaseApplication.getContext().getPackageName(), "com.huawei.health.MainActivity");
        intent3.setFlags(67108864);
        intent3.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        int i2 = com.huawei.ui.commonui.R.string.IDS_device_pair_connect_detail;
        DeviceInfo deviceInfoC = mgg.c("Login_MainActivity");
        if (deviceInfoC != null && deviceInfoC.getDeviceConnectState() == 2) {
            i2 = com.huawei.ui.commonui.R.string.IDS_qrcode_no_support_device_title;
        }
        LogUtil.b("Login_MainActivity", "jumpToWalletMarket go to DeviceMainActivity");
        Toast.makeText(getApplicationContext(), i2, 1).show();
        try {
            startActivity(intent3);
        } catch (ActivityNotFoundException unused2) {
            LogUtil.e("Login_MainActivity", "jumpToMainActivity is activityNotFoundException.");
        }
        finish();
    }

    private void b(MainActivity mainActivity, boolean z) {
        String string = this.x.getString(R.string.IDS_personal_data_synchronized_cloud_need_setting);
        if (qrs.ah(this.x)) {
            string = this.x.getString(R.string.IDS_hw_old_pad_cloned_setting);
        }
        mainActivity.ce.b(z, string);
    }

    private void de() {
        Intent intent = getIntent();
        Context context = this.x;
        if (context == null || intent == null || this.df == null || !AuthorizationUtils.c(context)) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToSleepDetail mSchemeSleepDetail = ", this.df);
        Intent intent2 = new Intent(this.x, (Class<?>) KnitSleepDetailActivity.class);
        long longExtra = intent.getLongExtra("startTime", 0L);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        String stringExtra = intent.getStringExtra("jumpFromFileSyncNotify");
        intent2.putExtra("startTime", longExtra);
        intent2.putExtra("endTime", longExtra2);
        intent2.putExtra("jumpFromFileSyncNotify", stringExtra);
        startActivity(intent2);
        overridePendingTransition(0, 0);
    }

    private void cn() {
        Intent intent = getIntent();
        Context context = this.x;
        if (context == null || intent == null || this.cy == null || !AuthorizationUtils.c(context)) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToHealthDataDetail mSchemeHealthDataDetail = ", this.cy);
        HealthDataDetailActivity.d(this.x, intent.getStringExtra("extra_service_id"), intent.getIntExtra("extra_page_type", 0), intent.getLongExtra("extra_time_stamp", 0L));
    }

    private void cc() {
        if (this.bn || this.t == null || LoginInit.getInstance(this.x).isBrowseMode() || !AuthorizationUtils.c(this.x)) {
            LogUtil.e("Login_MainActivity", "jumpToActiveTarget return");
        } else {
            ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).gotoH5ActiveTarget(this);
            this.t = null;
        }
    }

    private void cq() {
        Intent intent = getIntent();
        Context context = this.x;
        if (context == null || intent == null || this.ch == null || !AuthorizationUtils.c(context)) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToMedalDetail mMedalDetail = ", this.ch);
        Intent intent2 = new Intent();
        intent2.setClass(this.x, AchieveMedalNewActivity.class);
        startActivity(intent2);
        this.ch = null;
    }

    private void co() {
        if (this.bn || this.ci == null || LoginInit.getInstance(this.x).isBrowseMode() || !AuthorizationUtils.c(this.x)) {
            LogUtil.e("Login_MainActivity", "jumpToMemberDetail return");
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToMemberDetail mMemberDetail = ", this.ci);
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath(this.ci);
        ddv.b().loadH5ProApp(this, "com.huawei.health.h5.vip", builder);
        this.ci = null;
    }

    private void cs() {
        if (this.bn || this.cs == null || LoginInit.getInstance(this.x).isBrowseMode() || !AuthorizationUtils.c(this.x)) {
            LogUtil.e("Login_MainActivity", "jumpToOrderDetail return");
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToOrderDetail mOrderCode = ", this.cs);
        Bundle bundle = new Bundle();
        bundle.putString("orderCode", this.cs);
        if (!Utils.o() && fua.n()) {
            iov.b(this.x, ArkUIXConstants.ORDER_DETAIL, "23", this.cs);
        } else {
            AppRouter.c("/TradeService/TradeOrderDetailActivity").d(bundle).b(BaseApplication.getContext());
        }
        this.cs = null;
    }

    private void cr() {
        if (this.bn || !PayPalPaymentIntent.ORDER.equals(this.an) || LoginInit.getInstance(this.x).isBrowseMode() || !AuthorizationUtils.c(this.x)) {
            LogUtil.e("Login_MainActivity", "jumpToOrderList return");
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToOrderList mFrom = ", this.an);
        AppRouter.c("/TradeService/TradeOrderListActivity").b(BaseApplication.getContext());
        this.an = null;
    }

    private void cj() {
        Intent intent = getIntent();
        if (fua.d(this.x)) {
            Context context = this.x;
            if (context == null || intent == null || this.da == null || !AuthorizationUtils.c(context)) {
                return;
            }
            LogUtil.b("Login_MainActivity", "jumpToEcgDetail mSchemeEcgDetail is ", this.df);
            String stringExtra = intent.getStringExtra("ecgDetail");
            if (fua.h()) {
                Intent intent2 = new Intent();
                intent2.setClassName(this.x.getPackageName(), ArkUIXConstants.ENTRY_ABILITY_ACTIVITY);
                IntentParams intentParamsBuild = IntentParams.builder().addBiFrom("Today_0001", "healthTrends".equals(stringExtra) ? "healthTrend_entry" : "", "").addPageId(ArkUIXConstants.HEART_RATE).addPageType("0").build();
                com.huawei.hwlogsmodel.LogUtil.a("Login_MainActivity", "params.toString()", intentParamsBuild.toString());
                intent2.putExtra(com.alipay.sdk.m.s.e.n, intentParamsBuild.toString());
                intent2.putExtra(ArkUIXConstants.ARKUIX_MODULE_TYPE_KEY, 2);
                iov.c(this.x, intent2);
                return;
            }
            Intent intent3 = new Intent(this.x, (Class<?>) HeartRateDetailActivity.class);
            intent3.putExtra("ecgDetail", stringExtra);
            startActivity(intent3);
            return;
        }
        Intent intent4 = new Intent(this.x, (Class<?>) KnitHeartRateActivity.class);
        long longExtra = intent.getLongExtra("startTime", 0L);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        String stringExtra2 = intent.getStringExtra("jumpFromFileSyncNotify");
        intent4.putExtra("startTime", longExtra);
        intent4.putExtra("endTime", longExtra2);
        intent4.putExtra("jumpFromFileSyncNotify", stringExtra2);
        startActivity(intent4);
    }

    private void dc() {
        if (this.dc == null || !AuthorizationUtils.c(this.x) || getIntent() == null) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToTrackDetail mSchemeTrackDetail is ", this.dc);
        String stringExtra = getIntent().getStringExtra("entrance");
        Intent intent = new Intent(this, (Class<?>) SportHistoryActivity.class);
        intent.putExtra("entrance", stringExtra);
        startActivity(intent);
        LogUtil.b("Login_MainActivity", "jumpToTrackDetail start SportHistoryActivity");
        this.dc = null;
    }

    private void cv() {
        if (!sub.a(this.x) || this.de == null) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToQrCodeSchemePage jump to QrCodeSchemeActivity not first time");
        if (!Utils.o() || QrCodeSchemeActivity.c(this.de)) {
            Intent intent = new Intent(this.x, (Class<?>) QrCodeSchemeActivity.class);
            intent.putExtra("schemeQrCode", this.de);
            Intent intent2 = getIntent();
            if (intent2 != null) {
                intent.putExtra("src", intent2.getStringExtra("src"));
            }
            startActivity(intent);
            this.de = null;
        }
    }

    private void bd() {
        if (tpb.e()) {
            ck();
        }
    }

    private void ck() {
        if (this.ae != null) {
            LogUtil.b("Login_MainActivity", "Enter jumpToDeviceConnectPage.");
            Intent intent = new Intent();
            intent.setClassName(this.x, "com.huawei.ui.homewear21.home.DirectConnectDeviceActivity");
            startActivity(intent);
            this.ae = null;
        }
    }

    private void cz() {
        if (j == null || !AuthorizationUtils.c(this.x) || Utils.o()) {
            return;
        }
        ch();
    }

    private void ch() {
        if (this.bn || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToHealthCheckQrCodeActivity jump to group");
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        builder.addPath("#/?joinGroupQr=" + j);
        ddv.b().loadH5ProApp(this.x, "com.huawei.health.h5.groups", builder);
        j = null;
    }

    private void cx() {
        if ((this.bn && LoginInit.getInstance(this.x).isBrowseMode()) || this.db == null || !AuthorizationUtils.c(this.x) || Utils.o()) {
            return;
        }
        if ("aar".equals(this.ds)) {
            LogUtil.b("Login_MainActivity", "jumpToSchemeUrlPage, jump to aar webview activity.");
            tqp.b(this.x, this.db);
        } else {
            PluginOperation.getInstance(this).startOperationWebPage(this.db);
        }
        this.db = null;
    }

    private void cy() {
        if (this.bn || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToSchemeBasic jump to HealthSchemeUtil before type", Integer.valueOf(this.at));
        iqc.c(this, this.at, this.dt);
        this.at = -1;
    }

    private void ci() {
        if (this.bn || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        ipl.d(this, getIntent());
        ipl.b(this, getIntent());
    }

    private void cp() {
        if (this.bn || i == null || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToKaKaByScheme jump to kaka");
        Intent intent = new Intent();
        intent.setClassName(this.x, "com.huawei.health.browseraction.HwSchemeKakaActivity");
        intent.setData(i);
        startActivity(intent);
        i = null;
    }

    private void ce() {
        if (this.bn || e == null || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(this.x, "com.huawei.health.browseraction.HwSchemeAchieveActivity");
        intent.setData(e);
        startActivity(intent);
        e = null;
    }

    private void cm() {
        if (this.bn || h == null || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToNfcByScheme jump to NFC");
        Intent intent = new Intent();
        intent.setClassName(this.x, "com.huawei.health.nfcqrcodeaction.NfcAndQrCodeActionActivity");
        intent.setData(h);
        startActivity(intent);
        h = null;
    }

    private void cu() {
        if (this.bn || f == null || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToQrCodeByScheme jump to QrCode");
        Intent intent = new Intent();
        intent.setClassName(this.x, "com.huawei.health.browseraction.HwSchemeQrCodeActivity");
        intent.setData(f);
        startActivity(intent);
        f = null;
    }

    private void cw() {
        if (this.dd == null) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToRouteDetailByScheme jump to trackFile");
        RunningRouteUtils.a(this.x, this.dd);
        this.dd = null;
    }

    private void cg() {
        df();
        cq();
    }

    private void df() {
        Uri uri = this.dv;
        if (uri != null) {
            try {
                int i2 = Integer.parseInt(uri.getQueryParameter("max_report_no"));
                int i3 = Integer.parseInt(this.dv.getQueryParameter("min_report_no"));
                int i4 = Integer.parseInt(this.dv.getQueryParameter("report_stype"));
                LogUtil.c("Login_MainActivity", "jumpToWeekMonthReport handleDetailUri==>max-->", Integer.valueOf(i2), ":min-->", Integer.valueOf(i3), ":reportType-->", Integer.valueOf(i4));
                oru.a(getApplicationContext()).e(this, i3, i2, i4);
            } catch (NumberFormatException e2) {
                LogUtil.d("Login_MainActivity", e2.getMessage());
            }
        }
    }

    private void ct() {
        if (this.dx != null) {
            PluginOperation.getInstance(this).startOperationWebPage(this.dx);
            this.dx = null;
        }
    }

    private void al(MainActivity mainActivity) {
        if (!HealthApplication.b().getSharedPreferences("is_clone", 0).getBoolean("is_clone", false)) {
            mainActivity.ce.ac();
            return;
        }
        String strD = KeyManager.d();
        String accountInfo = LoginInit.getInstance(this.x).getAccountInfo(1011);
        if (TextUtils.isEmpty(strD) || !strD.equals(accountInfo) || mainActivity.dy.t()) {
            KeyManager.a();
            mainActivity.ce.ac();
        } else {
            b(mainActivity, false);
        }
    }

    private void c(Context context, Message message) {
        Bundle data = message.getData();
        if (data == null) {
            LogUtil.b("Login_MainActivity", "showAgreementDialog bundleData == null");
            return;
        }
        String string = data.getString("token");
        String string2 = data.getString("agrUrl");
        ArrayList<Integer> integerArrayList = data.getIntegerArrayList("needSign_agr_list");
        if (njy.e(integerArrayList)) {
            LogUtil.b("Login_MainActivity", "showAgreementDialog resList isEmpty");
            return;
        }
        int[] iArr = new int[2];
        for (int i2 = 0; i2 < integerArrayList.size(); i2++) {
            if (integerArrayList.get(i2).intValue() == 118) {
                iArr[0] = 1;
            }
            if (integerArrayList.get(i2).intValue() == 10009) {
                iArr[1] = 1;
            }
        }
        int i3 = iArr[0] + (iArr[1] * 2);
        LogUtil.b("Login_MainActivity", "handleAgrResData Show Sign Dialog Type is ", Integer.valueOf(i3));
        irl irlVar = new irl(context, string2, i3, string);
        this.p = irlVar;
        irlVar.b();
    }

    private void e(String str, String str2) {
        int i2;
        if ("0".equals(wjs.a(this.x))) {
            LogUtil.b("Login_MainActivity", "showLastDialog Show Sign Dialog lastTime have cancel ");
            try {
                i2 = Integer.parseInt(SharedPreferenceManager.e(this.x, Integer.toString(10000), "agr_cancel_or_agree_type"));
            } catch (NumberFormatException unused) {
                LogUtil.d("Login_MainActivity", "showLastDialog parseLong Exception");
                i2 = 0;
            }
            irl irlVar = new irl(this.x, str, i2, str2);
            this.p = irlVar;
            irlVar.b();
        }
    }

    private void dz() {
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        finish();
        startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ReleaseLogUtil.c("Login_MainActivity", "MainActivity onDestroy ", this, ", mHasInit = ", Boolean.valueOf(this.ap));
        ffv.q();
        ActivityTransitionAnimator.d();
        this.q.c((RunningForegroundListener) null);
        if (!this.ap) {
            super.onDestroy();
            return;
        }
        ao();
        sio.c().n();
        fk();
        ObserverManagerUtil.a("HEALTH_FLOAT_BAR_STATE_CHANGE");
        fw();
        super.onDestroy();
        fr();
        AccountHelper.compareAndSetLogining(true, false);
        if (this.x == null) {
            return;
        }
        HuaweiApiClient huaweiApiClient = this.bb;
        if (huaweiApiClient != null) {
            huaweiApiClient.disconnect();
            this.bb = null;
        }
        d = false;
        this.bf = false;
        if (!this.br) {
            MainInteractorsUtils.a(2, this.ck);
        }
        if (SmartClipManager.b()) {
            lsb.d().e(HandoffService.getTransferNotificationId());
        }
        fai.e(false);
        aj();
    }

    private void aj() {
        gc();
        av();
        this.ce.q();
        ff();
        this.dl.a();
        this.dl.setBottomNavListener(null);
        izt.c();
        ap();
        this.al = null;
        qsk.c();
        qsi.c();
        BaseDialog.clearResource();
        dx();
        dv();
        get.c().b();
        ActiveTargetManager.c().f();
        qst.b();
        WheelChairStateManager.b();
        ft();
        fv();
        fx();
        ax();
    }

    private void ax() {
        if (AuthorizationUtils.c(this.x)) {
            GroupApi groupApi = (GroupApi) Services.b("FeatureGroup", GroupApi.class);
            if (groupApi.isSharing()) {
                groupApi.enableLocationSharing(false, "", "", 0L, "");
            }
        }
    }

    private void gc() {
        WeiXinInteractor weiXinInteractor = this.dz;
        if (weiXinInteractor != null) {
            weiXinInteractor.e();
            this.dz = null;
        }
    }

    private void av() {
        ExecutorService executorService = this.aj;
        if (executorService != null) {
            executorService.shutdown();
            this.aj = null;
        }
    }

    private void dx() {
        View viewB = qjb.c().b();
        if (!(viewB instanceof MiniBottomPlayer)) {
            LogUtil.e("Login_MainActivity", "remove minibar sPlayerMiniBar is null");
            return;
        }
        ((MiniBottomPlayer) viewB).d();
        eyo.d().c();
        LogUtil.b("Login_MainActivity", "removeMinibar");
    }

    private void dv() {
        View viewB = qjb.c().b();
        if (!(viewB instanceof BottomPlayerView)) {
            LogUtil.e("Login_MainActivity", "remove minibar playerMinibar is null");
            return;
        }
        ((BottomPlayerView) viewB).e();
        ViewParent parent = viewB.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(viewB);
            health.compact.a.util.LogUtil.a("Login_MainActivity", "playerMinibar removed from parent successfully.");
        }
        qjb.c().d(false);
        qjb.c().c((View) null);
    }

    private void ao() {
        ObserverManagerUtil.e("EXIT_APP", new Object[0]);
        if (!CommonUtil.f(this, "com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity")) {
            HealthSportingNotificationHelper.c();
        }
        smp smpVarB = smp.b();
        smpVarB.j(-3);
        smpVarB.aa();
        qpx.d();
        fo();
        AiSportVoiceHelper.clearAll();
        AudioControlOperate.INSTANCE.release();
        this.cr.i();
        get.c().r();
        qdm.y();
    }

    private void fr() {
        ObserverManagerUtil.a("REFRESH_HEALTH_HEADLINES_SHOW_STATUS");
        ObserverManagerUtil.a("SHOW_HEALTH_HEADLINES_TIPS");
        ObserverManagerUtil.a("HOME_RECYCLE_VIEW_MOVE");
        ObserverManagerUtil.a("HEALTH_HEADLINES_CARD_REFRESH_UI");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        HomeFragment homeFragment = this.bc;
        if (homeFragment != null) {
            homeFragment.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    private void fk() {
        OperationFeatureReceiver.a();
        gtg.d().h();
        AccountChangeReceiver.e();
        this.dr.a();
        fs();
        DeviceBindReceiver.d();
        fq();
        gsn.d(this);
        fp();
        MultiUsersManager.INSTANCE.unRegUserInfoListener();
        gsz.a(this);
        this.cf.c(BaseApplication.getContext());
        gsx.d(this);
        ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).unRegisterContactChangeObserver();
        sxx sxxVar = this.az;
        if (sxxVar != null) {
            sxxVar.e();
            this.az = null;
        }
    }

    private void ff() {
        Handler handler = this.as;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.x = null;
        qpb.d();
        OperationAdInteractor operationAdInteractor = this.r;
        if (operationAdInteractor != null) {
            operationAdInteractor.a();
            this.r = null;
        }
        Handler handler2 = this.as;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    private void ap() {
        this.co = null;
        this.ag = null;
        this.w = null;
        this.v = null;
        this.u = null;
        this.av = null;
        this.bc = null;
        this.f0do = null;
        this.af = null;
        this.cu = null;
        this.ac = null;
        this.dl = null;
        this.dq = null;
        this.ay = null;
        this.cr = null;
        this.y = null;
        this.cq = null;
        this.cl = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onActivityResult(i2, i3, intent);
        LogUtil.c("Login_MainActivity", "onActivityResult Main_thread1 : ", Thread.currentThread().getName());
        if (i2 == 1000) {
            dk();
        } else if (i2 == 6003) {
            a(i2, i3, jElapsedRealtime);
        } else if (i2 == 6013) {
            d(i2, i3, jElapsedRealtime);
        } else if (i2 == 6004) {
            LogUtil.b("Login_MainActivity", "onActivityResult REQ_SHOW_AREA_SELECT_ALERT, requestCode = ", Integer.valueOf(i2), ",resultCode = ", Integer.valueOf(i3));
            if (i3 != 0) {
                return;
            }
            if (wsp.g()) {
                dcb.d(this, this.as);
            } else {
                this.ce.z();
            }
        } else if (i2 == 5000) {
            fm();
        } else if (i2 == 1) {
            if (intent != null && i3 == 2) {
                qtv.e(intent, this, qtv.c(i3, true, intent.getIntExtra("product_type", -1), false));
            }
        } else if (i2 == 10000) {
            DiscoverFragment discoverFragment = this.af;
            if (discoverFragment != null) {
                discoverFragment.onActivityResult(i2, i3, intent);
            }
        } else {
            SportEntranceFragment sportEntranceFragment = this.f0do;
            if (sportEntranceFragment != null && sportEntranceFragment.d(i2)) {
                this.f0do.onActivityResult(i2, i3, intent);
            } else if (i2 == 7667713) {
                if (intent != null && intent.hasExtra("KEY_SUG_COURSE_IDS_RESULT")) {
                    PluginSuggestion.getInstance().notifyActivityResult(i2, i3, intent);
                }
            } else if (i2 == 608) {
                int currentItem = this.dq.getCurrentItem();
                HomeFragment homeFragment = this.bc;
                if (homeFragment != null && currentItem == 0) {
                    homeFragment.onActivityResult(i2, i3, intent);
                }
                DeviceMainFragment deviceMainFragment = this.ac;
                if (deviceMainFragment != null && currentItem == 3) {
                    deviceMainFragment.onActivityResult(i2, i3, intent);
                }
            } else if (i2 == 10006) {
                int currentItem2 = this.dq.getCurrentItem();
                DeviceMainFragment deviceMainFragment2 = this.ac;
                if (deviceMainFragment2 != null && currentItem2 == 3) {
                    deviceMainFragment2.onActivityResult(i2, i3, intent);
                }
            } else {
                c(i2, i3, jElapsedRealtime);
                this.ce.a(i2);
            }
        }
        LogUtil.b("Login_MainActivity", "onActivityResult finished, requestCode:" + i2 + ", resultCode:" + i3 + ", time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void d(int i2, int i3, long j2) {
        if (i3 == -1) {
            LogUtil.b("Login_MainActivity", "onActivityResult Activity.RESULT_OK == resultCode ");
            this.p.d();
            return;
        }
        this.p.e();
        LogUtil.b("Login_MainActivity", "finish MainActivity in onActivityResult, requestCode:" + i2 + ", resultCode:" + i3 + ", time cost: " + (SystemClock.elapsedRealtime() - j2));
        finish();
    }

    private void a(int i2, int i3, long j2) {
        if (i3 == -1) {
            LogUtil.b("Login_MainActivity", "onActivityResult Activity.RESULT_OK == resultCode ");
            SharedPreferenceManager.e(this.x, Integer.toString(10000), "hw_health_show_grant_pwd", Integer.toString(1), new StorageParams());
            this.ce.j();
            return;
        }
        LogUtil.b("Login_MainActivity", "finish MainActivity in onActivityResult, requestCode:" + i2 + ", resultCode:" + i3 + ", time cost: " + (SystemClock.elapsedRealtime() - j2));
        finish();
    }

    private void c(int i2, int i3, long j2) {
        if (i2 == 101) {
            if (i3 == 102) {
                LogUtil.b("Login_MainActivity", "finish MainActivity in onActivityResult, requestCode:" + i2 + ", resultCode:" + i3 + ", time cost: " + (SystemClock.elapsedRealtime() - j2));
                finish();
            }
            if (i3 == 103) {
                this.ce.y();
            }
        }
    }

    private void dk() {
        HomeFragment homeFragment = this.bc;
        if (homeFragment != null) {
            LogUtil.b("Login_MainActivity", "onActivityResult() logHomeFragmentStatus mHomeFragment.isCardInitialized() = ", Boolean.valueOf(homeFragment.b()));
        } else {
            LogUtil.e("Login_MainActivity", "onActivityResult() logHomeFragmentStatus mHomeFragment is null");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        LogUtil.b("Login_MainActivity", "Activity-onRequestPermissionsResult() PermissionsManager.notifyPermissionsChange()");
        if (iArr != null && strArr != null) {
            ltd.e().e(strArr, iArr);
        }
        cx();
        if (j != null && !Utils.o()) {
            ch();
        }
        da();
        ck();
        if (this.cz != -1) {
            am();
        }
        if (iArr == null) {
            LogUtil.e("Login_MainActivity", "onRequestPermissionsResult grantResults null");
            return;
        }
        this.dy.f();
        if (i2 == 10) {
            if (iArr.length == 0) {
                LogUtil.e("Login_MainActivity", "onRequestPermissionsResult grantResults length 0");
                return;
            }
            LogUtil.b("Login_MainActivity", "getpermission onRequestPermissionsResult back");
            if (iArr[0] == 0) {
                LogUtil.c("Login_MainActivity", "onRequestPermissionsResult The permission is obtained successfully.");
            } else {
                LogUtil.b("Login_MainActivity", "onRequestPermissionsResult getpermission onRequestPermissionsResult rejected");
            }
        }
    }

    private void da() {
        if (this.de == null || LoginInit.getInstance(this.x).isBrowseMode()) {
            return;
        }
        if (!Utils.o() || QrCodeSchemeActivity.c(this.de)) {
            Intent intent = new Intent(this.x, (Class<?>) QrCodeSchemeActivity.class);
            intent.putExtra("schemeQrCode", this.de);
            Intent intent2 = getIntent();
            if (intent2 != null) {
                intent.putExtra("src", intent2.getStringExtra("src"));
            }
            startActivity(intent);
            this.de = null;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.remove("android:support:fragments");
        bundle.remove("android:fragments");
        bundle.remove("androidx.lifecycle.BundlableSavedStateRegistry.key");
    }

    private void am() {
        if (this.cz != -1) {
            if (ca()) {
                LogUtil.e("Login_MainActivity", "dealSchemeActions finish MainAcitivity for cause: is in motino");
                finish();
            } else {
                as();
            }
        }
    }

    private void as() {
        Uri uri = this.cx;
        String query = uri != null ? uri.getQuery() : null;
        int i2 = this.cz;
        if (i2 == 1) {
            if (query == null) {
                az();
            } else {
                c(this.cx);
            }
        } else if (i2 == 2) {
            if (z()) {
                h();
            } else {
                d(this.cx);
            }
        } else {
            LogUtil.e("Login_MainActivity", "distributeSchemeActions mSchemeDataType is other type");
        }
        this.cz = -1;
    }

    private boolean z() {
        Uri uri = this.cx;
        if (uri == null) {
            LogUtil.e("Login_MainActivity", "[checkSchemeParameter] schemeParamUri is null.");
            return true;
        }
        try {
            return "all_fitness".equals(uri.getQueryParameter("skip_type"));
        } catch (IllegalArgumentException e2) {
            LogUtil.d("Login_MainActivity", "checkSchemeParameter IllegalArgumentException : ", e2.getMessage());
            return true;
        } catch (Exception unused) {
            LogUtil.d("Login_MainActivity", "checkSchemeParameter Exception.");
            return true;
        }
    }

    private void az() {
        SportEntranceFragment sportEntranceFragment = this.f0do;
        if (sportEntranceFragment != null && this.dq != null) {
            sportEntranceFragment.c(this, this.bw, this.f6130c, this.cc);
            c("SPORT");
        } else {
            LogUtil.e("Login_MainActivity", "goToSportTrackReady SportEntanceFragment or ViewPager is not initialed");
        }
    }

    private void c(Uri uri) {
        try {
            ive.c().e(0, c(Integer.parseInt(uri.getQueryParameter(BleConstants.SPORT_TYPE))), a(uri.getQueryParameter(WorkoutRecord.Extend.COURSE_TARGET_TYPE)), Float.parseFloat(uri.getQueryParameter(WorkoutRecord.Extend.COURSE_TARGET_VALUE)) / 1000.0f, (ISportDataCallback) null, this.x);
        } catch (NumberFormatException e2) {
            LogUtil.d("Login_MainActivity", "goToSportTrack NumberFormatException : ", e2.getMessage());
        } catch (Exception unused) {
            LogUtil.d("Login_MainActivity", "goToSportTrack Exception");
        }
    }

    private int c(int i2) {
        MotionTrackPretreatmentService motionTrackPretreatmentService = (MotionTrackPretreatmentService) AppRouter.b(MotionTrackPretreatmentService.class);
        if (motionTrackPretreatmentService != null) {
            return motionTrackPretreatmentService.getSportType(i2);
        }
        Integer num = bb().get(Integer.valueOf(i2));
        if (num instanceof Integer) {
            return num.intValue();
        }
        return 0;
    }

    private int a(String str) {
        MotionTrackPretreatmentService motionTrackPretreatmentService = (MotionTrackPretreatmentService) AppRouter.b(MotionTrackPretreatmentService.class);
        if (motionTrackPretreatmentService != null) {
            return motionTrackPretreatmentService.getTargetType(str);
        }
        Integer num = ay().get(str);
        if (num instanceof Integer) {
            return num.intValue();
        }
        return -1;
    }

    private Map<Integer, Integer> bb() {
        LogUtil.e("Login_MainActivity", "getSportTypeMap");
        HashMap map = new HashMap(5);
        map.put(2, 258);
        map.put(1, 257);
        map.put(3, 259);
        return map;
    }

    private void ev() {
        Handler handler;
        Intent intent = getIntent();
        final String stringExtra = intent.getStringExtra("TOAST");
        LogUtil.b("Login_MainActivity", "showOneToast: ", stringExtra);
        if (stringExtra == null || (handler = this.as) == null) {
            return;
        }
        handler.postDelayed(new Runnable() { // from class: dbn
            @Override // java.lang.Runnable
            public final void run() {
                this.f31594c.b(stringExtra);
            }
        }, 500L);
        intent.removeExtra("TOAST");
        setIntent(intent);
    }

    public /* synthetic */ void b(String str) {
        Toast.makeText(this, str, 0).show();
    }

    private Map<String, Integer> ay() {
        LogUtil.e("Login_MainActivity", "getTargetTypeMap");
        HashMap map = new HashMap(5);
        map.put("km", 1);
        map.put(FitRunPlayAudio.OPPORTUNITY_M, 1);
        map.put("s", 0);
        map.put("cal", 2);
        return map;
    }

    public void d(Uri uri) {
        try {
            final String queryParameter = uri.getQueryParameter("id");
            final String queryParameter2 = uri.getQueryParameter("version");
            Services.b("PluginFitnessAdvice", PluginSuggestion.class, this.x, new Consumer() { // from class: dbs
                @Override // com.huawei.framework.servicemgr.Consumer
                public final void accept(Object obj) {
                    this.f31597c.c(queryParameter, queryParameter2, (PluginSuggestion) obj);
                }
            });
        } catch (IllegalArgumentException e2) {
            LogUtil.d("Login_MainActivity", "goFitnessPage IllegalArgumentException : ", e2.getMessage());
        } catch (Exception unused) {
            LogUtil.d("Login_MainActivity", "goFitnessPage Exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void c(String str, String str2, PluginSuggestion pluginSuggestion) {
        pluginSuggestion.getFitWorkout(str, str2, new UiCallback<FitWorkout>() { // from class: com.huawei.health.MainActivity.7
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i2, String str3) {
                LogUtil.b("Login_MainActivity", "goFitnessPage getFitWorkout onFailure : ", Integer.valueOf(i2));
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(FitWorkout fitWorkout) {
                if (fitWorkout == null) {
                    LogUtil.e("Login_MainActivity", "goFitnessPage getFitWorkout onSuccess data is null ");
                } else {
                    LogUtil.b("Login_MainActivity", "goFitnessPage getFitWorkout onSuccess ");
                    MainActivity.this.c(fitWorkout);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(FitWorkout fitWorkout) {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        if (fitWorkout == null) {
            LogUtil.e("Login_MainActivity", "start fitness failed with the null fitWorkout");
        } else {
            idy.a((String) null);
            pea.a(this.x, fitWorkout);
        }
    }

    public void h() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(this.x);
    }

    private void di() {
        if (this.dg == -1 && this.dj == -1 && this.dk == null) {
            return;
        }
        if (ca()) {
            LogUtil.e("Login_MainActivity", "processSkipActivity, finish MainAcitivity for cause: skip is in motino");
            finish();
        } else {
            if (isTaskRoot()) {
                return;
            }
            LogUtil.b("Login_MainActivity", "processSkipActivity, is not TaskRoot, start checkSkipActivity");
            ag();
        }
    }

    private boolean ca() {
        if (ive.c().r()) {
            return true;
        }
        int iD = hcb.a().d();
        LogUtil.b("Login_MainActivity", "isSportOrFitRunning fitState = ", Integer.valueOf(iD));
        return iD == 2 || iD == 5;
    }

    private void ag() {
        if (this.ca) {
            if (isa.d() && !this.cd) {
                irz.d(this.x, "");
            } else {
                if (this.cd) {
                    this.cd = false;
                }
                c("DISCOVER");
            }
        } else if (this.by) {
            az();
        } else if (this.bz) {
            c(Constants.HOME_TAB_DEVICE);
        } else if (this.dg == -1) {
            fg();
        } else {
            fh();
        }
        if (!isTaskRoot() && !this.by && !this.bi && !this.bx && !this.bz && !this.ca && (this.cx == null || this.dt == null)) {
            LogUtil.e("Login_MainActivity", "checkSkipActivity finish MainAcitivity for cause: is task root");
            finish();
        }
        ah();
    }

    private void ah() {
        ReleaseLogUtil.c("Login_MainActivity", "cleanHistoryJumpParams");
        this.ca = false;
        this.cd = false;
        this.by = false;
        this.bz = false;
        this.dg = -1;
        this.bx = false;
        this.bi = false;
    }

    private void fg() {
        int i2 = this.dj;
        if (i2 == 1) {
            fm();
            return;
        }
        if (i2 == 2) {
            fi();
        } else if (i2 == 3) {
            fe();
        } else {
            LogUtil.e("Login_MainActivity", "checkSkipActivity finish mSmartMsgType is other type");
        }
    }

    private void fm() {
        LogUtil.b("Login_MainActivity", "startSportActivity");
        dcf.b(AnalyticsValue.HEALTH_HOME_FROM_NEGATIVE_BUTTON_CLICK_2010053.value(), "1");
        HealthViewPager healthViewPager = this.dq;
        if (healthViewPager != null) {
            healthViewPager.setCurrentItem(1, false);
        }
    }

    private void fi() {
        LogUtil.b("Login_MainActivity", "startFitnessExerciseActivity");
        dcf.b(AnalyticsValue.HEALTH_HOME_FROM_NEGATIVE_BUTTON_CLICK_2010053.value(), "2");
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("SKIP_ALL_COURSE_KEY", "");
        AppRouter.c("/PluginFitnessAdvice/SportAllCourseActivity").d(bundle).d(268435456).b(this.x);
    }

    private void fh() {
        LogUtil.b("Login_MainActivity", "startSmartMsgSkipActivity");
        dcf.b(AnalyticsValue.HEALTH_HOME_FROM_NEGATIVE_SMARTCARD_CLICK_2010054.value(), String.valueOf(this.dj));
        Intent intent = new Intent();
        intent.putExtra("id", this.dg);
        intent.putExtra("msgType", this.dj);
        intent.putExtra("msgContent", this.dk);
        intent.putExtra("from", 1);
        intent.setClass(this, SmartMsgSkipActivity.class);
        startActivity(intent);
    }

    private void dn() {
        HealthBottomView healthBottomView;
        if (getWindow() == null || (healthBottomView = this.dl) == null || healthBottomView.getBackground() == null) {
            LogUtil.e("Login_MainActivity", "refreshNavigationBarColor:getWindow() or tabs or tabs.getBackground() is null");
        } else if (CommonUtil.bg()) {
            getWindow().setNavigationBarColor(((ColorDrawable) this.dl.getBackground().mutate()).getColor());
        }
    }

    private void fe() {
        LogUtil.b("Login_MainActivity", "startPairDeviceActivity");
        int i2 = this.dg;
        int i3 = this.dj;
        LogUtil.b("Login_MainActivity", "mSmartMsgId = ", Integer.valueOf(i2), ", mSmartMsgType = ", Integer.valueOf(i3), ", mSmartMsgContent = ", this.dk, ", mProductName = ", this.ct, ", mDeviceType = ", Integer.valueOf(this.ad));
        Intent intent = new Intent();
        intent.setFlags(268435456);
        if (this.ad == 11) {
            LogUtil.b("Login_MainActivity", "startPairDeviceActivity mDeviceType is r1 ");
            intent.putExtra(TtmlNode.TAG_STYLE, 4);
            intent.putExtra("isFromWearR1", true);
            intent.setClass(this.x, AddDeviceChildActivity.class);
        } else {
            LogUtil.b("Login_MainActivity", "startPairDeviceActivity mDeviceType is not r1 ");
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, this.ad);
            intent.putExtra("dname", this.ct);
            intent.putExtra("isPorc", this.bo);
            intent.putExtra("isFromWear", true);
            intent.setClass(this.x, AddDeviceIntroActivity.class);
        }
        try {
            this.x.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.d("Login_MainActivity", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private void fs() {
        if (Utils.h()) {
            LogUtil.b("Login_MainActivity", "unregisterAchievementBroadcastReceiver enter");
            OnceMovementReceiver onceMovementReceiverI = oru.a(this.x).i();
            if (onceMovementReceiverI != null) {
                LogUtil.b("Login_MainActivity", "unregisteronceMovementReceiver != null");
                LocalBroadcastManager.getInstance().unregisterReceiver(onceMovementReceiverI);
            }
            LanguageResReceiver languageResReceiverL = oru.a(this.x).l();
            if (languageResReceiverL != null) {
                LogUtil.b("Login_MainActivity", "unregisterlanguageResReceiver != null");
                LocalBroadcastManager.getInstance().unregisterReceiver(languageResReceiverL);
            }
        }
    }

    private void p() {
        this.dq.setCurrentItem(2, false);
        this.dl.setItemChecked(2);
    }

    private void eq() {
        ReleaseLogUtil.c("Login_MainActivity", "enter showNoteHwidRunBackDialog:");
        this.ag = null;
        this.co = null;
        HuaweiMobileServiceSetDialog.Builder builder = new HuaweiMobileServiceSetDialog.Builder(this.x);
        this.ag = builder;
        HuaweiMobileServiceSetDialog huaweiMobileServiceSetDialogE = builder.e();
        this.co = huaweiMobileServiceSetDialogE;
        huaweiMobileServiceSetDialogE.show();
    }

    private void ds() {
        this.du.registerCallback(1);
    }

    private void fq() {
        this.du.unRegisterCallback(1);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ReleaseLogUtil.c("Login_MainActivity", "onBackPressed to enter");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.dn >= 2000) {
            if (dcf.d(this)) {
                if (this.bc != null) {
                    qpx.e(this.x, R.string.IDS_hw_show_main_exit_app_tip_2);
                }
            } else {
                qpx.e(this.x, getString(R.string.IDS_hw_show_main_exit_app_tip_1));
            }
            this.dn = jCurrentTimeMillis;
            return;
        }
        LogUtil.b("Login_MainActivity", "onBackPressed finish MainActivity for cause: double click");
        HiHealthNativeApi.a(this.x).synCloudCancel();
        tfk.c(false);
        MainInteractorsUtils.a(1, this.ck);
        this.br = true;
        super.onBackPressed();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        HomeFragment homeFragment;
        ReleaseLogUtil.c("Login_MainActivity", "onWindowFocusChanged : ", Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
        this.bg = z;
        if (z && (homeFragment = this.bc) != null && homeFragment.n) {
            c();
        }
    }

    private void an() {
        if (Utils.h()) {
            LogUtil.b("Login_MainActivity", "connectHuaweiApiClient:");
            HuaweiApiClient huaweiApiClient = this.bb;
            if (huaweiApiClient != null) {
                if (huaweiApiClient.isConnecting() || this.bb.isConnected()) {
                    return;
                }
                this.bb.connect(this);
                return;
            }
            LogUtil.e("Login_MainActivity", "connectHuaweiApiClient mHuaweiApiClient is null.");
            return;
        }
        new jae().c(this.x);
    }

    private void b(Intent intent) {
        Uri uriC = gvd.c(intent);
        this.aa = uriC;
        if (uriC != null) {
            LogUtil.b("Login_MainActivity", "initDeeplinkParams");
        }
    }

    private void f(final Intent intent) {
        final Uri uri = this.aa;
        if (uri == null) {
            return;
        }
        LogUtil.b("Login_MainActivity", "jumpToDeepLinkTarget deepLinkUri is ", uri);
        if (e(uri)) {
            LogUtil.b("Login_MainActivity", "jumpToDeepLinkTarget return for watchfaceShare");
            return;
        }
        if (!LoginInit.getInstance(this.x).isBrowseMode()) {
            this.aa = null;
            gvd.a(this, uri, intent);
            return;
        }
        IBaseResponseCallback browseCallback = LoginInit.getBrowseCallback();
        if (browseCallback != null) {
            LogUtil.e("Login_MainActivity", "jumpToDeepLinkTarget browsingToLogin callback=", browseCallback);
            if (intent == null || intent == getIntent()) {
                return;
            }
            setIntent(intent);
            return;
        }
        this.aa = null;
        LoginInit.getInstance(this.x).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.health.MainActivity.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i2, Object obj) {
                LogUtil.b("Login_MainActivity", "jumpToDeepLinkTarget browsingToLogin onResponse errorCode : ", Integer.valueOf(i2));
                gvd.a(MainActivity.this, uri, intent);
            }
        }, "");
    }

    private void e(Intent intent) {
        if (intent == null) {
            LogUtil.e("Login_MainActivity", "initSportParams intent is null");
            return;
        }
        this.by = intent.getBooleanExtra("isToSportTab", false);
        this.ca = intent.getBooleanExtra("openDiscover", false);
        this.bu = intent.getBooleanExtra("scrollDown", false);
        this.bz = Constants.HOME_TAB_DEVICE.equals(intent.getStringExtra(Constants.HOME_TAB_NAME));
        if (!this.ca) {
            this.ca = "DISCOVER".equals(intent.getStringExtra(Constants.HOME_TAB_NAME));
        }
        if (this.ca) {
            boolean z = true;
            if (!intent.getBooleanExtra("jumpVipTabWithQrCode", false) && intent.getIntExtra("from", 7) != 1 && intent.getIntExtra("from", 7) != 2) {
                z = false;
            }
            this.cd = z;
        }
        this.cc = intent.getIntExtra("mLaunchSource", -1);
        if (!this.by) {
            this.bw = false;
            this.f6130c = 0;
        } else {
            this.bw = intent.getBooleanExtra("isSelected", false);
            this.f6130c = intent.getIntExtra(BleConstants.SPORT_TYPE, 0);
        }
        if (!this.by) {
            boolean zEquals = "SPORT".equals(intent.getStringExtra(Constants.HOME_TAB_NAME));
            this.by = zEquals;
            if (zEquals) {
                this.f6130c = c(intent.getIntExtra(BleConstants.SPORT_TYPE, 0));
                this.cc = 7;
            }
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: dbv
            @Override // java.lang.Runnable
            public final void run() {
                this.f31600a.g();
            }
        });
        LogUtil.b("Login_MainActivity", "initSportParams intent = ", intent);
    }

    public /* synthetic */ void g() {
        if (!this.by && this.cc == 12) {
            MainInteractorsUtils.e(this.x, 1, 1);
        }
        if (this.cc == 12) {
            MainInteractorsUtils.d(this.x, 4, AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value());
        }
        if (this.cc == 13) {
            MainInteractorsUtils.d(this.x, 5, AnalyticsValue.HEALTH_LOGIN_APP_WHITE_2050007.value());
            MainInteractorsUtils.a(this.x);
        }
    }

    private void c(boolean z) {
        try {
            xeq xeqVarC = xeq.c();
            LogUtil.b("Login_MainActivity", "initNavigationBarView hwBlurEngine = ", xeqVarC);
            if (xeqVarC != null) {
                LogUtil.b("Login_MainActivity", "initNavigationBarView isShowHwBlur = ", Boolean.valueOf(xeqVarC.b()));
                d(xeqVarC);
            }
            if (z) {
                qso.d().a((View) this.dl, false);
            }
        } catch (Exception unused) {
            LogUtil.d("Login_MainActivity", "initNavigationBarView Exception");
        }
        dn();
    }

    private void d(xeq xeqVar) {
        if (!xeqVar.b() || this.dl == null) {
            return;
        }
        if (this.ay == null) {
            this.ay = new xeu(this);
        }
        if (CommonUtil.at() && !qrs.z(this.x)) {
            this.ay.a((qrs.ab(this.x) || isInMultiWindowMode()) ? false : true);
        }
        this.dl.setBlurEnable(true);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) throws Throwable {
        super.onMultiWindowModeChanged(z);
        LogUtil.b("Login_MainActivity", "onMultiWindowModeChanged");
        c(true);
        dj();
        iqx iqxVar = this.dw;
        if (iqxVar != null) {
            iqxVar.c();
        }
        if (this.bs) {
            dg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bh() {
        LogUtil.b("Login_MainActivity", "gotoSportTab");
        this.dq.setCurrentItem(1, false);
        SportEntranceFragment sportEntranceFragment = this.f0do;
        if (sportEntranceFragment != null) {
            sportEntranceFragment.c();
        }
        this.bm = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (i2 == 0) {
            lmf.d().c(this.x, AnalyticsValue.HEALTH_HOME_TAB_2010038.value(), map, 0);
            this.dp = System.currentTimeMillis();
        } else if (i2 == 2) {
            String strValue = AnalyticsValue.HEALTH_DISCOVER_FRAGMENT_2020028.value();
            map.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, Integer.valueOf(isa.d() ? 2 : 1));
            lmf.d().c(this.x, strValue, map, 0);
            this.dp = System.currentTimeMillis();
            NavigationHelper navigationHelper = this.cl;
            if (navigationHelper != null && navigationHelper.b()) {
                this.cl.e(2);
            }
        } else if (i2 == 3) {
            lmf.d().c(this.x, AnalyticsValue.HEALTH_DEVICE_TAB_2010100.value(), map, 0);
            this.dp = System.currentTimeMillis();
        } else if (i2 == 4) {
            lmf.d().c(this.x, AnalyticsValue.HEALTH_MINE_TAB_2040001.value(), map, 0);
            this.dp = System.currentTimeMillis();
        } else {
            LogUtil.e("Login_MainActivity", "setBiInfoForTab position is other number");
        }
        int i3 = this.ba;
        if (i2 != i3) {
            long j2 = (this.dp - this.dm) - this.s;
            LogUtil.c("Login_MainActivity", "setBiInfoForTab mInitPosition = ", Integer.valueOf(i3), "--stayTime---", Long.valueOf(j2));
            this.s = 0L;
            HashMap map2 = new HashMap();
            map2.put(com.huawei.health.messagecenter.model.CommonUtil.PAGE_TYPE, Integer.valueOf(this.ba));
            map2.put("duration", Long.valueOf(j2));
            if (j2 > 1000) {
                lmf.d().c(this.x, AnalyticsValue.HEALTH_TAB_STAY_TIME_2010071.value(), map2, 0);
            }
            this.dm = this.dp;
        }
        this.ba = i2;
    }

    private void w() {
        qqu.b(this.x);
        if (!jaa.h() && !izt.d(this.x)) {
            qqu.c(this.x, 1);
            bh();
            if (jaa.g(this.x)) {
                et();
                return;
            }
            return;
        }
        if (qqu.e()) {
            if (jaa.g(this.x)) {
                fd();
                return;
            } else {
                bh();
                return;
            }
        }
        if (qqu.b()) {
            if (jaa.i(this.x)) {
                fd();
                return;
            }
            if (bz() || bx()) {
                bo();
                this.v.show();
                bh();
                return;
            } else {
                if (by()) {
                    bo();
                    this.u.show();
                    bh();
                    return;
                }
                bh();
                return;
            }
        }
        if (qqu.c()) {
            if (jaa.h(this.x)) {
                fd();
                return;
            } else {
                bh();
                return;
            }
        }
        bh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bo() {
        if (this.w == null || this.v == null || this.u == null) {
            eh();
            eb();
        }
    }

    private void eh() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.a(this.x.getString(R.string.IDS_hwh_motiontrack_show_map_type_no_gms)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.bh();
            }
        });
        final NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        new NoTitleCustomAlertDialog.Builder(this.x).a(this.x.getString(R.string.IDS_hw_show_map_type_remind_abroad)).c(R.string.IDS_hw_show_map_type_remind_switch, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (jaa.b(MainActivity.this.x)) {
                    qqu.c(MainActivity.this.x, 2);
                    MainActivity.this.bh();
                    MainActivity.this.ek();
                    return;
                }
                noTitleCustomAlertDialogC.show();
            }
        }).a(R.string.IDS_hw_show_map_type_remind_no_switch, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.bh();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ek() {
        if (bz()) {
            this.v.show();
        }
        SportEntranceFragment sportEntranceFragment = this.f0do;
        if (sportEntranceFragment != null) {
            sportEntranceFragment.b();
        }
    }

    private void eb() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.a(this.x.getString(R.string.IDS_hw_show_map_type_remind_china)).c(R.string.IDS_hw_show_map_type_remind_switch, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qqu.c(MainActivity.this.x, 1);
                MainActivity.this.bh();
                if (MainActivity.this.f0do != null) {
                    MainActivity.this.f0do.b();
                }
            }
        }).a(R.string.IDS_hw_show_map_type_remind_no_switch, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MainActivity.this.bh();
                if (qqu.e(MainActivity.this.x) || !jcg.c(MainActivity.this.x) || ecs.h(MainActivity.this.x)) {
                    if (ecs.h(MainActivity.this.x)) {
                        MainActivity.this.u.show();
                        return;
                    } else {
                        LogUtil.c("Login_MainActivity", "setDialogBuilder no google dialog");
                        return;
                    }
                }
                MainActivity.this.v.show();
            }
        });
        NoTitleCustomAlertDialog.Builder builder2 = new NoTitleCustomAlertDialog.Builder(this.x);
        NoTitleCustomAlertDialog.Builder builder3 = new NoTitleCustomAlertDialog.Builder(this.x);
        builder3.b(R.string.IDS_hw_show_map_type_wifi_remind).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        builder2.b(R.string.IDS_hw_show_map_type_sim_card_remind).c(R.string.IDS_settings_button_nps_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.v = builder2.c();
        this.w = builder.c();
        this.u = builder3.c();
    }

    private void fd() {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.b(R.string.IDS_hwh_motiontrack_map_type_remind_auto).c(R.string.IDS_hw_show_map_type_remind_switch, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qqu.c(MainActivity.this.x, 0);
                MainActivity.this.bh();
                if (MainActivity.this.f0do == null || !MainActivity.this.f0do.d()) {
                    return;
                }
                MainActivity.this.f0do.b();
            }
        }).a(R.string.IDS_hw_show_map_type_remind_no_switch, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qqu.b()) {
                    MainActivity.this.bo();
                    MainActivity.this.es();
                } else {
                    MainActivity.this.et();
                }
                MainActivity.this.bh();
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.y = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        this.y.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void et() {
        if (SportSupportUtil.g()) {
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(this.x);
        builder.b(R.string.IDS_hwh_motiontrack_map_type_area_remind_auto).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.health.MainActivity.16
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        this.cq = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        this.cq.show();
    }

    private void n() {
        int iD = HiDateUtil.d(SharedPreferenceManager.d(Integer.toString(10000), "health_app_beta_version_boot_time", 0L));
        if (HiDateUtil.d(System.currentTimeMillis()) == iD) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("boot_day", String.valueOf(iD));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_BETA_VERSION_BOOT_2129016.value(), linkedHashMap);
        SharedPreferenceManager.c(Integer.toString(10000), "health_app_beta_version_boot_time", System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fz() {
        SharedPreferences.Editor editorEdit;
        String strA = CommonUtil.a(getApplicationContext());
        boolean z = false;
        SharedPreferences sharedPreferences = getSharedPreferences("IndoorEquipServiceRunning" + strA, 0);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        boolean z2 = sharedPreferences.getBoolean("IsIndoorEquipServiceRunning" + strA, false);
        long jElapsedRealtime = SystemClock.elapsedRealtime() - sharedPreferences.getLong("elapsedRealtime", 0L);
        if (z2 && jElapsedRealtime < 2000 && jElapsedRealtime > 0) {
            z = true;
        }
        nwa.n().a(z);
        editorEdit.putBoolean("IsIndoorEquipServiceRunning" + strA, nwa.n().s());
        editorEdit.apply();
    }

    private void dm() {
        ObserverManagerUtil.d(new Observer() { // from class: com.huawei.health.MainActivity.23
            @Override // com.huawei.haf.design.pattern.Observer
            public void notify(String str, Object... objArr) {
                boolean z = false;
                if (!njy.c(objArr, 0)) {
                    LogUtil.d("Login_MainActivity", "null args!");
                    return;
                }
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    LogUtil.b("Login_MainActivity", "registerFloatBarStateObserver visibility:", num);
                    if (iIntValue == 8 && (!MainActivity.this.bt || MainActivity.this.dq.getCurrentItem() != MainActivity.this.ai)) {
                        z = true;
                    }
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.mIsPageNeedShowMinibar = mainActivity.a(z);
                    LogUtil.b("Login_MainActivity", "registerFloatBarStateObserver mIsPageNeedShowMinibar:", Boolean.valueOf(MainActivity.this.mIsPageNeedShowMinibar));
                    if (MainActivity.this.mIsPageNeedShowMinibar) {
                        MainActivity.this.showMinibar();
                    } else {
                        MainActivity.this.hideMinibar();
                    }
                }
            }
        }, "HEALTH_FLOAT_BAR_STATE_CHANGE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(boolean z) {
        if ((qjb.c().b() instanceof BottomPlayerView) && !fua.q() && "true".equalsIgnoreCase(SharedPreferenceManager.b(Integer.toString(10000), "ShowHealthHeadLinesData", ""))) {
            return z && this.dq.getCurrentItem() != 0;
        }
        return z;
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class c implements HiCommonListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<MainActivity> f6158c;

        c(MainActivity mainActivity) {
            this.f6158c = new WeakReference<>(mainActivity);
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onSuccess(int i, Object obj) {
            LogUtil.b("Login_MainActivity", "checkSyncStatus onSuccess");
        }

        @Override // com.huawei.hihealth.data.listener.HiCommonListener
        public void onFailure(int i, Object obj) {
            LogUtil.e("Login_MainActivity", "checkSyncStatus onFailure errMsg = ", obj, " , errCode = ", Integer.valueOf(i));
            MainActivity mainActivity = this.f6158c.get();
            if (mainActivity != null) {
                mainActivity.ef();
            }
        }
    }

    private void fb() {
        LogUtil.b("Login_MainActivity", "enter showStepPermissionDialog");
        if (!"xiaomi_widget_step_card".equals(this.an) || this.cc != 13) {
            ReleaseLogUtil.c("Login_MainActivity", "not from xiaomi widget");
        } else {
            if (StepCounterSupportUtils.e(this)) {
                return;
            }
            PermissionUtil.d(this, PermissionUtil.PermissionType.ACTIVITY, new CustomPermissionAction(this) { // from class: com.huawei.health.MainActivity.21
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.b("Login_MainActivity", "ACTIVITY permission had been granted");
                }
            });
        }
    }

    private void du() {
        if (this.l == null) {
            LogUtil.b("Login_MainActivity", "registerLogoutBroadcast logoutBroadcastReceiver == null");
            this.l = new g();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.account.logout");
            LocalBroadcastManager.getInstance().registerReceiver(this.l, intentFilter);
        }
    }

    private void ft() {
        if (this.l != null) {
            LogUtil.b("Login_MainActivity", "unregisterLogoutBroadcast logoutBroadcastReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.l);
            this.l = null;
        }
    }

    private void dq() {
        if (this.o == null) {
            LogUtil.b("Login_MainActivity", "registerLoginBroadcast loginBroadcastReceiver == null");
            this.o = new a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.account.login");
            LocalBroadcastManager.getInstance().registerReceiver(this.o, intentFilter);
        }
    }

    private void fv() {
        if (this.o != null) {
            LogUtil.b("Login_MainActivity", "unregisterLoginBroadcast loginBroadcastReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.o);
            this.o = null;
        }
    }

    private void dl() {
        if (this.k == null) {
            LogUtil.b("Login_MainActivity", "registerForegroundStatusBroadcastReceiver foregroundStatusBroadcastReceiver == null");
            this.k = new e();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
            LocalBroadcastManager.getInstance().registerReceiver(this.k, intentFilter);
        }
    }

    private void fx() {
        if (this.k != null) {
            LogUtil.b("Login_MainActivity", "unregisterForegroundStatusBroadcastReceiver foregroundStatusBroadcastReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.k);
            this.k = null;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                if (BaseApplication.isRunningForeground()) {
                    LogUtil.b("Login_MainActivity", "receive logout action in foreground, skip to MainActivity");
                    MainActivity.this.a(context);
                } else {
                    LogUtil.b("Login_MainActivity", "receive logout action in Background, record logout behavior");
                    MainActivity.this.m = true;
                }
                utd.c();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.plugin.account.login".equals(intent.getAction())) {
                LogUtil.b("Login_MainActivity", "receive action login success");
                utd.e();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction()) && intent.getBooleanExtra("isForeground", false)) {
                SyncCloudUtils.a(SyncCloudUtils.AppStartType.HOT_START);
                LogUtil.b("Login_MainActivity", "receive foreground status");
                if (MainActivity.this.m) {
                    LogUtil.b("Login_MainActivity", "has logout behavior");
                    MainActivity.this.m = false;
                    MainActivity.this.a(context);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (BaseApplication.getActivity() instanceof MainActivity) {
            LogUtil.b("Login_MainActivity", "current stack top is MainActivity");
            return;
        }
        LogUtil.b("Login_MainActivity", "skip to MainActivity");
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(335544320);
        startActivity(intent);
    }

    /* JADX INFO: loaded from: classes6.dex */
    static class i implements Observer {
        private final WeakReference<MainActivity> e;

        i(MainActivity mainActivity) {
            this.e = new WeakReference<>(mainActivity);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            MainActivity mainActivity = this.e.get();
            if (mainActivity == null || mainActivity.isFinishing() || mainActivity.isDestroyed()) {
                LogUtil.e("Login_MainActivity", "RefreshVipTabObserver notify activity is null or finishing/destroyed");
                return;
            }
            if (ObserveLabels.VIP_INFO_CHANGED.equals(str)) {
                MainActivity.d(objArr, mainActivity);
            } else if ("OPERATION_FUNCTION_ENTRANCE".equals(str)) {
                MainActivity.b(objArr, mainActivity);
            } else {
                LogUtil.e("Login_MainActivity", "RefreshVipTabObserver received unexpected label: ", str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object[] objArr, MainActivity mainActivity) {
        LogUtil.b("Login_MainActivity", "handleFunctionChanged received OPERATION_FUNCTION_ENTRANCE");
        if (objArr == null || objArr.length < 2) {
            LogUtil.e("Login_MainActivity", "handleFunctionChanged received OPERATION_FUNCTION_ENTRANCE with invalid objects");
            return;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() != 0) {
                LogUtil.e("Login_MainActivity", "handleFunctionChanged received OPERATION_FUNCTION_ENTRANCE errorCode not success: ", num);
                return;
            } else if (obj2 instanceof List) {
                mainActivity.c((List<pjd>) obj2);
                return;
            } else {
                LogUtil.e("Login_MainActivity", "handleFunctionChanged received invalid function entrance list: ", num);
                return;
            }
        }
        LogUtil.e("Login_MainActivity", "handleFunctionChanged received invalid errorCode object: ", obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object[] objArr, MainActivity mainActivity) {
        LogUtil.b("Login_MainActivity", "handleVipInfoChanged received VIP_INFO_CHANGED");
        if (objArr == null || objArr.length < 1) {
            LogUtil.e("Login_MainActivity", "handleVipInfoChanged received VIP_INFO_CHANGED with invalid objects");
            return;
        }
        Object obj = objArr[0];
        if (obj instanceof UserMemberInfo) {
            if (mainActivity.cl.b()) {
                LogUtil.b("Login_MainActivity", "handleVipInfoChanged getNavigationSkinStatus is true ");
                return;
            } else {
                mainActivity.t();
                return;
            }
        }
        LogUtil.e("Login_MainActivity", "handleVipInfoChanged received invalid VIP data: ", obj);
    }

    private void dt() {
        if (this.cw == null) {
            this.cw = new i(this);
        }
        ObserverManagerUtil.d(this.cw, ObserveLabels.VIP_INFO_CHANGED);
        ObserverManagerUtil.d(this.cw, "OPERATION_FUNCTION_ENTRANCE");
    }

    private void fw() {
        i iVar = this.cw;
        if (iVar != null) {
            ObserverManagerUtil.c(iVar);
            this.cw = null;
        }
    }

    private void c(final List<pjd> list) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: dbu
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(list);
                }
            });
            return;
        }
        LogUtil.b("Login_MainActivity", "refreshFunctionEntranceData into ");
        if (njy.e(list)) {
            LogUtil.b("Login_MainActivity", "refreshFunctionEntranceData functionEntranceList is empty ");
        } else {
            t();
        }
    }

    public /* synthetic */ void b(List list) {
        c((List<pjd>) list);
    }
}
