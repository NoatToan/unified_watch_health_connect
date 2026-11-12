package defpackage;

import com.xiaomi.fitness.sport_eco_manager.sensor.SportSensorResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface brc {
    void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult);

    void onReceiveWearData(y7r y7rVar);
}
