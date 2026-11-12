package com.garmin.android.apps.connectmobile.sync;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import lg1.d;
import yr1.e;

/* JADX INFO: loaded from: classes10.dex */
public class AutoSyncScheduler extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45033a = 0;

    public static void a(int i14, Context context) {
        Intent intent = new Intent(context, (Class<?>) AutoSyncScheduler.class);
        intent.setAction("com.garmin.android.apps.connectmobile.action.ACTION_AUTO_SYNC");
        ((AlarmManager) context.getSystemService("alarm")).setExact(0, System.currentTimeMillis() + ((long) i14), PendingIntent.getBroadcast(context, 0, intent, 201326592));
    }

    public static void b(Context context) {
        int iF = GCMSettingManager.f();
        if (iF < 180000) {
            iF = 180000;
        }
        GCMSettingManager.f41536b.edit().putBoolean(d.ENABLE_AUTO_SYNC.f112244a, true).apply();
        GCMSettingManager.f41536b.edit().putInt(d.AUTO_SYNC_INTERVAL.f112244a, iF).apply();
        Intent intent = new Intent(context, (Class<?>) AutoSyncScheduler.class);
        intent.setAction("com.garmin.android.apps.connectmobile.action.ACTION_AUTO_SYNC");
        context.sendBroadcast(intent);
        a(iF, context);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            i2.n("AutoSyncScheduler", "Warning: received intent with empty action.");
        } else if ("com.garmin.android.apps.connectmobile.action.ACTION_AUTO_SYNC".equals(action) && GCMSettingManager.x()) {
            a(GCMSettingManager.f(), context);
            e.b("AutoSyncScheduler");
        }
    }
}
