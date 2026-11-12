package com.xiaomi.fitness.connect.export;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/connect/export/EcoConnectionStateChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "eco-common-connect_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcoConnectionStateChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra == 0) {
        }
        String stringExtra = intent.getStringExtra("did");
        String str = stringExtra == null ? "" : stringExtra;
        String stringExtra2 = intent.getStringExtra("mac");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        boolean booleanExtra = intent.getBooleanExtra("current_device", false);
        switch (intExtra) {
            case 1:
                EcoConnectStateObserver.INSTANCE.notifyConnectStart(str, str2, booleanExtra);
                break;
            case 2:
                EcoConnectStateObserver.INSTANCE.notifyConnectSuccess(str, str2, booleanExtra);
                break;
            case 3:
                int intExtra2 = intent.getIntExtra("code", 0);
                int intExtra3 = intent.getIntExtra("times", 0);
                String stringExtra3 = intent.getStringExtra("message");
                EcoConnectStateObserver.INSTANCE.notifyConnectFailure(str, str2, intExtra2, stringExtra3 == null ? "" : stringExtra3, intExtra3, booleanExtra);
                break;
            case 4:
                EcoConnectStateObserver.INSTANCE.notifyDisconnect(str, str2, booleanExtra);
                break;
            case 5:
                String stringExtra4 = intent.getStringExtra("mac");
                EcoBindStateObserver.INSTANCE.notifyBindSuccess(intent.getIntExtra("bindType", 0), stringExtra4 != null ? stringExtra4 : "", str);
                break;
            case 6:
                String stringExtra5 = intent.getStringExtra("mac");
                EcoBindStateObserver.INSTANCE.notifyBindFail(stringExtra5 != null ? stringExtra5 : "");
                break;
        }
    }
}
