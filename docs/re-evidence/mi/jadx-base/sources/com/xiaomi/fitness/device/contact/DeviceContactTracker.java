package com.xiaomi.fitness.device.contact;

import com.amap.api.maps.model.MyLocationStyle;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.report.GetDeviceCSVFiles;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceTool;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.main.export.ConfigPreference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000fJ0\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/device/contact/DeviceContactTracker;", "", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "DEVICE_SUPPORT_CAPABILITY_STATISTICS", "", "getDEVICE_SUPPORT_CAPABILITY_STATISTICS", "()I", "track", "", "syncSuccess", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "startTime", "", "isAuto", "syncTrack", "type", "did", MyLocationStyle.ERROR_INFO, "device-contact_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceContactTracker {

    @NotNull
    public static final DeviceContactTracker INSTANCE = new DeviceContactTracker();

    @NotNull
    private static final String TAG = "DeviceContactTracker";
    private static final int DEVICE_SUPPORT_CAPABILITY_STATISTICS = 8;

    /* JADX INFO: renamed from: com.xiaomi.fitness.device.contact.DeviceContactTracker$syncTrack$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.device.contact.DeviceContactTracker$syncTrack$1", f = "DeviceContactTracker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WearableDeviceModel $deviceModel;
        final /* synthetic */ Object $errorInfo;
        final /* synthetic */ long $startTime;
        final /* synthetic */ boolean $syncSuccess;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, boolean z, WearableDeviceModel wearableDeviceModel, long j, Object obj, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$type = i;
            this.$syncSuccess = z;
            this.$deviceModel = wearableDeviceModel;
            this.$startTime = j;
            this.$errorInfo = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$type, this.$syncSuccess, this.$deviceModel, this.$startTime, this.$errorInfo, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            String tag = DeviceContactTracker.INSTANCE.getTAG();
            int i = this.$type;
            boolean z = this.$syncSuccess;
            String model = DeviceModelExtKt.getModel(this.$deviceModel);
            String name = DeviceModelExtKt.getName(this.$deviceModel);
            String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(this.$deviceModel);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.$startTime;
            long j = 1000;
            Logger.d(tag, "type is " + i + " syncSuccess is " + z + " deviceModel.model is " + model + "deviceModel.name is " + name + " deviceModel.firmwareVersion is " + firmwareVersion + "duration time is " + (jCurrentTimeMillis / j) + " error_info is " + this.$errorInfo);
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("connect_v3", "56.49.2.1.21259");
            Object[] objArr = new Object[14];
            objArr[0] = "data_type";
            objArr[1] = Boxing.boxInt(this.$type);
            objArr[2] = "result";
            objArr[3] = Boxing.boxBoolean(this.$syncSuccess);
            objArr[4] = "device_model";
            objArr[5] = DeviceModelExtKt.getModel(this.$deviceModel);
            objArr[6] = "device_name";
            objArr[7] = DeviceModelExtKt.getName(this.$deviceModel);
            objArr[8] = "device_version";
            String firmwareVersion2 = DeviceModelExtKt.getFirmwareVersion(this.$deviceModel);
            if (firmwareVersion2 == null) {
                firmwareVersion2 = "";
            }
            objArr[9] = firmwareVersion2;
            objArr[10] = "duration_sec";
            objArr[11] = Boxing.boxLong((System.currentTimeMillis() - this.$startTime) / j);
            objArr[12] = "error_info";
            Object obj2 = this.$errorInfo;
            objArr[13] = obj2 != null ? obj2 : "";
            oneTrackExtKt.reportData(oneTrackStatBean, objArr);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private DeviceContactTracker() {
    }

    public final int getDEVICE_SUPPORT_CAPABILITY_STATISTICS() {
        return DEVICE_SUPPORT_CAPABILITY_STATISTICS;
    }

    @NotNull
    public final String getTAG() {
        return TAG;
    }

    public final void syncTrack(int type, boolean syncSuccess, @NotNull String did, long startTime, @Nullable Object errorInfo) {
        Intrinsics.checkNotNullParameter(did, "did");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        if (wearableDeviceModel == null) {
            return;
        }
        AnyExtKt.io$default(null, new AnonymousClass1(type, syncSuccess, wearableDeviceModel, startTime, errorInfo, null), 1, null);
    }

    public final void track(boolean syncSuccess, @NotNull WearableDeviceModel deviceModel, long startTime, boolean isAuto) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
        OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("connect_v3", "56.8.3.1.15237");
        Object[] objArr = new Object[12];
        objArr[0] = "name";
        objArr[1] = "sync_process";
        objArr[2] = "result";
        objArr[3] = Boolean.valueOf(syncSuccess);
        objArr[4] = "device_model";
        objArr[5] = DeviceModelExtKt.getModel(deviceModel);
        objArr[6] = "device_version";
        String firmwareVersion = DeviceModelExtKt.getFirmwareVersion(deviceModel);
        if (firmwareVersion == null) {
            firmwareVersion = "";
        }
        objArr[7] = firmwareVersion;
        objArr[8] = "duration_sec";
        objArr[9] = Long.valueOf((System.currentTimeMillis() - startTime) / ((long) 1000));
        objArr[10] = "is_auto";
        objArr[11] = Boolean.valueOf(isAuto);
        oneTrackExtKt.reportData(oneTrackStatBean, objArr);
        int deviceCapability = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapability(deviceModel.getDid());
        int i = DEVICE_SUPPORT_CAPABILITY_STATISTICS;
        int i2 = deviceCapability & i;
        if (!DeviceModelExtKt.isHuaMi(deviceModel) && i2 == i && ConfigPreference.INSTANCE.getIS_SUPPORT_DEVICE_STATISTICS()) {
            GetDeviceCSVFiles.INSTANCE.sendUploadCsvFilesToApp(deviceModel);
        } else if (DeviceModelExtKt.isL66(deviceModel)) {
            DeviceManagerExtKt.getInstance(DeviceTool.INSTANCE).syncHuamiStatisticData();
        }
    }
}
