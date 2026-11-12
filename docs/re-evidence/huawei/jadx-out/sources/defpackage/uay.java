package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import com.huawei.hwsmartinteractmgr.data.SmartMsgDbObject;
import com.huawei.syncmgr.SyncOption;
import com.huawei.ui.commonui.base.CommonUiBaseResponse;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepTotalData;
import com.huawei.ui.main.stories.recommendcloud.data.SleepRecommendData;
import com.huawei.ui.main.stories.recommendcloud.util.RecommendControl;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.Utils;
import java.lang.ref.WeakReference;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
public class uay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f49872a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f49873b = null;
    private static boolean d = false;
    private static uay e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f49874c;
    private ujk g;
    private Date h;
    private RecommendControl k;
    private String n;
    private wvf p;
    private boolean i = false;
    private int o = -1;
    private boolean l = false;
    private int[] m = {SmartMsgConstant.MSG_TYPE_SLEEP_SERVICE_CORE_SLEEP_RECOMMEND, 80000};
    private boolean j = false;
    private final Handler s = new Handler() { // from class: uay.5
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            uay.this.g();
        }
    };
    private final BroadcastReceiver f = new BroadcastReceiver() { // from class: uay.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null || intent.getIntExtra("refresh_type", -1) != 0) {
                return;
            }
            LogUtil.d("TimeEat_SleepRefreshDataInteator", "BroadcastReceiver: requestSuggestData ");
            uay.this.e();
        }
    };

    private uay(Context context) throws Throwable {
        CommonUtil.u("TimeEat_SleepRefreshDataInteatorEnter SleepRefreshDataInteator");
        f49873b = context;
        i();
        this.p = wvf.e();
        this.g = new ujk();
        this.h = ltb.b();
        n();
        RecommendControl recommendControlNewInstance = RecommendControl.newInstance(f49873b);
        this.k = recommendControlNewInstance;
        recommendControlNewInstance.initCoreSleepTagConfig();
        CommonUtil.u("TimeEat_SleepRefreshDataInteatorLeave SleepRefreshDataInteator");
    }

    private void i() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: uax
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            });
        }
    }

    /* synthetic */ void b() {
        String url = GRSManager.c(f49873b).getUrl("messageCenterUrl");
        this.n = url;
        LogUtil.d("TimeEat_SleepRefreshDataInteator", "initHostFromGrs mMessageCenterHost = ", url);
    }

    public static uay d() {
        uay uayVar;
        synchronized (uay.class) {
            if (e == null) {
                e = new uay(BaseApplication.getContext());
            }
            uayVar = e;
        }
        return uayVar;
    }

    private static boolean l() {
        return d;
    }

    private static void a(boolean z) {
        d = z;
    }

    private static boolean h() {
        return f49872a;
    }

    private static void c(boolean z) {
        f49872a = z;
    }

    public void a() {
        Date date = this.h;
        if (date != null) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "START:requestDatas(), mCurrentDay = ", ltb.v(date));
            long jM = ltb.m(this.h);
            ujk ujkVar = this.g;
            if (ujkVar != null) {
                ujkVar.b(jM, 1, new CommonUiBaseResponse() { // from class: uaw
                    @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
                    public final void onResponse(int i, Object obj) {
                        this.f49871b.a(i, obj);
                    }
                });
                return;
            } else {
                LogUtil.e("R_Sleep_TimeEat_SleepRefreshDataInteator", "mInteractor = null");
                return;
            }
        }
        LogUtil.e("R_Sleep_TimeEat_SleepRefreshDataInteator", "mCurrentDay = null");
    }

    /* synthetic */ void a(int i, Object obj) {
        int iJ = this.g.j();
        int iK = this.g.k();
        int iE = this.g.e();
        double dM = this.g.m();
        boolean z = false;
        boolean z2 = iJ > 0 && iK > 0;
        if (iE == 0 && dM == 1.0d) {
            z = true;
        }
        if (z2 && z) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "fallTime: ", Integer.valueOf(iJ), ", wakeupTime: ", Integer.valueOf(iK));
        } else {
            c(this.h);
        }
    }

    private void c(Date date) {
        ujk ujkVar = this.g;
        if (ujkVar == null) {
            return;
        }
        ujkVar.e(date, 7, new CommonUiBaseResponse() { // from class: uav
            @Override // com.huawei.ui.commonui.base.CommonUiBaseResponse
            public final void onResponse(int i, Object obj) throws Throwable {
                this.f49870b.c(i, obj);
            }
        });
    }

    /* synthetic */ void c(int i, Object obj) throws Throwable {
        LogUtil.a("R_Sleep_TimeEat_SleepRefreshDataInteator", "requestSuggestData errCode = ", Integer.valueOf(i));
        if (i == 0 && obj != null && (obj instanceof CoreSleepTotalData)) {
            LogUtil.d("TimeEat_SleepRefreshDataInteator", "onResponse success objData = ", obj.toString());
            SleepRecommendData sleepRecommendDataD = d(((CoreSleepTotalData) obj).getAdNum0() + "");
            if (sleepRecommendDataD == null) {
                LogUtil.a("R_Sleep_TimeEat_SleepRefreshDataInteator", "requestSuggestData error code", Integer.valueOf(i), ", no suggest");
                return;
            }
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "Category: ", sleepRecommendDataD.getCategory());
            if (!"1".equals(sleepRecommendDataD.getCategory())) {
                LogUtil.a("R_Sleep_TimeEat_SleepRefreshDataInteator", "requestSuggestData error code", Integer.valueOf(i), ", not music service");
                return;
            }
            String title = sleepRecommendDataD.getTitle();
            String url = sleepRecommendDataD.getUrl();
            String description = sleepRecommendDataD.getDescription();
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "jumpWebTitle: ", title, ", jumpWebUrl: ", url);
            nsv.e(f49873b).d(80000);
            if (TextUtils.isEmpty(this.k.getSmartCardCoreSleepTime())) {
                return;
            }
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "getSmartCardCoreSleepTime: ", this.k.getSmartCardCoreSleepTime());
            a(new String[]{description, title, url, this.k.getSmartCardCoreSleepTime()}, SmartMsgConstant.MSG_TYPE_SLEEP_SERVICE_CORE_SLEEP_RECOMMEND, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.p.g()) {
            a();
            if (TextUtils.isEmpty(this.n)) {
                LogUtil.e("R_Sleep_TimeEat_SleepRefreshDataInteator", "createSmartCard mMessageCenterHost is empty");
                return;
            }
            a(new String[]{f49873b.getString(R.string.IDS_fitness_core_sleep_sleep_questionnaire), "", this.n + "/messageH5/sleephtml/QuestionnaireFrontpage.html", SmartMsgConstant.DEFAULT_SHOW_TIME}, SmartMsgConstant.MSG_TYPE_SLEEP_SERVICE_CORE_SLEEP_SLEEP_QUESTIONNAIRE, 5, System.currentTimeMillis(), System.currentTimeMillis());
        }
    }

    public void e() {
        if (Utils.m()) {
            return;
        }
        if (TextUtils.isEmpty(this.n)) {
            i();
            new Handler(BaseApplication.getContext().getMainLooper()).post(new Runnable() { // from class: uau
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.j();
                }
            });
        } else {
            j();
        }
    }

    private void a(String[] strArr, int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jR = lsl.r(jCurrentTimeMillis);
        boolean z = jCurrentTimeMillis - this.p.f() <= 86400000;
        boolean z2 = jCurrentTimeMillis - lsl.a(jCurrentTimeMillis, 20, 0) > 0;
        if (!z) {
            this.l = false;
        }
        LogUtil.a("R_Sleep_TimeEat_SleepRefreshDataInteator", "!isToday: ", Boolean.valueOf(!z), ", isNeedSmartCard: ", Boolean.valueOf(z2), ", !mIsTodayShow: ", Boolean.valueOf(!this.l));
        if (z2) {
            if (i == 80001) {
                if (z || this.l) {
                    return;
                }
                LogUtil.a("TimeEat_SleepRefreshDataInteator", "create jingzhun Card and insert message");
                a(strArr, i, i2, jCurrentTimeMillis, jR);
                this.l = true;
                return;
            }
            if (d(jCurrentTimeMillis)) {
                LogUtil.a("TimeEat_SleepRefreshDataInteator", "create normal card and insert message");
                a(strArr, i, i2, jCurrentTimeMillis, jR);
            } else {
                LogUtil.a("TimeEat_SleepRefreshDataInteator", "today created normal smart card");
            }
        }
    }

    private void a(String[] strArr, int i, int i2, long j, long j2) {
        SmartMsgDbObject smartMsgDbObject = new SmartMsgDbObject();
        smartMsgDbObject.setMsgType(i);
        smartMsgDbObject.setMsgSrc(8);
        smartMsgDbObject.setMsgContentType(2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("content", strArr[1]);
            jSONObject.put(SmartMsgConstant.MSG_CONTENT_SLEEP_TITLE, strArr[0]);
            jSONObject.put(SmartMsgConstant.MSG_CONTENT_MESSAGE_CENTER_DETAIL_URL, strArr[2]);
            jSONObject.put("createTime", j);
        } catch (JSONException e2) {
            LogUtil.e("TimeEat_SleepRefreshDataInteator", "JSONException exception = ", e2.getMessage());
        }
        smartMsgDbObject.setMsgContent(jSONObject.toString());
        smartMsgDbObject.setShowMethod(SmartMsgConstant.SHOW_METHOD_SMART_CARD);
        smartMsgDbObject.setShowTime(strArr[3]);
        smartMsgDbObject.setStatus(1);
        smartMsgDbObject.setMessagePriority(i2);
        f();
        nsv.e(f49873b).e(smartMsgDbObject);
        if (i == 80004) {
            this.p.e(false);
        } else {
            this.p.b(j2);
            this.p.b(false);
        }
    }

    private boolean d(long j) {
        return this.p.b() || !(((j - this.p.f()) > 86400000L ? 1 : ((j - this.p.f()) == 86400000L ? 0 : -1)) <= 0);
    }

    private void f() {
        for (int i : this.m) {
            nsv.e(f49873b).d(i);
        }
    }

    private SleepRecommendData d(String str) throws Throwable {
        SleepRecommendData sleepRecommendData = RecommendControl.newInstance(f49873b).getSleepRecommendData(str);
        if (sleepRecommendData != null) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "sleepRecommendData :", sleepRecommendData);
            return sleepRecommendData;
        }
        LogUtil.j("TimeEat_SleepRefreshDataInteator", "sleepRecommendData is null ");
        return null;
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final WeakReference<uay> f49876c;

        b(uay uayVar) {
            this.f49876c = new WeakReference<>(uayVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            uay uayVar = this.f49876c.get();
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "errcode is ", Integer.valueOf(i), "objData ", obj != null ? obj.toString() : null);
            if (uayVar != null) {
                uayVar.e(i, obj);
            } else {
                LogUtil.j("TimeEat_SleepRefreshDataInteator", " CoreSleepResponseCallback sleepCardData = null");
            }
        }
    }

    public boolean c() {
        return this.j;
    }

    public void c(boolean z, boolean z2) {
        DeviceInfo deviceInfoC = mgg.c("TimeEat_SleepRefreshDataInteator");
        if (deviceInfoC == null) {
            deviceInfoC = mgi.c("TimeEat_SleepRefreshDataInteator");
        }
        if (deviceInfoC == null) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "current is no device,don't do sync data.");
            qqk.c().d(100);
            this.j = false;
            d(1010);
            return;
        }
        if (deviceInfoC.getDeviceConnectState() != 2) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "current device is disconnect,don't sync data from device.");
            qqk.c().d(100);
            this.j = false;
            d(1010);
            return;
        }
        DeviceInfo deviceInfoC2 = mgi.c("TimeEat_SleepRefreshDataInteator");
        if (deviceInfoC2 != null && deviceInfoC2.getDeviceConnectState() == 2) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "current device is aw70,don't sync data from device.");
            qqk.c().d(100);
            this.j = true;
            d(1010);
            return;
        }
        if (deviceInfoC.getDeviceConnectState() == 2 && (eej.c() == null || !eej.c().isDeviceSupportCoreSleep())) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "current device is not support coreSleep.");
            qqk.c().d(100);
            this.j = true;
            d(1010);
            return;
        }
        this.j = true;
        c(z);
        a(z2);
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "enter refreshDayData isCoreSleep:", Boolean.valueOf(z));
        t();
    }

    private void t() {
        qqk.c().d(0);
        if (this.f49874c == null) {
            this.f49874c = new b(this);
        }
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "ui startSynCoreSleep");
        qec.e().startSynCoreSleep(SyncOption.builder().d(true).c("isUiInterface", "uiInterface").c(), this.f49874c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, Object obj) {
        if (i == 0) {
            p();
            return;
        }
        if (i == 10000) {
            o();
            return;
        }
        if (i == 20000) {
            c(obj);
            return;
        }
        if (i == 22000) {
            k();
            return;
        }
        if (i != 30002) {
            switch (i) {
                case 21000:
                    m();
                    break;
                case 21001:
                case 21002:
                case 21003:
                case 21004:
                case 21005:
                    b(i);
                    break;
                case 21006:
                    a(i);
                    break;
                default:
                    qqk.c().d(100);
                    LogUtil.a("TimeEat_SleepRefreshDataInteator", "core sleep sync cpc error = ", Integer.valueOf(i), ",mIsCoreSleep = ", Boolean.valueOf(h()));
                    d(1009);
                    break;
            }
            return;
        }
        q();
    }

    private void q() {
        this.s.removeMessages(1);
        if (this.f49874c == null) {
            this.f49874c = new b(this);
        }
        this.i = true;
        d(1008);
    }

    private void a(int i) {
        this.s.removeMessages(1);
        this.s.sendEmptyMessage(1);
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "core sleep sync cpc error = ", Integer.valueOf(i));
        d(1007);
    }

    private void b(int i) {
        if (!l()) {
            this.s.removeMessages(1);
            this.s.sendEmptyMessage(1);
        }
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "doCoreSleepSyncActionByError errorCode = ", Integer.valueOf(i));
        d(1006);
    }

    private void m() {
        if (mgg.c("TimeEat_SleepRefreshDataInteator") != null || l()) {
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "setSyncNotConnected mLastSyncCode = ", Integer.valueOf(this.o));
            if (this.o < 100) {
                this.o = -1;
                this.s.removeMessages(1);
                this.s.sendEmptyMessage(1);
            }
        } else {
            LogUtil.j("TimeEat_SleepRefreshDataInteator", "deviceInfo == null");
            qqk.c().d(100);
        }
        d(1005);
    }

    private void c(Object obj) {
        if (this.s.hasMessages(1)) {
            this.s.removeMessages(1);
        }
        int iN = CommonUtil.n(f49873b, obj == null ? "0" : obj.toString());
        this.o = iN;
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "setSleepProgress mLastSyncCode = ", Integer.valueOf(iN));
        d(1004);
    }

    private void o() {
        if (!l()) {
            this.s.removeMessages(1);
            this.s.sendEmptyMessage(1);
        }
        d(1003);
    }

    private void k() {
        this.s.removeMessages(1);
        this.s.sendEmptyMessage(1);
        d(1002);
    }

    private void p() {
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "setSyncSuccess");
        this.s.removeMessages(1);
        d(1001);
    }

    private void d(int i) {
        Intent intent = new Intent();
        intent.setAction("action_send_core_sleep_sync_rate");
        intent.putExtra("core_sleep_sync_status", i);
        BroadcastManagerUtil.a(f49873b, intent);
        if (i == 1008 || i == 1004) {
            return;
        }
        qqk.c().d(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        LogUtil.a("TimeEat_SleepRefreshDataInteator", "handleWhenSyncTimeOut() loadingAnimation.stop()");
        Intent intent = new Intent();
        intent.setAction("action_send_core_sleep_sync_rate");
        intent.putExtra("core_sleep_sync_rate_key", 100);
        BroadcastManagerUtil.a(f49873b, intent);
    }

    private void n() {
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        if (localBroadcastManager == null) {
            LogUtil.j("TimeEat_SleepRefreshDataInteator", "mHiBroadcasetReceiver registe fail");
        } else {
            localBroadcastManager.registerReceiver(this.f, intentFilter);
            LogUtil.a("TimeEat_SleepRefreshDataInteator", "mHiBroadcasetReceiver registe success");
        }
        LogUtil.d("TimeEat_SleepRefreshDataInteator", "mHiBroadcasetReceiver registe coresleep");
    }
}
