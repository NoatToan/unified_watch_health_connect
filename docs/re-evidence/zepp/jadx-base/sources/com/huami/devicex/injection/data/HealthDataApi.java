package com.huami.devicex.injection.data;

import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\u0013\u0010\r\u001a\u00020\fH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H&J\u001b\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0016H¦@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/huami/devicex/injection/data/HealthDataApi;", "", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "loadGetCombineStressBetweenStampUseCase", "Lcom/huami/devicex/injection/data/AllDayTempDaoApi;", "loadAllDayTempDaoApi", "Lcom/huami/devicex/injection/data/SingleTempDaoApi;", "loadSingleTempDaoApi", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "loadTempWebApi", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "healthWebApi", "", "atrialFibUseCaseSyncDeviceData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isSupportAtrialFib", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "syncDeviceSpo2Data", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "syncBloodPressureData", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncDeviceRespRateData", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface HealthDataApi {
    @Nullable
    Object atrialFibUseCaseSyncDeviceData(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    UserDataRemoteAPI healthWebApi();

    boolean isSupportAtrialFib(@NotNull HMDeviceType type);

    @NotNull
    AllDayTempDaoApi loadAllDayTempDaoApi();

    @NotNull
    GetCombineStressBetweenStampUseCase loadGetCombineStressBetweenStampUseCase();

    @NotNull
    SingleTempDaoApi loadSingleTempDaoApi();

    @NotNull
    TempWebApi loadTempWebApi();

    @Nullable
    Object syncBloodPressureData(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull Continuation<? super Unit> continuation);

    void syncDeviceRespRateData(@NotNull HMBaseDevice device);

    void syncDeviceSpo2Data(@NotNull HMBaseDevice device);
}
