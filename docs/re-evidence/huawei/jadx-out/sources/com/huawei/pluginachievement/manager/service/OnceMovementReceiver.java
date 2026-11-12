package com.huawei.pluginachievement.manager.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.TrackData;
import defpackage.oru;
import defpackage.osa;
import defpackage.otl;
import defpackage.otu;
import defpackage.oub;
import defpackage.ouc;
import defpackage.oue;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public class OnceMovementReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f22034c = new Object();
    private static ExecutorService d = Executors.newSingleThreadExecutor();
    private Context e;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "onReceive");
        synchronized (f22034c) {
            this.e = context;
            b(intent);
        }
    }

    private void a(Intent intent) {
        int intExtra = intent.getIntExtra("share_key", 0);
        LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "shareType is ", Integer.valueOf(intExtra));
        otu.b(this.e).e(intExtra);
    }

    private void b(Intent intent) {
        if (this.e == null || intent == null) {
            LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "onReceive mContext or intent is null");
            return;
        }
        if (!oru.d()) {
            LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "isSupportAchieve is not");
        } else if (!"com.huawei.healthcloud.action.sendSportTrackDistance".equals(intent.getAction())) {
            LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "Action is Invalid!");
        } else if (-1 != intent.getIntExtra("share_key", -1)) {
            a(intent);
        }
    }

    public static void d(Context context, ArrayList<TrackData> arrayList) {
        e(context);
        c(context, arrayList);
        b(context, arrayList);
    }

    public static void c(final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.pluginachievement.manager.service.OnceMovementReceiver.1
            @Override // java.lang.Runnable
            public void run() {
                oue.a(bundle);
            }
        });
    }

    private static void e(Context context) {
        LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "Sync trackData Change success!");
        osa.b(context, "_syncWearData", "");
    }

    public static void c(Context context, ArrayList<TrackData> arrayList) {
        otu.b(context).d(arrayList);
    }

    public static void b(Context context, ArrayList<TrackData> arrayList) {
        synchronized (f22034c) {
            LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "getData()");
            a(context, arrayList);
        }
    }

    private static void a(final Context context, final ArrayList<TrackData> arrayList) {
        synchronized (f22034c) {
            LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "enter processGpsMovement():");
            if (d.isShutdown()) {
                d = Executors.newSingleThreadExecutor();
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                d.execute(new Runnable() { // from class: com.huawei.pluginachievement.manager.service.OnceMovementReceiver.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Utils.o()) {
                            return;
                        }
                        oue.d((ArrayList<TrackData>) arrayList, otl.b(context), context);
                        oub.e(context, arrayList);
                    }
                });
                for (final TrackData trackData : arrayList) {
                    d.execute(new Runnable() { // from class: com.huawei.pluginachievement.manager.service.OnceMovementReceiver.2
                        @Override // java.lang.Runnable
                        public void run() {
                            OnceMovementReceiver.c(context, trackData);
                        }
                    });
                }
                d.shutdown();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, TrackData trackData) {
        LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "enter movementRunnable:");
        otl otlVarB = otl.b(context.getApplicationContext());
        if (otlVarB.q() == null || otlVarB.q().getHuid() == null) {
            LogUtil.a("PLGACHIEVE_OnceMovementReceiver", "dealTrack userProfile or uid is null");
            otlVarB.ac();
            if (otlVarB.q() == null || otlVarB.q().getHuid() == null) {
                return;
            }
        }
        if (trackData == null) {
            LogUtil.j("PLGACHIEVE_OnceMovementReceiver", "trackData is null");
            return;
        }
        if (!Utils.o()) {
            oub.d(trackData, otlVarB, context);
        }
        ouc.b(trackData, otlVarB, context);
        oue.a(trackData, otlVarB, context);
    }
}
