package com.xiaomi.fitness.devicesettings.common.alarm;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.deskclock.console.ConsoleAlarm;
import com.mi.health.sleep.SleepDataHelperKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.common.alarm.AlarmConsoleService$mBinder$1;
import com.xiaomi.fitness.devicesettings.utils.DeviceSettingsPreference;
import defpackage.dpc;
import defpackage.epc;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"com/xiaomi/fitness/devicesettings/common/alarm/AlarmConsoleService$mBinder$1", "Ldpc$a;", "", "checkPermission", "()Z", "Lepc;", "callback", "", "registerConsoleCallback", "(Lepc;)V", "unregisterConsoleCallback", "()V", "Lcom/android/deskclock/console/ConsoleAlarm;", "consoleAlarm", "onAlert", "(Lcom/android/deskclock/console/ConsoleAlarm;)V", "onDismiss", "onSnooze", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AlarmConsoleService$mBinder$1 extends dpc.a {
    final /* synthetic */ AlarmConsoleService this$0;

    public AlarmConsoleService$mBinder$1(AlarmConsoleService alarmConsoleService) {
        this.this$0 = alarmConsoleService;
    }

    private final boolean checkPermission() {
        String[] packagesForUid = this.this$0.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid != null) {
            if (!(packagesForUid.length == 0)) {
                Iterator it = ArrayIteratorKt.iterator(packagesForUid);
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(SleepDataHelperKt.DEAK_CLOCK_PKG, (String) it.next())) {
                        Logger.i(this.this$0.getTAG(), "checkPermission true");
                        return true;
                    }
                }
            }
        }
        Logger.i(this.this$0.getTAG(), "checkPermission false");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAlert$lambda$2(AlarmConsoleService this$0, ConsoleAlarm consoleAlarm) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consoleAlarm, "$consoleAlarm");
        this$0.mAlarmId = consoleAlarm.c();
        this$0.alert(consoleAlarm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDismiss$lambda$3(AlarmConsoleService this$0, ConsoleAlarm consoleAlarm) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consoleAlarm, "$consoleAlarm");
        this$0.dismiss(consoleAlarm, false);
        this$0.mAlarmId = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSnooze$lambda$4(AlarmConsoleService this$0, ConsoleAlarm consoleAlarm) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(consoleAlarm, "$consoleAlarm");
        this$0.dismiss(consoleAlarm, true);
        this$0.mAlarmId = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void registerConsoleCallback$lambda$0(AlarmConsoleService this$0, epc callback) {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        Logger.i(this$0.getTAG(), "callback: " + callback);
        this$0.mCallback = callback;
        try {
            epc epcVar = this$0.mCallback;
            if (epcVar == null || (iBinderAsBinder = epcVar.asBinder()) == null) {
                return;
            }
            iBinderAsBinder.linkToDeath(this$0.mDeathRecipient, 0);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterConsoleCallback$lambda$1(AlarmConsoleService this$0) {
        IBinder iBinderAsBinder;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.mCallback != null) {
            epc epcVar = this$0.mCallback;
            if (epcVar != null && (iBinderAsBinder = epcVar.asBinder()) != null) {
                iBinderAsBinder.unlinkToDeath(this$0.mDeathRecipient, 0);
            }
            this$0.mCallback = null;
        }
    }

    @Override // defpackage.dpc
    public void onAlert(final ConsoleAlarm consoleAlarm) {
        Handler handler;
        Intrinsics.checkNotNullParameter(consoleAlarm, "consoleAlarm");
        Logger.i(this.this$0.getTAG(), "onAlert consoleAlarm: " + consoleAlarm + " get preference: " + DeviceSettingsPreference.INSTANCE.getKEY_SYNC_MIUI_ALARM());
        if (!checkPermission() || (handler = this.this$0.mHandler) == null) {
            return;
        }
        final AlarmConsoleService alarmConsoleService = this.this$0;
        handler.post(new Runnable() { // from class: v31
            @Override // java.lang.Runnable
            public final void run() {
                AlarmConsoleService$mBinder$1.onAlert$lambda$2(alarmConsoleService, consoleAlarm);
            }
        });
    }

    @Override // defpackage.dpc
    public void onDismiss(final ConsoleAlarm consoleAlarm) {
        Handler handler;
        Intrinsics.checkNotNullParameter(consoleAlarm, "consoleAlarm");
        Logger.i(this.this$0.getTAG(), "onDismiss consoleAlarm:" + consoleAlarm);
        if (!checkPermission() || (handler = this.this$0.mHandler) == null) {
            return;
        }
        final AlarmConsoleService alarmConsoleService = this.this$0;
        handler.post(new Runnable() { // from class: x31
            @Override // java.lang.Runnable
            public final void run() {
                AlarmConsoleService$mBinder$1.onDismiss$lambda$3(alarmConsoleService, consoleAlarm);
            }
        });
    }

    @Override // defpackage.dpc
    public void onSnooze(final ConsoleAlarm consoleAlarm) {
        Handler handler;
        Intrinsics.checkNotNullParameter(consoleAlarm, "consoleAlarm");
        Logger.i(this.this$0.getTAG(), "onSnooze consoleAlarm:" + consoleAlarm);
        if (!checkPermission() || (handler = this.this$0.mHandler) == null) {
            return;
        }
        final AlarmConsoleService alarmConsoleService = this.this$0;
        handler.post(new Runnable() { // from class: y31
            @Override // java.lang.Runnable
            public final void run() {
                AlarmConsoleService$mBinder$1.onSnooze$lambda$4(alarmConsoleService, consoleAlarm);
            }
        });
    }

    @Override // defpackage.dpc
    public void registerConsoleCallback(final epc callback) {
        Handler handler;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!checkPermission() || (handler = this.this$0.mHandler) == null) {
            return;
        }
        final AlarmConsoleService alarmConsoleService = this.this$0;
        handler.post(new Runnable() { // from class: w31
            @Override // java.lang.Runnable
            public final void run() {
                AlarmConsoleService$mBinder$1.registerConsoleCallback$lambda$0(alarmConsoleService, callback);
            }
        });
    }

    @Override // defpackage.dpc
    public void unregisterConsoleCallback() {
        Handler handler;
        if (!checkPermission() || (handler = this.this$0.mHandler) == null) {
            return;
        }
        final AlarmConsoleService alarmConsoleService = this.this$0;
        handler.post(new Runnable() { // from class: z31
            @Override // java.lang.Runnable
            public final void run() {
                AlarmConsoleService$mBinder$1.unregisterConsoleCallback$lambda$1(alarmConsoleService);
            }
        });
    }
}
