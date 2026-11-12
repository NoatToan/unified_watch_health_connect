package com.xiaomi.wearable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.wearable.connection.ConnectStateObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"Lcom/xiaomi/wearable/AccountReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onSwitchServer", "onLogout", "onLogin", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountReceiver extends BroadcastReceiver {
    private final void onLogin() {
    }

    private final void onLogout() {
        ConnectStateObserver.INSTANCE.clearListeners();
    }

    private final void onSwitchServer() {
        ConnectStateObserver.INSTANCE.clearListeners();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        int intExtra = intent.getIntExtra("account_state", 0);
        if (intExtra == 0) {
            return;
        }
        if (intExtra == 1) {
            onLogout();
        } else if (intExtra == 2) {
            onLogin();
        } else {
            if (intExtra != 3) {
                return;
            }
            onSwitchServer();
        }
    }
}
