package com.garmin.android.apps.connectmobile;

import android.app.AlarmManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ScheduleExactAlarmPermissionStateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScheduleExactAlarmPermissionStateReceiver extends BroadcastReceiver {
    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        a2 a2Var = a2.USER_REMINDERS;
        String strM = am.j.m("[onReceive] Received action [", action, "].");
        i2.f36769a.getClass();
        i2.a.b(a2Var, "ScheduleExactAlarmPermissionStateReceiver", strM);
        if (p005kotlin.jvm.internal.s.g(intent.getAction(), "android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED")) {
            j22.b.f96736a.getClass();
            boolean zL = j22.b.l();
            i2.a.b(a2Var, "ScheduleExactAlarmPermissionStateReceiver", "[onReceive] alarmsAndRemindersAvailable: " + zL);
            if (zL) {
                Object systemService = context.getSystemService("alarm");
                systemService.getClass();
                boolean zCanScheduleExactAlarms = ((AlarmManager) systemService).canScheduleExactAlarms();
                i2.a.b(a2Var, "ScheduleExactAlarmPermissionStateReceiver", "[onReceive] canScheduleExactAlarms: " + zCanScheduleExactAlarms);
                if (zCanScheduleExactAlarms) {
                    ((kd1.k) KoinJavaComponent.get$default(kd1.k.class, null, null, 6, null)).a(nd1.c.NETWORK);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/ScheduleExactAlarmPermissionStateReceiver$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
