package com.xiaomi.fitness.notify;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.notify.di.NotifyStartInterface;
import com.xiaomi.fitness.notify.init.NotifyComponent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/notify/NotifyStartImpl;", "Lcom/xiaomi/fitness/notify/di/NotifyStartInterface;", "<init>", "()V", "toggleNotificationListenerService", "", "provideNotificationService", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/notify/NotifySyncService;", "provideDeviceNotificationSettingManager", "Lcom/xiaomi/fitness/notify/DeviceNotificationSettingManager;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NotifyStartImpl implements NotifyStartInterface {

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyStartImpl$toggleNotificationListenerService$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyStartImpl$toggleNotificationListenerService$1", f = "NotifyStartImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Logger.e(NotifyComponent.TAG, "China toggleNotificationListenerService");
                PackageManager packageManager = ApplicationExtKt.getApplication().getPackageManager();
                packageManager.setComponentEnabledSetting(new ComponentName(ApplicationExtKt.getApplication(), (Class<?>) NotifySyncService.class), 2, 1);
                packageManager.setComponentEnabledSetting(new ComponentName(ApplicationExtKt.getApplication(), (Class<?>) NotifySyncService.class), 1, 1);
            } catch (IllegalArgumentException unused) {
                Logger.i("NOTIFICATION_SET", " toggleNotificationListenerService IllegalArgumentException");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.notify.di.NotifyStartInterface
    @Nullable
    public DeviceNotificationSettingManager provideDeviceNotificationSettingManager() {
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null) {
            return null;
        }
        if (DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return HuaMiNotifySettingImpl.INSTANCE.getInstance();
        }
        if (DeviceModelExtKt.isWearOS(wearableDeviceModel)) {
            return null;
        }
        return BleNotifySettingImpl.INSTANCE.getInstance();
    }

    @Override // com.xiaomi.fitness.notify.di.NotifyStartInterface
    @NotNull
    public Class<NotifySyncService> provideNotificationService() {
        return NotifySyncService.class;
    }

    @Override // com.xiaomi.fitness.notify.di.NotifyStartInterface
    public void toggleNotificationListenerService() {
        AnyExtKt.io$default(null, new AnonymousClass1(null), 1, null);
    }
}
