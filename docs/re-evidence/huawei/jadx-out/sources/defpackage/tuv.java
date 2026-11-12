package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.application.BroadcastManager;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class tuv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f49686b = new Object();
    private static volatile tuv e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, Integer> f49687a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f49688c;
    private BroadcastReceiver f;
    private List<Integer> j;
    private final CopyOnWriteArrayList<IBaseResponseCallback> i = new CopyOnWriteArrayList<>();
    private int d = 0;

    public static tuv c() {
        if (e == null) {
            synchronized (f49686b) {
                if (e == null) {
                    e = new tuv();
                }
            }
        }
        return e;
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        HashMap<String, Integer> map;
        HashMap<String, Integer> map2;
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.a("SCUI_SportTargetSearchHelper", "callback is null in getActiveGoals");
            return;
        }
        if (this.d == 2 && (map2 = this.f49687a) != null && map2.size() == 4) {
            LogUtil.a("SCUI_SportTargetSearchHelper", "have searched");
            iBaseResponseCallback.a(0, this.f49687a);
            return;
        }
        this.i.add(iBaseResponseCallback);
        int i = this.d;
        if (i == 1) {
            return;
        }
        if (i == 0 || !((map = this.f49687a) == null || map.size() == 4)) {
            b();
        }
    }

    public static void a() {
        if (e != null) {
            c().d();
        }
        synchronized (f49686b) {
            if (e != null) {
                e = null;
                ReleaseLogUtil.d("SCUI_SportTargetSearchHelper", "release");
            }
        }
    }

    private void d() {
        ReleaseLogUtil.d("SCUI_SportTargetSearchHelper", "ActiveTargetSearchHelper destroy");
        h();
        BroadcastReceiver broadcastReceiver = this.f;
        if (broadcastReceiver != null) {
            BroadcastManager.m(broadcastReceiver);
            this.f = null;
        }
        if (this.f49688c != null) {
            BroadcastManagerUtil.d(BaseApplication.b(), this.f49688c);
            this.f49688c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.j != null) {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(this.j, new HiUnSubscribeListener() { // from class: tuz
                @Override // com.huawei.hihealth.data.listener.HiUnSubscribeListener
                public final void onResult(boolean z) {
                    ReleaseLogUtil.d("SCUI_SportTargetSearchHelper", "unSubscribeSportData isSuccess = ", Boolean.valueOf(z));
                }
            });
        }
    }

    private tuv() {
        e();
        if (this.f == null) {
            this.f = new BroadcastReceiver() { // from class: tuv.2
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    String stringExtra = intent.getStringExtra("processName");
                    boolean booleanExtra = intent.getBooleanExtra("isRunning", false);
                    LogUtil.a("SCUI_SportTargetSearchHelper", "processName: ", stringExtra, " isRunning: ", Boolean.valueOf(booleanExtra), " time: ", Long.valueOf(intent.getLongExtra("time", 0L)));
                    if (XiaomiWidgetProvider.DAEMON_SERVICE_PROCESS.equals(stringExtra) && booleanExtra) {
                        ReleaseLogUtil.d("SCUI_SportTargetSearchHelper", "DaemonService restart, subscribe again");
                        tuv.this.h();
                        tuv.this.e();
                    }
                }
            };
        }
        BroadcastManager.a(this.f);
        IntentFilter intentFilter = new IntentFilter("com.huawei.hihealth.action_account_login_datas_switch_finish");
        if (this.f49688c == null) {
            this.f49688c = new BroadcastReceiver() { // from class: tuv.5
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    ReleaseLogUtil.d("SCUI_SportTargetSearchHelper", "ACTION_ACCOUNT_LOGIN_DATAS_SWITCH_FINISH");
                    tuv.this.b();
                }
            };
        }
        BroadcastManagerUtil.d(BaseApplication.b(), this.f49688c, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(103);
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, new c(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, Object obj) {
        c(i, obj);
        if (!(obj instanceof HashMap)) {
            LogUtil.j("SCUI_SportTargetSearchHelper", "arrive is not instanceof HashMap");
            return;
        }
        this.f49687a = (HashMap) obj;
        LogUtil.j("SCUI_SportTargetSearchHelper", "Searched over");
        this.d = 2;
    }

    private void c(int i, Object obj) {
        if (njy.b(this.i)) {
            for (IBaseResponseCallback iBaseResponseCallback : this.i) {
                if (iBaseResponseCallback == null) {
                    ReleaseLogUtil.a("SCUI_SportTargetSearchHelper", "callback is null in response");
                } else {
                    LogUtil.j("SCUI_SportTargetSearchHelper", "onResponse now");
                    iBaseResponseCallback.a(i, obj);
                }
            }
            this.i.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        LogUtil.a("SCUI_SportTargetSearchHelper", "start searching");
        this.d = 1;
        ArrayList arrayList = new ArrayList(4);
        arrayList.add("900200006");
        arrayList.add("900200008");
        arrayList.add("900200009");
        arrayList.add("900200007");
        qgm.a(arrayList, new b());
    }

    static class b implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<tuv> f49691a;

        private b(tuv tuvVar) {
            this.f49691a = new WeakReference<>(tuvVar);
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("SCUI_SportTargetSearchHelper", "SportAchievementGoalDataCallback ", obj == null ? null : obj.toString());
            tuv tuvVar = this.f49691a.get();
            if (tuvVar != null) {
                tuvVar.d(i, obj);
            } else {
                ReleaseLogUtil.e("SCUI_SportTargetSearchHelper", "SportAchievementGoalDataCallback cardData is null ");
            }
        }
    }

    static class c implements HiSubscribeListener {
        private WeakReference<tuv> d;

        c(tuv tuvVar) {
            this.d = new WeakReference<>(tuvVar);
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onResult(List<Integer> list, List<Integer> list2) {
            tuv tuvVar = this.d.get();
            if (tuvVar == null) {
                LogUtil.j("SCUI_SportTargetSearchHelper", "onResult logicalStepCounter == null");
            } else {
                if (njy.e(list)) {
                    return;
                }
                ReleaseLogUtil.d("SCUI_SportTargetSearchHelper", "SportDataCallback success");
                tuvVar.j = list;
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiSubscribeListener
        public void onChange(int i, HiHealthClient hiHealthClient, String str, HiHealthData hiHealthData, long j) {
            LogUtil.a("SCUI_SportTargetSearchHelper", "ConfigGoalCallback ", hiHealthData == null ? null : hiHealthData.toString(), " type ", Integer.valueOf(i), " client ", hiHealthClient != null ? hiHealthClient.getHuid() : null, "changeKey ", str, " time ", Long.valueOf(j));
            if (i == 103) {
                tuv tuvVar = this.d.get();
                if (tuvVar == null) {
                    LogUtil.j("SCUI_SportTargetSearchHelper", "logicalStepCounter is null");
                } else if ("900200006".equals(str) || "900200008".equals(str) || "900200009".equals(str) || "900200007".equals(str)) {
                    tuvVar.b();
                }
            }
        }
    }
}
