package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.media3.common.C;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.design.pattern.Observer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubManager;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubObserver;
import com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData;
import com.huawei.health.health.utils.functionsetcard.reader.FunctionSetBeanReader;
import com.huawei.health.manager.util.TimeUtil;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.CloudParamKeys;
import com.huawei.phoneservice.websurvey.NpsSurveyResponse;
import com.huawei.phoneservice.websurvey.ui.SurveyWebActivity;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.pluginhealthzone.jsmodule.PluginHealthH5InteractionUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.dialogcarddata.DialogCardViewHolder;
import com.huawei.ui.homehealth.util.KeepLiveUtil;
import com.huawei.ui.main.stories.me.util.StepCounterSupportUtil;
import com.huawei.ui.main.stories.nps.activity.EcologyNpsSurveyActivity;
import com.huawei.ui.main.stories.nps.activity.QuestionMainActivity;
import com.huawei.ui.main.stories.nps.harid.HagridNpsManager;
import com.huawei.ui.main.stories.nps.interactors.HwNpsManager;
import com.huawei.ui.main.stories.nps.interactors.mode.DeviceWebSurveyInfo;
import com.huawei.ui.main.stories.nps.interactors.mode.QuestionSurveyDetailResponse;
import com.huawei.ui.main.stories.nps.interactors.util.DeviceWebNpsUtil;
import com.huawei.ui.main.stories.nps.npsstate.NpsUserShowController;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.DaemonServiceSpUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes17.dex */
public class sho extends AbstractBaseCardData {
    private DeviceInfo ab;
    private final List<Integer> ac;
    private String ad;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Handler f48077c;
    private b d;
    private DialogCardViewHolder f;
    private String g;
    private int h;
    private DeviceWebSurveyInfo i;
    private Context j;
    private boolean k;
    private volatile boolean l;
    private boolean n;
    private Map<String, String> o;
    private CustomViewDialog p;
    private BroadcastReceiver q;
    private NoTitleCustomAlertDialog r;
    private boolean s;
    private boolean t;
    private int u;
    private String v;
    private f w;
    private boolean x;
    private LinkedHashMap<String, String> y;
    private wss z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List<uif> f48075a = new ArrayList(10);
    protected int e = StepCounterSupportUtil.b(BaseApplication.getContext());
    private HealthOpenSDK m = null;
    private String aa = null;

    public sho(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.ac = arrayList;
        this.v = "";
        this.d = new b(this);
        this.s = false;
        this.l = true;
        this.x = false;
        this.ad = "";
        this.h = -1;
        this.f48076b = false;
        this.y = new LinkedHashMap<>(5);
        this.o = new ConcurrentHashMap();
        this.q = new BroadcastReceiver() { // from class: sho.5
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                if (intent == null) {
                    LogUtil.e("SCUI_DialogCardData", "BroadcastReceiver intent == null");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                LogUtil.a("SCUI_DialogCardData", "mNewTipReceiver onReceive ", action);
                if ("com.huawei.health.action.NPL_SERVICE_NOT_AVALIABLE".equals(action)) {
                    sho.this.d(4);
                } else if ("com.huawei.health.action.NO_CALL_REJECT_PERMISION".equals(action)) {
                    sho.this.au();
                } else if ("com.huawei.bone.action.NEW_ECG_DATA_RECEIVED".equals(action)) {
                    sho.this.d(10);
                }
            }
        };
        this.mPositionTag = -30;
        this.j = context == null ? BaseApplication.getContext() : context;
        this.t = z;
        this.f48077c = new e(Looper.getMainLooper(), this);
        bf();
        ObserverManagerUtil.d(this.d, "closeStepsTips");
        ObserverManagerUtil.d(new Observer() { // from class: shm
            @Override // com.huawei.haf.design.pattern.Observer
            public final void notify(String str, Object[] objArr) {
                this.d.d(str, objArr);
            }
        }, "TIPS_OTHER_DEVICES_SYNC_STEPS");
        KeepLiveUtil.d(this, arrayList, new KeepLiveUtil.KeepLiveCallback() { // from class: sho.11
            @Override // com.huawei.ui.homehealth.util.KeepLiveUtil.KeepLiveCallback
            public void onResult() {
                sho.this.e("2");
            }
        });
        ag();
        d();
        z();
    }

    /* synthetic */ void d(String str, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        if (this.f48075a.size() <= 1) {
            ReleaseLogUtil.e("SCUI_DialogCardData", "OriginListData is null or size less than two");
        } else {
            if (this.ac.contains(6)) {
                return;
            }
            LogUtil.a("SCUI_DialogCardData", "TIPS_OTHER_DEVICES_SYNC_STEPS add");
            d(6);
        }
    }

