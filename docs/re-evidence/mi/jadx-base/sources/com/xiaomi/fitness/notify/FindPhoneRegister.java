package com.xiaomi.fitness.notify;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Process;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelper;
import com.xiaomi.fitness.devicesettings.export.FindPhoneHelperExtKt;
import com.xiaomi.fitness.notify.FindPhoneRegister;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/FindPhoneRegister;", "", "<init>", "()V", "mFindPhoneReceiver", "Landroid/content/BroadcastReceiver;", "registerReceiver", "", "unregisterReceiver", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FindPhoneRegister {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<FindPhoneRegister> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: qn9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FindPhoneRegister.instance_delegate$lambda$0();
        }
    });

    @NotNull
    private final BroadcastReceiver mFindPhoneReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.notify.FindPhoneRegister$mFindPhoneReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String did;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(intent, "intent");
            Logger.i(BaseNotifySyncService.TAG, "mFindPhoneReceiver  action:" + intent.getAction() + " pid:" + Process.myPid());
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode != -1454123155) {
                    if (iHashCode != 823795052) {
                        if (iHashCode != 1666222005 || !action.equals(Constant.FIND_PHONE_END)) {
                            return;
                        }
                    } else if (!action.equals("android.intent.action.USER_PRESENT")) {
                        return;
                    }
                } else if (!action.equals("android.intent.action.SCREEN_ON")) {
                    return;
                }
                WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
                if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
                    did = "";
                }
                Logger.i(BaseNotifySyncService.TAG, "mFindPhoneReceiver  stop  did:" + did);
                FindPhoneHelperExtKt.getInstance(FindPhoneHelper.INSTANCE).stop(did);
            }
        }
    };

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/notify/FindPhoneRegister$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/notify/FindPhoneRegister;", "getInstance", "()Lcom/xiaomi/fitness/notify/FindPhoneRegister;", "instance$delegate", "Lkotlin/Lazy;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FindPhoneRegister getInstance() {
            return (FindPhoneRegister) FindPhoneRegister.instance$delegate.getValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FindPhoneRegister instance_delegate$lambda$0() {
        return new FindPhoneRegister();
    }

    public final void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction(Constant.FIND_PHONE_END);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(this.mFindPhoneReceiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(this.mFindPhoneReceiver, intentFilter);
        }
    }

    public final void unregisterReceiver() {
        ApplicationExtKt.getApplication().unregisterReceiver(this.mFindPhoneReceiver);
    }
}
