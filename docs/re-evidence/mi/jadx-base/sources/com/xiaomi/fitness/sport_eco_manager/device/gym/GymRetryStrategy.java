package com.xiaomi.fitness.sport_eco_manager.device.gym;

import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.connect.export.EcoExternalRetryStrategy;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManager;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceManagerExtKt;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModelExtKt;
import com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener;
import com.xiaomi.fitness.sport_eco_manager_export.di.SportEcoManagerExtKt;
import com.xiaomi.fitness.sport_eco_manager_export.launch.IEcoSportRemoteState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J*\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001a\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_eco_manager/device/gym/GymRetryStrategy;", "Lcom/xiaomi/fitness/connect/export/EcoExternalRetryStrategy;", "Lcom/xiaomi/fitness/eco/device/manager/export/OnEcoDeviceStatusListener;", "<init>", "()V", "TAG", "", "needRetry", "", "lastDisconnectTime", "", "onConnectStart", "", "did", "mac", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "sport-eco-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GymRetryStrategy implements EcoExternalRetryStrategy, OnEcoDeviceStatusListener {

    @NotNull
    public static final GymRetryStrategy INSTANCE = new GymRetryStrategy();

    @NotNull
    private static final String TAG = "GymRetryStrategy";
    private static long lastDisconnectTime;

    private GymRetryStrategy() {
    }

    @Override // com.xiaomi.fitness.connect.export.EcoExternalRetryStrategy
    public boolean needRetry() {
        int localSportState = SportEcoManagerExtKt.getInstance(IEcoSportRemoteState.INSTANCE).getLocalSportState();
        Logger.i(TAG, "needRetry: " + localSportState);
        return (localSportState == 4 || localSportState == 0) ? false : true;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectFailure(@Nullable String did, @NotNull String mac, int errorCode, int retryTimes) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        if (did == null || did.length() == 0) {
            return;
        }
        EcoDeviceModel ecoDeviceModel = (EcoDeviceModel) EcoDeviceManagerExtKt.getInstance(EcoDeviceManager.INSTANCE).getDeviceModel(did);
        if ((ecoDeviceModel == null || !EcoDeviceModelExtKt.isTreadmill(ecoDeviceModel)) && (ecoDeviceModel == null || !EcoDeviceModelExtKt.isExerciseBike(ecoDeviceModel))) {
            return;
        }
        lastDisconnectTime = 0L;
        EcoApiCallManager.INSTANCE.get().getMEcoApiCallConfig().registerRetryCondition(did, this);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
    }
}
