package com.huawei.ui.homehealth.device;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentTransaction;
import androidx.media3.common.C;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.configuredpage.api.ConfiguredPageDataCallback;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.InputBoxTemplate;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.views.SportBannerLayout;
import com.huawei.health.marketing.views.TopBannerLayout;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceGetMainUserAuth;
import com.huawei.hwcloudmodel.model.unite.WifiDeviceSubuserAuthorize;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.security.SecurityChecker;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.smssend.HwDeviceReplyPhraseEngineManager;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.utils.OperationUtils;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.popupview.PopViewList;
import com.huawei.ui.commonui.scrollview.HealthBottomView;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.titlebar.CustomTitleBar;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.utils.ScrollUtil;
import com.huawei.ui.commonui.utils.versioncontrol.VersionControlUtil;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.DeviceFragment;
import com.huawei.ui.homehealth.device.callback.WaterMarkCallback;
import com.huawei.ui.homehealth.device.view.NestedDeviceScrollView;
import com.huawei.ui.homehealth.device.view.VmallWebview;
import com.huawei.ui.homehealth.qrcode.activity.QrCodeScanningActivity;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import com.huawei.up.api.UpApi;
import com.huawei.up.model.UserInfomation;
import defpackage.dmp;
import defpackage.dru;
import defpackage.dxm;
import defpackage.dxw;
import defpackage.dxx;
import defpackage.dxy;
import defpackage.dzu;
import defpackage.ean;
import defpackage.eby;
import defpackage.ekd;
import defpackage.elh;
import defpackage.ezi;
import defpackage.fxl;
import defpackage.gvi;
import defpackage.ioi;
import defpackage.lqo;
import defpackage.lsy;
import defpackage.mfs;
import defpackage.njy;
import defpackage.nva;
import defpackage.qpx;
import defpackage.qqv;
import defpackage.qre;
import defpackage.qri;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qxg;
import defpackage.rdp;
import defpackage.rek;
import defpackage.res;
import defpackage.rtk;
import defpackage.rts;
import defpackage.rty;
import defpackage.rvd;
import defpackage.rvr;
import defpackage.trd;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceFragment extends DeviceMainFragment implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f25196a = {"device_main_share_to_sub_user"};
    private LinearLayout aa;
    private Map<Integer, ResourceResultInfo> ab;
    private LinearLayout ad;
    private LinearLayout ae;
    private String af;
    private String ag;
    private HealthTextView aj;
    private HealthSearchView ak;
    private NestedDeviceScrollView al;
    private int am;
    private String an;
    private HealthTextView ao;
    private HealthTextView ap;
    private UserProfileMgrApi aq;
    private RelativeLayout as;
    private VmallWebview av;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthBottomView f25197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CardDeviceFragment f25198c;
    private CustomAlertDialog e;
    private InputBoxTemplate f;
    private HealthColumnSystem g;
    private LinearLayout h;
    private String i;
    private Context j;
    private Map<Integer, ResourceResultInfo> l;
    private CustomTitleBar m;
    private LinearLayout n;
    private View o;
    private boolean q;
    private long w;
    private boolean x;
    private LinearLayout z;
    private PermissionsResultAction ai = null;
    private boolean u = false;
    private boolean y = false;
    private boolean r = false;
    private int d = 0;
    private boolean v = false;
    private boolean t = true;
    private List<ResourceBriefInfo> ah = new ArrayList(16);
    private int s = 3;
    private Handler p = new Handler() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.2
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("PluginDeviceDeviceFragment", "message is null");
                return;
            }
            int i = message.what;
            if (i == 0) {
                DeviceFragment deviceFragment = DeviceFragment.this;
                deviceFragment.a((List<ResourceBriefInfo>) deviceFragment.ah);
            } else {
                if (i == 1) {
                    if (DeviceFragment.this.aa()) {
                        DeviceFragment.this.z.setVisibility(0);
                        return;
                    }
                    return;
                }
                LogUtil.j("PluginDeviceDeviceFragment", "default branch");
            }
        }
    };
    private EventBus.ICallback k = new EventBus.ICallback() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.15
        @Override // com.huawei.health.device.util.EventBus.ICallback
        public void onEvent(EventBus.d dVar) {
            if (dVar == null) {
                LogUtil.j("PluginDeviceDeviceFragment", "event is null");
                return;
            }
            if ("device_main_share_to_sub_user".equals(dVar.e())) {
                String string = dVar.b().getString("pushContent");
                LogUtil.d("PluginDeviceDeviceFragment", "EVEBUS_WIFI_DEVICE_SHARE_TO_SUB_USER pushContent=", string);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        String string2 = new JSONObject(string).getString("prodId");
                        DeviceFragment.this.ag = dxm.t(string2);
                        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi", DeviceFragment.this.ag, null);
                    } catch (JSONException unused) {
                        LogUtil.e("PluginDeviceDeviceFragment", "EVEBUS_WIFI_DEVICE_SHARE_TO_SUB_USER JSONException");
                    }
                }
                DeviceFragment.this.k();
            }
        }
    };
    private final BroadcastReceiver ac = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.12
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("PluginDeviceDeviceFragment", "intent is null");
                return;
            }
            if ("com.huawei.bone.action.DEVICE_UPGRADING".equals(intent.getAction()) || "action_ota_check_new_version_state".equals(intent.getAction()) || "com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("PluginDeviceDeviceFragment", "mNonLocalBroadcastReceiver() ACTION_DEVICE_UPGRADING or ACTION_OTA_CHECK_NEW_VERSION_STATE");
                DeviceFragment.this.z();
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                try {
                    LogUtil.a("PluginDeviceDeviceFragment", "mNonLocalBroadcastReceiver() ACTION_CONNECTION_STATE_CHANGED");
                    DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
                    if (deviceInfo != null) {
                        if (deviceInfo.getDeviceConnectState() == 3 || deviceInfo.getDeviceConnectState() == 2) {
                            DeviceFragment.this.z();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (BadParcelableException unused) {
                    LogUtil.e("PluginDeviceDeviceFragment", "BadParcelableException");
                    return;
                }
            }
            LogUtil.j("PluginDeviceDeviceFragment", "mNonLocalBroadcastReceiver()  intent:", intent.getAction());
        }
    };
    private final BroadcastReceiver ar = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.14
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("PluginDeviceDeviceFragment", "login receive.intent null.");
                return;
            }
            if ("com.huawei.plugin.account.login".equals(intent.getAction()) || "com.huawei.plugin.account.logout".equals(intent.getAction())) {
                DeviceFragment.this.a();
                if (DeviceFragment.this.h != null) {
                    DeviceFragment.this.e();
                }
            }
        }
    };

    public DeviceFragment() {
    }

    public DeviceFragment(Activity activity, HealthBottomView healthBottomView) throws Throwable {
        this.f25197b = healthBottomView;
        rts.b(activity, this.v, (BaseResponseCallback<Boolean>) new BaseResponseCallback() { // from class: rmv
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                ReleaseLogUtil.d("R_PluginDeviceDeviceFragment", "ACTION_LOGIN_SUCCESSFUL user isChanger:", (Boolean) obj);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        this.aq = (UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi");
        this.ag = strE;
        if (TextUtils.isEmpty(strE)) {
            this.ag = "e835d102-af95-48a6-ae13-2983bc06f5c0";
        }
        EventBus.b(this.k, 0, f25196a);
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.20
            @Override // java.lang.Runnable
            public void run() {
                HwDeviceReplyPhraseEngineManager.a();
            }
        });
        final DownloadManagerApi downloadManagerApi = (DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class);
        if (downloadManagerApi.isHtyVersion()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.17
                @Override // java.lang.Runnable
                public void run() {
                    boolean zB = SharedPreferenceManager.b(Integer.toString(10008), "resource_Preset_Hty", false);
                    ReleaseLogUtil.d("PluginDeviceDeviceFragment", "resourcePresetHty isPreset: ", Boolean.valueOf(zB));
                    if (zB) {
                        return;
                    }
                    downloadManagerApi.resourcePresetHty();
                }
            });
        }
        ReleaseLogUtil.d("PluginDeviceDeviceFragment", "onCreate finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device, viewGroup, false);
        this.o = viewInflate;
        this.h = (LinearLayout) viewInflate.findViewById(R.id.optimization_card);
        this.z = (LinearLayout) this.o.findViewById(R.id.marketing_banner);
        this.aa = (LinearLayout) this.o.findViewById(R.id.marketing_top_column_layout);
        this.n = (LinearLayout) this.o.findViewById(R.id.general_marketing_layout);
        this.al = (NestedDeviceScrollView) this.o.findViewById(R.id.device_health_scrollview);
        this.ae = (LinearLayout) this.o.findViewById(R.id.device_scrollview_content);
        HealthSearchView healthSearchView = (HealthSearchView) this.o.findViewById(R.id.device_global_search_view);
        this.ak = healthSearchView;
        qrs.f(healthSearchView);
        if (rvr.e()) {
            this.al.setOverScrollMode(2);
            this.av = new VmallWebview(getContext(), this.o, this);
            this.al.setHasNest(true);
        } else {
            this.o.findViewById(R.id.loading_progress).setVisibility(8);
            this.al.setHasNest(false);
        }
        this.j = getActivity();
        ag();
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.j, 1);
        this.g = healthColumnSystem;
        this.d = healthColumnSystem.j();
        s();
        c(this.o);
        w();
        z();
        qxg.d();
        ah();
        if (this.j != null) {
            lsy.a(new Runnable() { // from class: rmw
                @Override // java.lang.Runnable
                public final void run() {
                    HwNpsManager.getInstance().startEcologyDeviceNps();
                }
            });
        }
        ReleaseLogUtil.d("PluginDeviceDeviceFragment", "onCreateView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        return this.o;
    }

    private void ai() {
        HealthSearchView healthSearchView = this.ak;
        if (healthSearchView == null || healthSearchView.getVisibility() != 0) {
            LogUtil.j("PluginDeviceDeviceFragment", "mSearchView is null");
            return;
        }
        InputBoxTemplate inputBoxTemplateB = ezi.b(4002);
        this.f = inputBoxTemplateB;
        if (inputBoxTemplateB != null) {
            if (!TextUtils.equals(this.ak.getQueryHint(), this.f.getTheme())) {
                LogUtil.a("PluginDeviceDeviceFragment", "setSearchViewHint theme:", this.f.getTheme());
                this.ak.setQueryHint(this.f.getTheme());
                if (this.v) {
                    gvi.a(this.j, 4002, 1, this.f);
                }
            }
            ezi.a(this.f.getTheme());
        } else {
            this.ak.setQueryHint("");
            LogUtil.a("PluginDeviceDeviceFragment", "setSearchViewHint empty");
        }
        this.ak.setSearchBarContentDescription();
    }

    private void s() {
        this.ai = new CustomPermissionAction(this.j) { // from class: com.huawei.ui.homehealth.device.DeviceFragment.18
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("PluginDeviceDeviceFragment", "initQrCodeAction() mQrCodeAction onGranted");
                DeviceFragment.this.p();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("PluginDeviceDeviceFragment", "initQrCodeAction() mQrCodeAction onGranted");
                DeviceFragment.this.p();
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                LogUtil.a("PluginDeviceDeviceFragment", "initQrCodeAction() mQrCodeAction onGranted");
                DeviceFragment.this.p();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.j == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "gotoScan: mContext is null");
        } else {
            rtk.d(this.j, new Intent(this.j, (Class<?>) QrCodeScanningActivity.class), "QrCodeScanningActivity");
        }
    }

    private void c(View view) {
        CustomTitleBar customTitleBar = (CustomTitleBar) view.findViewById(R.id.device_tab_titlebar);
        this.m = customTitleBar;
        customTitleBar.setLeftButtonVisibility(8);
        this.m.setTitleText(this.j.getString(R.string.IDS_device_title_use));
        if (qqv.a(this.j)) {
            this.m.setTitleSize(this.j.getResources().getDimension(R.dimen.emui_master_title_2));
        } else {
            this.m.setTitleSize(this.j.getResources().getDimension(R.dimen.textSizeHeadline8));
        }
        if (qrs.ac()) {
            this.m.setTitleSize(this.j.getResources().getDimension(R.dimen.health_common_42dp));
        }
        this.m.setTitleTextColor(this.j.getResources().getColor(R.color.textColorPrimary));
        this.m.setRightButtonVisibility(0);
        this.m.setRightButtonDrawable(getResources().getDrawable(R.drawable.ic_appbar_more), qre.f(R.string.accessibility_more_item));
        this.m.setTitleBarBackgroundColor(this.j.getResources().getColor(R.color.colorSubBackground));
        this.m.setRightButtonOnClickListener(new View.OnClickListener() { // from class: rnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f47500a.e(view2);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getResources().getString(R.string.IDS_device_wifi_my_qrcode_sweep_code_add));
        arrayList.add(getResources().getString(R.string.IDS_hw_device_manager_add_device));
        if (rty.d()) {
            arrayList.add(getResources().getString(R.string.IDS_device_auto_switch));
            rek.a("autoSwitch");
        }
        new PopViewList(this.j, this.m, arrayList).b(new PopViewList.PopViewClickListener() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.16
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                if (i == 0) {
                    DeviceFragment.this.f();
                    return;
                }
                if (i == 1) {
                    DeviceFragment.this.h();
                } else if (i == 2) {
                    DeviceFragment.this.al();
                } else {
                    LogUtil.j("PluginDeviceDeviceFragment", "position is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        LoginInit.getInstance(this.j).browsingToLogin(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.19
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (i == 0) {
                    PermissionUtil.d(DeviceFragment.this.j, PermissionUtil.PermissionType.CAMERA, DeviceFragment.this.ai);
                }
            }
        }, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.j == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mContext is null");
        } else {
            rdp.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void al() {
        Context context = this.j;
        if (context == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mContext is null");
        } else {
            rdp.a(context);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        if (getUserVisibleHint()) {
            qrs.c(this.j, 3);
            ai();
        }
        VmallWebview vmallWebview = this.av;
        if (vmallWebview != null) {
            vmallWebview.onResume();
        }
        n();
        ReleaseLogUtil.d("PluginDeviceDeviceFragment", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.ui.homehealth.device.DeviceMainFragment
    public void d() {
        LogUtil.a("PluginDeviceDeviceFragment", "onMainActivityResume");
        super.onResume();
        n();
    }

    private void n() {
        if (this.t && this.v) {
            a();
            e();
            q();
            HandlerCenter.a().d(new Runnable() { // from class: rnc
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceFragment.c();
                }
            }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            this.t = false;
        }
        g();
        z();
    }

    public static /* synthetic */ void c() {
        if (SecurityChecker.e()) {
            ReleaseLogUtil.a("PluginDeviceDeviceFragment", "App is error");
            System.exit(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        lsy.a(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("PluginDeviceDeviceFragment", "enter notifyRed");
                List listT = DeviceFragment.this.t();
                if (!njy.e(listT)) {
                    DeviceFragment.this.e((List<dru>) listT);
                } else {
                    DeviceFragment.this.c(false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<dru> list) {
        boolean zA = false;
        for (dru druVar : list) {
            if (druVar.e() == 1) {
                Object objI = druVar.i();
                if (!(objI instanceof dxy)) {
                    LogUtil.j("PluginDeviceDeviceFragment", "notifyRed DeviceInfoForWear is null");
                } else {
                    dxy dxyVar = (dxy) objI;
                    zA = HwVersionManager.b(this.j).o(dxyVar.d()) && !HwVersionManager.b(BaseApplication.getContext()).m(dxyVar.d());
                    if (zA) {
                        LogUtil.j("PluginDeviceDeviceFragment", "notifyRed WEAR_DEVICE_TYPE");
                        break;
                    }
                }
            }
            if (druVar.e() == 0) {
                Object objI2 = druVar.i();
                if (!(objI2 instanceof elh)) {
                    LogUtil.j("PluginDeviceDeviceFragment", "notifyRed ProductInfo is null");
                } else if (dxm.ab(((elh) objI2).t())) {
                    ContentValues contentValuesD = druVar.d();
                    if (contentValuesD == null) {
                        LogUtil.j("PluginDeviceDeviceFragment", "notifyRed ContentValues is null");
                    } else {
                        zA = a(contentValuesD.getAsString("productId"), contentValuesD.getAsString("uniqueId"));
                        if (zA) {
                            LogUtil.j("PluginDeviceDeviceFragment", "notifyRed OTHER_DEVICE_TYPE");
                            break;
                        }
                    }
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
        c(zA);
    }

    private boolean a(String str, String str2) {
        if (!dxm.v(str)) {
            LogUtil.j("PluginDeviceDeviceFragment", "processNotifyRed isNewUpdate not new hag");
            return false;
        }
        if (TextUtils.isEmpty(nva.a(this.j, str2))) {
            String strM = dxm.m(str2);
            LogUtil.a("PluginDeviceDeviceFragment", "processNotifyRed currentVersion:", strM);
            nva.b(strM, this.j, str2);
        }
        if (TextUtils.isEmpty(nva.j(this.j, str2))) {
            String strC = nva.c(this.j, str);
            LogUtil.a("PluginDeviceDeviceFragment", "processNotifyRed scaleCheckNewVersion:", strC);
            nva.g(strC, this.j, str2);
        }
        boolean zF = nva.f(this.j, str2);
        LogUtil.a("PluginDeviceDeviceFragment", "processNotifyRed isNewUpdate isNewVersion :", Boolean.valueOf(zF));
        if (!b(str2) && zF) {
            LogUtil.j("PluginDeviceDeviceFragment", "processNotifyRed isNewUpdate not Manager && isNewVersion");
            return zF;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
        if (measurableDeviceB != null) {
            if (measurableDeviceB instanceof eby) {
                boolean z = ((eby) measurableDeviceB).a().m() == 1;
                LogUtil.a("PluginDeviceDeviceFragment", "notifyRed is new isMainUser:", Boolean.valueOf(z));
                return zF && z;
            }
            LogUtil.j("PluginDeviceDeviceFragment", "notifyRed device not WiFiDevice");
            return false;
        }
        LogUtil.j("PluginDeviceDeviceFragment", "notifyRed device is null");
        return false;
    }

    private boolean b(String str) {
        DeviceCloudSharePreferencesManager deviceCloudSharePreferencesManager = new DeviceCloudSharePreferencesManager(dxw.d());
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append("device_has_manager");
        stringBuffer.append(str);
        return deviceCloudSharePreferencesManager.d(stringBuffer.toString());
    }

    public void c(final boolean z) {
        if (getActivity() == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "getActivity() == null");
        } else {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.4
                @Override // java.lang.Runnable
                public void run() {
                    if (DeviceFragment.this.f25197b == null) {
                        LogUtil.j("PluginDeviceDeviceFragment", "mBottomNavigationView is null");
                    } else if (z) {
                        DeviceFragment.this.f25197b.e(DeviceFragment.this.s, true);
                    } else {
                        DeviceFragment.this.f25197b.e(DeviceFragment.this.s, false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<dru> t() {
        LogUtil.a("PluginDeviceDeviceFragment", "enter getProductInfoList");
        ArrayList arrayList = new ArrayList(16);
        for (dxy dxyVar : dxx.d().h()) {
            dru druVar = new dru();
            if (dxyVar.c() == 1 && dxyVar.b() == 2) {
                druVar.d(1);
                druVar.c(dxyVar);
                arrayList.add(druVar);
            }
        }
        for (ContentValues contentValues : dmp.d().f()) {
            String asString = contentValues.getAsString("productId");
            String asString2 = contentValues.getAsString("uniqueId");
            if (TextUtils.isEmpty(asString) || TextUtils.isEmpty(asString2)) {
                LogUtil.j("PluginDeviceDeviceFragment", "getProductInfoList : productId or deviceIdentify is empty");
            } else {
                elh elhVarD = ResourceManager.c().d(asString);
                if (elhVarD != null && elhVarD.l() != null && elhVarD.l().b() != null && !elhVarD.l().b().trim().isEmpty()) {
                    dru druVarB = ekd.b(elhVarD);
                    druVarB.a(contentValues);
                    arrayList.add(druVarB);
                }
            }
        }
        LogUtil.a("PluginDeviceDeviceFragment", "productInfoList size:", Integer.valueOf(arrayList.size()));
        return arrayList;
    }

    private void ag() {
        LogUtil.a("PluginDeviceDeviceFragment", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("com.huawei.bone.action.DEVICE_UPGRADING");
        intentFilter.addAction("action_ota_check_new_version_state");
        intentFilter.addAction("com.huawei.bone.action.PHONE_SERVICE_BIND_SUCCESS");
        BroadcastManagerUtil.c(BaseApplication.getContext(), this.ac, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void am() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.ac);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PluginDeviceDeviceFragment", "unRegisterNonLocalBroadcastReceiver IllegalArgumentException");
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!(this.j.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR) instanceof WindowManager)) {
            LogUtil.a("PluginDeviceDeviceFragment", "not instanceof WindowManager");
            return;
        }
        ((WindowManager) this.j.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay().getRealMetrics(new DisplayMetrics());
        if (this.v) {
            LogUtil.a("PluginDeviceDeviceFragment", "onConfigurationChanged doOnConfigureChanged");
            i();
        }
        if (this.h != null && !aa()) {
            trd.a(15, this.h, true);
            LinearLayout linearLayout = this.h;
            qsp.c((View) linearLayout, linearLayout.getChildCount() != 0 ? 0 : 8);
        }
        if (aa()) {
            af();
            if (this.z != null) {
                a(this.ah);
            }
        }
        ab();
        VmallWebview vmallWebview = this.av;
        if (vmallWebview != null) {
            vmallWebview.e();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.v = z;
        CardDeviceFragment cardDeviceFragment = this.f25198c;
        if (cardDeviceFragment != null) {
            cardDeviceFragment.setUserVisibleHint(z);
        }
        if (this.v) {
            LogUtil.a("PluginDeviceDeviceFragment", "setUserVisibleHint doOnConfigureChanged");
            i();
            qrs.c(this.j, 3);
            if (this.t && this.o != null) {
                a();
                e();
                q();
                InputBoxTemplate inputBoxTemplate = this.f;
                if (inputBoxTemplate != null) {
                    gvi.a(this.j, 4002, 1, inputBoxTemplate);
                }
                this.t = false;
                ScrollUtil.a(this.al, getActivity().getWindow().getDecorView(), 3003);
            }
            CardDeviceFragment cardDeviceFragment2 = this.f25198c;
            if (cardDeviceFragment2 != null && (this.o instanceof ViewGroup)) {
                cardDeviceFragment2.b(new WaterMarkCallback() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.5
                    @Override // com.huawei.ui.homehealth.device.callback.WaterMarkCallback
                    public void refreshWaterMark() {
                        mfs.a(DeviceFragment.this.getActivity(), (ViewGroup) DeviceFragment.this.o);
                    }
                });
            }
            ai();
        }
        if (getView() != null) {
            fxl.c(getActivity().getWindow().getDecorView(), z, 3003, "Device");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        LogUtil.a("PluginDeviceDeviceFragment", "onHiddenChanged");
        super.onHiddenChanged(z);
        VmallWebview vmallWebview = this.av;
        if (vmallWebview != null) {
            vmallWebview.onHiddenChanged(z);
        }
    }

    private void g() {
        if (!VersionControlUtil.isSupportOperationAccount()) {
            qsp.c((View) this.h, 8);
            qsp.c((View) this.ad, 8);
        } else if (Utils.o()) {
            qsp.c((View) this.h, 0);
        }
    }

    public void a() {
        if (this.q) {
            LogUtil.a("PluginDeviceDeviceFragment", "DeviceFragment has init Marketing");
            return;
        }
        this.q = true;
        if (this.o == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mDeviceView is null");
            return;
        }
        LogUtil.a("PluginDeviceDeviceFragment", "enter initMarketing");
        LinearLayout linearLayout = (LinearLayout) this.o.findViewById(R.id.marketing_layout);
        this.ad = linearLayout;
        if (linearLayout == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mMarketingLayout is null.");
            return;
        }
        if (!aa()) {
            LogUtil.a("PluginDeviceDeviceFragment", "initMarketing but marketing two grid is not used");
            return;
        }
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            b(marketingApi);
        } else {
            LogUtil.j("PluginDeviceDeviceFragment", "marketingApi is null");
        }
    }

    private void b(final MarketingApi marketingApi) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(4002);
        arrayList.add(1003);
        arrayList.add(4123);
        arrayList.add(4157);
        marketingApi.getResourceResultInfo(arrayList).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.3
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                DeviceFragment.this.ab = marketingApi.filterMarketingRules(map);
                DeviceFragment.this.d(marketingApi);
                DeviceFragment.this.ak();
                DeviceFragment.this.c(marketingApi);
                DeviceFragment.this.e(marketingApi);
            }
        });
    }

    public void j() {
        if (!aa()) {
            LogUtil.a("PluginDeviceDeviceFragment", "updateVmallMarketingData but marketing two grid is not used");
            return;
        }
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "marketingApi is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(4002);
        marketingApi.getResourceResultInfo(arrayList).addOnSuccessListener(new OnSuccessListener<Map<Integer, ResourceResultInfo>>() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.8
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onSuccess(Map<Integer, ResourceResultInfo> map) {
                LogUtil.a("PluginDeviceDeviceFragment", "updateVmallMarketingData onSuccess");
                if (marketingApi.filterMarketingRules(map) == null) {
                    LogUtil.j("PluginDeviceDeviceFragment", "filterMarketingRules with resultInfoMap is null");
                    return;
                }
                ResourceResultInfo resourceResultInfo = marketingApi.filterMarketingRules(map).get(4002);
                if (resourceResultInfo != null) {
                    DeviceFragment.this.ab.put(4002, resourceResultInfo);
                    DeviceFragment.this.d(marketingApi);
                } else {
                    LogUtil.j("PluginDeviceDeviceFragment", "vmall marketing data is null");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean aa() {
        return !Utils.o() || OperationUtils.switchToMarketingTwo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MarketingApi marketingApi) {
        if (this.ad == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "showVmallLayout mMarketingLayout is null");
            return;
        }
        HashMap map = new HashMap();
        map.put(4002, this.ab.get(4002));
        List<View> marketingViewList = marketingApi.getMarketingViewList(getActivity(), map);
        this.ad.removeAllViews();
        if (!njy.e(marketingViewList)) {
            Iterator<View> it = marketingViewList.iterator();
            while (it.hasNext()) {
                this.ad.addView(it.next());
            }
        }
        LinearLayout linearLayout = this.ad;
        qsp.c((View) linearLayout, linearLayout.getChildCount() != 0 ? 0 : 8);
        if (this.av != null) {
            LogUtil.a("PluginDeviceDeviceFragment", "load vmall");
            this.av.b(qrs.m() - this.m.getHeight());
            this.av.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ak() {
        if (this.z == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "showMarketingBanner mMarketingBanner is null.");
            return;
        }
        if (!this.ab.containsKey(1003)) {
            LogUtil.j("PluginDeviceDeviceFragment", "showMarketingBanner resource is null.");
            return;
        }
        ResourceResultInfo resourceResultInfo = this.ab.get(1003);
        if (resourceResultInfo == null) {
            this.ah = new ArrayList(0);
            this.z.removeAllViews();
            LogUtil.j("PluginDeviceDeviceFragment", "resourceResultInfo = null");
            return;
        }
        List<ResourceBriefInfo> resources = resourceResultInfo.getResources();
        if (njy.e(resources)) {
            this.ah = new ArrayList(0);
            this.z.removeAllViews();
            LogUtil.a("PluginDeviceDeviceFragment", "resourceBriefInfoList is empty");
        } else {
            LogUtil.a("PluginDeviceDeviceFragment", "resourceBriefInfoList size:", Integer.valueOf(resources.size()));
            this.ah = resources;
            this.p.sendEmptyMessage(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MarketingApi marketingApi) {
        if (this.n == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "showGeneralBanner mGeneralMarketingLayout is null.");
            return;
        }
        if (!this.ab.containsKey(4123)) {
            LogUtil.j("PluginDeviceDeviceFragment", "showGeneralBanner resource is null.");
            return;
        }
        HashMap map = new HashMap();
        this.l = map;
        map.put(4123, this.ab.get(4123));
        List<View> marketingViewList = marketingApi.getMarketingViewList(this.j, this.l);
        LogUtil.a("PluginDeviceDeviceFragment", "showGeneralBanner viewList.size = ", Integer.valueOf(marketingViewList.size()));
        this.n.removeAllViews();
        if (njy.e(marketingViewList)) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            this.n.addView(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(MarketingApi marketingApi) {
        if (this.aa == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "showTopColumn mMarketTopColumnLayout is null.");
            return;
        }
        if (!this.ab.containsKey(4157)) {
            LogUtil.j("PluginDeviceDeviceFragment", "showGeneralBanner resource is null.");
            return;
        }
        HashMap map = new HashMap();
        map.put(4157, this.ab.get(4157));
        List<View> marketingViewList = marketingApi.getMarketingViewList(this.j, map);
        LogUtil.a("PluginDeviceDeviceFragment", "showTopColumn viewList.size = ", Integer.valueOf(marketingViewList.size()));
        this.aa.removeAllViews();
        if (njy.e(marketingViewList)) {
            this.aa.setVisibility(8);
            return;
        }
        this.aa.setVisibility(0);
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            this.aa.addView(it.next());
        }
    }

    private void q() {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            MarketingOption.Builder builder = new MarketingOption.Builder();
            builder.setContext(this.j);
            builder.setPageId(15);
            marketingApi.requestMarketingResource(builder.build());
            HashMap map = new HashMap(16);
            map.put("open_specific_page", "Device");
            builder.setTriggerEventParams(map);
            builder.setTypeId(49);
            marketingApi.triggerMarketingResourceEvent(builder.build());
            d(marketingApi, builder);
        }
    }

    private void d(MarketingApi marketingApi, MarketingOption.Builder builder) {
        builder.setTypeId(51);
        marketingApi.triggerMarketingResourceEvent(builder.build());
        builder.setTypeId(52);
        marketingApi.triggerMarketingResourceEvent(builder.build());
    }

    private void af() {
        if (this.o == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mDeviceView is null");
            return;
        }
        LogUtil.a("PluginDeviceDeviceFragment", "enter refreshMarketing");
        this.ad = (LinearLayout) this.o.findViewById(R.id.marketing_layout);
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "refreshMarketingUi marketingApi is null");
            return;
        }
        Map<Integer, ResourceResultInfo> map = this.ab;
        if (map != null && map.size() > 0) {
            if (this.ad == null) {
                LogUtil.j("PluginDeviceDeviceFragment", "mMarketingLayout is null");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put(4002, this.ab.get(4002));
            List<View> marketingViewList = marketingApi.getMarketingViewList(getActivity(), map2);
            this.ad.removeAllViews();
            if (!njy.e(marketingViewList)) {
                Iterator<View> it = marketingViewList.iterator();
                while (it.hasNext()) {
                    this.ad.addView(it.next());
                }
            }
            LinearLayout linearLayout = this.ad;
            qsp.c((View) linearLayout, linearLayout.getChildCount() != 0 ? 0 : 8);
            return;
        }
        a();
        e();
    }

    private void ab() {
        if (this.o == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "refreshVipMarketingUi mDeviceView is null");
            return;
        }
        LogUtil.a("PluginDeviceDeviceFragment", "enter refreshVipMarketingUi");
        this.n = (LinearLayout) this.o.findViewById(R.id.general_marketing_layout);
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "refreshMarketingUi marketingApi is null");
            return;
        }
        Map<Integer, ResourceResultInfo> map = this.l;
        if (map == null || map.size() <= 0) {
            return;
        }
        List<View> marketingViewList = marketingApi.getMarketingViewList(getActivity(), this.l);
        LinearLayout linearLayout = this.n;
        if (linearLayout == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mCommercializationLayout is null");
            return;
        }
        linearLayout.removeAllViews();
        if (njy.e(marketingViewList)) {
            this.n.setVisibility(8);
            return;
        }
        this.n.setVisibility(0);
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            this.n.addView(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<ResourceBriefInfo> list) {
        if (this.j == null || this.z == null || njy.e(list)) {
            LogUtil.j("PluginDeviceDeviceFragment", "mContext = null or mMarketingBanner = null");
            return;
        }
        this.z.removeAllViews();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ResourceBriefInfo resourceBriefInfo = list.get(0);
        if (resourceBriefInfo != null) {
            if (b(resourceBriefInfo)) {
                arrayList.add(resourceBriefInfo);
            } else {
                arrayList2.add(resourceBriefInfo);
            }
        }
        LogUtil.a("PluginDeviceDeviceFragment", "topBannerResources size: ", Integer.valueOf(arrayList.size()), ", otherBannerResources size: ", Integer.valueOf(arrayList2.size()));
        if (!njy.e(arrayList)) {
            TopBannerLayout topBannerLayout = new TopBannerLayout(this.j);
            topBannerLayout.a(arrayList);
            this.z.addView(topBannerLayout);
        } else if (!njy.e(arrayList2)) {
            HashMap map = new HashMap();
            map.put(1003, new ResourceResultInfo.Builder().setResources(arrayList2).setTotalNum(arrayList2.size()).setResourcesLatestModifyTime(System.currentTimeMillis()).build());
            List<View> marketingViewList = ((MarketingApi) Services.b("FeatureMarketing", MarketingApi.class)).getMarketingViewList(this.j, map);
            for (int i = 0; i < marketingViewList.size(); i++) {
                View view = marketingViewList.get(i);
                if (i == marketingViewList.size() - 1) {
                    j(view);
                }
                this.z.addView(view);
            }
        }
        Message messageObtainMessage = this.p.obtainMessage();
        messageObtainMessage.what = 1;
        this.p.sendMessageDelayed(messageObtainMessage, 1000L);
    }

    private void j(View view) {
        if (view instanceof SportBannerLayout) {
            LogUtil.a("PluginDeviceDeviceFragment", "last sport banner no bottom margin");
            FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.view_sport_banner_root);
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.bottomMargin = 0;
                frameLayout.setLayoutParams(layoutParams2);
            }
        }
    }

    private boolean b(ResourceBriefInfo resourceBriefInfo) {
        int contentType = resourceBriefInfo.getContentType();
        return contentType == 5 || contentType == 14 || contentType == 41 || contentType == 37 || contentType == 38;
    }

    private void i() {
        Context context = this.j;
        if (context != null) {
            this.g.b(context);
            if (this.d != this.g.j()) {
                this.d = this.g.j();
                r();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        VmallWebview vmallWebview = this.av;
        if (vmallWebview != null) {
            vmallWebview.onDestroy();
        }
        super.onDestroy();
        LogUtil.a("PluginDeviceDeviceFragment", "onDestroy ", this);
        EventBus.a(this.k, f25196a);
        this.f25197b = null;
        this.f25198c = null;
        am();
        aj();
        Handler handler = this.p;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.j = null;
    }

    private void w() {
        LogUtil.a("PluginDeviceDeviceFragment", "init View start");
        r();
        if (!aa()) {
            e();
        } else {
            a();
        }
        x();
        u();
        ThreadPoolManager.c().execute(new Runnable() { // from class: rmx
            @Override // java.lang.Runnable
            public final void run() {
                this.d.k();
            }
        });
        if (ezi.d()) {
            y();
        } else {
            this.x = false;
            qsp.c((View) this.ak, 8);
            this.ae.setPadding(0, 0, 0, 0);
        }
        LogUtil.a("PluginDeviceDeviceFragment", "initView end");
    }

    private void x() {
        this.as = (RelativeLayout) this.o.findViewById(R.id.rl_share_device);
        this.aj = (HealthTextView) this.o.findViewById(R.id.tv_share_content);
        this.ao = (HealthTextView) this.o.findViewById(R.id.tv_share_join);
        this.ap = (HealthTextView) this.o.findViewById(R.id.tv_share_not_join);
    }

    private void u() {
        this.ao.setOnClickListener(this);
        this.ap.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        lqo.b(this.j).b(new WifiDeviceGetMainUserAuth(), new ICloudOperationResult<CloudCommonReponse>() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.9
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z) {
                if (!z || TextUtils.isEmpty(str)) {
                    LogUtil.j("PluginDeviceDeviceFragment", "getMainUserShareDevice, isSuccess is false or text is null");
                    return;
                }
                try {
                    JSONArray jSONArray = new JSONObject(str).getJSONArray("authMsgs");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject.getInt("status") == 101) {
                                DeviceFragment.this.w = jSONObject.getLong("mainHuid");
                                DeviceFragment.this.i = jSONObject.getString("devId");
                                DeviceFragment.this.a(jSONObject);
                                DeviceFragment.this.e(jSONObject.getString("nickname"));
                                return;
                            }
                        }
                        return;
                    }
                    LogUtil.j("PluginDeviceDeviceFragment", "getMainUserShareDevice, jsonArray is null or jsonArray size<=0");
                } catch (JSONException e) {
                    LogUtil.e("PluginDeviceDeviceFragment", "getMainUserShareDevice, JSONException", e.getMessage());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("prodId");
        this.af = strOptString;
        LogUtil.a("PluginDeviceDeviceFragment", "mProdId: ", strOptString);
        if (!TextUtils.isEmpty(this.af)) {
            String str = dxm.g.get(this.af);
            this.ag = str;
            LogUtil.a("PluginDeviceDeviceFragment", "getMainUserShareDevice-mProduct: ", str);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi", this.ag, null);
            return;
        }
        LogUtil.j("PluginDeviceDeviceFragment", "mProdId is an empty string.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        String string = getResources().getString(com.huawei.ui.device.R.string.IDS_device_herm_name);
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi");
        this.ag = strE;
        if ("b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(strE)) {
            string = getResources().getString(com.huawei.ui.device.R.string.IDS_device_hag2021_name);
            LogUtil.a("PluginDeviceDeviceFragment", "showShareDeviceCard mProductId scalesName = ", string);
        }
        LogUtil.a("PluginDeviceDeviceFragment", "showShareDeviceCard mProductId scalesName = ", string);
        Locale locale = Locale.ENGLISH;
        String string2 = getResources().getString(com.huawei.ui.device.R.string.IDS_device_share_subuser_authorize_2);
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.an = String.format(locale, string2, str, string);
        getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.7
            @Override // java.lang.Runnable
            public void run() {
                DeviceFragment.this.aj.setText(DeviceFragment.this.an);
                DeviceFragment.this.as.setVisibility(0);
                if (DeviceFragment.this.r) {
                    DeviceFragment.this.ao.setText(R.string.IDS_main_no_device_click);
                    DeviceFragment.this.ap.setText(R.string.IDS_main_btn_state_ignore);
                }
            }
        });
    }

    private void y() {
        if (this.ak == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mSearchView is null");
            return;
        }
        LogUtil.a("PluginDeviceDeviceFragment", "initSearchView");
        qsp.c((View) this.ak, 0);
        v();
        this.ak.setInputType(0);
        this.ak.setIconifiedByDefault(false);
        this.x = true;
        ezi.c(this.ak);
        this.al.setScrollViewListener(new NestedDeviceScrollView.ScrollViewListener() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.10
            @Override // com.huawei.ui.homehealth.device.view.NestedDeviceScrollView.ScrollViewListener
            public void onScrollChanged(ScrollView scrollView, int i, int i2, int i3, int i4) {
                if (DeviceFragment.this.x) {
                    if (DeviceFragment.this.am <= 0) {
                        DeviceFragment deviceFragment = DeviceFragment.this;
                        deviceFragment.am = deviceFragment.ak.getHeight();
                    }
                    if (DeviceFragment.this.am > 0 && i2 >= DeviceFragment.this.am) {
                        ezi.c(DeviceFragment.this.o);
                        ezi.a(DeviceFragment.this.m, true);
                        ezi.e(DeviceFragment.this.ak);
                    }
                    if (i2 <= 0) {
                        ezi.c(DeviceFragment.this.o);
                        LayoutTransition layoutTransitionD = ezi.d(DeviceFragment.this.al);
                        ezi.d(DeviceFragment.this.ak);
                        ezi.c(DeviceFragment.this.m, true);
                        ezi.e(DeviceFragment.this.p, DeviceFragment.this.al, layoutTransitionD);
                    }
                }
            }
        });
        ezi.a(this.ak, new View.OnClickListener() { // from class: rna
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47499c.b(view);
            }
        });
        ai();
    }

    public /* synthetic */ void b(View view) {
        gvi.a(this.j, 4002, 2, this.f);
        ezi.d(this.j, this.f, 4002);
    }

    private void v() {
        CustomTitleBar customTitleBar = this.m;
        if (customTitleBar == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "mDeviceTitleBar is null");
            return;
        }
        customTitleBar.setRightSoftkeyVisibility(8);
        qsp.c(this.m.getRightSoftKey(), 0.0f);
        this.m.setRightSoftkeyBackground(ContextCompat.getDrawable(this.j, R.drawable.search_bar_icon), qre.f(R.string.IDS_global_search_button));
        this.m.setRightSoftkeyOnClickListener(new View.OnClickListener() { // from class: rmz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        gvi.a(this.j, 4002, 2, this.f);
        ezi.d(this.j, this.f, 4002);
    }

    private String l() {
        UserInfomation userInfo = this.aq.getUserInfo();
        if (userInfo != null && !TextUtils.isEmpty(userInfo.getName())) {
            return userInfo.getName();
        }
        String accountInfo = LoginInit.getInstance(this.j).getAccountInfo(1002);
        if (!TextUtils.isEmpty(accountInfo)) {
            return accountInfo;
        }
        String legalAccountName = new UpApi(this.j).getLegalAccountName();
        return !TextUtils.isEmpty(legalAccountName) ? legalAccountName : MultiUsersManager.INSTANCE.getCurrentUser().h();
    }

    private void b(final boolean z) {
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "productIdForConfigWifi", null, null);
        WifiDeviceSubuserAuthorize wifiDeviceSubuserAuthorize = new WifiDeviceSubuserAuthorize();
        wifiDeviceSubuserAuthorize.setDevId(this.i);
        wifiDeviceSubuserAuthorize.setMainHuid(String.valueOf(this.w));
        wifiDeviceSubuserAuthorize.setNickname(l());
        wifiDeviceSubuserAuthorize.setIntent(z ? 1 : 2);
        ReleaseLogUtil.d("PluginDeviceDeviceFragment", "acceptMainUserShareDevice isAgree ", Boolean.valueOf(z));
        lqo.b(this.j).c(wifiDeviceSubuserAuthorize, new ICloudOperationResult<CloudCommonReponse>() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.6
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void operationResult(CloudCommonReponse cloudCommonReponse, String str, boolean z2) {
                if (!z2) {
                    if (cloudCommonReponse == null || 112000010 != cloudCommonReponse.getResultCode().intValue()) {
                        qpx.b(DeviceFragment.this.j, R.string.IDS_music_management_operation_failed);
                        DeviceFragment.this.k();
                        return;
                    } else {
                        LogUtil.a("PluginDeviceDeviceFragment", "acceptMainUserShareDevice", cloudCommonReponse.getResultCode());
                        qpx.b(DeviceFragment.this.j, R.string.IDS_device_wifi_my_qrcode_add_member_exceeding_limit);
                    }
                }
                DeviceFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DeviceFragment.this.as.setVisibility(8);
                    }
                });
                DeviceFragment.this.a(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (!z) {
            LogUtil.j("PluginDeviceDeviceFragment", "acceptMainUserShareDevice, hide share card");
            return;
        }
        boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(this.ag);
        String str = this.ag;
        if (str != null && zIsResourcesAvailable && dxm.ad(str) && !dzu.e(this.ag, "HDK_WEIGHT")) {
            LogUtil.a("PluginDeviceDeviceFragment", "updateResourceFile: isPluginAvaiable is true and mProductId = ", CommonUtil.n(this.ag));
            dzu.e(this.j, getActivity());
        } else {
            ean.b(this.i, false);
            new rvd().d(this.j, this.ag);
        }
    }

    private void ae() {
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.j("PluginDeviceDeviceFragment", "mAuthDialog isShowing");
            return;
        }
        View viewInflate = View.inflate(this.j, com.huawei.plugindevice.R.layout.dialog_user_auth_message, null);
        a(viewInflate);
        f(viewInflate);
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(getActivity());
        builder.d(com.huawei.plugindevice.R.string.IDS_device_wifi_user_permission_dialog_title);
        builder.a(viewInflate);
        builder.c().setAllCaps(true);
        builder.d(com.huawei.plugindevice.R.string.IDS_user_permission_ok, new DialogInterface.OnClickListener() { // from class: rne
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.d.b(dialogInterface, i);
            }
        });
        builder.a(com.huawei.plugindevice.R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: rnb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.j("PluginDeviceDeviceFragment", "onClick view");
            }
        });
        CustomAlertDialog customAlertDialogB = builder.b();
        this.e = customAlertDialogB;
        customAlertDialogB.setCancelable(false);
        this.e.show();
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i) {
        if (!this.u) {
            ioi.d().e(7, true, "DeviceFragment", null);
        }
        if (!this.y) {
            ioi.d().e(2, true, "DeviceFragment", null);
        }
        b(true);
    }

    private void f(final View view) {
        if (view == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "onDialogSizeChanged, dialogView is null");
        } else {
            view.post(new Runnable() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.11
                @Override // java.lang.Runnable
                public void run() {
                    int measuredHeight = view.getMeasuredHeight();
                    int iB = (int) (qqv.b(DeviceFragment.this.j) * 0.8f);
                    if (measuredHeight > iB) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        layoutParams.height = iB;
                        view.setLayoutParams(layoutParams);
                        view.requestLayout();
                    }
                }
            });
        }
    }

    private void a(View view) {
        String string = getResources().getString(R.string.IDS_device_haige_user_permission_message, "");
        boolean z = ad() || ac();
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.dialog_text_alert_message);
        if (z) {
            StringBuffer stringBuffer = new StringBuffer(16);
            if (ad() && ac()) {
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_haige_user_permission_message_health_item));
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
            } else if (ad()) {
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_haige_user_permission_message_health_item));
            } else if (ac()) {
                stringBuffer.append(System.lineSeparator()).append(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_personal_infomation_message));
            } else {
                LogUtil.j("PluginDeviceDeviceFragment", "get HealthData And Personal Info fail");
            }
            SpannableString spannableString = new SpannableString(getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_message, getResources().getString(R.string.IDS_device_wifi_user_permission_dialog_params_message_new, stringBuffer)));
            qri.a(spannableString, stringBuffer.toString(), new AbsoluteSizeSpan(13, true));
            healthTextView.setText(spannableString);
            return;
        }
        healthTextView.setText(string);
    }

    private boolean ad() {
        return o() && Utils.h();
    }

    private boolean ac() {
        return m() && Utils.h();
    }

    private boolean o() {
        if ("true".equals(ioi.d().c(7))) {
            this.u = true;
        } else {
            this.u = false;
        }
        return !this.u;
    }

    private boolean m() {
        if ("true".equals(ioi.d().c(2))) {
            this.y = true;
        } else {
            this.y = false;
        }
        return !this.y;
    }

    private void r() {
        if (this.f25198c == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "enter initDeviceFragment");
            FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
            this.f25198c = new CardDeviceFragment();
            fragmentTransactionBeginTransaction.replace(R.id.device_card, this.f25198c);
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            return;
        }
        LogUtil.j("PluginDeviceDeviceFragment", "enter initDeviceFragment mCardDeviceFragment is not null");
    }

    public void e() {
        if (this.h == null) {
            LogUtil.a("PluginDeviceDeviceFragment", "initOptimization mConfiguredLayout is null.");
            return;
        }
        LogUtil.a("PluginDeviceDeviceFragment", "enter initOptimization");
        String accountInfo = LoginInit.getInstance(this.j).getAccountInfo(1010);
        if (!aa() && OperationUtils.isOperation(accountInfo)) {
            this.h.setVisibility(0);
            this.h.removeAllViews();
            trd.a(15, this.h, true, (ConfiguredPageDataCallback) null);
        } else {
            LogUtil.j("PluginDeviceDeviceFragment", "initOptimization isOversea or is not operation or switch to marketing 2.0.");
            if (Utils.o() && !OperationUtils.isOperation(accountInfo)) {
                this.s = 2;
            }
            this.h.setVisibility(8);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("PluginDeviceDeviceFragment", "view is null");
            return;
        }
        if (view.getId() == R.id.tv_share_join) {
            ReleaseLogUtil.d("PluginDeviceDeviceFragment", "onClick tv_share_join");
            ae();
        } else {
            if (view.getId() == R.id.tv_share_not_join) {
                ReleaseLogUtil.d("PluginDeviceDeviceFragment", "onClick tv_share_not_join");
                b(false);
                this.as.setVisibility(8);
                return;
            }
            LogUtil.j("PluginDeviceDeviceFragment", "onClick else branch");
        }
    }

    private void ah() {
        LogUtil.a("PluginDeviceDeviceFragment", "registerSwitchAccountReceiver enter");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.login");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.ar, intentFilter);
        LogUtil.a("PluginDeviceDeviceFragment", "registerSwitchAccountReceiver end");
    }

    private void aj() {
        try {
            LogUtil.a("PluginDeviceDeviceFragment", "unregisterSwitchAccountReceiver mSwitchAccountReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.ar);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("PluginDeviceDeviceFragment", "unregisterSwitchAccountReceiver IllegalArgumentException");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            LogUtil.j("PluginDeviceDeviceFragment", "requestCode BLUETOOTH_CODE");
            rdp.c(this.j);
        }
        if (i != 608) {
            if (i == 10006) {
                this.f25198c.onActivityResult(i, i2, intent);
                return;
            }
            return;
        }
        ReleaseLogUtil.d("PluginDeviceDeviceFragment", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
        res.d().c(String.valueOf(i2));
        if (i2 == -1) {
            SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
            res.d().a("PluginDeviceDeviceFragment", intent);
            res.d().b();
            return;
        }
        rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.DeviceFragment.13
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i3, Object obj) {
                if (i3 == -1) {
                    res.d().e(DeviceFragment.this.j);
                } else {
                    res.d().c(String.valueOf(608));
                    res.d().b();
                }
            }
        }, getActivity());
    }
}
