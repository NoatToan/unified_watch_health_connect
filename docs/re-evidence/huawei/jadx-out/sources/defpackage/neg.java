package defpackage;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.work.PeriodicWorkRequest;
import com.amap.api.services.geocoder.GeocodeSearch;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcloudmodel.model.push.WeatherForecastDay;
import com.huawei.hwcloudmodel.model.push.WeatherForecastHour;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import health.compact.a.CommonUtil;
import health.compact.a.HarmonyBuild;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class neg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f42980c = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nek f42979b = null;

    public static int a(lqq lqqVar, neb nebVar) {
        if (nebVar.c()) {
            return lqqVar.d();
        }
        return d(lqqVar.v(), nebVar);
    }

    public static int b(WeatherForecastDay weatherForecastDay, neb nebVar) {
        if (nebVar.c()) {
            return weatherForecastDay.getCnWeatherIcon();
        }
        return d(weatherForecastDay.getWeatherIcon(), nebVar);
    }

    public static int b(WeatherForecastHour weatherForecastHour, neb nebVar) {
        if (nebVar.c()) {
            return weatherForecastHour.getCnWeatherIcon();
        }
        return d(weatherForecastHour.getWeatherIcon(), nebVar);
    }

    private static int d(int i, neb nebVar) {
        if (nebVar.o()) {
            LogUtil.a("HwWeatherManagerUtils", "convertWeatherIcon() is Support Weather Icon Expand weather:", Integer.valueOf(i));
            return i;
        }
        switch (i) {
            case 32:
            case 33:
            case 34:
            case 35:
                LogUtil.a("HwWeatherManagerUtils", "convertWeatherIcon() weatherIcon:", Integer.valueOf(i));
                return 99;
            default:
                return i;
        }
    }

    public static boolean i() {
        boolean zIsProviderEnabled;
        boolean zIsProviderEnabled2;
        LogUtil.a("HwWeatherManagerUtils", "isGpsSwitch()");
        LocationManager locationManager = (LocationManager) BaseApplication.getContext().getSystemService("location");
        if (locationManager != null) {
            zIsProviderEnabled2 = locationManager.isProviderEnabled(GeocodeSearch.GPS);
            zIsProviderEnabled = locationManager.isProviderEnabled("network");
        } else {
            zIsProviderEnabled = false;
            zIsProviderEnabled2 = false;
        }
        LogUtil.a("HwWeatherManagerUtils", "isGpsSwitch() isNetworkEnable:", Boolean.valueOf(zIsProviderEnabled), ",isGpsEnable:", Boolean.valueOf(zIsProviderEnabled2));
        return zIsProviderEnabled2 || zIsProviderEnabled;
    }

    public static boolean h() {
        boolean zD = lsg.d(BaseApplication.getContext(), f42980c);
        LogUtil.a("HwWeatherManagerUtils", "isGpsPermissions() isHasPermissions:", Boolean.valueOf(zD));
        return zD;
    }

    public static boolean j() {
        return i() && h();
    }

    public static boolean e(lqq lqqVar) {
        if (lqqVar == null) {
            LogUtil.j("HwWeatherManagerUtils", "isPushServer503Error dataWeather is null");
            return false;
        }
        int iB = lqqVar.b();
        LogUtil.a("HwWeatherManagerUtils", "isPushServer503Error errorType:", Integer.valueOf(iB));
        return iB == 503;
    }

    public static boolean a(lqq lqqVar) {
        if (lqqVar == null) {
            LogUtil.j("HwWeatherManagerUtils", "isPushServerError dataWeather is null");
            return false;
        }
        int iB = lqqVar.b();
        LogUtil.a("HwWeatherManagerUtils", "isPushServerError errorType:", Integer.valueOf(iB));
        return iB == 503 || iB == 602 || iB == 603 || iB == 604;
    }

    public static boolean c(int i, int i2) {
        if (i != 0) {
            LogUtil.j("HwWeatherManagerUtils", "isServiceError() baseErrorType is not network Error");
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        LogUtil.j("HwWeatherManagerUtils", "isServiceError() errorType is not service Error");
        return false;
    }

    public static boolean m() {
        DeviceCapability deviceCapabilityB = b();
        if (deviceCapabilityB == null) {
            LogUtil.j("HwWeatherManagerUtils", "isSupportWeatherError Capability is null");
            return false;
        }
        if (deviceCapabilityB.isSupportWeatherErrorCode()) {
            return true;
        }
        LogUtil.j("HwWeatherManagerUtils", "isSupportWeatherError has not 5.15.12 Capability");
        return false;
    }

    public static boolean o() {
        DeviceCapability deviceCapabilityB = b();
        if (deviceCapabilityB == null) {
            LogUtil.j("HwWeatherManagerUtils", "isSupportWeatherError Capability is null");
            return false;
        }
        if (deviceCapabilityB.isWeatherSupportErrorCode()) {
            return true;
        }
        LogUtil.j("HwWeatherManagerUtils", "isSupportWeatherError has not 5.15.7 Capability");
        return false;
    }

    private static DeviceInfo t() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwWeatherManagerUtils");
        if (deviceList.size() > 0) {
            return deviceList.get(0);
        }
        return null;
    }

    public static boolean n() {
        DeviceInfo deviceInfoT = t();
        if (deviceInfoT == null) {
            LogUtil.j("HwWeatherManagerUtils", "isSupportUVIndex deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoT, 47);
    }

    public static DeviceCapability b() {
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(4, "", "HwWeatherManagerUtils");
        DeviceCapability value = null;
        if (mapQueryDeviceCapability != null && !mapQueryDeviceCapability.isEmpty()) {
            Iterator<Map.Entry<String, DeviceCapability>> it = mapQueryDeviceCapability.entrySet().iterator();
            while (it.hasNext() && (value = it.next().getValue()) == null) {
            }
        }
        return value;
    }

    public static boolean l() {
        DeviceInfo deviceInfoT = t();
        if (deviceInfoT == null) {
            return false;
        }
        return eey.d(deviceInfoT, 193);
    }

    public static boolean k() {
        DeviceInfo deviceInfoT = t();
        if (deviceInfoT == null) {
            return false;
        }
        return eey.d(deviceInfoT, PsExtractor.AUDIO_STREAM);
    }

    public static DeviceCapability b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.j("HwWeatherManagerUtils", "getCapability deviceInfo is null");
            return b();
        }
        Map<String, DeviceCapability> mapQueryDeviceCapability = mkf.e(BaseApplication.getContext()).queryDeviceCapability(1, deviceInfo.getDeviceIdentify(), "HwWeatherManagerUtils");
        if (mapQueryDeviceCapability == null || mapQueryDeviceCapability.isEmpty()) {
            return null;
        }
        return mapQueryDeviceCapability.get(deviceInfo.getDeviceIdentify());
    }

    public static String b(Location location) {
        String strC;
        double longitude;
        double latitude;
        String strC2 = eeq.c(0L);
        if (location != null) {
            latitude = location.getLatitude();
            longitude = location.getLongitude();
            strC = eeq.c(location.getTime() / 1000);
        } else {
            strC = strC2;
            longitude = 0.0d;
            latitude = 0.0d;
        }
        BigDecimal bigDecimalE = e(latitude);
        BigDecimal bigDecimalE2 = e(longitude);
        if (bigDecimalE == null || bigDecimalE2 == null) {
            LogUtil.j("HwWeatherManagerUtils", "saveGpsAndTime (sevenDecimalLatitude == null) || (sevenDecimalLongitude == null)");
            return "";
        }
        double dDoubleValue = bigDecimalE.setScale(7, 4).doubleValue();
        double dDoubleValue2 = bigDecimalE2.setScale(7, 4).doubleValue();
        String strD = eeq.d(dDoubleValue);
        String strD2 = eeq.d(dDoubleValue2);
        String str = eeq.d(1) + eeq.b(strC.length() / 2) + strC;
        String str2 = eeq.d(2) + eeq.b(strD.length() / 2) + strD;
        String str3 = eeq.d(3) + eeq.b(strD2.length() / 2) + strD2;
        StringBuilder sb = new StringBuilder(16);
        sb.append(str);
        sb.append("_");
        sb.append(str3);
        sb.append("_");
        sb.append(str2);
        LogUtil.a("HwWeatherManagerUtils", "saveGpsAndTime status:", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "gps_and_time", sb.toString(), new StorageParams(0))), " stringBuilder.toString() ", sb.toString());
        return sb.toString();
    }

    public static BigDecimal e(double d) {
        try {
            return new BigDecimal(d);
        } catch (NumberFormatException unused) {
            LogUtil.e("HwWeatherManagerUtils", "getBigDecimal NumberFormatException");
            return null;
        }
    }

    public static neb c(byte b2) {
        String strE = e(b2);
        LogUtil.a("HwWeatherManagerUtils", "parseWeatherSupport valueString:", strE);
        String str = strE.charAt(7) + "";
        String str2 = strE.charAt(6) + "";
        String str3 = strE.charAt(5) + "";
        String str4 = strE.charAt(4) + "";
        String str5 = strE.charAt(3) + "";
        String str6 = strE.charAt(2) + "";
        String str7 = strE.charAt(1) + "";
        String str8 = strE.charAt(0) + "";
        LogUtil.a("HwWeatherManagerUtils", "parseWeatherSupport bitWeather: ", str, "bitWind: ", str2, "bitPm25: ", str3, "bitTemperature: ", str4, "bitLocationName: ", str5, "bitTimeTemperature: ", str6, "bitUnit: ", str7, "bitAqi: ", str8);
        Bundle bundle = new Bundle();
        try {
            if ("1".equals(str)) {
                bundle.putBoolean("weather_support", true);
            }
            if ("1".equals(str2)) {
                bundle.putBoolean("wind_support", true);
            }
            if ("1".equals(str3)) {
                bundle.putBoolean("pm2_5_support", true);
            }
            if ("1".equals(str4)) {
                bundle.putBoolean("temperature_support", true);
            }
            if ("1".equals(str5)) {
                bundle.putBoolean("location_name_support", true);
            }
            if ("1".equals(str6)) {
                bundle.putBoolean("temperature_current_support", true);
            }
            if ("1".equals(str7)) {
                bundle.putBoolean("unit_support", true);
            }
            if ("1".equals(str8)) {
                bundle.putBoolean("aqi_support", true);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("HwWeatherManagerUtils", "has ClassCastException");
        }
        neb nebVar = new neb();
        nebVar.a(bundle);
        return nebVar;
    }

    public static neb c(byte b2, byte b3) {
        String strE = e(b2);
        String strE2 = e(b3);
        LogUtil.a("HwWeatherManagerUtils", "parseWeatherSupportExpand highValueString:", strE, " lowValueString:", strE2);
        String str = strE2.charAt(7) + "";
        String str2 = strE2.charAt(6) + "";
        String str3 = strE2.charAt(5) + "";
        String str4 = strE2.charAt(4) + "";
        LogUtil.a("HwWeatherManagerUtils", "parseWeatherSupportExpand bitTime:", str, " bitSource:", str2, " bitCnWeatherIcon:", str3, " bitWeatherIconExpand:", str4);
        Bundle bundle = new Bundle();
        try {
            if ("1".equals(str)) {
                bundle.putBoolean("time_support", true);
            }
            if ("1".equals(str2)) {
                bundle.putBoolean("source_support", true);
            }
            if ("1".equals(str3)) {
                bundle.putBoolean("cn_weather_icon_support", true);
            }
            if ("1".equals(str4)) {
                bundle.putBoolean("weather_icon_expand_support", true);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("HwWeatherManagerUtils", "has ClassCastException");
        }
        neb nebVar = new neb();
        nebVar.a(bundle);
        return nebVar;
    }

    public static String e(byte b2) {
        StringBuilder sb = new StringBuilder(16);
        sb.append((int) ((byte) ((b2 >> 7) & 1)));
        sb.append((int) ((byte) ((b2 >> 6) & 1)));
        sb.append((int) ((byte) ((b2 >> 5) & 1)));
        sb.append((int) ((byte) ((b2 >> 4) & 1)));
        sb.append((int) ((byte) ((b2 >> 3) & 1)));
        sb.append((int) ((byte) ((b2 >> 2) & 1)));
        sb.append((int) ((byte) ((b2 >> 1) & 1)));
        sb.append((int) ((byte) (b2 & 1)));
        return sb.toString();
    }

    public static boolean b(int i, long j) {
        int iCurrentTimeMillis = (int) (((System.currentTimeMillis() - j) / 1000) / 60);
        LogUtil.a("HwWeatherManagerUtils", "last gap long is : ", Integer.valueOf(iCurrentTimeMillis), "minutes");
        return iCurrentTimeMillis > i;
    }

    public static int[] a(double d) {
        double d2;
        int[] iArr = new int[2];
        try {
            d2 = Double.parseDouble(new DecimalFormat("#.####", new DecimalFormatSymbols(Locale.US)).format(d));
        } catch (NumberFormatException unused) {
            LogUtil.e("HwWeatherManagerUtils", "splitDecimal is not number");
            d2 = 0.0d;
        }
        String[] strArrSplit = Double.toString(d2).split("\\.");
        for (int i = 0; i < strArrSplit.length; i++) {
            try {
                iArr[i] = Integer.parseInt(strArrSplit[i]);
            } catch (NumberFormatException unused2) {
                LogUtil.e("HwWeatherManagerUtils", "splitDecimal is not number");
            }
        }
        return iArr;
    }

    public static void d(lqp lqpVar) {
        StringBuilder sb = new StringBuilder(0);
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(lqpVar.a());
        sb.append("_");
        sb.append(lqpVar.c());
        LogUtil.a("HwWeatherManagerUtils", "savePressureOnServiceProvider Pressure : ", sb.toString(), " pressure: ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "get_atmosphere_auto_press", sb.toString(), new StorageParams(0))));
    }

    public static ndw b(int i) {
        ndw ndwVar = new ndw();
        ndwVar.e((i & 1) == 1);
        return ndwVar;
    }

    public static void e(int i) {
        if (f()) {
            LogUtil.j("HwWeatherManagerUtils", "reportBi middle night not report BI");
            return;
        }
        LogUtil.a("HwWeatherManagerUtils", "reportBi type:", Integer.valueOf(i));
        Intent intent = new Intent("com.huawei.health.action.ACTION_HWWEATHER_BI_CHANGE");
        intent.putExtra("BIStatus", i);
        intent.setPackage(BaseApplication.getAppPackage());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static boolean f() {
        int hours = new Date(System.currentTimeMillis()).getHours();
        LogUtil.a("HwWeatherManagerUtils", "dateHour:", Integer.valueOf(hours));
        return hours <= 7 || hours >= 23;
    }

    public static boolean c(lqq lqqVar) {
        DeviceCapability deviceCapabilityB = b();
        if (deviceCapabilityB == null || !deviceCapabilityB.isWeatherSupportFutureInfo()) {
            LogUtil.j("HwWeatherManagerUtils", "isRetryRequestFuture not support futureInfo");
            return false;
        }
        List<WeatherForecastHour> listL = lqqVar.l();
        List<WeatherForecastDay> listH = lqqVar.h();
        return listL == null || listL.isEmpty() || listH == null || listH.isEmpty();
    }

    public static nec c(byte[] bArr) {
        nec necVar = new nec();
        if (bArr == null || bArr.length < 8) {
            LogUtil.j("HwWeatherManagerUtils", "parseFutureWeatherSupport() is not Support future Weather");
            return necVar;
        }
        String strE = e(bArr[7]);
        String str = strE.charAt(7) + "";
        String str2 = strE.charAt(6) + "";
        LogUtil.a("HwWeatherManagerUtils", "bitSunriseSunset:", str, " bitMoonPhase:", str2);
        if ("1".equals(str)) {
            necVar.a(true);
        }
        if ("1".equals(str2)) {
            necVar.b(true);
        }
        return necVar;
    }

    public static final int c(Context context) {
        if (context == null) {
            LogUtil.j("HwWeatherManagerUtils", "getNetWorkStates context is null");
            return -1;
        }
        Object systemService = context.getSystemService("connectivity");
        if (!(systemService instanceof ConnectivityManager)) {
            LogUtil.j("HwWeatherManagerUtils", "getNetWorkStates ConnectivityManager is null");
            return -1;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            LogUtil.j("HwWeatherManagerUtils", "getNetWorkStates activeNetworkInfo is null");
            return -1;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            return 0;
        }
        if (type == 1) {
            return 1;
        }
        LogUtil.j("HwWeatherManagerUtils", "getNetWorkStates default type TYPE_NONE");
        return -1;
    }

    public static Location c() {
        nek nekVar = f42979b;
        LogUtil.a("HwWeatherManagerUtils", "getDeviceLocation weather is ", Boolean.valueOf(nekVar != null));
        if (!l() || nekVar == null) {
            return null;
        }
        Location location = new Location(GeocodeSearch.GPS);
        location.setLatitude(nekVar.d());
        location.setLongitude(nekVar.a());
        location.setTime(nekVar.c());
        LogUtil.d("HwWeatherManagerUtils", "getDeviceLocation location is ", location.toString());
        return location;
    }

    public static void a(byte[] bArr) {
        if (!l() || bArr == null || bArr.length < 2) {
            LogUtil.j("HwWeatherManagerUtils", "saveDeviceLocation data == null || deviceInfo == null");
            f42979b = null;
            return;
        }
        try {
            int length = bArr.length - 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 2, bArr2, 0, length);
            cqk cqkVarB = new cql().b(bArr2);
            if (cqkVarB == null) {
                LogUtil.j("HwWeatherManagerUtils", "saveDeviceLocation tlvFather is null");
                f42979b = null;
                return;
            }
            List<cqi> listD = cqkVarB.d();
            nek nekVar = new nek();
            for (int i = 0; i < listD.size(); i++) {
                c(listD, nekVar, i);
            }
            long jC = nekVar.c();
            LogUtil.a("HwWeatherManagerUtils", "saveDeviceLocation getTime ", Long.valueOf(jC));
            if (jC == 0) {
                f42979b = null;
            } else {
                f42979b = nekVar;
            }
            nek nekVar2 = f42979b;
            LogUtil.d("HwWeatherManagerUtils", "saveDeviceLocation locationWeather ", nekVar2 != null ? nekVar2.toString() : "false");
        } catch (cpy e) {
            LogUtil.e("HwWeatherManagerUtils", "tlvFather error:", ExceptionUtils.c(e));
        }
    }

    private static void c(List<cqi> list, nek nekVar, int i) {
        cqi cqiVar = list.get(i);
        if (cqiVar == null) {
            return;
        }
        byte bC = cqiVar.c();
        if (bC == 3) {
            long jA = cph.a(cqiVar.d(), 0L) * 1000;
            nekVar.d(jA);
            LogUtil.d("HwWeatherManagerUtils", "saveDeviceLocation time ", Long.valueOf(jA));
        } else if (bC == 4) {
            double dC = cph.c(cqiVar.d(), 0.0d);
            nekVar.b(dC);
            LogUtil.d("HwWeatherManagerUtils", "saveDeviceLocation longitude ", Double.valueOf(dC));
        } else {
            if (bC == 5) {
                double dC2 = cph.c(cqiVar.d(), 0.0d);
                nekVar.e(dC2);
                LogUtil.d("HwWeatherManagerUtils", "saveDeviceLocation Latitude ", Double.valueOf(dC2));
                return;
            }
            LogUtil.j("HwWeatherManagerUtils", "tlvFather not switch");
        }
    }

    public static void e(Location location) {
        if (location == null) {
            LogUtil.j("HwWeatherManagerUtils", "saveLocationToSp hwLocation is null");
            return;
        }
        if (System.currentTimeMillis() - location.getTime() >= 3600000) {
            LogUtil.j("HwWeatherManagerUtils", "saveLocationToSp hwLocation over 1 hour");
            return;
        }
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        long time = location.getTime();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(JsbMapKeyNames.H5_LOC_LAT, latitude);
            jSONObject.put(JsbMapKeyNames.H5_LOC_LON, longitude);
            jSONObject.put("time", time);
        } catch (JSONException unused) {
            LogUtil.e("HwWeatherManagerUtils", "saveLocationToSp JSONException");
        }
        String string = jSONObject.toString();
        if (TextUtils.isEmpty(string)) {
            LogUtil.j("HwWeatherManagerUtils", "saveLocationToSp result is empty");
            return;
        }
        LogUtil.a("HwWeatherManagerUtils", "saveGpsAndTimeToSp delete ", Boolean.valueOf(SharedPreferenceManager.b(String.valueOf(10039), "key_weather_gps_and_time")), " errorCode ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10039), "key_weather_gps_and_time", string, new StorageParams(1))));
    }

    public static Location e() {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10039), "key_weather_gps_and_time");
        Location location = null;
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwWeatherManagerUtils", "getLocationWeatherBySp result is result");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strE);
            double d = jSONObject.getDouble(JsbMapKeyNames.H5_LOC_LAT);
            double d2 = jSONObject.getDouble(JsbMapKeyNames.H5_LOC_LON);
            long j = jSONObject.getLong("time");
            Location location2 = new Location(GeocodeSearch.GPS);
            try {
                location2.setLatitude(d);
                location2.setLongitude(d2);
                location2.setTime(j);
                return location2;
            } catch (JSONException unused) {
                location = location2;
                LogUtil.e("HwWeatherManagerUtils", "getLocationWeatherBySp JSONException");
                return location;
            }
        } catch (JSONException unused2) {
        }
    }

    public static boolean a() {
        boolean zX = CommonUtil.x(BaseApplication.getContext());
        boolean zE = ltd.e().e(BaseApplication.getContext(), "android.permission.ACCESS_BACKGROUND_LOCATION");
        LogUtil.a("HwWeatherManagerUtils", "isBackgroundAndNoPermission background_location_permission:", Boolean.valueOf(zE), ", isBackground:", Boolean.valueOf(zX));
        return zX && !zE;
    }

    public static void d(lqq lqqVar) {
        if (lqqVar == null) {
            LogUtil.j("HwWeatherManagerUtils", "updateWeatherDataOnServiceProvider dataWeather is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String json = new Gson().toJson(lqqVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                jSONObject.put("DataWeather", json);
                jSONObject.put("time", jCurrentTimeMillis);
                String string = jSONObject.toString();
                if (TextUtils.isEmpty(string)) {
                    LogUtil.e("HwWeatherManagerUtils", "updateWeatherDataOnServiceProvider cacheDataWeather is empty");
                    return;
                }
                LogUtil.a("HwWeatherManagerUtils", "updateWeatherDataOnServiceProvider, cache delete result:", Boolean.valueOf(SharedPreferenceManager.b(String.valueOf(15), "key_weather_cache_data")), ", cache update errorCode result:", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "key_weather_cache_data", string, new StorageParams(1))));
            } catch (JSONException unused) {
                LogUtil.e("HwWeatherManagerUtils", "updateWeatherDataOnServiceProvider JSONException");
            }
        } catch (JsonIOException unused2) {
            LogUtil.e("HwWeatherManagerUtils", "updateWeatherDataOnServiceProvider JsonIOException");
        }
    }

    public static lqq d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(15), "key_weather_cache_data");
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwWeatherManagerUtils", "getCacheDataWeatherBySharedPreference result is empty");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strE);
            Gson gson = new Gson();
            long j = jSONObject.getLong("time");
            if (jCurrentTimeMillis - j <= PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS && j >= timeInMillis) {
                lqq lqqVar = (lqq) gson.fromJson(jSONObject.getString("DataWeather"), lqq.class);
                LogUtil.d("HwWeatherManagerUtils", "getCacheDataWeatherBySharedPreference cache is valid, dataWeather", lqqVar.toString(), " nowTime is ", Long.valueOf(jCurrentTimeMillis), "cacheTime is", Long.valueOf(j));
                return lqqVar;
            }
            LogUtil.a("HwWeatherManagerUtils", "getCacheDataWeatherBySharedPreference cache is not valid, nowTime is ", Long.valueOf(jCurrentTimeMillis), "cacheTime is", Long.valueOf(j));
            return null;
        } catch (JsonParseException | IllegalStateException | NumberFormatException | JSONException e) {
            LogUtil.e("HwWeatherManagerUtils", "getCacheDataWeatherBySharedPreference catch Exception : ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static boolean g() {
        String str;
        return HarmonyBuild.e && (str = HarmonyBuild.f36561a) != null && str.length() > 0 && Character.isDigit(str.charAt(0)) && str.charAt(0) >= "3.0.0".charAt(0);
    }
}
