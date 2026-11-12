package com.xiaomi.fitness.devicesettings.utils;

import android.app.NotificationManager;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.Feature;
import defpackage.fxo;
import defpackage.s7r;
import defpackage.txo;
import defpackage.vxo;
import defpackage.yxo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0012\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u000e\u0010\u0011\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0012J*\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00072\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0007J\b\u0010\u001b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/utils/ZenUtils;", "", "<init>", "()V", "sTag", "", "preValue", "", "contentObserver", "com/xiaomi/fitness/devicesettings/utils/ZenUtils$contentObserver$1", "Lcom/xiaomi/fitness/devicesettings/utils/ZenUtils$contentObserver$1;", "unRegisterZenListener", "", "registerZenListener", "isSupportZenMode", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "postDeviceNoPermission", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSyncZenMode", "setZenModeSyncWithPhone", "syncWithPhone", "setZenModeSyncWithPhoneResult", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postSetZenMode", "isOpen", "isZenModeOpen", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ZenUtils {

    @NotNull
    public static final ZenUtils INSTANCE;

    @NotNull
    private static final ZenUtils$contentObserver$1 contentObserver;
    private static boolean preValue = false;

    @NotNull
    public static final String sTag = "zenMode";

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.utils.ZenUtils$postDeviceNoPermission$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.utils.ZenUtils$postDeviceNoPermission$2", f = "ZenUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 64;
            txo txoVar = new txo();
            fxo fxoVar = new fxo();
            fxoVar.c = 1;
            txoVar.f0(fxoVar);
            s7rVar.c0(txoVar);
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.utils.ZenUtils$postSyncZenMode$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.utils.ZenUtils$postSyncZenMode$2", f = "ZenUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22392 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C22392(Continuation<? super C22392> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22392(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 23;
            s7rVar.c0(new txo());
            s7rVar.E().p0(new yxo());
            ZenUtils.preValue = ZenUtils.INSTANCE.isZenModeOpen();
            Logger.i(ZenUtils.sTag, "postSyncZenMode preValue:" + ZenUtils.preValue);
            s7rVar.E().J().c = ZenUtils.preValue ? 0 : 2;
            DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, false, null, 0, 12, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22392) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.utils.ZenUtils$setZenModeSyncWithPhone$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.devicesettings.utils.ZenUtils$setZenModeSyncWithPhone$2", f = "ZenUtils.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C22402 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Boolean, Unit> $setZenModeSyncWithPhoneResult;
        final /* synthetic */ boolean $syncWithPhone;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C22402(boolean z, Function1<? super Boolean, Unit> function1, Continuation<? super C22402> continuation) {
            super(2, continuation);
            this.$syncWithPhone = z;
            this.$setZenModeSyncWithPhoneResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C22402(this.$syncWithPhone, this.$setZenModeSyncWithPhoneResult, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            s7r s7rVar = new s7r();
            s7rVar.e = 2;
            s7rVar.f = 15;
            vxo.b bVar = new vxo.b();
            bVar.c = this.$syncWithPhone;
            txo txoVar = new txo();
            vxo vxoVar = new vxo();
            vxoVar.d = bVar;
            txoVar.m0(vxoVar);
            s7rVar.c0(txoVar);
            DeviceContact deviceSyncExtKt = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE);
            final Function1<Boolean, Unit> function1 = this.$setZenModeSyncWithPhoneResult;
            DeviceContact.DefaultImpls.call$default(deviceSyncExtKt, s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.utils.ZenUtils.setZenModeSyncWithPhone.2.1
                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onError(String did, int type, int code) {
                    Logger.i(ZenUtils.sTag, "Zen Mode Sync With Phone onError: code = " + code + " type = " + type + " did = " + did);
                    function1.invoke2(Boolean.FALSE);
                }

                @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                public void onSuccess(String did, int type, SyncResult result) {
                    Logger.i(ZenUtils.sTag, "Zen Mode Sync With Phone onSuccess!");
                    function1.invoke2(Boolean.TRUE);
                }
            }, 0, 8, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C22402) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.fitness.devicesettings.utils.ZenUtils$contentObserver$1] */
    static {
        ZenUtils zenUtils = new ZenUtils();
        INSTANCE = zenUtils;
        preValue = zenUtils.isZenModeOpen();
        contentObserver = new ContentObserver() { // from class: com.xiaomi.fitness.devicesettings.utils.ZenUtils$contentObserver$1
            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                super.onChange(selfChange);
                AnyExtKt.io$default(null, new ZenUtils$contentObserver$1$onChange$1(null), 1, null);
            }
        };
    }

    private ZenUtils() {
    }

    public static /* synthetic */ boolean isSupportZenMode$default(ZenUtils zenUtils, WearableDeviceModel wearableDeviceModel, int i, Object obj) {
        if ((i & 1) != 0) {
            wearableDeviceModel = null;
        }
        return zenUtils.isSupportZenMode(wearableDeviceModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isZenModeOpen() {
        Object systemService = ApplicationExtKt.getApplication().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        int currentInterruptionFilter = ((NotificationManager) systemService).getCurrentInterruptionFilter();
        Logger.i(sTag, "currentInterruptionFilter currentInterruptionFilter:" + currentInterruptionFilter);
        return currentInterruptionFilter != 1;
    }

    private final void unRegisterZenListener() {
        if (isSupportZenMode$default(this, null, 1, null)) {
            ApplicationExtKt.getApplication().getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public final boolean isSupportZenMode(@Nullable WearableDeviceModel deviceModel) {
        boolean z = Build.VERSION.SDK_INT >= 35;
        if (deviceModel == null) {
            deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        }
        Logger.i(sTag, " isSupportZenMode isAboveAndroid15:" + z);
        return (z || deviceModel == null || !DeviceModelExtKt.isSupportFeature(deviceModel, Feature.QUIET_MODE)) ? false : true;
    }

    @Nullable
    public final Object postDeviceNoPermission(@NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void postSetZenMode(boolean isOpen) {
        if (!isSupportZenMode$default(this, null, 1, null)) {
            Logger.i(sTag, "postSetZenMode isSupportZenMode false");
            return;
        }
        Logger.i(sTag, "unRegisterZenListener before setZenModeOpen pid:" + Process.myPid());
        preValue = isOpen;
        unRegisterZenListener();
        Object systemService = ApplicationExtKt.getApplication().getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        int i = isOpen ? 2 : 1;
        Logger.i(sTag, "setZenModeOpen isOpen:" + isOpen + "  filter:" + i);
        notificationManager.setInterruptionFilter(i);
        Logger.i(sTag, "registerZenListener end setZenModeOpen");
        registerZenListener();
    }

    @Nullable
    public final Object postSyncZenMode(@NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C22392(null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void registerZenListener() {
        if (isSupportZenMode$default(this, null, 1, null)) {
            ApplicationExtKt.getApplication().getContentResolver().registerContentObserver(Settings.Global.getUriFor("zen_mode"), true, contentObserver);
        }
    }

    @Nullable
    public final Object setZenModeSyncWithPhone(boolean z, @NotNull Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C22402(z, function1, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }
}
