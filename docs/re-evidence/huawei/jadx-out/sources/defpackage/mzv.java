package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.SQLException;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.provider.CallLog;
import android.provider.Settings;
import android.text.TextUtils;
import com.alipay.sdk.m.s.e;
import com.google.android.gms.common.api.ApiException;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.bundle.AppBundleLauncher;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.baseapi.hiaiengine.HiAiKitCreateListener;
import com.huawei.health.baseapi.hiaiengine.HiAiKitInitTtsListener;
import com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hiai.awareness.client.AwarenessRequest;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.mlsdk.asr.MLAsrConstants;
import com.huawei.hms.mlsdk.asr.MLAsrRecognizer;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.mlsdk.common.MLApplication;
import com.huawei.hms.network.NetworkKit;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hwid.HuaweiIdAuthManager;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParams;
import com.huawei.hms.support.hwid.request.HuaweiIdAuthParamsHelper;
import com.huawei.hms.support.hwid.result.AuthHuaweiId;
import com.huawei.hms.support.hwid.service.HuaweiIdAuthService;
import com.huawei.hwbasemgr.HwBaseManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.phoneprocess.binder.ParserInterface;
import com.huawei.hwdevice.phoneprocess.mgr.hwmlkitmgr.SpeechRecognizerManager;
import com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.HwControlLocalAppHelper;
import com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.ScoUtils;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import health.compact.a.AuthorizationUtils;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.GRSManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.Field;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class mzv extends HwBaseManager implements ParserInterface {
    private static volatile mzv g;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private boolean ai;
    private HiAiKitRecognizeListener aj;
    private List<String> ak;
    private String al;
    private HiAiKitInitTtsListener am;
    private String an;
    private ScoUtils ao;
    private JSONArray ap;
    private int aq;
    private BroadcastReceiver ar;
    private ScoUtils.OnScoConnectListener as;
    private HuaweiIdAuthService at;
    private SpeechRecognizerManager au;
    private String av;
    private JSONArray aw;
    private String ax;
    private String ay;
    private String ba;
    private String bc;
    private List<String> f;
    private boolean h;
    private BroadcastReceiver i;
    private String j;
    private mzy.a k;
    private CountDownLatch l;
    private Context m;
    private String n;
    private HwControlLocalAppHelper o;
    private String p;
    private int q;
    private HiAiKitCreateListener r;
    private String s;
    private int t;
    private ExtendHandler u;
    private AppBundleLauncher.InstallCallback v;
    private long w;
    private ddr x;
    private int y;
    private boolean z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f42774b = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f42775c = {74, 65, 60, 35, 20, 8, 64, 44, 18, 13, 24, 37, 12};
    private static final Object e = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42773a = new Object();

    static /* synthetic */ int q(mzv mzvVar) {
        int i = mzvVar.y;
        mzvVar.y = i + 1;
        return i;
    }

    private void i() {
        LogUtil.a("MLASR_Manager", "getLanguageList start :");
        MLAsrRecognizer.createAsrRecognizer(this.m).getLanguages(new MLAsrRecognizer.LanguageCallback() { // from class: mzv.7
            @Override // com.huawei.hms.mlsdk.asr.MLAsrRecognizer.LanguageCallback
            public void onResult(List<String> list) {
                if (njy.e(list)) {
                    LogUtil.a("MLASR_Manager", "getLanguageList is null");
                    return;
                }
                mzv.this.j = String.join(",", list);
                LogUtil.a("MLASR_Manager", "sendLanguageList :" + mzv.this.j);
                if (!CommonUtil.bh()) {
                    mzv.this.e(list);
                } else {
                    nae.c(mzv.this.j);
                }
            }

            @Override // com.huawei.hms.mlsdk.asr.MLAsrRecognizer.LanguageCallback
            public void onError(int i, String str) {
                LogUtil.e("HwVoiceKitManager", "getLanguageList errorCode:" + i + "errorMsg:" + str);
                xjt.aa("getLanguageList failed");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<String> list) {
        String strJoin;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (MLAsrConstants.LAN_ZH.equals(str) || "zh-CN".equals(str) || "en".equals(str) || "en-US".equals(str)) {
                arrayList.add(str);
            }
        }
        if (njy.e(arrayList)) {
            strJoin = "";
        } else {
            strJoin = String.join(",", arrayList);
        }
        nae.c(strJoin);
    }

    private mzv(Context context) {
        super(context);
        this.av = "";
        this.ba = "";
        this.u = null;
        this.y = 0;
        this.w = -1L;
        this.z = false;
        this.ah = false;
        this.ad = false;
        this.q = 0;
        this.af = false;
        this.ab = false;
        this.ai = false;
        this.aa = false;
        this.f = new ArrayList(16);
        this.ak = new ArrayList(16);
        this.h = false;
        this.k = null;
        this.ax = "";
        this.aq = 0;
        this.ag = true;
        this.ay = "";
        this.n = "";
        this.an = "";
        this.al = "";
        this.bc = "";
        this.j = "";
        this.ar = new BroadcastReceiver() { // from class: mzv.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                int resultCode = getResultCode();
                LogUtil.a("HwVoiceKitManager", "doMusicSearch onReceive getResultCode: ", Integer.valueOf(resultCode));
                if (resultCode == 0) {
                    LogUtil.a("HwVoiceKitManager", "start play");
                    nab.b(mzv.this.m, mzv.this.al);
                    mzv.this.al = "";
                }
                if (resultCode == -1) {
                    LogUtil.a("HwVoiceKitManager", "start search");
                }
            }
        };
        this.i = new BroadcastReceiver() { // from class: mzv.8
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, final Intent intent) {
                if (CommonUtil.ck()) {
                    if (context2 == null || intent == null) {
                        LogUtil.j("HwVoiceKitManager", "mConnectStateChangedReceiver() context or intent is null ");
                        return;
                    }
                    LogUtil.a("HwVoiceKitManager", "mConnectStateChangedReceiver() context:", context2, ", intent:", intent.getAction());
                    if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                        ThreadPoolManager.c().execute(new Runnable() { // from class: mzv.8.4
                            @Override // java.lang.Runnable
                            public void run() {
                                Bundle extras = intent.getExtras();
                                if (extras == null) {
                                    LogUtil.j("HwVoiceKitManager", "mConnectStateChangedReceiver() bundle is null ");
                                    return;
                                }
                                try {
                                    Parcelable parcelable = extras.getParcelable("deviceinfo");
                                    if (parcelable instanceof DeviceInfo) {
                                        mzv.this.a((DeviceInfo) parcelable);
                                    }
                                } catch (BadParcelableException unused) {
                                    LogUtil.e("HwVoiceKitManager", "mConnectStateChangedReceiver onReceive() BadParcelableException");
                                }
                            }
                        });
                    }
                }
            }
        };
        this.as = new ScoUtils.OnScoConnectListener() { // from class: mzv.9
            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.ScoUtils.OnScoConnectListener
            public void onConnectSuccess() {
                LogUtil.a("HwVoiceKitManager", "mScoConnectListener onConnectSuccess, mTtsContentText:", mzv.this.ax);
                if (mzv.this.ab) {
                    mzv.this.u.sendEmptyMessage(8);
                } else {
                    mzv.this.u.sendEmptyMessage(4, 1200L);
                }
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.ScoUtils.OnScoConnectListener
            public void onConnectClose() {
                LogUtil.a("HwVoiceKitManager", "mScoConnectListener onConnectClose");
                if (mzv.this.x.isSpeaking()) {
                    mzv.this.x.stopSpeak();
                }
                mzv.this.x.cancelSpeak();
            }

            @Override // com.huawei.hwdevice.phoneprocess.mgr.hwvoicekitmgr.ScoUtils.OnScoConnectListener
            public void connectTimeout() {
                LogUtil.a("HwVoiceKitManager", "mScoConnectListener connectTimeout");
                if (mzv.this.af) {
                    mzv.this.u.sendEmptyMessage(5);
                }
            }
        };
        this.aj = new HiAiKitRecognizeListener() { // from class: mzv.13
            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener
            public void onInit() {
                mzv.this.p();
                if (mzv.this.x == null || CommonUtil.bg() || TextUtils.isEmpty(mzv.this.ba)) {
                    return;
                }
                mzv.this.x.updateVoiceEvent(mzv.this.ba);
                LogUtil.a("HwVoiceKitManager", "mKitRecognizeListener updateVoiceEvents");
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener
            public void onError(int i, String str) {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitRecognizeListener onError");
                mzv.this.b(i, str);
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener
            public void onResult(String str) throws Throwable {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitRecognizeListener onResult");
                mzv.this.ab();
                mzv.this.f(str);
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener
            public void onPartialResult(String str) {
                LogUtil.a("HwVoiceKitManager", "mKitRecognizeListener onPartialResult");
                nab.b(str);
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener
            public void onSpeechEnd() {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitRecognizeListener onSpeechEnd");
                mzv.this.ab();
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitRecognizeListener
            public void startRecord() {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitRecognizeListener startRecord");
                mzv.this.ai = true;
                mzv.this.w();
            }
        };
        this.r = new HiAiKitCreateListener() { // from class: mzv.14
            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitCreateListener
            public void onClientInit(int i) {
                if (i != 255) {
                    if (!lqs.e(mzv.this.m)) {
                        ReleaseLogUtil.e("R_HwVoiceKitManager", "mCreateListener onInit but network is off");
                        nae.d(2);
                        return;
                    } else {
                        ReleaseLogUtil.d("R_HwVoiceKitManager", "mCreateListener onInit success");
                        mzv.this.o();
                        nae.d(1);
                        return;
                    }
                }
                ReleaseLogUtil.e("R_HwVoiceKitManager", "mCreateListener onInit voiceKitSdk is null");
                nae.d(i);
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitCreateListener
            public void onClientError(int i, String str) {
                ReleaseLogUtil.e("R_HwVoiceKitManager", "mCreateListener onError errorCode:", Integer.valueOf(i), ", errorMessage:", str);
                xjt.ao("HiAiKitCreateListener onClientError");
                nae.d(255);
            }
        };
        this.am = new HiAiKitInitTtsListener() { // from class: mzv.12
            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitInitTtsListener
            public void onInit() {
                mzv.this.ad = true;
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitInitTtsListener onInit:", Boolean.valueOf(mzv.this.ad));
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitInitTtsListener
            public void onTtsError(int i, String str) {
                mzv.this.ad = false;
                ReleaseLogUtil.e("R_HwVoiceKitManager", "mKitInitTtsListener onTtsError errorCode:", Integer.valueOf(i), ", errorMsg:", str);
                xjt.ao("mKitInitTtsListener onTtsError");
                if (mzv.this.ai) {
                    return;
                }
                mzv.this.ad();
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitInitTtsListener
            public void onTtsComplete(String str) {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitInitTtsListener onTtsComplete");
                mzv.this.ad();
            }

            @Override // com.huawei.health.baseapi.hiaiengine.HiAiKitInitTtsListener
            public void onTtsStart(String str) {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "mKitInitTtsListener onTtsStart");
                if (mzv.this.x == null || !mzv.this.ab) {
                    return;
                }
                mzv.this.x.stopSpeak();
                mzv.this.x.cancelSpeak();
            }
        };
        this.v = new AppBundleLauncher.InstallCallback() { // from class: mzv.15
            @Override // com.huawei.haf.bundle.AppBundleLauncher.InstallCallback
            public boolean call(Context context2, Intent intent) {
                LogUtil.a("HwVoiceKitManager", "plugin install success");
                mzv.this.f();
                return false;
            }
        };
        this.m = context;
        this.u = HandlerCenter.b(new a(), "HwVoiceKitManager");
        this.o = new HwControlLocalAppHelper(this.m);
        ScoUtils scoUtilsD = ScoUtils.d(this.m);
        this.ao = scoUtilsD;
        scoUtilsD.a(this.as);
        l();
        g();
        j();
        BroadcastManagerUtil.c(this.m, this.i, new IntentFilter("com.huawei.bone.action.CONNECTION_STATE_CHANGED"), LocalBroadcast.f36595c, null);
    }

    private void j() {
        try {
            AGConnectServicesConfig aGConnectServicesConfigFromContext = AGConnectServicesConfig.fromContext(BaseApplication.getContext());
            LogUtil.a("MLASR_Manager", "initMlKitEngine start init apiKey.");
            MLApplication.initialize(BaseApplication.getContext());
            MLApplication.getInstance().setApiKey(aGConnectServicesConfigFromContext.getString(AgConnectInfo.AgConnectKey.API_KEY));
        } catch (Exception e2) {
            LogUtil.j("MLASR_Manager", "initMlKitEngine failed ; Exception :" + ExceptionUtils.c(e2));
            xjt.aa("initMlKitEngine failed");
        }
    }

    private void h() {
        if (!ScreenUtil.d()) {
            PowerKitManager.a().b("HwVoiceKitManager", 512, "user-VoiceKit");
        }
        if (!lqs.e(this.m)) {
            ReleaseLogUtil.e("R_HwVoiceKitManager", "init mlkit but network is off");
            nae.d(2);
        } else {
            NetworkKit.init(BaseApplication.getContext(), new NetworkKit.Callback() { // from class: mzv.11
                @Override // com.huawei.hms.network.NetworkKit.Callback
                public void onResult(boolean z) {
                    LogUtil.a("MLASR_Manager", "network result: ", Boolean.valueOf(z));
                }
            });
            this.au = new SpeechRecognizerManager(new SpeechRecognizerManager.onResultsReady() { // from class: mzv.4
                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwmlkitmgr.SpeechRecognizerManager.onResultsReady
                public void onStartListening() {
                    mzv.this.aa = true;
                    LogUtil.a("MLASR_Manager", "init mlkit service success");
                    nae.d(1);
                    mzv.this.x();
                }

                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwmlkitmgr.SpeechRecognizerManager.onResultsReady
                public void onResults(ArrayList<String> arrayList) {
                    if (arrayList == null || arrayList.size() <= 0) {
                        LogUtil.j("MLASR_Manager", "SpeechRecognizerManager onResults empty");
                    } else {
                        LogUtil.a("MLASR_Manager", "SpeechRecognizerManager onResults: ", arrayList.get(0));
                        nae.b(arrayList.get(0), -1);
                    }
                }

                @Override // com.huawei.hwdevice.phoneprocess.mgr.hwmlkitmgr.SpeechRecognizerManager.onResultsReady
                public void onError(int i) {
                    xjt.aa("mSpeechManager onError");
                    mzv.this.aa = false;
                    if (i == 11202) {
                        nae.d(2);
                    } else {
                        nae.d(255);
                    }
                    if (mzv.this.au != null) {
                        mzv.this.au.a();
                    }
                    PowerKitManager.a().a("HwVoiceKitManager", 512, "user-VoiceKit");
                }
            }, this.an);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        synchronized (f42773a) {
            List<String> list = this.ak;
            if (list != null) {
                list.clear();
            }
        }
        ThreadPoolManager.c().a("MlKitManagerWriteAudio", new Runnable() { // from class: mzv.5
            @Override // java.lang.Runnable
            public void run() {
                while (mzv.this.aa) {
                    mzv.this.ae();
                }
            }
        });
    }

    private void g() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: mzv.2
            @Override // java.lang.Runnable
            public void run() {
                mzv.this.x = ddr.e();
                mzv.this.x.initHiAiEngine();
            }
        });
    }

    private void l() {
        String strD = lon.c().d("domain_smarthome_scope");
        LogUtil.a("HwVoiceKitManager", "scopeUrl: ", strD);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.j("HwVoiceKitManager", "initSignClient scopeUrl isEmpty");
            return;
        }
        HuaweiIdAuthParamsHelper huaweiIdAuthParamsHelper = new HuaweiIdAuthParamsHelper(HuaweiIdAuthParams.DEFAULT_AUTH_REQUEST_PARAM);
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(new Scope(strD + "/auth/smarthome/skill"));
        arrayList.add(new Scope(strD + "/auth/smarthome/devices"));
        this.at = HuaweiIdAuthManager.getService(this.m, huaweiIdAuthParamsHelper.setAuthorizationCode().setShippingAddress().setScopeList(arrayList).setAccessToken().setUid().createParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        LogUtil.a("HwVoiceKitManager", "mKitRecognizeListener onInit");
        this.w = System.currentTimeMillis();
        this.o.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i, String str) {
        LogUtil.e("HwVoiceKitManager", "processOnError errorCode:", Integer.valueOf(i), " errorMessage:", str);
        nae.d(i == 1 ? 2 : 255);
    }

    private void u() {
        nae.b("", 1);
        if (this.ad && CommonUtil.bh()) {
            this.ao.c();
            this.ax = "";
            this.bc = "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        String strAb = SharedPerferenceUtils.ab(this.m);
        LogUtil.a("HwVoiceKitManager", "voiceUuid: ", strAb);
        if (this.u != null) {
            npr.c(16);
            this.ah = true;
            this.u.sendEmptyMessage(12, 5000L);
        }
        this.x.updateSwitch(AuthorizationUtils.c(this.m));
        this.x.initKitRecognizeEngine(strAb, this.n, this.aj);
        if (this.ac) {
            this.x.initKitTtsEngine(this.am);
        }
    }

    private void e(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.ba = String.format(Locale.ENGLISH, "{\"events\":[{\"header\":{\"name\":\"HuaweiAT\",\"namespace\":\"System\"},\"payload\":{\"uid\":\"%s\",\"huaweiAT\":\"%s\"}}]}", str, str2);
            ReleaseLogUtil.d("R_HwVoiceKitManager", "updateVoiceEvents");
        }
        b(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.av = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"name\":\"HuaweiAT\",\"namespace\":\"System\"},\"payload\":{\"uid\":\"%s\",\"huaweiAT\":\"%s\"}}]}", str, str2);
        ReleaseLogUtil.d("R_HwVoiceKitManager", "updateVoiceContext");
    }

    public static mzv d() {
        mzv mzvVar;
        synchronized (e) {
            if (g == null) {
                g = new mzv(BaseApplication.getContext());
            }
            mzvVar = g;
        }
        return mzvVar;
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public Integer getModuleId() {
        return 49;
    }

    private void r() {
        this.af = false;
        this.ai = false;
        this.ab = false;
        this.ay = "";
        this.aw = null;
        synchronized (d) {
            this.f.clear();
        }
    }

    private void v() {
        LogUtil.a("HwVoiceKitManager", "startVoiceKit");
        s();
        r();
        if (this.x != null) {
            this.x.startRecognize(nab.d(this.m, this.an), this.av, this.z ? "opus" : "pcm");
            if (this.ac) {
                nae.c(1);
                return;
            }
            return;
        }
        LogUtil.j("HwVoiceKitManager", "startVoiceKit but voice client is null");
    }

    private void s() {
        this.u.removeMessages(1);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.u.sendMessage(messageObtain, 60000L);
    }

    @Override // com.huawei.hwdevice.phoneprocess.binder.ParserInterface
    public void getResult(DeviceInfo deviceInfo, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 2) {
            LogUtil.j("HwVoiceKitManager", "onResponse error data.");
            return;
        }
        String strE = eeq.e(bArr);
        if (strE == null || strE.length() <= 4) {
            LogUtil.j("HwVoiceKitManager", "stringInfo length too short");
            return;
        }
        try {
            String strSubstring = strE.substring(4);
            List<eew> listE = new eet().b(strSubstring).e();
            byte b2 = bArr[1];
            if (b2 == 2) {
                LogUtil.a("HwVoiceKitManager", "getResult() the commandId is: ", Integer.valueOf(b2));
            } else {
                ReleaseLogUtil.d("R_HwVoiceKitManager", "getResult() the commandId is: ", Integer.valueOf(b2));
                LogUtil.a("HwVoiceKitManager", "getResult() message : ", strSubstring);
            }
            if (njy.e(listE)) {
                LogUtil.j("HwVoiceKitManager", Integer.valueOf(b2), ": tlvList is null");
                return;
            }
            if (b2 == 1) {
                a(listE);
                return;
            }
            if (b2 == 2) {
                d(listE);
                return;
            }
            if (b2 == 7) {
                c(listE);
            } else if (b2 != 8) {
                LogUtil.j("HwVoiceKitManager", "Invalid command: ", Integer.valueOf(b2));
            } else {
                b(listE);
            }
        } catch (eeu unused) {
            LogUtil.e("HwVoiceKitManager", "TlvException");
            xjt.ao("TlvException");
        }
    }

    private void a(List<eew> list) {
        this.z = false;
        this.ac = false;
        this.q = 0;
        this.an = ProfileRequestConstants.X_LANGUAGE_VALUE;
        nab.a(-1);
        int i = 0;
        for (eew eewVar : list) {
            int iA = lsk.a(eewVar.b(), 16);
            int iA2 = lsk.a(eewVar.e(), 16);
            if (iA2 == 1) {
                i = iA;
            } else if (iA2 == 3) {
                this.z = iA == 1;
            } else if (iA2 == 6) {
                this.ac = iA == 1;
            } else if (iA2 == 7) {
                this.q = iA;
            } else if (iA2 != 9) {
                if (iA2 == 10) {
                    nab.a(iA);
                    LogUtil.a("HwVoiceKitManager", "handleInitMassage deviceAIVolume:", Integer.valueOf(nab.a()));
                } else {
                    LogUtil.j("HwVoiceKitManager", "Invalid init types");
                }
            } else if (i == 1 || i == 3) {
                String strD = eeq.d(eewVar.b());
                this.an = strD;
                LogUtil.a("HwVoiceKitManager", "handleInitMassage mLanguage:", strD);
            }
        }
        this.t = i;
        d(i);
    }

    private void d(List<eew> list) {
        for (eew eewVar : list) {
            int iA = lsk.a(eewVar.e(), 16);
            if (iA == 1) {
                int iA2 = lsk.a(eewVar.b(), 16);
                LogUtil.a("HwVoiceKitManager", "audio message number: ", Integer.valueOf(iA2));
                if (iA2 == 0 && this.t == 1) {
                    v();
                }
            } else if (iA == 2) {
                if (this.x == null) {
                    LogUtil.j("HwVoiceKitManager", "WRITE_AUDIO_MODULE_CONTENT but voice client is null");
                    return;
                }
                synchronized (f42773a) {
                    if (this.aa) {
                        this.ak.add(eewVar.b());
                    }
                }
                synchronized (d) {
                    if (this.ai) {
                        this.f.add(eewVar.b());
                    }
                }
            } else if (iA == 3) {
                LogUtil.a("HwVoiceKitManager", "useMlKit: ", Integer.valueOf(lsk.a(eewVar.b(), 16)));
            } else {
                LogUtil.j("HwVoiceKitManager", "Invalid init types.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        ThreadPoolManager.c().a("VoiceKitManagerWriteAudio", new Runnable() { // from class: mzv.3
            @Override // java.lang.Runnable
            public void run() {
                while (mzv.this.ai) {
                    mzv.this.ac();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac() {
        if (this.x == null || this.f.size() <= 0) {
            return;
        }
        synchronized (d) {
            byte[] bArrC = !this.f.isEmpty() ? eeq.c(this.f.get(0)) : null;
            if (bArrC != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.obj = bArrC;
                this.u.sendMessage(messageObtain);
                this.f.remove(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ae() {
        if (this.au == null || this.ak.size() <= 0) {
            return;
        }
        synchronized (d) {
            byte[] bArrC = !this.ak.isEmpty() ? eeq.c(this.ak.get(0)) : null;
            if (bArrC != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 13;
                messageObtain.obj = bArrC;
                boolean z = true;
                if (this.ak.size() != 1) {
                    z = false;
                }
                this.h = z;
                this.u.sendMessage(messageObtain);
                this.ak.remove(0);
            }
        }
    }

    private void c(List<eew> list) {
        for (eew eewVar : list) {
            int iA = lsk.a(eewVar.e(), 16);
            if (iA == 1) {
                h(eeq.d(eewVar.b()));
            } else if (iA == 2) {
                this.af = false;
                this.ab = true;
                ad();
            } else {
                LogUtil.j("HwVoiceKitManager", "handleResultCode Invalid type");
            }
        }
    }

    private void b(List<eew> list) throws Throwable {
        for (eew eewVar : list) {
            int iA = lsk.a(eewVar.e(), 16);
            if (iA == 1) {
                c(lsk.a(eewVar.b(), 16));
            } else if (iA == 3) {
                a(lsk.a(eeq.d(eewVar.b()), 10));
            } else {
                LogUtil.j("HwVoiceKitManager", "handleWatchInfoQuery Invalid type");
            }
        }
    }

    private void c(int i) throws Throwable {
        String[] strArrSplit = "none-pause-running-Ring".split(Constants.LINK);
        if (i >= strArrSplit.length) {
            LogUtil.j("HwVoiceKitManager", "updateTimerStatus timerStatus error:", Integer.valueOf(i));
            return;
        }
        if (this.aw == null) {
            LogUtil.j("HwVoiceKitManager", "updateTimerStatus mTimerStateCondition is null");
            return;
        }
        String str = strArrSplit[i];
        String str2 = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"name\":\"TimerInfoUpload\",\"namespace\":\"Timer\"},\"payload\":{\"curTimerStatus\":\"%s\"}}]}", str);
        LogUtil.a("HwVoiceKitManager", "updateTimerStatus timerStatusContext:", str2);
        ddr ddrVar = this.x;
        if (ddrVar != null) {
            ddrVar.updateVoiceContext(str2);
        }
        for (int i2 = 0; i2 < this.aw.length(); i2++) {
            if (str.equals(this.aw.optString(i2))) {
                String strReplace = this.ay.replace("TimerInfoQuery", "");
                this.ay = strReplace;
                f(strReplace);
                return;
            }
        }
    }

    private void a(int i) {
        if (i < 0 || i > 100) {
            LogUtil.j("HwVoiceKitManager", "updateVolumeValue volumeValue error:", Integer.valueOf(i));
            return;
        }
        LogUtil.a("HwVoiceKitManager", "updateVolumeValue volume value:", Integer.valueOf(i));
        if (this.ap == null) {
            LogUtil.j("HwVoiceKitManager", "updateVolumeValue mResponsesList is null");
            return;
        }
        for (int i2 = 0; i2 < this.ap.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = this.ap.optJSONObject(i2);
            b(jSONObjectOptJSONObject.optJSONObject("commandUserInteractionDisplayText"), i);
            b(jSONObjectOptJSONObject.optJSONObject("commandUserInteractionSpeak"), i);
        }
        this.l.countDown();
    }

    private void b(JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            LogUtil.j("HwVoiceKitManager", "updateResponseVolume textJson is null");
            return;
        }
        try {
            jSONObject.put("text", jSONObject.optString("text").replace("#{afterVolume}", String.valueOf(i)));
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager", "updateResponseVolume JSONException, responseVolume update failed");
            xjt.ao("updateResponseVolume JSONException, responseVolume update failed");
        }
    }

    private void h(String str) {
        if (this.ap == null) {
            LogUtil.j("HwVoiceKitManager", "handleResultCode mResponsesList is null");
            return;
        }
        LogUtil.a("HwVoiceKitManager", "matchResultText resultCode: ", str);
        for (int i = 0; i < this.ap.length(); i++) {
            JSONObject jSONObjectOptJSONObject = this.ap.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optString("resultCode").equals(str)) {
                String strOptString = jSONObjectOptJSONObject.optString("ttsText");
                if (!TextUtils.isEmpty(strOptString)) {
                    b(strOptString, true, "");
                } else if (this.ae) {
                    b(jSONObjectOptJSONObject);
                } else {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("commandUserInteractionSpeak");
                    if (jSONObjectOptJSONObject2 != null) {
                        b(jSONObjectOptJSONObject2.optString("text"), false, "");
                    }
                    JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("commandUserInteractionDisplayText");
                    if (jSONObjectOptJSONObject3 != null) {
                        nae.c(this.p, jSONObjectOptJSONObject3.optString("text"));
                        this.p = "";
                    }
                }
            }
        }
    }

    private void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            LogUtil.j("HwVoiceKitManager", "displayWatchInfo jsonObject is null!");
            return;
        }
        LogUtil.a("HwVoiceKitManager", "displayWatchInfo");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("commandUserInteractionSpeak");
        String strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("text") : "";
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("commandUserInteractionDisplayText");
        String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("text") : "";
        if (strOptString.contains("#{afterVolume}") || strOptString2.contains("#{afterVolume}")) {
            Boolean boolValueOf = false;
            try {
                LogUtil.a("HwVoiceKitManager", "matchResultText mCountDownLatch count is ", Long.valueOf(this.l.getCount()));
                boolValueOf = Boolean.valueOf(this.l.await(1200L, TimeUnit.MILLISECONDS));
            } catch (InterruptedException unused) {
                LogUtil.j("HwVoiceKitManager", "matchResultText mCountDownLatch InterruptedException");
                xjt.ao("matchResultText mCountDownLatch InterruptedException");
            }
            if (!boolValueOf.booleanValue()) {
                LogUtil.j("HwVoiceKitManager", "matchResultText watchInfo update failed");
                return;
            } else {
                strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("text") : "";
                strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("text") : "";
            }
        }
        if (!TextUtils.isEmpty(strOptString)) {
            b(strOptString, false, "");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            return;
        }
        nae.c(this.p, strOptString2);
        this.p = "";
    }

    private void b(String str, boolean z, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwVoiceKitManager", "processTts ttsText isEmpty");
            return;
        }
        LogUtil.a("HwVoiceKitManager", "processTts ttsText:", str, " , isSendText:", Boolean.valueOf(z), ", mIsInitTtsSuccess:", Boolean.valueOf(this.ad));
        if (z) {
            nae.c("", nab.e(str));
        }
        if (this.ad) {
            int iD = this.ao.d();
            LogUtil.a("HwVoiceKitManager", "scoConnectState:", Integer.valueOf(iD));
            this.ax = str;
            this.bc = str2;
            if (iD == 12 && this.ao.e()) {
                this.u.sendEmptyMessage(4, 1200L);
            }
        }
    }

    private void d(int i) {
        if (i == 1) {
            if (!CommonUtil.at() && !CommonUtil.bd()) {
                LogUtil.j("HwVoiceKitManager", "system less than emui10.");
            }
            if (this.x == null) {
                LogUtil.j("HwVoiceKitManager", "handleVoiceKit mHiAiEngineProxy is null");
                nae.d(255);
                return;
            }
            c();
            this.y = 0;
            this.ad = false;
            y();
            b();
            s();
            if (!this.x.isPluginAvaiable()) {
                LogUtil.a("HwVoiceKitManager", "load HiAi plug");
                t();
                this.x.b(this.v);
                return;
            } else {
                j(n() ? "HONOR" : "HUAWEI");
                f();
                return;
            }
        }
        if (i == 2) {
            this.ab = true;
            ad();
            b();
            PowerKitManager.a().a("HwVoiceKitManager", 512, "user-VoiceKit");
            return;
        }
        if (i == 3) {
            h();
            return;
        }
        if (i != 4) {
            if (i != 5) {
                LogUtil.j("HwVoiceKitManager", "Invalid action.");
                return;
            } else {
                i();
                return;
            }
        }
        this.aa = false;
        SpeechRecognizerManager speechRecognizerManager = this.au;
        if (speechRecognizerManager != null) {
            speechRecognizerManager.a();
        }
        PowerKitManager.a().a("HwVoiceKitManager", 512, "user-VoiceKit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (!ScreenUtil.d()) {
            PowerKitManager.a().b("HwVoiceKitManager", 512, "user-VoiceKit");
        }
        String strA = nab.a("37-1037-2037");
        String strA2 = nab.a("38-1038-2038");
        LogUtil.a("HwVoiceKitManager", "handleVoiceKit mLanguage:", this.an);
        Intent intent = new Intent();
        intent.putExtra("authAk", strA);
        intent.putExtra("authSk", strA2);
        if (!this.an.equals(ProfileRequestConstants.X_LANGUAGE_VALUE)) {
            LogUtil.a("HwVoiceKitManager", "overseas get conutry code is ", this.n);
            intent.putExtra("IssueCountry.countryCode", this.n);
            this.x.initServiceRoute();
        }
        this.x.createKit(this.m, intent, this.an, this.r);
        nab.d(-1);
    }

    private void c() {
        LogUtil.a("HwVoiceKitManager", "enter getCountryCode");
        String commonCountryCode = GRSManager.c(this.m).getCommonCountryCode();
        this.n = commonCountryCode;
        LogUtil.a("HwVoiceKitManager", "getCountryCode mCountryCode:", commonCountryCode);
    }

    private boolean i(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.optJSONObject("header") == null || jSONObject.optJSONObject(Constants.CA_PAYLOAD) == null) {
            return true;
        }
        return TextUtils.isEmpty(jSONObject.optJSONObject("header").optString("name"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(String str) throws Throwable {
        JSONArray jSONArrayB = b(str);
        if (jSONArrayB == null) {
            return;
        }
        this.ae = false;
        this.s = null;
        this.p = null;
        JSONObject jSONObjectE = null;
        for (int i = 0; i < jSONArrayB.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayB.optJSONObject(i);
            if (!i(jSONObjectOptJSONObject)) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("header");
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject(Constants.CA_PAYLOAD);
                String strOptString = jSONObjectOptJSONObject2.optString("name");
                ReleaseLogUtil.d("R_HwVoiceKitManager", "processOnResult getName: ", strOptString);
                if ("DisplayText".equals(strOptString)) {
                    this.s = jSONObjectOptJSONObject3.optString("text");
                } else if ("DisplayASR".equals(strOptString)) {
                    this.p = jSONObjectOptJSONObject3.optString("text");
                    if (this.q < 1 && !this.ag) {
                        this.s = "我不太理解你的意思，再给我一点时间学习吧。";
                        break;
                    }
                } else if (("DisplayHWCardData".equals(strOptString) && "UserInteraction".equals(jSONObjectOptJSONObject2.optString(e.j))) || "DisplayHWCard".equals(strOptString)) {
                    nab.c(jSONObjectOptJSONObject3, this.p, this.s);
                    this.p = null;
                    this.s = null;
                } else if ("CallCapabilityValidation".equals(strOptString) || "CallHistoryUpload".equals(strOptString) || "TimerInfoQuery".equals(strOptString)) {
                    if (d(strOptString, jSONObjectOptJSONObject3)) {
                        this.ay = str;
                        return;
                    }
                } else if ("StartRecord".equals(strOptString)) {
                    this.af = true;
                } else if ("Speak".equals(strOptString)) {
                    this.s = b(this.s, jSONObjectOptJSONObject3);
                } else if ("DialogFinished".equals(strOptString)) {
                    a(str);
                } else {
                    jSONObjectE = e(jSONObjectOptJSONObject2, jSONObjectOptJSONObject3);
                }
            }
        }
        b(this.s, this.p, jSONObjectE, str);
    }

    private String b(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("text");
        String strOptString2 = jSONObject.optString("language");
        if (strOptString.contains("#{contactName} #{phoneNumber}")) {
            str = i(strOptString);
            strOptString = str;
        }
        b(strOptString, false, strOptString2);
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        if (this.ai) {
            ReleaseLogUtil.d("R_HwVoiceKitManager", "toStopSpeech");
            this.ai = false;
            u();
        }
    }

    private boolean d(String str, JSONObject jSONObject) throws Throwable {
        boolean zC = false;
        if (!this.ag) {
            return false;
        }
        if ("CallCapabilityValidation".equals(str)) {
            zC = o(jSONObject);
        } else if ("CallHistoryUpload".equals(str)) {
            zC = aa();
        } else if ("TimerInfoQuery".equals(str)) {
            zC = g(jSONObject);
        } else if ("checkVolume".equals(str)) {
            zC = c(jSONObject);
        } else {
            LogUtil.j("HwVoiceKitManager", "isReturnForResult other name");
        }
        LogUtil.a("HwVoiceKitManager", "isReturnForResult name:", str, ", isReturn:", Boolean.valueOf(zC));
        return zC;
    }

    private boolean c(JSONObject jSONObject) {
        try {
            nae.a(new JSONObject("{\"Exercise\":\"0\",\"Ringtone\":\"1\",\"Hivoice\":\"2\",\"Media\":\"1\"}").optString(jSONObject.optString("streamType")));
            this.ae = true;
            this.l = new CountDownLatch(1);
            return true;
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager", "isCheckVolumeValue JSONException");
            xjt.ao("isCheckVolumeValue JSONException");
            return false;
        }
    }

    private boolean g(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("uploadFlag");
        if (iOptInt == 1) {
            this.aw = jSONObject.optJSONArray("timerStateCondition");
            nae.d();
        }
        return iOptInt == 1;
    }

    private String i(String str) {
        mzy.a aVar = this.k;
        if (aVar == null) {
            return str;
        }
        String strC = aVar.c();
        String strD = this.k.d();
        if (!str.contains("contactName")) {
            return str;
        }
        return str.replace("#{contactName} #{phoneNumber}", strC + " " + strD);
    }

    private void b(String str, String str2, JSONObject jSONObject, String str3) throws Throwable {
        int i;
        this.u.removeMessages(1);
        LogUtil.a("HwVoiceKitManager", "processOnResult displayAsr:", str2, ", displayText:", str, ", apiJsonObject:", Boolean.valueOf(jSONObject == null));
        if (jSONObject == null) {
            nae.c(nab.c(str2), nab.e(str));
        }
        a(jSONObject, str3);
        q();
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str) && (i = this.aq) != 0) {
            if (i == 1) {
                this.aq = 255;
            }
            nae.d(this.aq);
            this.ab = true;
        }
    }

    private JSONArray b(String str) {
        JSONObject jSONObject;
        if (!d(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                LogUtil.e("HwVoiceKitManager", "processOnResult JSONException");
                xjt.ao("processOnResult JSONException");
                jSONObject = null;
            }
            if (jSONObject != null) {
                return jSONObject.optJSONArray("directives");
            }
        }
        return null;
    }

    private JSONArray e(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwVoiceKitManager", "checkVoiceResponse voiceResponse is null or empty");
            return null;
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager", "getContextsList JSONException");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray("contexts");
    }

    private JSONObject e(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString = jSONObject.optString("name");
        try {
            if ("API".equals(strOptString)) {
                return jSONObject2.optJSONObject("callParams");
            }
            if (!"OpenApp".equals(strOptString) && !"ExitApp".equals(strOptString) && !"AlarmCreate".equals(strOptString) && !"MediaControl".equals(strOptString)) {
                if ("OpenCallHistory".equals(strOptString)) {
                    if (jSONObject2 != null) {
                        jSONObject2.put("commandCode", 10);
                        return jSONObject2;
                    }
                } else if ("ContactSelect".equals(strOptString)) {
                    if (jSONObject2 != null) {
                        jSONObject2.put("commandCode", 11);
                        return jSONObject2;
                    }
                } else {
                    if (!"VoiceCall".equals(strOptString)) {
                        if ("RedialVoiceCall".equals(strOptString)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("commandCode", 12);
                            mzy.a aVar = this.k;
                            if (aVar != null) {
                                jSONObject3.put("contactName", aVar.c());
                                jSONObject3.put("phoneNumber", this.k.d());
                            }
                            return jSONObject3;
                        }
                        return d(jSONObject, jSONObject2);
                    }
                    if (jSONObject2 != null) {
                        jSONObject2.put("commandCode", 12);
                        return jSONObject2;
                    }
                }
            }
            return jSONObject2;
        } catch (JSONException unused) {
            LogUtil.j("HwVoiceKitManager", "processJumpResult JSONException");
            xjt.ao("processJumpResult JSONException");
            return null;
        }
    }

    private JSONObject d(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String strOptString = jSONObject.optString("name");
        return ((!"DisplayHWCardData".equals(strOptString) || "UserInteraction".equals(jSONObject.optString(e.j))) && !"MediaCardData".equals(strOptString)) ? a(jSONObject, jSONObject2) : jSONObject2;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        byte b2;
        JSONObject jSONObject3;
        String strOptString = jSONObject.optString("name");
        strOptString.hashCode();
        int i = -1;
        switch (strOptString) {
            case "TimerPause":
                b2 = 0;
                break;
            case "TimerReset":
                b2 = 1;
                break;
            case "TimerRestart":
                b2 = 2;
                break;
            case "TimerCreate":
                b2 = 3;
                break;
            case "TimerResume":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                i = 4;
            } else if (b2 == 2) {
                i = 5;
            } else if (b2 == 3) {
                jSONObject3 = jSONObject2;
                i = 1;
            } else if (b2 != 4) {
                jSONObject3 = null;
            } else {
                jSONObject3 = jSONObject2;
                i = 3;
            }
            jSONObject3 = jSONObject2;
        } else {
            jSONObject3 = jSONObject2;
            i = 2;
        }
        if (jSONObject3 != null) {
            jSONObject3.put("commandCode", 13);
            jSONObject3.put("timerCode", i);
            return jSONObject3;
        }
        return g(jSONObject, jSONObject2);
    }

    private JSONObject g(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString = jSONObject.optString("name");
        if ("GetPosition".equals(strOptString)) {
            k();
            return null;
        }
        if ("UnlockScreen".equals(strOptString)) {
            m(jSONObject2);
            return null;
        }
        if ("RequestHuaweiAT".equals(strOptString)) {
            z();
            return null;
        }
        if ("Messenger".equals(strOptString)) {
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("callParams");
            try {
                jSONObjectOptJSONObject.put("responses", jSONObject2.optJSONArray("responses"));
            } catch (JSONException unused) {
                LogUtil.e("HwVoiceKitManager", "processUpdateResult JSONException");
                jSONObjectOptJSONObject = null;
            }
            if (jSONObjectOptJSONObject != null) {
                return c(jSONObjectOptJSONObject, jSONObject2);
            }
            return null;
        }
        if ("ExeNativeSkill".equals(strOptString)) {
            return j(jSONObject2);
        }
        LogUtil.j("HwVoiceKitManager", "processUpdateResult Invalid payload name: ", strOptString);
        return null;
    }

    private JSONObject c(JSONObject jSONObject, JSONObject jSONObject2) {
        byte b2;
        String strOptString = jSONObject.optString("functionName");
        strOptString.hashCode();
        int i = -1;
        int i2 = 0;
        int i3 = 2;
        int i4 = 1;
        switch (strOptString) {
            case "turnOnNodisturb":
                b2 = 0;
                break;
            case "turnOffNodisturb":
                b2 = 1;
                break;
            case "turnOnSleepScene":
                b2 = 2;
                break;
            case "turnOffSleepScene":
                b2 = 3;
                break;
            case "turnOnQuietMode":
                b2 = 4;
                break;
            case "turnOffQuietMode":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                i3 = 1;
            } else if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 != 4) {
                        if (b2 != 5) {
                            jSONObject = null;
                        }
                    }
                    i2 = i3;
                } else {
                    jSONObject = jSONObject;
                    i = 0;
                }
                i2 = i;
                i4 = i2;
            } else {
                jSONObject = jSONObject;
            }
            i4 = 0;
            i2 = i3;
        } else {
            jSONObject = jSONObject;
            i2 = 1;
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("commandCode", 14);
                jSONObject.put("settingItem", i2);
                jSONObject.put("optCode", i4);
                return jSONObject;
            } catch (JSONException unused) {
                LogUtil.e("HwVoiceKitManager", "processSystemSetting JSONException");
                return null;
            }
        }
        return h(jSONObject, jSONObject2);
    }

    private JSONObject j(JSONObject jSONObject) {
        int i;
        String strOptString = jSONObject.optString("type");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(e.n);
        if ("shutdown".equals(strOptString)) {
            i = 2;
        } else if ("reboot".equals(strOptString)) {
            i = 3;
        } else {
            i = -1;
            jSONObjectOptJSONObject = null;
        }
        if (jSONObjectOptJSONObject == null) {
            return jSONObjectOptJSONObject;
        }
        try {
            jSONObjectOptJSONObject.put("commandCode", 14);
            jSONObjectOptJSONObject.put("settingItem", 3);
            jSONObjectOptJSONObject.put("optCode", i);
            b(this.s, false, "");
            nae.c(this.p, this.s);
            return jSONObjectOptJSONObject;
        } catch (JSONException unused) {
            LogUtil.e("HwVoiceKitManager", "processShutdownReboot JSONException");
            xjt.ao("processShutdownReboot JSONException");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    private JSONObject h(JSONObject jSONObject, JSONObject jSONObject2) {
        byte b2;
        JSONObject jSONObject3;
        String strOptString = jSONObject.optString("functionName");
        strOptString.hashCode();
        int iHashCode = strOptString.hashCode();
        int i = 0;
        if (iHashCode != -1936123207) {
            if (iHashCode != 670514716) {
                if (iHashCode == 1118722354 && strOptString.equals("turnUpVolume")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strOptString.equals("setVolume")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strOptString.equals("turnDownVolume")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            jSONObject3 = jSONObject;
            i = 1;
        } else if (b2 == 1) {
            jSONObject3 = jSONObject;
            i = 2;
        } else if (b2 != 2) {
            jSONObject3 = null;
            i = -1;
        } else {
            jSONObject3 = jSONObject;
        }
        if (jSONObject3 != null) {
            try {
                jSONObject3.put("commandCode", 15);
                jSONObject3.put("optType", i);
                return jSONObject3;
            } catch (JSONException unused) {
                LogUtil.e("HwVoiceKitManager", "processVolumeSetting JSONException");
                xjt.ao("processVolumeSetting JSONException");
                return null;
            }
        }
        return b(jSONObject, jSONObject2);
    }

    private JSONObject b(JSONObject jSONObject, JSONObject jSONObject2) {
        String strOptString = jSONObject.optString("functionName");
        if ("checkVolume".equals(strOptString)) {
            if (d(strOptString, jSONObject)) {
                this.ap = jSONObject2.optJSONArray("responses");
            }
            return new JSONObject();
        }
        LogUtil.j("HwVoiceKitManager", "processCheckVolume Invalid payload name: ", strOptString);
        return null;
    }

    private boolean d(String str) {
        this.ag = true;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HwVoiceKitManager", "checkVoiceResponse is null");
            return true;
        }
        LogUtil.j("HwVoiceKitManager", "checkVoiceResponse voiceResponse: ", str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("directives");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                this.aq = jSONObject.optInt("errorCode");
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("contexts");
                if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0) {
                    this.ag = nab.d(jSONArrayOptJSONArray2, this.q, this.o);
                    return false;
                }
                LogUtil.j("HwVoiceKitManager", "checkVoiceResponse contextsList is null");
                return false;
            }
            LogUtil.j("HwVoiceKitManager", "checkVoiceResponse directivesList is null");
            return true;
        } catch (JSONException unused) {
            LogUtil.j("HwVoiceKitManager", "checkVoiceResponse JSONException");
            return true;
        }
    }

    private boolean o(JSONObject jSONObject) {
        if (!jSONObject.optBoolean("errorReturnCode") && EnvironmentInfo.k() && !m()) {
            LogUtil.a("HwVoiceKitManager", "not need updateCallCapability");
        } else {
            String str = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"name\":\"CallCapability\",\"namespace\":\"System\"},\"payload\":{\"simCardStatus\":%b,\"flightModeStatus\":%b}}]}", Boolean.valueOf(EnvironmentInfo.k()), Boolean.valueOf(!m()));
            LogUtil.a("HwVoiceKitManager", "simContext: ", str);
            ddr ddrVar = this.x;
            if (ddrVar != null) {
                ddrVar.updateVoiceContext(str);
            }
        }
        return !EnvironmentInfo.k() || m();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:26:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    private boolean aa() throws Throwable {
        String string;
        Cursor cursorQuery;
        String str;
        ddr ddrVar;
        String string2 = "";
        boolean z = false;
        Cursor cursor = null;
        mzy.a aVar = null;
        try {
            cursorQuery = this.m.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"name", "number", "type"}, "(type = ? or type = ? or type = ? or type = ? )and subscription_component_name = ?", new String[]{String.valueOf(1), String.valueOf(3), String.valueOf(5), String.valueOf(2), "com.android.phone/com.android.services.telephony.TelephonyConnectionService"}, "date DESC");
            if (cursorQuery == null) {
                string = "";
            } else {
                try {
                    try {
                        if (cursorQuery.getCount() <= 0 || !cursorQuery.moveToFirst()) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(cursorQuery.getColumnIndex("name"));
                            if (string == null) {
                                string = "";
                            }
                            try {
                                string2 = cursorQuery.getString(cursorQuery.getColumnIndex("number"));
                            } catch (SQLException unused) {
                                LogUtil.e("HwVoiceKitManager", "getCallHistory Exception");
                                if (cursorQuery != null) {
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    aVar = new mzy.a();
                                    aVar.c(string);
                                    aVar.a(string2);
                                    z = true;
                                }
                                str = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"name\":\"CallHistory\",\"namespace\":\"System\"},\"payload\":{\"contactName\":\"%s\",\"callHistoryExists\":%b}}]}", string, Boolean.valueOf(z));
                                LogUtil.a("HwVoiceKitManager", "updateCallHistory historyContext:", str);
                                ddrVar = this.x;
                                if (ddrVar != null) {
                                    ddrVar.updateVoiceContext(str);
                                }
                                this.k = aVar;
                                return !z;
                            }
                        }
                    } catch (SQLException unused2) {
                        string = "";
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (SQLException unused3) {
            string = "";
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (!TextUtils.isEmpty(string2)) {
            aVar = new mzy.a();
            aVar.c(string);
            aVar.a(string2);
            z = true;
        }
        str = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"name\":\"CallHistory\",\"namespace\":\"System\"},\"payload\":{\"contactName\":\"%s\",\"callHistoryExists\":%b}}]}", string, Boolean.valueOf(z));
        LogUtil.a("HwVoiceKitManager", "updateCallHistory historyContext:", str);
        ddrVar = this.x;
        if (ddrVar != null) {
            ddrVar.updateVoiceContext(str);
        }
        this.k = aVar;
        return !z;
    }

    private boolean m() {
        return Settings.System.getInt(this.m.getContentResolver(), "airplane_mode_on", 0) == 1;
    }

    private void z() {
        String str = this.av;
        if (TextUtils.isEmpty(str)) {
            y();
            str = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"name\":\"HuaweiAT\",\"namespace\":\"System\"},\"payload\":{\"uid\":\"%s\",\"huaweiAT\":\"%s\"}}]}", "", "");
        }
        ddr ddrVar = this.x;
        if (ddrVar != null) {
            ddrVar.updateVoiceContext(str);
        }
    }

    private void m(JSONObject jSONObject) {
        boolean zOptBoolean = jSONObject.optBoolean("needSuccessResponse");
        ddr ddrVar = this.x;
        if (ddrVar == null || !zOptBoolean) {
            return;
        }
        ddrVar.updateVoiceContext("{\"header\":{\"namespace\":\"System\",\"name\":\"ClientContext\"},\"payload\":{\"screenLockerStatus\":false}}");
    }

    private void k() {
        double d2;
        double d3;
        if (this.x == null) {
            return;
        }
        int i = 1;
        if (mwb.b(this.m)) {
            if (lsg.d(this.m, f42774b)) {
                String lngAndLat = this.x.getLngAndLat(this.m);
                if (TextUtils.isEmpty(lngAndLat)) {
                    i = 3;
                } else {
                    String[] strArrSplit = lngAndLat.split(",");
                    if (strArrSplit.length != 2) {
                        LogUtil.j("HwVoiceKitManager", "processLocation can not get locations");
                        return;
                    }
                    try {
                        i = 0;
                        d2 = Double.parseDouble(strArrSplit[0]);
                        d3 = Double.parseDouble(strArrSplit[1]);
                    } catch (NumberFormatException unused) {
                        LogUtil.e("HwVoiceKitManager", "processLocation NumberFormatException");
                        xjt.ao("processLocation NumberFormatException");
                        return;
                    }
                }
            } else {
                i = 2;
            }
            d2 = 0.0d;
            d3 = 0.0d;
        } else {
            d2 = 0.0d;
            d3 = 0.0d;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00", new DecimalFormatSymbols(Locale.US));
        String str = String.format(Locale.ENGLISH, "{\"contexts\":[{\"header\":{\"namespace\":\"GeoInformation\",\"name\":\"PositionInfo\"},\"payload\":{\"position\":{\"longitude\":\"%s\",\"latitude\":\"%s\",\"locationSystem\":\"WGS84\"},\"errorCode\":%d}}]}", decimalFormat.format(d2), decimalFormat.format(d3), Integer.valueOf(i));
        LogUtil.a("HwVoiceKitManager", "processLocation voiceContext:", str);
        this.x.updateVoiceContext(str);
    }

    private void q() {
        ddr ddrVar = this.x;
        if (ddrVar == null) {
            LogUtil.j("HwVoiceKitManager", "sendStartRecord mHiAiEngineProxy is null");
            return;
        }
        if (ddrVar.isSpeaking() || !this.af) {
            LogUtil.j("HwVoiceKitManager", "sendStartRecord isSpeaking or mIsStartRecord is false");
        } else {
            if (this.ac && this.ad) {
                return;
            }
            LogUtil.a("HwVoiceKitManager", "sendStartRecord sendEmptyMessageDelayed");
            this.u.sendEmptyMessage(5, 500L);
        }
    }

    private void d(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cardParams");
        if (jSONObjectOptJSONObject == null) {
            LogUtil.j("HwVoiceKitManager", "getDeepLink cardParams is null");
            return;
        }
        if (!CommonUtil.bg()) {
            LogUtil.a("HwVoiceKitManager", "not huawei system, so return");
            nae.c(null, nab.e(this.m.getResources().getString(R.string.IDS_not_support_this_feature)));
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("directive");
        if (jSONObjectOptJSONObject2 == null) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("items");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                LogUtil.j("HwVoiceKitManager", "getDeepLink directive is null");
                return;
            } else {
                b(jSONArrayOptJSONArray);
                return;
            }
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("deepLink");
        if (jSONObjectOptJSONObject3 == null) {
            LogUtil.j("HwVoiceKitManager", "getDeepLink deepLinkObject is null");
            return;
        }
        String strOptString = jSONObjectOptJSONObject3.optString("appPackage");
        String strOptString2 = jSONObjectOptJSONObject3.optString("url");
        String strOptString3 = jSONObjectOptJSONObject3.optString("appName");
        String strOptString4 = jSONObjectOptJSONObject3.optString("action");
        String strOptString5 = jSONObjectOptJSONObject3.optString("version");
        mzw mzwVar = new mzw();
        mzwVar.a(strOptString2);
        mzwVar.b(strOptString3);
        mzwVar.e(strOptString);
        mzwVar.c(strOptString5);
        mzwVar.d(strOptString4);
        nab.d(jSONObjectOptJSONObject3, mzwVar);
        nab.d(this.m, mzwVar);
    }

    private void b(JSONArray jSONArray) {
        LogUtil.a("HwVoiceKitManager", "Enter processOverseaMusic");
        JSONArray jSONArrayOptJSONArray = jSONArray.optJSONObject(0).optJSONArray("interaction");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
            LogUtil.j("HwVoiceKitManager", "processOverseaMusic interactionList is null");
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("callParams");
        if (jSONObjectOptJSONObject2 == null) {
            LogUtil.j("HwVoiceKitManager", "processOverseaMusic callParams is null");
            return;
        }
        String strOptString = jSONObjectOptJSONObject.optString("appPackage");
        this.al = strOptString;
        if (TextUtils.isEmpty(strOptString)) {
            LogUtil.j("HwVoiceKitManager", "processOverseaMusic appPackage is null");
            return;
        }
        if (!nab.d(this.al)) {
            LogUtil.j("HwVoiceKitManager", "processOverseaMusic get backup music package");
            String strB = nab.b(jSONObjectOptJSONObject);
            if (TextUtils.isEmpty(strB)) {
                LogUtil.j("HwVoiceKitManager", "processOverseaMusic backupPackage not in system");
                return;
            }
            this.al = strB;
        }
        a(jSONObjectOptJSONObject2);
    }

    private void a(JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setPackage(this.al);
        String strOptString = jSONObject.optString("action");
        if (!TextUtils.isEmpty(strOptString)) {
            intent.setAction(strOptString);
            intent.addFlags(32);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(e.n);
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString2 = jSONObjectOptJSONObject.optString(MedalConstants.EVENT_KEY);
                    String strOptString3 = jSONObjectOptJSONObject.optString("value");
                    if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3)) {
                        intent.putExtra(strOptString2, strOptString3);
                    }
                }
            }
        }
        LogUtil.a("HwVoiceKitManager", "processOverseaMusic intent:", intent);
        this.m.sendOrderedBroadcast(intent, "com.android.mediacenter.permission.INTERACTION", this.ar, null, 0, null, null);
        nab.e(this.m, this.al);
    }

    private void a(JSONObject jSONObject, String str) throws Throwable {
        if (jSONObject == null || jSONObject.length() == 0) {
            LogUtil.a("HwVoiceKitManager", "processApiCallParams jsonObject is empty");
            return;
        }
        LogUtil.a("HwVoiceKitManager", "processApiCallParams CallParams: ", jSONObject.toString());
        this.ap = jSONObject.optJSONArray("responses");
        mzy mzyVar = new mzy();
        String strOptString = jSONObject.optString("commandCode");
        if (TextUtils.isEmpty(strOptString)) {
            if (jSONObject.optJSONObject("cardParams") != null) {
                d(jSONObject);
                return;
            }
            String strOptString2 = jSONObject.optString(AwarenessRequest.Field.COMMAND);
            if (TextUtils.isEmpty(strOptString2)) {
                strOptString2 = "";
            }
            HwControlLocalAppHelper.d(strOptString2);
            return;
        }
        mzyVar.d(strOptString);
        String strOptString3 = jSONObject.optString("appName");
        if (!TextUtils.isEmpty(strOptString3)) {
            mzyVar.c(strOptString3);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("dictionary");
        if (jSONObjectOptJSONObject != null) {
            mzyVar.b(jSONObjectOptJSONObject);
        }
        if (this.q < 1) {
            try {
                mzyVar.b(new JSONObject("{\"闹钟\":\"2\",\"支付宝|Alipay\":\"1\"}"));
                mzyVar.c(new JSONObject("{\"running\":\"1\",\"cycling\":\"3\",\"walking\":\"2\"}"));
            } catch (JSONException unused) {
                LogUtil.e("HwVoiceKitManager", "processApiCallParams JSONException");
                xjt.ao("processApiCallParams JSONException");
            }
        }
        String strOptString4 = jSONObject.optString("repeat");
        if (!TextUtils.isEmpty(strOptString4)) {
            mzyVar.o(strOptString4);
        }
        String strOptString5 = jSONObject.optString("time");
        if (!TextUtils.isEmpty(strOptString5)) {
            mzyVar.n(strOptString5);
        }
        this.o.a(jSONObject, mzyVar, c(str));
    }

    private boolean c(String str) {
        JSONArray jSONArrayE = e(str);
        if (jSONArrayE == null || jSONArrayE.length() == 0) {
            LogUtil.a("HwVoiceKitManager", "isMarathonSports contexts is null or empty");
            return false;
        }
        for (int i = 0; i < jSONArrayE.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayE.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && h(jSONObjectOptJSONObject) && f(jSONObjectOptJSONObject) && e(jSONObjectOptJSONObject)) {
                LogUtil.a("HwVoiceKitManager", "isMarathonSports is true");
                return true;
            }
        }
        return false;
    }

    private static boolean h(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        return jSONObjectOptJSONObject != null && "NLPRecognizer".equals(jSONObjectOptJSONObject.optString("name"));
    }

    private static boolean f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(Constants.CA_PAYLOAD);
        return jSONObjectOptJSONObject != null && "START_SPORT".equals(jSONObjectOptJSONObject.optString("intentName"));
    }

    private static boolean e(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        JSONArray jSONArrayOptJSONArray3;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(Constants.CA_PAYLOAD);
        if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("finalNluResult")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("intentions")) != null && jSONArrayOptJSONArray.length() != 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject3.optJSONArray("slots")) != null && jSONArrayOptJSONArray2.length() != 0) {
                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                        JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i2);
                        if (jSONObjectOptJSONObject4 != null && (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject4.optJSONArray("distanceType")) != null && jSONArrayOptJSONArray3.length() != 0 && d(jSONArrayOptJSONArray3)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean d(JSONArray jSONArray) {
        JSONObject jSONObjectOptJSONObject;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("value")) != null && "marathon".equals(jSONObjectOptJSONObject.optString("normalValue"))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        if (!CommonUtil.bg()) {
            e(LoginInit.getInstance(this.m).getAccountInfo(1011), LoginInit.getInstance(this.m).getAccountInfo(1015));
            return;
        }
        HuaweiIdAuthService huaweiIdAuthService = this.at;
        if (huaweiIdAuthService == null) {
            LogUtil.j("HwVoiceKitManager", "silentSignIn mSignInClient is null");
            l();
        } else {
            this.av = "";
            huaweiIdAuthService.silentSignIn().addOnSuccessListener(new OnSuccessListener<AuthHuaweiId>() { // from class: mzv.6
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public void onSuccess(AuthHuaweiId authHuaweiId) {
                    if (authHuaweiId == null) {
                        ReleaseLogUtil.e("R_HwVoiceKitManager", "signInHuaweiId is null");
                        return;
                    }
                    String uid = authHuaweiId.getUid();
                    String accessToken = authHuaweiId.getAccessToken();
                    ReleaseLogUtil.d("R_HwVoiceKitManager", "silentSignIn onSuccess");
                    mzv.this.b(uid, accessToken);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: mzv.10
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public void onFailure(Exception exc) {
                    if (exc == null) {
                        LogUtil.j("HwVoiceKitManager", "exception is null");
                        return;
                    }
                    LogUtil.j("HwVoiceKitManager", "silentSignIn onFailure", exc.getMessage());
                    Activity activity = BaseApplication.getActivity();
                    if (activity != null && mzv.this.at.getSignInIntent() != null) {
                        activity.startActivityForResult(mzv.this.at.getSignInIntent(), 1003);
                    }
                    mzv.q(mzv.this);
                    if (mzv.this.y <= 2) {
                        mzv.this.y();
                    } else {
                        LogUtil.j("HwVoiceKitManager", "silentSignIn max retry times");
                    }
                    if (exc instanceof ApiException) {
                        LogUtil.j("HwVoiceKitManager", "silent sign in fail, status: ", Integer.valueOf(((ApiException) exc).getStatusCode()));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        if (this.x == null) {
            return;
        }
        LogUtil.a("HwVoiceKitManager", "stopSpeak isScoOn:", Boolean.valueOf(this.ao.e()), ", isSpeaking:", Boolean.valueOf(this.x.isSpeaking()), ", phoneAIVolume:", Integer.valueOf(nab.b()));
        if (this.x.isSpeaking()) {
            this.x.stopSpeak();
        }
        this.x.cancelSpeak();
        nab.e(nab.b());
        nab.d(-1);
        this.ao.a();
        if (this.ac && !this.ai) {
            nae.c(2);
        }
        if (this.af) {
            this.u.sendEmptyMessage(5);
        }
        this.ax = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ddr ddrVar = this.x;
        if (ddrVar == null) {
            LogUtil.j("HwVoiceKitManager", "breakLinkVoice mHiAiEngineProxy is null");
            return;
        }
        boolean zIsDestroyKit = ddrVar.isDestroyKit();
        LogUtil.a("HwVoiceKitManager", "breakLinkVoice isDestroy: ", Boolean.valueOf(zIsDestroyKit));
        if (zIsDestroyKit) {
            this.ai = false;
            this.k = null;
            nab.d(-1);
            LogUtil.a("HwVoiceKitManager", "breakLinkVoice!");
            this.ao.a();
            this.u.removeMessages(1);
            ThreadPoolManager.c().d("VoiceKitManagerWriteAudio", (Runnable) null);
            this.o.a((System.currentTimeMillis() - this.w) / 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        this.ax = "";
        if (this.x == null || TextUtils.isEmpty(str) || this.x.isSpeaking()) {
            this.bc = "";
            LogUtil.j("HwVoiceKitManager", "toSpeak return");
            return;
        }
        if (this.ai) {
            LogUtil.j("HwVoiceKitManager", "toSpeak mIsPrepareSuccess is true");
            this.bc = "";
            ad();
            return;
        }
        LogUtil.a("HwVoiceKitManager", "toSpeak isScoOn:", Boolean.valueOf(this.ao.e()));
        Intent intent = new Intent();
        if (!mtz.b(this.bc) && !this.an.equals(ProfileRequestConstants.X_LANGUAGE_VALUE)) {
            LogUtil.j("HwVoiceKitManager", "toSpeak the tanslate language is :", this.bc);
            intent.putExtra("language", this.bc);
            this.bc = "";
        }
        nab.d(nab.e());
        nab.e(nab.a());
        this.x.textToSpeak(str, intent);
    }

    private void t() {
        LogUtil.a("HwVoiceKitManager", "enter sendCheckHiAiPluginMessage");
        this.u.removeMessages(10);
        Message messageObtain = Message.obtain();
        messageObtain.what = 10;
        this.u.sendMessage(messageObtain, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.x.isPluginAvaiable()) {
            return;
        }
        nab.d();
    }

    @Override // com.huawei.hwbasemgr.HwBaseManager
    public void onDestroy() {
        super.onDestroy();
        ad();
        SpeechRecognizerManager speechRecognizerManager = this.au;
        if (speechRecognizerManager != null) {
            speechRecognizerManager.a();
        }
        try {
            Context context = this.m;
            if (context != null) {
                context.unregisterReceiver(this.i);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("HwVoiceKitManager", "mConnectStateChangedReceiver is not registered");
        }
        if (this.ah) {
            npr.e(16);
            this.ah = false;
        }
        a();
        LogUtil.a("HwVoiceKitManager", "onDestroy");
    }

    private void a() {
        ExtendHandler extendHandler = this.u;
        if (extendHandler != null) {
            extendHandler.quit(false);
            this.u = null;
        }
    }

    private void a(String str) {
        this.k = null;
        this.o.c(str);
    }

    class a implements Handler.Callback {
        private a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                LogUtil.j("HwVoiceKitManager", "handleMessage PROCESSING_TIMEOUT");
                mzv.this.ad();
                mzv.this.b();
                return true;
            }
            if (i == 10) {
                mzv.this.e();
                return true;
            }
            if (i == 4) {
                if (!TextUtils.isEmpty(mzv.this.ax) && CommonUtil.bh()) {
                    mzv mzvVar = mzv.this;
                    mzvVar.g(mzvVar.ax);
                }
                return true;
            }
            if (i == 5) {
                if (mzv.this.af) {
                    nae.c(3);
                    mzv.this.af = false;
                }
                return true;
            }
            if (i == 7) {
                if (message.obj instanceof byte[]) {
                    mzv.this.x.writeAudio((byte[]) message.obj);
                }
                return true;
            }
            if (i == 8) {
                mzv.this.ad();
                return true;
            }
            if (i == 12) {
                npr.e(16);
                mzv.this.ah = false;
                return true;
            }
            if (i == 13) {
                if (message.obj instanceof byte[]) {
                    LogUtil.a("HwVoiceKitManager", "handleMessage receiveVoiceStream.");
                    mzv.this.au.c((byte[]) message.obj, false);
                }
                return true;
            }
            LogUtil.j("HwVoiceKitManager", "handleMessage Invalid type: ", Integer.valueOf(message.what));
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwVoiceKitManager", "deviceInfo is null.");
        } else if (deviceInfo.getDeviceConnectState() == 2 && AppBundle.c().isBundleModule("PluginHiAiEngine") && !ddr.e().isPluginAvaiable()) {
            LogUtil.a("HwVoiceKitManager", "trigger load HiAiPluging download");
            ddr.e().b(null);
        }
    }

    private static boolean n() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwVoiceKitManager");
        if (!njy.e(deviceList)) {
            DeviceInfo deviceInfo = deviceList.get(0);
            if (deviceInfo == null) {
                LogUtil.a("HwVoiceKitManager", "isHonorDevice deviceInfo is null");
                return false;
            }
            for (int i : f42775c) {
                if (i == deviceInfo.getProductType()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void j(String str) {
        try {
            Class<?> cls = Class.forName("com.huawei.hiassistant.platform.base.util.PropertyUtil");
            Field declaredField = cls.getDeclaredField("MANUFACTURER");
            declaredField.setAccessible(true);
            declaredField.set(null, str);
            LogUtil.a("HwVoiceKitManager", "setManufacturer : " + declaredField.get("MANUFACTURER"));
            declaredField.setAccessible(false);
            Field declaredField2 = cls.getDeclaredField("BRAND");
            declaredField2.setAccessible(true);
            declaredField2.set(null, str);
            LogUtil.a("HwVoiceKitManager", "setBrand : " + declaredField2.get("BRAND"));
            declaredField2.setAccessible(false);
        } catch (ClassNotFoundException unused) {
            LogUtil.e("HwVoiceKitManager", "setManufacturer ClassNotFoundException");
        } catch (Exception e2) {
            LogUtil.e("HwVoiceKitManager", "setManufacturer exception", e2.getMessage());
        }
    }
}
