package com.huawei.ui.homehealth.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.callback.DeviceStatusCallback;
import com.huawei.common.Constant;
import com.huawei.datatype.DeviceStatusParam;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.clouddevice.CloudSwatchDeviceInfo;
import com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager;
import com.huawei.health.ecologydevice.util.FAUtil;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.GridTemplate;
import com.huawei.health.userlabelmgr.api.UserLabelServiceApi;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.commonservice.WatchFaceWearService;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceIdReportInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.cardview.HealthCardView;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.activity.pairing.EarphonePairActivity;
import com.huawei.ui.device.activity.screenshot.ScreenshotPermissionDialogActivity;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.CardDeviceFragment;
import com.huawei.ui.homehealth.device.adapter.CardDeviceAdapter;
import com.huawei.ui.homehealth.device.adapter.DeviceRecommendedAdapter;
import com.huawei.ui.homehealth.device.callback.HonorPrivacyCallback;
import com.huawei.ui.homehealth.device.callback.IMarketingCallback;
import com.huawei.ui.homehealth.device.callback.WaterMarkCallback;
import com.huawei.ui.homehealth.device.sitting.RecommendedItem;
import com.huawei.ui.homehealth.device.util.CardDeviceFragmentMarketingUtil;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import com.huawei.ui.openservice.db.control.OpenServiceControl;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.dmp;
import defpackage.dru;
import defpackage.dxx;
import defpackage.dxy;
import defpackage.dyd;
import defpackage.ecu;
import defpackage.eel;
import defpackage.eey;
import defpackage.efl;
import defpackage.iov;
import defpackage.lon;
import defpackage.lss;
import defpackage.lvb;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lxb;
import defpackage.lyy;
import defpackage.mei;
import defpackage.mgg;
import defpackage.mgh;
import defpackage.mgi;
import defpackage.mhs;
import defpackage.mil;
import defpackage.mir;
import defpackage.miw;
import defpackage.net;
import defpackage.nio;
import defpackage.njy;
import defpackage.qhu;
import defpackage.qrs;
import defpackage.qsp;
import defpackage.qum;
import defpackage.rdo;
import defpackage.rdp;
import defpackage.res;
import defpackage.rgd;
import defpackage.rmc;
import defpackage.rme;
import defpackage.roj;
import defpackage.rtk;
import defpackage.rts;
import defpackage.rum;
import defpackage.rvo;
import defpackage.tfi;
import defpackage.tfn;
import defpackage.tod;
import defpackage.tqp;
import defpackage.tqu;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes17.dex */
public class CardDeviceFragment<T> extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DownloadCloudDeviceResource f25173a;
    public HealthButton ae;
    public LinearLayout ak;
    public DeviceRecommendedAdapter am;
    public LinearLayout an;
    public RelativeLayout ao;
    public HealthRecycleView ap;
    public String ar;
    public HealthRecycleView as;
    public HealthRecycleView aw;
    public RelativeLayout ay;
    protected rvo az;
    public HealthViewPager ba;
    protected roj bb;
    public tod bd;
    private CompatibilityInteractor be;
    protected View bf;
    private DeviceInfo bk;
    private DownloadCloudDeviceManager bn;
    private boolean bo;
    private int bp;
    private PayApi bs;
    private CardDeviceFragmentMarketingUtil bt;
    private Map<Integer, ResourceResultInfo> bu;
    private WaterMarkCallback bz;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HealthButton f25175c;
    private UserLabelServiceApi ca;
    private Observer<Boolean> cb;
    public LinearLayout d;
    public CardDeviceAdapter f;
    public LinearLayout g;
    public Context h;
    public LinearLayout i;
    public LinearLayout j;
    public View m;
    public HealthCardView n;
    public HealthDotsPageIndicator p;
    public String r;
    public HealthCardView s;
    public LinearLayout t;
    public boolean u;
    public rmc v;
    public List<dru> aj = new ArrayList(16);
    public List<RecommendedItem> aq = new ArrayList(16);
    public Handler y = new rme(this);
    public ExecutorService q = Executors.newCachedThreadPool();
    public boolean ac = true;
    public int bg = 0;
    protected int au = -1;
    public List<dru> av = new ArrayList(16);
    public boolean ai = false;
    protected boolean z = false;
    public boolean ab = false;
    public boolean aa = false;
    public boolean ag = false;
    public String x = "";
    public ResourceBriefInfo at = null;
    public GridTemplate w = null;
    public List<SingleGridContent> e = new ArrayList();
    public boolean af = true;
    private Map<String, LinkedList<String>> bh = new HashMap();
    private boolean bl = false;
    public final BroadcastReceiver al = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = CardDeviceFragment.this.y;
            if (handler == null) {
                LogUtil.j("CardDeviceFragment", "mNonLocalBroadcastReceiver handler is null");
                return;
            }
            LogUtil.a("CardDeviceFragment", "mNonLocalBroadcastReceiver() action：", intent.getAction());
            if (CardDeviceFragment.this.v != null) {
                CardDeviceFragment.this.v.b(context, intent, CardDeviceFragment.this, handler);
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeviceStatusCallback f25174b = new DeviceStatusCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.15
        @Override // com.huawei.callback.DeviceStatusCallback
        public void onDeviceConnectedChanged(DeviceInfo deviceInfo, int i, DeviceStatusParam deviceStatusParam) {
            if (deviceInfo == null) {
                LogUtil.j("CardDeviceFragment", "onDeviceConnectedChanged device == null");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a("CardDeviceFragment", "onDeviceConnectedChanged CONNECT_STATE = ", Integer.valueOf(deviceConnectState), " DeviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()));
            if (CardDeviceFragment.this.e(deviceInfo.getDeviceConnectState())) {
                Message messageObtainMessage = CardDeviceFragment.this.y.obtainMessage();
                messageObtainMessage.what = 46;
                messageObtainMessage.obj = deviceInfo;
                CardDeviceFragment.this.y.sendMessage(messageObtainMessage);
            }
        }
    };
    public BroadcastReceiver ah = new AnonymousClass20();
    public final BroadcastReceiver l = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.19
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = CardDeviceFragment.this.y;
            if (handler == null) {
                LogUtil.j("CardDeviceFragment", "mDeviceBatteryOrRemainingTimeReceiver handler is null");
                return;
            }
            if (intent == null) {
                LogUtil.j("CardDeviceFragment", "mDeviceBatteryOrRemainingTimeReceiver intent is null");
                return;
            }
            if ("com.huawei.bone.action.BATTERY_LEVEL".equals(intent.getAction())) {
                LogUtil.a("CardDeviceFragment", "mDeviceBatteryReceiver ACTION_BATTERY_LEVEL");
                if (intent.getExtras() != null) {
                    handler.sendEmptyMessage(34);
                    return;
                }
                return;
            }
            if ("com.huawei.bone.action.REMAINING_TIME".equals(intent.getAction())) {
                handler.sendEmptyMessage(34);
            }
        }
    };
    public final BroadcastReceiver k = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.18
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = CardDeviceFragment.this.y;
            if (handler == null) {
                LogUtil.j("CardDeviceFragment", "mDeviceConnectEarphoneReceiver handler is null");
            } else {
                if (intent == null || !"com.huawei.health.pair_earphone".equals(intent.getAction())) {
                    return;
                }
                LogUtil.a("CardDeviceFragment", "mDeviceConnectEarphoneReceiver PAIR_EARPHONE_ACTION");
                handler.sendEmptyMessage(48);
            }
        }
    };
    public final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.23
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("CardDeviceFragment", "mDeviceAppUpdateBroadcastReceiver intent is null");
                return;
            }
            LogUtil.a("CardDeviceFragment", "mDeviceAppUpdateBroadcastReceiver intent action is:", intent.getAction());
            if ("com.huawei.appmarket.action.REFRESH_DEVICE_APP_UPDATE".equals(intent.getAction())) {
                boolean booleanExtra = intent.getBooleanExtra("isEnable", false);
                lyy.b().a(CardDeviceFragment.this.r, booleanExtra);
                Message messageObtain = Message.obtain();
                messageObtain.what = 391;
                messageObtain.arg1 = booleanExtra ? 1 : 0;
                CardDeviceFragment.this.a(messageObtain);
            }
        }
    };
    public BroadcastReceiver ax = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.24
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                LogUtil.a("CardDeviceFragment", "mScreenPermissionReceiver  action is:", intent.getAction());
                if ("com.huawei.health.action.SCREEN_SHOT_PERMISSION_QUEST".equals(intent.getAction())) {
                    CardDeviceFragment.this.o();
                } else if (HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(intent.getAction())) {
                    CardDeviceFragment.this.o();
                }
            }
        }
    };
    public BroadcastReceiver bc = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.22
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            LogUtil.a("CardDeviceFragment", "mSimStateChangedReceiver onReceive action");
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("CardDeviceFragment", "intent error");
                return;
            }
            if ("android.intent.action.SIM_STATE_CHANGED".equals(intent.getAction())) {
                Object systemService = BaseApplication.getContext().getSystemService("phone");
                if (!(systemService instanceof TelephonyManager)) {
                    LogUtil.j("CardDeviceFragment", "Context.TELEPHONY_SERVICE object error");
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) systemService;
                if (CardDeviceFragment.this.au == telephonyManager.getSimState()) {
                    LogUtil.j("CardDeviceFragment", "same state, continue");
                    return;
                }
                CardDeviceFragment.this.au = telephonyManager.getSimState();
                LogUtil.a("CardDeviceFragment", "sim state changed, update white list");
                OpenServiceControl.getInstance(context).obtainWatchFaceGrsUrl();
            }
        }
    };
    public HonorPrivacyCallback ad = new HonorPrivacyCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.21
        @Override // com.huawei.ui.homehealth.device.callback.HonorPrivacyCallback
        public void signResult(rum.e eVar) {
            if (eVar == null) {
                LogUtil.j("CardDeviceFragment", "mHonorPrivacyCallback parameter is null.");
                return;
            }
            if (!eVar.a()) {
                LogUtil.j("CardDeviceFragment", "mHonorPrivacyCallback refresh page after delete device.");
                if (CardDeviceFragment.this.f != null) {
                    CardDeviceFragment.this.f.c(false);
                }
                CardDeviceFragment.this.f();
                return;
            }
            int iD = eVar.d();
            int iB = eVar.b();
            LogUtil.a("CardDeviceFragment", "mHonorPrivacyCallback position: ", Integer.valueOf(iD), ", clickType: ", Integer.valueOf(iB));
            if (CardDeviceFragment.this.v != null) {
                CardDeviceFragment.this.v.a(eVar, CardDeviceFragment.this, iD, iB);
            }
        }
    };
    private List<T> bi = new ArrayList(16);
    private List<dru> bx = new ArrayList(16);
    private List<dru> by = new ArrayList(16);
    private List<CloudSwatchDeviceInfo> bv = new ArrayList(16);
    private int bm = 0;
    private int bj = 0;
    private boolean br = false;
    private boolean bq = false;
    private boolean bw = false;

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(int i) {
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    static /* synthetic */ int i(CardDeviceFragment cardDeviceFragment) {
        int i = cardDeviceFragment.bp;
        cardDeviceFragment.bp = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.CardDeviceFragment$20, reason: invalid class name */
    public class AnonymousClass20 extends BroadcastReceiver {
        AnonymousClass20() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, final Intent intent) throws Throwable {
            LogUtil.a("CardDeviceFragment", "onReceive mLoginStatusReceiver:start");
            if (intent == null) {
                LogUtil.j("CardDeviceFragment", "onReceive mLoginStatusReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("CardDeviceFragment", "onReceive mLoginStatusReceiver:", action);
            if (TextUtils.isEmpty(action)) {
                LogUtil.j("CardDeviceFragment", "onReceive mLoginStatusReceiver action is empty");
                return;
            }
            if ("com.huawei.plugin.account.login".equals(action)) {
                LogUtil.a("CardDeviceFragment", "AccountLoginReceiver login sendAccount");
                rts.b(CardDeviceFragment.this.getActivity(), CardDeviceFragment.this.bw, (BaseResponseCallback<Boolean>) new BaseResponseCallback() { // from class: rma
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f47463a.a(intent, i, (Boolean) obj);
                    }
                });
            } else if ("com.huawei.plugin.account.logout".equals(action)) {
                CardDeviceFragment.this.z = false;
                CardDeviceFragment.this.w();
            } else {
                LogUtil.j("CardDeviceFragment", "LocalBroadcast default");
            }
        }

        public /* synthetic */ void a(Intent intent, int i, Boolean bool) {
            ReleaseLogUtil.d("R_CardDeviceFragment", "loginStatusReceiver checkUserChanger isChanger:", bool);
            if (bool.booleanValue()) {
                CardDeviceFragment.this.z = false;
            } else if (intent.getBooleanExtra(Constant.KEY_IS_REBOOT, false)) {
                LogUtil.j("CardDeviceFragment", "login sendAccount app reBoot");
            } else {
                rtk.e(CardDeviceFragment.this.ab);
                CardDeviceFragment.this.w();
            }
        }
    }

    protected void o() {
        if (miw.a(this.h) == PermissionUtil.PermissionResult.GRANTED) {
            miw.a();
            return;
        }
        boolean zE = miw.e();
        boolean zIsRunningForeground = BaseApplication.isRunningForeground();
        boolean zC = miw.c();
        if (zE && zIsRunningForeground && zC && this.h != null) {
            int iD = com.huawei.haf.application.BaseApplication.d(ScreenshotPermissionDialogActivity.class.getName());
            ReleaseLogUtil.d("R_CardDeviceFragment", "handleScreenshotDialog indexActivity is:", Integer.valueOf(iD), " isShowDialog:", Boolean.valueOf(zE), " isInAnHour:", Boolean.valueOf(zC));
            if (-1 == iD) {
                iov.d(this.h, new Intent(this.h, (Class<?>) ScreenshotPermissionDialogActivity.class));
            }
        }
    }

    public CardDeviceFragment() {
        LogUtil.a("CardDeviceFragment", "CardDeviceFragment()");
    }

    public void d(String str) {
        this.ar = str;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        rtk.c(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        qrs.e();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        DeviceInfo deviceInfoC = mgg.c("CardDeviceFragment");
        if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
            LogUtil.j("CardDeviceFragment", "deviceInfo is not connected");
        } else if (WatchFaceUtil.isSupportWatchFaceMarket()) {
            LogUtil.a("CardDeviceFragment", "init watchface market");
            tqp.g(BaseApplication.getContext());
        }
    }

    public void f(Message message) {
        LogUtil.a("CardDeviceFragment", "enter updateVipView");
        if (((Integer) message.obj).intValue() != 0) {
            this.ba.setVisibility(8);
        } else {
            b(this.bi);
        }
    }

    public void b(List<T> list) {
        roj rojVar = new roj(this.h, getParentFragment(), this.ba, this);
        this.bb = rojVar;
        this.ba.setAdapter(rojVar);
        this.bb.b(list);
        this.ba.setVisibility(0);
        ak();
    }

    private void ak() {
        HealthDotsPageIndicator healthDotsPageIndicator;
        LogUtil.a("CardDeviceFragment", "startAdAutoScroll enter");
        if (this.bi == null || (healthDotsPageIndicator = this.p) == null) {
            return;
        }
        healthDotsPageIndicator.setViewPager(this.ba);
        if (this.bi.size() > 1) {
            this.p.b(4000);
        } else {
            this.p.d();
        }
    }

    public void c(Message message) {
        LogUtil.a("CardDeviceFragment", "refreshAppMarketCard");
        if (!(message.obj instanceof dxy)) {
            LogUtil.j("CardDeviceFragment", "refreshAppMarketCard message.obj is error");
            return;
        }
        dxy dxyVar = (dxy) message.obj;
        this.bm = message.arg1;
        DeviceCapability deviceCapabilityC = rtk.c(dxyVar.d());
        if (deviceCapabilityC == null) {
            h();
            return;
        }
        LogUtil.a("CardDeviceFragment", "refreshAppMarketCard mAppMarketResult :", Integer.valueOf(this.bm));
        if (this.bm == 1) {
            lyy.b().h();
            c(rtk.e(4, dxyVar));
            lyy.b().d();
        }
        c(dxyVar, deviceCapabilityC);
        rtk.d(this.aq);
        this.af = true;
        h();
    }

    private void c(dxy dxyVar) {
        LogUtil.a("CardDeviceFragment", "addOverseaWalletEntry enter");
        if (LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount()) {
            LogUtil.a("CardDeviceFragment", "addOverseaWalletEntry minor account");
            b(dxyVar);
        } else {
            if (ad()) {
                LogUtil.a("CardDeviceFragment", "addOverseaWalletEntry isKoreaVersion is true");
                return;
            }
            if (WalletAppManager.getInstance().getIsSupportWalletApp(dxyVar.d())) {
                if (!a(3)) {
                    this.aq.add(rtk.e(3, dxyVar));
                }
                LogUtil.a("CardDeviceFragment", "addOverseaWalletEntry show entry");
            }
            b(dxyVar);
            g(dxyVar);
        }
    }

    private void c(dxy dxyVar, DeviceCapability deviceCapability) {
        if (WalletAppManager.getInstance().isOverseaService()) {
            c(dxyVar);
            return;
        }
        if (rgd.e(dxyVar.d(), deviceCapability)) {
            for (RecommendedItem recommendedItem : this.aq) {
                if (recommendedItem != null && recommendedItem.getId() == 3) {
                    LogUtil.j("CardDeviceFragment", "addPayItem, had add");
                    return;
                }
            }
            this.aq.add(rtk.e(3, dxyVar));
        }
        b(dxyVar);
    }

    public boolean a(int i) {
        for (RecommendedItem recommendedItem : this.aq) {
            if (recommendedItem != null && recommendedItem.getId() == i) {
                LogUtil.j("CardDeviceFragment", "hadAddRecommendedItem, had add:", Integer.valueOf(i));
                return true;
            }
        }
        return false;
    }

    protected void b(dxy dxyVar) {
        DeviceInfo deviceInfo;
        String strD = lon.c().d("domain_play_machine");
        if (!Utils.o() && !TextUtils.isEmpty(strD) && lvi.a(dxyVar.g()).z()) {
            LogUtil.j("CardDeviceFragment", "addPlayMachine, isOversea and url is not null");
            if (!a(5) && this.aq.size() < 5) {
                this.aq.add(rtk.e(5, dxyVar));
            }
        } else {
            LogUtil.j("CardDeviceFragment", "addPlayMachine, isOversea or url is null");
        }
        if (dxyVar == null) {
            this.x = strD;
            return;
        }
        String strD2 = dxyVar.d();
        if (!TextUtils.isEmpty(strD2)) {
            deviceInfo = mgg.b(strD2, "CardDeviceFragment");
        } else {
            deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "CardDeviceFragment");
        }
        a(deviceInfo, strD);
    }

    private void a(final DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null) {
            LogUtil.j("CardDeviceFragment", "requestHelpInteractorUrl deviceInfoForWear is null");
            this.x = str;
        } else {
            ExecutorService executorService = this.q;
            if (executorService != null) {
                executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.5
                    @Override // java.lang.Runnable
                    public void run() {
                        String strD = tqu.e().d(deviceInfo);
                        CardDeviceFragment.this.x = strD;
                        LogUtil.a("CardDeviceFragment", "requestHelpInteractorUrl helpUrl", strD);
                        Handler handler = CardDeviceFragment.this.y;
                        if (handler != null) {
                            Message messageObtainMessage = handler.obtainMessage();
                            messageObtainMessage.what = 44;
                            handler.sendMessage(messageObtainMessage);
                        }
                    }
                });
            }
        }
    }

    public void g(CardDeviceFragment cardDeviceFragment) {
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.i(cardDeviceFragment);
        }
    }

    public void d(Message message) {
        LogUtil.a("CardDeviceFragment", "accountSwitch status == ", Integer.valueOf(message.arg1));
        int i = message.arg1;
        if (i != 9) {
            if (i == 10) {
                Object obj = message.obj;
                if (obj instanceof String) {
                    tfn.a().c((String) obj);
                    return;
                }
                return;
            }
            if (i != 13) {
                LogUtil.j("CardDeviceFragment", "message default");
                return;
            }
        }
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.c(this);
        }
    }

    public void n() {
        LogUtil.a("CardDeviceFragment", "updateLayout enter updateLayoutIsShow");
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: rls
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47455c.g();
                }
            });
        }
    }

    public /* synthetic */ void g() {
        DeviceCapability deviceCapabilityD = DeviceSettingsInteractors.e(BaseApplication.getContext()).d();
        if (deviceCapabilityD == null) {
            LogUtil.j("CardDeviceFragment", "deviceCapability is null");
            return;
        }
        DeviceInfo deviceInfoJ = tfn.a().j();
        if (deviceInfoJ == null) {
            LogUtil.j("CardDeviceFragment", "updateLayoutIsShow deviceInfo is null");
            return;
        }
        int productType = deviceInfoJ.getProductType();
        if (deviceCapabilityD.isOtaUpdate() && !eel.d(productType) && productType != 12) {
            al();
            return;
        }
        Handler handler = this.y;
        if (handler == null) {
            LogUtil.j("CardDeviceFragment", "updateLayoutIsShow handler == null");
        } else {
            handler.removeMessages(14);
            handler.sendEmptyMessage(14);
        }
    }

    private void al() {
        mhs.a().getSwitchSetting("wlan_auto_update", new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("CardDeviceFragment", "updateLayoutIsShow errorCode = ", Integer.valueOf(i));
                boolean z = i == 0 && (obj instanceof String) && !"2".equals((String) obj);
                Handler handler = CardDeviceFragment.this.y;
                if (handler == null) {
                    LogUtil.j("CardDeviceFragment", "handler == null");
                    return;
                }
                if (!z) {
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.what = 11;
                    handler.sendMessage(messageObtainMessage);
                } else {
                    handler.removeMessages(14);
                    handler.sendEmptyMessage(14);
                }
            }
        });
    }

    public void b(dxy dxyVar, DeviceCapability deviceCapability) {
        if (WatchFaceUtil.isSupportMyWatch()) {
            this.aq.add(rtk.e(6, dxyVar));
        }
        this.bj = 0;
        if (deviceCapability.isSupportMusicInfoList()) {
            this.aq.add(rtk.e(2, dxyVar));
        }
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "CardDeviceFragment");
        if (njy.e(deviceList)) {
            deviceList = ecu.d().getDeviceList(HwGetDevicesMode.FOLLOWED_DEVICES, null, "CardDeviceFragment");
            LogUtil.a("CardDeviceFragment", "encapsulationRecommend get followed devices");
        }
        if (!njy.e(deviceList) && (deviceInfo = deviceList.get(0)) == null) {
            LogUtil.a("CardDeviceFragment", "deviceInfo is null");
            return;
        }
        LogUtil.a("CardDeviceFragment", "initAppMarketCard isSupportMarketFace:", Boolean.valueOf(deviceCapability.isSupportMarketFace()), " isSupportMarketParams", Boolean.valueOf(deviceCapability.isSupportMarketParams()), " isSupportAppGallery:", Boolean.valueOf(eey.d(deviceInfo, 44)), "isSingleWatchSupportAppGallery:", Boolean.valueOf(eey.d(deviceInfo, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE)));
        if (deviceCapability.isSupportMarketFace() || deviceCapability.isSupportMarketParams() || lyy.b().b(deviceInfo)) {
            b(dxyVar, deviceCapability, deviceInfo);
        } else {
            c(dxyVar, deviceCapability);
        }
    }

    private void b(final dxy dxyVar, DeviceCapability deviceCapability, DeviceInfo deviceInfo) {
        if (lyy.b().b(deviceInfo)) {
            if (ad()) {
                LogUtil.a("CardDeviceFragment", "addAppMarketCard isKoreaVersion is true");
                return;
            }
            this.aq.add(rtk.e(4, dxyVar));
            c(dxyVar, deviceCapability);
            return;
        }
        int size = this.aq.size();
        this.bj = size;
        LogUtil.a("CardDeviceFragment", "encapsulationRecommend mAppMarketIndex:", Integer.valueOf(size));
        lyy.b().a(deviceCapability, new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.3
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("CardDeviceFragment", "showAppMarket errorCode:", Integer.valueOf(i));
                CardDeviceFragment.this.e(i, dxyVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, dxy dxyVar) {
        if (i == 1) {
            LogUtil.a("CardDeviceFragment", "encapsulationRecommend mAppMarketResult:", Integer.valueOf(this.bm));
            Message messageObtain = Message.obtain();
            messageObtain.what = 39;
            messageObtain.arg1 = 1;
            messageObtain.obj = dxyVar;
            a(messageObtain);
            return;
        }
        Message messageObtain2 = Message.obtain();
        messageObtain2.what = 39;
        messageObtain2.arg1 = 2;
        messageObtain2.obj = dxyVar;
        a(messageObtain2);
    }

    protected void a(Message message) {
        Handler handler = this.y;
        if (handler != null) {
            handler.sendMessage(message);
        }
    }

    private void c(RecommendedItem recommendedItem) {
        boolean zC = lyy.b().c(this.r);
        LogUtil.a("CardDeviceFragment", "addAppMarketItem, redDotStatus : ", Boolean.valueOf(zC));
        for (RecommendedItem recommendedItem2 : this.aq) {
            if (recommendedItem2 != null && recommendedItem2.getId() == 4) {
                LogUtil.j("CardDeviceFragment", "addAppMarketItem, had add");
                recommendedItem2.setIsShowRedDot(zC);
                LogUtil.a("CardDeviceFragment", "addAppMarketItem, had add setIsShowRedDot");
                return;
            }
        }
        if (this.bj <= this.aq.size()) {
            recommendedItem.setIsShowRedDot(zC);
            LogUtil.a("CardDeviceFragment", "addAppMarketItem, add setIsShowRedDot");
            this.aq.add(this.bj, recommendedItem);
        }
    }

    public void e(Message message) {
        boolean z = message.arg1 == 1;
        for (RecommendedItem recommendedItem : this.aq) {
            if (recommendedItem != null && recommendedItem.getId() == 4) {
                LogUtil.a("CardDeviceFragment", "refreshAppMarketRedDot, get apps card and set red dot, isShowRedDot:", Boolean.valueOf(z));
                recommendedItem.setIsShowRedDot(z);
                break;
            }
        }
        rtk.d(this.aq);
        this.af = true;
        h();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.m = layoutInflater.inflate(R.layout.fragment_device_card, viewGroup, false);
        this.az = new rvo();
        this.h = getActivity();
        rmc rmcVarE = rmc.e();
        this.v = rmcVarE;
        rmcVarE.e(this);
        Handler handler = this.y;
        if (handler != null) {
            handler.sendEmptyMessageDelayed(40, 10000L);
            this.y.sendEmptyMessageDelayed(43, 5000L);
        }
        UserLabelServiceApi userLabelServiceApi = (UserLabelServiceApi) Services.b("HWUserLabelMgr", UserLabelServiceApi.class);
        this.ca = userLabelServiceApi;
        userLabelServiceApi.registerCallback(4);
        lvl.b();
        this.ca.registerCallback(5);
        this.bs = (PayApi) Services.d("TradeService", PayApi.class);
        ah();
        aa();
        ae();
        m();
        ReleaseLogUtil.d("CardDeviceFragment", "onCreateView finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
        x();
        return this.m;
    }

    private void x() {
        Context context;
        DeviceInfo deviceInfoC = mil.c("CardDeviceFragment");
        if (deviceInfoC == null) {
            ReleaseLogUtil.d("CardDeviceFragment", "handleScreenshotDialog connectMainDevice is null");
            return;
        }
        if (deviceInfoC.getDeviceFactoryReset() == 1) {
            miw.a();
            ReleaseLogUtil.d("CardDeviceFragment", "handleScreenshotDialog connectMainDevice is RESTORE_FACTORY_SETTING");
        } else if (miw.a(this.h) != PermissionUtil.PermissionResult.GRANTED) {
            boolean zE = miw.e();
            boolean zC = miw.c();
            if (zE && zC && (context = this.h) != null) {
                iov.d(context, new Intent(this.h, (Class<?>) ScreenshotPermissionDialogActivity.class));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null || activityJ == getActivity()) {
            this.y.post(new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.2
                @Override // java.lang.Runnable
                public void run() {
                    Activity activityJ2 = com.huawei.haf.application.BaseApplication.j();
                    if (activityJ2 == null || activityJ2 != CardDeviceFragment.this.getActivity()) {
                        return;
                    }
                    CardDeviceFragment.this.ac();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (mgg.d("CardDeviceFragment") != null) {
            mir.c(this.h, "openMainActivityPage");
        }
    }

    private void ah() {
        WatchFaceManager.getInstance().registerIdReportCb("CardDeviceFragment", new ResponseCallback() { // from class: rlm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f47450b.a(i, (WatchFaceIdReportInfo) obj);
            }
        });
    }

    public /* synthetic */ void a(int i, WatchFaceIdReportInfo watchFaceIdReportInfo) {
        if (watchFaceIdReportInfo.getReportStatus() != 1) {
            return;
        }
        if (this.v == null || this.m == null) {
            LogUtil.j("CardDeviceFragment", "onWatchFaceIdReportCb, mHelper or mDeviceCardView is null");
        } else {
            WatchFaceWearService.getInstance().setCurWatchFaceId(watchFaceIdReportInfo.getWatchFaceId());
            LogUtil.a("CardDeviceFragment", "onWatchFaceIdReportCb invoke");
        }
    }

    private void m() {
        if (lvb.e().b().getValue().booleanValue()) {
            return;
        }
        this.cb = new Observer<Boolean>() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.10
            @Override // androidx.lifecycle.Observer
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(Boolean bool) {
                if (bool.booleanValue()) {
                    ReleaseLogUtil.d("CardDeviceFragment", "checkPhoneServiceBind initDeviceList");
                    lvb.e().b().removeObserver(CardDeviceFragment.this.cb);
                    CardDeviceFragment.this.cb = null;
                    CardDeviceFragment.this.f();
                }
            }
        };
        lvb.e().b().observe(getViewLifecycleOwner(), this.cb);
    }

    private void r() {
        ReleaseLogUtil.d("R_CardDeviceFragment", "getCloudResourceData mIsCloudResourceSuccess ", Boolean.valueOf(this.z));
        if (this.z) {
            return;
        }
        if (this.f25173a == null) {
            this.f25173a = new DownloadCloudDeviceResource();
        }
        this.f25173a.e();
        final WeakReference weakReference = new WeakReference(this);
        this.f25173a.e(new BaseResponseCallback() { // from class: rlw
            @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
            public final void onResponse(int i, Object obj) {
                CardDeviceFragment.e(weakReference, i, (Boolean) obj);
            }
        });
    }

    public static /* synthetic */ void e(WeakReference weakReference, int i, Boolean bool) {
        ReleaseLogUtil.d("R_CardDeviceFragment", "getCloudResourceData syncDeviceInfoFromSmartLife:", bool);
        if (bool.booleanValue()) {
            lss.a((CardDeviceFragment) weakReference.get(), new Consumer() { // from class: rlh
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((CardDeviceFragment) obj).v();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        SharedPreferenceManager.d(String.valueOf(10024), "isPairedDevice", 1);
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.8
                @Override // java.lang.Runnable
                public void run() {
                    if (CommonUtil.bu()) {
                        ReleaseLogUtil.d("R_CardDeviceFragment", "set mIsLoginChange true");
                        CardDeviceFragment.this.z = true;
                    }
                    CardDeviceFragment.this.f();
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.bw = z;
        LogUtil.a("CardDeviceFragment", "setUserVisibleHint mIsUserVisible = ", Boolean.valueOf(z));
        if (this.bw) {
            p();
            rtk.g();
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        LogUtil.a("CardDeviceFragment", "isTahiti ", Boolean.valueOf(qrs.af(this.h)));
        rtk.c(true);
        rtk.a(false);
        if (this.ac) {
            k();
        }
        t();
        f();
        a(mgg.b());
        r();
        aj();
        if (this.bw) {
            p();
        }
        y();
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        u();
        rum.c();
        rmc rmcVar = this.v;
        if (rmcVar != null && (view = this.m) != null) {
            rmcVar.n(this, view);
        }
        ReleaseLogUtil.d("CardDeviceFragment", "onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    private void aj() {
        ThreadPoolManager.c().a("CardDeviceFragment", new Runnable() { // from class: rld
            @Override // java.lang.Runnable
            public final void run() {
                CardDeviceFragment.b();
            }
        });
    }

    public static /* synthetic */ void b() {
        DeviceInfo deviceInfo = null;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "CardDeviceFragment");
        if (njy.e(deviceList)) {
            LogUtil.j("CardDeviceFragment", "updateDeviceNameSp: the object of HwDeviceMgr is null. ");
            return;
        }
        if (deviceList.size() > 0) {
            for (DeviceInfo deviceInfo2 : deviceList) {
                if (!eel.d(deviceInfo2.getProductType())) {
                    deviceInfo = deviceInfo2;
                    break;
                }
            }
        }
        if (deviceInfo == null) {
            LogUtil.j("CardDeviceFragment", "updateDeviceNameSp: the object of DeviceInfo is null. ");
        } else {
            net.b("CardDeviceFragment", net.b(deviceInfo), net.e("CardDeviceFragment", deviceInfo));
        }
    }

    private void u() {
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.7
                @Override // java.lang.Runnable
                public void run() {
                    if (CommonUtil.ck() && tfi.h(CardDeviceFragment.this.h) && rtk.h() && tfi.l(CardDeviceFragment.this.h) && CardDeviceFragment.this.y != null) {
                        Message messageObtainMessage = CardDeviceFragment.this.y.obtainMessage();
                        messageObtainMessage.what = 42;
                        CardDeviceFragment.this.y.sendMessage(messageObtainMessage);
                    }
                }
            });
        }
    }

    private void t() {
        if (!Utils.h() || Utils.i()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: rlu
            @Override // java.lang.Runnable
            public final void run() {
                this.f47457c.i();
            }
        });
    }

    public /* synthetic */ void i() {
        FAUtil.a(new FAUtil.ResultCallback() { // from class: rly
            @Override // com.huawei.health.ecologydevice.util.FAUtil.ResultCallback
            public final void onResult(boolean z) {
                this.d.b(z);
            }
        });
    }

    public /* synthetic */ void b(boolean z) {
        if (z) {
            ab();
        }
    }

    public void d(dxy dxyVar) {
        ReleaseLogUtil.d("R_CardDeviceFragment", "refreshWatchFace enter");
        if (Utils.o() && !ad()) {
            ViewStub viewStub = (ViewStub) qsp.a(this.m, R.id.watchface_card);
            if (viewStub != null) {
                LogUtil.a("CardDeviceFragment", "refreshWatchFace ViewStub is loaded");
                this.bf = viewStub.inflate();
            }
            tqp.c(dxyVar.g(), this.r, true);
            if (this.bd == null) {
                LogUtil.a("CardDeviceFragment", "refreshWatchFace new watch face card");
                this.bd = new tod(getActivity(), this.r);
            } else {
                LogUtil.a("CardDeviceFragment", "refreshWatchFace set param");
                this.bd.d(getActivity(), this.r);
            }
            this.bd.a(this.bf);
        }
    }

    public void c() {
        LogUtil.a("CardDeviceFragment", "autoScanDevice");
        if (this.be == null) {
            this.be = new CompatibilityInteractor();
        }
        this.be.d(BaseApplication.getContext(), new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.9
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                LogUtil.a("CardDeviceFragment", "start auto scan begin:", Integer.valueOf(i), " objectData:", obj);
                if (i == 0 && (obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    LogUtil.a("CardDeviceFragment", "start auto scan device");
                    ThreadPoolManager.c().a("CardDeviceFragment", new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.9.3
                        @Override // java.lang.Runnable
                        public void run() {
                            qum.b().d();
                        }
                    });
                }
            }
        });
    }

    private void p() {
        LogUtil.a("CardDeviceFragment", "getCloudDeviceData");
        if (!efl.c()) {
            LogUtil.j("CardDeviceFragment", "getCloudDeviceData not need update");
            return;
        }
        dmp.d().e();
        if (this.bn == null) {
            this.bn = new DownloadCloudDeviceManager();
        }
        this.bn.b(new DownloadCloudDeviceManager.DeviceDataCallback() { // from class: rlr
            @Override // com.huawei.health.ecologydevice.clouddevice.DownloadCloudDeviceManager.DeviceDataCallback
            public final void deviceResourceCallbackResult(boolean z) {
                this.f47454c.d(z);
            }
        });
    }

    public /* synthetic */ void d(boolean z) {
        LogUtil.a("CardDeviceFragment", "syncDeviceInfoFromProfileCloud CallbackResult isSuccess = ", Boolean.valueOf(z));
        if (z) {
            ab();
        }
    }

    private void ab() {
        if (getActivity() != null) {
            getActivity().runOnUiThread(new Runnable() { // from class: rlq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.f();
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        h();
        af();
    }

    private void aa() {
        BaseActivity.setViewSafeRegion(true, this.m);
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.i(this, this.m);
            this.v.g(this, this.m);
            this.v.o(this, this.m);
        }
        this.ba.setIsAutoHeight(true);
    }

    private void ae() {
        if (this.bt == null) {
            this.bt = new CardDeviceFragmentMarketingUtil(this.h);
        }
        this.bt.a(new IMarketingCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.6
            @Override // com.huawei.ui.homehealth.device.callback.IMarketingCallback
            public void onSuccess(GridTemplate gridTemplate, ResourceBriefInfo resourceBriefInfo) {
                LogUtil.a("CardDeviceFragment", "requestMarketingData onSuccess");
                CardDeviceFragment.this.at = resourceBriefInfo;
                CardDeviceFragment.this.w = gridTemplate;
                CardDeviceFragment.this.h();
            }
        });
    }

    public void h() {
        if (this.h == null) {
            LogUtil.e("CardDeviceFragment", "refreshView context is null");
            return;
        }
        LogUtil.a("CardDeviceFragment", "mShowProductInfoLists ", Integer.valueOf(this.av.size()), "mRecommendedLists ", Integer.valueOf(this.aq.size()), "mProductInfoLists ", Integer.valueOf(this.aj.size()));
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.i(this);
        }
        if (this.aj.size() > 0) {
            this.n.setVisibility(8);
            this.an.setVisibility(8);
            rmc rmcVar2 = this.v;
            if (rmcVar2 != null) {
                rmcVar2.a(this);
            }
            this.ak.setVisibility(0);
            if (qrs.af(this.h) && this.aj.size() == 1) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
            }
            this.f25175c.setVisibility(0);
            if (this.aj.size() <= 2) {
                this.ae.setVisibility(8);
            } else {
                this.ae.setVisibility(0);
            }
        } else {
            w();
        }
        if (this.ai) {
            this.ae.setText(this.h.getString(R.string.IDS_device_health_retract));
        } else {
            this.ae.setText(this.h.getString(R.string.IDS_hw_common_ui_xlistview_footer_hint_moredevice));
        }
        rmc rmcVar3 = this.v;
        if (rmcVar3 != null) {
            rmcVar3.b(this);
        }
        h(new ArrayList(this.av));
        this.f.c(this.av);
        if (this.af) {
            this.am.d(this.aq);
        }
    }

    private void h(List<dru> list) {
        DeviceInfo deviceInfoE;
        dxy dxyVar;
        if (this.bl || njy.e(list)) {
            return;
        }
        this.bl = true;
        Iterator<dru> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                deviceInfoE = null;
                break;
            }
            dru next = it.next();
            if (next.e() == 1) {
                Object objI = next.i();
                if ((objI instanceof dxy) && (deviceInfoE = (dxyVar = (dxy) objI).e()) != null) {
                    LogUtil.a("CardDeviceFragment", "checkDeviceConnecting deviceInfo name:", deviceInfoE.getDeviceName(), " state:", Integer.valueOf(deviceInfoE.getDeviceConnectState()), " infoWearStates:", Integer.valueOf(dxyVar.b()));
                    if (deviceInfoE.getDeviceConnectState() == 1) {
                        LogUtil.a("CardDeviceFragment", "checkDeviceConnecting haveDeviceConnecting name:", deviceInfoE.getDeviceName());
                        break;
                    }
                }
            }
        }
        if (deviceInfoE != null) {
            a(deviceInfoE, this.y);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Map<Integer, ResourceResultInfo> map;
        rmc rmcVar;
        LogUtil.a("CardDeviceFragment", "getNoDeviceMarketing");
        if (!this.u && (rmcVar = this.v) != null) {
            rmcVar.c((CardDeviceFragment) this, false);
        }
        if (this.aj.size() > 0) {
            LogUtil.j("CardDeviceFragment", "mProductInfoLists.size() > 0");
            return;
        }
        if (this.bo && (map = this.bu) != null && map.size() > 0) {
            ag();
            return;
        }
        LogUtil.a("CardDeviceFragment", "getNoDeviceMarketing request");
        this.bo = true;
        final MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        ArrayList arrayList = new ArrayList();
        arrayList.add(4086);
        arrayList.add(4156);
        Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(arrayList);
        resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: rlf
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f47445a.b(marketingApi, (Map) obj);
            }
        });
        resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: rlo
            @Override // com.huawei.hmf.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                this.f47453c.a(exc);
            }
        });
    }

    public /* synthetic */ void b(MarketingApi marketingApi, Map map) {
        this.bu = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        d(marketingApi);
        a(marketingApi);
    }

    public /* synthetic */ void a(Exception exc) {
        LogUtil.j("CardDeviceFragment", "getNoDeviceMarketing request fail");
        this.an.setVisibility(8);
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.c((CardDeviceFragment) this, false);
        }
    }

    private void a(MarketingApi marketingApi) {
        if (this.d == null) {
            LogUtil.j("CardDeviceFragment", "mAddDeviceMarketingLayout is null ");
            return;
        }
        if (!this.bu.containsKey(4156)) {
            LogUtil.j("CardDeviceFragment", "showAddDeviceResource resource is null ");
            this.d.setVisibility(8);
            return;
        }
        if (this.d.getVisibility() == 0 || this.d.getChildCount() != 0) {
            LogUtil.j("CardDeviceFragment", "mAddDeviceMarketingLayout has showed, need not refresh");
            rmc rmcVar = this.v;
            if (rmcVar != null) {
                rmcVar.c((CardDeviceFragment) this, true);
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put(4156, this.bu.get(4156));
        List<View> marketingViewList = marketingApi.getMarketingViewList(this.h, map);
        LogUtil.a("CardDeviceFragment", "showAddDeviceResource viewList.size = ", Integer.valueOf(marketingViewList.size()));
        this.d.removeAllViews();
        if (njy.e(marketingViewList)) {
            this.d.setVisibility(8);
        } else {
            this.d.setVisibility(0);
            this.d.addView(marketingViewList.get(0));
        }
    }

    private void d(MarketingApi marketingApi) {
        ExecutorService executorService;
        if (!this.bu.containsKey(4086)) {
            LogUtil.j("CardDeviceFragment", "showNoDeviceLayout resource is null ");
            rmc rmcVar = this.v;
            if (rmcVar != null) {
                rmcVar.c((CardDeviceFragment) this, false);
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put(4086, this.bu.get(4086));
        final List<View> marketingViewList = marketingApi.getMarketingViewList(this.h, map);
        LogUtil.a("CardDeviceFragment", "showNoDeviceLayout viewList.size = ", Integer.valueOf(marketingViewList.size()));
        this.an.removeAllViews();
        if (njy.e(marketingViewList)) {
            this.an.setVisibility(8);
            rmc rmcVar2 = this.v;
            if (rmcVar2 != null) {
                rmcVar2.c((CardDeviceFragment) this, false);
                return;
            }
            return;
        }
        if (this.v == null || (executorService = this.q) == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: rln
            @Override // java.lang.Runnable
            public final void run() {
                this.f47452c.e(marketingViewList);
            }
        });
    }

    public /* synthetic */ void e(final List list) {
        if (!lvl.j().isEmpty()) {
            LogUtil.a("CardDeviceFragment", "showNoDeviceLayout wearInfoList not Empty");
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null || activity.isDestroyed() || activity.isFinishing()) {
            LogUtil.a("CardDeviceFragment", "showNoDeviceLayout activity IllegalState");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: rlk
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.c(list);
                }
            });
        }
    }

    public /* synthetic */ void c(List list) {
        this.an.removeAllViews();
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.c((CardDeviceFragment) this, true);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.an.addView((View) it.next());
        }
    }

    private void ag() {
        if (this.an.getVisibility() == 0) {
            LogUtil.a("CardDeviceFragment", "getNoDeviceMarketing mNoDeviceMarketingLayout == View.VISIBLE");
            rmc rmcVar = this.v;
            if (rmcVar != null) {
                rmcVar.c((CardDeviceFragment) this, true);
                return;
            }
            return;
        }
        if (this.an.getChildCount() != 0) {
            LogUtil.a("CardDeviceFragment", "getNoDeviceMarketing mNoDeviceMarketingLayout.getChildCount() != 0");
            rmc rmcVar2 = this.v;
            if (rmcVar2 != null) {
                rmcVar2.c((CardDeviceFragment) this, true);
                return;
            }
            return;
        }
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.j("CardDeviceFragment", "getNoDeviceMarketing marketingApi is null");
            rmc rmcVar3 = this.v;
            if (rmcVar3 != null) {
                rmcVar3.c((CardDeviceFragment) this, false);
                return;
            }
            return;
        }
        LogUtil.a("CardDeviceFragment", "getNoDeviceMarketing mNoDeviceMarketingColumnResultMap != null");
        d(marketingApi);
        a(marketingApi);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void f() {
        LogUtil.a("CardDeviceFragment", "enter initList");
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: rlv
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.j();
                }
            });
        }
    }

    public /* synthetic */ void j() {
        List<dru> arrayList = new ArrayList<>(16);
        ArrayList arrayList2 = new ArrayList(16);
        rtk.d(arrayList, arrayList2, this);
        if (Utils.h() && LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
            LogUtil.a("CardDeviceFragment", "initDeviceList isBrowseMode");
            arrayList = new ArrayList<>();
        } else {
            arrayList.addAll(efl.b());
            ArrayList<dru> arrayListC = rtk.c();
            if (njy.b(arrayListC)) {
                e(arrayList, arrayListC);
                arrayList.addAll(arrayListC);
            }
            Collections.sort(arrayList2);
            Collections.sort(arrayList);
            arrayList.addAll(0, arrayList2);
        }
        Handler handler = this.y;
        if (handler == null) {
            return;
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = arrayList;
        messageObtainMessage.what = 12;
        handler.sendMessage(messageObtainMessage);
    }

    private void e(List<dru> list, ArrayList<dru> arrayList) {
        Iterator<dru> it = list.iterator();
        while (it.hasNext()) {
            dru next = it.next();
            if (next.d() != null) {
                String asString = next.d().getAsString("mac");
                if (!TextUtils.isEmpty(asString)) {
                    for (dru druVar : arrayList) {
                        if (druVar.d() != null && asString.equals(druVar.d().getAsString("uniqueId"))) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    public void l() {
        String str;
        for (dru druVar : this.aj) {
            if (druVar.i() instanceof dxy) {
                dxy dxyVar = (dxy) druVar.i();
                CardDeviceAdapter cardDeviceAdapter = this.f;
                if (cardDeviceAdapter != null && cardDeviceAdapter.d() && (str = this.ar) != null && str.equals(dxyVar.d())) {
                    dxyVar.b(1);
                }
            }
        }
        af();
        LogUtil.a("CardDeviceFragment", "mProductInfoLists.size() is ", Integer.valueOf(this.aj.size()));
        rtk.b(this.q);
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.12
                @Override // java.lang.Runnable
                public void run() {
                    DeviceInfo deviceInfoC = mgg.c("CardDeviceFragment");
                    if (deviceInfoC == null || deviceInfoC.getDeviceConnectState() != 2) {
                        return;
                    }
                    tfn.a().h();
                    Handler handler = CardDeviceFragment.this.y;
                    if (handler == null) {
                        return;
                    }
                    Message messageObtainMessage = handler.obtainMessage();
                    messageObtainMessage.obj = deviceInfoC;
                    messageObtainMessage.what = 10;
                    handler.sendMessage(messageObtainMessage);
                }
            });
        }
    }

    private void af() {
        this.av.clear();
        this.bx.clear();
        this.by.clear();
        if (qrs.af(this.h)) {
            if (this.aj.size() == 1) {
                this.av.addAll(this.aj);
                dru druVar = new dru();
                druVar.d(2);
                this.av.add(druVar);
            } else if (!this.ai && this.aj.size() > 2) {
                this.av.addAll(this.aj.subList(0, 2));
            } else {
                this.av.addAll(this.aj);
            }
        } else if (!this.ai && this.aj.size() > 2) {
            this.av.addAll(this.aj.subList(0, 2));
        } else {
            this.av.addAll(this.aj);
        }
        if (this.aj.size() > 0) {
            s();
        } else {
            q();
            h();
        }
        if (!this.br) {
            this.br = true;
            if (!SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false) && LoginInit.getInstance(BaseApplication.getContext()).getIsLogined()) {
                mei.e().d();
                new dyd().b();
            }
        }
        WaterMarkCallback waterMarkCallback = this.bz;
        if (waterMarkCallback != null) {
            waterMarkCallback.refreshWaterMark();
        }
    }

    private void s() {
        dru druVarC;
        for (dru druVar : this.aj) {
            if (druVar != null) {
                int iE = druVar.e();
                LogUtil.a("CardDeviceFragment", "deviceType:" + iE);
                if (iE == 1) {
                    a(druVar);
                } else if (iE == 4) {
                    List<dru> listJ = druVar.j();
                    if (njy.e(listJ)) {
                        LogUtil.a("CardDeviceFragment", "sportDeviceList is empty");
                    } else {
                        Iterator<dru> it = listJ.iterator();
                        while (it.hasNext()) {
                            a(it.next());
                        }
                    }
                }
            }
        }
        if (this.bx.size() > 0) {
            DeviceInfo deviceInfoD = mgg.d("CardDeviceFragment");
            DeviceInfo deviceInfoD2 = mgi.d("CardDeviceFragment");
            if (deviceInfoD != null) {
                LogUtil.a("CardDeviceFragment", "checkRecommendList deviceId:", CommonUtil.n(deviceInfoD.getDeviceIdentify()));
                druVarC = rtk.c(deviceInfoD, this.av);
            } else if (deviceInfoD2 != null) {
                druVarC = rtk.c(deviceInfoD2, this.av);
            } else {
                druVarC = this.bx.get(0);
            }
        } else if (this.by.size() > 0) {
            druVarC = this.by.get(0);
        } else {
            LogUtil.j("CardDeviceFragment", "no wear device");
            druVarC = null;
        }
        if (druVarC != null && druVarC.e() == 1) {
            dxy dxyVar = (dxy) druVarC.i();
            a(dxyVar);
            if (dxyVar.b() == 2) {
                d(tfn.a().a(dxyVar.d()));
                return;
            }
            return;
        }
        q();
        h();
    }

    private void a(dru druVar) {
        if (druVar == null) {
            LogUtil.a("CardDeviceFragment", "deviceGroupInfo is null");
            return;
        }
        if (druVar.e() != 1) {
            LogUtil.a("CardDeviceFragment", "Invalid devicetype");
            return;
        }
        Object objI = druVar.i();
        if (!(objI instanceof dxy)) {
            LogUtil.a("CardDeviceFragment", "Invalid object");
        } else if (((dxy) objI).b() == 2) {
            this.bx.add(druVar);
        } else {
            this.by.add(druVar);
        }
    }

    private void d(final DeviceInfo deviceInfo) {
        LogUtil.a("CardDeviceFragment", "initMapSdk ");
        ExecutorService executorService = this.q;
        if (executorService == null || deviceInfo == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: rlp
            @Override // java.lang.Runnable
            public final void run() {
                CardDeviceFragment.e(deviceInfo);
            }
        });
    }

    public static /* synthetic */ void e(DeviceInfo deviceInfo) {
        if (((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfo)) {
            LogUtil.a("CardDeviceFragment", "OfflineMapEngineManager  initWearEngineAbility");
            rdo.b().a(BaseApplication.getContext(), deviceInfo.getDeviceUdid());
        }
    }

    private void q() {
        tod todVar = this.bd;
        if (todVar != null) {
            todVar.a();
        }
        this.aq.clear();
    }

    private void a(dxy dxyVar) {
        LogUtil.a("CardDeviceFragment", "packRecommend");
        this.af = false;
        this.r = dxyVar.d();
        if (dxyVar.b() == 2) {
            this.aa = true;
            DeviceCapability deviceCapabilityC = rtk.c(this.r);
            if (deviceCapabilityC == null) {
                h();
                return;
            }
            if (deviceCapabilityC.isSupportWatchFace()) {
                tqp.c(dxyVar.g(), this.r, true);
            } else {
                tqp.a(dxyVar.g(), this.r);
            }
            if ((dxyVar.l() != 1 || !tqp.e(dxyVar.g())) && deviceCapabilityC.isSupportWatchFace()) {
                if (this.bg == 1) {
                    this.aq.clear();
                    if (!Utils.o()) {
                        this.aq.add(rtk.e(1, dxyVar));
                    } else {
                        d(dxyVar);
                    }
                    b(dxyVar, deviceCapabilityC);
                    rtk.d(this.aq);
                    if (deviceCapabilityC.isSupportMarketFace() || deviceCapabilityC.isSupportMarketParams()) {
                        return;
                    }
                    this.af = true;
                    h();
                    return;
                }
                h(dxyVar);
                return;
            }
            q();
            b(dxyVar, deviceCapabilityC);
            rtk.d(this.aq);
            this.af = true;
            h();
            return;
        }
        e(dxyVar);
    }

    private void e(dxy dxyVar) {
        String mac;
        this.aa = false;
        this.aq.clear();
        LogUtil.a("CardDeviceFragment", "dealWatchFaceDisConnect");
        if (tqp.e(dxyVar.g(), this.r) && (dxyVar.l() != 1 || !tqp.e(dxyVar.g()))) {
            if (this.bg == 1) {
                d(dxyVar);
            } else {
                h(dxyVar);
            }
        }
        List<RecommendedItem> listB = rtk.b();
        if (listB.size() <= 0) {
            mac = "";
        } else {
            mac = listB.get(0).getMac();
        }
        if (mac.equalsIgnoreCase(nio.c(this.r))) {
            this.aq.addAll(listB);
        }
        ai();
        h();
    }

    private void ai() {
        for (RecommendedItem recommendedItem : this.aq) {
            if (recommendedItem.getId() == 4) {
                recommendedItem.setIsShowRedDot(lyy.b().c(this.r));
                return;
            }
        }
    }

    public void b(Message message) {
        if (!(message.obj instanceof DeviceInfo)) {
            LogUtil.j("CardDeviceFragment", "handlerDeviceConnectedChanged message.obj not instanceof DeviceInfo");
            return;
        }
        DeviceInfo deviceInfo = (DeviceInfo) message.obj;
        LogUtil.a("CardDeviceFragment", "handlerDeviceConnectedChanged CONNECT_STATE = ", Integer.valueOf(deviceInfo.getDeviceConnectState()), " DeviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " LastConnectedTime:", Long.valueOf(deviceInfo.getLastConnectedTime()));
        LinkedList<String> linkedList = this.bh.get(deviceInfo.getDeviceIdentify());
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.bh.put(deviceInfo.getDeviceIdentify(), linkedList);
        }
        linkedList.addLast(String.valueOf(deviceInfo.getLastConnectedTime()) + deviceInfo.getDeviceConnectState());
        a(deviceInfo, this.y);
    }

    public void b(Intent intent, Handler handler) {
        LinkedList<String> linkedList;
        try {
            DeviceInfo deviceInfo = (DeviceInfo) intent.getParcelableExtra("deviceinfo");
            if (deviceInfo == null) {
                LogUtil.j("CardDeviceFragment", "mNonLocalBroadcastReceiver() deviceInfo = null");
                return;
            }
            int deviceConnectState = deviceInfo.getDeviceConnectState();
            LogUtil.a("CardDeviceFragment", "switchDeviceHandler CONNECT_STATE = ", Integer.valueOf(deviceConnectState), " DeviceIdentify:", CommonUtil.n(deviceInfo.getDeviceIdentify()), " LastConnectedTime:", Long.valueOf(deviceInfo.getLastConnectedTime()));
            if (e(deviceConnectState) && (linkedList = this.bh.get(deviceInfo.getDeviceIdentify())) != null) {
                if (linkedList.removeFirstOccurrence(String.valueOf(deviceInfo.getLastConnectedTime()) + deviceInfo.getDeviceConnectState())) {
                    LogUtil.a("CardDeviceFragment", "switchDeviceHandler removeFirstOccurrence");
                    return;
                }
            }
            this.bh.remove(deviceInfo.getDeviceIdentify());
            a(deviceInfo, handler);
        } catch (ClassCastException e) {
            LogUtil.e("CardDeviceFragment", "DeviceInfo deviceInfo error :", e.getMessage());
        }
    }

    private void a(DeviceInfo deviceInfo, Handler handler) {
        rmc rmcVar;
        this.bl = true;
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
        this.bk = deviceInfo;
        LogUtil.a("CardDeviceFragment", "switchDeviceHandler CONNECT_STATE = ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        if (deviceInfo.getDeviceConnectState() == 2) {
            messageObtainMessage.what = 30;
            handler.sendMessage(messageObtainMessage);
            a(deviceInfo);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 3 || deviceInfo.getDeviceConnectState() == 4) {
            messageObtainMessage.what = 32;
            messageObtainMessage.arg1 = deviceInfo.getProductType();
            messageObtainMessage.obj = deviceInfo.getDeviceIdentify();
            handler.sendMessage(messageObtainMessage);
            dxx.d().f(-1);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 1 || deviceInfo.getDeviceConnectState() == 9 || deviceInfo.getDeviceConnectState() == 13 || deviceInfo.getDeviceConnectState() == 10) {
            messageObtainMessage.what = 33;
            messageObtainMessage.arg1 = deviceInfo.getDeviceConnectState();
            handler.sendMessage(messageObtainMessage);
            handler.sendMessageDelayed(rtk.c(0, deviceInfo.getProductType()), 20000L);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 6 || deviceInfo.getDeviceConnectState() == 5) {
            handler.removeMessages(36);
            d(deviceInfo, messageObtainMessage, handler);
            if (deviceInfo.getDeviceConnectState() != 5 || (rmcVar = this.v) == null) {
                return;
            }
            rmcVar.d(this);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 11) {
            if (deviceInfo.getDeviceFactoryReset() == 1 && CommonUtil.i(this.h, "com.huawei.health.MainActivity")) {
                rtk.e(this.h, deviceInfo);
                return;
            }
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 12) {
            b(deviceInfo);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 34) {
            this.v.b(this, deviceInfo);
        } else if (deviceInfo.getDeviceConnectState() == 15) {
            c(deviceInfo, handler, messageObtainMessage);
        } else {
            LogUtil.j("CardDeviceFragment", "mNonLocalBroadcastReceiver() other state");
        }
    }

    private void c(DeviceInfo deviceInfo, Handler handler, Message message) {
        if (!CommonUtil.i(this.h, "com.huawei.health.MainActivity")) {
            LogUtil.j("CardDeviceFragment", "mainActivity is not isForeground");
            return;
        }
        this.bk = deviceInfo;
        message.what = 33;
        message.arg1 = deviceInfo.getDeviceConnectState();
        handler.sendMessage(message);
        mgh.a(getActivity());
    }

    private void b(DeviceInfo deviceInfo) {
        this.v.d(this, deviceInfo);
    }

    private void a(DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 112);
        LogUtil.a("CardDeviceFragment", "afterConnectedProcess. isSupportEarPhone: ", Boolean.valueOf(zD));
        if (WatchFaceUtil.isSupportMyWatch(deviceInfo)) {
            LogUtil.a("CardDeviceFragment", "afterConnectedProcess reload watchface params");
            WatchFaceManager.getInstance().refreshWatchFaceInfo(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: rlj
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("CardDeviceFragment", "afterConnectedProcess reload watchface params finish");
                }
            });
            WatchFaceManager.getInstance().getWearWatchInfoFromDevice(deviceInfo.getDeviceIdentify(), false, WatchFaceManager.WATCH_FACE_LOCAL_LIST_KEY_PREFIX, new ResponseCallback() { // from class: rll
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a("CardDeviceFragment", "afterConnectedProcess reload watchface list finish");
                }
            });
        }
        ((DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class)).downLoadCommonConfig();
        if (zD && CommonUtil.i(this.h, "com.huawei.health.MainActivity")) {
            LogUtil.a("CardDeviceFragment", "afterConnectedProcess. in");
            if (!rtk.i()) {
                LogUtil.j("CardDeviceFragment", "afterConnectedProcess. is not currentActivity");
            } else {
                lxb.c().b(deviceInfo, new AnonymousClass14(deviceInfo));
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.CardDeviceFragment$14, reason: invalid class name */
    public class AnonymousClass14 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f25180b;

        AnonymousClass14(DeviceInfo deviceInfo) {
            this.f25180b = deviceInfo;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (CardDeviceFragment.this.getActivity() != null) {
                FragmentActivity activity = CardDeviceFragment.this.getActivity();
                final DeviceInfo deviceInfo = this.f25180b;
                activity.runOnUiThread(new Runnable() { // from class: rlx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.c(deviceInfo);
                    }
                });
            }
        }

        public /* synthetic */ void c(DeviceInfo deviceInfo) {
            Intent intent = new Intent();
            intent.setClass(CardDeviceFragment.this.h, EarphonePairActivity.class);
            intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
            CardDeviceFragment.this.startActivity(intent);
        }
    }

    public void a() {
        DeviceInfo deviceInfo = this.bk;
        if (deviceInfo == null) {
            LogUtil.j("CardDeviceFragment", "afterOobeConnectedProcess. mDeviceInfo is null. ");
            return;
        }
        boolean zD = eey.d(deviceInfo, 112);
        LogUtil.a("CardDeviceFragment", "afterOobeConnectedProcess. isSupportEarPhone: ", Boolean.valueOf(zD));
        if (zD) {
            LogUtil.a("CardDeviceFragment", "afterOobeConnectedProcess. in");
            lxb.c().b(this.bk, new AnonymousClass11());
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.CardDeviceFragment$11, reason: invalid class name */
    public class AnonymousClass11 implements IBaseResponseCallback {
        AnonymousClass11() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (CardDeviceFragment.this.getActivity() != null) {
                CardDeviceFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: rlz
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47459a.a();
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            Intent intent = new Intent();
            intent.setClass(CardDeviceFragment.this.h, EarphonePairActivity.class);
            intent.putExtra("device_identify", CardDeviceFragment.this.bk.getDeviceIdentify());
            CardDeviceFragment.this.startActivity(intent);
        }
    }

    private void d(DeviceInfo deviceInfo, Message message, Handler handler) {
        Message messageObtain = Message.obtain();
        messageObtain.arg1 = deviceInfo.getProductType();
        messageObtain.what = 36;
        messageObtain.obj = message.obj;
        handler.sendMessage(messageObtain);
    }

    private void h(final dxy dxyVar) {
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.13
                @Override // java.lang.Runnable
                public void run() {
                    boolean zIsSupportWatchFaceMarket = WatchFaceUtil.isSupportWatchFaceMarket();
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 38;
                    messageObtain.arg1 = zIsSupportWatchFaceMarket ? 1 : 2;
                    LogUtil.a("CardDeviceFragment", "message.arg1 ", Integer.valueOf(messageObtain.arg1));
                    messageObtain.obj = dxyVar;
                    CardDeviceFragment.this.y.sendMessage(messageObtain);
                }
            });
        }
    }

    private void g(final dxy dxyVar) {
        ReleaseLogUtil.d("R_CardDeviceFragment", "requestOverseaWallet enter");
        if (this.q == null) {
            LogUtil.a("CardDeviceFragment", "requestOverseaWallet mGetDataService is null");
        } else {
            WalletAppManager.getInstance().getValidWalletApplication(dxyVar.d(), new ResponseCallback() { // from class: rli
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.e.e(dxyVar, i, (List) obj);
                }
            });
        }
    }

    public /* synthetic */ void e(dxy dxyVar, int i, List list) {
        int i2;
        ReleaseLogUtil.d("R_CardDeviceFragment", "requestOverseaWallet get valid wallet");
        if (!njy.e(list)) {
            ReleaseLogUtil.d("R_CardDeviceFragment", "requestOverseaWallet is support");
            i2 = 1;
        } else {
            ReleaseLogUtil.d("R_CardDeviceFragment", "requestOverseaWallet not support");
            i2 = 2;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 47;
        messageObtain.arg1 = i2;
        LogUtil.a("CardDeviceFragment", "requestOverseaWallet message:", Integer.valueOf(messageObtain.arg1));
        messageObtain.obj = dxyVar;
        this.y.sendMessage(messageObtain);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("CardDeviceFragment", "onDestroy ", this.h);
        DownloadCloudDeviceResource downloadCloudDeviceResource = this.f25173a;
        if (downloadCloudDeviceResource != null) {
            downloadCloudDeviceResource.b();
            this.f25173a = null;
        }
        UserLabelServiceApi userLabelServiceApi = this.ca;
        if (userLabelServiceApi != null) {
            userLabelServiceApi.unRegisterCallback(4);
            this.ca.unRegisterCallback(5);
        }
        if (this.be != null) {
            this.be = null;
        }
        List<CloudSwatchDeviceInfo> list = this.bv;
        if (list != null) {
            list.clear();
            this.bv = null;
        }
        DownloadCloudDeviceManager downloadCloudDeviceManager = this.bn;
        if (downloadCloudDeviceManager != null) {
            downloadCloudDeviceManager.b();
            this.bn = null;
        }
        rmc rmcVar = this.v;
        if (rmcVar != null) {
            rmcVar.g(this);
            rmc.e();
            rmc.a();
            this.v = null;
        }
        tod todVar = this.bd;
        if (todVar != null) {
            todVar.onDestroy();
        }
        if (this.cb != null) {
            lvb.e().b().removeObserver(this.cb);
            this.cb = null;
        }
        WatchFaceManager.getInstance().unregisterIdReportCb("CardDeviceFragment");
    }

    private void k() {
        LogUtil.a("CardDeviceFragment", "enter checkEnableDevice");
        ExecutorService executorService = this.q;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: rlt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47456c.d();
                }
            });
        }
    }

    public /* synthetic */ void d() {
        if (BTDeviceMgrUtil.c().h() != 3) {
            LogUtil.j("CardDeviceFragment", "checkEnableDevice bluetooth off");
            return;
        }
        if (!BluetoothPermisionUtils.d(getActivity())) {
            LogUtil.j("CardDeviceFragment", "checkEnableDevice nearby permisison Denied");
            return;
        }
        List<DeviceInfo> listG = dxx.d().g();
        if (listG == null || listG.size() <= 0) {
            LogUtil.j("CardDeviceFragment", "checkEnableDevice return");
            return;
        }
        Iterator<dxy> it = lvl.j().iterator();
        int i = 0;
        while (it.hasNext() && (!rdp.d(it.next().g()) || (i = i + 1) <= 1)) {
        }
        for (DeviceInfo deviceInfo : listG) {
            if (i != 2 || !rdp.d(deviceInfo.getProductType())) {
                if (deviceInfo.getDeviceConnectState() == 3 || deviceInfo.getDeviceConnectState() == 4) {
                    if (deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceBluetoothType() == 2) {
                        d(listG, deviceInfo);
                    }
                }
            }
        }
        deviceInfo = null;
        d(listG, deviceInfo);
    }

    private void d(List<DeviceInfo> list, DeviceInfo deviceInfo) {
        LogUtil.a("CardDeviceFragment", "autoReconnectDevice");
        if (deviceInfo != null) {
            LogUtil.a("CardDeviceFragment", "reconnect active bleDeviceInfo ", deviceInfo);
            deviceInfo.setDeviceConnectState(1);
            tfn.a().d(list, deviceInfo.getDeviceIdentify());
            Handler handler = this.y;
            if (handler == null) {
                return;
            }
            Message messageObtainMessage = handler.obtainMessage();
            messageObtainMessage.obj = deviceInfo;
            messageObtainMessage.what = 13;
            handler.sendMessage(messageObtainMessage);
        }
    }

    private void y() {
        if (this.bq || !this.bw) {
            return;
        }
        List<DeviceInfo> listG = dxx.d().g();
        if (listG == null || listG.isEmpty()) {
            LogUtil.j("CardDeviceFragment", "enter applyLocationPermission deviceList is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (DeviceInfo deviceInfo : listG) {
            if (deviceInfo != null && deviceInfo.getDeviceActiveState() == 1 && deviceInfo.getDeviceConnectState() == 2) {
                rtk.d(deviceInfo, arrayList);
                z = true;
            }
        }
        if (!z || arrayList.size() <= 0) {
            return;
        }
        LogUtil.a("CardDeviceFragment", "checkPermissions permissionsList size ", Integer.valueOf(arrayList.size()));
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        if (tqp.d(getActivity(), strArr) && tqp.a(getActivity(), strArr, null)) {
            this.bq = true;
            CommonUtil.k(BaseApplication.getContext(), "android.permission.ACCESS_COARSE_LOCATION");
        }
    }

    public void b(WaterMarkCallback waterMarkCallback) {
        this.bz = waterMarkCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 102) {
            rdp.c(this.h);
        }
        if (i == 608) {
            ReleaseLogUtil.d("CardDeviceFragment", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            res.d().c(String.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                res.d().a("R_CardDeviceFragment", intent);
                res.d().b();
                return;
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.17
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    if (i3 == -1) {
                        res.d().e(CardDeviceFragment.this.h);
                    } else {
                        res.d().c(String.valueOf(608));
                        res.d().b();
                    }
                }
            }, getActivity());
            return;
        }
        mgh.a(i, i2, intent, this.bk);
    }

    public void a(Intent intent) {
        if (intent == null) {
            LogUtil.j("CardDeviceFragment", "markConnectingDevice intent is null.");
            return;
        }
        if ("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
            LogUtil.j("CardDeviceFragment", "markConnectingDevice cloud device no handle.");
            return;
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
        if (!(parcelableExtra instanceof DeviceInfo)) {
            LogUtil.j("CardDeviceFragment", "markConnectingDevice parcelable not instanceof DeviceInfo");
            return;
        }
        int deviceConnectState = ((DeviceInfo) parcelableExtra).getDeviceConnectState();
        if (deviceConnectState == 2 || deviceConnectState == 3 || deviceConnectState == 4) {
            this.ab = false;
        } else {
            this.ab = true;
        }
    }

    public void a(List<DeviceInfo> list) {
        if (this.bs == null) {
            LogUtil.j("CardDeviceFragment", "resetShowVipTipView mPayApi is null");
            return;
        }
        if (list == null || list.isEmpty()) {
            LogUtil.j("CardDeviceFragment", "resetShowVipTipView newDeviceInfo is null");
            this.y.sendMessage(rtk.b(-1));
        } else {
            LogUtil.a("CardDeviceFragment", "enter resetShowVipTipView");
            d(list);
        }
    }

    private void d(final List<DeviceInfo> list) {
        this.bi.clear();
        this.bp = 0;
        for (final DeviceInfo deviceInfo : list) {
            LogUtil.a("CardDeviceFragment", "enter addAllDataInfoList");
            this.bs.getDeviceBenefits(qhu.d(deviceInfo, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_ALL, true), new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.CardDeviceFragment.16
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    List<T> listC = CardDeviceFragment.this.az.c(i, obj, deviceInfo);
                    LogUtil.a("CardDeviceFragment", "addAllDataInfoList newAllDataInfoList size is ", Integer.valueOf(listC.size()));
                    CardDeviceFragment.this.bi.addAll(listC);
                    LogUtil.a("CardDeviceFragment", "addAllDataInfoList mAllDataInfoList size is ", Integer.valueOf(CardDeviceFragment.this.bi.size()));
                    CardDeviceFragment.i(CardDeviceFragment.this);
                    if (CardDeviceFragment.this.bp == list.size()) {
                        LogUtil.a("CardDeviceFragment", "addAllDataInfoList mAllDataInfoListNew size is ", Integer.valueOf(CardDeviceFragment.this.bi.size()));
                        CardDeviceFragment.this.az.e(CardDeviceFragment.this.y, CardDeviceFragment.this.bi);
                        if (CardDeviceFragment.this.bi.isEmpty()) {
                            CardDeviceFragment.this.c(true);
                        } else {
                            CardDeviceFragment.this.c(false);
                        }
                    }
                }
            });
        }
    }

    public void c(boolean z) {
        LogUtil.a("CardDeviceFragment", "showVipRedDot isAllActive is:", Boolean.valueOf(z), " update red dot");
        if (getParentFragment() instanceof DeviceFragment) {
            DeviceFragment deviceFragment = (DeviceFragment) getParentFragment();
            if (z()) {
                deviceFragment.c(false);
            } else if (!z) {
                deviceFragment.c(true);
            } else {
                deviceFragment.c(false);
            }
        }
    }

    private boolean z() {
        String accountInfo = LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011);
        String strB = SharedPreferenceManager.b(Integer.toString(10008), "equity_click_red_dot_status", "");
        if (TextUtils.isEmpty(strB) || !strB.contains(",")) {
            LogUtil.j("CardDeviceFragment", "showVipRedDot deviceStrategyIds is empty");
            return false;
        }
        List<String> listAsList = Arrays.asList(strB.split(","));
        LogUtil.a("CardDeviceFragment", "showVipRedDot deviceStrategyIdList size is:", Integer.valueOf(listAsList.size()));
        boolean zB = false;
        for (String str : listAsList) {
            zB = SharedPreferenceManager.b(Integer.toString(10008), "equity_click_red_dot_status" + accountInfo + str, false);
            if (zB) {
                break;
            }
        }
        return zB;
    }

    private boolean ad() {
        boolean zA = Utils.a(this.h);
        LogUtil.a("CardDeviceFragment", "isKoreaVersion is:", Boolean.valueOf(zA));
        return zA;
    }
}
