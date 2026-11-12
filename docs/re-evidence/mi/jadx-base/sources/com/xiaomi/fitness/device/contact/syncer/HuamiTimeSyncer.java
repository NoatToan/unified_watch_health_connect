package com.xiaomi.fitness.device.contact.syncer;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.device.contact.export.DeviceSyncCallback;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.syncer.HuamiTimeSyncer;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/device/contact/syncer/HuamiTimeSyncer;", "Lcom/xiaomi/fitness/device/contact/syncer/TimeSyncer;", "<init>", "()V", "syncData", "", "did", "", "callBack", "Lcom/xiaomi/fitness/device/contact/export/DeviceSyncCallback;", "getApiCaller", "Lcom/xiaomi/fitness/device/manager/export/HuamiApiCaller;", "Companion", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiTimeSyncer extends TimeSyncer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<HuamiTimeSyncer> instance$delegate = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, new Function0() { // from class: vmc
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HuamiTimeSyncer.instance_delegate$lambda$0();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/device/contact/syncer/HuamiTimeSyncer$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fitness/device/contact/syncer/HuamiTimeSyncer;", "getInstance", "()Lcom/xiaomi/fitness/device/contact/syncer/HuamiTimeSyncer;", "instance$delegate", "Lkotlin/Lazy;", "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final HuamiTimeSyncer getInstance() {
            return (HuamiTimeSyncer) HuamiTimeSyncer.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.syncer.HuamiTimeSyncer$syncData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.syncer.HuamiTimeSyncer$syncData$1", f = "HuamiTimeSyncer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ DeviceSyncCallback $callBack;
        final /* synthetic */ String $did;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, DeviceSyncCallback deviceSyncCallback, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$did = str;
            this.$callBack = deviceSyncCallback;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HuamiTimeSyncer.this.new AnonymousClass1(this.$did, this.$callBack, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HuamiApiCaller apiCaller = HuamiTimeSyncer.this.getApiCaller(this.$did);
            if (apiCaller != null) {
                boolean timeUnitSync = apiCaller.setTimeUnitSync(TimeDateUtil.INSTANCE.is12HourFormat(ApplicationExtKt.getApplication()));
                boolean dateTimeSync = apiCaller.setDateTimeSync(Calendar.getInstance());
                DeviceSyncExtKt.logi("sync hua mi time, result is " + dateTimeSync);
                DeviceSyncCallback deviceSyncCallback = this.$callBack;
                if (deviceSyncCallback != null) {
                    if (timeUnitSync && dateTimeSync) {
                        deviceSyncCallback.onSyncSuccess(this.$did, 4, null);
                    } else {
                        deviceSyncCallback.onSyncError(this.$did, 4, "setTimeUnitSync failure");
                    }
                }
            } else {
                DeviceSyncCallback deviceSyncCallback2 = this.$callBack;
                if (deviceSyncCallback2 != null) {
                    deviceSyncCallback2.onSyncError(this.$did, 4, "huami device == null");
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private HuamiTimeSyncer() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HuamiApiCaller getApiCaller(String did) {
        String mac;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        if (wearableDeviceModel == null || (mac = DeviceModelExtKt.getMac(wearableDeviceModel)) == null) {
            return null;
        }
        return deviceManagerExtKt.getHuaMiApiCaller(mac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HuamiTimeSyncer instance_delegate$lambda$0() {
        return new HuamiTimeSyncer();
    }

    @Override // com.xiaomi.fitness.device.contact.syncer.TimeSyncer, com.xiaomi.fitness.device.contact.export.DeviceSyncer
    public void syncData(@NotNull String did, @Nullable DeviceSyncCallback callBack) {
        Intrinsics.checkNotNullParameter(did, "did");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new AnonymousClass1(did, callBack, null), 3, null);
    }
}
