package com.xiaomi.hm.health.speech.handler;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.ai.SpeechResult;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.speech.ErrorContent;
import com.xiaomi.hm.health.bt.profile.speech.HMSpeechInfo;
import com.xiaomi.hm.health.bt.profile.speech.SpeechType;
import com.xiaomi.hm.health.bt.profile.speech.WeatherContent;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.service.UpdateWeatherWrapper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.speech.handler.WeatherHandler;
import com.xiaomi.hm.health.speech.utils.JsonParseUtils;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.utils.WeatherUtils;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class WeatherHandler extends BaseDomainHandler {
    private final String c;
    private HMSpeechInfo d;

    public WeatherHandler(Context context) {
        super(context);
        this.c = "WeatherHandler";
    }

    private static int b(Calendar max, Calendar min) {
        max.set(11, 0);
        max.set(12, 0);
        max.set(13, 0);
        min.set(11, 0);
        min.set(12, 0);
        min.set(13, 0);
        return ((((int) (max.getTime().getTime() / 1000)) - ((int) (min.getTime().getTime() / 1000))) / 3600) / 24;
    }

    private void c() {
        ErrorContent errorContent = new ErrorContent(this.context.getString(R.string.speech_nlp_silent_handler_answer));
        errorContent.setType((byte) 1);
        this.d = new HMSpeechInfo(getId(), SpeechType.ERROR, errorContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d() {
        LocWeatherManager.getInstance().requestLocation();
    }

    private void e(JSONObject weatherJson, Locale locale, String city, String answerText) throws JSONException {
        WeatherContent weatherContent = new WeatherContent();
        JSONObject jSONObject = weatherJson.getJSONObject("current");
        int i = jSONObject.getInt("weather");
        short s = (short) weatherJson.getJSONObject("aqi").getInt("aqi");
        byte b = (byte) jSONObject.getJSONObject("temperature").getInt("value");
        WeatherContent.Weather weather = new WeatherContent.Weather();
        weather.setAir((short) i);
        weather.setAirDes(WeatherUtils.getRealtimeWeatherDescription(locale, i));
        weather.setAqi(s);
        weather.setAqiDes(WeatherUtils.getAqiDescription(locale, s));
        weather.setLocation(city);
        weather.setTemperature(b);
        weatherContent.setCurrentWeather(weather);
        weatherContent.setWeatherDetail(answerText);
        weatherContent.setType((byte) 1);
        this.d = new HMSpeechInfo(getId(), SpeechType.WEATHER, weatherContent);
    }

    private void f(JSONObject forecastDailyJson, Calendar queryTime, Locale locale, String city, String answerText) throws JSONException {
        JSONObject jSONObject = forecastDailyJson.getJSONObject("aqi");
        JSONObject jSONObject2 = forecastDailyJson.getJSONObject("weather");
        JSONObject jSONObject3 = forecastDailyJson.getJSONObject("temperature");
        JSONArray jSONArray = jSONObject.getJSONArray("value");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
        Calendar calendarDateFormat = Utils.dateFormat(forecastDailyJson.getString("pubTime"), "yyyy-MM-dd'T'HH:mm:ss");
        if (queryTime == null || calendarDateFormat == null) {
            HMLog.i("WeatherHandler", "time is null", new Object[0]);
            c();
            return;
        }
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.optInt(i);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) int.class, jSONArray2.length(), 2);
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
            iArr2[i2][0] = jSONObject4.getInt("from");
            iArr2[i2][1] = jSONObject4.getInt("to");
        }
        int[][] iArr3 = (int[][]) Array.newInstance((Class<?>) int.class, jSONArray3.length(), 2);
        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
            JSONObject jSONObject5 = jSONArray3.getJSONObject(i3);
            iArr3[i3][0] = jSONObject5.getInt("from");
            iArr3[i3][1] = jSONObject5.getInt("to");
        }
        int iB = b(queryTime, calendarDateFormat);
        if (iB >= iArr2.length || iB >= iArr3.length || iB >= length) {
            HMLog.i("WeatherHandler", "out of index", new Object[0]);
            c();
            return;
        }
        byte b = (byte) iArr2[iB][0];
        byte b2 = (byte) iArr2[iB][1];
        short s = (short) iArr[iB];
        byte b3 = (byte) iArr3[iB][0];
        byte b4 = (byte) iArr3[iB][1];
        WeatherContent.ForecastWeather forecastWeather = new WeatherContent.ForecastWeather();
        forecastWeather.setAirFrom(b);
        forecastWeather.setAirTo(b2);
        forecastWeather.setAirDes(WeatherUtils.getForecastWeatherDescription(locale, b, b2));
        forecastWeather.setAqi(s);
        forecastWeather.setAqiDes(WeatherUtils.getAqiDescription(locale, s));
        forecastWeather.setLocation(city);
        forecastWeather.setMaxTemp(b3);
        forecastWeather.setMinTemp(b4);
        forecastWeather.setTimestamp((int) (queryTime.getTimeInMillis() / 1000));
        forecastWeather.setTz((byte) ProfileUtils.getTimezoneKey(queryTime.getTimeZone()));
        WeatherContent weatherContent = new WeatherContent();
        weatherContent.setWeatherDetail(answerText);
        weatherContent.setForecastWeather(forecastWeather);
        weatherContent.setType((byte) 2);
        this.d = new HMSpeechInfo(getId(), SpeechType.WEATHER, weatherContent);
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void handleDomainEvent() {
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void pushInfoToDevice(HMMiLiProDevice hmMiLiProDevice) {
        HMSpeechInfo hMSpeechInfo = this.d;
        if (hMSpeechInfo != null) {
            hmMiLiProDevice.sendSpeechInfoSync(hMSpeechInfo);
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: oo8
                @Override // java.lang.Runnable
                public final void run() {
                    WeatherHandler.d();
                }
            });
        }
    }

    @Override // com.xiaomi.hm.health.speech.handler.BaseDomainHandler
    public void resolveSpeechResult(SpeechResult speechResult) {
        HMLog.d("WeatherHandler", speechResult.getContent(), new Object[0]);
        try {
            String intention = speechResult.getIntention();
            String content = speechResult.getContent();
            JSONObject jSONObject = new JSONObject(intention);
            JSONObject jSONObject2 = new JSONObject(content);
            JSONObject jSONObject3 = jSONObject2.getJSONObject("weather");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("forecastDaily");
            String string = jSONObject.getString(JsonParseUtils.SUB_INTENT);
            String string2 = jSONObject.getString(JsonParseUtils.ANSWER_TYPE);
            String strOptString = jSONObject2.optString("locateName");
            if (JsonParseUtils.AIR_INQUIRY.equalsIgnoreCase(string)) {
                WeatherContent weatherContent = new WeatherContent();
                weatherContent.setAqiDetail(speechResult.getAnswerText());
                weatherContent.setType((byte) 3);
                this.d = new HMSpeechInfo(getId(), SpeechType.WEATHER, weatherContent);
                return;
            }
            if (jSONObject.has("duration")) {
                WeatherContent weatherContent2 = new WeatherContent();
                weatherContent2.setWeatherDetail(speechResult.getAnswerText());
                weatherContent2.setType((byte) 4);
                this.d = new HMSpeechInfo(getId(), SpeechType.WEATHER, weatherContent2);
                return;
            }
            Locale locale = UpdateWeatherWrapper.getLocale((HMMiLiProDevice) ((HMMiLiDevice) HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI)));
            if (JsonParseUtils.CURRENT.equalsIgnoreCase(string2)) {
                e(jSONObject3, locale, strOptString, speechResult.getAnswerText());
            } else {
                f(jSONObject4, Utils.dateFormat(jSONObject.getString("date"), "yyyyMMdd"), locale, strOptString, speechResult.getAnswerText());
            }
        } catch (JSONException e) {
            HMLog.i("WeatherHandler", e.getMessage(), new Object[0]);
            c();
        }
    }
}
