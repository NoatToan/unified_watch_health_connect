package com.huawei.ui.homehealth;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.bundle.extension.ComponentInfo;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.health.constants.BundleTransferdDataContants;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.health.utils.functionsetcard.CardFlowInteractors;
import com.huawei.health.healthcloudconfig.listener.DownloadCallback;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.todo.api.TodoDataApi;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hms.kit.awareness.status.CapabilityStatus;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.fitnessdatatype.FitnessSleepType;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager;
import com.huawei.hwdevice.mainprocess.receiver.SyncFitnessPrivateBroadcastReceiver;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.indoorequip.util.DownloadUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.utils.SampleConfigUtils;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.ui.commonui.base.FragmentForViewPager;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.QueueDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.swiperefreshlayout.HealthSwipeRefreshLayout;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homehealth.achievementcard.AchievementCardData;
import com.huawei.ui.homehealth.adapter.HomeCardAdapter;
import com.huawei.ui.homehealth.functionsetcard.FunctionSetCardData;
import com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardData;
import com.huawei.ui.homehealth.healthtrend.HealthInsightsCardData;
import com.huawei.ui.homehealth.interactors.WifiScaleMultiUserInteractor;
import com.huawei.ui.homehealth.operamsgcard.OperaMsgCardData;
import com.huawei.ui.homehealth.operationcard.OperationCardData;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import com.huawei.ui.homehealth.quickentrycard.HealthQuickEntryCardData;
import com.huawei.ui.homehealth.threecirclecard.IAnimationCompletedCallback;
import com.huawei.ui.homewear21.receiver.UpgradeMessageReceiver;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.ui.main.stories.healthzone.model.HasFollowListCallBack;
import com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil;
import com.huawei.ui.main.stories.recommendcloud.RecommendCloud;
import com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout;
import defpackage.drl;
import defpackage.eej;
import defpackage.ezi;
import defpackage.fej;
import defpackage.ffv;
import defpackage.fhz;
import defpackage.fua;
import defpackage.fxl;
import defpackage.gvi;
import defpackage.ipj;
import defpackage.lmf;
import defpackage.lsy;
import defpackage.ltd;
import defpackage.lvi;
import defpackage.mwb;
import defpackage.nio;
import defpackage.njy;
import defpackage.npr;
import defpackage.qgr;
import defpackage.qhu;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrg;
import defpackage.qrs;
import defpackage.qso;
import defpackage.qsp;
import defpackage.qst;
import defpackage.rcv;
import defpackage.rcw;
import defpackage.rdp;
import defpackage.rgr;
import defpackage.rhd;
import defpackage.rod;
import defpackage.sho;
import defpackage.soz;
import defpackage.swi;
import defpackage.tbf;
import defpackage.tbh;
import defpackage.tcw;
import defpackage.tfb;
import defpackage.tfh;
import defpackage.tfk;
import defpackage.tfn;
import defpackage.tqp;
import defpackage.uin;
import defpackage.voy;
import defpackage.xan;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public class HomeFragment extends FragmentForViewPager {
    public static boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rgr f25110a;
    private HomeFragmentUtil.b ad;
    private b ae;
    private View af;
    private CustomTitleBar al;
    private rhd.c am;
    private IBaseResponseCallback as;
    private String ay;
    private soz ba;
    private boolean bc;
    private ImageView bf;
    private ViewGroup bh;
    private View bi;
    private HealthRecycleView bj;
    private LinearLayout bl;
    private tbf bm;
    private c bn;
    private HealthTextView bo;
    private LinearLayout bq;
    private WifiScaleMultiUserInteractor bw;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f25112c;
    public HealthSwipeRefreshLayout f;
    public Handler h;
    public InputBoxTemplate i;
    private HomeCardAdapter m;
    public boolean o;
    private ImageView p;
    private LinearLayout q;
    private ImageView s;
    private tbh t;
    private ArrayList<AbstractBaseCardData> v;
    private ArrayList<AbstractBaseCardData> x;
    public boolean n = false;
    public boolean j = true;
    public boolean g = true;
    public boolean e = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f25111b = false;
    private ArrayList<AbstractBaseCardData> w = new ArrayList<>();
    private boolean av = true;
    private final BroadcastReceiver y = new a();
    private DeviceInfo u = null;
    private DeviceCapability z = null;
    private boolean at = false;
    private AchievementCardData l = null;
    private sho ab = null;
    private tcw br = null;
    private HealthHeadLinesCardData an = null;
    private HealthQuickEntryCardData ak = null;
    private FunctionMenuCardData ac = null;
    private OperaMsgCardData ao = null;
    private FunctionSetCardData ah = null;
    private HealthInsightsCardData aj = null;
    private OperationCardData bd = null;
    private long bb = 1000;
    private boolean ai = false;
    private final BroadcastReceiver bp = new UpgradeMessageReceiver();
    private boolean aq = false;
    private boolean aw = true;
    private int ap = 0;
    private boolean az = true;
    private volatile boolean au = false;
    private PermissionsResultAction bk = null;
    private final BroadcastReceiver r = new HomeFragmentUtil.InnerAw70BroadcastReceiver();
    private boolean ax = true;
    private boolean ag = false;
    private boolean k = true;
    private Observer bg = new Observer() { // from class: com.huawei.ui.homehealth.HomeFragment.5
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:31:0x0057  */
        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            byte b2;
            Boolean bool;
            boolean zBooleanValue;
            if (str == null) {
                return;
            }
            str.hashCode();
            switch (str) {
                case "com.huawei.plugin.account.login":
                    b2 = 0;
                    break;
                case "com.huawei.plugin.account.logout":
                    b2 = 1;
                    break;
                case "MAIN_GUIDE_VIEW_COMPLETED":
                    b2 = 2;
                    break;
                case "EQUITY_AND_VIBRANT":
                    b2 = 3;
                    break;
                case "ALLOW_VISIBLE_HINT_LOAD":
                    b2 = 4;
                    break;
                case "PluginHealthModel":
                    b2 = 5;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                HomeFragment.this.ak();
                HomeFragment.this.a(str);
                return;
            }
            if (b2 == 1) {
                if (HomeFragment.this.ab != null) {
                    HomeFragment.this.ab.j();
                }
                HomeFragment.this.m();
                return;
            }
            if (b2 == 2) {
                LogUtil.b("UIHLH_HomeFragment", "initMarketing after main guide view hide");
                HomeFragment.this.o = false;
                HomeFragment.this.e();
                if (HomeFragment.this.h != null) {
                    HomeFragment.this.h.sendEmptyMessage(103);
                }
                if (HomeFragment.this.ab != null) {
                    HomeFragment.this.ab.a(HomeFragment.this.o);
                    HomeFragment.this.ab.b();
                }
                if (HomeFragment.this.ai) {
                    ObserverManagerUtil.e("EQUITY_AND_VIBRANT", new Object[0]);
                    HomeFragment.this.ai = false;
                    return;
                }
                return;
            }
            if (b2 == 3) {
                if (HomeFragment.this.bh != null && HomeFragment.this.bh.getVisibility() == 0) {
                    HomeFragment.this.ai = true;
                    LogUtil.b("UIHLH_HomeFragment", "main guide is showing, showDialog delay");
                    return;
                } else {
                    QueueDialog.dequeShowing();
                    return;
                }
            }
            if (b2 != 4) {
                if (b2 != 5) {
                    return;
                }
                HomeFragment.this.a(str);
            } else {
                if (objArr == null || objArr.length <= 0) {
                    return;
                }
                Object obj = objArr[0];
                if (!(obj instanceof Boolean) || (zBooleanValue = (bool = (Boolean) obj).booleanValue()) == HomeFragment.this.ar) {
                    return;
                }
                LogUtil.b("UIHLH_HomeFragment", "setAllowLoadInSetUserVisibleHint: ", bool);
                HomeFragment.this.c(zBooleanValue);
            }
        }
    };
    private boolean ar = true;
    private final BroadcastReceiver be = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.HomeFragment.15
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.d("UIHLH_HomeFragment", "mNonLocalBroadcastReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.b("UIHLH_HomeFragment", "mNonLocalBroadcastReceiver(): intent.getAction() = ", action);
            if (HomeFragment.this.c(action, intent, this)) {
                return;
            }
            try {
                HomeFragment.this.d(intent);
            } catch (ClassCastException unused) {
                LogUtil.d("UIHLH_HomeFragment", "DeviceInfo deviceInfo error");
            }
        }
    };
    private final BroadcastReceiver bs = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.HomeFragment.13
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) {
            LogUtil.b("UIHLH_HomeFragment", "before onReceive WifiUserInfoBroadcast");
            if (intent != null && "com.huawei.health.action.ACTION_WIFI_USERINFO_ACTION".equals(intent.getAction())) {
                LogUtil.b("UIHLH_HomeFragment", "onReceive WifiUserInfoBroadcast");
                lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.13.2
                    @Override // java.lang.Runnable
                    public void run() {
                        HomeFragment.this.a(intent, 0);
                    }
                });
            } else if (intent != null && "com.huawei.health.action.ACTION_WIFI_DEVICE_UNIT_ACTION".equals(intent.getAction())) {
                lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.13.4
                    @Override // java.lang.Runnable
                    public void run() {
                        HomeFragment.this.a(intent, 1);
                    }
                });
            } else if (intent != null && "com.huawei.health.action.ACTION_WIFI_OTA_UPDATE_ACTION".equals(intent.getAction())) {
                HomeFragment.this.a(intent, 2);
            } else {
                LogUtil.d("UIHLH_HomeFragment", "wifi info is other");
            }
        }
    };
    private BroadcastReceiver aa = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.HomeFragment.20
        /* JADX WARN: Code duplicated, block: B:27:0x005f  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            byte b2;
            if (intent == null) {
                ReleaseLogUtil.d("UIHLH_HomeFragment", "mDeviceStatusReceiver onReceive intent is null.");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                ReleaseLogUtil.d("UIHLH_HomeFragment", "mDeviceStatusReceiver onReceive action is null");
                return;
            }
            ReleaseLogUtil.c("UIHLH_HomeFragment", "mDeviceStatusReceiver onReceive action :", action);
            action.hashCode();
            int iHashCode = action.hashCode();
            if (iHashCode != -1565035044) {
                if (iHashCode != 941935981) {
                    if (iHashCode == 1007782054 && action.equals("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (action.equals("com.huawei.bone.action.CONNECTION_STATE_CHANGED")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (action.equals("com.huawei.health.action.BIND_DEVICE_SUCCESS")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                HomeFragment.this.b(intent);
                return;
            }
            if (b2 != 1) {
                if (b2 == 2 && HomeFragment.this.ab != null && HomeFragment.this.ab.m()) {
                    HomeFragment.this.ab.d(false);
                    rdp.a(HomeFragment.this.ab.h(), HomeFragment.this.f25112c, HomeFragment.this.ab.i());
                    return;
                }
                return;
            }
            HomeFragment.this.e(intent);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        if (this.aj != null) {
            LogUtil.b("UIHLH_HomeFragment", "refresh HealthTrendCardData ");
            this.aj.refreshCardData();
        }
        if (this.br != null) {
            LogUtil.b("UIHLH_HomeFragment", "refresh TwoModelCardData ");
            this.br.refreshCardData();
        }
        if (this.ak != null) {
            LogUtil.b("UIHLH_HomeFragment", "refresh TwoModelCardData ");
            this.ak.refreshCardData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        HealthQuickEntryCardData healthQuickEntryCardData = this.ak;
        if (healthQuickEntryCardData != null) {
            healthQuickEntryCardData.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        Handler handler = this.h;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(103, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Intent intent) {
        DeviceInfo deviceInfo;
        try {
            deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
        } catch (BadParcelableException unused) {
            LogUtil.d("UIHLH_HomeFragment", "mNonLocalBroadcastReceiver onReceive BadParcelableException");
            deviceInfo = null;
        }
        if (this.bj == null) {
            LogUtil.d("UIHLH_HomeFragment", "initView is not completed");
            return;
        }
        if (deviceInfo == null) {
            LogUtil.d("UIHLH_HomeFragment", "deviceInfo is null");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.c("UIHLH_HomeFragment", "connectedChanged(): ", deviceInfo.getDeviceName(), ",state = ", Integer.valueOf(deviceConnectState));
        DeviceInfo deviceInfoJ = tfn.a().j();
        this.u = deviceInfoJ;
        if (deviceInfoJ != null) {
            LogUtil.b("UIHLH_HomeFragment", "mCurrentDeviceInfo.getProductType():", Integer.valueOf(deviceInfoJ.getProductType()));
            LogUtil.b("UIHLH_HomeFragment", "deviceInfo.getProductType():", Integer.valueOf(deviceInfo.getProductType()));
            if (d(deviceConnectState, this.u.getProductType(), deviceInfo.getProductType())) {
                return;
            }
        }
        if (deviceConnectState == 2) {
            this.at = true;
            rcv.a(this.f25112c).f();
            LogUtil.d("UIHLH_HomeFragment", "connect change istoEsimOrWallet ==", Boolean.valueOf(this.az));
            if (this.az) {
                z();
            }
        } else {
            this.at = false;
        }
        LogUtil.c("UIHLH_HomeFragment", "connectedChanged() mIsConnected:", Boolean.valueOf(this.at));
    }

    private boolean d(int i, int i2, int i3) {
        return HomeFragmentUtil.d(i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str, Intent intent, BroadcastReceiver broadcastReceiver) {
        str.hashCode();
        if (str.equals("com.huawei.bone.action.open_gps")) {
            bc();
            broadcastReceiver.abortBroadcast();
            return true;
        }
        if (str.equals("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS")) {
            return true;
        }
        return d(str, intent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    private boolean d(String str, Intent intent) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "com.huawei.health.fitness_detail_sync_success":
                b2 = 0;
                break;
            case "com.huawei.health.weight_detail_sync_success":
                b2 = 1;
                break;
            case "android.intent.action.LOCALE_CHANGED":
                b2 = 2;
                break;
            case "com.huawei.haf.intent.action.UPDATE_LANGUAGE_READY":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            LogUtil.b("UIHLH_HomeFragment", "FITNESS_DETAIL_SYNC_SUCCESS");
            DeviceInfo deviceInfoF = rcv.a(this.f25112c).f();
            if (deviceInfoF != null && deviceInfoF.getDeviceConnectState() == 2) {
                LogUtil.b("UIHLH_HomeFragment", "SYNC_SUCCESS device startNps");
                boolean zCurDeviceIsSupportWebNps = DeviceWebNpsUtil.curDeviceIsSupportWebNps(deviceInfoF.getDeviceModel());
                LogUtil.b("UIHLH_HomeFragment", "SYNC_SUCCESS device isSupportWebNps:", Boolean.valueOf(zCurDeviceIsSupportWebNps));
                if (!zCurDeviceIsSupportWebNps) {
                    tfn.a().c(this.f25112c);
                } else {
                    DeviceWebNpsUtil.stratToGetWearDeviceNpsLink(getActivity(), deviceInfoF);
                }
            }
            return true;
        }
        if (b2 == 1) {
            LogUtil.b("UIHLH_HomeFragment", "WEIGHT_DETAIL_SYNC_SUCCESS");
            c(intent);
            return true;
        }
        if (b2 == 2) {
            LogUtil.b("UIHLH_HomeFragment", "language changed!");
            lvi.l();
            return true;
        }
        if (b2 != 3) {
            return false;
        }
        if (ProcessUtil.c().equals(intent.getStringExtra("sendProcess"))) {
            LogUtil.b("UIHLH_HomeFragment", "update language ready!");
            lvi.l();
            HwDeviceReplyPhraseEngineManager.a().e();
        }
        return true;
    }

    public boolean b() {
        return this.aq;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        setTag("UIHLH_HomeFragment");
        as();
        ReleaseLogUtil.c("UIHLH_HomeFragment", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        ReleaseLogUtil.c("UIHLH_HomeFragment", "onAttach");
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f25112c = getActivity();
        View viewInflate = layoutInflater.inflate(R.layout.swipe_recycleview_layout, viewGroup, false);
        this.bi = viewInflate;
        e(viewInflate);
        this.h = new HomeFragmentUtil.c(this);
        this.f25110a = new rgr(this, this.f25112c);
        this.bq = (LinearLayout) this.bi.findViewById(R.id.sync_root_layout);
        this.p = (ImageView) this.bi.findViewById(R.id.background1);
        this.s = (ImageView) this.bi.findViewById(R.id.background2);
        this.bf = (ImageView) this.bi.findViewById(R.id.maskView);
        this.q = (LinearLayout) this.bi.findViewById(R.id.container);
        w();
        this.bi.findViewById(R.id.knit_container_layout).setVisibility(8);
        ReleaseLogUtil.c("UIHLH_HomeFragment", "onCreateView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return this.bi;
    }

    private void at() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("sync_cloud_data_action");
            c cVar = new c();
            this.bn = cVar;
            BroadcastManagerUtil.e(this.f25112c, cVar, intentFilter);
        } catch (Exception unused) {
            LogUtil.d("UIHLH_HomeFragment", "registerSyncCloudDataReceiver Exception");
        }
    }

    private void e(View view) {
        this.bk = new CustomPermissionAction(this.f25112c) { // from class: com.huawei.ui.homehealth.HomeFragment.14
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.e("UIHLH_HomeFragment", "initHealthTitleBar() mQrCodeAction onGranted");
                HomeFragment.this.p();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.e("UIHLH_HomeFragment", "initHealthTitleBar() mQrCodeAction onDenied");
                HomeFragment.this.p();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.e("UIHLH_HomeFragment", "initHealthTitleBar() mQrCodeAction onForeverDenied");
                HomeFragment.this.p();
            }
        };
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.health_tab_titlebar);
        this.al = customTitleBar;
        HomeFragmentUtil.c(customTitleBar, this.f25112c);
        if (EnvironmentInfo.m()) {
            this.al.setRightTextButtonVisibility(8);
        }
        bb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f25112c == null) {
            LogUtil.e("UIHLH_HomeFragment", "gotoScan: mContext is null");
            return;
        }
        try {
            this.f25112c.startActivity(new Intent(this.f25112c, (Class<?>) QrCodeScanningActivity.class));
        } catch (ActivityNotFoundException e) {
            LogUtil.d("UIHLH_HomeFragment", "ActivityNotFoundException", e.getMessage());
        }
    }

    private void bb() {
        this.al.setRightButtonOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.HomeFragment.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ArrayList arrayList = new ArrayList(Arrays.asList(HomeFragment.this.getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add), HomeFragment.this.getResources().getString(R.string.IDS_hw_device_manager_add_device)));
                if (!qgr.b(HomeFragment.this.f25112c) && uin.e().d()) {
                    arrayList.add(HomeFragment.this.getResources().getString(R.string.IDS_device_data_source));
                }
                new PopViewList(HomeFragment.this.f25112c, HomeFragment.this.al, arrayList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.ui.homehealth.HomeFragment.11.4
                    @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
                    public void setOnClick(int i) {
                        if (i == 0) {
                            HomeFragmentUtil.d(HomeFragment.this.f25112c, HomeFragment.this.bk);
                        } else if (i == 1) {
                            HomeFragment.this.h();
                        } else {
                            if (i != 2) {
                                return;
                            }
                            uin.e().a(HomeFragment.this.f25112c, 3);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f25112c == null) {
            LogUtil.d("UIHLH_HomeFragment", "addDevice error: context is null");
        } else {
            lmf.d().c(this.f25112c, AnalyticsValue.HEALTH_HEALTH_MY_DEVICE_2030030.value(), new HashMap(), 0);
            rdp.b(this);
        }
    }

    private void s() {
        this.ad = new HomeFragmentUtil.b(this.f25112c);
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            EventBus.b(this.ad, 2, "evebus_weight_measure_notification", "multi_user_auto_cancle_dialog");
            this.bw = new WifiScaleMultiUserInteractor(this.f25112c);
        }
        if (qst.c()) {
            rod.e().e(getActivity());
        }
    }

    private void x() {
        this.f = (HealthSwipeRefreshLayout) this.bi.findViewById(R.id.swiperefreshlayout);
        this.af = this.bi.findViewById(R.id.headline_tips);
        this.f.setPadding(0, 0, 0, 0);
        this.bl = (LinearLayout) this.bi.findViewById(R.id.sync_cloud_data_layout);
        this.bo = (HealthTextView) this.bi.findViewById(R.id.sync_progress_percent);
        HealthRecycleView healthRecycleView = (HealthRecycleView) this.bi.findViewById(R.id.id_recyclerview);
        this.bj = healthRecycleView;
        if (healthRecycleView == null) {
            LogUtil.e("UIHLH_HomeFragment", "initListView mRecyclerView == null");
            return;
        }
        healthRecycleView.b(false);
        this.bj.e(false);
        if (fua.q()) {
            return;
        }
        ScrollUtil.d(this.bj, getActivity().getWindow().getDecorView(), 3001, new d(this));
    }

    private void t() {
        HomeFragmentUtil.d(this.f25112c, this.h, this.l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onActivityCreated(bundle);
        x();
        ReleaseLogUtil.c("UIHLH_HomeFragment", "onActivityCreated, initLayout finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void as() {
        IntentFilter intentFilter = new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.health.action.BIND_DEVICE_SUCCESS");
        intentFilter.addAction("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.aa, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void bh() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.aa);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("UIHLH_HomeFragment", "DeviceStatusBroadcast not register before");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
            if (deviceInfo == null) {
                LogUtil.e("UIHLH_HomeFragment", "mDeviceStatusReceiver deviceInfo is null.");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.b("UIHLH_HomeFragment", "connectState:", Integer.valueOf(deviceConnectState));
            if (deviceConnectState == 2) {
                LogUtil.b("UIHLH_HomeFragment", "mDeviceStatusReceiver connectState is connected");
                b(deviceInfo);
                if (isResumed()) {
                    d(deviceInfo);
                }
                SampleConfigUtils.resendAsyncWhenReconnect(deviceInfo, "UIHLH_HomeFragment");
                fej.d((DownloadCallback<File>) null);
                sho shoVar = this.ab;
                if (shoVar != null) {
                    shoVar.d();
                }
            } else {
                sho shoVar2 = this.ab;
                if (shoVar2 != null) {
                    shoVar2.f();
                }
            }
            sho shoVar3 = this.ab;
            if (shoVar3 == null || !shoVar3.m() || this.ab.o() || deviceConnectState != 3) {
                return;
            }
            this.ab.d(false);
            rdp.a(this.ab.h(), this.f25112c, this.ab.i());
        } catch (ClassCastException unused) {
            LogUtil.d("UIHLH_HomeFragment", "mDeviceStatusReceiver ClassCastException.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
            DeviceInfo deviceInfo = parcelableExtra instanceof DeviceInfo ? (DeviceInfo) parcelableExtra : null;
            if (deviceInfo == null) {
                ReleaseLogUtil.d("UIHLH_HomeFragment", "mDeviceStatusReceiver bind deviceInfo is null.");
                return;
            }
            if (deviceInfo.getDeviceConnectState() == 2) {
                ReleaseLogUtil.c("UIHLH_HomeFragment", "mDeviceStatusReceiver bind success, connectState is connected");
                PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
                if (payApi == null) {
                    ReleaseLogUtil.d("UIHLH_HomeFragment", "activateDeviceBenefitPage failed, payApi is null");
                } else {
                    payApi.activateDeviceBenefitPage(qhu.d(deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL, true));
                }
            }
        } catch (ClassCastException unused) {
            ReleaseLogUtil.b("UIHLH_HomeFragment", "mDeviceStatusReceiver bind ClassCastException.");
        }
    }

    private void d(DeviceInfo deviceInfo) {
        HomeFragmentUtil.a(this.f25112c, deviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo) {
        HomeFragmentUtil.a(this.f25112c, getActivity(), deviceInfo);
    }

    private void n() {
        HomeFragmentUtil.c(this.h, this.f25112c);
    }

    private void v() {
        if (!fua.q()) {
            this.x = new ArrayList<>();
            this.v = new ArrayList<>();
            this.m = new HomeCardAdapter(this.f25112c, this.x);
            this.bm = new tbf(this.f25112c, this);
            this.t = new tbh(this.f25112c, this.p, this.s, this.q, this.bf, this.f);
            rhd.d(this.bj, this.f25112c, this.m);
            r();
            rhd.c cVar = new rhd.c();
            this.am = cVar;
            cVar.j(this.br);
            HomeFragmentUtil.b(this.am, this.l, this.ah, this.ac, this.ab, this.bd, this.v, this.x, this.ao, this.bc, this.aj, this.an);
            rhd.c(this.f25112c, this.am, this.bj, this.m);
            return;
        }
        this.m = new HomeCardAdapter(this.f25112c, this.w);
        this.bm = new tbf(this.f25112c, this);
        this.t = new tbh(this.f25112c, this.p, this.s, this.q, this.bf, this.f);
        rhd.d(this.bj, this.f25112c, this.m);
        r();
        this.w.add(this.l);
        this.w.add(this.ab);
        this.w.add(this.br);
        this.w.add(this.ah);
        HealthInsightsCardData healthInsightsCardData = this.aj;
        if (healthInsightsCardData != null) {
            this.w.add(healthInsightsCardData);
        }
        this.w.add(this.bd);
        this.w.add(this.ak);
        if (this.m == null || this.bj == null) {
            return;
        }
        Collections.sort(this.w);
        this.m.c(this.w);
        this.bj.getRecycledViewPool().clear();
        this.bj.setAdapter(this.m);
    }

    private void af() {
        this.bj.setOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.huawei.ui.homehealth.HomeFragment.19
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (!recyclerView.canScrollVertically(1) && System.currentTimeMillis() - HomeFragment.this.bb > 2000) {
                    HomeFragment.this.bb = System.currentTimeMillis();
                }
                if (i == 1) {
                    tfb.b(HomeFragment.this.f25112c, 1);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (recyclerView.canScrollVertically(1)) {
                    return;
                }
                tfb.b(HomeFragment.this.f25112c);
            }
        });
    }

    private void b(final DeviceInfo deviceInfo) {
        if (CommonUtil.x(this.f25112c)) {
            LogUtil.b("UIHLH_HomeFragment", "setThreadPoolManager isBackground");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.18
                @Override // java.lang.Runnable
                public void run() {
                    boolean zHasEmergencyInfoProvider = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).hasEmergencyInfoProvider();
                    String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "emergency_info");
                    LogUtil.b("UIHLH_HomeFragment", "mDeviceStatusReceiver emergencyInfoStatus:", strE);
                    if (!zHasEmergencyInfoProvider && TextUtils.isEmpty(strE)) {
                        LogUtil.b("UIHLH_HomeFragment", "mDeviceStatusReceiver connectState less isEmui110");
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "emergency_info", "true", new StorageParams());
                    }
                    if (zHasEmergencyInfoProvider) {
                        LogUtil.b("UIHLH_HomeFragment", "mDeviceStatusReceiver connectState isEmui110");
                        if (TextUtils.isEmpty(strE)) {
                            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "emergency_info", "false", new StorageParams());
                        } else {
                            if (Boolean.parseBoolean(strE)) {
                                if (LoginInit.getInstance(HomeFragment.this.f25112c).isBrowseMode()) {
                                    return;
                                }
                                HomeFragment.this.h.post(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.18.3
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        HomeFragment.this.c(deviceInfo);
                                    }
                                });
                                return;
                            }
                            LogUtil.e("UIHLH_HomeFragment", "mDeviceStatusReceiver connectState is else");
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.HomeFragment$16, reason: invalid class name */
    public class AnonymousClass16 implements Runnable {
        AnonymousClass16() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (HomeFragment.this.f25112c != null && HomeFragment.this.getActivity() != null && !HomeFragment.this.getActivity().isFinishing()) {
                HomeFragment.this.an();
                if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
                    HomeFragment.this.au();
                }
                if (CommonUtil.ck()) {
                    HomeFragment.this.aw();
                    HomeFragment.this.av();
                    lvi.i();
                    HomeFragment.this.aj();
                    rcw.b(HomeFragment.this.f25112c).c();
                }
                HomeFragment.this.u();
                fhz.d().c(new IBaseResponseCallback() { // from class: rgs
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public final void a(int i, Object obj) {
                        this.e.c(i, obj);
                    }
                });
                return;
            }
            LogUtil.e("UIHLH_HomeFragment", "initExecutors Activity is destroyed");
        }

        public /* synthetic */ void c(int i, Object obj) {
            if (i == 6) {
                HomeFragment.this.al();
            }
        }
    }

    private void q() {
        ThreadPoolManager.c().b("UIHLH_HomeFragment", new AnonymousClass16());
    }

    private void r() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.l = new AchievementCardData(this.f25112c);
        String strE = tbf.e();
        if (fua.q()) {
            this.br = new tcw(this.f25112c, strE, this.bm);
            this.ak = new HealthQuickEntryCardData(this.f25112c);
        } else {
            this.ao = new OperaMsgCardData(this.f25112c);
            this.br = new tcw(this.f25112c, strE, this.bm);
            if (fua.o()) {
                this.ac = new FunctionMenuCardData();
            }
            if (!this.bc) {
                this.an = new HealthHeadLinesCardData(this.f25112c);
            }
        }
        this.ab = new sho(this.f25112c, this.o);
        this.ah = new FunctionSetCardData(this.f25112c);
        this.bd = new OperationCardData(this.f25112c);
        if (fua.k()) {
            this.aj = new HealthInsightsCardData(this.f25112c);
        }
        ReleaseLogUtil.c("UIHLH_HomeFragment", "initCardConstructor finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    public void e(final String str, boolean z) {
        LogUtil.b("UIHLH_HomeFragment", "notifyStepCardChanged currentType: ", str);
        if (!ab() && d) {
            LogUtil.b("UIHLH_HomeFragment", "pull refreshing, not support to switch");
            if (qrs.aa(this.f25112c)) {
                Context context = this.f25112c;
                qpx.b(context, context.getResources().getString(R.string.IDS_not_support_switch_toast));
                return;
            }
            return;
        }
        final int height = 0;
        if (!z) {
            LogUtil.b("UIHLH_HomeFragment", "switch without Animation");
            if ("threeCircleCard".equals(str)) {
                d("threeLeafCard");
                this.br.e("threeLeafCard", false);
            } else {
                d("threeCircleCard");
                this.br.e("threeCircleCard", false);
            }
            c(str, false);
            return;
        }
        this.br.b().b(str);
        this.f.setInterceptTouchEvent(true);
        LogUtil.b("UIHLH_HomeFragment", "mCardData: ", this.x);
        View viewFindViewById = ((Activity) this.f25112c).findViewById(R.id.home_item_three_circle_card_layout);
        if (viewFindViewById != null) {
            int[] iArr = new int[2];
            viewFindViewById.getLocationOnScreen(iArr);
            height = (iArr[1] - this.al.getHeight()) - this.bq.getHeight();
        }
        if ("threeCircleCard".equals(str)) {
            this.t.b(this.bj, this.br, height, new IAnimationCompletedCallback() { // from class: rgm
                @Override // com.huawei.ui.homehealth.threecirclecard.IAnimationCompletedCallback
                public final void onCompleted(IAnimationCompletedCallback iAnimationCompletedCallback) {
                    this.e.a(str, height, iAnimationCompletedCallback);
                }
            });
        } else if ("threeLeafCard".equals(str)) {
            this.t.b(this.bj, this.br, height, new IAnimationCompletedCallback() { // from class: rgv
                @Override // com.huawei.ui.homehealth.threecirclecard.IAnimationCompletedCallback
                public final void onCompleted(IAnimationCompletedCallback iAnimationCompletedCallback) {
                    this.d.c(str, height, iAnimationCompletedCallback);
                }
            });
        } else {
            health.compact.a.util.LogUtil.a("UIHLH_HomeFragment", "card type is error");
        }
    }

    public /* synthetic */ void a(String str, int i, IAnimationCompletedCallback iAnimationCompletedCallback) {
        d("threeLeafCard");
        c(str, i);
    }

    public /* synthetic */ void c(String str, int i, IAnimationCompletedCallback iAnimationCompletedCallback) {
        d("threeCircleCard");
        e(str, i);
    }

    private void d(String str) {
        tcw tcwVar = this.br;
        if (tcwVar == null || tcwVar.b() == null) {
            LogUtil.e("UIHLH_HomeFragment", "changeOverlayView holder is null");
        } else {
            this.br.b().e(str);
        }
    }

    private boolean ab() {
        int height;
        HealthRecycleView healthRecycleView = this.bj;
        if (healthRecycleView != null) {
            int[] iArr = new int[2];
            healthRecycleView.getLocationOnScreen(iArr);
            height = iArr[1];
        } else {
            height = 0;
        }
        CustomTitleBar customTitleBar = this.al;
        if (customTitleBar != null) {
            height -= customTitleBar.getHeight();
        }
        return height <= 1;
    }

    private void e(String str, int i) {
        this.t.c(this.bj, this.br, i, str);
        c(str, true);
    }

    private void c(String str, int i) {
        this.t.c(this.bj, this.br, i, str);
        c(str, true);
    }

    private void c(String str, boolean z) {
        if (!"threeLeafCard".equals(str)) {
            this.bm.d("threeLeafCard");
        } else {
            this.bm.d("threeCircleCard");
        }
        this.bm.b(str);
        lmf.d().c(LoginInit.getInstance(this.f25112c).getAccountInfo(1011));
        a(str, z);
    }

    private void a(String str, boolean z) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 104;
        messageObtain.obj = str;
        Handler handler = this.h;
        if (handler != null) {
            handler.sendMessageDelayed(messageObtain, z ? 1700L : 0L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.b("UIHLH_HomeFragment", "Enter onActivityResult requestcode:", Integer.valueOf(i), ";resultcode:", Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i == 101) {
            LogUtil.b("UIHLH_HomeFragment", "Enter checkGpsPermission");
            g();
        }
        if (i == 102) {
            rdp.c(this.f25112c);
        }
        if (i == 608) {
            ReleaseLogUtil.c("UIHLH_HomeFragment", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            if (i2 == -1) {
                if (this.ab != null) {
                    SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                    LogUtil.b("UIHLH_HomeFragment", "setString SENSITIVE_PERMISSION_STATUS restart");
                    tqp.e(this.ab.h(), intent);
                    ah();
                    return;
                }
                return;
            }
            sho shoVar = this.ab;
            if (shoVar != null) {
                shoVar.y();
            }
        }
    }

    private void ah() {
        sho shoVar = this.ab;
        if (shoVar != null) {
            shoVar.ab();
            this.ab.f();
        }
    }

    private void y() {
        this.f.setRefreshPushText(this.f25112c.getResources().getString(R.string.IDS_hwh_home_step_is_synchordata));
        this.f.setCallback(new HwSwipeRefreshLayout.Callback() { // from class: com.huawei.ui.homehealth.HomeFragment.2
            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean needToWait() {
                return true;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public boolean isEnabled() {
                boolean zIsBrowseMode = LoginInit.getInstance(HomeFragment.this.f25112c).isBrowseMode();
                HomeFragment homeFragment = HomeFragment.this;
                homeFragment.au = homeFragment.au || !(zIsBrowseMode || tfk.e());
                return HomeFragment.this.au;
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onRefreshStart() {
                LogUtil.b("UIHLH_HomeFragment", "onRefreshStart");
                HomeFragment.d = true;
                if (HomeFragment.this.h.hasMessages(1006)) {
                    LogUtil.b("UIHLH_HomeFragment", "card data refresh not finished");
                    return;
                }
                npr.a(2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                HomeFragmentUtil.a(HomeFragment.this.h);
                HomeFragment.this.al();
                HomeFragment.this.ai();
                HomeFragment.this.ag();
                LogUtil.b("UIHLH_HomeFragment", " start to send Message UPDATE_UI_STOP_REFRESH_LAYOUT");
                Message messageObtainMessage = HomeFragment.this.h.obtainMessage();
                messageObtainMessage.what = 1004;
                if (HomeFragment.this.bc) {
                    LocalBroadcastManager.getInstance().sendBroadcast(new Intent("com.huawei.sync_activity_to_third_platform"));
                }
                HomeFragment.this.h.sendMessageDelayed(messageObtainMessage, 120000L);
                LogUtil.b("UIHLH_HomeFragment", "onRefreshStart cost time: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            }

            @Override // com.huawei.uikit.hwswiperefreshlayout.widget.HwSwipeRefreshLayout.Callback
            public void onScrollUp() {
                HomeFragment.this.au = false;
            }
        });
    }

    private void bf() {
        LogUtil.b("UIHLH_HomeFragment", "syncBloodSugarTask");
        BroadcastManagerUtil.e(BaseApplication.getContext(), new Intent("com.huawei.health.action.SYNC_BLOOD_SUGAR_DATA"));
    }

    private void w() {
        if (this.al == null) {
            return;
        }
        if (!ezi.d()) {
            this.al.setRightSoftkeyVisibility(8);
            return;
        }
        ezi.c(this.h, 4036);
        this.al.setRightSoftkeyVisibility(0);
        qsp.c(this.al.getRightSoftKey(), 1.0f);
        this.al.setRightSoftkeyBackground(ContextCompat.getDrawable(this.f25112c, R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
        this.al.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: com.huawei.ui.homehealth.HomeFragment.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                gvi.c(HomeFragment.this.f25112c, 4036, HomeFragment.this.i);
                ezi.d(HomeFragment.this.f25112c, HomeFragment.this.i, 4036);
                if (HomeFragment.this.i == null || TextUtils.equals(HomeFragment.this.ay, HomeFragment.this.i.getTheme())) {
                    return;
                }
                gvi.a(1, 4036, HomeFragment.this.i);
                HomeFragment homeFragment = HomeFragment.this;
                homeFragment.ay = homeFragment.i.getTheme();
            }
        });
    }

    public void a(boolean z) {
        this.ax = z;
    }

    public boolean c() {
        HealthRecycleView healthRecycleView = this.bj;
        if (healthRecycleView == null) {
            return false;
        }
        return healthRecycleView.getScrollState() != 0 || this.bj.isComputingLayout();
    }

    public void f() {
        LogUtil.b("UIHLH_HomeFragment", "showTodoBtn mIsShowAdNow:", Boolean.valueOf(this.g));
        this.g = false;
        Handler handler = this.h;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(103, 50L);
            this.h.sendEmptyMessageDelayed(FitnessSleepType.HW_FITNESS_WAKE, 50L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        LogUtil.b("UIHLH_HomeFragment", "refreshWearSdkData");
        if (this.as == null) {
            this.as = new HomeFragmentUtil.j(this);
        }
        tfn.a().f();
        fhz.d().b(0, this.as);
        bf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ai() {
        String strA = HomeFragmentUtil.a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.d("UIHLH_HomeFragment", "push press,device mac is null");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(this.f25112c).e(strA);
        this.z = deviceCapabilityE;
        HomeFragmentUtil.d(deviceCapabilityE, this.f25112c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ag() {
        String strA = HomeFragmentUtil.a();
        if (TextUtils.isEmpty(strA)) {
            LogUtil.e("UIHLH_HomeFragment", "push weather,device mac is null");
            return;
        }
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(this.f25112c).e(strA);
        this.z = deviceCapabilityE;
        HomeFragmentUtil.b(deviceCapabilityE, this.f25112c);
    }

    public void e() {
        if (this.o || this.g || this.ag) {
            return;
        }
        Context context = getContext();
        if (context == null) {
            LogUtil.e("UIHLH_HomeFragment", "initMarketing context is null");
        } else if (HomeFragmentUtil.e(context)) {
            this.ag = true;
        }
    }

    private void ar() {
        boolean z = getArguments().getBoolean(BundleTransferdDataContants.IS_SHOW_GUIDE);
        this.o = z;
        if (z) {
            ObserverManagerUtil.d(this.bg, "MAIN_GUIDE_VIEW_COMPLETED");
        }
    }

    private void am() {
        HomeFragmentUtil.d(this.bg);
    }

    private void aq() {
        ObserverManagerUtil.d(this.bg, "com.huawei.plugin.account.login");
        ObserverManagerUtil.d(this.bg, "com.huawei.plugin.account.logout");
    }

    private void ao() {
        if (ffv.c() == null) {
            ObserverManagerUtil.d(this.bg, "PluginHealthModel");
        }
    }

    private void ap() {
        try {
            ObserverManagerUtil.d(this.bg, "EQUITY_AND_VIBRANT");
        } catch (IllegalArgumentException | IllegalStateException unused) {
            LogUtil.d("UIHLH_HomeFragment", "registerEquityVibrantObserver exception");
        }
    }

    private void bi() {
        try {
            ObserverManagerUtil.a(this.bg, "EQUITY_AND_VIBRANT");
        } catch (IllegalArgumentException | IllegalStateException unused) {
            LogUtil.d("UIHLH_HomeFragment", "UnregisterEquityVibrantObserver exception");
        }
    }

    private void bd() {
        ObserverManagerUtil.a(this.bg, "MAIN_GUIDE_VIEW_COMPLETED");
    }

    private void bg() {
        HomeFragmentUtil.a(this.bg);
    }

    private void bl() {
        ObserverManagerUtil.a(this.bg, "com.huawei.plugin.account.login");
        ObserverManagerUtil.a(this.bg, "com.huawei.plugin.account.logout");
    }

    private void be() {
        ObserverManagerUtil.a(this.bg, "PluginHealthModel");
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onConfigurationChanged(configuration);
        if (fua.q()) {
            Iterator<AbstractBaseCardData> it = this.w.iterator();
            while (it.hasNext()) {
                it.next().onConfigurationChanged(configuration);
            }
        } else {
            tcw tcwVar = this.br;
            if (tcwVar != null) {
                tcwVar.onConfigurationChanged(configuration);
            }
            FunctionSetCardData functionSetCardData = this.ah;
            if (functionSetCardData != null) {
                functionSetCardData.onConfigurationChanged(configuration);
            }
            FunctionMenuCardData functionMenuCardData = this.ac;
            if (functionMenuCardData != null) {
                functionMenuCardData.onConfigurationChanged(configuration);
            }
            sho shoVar = this.ab;
            if (shoVar != null) {
                shoVar.onConfigurationChanged(configuration);
            }
            OperationCardData operationCardData = this.bd;
            if (operationCardData != null) {
                operationCardData.onConfigurationChanged(configuration);
            }
        }
        ReleaseLogUtil.c("UIHLH_HomeFragment", "onConfigurationChanged, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void ay() {
        HomeFragmentUtil.b(this.h);
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LogUtil.b("UIHLH_HomeFragment", "onPause ", this);
        if (fua.q()) {
            Iterator<AbstractBaseCardData> it = this.w.iterator();
            while (it.hasNext()) {
                it.next().onPause();
            }
        } else {
            sho shoVar = this.ab;
            if (shoVar != null) {
                shoVar.onPause();
            }
            tcw tcwVar = this.br;
            if (tcwVar != null) {
                tcwVar.onPause();
            }
        }
        HomeFragmentUtil.g(this.f25112c);
    }

    public void b(ViewGroup viewGroup) {
        this.bh = viewGroup;
    }

    @Override // com.huawei.ui.commonui.base.FragmentForViewPager
    public void loadAfterViewPagerOnResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        DownloadUtil.a(new HomeFragmentUtil.a()).d((Activity) getActivity(), false);
        ar();
        ax();
        am();
        aq();
        ao();
        ap();
        HomeFragmentUtil.c();
        this.bc = Utils.o();
        at();
        FragmentActivity activity = getActivity();
        this.f25112c = activity;
        if (activity == null) {
            LogUtil.d("UIHLH_HomeFragment", "onActivityCreated mContext== null");
            return;
        }
        s();
        v();
        this.aq = true;
        y();
        q();
        ad();
        qso.d().e(this, this.bi);
        ipj.e();
        ReleaseLogUtil.c("UIHLH_HomeFragment", "loadAfterViewPagerOnResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.HomeFragment$3, reason: invalid class name */
    public class AnonymousClass3 implements Observer {
        AnonymousClass3() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!njy.c(objArr, 1)) {
                LogUtil.d("UIHLH_HomeFragment", "null args!");
                return;
            }
            Object obj = objArr[0];
            if ((obj instanceof Integer) && (objArr[1] instanceof Integer)) {
                final int iIntValue = ((Integer) obj).intValue();
                final int iIntValue2 = ((Integer) objArr[1]).intValue();
                HandlerExecutor.c(new Runnable() { // from class: rgu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47313a.b(iIntValue, iIntValue2);
                    }
                });
            }
        }

        public /* synthetic */ void b(int i, int i2) {
            if (i != -1 || i2 != -1) {
                LogUtil.b("UIHLH_HomeFragment", "mHeadlinesTipsView should be visible!");
                HomeFragment.this.d(i, i2);
            } else {
                LogUtil.b("UIHLH_HomeFragment", "mHeadlinesTipsView should gone!");
                qsp.c(HomeFragment.this.af, 8);
            }
        }
    }

    private void ax() {
        if (this.k) {
            ObserverManagerUtil.d(new AnonymousClass3(), "SHOW_HEALTH_HEADLINES_TIPS");
            ObserverManagerUtil.d(new AnonymousClass4(), "HOME_RECYCLE_VIEW_MOVE");
            this.k = false;
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.HomeFragment$4, reason: invalid class name */
    public class AnonymousClass4 implements Observer {
        AnonymousClass4() {
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            if (!njy.c(objArr, 0)) {
                LogUtil.b("UIHLH_HomeFragment", "null args!");
                return;
            }
            Object obj = objArr[0];
            if ((obj instanceof Boolean) && !((Boolean) obj).booleanValue()) {
                HandlerExecutor.c(new Runnable() { // from class: rgt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.a();
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            HomeFragment.this.bj.scrollToPosition(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.af.getLayoutParams();
        int iD = i - qrs.d(this.f25112c, 86.0f);
        if (iD < 0) {
            layoutParams.setMarginStart(i);
            this.af.setBackgroundResource(R.drawable.sleep_toast_bg);
        } else {
            layoutParams.setMarginStart(iD);
            this.af.setBackgroundResource(R.drawable.health_headline_tips);
        }
        layoutParams.topMargin = i2;
        this.af.setLayoutParams(layoutParams);
        this.af.setVisibility(0);
    }

    private void ad() {
        af();
        drl.a(this.f25112c).d();
        t();
        if (!this.bc) {
            az();
        }
        if (this.bc && Utils.h()) {
            xan.a().b();
        }
        n();
        Handler handler = this.h;
        handler.sendMessageDelayed(handler.obtainMessage(FitnessSleepType.HW_FITNESS_WAKE), 1000L);
        ae();
        if (!Utils.m()) {
            ac();
        }
        if (getUserVisibleHint()) {
            if (this.ba == null) {
                this.ba = new soz();
            }
            this.ba.e(this.bc);
            this.ba.b();
        }
        tfh.c(this.f25112c).c(this.h);
        drl.a(this.f25112c).a();
        l();
        ay();
        this.h.sendEmptyMessageDelayed(103, 50L);
        if (getActivity() != null) {
            this.e = qrg.e("FRAGMENT_SHOW_NOVA");
        }
    }

    @Override // com.huawei.ui.commonui.base.FragmentForViewPager
    public void normalOnResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (getUserVisibleHint() && this.ax) {
            qrs.c(this.f25112c, 0);
        }
        qso.d().e(this, this.bi);
        this.ax = true;
        if (getUserVisibleHint()) {
            this.i = ezi.b(4036);
        }
        i();
        ae();
        drl.a(this.f25112c).a();
        l();
        ay();
        this.h.sendEmptyMessageDelayed(103, 50L);
        FunctionMenuCardData functionMenuCardData = this.ac;
        if (functionMenuCardData != null) {
            functionMenuCardData.f();
        }
        ipj.e();
        LogUtil.b("UIHLH_HomeFragment", "normalOnResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void i() {
        boolean z = getUserVisibleHint() || CardFlowInteractors.d(this.f25112c, "HomeCardRefreshIndex", -2) == -1;
        if (fua.q()) {
            if (z) {
                Iterator<AbstractBaseCardData> it = this.w.iterator();
                while (it.hasNext()) {
                    it.next().onResume();
                }
                return;
            } else {
                HomeFragmentUtil.d(this.br);
                HomeFragmentUtil.d(this.ab);
                return;
            }
        }
        if (z) {
            LogUtil.b("UIHLH_HomeFragment", "!mIsFirstCreate");
            swi.c(-1);
            d();
            d(true);
        } else {
            HomeFragmentUtil.d(this.br);
            HomeFragmentUtil.d(this.ab);
        }
        if (!this.bc) {
            HomeFragmentUtil.d(this.an);
        }
        HomeFragmentUtil.d(this.ak);
    }

    @Override // com.huawei.ui.commonui.base.FragmentForViewPager, com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(final boolean z) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LogUtil.b("UIHLH_HomeFragment", "setUserVisibleHint begin, visible:", Boolean.valueOf(z));
        super.setUserVisibleHint(z);
        Iterator<AbstractBaseCardData> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().setUserVisibleHint(z);
        }
        this.n = z;
        this.j = true;
        if (isResumed()) {
            drl.a(this.f25112c).a(z);
        }
        e(z);
        Handler handler = this.h;
        if (handler != null) {
            handler.sendEmptyMessage(103);
        }
        if (getView() != null) {
            fxl.c(getActivity().getWindow().getDecorView(), z, 3001, "Health");
        }
        if (z) {
            this.f25111b = true;
        } else {
            this.f25111b = false;
        }
        d(z);
        new Handler().postDelayed(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.8
            @Override // java.lang.Runnable
            public void run() {
                ObserverManagerUtil.e("HOME_FRAGMENT_IS_VISIBLE_TO_USER", Boolean.valueOf(z));
            }
        }, 500L);
        LogUtil.b("UIHLH_HomeFragment", "setUserVisibleHint finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void d(boolean z) {
        if (this.ac == null) {
            return;
        }
        LogUtil.b("UIHLH_HomeFragment", "handleFunctionMenuGifs isVisibleToUser = ", Boolean.valueOf(z));
        if (z) {
            this.ac.e();
        } else {
            this.ac.g();
        }
    }

    private void e(boolean z) {
        if (z && this.f25112c != null) {
            LogUtil.b("UIHLH_HomeFragment", "load in setUserVisibleHint");
            HomeFragmentUtil.d(this.ah);
            k();
            if (this.ax) {
                qrs.c(this.f25112c, 0);
            }
            this.ax = true;
            this.i = ezi.b(4036);
            if (this.av) {
                LogUtil.b("UIHLH_HomeFragment", "initMarketing in first visible");
                e();
            }
            this.av = false;
            return;
        }
        Handler handler = this.h;
        if (handler != null) {
            handler.removeMessages(FitnessSleepType.HW_FITNESS_WAKE);
        }
    }

    public void a() {
        qsp.c(this.af, 8);
    }

    private void k() {
        HomeFragmentUtil.c(getContext());
    }

    private void ac() {
        if (!CommonUtil.ab(this.f25112c)) {
            LogUtil.b("UIHLH_HomeFragment", "no net to RecommendCloud");
        } else {
            RecommendCloud.getInstance(this.f25112c).doRefreshBatch(new HomeFragmentUtil.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        HomeFragmentUtil.b(this.f25112c);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        Iterator<AbstractBaseCardData> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().onStop();
        }
        LogUtil.b("UIHLH_HomeFragment", "onStop ", this);
    }

    private void bk() {
        bj();
        bh();
        bd();
        bg();
        bl();
        be();
        bi();
        if (this.bc && Utils.h()) {
            xan.a().e();
        }
        BroadcastManagerUtil.b(this.f25112c, this.bn);
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            br();
            WifiScaleMultiUserInteractor wifiScaleMultiUserInteractor = this.bw;
            if (wifiScaleMultiUserInteractor != null) {
                wifiScaleMultiUserInteractor.c();
                this.bw = null;
            }
        }
        fhz.d().n();
        if (CommonUtil.ck()) {
            bo();
            bm();
            bn();
            Handler handler = this.h;
            if (handler != null) {
                handler.removeMessages(9);
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.FragmentForViewPager, androidx.fragment.app.Fragment
    public void onDestroy() {
        HomeFragmentUtil.b bVar;
        super.onDestroy();
        ReleaseLogUtil.c("UIHLH_HomeFragment", "onDestroy ", this);
        j();
        bk();
        drl.a(this.f25112c).e();
        new GuideInteractors(this.f25112c).a((String) null);
        LogUtil.c("UIHLH_HomeFragment", "onDestroy mEventBusCallback ", Boolean.valueOf(this.ad != null));
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false) && (bVar = this.ad) != null) {
            EventBus.a(bVar, "evebus_weight_measure_notification", "multi_user_auto_cancle_dialog");
        }
        if (qst.c()) {
            rod.e().d(getActivity());
        }
        HealthSwipeRefreshLayout healthSwipeRefreshLayout = this.f;
        if (healthSwipeRefreshLayout != null) {
            healthSwipeRefreshLayout.setCallback(null);
            this.f = null;
        }
        HealthRecycleView healthRecycleView = this.bj;
        if (healthRecycleView != null) {
            healthRecycleView.setOnScrollListener(null);
            this.bj = null;
        }
        tfh.c(this.f25112c).c((Handler) null);
        Handler handler = this.h;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.h = null;
        }
        o();
        if (this.ae != null) {
            ltd.e().d(this.ae);
            this.ae = null;
        }
    }

    private void o() {
        this.f25112c = null;
        this.aj = null;
        this.an = null;
        this.ak = null;
        this.bd = null;
        this.l = null;
        this.ab = null;
        this.ac = null;
        this.br = null;
        this.ah = null;
        this.ao = null;
        this.m = null;
        ArrayList<AbstractBaseCardData> arrayList = this.x;
        if (arrayList != null) {
            arrayList.clear();
            this.x = null;
        }
        ArrayList<AbstractBaseCardData> arrayList2 = this.v;
        if (arrayList2 != null) {
            arrayList2.clear();
            this.v = null;
        }
        this.ad = null;
        this.as = null;
        ((TodoDataApi) Services.b("HWUserProfileMgr", TodoDataApi.class)).removeTodoFloatView();
    }

    private void j() {
        if (fua.q()) {
            Iterator<AbstractBaseCardData> it = this.w.iterator();
            while (it.hasNext()) {
                it.next().onDestroy();
            }
        } else {
            HomeFragmentUtil.c(this.f25112c, this.l, this.ab, this.br, this.ah, this.ac, this.bd, this.ao, this.bc, this.aj, this.an, this.m);
        }
        this.aq = false;
    }

    public void d() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HomeFragmentUtil.f(this.f25112c);
        if (fua.b()) {
            int iD = swi.d();
            if (iD == -1) {
                ba();
            } else if (iD == 1) {
                HomeFragmentUtil.d(this.br);
                HomeFragmentUtil.d(this.ab);
            }
        }
        HomeFragmentUtil.a(this.f25112c);
        ReleaseLogUtil.c("UIHLH_HomeFragment", "cardsResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void ba() {
        ReleaseLogUtil.c("UIHLH_HomeFragment", "begin resume");
        b(this.ao);
        b(this.l);
        b(this.ab);
        b(this.br);
        b(this.ah);
        b(this.ac);
        b(this.aj);
        ReleaseLogUtil.c("UIHLH_HomeFragment", "end resume");
    }

    private void b(final AbstractBaseCardData abstractBaseCardData) {
        if (abstractBaseCardData == null) {
            return;
        }
        if (c()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.6
                @Override // java.lang.Runnable
                public void run() {
                    abstractBaseCardData.onResume();
                }
            }, 100L);
        } else {
            abstractBaseCardData.onResume();
        }
    }

    public static void ah(HomeFragment homeFragment) {
        HomeFragmentUtil.c(homeFragment);
    }

    private void c(Intent intent) {
        HomeFragmentUtil.c(intent, this.f25112c, this.at);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void av() {
        LogUtil.b("UIHLH_HomeFragment", "registerWearBroadcast");
        HomeFragmentUtil.j(this.f25112c, this.be);
    }

    private void bo() {
        HomeFragmentUtil.f(this.f25112c, this.be);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aj() {
        HomeFragmentUtil.d(this.f25112c, this.y);
    }

    private void bm() {
        HomeFragmentUtil.e(this.f25112c, this.y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void aw() {
        LogUtil.b("UIHLH_HomeFragment", "enter registerUpgradeBroadcast");
        if (this.f25112c == null) {
            LogUtil.d("UIHLH_HomeFragment", "failed to registerUpgradeBroadcast, cause context is null!");
        } else {
            BroadcastManagerUtil.c(this.f25112c, this.bp, new IntentFilter("com.huawei.bone.action.UPDATE_DEVICE"), LocalBroadcast.f36595c, null);
        }
    }

    private void bn() {
        HomeFragmentUtil.b(this.f25112c, this.bp);
    }

    static class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            HomeFragmentUtil.e(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        HomeFragmentUtil.i(this.f25112c, this.bs);
    }

    private void br() {
        HomeFragmentUtil.h(this.f25112c, this.bs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void an() {
        HomeFragmentUtil.c(this.f25112c, this.r);
    }

    private void bj() {
        HomeFragmentUtil.a(this.f25112c, this.r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, int i) {
        HomeFragmentUtil.c(getActivity(), intent, i, this.f25112c);
    }

    private void l() {
        LogUtil.b("UIHLH_HomeFragment", "checkGpsSwitch");
        if (SyncFitnessPrivateBroadcastReceiver.d()) {
            bc();
        }
    }

    private void bc() {
        LogUtil.b("UIHLH_HomeFragment", "need show gps switch note");
        SyncFitnessPrivateBroadcastReceiver.d(false);
        if (!mwb.b(this.f25112c)) {
            b(R.string.IDS_hw_show_sport_dialog_open_gps_content, 101);
        } else {
            g();
        }
    }

    private void g() {
        if (this.ae == null) {
            this.ae = new b(this.f25112c);
        }
        PermissionUtil.d(getActivity(), PermissionUtil.PermissionType.LOCATION, this.ae);
    }

    private void az() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), nio.a("sIsFirstHealth"));
        final String strE2 = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(CapabilityStatus.AWA_CAP_CODE_WIFI), "familyHealthDialogFrequency");
        if (TextUtils.isEmpty(strE) || !strE.equals("1")) {
            try {
                if (TextUtils.isEmpty(strE2)) {
                    j("-1");
                    LogUtil.b("UIHLH_HomeFragment", "showFamilyHealthDialog updateFamilyHealthDialogTimeAndFrequency: -1");
                } else if ((TextUtils.isEmpty(strE2) || Integer.parseInt(strE2) < 3) && HomeFragmentUtil.d()) {
                    voy.a(new HasFollowListCallBack() { // from class: com.huawei.ui.homehealth.HomeFragment.9
                        @Override // com.huawei.ui.main.stories.healthzone.model.HasFollowListCallBack
                        public void hasFollowList(boolean z) {
                            if (z) {
                                return;
                            }
                            HomeFragment.this.c(strE2);
                        }
                    });
                }
            } catch (NumberFormatException unused) {
                LogUtil.d("UIHLH_HomeFragment", "showFamilyHealthDialog is crash number format exception");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final String str) {
        Handler handler = this.h;
        if (handler == null) {
            LogUtil.e("UIHLH_HomeFragment", "showHomeHealthDialogOnUiThread mHandler is null");
        } else {
            handler.post(new Runnable() { // from class: com.huawei.ui.homehealth.HomeFragment.10
                @Override // java.lang.Runnable
                public void run() {
                    HomeFragment.this.e(str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        View viewInflate = LayoutInflater.from(this.f25112c).inflate(R.layout.dialog_home_health, (ViewGroup) null);
        Context context = getContext();
        d((HealthTextView) viewInflate.findViewById(R.id.home_health_dialog_text), (ImageView) viewInflate.findViewById(R.id.home_health_dialog_img), str);
        CustomViewDialog customViewDialogD = HomeFragmentUtil.a(viewInflate, this.f25112c, context).d();
        if (customViewDialogD.isShowing() || getActivity().isFinishing()) {
            return;
        }
        customViewDialogD.show();
        HomeFragmentUtil.d(this.f25112c, str);
        j(str);
    }

    private void d(HealthTextView healthTextView, ImageView imageView, String str) {
        if (healthTextView == null || imageView == null) {
            return;
        }
        HomeFragmentUtil.d(healthTextView, imageView, str, this.f25112c);
    }

    private void j(String str) {
        LogUtil.b("UIHLH_HomeFragment", "updateFamilyHealthDialogTimeAndFrequency familyHealthDialogFrequency", str);
        HomeFragmentUtil.e(this.f25112c, str);
    }

    private void b(int i, final int i2) {
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f25112c).a(R.string.IDS_device_replace_dialog_title_notification).b(i).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.HomeFragment.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.b("UIHLH_HomeFragment", "showGPSSettingDialog():");
                Intent intent = new Intent();
                intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                try {
                    HomeFragment.this.startActivityForResult(intent, i2);
                } catch (ActivityNotFoundException unused) {
                    intent.setAction("android.settings.SETTINGS");
                    try {
                        HomeFragment.this.startActivityForResult(intent, i2);
                    } catch (Exception unused2) {
                        LogUtil.d("UIHLH_HomeFragment", "startActivity exception");
                    }
                }
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.HomeFragment.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        if (customTextAlertDialogB.isShowing() || getActivity().isFinishing()) {
            return;
        }
        customTextAlertDialogB.show();
    }

    private void ae() {
        LogUtil.b("UIHLH_HomeFragment", "outsideOpenActivityOrAddDevice enter");
        if (HomeFragmentUtil.e()) {
            if (aa()) {
                LogUtil.b("UIHLH_HomeFragment", "outsideOpenActivityOrAddDevice the device is leo");
            } else {
                HomeFragmentUtil.h(this.f25112c);
                this.az = false;
            }
        }
    }

    private boolean aa() {
        this.u = tfn.a().j();
        GuideInteractors guideInteractors = new GuideInteractors(BaseApplication.getContext());
        String strC = guideInteractors.c();
        DeviceInfo deviceInfo = this.u;
        if (deviceInfo != null && e(deviceInfo.getProductType()) && "com.huawei.sim.multisim.MultiSimAuth".equals(strC)) {
            LogUtil.b("UIHLH_HomeFragment", "outsideOpenActivity producttype: ", Integer.valueOf(this.u.getProductType()));
            boolean z = this.u.getDeviceConnectState() == 2;
            this.at = z;
            LogUtil.b("UIHLH_HomeFragment", "outsideOpenActivity mIsConnected: ", Boolean.valueOf(z));
            a(guideInteractors, strC);
            return true;
        }
        if ("com.huawei.sim.esim.view.WirelessManagerActivity".equals(strC) || ComponentInfo.PluginPay_A_31.equals(strC)) {
            guideInteractors.a((String) null);
        }
        return false;
    }

    private boolean e(int i) {
        boolean z = eej.c() != null && eej.c().isSupportNewEsim();
        ReleaseLogUtil.c("UIHLH_HomeFragment", "isSupportNewEsim:", Boolean.valueOf(z), "productType:", Integer.valueOf(i));
        return i == 10 || i == 57 || i == 78 || i == 85 || i == 99 || z;
    }

    private void a(GuideInteractors guideInteractors, String str) {
        if (this.at) {
            HomeFragmentUtil.d(this.f25112c, guideInteractors, str, b(str));
        }
    }

    private boolean b(String str) {
        DeviceCapability deviceCapabilityD = DeviceSettingsInteractors.e(this.f25112c).d();
        this.z = deviceCapabilityD;
        return HomeFragmentUtil.b(false, str, deviceCapabilityD);
    }

    private void z() {
        LogUtil.b("UIHLH_HomeFragment", "openActivity enter");
        LogUtil.b("UIHLH_HomeFragment", "openActivity name:", new GuideInteractors(BaseApplication.getContext()).c());
        if (HomeFragmentUtil.e()) {
            aa();
        }
    }

    public void c(boolean z) {
        this.ar = z;
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || HomeFragment.this.f25112c == null) {
                LogUtil.e("UIHLH_HomeFragment", "SyncCloudDataReceiver onReceive intent is null or context is null");
            } else {
                HomeFragmentUtil.d(HomeFragment.this.f25112c, intent, HomeFragment.this.bl, HomeFragment.this.bo, HomeFragment.this.ab, HomeFragment.this.br, HomeFragment.this.bi);
            }
        }
    }

    static class d implements Consumer<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<HomeFragment> f25128a;

        public d(HomeFragment homeFragment) {
            this.f25128a = new WeakReference<>(homeFragment);
        }

        @Override // androidx.core.util.Consumer
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void accept(Boolean bool) {
            HomeFragment homeFragment = this.f25128a.get();
            if (homeFragment == null) {
                return;
            }
            if (bool == null || homeFragment.ac == null) {
                LogUtil.e("UIHLH_HomeFragment", "isTouchDown or mFunctionMenuCardData is null");
            } else if (bool.booleanValue()) {
                homeFragment.ac.d();
            } else {
                homeFragment.ac.b();
            }
        }
    }

    static class b extends CustomPermissionAction {
        private b(Context context) {
            super(context);
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.b("UIHLH_HomeFragment", "checkGpsPermission onGranted");
        }
    }
}
