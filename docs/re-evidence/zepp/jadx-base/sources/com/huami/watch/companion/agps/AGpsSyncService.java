package com.huami.watch.companion.agps;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.agps.AGpsSyncService;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.sync.SyncResult;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class AGpsSyncService extends Service {
    private static final String b = "AGps-Sync-Service";
    private static final int c = 3;
    private static final int d = 60;
    private static PendingIntent e;
    private Disposable a;

    public static void cancelSync(Context context) {
        Log.i(b, "Cancel Sync : " + e, new Object[0]);
        if (e != null) {
            ((AlarmManager) context.getSystemService("alarm")).cancel(e);
            e = null;
        }
        context.stopService(new Intent(context, (Class<?>) AGpsSyncService.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(SyncResult syncResult) throws Exception {
        Log.i(b, "SyncFinish, StopSelf!!", new Object[0]);
        stopSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Throwable th) throws Exception {
        HMLog.warn(b, th, new Function0() { // from class: g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AGpsSyncService.e();
            }
        });
    }

    public static void scheduleSync(Context context, String str) {
        Log.i(b, "Schedule Sync, From : " + str, new Object[0]);
        if (!DeviceManager.getManager(context).hasBoundDevice()) {
            Log.d(b, "No bound device, Abort!!", new Object[0]);
            return;
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent = new Intent(context, (Class<?>) AGpsSyncService.class);
        intent.putExtra("FromWhere", "AlarmManager");
        PendingIntent service = PendingIntent.getService(context, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
        PendingIntent pendingIntent = e;
        if (pendingIntent != null) {
            alarmManager.cancel(pendingIntent);
            e = null;
        }
        e = service;
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, 1);
        Log.d(b, "Schedule At : " + TimeUtil.formatDateTime(calendar.getTimeInMillis()), new Object[0]);
        try {
            alarmManager.setRepeating(0, calendar.getTimeInMillis(), 3600000L, service);
        } catch (Exception e2) {
            Log.e(b, "set alarm error when " + e2.getMessage(), new Object[0]);
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        Log.d(b, "Service OnBind!!", new Object[0]);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.d(b, "Service OnCreate!!", new Object[0]);
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d(b, "Service OnDestroy!!", new Object[0]);
        Disposable disposable = this.a;
        if (disposable != null) {
            disposable.dispose();
            this.a = null;
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Log.d(b, "Service OnRebind!!", new Object[0]);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        Log.d(b, "Service OnStartCommand, From : " + (intent != null ? intent.getStringExtra("FromWhere") : null), new Object[0]);
        if (!DeviceManager.getManager(this).hasBoundDevice()) {
            Log.d(b, "No bound device, Abort!!", new Object[0]);
            return super.onStartCommand(intent, i, i2);
        }
        if (DeviceManager.getManager(this).isCurrentDeviceBLE()) {
            Log.d(b, "CurrentDevice Is BLE Device, Abort!!", new Object[0]);
            return super.onStartCommand(intent, i, i2);
        }
        if (AGpsSyncHelper.k()) {
            Disposable disposable = this.a;
            if (disposable != null) {
                disposable.dispose();
                this.a = null;
            }
            this.a = AGpsSyncHelper.getHelper().syncAGpsToWatchObservable(this, 0L, 60, null).subscribe(new Consumer() { // from class: e
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    this.a.d((SyncResult) obj);
                }
            }, new Consumer() { // from class: f
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) throws Exception {
                    AGpsSyncService.f((Throwable) obj);
                }
            });
        } else {
            Log.i(b, "NoNeedSync, StopSelf!!", new Object[0]);
            stopSelf();
        }
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        Log.d(b, "Service OnUnbind!!", new Object[0]);
        return super.onUnbind(intent);
    }
}
