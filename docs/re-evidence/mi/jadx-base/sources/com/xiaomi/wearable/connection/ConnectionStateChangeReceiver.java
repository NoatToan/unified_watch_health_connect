package com.xiaomi.wearable.connection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/connection/ConnectionStateChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectionStateChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra == 0) {
            return;
        }
        String stringExtra = intent.getStringExtra("did");
        String str = stringExtra == null ? "" : stringExtra;
        boolean booleanExtra = intent.getBooleanExtra("current_device", false);
        String stringExtra2 = intent.getStringExtra("model");
        String str2 = stringExtra2 == null ? "" : stringExtra2;
        boolean booleanExtra2 = intent.getBooleanExtra("specificModel", false);
        if (intExtra == 1) {
            ConnectStateObserver.INSTANCE.notifyConnectStart(str, booleanExtra, str2, booleanExtra2);
            return;
        }
        if (intExtra == 2) {
            ConnectStateObserver.INSTANCE.notifyConnectSuccess(str, booleanExtra, str2, booleanExtra2);
            return;
        }
        if (intExtra != 3) {
            if (intExtra != 4) {
                return;
            }
            ConnectStateObserver.INSTANCE.notifyDisconnect(str, booleanExtra, str2, booleanExtra2);
        } else {
            int intExtra2 = intent.getIntExtra("code", 0);
            int intExtra3 = intent.getIntExtra("times", 0);
            String stringExtra3 = intent.getStringExtra("message");
            ConnectStateObserver.INSTANCE.notifyConnectFailure(str, intExtra2, str2, stringExtra3 == null ? "" : stringExtra3, intExtra3, booleanExtra, booleanExtra2);
        }
    }
}
