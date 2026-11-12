package defpackage;

import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.sport_eco_manager_export.data.SportRequestData;
import com.xiaomi.fitness.sport_eco_manager_export.listener.SportRequestCallback;

/* JADX INFO: loaded from: classes10.dex */
public interface lzc {
    void b(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback);

    void c(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback);

    void e(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback);

    default void g(SportRequestData sportRequestData, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback) {
    }

    void h(int i, EcoDeviceModel ecoDeviceModel, SportRequestCallback sportRequestCallback);
}
