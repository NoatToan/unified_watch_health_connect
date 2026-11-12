package com.huami.watch.companion.weather;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.gson.Gson;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.cloud.api.WeatherV3API;
import com.huami.watch.companion.cloud.bean.CloudWeatherAQIRealtime;
import com.huami.watch.companion.cloud.bean.CloudWeatherAlerts;
import com.huami.watch.companion.cloud.bean.CloudWeatherCity;
import com.huami.watch.companion.cloud.bean.CloudWeatherCurrent;
import com.huami.watch.companion.cloud.bean.CloudWeatherForecast;
import com.huami.watch.companion.cloud.bean.CloudWeatherRealtime;
import com.huami.watch.companion.location.Location;
import com.huami.watch.companion.usersettings.UserSettings;
import com.huami.watch.companion.usersettings.UserSettingsKeys;
import com.huami.watch.companion.util.NumUtil;
import com.huami.watch.companion.weather.WeatherManager;
import com.huami.watch.companion.weather.bean.WeatherCity;
import com.huami.watch.companion.weather.bean.WeatherInfo;
import com.huami.watch.companion.weather.bean.WeatherSearchedCity;
import com.huami.watch.companion.weather.util.WeatherUtil;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public class WeatherManager {
    public static final String TAG = "Weather-Manager";
    private static WeatherManager c;
    private Context a;
    private WeatherListener b;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Location location = (Location) intent.getParcelableExtra("Location");
            Log.d(WeatherManager.TAG, "Broadcast Receive Location : " + location, new Object[0]);
            if (location == null || WeatherManager.this.isUserCity()) {
                return;
            }
            WeatherManager.this.requestWeatherASync(location);
        }
    }

    public class b implements Consumer<WeatherInfo> {
        public b() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(@NonNull WeatherInfo weatherInfo) throws Exception {
            if (WeatherManager.this.b != null) {
                WeatherManager.this.b.onReceiveWeather(weatherInfo);
            }
        }
    }

    public class c implements Consumer<Throwable> {
        public c() {
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th) throws Exception {
            if (WeatherManager.this.b != null) {
                WeatherManager.this.b.onReceiveWeatherError();
            }
        }
    }

    public class d implements ObservableOnSubscribe<WeatherInfo> {
        public final /* synthetic */ WeatherCity a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Location c;

        public d(WeatherCity weatherCity, Context context, Location location) {
            this.a = weatherCity;
            this.b = context;
            this.c = location;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<WeatherInfo> observableEmitter) throws Exception {
            WeatherInfo weatherInfoO = null;
            try {
                WeatherCity weatherCity = this.a;
                if (weatherCity == null || TextUtils.isEmpty(weatherCity.getLocationKey())) {
                    Location location = this.c;
                    if (location != null) {
                        weatherInfoO = WeatherManager.this.o(this.b, location);
                    }
                } else {
                    weatherInfoO = WeatherManager.this.p(this.b, this.a);
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(WeatherManager.TAG, "Request Weather Err!!", e, new Object[0]);
                Analytics.exception(this.b, new Exception("RequestWeather Err : " + this.c + ",\n" + this.a, e));
            }
            observableEmitter.onNext(weatherInfoO);
        }
    }

    public class e implements ObservableOnSubscribe<List<WeatherSearchedCity>> {
        public final /* synthetic */ String a;

        public e(String str) {
            this.a = str;
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<List<WeatherSearchedCity>> observableEmitter) throws Exception {
            observableEmitter.onNext(WeatherManager.this.searchCity(this.a));
        }
    }

    private WeatherManager(Context context) {
        this.a = context;
    }

    private static boolean g(WeatherCity weatherCity) {
        return (weatherCity == null || TextUtils.isEmpty(weatherCity.getCityName()) || TextUtils.isEmpty(weatherCity.getLocationKey()) || !weatherCity.getLocationKey().contains(",")) ? false : true;
    }

    public static WeatherManager getManager(Context context) {
        if (c == null) {
            c = new WeatherManager(context.getApplicationContext());
        }
        return c;
    }

    private boolean h(WeatherInfo weatherInfo) {
        return Math.abs(TimeUtil.offsetHoursMillisToCurrent(weatherInfo.getTime(), "Weather")) == 0;
    }

    private WeatherCity i(@NonNull String str) {
        Exception e2;
        WeatherCity weatherCity;
        try {
            weatherCity = (WeatherCity) new Gson().fromJson(str, WeatherCity.class);
            try {
                if (!g(weatherCity)) {
                    return null;
                }
            } catch (Exception e3) {
                e2 = e3;
                e2.printStackTrace();
            }
        } catch (Exception e4) {
            e2 = e4;
            weatherCity = null;
        }
        return weatherCity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k(Throwable th) throws Exception {
        HMLog.warn(TAG, th, new Function0() { // from class: qo8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WeatherManager.j();
            }
        });
    }

    private WeatherCity l(String str) {
        String str2 = str == null ? "LastCity" : str;
        WeatherCity weatherCity = null;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        String string = Box.getBox(this.a, TAG).getString(str2);
        if (!TextUtils.isEmpty(string)) {
            WeatherCity weatherCityI = i(string);
            if (weatherCityI == null) {
                Box.getBox(this.a, TAG).put(str2, (String) null);
            }
            weatherCity = weatherCityI;
        }
        Log.d(TAG, "Read LocatedCity : " + str + ", " + string + ", " + weatherCity, new Object[0]);
        return weatherCity;
    }

    private WeatherInfo m(String str) {
        String string = Box.getBox(this.a, TAG).getString(str, null);
        StringBuilder sb = new StringBuilder();
        sb.append("Read Last Weather, LocationKey : ");
        sb.append(str);
        sb.append(", ");
        sb.append(string != null ? "NonNull" : "Null");
        Log.d(TAG, sb.toString(), new Object[0]);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (WeatherInfo) new Gson().fromJson(string, WeatherInfo.class);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private WeatherCity n() {
        WeatherCity weatherCityI;
        String string = UserSettings.getString(this.a.getContentResolver(), UserSettingsKeys.KEY_WEATHER_USER_CITY);
        if (TextUtils.isEmpty(string)) {
            weatherCityI = null;
        } else {
            weatherCityI = i(string);
            if (weatherCityI == null) {
                cleanUserCity();
            }
        }
        Log.d(TAG, "Read UserCity : " + string + ", " + weatherCityI, new Object[0]);
        return weatherCityI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeatherInfo o(Context context, @NonNull Location location) {
        WeatherCity weatherCityRequestWeatherV3City = requestWeatherV3City(context, location);
        if (weatherCityRequestWeatherV3City == null || TextUtils.isEmpty(weatherCityRequestWeatherV3City.getLocationKey())) {
            return null;
        }
        return p(context, weatherCityRequestWeatherV3City);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WeatherInfo p(Context context, WeatherCity weatherCity) {
        WeatherInfo weatherInfo = new WeatherInfo();
        String locationKey = weatherCity.getLocationKey();
        if (t(context, weatherCity, weatherInfo)) {
            v(locationKey, weatherInfo);
        }
        if (s(context, locationKey, weatherInfo)) {
            v(locationKey, weatherInfo);
        }
        if (r(context, locationKey, weatherInfo)) {
            v(locationKey, weatherInfo);
        }
        return weatherInfo;
    }

    private boolean q(Context context, String str, WeatherInfo weatherInfo) {
        CloudWeatherAQIRealtime aQIRealtime = WeatherV3API.getAQIRealtime(context, str);
        if (aQIRealtime == null) {
            return false;
        }
        String aqi = aQIRealtime.getAqi();
        String pm25 = aQIRealtime.getPm25();
        if (!TextUtils.isEmpty(aqi)) {
            weatherInfo.setAqi(NumUtil.toInt(aqi, -1));
            weatherInfo.setAqiLevel(WeatherWatchExtender.toAqiLevel(weatherInfo.getAqi()));
            weatherInfo.setAqiLevelDescription(WeatherWatchExtender.toAqiLevelDescription(context, weatherInfo.getAqiLevel()));
        }
        if (TextUtils.isEmpty(pm25)) {
            return true;
        }
        weatherInfo.setPm25(NumUtil.toInt(pm25, -1));
        return true;
    }

    private boolean r(Context context, String str, WeatherInfo weatherInfo) {
        List<CloudWeatherAlerts.Alert> alerts = WeatherV3API.getAlerts(context, str);
        if (alerts == null || alerts.size() == 0) {
            return false;
        }
        CloudWeatherAlerts.Alert alert = alerts.get(0);
        WeatherInfo.Alert alert2 = new WeatherInfo.Alert();
        alert2.setTitle(alert.getTitle());
        alert2.setDetail(alert.getDetail());
        alert2.setLevel(alert.getLevel());
        alert2.setType(alert.getType());
        alert2.setTime_pub(alert.getPubTime());
        weatherInfo.setAlert(alert2);
        return true;
    }

    private boolean s(Context context, String str, WeatherInfo weatherInfo) {
        CloudWeatherForecast weatherForecast = WeatherV3API.getWeatherForecast(context, str, 7);
        if (weatherForecast == null) {
            return false;
        }
        CloudWeatherForecast.FromTo[] value = weatherForecast.getWeather().getValue();
        CloudWeatherForecast.FromTo[] value2 = weatherForecast.getTemperature().getValue();
        CloudWeatherForecast.FromTo[] value3 = weatherForecast.getSunRiseSet().getValue();
        if (value == null && value2 == null) {
            return false;
        }
        WeatherInfo.Forecast[] forecastArr = new WeatherInfo.Forecast[7];
        for (int i = 1; i <= 7; i++) {
            WeatherInfo.Forecast forecast = new WeatherInfo.Forecast();
            int i2 = i - 1;
            forecastArr[i2] = forecast;
            forecast.setDay(i);
            if (value != null && value.length >= i) {
                forecast.setWeatherFrom(NumUtil.toInt(value[i2].getFrom(), -1));
                forecast.setWeatherTo(NumUtil.toInt(value[i2].getTo(), -1));
            }
            if (value2 != null && value2.length >= i) {
                forecast.setTemperature(WeatherUtil.formatTemperature(weatherForecast.getTemperature().getUnit(), value2[i2]));
            }
            if (value3 != null && value3.length >= i) {
                forecast.setSunriseTime(WeatherUtil.parsePubTime(value3[i2].getFrom()));
                forecast.setSunsetTime(WeatherUtil.parsePubTime(value3[i2].getTo()));
            }
        }
        weatherInfo.setForecasts(forecastArr);
        return true;
    }

    private boolean t(Context context, WeatherCity weatherCity, WeatherInfo weatherInfo) {
        CloudWeatherRealtime currentWeatherModel;
        CloudWeatherCurrent weatherRealtime = WeatherV3API.getWeatherRealtime(context, weatherCity.getLocationKey());
        if (weatherRealtime == null || (currentWeatherModel = weatherRealtime.getCurrentWeatherModel()) == null) {
            return false;
        }
        weatherInfo.setTime(System.currentTimeMillis());
        weatherInfo.setWeather(NumUtil.toInt(currentWeatherModel.getWeather(), -1));
        CloudWeatherRealtime.UnitValue temperature = currentWeatherModel.getTemperature();
        if (temperature != null) {
            String value = temperature.getValue();
            if (!TextUtils.isEmpty(value)) {
                weatherInfo.setTemperature(NumUtil.toInt(value));
            }
        }
        String uvIndex = currentWeatherModel.getUvIndex();
        if (!TextUtils.isEmpty(uvIndex)) {
            weatherInfo.setUv(WeatherUtil.formatUV(context, NumUtil.toInt(uvIndex, -1)));
            weatherInfo.setUvIndex(currentWeatherModel.getUvIndex());
        }
        weatherInfo.setCity(weatherCity.getCityName());
        String humidity = WeatherUtil.formatHumidity(currentWeatherModel.getHumidity());
        if (!TextUtils.isEmpty(humidity)) {
            weatherInfo.setHumidity(humidity);
        }
        if (currentWeatherModel.getWind() != null) {
            weatherInfo.setWindDirectionValue(currentWeatherModel.getWind().getDirection().getValue());
            weatherInfo.setWindDirectionUnit(currentWeatherModel.getWind().getDirection().getUnit());
            weatherInfo.setWindSpeedValue(currentWeatherModel.getWind().getSpeed().getValue());
            weatherInfo.setWindSpeedUnit(currentWeatherModel.getWind().getSpeed().getUnit());
            String windDirection = WeatherUtil.formatWindDirection(context, currentWeatherModel.getWind().getDirection());
            float windDirectionAngle = WeatherUtil.formatWindDirectionAngle(context, currentWeatherModel.getWind().getDirection());
            String windForce = WeatherUtil.formatWindForce(context, currentWeatherModel.getWind().getSpeed());
            int windForceValue = WeatherUtil.formatWindForceValue(currentWeatherModel.getWind().getSpeed());
            if (!TextUtils.isEmpty(windDirection)) {
                weatherInfo.setWindDirection(windDirection);
            }
            if (windDirectionAngle >= 0.0f) {
                weatherInfo.setWindDirectionAngle(windDirectionAngle);
            }
            if (!TextUtils.isEmpty(windForce)) {
                weatherInfo.setWindForce(windForce);
            }
            if (windForceValue >= 0) {
                weatherInfo.setWindForceValue(windForceValue);
            }
        }
        CloudWeatherAQIRealtime aqiModel = weatherRealtime.getAqiModel();
        if (aqiModel == null) {
            return true;
        }
        String aqi = aqiModel.getAqi();
        String pm25 = aqiModel.getPm25();
        if (!TextUtils.isEmpty(aqi)) {
            weatherInfo.setAqi(NumUtil.toInt(aqi, -1));
            weatherInfo.setAqiLevel(WeatherWatchExtender.toAqiLevel(weatherInfo.getAqi()));
            weatherInfo.setAqiLevelDescription(WeatherWatchExtender.toAqiLevelDescription(context, weatherInfo.getAqiLevel()));
        }
        if (TextUtils.isEmpty(pm25)) {
            return true;
        }
        weatherInfo.setPm25(NumUtil.toInt(pm25, -1));
        return true;
    }

    private void u(String str, @NonNull WeatherCity weatherCity) {
        String strW = w(weatherCity);
        Log.d(TAG, "Save LocatedCity : " + str + ", " + strW, new Object[0]);
        Box.getBox(this.a, TAG).put("LastCity", strW);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Box.getBox(this.a, TAG).put(str, strW);
    }

    private void v(String str, WeatherInfo weatherInfo) {
        String json = new Gson().toJson(weatherInfo);
        Log.d(TAG, "Save Last Weather : " + str + ", " + json, new Object[0]);
        Box.getBox(this.a, TAG).put(str, json);
    }

    private String w(@NonNull WeatherCity weatherCity) {
        if (g(weatherCity)) {
            return new Gson().toJson(weatherCity);
        }
        return null;
    }

    public void cleanSavedWeatherInfo() {
        Log.d(TAG, "Clear All SavedInfo!!", new Object[0]);
        Box.getBox(this.a, TAG).clear();
    }

    public void cleanSavedWeatherInfoExceptAlert() {
        String string = Box.getBox(this.a, TAG).getString("WatchSyncAlert");
        cleanSavedWeatherInfo();
        Box.getBox(this.a, TAG).put("WatchSyncAlert", string);
    }

    public void cleanUserCity() {
        Log.d(TAG, "Clean UserCity!!", new Object[0]);
        UserSettings.putString(this.a.getContentResolver(), UserSettingsKeys.KEY_WEATHER_USER_CITY, null);
    }

    public WeatherCity f() {
        return l(null);
    }

    public WeatherCity getLastCity() {
        WeatherCity userCity = getUserCity();
        return userCity == null ? f() : userCity;
    }

    public WeatherCity getLastLocatedCity(@NonNull Location location) {
        if (location.getAddress() == null) {
            return null;
        }
        return getLastLocatedCity(location.getAddress().toStringShort());
    }

    public String getLastLocation() {
        return Box.getBox(this.a, TAG).getString("Location");
    }

    public WeatherInfo getLastWeather() {
        WeatherCity lastCity = getLastCity();
        if (lastCity != null) {
            return m(lastCity.getLocationKey());
        }
        return null;
    }

    public WeatherCity getUserCity() {
        return n();
    }

    public boolean isUserCity() {
        return getUserCity() != null;
    }

    public void registerLocationChanged() {
        LocalBroadcastManager.getInstance(this.a).registerReceiver(new a(), new IntentFilter("com.huami.watch.companion.action.LocationReceived"));
    }

    public void registerWeatherListener(WeatherListener weatherListener) {
        this.b = weatherListener;
    }

    public void requestWeatherASync(Location location) {
        Log.d(TAG, "Request Weather by LBS!!", new Object[0]);
        requestWeatherASync(this.a, location, null);
    }

    @Nullable
    public WeatherCity requestWeatherV3City(Context context, @NonNull Location location) {
        String name;
        String locationKey;
        WeatherCity lastLocatedCity = getLastLocatedCity(location);
        if (lastLocatedCity != null) {
            return lastLocatedCity;
        }
        CloudWeatherCity city = WeatherV3API.getCity(context, location);
        if (city != null) {
            locationKey = city.getLocationKey();
            name = city.getName();
        } else {
            name = null;
            locationKey = null;
        }
        if (TextUtils.isEmpty(locationKey)) {
            return null;
        }
        WeatherCity weatherCity = new WeatherCity();
        weatherCity.setCityName(name);
        weatherCity.setLocationKey(locationKey);
        u(location.getAddress() != null ? location.getAddress().toStringShort() : null, weatherCity);
        return weatherCity;
    }

    public void saveLocation(String str) {
        Box.getBox(this.a, TAG).put("Location", str);
    }

    public void saveUserCity(@NonNull WeatherCity weatherCity) {
        Log.d(TAG, "Save UserCity : " + weatherCity, new Object[0]);
        String strW = w(weatherCity);
        Log.d(TAG, "Save UserCity : " + strW, new Object[0]);
        UserSettings.putString(this.a.getContentResolver(), UserSettingsKeys.KEY_WEATHER_USER_CITY, strW);
    }

    @NonNull
    public List<WeatherSearchedCity> searchCity(@NonNull String str) {
        Log.d(TAG, "Search City : " + str, new Object[0]);
        ArrayList arrayList = new ArrayList();
        List<CloudWeatherCity> citiesByName = WeatherV3API.getCitiesByName(this.a, str);
        if (citiesByName != null && citiesByName.size() > 0) {
            for (CloudWeatherCity cloudWeatherCity : citiesByName) {
                if (cloudWeatherCity.getStatus() == 0) {
                    WeatherSearchedCity weatherSearchedCity = new WeatherSearchedCity();
                    weatherSearchedCity.setCityInfo(cloudWeatherCity);
                    weatherSearchedCity.setCityName(cloudWeatherCity.getName());
                    weatherSearchedCity.setAffiliation(cloudWeatherCity.getAffiliation());
                    arrayList.add(weatherSearchedCity);
                }
            }
        }
        return arrayList;
    }

    public void searchCityASync(@NonNull String str, @NonNull Consumer<List<WeatherSearchedCity>> consumer) {
        Log.d(TAG, "Search City ASync!!", new Object[0]);
        Observable.create(new e(str)).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(consumer, new Consumer() { // from class: po8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                WeatherManager.k((Throwable) obj);
            }
        });
    }

    public WeatherCity getLastLocatedCity(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return l(str);
    }

    public void requestWeatherASync(WeatherCity weatherCity) {
        Log.d(TAG, "Request Weather by WeatherCity : " + weatherCity, new Object[0]);
        requestWeatherASync(this.a, null, weatherCity);
    }

    public void requestWeatherASync(Context context, Location location, WeatherCity weatherCity) {
        Observable.create(new d(weatherCity, context, location)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(), new c());
    }
}
