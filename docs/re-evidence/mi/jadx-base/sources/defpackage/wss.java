package defpackage;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.weather.ExtensionInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMForecastWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeAqi;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMSunriseSunsetInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWindAndHumidityInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public class wss extends a6t implements dj {
    public static final UUID c = tet.C(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BluetoothGattCharacteristic f38325b;

    public wss(jet jetVar) {
        super(jetVar);
        this.f38325b = null;
    }

    @Override // defpackage.dj
    public boolean a(byte b2) {
        return j(new byte[]{32, b2});
    }

    public boolean b(ExtensionInfo extensionInfo) throws IOException {
        t5t.d("HMWeatherProfile", extensionInfo.toString());
        byte[] byteArray = extensionInfo.toByteArray();
        if (byteArray == null) {
            return false;
        }
        return j(byteArray);
    }

    public boolean c(HMRealtimeAqi hMRealtimeAqi) {
        if (hMRealtimeAqi == null) {
            return false;
        }
        try {
            Calendar pubTime = hMRealtimeAqi.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(4);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write((byte) (hMRealtimeAqi.getAqi() & 255));
            byteArrayOutputStream.write((byte) ((hMRealtimeAqi.getAqi() >> 8) & 255));
            if (!TextUtils.isEmpty(hMRealtimeAqi.getAqiDescription())) {
                byteArrayOutputStream.write(hMRealtimeAqi.getAqiDescription().getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            t5t.m("HMWeatherProfile", "setRealtimeAqi cmd : " + tet.x(byteArray));
            return j(byteArray);
        } catch (Exception e) {
            t5t.d("HMWeatherProfile", "Exception:" + e.getMessage());
            return false;
        }
    }

    public boolean d(HMRealtimeWeatherInfo hMRealtimeWeatherInfo) {
        if (hMRealtimeWeatherInfo == null) {
            return false;
        }
        try {
            Calendar pubTime = hMRealtimeWeatherInfo.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(2);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write((byte) hMRealtimeWeatherInfo.getWeather());
            byteArrayOutputStream.write((byte) hMRealtimeWeatherInfo.getTemprature());
            if (!TextUtils.isEmpty(hMRealtimeWeatherInfo.getWeatherDescription())) {
                byteArrayOutputStream.write(hMRealtimeWeatherInfo.getWeatherDescription().getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            t5t.m("HMWeatherProfile", "setRealtimeWeather cmd : " + tet.x(byteArray));
            return j(byteArray);
        } catch (Exception e) {
            t5t.d("HMWeatherProfile", "Exception:" + e.getMessage());
            return false;
        }
    }

    @Override // defpackage.a6t
    public boolean deInit() {
        return true;
    }

    public boolean f(HMSunriseSunsetInfo hMSunriseSunsetInfo) {
        if (hMSunriseSunsetInfo == null) {
            return false;
        }
        try {
            Calendar pubTime = hMSunriseSunsetInfo.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(16);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write((byte) (hMSunriseSunsetInfo.getSunRiseHour() & 255));
            byteArrayOutputStream.write((byte) (hMSunriseSunsetInfo.getSunRiseMinute() & 255));
            byteArrayOutputStream.write((byte) (hMSunriseSunsetInfo.getSunSetHour() & 255));
            byteArrayOutputStream.write((byte) (hMSunriseSunsetInfo.getSunSetMinute() & 255));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            t5t.m("HMWeatherProfile", "setSunriseSunsetInfo cmd : " + tet.x(byteArray));
            return j(byteArray);
        } catch (Exception e) {
            t5t.d("HMWeatherProfile", "setSunriseSunset exception:" + e.getMessage());
            return true;
        }
    }

    public boolean g(HMWindAndHumidityInfo hMWindAndHumidityInfo) {
        if (hMWindAndHumidityInfo == null) {
            return false;
        }
        try {
            Calendar pubTime = hMWindAndHumidityInfo.getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(64);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            if (!TextUtils.isEmpty(hMWindAndHumidityInfo.getWindDesc())) {
                byteArrayOutputStream.write(hMWindAndHumidityInfo.getWindDesc().getBytes());
            }
            byteArrayOutputStream.write(0);
            if (!TextUtils.isEmpty(hMWindAndHumidityInfo.getHumidityDesc())) {
                byteArrayOutputStream.write(hMWindAndHumidityInfo.getHumidityDesc().getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            t5t.m("HMWeatherProfile", "setWindAndHumidity cmd : " + tet.x(byteArray));
            return j(byteArray);
        } catch (Exception e) {
            t5t.d("HMWeatherProfile", "Exception:" + e.getMessage());
            return false;
        }
    }

    public boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[length + 2];
        bArr[0] = 8;
        System.arraycopy(bytes, 0, bArr, 1, length);
        bArr[length + 1] = 0;
        t5t.m("HMWeatherProfile", "setCity cmd : " + tet.x(bArr));
        return j(bArr);
    }

    public boolean i(ArrayList<HMForecastWeatherInfo> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            t5t.d("HMWeatherProfile", "weather info is null!!!");
            return false;
        }
        try {
            Calendar pubTime = arrayList.get(0).getPubTime();
            int timeInMillis = (int) (pubTime.getTimeInMillis() / 1000);
            byte timeZoneKeyWithDST = (byte) ProfileUtils.getTimeZoneKeyWithDST(pubTime);
            byte size = (byte) arrayList.size();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(1);
            byteArrayOutputStream.write((byte) (timeInMillis & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 8) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 16) & 255));
            byteArrayOutputStream.write((byte) ((timeInMillis >> 24) & 255));
            byteArrayOutputStream.write(timeZoneKeyWithDST);
            byteArrayOutputStream.write(size);
            for (HMForecastWeatherInfo hMForecastWeatherInfo : arrayList) {
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
            t5t.m("HMWeatherProfile", "setForecastWeathers cmd : " + tet.x(byteArray));
            return j(byteArray);
        } catch (Exception e) {
            t5t.d("HMWeatherProfile", "Exception:" + e.getMessage());
            return false;
        }
    }

    @Override // defpackage.a6t
    public boolean init() {
        UUID uuid = a6t.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            t5t.d("HMWeatherProfile", uuid + " is null!!!");
            return false;
        }
        UUID uuid2 = c;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.f38325b = characteristic;
        if (characteristic != null) {
            return true;
        }
        t5t.d("HMWeatherProfile", uuid2 + " is null!!!");
        return false;
    }

    public boolean j(byte[] bArr) {
        return isSupportPatchWrite() ? patchWrite(bArr, 1) : write(this.f38325b, bArr);
    }
}
