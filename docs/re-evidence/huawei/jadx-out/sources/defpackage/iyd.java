package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class iyd {
    private int e = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f38200b = false;
    private int f = 40;
    private int j = 180;
    private boolean d = false;
    private float g = 500.0f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f38199a = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38201c = false;
    private final BroadcastReceiver h = new BroadcastReceiver() { // from class: iyd.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.e("Track_AutoTrackConfig", "mSyncAllReceiver intent is null");
            } else if ("com.huawei.hihealth.action_sync_all_data".equals(intent.getAction())) {
                iyd.this.a(context);
                ReleaseLogUtil.d("Track_AutoTrackConfig", "mSyncAllReceiver mAutoTrackState ", Integer.valueOf(iyd.this.e));
                iyd.this.g();
            }
        }
    };

    public void a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("AutoTrack", 0);
        if (sharedPreferences != null) {
            this.f38200b = sharedPreferences.getBoolean("BtnShow", false);
            b(sharedPreferences);
            this.f = sharedPreferences.getInt("StartDelay", 40);
            this.j = sharedPreferences.getInt("StopDelay", 180);
            this.d = sharedPreferences.getBoolean("ShowDebug", false);
            this.g = sharedPreferences.getFloat("MinDistance", 500.0f);
            this.f38199a = sharedPreferences.getBoolean("showRedPoint", true);
            if (CommonUtil.au() || CommonUtil.bd()) {
                this.f38200b = true;
            }
        }
        this.f38201c = ppt.a();
        LogUtil.a("Track_AutoTrackConfig", "show ", Boolean.valueOf(this.f38200b), "  enable ", Integer.valueOf(this.e), " start ", Integer.valueOf(this.f), " stop ", Integer.valueOf(this.j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(final SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains("TrackEnable")) {
            this.e = sharedPreferences.getInt("TrackEnable", 2);
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iyk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.b(sharedPreferences);
                }
            });
            return;
        }
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.auto_track_status");
        if (userPreference == null && !SharedPreferenceManager.b("HiHealthService", "pullAllStatus", false)) {
            ReleaseLogUtil.d("Track_AutoTrackConfig", "initAutoTrackState sync not over");
            i();
            return;
        }
        if (userPreference != null && !TextUtils.isEmpty(userPreference.getValue())) {
            this.e = CommonUtils.j(userPreference.getValue());
            if (this.e != sharedPreferences.getInt("TrackEnable", 2)) {
                c(e());
                ReleaseLogUtil.d("Track_AutoTrackConfig", "updateAutoTrackStateToDaemonService mAutoTrackState = ", Integer.valueOf(this.e));
                SharedPreferences.Editor editorE = e(BaseApplication.getContext());
                if (editorE != null) {
                    editorE.putInt("TrackEnable", this.e);
                    editorE.apply();
                } else {
                    ReleaseLogUtil.e("Track_AutoTrackConfig", "editor is null");
                    return;
                }
            }
            ReleaseLogUtil.d("Track_AutoTrackConfig", "sp value to mAutoTrackState", Integer.valueOf(this.e));
            return;
        }
        if (sharedPreferences.contains("TrackEnable")) {
            k();
            ReleaseLogUtil.d("Track_AutoTrackConfig", "setAutoTrackStateUserPreference");
        }
    }

    private void c(boolean z) {
        try {
            iyd iydVar = new iyd();
            Intent intent = new Intent("com.huawei.health.track.config");
            intent.setPackage("com.huawei.health");
            intent.setClassName("com.huawei.health", "com.huawei.health.manager.DaemonService");
            intent.putExtra("autotrack_enable", z);
            intent.putExtra("stop_delay", iydVar.b());
            intent.putExtra("start_delay", iydVar.c());
            BaseApplication.getContext().startService(intent);
        } catch (IllegalStateException | NoSuchMethodError | SecurityException e) {
            ReleaseLogUtil.a("Track_AutoTrackConfig", "sendDaemonServiceBroadcast Exception", LogAnonymous.b(e));
        }
    }

    public void b(Context context) {
        SharedPreferences.Editor editorE;
        if (context == null || (editorE = e(context)) == null) {
            return;
        }
        editorE.putBoolean("BtnShow", this.f38200b);
        editorE.putInt("TrackEnable", this.e);
        k();
        editorE.putBoolean("ShowDebug", this.d);
        editorE.putInt("StartDelay", this.f);
        editorE.putInt("StopDelay", this.j);
        editorE.putFloat("MinDistance", a());
        editorE.apply();
        LogUtil.a("Track_AutoTrackConfig", "saveConfigToFile success");
    }

    private SharedPreferences.Editor e(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("AutoTrack", 0);
        if (sharedPreferences == null) {
            return null;
        }
        return sharedPreferences.edit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: iyj
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.k();
                }
            });
            return;
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.auto_track_status");
        hiUserPreference.setValue(String.valueOf(this.e));
        HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(10026);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        HiHealthNativeApi.a(BaseApplication.getContext()).synCloud(hiSyncOption, null);
        ReleaseLogUtil.d("Track_AutoTrackConfig", "setAutoTrackStateUserPreference mAutoTrackState:", Integer.valueOf(this.e));
    }

    public boolean d() {
        return this.f38200b;
    }

    public void e(Context context, boolean z) {
        if (z) {
            this.e = 1;
            d(context);
        } else {
            this.e = 2;
        }
    }

    private void d(Context context) {
        if (context == null) {
            LogUtil.j("Track_AutoTrackConfig", "setAutoIdentifyRecordsStartTime context is null");
        } else if (TextUtils.isEmpty(SharedPreferenceManager.e(context, String.valueOf(20002), "first_open_auto_identify_record_switch_time"))) {
            SharedPreferenceManager.e(context, String.valueOf(20002), "first_open_auto_identify_record_switch_time", String.valueOf(System.currentTimeMillis()), null);
        }
    }

    public void i() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.hihealth.action_sync_all_data");
        BroadcastManagerUtil.b(BaseApplication.getContext(), this.h, intentFilter);
    }

    public void g() {
        try {
            BaseApplication.getContext().unregisterReceiver(this.h);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("Track_AutoTrackConfig", "unregister broadcast sync all data IllegalArgumentException.");
        }
    }

    public boolean e() {
        return this.e == 1;
    }

    public int c() {
        return this.f;
    }

    public int b() {
        return this.j;
    }

    public boolean j() {
        return this.d;
    }

    public float a() {
        if (this.f38201c) {
            return 500.0f;
        }
        return this.g;
    }

    public boolean h() {
        return this.f38199a;
    }

    public void e(boolean z) {
        this.f38199a = z;
        d("showRedPoint", z);
    }

    public void d(String str, boolean z) {
        SharedPreferences.Editor editorE = e(BaseApplication.getContext());
        if (editorE == null) {
            ReleaseLogUtil.e("Track_AutoTrackConfig", "saveSp editor is null");
        } else {
            editorE.putBoolean(str, z);
            editorE.apply();
        }
    }

    public boolean f() {
        return this.f38201c;
    }
}
