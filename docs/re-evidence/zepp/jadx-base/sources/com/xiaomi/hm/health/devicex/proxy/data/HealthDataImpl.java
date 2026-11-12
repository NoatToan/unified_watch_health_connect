package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.devicex.injection.data.AllDayTempDaoApi;
import com.huami.devicex.injection.data.HealthDataApi;
import com.huami.devicex.injection.data.SingleTempDaoApi;
import com.huami.respiratoryrate.bluetooth.usecase.SyncDeviceDataUseCase;
import com.huami.respiratoryrate.core.koin.RespRateKoinScopeKt;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.xiaomi.hm.health.atrialfibrillation.AtrialFibUseCaseUtils;
import com.xiaomi.hm.health.blood_presure.BloodPressureSyncUtil;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.health.device.AtrialManagerKt;
import com.xiaomi.hm.health.di.koin.spo2.Spo2Proxy;
import com.xiaomi.hm.health.healthdata.core.HealthDataDb;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import com.xiaomi.hm.health.stress.StressScopeNamesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.scope.Scope;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0013\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u001b\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0018H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/HealthDataImpl;", "Lcom/huami/devicex/injection/data/HealthDataApi;", "Lorg/koin/core/scope/Scope;", "b", "c", "Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "a", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "loadGetCombineStressBetweenStampUseCase", "Lcom/huami/devicex/injection/data/AllDayTempDaoApi;", "loadAllDayTempDaoApi", "Lcom/huami/devicex/injection/data/SingleTempDaoApi;", "loadSingleTempDaoApi", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "loadTempWebApi", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "healthWebApi", "", "atrialFibUseCaseSyncDeviceData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "", "isSupportAtrialFib", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "syncDeviceSpo2Data", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "syncBloodPressureData", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncDeviceRespRateData", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDataImpl implements HealthDataApi {
    private final HealthDataDb a() {
        return (HealthDataDb) c().get(Reflection.getOrCreateKotlinClass(HealthDataDb.class), null, null);
    }

    private final Scope b() {
        return ScopesKt.temperatureScope(KoinJavaComponent.getKoin());
    }

    private final Scope c() {
        return Koin.getOrCreateScope$default(KoinJavaComponent.getKoin(), "health_data", QualifierKt.named("health_data"), null, 4, null);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @Nullable
    public Object atrialFibUseCaseSyncDeviceData(@NotNull Continuation<? super Unit> continuation) throws SyncException {
        Object objSyncDeviceData = AtrialFibUseCaseUtils.INSTANCE.syncDeviceData(continuation);
        return objSyncDeviceData == a.getCOROUTINE_SUSPENDED() ? objSyncDeviceData : Unit.INSTANCE;
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @NotNull
    public UserDataRemoteAPI healthWebApi() {
        return (UserDataRemoteAPI) c().get(Reflection.getOrCreateKotlinClass(UserDataRemoteAPI.class), null, null);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    public boolean isSupportAtrialFib(@NotNull HMDeviceType type) {
        return AtrialManagerKt.isSupportAtrialFib(type);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @NotNull
    public AllDayTempDaoApi loadAllDayTempDaoApi() {
        return (AllDayTempDaoApi) b().get(Reflection.getOrCreateKotlinClass(AllDayTempDaoApi.class), null, null);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @NotNull
    public GetCombineStressBetweenStampUseCase loadGetCombineStressBetweenStampUseCase() {
        return (GetCombineStressBetweenStampUseCase) StressScopeNamesKt.stressScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(GetCombineStressBetweenStampUseCase.class), null, null);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @NotNull
    public SingleTempDaoApi loadSingleTempDaoApi() {
        return (SingleTempDaoApi) b().get(Reflection.getOrCreateKotlinClass(SingleTempDaoApi.class), null, null);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @NotNull
    public TempWebApi loadTempWebApi() {
        return (TempWebApi) ScopesKt.temperatureScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(TempWebApi.class), null, null);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    @Nullable
    public Object syncBloodPressureData(@NotNull HMMiLiProDevice hMMiLiProDevice, @NotNull Continuation<? super Unit> continuation) throws InterruptedException {
        Object objSyncDeviceData = BloodPressureSyncUtil.INSTANCE.syncDeviceData(hMMiLiProDevice, continuation);
        return objSyncDeviceData == a.getCOROUTINE_SUSPENDED() ? objSyncDeviceData : Unit.INSTANCE;
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    public void syncDeviceRespRateData(@NotNull HMBaseDevice device) {
        ((SyncDeviceDataUseCase) RespRateKoinScopeKt.getRespRateKoinScope().get(Reflection.getOrCreateKotlinClass(SyncDeviceDataUseCase.class), null, null)).execute(device);
    }

    @Override // com.huami.devicex.injection.data.HealthDataApi
    public void syncDeviceSpo2Data(@NotNull HMBaseDevice device) {
        Spo2Proxy.INSTANCE.syncFromDevice(device);
    }
}
