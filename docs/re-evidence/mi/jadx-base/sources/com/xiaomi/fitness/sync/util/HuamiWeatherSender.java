package com.xiaomi.fitness.sync.util;

import android.text.TextUtils;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sync.export.model.WeatherResp;
import com.xiaomi.fitness.sync.util.HuamiWeatherSender;
import com.xiaomi.hm.health.bt.profile.weather.ExtensionInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMForecastWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeAqi;
import com.xiaomi.hm.health.bt.profile.weather.HMRealtimeWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMSunriseSunsetInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWeatherInfo;
import com.xiaomi.hm.health.bt.profile.weather.HMWindAndHumidityInfo;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.o4h;
import defpackage.ofl;
import defpackage.v4h;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J \u0010\u0010\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J \u0010\b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002J \u0010\u0014\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/sync/util/HuamiWeatherSender;", "", "<init>", "()V", "setWeatherInfo", "", "did", "", "weatherInfo", "Lcom/xiaomi/fitness/sync/export/model/WeatherResp$Weather;", "time2long", "", "timeStr", "long2Calander", "Ljava/util/Calendar;", "time", "weatherForcast", "hmWeatherInfo", "Lcom/xiaomi/hm/health/bt/profile/weather/HMWeatherInfo;", "refreshPubTime", "weatherWindowAndHuidity", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HuamiWeatherSender {

    @NotNull
    public static final HuamiWeatherSender INSTANCE = new HuamiWeatherSender();

    private HuamiWeatherSender() {
    }

    @JvmStatic
    @NotNull
    public static final Calendar long2Calander(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        Intrinsics.checkNotNull(calendar);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWeatherInfo$lambda$0(String did, WeatherResp.Weather weatherInfo, v4h source) {
        Intrinsics.checkNotNullParameter(did, "$did");
        Intrinsics.checkNotNullParameter(weatherInfo, "$weatherInfo");
        Intrinsics.checkNotNullParameter(source, "source");
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
        HMWeatherInfo hMWeatherInfo = new HMWeatherInfo();
        String str = weatherInfo.location_name;
        if (str != null) {
            hMWeatherInfo.setCityInfo(str);
        } else {
            hMWeatherInfo.setCityInfo(weatherInfo.city_name);
        }
        String str2 = weatherInfo.pubTime;
        HuamiWeatherSender huamiWeatherSender = INSTANCE;
        Intrinsics.checkNotNull(str2);
        huamiWeatherSender.weatherWindowAndHuidity(weatherInfo, hMWeatherInfo, str2);
        huamiWeatherSender.weatherInfo(weatherInfo, hMWeatherInfo, str2);
        huamiWeatherSender.weatherForcast(weatherInfo, hMWeatherInfo, str2);
        List<WeatherResp.StringFromTo> list = weatherInfo.daily_forecast.sunRiseSet.value;
        if (list != null && list.size() > 0) {
            WeatherResp.StringFromTo stringFromTo = list.get(0);
            String from = stringFromTo.from;
            Intrinsics.checkNotNullExpressionValue(from, "from");
            Calendar calendarLong2Calander = long2Calander(time2long(from));
            String to = stringFromTo.to;
            Intrinsics.checkNotNullExpressionValue(to, "to");
            Calendar calendarLong2Calander2 = long2Calander(time2long(to));
            hMWeatherInfo.setSunriseSunsetInfo(new HMSunriseSunsetInfo());
            hMWeatherInfo.getSunriseSunsetInfo().setSunRiseHour(calendarLong2Calander.get(11));
            hMWeatherInfo.getSunriseSunsetInfo().setSunRiseMinute(calendarLong2Calander.get(12));
            hMWeatherInfo.getSunriseSunsetInfo().setSunSetHour(calendarLong2Calander2.get(11));
            hMWeatherInfo.getSunriseSunsetInfo().setSunSetMinute(calendarLong2Calander2.get(12));
            hMWeatherInfo.getSunriseSunsetInfo().setPubTime(long2Calander(time2long(str2)));
        }
        hMWeatherInfo.setTempUnit((byte) 0);
        if (!TextUtils.isEmpty(weatherInfo.uvIndex)) {
            try {
                String uvIndex = weatherInfo.uvIndex;
                Intrinsics.checkNotNullExpressionValue(uvIndex, "uvIndex");
                hMWeatherInfo.setExtensionInfo(new ExtensionInfo(Integer.parseInt(uvIndex), 0, 0, 0.0f, 0, 0));
            } catch (Exception e) {
                e.printStackTrace();
                Logger.e("Wearable.weather", "parse uvIndex error", e);
            }
        }
        WeatherResp.Aqi aqi = weatherInfo.aqi;
        if (aqi != null && !TextUtils.isEmpty(aqi.aqi) && !TextUtils.isEmpty(weatherInfo.aqi.pubTime)) {
            try {
                hMWeatherInfo.setAqiInfo(new HMRealtimeAqi());
                HMRealtimeAqi aqiInfo = hMWeatherInfo.getAqiInfo();
                String aqi2 = weatherInfo.aqi.aqi;
                Intrinsics.checkNotNullExpressionValue(aqi2, "aqi");
                aqiInfo.setAqi(Integer.parseInt(aqi2));
                hMWeatherInfo.getAqiInfo().setAqiDescription(weatherInfo.aqi_level);
                HMRealtimeAqi aqiInfo2 = hMWeatherInfo.getAqiInfo();
                String pubTime = weatherInfo.aqi.pubTime;
                Intrinsics.checkNotNullExpressionValue(pubTime, "pubTime");
                aqiInfo2.setPubTime(long2Calander(time2long(pubTime)));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (wearableDeviceModel == null) {
            Logger.e("Wearable.weather", "deviceModel is null");
            source.onNext(Boolean.FALSE);
        } else {
            HuamiApiCaller huaMiApiCaller = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getHuaMiApiCaller(com.xiaomi.fitness.device.manager.DeviceModelExtKt.getMac(wearableDeviceModel));
            Logger.i("Wearable.weather", "huamiApiCaller is connected " + (huaMiApiCaller != null ? Boolean.valueOf(huaMiApiCaller.isConnected()) : null));
            source.onNext(Boolean.valueOf(huaMiApiCaller != null ? huaMiApiCaller.setWeatherInfo(hMWeatherInfo) : false));
        }
        source.onComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setWeatherInfo$lambda$1(boolean z) {
        Logger.i("Wearable.weather", "setWeatherInfo ret:" + z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWeatherInfo$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setWeatherInfo$lambda$3(Throwable th) {
        Logger.e("Wearable.weather", "setWeatherInfo: " + th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setWeatherInfo$lambda$4(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke2(obj);
    }

    @JvmStatic
    public static final long time2long(@NotNull String timeStr) throws ParseException {
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").parse(timeStr);
        if (date != null) {
            return date.getTime();
        }
        return 0L;
    }

    private final void weatherForcast(WeatherResp.Weather weatherInfo, HMWeatherInfo hmWeatherInfo, String refreshPubTime) {
        List<WeatherResp.StringFromTo> list;
        WeatherResp.DailyForecast dailyForecast = weatherInfo.daily_forecast;
        if (dailyForecast != null) {
            WeatherResp.DailyForecast.Weather weather = dailyForecast.weather;
            if ((weather != null ? weather.value : null) != null) {
                ArrayList<HMForecastWeatherInfo> arrayList = new ArrayList<>();
                int size = weather.value.size();
                int i = 0;
                while (i < size) {
                    Calendar calendar = Calendar.getInstance();
                    int i2 = i + 1;
                    calendar.set(6, i2);
                    HMForecastWeatherInfo hMForecastWeatherInfo = new HMForecastWeatherInfo(calendar);
                    if (!TextUtils.isEmpty(refreshPubTime)) {
                        hMForecastWeatherInfo.setPubTime(long2Calander(time2long(refreshPubTime)));
                    }
                    List<WeatherResp.StringFromTo> list2 = weather.value;
                    if (list2 != null && i < list2.size()) {
                        WeatherResp.StringFromTo stringFromTo = list2.get(i);
                        String from = stringFromTo.from;
                        Intrinsics.checkNotNullExpressionValue(from, "from");
                        int i3 = (int) Double.parseDouble(from);
                        String to = stringFromTo.to;
                        Intrinsics.checkNotNullExpressionValue(to, "to");
                        int i4 = (int) Double.parseDouble(to);
                        hMForecastWeatherInfo.setWeatherFrom(i3);
                        hMForecastWeatherInfo.setWeatherTo(i4);
                    }
                    List<WeatherResp.StringFromTo> list3 = dailyForecast.weather_status;
                    if (list3 != null && i < list3.size()) {
                        hMForecastWeatherInfo.setWeatherDescription(list3.get(i).from);
                    }
                    WeatherResp.DailyForecast.Temperature temperature = dailyForecast.temperature;
                    if (temperature != null && (list = temperature.value) != null && i < list.size()) {
                        WeatherResp.StringFromTo stringFromTo2 = list.get(i);
                        String from2 = stringFromTo2.from;
                        Intrinsics.checkNotNullExpressionValue(from2, "from");
                        int i5 = (int) Double.parseDouble(from2);
                        String to2 = stringFromTo2.to;
                        Intrinsics.checkNotNullExpressionValue(to2, "to");
                        int i6 = (int) Double.parseDouble(to2);
                        if (i5 > i6) {
                            hMForecastWeatherInfo.setMinTemperature(i6);
                            hMForecastWeatherInfo.setMaxTemperature(i5);
                        } else {
                            hMForecastWeatherInfo.setMinTemperature(i5);
                            hMForecastWeatherInfo.setMaxTemperature(i6);
                        }
                    }
                    arrayList.add(hMForecastWeatherInfo);
                    if (arrayList.size() >= 7) {
                        break;
                    } else {
                        i = i2;
                    }
                }
                Logger.i("Wearable.weather", "forecastList size:" + arrayList.size());
                hmWeatherInfo.setForecastInfo(arrayList);
            }
        }
    }

    private final void weatherInfo(WeatherResp.Weather weatherInfo, HMWeatherInfo hmWeatherInfo, String refreshPubTime) {
        HMRealtimeWeatherInfo hMRealtimeWeatherInfo = new HMRealtimeWeatherInfo();
        if (!TextUtils.isEmpty(refreshPubTime)) {
            hMRealtimeWeatherInfo.setPubTime(long2Calander(time2long(refreshPubTime)));
        }
        String str = weatherInfo.weather;
        if (str != null) {
            hMRealtimeWeatherInfo.setWeather((int) Double.parseDouble(str));
        }
        WeatherResp.UnitValue unitValue = weatherInfo.temperature;
        if ((unitValue != null ? unitValue.value : null) != null) {
            String value = unitValue.value;
            Intrinsics.checkNotNullExpressionValue(value, "value");
            hMRealtimeWeatherInfo.setTemprature((int) Double.parseDouble(value));
        }
        String uvIndex = weatherInfo.uvIndex;
        if (uvIndex != null) {
            Intrinsics.checkNotNullExpressionValue(uvIndex, "uvIndex");
            hMRealtimeWeatherInfo.setUvi((int) Double.parseDouble(uvIndex));
        }
        String str2 = weatherInfo.weather_status;
        if (str2 != null) {
            hMRealtimeWeatherInfo.setWeatherDescription(str2);
        }
        hmWeatherInfo.setRealtimeInfo(hMRealtimeWeatherInfo);
    }

    private final void weatherWindowAndHuidity(WeatherResp.Weather weatherInfo, HMWeatherInfo hmWeatherInfo, String refreshPubTime) {
        WeatherResp.WindInfo windInfo = weatherInfo.wind_info;
        WeatherResp.UnitValue unitValue = weatherInfo.humidity;
        String str = "";
        String str2 = windInfo != null ? windInfo.speed : "";
        if (unitValue != null) {
            str = unitValue.value + unitValue.unit;
        }
        HMWindAndHumidityInfo hMWindAndHumidityInfo = new HMWindAndHumidityInfo(str2, str);
        WeatherResp.Wind wind = weatherInfo.wind;
        if (wind != null) {
            WeatherResp.UnitValue unitValue2 = wind.speed;
            if (unitValue2 != null) {
                String value = unitValue2.value;
                Intrinsics.checkNotNullExpressionValue(value, "value");
                hMWindAndHumidityInfo.setWindLevel((int) Double.parseDouble(value));
            }
            WeatherResp.UnitValue unitValue3 = wind.direction;
            if (unitValue3 != null) {
                String value2 = unitValue3.value;
                Intrinsics.checkNotNullExpressionValue(value2, "value");
                hMWindAndHumidityInfo.setWindDirection((int) Double.parseDouble(value2));
            }
        }
        if (unitValue != null) {
            String value3 = unitValue.value;
            Intrinsics.checkNotNullExpressionValue(value3, "value");
            hMWindAndHumidityInfo.setHumidity((int) Double.parseDouble(value3));
        }
        if (!TextUtils.isEmpty(refreshPubTime)) {
            hMWindAndHumidityInfo.setPubTime(long2Calander(time2long(refreshPubTime)));
        }
        hmWeatherInfo.setWindAndHumidityInfo(hMWindAndHumidityInfo);
    }

    public final void setWeatherInfo(@NotNull final String did, @NotNull final WeatherResp.Weather weatherInfo) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(weatherInfo, "weatherInfo");
        o4h o4hVarS = o4h.f(new j5h() { // from class: mnc
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) {
                HuamiWeatherSender.setWeatherInfo$lambda$0(did, weatherInfo, v4hVar);
            }
        }).S(ofl.c());
        final Function1 function1 = new Function1() { // from class: nnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiWeatherSender.setWeatherInfo$lambda$1(((Boolean) obj).booleanValue());
            }
        };
        bg4 bg4Var = new bg4() { // from class: onc
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                HuamiWeatherSender.setWeatherInfo$lambda$2(function1, obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: pnc
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return HuamiWeatherSender.setWeatherInfo$lambda$3((Throwable) obj);
            }
        };
        o4hVarS.O(bg4Var, new bg4() { // from class: qnc
            @Override // defpackage.bg4
            public final void accept(Object obj) {
                HuamiWeatherSender.setWeatherInfo$lambda$4(function2, obj);
            }
        });
    }
}
