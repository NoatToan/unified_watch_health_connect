package com.huami.watch.companion.weather;

import android.content.Context;
import android.text.TextUtils;
import android.text.format.DateFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Consumer;
import com.google.gson.Gson;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.sync.ble.SyncBleUtil;
import com.huami.watch.companion.transport.CompanionModule;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.util.NumUtil;
import com.huami.watch.companion.weather.WeatherWatchExtender;
import com.huami.watch.companion.weather.bean.WeatherExtenderInfo;
import com.huami.watch.companion.weather.bean.WeatherInfo;
import com.huami.watch.companion.weather.util.Unit;
import com.huami.watch.companion.weather.util.WeatherUtil;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.transport.DataTransportResult;
import com.huami.watch.transport.Transporter;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.bt.profile.weather.HMForecastWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeAqi;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMSunriseSunsetInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWindAndHumidityInfo;
import com.xiaomi.mipush.sdk.Constants;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherWatchExtender {
    private static final int A = 16;
    private static final int B = 17;
    private static final int C = 18;
    private static final int D = 19;
    private static final int E = 20;
    private static final int F = 21;
    private static final int G = 22;
    private static final int H = 23;
    private static final String a = "Weather-Watch-Extender";
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;
    private static final int q = 6;
    private static final int r = 7;
    private static final int s = 8;
    private static final int t = 9;
    private static final int u = 10;
    private static final int v = 11;
    private static final int w = 12;
    private static final int x = 13;
    private static final int y = 14;
    private static final int z = 15;
    public static final int[] AQI_LEVEL_1 = {0, 50};
    public static final int[] AQI_LEVEL_2 = {51, 100};
    public static final int[] AQI_LEVEL_3 = {100, 150};
    public static final int[] AQI_LEVEL_4 = {151, 200};
    public static final int[] AQI_LEVEL_5 = {201, 300};
    public static final int[] AQI_LEVEL_6 = {300, 500};
    private static String[] b = {"阵雨", "雷阵雨", "小雨", "中雨", "大雨", "大暴雨", "特大暴雨", "冻雨", "雷阵雨伴有冰雹"};
    private static String[] c = {"雨夹雪"};
    private static String[] d = {"阵雪", "小雪", "中雪", "大雪", "暴雪"};
    private static String[] e = {"浮尘", "扬沙", "沙尘暴", "强沙尘暴"};
    private static String[] f = {"晴"};
    private static String[] g = {"多云"};
    private static String[] h = {"阴"};
    private static String[] i = {"雾"};
    private static String[] j = {"霾"};

    public class a implements Transporter.DataSendResultCallback {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ WeatherInfo c;
        public final /* synthetic */ boolean d;

        public a(boolean z, Context context, WeatherInfo weatherInfo, boolean z2) {
            this.a = z;
            this.b = context;
            this.c = weatherInfo;
            this.d = z2;
        }

        @Override // com.huami.watch.transport.Transporter.DataSendResultCallback
        public void onResultBack(DataTransportResult dataTransportResult) {
            boolean z = dataTransportResult.getResultCode() == 0;
            Log.d(WeatherWatchExtender.a, "On Sync Weather To Watch Success : " + z, new Object[0]);
            if (z && this.a) {
                WeatherWatchExtender.k(this.b, System.currentTimeMillis(), this.c, this.d);
            }
        }
    }

    public static void cleanLastSyncTime(Context context) {
        Log.d(a, "Clean Last Sync Time!!", new Object[0]);
        Box.getBox(context, WeatherManager.TAG).put("WatchSyncTime", 0L);
    }

    private static int d(int i2) {
        if (i2 == 99) {
            return 59;
        }
        if (i2 == 301) {
            return 34;
        }
        return i2;
    }

    private static HMSunriseSunsetInfo e(WeatherInfo weatherInfo) {
        WeatherInfo.Forecast forecast;
        WeatherInfo.Forecast[] forecasts = weatherInfo.getForecasts();
        if (forecasts != null && forecasts.length != 0) {
            int length = forecasts.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    forecast = null;
                    break;
                }
                forecast = forecasts[i2];
                if (forecast.getDay() == 1) {
                    break;
                }
                i2++;
            }
            if (forecast == null) {
                return null;
            }
            Calendar sunriseTime = forecast.getSunriseTime();
            Calendar sunsetTime = forecast.getSunsetTime();
            if (sunriseTime != null && sunsetTime != null) {
                HMSunriseSunsetInfo hMSunriseSunsetInfo = new HMSunriseSunsetInfo();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(weatherInfo.getTime());
                hMSunriseSunsetInfo.setPubTime(calendar);
                hMSunriseSunsetInfo.setSunRiseHour(forecast.getSunriseTime().get(11));
                hMSunriseSunsetInfo.setSunRiseMinute(forecast.getSunriseTime().get(12));
                hMSunriseSunsetInfo.setSunSetHour(forecast.getSunsetTime().get(11));
                hMSunriseSunsetInfo.setSunSetMinute(forecast.getSunsetTime().get(12));
                return hMSunriseSunsetInfo;
            }
        }
        return null;
    }

    public static void enableDailyNotification(Context context, boolean z2) {
        Log.d(a, "Save EnableDailyNotification : " + z2, new Object[0]);
        UserSettings.putBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_NOTIFICATION_ON, z2);
    }

    public static void enableWarningNotification(Context context, boolean z2) {
        Log.d(a, "Save enableWarningNotification : " + z2, new Object[0]);
        UserSettings.putBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_ALERT_ON, z2);
    }

    private static boolean f(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean g(Context context, WeatherInfo weatherInfo) {
        return TimeUtil.offsetHoursMillisToMillis(weatherInfo.getTime(), j(context), "CurrentWeather", "LastSync") >= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ HMWeatherInfo h(Context context, WeatherInfo weatherInfo, boolean z2) {
        HMWeatherInfo hMWeatherInfoM = m(context, weatherInfo, z2);
        Log.d(a, "Sync Weather To Watch : " + hMWeatherInfoM, new Object[0]);
        return hMWeatherInfoM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i(boolean z2, Context context, WeatherInfo weatherInfo, boolean z3, Boolean bool) {
        if (bool.booleanValue() && z2) {
            k(context, System.currentTimeMillis(), weatherInfo, z3);
        }
    }

    public static boolean isDailyNotificationEnabled(Context context) {
        boolean z2 = UserSettings.getBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_NOTIFICATION_ON, true);
        Log.d(a, "Read IsDailyNotificationEnabled : " + z2, new Object[0]);
        return z2;
    }

    public static boolean isUnitFahrenheit(Context context) {
        return UserSettings.getBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_TEMP_UNIT, Config.isLocaleUnitFahrenheit(context));
    }

    public static boolean isWarningNotificationEnabled(Context context) {
        boolean z2 = UserSettings.getBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_ALERT_ON, true);
        Log.d(a, "Read isWarningNotificationEnabled : " + z2, new Object[0]);
        return z2;
    }

    private static long j(Context context) {
        return Box.getBox(context, WeatherManager.TAG).getLong("WatchSyncTime");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(Context context, long j2, @NonNull WeatherInfo weatherInfo, boolean z2) {
        Log.d(a, "Save Sync Time : " + TimeUtil.formatDateTime(j2), new Object[0]);
        Box.getBox(context, WeatherManager.TAG).put("WatchSyncTime", j2);
        WeatherInfo.Alert alert = weatherInfo.getAlert();
        if (!z2 || alert == null || TextUtils.isEmpty(alert.getDetail())) {
            return;
        }
        Box.getBox(context, WeatherManager.TAG).put("WatchSyncAlert", alert.getDetail());
    }

    public static void l(final Context context, @Nullable final WeatherInfo weatherInfo, boolean z2, final boolean z3, boolean z4, final boolean z5) {
        WeatherInfo.Alert alert;
        if (weatherInfo == null) {
            return;
        }
        if (!z2 || g(context, weatherInfo)) {
            final boolean zIsUnitFahrenheit = isUnitFahrenheit(context);
            Log.d(a, "Is Temperature F: " + zIsUnitFahrenheit, new Object[0]);
            SyncBleUtil.syncWeatherInfoToWatch(new Function0() { // from class: uo8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WeatherWatchExtender.h(context, weatherInfo, zIsUnitFahrenheit);
                }
            }, new Consumer() { // from class: to8
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    WeatherWatchExtender.i(z3, context, weatherInfo, z5, (Boolean) obj);
                }
            });
            SyncBleUtil.syncWeatherTemperatureUnitToWatch(zIsUnitFahrenheit);
            if (!z5 || (alert = weatherInfo.getAlert()) == null) {
                return;
            }
            String string = Box.getBox(context, WeatherManager.TAG).getString("WatchSyncAlert");
            if (TextUtils.isEmpty(string) || !string.equals(alert.getDetail())) {
                SyncBleUtil.syncWeatherAlertToWatch(alert.getTitle(), alert.getDetail());
            }
        }
    }

    private static HMWeatherInfo m(Context context, @NonNull WeatherInfo weatherInfo, boolean z2) {
        HMWeatherInfo hMWeatherInfo = new HMWeatherInfo();
        try {
            hMWeatherInfo.setCityInfo(weatherInfo.getCity());
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(weatherInfo.getTime());
            HMRealtimeWeatherInfo hMRealtimeWeatherInfo = new HMRealtimeWeatherInfo();
            hMRealtimeWeatherInfo.setTemprature(Unit.convertTemperature(z2, weatherInfo.getTemperature()));
            hMRealtimeWeatherInfo.setPubTime(calendar);
            hMRealtimeWeatherInfo.setWeather(d(weatherInfo.getWeather()));
            hMRealtimeWeatherInfo.setWeatherDescription(weatherInfo.getWeatherCategory());
            hMRealtimeWeatherInfo.setUvi(NumUtil.toInt(weatherInfo.getUvIndex(), -1));
            hMWeatherInfo.setRealtimeInfo(hMRealtimeWeatherInfo);
            WeatherInfo.Forecast[] forecasts = weatherInfo.getForecasts();
            ArrayList<HMForecastWeatherInfo> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < forecasts.length; i2++) {
                WeatherInfo.Forecast forecast = forecasts[i2];
                Calendar calendar2 = (Calendar) calendar.clone();
                calendar2.add(5, i2);
                HMForecastWeatherInfo hMForecastWeatherInfo = new HMForecastWeatherInfo(calendar2);
                hMForecastWeatherInfo.setPubTime(calendar);
                hMForecastWeatherInfo.setWeatherFrom(d(forecast.getWeatherFrom()));
                hMForecastWeatherInfo.setWeatherTo(d(forecast.getWeatherTo()));
                String temperature = forecast.getTemperature();
                if (!TextUtils.isEmpty(temperature)) {
                    String[] strArrSplit = temperature.split(Constants.WAVE_SEPARATOR);
                    String str = strArrSplit[0];
                    hMForecastWeatherInfo.setMaxTemperature(Unit.convertTemperature(z2, Integer.valueOf(str.substring(0, str.length() - 1)).intValue()));
                    if (strArrSplit.length > 1) {
                        String str2 = strArrSplit[1];
                        hMForecastWeatherInfo.setMinTemperature(Unit.convertTemperature(z2, Integer.valueOf(str2.substring(0, str2.length() - 1)).intValue()));
                    }
                }
                arrayList.add(hMForecastWeatherInfo);
            }
            hMWeatherInfo.setForecastInfo(arrayList);
            HMRealtimeAqi hMRealtimeAqi = new HMRealtimeAqi();
            hMRealtimeAqi.setAqi(weatherInfo.getAqi());
            hMRealtimeAqi.setAqiDescription(weatherInfo.getAqiLevelDescription());
            hMRealtimeAqi.setPubTime(calendar);
            hMWeatherInfo.setAqiInfo(hMRealtimeAqi);
            HMWindAndHumidityInfo hMWindAndHumidityInfo = new HMWindAndHumidityInfo(weatherInfo.getWindDirection(), weatherInfo.getHumidity());
            hMWindAndHumidityInfo.setWindLevel(weatherInfo.getWindForceValue());
            hMWindAndHumidityInfo.setWindDirection(weatherInfo.getWindDirectionAngle());
            hMWindAndHumidityInfo.setPubTime(calendar);
            hMWeatherInfo.setWindAndHumidityInfo(hMWindAndHumidityInfo);
            hMWeatherInfo.setSunriseSunsetInfo(e(weatherInfo));
        } catch (Exception e2) {
            Log.e(a, "WeatherInfo to HMWeatherInfo Err!!", e2, new Object[0]);
            Analytics.exception(context, new Exception("WeatherInfo to HMWeatherInfo Err : ", e2));
        }
        return hMWeatherInfo;
    }

    @Deprecated
    private static String n(Context context, @NonNull WeatherInfo weatherInfo) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            boolean zIsUnitFahrenheit = isUnitFahrenheit(context);
            jSONObject3.put("type", weatherInfo.getWeather());
            jSONObject3.put("temp", Unit.formatTemperature(zIsUnitFahrenheit, Unit.convertTemperature(zIsUnitFahrenheit, weatherInfo.getTemperature())));
            jSONObject2.put(DateFormat.format("yyyyMMdd", weatherInfo.getTime()).toString(), jSONObject3);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("id", DateFormat.format("yyyyMMdd-HHmmss", weatherInfo.getTime()).toString());
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static WeatherExtenderInfo o(Context context, @NonNull WeatherInfo weatherInfo, boolean z2, boolean z3) {
        WeatherExtenderInfo weatherExtenderInfo = new WeatherExtenderInfo();
        try {
            boolean zIsUnitFahrenheit = isUnitFahrenheit(context);
            weatherExtenderInfo.setIsNotification(z2);
            weatherExtenderInfo.setIsAlert(z3);
            weatherExtenderInfo.setTime(weatherInfo.getTime());
            weatherExtenderInfo.setWeather(WeatherUtil.toOurWeatherCode(String.valueOf(weatherInfo.getWeather())));
            weatherExtenderInfo.setWeatherCode(WeatherUtil.toOurWeatherCode(String.valueOf(weatherInfo.getWeather())));
            weatherExtenderInfo.setTemperature(Unit.convertTemperature(zIsUnitFahrenheit, weatherInfo.getTemperature()));
            weatherExtenderInfo.setTemperatureUnit(Unit.getTemperatureUnit(zIsUnitFahrenheit));
            weatherExtenderInfo.setTemperatureFormatted(Unit.formatTemperature(zIsUnitFahrenheit, weatherExtenderInfo.getTemperature()));
            weatherExtenderInfo.setAqi(weatherInfo.getAqi());
            weatherExtenderInfo.setPm25(weatherInfo.getAqi());
            weatherExtenderInfo.setAqiLevel(weatherInfo.getAqiLevel());
            weatherExtenderInfo.setHumidity(weatherInfo.getHumidity());
            weatherExtenderInfo.setWindDirection(weatherInfo.getWindDirection());
            weatherExtenderInfo.setWindForce(weatherInfo.getWindForce());
            weatherExtenderInfo.setCity(weatherInfo.getCity());
            weatherExtenderInfo.setUv(weatherInfo.getUv());
            weatherExtenderInfo.setWindSpeedValue(weatherInfo.getWindSpeedValue());
            weatherExtenderInfo.setWindSpeedUnit(weatherInfo.getWindSpeedUnit());
            weatherExtenderInfo.setWindDirectionValue(weatherInfo.getWindDirectionValue());
            weatherExtenderInfo.setWindDirectionUnit(weatherInfo.getWindDirectionUnit());
            weatherExtenderInfo.setUvIndex(weatherInfo.getUvIndex());
            WeatherInfo.Forecast[] forecasts = weatherInfo.getForecasts();
            WeatherExtenderInfo.Forecast[] forecastArr = new WeatherExtenderInfo.Forecast[forecasts.length];
            for (int i2 = 0; i2 < forecasts.length; i2++) {
                WeatherExtenderInfo.Forecast forecast = new WeatherExtenderInfo.Forecast();
                forecastArr[i2] = forecast;
                WeatherInfo.Forecast forecast2 = forecasts[i2];
                forecast.setDay(forecast2.getDay());
                forecast.setWeatherCodeFrom(WeatherUtil.toOurWeatherCode(String.valueOf(forecast2.getWeatherFrom())));
                forecast.setWeatherCodeTo(WeatherUtil.toOurWeatherCode(String.valueOf(forecast2.getWeatherTo())));
                String temperature = forecast2.getTemperature();
                if (!TextUtils.isEmpty(temperature)) {
                    String[] strArrSplit = temperature.split(Constants.WAVE_SEPARATOR);
                    String str = strArrSplit[0];
                    forecast.setTemperatureMax(Unit.convertTemperature(zIsUnitFahrenheit, Integer.valueOf(str.substring(0, str.length() - 1)).intValue()));
                    if (strArrSplit.length > 1) {
                        String str2 = strArrSplit[1];
                        forecast.setTemperatureMin(Unit.convertTemperature(zIsUnitFahrenheit, Integer.valueOf(str2.substring(0, str2.length() - 1)).intValue()));
                    }
                    forecast.setTemperatureFormatted(Unit.formatTemperature(zIsUnitFahrenheit, forecast.getTemperatureMax()) + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + Unit.formatTemperature(zIsUnitFahrenheit, forecast.getTemperatureMin()));
                }
            }
            weatherExtenderInfo.setForecasts(forecastArr);
            WeatherInfo.Alert alert = weatherInfo.getAlert();
            if (alert != null) {
                String string = Box.getBox(context, WeatherManager.TAG).getString("WatchSyncAlert");
                if (TextUtils.isEmpty(string) || !string.equals(alert.getDetail())) {
                    weatherExtenderInfo.setAlert(alert);
                }
            }
        } catch (Exception e2) {
            Log.e(a, "WeatherInfo to ExtenderInfo Err!!", e2, new Object[0]);
            Analytics.exception(context, new Exception("WeatherInfo to ExtenderInfo Err : ", e2));
        }
        return weatherExtenderInfo;
    }

    private static String p(Context context, @NonNull WeatherInfo weatherInfo, boolean z2, boolean z3) {
        try {
            return new Gson().toJson(o(context, weatherInfo, z2, z3));
        } catch (Exception e2) {
            Log.e(a, "WeatherExtenderInfo to Json Err!!", e2, new Object[0]);
            return null;
        }
    }

    public static void setWeatherFahrenheit(Context context, boolean z2) {
        UserSettings.putBoolean(context.getContentResolver(), UserSettingsKeys.KEY_WEATHER_TEMP_UNIT, z2);
    }

    public static void syncLastWeatherBleToWatch(Context context, boolean z2, boolean z3) {
        l(context, WeatherManager.getManager(context).getLastWeather(), false, false, z2, z3);
    }

    public static void syncLastWeatherToWatch(Context context, Transporter transporter, boolean z2, boolean z3) {
        syncWeatherToWatch(context, transporter, WeatherManager.getManager(context).getLastWeather(), false, false, z2, z3);
    }

    public static void syncWeatherToWatch(Context context, Transporter transporter, @Nullable WeatherInfo weatherInfo, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (weatherInfo == null) {
            return;
        }
        if (!z2 || g(context, weatherInfo)) {
            String strP = p(context, weatherInfo, z4, z5);
            if (TextUtils.isEmpty(strP)) {
                return;
            }
            DataBundle dataBundle = new DataBundle();
            dataBundle.putString(CompanionModule.KEY_WEATHER_INFO, strP);
            Log.d(a, "Send Weather To Watch : " + dataBundle, new Object[0]);
            transporter.send(CompanionModule.ACTION_SYNC_WEATHER, dataBundle, new a(z3, context, weatherInfo, z5));
        }
    }

    public static int toAqiLevel(int i2) {
        int[] iArr = AQI_LEVEL_1;
        if (i2 >= iArr[0] && i2 <= iArr[1]) {
            return 1;
        }
        int[] iArr2 = AQI_LEVEL_2;
        if (i2 >= iArr2[0] && i2 <= iArr2[1]) {
            return 2;
        }
        int[] iArr3 = AQI_LEVEL_3;
        if (i2 >= iArr3[0] && i2 <= iArr3[1]) {
            return 3;
        }
        int[] iArr4 = AQI_LEVEL_4;
        if (i2 >= iArr4[0] && i2 <= iArr4[1]) {
            return 4;
        }
        int[] iArr5 = AQI_LEVEL_5;
        if (i2 >= iArr5[0] && i2 <= iArr5[1]) {
            return 5;
        }
        int[] iArr6 = AQI_LEVEL_6;
        return (i2 < iArr6[0] || i2 > iArr6[1]) ? 0 : 6;
    }

    public static String toAqiLevelDescription(Context context, int i2) {
        return String.valueOf(i2);
    }

    public static String toWeatherCategory(Context context, String str) {
        if (f(b, str)) {
            return "rain";
        }
        if (f(c, str)) {
            return "rain_snow";
        }
        if (f(d, str)) {
            return "snow";
        }
        if (f(e, str)) {
            return "sand";
        }
        if (f(f, str)) {
            return "fine";
        }
        if (f(g, str)) {
            return "cloudy";
        }
        if (f(h, str)) {
            return "overcast";
        }
        if (f(i, str)) {
            return "fog";
        }
        return f(j, str) ? "haze" : str;
    }

    public static int toWeatherCode(String str) {
        if (str.contains("到")) {
            str = str.substring(str.indexOf("到") + 1);
        }
        if ("晴".equals(str)) {
            return 0;
        }
        if ("多云".equals(str)) {
            return 1;
        }
        if ("阴".equals(str)) {
            return 2;
        }
        if ("雾".equals(str)) {
            return 3;
        }
        if ("霾".equals(str)) {
            return 4;
        }
        if ("阵雨".equals(str)) {
            return 5;
        }
        if ("雷阵雨".equals(str)) {
            return 6;
        }
        if ("小雨".equals(str)) {
            return 7;
        }
        if ("中雨".equals(str)) {
            return 8;
        }
        if ("大雨".equals(str)) {
            return 9;
        }
        if ("暴雨".equals(str) || "大暴雨".equals(str)) {
            return 10;
        }
        if ("特大暴雨".equals(str)) {
            return 11;
        }
        if ("雨夹雪".equals(str)) {
            return 12;
        }
        if ("冻雨".equals(str)) {
            return 13;
        }
        if ("雷阵雨伴有冰雹".equals(str)) {
            return 14;
        }
        if ("小雪".equals(str)) {
            return 15;
        }
        if ("中雪".equals(str)) {
            return 16;
        }
        if ("大雪".equals(str)) {
            return 17;
        }
        if ("暴雪".equals(str)) {
            return 18;
        }
        if ("阵雪".equals(str)) {
            return 19;
        }
        if ("浮尘".equals(str)) {
            return 20;
        }
        if ("扬沙".equals(str)) {
            return 21;
        }
        if ("沙尘暴".equals(str)) {
            return 22;
        }
        return "强沙尘暴".equals(str) ? 23 : -1;
    }
}
