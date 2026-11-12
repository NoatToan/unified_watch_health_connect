package defpackage;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport_manager_export.data.FinishSportData;
import com.xiaomi.fitness.sport_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_manager_export.listener.SportRequestCallback;

/* JADX INFO: loaded from: classes10.dex */
public interface kzc {
    void a(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback);

    default void c(FinishSportData finishSportData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
    }

    void d(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback);

    default void e(SportRequestData sportRequestData, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback) {
    }

    void f(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback);

    void h(int i, WearableDeviceModel wearableDeviceModel, SportRequestCallback sportRequestCallback);
}
