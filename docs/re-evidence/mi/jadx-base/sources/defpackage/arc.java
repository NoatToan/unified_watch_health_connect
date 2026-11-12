package defpackage;

import com.xiaomi.fitness.sport_manager.sensor.SportSensorResult;
import com.xiaomi.fitness.sport_manager_export.data.SportLocationResult;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface arc {
    void onReceivePhoneLocationData(SportLocationResult sportLocationResult);

    void onReceivePhoneSensorData(@NotNull SportSensorResult sportSensorResult);

    void onReceiveWearData(x7r x7rVar);
}
