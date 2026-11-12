package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import defpackage.ehh;
import defpackage.enr;
import defpackage.ppe;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f3198a = ppe.i("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f3199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f3200b;
        public final /* synthetic */ BroadcastReceiver.PendingResult c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f3199a = intent;
            this.f3200b = context;
            this.c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f3199a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f3199a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f3199a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f3199a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                ppe.e().a(ConstraintProxyUpdateReceiver.f3198a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                ehh.c(this.f3200b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                ehh.c(this.f3200b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                ehh.c(this.f3200b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                ehh.c(this.f3200b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            enr.e(context).l().b(new a(intent, context, goAsync()));
            return;
        }
        ppe.e().a(f3198a, "Ignoring unknown action " + action);
    }
}
