package com.huami.bluetooth.device.function.log;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.hu;
import defpackage.s8;
import defpackage.t5t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/device/function/log/DoSwitchRoleAction$mBroadcastReceiver$1", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class DoSwitchRoleAction$mBroadcastReceiver$1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        String action = intent.getAction();
        t5t.d("DoSwitchRoleAction", "action:" + action);
        if (Intrinsics.areEqual("android.bluetooth.adapter.action.STATE_CHANGED", action)) {
            int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
            if (intExtra == 10 || intExtra == 13) {
                s8.b(null);
                s8.a(null);
                s8.d(null);
                hu huVarC = s8.c(null);
                if (huVarC != null) {
                    huVarC.a(false);
                }
            }
        }
    }
}
