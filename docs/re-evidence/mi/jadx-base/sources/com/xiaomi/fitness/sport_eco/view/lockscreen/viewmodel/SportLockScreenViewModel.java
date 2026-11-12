package com.xiaomi.fitness.sport_eco.view.lockscreen.viewmodel;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_eco.bean.SportingData;
import com.xiaomi.fitness.sport_eco.model.CommonSportModel;
import com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sport_eco/view/lockscreen/viewmodel/SportLockScreenViewModel;", "Lcom/xiaomi/fitness/sport_eco/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport_eco/model/CommonSportModel;", "<init>", "()V", "onSportPaused", "", "onSuccess", "data", "Lcom/xiaomi/fitness/sport_eco/bean/SportingData;", "onConnectSuccess", "did", "", "mac", "onDisconnect", "onConnectStart", "sport-eco_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportLockScreenViewModel extends BaseSportVM<CommonSportModel> {
    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectStart(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        super.onConnectStart(did, mac);
        Logger.d("SportLockScreenViewModel onConnectStart", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onConnectSuccess(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        super.onConnectSuccess(did, mac);
        Logger.d("SportLockScreenViewModel onConnectSuccess", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.eco.device.manager.export.OnEcoDeviceStatusListener
    public void onDisconnect(@Nullable String did, @NotNull String mac) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        super.onDisconnect(did, mac);
        Logger.d("SportLockScreenViewModel onDisconnect", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        super.onSportPaused();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport_eco.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_eco.interfaces.ISportDataListener
    public void onSuccess(@NotNull SportingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.onSuccess(data);
        setCurDeviceDid(getDeviceDid());
        Logger.d("sportGoalType " + ((CommonSportModel) getMModel()).getSportGoalType(), new Object[0]);
        Logger.d("sportGoalValue " + ((CommonSportModel) getMModel()).getSportGoalValue(), new Object[0]);
        Logger.d("DATA : " + data, new Object[0]);
    }
}
