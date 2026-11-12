package com.xiaomi.fitness.sport_manager.receiver.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_manager.SportDeviceModel;
import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager.utils.BeanSportUtils;
import defpackage.x7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\fJ+\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseDeviceStep;", "", "Lx7r;", "accessoriesWearData", "mainWearData", "Lcom/xiaomi/fitness/sport_manager/sensor/SportSensorResult;", "sportSensorResult", "", "getIncreaseDeviceStep", "(Lx7r;Lx7r;Lcom/xiaomi/fitness/sport_manager/sensor/SportSensorResult;)I", "", CervicalMucusRecord.Appearance.CLEAR, "()V", "Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseData;", "increaseData", "Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseData;", "getIncreaseData", "()Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseData;", "setIncreaseData", "(Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseData;)V", "<init>", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class IncreaseDeviceStep {

    @NotNull
    private IncreaseData increaseData = new IncreaseData();

    public final void clear() {
        this.increaseData.clear();
    }

    @NotNull
    public final IncreaseData getIncreaseData() {
        return this.increaseData;
    }

    public final int getIncreaseDeviceStep(@Nullable x7r accessoriesWearData, @Nullable x7r mainWearData, @Nullable SportSensorResult sportSensorResult) {
        Logger.d(IncreaseSportDataKt.TAG, "accessoryStep:" + (accessoriesWearData != null ? Integer.valueOf(accessoriesWearData.f38798b) : null) + " , mainWearStep:" + (mainWearData != null ? Integer.valueOf(mainWearData.f38798b) : null) + " ,phoneStep:" + (sportSensorResult != null ? Integer.valueOf(sportSensorResult.f13200a) : null) + " ");
        double increaseData = 0.0d;
        if (BeanSportUtils.INSTANCE.isBeanSport()) {
            increaseData = this.increaseData.getIncreaseData(1, accessoriesWearData != null ? accessoriesWearData.f38798b : 0.0d);
        } else if (SportDeviceModel.INSTANCE.mainDeviceJoinSport()) {
            increaseData = this.increaseData.getIncreaseData(0, mainWearData != null ? mainWearData.f38798b : 0.0d);
        } else if (sportSensorResult != null) {
            increaseData = this.increaseData.getIncreaseData(2, sportSensorResult.f13200a);
        }
        return (int) increaseData;
    }

    public final void setIncreaseData(@NotNull IncreaseData increaseData) {
        Intrinsics.checkNotNullParameter(increaseData, "<set-?>");
        this.increaseData = increaseData;
    }
}
