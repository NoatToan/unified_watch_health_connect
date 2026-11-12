package com.huawei.ui.homewear21.home;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.datatype.DeviceCommand;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwadpaterhealthmgr.PluginOperationAdapterImpl;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BluetoothSwitchStateUtil;
import com.huawei.hwcloudmodel.model.ecgservice.EcgServiceActivationData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.ScreenshotResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.networkclient.ResultCallback;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.adapter.PluginOperationAdapter;
import com.huawei.operation.operation.PluginOperation;
import com.huawei.operation.utils.Constants;
import com.huawei.sim.strategy.EsimCarrierStrategy;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.activity.pairing.EarphonePairActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.interactors.NotificationPushInteractor;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.device.views.animation.ActivityAnimationCallback;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.action.WearWalletFactoryUtil;
import com.huawei.ui.homewear21.home.adapter.WearHomeCardAdapter;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.card.WearHomeSyncCard;
import com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import defpackage.dwq;
import defpackage.dxy;
import defpackage.eeg;
import defpackage.eei;
import defpackage.eej;
import defpackage.eel;
import defpackage.eey;
import defpackage.erh;
import defpackage.etn;
import defpackage.lmq;
import defpackage.loj;
import defpackage.lsg;
import defpackage.lug;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvj;
import defpackage.lvl;
import defpackage.lvr;
import defpackage.lvv;
import defpackage.lxb;
import defpackage.lzi;
import defpackage.maq;
import defpackage.med;
import defpackage.mfs;
import defpackage.mgh;
import defpackage.mgm;
import defpackage.mhs;
import defpackage.mwb;
import defpackage.mxv;
import defpackage.pxn;
import defpackage.pxy;
import defpackage.qqe;
import defpackage.qre;
import defpackage.qsp;
import defpackage.rcv;
import defpackage.rdj;
import defpackage.rdp;
import defpackage.rdt;
import defpackage.rfn;
import defpackage.rfp;
import defpackage.tfn;
import defpackage.tfp;
import defpackage.tjc;
import defpackage.tkn;
import defpackage.tlo;
import defpackage.tmo;
import defpackage.tnf;
import defpackage.tnt;
import defpackage.tod;
import defpackage.tof;
import defpackage.tog;
import defpackage.toz;
import defpackage.tpl;
import defpackage.tpn;
import defpackage.tqp;
import defpackage.wmq;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CloudUtils;
import health.compact.a.CommonLibUtil;
import health.compact.a.CommonUtil;
import health.compact.a.HEXUtils;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes18.dex */
public class WearHomeOldActivity extends BaseActivity {
    private static final String[] aa = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"};
    private static final String[] ad = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public WearWalletFactoryUtil ab;
    public tod ac;
    private Context ae;
    private WearHomeCardAdapter af;
    private rfn ai;
    private CustomTitleBar aj;
    private Context ak;
    private String al;
    private String am;
    private String an;
    private GuideInteractors ap;
    private String aq;
    private LinearLayout ar;
    private tjc as;
    private String at;
    private boolean aw;
    private boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceSettingsInteractors f26234b;
    private boolean ba;
    private boolean bg;
    private String bh;
    private CustomAlertDialog bi;
    private HealthRecycleView bj;
    private Rect bk;
    private PopViewList bm;
    private tof bo;
    private WechatDeviceProviderHelper bp;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BluetoothSwitchStateUtil f26235c;
    public boolean g;
    public mhs i;
    public lzi j;
    public tlo p;
    public NotificationPushInteractor q;
    public tmo r;
    public tkn s;
    public WearHomeSyncCard v;
    public tog w;
    public tnt x;
    public tnf y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f26233a = "";
    public String n = "";
    public DeviceInfo d = null;
    public DeviceCapability e = null;
    public boolean h = false;
    public boolean k = false;
    public boolean o = false;
    public int f = -1;
    public ExecutorService u = Executors.newCachedThreadPool();
    public boolean m = true;
    private wmq be = null;
    private boolean bb = false;
    private boolean bc = false;
    private lvb ax = null;
    private boolean ay = false;
    public boolean l = false;
    private rdj ag = new rdj();
    private ArrayList<String> ah = new ArrayList<>(16);
    private ArrayList<WearHomeBaseCard> bn = new ArrayList<>(16);
    private toz au = new toz(this);
    private List<EnumDialog> bf = new ArrayList(0);
    private boolean av = true;
    public boolean t = false;
    private final AtomicReference<IBaseResponseCallback> bq = new AtomicReference<>();
    private final BroadcastReceiver ao = new BroadcastReceiver() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            LogUtil.b("MainUI", 0, "WearHomeOldActivity", "mDeviceChangerBroadcastReceiver(): intent is ", intent.getAction());
            try {
                WearHomeOldActivity.this.c(intent);
            } catch (ClassCastException unused) {
                LogUtil.d("WearHomeOldActivity", "ClassCastException");
            }
        }
    };
    private final BroadcastReceiver bd = new BroadcastReceiver() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            LogUtil.b("MainUI", 0, "WearHomeOldActivity", "mNonLocalBroadcastReceiver(): intent is ", intent.getAction());
            if ("broadcast_receiver_user_setting".equals(intent.getAction())) {
                WearHomeOldActivity.this.c(intent.getStringExtra("pairGuideSelectAddress"));
                return;
            }
            if ("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS".equals(intent.getAction())) {
                LogUtil.b("MainUI", 0, "WearHomeOldActivity", "handlePhoneServiceBindSuccess()");
                WearHomeOldActivity.this.d = tfn.a().a(WearHomeOldActivity.this.f26233a);
                if (WearHomeOldActivity.this.d != null) {
                    LogUtil.b("MainUI", 0, "WearHomeOldActivity", "mCurrentDeviceInfo not null");
                    WearHomeOldActivity.this.ah();
                    WearHomeOldActivity.this.bb = true;
                    if (WearHomeOldActivity.this.d.getDeviceConnectState() == 2) {
                        WearHomeOldActivity.this.h = true;
                    }
                    WearHomeOldActivity.this.bl();
                    WearHomeOldActivity wearHomeOldActivity = WearHomeOldActivity.this;
                    wearHomeOldActivity.f26233a = wearHomeOldActivity.d.getDeviceIdentify();
                    WearHomeOldActivity.this.ar();
                    WearHomeOldActivity.this.v();
                    return;
                }
                return;
            }
            if ("com.huawei.bone.action.DEVICE_UPGRADING".equals(intent.getAction())) {
                WearHomeOldActivity.this.as();
                return;
            }
            if ("com.huawei.bone.action.open_gps".equals(intent.getAction())) {
                WearHomeOldActivity.this.ay();
                abortBroadcast();
                return;
            }
            if ("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE".equals(intent.getAction())) {
                if (!WearHomeOldActivity.this.t) {
                    String stringExtra = intent.getStringExtra("DEVICE_SECURITY_UUID");
                    LogUtil.b("WearHomeOldActivity", "mNonLocalBroadcastReceiver SYSTEM_BLUETOOTH_UNBIND_DEVICE securityUuid: ", CommonUtil.n(stringExtra));
                    if (WearHomeOldActivity.this.d == null || stringExtra == null || !stringExtra.equals(WearHomeOldActivity.this.d.getUnConvertedUdid())) {
                        return;
                    }
                    ReleaseLogUtil.d("R_WearHomeOldActivity", "mNonLocalBroadcastReceiver SYSTEM_BLUETOOTH_UNBIND_DEVICE");
                    WearHomeOldActivity.this.finish();
                    return;
                }
                WearHomeOldActivity.this.t = false;
                if (WearHomeOldActivity.this.x != null) {
                    String str = WearHomeOldActivity.this.f26233a;
                    WearHomeOldActivity wearHomeOldActivity2 = WearHomeOldActivity.this;
                    rdp.a(str, wearHomeOldActivity2, wearHomeOldActivity2.d.getDeviceBluetoothType());
                }
            }
        }
    };
    private ActivityAnimationCallback z = new ActivityAnimationCallback() { // from class: thm
        @Override // com.huawei.ui.device.views.animation.ActivityAnimationCallback
        public final void onProcessExit(boolean z) {
            this.f49131a.d(z);
        }
    };
    private BroadcastReceiver bl = new BroadcastReceiver() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.b("WearHomeOldActivity", "TopClickReceiver onReceive()");
            if (WearHomeOldActivity.this.bj != null) {
                WearHomeOldActivity.this.bj.scrollToPosition(0);
            }
        }
    };

    public enum EnumDialog {
        RATE
    }

    public /* synthetic */ void d(boolean z) {
        LogUtil.b("WearHomeOldActivity", "mAnimationHelper onExitAnimationEnd mIsOnBackPressed:", Boolean.valueOf(this.az), "  mIsFromWear:" + this.ay);
        if (this.az && this.ay) {
            aj();
        }
        this.ai = null;
        if (z) {
            overridePendingTransition(R.anim.activity_no_animation, R.anim.activity_no_animation);
            bj();
        }
        finishAndRemoveTask();
        LogUtil.b("WearHomeOldActivity", "mAnimationHelper onExitAnimationEnd");
    }

    public Handler d() {
        return this.au;
    }

    public WechatDeviceProviderHelper c() {
        return this.bp;
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle != null && (Build.VERSION.SDK_INT == 29 || Build.VERSION.SDK_INT == 28)) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        super.onCreate(bundle);
        this.ab = new WearWalletFactoryUtil(this);
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "Enter onCreateView time:", Long.valueOf(System.currentTimeMillis()));
        setContentView(R.layout.wear_home_main_card_layout);
        z();
        mfs.c(this, -1);
        if (Utils.h() && !LoginInit.getInstance(this.ak).getIsLogined()) {
            CommonLibUtil.d(this.ak);
        }
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.b("WearHomeOldActivity", "Action is not wanted and no confirm privacy.");
            aj();
        }
        try {
            ae();
        } catch (Exception unused) {
            LogUtil.d("WearHomeOldActivity", "Exception");
            finish();
        }
        ad();
    }

    public void k() {
        tnf tnfVar = this.y;
        if (tnfVar != null) {
            tnfVar.b();
        }
    }

    private void ad() {
        ai();
        y();
        t();
        ag();
        this.af = new WearHomeCardAdapter(this.ak, this.bn);
        af();
        this.bj.getRecycledViewPool().clear();
        u();
        tqp.e(this.ak, this.ao, 800, "com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        tqp.c(this.ak, this.bd, "com.huawei.bone.action.open_gps", "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS", "broadcast_receiver_user_setting", "com.huawei.bone.action.DEVICE_UPGRADING", "com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE");
        this.f26235c = new BluetoothSwitchStateUtil(this.ak);
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "Leave onCreateView time:", Long.valueOf(System.currentTimeMillis()));
        if (this.bg) {
            LogUtil.b("WearHomeOldActivity", "mIsSmartLifeOperationDelete is true");
            this.s.c();
        } else {
            LogUtil.b("WearHomeOldActivity", "mIsSmartLifeOperationDelete is false");
        }
        this.s.k();
        ap();
        this.v.e(new View.OnClickListener() { // from class: tic
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49146a.a(view);
            }
        });
        tqp.e(this.ak, this.f26233a, getIntent());
        tqp.e(this.d);
    }

    public /* synthetic */ void a(View view) {
        this.v.setVisibility(8);
    }

    private void ap() {
        if (this.g && this.bk != null) {
            getWindow().setBackgroundDrawableResource(R.color.common_transparent);
        } else {
            getWindow().setBackgroundDrawableResource(R.color.colorBackground);
        }
        tqp.d(this.ak, this.d);
    }

    private void ai() {
        this.aj = (CustomTitleBar) qsp.a(this, R.id.wear_home_titlebar);
        this.bj = (HealthRecycleView) qsp.a(this, R.id.recyclerView);
        this.v = (WearHomeSyncCard) qsp.a(this, R.id.sync_card_view);
        this.e = this.f26234b.e(this.f26233a);
        this.aj.setTitleTextColor(getResources().getColor(R.color.textColorPrimary));
        this.aj.setRightButtonVisibility(0);
        this.aj.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_more), qre.f(R.string.accessibility_more_item));
        this.aj.setTitleBarBackgroundColor(this.ak.getResources().getColor(R.color.colorSubBackground));
        this.aj.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: thu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        a(false);
    }

    public void m() {
        View viewInflate = View.inflate(this.ak, R.layout.restore_factory_empty_page_layout, null);
        addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.restore_factory_empty_waiting_content);
        this.ar = linearLayout;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.ar.setLayoutParams(layoutParams);
        b(false);
    }

    public void b(boolean z) {
        LinearLayout linearLayout = this.ar;
        if (linearLayout == null) {
            LogUtil.d("WearHomeOldActivity", "mEmptyWaitingLayout is null");
        } else if (z) {
            linearLayout.setVisibility(0);
        } else {
            linearLayout.setVisibility(8);
        }
    }

    private void a(boolean z) {
        LogUtil.b("WearHomeOldActivity", "exitActivity isBackPressed:", Boolean.valueOf(z), ", mAnimationObject:", this.ai, ", mIsFromSmartLife:", Boolean.valueOf(this.g));
        this.m = true;
        this.az = z;
        if (this.ai != null && (this.g || this.aw)) {
            this.m = false;
            finish();
        } else {
            if (z) {
                if (this.ay) {
                    aj();
                }
                bj();
                super.onBackPressed();
                return;
            }
            bj();
            finish();
        }
    }

    private void bj() {
        if (this.g && this.bk == null) {
            LogUtil.e("WearHomeOldActivity", "toBackAndRemoveMap params valid");
        } else if (isTaskRoot()) {
            moveTaskToBack(this.g);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
        LogUtil.b("WearHomeOldActivity", "onConfigurationChanged");
        tmo tmoVar = this.r;
        if (tmoVar != null) {
            tmoVar.f();
        }
        DeviceInfo deviceInfoA = tfn.a().a(this.f26233a);
        if (deviceInfoA != null && deviceInfoA.getDeviceConnectState() == 2) {
            if (WatchFaceUtil.isSupportWatchFaceMarket()) {
                LogUtil.b("WearHomeOldActivity", "init watchface market");
                tqp.g(BaseApplication.getContext());
                return;
            }
            return;
        }
        LogUtil.e("WearHomeOldActivity", "deviceInfo is not connected");
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void loadApplicationTheme() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                this.g = intent.getBooleanExtra("FROM_SMART_LIFE", false);
                this.bk = intent.getSourceBounds();
            } catch (Exception unused) {
                LogUtil.d("WearHomeOldActivity", "loadApplicationTheme Exception");
            }
            if (this.g && this.bk != null) {
                LogUtil.b("WearHomeOldActivity", "loadApplicationTheme from smartLift");
                tqp.e(this, 2);
                return;
            } else {
                tqp.e(this, 1);
                return;
            }
        }
        tqp.e(this, 1);
    }

    private void z() {
        this.ak = this;
        lvi.i();
        tog.e();
        Context context = BaseApplication.getContext();
        this.ae = context;
        this.f26234b = DeviceSettingsInteractors.e(context);
        this.q = new NotificationPushInteractor(this.ae);
        this.j = lzi.a();
        this.s = new tkn(this.ak, this);
        this.i = mhs.a();
        this.ap = new GuideInteractors(this.ae);
        this.be = wmq.a(this.ak.getApplicationContext());
    }

    private void n() {
        if (loj.c(36) && tqp.j()) {
            DeviceInfo deviceInfo = this.d;
            if (deviceInfo != null && !lvi.a(deviceInfo.getProductType()).ah()) {
                LogUtil.b("WearHomeOldActivity", "hide hotline");
            } else {
                String string = BaseApplication.getContext().getString(R.string.IDS_settings_service_call_item);
                this.al = string;
                this.ah.add(string);
            }
        }
        if (loj.c(29)) {
            if (eei.d(this.d)) {
                this.an = BaseApplication.getContext().getString(R.string.IDS_main_discovery_tab_service_honor_club);
            } else {
                this.an = BaseApplication.getContext().getString(R.string.IDS_my_huawei_club);
            }
            DeviceInfo deviceInfo2 = this.d;
            if (deviceInfo2 != null && !lvi.a(deviceInfo2.getProductType()).ae()) {
                LogUtil.b("WearHomeOldActivity", "hide huafen");
            } else {
                this.ah.add(this.an);
            }
        }
    }

    private void l() {
        LogUtil.b("WearHomeOldActivity", "enter addDetectionItem");
        if (this.h || !tqp.h()) {
            return;
        }
        LogUtil.b("WearHomeOldActivity", "show detection entrance");
        String string = BaseApplication.getContext().getString(R.string.IDS_wear_diagnostic_analysis);
        this.aq = string;
        this.ah.add(string);
    }

    private void t() {
        this.am = BaseApplication.getContext().getString(R.string.IDS_device_wear_home_delete_device);
        this.ah.clear();
        this.ah.add(this.am);
        n();
        if (this.d != null && etn.d(BaseApplication.getContext()) && lvi.l(this.d.getProductType())) {
            Context context = this.ak;
            if (SharedPreferenceManager.c(context, LoginInit.getInstance(context).getAccountInfo(1011))) {
                String string = BaseApplication.getContext().getString(R.string.IDS_honor_privacy);
                this.at = string;
                this.ah.add(string);
            }
        }
        p();
        l();
        this.aj.setRightButtonOnClickListener(new View.OnClickListener() { // from class: thj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49128c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        rdt.e(1);
        PopViewList popViewList = new PopViewList(this.ak, this.aj, this.ah, al(), this.h);
        this.bm = popViewList;
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: tib
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public final void setOnClick(int i) {
                this.f49145c.e(i);
            }
        });
    }

    public /* synthetic */ void e(int i) {
        if (i < 0 || i >= this.ah.size()) {
            LogUtil.e("WearHomeOldActivity", "position out of size");
            return;
        }
        String str = this.ah.get(i);
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("WearHomeOldActivity", "type is null");
            return;
        }
        if (str.equals(this.am)) {
            SharedPreferenceManager.a(Integer.toString(1000), "wearable_unpair_reconnection", false);
            rdt.e(2);
            this.s.a();
            return;
        }
        if (str.equals(this.al)) {
            q();
            return;
        }
        if (str.equals(this.an)) {
            LogUtil.b("WearHomeOldActivity", "hua fen");
            this.s.f();
            return;
        }
        if (str.equals(this.bh)) {
            LogUtil.b("WearHomeOldActivity", "legal information");
            this.s.e(this.f26233a, this.aj.getViewTitle().getText().toString(), this.d);
        } else if (str.equals(this.at)) {
            this.s.d();
        } else if (!str.equals(this.aq)) {
            LogUtil.e("WearHomeOldActivity", "popViewList setOnClick other");
        } else {
            this.s.d("REMOTE_TYPE");
        }
    }

    private void q() {
        LogUtil.b("WearHomeOldActivity", "callHotline isHonorDevice: ", Boolean.valueOf(eei.d(this.d)));
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "call hotline");
        this.s.a(eei.d(this.d));
    }

    private void p() {
        if (this.e == null || !al()) {
            return;
        }
        String string = BaseApplication.getContext().getString(R.string.IDS_setting_wearhome_legal_information);
        this.bh = string;
        this.ah.add(string);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        LogUtil.b("WearHomeOldActivity", "Enter onActivityResult()");
        super.onActivityResult(i, i2, intent);
        LogUtil.b("WearHomeOldActivity", "data:", intent);
        if (intent != null) {
            boolean booleanExtra = intent.getBooleanExtra("revoke_honor_privacy", false);
            LogUtil.b("WearHomeOldActivity", "isRevokeDevicePrivacy:", Boolean.valueOf(booleanExtra));
            if (booleanExtra) {
                this.s.l();
                dwq.c(false);
            }
        }
        if (i == 3001) {
            if (i2 == -1) {
                a(0);
                lvj.c();
                lvj.c("0");
                this.au.sendEmptyMessageDelayed(300005, 2000L);
            } else {
                a(1);
                lvj.c();
                lvj.c("1");
            }
        }
        c(i, i2, intent);
        b(i, i2, intent);
    }

    protected void c(int i, int i2, Intent intent) {
        if (i == 1099 && i2 == -1) {
            this.r.a(false);
            if (intent == null || !intent.getBooleanExtra("cuccAgreementAgree", false)) {
                return;
            }
            b(true);
            EsimCarrierStrategy esimCarrierStrategyB = pxn.e().b(this.ak, this.au);
            if (esimCarrierStrategyB instanceof pxy) {
                ((pxy) esimCarrierStrategyB).a(i, intent);
            }
        }
    }

    protected void b(int i, int i2, Intent intent) {
        if (i == 608) {
            ReleaseLogUtil.c("R_WearHomeOldActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            if (i2 == -1) {
                tnt tntVar = this.x;
                if (tntVar != null) {
                    tntVar.g();
                } else {
                    ReleaseLogUtil.c("R_WearHomeOldActivity", "mWearHomeTipCard is null");
                }
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                ReleaseLogUtil.c("R_WearHomeOldActivity", "setString SENSITIVE_PERMISSION_STATUS restart");
                tqp.e(this.f26233a, intent);
                k();
                return;
            }
            tnt tntVar2 = this.x;
            if (tntVar2 != null) {
                tntVar2.c();
                return;
            }
            return;
        }
        mgh.a(i, i2, intent, this.d);
    }

    private boolean al() {
        DeviceCapability deviceCapabilityE = this.f26234b.e(this.f26233a);
        if (deviceCapabilityE != null) {
            return deviceCapabilityE.isSupportLegalOpenSource() || deviceCapabilityE.isSupportLegalUserAgreement() || deviceCapabilityE.isSupportLegalPrivacy() || deviceCapabilityE.isSupportLegalServiceStatement() || deviceCapabilityE.isSupportLegalSourceStatement() || deviceCapabilityE.isSupportLegalSystemWebView() || deviceCapabilityE.isSupportHarmonyAgreement();
        }
        LogUtil.e("WearHomeOldActivity", "isSupportLegal deviceCapability is null");
        return false;
    }

    private void y() {
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo != null) {
            this.f26233a = deviceInfo.getDeviceIdentify();
            this.n = this.d.getSecurityUuid();
            bl();
            this.h = this.d.getDeviceConnectState() == 2;
            this.f = this.d.getProductType();
            LogUtil.b("MainUI", 0, "WearHomeOldActivity", "Enter onCreateView mIsConnected:", Boolean.valueOf(this.h), " state:", Integer.valueOf(this.d.getDeviceConnectState()));
        }
    }

    private void af() {
        this.bj.setLayoutManager(new LinearLayoutManager(this));
        this.bj.setAdapter(this.af);
        this.bj.b(false);
        this.bj.e(false);
        this.bj.setLayerType(2, null);
        this.bj.setItemAnimator(new DefaultItemAnimator());
    }

    private void ag() {
        this.y = new tnf(this.ak, this);
        this.bo = new tof(this.ak, this);
        this.ac = new tod(this, this.f26233a);
        this.p = new tlo(this.ak, this);
        tjc tjcVar = new tjc(this.ak, this);
        this.as = tjcVar;
        this.r = new tmo(this.ak, this, tjcVar);
        this.bn.add(this.y);
        this.bn.add(this.bo);
        this.bn.add(this.ac);
        this.bn.add(this.p);
        this.bn.add(this.r);
        LogUtil.b("WearHomeOldActivity", "initCardConstructor end, activity: ", this, ", mWearHomeGeneralCard: ", this.r);
    }

    public void a(int i) {
        this.bj.setAdapter(this.af);
        this.v.setVisibility(0);
        this.v.d(i);
        boolean z = i == 2;
        this.l = z;
        ReleaseLogUtil.c("R_WearHomeOldActivity", ", isSyncingAccount = ", Boolean.valueOf(z));
    }

    public void i() {
        LogUtil.b("WearHomeOldActivity", "refreshTipCard");
        if (this.x == null) {
            this.x = new tnt(this.ak, this);
        }
        if (!this.bn.contains(this.x)) {
            this.bn.add(0, this.x);
        }
        b(this.x);
        this.bn.remove(this.w);
        this.af.e(this.bn);
        this.af.notifyDataSetChanged();
    }

    private void ak() {
        LogUtil.b("WearHomeOldActivity", "refreshPermissionTipCard");
        if (this.w == null) {
            this.w = new tog(this.ak, this);
        }
        if (!this.bn.contains(this.w)) {
            this.bn.add(0, this.w);
        }
        b(this.w);
        this.bn.remove(this.x);
        this.af.e(this.bn);
        this.af.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ah() {
        LogUtil.b("WearHomeOldActivity", "initOperationAdapter.");
        if (PluginOperation.getInstance(this.ak).getAdapter() instanceof PluginOperationAdapter) {
            return;
        }
        LogUtil.b("WearHomeOldActivity", "initOperationAdapter, adapter is null.");
        PluginOperation pluginOperation = PluginOperation.getInstance(this.ak);
        pluginOperation.setAdapter(PluginOperationAdapterImpl.getInstance(this.ak));
        pluginOperation.init(this.ak);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        LogUtil.b("WearHomeOldActivity", "onResume. activity: ", this);
        this.av = true;
        BroadcastManagerUtil.c(this.ak, this.bl, new IntentFilter(Constants.CLICK_STATUS_BAR_ACTION), Constants.SYSTEM_UI_PERMISSION, null);
        super.onResume();
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo != null) {
            this.h = deviceInfo.getDeviceConnectState() == 2;
        }
        if (CloudUtils.a()) {
            bi();
        }
        ar();
        ac();
        ab();
        v();
        if (this.bq.get() != null) {
            this.bq.get().a(0, null);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.av = false;
        unregisterReceiver(this.bl);
    }

    private void ac() {
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo != null && deviceInfo.getDeviceConnectState() == 2 && this.av && maq.b().c(this.f26233a) != 6 && this.o) {
            d().sendEmptyMessage(1004);
        }
    }

    private void ab() {
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo == null) {
            LogUtil.e("WearHomeOldActivity", "getWheelSize mCurrentDeviceInfo is null.");
            return;
        }
        boolean z = deviceInfo.getDeviceConnectState() == 2;
        boolean zD = eey.d(this.d, 98);
        if (z && this.av && maq.b().c(this.f26233a) != 6 && zD) {
            LogUtil.b("WearHomeOldActivity", "Support getWheelSize.");
            am();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ar() {
        this.e = this.f26234b.e(this.f26233a);
        bc();
        as();
        x();
        aq();
        av();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bh() {
        az();
        au();
        bf();
        bd();
        ThreadPoolManager.c().execute(new Runnable() { // from class: thq
            @Override // java.lang.Runnable
            public final void run() {
                this.e.h();
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "onBackPressed mIsFromWear", Boolean.valueOf(this.ay));
        a(true);
    }

    @Override // android.app.Activity
    public void finish() {
        if (!this.m) {
            LogUtil.b("WearHomeOldActivity", "finish mAnimationObject:", this.ai, ", mIsFromSmartLife:", Boolean.valueOf(this.g), ",mIsFromDisConnect:", Boolean.valueOf(this.aw));
            rfn rfnVar = this.ai;
            if (rfnVar != null && (this.g || this.aw)) {
                rfnVar.e(this.z);
            } else {
                be();
            }
            this.m = true;
            return;
        }
        be();
    }

    private void be() {
        super.finish();
        tqp.c(this.ak);
    }

    public void d(Class<?> cls) {
        try {
            this.ak.startActivity(new Intent(this.ak, cls));
        } catch (ActivityNotFoundException unused) {
            LogUtil.d("WearHomeOldActivity", "ActivityNotFoundException classType");
        }
    }

    public void a(Class<?> cls, int i) {
        Intent intent = new Intent(this.ak, cls);
        intent.putExtra("device_id", this.f26233a);
        startActivityForResult(intent, i);
    }

    private void bc() {
        String sharedPreference;
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo == null || !eey.d(deviceInfo, 45)) {
            LogUtil.e("WearHomeOldActivity", "showFirstEcgServiceDialog not support.");
            return;
        }
        boolean zA = this.ap.a();
        lvb lvbVar = this.ax;
        if (lvbVar == null) {
            sharedPreference = "";
        } else {
            sharedPreference = lvbVar.getSharedPreference("KEY_SHOW_ECG_SERVICE_ACTIVATION_TIP_FLAG");
        }
        boolean zEquals = TextUtils.equals("-1", sharedPreference);
        LogUtil.b("WearHomeOldActivity", "showFirstEcgServiceDialog isFromPairSuccess:", Boolean.valueOf(zA), " isNeedShowEcgTip:", Boolean.valueOf(!zEquals), " isOversea:", Boolean.valueOf(Utils.o()));
        if (!zA || zEquals || Utils.o()) {
            return;
        }
        lvr.a().c(new IBaseResponseCallback() { // from class: thx
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.e(i, obj);
            }
        }, this.d);
    }

    public /* synthetic */ void e(int i, Object obj) {
        if (!(obj instanceof EcgServiceActivationData)) {
            LogUtil.b("WearHomeOldActivity", "handleShowEcgService object error.");
            return;
        }
        EcgServiceActivationData ecgServiceActivationData = (EcgServiceActivationData) obj;
        if (ecgServiceActivationData.getStatus() == 0 || (ecgServiceActivationData.getStatus() == 1 && ecgServiceActivationData.getProbationUser() == 0)) {
            LogUtil.b("WearHomeOldActivity", "handleShowEcgService show FirstEcgServiceDialog.");
            toz tozVar = this.au;
            if (tozVar != null) {
                tozVar.sendEmptyMessage(1034);
            }
        }
    }

    private void az() {
        boolean zA = this.ap.a();
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "Enter onResume private void showRateReminderDialog() is ", Boolean.valueOf(zA));
        if (zA) {
            a(EnumDialog.RATE);
        }
    }

    private void au() {
        if (this.d == null) {
            LogUtil.b("MainUI", 0, "WearHomeOldActivity", "mCurrentDeviceInfo is null");
            return;
        }
        boolean zE = this.ap.e();
        boolean zK = lvi.k(this.d.getProductType());
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "showEarMuffReminderDialog isFromPairSuccess:", Boolean.valueOf(zE), "isSupportEarMuff:", Boolean.valueOf(zK));
        if (zE) {
            this.ap.c(false);
            if (zK) {
                this.s.g();
            }
        }
    }

    private void b(final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        DeviceInfo deviceInfo = this.d;
        final String strD = Sha256.d(deviceInfo == null ? this.f26233a : deviceInfo.getDeviceIdentify(), "SHA-256");
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + strD))) {
            LogUtil.e("WearHomeOldActivity", "showPermissionDialog has shown");
            ThreadPoolManager.c().execute(new Runnable() { // from class: thl
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.g();
                }
            });
            return;
        }
        if (this.bi == null) {
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.ak);
            builder.d(R.string.IDS_device_page_permission_tip).a(R.string.IDS_emergency_cancel, new DialogInterface.OnClickListener() { // from class: thn
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f49132a.c(strD, onClickListener2, dialogInterface, i);
                }
            });
            builder.e(false).d(R.string.IDS_apply_permission, new DialogInterface.OnClickListener() { // from class: ths
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.e.a(strD, onClickListener, dialogInterface, i);
                }
            }).a(w());
            this.bi = builder.b();
        }
        this.bi.show();
    }

    public /* synthetic */ void c(String str, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        LogUtil.b("WearHomeOldActivity", "showPermissionDialog cancel");
        SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + str, "device_permission_tip_", new StorageParams());
        a("deny");
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
        bb();
    }

    public /* synthetic */ void a(String str, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        LogUtil.b("WearHomeOldActivity", "showPermissionDialog apply");
        SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + str, "device_permission_tip_", new StorageParams());
        a("agree");
        onClickListener.onClick(dialogInterface, i);
        bb();
    }

    private View w() {
        View viewInflate = View.inflate(this, R.layout.dialog_permission_tip, null);
        if (viewInflate != null) {
            HealthTextView healthTextView = (HealthTextView) qsp.a(viewInflate, R.id.tv_device_permission_description);
            View viewA = qsp.a(viewInflate, R.id.ll_calendar);
            int i = R.string.device_permission_description_oversea;
            if (healthTextView != null) {
                healthTextView.setText(i);
            }
            if (viewA != null) {
                viewA.setVisibility(0);
            }
        }
        return viewInflate;
    }

    public void a(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("keyWords", str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_PERMISSION_2129040.value(), linkedHashMap);
    }

    private void bd() {
        LogUtil.b("WearHomeOldActivity", "showXiaoYiDialog enter.");
        if (CommonUtil.bg()) {
            if (this.d == null) {
                LogUtil.b("WearHomeOldActivity", "mCurrentDeviceInfo is null");
                return;
            }
            boolean zF = this.ap.f();
            ReleaseLogUtil.c("R_WearHomeOldActivity", "showXiaoYiDialog isFromPairSuccess: " + zF);
            if (zF) {
                this.ap.j(false);
                this.s.d((Activity) null, (DeviceInfo) null);
            }
        }
    }

    private void bf() {
        if (this.d == null) {
            return;
        }
        boolean zH = this.ap.h();
        String strD = erh.d(this.d.getDeviceIdentify());
        if (this.ap.d(strD)) {
            LogUtil.b("WearHomeOldActivity", "transfer data to new version");
            this.ap.c(strD);
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10005), strD);
        }
        boolean zD = this.ap.d("keyUserGuidePage" + strD);
        LogUtil.b("WearHomeOldActivity", "Enter onResume private void showUserGuidDialog() is ", Boolean.valueOf(zH), "showUserGuideFlagValue is", Boolean.valueOf(zD));
        if (zH || !zD) {
            this.ap.a(false);
            this.s.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ba, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void h() {
        boolean zE = this.ap.e(this.f26233a);
        ReleaseLogUtil.c("R_WearHomeOldActivity", "Enter onResume isShowSyncAccount is ", Boolean.valueOf(zE));
        if (zE) {
            runOnUiThread(new Runnable() { // from class: tht
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49137c.f();
                }
            });
        }
    }

    private void a(EnumDialog enumDialog) {
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "dialogMessage Enter addNewMessage:", enumDialog, " mMessageListEnum.size():", Integer.valueOf(this.bf.size()));
        if (enumDialog.ordinal() == 0) {
            this.bf.add(enumDialog);
            if (this.bf.size() == 1) {
                aw();
                return;
            }
            return;
        }
        LogUtil.e("WearHomeOldActivity", "no need Deal other msg.");
    }

    private void aw() {
        this.ap.b(false);
        this.s.b(this.f26233a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: at, reason: merged with bridge method [inline-methods] */
    public void f() {
        this.s.j();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity
    public void initViewTahiti() {
        this.ac.b();
        this.p.m();
        this.r.e();
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b("WearHomeOldActivity", "onDestroy. activity: ", this);
        this.au.removeCallbacksAndMessages(null);
        this.au = null;
        tqp.d(this.ak, this.ao);
        tqp.d(this.ak, this.bd);
        BluetoothSwitchStateUtil bluetoothSwitchStateUtil = this.f26235c;
        if (bluetoothSwitchStateUtil != null) {
            bluetoothSwitchStateUtil.a();
        }
        WechatDeviceProviderHelper wechatDeviceProviderHelper = this.bp;
        if (wechatDeviceProviderHelper != null) {
            wechatDeviceProviderHelper.e();
        }
        an();
        this.y = null;
        this.bo = null;
        this.ac = null;
        this.p = null;
        this.r = null;
        this.x = null;
        this.w = null;
        this.s.o();
        this.s.m();
        this.u.shutdown();
        med.c().b();
    }

    private void an() {
        a(this.y);
        a(this.bo);
        a(this.ac);
        a(this.p);
        a(this.r);
        a(this.x);
        a(this.w);
    }

    private void a(WearHomeBaseCard wearHomeBaseCard) {
        if (wearHomeBaseCard != null) {
            wearHomeBaseCard.onDestroy();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        Intent intent2;
        super.onNewIntent(intent);
        if (intent == null) {
            return;
        }
        if ((this.ba || intent.getBooleanExtra("FROM_APP_HOME_PAGE_TYPE", false)) && (intent2 = getIntent()) != null) {
            String stringExtra = intent2.getStringExtra("device_id");
            ReleaseLogUtil.c("R_WearHomeOldActivity", "onNewIntent mIsRequestPermissionNow:", Boolean.valueOf(this.ba), " deviceId:", stringExtra);
            if (!TextUtils.isEmpty(stringExtra) && stringExtra.equals(intent.getStringExtra("device_id"))) {
                return;
            }
        }
        setIntent(intent);
        finish();
        overridePendingTransition(0, 0);
        if (intent.getComponent() != null) {
            ReleaseLogUtil.c("R_WearHomeOldActivity", "onNewIntent:", intent.getComponent().getClassName());
        }
        intent.setClass(this, WearHomeOldActivity.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void as() {
        b(this.w);
        b(this.y);
        b(this.ac);
        b(this.p);
        b(this.r);
    }

    private void b(WearHomeBaseCard wearHomeBaseCard) {
        if (wearHomeBaseCard != null) {
            wearHomeBaseCard.onResume();
        }
    }

    private void b(int i) {
        d(this.y, i);
        d(this.ac, i);
        d(this.p, i);
        d(this.r, i);
        d(this.x, i);
        d(this.w, i);
    }

    private void d(WearHomeBaseCard wearHomeBaseCard, int i) {
        if (wearHomeBaseCard != null) {
            wearHomeBaseCard.deviceConnectionChange(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bl() {
        ReleaseLogUtil.c("R_WearHomeOldActivity", "enter updateTitle");
        ThreadPoolManager.c().execute(new Runnable() { // from class: thp
            @Override // java.lang.Runnable
            public final void run() {
                this.f49134b.j();
            }
        });
    }

    public /* synthetic */ void j() {
        final boolean zK;
        ReleaseLogUtil.c("R_WearHomeOldActivity", "updateTitle subThread");
        ArrayList<dxy> arrayListJ = lvl.j();
        if (arrayListJ == null || arrayListJ.size() <= 0) {
            zK = true;
        } else {
            for (dxy dxyVar : arrayListJ) {
                if (dxyVar.d().equals(this.f26233a)) {
                    zK = dxyVar.k();
                }
            }
            zK = true;
        }
        ReleaseLogUtil.c("R_WearHomeOldActivity", "isOnlyOneWearableDevice:", Boolean.valueOf(zK));
        runOnUiThread(new Runnable() { // from class: thk
            @Override // java.lang.Runnable
            public final void run() {
                this.f49129b.e(zK);
            }
        });
    }

    public /* synthetic */ void e(boolean z) {
        ReleaseLogUtil.c("R_WearHomeOldActivity", "updateTitle MainThread");
        String strB = tqp.b(this.ak, this.f26233a, z);
        ReleaseLogUtil.c("R_WearHomeOldActivity", "titleName:", strB);
        this.aj.setTitleText(strB);
    }

    private void ae() {
        Intent intent = getIntent();
        if (intent == null) {
            return;
        }
        if (intent.hasExtra("watch_face_service_flag")) {
            LogUtil.e("WearHomeOldActivity", "watch face service flag");
            return;
        }
        String stringExtra = intent.getStringExtra("device_id");
        this.f26233a = stringExtra;
        if (stringExtra == null) {
            String stringExtra2 = intent.getStringExtra("DEVICE_ID");
            this.f26233a = stringExtra2;
            if (!TextUtils.isEmpty(stringExtra2)) {
                this.f26233a = lmq.b(this.f26233a);
            } else {
                this.f26233a = "";
            }
        }
        this.g = intent.getBooleanExtra("FROM_SMART_LIFE", false);
        this.bg = intent.getBooleanExtra("Delete", false);
        if (TextUtils.isEmpty(this.f26233a)) {
            LogUtil.e("WearHomeOldActivity", "mac is empty");
            this.d = tfn.a().j();
        } else {
            this.d = tfn.a().a(this.f26233a);
        }
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo != null) {
            ReleaseLogUtil.c("R_WearHomeOldActivity", "initParams mCurrentDeviceInfo deviceName:", CommonUtil.n(deviceInfo.getDeviceName()), " Identify:", CommonUtil.n(this.d.getDeviceIdentify()), " ProductType:", Integer.valueOf(this.d.getProductType()));
            this.f26233a = this.d.getDeviceIdentify();
            this.bb = true;
            this.k = this.d.getPowerSaveModel() == 1;
            this.o = eey.d(this.d, 78);
            if (!Utils.o() && !LoginInit.getInstance(BaseApplication.getContext()).isKidAccount()) {
                this.bp = new WechatDeviceProviderHelper(this.d, this.au);
            }
        }
        this.ax = lvb.e();
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "isCheckEnableDevice:", Boolean.valueOf(tfn.a().c()));
        b(intent);
    }

    private void b(Intent intent) {
        DeviceInfo deviceInfo;
        try {
            this.ay = intent.getBooleanExtra("mIsFromWear", false);
            if ("com.huawei.iconnect.action.SHOW_DEVICE".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("DEVICE_NAME");
                if (stringExtra != null && (deviceInfo = this.d) != null && !stringExtra.equals(deviceInfo.getDeviceName())) {
                    LogUtil.b("WearHomeOldActivity", "not the wanted device");
                    finish();
                } else if (stringExtra == null) {
                    LogUtil.e("WearHomeOldActivity", "intent.getAction() is else,");
                } else if (!AuthorizationUtils.c(BaseApplication.getContext())) {
                    LogUtil.b("WearHomeOldActivity", "not confirm privacy");
                    aj();
                }
            } else if (!AuthorizationUtils.c(BaseApplication.getContext())) {
                LogUtil.b("WearHomeOldActivity", "Action is not wanted and no confirm privacy.");
                aj();
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.d("WearHomeOldActivity", "ActivityNotFoundException");
            finish();
        }
        e(intent);
    }

    private void e(Intent intent) {
        Rect rect;
        boolean booleanExtra = intent.getBooleanExtra("FROM_NO_CONNECT_SMART_LIFE", false);
        this.aw = booleanExtra;
        LogUtil.b("WearHomeOldActivity", "mIsFromSmartLife:", Boolean.valueOf(this.g), "mIsFromDisConnect", Boolean.valueOf(booleanExtra));
        boolean z = this.g;
        if (z && this.aw) {
            rfn rfnVarD = rfp.d();
            this.ai = rfnVarD;
            LogUtil.b("WearHomeOldActivity", "from no connect mAnimationObject:", rfnVarD);
            rfn rfnVar = this.ai;
            if (rfnVar != null) {
                rfnVar.d(this);
                return;
            }
            return;
        }
        if (z && (rect = this.bk) != null) {
            LogUtil.b("WearHomeOldActivity", "from smartLift sourceRect:", rect);
            rfn rfnVar2 = new rfn();
            this.ai = rfnVar2;
            rfnVar2.b(intent.getBooleanExtra("isClick", false));
            this.ai.c(this, intent, this.g);
            return;
        }
        LogUtil.b("WearHomeOldActivity", "no animation");
    }

    private void aj() {
        Intent intent = new Intent();
        intent.setClassName(getPackageName(), "com.huawei.health.MainActivity");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        startActivity(intent);
        finish();
    }

    private void x() {
        LogUtil.b("WearHomeOldActivity", "checkGpsSwitch");
        if (this.bb) {
            ay();
        } else {
            i();
        }
        LogUtil.b("WearHomeOldActivity", "mWearHomeBaseCards.size() = ", Integer.valueOf(this.bn.size()), "contains is ", Boolean.valueOf(this.bn.contains(this.r)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ay() {
        LogUtil.b("WearHomeOldActivity", "need show gps switch note");
        this.bb = false;
        this.bc = false;
        if (!mwb.b(this.ak)) {
            this.p.l();
        } else {
            s();
        }
        bb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((!"true".equals(r0)) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if ("true".equals(r0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        ak();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void bb() {
        CustomAlertDialog customAlertDialog = this.bi;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            return;
        }
        if (this.bc) {
            String strE = SharedPreferenceManager.e(this.ak, Integer.toString(10006), "wear_activity_tip_no_againlocations_permissions_tip");
            LogUtil.b("WearHomeOldActivity", "mIsNeedLocationPermissionToast notRemind:", strE);
        } else {
            if (!BluetoothPermisionUtils.d(this.ak)) {
                String strE2 = SharedPreferenceManager.e(this.ak, Integer.toString(10006), "wear_activity_tip_no_againnearby_permissions_tip");
                LogUtil.b("WearHomeOldActivity", "checkBluetoothPermission notRemind:", strE2);
            }
            i();
        }
    }

    private void s() {
        if (PermissionUtil.a()) {
            LogUtil.b("WearHomeOldActivity", "The SDK version is Q");
            if (lsg.d(this.ae, aa)) {
                return;
            }
            r();
            return;
        }
        LogUtil.b("WearHomeOldActivity", "The SDK version is lower than Q");
        Context context = this.ae;
        String[] strArr = ad;
        if (lsg.d(context, strArr) || eel.d(this.f)) {
            return;
        }
        e(strArr);
    }

    private void ao() {
        ArrayList arrayList = new ArrayList(16);
        tqp.b(this.d, arrayList);
        tqp.i(this.d, arrayList);
        tqp.d(this.d, arrayList);
        tqp.c(this.d, arrayList);
        tqp.j(this.d, arrayList);
        tqp.a(this.d, arrayList);
        tqp.g(this.d, arrayList);
        ReleaseLogUtil.c("R_WearHomeOldActivity", "requestPermissions isOversea:", Boolean.valueOf(Utils.o()));
        tqp.e(this.d, arrayList);
        final String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        ArrayList arrayList2 = new ArrayList(16);
        if (tqp.b("wear_permission_time") && !lsg.d(this.ak, strArr)) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = new ArrayList(16);
        tqp.a(this.e, arrayList3);
        final String[] strArr2 = new String[arrayList3.size()];
        arrayList3.toArray(strArr2);
        if (tqp.b("wear_local_permission_time") && !lsg.d(this.ak, strArr2)) {
            arrayList2.addAll(arrayList3);
        }
        LogUtil.b("WearHomeOldActivity", "requestPermissions permissionList is ", arrayList2);
        int size = arrayList2.size();
        final String[] strArr3 = new String[size];
        arrayList2.toArray(strArr3);
        if (size > 0) {
            b(new DialogInterface.OnClickListener() { // from class: thv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.d.b(strArr, strArr2, strArr3, dialogInterface, i);
                }
            }, new DialogInterface.OnClickListener() { // from class: thw
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.d.e(dialogInterface, i);
                }
            });
            return;
        }
        bh();
        if (qqe.e(BaseApplication.getContext())) {
            tpl.b();
        } else {
            LogUtil.e("WearHomeOldActivity", "requestPermissions not hasCalendarPermission");
        }
    }

    public /* synthetic */ void b(String[] strArr, String[] strArr2, String[] strArr3, DialogInterface dialogInterface, int i) {
        LogUtil.b("WearHomeOldActivity", "requestPermissions");
        if (tqp.b("wear_permission_time") && !lsg.d(this.ak, strArr)) {
            KeyValDbManager.d(BaseApplication.getContext()).b("wear_permission_time", String.valueOf(System.currentTimeMillis()));
        }
        if (tqp.b("wear_local_permission_time") && !lsg.d(this.ak, strArr2)) {
            KeyValDbManager.d(BaseApplication.getContext()).b("wear_local_permission_time", String.valueOf(System.currentTimeMillis()));
        }
        this.ba = true;
        lsg.a(this, strArr3, new PermissionsResultAction() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.1
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.b("WearHomeOldActivity", "requestPermissions onGranted");
                WearHomeOldActivity.this.ba = false;
                if (WearHomeOldActivity.this.e != null && WearHomeOldActivity.this.e.isSupportSendSosSms()) {
                    ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).registerContactChangeObserver();
                }
                tpl.b();
                WearHomeOldActivity.this.bh();
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.b("WearHomeOldActivity", "requestPermissions onDenied");
                WearHomeOldActivity.this.ba = false;
                WearHomeOldActivity.this.bh();
                tpl.b();
            }
        });
    }

    public /* synthetic */ void e(DialogInterface dialogInterface, int i) {
        this.ba = false;
        bh();
        tpl.b();
    }

    private void e(final String[] strArr) {
        if (tqp.d(this, strArr)) {
            b(new DialogInterface.OnClickListener() { // from class: thy
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f49142b.a(strArr, dialogInterface, i);
                }
            }, (DialogInterface.OnClickListener) null);
        }
    }

    public /* synthetic */ void a(String[] strArr, DialogInterface dialogInterface, int i) {
        PermissionsResultAction permissionsResultAction = new PermissionsResultAction() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.b("WearHomeOldActivity", "requestPermissions onGranted");
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.b("WearHomeOldActivity", "requestPermissions onDenied");
            }
        };
        LogUtil.b("WearHomeOldActivity", "requestPermissions");
        tqp.a(this, strArr, permissionsResultAction);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 20192) {
            if (iArr == null || strArr == null || strArr.length == 0) {
                LogUtil.e("WearHomeOldActivity", "onRequestPermissionsResult permission or grantResult is null");
            } else if (e(strArr, iArr)) {
                bg();
            }
        }
    }

    private boolean e(String[] strArr, int[] iArr) {
        DeviceCapability deviceCapability = this.e;
        boolean z = deviceCapability != null && deviceCapability.isSupportSosTransmission();
        LogUtil.b("WearHomeOldActivity", "isSupportSosTransmission:" + z);
        for (int i = 0; i < strArr.length; i++) {
            if (TextUtils.equals(strArr[i], "android.permission.READ_CONTACTS") && iArr[i] == 0 && z) {
                return true;
            }
        }
        return false;
    }

    public void o() {
        this.bq.set(new IBaseResponseCallback() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.10
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(WearHomeOldActivity.this.bq, this, null);
                boolean zB = PermissionUtil.b(WearHomeOldActivity.this.ak, new String[]{"android.permission.READ_CONTACTS"});
                LogUtil.b("WearHomeOldActivity", "setWaitSyncEmergency onResume hasPermissions:", Boolean.valueOf(zB));
                if (zB) {
                    WearHomeOldActivity.this.bg();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        DeviceCommand deviceCommandB = mxv.b(mxv.d(((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getEmergencyInfo()));
        if (deviceCommandB != null) {
            lvb.e().c(deviceCommandB);
        }
    }

    private void r() {
        if (!tpn.c(this)) {
            e(ad);
            this.bc = true;
            LogUtil.b("WearHomeOldActivity", "need request permission");
        } else {
            if (tpn.b(this)) {
                return;
            }
            this.bc = true;
            LogUtil.e("WearHomeOldActivity", "need background permission");
        }
    }

    public void e(EnumDialog enumDialog) {
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "removeMessage Enter:", enumDialog);
        Iterator<EnumDialog> it = this.bf.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (enumDialog == it.next()) {
                i++;
            }
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.bf.remove(enumDialog);
        }
        ax();
    }

    private void ax() {
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "dialogMessage Enter showDialog:", " mMessageList.size():", Integer.valueOf(this.bf.size()));
        if (this.bf.size() > 0) {
            LogUtil.b("MainUI", 0, "WearHomeOldActivity", "dialogMessage dialog type:", this.bf.get(0));
            if (this.bf.get(0) != EnumDialog.RATE) {
                LogUtil.b("MainUI", 0, "WearHomeOldActivity", "dialogMessage dialog type enter else");
            } else {
                aw();
            }
        }
    }

    public boolean b(String str) {
        if (this.d == null) {
            LogUtil.b("getDeviceBluetoothType mCurrentDeviceInfo is null callMethod:", str);
            this.d = tfn.a().a(this.f26233a);
        }
        if (this.d != null) {
            return false;
        }
        boolean z = lug.c() == null;
        OpAnalyticsUtil.getInstance().setRiskWarningEvent("SensitiveNotification", "isNullDeviceInfo DeviceInfo  is null,PhoneServiceBinder  is :" + z + ",callMethod " + str);
        ReleaseLogUtil.c("R_WearHomeOldActivity", "isNullDeviceInfo mCurrentDeviceInfo is null ", Boolean.valueOf(z), ",callMethod ", str);
        return true;
    }

    public void a(DeviceInfo deviceInfo) {
        this.au.removeMessages(1013);
        this.au.sendEmptyMessageDelayed(1013, 1000L);
        if (deviceInfo == null) {
            LogUtil.e("WearHomeOldActivity", "deviceInfo is null!");
            return;
        }
        this.k = deviceInfo.getPowerSaveModel() == 1;
        if (!this.f26233a.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
            LogUtil.c("WearHomeOldActivity", "deviceConnectionChange return!");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        LogUtil.c("WearHomeOldActivity", "deviceConnectionChange(): ", deviceInfo.getDeviceName(), ",state = ", Integer.valueOf(deviceConnectState));
        DeviceInfo deviceInfoA = tfn.a().a(this.f26233a);
        this.d = deviceInfoA;
        if (deviceInfoA == null) {
            LogUtil.e("WearHomeOldActivity", "mCurrentDeviceInfo is null");
        } else {
            this.f26233a = deviceInfoA.getDeviceIdentify();
            LogUtil.b("MainUI", 0, "WearHomeOldActivity", "deviceInfo.getProductType():", Integer.valueOf(deviceInfo.getProductType()));
            if (a(deviceInfo, deviceConnectState)) {
                return;
            }
        }
        bl();
        d(deviceInfo, deviceConnectState);
        b(deviceConnectState);
        t();
        LogUtil.b("WearHomeOldActivity", "deviceConnectionChange() mIsConnected: ", Boolean.valueOf(this.h));
    }

    private void e(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 112);
        LogUtil.b("WearHomeOldActivity", "afterConnectedProcess. isSupportEarPhone: ", Boolean.valueOf(zD));
        if (zD && CommonUtil.i(this.ak, "com.huawei.ui.homewear21.home.WearHomeOldActivity")) {
            LogUtil.b("WearHomeOldActivity", "afterConnectedProcess. in");
            lxb.c().b(deviceInfo, new AnonymousClass8(deviceInfo));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.WearHomeOldActivity$8, reason: invalid class name */
    public class AnonymousClass8 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f26242a;

        AnonymousClass8(DeviceInfo deviceInfo) {
            this.f26242a = deviceInfo;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            WearHomeOldActivity wearHomeOldActivity = WearHomeOldActivity.this;
            final DeviceInfo deviceInfo = this.f26242a;
            wearHomeOldActivity.runOnUiThread(new Runnable() { // from class: thz
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d(deviceInfo);
                }
            });
        }

        public /* synthetic */ void d(DeviceInfo deviceInfo) {
            Intent intent = new Intent();
            intent.setClass(WearHomeOldActivity.this.ak, EarphonePairActivity.class);
            intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
            WearHomeOldActivity.this.startActivity(intent);
        }
    }

    private void d(DeviceInfo deviceInfo, int i) {
        if (i == 2) {
            ac();
            ab();
            v();
            c(this.d);
            this.h = true;
            aa();
            String securityUuid = deviceInfo.getSecurityUuid() == null ? "" : deviceInfo.getSecurityUuid();
            LogUtil.c("WearHomeOldActivity", "currentUuid:", securityUuid, "  mLastDeviceUuid:", this.n);
            if (TextUtils.isEmpty(securityUuid) || securityUuid.equals(this.n)) {
                LogUtil.c("WearHomeOldActivity", "deviceConnectionChange() mac error or same mac");
            } else {
                this.n = securityUuid;
                ao();
            }
            tfp.e().d();
            e(this.d);
            return;
        }
        if (i == 15) {
            bk();
            return;
        }
        if (i != 11) {
            if (i == 12) {
                b(deviceInfo);
                return;
            } else {
                this.h = false;
                return;
            }
        }
        int deviceFactoryReset = deviceInfo.getDeviceFactoryReset();
        LogUtil.b("WearHomeOldActivity", "type value", Integer.valueOf(deviceFactoryReset));
        this.ap.c(this.f26233a, true);
        if (deviceFactoryReset == 1) {
            Intent intent = new Intent();
            intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
            intent.putExtra("device_country_code", deviceInfo.getCountryCode());
            intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
            Bundle bundle = new Bundle();
            bundle.putParcelable("deviceInfo", deviceInfo);
            intent.putExtras(bundle);
            intent.setClass(this.ak, AgreementDeclarationActivity.class);
            startActivity(intent);
        }
    }

    private void bk() {
        mgh.a(this);
    }

    private void b(DeviceInfo deviceInfo) {
        this.s.d(deviceInfo);
    }

    private void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("WearHomeOldActivity", "clearDeviceCapability deviceInfo is null");
            return;
        }
        DeviceCapability deviceCapability = this.e;
        if (deviceCapability == null) {
            LogUtil.e("WearHomeOldActivity", "clearDeviceCapability mDeviceCapability is null");
        } else if (deviceCapability.isSupportFootWear() || this.e.isSupportAutoDetectMode() || this.e.isSupportRunPosture()) {
            LogUtil.b("WearHomeOldActivity", "clearDeviceCapability clearDeviceCapabilityById");
            eej.b(deviceInfo.getDeviceIdentify());
        }
    }

    private void u() {
        ao();
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "enterHomeFragmentLoggedProcess()!");
        this.ag.a(this.f26233a, this.ae, null);
        rdt.b(this.d);
    }

    private void aa() {
        LogUtil.c("WearHomeOldActivity", "dataSync handlerWhenDeviceConnected");
        this.ag.a(this.f26233a, this.ae, null);
        if (!mwb.b(this.ak)) {
            this.p.l();
        }
        this.be.a();
    }

    private boolean a(DeviceInfo deviceInfo, int i) {
        if (!d(this.d.getProductType()) && d(deviceInfo.getProductType())) {
            if (this.d.getProductType() != deviceInfo.getProductType() && deviceInfo.getProductType() != -1 && i != 2) {
                return true;
            }
            LogUtil.e("WearHomeOldActivity", "mCurrentDeviceInfo.getProductType() is deviceInfo.getProductType()");
            return false;
        }
        LogUtil.e("WearHomeOldActivity", "!(isWatch(mCurrentDeviceInfo.getProductType())");
        return false;
    }

    private boolean d(int i) {
        boolean z = i == 3 || i == 10;
        LogUtil.c("WearHomeOldActivity", "Enter isWatch type:", Integer.valueOf(i), " isWatchDevice:", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.t = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(str);
        rcv.a(this.ak).b((List<String>) arrayList, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Intent intent) {
        LogUtil.b("MainUI", 0, "WearHomeOldActivity", "handleConnectStateChanged() Process.myPid():", Integer.valueOf(Process.myPid()));
        Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
        if (parcelableExtra instanceof DeviceInfo) {
            DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
            ReleaseLogUtil.c("R_WearHomeOldActivity", "sendMsgConnectChange deviceName:", CommonUtil.n(deviceInfo.getDeviceName()), " Identify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " connectState:", Integer.valueOf(deviceInfo.getDeviceConnectState()));
            if (TextUtils.equals(this.f26233a, deviceInfo.getDeviceIdentify())) {
                this.h = deviceInfo.getDeviceConnectState() == 2;
                this.d = deviceInfo;
            }
            if (CommonUtil.x(this.ak)) {
                LogUtil.b("MainUI", 0, "WearHomeOldActivity", "APP isBackground");
                return;
            }
            Message messageObtainMessage = this.au.obtainMessage();
            messageObtainMessage.what = 1011;
            messageObtainMessage.obj = deviceInfo;
            if (TextUtils.isEmpty(this.f26233a)) {
                if (!TextUtils.isEmpty(deviceInfo.getDeviceIdentify())) {
                    this.f26233a = deviceInfo.getDeviceIdentify();
                }
                this.au.sendMessage(messageObtainMessage);
                LogUtil.b("WearHomeOldActivity", "mDeviceMac = null");
                return;
            }
            if (TextUtils.equals(this.f26233a, deviceInfo.getDeviceIdentify())) {
                this.au.sendMessage(messageObtainMessage);
            } else {
                LogUtil.e("WearHomeOldActivity", "mDeviceMac != deviceInfo.getDeviceIdentify()");
            }
        }
    }

    private void aq() {
        if (this.ap.b()) {
            LogUtil.b("WearHomeOldActivity", "send Broadcast ACTION_BIND_DEVICE_SUCCESS");
            this.au.sendEmptyMessageDelayed(1039, 2000L);
        }
    }

    public void a() {
        ReleaseLogUtil.c("WearHomeOldActivity", "send broadcast: BIND_DEVICE_SUCCESS");
        Intent intent = new Intent("com.huawei.health.action.BIND_DEVICE_SUCCESS");
        intent.putExtra("deviceinfo", this.d);
        this.ak.sendBroadcast(intent, LocalBroadcast.f36595c);
        this.ap.e(false);
    }

    private void am() {
        LogUtil.b("WearHomeOldActivity", "Enter GET_RIM_SIZE_CODE");
        med.c().e(this.d, new IBaseResponseCallback() { // from class: thr
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f49135c.b(i, obj);
            }
        });
    }

    public /* synthetic */ void b(int i, Object obj) {
        LogUtil.b("WearHomeOldActivity", "onCreate sendQueryDeviceCommand onResponse errorCode,", Integer.valueOf(i));
        if (i == 100000 && (obj instanceof eeg)) {
            eeg eegVar = (eeg) obj;
            LogUtil.b("WearHomeOldActivity", "onCreate onResponse,", Integer.valueOf(eegVar.d()), HEXUtils.a(eegVar.e()));
            if (eegVar.d() == 2) {
                LogUtil.b("WearHomeOldActivity", "sendQueryDeviceCommand success");
            }
            runOnUiThread(new Runnable() { // from class: tho
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b();
                }
            });
            return;
        }
        LogUtil.b("WearHomeOldActivity", "sendQueryDeviceCommand responseFailed");
    }

    public /* synthetic */ void b() {
        this.p.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        DeviceCapability deviceCapability = this.e;
        if (deviceCapability == null) {
            LogUtil.e("WearHomeOldActivity", "getAlarmNumber mDeviceCapability is null.");
            return;
        }
        if (!deviceCapability.isEventAlarm()) {
            LogUtil.e("WearHomeOldActivity", "Device is not support event alarm.");
        } else if (eey.d(this.d, 123)) {
            LogUtil.b("WearHomeOldActivity", "Device is support obtain alarm number.");
            lvv.c(this.ak).b(this.d);
        } else {
            lvv.c(this.ak).a(5);
        }
    }

    private static void bi() {
        LogUtil.b("WearHomeOldActivity", "syncSampleConfig enter");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(900000000);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
    }

    private void av() {
        DeviceInfo deviceInfo = this.d;
        Objects.isNull(deviceInfo);
        if (deviceInfo != null) {
            String deviceModel = this.d.getDeviceModel();
            Objects.isNull(deviceModel);
            if (deviceModel != null) {
                boolean zD = eey.d(this.d, 289);
                boolean zK = Utils.k();
                LogUtil.b("WearHomeOldActivity", "setShowScreenSettingItem isSupport:", Boolean.valueOf(zD), " isOverseaNoCloud:", Boolean.valueOf(zK));
                if (!zD || zK) {
                    return;
                }
                ThreadPoolManager.c().execute(new Runnable() { // from class: thg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49125c.e();
                    }
                });
                return;
            }
        }
        LogUtil.e("WearHomeOldActivity", "setShowScreenSettingItem deviceInfo or deviceType is null");
    }

    public /* synthetic */ void e() {
        e(this.d.getDeviceModel());
    }

    private void e(String str) {
        mgm.d().d(str, new ResultCallback<ScreenshotResponse.ScaleOffsetInfo>() { // from class: com.huawei.ui.homewear21.home.WearHomeOldActivity.7
            @Override // com.huawei.networkclient.ResultCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(ScreenshotResponse.ScaleOffsetInfo scaleOffsetInfo) {
                LogUtil.b("WearHomeOldActivity", "parseScaleOffsetFromCache date:", scaleOffsetInfo.toString());
            }

            @Override // com.huawei.networkclient.ResultCallback
            public void onFailure(Throwable th) {
                LogUtil.e("WearHomeOldActivity", "parseScaleOffsetFromCache:", ExceptionUtils.c(th));
            }
        });
    }
}
