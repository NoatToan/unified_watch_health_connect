package com.huawei.health.receiver;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.suggestion.PluginSuggestion;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.idy;
import defpackage.ive;
import defpackage.jxh;
import defpackage.lmf;
import defpackage.lsb;
import defpackage.njd;
import defpackage.pcd;
import defpackage.pea;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public class MainProcessHelperService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IBinder f8653c = new a();
    private Context d;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f8653c;
    }

    static class a extends Binder {
        private a() {
        }
    }

    class c implements IBaseResponseCallback {
        private c() {
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            LogUtil.a("MainProcessHelperService", "onResponse ", Integer.valueOf(i));
            if (obj instanceof njd) {
                njd njdVar = (njd) obj;
                ive.c().init(MainProcessHelperService.this.getApplicationContext());
                ive.c().b(njdVar.b(), njdVar.c());
            }
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(20220115, lsb.d().c().build());
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, final int i2) {
        LogUtil.a("MainProcessHelperService", "onStartCommand ", intent);
        ThreadPoolManager.c().b("MainProcessHelperService", new Runnable() { // from class: gsw
            @Override // java.lang.Runnable
            public final void run() {
                this.f36008b.c(intent, i2);
            }
        });
        super.onStartCommand(null, i, i2);
        return 2;
    }

    public /* synthetic */ void c(Intent intent, int i) {
        this.d = getApplicationContext();
        try {
            if (intent == null) {
                LogUtil.j("MainProcessHelperService", "onStartCommand intent is null.");
            } else if ("start_main_process_for_pluginsuggestion".equals(intent.getAction())) {
                LogUtil.a("MainProcessHelperService", "onStartCommand ACTION_START_MAIN_PROCESS_FOR_PLUGINSUGGESTION");
                b();
            } else if ("start_main_process_for_pluginsuggestion_running_stretch".equals(intent.getAction())) {
                LogUtil.a("MainProcessHelperService", "onStartCommand ACTION_START_MAIN_PROCESS_FOR_PLUGINSUGGESTION_STRETCH");
                a();
            } else if ("start_main_process_for_manager".equals(intent.getAction())) {
                LogUtil.j("MainProcessHelperService", "noCommand is match.");
            } else {
                long longExtra = intent.getLongExtra("startTime", 0L);
                long longExtra2 = intent.getLongExtra("endTime", 0L);
                LogUtil.a("MainProcessHelperService", "onStartCommand(), ", "startTime: ", Long.valueOf(longExtra), " ;endTime: ", Long.valueOf(longExtra2));
                String strValue = AnalyticsValue.HEALTH_NOTIFICATION_ACTIVITY_2110003.value();
                HashMap map = new HashMap(1);
                map.put("click", 1);
                lmf.d().c(BaseApplication.getContext(), strValue, map, 0);
                lmf.d().b(this);
                jxh.a(longExtra, longExtra2, new c());
            }
        } catch (Exception e) {
            LogUtil.e("MainProcessHelperService", "onStartCommand() = ", LogAnonymous.b(e));
        }
        stopSelf(i);
    }

    private void b() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        idy.a((String) null);
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId("R002");
        workoutRecord.saveWorkoutName(BaseApplication.getContext().getString(R.string.IDS_hwh_motiontrack_stretch_after_run));
        workoutRecord.savePlanId("");
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecord);
        pea.b(this.d, new pcd("R002"), (ArrayList<WorkoutRecord>) arrayList);
    }

    private void a() {
        PluginSuggestion pluginSuggestion = (PluginSuggestion) Services.d("PluginFitnessAdvice", PluginSuggestion.class);
        if (pluginSuggestion == null || !pluginSuggestion.isInitComplete()) {
            return;
        }
        WorkoutRecord workoutRecord = new WorkoutRecord();
        workoutRecord.saveVersion(null);
        workoutRecord.saveExerciseTime(new Date().getTime());
        workoutRecord.saveWorkoutId("R002");
        workoutRecord.savePlanId("");
        workoutRecord.saveWorkoutName(BaseApplication.getContext().getString(R.string.IDS_hwh_motiontrack_stretch_after_run));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(workoutRecord);
        pcd pcdVar = new pcd("R002");
        pcdVar.a("FitnessCourse_轨迹");
        pcdVar.b(true);
        pea.b(this.d, pcdVar, (ArrayList<WorkoutRecord>) arrayList);
    }
}
