package defpackage;

import com.google.gson.Gson;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHeartRateModel;
import com.xiaomi.fitness.devicesettings.bluttooth.healthmonitor.hr.BleHrSettingViewModel;

/* JADX INFO: loaded from: classes8.dex */
public final class lr2 {
    public static void a(BleHrSettingViewModel bleHrSettingViewModel, Gson gson) {
        bleHrSettingViewModel.gson = gson;
    }

    public static void b(BleHrSettingViewModel bleHrSettingViewModel, BleHeartRateModel bleHeartRateModel) {
        bleHrSettingViewModel.heartRateModel = bleHeartRateModel;
    }
}
