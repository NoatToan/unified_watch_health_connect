package com.xiaomi.hm.health.running.treadmill.ext;

import com.huami.treadmill.data.InMachineStatus;
import com.huami.treadmill.data.InProgress;
import com.huami.treadmill.data.InTreadmillData;
import com.xiaomi.hm.health.bt.profile.ftms.MachineStatus;
import com.xiaomi.hm.health.bt.profile.ftms.TreadmillData;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/ftms/TreadmillData;", "Lcom/huami/treadmill/data/InTreadmillData;", "toInTreadmillData", "Lcom/xiaomi/hm/health/bt/profile/ftms/MachineStatus;", "Lcom/huami/treadmill/data/InMachineStatus;", "toInMachineStatus", "Lcom/xiaomi/hm/health/bt/profile/mili/model/Progress;", "Lcom/huami/treadmill/data/InProgress;", "toInProgress", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class DataExKt {
    @NotNull
    public static final InMachineStatus toInMachineStatus(@NotNull MachineStatus machineStatus) {
        InMachineStatus inMachineStatus = new InMachineStatus();
        inMachineStatus.setOp((byte) machineStatus.getOp());
        inMachineStatus.setData(machineStatus.getData());
        return inMachineStatus;
    }

    @NotNull
    public static final InProgress toInProgress(@NotNull Progress progress) {
        return new InProgress(progress.total, progress.progress);
    }

    @NotNull
    public static final InTreadmillData toInTreadmillData(@NotNull TreadmillData treadmillData) {
        return new InTreadmillData(treadmillData.getInstantaneousSpeed(), treadmillData.getAverageSpeed(), treadmillData.getTotalDistance(), (int) treadmillData.getInclination(), (int) treadmillData.getRampAngle(), treadmillData.getPositiveElevationGain(), treadmillData.getNegativeElevationGain(), treadmillData.getInstantaneousPace(), treadmillData.getAveragePace(), treadmillData.getExpendedEnergy(), treadmillData.getEnergyPerHour(), treadmillData.getEnergyPerMinute(), treadmillData.getHeartRate(), treadmillData.getMetabolicEquivalent(), treadmillData.getElapsedTime(), treadmillData.getRemainingTime(), treadmillData.getForceOnBelt(), treadmillData.getPowerOutput());
    }
}
