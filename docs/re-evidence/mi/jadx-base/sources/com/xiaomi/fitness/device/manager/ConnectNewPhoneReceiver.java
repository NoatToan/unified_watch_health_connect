package com.xiaomi.fitness.device.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.ConnectNewPhoneReceiver;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0002R+\u0010\u0004\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/device/manager/ConnectNewPhoneReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "deviceChange", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "Lkotlin/ParameterName;", "name", "deviceModel", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "removeDeviceChange", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ConnectNewPhoneReceiver extends BroadcastReceiver {

    @NotNull
    private static final String TAG = "ConnectNewPhoneReceiver";

    @NotNull
    private final Function1<WearableDeviceModel, Unit> deviceChange = new Function1() { // from class: ke4
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2(Object obj) {
            return ConnectNewPhoneReceiver.deviceChange$lambda$1(this.f23767a, (WearableDeviceModel) obj);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit deviceChange$lambda$1(ConnectNewPhoneReceiver this$0, WearableDeviceModel wearableDeviceModel) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (wearableDeviceModel != null) {
            Logger.i(TAG, "DeviceChange called " + wearableDeviceModel + " , is active " + wearableDeviceModel.getIsConnectActive());
            if (wearableDeviceModel.getIsCurrent() && !wearableDeviceModel.getIsConnectActive()) {
                DevicePreference.INSTANCE.setCONNECT_NEW_PHONE(true);
            }
        }
        this$0.removeDeviceChange();
        return Unit.INSTANCE;
    }

    private final void removeDeviceChange() {
        com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).removeDeviceChangeListener(this.deviceChange);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        Logger.i(TAG, "onReceive() called with: context = " + context + ", intent = " + intent);
        if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
            com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceChangeListener(this.deviceChange);
        } else {
            DevicePreference.INSTANCE.setCONNECT_NEW_PHONE(true);
        }
    }
}
