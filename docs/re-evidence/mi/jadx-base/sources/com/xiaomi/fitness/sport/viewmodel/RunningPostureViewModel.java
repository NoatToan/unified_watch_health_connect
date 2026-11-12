package com.xiaomi.fitness.sport.viewmodel;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.bean.SportingData;
import com.xiaomi.fitness.sport.model.CommonSportModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0010H\u0014¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/viewmodel/RunningPostureViewModel;", "Lcom/xiaomi/fitness/sport/viewmodel/BaseSportVM;", "Lcom/xiaomi/fitness/sport/model/CommonSportModel;", "<init>", "()V", "onSportPaused", "", "onSuccess", "data", "Lcom/xiaomi/fitness/sport/bean/SportingData;", "onConnectSuccess", "did", "", "onDisconnect", "onConnectStart", "isNeedJumpSportDetailPage", "", "isSupportSportMusic", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RunningPostureViewModel extends BaseSportVM<CommonSportModel> {

    @NotNull
    public static final String TAG = "RunningPostureViewModel";

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public boolean isNeedJumpSportDetailPage() {
        return false;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM
    public boolean isSupportSportMusic() {
        return false;
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
        super.onConnectStart(did);
        Logger.i("onConnectStart", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        super.onConnectSuccess(did);
        Logger.i("onConnectSuccess", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
        super.onDisconnect(did);
        Logger.i("onDisconnect", new Object[0]);
    }

    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport_manager_export.listener.ISportStateChangedListener
    public void onSportPaused() {
        super.onSportPaused();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.sport.viewmodel.BaseSportVM, com.xiaomi.fitness.sport.interfaces.ISportDataListener
    public void onSuccess(@NotNull SportingData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        super.onSuccess(data);
        setCurDeviceDid(getDeviceDid());
        Logger.d(getTAG(), "sportGoalType " + ((CommonSportModel) getMModel()).getSportGoalType());
        Logger.d(getTAG(), "sportGoalValue " + ((CommonSportModel) getMModel()).getSportGoalValue());
        FitnessLogUtils.i(getTAG(), "DATA : " + data);
    }
}
