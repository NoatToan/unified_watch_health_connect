package com.xiaomi.fitness.sport_manager_export.listener;

import com.xiaomi.fitness.sport_xms.data.WearSensorData;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport_manager_export/listener/ISportSensorDataChangedListener;", "", "onReceiveWearSensorData", "", "wearSensorData", "Lcom/xiaomi/fitness/sport_xms/data/WearSensorData;", "sport-manager-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ISportSensorDataChangedListener {
    void onReceiveWearSensorData(@Nullable WearSensorData wearSensorData);
}
