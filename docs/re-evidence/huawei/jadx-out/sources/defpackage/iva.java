package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.icommon.ISimpleResultCallback;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.login.ui.login.LoginInit;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.HiBroadcastManager;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.LogicalStepCounter;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class iva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f38063a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExtendHandler f38065c;
    private IWXAPI d;
    private e g;
    private d i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ivg f38064b = new ivg();
    private ivg e = new ivg();

    public void e() {
        ReleaseLogUtil.c("R_MmSportSyncManager", " init.");
        ThreadPoolManager.c().execute(new Runnable() { // from class: ivb
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.e.b();
            }
        });
    }

    /* synthetic */ void b() throws Throwable {
        try {
            if (!c()) {
                ReleaseLogUtil.c("R_MmSportSyncManager", "not bind wechat.");
                a();
                return;
            }
            this.f38065c = HandlerCenter.b(new a(this), "MmSportSyncManager");
            d();
            i();
            f();
            j();
        } catch (Exception e2) {
            ReleaseLogUtil.b("R_MmSportSyncManager", "init exception:", LogAnonymous.b(e2));
        }
    }

    public void a() {
        ReleaseLogUtil.c("R_MmSportSyncManager", " onDestroy.");
        ExtendHandler extendHandler = this.f38065c;
        if (extendHandler != null) {
            extendHandler.quit(true);
        }
        if (this.i != null) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "unregister WxSportRefreshReceiver.");
            BaseApplication.b().unregisterReceiver(this.i);
            this.i = null;
        }
        if (this.g != null) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "unregister WxStartReceiver.");
            BaseApplication.b().unregisterReceiver(this.g);
            this.g = null;
        }
        if (this.f38063a != null) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "unregister mStepSyncCloudReceiver.");
            BaseApplication.b().unregisterReceiver(this.f38063a);
            this.f38063a = null;
        }
        IWXAPI iwxapi = this.d;
        if (iwxapi != null) {
            iwxapi.unregisterApp();
        }
    }

    public void e(int i, long j) {
        this.f38064b.b(i);
        this.f38064b.d(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        ReleaseLogUtil.c("R_MmSportSyncManager", "getIwxApi.");
        IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(BaseApplication.b(), null);
        this.d = iwxapiCreateWXAPI;
        boolean zRegisterApp = iwxapiCreateWXAPI.registerApp("wx36bda3d35fbcfd06");
        ivc.d dVarE = ivc.e(BaseApplication.b(), "wx36bda3d35fbcfd06");
        int iD = ivc.d(BaseApplication.b());
        int iB = dVarE.b();
        LogUtil.b("MmSportSyncManager", "isRegister:", Boolean.valueOf(zRegisterApp), "getSportConfig:", Integer.valueOf(iB), " ", dVarE.e() instanceof ivc.e ? Long.valueOf(((ivc.e) dVarE.e()).b()) : "no data", " apiLevel:", Integer.valueOf(iD));
    }

    private void i() {
        if (this.g == null) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "registerWeChartStart.");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ConstantsAPI.ACTION_REFRESH_WXAPP);
            this.g = new e(this.f38065c);
            BroadcastManagerUtil.a(BaseApplication.b(), this.g, intentFilter);
        }
    }

    private void f() {
        if (this.i == null) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "registerWeChartSport.");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP");
            this.i = new d(this.f38065c);
            BroadcastManagerUtil.a(BaseApplication.b(), this.i, intentFilter);
        }
    }

    private void j() {
        if (this.f38063a == null) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "registerStepSyncCloud.");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.hihealth.action_sync_total_sport_data");
            this.f38063a = new b(this.f38065c);
            HiBroadcastManager.e(BaseApplication.b(), this.f38063a, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f38065c.removeMessages(102);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!lsl.c(jCurrentTimeMillis, this.f38064b.e())) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "sync step failed, step is not current day.");
            return;
        }
        if (lsl.c(this.f38064b.e(), this.e.e()) && this.f38064b.c() == this.e.c()) {
            ReleaseLogUtil.c("R_MmSportSyncManager", "step not changed, not need sync.");
            return;
        }
        if (jCurrentTimeMillis - this.e.e() < 300000) {
            long jE = this.e.e();
            this.f38065c.sendEmptyMessage(102, 300000L);
            ReleaseLogUtil.c("R_MmSportSyncManager", "sync step is not pass 5 minute, interval is:", Long.valueOf(jCurrentTimeMillis - jE));
        } else {
            c(ivc.c(BaseApplication.b(), "wx36bda3d35fbcfd06", this.f38064b.e() / 1000, this.f38064b.c()), this.f38064b.c(), System.currentTimeMillis());
            g();
        }
    }

    private void g() {
        LogicalStepCounter.d(BaseApplication.b()).b(new ISimpleResultCallback() { // from class: iva.2
            @Override // com.huawei.health.icommon.ISimpleResultCallback
            public void onSuccess(Bundle bundle) {
                LogUtil.b("MmSportSyncManager", "syncToDBAndCloud succeed");
                HiSyncOption hiSyncOption = new HiSyncOption();
                hiSyncOption.setSyncModel(2);
                hiSyncOption.setSyncAction(1);
                hiSyncOption.setSyncDataType(1);
                hiSyncOption.setSyncMethod(2);
                hiSyncOption.setSyncScope(1);
                HiHealthNativeApi.a(BaseApplication.b()).synCloud(hiSyncOption, null);
            }

            @Override // com.huawei.health.icommon.ISimpleResultCallback
            public void onFailed(Bundle bundle) {
                LogUtil.b("MmSportSyncManager", "syncToDBAndCloud failed");
            }
        });
    }

    private void c(int i, int i2, long j) {
        ReleaseLogUtil.c("R_MmSportSyncManager", "setSportStep:", Integer.valueOf(i), " syncStep:", Integer.valueOf(i2), " syncStepTimestamp:", Long.valueOf(j));
        if (i == 1) {
            this.e.d(j);
            this.e.b(i2);
            return;
        }
        if (i == 3 || i == 9) {
            ReleaseLogUtil.d("R_MmSportSyncManager", "set step failed,not login.");
            this.f38065c.sendEmptyMessage(102, 300000L);
            return;
        }
        switch (i) {
            case 3902:
                ReleaseLogUtil.c("R_MmSportSyncManager", "set step failed, step switch is not open.");
                break;
            case 3903:
                ReleaseLogUtil.d("R_MmSportSyncManager", "set step failed, sync step too much.");
                this.f38065c.sendEmptyMessage(102, 300000L);
                break;
            case 3904:
                ReleaseLogUtil.d("R_MmSportSyncManager", "set step failed, current step count is too many.");
                break;
        }
    }

    static class a implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<iva> f38066b;

        a(iva ivaVar) {
            this.f38066b = new WeakReference<>(ivaVar);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) throws Throwable {
            ReleaseLogUtil.c("R_MmSportSyncManager", "handle message.", Integer.valueOf(message.what));
            WeakReference<iva> weakReference = this.f38066b;
            if (weakReference == null || weakReference.get() == null) {
                return false;
            }
            try {
                if (message.what == 101) {
                    this.f38066b.get().d();
                    return true;
                }
                if (message.what != 102) {
                    return false;
                }
                this.f38066b.get().h();
                return true;
            } catch (Exception e) {
                int i = message.what;
                ReleaseLogUtil.b("R_MmSportSyncManager", "handle message.", Integer.valueOf(i), " exception:", LogAnonymous.b(e));
                return false;
            }
        }
    }

    static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ExtendHandler f38069c;

        e(ExtendHandler extendHandler) {
            this.f38069c = extendHandler;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("MmSportSyncManager", "WxStartReceiver intent == null");
                return;
            }
            ReleaseLogUtil.c("MmSportSyncManager", "receiver we chat start.", intent.getAction());
            if (ConstantsAPI.ACTION_REFRESH_WXAPP.equals(intent.getAction())) {
                this.f38069c.sendEmptyMessage(101, 12000L);
            }
        }
    }

    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ExtendHandler f38068b;

        d(ExtendHandler extendHandler) {
            this.f38068b = extendHandler;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("MmSportSyncManager", "WxSportRefreshReceiver intent == null");
                return;
            }
            ReleaseLogUtil.c("R_MmSportSyncManager", "receiver we chat refresh.", intent.getAction());
            if ("com.tencent.mm.plugin.openapi.Intent.ACTION_SET_SPORT_STEP".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("EXTRA_EXT_OPEN_NOTIFY_TYPE");
                if (TextUtils.isEmpty(stringExtra)) {
                    ReleaseLogUtil.b("R_MmSportSyncManager", "wrong intent extra notifyType");
                    return;
                }
                ReleaseLogUtil.c("R_MmSportSyncManager", "we chat notify.", stringExtra);
                if ("SPORT_MESSAGE".equals(stringExtra)) {
                    this.f38068b.sendEmptyMessage(102);
                }
            }
        }
    }

    static class b extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ExtendHandler f38067b;

        b(ExtendHandler extendHandler) {
            this.f38067b = extendHandler;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("MmSportSyncManager", "StepSyncCloudReceiver intent == null");
                return;
            }
            ReleaseLogUtil.c("R_MmSportSyncManager", "receiver step sync cloud.", intent.getAction());
            if (this.f38067b != null && "com.huawei.hihealth.action_sync_total_sport_data".equals(intent.getAction())) {
                this.f38067b.sendEmptyMessage(102);
            }
        }
    }

    private boolean c() {
        String accountInfo = LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011);
        String str = "BIND_WECHAT_RANK";
        if (!TextUtils.isEmpty(accountInfo)) {
            str = "BIND_WECHAT_RANK" + ckg.b(accountInfo);
        }
        LogUtil.b("MmSportSyncManager", "isBindWeChat key:", str);
        String strB = SharedPreferenceManager.b(Integer.toString(10000), str, "");
        ReleaseLogUtil.c("R_MmSportSyncManager", "isBindWeChat cache:", strB);
        if (TextUtils.isEmpty(strB) || !strB.contains("_")) {
            return false;
        }
        String[] strArrSplit = strB.split("_");
        if (strArrSplit.length != 2) {
            return false;
        }
        return Boolean.parseBoolean(strArrSplit[1]);
    }
}
