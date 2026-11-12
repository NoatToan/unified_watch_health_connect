package com.huami.device.event.br;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¨\u0006\r"}, d2 = {"Lcom/huami/device/event/br/DeviceLifeBroadCastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "Lcom/huami/device/event/br/DeviceInfoParcel;", "info", "handleStatus", "<init>", "()V", "devicelifeevent_release"}, k = 1, mv = {1, 4, 0})
public abstract class DeviceLifeBroadCastReceiver extends BroadcastReceiver {
    public abstract void handleStatus(@NotNull DeviceInfoParcel info);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        DeviceInfoParcel deviceInfoParcel;
        if (intent == null || context == null || (!Intrinsics.areEqual(intent.getAction(), DeviceLifeConst.ACTION)) || (deviceInfoParcel = (DeviceInfoParcel) intent.getParcelableExtra(DeviceLifeConst.ACTION_LIFE_EVENT_KEY)) == null) {
            return;
        }
        handleStatus(deviceInfoParcel);
    }
}
