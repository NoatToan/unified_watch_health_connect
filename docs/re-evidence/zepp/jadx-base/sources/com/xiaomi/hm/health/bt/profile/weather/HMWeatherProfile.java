package com.xiaomi.hm.health.bt.profile.weather;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.base.HMBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.weather.weathermodule.IWeatherProfile;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes18.dex */
public class HMWeatherProfile extends HMBaseProfile implements IWeatherProfile {
    public static final UUID UUID_SERVICE_WEATHER_CONTROL_POINT_SERVICE = GattUtils.uuid128(14);
    private static final byte c = 1;
    private static final byte d = 2;
    private static final byte e = 4;
    private static final byte f = 8;
    private static final byte g = 16;
    private static final byte h = 32;
    private static final byte i = 64;
    private static final byte j = -128;
    private static final String k = "HMWeatherProfile";
    private BluetoothGattCharacteristic b;

    public HMWeatherProfile(GattPeripheral gattPeripheral) {
        super(gattPeripheral);
        this.b = null;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean deInit() {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.HMBaseProfile, com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic
    public boolean init() {
        UUID uuid = HMBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi(k, uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = UUID_SERVICE_WEATHER_CONTROL_POINT_SERVICE;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.b = characteristic;
        if (characteristic != null) {
            return true;
        }
        Debug.fi(k, uuid2 + " is null!!!");
        return false;
    }

    public boolean setCity(String city) {
        if (TextUtils.isEmpty(city)) {
            return false;
        }
        byte[] bytes = city.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[length + 2];
        bArr[0] = 8;
        System.arraycopy(bytes, 0, bArr, 1, length);
        bArr[length + 1] = 0;
        Debug.i(k, "setCity cmd : " + GattUtils.bytesToHexString(bArr));
        return writeWeatherCommand(bArr);
    }

    public boolean setExtensionInfo(ExtensionInfo extensionInfo) throws IOException {
        Debug.fi(k, extensionInfo.toString());
        byte[] byteArray = extensionInfo.toByteArray();
        if (byteArray == null) {
            return false;
        }
        return writeWeatherCommand(byteArray);
    }

    public boolean setForecastWeathers(ArrayList<HMForecastWeatherInfo> infos) {
        if (infos == null || infos.size() == 0) {
            Debug.fi(k, "weather info is null!!!");
            return false;
        }
        try {
            Calendar pubTime = infos.get(0).getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            byte size = (byte) infos.size();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write(size);
            for (HMForecastWeatherInfo hMForecastWeatherInfo : infos) {
                byteArrayOutputStream.write((byte) hMForecastWeatherInfo.getWeatherFrom());
                byteArrayOutputStream.write((byte) hMForecastWeatherInfo.getWeatherTo());
                byteArrayOutputStream.write((byte) hMForecastWeatherInfo.getMaxTemperature());
                byteArrayOutputStream.write((byte) hMForecastWeatherInfo.getMinTemperature());
                if (!TextUtils.isEmpty(hMForecastWeatherInfo.getWeatherDescription())) {
                    byteArrayOutputStream.write(hMForecastWeatherInfo.getWeatherDescription().getBytes());
                }
                byteArrayOutputStream.write(0);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Debug.i(k, "setForecastWeathers cmd : " + GattUtils.bytesToHexString(byteArray));
            return writeWeatherCommand(byteArray);
        } catch (Exception e2) {
            Debug.fi(k, "Exception:" + e2.getMessage());
            return false;
        }
    }

    public boolean setRealtimeAqi(HMRealtimeAqi info) {
        if (info == null) {
            return false;
        }
        try {
            Calendar pubTime = info.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write((byte) (info.getAqi() & 255));
            byteArrayOutputStream.write((byte) ((info.getAqi() >> 8) & 255));
            if (!TextUtils.isEmpty(info.getAqiDescription())) {
                byteArrayOutputStream.write(info.getAqiDescription().getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Debug.i(k, "setRealtimeAqi cmd : " + GattUtils.bytesToHexString(byteArray));
            return writeWeatherCommand(byteArray);
        } catch (Exception e2) {
            Debug.fi(k, "Exception:" + e2.getMessage());
            return false;
        }
    }

    public boolean setRealtimeWeather(HMRealtimeWeatherInfo info) {
        if (info == null) {
            return false;
        }
        try {
            Calendar pubTime = info.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(2);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write((byte) info.getWeather());
            byteArrayOutputStream.write((byte) info.getTemprature());
            if (!TextUtils.isEmpty(info.getWeatherDescription())) {
                byteArrayOutputStream.write(info.getWeatherDescription().getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Debug.i(k, "setRealtimeWeather cmd : " + GattUtils.bytesToHexString(byteArray));
            return writeWeatherCommand(byteArray);
        } catch (Exception e2) {
            Debug.fi(k, "Exception:" + e2.getMessage());
            return false;
        }
    }

    public boolean setSunriseSunset(HMSunriseSunsetInfo info) {
        if (info == null) {
            return false;
        }
        try {
            Calendar pubTime = info.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(16);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write((byte) (info.getSunRiseHour() & 255));
            byteArrayOutputStream.write((byte) (info.getSunRiseMinute() & 255));
            byteArrayOutputStream.write((byte) (info.getSunSetHour() & 255));
            byteArrayOutputStream.write((byte) (info.getSunSetMinute() & 255));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Debug.i(k, "setSunriseSunsetInfo cmd : " + GattUtils.bytesToHexString(byteArray));
            return writeWeatherCommand(byteArray);
        } catch (Exception e2) {
            Debug.fi(k, "setSunriseSunset exception:" + e2.getMessage());
            return true;
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.weather.weathermodule.IWeatherProfile
    public boolean setTemperatureUnitSync(byte temperatureUnit) {
        return writeWeatherCommand(new byte[]{32, temperatureUnit});
    }

    public boolean setWindAndHumidity(HMWindAndHumidityInfo info) {
        if (info == null) {
            return false;
        }
        try {
            Calendar pubTime = info.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(64);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            if (!TextUtils.isEmpty(info.getWindDesc())) {
                byteArrayOutputStream.write(info.getWindDesc().getBytes());
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(info.getHumidityDesc())) {
                byteArrayOutputStream.write(info.getHumidityDesc().getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Debug.i(k, "setWindAndHumidity cmd : " + GattUtils.bytesToHexString(byteArray));
            return writeWeatherCommand(byteArray);
        } catch (Exception e2) {
            Debug.fi(k, "Exception:" + e2.getMessage());
            return false;
        }
    }

    public boolean writeWeatherCommand(byte[] cmd) {
        return isSupportPatchWrite() ? patchWrite(cmd, 1) : write(this.b, cmd);
    }
}
