package com.xiaomi.fitness.sport_manager.receiver.data;

import androidx.health.connect.client.records.CervicalMucusRecord;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseDistance;", "", "<init>", "()V", "increaseData", "Lcom/xiaomi/fitness/sport_manager/receiver/data/IncreaseData;", "getIncreaseDis", "", "appDis", "accessoryDis", "", CervicalMucusRecord.Appearance.CLEAR, "", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IncreaseDistance {

    @NotNull
    private IncreaseData increaseData = new IncreaseData();

    public final void clear() {
        this.increaseData.clear();
    }

    public final double getIncreaseDis(double appDis, int accessoryDis) {
        return appDis < 0.0d ? this.increaseData.getIncreaseData(1, accessoryDis) : this.increaseData.getIncreaseData(2, appDis);
    }
}
