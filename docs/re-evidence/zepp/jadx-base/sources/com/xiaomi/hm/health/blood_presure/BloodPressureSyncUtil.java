package com.xiaomi.hm.health.blood_presure;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.rawdata_uploader.di.RawDataInterModuleKt;
import com.huami.rawdata_uploader.usecase.BloodPressureRawDataUseCase;
import com.huami.rawdata_uploader.usecase.BloodPressureRawDataWorkUseCase;
import com.huami.rawdata_uploader.vo.BLOOD_PRESSURE_CHARACTERISTIC;
import com.huami.rawdata_uploader.vo.BLOOD_PRESSURE_CORRECT_PPG;
import com.huami.rawdata_uploader.vo.BLOOD_PRESSURE_MEASURE_PPG;
import com.huami.rawdata_uploader.vo.IRawDataType;
import com.huami.rawdata_uploader.vo.RawDataDeviceInfo;
import com.huami.rawdata_uploader.vo.RawDataUserInfo;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.RawData;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.DataHeader;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.bloodpressure.BloodPressureMeasureResult;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import com.xiaomi.hm.health.device.health.blood_pressure.BloodPressureUtil;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.healthdata.bp.BloodPressureHelper;
import com.xiaomi.hm.health.healthdata.bp.BloodPressurePropertyRegistry;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J(\u0010\u0017\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0013\u0018\u0001*\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082\b¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/hm/health/blood_presure/BloodPressureSyncUtil;", "", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "", "h", GoogleApiAvailabilityLight.a, "f", "e", "g", "Lcom/huami/rawdata_uploader/vo/RawDataUserInfo;", "rawDataUserInfo", "Lcom/huami/rawdata_uploader/vo/RawDataDeviceInfo;", "rawDataDeviceInfo", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "data", "Lcom/huami/rawdata_uploader/vo/IRawDataType;", "dataDataType", "c", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "syncDeviceData", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureSyncUtil {

    @NotNull
    public static final BloodPressureSyncUtil INSTANCE = new BloodPressureSyncUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil$saveBPRawData$1$1", f = "BloodPressureSyncUtil.kt", i = {}, l = {WeightingState.state_low_power, 266}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BloodPressureRawDataUseCase b;
        public final /* synthetic */ RawDataUserInfo c;
        public final /* synthetic */ RawDataDeviceInfo d;
        public final /* synthetic */ HmGdspRawData e;
        public final /* synthetic */ IRawDataType f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BloodPressureRawDataUseCase bloodPressureRawDataUseCase, RawDataUserInfo rawDataUserInfo, RawDataDeviceInfo rawDataDeviceInfo, HmGdspRawData hmGdspRawData, IRawDataType iRawDataType, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = bloodPressureRawDataUseCase;
            this.c = rawDataUserInfo;
            this.d = rawDataDeviceInfo;
            this.e = hmGdspRawData;
            this.f = iRawDataType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            BloodPressureRawDataUseCase bloodPressureRawDataUseCase;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            BloodPressureHelper bloodPressureHelper = BloodPressureHelper.INSTANCE;
            this.a = 1;
            obj = bloodPressureHelper.getBPRawDataEnable(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue() && (bloodPressureRawDataUseCase = this.b) != null) {
                RawDataUserInfo rawDataUserInfo = this.c;
                RawDataDeviceInfo rawDataDeviceInfo = this.d;
                HmGdspRawData hmGdspRawData = this.e;
                IRawDataType iRawDataType = this.f;
                BloodPressureRawDataWorkUseCase bloodPressureRawDataWorkUseCase = new BloodPressureRawDataWorkUseCase(bloodPressureRawDataUseCase);
                byte[] rawData = hmGdspRawData.getRawData();
                long timeInMillis = hmGdspRawData.getCal().getTimeInMillis();
                this.a = 2;
                if (bloodPressureRawDataWorkUseCase.saveRawDataAndPostByWorkSuspend(rawDataUserInfo, rawDataDeviceInfo, rawData, timeInMillis, iRawDataType, (32 & 32) != 0 ? null : null, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private BloodPressureSyncUtil() {
    }

    private final /* synthetic */ <T> T a(Scope scope, Qualifier qualifier) {
        Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeRawDataKoinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object b(BloodPressureSyncUtil bloodPressureSyncUtil, Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopeRawDataKoinScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(RawDataUserInfo rawDataUserInfo, RawDataDeviceInfo rawDataDeviceInfo, HmGdspRawData data, IRawDataType dataDataType) {
        Scope scopeRawDataKoinScope = RawDataInterModuleKt.rawDataKoinScope();
        BloodPressureRawDataUseCase bloodPressureRawDataUseCase = scopeRawDataKoinScope == null ? null : (BloodPressureRawDataUseCase) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope.getKoin()).get(Reflection.getOrCreateKotlinClass(BloodPressureRawDataUseCase.class), null, null);
        Scope scopeRawDataKoinScope2 = RawDataInterModuleKt.rawDataKoinScope();
        CoroutineScope coroutineScope = scopeRawDataKoinScope2 != null ? (CoroutineScope) RawDataInterModuleKt.rawDataKoinScope(scopeRawDataKoinScope2.getKoin()).get(Reflection.getOrCreateKotlinClass(CoroutineScope.class), null, null) : null;
        if (coroutineScope == null) {
            return;
        }
        e.f(coroutineScope, null, null, new a(bloodPressureRawDataUseCase, rawDataUserInfo, rawDataDeviceInfo, data, dataDataType, null), 3, null);
    }

    private final void d(HMMiLiProDevice device) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(BloodPressurePropertyRegistry.INSTANCE.getBloodPressureMeasuredDataTime());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        device.syncBloodPressureResultData(calendar, new IGdspSyncCallback<BloodPressureMeasureResult>() { // from class: com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil$syncBloodPressureResult$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends BloodPressureMeasureResult> data) {
                BloodPressureHelper.INSTANCE.saveBloodPressureAndPost(data);
                BloodPressurePropertyRegistry.INSTANCE.saveBloodPressureMeasuredDataTime(System.currentTimeMillis());
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
            }
        });
        countDownLatch.await();
    }

    private final void e(final HMMiLiProDevice device) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(BloodPressurePropertyRegistry.INSTANCE.getBpFeatureTime());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        device.startSyncRawData(calendar, 53, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil$syncCharacteristicData$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData t) {
                super.onData(t);
                if (t == null) {
                    return;
                }
                HMMiLiProDevice hMMiLiProDevice = device;
                BloodPressurePropertyRegistry.INSTANCE.saveBpFeatureTime(t.getCal().getTimeInMillis() + 1000);
                String strUserId = AccountServiceExtKt.userId(AccountModuleKt.getAccountService());
                if (strUserId == null) {
                    strUserId = "";
                }
                RawDataUserInfo rawDataUserInfo = new RawDataUserInfo(strUserId, HMAppConfig.getPackageName());
                int value = hMMiLiProDevice.getDeviceInfo().getDeviceSource().getValue();
                int value2 = hMMiLiProDevice.getMDeviceSource().getType().getValue();
                String deviceID = hMMiLiProDevice.getDeviceInfo().getDeviceID();
                String address = hMMiLiProDevice.getAddress();
                if (address == null) {
                    address = EcgData.DEFAULT_DIGIT_VALUE;
                }
                BloodPressureSyncUtil.INSTANCE.c(rawDataUserInfo, new RawDataDeviceInfo(value, value2, deviceID, address, hMMiLiProDevice.getDeviceInfo().getFirmwareVersionStr(), hMMiLiProDevice.getDeviceInfo().getSerialNumber()), t, BLOOD_PRESSURE_CHARACTERISTIC.INSTANCE);
            }
        });
        countDownLatch.await();
    }

    private final void f(final HMMiLiProDevice device) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(BloodPressurePropertyRegistry.INSTANCE.getBpCalibrationTime());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        device.startSyncRawData(calendar, 52, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil$syncCorrectPpgData$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData t) {
                super.onData(t);
                if (t == null) {
                    return;
                }
                HMMiLiProDevice hMMiLiProDevice = device;
                BloodPressurePropertyRegistry.INSTANCE.saveBpCalibrationTime(t.getCal().getTimeInMillis() + 1000);
                String strUserId = AccountServiceExtKt.userId(AccountModuleKt.getAccountService());
                if (strUserId == null) {
                    strUserId = "";
                }
                RawDataUserInfo rawDataUserInfo = new RawDataUserInfo(strUserId, HMAppConfig.getPackageName());
                int value = hMMiLiProDevice.getDeviceInfo().getDeviceSource().getValue();
                int value2 = hMMiLiProDevice.getMDeviceSource().getType().getValue();
                String deviceID = hMMiLiProDevice.getDeviceInfo().getDeviceID();
                String address = hMMiLiProDevice.getAddress();
                if (address == null) {
                    address = EcgData.DEFAULT_DIGIT_VALUE;
                }
                BloodPressureSyncUtil.INSTANCE.c(rawDataUserInfo, new RawDataDeviceInfo(value, value2, deviceID, address, hMMiLiProDevice.getDeviceInfo().getFirmwareVersionStr(), hMMiLiProDevice.getDeviceInfo().getSerialNumber()), t, BLOOD_PRESSURE_CORRECT_PPG.INSTANCE);
            }
        });
        countDownLatch.await();
    }

    private final void g(final HMMiLiProDevice device) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(BloodPressurePropertyRegistry.INSTANCE.getBpMeasuredRawDataTime());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        device.startSyncRawData(calendar, 54, new HMCallback<HmGdspRawData>() { // from class: com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil$syncMeasurePpgData$1
            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                super.onFinish(result);
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onData(@Nullable HmGdspRawData t) {
                super.onData(t);
                if (t == null) {
                    return;
                }
                HMMiLiProDevice hMMiLiProDevice = device;
                BloodPressurePropertyRegistry.INSTANCE.saveBpMeasuredRawDataTime(t.getCal().getTimeInMillis() + 1000);
                String strUserId = AccountServiceExtKt.userId(AccountModuleKt.getAccountService());
                if (strUserId == null) {
                    strUserId = "";
                }
                RawDataUserInfo rawDataUserInfo = new RawDataUserInfo(strUserId, HMAppConfig.getPackageName());
                int value = hMMiLiProDevice.getDeviceInfo().getDeviceSource().getValue();
                int value2 = hMMiLiProDevice.getMDeviceSource().getType().getValue();
                String deviceID = hMMiLiProDevice.getDeviceInfo().getDeviceID();
                String address = hMMiLiProDevice.getAddress();
                if (address == null) {
                    address = EcgData.DEFAULT_DIGIT_VALUE;
                }
                BloodPressureSyncUtil.INSTANCE.c(rawDataUserInfo, new RawDataDeviceInfo(value, value2, deviceID, address, hMMiLiProDevice.getDeviceInfo().getFirmwareVersionStr(), hMMiLiProDevice.getDeviceInfo().getSerialNumber()), t, BLOOD_PRESSURE_MEASURE_PPG.INSTANCE);
            }
        });
        countDownLatch.await();
    }

    private final void h(HMMiLiProDevice device) throws InterruptedException {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(BloodPressurePropertyRegistry.INSTANCE.getBpNightTime());
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        device.syncSleepBPResultData(calendar, new IGdspSyncCallback<BloodPressureMeasureResult>() { // from class: com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil$syncSleepBloodPressureData$1
            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onAllRawData(@NotNull List<RawData> data) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onData(@NotNull List<? extends BloodPressureMeasureResult> data) {
                BloodPressureHelper.INSTANCE.saveNightBloodPressureAndPost(data);
                BloodPressurePropertyRegistry.INSTANCE.saveBpNightTime(System.currentTimeMillis());
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onDataHeader(@NotNull DataHeader header) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onProgress(long current, long total) {
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onResult(@NotNull GDSPErrorCode code) {
                countDownLatch.countDown();
            }

            @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback
            public void onStart() {
            }
        });
        countDownLatch.await();
    }

    @Nullable
    public final Object syncDeviceData(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull Continuation<? super Unit> continuation) throws InterruptedException {
        if (!BloodPressureUtil.INSTANCE.isSupportBloodPressure(hMMiLiProDevice)) {
            return Unit.INSTANCE;
        }
        d(hMMiLiProDevice);
        h(hMMiLiProDevice);
        g(hMMiLiProDevice);
        f(hMMiLiProDevice);
        e(hMMiLiProDevice);
        return Unit.INSTANCE;
    }
}
