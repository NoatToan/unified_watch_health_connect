package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.model.WorkSpec;
import defpackage.ppe;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3197a = ppe.i("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class NetworkStateProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
        @Override // androidx.work.impl.background.systemalarm.ConstraintProxy, android.content.BroadcastReceiver
        public /* bridge */ /* synthetic */ void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static void a(Context context, List<WorkSpec> list) {
        Iterator<WorkSpec> it = list.iterator();
        boolean requiresBatteryNotLow = false;
        boolean requiresCharging = false;
        boolean requiresStorageNotLow = false;
        boolean z = false;
        while (it.hasNext()) {
            Constraints constraints = it.next().constraints;
            requiresBatteryNotLow |= constraints.getRequiresBatteryNotLow();
            requiresCharging |= constraints.getRequiresCharging();
            requiresStorageNotLow |= constraints.getRequiresStorageNotLow();
            z |= constraints.getRequiredNetworkType() != NetworkType.NOT_REQUIRED;
            if (requiresBatteryNotLow && requiresCharging && requiresStorageNotLow && z) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, requiresBatteryNotLow, requiresCharging, requiresStorageNotLow, z));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ppe.e().a(f3197a, "onReceive : " + intent);
        context.startService(a.a(context));
    }
}