    public void d() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sii
            @Override // java.lang.Runnable
            public final void run() {
                this.e.n();
            }
        });
    }

    /* synthetic */ void n() {
        final DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "SCUI_DialogCardData");
        HandlerExecutor.a().post(new Runnable() { // from class: shy
            @Override // java.lang.Runnable
            public final void run() {
                this.e.e(deviceInfo);
            }
        });
    }

    /* synthetic */ void e(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("SCUI_DialogCardData", "checkCompanionPermission currentDeviceInfo is null.");
            return;
        }
        if (deviceInfo.getDeviceConnectState() != 2) {
            LogUtil.a("SCUI_DialogCardData", "checkCompanionPermission device disconnect.");
            return;
        }
        if (g(deviceInfo.getProductType())) {
            if (!this.ac.contains(104)) {
                d(104);
            }
            this.ab = deviceInfo;
            c(deviceInfo);
            return;
        }
        f();
    }

    private void ag() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: shs
            @Override // java.lang.Runnable
            public final void run() {
                this.f48104c.q();
            }
        });
    }

    /* synthetic */ void q() {
        if (this.z == null) {
            this.z = wss.d(this.j);
        }
        LogUtil.a("SCUI_DialogCardData", "start query bind");
        this.l = !"false".equals(this.z.c(this.j));
        LogUtil.a("SCUI_DialogCardData", "end to query bind");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        g();
        if (layoutInflater == null) {
            LogUtil.e("SCUI_DialogCardData", "getCardViewHolder layoutInflater == null");
            layoutInflater = LayoutInflater.from(BaseApplication.getContext());
        }
        DialogCardViewHolder dialogCardViewHolder = new DialogCardViewHolder(layoutInflater.inflate(R.layout.layout_step_card_container, viewGroup, false), this.j, false);
        this.f = dialogCardViewHolder;
        c(dialogCardViewHolder.o());
        l();
        return this.f;
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public String getCardName() {
        return "SCUI_DialogCardData";
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onResume() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onResume();
        ag();
        d();
        z();
        if (!this.t) {
            b();
        }
        ac();
        aa();
        ReleaseLogUtil.d("SCUI_DialogCardData", "main card onResume finished, time cost: " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (ah() == null || !ah().ah()) {
            return;
        }
        c(this.f.o());
        l();
        onResume();
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onPause() {
        LogUtil.a("SCUI_DialogCardData", "====onPause====");
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void onDestroy() {
        super.onDestroy();
        cg();
        BroadcastManagerUtil.b(this.j, this.w);
        ObserverManagerUtil.a(this.d, "closeStepsTips");
        ObserverManagerUtil.a("TIPS_OTHER_DEVICES_SYNC_STEPS");
        H5ProEventHubManager.removeObserver("family-space.01");
        Handler handler = this.f48077c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public void a(boolean z) {
        this.t = z;
    }

    public void b() {
        LogUtil.a("SCUI_DialogCardData", "executeAfterGuide");
        bb();
        ba();
        boolean isLogined = LoginInit.getInstance(BaseApplication.getContext()).getIsLogined();
        e(isLogined);
        b(isLogined);
        ay();
        bl();
    }

    private void b(boolean z) {
        if (z) {
            return;
        }
        if (ah() == null || ah().x() == null) {
            LogUtil.j("SCUI_DialogCardData", "setSyncCloudDataFailLayoutVisibility viewHolder or mSyncCloudDataFailLayout = null");
        } else {
            this.ac.remove((Object) 100);
        }
    }

    protected void l() {
        StepCounterSupportUtil.a(new StepCounterSupportUtil.StepCounterClassCallback() { // from class: sht
            @Override // com.huawei.ui.main.stories.me.util.StepCounterSupportUtil.StepCounterClassCallback
            public final void getDeviceClass(int i) {
                this.f48105b.b(i);
            }
        });
        u();
    }

    /* synthetic */ void b(int i) {
        this.e = i;
        if (i == 3) {
            d(1);
        }
        refreshCardData();
    }

    private void aa() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: sig
            @Override // java.lang.Runnable
            public final void run() {
                this.d.s();
            }
        });
    }

    /* synthetic */ void s() {
        if (System.currentTimeMillis() - SharedPreferenceManager.d(Integer.toString(10000), "KEY_HAS_STEP_NOTIFICATION", 0L) <= Constants.ANALYSIS_EVENT_KEEP_TIME || this.j == null || this.m == null || !aj() || CommonUtil.bg()) {
            return;
        }
        this.m.d((IExecuteResult) new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bt() {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: sid
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48118a.bt();
                }
            });
            return;
        }
        ipb.c("3");
        View viewInflate = View.inflate(this.j, R.layout.step_message_switch_dialog, null);
        CustomViewDialog.Builder builder = new CustomViewDialog.Builder(this.j);
        builder.a(this.j.getString(R.string.IDS_steps_third_message_switch)).d(viewInflate).d(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: shz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(view);
            }
        });
        builder.c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: sho.25
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ipb.c("2");
                LogUtil.a("SCUI_DialogCardData", " checkMessageSwitchDialog setNegativeButton onClick.");
                SharedPreferenceManager.c(Integer.toString(10000), "KEY_HAS_STEP_NOTIFICATION", System.currentTimeMillis());
            }
        });
        CustomViewDialog customViewDialogD = builder.d();
        this.p = customViewDialogD;
        customViewDialogD.setCancelable(false);
        if (this.s) {
            return;
        }
        this.p.show();
        this.s = true;
    }

    /* synthetic */ void a(View view) {
        this.m.b(true, null);
        ipb.c("1");
    }

    private boolean aj() {
        return Build.VERSION.SDK_INT >= 28 && this.e != 3;
    }

    private void bf() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("sync_cloud_data_action");
            f fVar = new f(this);
            this.w = fVar;
            BroadcastManagerUtil.e(this.j, fVar, intentFilter);
        } catch (Exception unused) {
            LogUtil.e("SCUI_DialogCardData", "registerSyncCloudDataReceiver Exception");
        }
    }

    private void cg() {
        try {
            LogUtil.d("SCUI_DialogCardData", "Enter unRegisterNewTipBroadcast register");
            Context context = this.j;
            if (context != null) {
                context.unregisterReceiver(this.q);
            }
        } catch (IllegalArgumentException e2) {
            LogUtil.e("SCUI_DialogCardData", LogAnonymous.b(e2));
        } catch (RuntimeException e3) {
            LogUtil.e("SCUI_DialogCardData", LogAnonymous.b(e3));
        }
    }

    private void ay() {
        lsy.a(new Runnable() { // from class: shl
            @Override // java.lang.Runnable
            public final void run() {
                this.f48074b.w();
            }
        });
    }

    /* synthetic */ void w() {
        LogUtil.a("SCUI_DialogCardData", "enter queryPluginTips");
        String strC = ohf.e().c();
        this.g = strC;
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("SCUI_DialogCardData", "queryPluginTips mDownloadPluginName is empty");
        } else if (this.ac.contains(9)) {
            this.f48077c.sendEmptyMessage(35);
        } else {
            this.f48077c.sendEmptyMessage(36);
        }
    }

    private void e(boolean z) {
        LogUtil.a("SCUI_DialogCardData", "enter queryIsShowBindTips");
        if (!z || Utils.o() || LoginInit.getInstance(BaseApplication.getContext()).isKidAccount()) {
            LogUtil.j("SCUI_DialogCardData", "queryIsShowBindTips not login or isOverSea");
            n(8);
        } else if (ak()) {
            LogUtil.a("SCUI_DialogCardData", "queryIsShowBindTips has show");
            n(8);
        } else if (this.l) {
            LogUtil.a("SCUI_DialogCardData", "isBinded or isOevesea");
            this.f48077c.sendEmptyMessage(31);
        } else {
            this.f48077c.sendEmptyMessage(30);
        }
    }

    private boolean ak() {
        Pair<Long, Integer> pairAi = ai();
        Long l = (Long) pairAi.first;
        long jLongValue = l.longValue();
        Integer num = (Integer) pairAi.second;
        int iIntValue = num.intValue();
        LogUtil.a("SCUI_DialogCardData", "hasShownTips showTimes ", num, " lastShowTime ", l);
        if (jLongValue == 0 && iIntValue == 0) {
            return false;
        }
        return iIntValue >= 4 || System.currentTimeMillis() - jLongValue <= 604800000;
    }

    private Pair<Long, Integer> ai() {
        String strE = SharedPreferenceManager.e(this.j, Integer.toString(10000), "BIND_WECHAT_TIME_AND_INTERVAL");
        if (TextUtils.isEmpty(strE)) {
            return new Pair<>(0L, 0);
        }
        String[] strArrSplit = strE.split("#");
        if (strArrSplit.length == 2) {
            return new Pair<>(Long.valueOf(CommonUtil.m(this.j, strArrSplit[0])), Integer.valueOf(CommonUtil.n(this.j, strArrSplit[1])));
        }
        return new Pair<>(0L, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(int i) {
        if (ah() == null || ah().ae() == null) {
            LogUtil.j("SCUI_DialogCardData", "setWeChatLayoutVisibility mStepsCardViewHolder = null");
            return;
        }
        ah().ae().setVisibility(i);
        if (i == 8) {
            this.ac.remove((Object) 7);
        }
    }

    private void ba() {
        LogUtil.a("SCUI_DialogCardData", "enter queryIsHiAiTips");
        if (ao()) {
            if (this.ac.contains(8)) {
                LogUtil.a("SCUI_DialogCardData", "send show HI AI message");
                this.f48077c.sendEmptyMessage(34);
                return;
            } else {
                this.f48077c.sendEmptyMessage(32);
                return;
            }
        }
        this.f48077c.sendEmptyMessage(33);
    }

    private boolean ao() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("downloadHiAiPlugin");
        LogUtil.a("SCUI_DialogCardData", "HI_AI_PLUGIN is:", strC);
        return (!AppBundle.c().isBundleModule("PluginHiAiEngine") || AppBundle.d().getInstalledModules().contains("PluginHiAiEngine") || TextUtils.isEmpty(strC)) ? false : true;
    }

    private void bb() {
        if (av()) {
            LogUtil.a("SCUI_DialogCardData", "showHealthNps");
            String string = this.j.getResources().getString(R.string.nps_user_survey_title);
            this.v = string;
            this.u = 3;
            a(true, string, 3);
            return;
        }
        if (as()) {
            LogUtil.a("SCUI_DialogCardData", "ShowDeviceNps");
            if (HagridNpsManager.getInstance().isWeightDeviceNps()) {
                this.v = this.j.getResources().getString(R.string.IDS_hw_todocard_weight_nps);
            } else {
                this.v = this.j.getResources().getString(R.string.IDS_hw_todocard_wear_nps);
            }
            this.u = 4;
            a(true, this.v, 4);
            return;
        }
        if (aq()) {
            DeviceWebSurveyInfo deviceWebSurveyInfo = DeviceWebNpsUtil.getDeviceWebSurveyInfo();
            this.i = deviceWebSurveyInfo;
            if (deviceWebSurveyInfo.getNpsSurveyResponse() == null || TextUtils.isEmpty(this.i.getNpsSurveyResponse().getNpsLink())) {
                return;
            }
            if (this.i.getDeviceType() == 2) {
                this.v = this.j.getResources().getString(R.string.IDS_hw_todocard_weight_nps);
            } else {
                this.v = this.j.getResources().getString(R.string.IDS_hw_todocard_wear_nps);
            }
            this.u = 6;
            a(true, this.v, 6);
            return;
        }
        if (ax()) {
            String sharedPreference = HwNpsManager.getInstance().getSharedPreference(HwNpsManager.KEY_ECOLOGY_DEVICE_UUID);
            elh elhVarD = ResourceManager.c().d(sharedPreference);
            if (elhVarD == null) {
                LogUtil.e("SCUI_DialogCardData", "ecology nps device is null");
                return;
            }
            String str = String.format(Locale.ENGLISH, this.j.getResources().getString(com.huawei.ui.main.R.string.IDS_hw_ecology_nps_survey), elo.a(sharedPreference, elhVarD.l().d()));
            this.v = str;
            this.u = 5;
            a(true, str, 5);
            return;
        }
        a(false, "", 0);
    }

    private boolean as() {
        boolean zIsShowToDo = this.j != null ? HwNpsManager.getInstance().isShowToDo() : false;
        LogUtil.a("SCUI_DialogCardData", "isShowDeviceNps:", Boolean.valueOf(zIsShowToDo));
        return zIsShowToDo;
    }

    private boolean aq() {
        boolean zIsShowDeviceWebNps = this.j != null ? DeviceWebNpsUtil.isShowDeviceWebNps() : false;
        LogUtil.a("SCUI_DialogCardData", "isShowDeviceWebNps:", Boolean.valueOf(zIsShowDeviceWebNps));
        return zIsShowDeviceWebNps;
    }

    private void l(int i) {
        HwNpsManager hwNpsManager;
        QuestionSurveyDetailResponse detailResponse;
        LogUtil.a("SCUI_DialogCardData", "setNpsBiAnalytics:NPS_SHOW");
        HashMap map = new HashMap();
        map.put("click", 1);
        if (i == 4 && (detailResponse = (hwNpsManager = HwNpsManager.getInstance()).getDetailResponse()) != null) {
            map.put("questionTime", Integer.valueOf(detailResponse.getQueryTimes()));
            map.put("questionType", hwNpsManager.getQuestionType(detailResponse.getSurveyID()));
        }
        LogUtil.a("SCUI_DialogCardData", "setNpsBiAnalytics map:", map);
        lmf.d().c(this.j, AnalyticsValue.HEALTH_HOME_NPS_SHOW_2010094.value(), map, 0);
        at();
    }

    private void at() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: shr
            @Override // java.lang.Runnable
            public final void run() {
                this.f48103c.p();
            }
        });
    }

    /* synthetic */ void p() {
        LogUtil.a("SCUI_DialogCardData", "opAnalyticsForNps");
        if (this.m == null) {
            ReleaseLogUtil.e("SCUI_DialogCardData", "opAnalyticsForNps opensdk null,return");
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(2);
        this.y.remove("isCurDaemonKilled");
        this.y.remove("isStepNotificationOpen");
        this.m.j(new j(this, countDownLatch));
        this.m.d((IExecuteResult) new j(this, countDownLatch));
        try {
            LogUtil.a("SCUI_DialogCardData", "afterNpsShow isCountDown : ", Boolean.valueOf(countDownLatch.await(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException e2) {
            ReleaseLogUtil.d("SCUI_DialogCardData", "opAnalyticsForNps exception happens = ", e2.getMessage());
        }
        this.y.put(CloudParamKeys.CLIENT_TYPE, fxl.d());
        this.y.put("hasShowedDaemonKilledTip", String.valueOf(this.k));
        this.y.put("hasIgnoredDaemonKilledTip", String.valueOf(this.n));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_NPS_DIALOG_SHOW_2129037.value(), this.y);
    }

    private boolean ax() {
        if (this.j != null) {
            return HwNpsManager.getInstance().isShowEcologyNps();
        }
        return false;
    }

    private boolean av() {
        boolean zIsShowNps = NpsUserShowController.getInstance(this.j).isShowNps();
        LogUtil.a("NpsUserShowController", "todoCardData isShowNps: ", Boolean.valueOf(zIsShowNps));
        return zIsShowNps;
    }

    protected void u() {
        by();
        bv();
        e("1");
        bs();
        bm();
    }

    private void bm() {
        boolean zF = DaemonServiceSpUtils.f();
        ReleaseLogUtil.d("SCUI_DialogCardData", "showAbnormalStepDialog ", Boolean.valueOf(zF));
        if (zF && DaemonServiceSpUtils.j() && qsr.c().d()) {
            ReleaseLogUtil.d("SCUI_DialogCardData", "showAbnormalStepDialog enter");
            d(103);
        }
    }

    private void bl() {
        if (Build.VERSION.SDK_INT > 28 && tdy.b("ACTIVITY_TIPS") <= 0) {
            boolean z = false;
            boolean z2 = ContextCompat.checkSelfPermission(this.j, "android.permission.ACTIVITY_RECOGNITION") == 0;
            LogUtil.a("SCUI_DialogCardData", "showActivityRecognitionGuideTips isGranted ", Boolean.valueOf(z2), " mDeviceOriginalType ", Integer.valueOf(this.e));
            if (z2 || this.e == 3) {
                am();
                return;
            }
            if (this.ac.contains(102)) {
                LogUtil.a("SCUI_DialogCardData", "showActivityRecognitionGuideTips has add TIPS_ACTIVITY_RECOGNITION_NOT_GRANTED");
                return;
            }
            if (this.ac.contains(7)) {
                this.ac.remove((Object) 7);
                z = true;
            }
            d(102);
            if (z) {
                d(7);
            }
        }
    }

    private void am() {
        if (njy.b(this.ac) && this.ac.contains(102)) {
            LogUtil.a("SCUI_DialogCardData", "mTipsList.get(0) ", this.ac.get(0));
            if (this.ac.get(0).intValue() == 102) {
                t();
            } else {
                this.ac.remove((Object) 102);
            }
        }
    }

    private void bs() {
        LogUtil.d("SCUI_DialogCardData", "showNoCallPermissionTips enter");
        String strE = SharedPreferenceManager.e(this.j, Integer.toString(10000), "no_call_permision_tips");
        LogUtil.a("SCUI_DialogCardData", "noCallPermisionRecord = ", strE);
        if ("0".equals(strE)) {
            d(5);
        }
    }

    private void by() {
        LogUtil.a("SCUI_DialogCardData", "showProtectionTips");
        String strValueOf = String.valueOf(10000);
        int iC = SharedPreferenceManager.c(strValueOf, "sp_key_briefs_thread_pid", -1);
        if (iC == -1) {
            LogUtil.j("SCUI_DialogCardData", "pId is null");
            return;
        }
        String strE = SharedPreferenceManager.e(this.j, strValueOf, "sp_key_briefs_is_resting");
        try {
            if (TextUtils.isEmpty(strE) || !Boolean.parseBoolean(strE) || ar() || iC == Process.myPid()) {
                return;
            }
            d(101);
            LogUtil.a("SCUI_DialogCardData", "showProtectionTips addNewTips");
        } catch (NumberFormatException e2) {
            LogUtil.e("SCUI_DialogCardData", "showProtectionTips exception : ", e2.getMessage());
        }
    }

    private boolean ar() {
        Object systemService = BaseApplication.getContext().getSystemService("power");
        if (systemService instanceof PowerManager) {
            return ((PowerManager) systemService).isIgnoringBatteryOptimizations(BaseApplication.getContext().getPackageName());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final String str) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: shv
            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(str);
            }
        });
    }

    /* synthetic */ void a(String str) {
        LogUtil.a("SCUI_DialogCardData", "showDaemonKilled");
        HealthOpenSDK healthOpenSDK = this.m;
        if (healthOpenSDK == null) {
            ReleaseLogUtil.e("SCUI_DialogCardData", "showDaemonKilled opensdk null,return");
        } else {
            healthOpenSDK.j(new tfd(this, this.ac, str));
        }
    }

    private void bv() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "if_has_tiped_do_not_support_step");
        ReleaseLogUtil.d("SCUI_DialogCardData", "mHealthOpenSdk.getDeviceOriginalClass()==", Integer.valueOf(this.e));
        if (this.j == null || "alread_tips".equals(strE) || this.e != 3 || lro.d(this.j)) {
            return;
        }
        d(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void au() {
        LogUtil.d("SCUI_DialogCardData", "processNoCallPermission enter");
        String strE = SharedPreferenceManager.e(this.j, Integer.toString(10000), "no_call_permision_tips");
        LogUtil.a("SCUI_DialogCardData", "noCallPermisionRecord = ", strE);
        if ("1".equals(strE)) {
            return;
        }
        SharedPreferenceManager.e(this.j, Integer.toString(10000), "no_call_permision_tips", Integer.toString(0), new StorageParams());
        d(5);
    }

    private void a(boolean z, String str, final int i) {
        if (ah() == null || ah().q() == null) {
            LogUtil.j("SCUI_DialogCardData", "mStepsCardViewHolder == null");
            return;
        }
        if (z && !TextUtils.isEmpty(str) && i != 0) {
            if (j(i)) {
                LogUtil.j("SCUI_DialogCardData", "not show nps");
                ah().q().setVisibility(8);
                return;
            }
            ah().q().setVisibility(0);
            ah().ad().setText(str);
            if (i == 4) {
                HwNpsManager.getInstance().updateSurveyTime();
            }
            if (i == 4 || i == 6) {
                ah().r().setText(R.string.IDS_sug_first_into_plan_known);
                ah().s().setText(R.string.IDS_family_health_zone_ignore);
            }
            ah().r().setOnClickListener(new View.OnClickListener() { // from class: sho.24
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sho.this.o(i);
                }
            });
            ah().s().setOnClickListener(new View.OnClickListener() { // from class: sho.22
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sho.this.ah().q().setVisibility(8);
                    Intent intent = new Intent();
                    intent.setAction("com.huawei.health.nps_detail_sync_hide");
                    intent.setPackage(sho.this.j.getPackageName());
                    sho.this.j.sendBroadcast(intent, LocalBroadcast.f36595c);
                    sho.this.k(i);
                    sho.this.af();
                    sho.this.f(i);
                    if (i == 4) {
                        HwNpsManager.getInstance().updateSurveyTime();
                    }
                }
            });
            l(i);
            return;
        }
        ah().q().setVisibility(8);
        af();
    }

    private void h(int i) {
        if (i != 6) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(this.j, AnalyticsValue.NPS_OPEN_QUESTION_1090038.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        int iAbs;
        if (i == 4 || i == 6) {
            HashMap map = new HashMap();
            map.put("click", 1);
            if (i == 4) {
                HwNpsManager hwNpsManager = HwNpsManager.getInstance();
                iAbs = hwNpsManager.getShowDay();
                QuestionSurveyDetailResponse detailResponse = hwNpsManager.getDetailResponse();
                if (detailResponse != null) {
                    map.put("questionTime", Integer.valueOf(detailResponse.getQueryTimes()));
                    map.put("questionType", hwNpsManager.getQuestionType(detailResponse.getSurveyID()));
                }
            } else {
                DeviceWebSurveyInfo deviceWebSurveyInfo = this.i;
                iAbs = (deviceWebSurveyInfo == null || deviceWebSurveyInfo.getNpsSurveyResponse() == null) ? 0 : (int) (Math.abs(System.currentTimeMillis() - DeviceWebNpsUtil.getSaveNpsResponseTime(this.i.getDeviceId())) / 86400000);
            }
            map.put("showDay", Integer.valueOf(iAbs));
            map.put("ignoreTime", qrk.b());
            LogUtil.a("SCUI_DialogCardData", "setIgnoresBiAnalytics map:", map);
            lmf.d().c(this.j, AnalyticsValue.HEALTH_IGNORE_NPS_ENTER_2010220.value(), map, 0);
        }
    }

    private boolean j(int i) {
        if (i == 4 && !HagridNpsManager.getInstance().isWeightDeviceNps() && !HwNpsManager.getInstance().isTimeOfNps()) {
            ReleaseLogUtil.d("Nps_SCUI_DialogCardData", "isHideNps sendNotify: not support send notify time");
            return true;
        }
        if (njy.e(this.ac)) {
            ReleaseLogUtil.d("Nps_SCUI_DialogCardData", "mTipsList is null");
            return false;
        }
        if (this.ac.get(0).intValue() == 102) {
            qsp.c((View) ah().a(), 8);
            return false;
        }
        if (this.ac.get(0).intValue() == 7) {
            qsp.c((View) ah().ae(), 8);
            return false;
        }
        if ((i == 4 || i == 6) && this.ac.get(0).intValue() == 10) {
            qsp.c((View) ah().g(), 8);
            return false;
        }
        if ((i != 4 && i != 6) || this.ac.get(0).intValue() != 101) {
            return true;
        }
        qsp.c((View) ah().a(), 8);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void af() {
        synchronized (this.ac) {
            if (this.ac.size() > 0) {
                e(this.ac.get(0).intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(int i) {
        if (i == 3) {
            NpsUserShowController.getInstance(BaseApplication.getContext()).showNpsPage(this.j);
            return;
        }
        if (i == 4) {
            if (rcv.a(this.j).h()) {
                String strInitNpsLink = HwNpsManager.getInstance().initNpsLink();
                if (TextUtils.isEmpty(strInitNpsLink)) {
                    return;
                }
                try {
                    Intent intent = new Intent(this.j, (Class<?>) WebViewActivity.class);
                    intent.putExtra("url", strInitNpsLink);
                    iov.d(this.j, intent);
                    return;
                } catch (ActivityNotFoundException unused) {
                    LogUtil.e("SCUI_DialogCardData", "jumpToNpsLink startWebViewActivity ActivityNotFoundException");
                    return;
                }
            }
            iov.d(this.j, new Intent(this.j, (Class<?>) QuestionMainActivity.class));
            return;
        }
        if (i != 6) {
            if (i == 5) {
                iov.d(this.j, new Intent(this.j, (Class<?>) EcologyNpsSurveyActivity.class));
                return;
            } else {
                LogUtil.a("SCUI_DialogCardData", "type is invalid ", Integer.valueOf(i));
                return;
            }
        }
        DeviceWebSurveyInfo deviceWebSurveyInfo = this.i;
        if (deviceWebSurveyInfo == null || deviceWebSurveyInfo.getNpsSurveyResponse() == null) {
            return;
        }
        NpsSurveyResponse npsSurveyResponse = this.i.getNpsSurveyResponse();
        LogUtil.a("SCUI_DialogCardData", "skip, npsLink: ", npsSurveyResponse.getNpsLink());
        Intent intent2 = new Intent(this.j, (Class<?>) SurveyWebActivity.class);
        intent2.putExtra("url", npsSurveyResponse.getNpsLink());
        iov.d(this.j, intent2);
        h(i);
        DeviceWebNpsUtil.saveNpsResponse(null, this.i.getDeviceId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(int i) {
        DeviceWebSurveyInfo deviceWebSurveyInfo;
        if (i == 3) {
            NpsUserShowController npsUserShowController = NpsUserShowController.getInstance(BaseApplication.getContext());
            int surveyTime = npsUserShowController.getSurveyTime();
            LogUtil.a("SCUI_DialogCardData", "NpsQuestionPageActivity onCreate() surveyTime: ", Integer.valueOf(surveyTime));
            if (surveyTime == 0) {
                LogUtil.j("SCUI_DialogCardData", "surveyTime = 0");
                return;
            } else {
                npsUserShowController.setTheSurveyUnNeeded(surveyTime);
                return;
            }
        }
        if (i != 4 && i != 5) {
            if (i != 6 || (deviceWebSurveyInfo = this.i) == null) {
                LogUtil.a("SCUI_DialogCardData", "type is not equal");
                return;
            } else {
                DeviceWebNpsUtil.saveNpsResponse(null, deviceWebSurveyInfo.getDeviceId());
                return;
            }
        }
        if (TextUtils.isEmpty(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.KEY_NPS_SHOW))) {
            return;
        }
        LogUtil.a("SCUI_DialogCardData", "save KEY_NPS_SHOW result ", Integer.valueOf(HwNpsManager.getInstance().setSharedPreference(HwNpsManager.KEY_NPS_SHOW, "")));
        HwNpsManager.getInstance().setSharedPreference(HwNpsManager.KEY_NPS_LAST_TIME, String.valueOf(System.currentTimeMillis()), null);
        if (TextUtils.isEmpty(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.MESSAGE_NPS_ID))) {
            return;
        }
        ((MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class)).setMessageRead(HwNpsManager.getInstance().getSharedPreference(HwNpsManager.MESSAGE_NPS_ID));
    }

    public void c() {
        if (ah() == null) {
            LogUtil.a("SCUI_DialogCardData", "closeSyncCloudDataFailTips mStepsCardViewHolder == null");
        } else {
            ah().x().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void t() {
        LogUtil.a("SCUI_DialogCardData", "closeCurrentTips");
        if (!HandlerExecutor.c()) {
            ReleaseLogUtil.d("SCUI_DialogCardData", "closeCurrentTips post to ui thread ");
            HandlerExecutor.b(new Runnable() { // from class: shq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48102a.t();
                }
            });
            return;
        }
        if (this.ac == null) {
            LogUtil.j("SCUI_DialogCardData", "closeCurrentTips find mTipsList null,warnning!!! logic error??? return");
            return;
        }
        if (ah() == null) {
            LogUtil.e("SCUI_DialogCardData", "closeCurrentTips mStepsCardViewHolder == null");
            return;
        }
        synchronized (this.ac) {
            if (this.ac.size() == 0) {
                ah().x().setVisibility(8);
                ah().a().setVisibility(8);
                ah().y().setVisibility(8);
                LogUtil.j("SCUI_DialogCardData", "closeCurrentTips find no tips in list,warnning!!! logic error??? return");
                return;
            }
            i(this.ac.get(0).intValue());
            this.ac.remove(0);
            if (ap()) {
                ah().x().setVisibility(8);
                ah().a().setVisibility(8);
                ah().y().setVisibility(8);
                bb();
                LogUtil.j("SCUI_DialogCardData", "closeCurrentTips,not have any more,set view gone");
                return;
            }
            LogUtil.a("SCUI_DialogCardData", "displayTips:", this.ac.get(0));
            e(this.ac.get(0).intValue());
        }
    }

    private boolean ap() {
        return this.ac.size() <= 0 || this.ac.get(0).intValue() == 102 || this.ac.get(0).intValue() == 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        LogUtil.a("SCUI_DialogCardData", "closeSyncOtherDeviceStepsTipsWhenDayChange mTipsList=", this.ac);
        if (njy.e(this.ac)) {
            return;
        }
        if (this.ac.get(0).intValue() == 6) {
            this.ac.remove(0);
            if (this.ac.size() > 0) {
                e(this.ac.get(0).intValue());
                return;
            } else {
                if (ah() != null) {
                    ah().a().setVisibility(8);
                    ah().y().setVisibility(8);
                    return;
                }
                return;
            }
        }
        for (int i = 0; i < this.ac.size(); i++) {
            if (this.ac.get(i).intValue() == 6) {
                this.ac.remove(i);
            }
        }
    }

    private void i(int i) {
        LogUtil.a("SCUI_DialogCardData", "processTipsCloseEvent types=", Integer.valueOf(i));
        if (i == 1) {
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "if_has_tiped_do_not_support_step", "alread_tips", new StorageParams());
            return;
        }
        if (i == 2) {
            if (this.m == null) {
                ReleaseLogUtil.e("SCUI_DialogCardData", "processTipsCloseEvent opensdk null,return");
                return;
            } else {
                LogUtil.a("SCUI_DialogCardData", "close keep-alive-tips,makePromptNoSense");
                this.m.a();
                return;
            }
        }
        if (i == 4) {
            LogUtil.a("SCUI_DialogCardData", "TIPS_NPL_SERVICE_NA only close tips");
            return;
        }
        if (i == 5) {
            SharedPreferenceManager.e(this.j, Integer.toString(10000), "no_call_permision_tips", Integer.toString(1), new StorageParams());
            return;
        }
        if (i == 6) {
            SharedPreferenceManager.e(this.j, Integer.toString(10000), "show_data_origin_tips_times", System.currentTimeMillis() + "#1", new StorageParams());
            return;
        }
        LogUtil.a("SCUI_DialogCardData", "getTipsString types=", Integer.valueOf(i), " not support");
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(final int i) {
        if (!HandlerExecutor.c()) {
            ReleaseLogUtil.d("SCUI_DialogCardData", "addNewTips post to ui thread ", Integer.valueOf(i));
            HandlerExecutor.b(new Runnable() { // from class: shk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48073c.d(i);
                }
            });
            return;
        }
        ReleaseLogUtil.d("SCUI_DialogCardData", "addNewTips tips = ", Integer.valueOf(i));
        synchronized (this.ac) {
            if (i == 10) {
                if (this.ac.contains(10)) {
                    return;
                }
            }
            this.ac.add(Integer.valueOf(i));
            ca();
            ReleaseLogUtil.d("SCUI_DialogCardData", "addNewTips mTipsList = ", this.ac.toString());
            if (al()) {
                return;
            }
            bp();
        }
    }

    private void bp() {
        if (ap()) {
            bb();
        } else {
            e(this.ac.get(0).intValue());
            this.f48077c.sendEmptyMessage(26);
        }
    }

    private boolean al() {
        if (!this.ac.contains(2) || this.ac.indexOf(2) == 0) {
            return false;
        }
        if (this.ac.remove((Object) 2)) {
            this.ac.add(0, 2);
        }
        bp();
        return true;
    }

    private void ca() {
        int i = 0;
        if (this.ac.remove((Object) 100)) {
            this.ac.add(0, 100);
        }
        if (this.ac.contains(104)) {
            boolean zRemove = this.ac.remove((Object) 104);
            if (!this.ac.isEmpty() && this.ac.get(0).intValue() == 100) {
                i = 1;
            }
            if (zRemove) {
                this.ac.add(i, 104);
            }
        }
        if (this.ac.contains(106)) {
            this.ac.remove((Object) 106);
            this.ac.add(106);
            if (this.ac.contains(7)) {
                this.ac.remove((Object) 7);
                this.ac.add(7);
            }
        }
        if (this.ac.contains(102)) {
            this.ac.remove((Object) 102);
            this.ac.add(102);
            if (this.ac.contains(7)) {
                this.ac.remove((Object) 7);
                this.ac.add(7);
            }
        }
    }

    private void e(int i) {
        if (ah() == null) {
            LogUtil.j("SCUI_DialogCardData", "displayTips mStepsCardViewHolder == null");
            return;
        }
        final String str = Build.BRAND;
        LogUtil.a("SCUI_DialogCardData", "displayTips phoneBrand:", str);
        if (i == 100) {
            bz();
            return;
        }
        if (i == 4 && ("OPPO".equals(str) || "vivo".equals(str))) {
            an();
            ah().y().setVisibility(0);
            ah().j().setOnClickListener(new View.OnClickListener() { // from class: sho.30
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sho.this.ah().y().setVisibility(8);
                    sho.this.b(str);
                }
            });
            ah().t().setOnClickListener(new View.OnClickListener() { // from class: sho.29
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    sho.this.t();
                }
            });
            LogUtil.a("SCUI_DialogCardData", "displayTips the phone is oppo or vivo :", str);
            return;
        }
        if (i == 7) {
            cb();
            return;
        }
        if (i == 8) {
            bw();
            return;
        }
        if (i == 9) {
            bo();
            return;
        }
        if (i == 10) {
            br();
            return;
        }
        if (i == 104) {
            bq();
        } else if (i == 105) {
            bu();
        } else {
            e(i, str);
        }
    }

    private void bz() {
        an();
        ah().x().setVisibility(0);
        ah().v().setOnClickListener(new View.OnClickListener() { // from class: sho.28
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "showSyncCloudDataFailCard onClick mSyncIgnoreTextView is clicked");
                sho.this.ah().x().setVisibility(8);
                tfk.c(false);
                sho.this.t();
            }
        });
        ah().u().setOnClickListener(new View.OnClickListener() { // from class: sho.27
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "showSyncCloudDataFailCard onClick mSyncTryAgainTextView is clicked");
                if (NetworkUtil.h()) {
                    sho.this.be();
                } else {
                    Toast.makeText(sho.this.j, R.string.IDS_hw_show_set_about_privacy_connectting_error, 1).show();
                }
            }
        });
    }

    private void e(final int i, String str) {
        boolean zB = SharedPreferenceManager.b(Integer.toString(10000), "protection_show_value", false);
        if (i == 101 && (zB || !aw())) {
            LogUtil.a("SCUI_DialogCardData", "showOtherCard TIPS_PROTECTION isTodayShown");
            return;
        }
        String strA = a(i);
        if (ah() == null) {
            LogUtil.j("SCUI_DialogCardData", "showOtherCard mStepsCardViewHolder is null");
            return;
        }
        an();
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        ah().m().setText(strA);
        ah().a().setVisibility(0);
        ah().k().setVisibility(0);
        ah().k().setText(R.string.IDS_settings_close);
        ah().l().setVisibility(8);
        ah().w().setVisibility(8);
        ah().n().setVisibility(8);
        if (i == 101 || i == 2) {
            m(i);
        }
        if (i == 103) {
            ad();
        }
        if (i == 6) {
            ah().m().setOnClickListener(new View.OnClickListener() { // from class: sho.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (sho.this.f48075a.size() > 0) {
                        ObserverManagerUtil.e("showFitnessDataOriginDialog", new Object[0]);
                        sho.this.t();
                        sho.this.f48077c.removeMessages(21);
                    }
                }
            });
            if (!this.f48077c.hasMessages(21)) {
                this.f48077c.sendEmptyMessageDelayed(21, 300000L);
            }
        }
        if (i == 102) {
            bi();
        }
        ah().k().setOnClickListener(new View.OnClickListener() { // from class: sie
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48119a.c(i, view);
            }
        });
        LogUtil.a("SCUI_DialogCardData", "showOtherCard the phone is not oppo or vivo :", str);
    }

    /* synthetic */ void c(int i, View view) {
        if (qrs.r()) {
            LogUtil.a("SCUI_DialogCardData", "HwCancelBtn click too fast");
            return;
        }
        if (i == 6) {
            this.f48077c.removeMessages(21);
        }
        t();
    }

    private void bi() {
        sik.b("type", 1, "event", 0, AnalyticsValue.HEALTH_HOME_TIPS_20401106);
        ah().k().setVisibility(8);
        ah().w().setVisibility(0);
        ah().e().setText(R.string.IDS_home_activity_reconnition_close);
        ah().e().setVisibility(0);
        ah().e().setOnClickListener(new View.OnClickListener() { // from class: sim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48125a.e(view);
            }
        });
        ah().p().setVisibility(0);
        ah().p().setText(R.string.IDS_home_activity_reconnition_open);
        ah().p().setOnClickListener(new View.OnClickListener() { // from class: sho.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sik.b("type", 1, "event", 1, AnalyticsValue.HEALTH_HOME_TIPS_20401106);
                ltd.e().e(BaseApplication.getActivity(), new String[]{"android.permission.ACTIVITY_RECOGNITION"}, new c());
            }
        });
    }

    /* synthetic */ void e(View view) {
        ah().a().setVisibility(8);
        t();
        tdy.c("ACTIVITY_TIPS");
    }

    private String a(int i) {
        if (i == 1) {
            if (EnvironmentInfo.m()) {
                return this.j.getResources().getString(R.string.IDS_home_computer_not_support_step);
            }
            if (qrs.ah(com.huawei.haf.application.BaseApplication.b())) {
                return this.j.getResources().getString(R.string.IDS_home_pad_not_support_step);
            }
            return this.j.getResources().getString(R.string.IDS_hwh_home_phone_not_support_step_tips);
        }
        if (i == 2) {
            return this.j.getResources().getString(R.string.IDS_keep_alive_text);
        }
        if (i == 4) {
            return this.j.getResources().getString(R.string.IDS_hwh_home_notification_push_listener_not_available_tips);
        }
        if (i == 5) {
            return this.j.getResources().getString(R.string.IDS_hwh_home_no_call_reject_permision_tips);
        }
        if (i != 6) {
            switch (i) {
                case 101:
                    return this.j.getResources().getString(R.string.IDS_rest_remind);
                case 102:
                    return this.j.getResources().getString(R.string.IDS_home_activity_reconnition_guide);
                case 103:
                    return this.j.getString(R.string.IDS_abnormal_dialog_tips);
                default:
                    LogUtil.a("SCUI_DialogCardData", "getTipsString types=", Integer.valueOf(i), " not support");
                    return "";
            }
        }
        if (this.j == null) {
            return "";
        }
        return az();
    }

    private String az() {
        if (this.f48075a.size() > 2) {
            uif uifVarC = c(this.f48075a);
            if (uifVarC != null) {
                return this.j.getResources().getString(R.string.IDS_hw_home_data_origin_tips2, d(uifVarC));
            }
            return this.j.getResources().getString(R.string.IDS_hw_home_data_origin_tips2, this.j.getResources().getString(R.string.IDS_hw_data_origin_unknow_device));
        }
        if (this.f48075a.size() == 2) {
            return this.j.getResources().getString(R.string.IDS_hw_home_data_origin_tips1, d(this.f48075a.get(0)), d(this.f48075a.get(1)));
        }
        return "";
    }

    private String d(uif uifVar) {
        if (this.j == null) {
            return "";
        }
        if (uifVar.a() == 32) {
            if (uifVar.d() != null) {
                return uifVar.d();
            }
            return this.j.getResources().getString(R.string.IDS_origin_phone);
        }
        if (uifVar.c() != null) {
            return uifVar.c();
        }
        return this.j.getResources().getString(R.string.IDS_hw_data_origin_unknow_device);
    }

    private uif c(List<uif> list) {
        uif uifVar = null;
        if (this.j != null && list != null && list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                uif uifVar2 = list.get(i);
                if (uifVar2 != null && uifVar2.b() != null && !uifVar2.b().equals(FoundationCommonUtil.getAndroidId(this.j)) && uifVar2.a() == 32) {
                    uifVar = uifVar2;
                    break;
                }
            }
            if (uifVar == null) {
                return d(list);
            }
        }
        return uifVar;
    }

    private uif d(List<uif> list) {
        for (uif uifVar : list) {
            if (uifVar != null && uifVar.b() != null && !uifVar.b().equals(FoundationCommonUtil.getAndroidId(this.j))) {
                return uifVar;
            }
        }
        return null;
    }

    private boolean aw() {
        long jD = SharedPreferenceManager.d(Integer.toString(10000), "sp_key_briefs_begin_time", 0L);
        return jD != 0 && TimeUtil.d(jD, System.currentTimeMillis());
    }

    private void m(final int i) {
        SharedPreferenceManager.a(Integer.toString(10000), "protection_show_value", false);
        ah().w().setVisibility(0);
        ah().k().setVisibility(8);
        final String deviceName = "";
        if (i == 2) {
            this.k = true;
            ah().l().setVisibility(0);
            List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
            if (!njy.e(listB)) {
                deviceName = listB.get(0).getDeviceName();
            }
            rdt.b(100115, deviceName);
        }
        rdt.b(100114, deviceName);
        ah().p().setOnClickListener(new View.OnClickListener() { // from class: sho.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                new tef().e(sho.this.j);
                if (i == 2) {
                    DaemonServiceSpUtils.k();
                    rdt.b(100105, deviceName);
                    SharedPreferenceManager.a(Integer.toString(10000), "clickKeepAliveGuide", true);
                }
                sho.this.t();
            }
        });
        ah().e().setOnClickListener(new View.OnClickListener() { // from class: sho.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                SharedPreferenceManager.a(Integer.toString(10000), "protection_show_value", true);
                if (i == 2) {
                    DaemonServiceSpUtils.o();
                    rdt.b(100106, deviceName);
                    sho.this.n = true;
                    SharedPreferenceManager.a(Integer.toString(10000), "clickKeepAliveGuide", true);
                }
                sho.this.ah().a().setVisibility(8);
                sho.this.t();
            }
        });
    }

    private void ad() {
        ReleaseLogUtil.d("SCUI_DialogCardData", "abnormalStepTips");
        DaemonServiceSpUtils.e(false);
        DaemonServiceSpUtils.l();
        ipb.f();
        ah().w().setVisibility(0);
        ah().k().setVisibility(8);
        ah().l().setVisibility(8);
        ah().p().setText(R.string.IDS_home_abnormal_go_view);
        ah().p().setOnClickListener(new View.OnClickListener() { // from class: sho.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("SCUI_DialogCardData", "abnormalStepTips goto step description");
                DaemonServiceSpUtils.a(System.currentTimeMillis());
                uka.e(sho.this.j, "/hwtips/topic/health_help_all/%s/SF-10190178_f6174.html?channel=04");
                ipb.c();
                sho.this.t();
            }
        });
        ah().e().setOnClickListener(new View.OnClickListener() { // from class: sho.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("SCUI_DialogCardData", "abnormalStepTips cancel");
                ipb.e();
                sho.this.ah().a().setVisibility(8);
                sho.this.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final String str) {
        lsy.a(new Runnable() { // from class: sho.6
            @Override // java.lang.Runnable
            public void run() {
                String countryCode = GRSManager.c(sho.this.j).getCountryCode();
                sho shoVar = sho.this;
                shoVar.aa = GRSManager.c(shoVar.j).getNoCheckUrl("domainTipsResDbankcdn", countryCode);
                if (sho.this.aa != null) {
                    sho.this.c(str);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        String str2;
        String str3;
        final HashMap map = new HashMap(1);
        final String str4 = null;
        if ("OPPO".equals(str)) {
            if (this.aa.contains("dra")) {
                if (LanguageUtil.l(this.j)) {
                    str3 = this.aa + "/handbook/OPPO_note/EMUI9.0/C001B001/zh-CN/index.html";
                } else {
                    str3 = this.aa + "/handbook/OPPO_note/EMUI9.0/C001B001/en-US/index.html";
                }
            } else {
                if (this.aa.contains("drcn")) {
                    if (LanguageUtil.l(this.j)) {
                        str3 = this.aa + "/OPPO_note/EMUI9.0/C001B001/zh-CN/index.html";
                    } else {
                        str3 = this.aa + "/OPPO_note/EMUI9.0/C001B001/en-US/index.html";
                    }
                } else {
                    LogUtil.j("SCUI_DialogCardData", "mTipsHostUrl is error.");
                }
                map.put("phone_type", "oppo");
            }
            str4 = str3;
            map.put("phone_type", "oppo");
        }
        if ("vivo".equals(str)) {
            if (this.aa.contains("dra")) {
                if (LanguageUtil.l(this.j)) {
                    str2 = this.aa + "/handbook/vivo_note/EMUI9.0/C001B001/zh-CN/index.html";
                } else {
                    str2 = this.aa + "/handbook/vivo_note/EMUI9.0/C001B001/en-US/index.html";
                }
            } else {
                if (this.aa.contains("drcn")) {
                    if (LanguageUtil.l(this.j)) {
                        str2 = this.aa + "/vivo_note/EMUI9.0/C001B001/zh-CN/index.html";
                    } else {
                        str2 = this.aa + "/vivo_note/EMUI9.0/C001B001/en-US/index.html";
                    }
                } else {
                    LogUtil.j("SCUI_DialogCardData", "mTipsHostUrl is error.");
                }
                map.put("phone_type", "vivo");
            }
            str4 = str2;
            map.put("phone_type", "vivo");
        }
        HandlerExecutor.c(new Runnable() { // from class: shu
            @Override // java.lang.Runnable
            public final void run() {
                this.f48107b.a(map, str4);
            }
        });
    }

    /* synthetic */ void a(Map map, String str) {
        e((Map<String, Object>) map, str);
    }

    private void e(Map<String, Object> map, String str) {
        Intent intent = new Intent(this.j, (Class<?>) WebViewActivity.class);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.NOTIFY_ERROR_ALERT_1090025.value(), map, 0);
        LogUtil.d("SCUI_DialogCardData", "jumpToWebViewActivity url = ", str);
        intent.putExtra("url", str);
        intent.putExtra(com.huawei.operation.utils.Constants.JUMP_MODE_KEY, 0);
        iov.d(this.j, intent);
    }

    private void bq() {
        LogUtil.a("SCUI_DialogCardData", "enter showCompanion");
        if (ah() == null || ah().b() == null || this.j == null) {
            LogUtil.j("SCUI_DialogCardData", "CompanionRelativeLayout == null");
            return;
        }
        ah().d().setOnClickListener(new View.OnClickListener() { // from class: sho.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "click reconnect");
                sik.b("type", 100113, "event", 1, AnalyticsValue.HEALTH_HOME_TIPS_2040118);
                ThreadPoolManager.c().execute(new AnonymousClass2());
            }

            /* JADX INFO: renamed from: sho$7$2, reason: invalid class name */
            class AnonymousClass2 implements Runnable {
                AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    final DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "SCUI_DialogCardData");
                    HandlerExecutor.a().post(new Runnable() { // from class: sin
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f48126b.e(deviceInfo);
                        }
                    });
                }

                /* synthetic */ void e(DeviceInfo deviceInfo) {
                    if (deviceInfo != null) {
                        if (lwg.d().e(deviceInfo.getDeviceIdentify())) {
                            sho.this.bx();
                        } else {
                            sho.this.ab = deviceInfo;
                            rdp.a(deviceInfo.getDeviceIdentify(), sho.this.j, deviceInfo.getDeviceBluetoothType());
                        }
                    }
                }
            }
        });
        ah().c().setOnClickListener(new View.OnClickListener() { // from class: sho.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (sho.this.f()) {
                    sik.b("type", 100113, "event", 2, AnalyticsValue.HEALTH_HOME_TIPS_2040118);
                    tqp.d("wear_companion_notification_time");
                }
            }
        });
        sik.b("type", 100113, "event", 0, AnalyticsValue.HEALTH_HOME_TIPS_2040118);
        an();
        ah().b().setVisibility(0);
    }

    public boolean f() {
        LogUtil.a("SCUI_DialogCardData", "click ignore");
        if (ah() == null || ah().b() == null) {
            LogUtil.j("SCUI_DialogCardData", "setWeChatLayoutVisibility mStepsCardViewHolder = null");
            return false;
        }
        ah().b().setVisibility(8);
        bh();
        return true;
    }

    private boolean g(int i) {
        boolean zA = tqp.a("wear_companion_notification_time", 30);
        LogUtil.a("SCUI_DialogCardData", "checkCompanionPermission isTimeExpired:", Boolean.valueOf(zA));
        boolean zB = tqp.b(this.j, i, true);
        LogUtil.a("SCUI_DialogCardData", "checkCompanionPermission isShowMissSensitive:", Boolean.valueOf(zB));
        return zA && zB;
    }

    private void bh() {
        if (njy.b(this.ac) && this.ac.contains(104)) {
            if (this.ac.get(0).intValue() == 104) {
                LogUtil.a("SCUI_DialogCardData", "remove TIPS_COMPANION and close current Tip");
                t();
            } else {
                LogUtil.a("SCUI_DialogCardData", "only remove TIPS_COMPANION");
                this.ac.remove((Object) 104);
            }
        }
    }

    public void y() {
        if (!(this.j instanceof Activity)) {
            LogUtil.a("SCUI_DialogCardData", "mContext is NOT Activity");
            return;
        }
        sik.b("type", 100113, "event", 0, AnalyticsValue.HEALTH_HOME_TIPS_2040119);
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.j).a(this.j.getResources().getString(com.huawei.ui.homewear21.R.string.IDS_miss_sensitive_notification_content)).c(R.string.IDS_go_setting, new View.OnClickListener() { // from class: sif
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: sih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48121b.d(view);
            }
        }).c();
        this.r = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.r.show();
    }

    /* synthetic */ void c(View view) {
        LogUtil.a("SCUI_DialogCardData", "requestPermissions try again");
        sik.b("type", 100113, "event", 1, AnalyticsValue.HEALTH_HOME_TIPS_2040119);
        rdp.a(h(), this.j, i());
    }

    /* synthetic */ void d(View view) {
        sik.b("type", 100113, "event", 2, AnalyticsValue.HEALTH_HOME_TIPS_2040119);
        ab();
    }

    public void ab() {
        LogUtil.a("SCUI_DialogCardData", "enter startReconnect");
        v();
        if (this.ab == null) {
            LogUtil.a("SCUI_DialogCardData", "startReconnect mUnbindDeviceInfo is null");
            return;
        }
        final List<DeviceInfo> listK = tfn.a().k();
        a(listK);
        ThreadPoolManager.c().execute(new Runnable() { // from class: sho.13
            @Override // java.lang.Runnable
            public void run() {
                String deviceUdid;
                lvl.a((List<DeviceInfo>) listK, sho.this.h());
                if (!TextUtils.isEmpty(sho.this.ab.getDeviceUdid())) {
                    deviceUdid = sho.this.ab.getDeviceUdid();
                } else {
                    deviceUdid = sho.this.ab.getSecurityUuid() + "#ANDROID21";
                }
                new rfi().b(null, deviceUdid, false, sho.this.h(), sho.this.j);
            }
        });
    }

    private void a(List<DeviceInfo> list) {
        if (list == null) {
            LogUtil.a("SCUI_DialogCardData", "handleDeviceState deviceInfoLists is null");
            return;
        }
        if (eel.d(this.ab.getProductType())) {
            for (DeviceInfo deviceInfo : list) {
                if (this.ab.getDeviceIdentify().equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                    deviceInfo.setDeviceActiveState(1);
                    deviceInfo.setDeviceConnectState(1);
                } else if (!eel.d(deviceInfo.getProductType())) {
                    LogUtil.j("SCUI_DialogCardData", "handleDeviceState default");
                } else {
                    deviceInfo.setDeviceActiveState(0);
                    deviceInfo.setDeviceConnectState(3);
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo2 : list) {
            if (this.ab.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                deviceInfo2.setDeviceActiveState(1);
                deviceInfo2.setDeviceConnectState(1);
            }
            if (!this.ab.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify()) && deviceInfo2.getAutoDetectSwitchStatus() != 1 && !rdp.d(this.ab.getProductType()) && deviceInfo2.getDeviceActiveState() == 1) {
                deviceInfo2.setDeviceActiveState(0);
                deviceInfo2.setDeviceConnectState(3);
            }
        }
        dxx.d().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bx() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.j).a(this.j.getResources().getString(com.huawei.ui.homewear21.R.string.IDS_device_ota_later_note)).c(com.huawei.ui.homewear21.R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: sic
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void cb() {
        LogUtil.a("SCUI_DialogCardData", "enter showWeChatCard");
        if (ah() == null || ah().ae() == null || this.j == null) {
            LogUtil.j("SCUI_DialogCardData", "mStepsCardViewHolder == null");
            return;
        }
        ah().ag().setOnClickListener(new View.OnClickListener() { // from class: sho.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "click link");
                if (!qrs.r()) {
                    if (sho.this.z != null) {
                        sho.this.z.a(sho.this.j);
                    }
                    sik.b("type", 2, "event", 1, AnalyticsValue.HEALTH_HOME_TIPS_20401106);
                    return;
                }
                LogUtil.a("SCUI_DialogCardData", "click link too fast");
            }
        });
        ah().ac().setOnClickListener(new View.OnClickListener() { // from class: sho.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "click ignore");
                sho.this.bk();
                sho.this.n(8);
                sik.b("type", 2, "event", 2, AnalyticsValue.HEALTH_HOME_TIPS_20401106);
            }
        });
        sik.b("type", 2, "event", 0, AnalyticsValue.HEALTH_HOME_TIPS_20401106);
        an();
        n(0);
    }

    private void br() {
        LogUtil.a("SCUI_DialogCardData", "showEcgDataRemind");
        if (ah() == null) {
            LogUtil.a("SCUI_DialogCardData", "showEcgDataRemind viewholder is null");
            return;
        }
        qsp.b(ah().i(), new View.OnClickListener() { // from class: sho.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qrg.a(false);
                H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
                builder.addCustomizeArg("from", "6");
                ddv.b().loadH5ProApp(sho.this.j, "com.huawei.health.h5.ecgce", builder);
                qsp.c((View) sho.this.ah().g(), 8);
                sho.this.t();
            }
        });
        qsp.b(ah().h(), new View.OnClickListener() { // from class: sho.20
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qsp.c((View) sho.this.ah().g(), 8);
                sho.this.t();
            }
        });
        an();
        qsp.c((View) ah().g(), 0);
    }

    private void bu() {
        ReleaseLogUtil.d("R_SCUI_DialogCardData", "showFamilySpaceRemind enter");
        if (ah() == null) {
            LogUtil.a("SCUI_DialogCardData", "showFamilySpaceRemind viewholder is null");
            return;
        }
        if (njy.e(this.o)) {
            LogUtil.a("SCUI_DialogCardData", "showFamilySpaceRemind FAMILY_SPACE_ASK_MAP is empty");
            return;
        }
        Map.Entry<String, String> next = this.o.entrySet().iterator().next();
        final String key = next.getKey();
        final String strD = Sha256.d(key, "SHA-256");
        String value = next.getValue();
        an();
        ah().m().setText(qre.a(com.huawei.ui.main.R.string.IDS_hw_family_sapce_tips, value));
        ah().a().setVisibility(0);
        ah().k().setVisibility(8);
        ah().n().setVisibility(8);
        ah().l().setVisibility(0);
        ah().l().setText(qre.f(com.huawei.ui.main.R.string.IDS_hw_familymember_viewing_title));
        ah().w().setVisibility(0);
        ah().p().setVisibility(0);
        ah().e().setVisibility(0);
        ah().e().setText(qre.f(com.huawei.ui.main.R.string.IDS_family_health_zone_ignore));
        ah().p().setText(qre.f(com.huawei.ui.main.R.string.IDS_hw_family_sapce_go_tips));
        a(0, "m0", qre.f(com.huawei.ui.main.R.string.IDS_hw_familymember_viewing_title));
        ah().p().setOnClickListener(new View.OnClickListener() { // from class: sho.17
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.r()) {
                    sho.this.ah().a().setVisibility(8);
                    sho.this.t();
                    sho.this.d(strD);
                    sho.this.a(1, qre.f(com.huawei.ui.main.R.string.IDS_hw_family_sapce_go_tips), qre.f(com.huawei.ui.main.R.string.IDS_hw_familymember_viewing_title));
                    sho.this.z();
                    return;
                }
                LogUtil.a("SCUI_DialogCardData", "JumpToGuideBtn click too fast");
            }
        });
        ah().e().setOnClickListener(new View.OnClickListener() { // from class: sho.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!qrs.r()) {
                    sho.this.ah().a().setVisibility(8);
                    voy.c(key);
                    sho.this.t();
                    sho.this.a(1, qre.f(com.huawei.ui.main.R.string.IDS_main_btn_state_ignore), qre.f(com.huawei.ui.main.R.string.IDS_hw_familymember_viewing_title));
                    sho.this.z();
                    return;
                }
                LogUtil.a("SCUI_DialogCardData", "HwCancelBtn click too fast");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        H5ProClient.startH5MiniProgram(this.j, "com.huawei.health.h5.familyspace", new H5ProLaunchOption.Builder().addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("healthZoneApi", PluginHealthH5InteractionUtil.class).addCustomizeJsModule("JsInteraction", ddv.b().getCommonJsModule("JsInteraction")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).addCustomizeJsModule("device", ddv.b().getCommonJsModule("device")).addCustomizeArg("h5pro", "true").addCustomizeArg("from", "6").addCustomizeArg(HealthZonePushReceiver.IS_HASH_HUID, "true").addCustomizeArg("data", str).setImmerse().showStatusBar().setNeedSoftInputAdapter().setStatusBarTextBlack(true).setForceDarkMode(1).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str, String str2) {
        HashMap map = new HashMap();
        map.put("pageId", "Today_0001");
        map.put("event", Integer.valueOf(i));
        map.put(FunctionSetBeanReader.BI_ELEMENT, str);
        if (i != 0) {
            map.put("value", str);
        }
        map.put("messageTopic", str2);
        map.put("moduleName", "main_page");
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.FAMILY_SPACE_HOME_REMINDER_H1000007.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bk() {
        Integer num = (Integer) ai().second;
        int iIntValue = num.intValue();
        LogUtil.a("SCUI_DialogCardData", "setWeChatIsSHow times ", num);
        SharedPreferenceManager.e(this.j, Integer.toString(10000), "BIND_WECHAT_TIME_AND_INTERVAL", System.currentTimeMillis() + "#" + (iIntValue + 1), null);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void be() {
        Intent intent = new Intent();
        intent.setAction("sync_cloud_data_again_action");
        intent.putExtra("sync_cloud_data_again", true);
        BroadcastManagerUtil.a(this.j, intent);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DialogCardViewHolder ah() {
        return this.f;
    }

    protected void c(LinearLayout linearLayout) {
        if (linearLayout.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            marginLayoutParams.setMarginStart(this.j.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart) + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(this.j.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd) + ((Integer) safeRegionWidth.second).intValue());
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    protected void g() {
        HealthOpenSDK healthOpenSDKE = fga.d(this.j).e();
        this.m = healthOpenSDKE;
        if (healthOpenSDKE == null) {
            ReleaseLogUtil.e("SCUI_DialogCardData", "mHealthOpenSdk null");
        } else {
            x();
            bd();
        }
    }

    protected void x() {
        LogUtil.d("SCUI_DialogCardData", "registerNewTipBroadcast register");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.action.NPL_SERVICE_NOT_AVALIABLE");
        intentFilter.addAction("com.huawei.health.action.NO_CALL_REJECT_PERMISION");
        intentFilter.addAction("com.huawei.bone.action.NEW_ECG_DATA_RECEIVED");
        BroadcastManagerUtil.c(this.j, this.q, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void bd() {
        LogUtil.a("SCUI_DialogCardData", "registerH5CommonObserver register");
        H5ProEventHubManager.addObserver("family-space.01", new H5ProEventHubObserver() { // from class: sho.16
            public int hashCode() {
                return 1001;
            }

            @Override // com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubObserver
            public void onEventChanged(String str) {
                LogUtil.a("SCUI_DialogCardData", "onEventChanged " + str);
                sho.this.e();
            }
        });
    }

    @Override // com.huawei.health.health.utils.functionsetcard.AbstractBaseCardData
    public void refreshCardData() {
        ac();
    }

    public void j() {
        HandlerExecutor.b(new Runnable() { // from class: shw
            @Override // java.lang.Runnable
            public final void run() {
                this.f48110b.r();
            }
        });
    }

    /* synthetic */ void r() {
        LogUtil.a("SCUI_DialogCardData", "account is logout");
        List<Integer> list = this.ac;
        if (list == null) {
            LogUtil.j("SCUI_DialogCardData", "LoginOut mTipsList is null");
            return;
        }
        synchronized (list) {
            this.ac.clear();
            t();
        }
    }

    protected void ac() {
        LogUtil.a("SCUI_DialogCardData", "updateFitnessDataOrigin enter ");
        uim.c().c(lsl.r(System.currentTimeMillis()), new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(final List<uif> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("SCUI_DialogCardData", "refreshOriginList is empty.");
        } else {
            HandlerExecutor.c(new Runnable() { // from class: shp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f48101b.b(list);
                }
            });
        }
    }

    /* synthetic */ void b(List list) {
        List<uif> list2 = this.f48075a;
        if (list2 != null) {
            list2.clear();
            this.f48075a.addAll(list);
            LogUtil.a("SCUI_DialogCardData", "updateFitnessDataOrigin end data ", Integer.valueOf(this.f48075a.size()));
        }
    }

    public static class a implements CommonUiBaseResponse {
        private WeakReference<sho> e;

        a(sho shoVar) {
            this.e = new WeakReference<>(shoVar);
        }

        @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
        public void onResponse(int i, Object obj) {
            sho shoVar = this.e.get();
            if (shoVar == null) {
                LogUtil.j("SCUI_DialogCardData", "stepsCardData is null");
            } else if (njy.b(obj, uif.class)) {
                shoVar.g((List<uif>) obj);
            } else {
                LogUtil.j("SCUI_DialogCardData", "msg.obj not instanceof List");
            }
        }
    }

    static class d implements IExecuteResult {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<sho> f48098c;

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
        }

        protected d(sho shoVar) {
            this.f48098c = new WeakReference<>(shoVar);
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            WeakReference<sho> weakReference = this.f48098c;
            if (weakReference == null) {
                LogUtil.j("SCUI_DialogCardData", "mWeakRef == null");
                return;
            }
            sho shoVar = weakReference.get();
            if (shoVar == null) {
                LogUtil.j("SCUI_DialogCardData", "cardData == null");
                return;
            }
            if (!(obj instanceof Bundle)) {
                LogUtil.j("SCUI_DialogCardData", "obj not instanceof Bundle");
                return;
            }
            boolean z = ((Bundle) obj).getBoolean("stepsNotifiState");
            LogUtil.a("SCUI_DialogCardData", "MessageSwitch :", Boolean.valueOf(z));
            if (z) {
                return;
            }
            shoVar.bt();
        }
    }

    static class j implements IExecuteResult {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CountDownLatch f48099c;
        WeakReference<sho> d;

        protected j(sho shoVar, CountDownLatch countDownLatch) {
            this.d = new WeakReference<>(shoVar);
            this.f48099c = countDownLatch;
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onSuccess(Object obj) {
            LogUtil.a("SCUI_DialogCardData", "OpenSdkAliveOrStepCallbackForOp onSuccess");
            WeakReference<sho> weakReference = this.d;
            if (weakReference == null) {
                LogUtil.j("SCUI_DialogCardData", "mWeakRef == null");
                this.f48099c.countDown();
                return;
            }
            sho shoVar = weakReference.get();
            if (shoVar == null) {
                LogUtil.j("SCUI_DialogCardData", "cardData == null");
                this.f48099c.countDown();
                return;
            }
            if (obj instanceof Bundle) {
                Bundle bundle = (Bundle) obj;
                if (bundle.containsKey("isNeedPromptKeepAlive")) {
                    boolean z = bundle.getBoolean("isNeedPromptKeepAlive", false);
                    shoVar.y.put("isCurDaemonKilled", String.valueOf(z));
                    ReleaseLogUtil.d("SCUI_DialogCardData", "isNeedPromptKeepAlive : ", Boolean.valueOf(z));
                }
                if (bundle.containsKey("stepsNotifiState")) {
                    boolean z2 = bundle.getBoolean("stepsNotifiState");
                    shoVar.y.put("isStepNotificationOpen", String.valueOf(z2));
                    ReleaseLogUtil.d("SCUI_DialogCardData", "stepsNotifiState : ", Boolean.valueOf(z2));
                }
            }
            this.f48099c.countDown();
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onFailed(Object obj) {
            this.f48099c.countDown();
            LogUtil.j("SCUI_DialogCardData", "OpenSdkAliveOrStepCallbackForOp onFailed");
        }

        @Override // com.huawei.hihealth.motion.IExecuteResult
        public void onServiceException(Object obj) {
            this.f48099c.countDown();
            LogUtil.j("SCUI_DialogCardData", "OpenSdkAliveOrStepCallbackForOp onServiceException");
        }
    }

    static class b implements Observer {
        private WeakReference<sho> d;

        b(sho shoVar) {
            this.d = new WeakReference<>(shoVar);
        }

        @Override // com.huawei.haf.design.pattern.Observer
        public void notify(String str, Object... objArr) {
            sho shoVar;
            if (!"closeStepsTips".equals(str) || (shoVar = this.d.get()) == null) {
                return;
            }
            shoVar.ae();
        }
    }

    static class f extends BroadcastReceiver {
        private WeakReference<sho> d;

        public f(sho shoVar) {
            this.d = new WeakReference<>(shoVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sho shoVar = this.d.get();
            if (shoVar != null) {
                if (intent == null || shoVar.j == null) {
                    LogUtil.j("SCUI_DialogCardData", "SyncCloudDataFailReceiver onReceive intent is null or context is null");
                    return;
                }
                LogUtil.a("SCUI_DialogCardData", "SyncCloudDataFailReceiver onReceive to enter, action = ", intent.getAction());
                String stringExtra = intent.getStringExtra("sync_cloud_data_status");
                LogUtil.a("SCUI_DialogCardData", "SyncCloudDataFailReceiver onReceive to enter, status = ", stringExtra);
                if ("sync_cloud_data_fail".equals(stringExtra)) {
                    if (CommonUtil.aq()) {
                        LogUtil.j("SCUI_DialogCardData", "SyncCloudDataFailReceiver is Astronauts version, no dialog");
                        return;
                    } else {
                        shoVar.d(100);
                        return;
                    }
                }
                return;
            }
            LogUtil.j("SCUI_DialogCardData", "SyncCloudDataFailReceiver DialogCardData is null");
        }
    }

    static class e extends BaseHandler<sho> {
        public e(Looper looper, sho shoVar) {
            super(looper, shoVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(sho shoVar, Message message) {
            int i = message.what;
            if (i != 11) {
                if (i == 21) {
                    shoVar.t();
                }
            } else if (shoVar.ah() != null) {
                shoVar.ah().a().setVisibility(8);
                shoVar.ah().y().setVisibility(8);
            }
            shoVar.c(message);
        }
    }

    protected void c(Message message) {
        int i = message.what;
        if (i == 26) {
            LogUtil.a("SCUI_DialogCardData", "isShowNps MSG_CLOSE_NPS_TIPS!");
            a(false, "", this.u);
            return;
        }
        switch (i) {
            case 30:
                if (!this.ac.contains(7)) {
                    d(7);
                }
                break;
            case 31:
                n(8);
                break;
            case 32:
                d(8);
                break;
            case 33:
                bj();
                break;
            case 34:
                bw();
                break;
            case 35:
                bo();
                break;
            case 36:
                d(9);
                break;
        }
    }

    private void bo() {
        LogUtil.a("SCUI_DialogCardData", "enter showDownloadPremisesPlugin");
        if (ah() == null || ah().aa() == null || this.j == null) {
            LogUtil.j("SCUI_DialogCardData", "showDownloadPremisesPlugin mStepsCardViewHolder == null");
            return;
        }
        String strE = ohf.e().e(this.g);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("SCUI_DialogCardData", "showDownloadPremisesPlugin downloadTitle is empty");
            return;
        }
        ah().f().setText(strE);
        ah().ab().setText(R.string.IDS_bundle_download_button);
        ah().ab().setOnClickListener(new View.OnClickListener() { // from class: sho.18
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "click download");
                sho.this.ah().aa().setVisibility(8);
                sho.this.t();
                ohf.e().b(sho.this.g);
                Intent intent = new Intent();
                intent.putExtra("moduleName", sho.this.g);
                AppBundle.d().launchActivity(sho.this.j, intent, new AppBundleLauncher.InstallCallback() { // from class: sho.18.4
                    @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
                    public boolean call(Context context, Intent intent2) {
                        qpx.b(sho.this.j, R.string.IDS_motiontrack_download_complete);
                        return true;
                    }
                });
            }
        });
        ah().z().setOnClickListener(new View.OnClickListener() { // from class: sho.21
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("SCUI_DialogCardData", "click cancel");
                sho.this.ah().aa().setVisibility(8);
                ohf.e().b(sho.this.g);
                sho.this.t();
            }
        });
        an();
        ah().aa().setVisibility(0);
        ah().z().setVisibility(0);
        LogUtil.a("SCUI_DialogCardData", "showDownloadPremisesPlugin dialog is showing");
    }

    private void bj() {
        if (ah() == null || ah().aa() == null) {
            LogUtil.j("SCUI_DialogCardData", "setVoiceRelativeLayout mStepsCardViewHolder = null");
        } else {
            ah().aa().setVisibility(8);
        }
    }

    private void bw() {
        LogUtil.a("SCUI_DialogCardData", "enter showVoiceCard");
        if (ah() == null || ah().aa() == null || this.j == null) {
            LogUtil.j("SCUI_DialogCardData", "mStepsCardViewHolder == null");
            return;
        }
        if (bn()) {
            ah().ab().setText(R.string.IDS_hi_ai_know_btn);
            ah().z().setVisibility(8);
            ah().ab().setOnClickListener(new View.OnClickListener() { // from class: sho.23
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("SCUI_DialogCardData", "click know button");
                    sho.this.ah().aa().setVisibility(8);
                    sho.this.bg();
                    sho.this.t();
                }
            });
            an();
            ah().aa().setVisibility(0);
            LogUtil.a("SCUI_DialogCardData", "HiAi dialog is showing");
            ArrayList arrayList = new ArrayList();
            arrayList.add("PluginHiAiEngine");
            AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), arrayList, true, true);
        }
    }

    private boolean bn() {
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("downloadHiAiPlugin");
        long moduleZipSize = AppBundle.c().getModuleZipSize(BaseApplication.getContext(), "PluginHiAiEngine");
        if (TextUtils.isEmpty(strC) || moduleZipSize == 0) {
            LogUtil.a("SCUI_DialogCardData", "show flag is enpty  or pageSize is 0");
            return false;
        }
        String strA = qrs.a(BaseApplication.getContext(), moduleZipSize);
        if ("voiceAssistant".equals(strC)) {
            ah().f().setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hi_ai_voice_top_card_title, strA));
            return true;
        }
        if ("bumpPass".equals(strC)) {
            ah().f().setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hi_ai_bump_title, strA));
            return true;
        }
        ah().f().setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hi_ai_record_sleep_title, strA));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bg() {
        KeyValDbManager.d(BaseApplication.getContext()).c("downloadHiAiPlugin", "", null);
        LogUtil.a("SCUI_DialogCardData", "reset flag is");
    }

    private void an() {
        DialogCardViewHolder dialogCardViewHolderAh = ah();
        if (dialogCardViewHolderAh == null) {
            LogUtil.j("SCUI_DialogCardData", "hideAllTipDialog mStepsCardViewHolder == null");
            return;
        }
        dialogCardViewHolderAh.g().setVisibility(8);
        dialogCardViewHolderAh.x().setVisibility(8);
        dialogCardViewHolderAh.a().setVisibility(8);
        dialogCardViewHolderAh.y().setVisibility(8);
        dialogCardViewHolderAh.q().setVisibility(8);
        if (dialogCardViewHolderAh.ae() != null) {
            dialogCardViewHolderAh.ae().setVisibility(8);
        }
        dialogCardViewHolderAh.aa().setVisibility(8);
        dialogCardViewHolderAh.b().setVisibility(8);
    }

    static class c extends PermissionsResultAction {
        private c() {
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("SCUI_DialogCardData", "mBaseCallback onGranted");
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            LogUtil.j("SCUI_DialogCardData", "mBaseCallback permission denied by the user ", str);
            sik.d(BaseApplication.getActivity(), BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_permission_guide_activity_reconnition));
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.j("SCUI_DialogCardData", "mBaseCallback permission onForeverDenied by the user ", permissionType);
        }
    }

    public boolean m() {
        return this.x;
    }

    public boolean o() {
        return this.f48076b;
    }

    public void d(boolean z) {
        this.x = z;
    }

    public String h() {
        if (!TextUtils.isEmpty(this.ad)) {
            return this.ad;
        }
        v();
        return this.ad;
    }

    public int i() {
        int i = this.h;
        if (i != -1) {
            return i;
        }
        v();
        return this.h;
    }

    public void v() {
        if (this.ab == null) {
            DeviceInfo deviceInfoE = tqp.e();
            this.ab = deviceInfoE;
            c(deviceInfoE);
        }
    }

    private void c(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        this.ad = deviceInfo.getDeviceIdentify();
        this.h = deviceInfo.getDeviceBluetoothType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.ac.contains(105)) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: sil
            @Override // java.lang.Runnable
            public final void run() {
                this.e.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: bc, reason: merged with bridge method [inline-methods] */
    public void k() {
        voy.c((ResponseCallback<List<vop>>) new ResponseCallback() { // from class: shn
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.e.e(i, (List) obj);
            }
        });
    }

    /* synthetic */ void e(int i, List list) {
        if (i != 0 || njy.e(list)) {
            ReleaseLogUtil.d("SCUI_DialogCardData", "getFamilySpacePendingMsg rspCode, ", Integer.valueOf(i));
        } else {
            e((List<vop>) list);
        }
    }

    private void e(final List<vop> list) {
        voy.a((ResponseCallback<Map<String, voo>>) new ResponseCallback() { // from class: sia
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f48116b.a(list, i, (Map) obj);
            }
        });
    }

    /* synthetic */ void a(List list, int i, Map map) {
        if (i != 0 || njy.e((Map<?, ?>) map)) {
            ReleaseLogUtil.d("R_SCUI_DialogCardData", "getFamilyMemberInfoList rspCode, ", Integer.valueOf(i));
        } else {
            a(b((List<vop>) list, (Map<String, voo>) map));
        }
    }

    private Map<String, String> b(List<vop> list, Map<String, voo> map) {
        ReleaseLogUtil.d("R_SCUI_DialogCardData", "buildHuidToUserAccountMap enter, huidList, ", Integer.valueOf(list.size()), ", memberList, ", Integer.valueOf(map.size()));
        HashMap map2 = new HashMap();
        Iterator<vop> it = list.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (TextUtils.isEmpty(strA)) {
                LogUtil.a("SCUI_DialogCardData", "targetHuid is empty!");
            } else if (map.containsKey(strA)) {
                String strE = e(map.get(strA));
                if (TextUtils.isEmpty(strA) || TextUtils.isEmpty(strE)) {
                    LogUtil.a("SCUI_DialogCardData", "targetHuid or userInfo is empty, targetHuid: ", strA, ", userInfo: ", strE);
                } else {
                    map2.put(strA, strE);
                }
            } else {
                LogUtil.a("SCUI_DialogCardData", "huid not contains, ", strA);
            }
        }
        LogUtil.a("SCUI_DialogCardData", "huidToUserAccountMap: " + map2.toString());
        return map2;
    }

    private String e(voo vooVar) {
        String strD = vooVar.d();
        String strB = vooVar.b();
        LogUtil.a("SCUI_DialogCardData", "getMemberUserInfo, userAccount: ", strD, ", userNickName: ", strB);
        return TextUtils.isEmpty(strD) ? strB : CommonUtil.o(strD);
    }

    private void a(Map<String, String> map) {
        voy.e(map, new ResponseCallback() { // from class: sib
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.d.b(i, (Map) obj);
            }
        });
    }

    /* synthetic */ void b(int i, final Map map) {
        if (njy.e((Map<?, ?>) map)) {
            return;
        }
        HandlerExecutor.c(new Runnable() { // from class: shx
            @Override // java.lang.Runnable
            public final void run() {
                this.d.e(map);
            }
        });
    }

    /* synthetic */ void e(Map map) {
        this.o.clear();
        this.o.putAll(map);
        d(105);
    }

    public void e() {
        LogUtil.a("SCUI_DialogCardData", "closeFamilyTipsByRecive mTipsList=", this.ac);
        if (njy.e(this.ac)) {
            return;
        }
        synchronized (this.ac) {
            Iterator<Integer> it = this.ac.iterator();
            while (it.hasNext()) {
                if (it.next().intValue() == 105) {
                    it.remove();
                    LogUtil.a("SCUI_DialogCardData", "remove family tips, ", Integer.valueOf(this.ac.size()));
                }
            }
            t();
        }
        z();
    }
}
