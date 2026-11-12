package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.util.HiBroadcastUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class tbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IBaseResponseCallback f48917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Integer> f48918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f48919c;
    private boolean e = false;
    private boolean d = true;

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        this.f48919c = new c(this);
        this.f48917a = iBaseResponseCallback;
        g();
        f();
        b(0);
    }

    private void f() {
        tuv.c();
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(103);
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new b(this));
    }

    public void a() {
        h();
        if (this.f48918b != null) {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.f48918b, new HiUnSubscribeListener() { // from class: tbg
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.d("StepCardSyncHelper", "unSubscribeSportData isSuccess = ", Boolean.valueOf(z));
                }
            });
        }
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_data_refresh");
        intentFilter.addAction("com.huawei.hihealth.action_sync_total_sport_data");
        intentFilter.addAction("com.huawei.hihealth.action_sync");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.f48919c, intentFilter);
        this.e = true;
        LogUtil.d("StepCardSyncHelper", "mHiBroadcastReceiver register");
    }

    private void h() {
        if (this.f48919c == null || !this.e) {
            return;
        }
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f48919c);
            LogUtil.d("StepCardSyncHelper", "mHiBroadcastReceiver unregister");
        } catch (IllegalArgumentException unused) {
            LogUtil.d("StepCardSyncHelper", "IllegalArgumentException mHiBroadcastReceiver unregister");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e() {
        SharedPreferenceManager.c(Integer.toString(10000), "step_achieved_show_time", 0L);
        SharedPreferenceManager.c(Integer.toString(10000), "intensity_achieved_show_time", 0L);
        SharedPreferenceManager.c(Integer.toString(10000), "active_achieved_show_time", 0L);
        SharedPreferenceManager.c(Integer.toString(10000), "achieved_show_time", 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (i == 2 || i == 3) {
            this.d = false;
        }
        if (i == 2) {
            b(0);
            if (TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "first_day_run_record"))) {
                c();
            }
        }
    }

    public void c() {
        HiBroadcastUtil.h(BaseApplication.b());
        HandlerExecutor.c(new Runnable() { // from class: tbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f48945a.b();
            }
        }, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(4);
        hiSyncOption.setSyncDataType(10004);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        LogUtil.a("StepCardSyncHelper", "syncSportData !");
        HiHealthManager.d(BaseApplication.b()).synCloud(hiSyncOption, new HiCommonListener() { // from class: tbc.4
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                LogUtil.a("StepCardSyncHelper", "syncSportData onSuccess!");
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j("StepCardSyncHelper", "syncSportData onFailure!");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        this.f48917a.a(i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        this.f48917a.a(i, str);
    }

    static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final tbc f48921c;

        c(tbc tbcVar) {
            this.f48921c = (tbc) new WeakReference(tbcVar).get();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.e("StepCardSyncHelper", "StepCardData onReceive intent=null");
                return;
            }
            if (this.f48921c == null) {
                ReleaseLogUtil.a("StepCardSyncHelper", "mCallback is null");
                return;
            }
            if ("com.huawei.hihealth.action_data_refresh".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("refresh_type", -1);
                ReleaseLogUtil.d("StepCardSyncHelper", "StepsCard onReceive HiRefreshType ", Integer.valueOf(intExtra));
                if (intExtra == 6) {
                    this.f48921c.b(0);
                    return;
                }
                return;
            }
            if ("com.huawei.hihealth.action_sync_total_sport_data".equals(intent.getAction())) {
                ReleaseLogUtil.d("StepCardSyncHelper", "StepsCard onReceive ACTION_SYNC_TOTAL_SPORT_DATA");
                this.f48921c.b(1);
                return;
            }
            if ("com.huawei.hihealth.action_sync".equals(intent.getAction())) {
                int intExtra2 = intent.getIntExtra("com.huawei.hihealth.action_sync_status", 6);
                ReleaseLogUtil.d("StepCardSyncHelper", "status is ", Integer.valueOf(intExtra2));
                this.f48921c.d(intExtra2);
            } else if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                ReleaseLogUtil.d("StepCardSyncHelper", "StepsCard onReceive logout");
                tbc.e();
                this.f48921c.d = true;
                this.f48921c.b(2);
            }
        }
    }

    static class b implements HiSubscribeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<tbc> f48920b;

        b(tbc tbcVar) {
            this.f48920b = new WeakReference<>(tbcVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            tbc tbcVar = this.f48920b.get();
            if (tbcVar == null) {
                LogUtil.j("StepCardSyncHelper", "onResult logicalStepCounter == null");
            } else {
                if (njy.e(list)) {
                    return;
                }
                ReleaseLogUtil.d("StepCardSyncHelper", "SportDataCallback success");
                tbcVar.f48918b = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("StepCardSyncHelper", "SportIntensityCallback ", hiHealthData == null ? null : hiHealthData.toString(), " type ", Integer.valueOf(i), " client ", hiHealthClient != null ? hiHealthClient.getHuid() : null, "changeKey ", str, " time ", Long.valueOf(j));
            if (i == 103) {
                tbc tbcVar = this.f48920b.get();
                if (tbcVar == null) {
                    LogUtil.j("StepCardSyncHelper", "logicalStepCounter is null");
                } else if ("900200006".equals(str) || "900200008".equals(str) || "900200009".equals(str) || "900200007".equals(str)) {
                    tbcVar.a(3, str);
                }
            }
        }
    }
}
