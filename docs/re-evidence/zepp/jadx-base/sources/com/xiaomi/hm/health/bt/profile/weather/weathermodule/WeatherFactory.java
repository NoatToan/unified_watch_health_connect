package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import android.bluetooth.BluetoothGattService;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherProfile;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherFactory;", "", "Lcom/xiaomi/hm/health/bt/gatt/GattPeripheral;", "gattPeripheral", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/IWeatherProfile;", "createWeatherProfile", "", "a", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WeatherFactory {

    @NotNull
    public static final WeatherFactory INSTANCE = new WeatherFactory();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "WeatherFactory";

    private WeatherFactory() {
    }

    @JvmStatic
    @Nullable
    public static final IWeatherProfile createWeatherProfile(@NotNull GattPeripheral gattPeripheral) {
        BluetoothGattService service = gattPeripheral.getService(HMBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if ((service == null ? null : service.getCharacteristic(HMWeatherProfile.UUID_SERVICE_WEATHER_CONTROL_POINT_SERVICE)) == null) {
            return new NewWeatherProfile(gattPeripheral);
        }
        Debug.fi(TAG, "old protocol");
        return new HMWeatherProfile(gattPeripheral);
    }
}
