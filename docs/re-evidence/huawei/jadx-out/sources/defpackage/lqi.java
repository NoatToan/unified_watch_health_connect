package defpackage;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.huawei.hwcloudmodel.hwwear.hag.model.outdoor.FutureWeatherSunMoonData;
import com.huawei.hwcloudmodel.model.push.AlertWeather;
import com.huawei.hwcloudmodel.model.push.WeatherForecastDay;
import com.huawei.hwcloudmodel.model.push.WeatherForecastGlow;
import com.huawei.hwcloudmodel.model.push.WeatherForecastHour;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lqi {
    public static lqq d(String str) {
        LogUtil.a("DataWeatherParseUtils", "getDataWeather():", str);
        lqq lqqVar = new lqq();
        lqqVar.d(-99);
        lqqVar.e(-99);
        lqqVar.a(-99);
        if (TextUtils.isEmpty(str) || String.valueOf(601).equals(str)) {
            LogUtil.j("DataWeatherParseUtils", "weather info is empty or unknown error type");
            lqqVar.n(601);
            return lqqVar;
        }
        if (String.valueOf(503).equals(str)) {
            LogUtil.j("DataWeatherParseUtils", "weather info SERVICE_ERROR");
            lqqVar.n(503);
            return lqqVar;
        }
        if (String.valueOf(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR).equals(str)) {
            LogUtil.j("DataWeatherParseUtils", "weather info RESPONSE_EMPTY_ERROR_TYPE");
            lqqVar.n(TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR);
            return lqqVar;
        }
        if (String.valueOf(TypedValues.MotionType.TYPE_EASING).equals(str)) {
            LogUtil.j("DataWeatherParseUtils", "weather info NO_DATA_RETURNED_ERROR_TYPE");
            lqqVar.n(TypedValues.MotionType.TYPE_EASING);
            return lqqVar;
        }
        if (String.valueOf(600).equals(str)) {
            LogUtil.j("DataWeatherParseUtils", "weather info IO_ERROR_TYPE");
            lqqVar.n(600);
            return lqqVar;
        }
        try {
            JsonObject jsonObjectD = lqn.d(str);
            if (jsonObjectD == null) {
                LogUtil.j("DataWeatherParseUtils", "getDataWeather() commandsRoots is null");
                lqqVar.n(602);
                return lqqVar;
            }
            return a(lqqVar, jsonObjectD);
        } catch (JsonParseException unused) {
            LogUtil.e("DataWeatherParseUtils", "getDataWeather() JsonParseException");
            lqqVar.n(602);
            return lqqVar;
        } catch (IllegalStateException unused2) {
            LogUtil.e("DataWeatherParseUtils", "getDataWeather() IllegalStateException");
            lqqVar.n(602);
            return lqqVar;
        }
    }

    private static lqq a(lqq lqqVar, JsonObject jsonObject) {
        LogUtil.a("DataWeatherParseUtils", "parseTemplateContent() source:", lqqVar.g());
        return e(lqqVar, jsonObject);
    }

    private static lqq e(lqq lqqVar, JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("condition");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "conditionRoot is null");
            lqqVar.n(602);
            return lqqVar;
        }
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject == null || asJsonObject.isJsonNull() || !asJsonObject.isJsonObject()) {
            LogUtil.j("DataWeatherParseUtils", "condition is null or is not object");
            lqqVar.n(602);
            return lqqVar;
        }
        int iN = n(asJsonObject);
        int iC = c(asJsonObject);
        int iL = l(asJsonObject);
        int iK = k(asJsonObject);
        int iM = m(asJsonObject);
        String strD = d(asJsonObject);
        int iP = p(asJsonObject);
        int iH = h(asJsonObject);
        lqqVar.j(iN);
        lqqVar.g(iC);
        lqqVar.o(iL);
        lqqVar.i(iK);
        lqqVar.h(iM);
        lqqVar.c(strD);
        lqqVar.l(iP);
        lqqVar.k(iH);
        LogUtil.a("DataWeatherParseUtils", "parseWeatherIdJson() configWeather:", Integer.valueOf(lqqVar.v()), ",cnWeatherIcon:", Integer.valueOf(lqqVar.d()), ",uVIndex:", Integer.valueOf(lqqVar.i()), " windDirection:", Integer.valueOf(iK), " windLevel:", Integer.valueOf(iM));
        return c(lqqVar, jsonObject, asJsonObject);
    }

    private static lqq c(lqq lqqVar, JsonObject jsonObject, JsonObject jsonObject2) {
        JsonElement jsonElement = jsonObject2.get("updatetime");
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            lqqVar.c(jsonElement.getAsLong());
        }
        LogUtil.a("DataWeatherParseUtils", "parseTemperatureJson():", Long.valueOf(lqqVar.u()));
        JsonElement jsonElement2 = jsonObject2.get(HwExerciseConstants.JSON_NAME_WORKOUT_TEMPERATURE);
        if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
            lqqVar.d(jsonElement2.getAsInt());
        }
        LogUtil.a("DataWeatherParseUtils", "parseTemperatureJson() configCurrentTemperature:", Integer.valueOf(lqqVar.n()));
        JsonElement jsonElement3 = jsonObject.get("alerts");
        if (jsonElement3 != null && !jsonElement3.isJsonNull()) {
            JsonArray asJsonArray = jsonElement3.getAsJsonArray();
            if (asJsonArray == null || asJsonArray.isJsonNull() || !asJsonArray.isJsonArray() || asJsonArray.size() < 1) {
                LogUtil.j("DataWeatherParseUtils", "parseAlertWeathers() parseAlertWeathers is null or is not array and or size less 1");
            } else {
                lqqVar.c(a(asJsonArray));
            }
        }
        JsonElement jsonElement4 = jsonObject.get("cityNew");
        if (jsonElement4 != null && !jsonElement4.isJsonNull()) {
            lqqVar.d(r(jsonElement4.getAsJsonObject()));
        }
        LogUtil.a("DataWeatherParseUtils", "parseTemperatureJson() configLocationName:", lqqVar.s());
        return b(lqqVar, jsonObject, jsonObject2);
    }

    private static List<AlertWeather> a(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement == null || jsonElement.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseAlertWeathers() alertWeatherRoot is null");
                arrayList.clear();
                break;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject == null || asJsonObject.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseAlertWeathers() alertWeatherObject is null");
                arrayList.clear();
                return arrayList;
            }
            if (!asJsonObject.isJsonObject()) {
                LogUtil.j("DataWeatherParseUtils", "parseAlertWeathers() alertWeatherObject is null");
                arrayList.clear();
                return arrayList;
            }
            String strA = a(asJsonObject);
            String strE = e(asJsonObject);
            int iJ = j(asJsonObject);
            String strI = i(asJsonObject);
            int iF = f(asJsonObject);
            String strO = o(asJsonObject);
            String strB = b(asJsonObject);
            long jG = g(asJsonObject);
            AlertWeather alertWeather = new AlertWeather();
            alertWeather.setAlertTitle(strA);
            alertWeather.setAlertAreaName(strE);
            alertWeather.setAlertLevel(iJ);
            alertWeather.setAlertLevelName(strI);
            alertWeather.setAlertType(iF);
            alertWeather.setAlertTypeName(strO);
            alertWeather.setAlertContent(strB);
            alertWeather.setAlertPublicTime(jG);
            arrayList.add(alertWeather);
        }
        return arrayList;
    }

    private static String r(JsonObject jsonObject) {
        if (jsonObject == null || jsonObject.isJsonNull() || !jsonObject.isJsonObject()) {
            LogUtil.j("DataWeatherParseUtils", "city is null");
            return "";
        }
        JsonElement jsonElement = jsonObject.get("localizedname");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "cityNameRoot is null");
            return "";
        }
        String asString = jsonElement.getAsString();
        if (!TextUtils.isEmpty(asString)) {
            LogUtil.a("DataWeatherParseUtils", "parseCityName():", asString);
            return asString;
        }
        JsonElement jsonElement2 = jsonObject.get("englishName");
        if (jsonElement2 == null || jsonElement2.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "cityEnglishNameRoot is null");
            return "";
        }
        String asString2 = jsonElement2.getAsString();
        if (TextUtils.isEmpty(asString2)) {
            LogUtil.j("DataWeatherParseUtils", "cityEnglishNameRoot is null");
            return "";
        }
        LogUtil.a("DataWeatherParseUtils", "parseCityName():", asString2);
        return asString2;
    }

    private static lqq b(lqq lqqVar, JsonObject jsonObject, JsonObject jsonObject2) {
        lqqVar.c(q(jsonObject2));
        int iU = u(jsonObject2);
        lqqVar.f(iU);
        LogUtil.a("DataWeatherParseUtils", "parseAqiWeatherJson() configPm25:", Integer.valueOf(lqqVar.r()), "configAqi:", Integer.valueOf(lqqVar.k()));
        if (iU > 200) {
            lqqVar.j(53);
            LogUtil.a("DataWeatherParseUtils", "parseAqiWeatherJson() configWeather:", Integer.valueOf(lqqVar.v()));
        }
        return c(lqqVar, jsonObject);
    }

    private static FutureWeatherSunMoonData t(JsonObject jsonObject) {
        FutureWeatherSunMoonData futureWeatherSunMoonData = new FutureWeatherSunMoonData();
        futureWeatherSunMoonData.setSunriseTime(e(jsonObject, "sunRise"));
        futureWeatherSunMoonData.setSunsetTime(e(jsonObject, "sunSet"));
        futureWeatherSunMoonData.setMoonRise(e(jsonObject, "moonRise"));
        futureWeatherSunMoonData.setMoonSet(e(jsonObject, "moonSet"));
        JsonElement jsonElement = jsonObject.get("moonPhase");
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            futureWeatherSunMoonData.setMoonPhase(lqn.a(jsonElement.getAsString()));
        } else {
            futureWeatherSunMoonData.setMoonPhase(lqn.a(""));
        }
        LogUtil.a("DataWeatherParseUtils", "parseSunriseSunset() sunriseSunset:", futureWeatherSunMoonData.toString());
        return futureWeatherSunMoonData;
    }

    private static long e(JsonObject jsonObject, String str) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return 0L;
        }
        return jsonElement.getAsLong() / 1000;
    }

    private static int q(JsonObject jsonObject) {
        int i = -1;
        try {
            JsonElement jsonElement = jsonObject.get("aqi");
            if (jsonElement != null && !jsonElement.isJsonNull()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null && !asJsonObject.isJsonNull() && asJsonObject.isJsonObject()) {
                    JsonElement jsonElement2 = asJsonObject.get("aqiValue");
                    if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
                        int asInt = jsonElement2.getAsInt();
                        if (asInt >= 0 && asInt <= 500) {
                            return asInt;
                        }
                        try {
                            LogUtil.j("DataWeatherParseUtils", "parseAqi() aqi:", Integer.valueOf(asInt));
                            return -1;
                        } catch (JsonParseException unused) {
                            i = asInt;
                            LogUtil.e("DataWeatherParseUtils", "parseAqi() JsonParseException");
                            return i;
                        } catch (IllegalStateException unused2) {
                            i = asInt;
                            LogUtil.e("DataWeatherParseUtils", "parseAqi() IllegalStateException");
                            return i;
                        }
                    }
                    LogUtil.j("DataWeatherParseUtils", "parseAqi() aqiValueElement is null");
                    return -1;
                }
                LogUtil.j("DataWeatherParseUtils", "parseAqi() aqiElementBean is null or is not object");
                return -1;
            }
            LogUtil.j("DataWeatherParseUtils", "parseAqi() aqiElement is null");
            return -1;
        } catch (JsonParseException unused3) {
        } catch (IllegalStateException unused4) {
        }
    }

    private static int u(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = jsonObject.get("aqi");
            if (jsonElement != null && !jsonElement.isJsonNull()) {
                JsonObject asJsonObject = jsonElement.getAsJsonObject();
                if (asJsonObject != null && !asJsonObject.isJsonNull() && asJsonObject.isJsonObject()) {
                    JsonElement jsonElement2 = asJsonObject.get("pm25");
                    if (jsonElement2 != null && !jsonElement2.isJsonNull()) {
                        return jsonElement2.getAsInt();
                    }
                    LogUtil.j("DataWeatherParseUtils", "parsePm() pm25Root is null");
                    return -1;
                }
                LogUtil.j("DataWeatherParseUtils", "parsePm() aqiElementBean is null or is not object");
                return -1;
            }
            LogUtil.j("DataWeatherParseUtils", "parsePm() aqiElement is null");
            return -1;
        } catch (JsonParseException unused) {
            LogUtil.e("DataWeatherParseUtils", "parsePm() JsonParseException");
            return -1;
        } catch (IllegalStateException unused2) {
            LogUtil.e("DataWeatherParseUtils", "parsePm() IllegalStateException");
            return -1;
        }
    }

    private static lqq c(lqq lqqVar, JsonObject jsonObject) {
        JsonArray jsonArrayC = lqn.c(jsonObject);
        if (jsonArrayC != null) {
            for (int i = 0; i < jsonArrayC.size(); i++) {
                JsonElement jsonElement = jsonArrayC.get(i);
                if (jsonElement == null || jsonElement.isJsonNull()) {
                    LogUtil.j("DataWeatherParseUtils", "dailyWeathersItemRoot is null");
                } else {
                    JsonObject asJsonObject = jsonElement.getAsJsonObject();
                    if (asJsonObject == null || asJsonObject.isJsonNull() || !asJsonObject.isJsonObject()) {
                        LogUtil.j("DataWeatherParseUtils", "dailyWeathersItem is null or dailyWeathersItem is null");
                    } else {
                        JsonElement jsonElement2 = asJsonObject.get("publicTime");
                        if (jsonElement2 == null || jsonElement2.isJsonNull()) {
                            LogUtil.j("DataWeatherParseUtils", "publicTimeRoot is null");
                        } else {
                            long asLong = jsonElement2.getAsLong();
                            if (lqn.e(asLong)) {
                                lqqVar.b((int) (asLong / 1000));
                                JsonElement jsonElement3 = asJsonObject.get("maxTemp");
                                JsonElement jsonElement4 = asJsonObject.get("minTemp");
                                int iE = lqn.e(jsonElement3);
                                int iE2 = lqn.e(jsonElement4);
                                if (iE2 > iE) {
                                    LogUtil.j("DataWeatherParseUtils", "maxConvertTempValue less than minConvertTempValue");
                                    break;
                                }
                                int iN = lqqVar.n();
                                if (iN > iE) {
                                    iE = iN;
                                }
                                if (iN < iE2) {
                                    iE2 = iN;
                                }
                                lqqVar.a(iE);
                                lqqVar.e(iE2);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return e(lqqVar, jsonObject, jsonArrayC);
    }

    private static lqq e(lqq lqqVar, JsonObject jsonObject, JsonArray jsonArray) {
        if (jsonArray == null) {
            LogUtil.j("DataWeatherParseUtils", "parseFutureWeatherJson() dailyWeathersList is null");
            lqqVar.n(602);
            return lqqVar;
        }
        List<WeatherForecastDay> listB = b(jsonArray);
        if (listB.isEmpty()) {
            LogUtil.j("DataWeatherParseUtils", "parseFutureWeatherJson() forecastDailies is empty");
            lqqVar.n(602);
            return lqqVar;
        }
        lqqVar.d(listB);
        LogUtil.a("DataWeatherParseUtils", "parseFutureWeatherJson() forecastDailies:", lqqVar.toString());
        JsonElement jsonElement = jsonObject.get("hourlys");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "parseFutureWeatherJson() hourlyRoot is null");
            lqqVar.n(602);
            return lqqVar;
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray == null || asJsonArray.isJsonNull() || !asJsonArray.isJsonArray() || asJsonArray.size() < 1) {
            LogUtil.j("DataWeatherParseUtils", "parseFutureWeatherJson() hourlyWeathersList is null or is not array and or size less 1");
            lqqVar.n(602);
            return lqqVar;
        }
        List<WeatherForecastHour> listD = d(asJsonArray);
        if (listD.isEmpty()) {
            LogUtil.j("DataWeatherParseUtils", "parseFutureWeatherJson() forecastHours is empty");
            lqqVar.n(602);
            return lqqVar;
        }
        lqqVar.e(listD);
        lqqVar.b(w(jsonObject));
        LogUtil.a("DataWeatherParseUtils", "parseFutureWeatherJson() forecastHours:", lqqVar.toString());
        return lqqVar;
    }

    private static List<WeatherForecastDay> b(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement == null || jsonElement.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseDailiesWeathers() dailyWeathersRoot is null");
                arrayList.clear();
                return arrayList;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject == null || asJsonObject.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseDailiesWeathers() dailyWeathers is null");
                arrayList.clear();
                return arrayList;
            }
            if (!asJsonObject.isJsonObject()) {
                LogUtil.j("DataWeatherParseUtils", "parseDailiesWeathers() dailyWeathersElementListElementBean is null");
                arrayList.clear();
                return arrayList;
            }
            WeatherForecastDay weatherForecastDayS = s(asJsonObject);
            if (!weatherForecastDayS.isComplete()) {
                LogUtil.j("DataWeatherParseUtils", "parseDailiesWeathers() forecastDay is error");
                arrayList.clear();
                return arrayList;
            }
            FutureWeatherSunMoonData futureWeatherSunMoonDataT = t(asJsonObject);
            if (futureWeatherSunMoonDataT != null) {
                weatherForecastDayS.setFutureWeatherSunMoonData(futureWeatherSunMoonDataT);
            }
            arrayList.add(weatherForecastDayS);
        }
        if (arrayList.size() < 5) {
            LogUtil.j("DataWeatherParseUtils", "parseDailiesWeathers() days is not array and or size less 5");
            arrayList.clear();
        }
        return arrayList;
    }

    private static List<WeatherForecastHour> d(JsonArray jsonArray) {
        ArrayList arrayList = new ArrayList(16);
        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement jsonElement = jsonArray.get(i);
            if (jsonElement == null || jsonElement.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseHourlyWeathers() hourlyWeatherRoot is null");
                arrayList.clear();
                break;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject == null || asJsonObject.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseHourlyWeathers() hourlyWeathers is null");
                arrayList.clear();
                return arrayList;
            }
            if (!asJsonObject.isJsonObject()) {
                LogUtil.j("DataWeatherParseUtils", "parseHourlyWeathers() hourlyWeathers is null");
                arrayList.clear();
                return arrayList;
            }
            int iN = n(asJsonObject);
            int iC = c(asJsonObject);
            JsonElement jsonElement2 = asJsonObject.get("date");
            JsonElement jsonElement3 = asJsonObject.get(BleConstants.TEMPERATURE);
            JsonElement jsonElement4 = asJsonObject.get("rainProbability");
            if (jsonElement2 == null || jsonElement3 == null || jsonElement2.isJsonNull() || jsonElement3.isJsonNull() || jsonElement4.isJsonNull() || jsonElement4.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseHourlyWeathers() hourlyDataRoot is null or hourlyTempRoot is null");
                arrayList.clear();
                return arrayList;
            }
            JsonElement jsonElement5 = asJsonObject.get("uvindex");
            if (jsonElement5 == null || jsonElement5.isJsonNull()) {
                LogUtil.j("DataWeatherParseUtils", "parseHourlyWeathers() hourlyUvIndexRoot is null or hourlyUvIndexRoot is null");
                arrayList.clear();
                return arrayList;
            }
            long asLong = jsonElement2.getAsLong();
            WeatherForecastHour weatherForecastHour = new WeatherForecastHour();
            weatherForecastHour.setTemperature(jsonElement3.getAsInt());
            weatherForecastHour.setTime(asLong / 1000);
            weatherForecastHour.setWeatherIcon(iN);
            weatherForecastHour.setCnWeatherIcon(iC);
            weatherForecastHour.setPrecipitation(jsonElement4.getAsInt());
            weatherForecastHour.setUvIndex(jsonElement5.getAsInt());
            weatherForecastHour.setSomatosensoryTemperature(h(asJsonObject));
            LogUtil.a("DataWeatherParseUtils", "parseHourlyWeathers() forecastHour:", weatherForecastHour.toString());
            arrayList.add(weatherForecastHour);
        }
        return arrayList;
    }

    private static WeatherForecastDay s(JsonObject jsonObject) {
        WeatherForecastDay weatherForecastDay = new WeatherForecastDay();
        weatherForecastDay.setIsComplete(false);
        JsonElement jsonElement = jsonObject.get("publicTime");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "parseDailyWeather() subPublicTimeRoot is null");
            return weatherForecastDay;
        }
        weatherForecastDay.setTime(jsonElement.getAsLong() / 1000);
        JsonElement jsonElement2 = jsonObject.get("maxTemp");
        JsonElement jsonElement3 = jsonObject.get("minTemp");
        JsonElement jsonElement4 = jsonObject.get("conditionDay");
        if (jsonElement2 == null || jsonElement3 == null || jsonElement4 == null) {
            LogUtil.j("DataWeatherParseUtils", "parseDailyWeather() maxTempRoot is null or minTempRoot is null or conditionDayRoot is null");
            return weatherForecastDay;
        }
        if (jsonElement2.isJsonNull() || jsonElement3.isJsonNull() || jsonElement4.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "parseDailyWeather() maxTempRoot is null or minTempRoot is null or conditionDayRoot is null");
            return weatherForecastDay;
        }
        int asInt = jsonElement2.getAsInt();
        int asInt2 = jsonElement3.getAsInt();
        if (asInt2 > asInt) {
            LogUtil.j("DataWeatherParseUtils", "parseDailyWeather() maxTempValue less than minTempElementValue");
            return weatherForecastDay;
        }
        weatherForecastDay.setHighestTemperature(asInt);
        weatherForecastDay.setLowestTemperature(asInt2);
        LogUtil.a("DataWeatherParseUtils", "parseDailyWeather() forecastDay:", weatherForecastDay.toString());
        return b(weatherForecastDay, jsonElement4);
    }

    private static List<WeatherForecastGlow> w(JsonObject jsonObject) {
        ArrayList arrayList = new ArrayList(16);
        if (!jsonObject.has("glow") || !(jsonObject.get("glow") instanceof JsonObject)) {
            LogUtil.j("DataWeatherParseUtils", "parseWeatherForecastGlowList HagConstant.GLOW is null or not JsonObject");
            return arrayList;
        }
        JsonObject jsonObject2 = (JsonObject) jsonObject.get("glow");
        if (!jsonObject2.has("dailys") || !(jsonObject2.get("dailys") instanceof JsonArray)) {
            LogUtil.j("DataWeatherParseUtils", "parseWeatherForecastGlowList HagConstant.GLOW_DAILYS is null or not JsonArray");
            return arrayList;
        }
        for (JsonElement jsonElement : (JsonArray) jsonObject2.get("dailys")) {
            if (!(jsonElement instanceof JsonObject)) {
                LogUtil.j("DataWeatherParseUtils", "parseWeatherForecastGlowList glowDailysElement is not instanceof JsonObject");
            } else {
                arrayList.add(v((JsonObject) jsonElement));
            }
        }
        return arrayList;
    }

    private static WeatherForecastGlow v(JsonObject jsonObject) {
        WeatherForecastGlow weatherForecastGlow = new WeatherForecastGlow();
        if (jsonObject.has("morningglow") && (jsonObject.get("morningglow") instanceof JsonObject)) {
            JsonObject jsonObject2 = (JsonObject) jsonObject.get("morningglow");
            weatherForecastGlow.setMorningProb(jsonObject2.has("prob") ? jsonObject2.get("prob").getAsInt() : 0);
            weatherForecastGlow.setMorningStart(jsonObject2.has("start") ? jsonObject2.get("start").getAsLong() / 1000 : 0L);
            weatherForecastGlow.setMorningEnd(jsonObject2.has(TtmlNode.END) ? jsonObject2.get(TtmlNode.END).getAsLong() / 1000 : 0L);
            weatherForecastGlow.setMorningQuality(jsonObject2.has("quality") ? jsonObject2.get("quality").getAsInt() : 0);
            weatherForecastGlow.setMorningQualityProb(jsonObject2.has("qualityprob") ? jsonObject2.get("qualityprob").getAsInt() : 0);
        }
        if (jsonObject.has("eveningglow") && (jsonObject.get("eveningglow") instanceof JsonObject)) {
            JsonObject jsonObject3 = (JsonObject) jsonObject.get("eveningglow");
            weatherForecastGlow.setEveningProb(jsonObject3.has("prob") ? jsonObject3.get("prob").getAsInt() : 0);
            weatherForecastGlow.setEveningStart(jsonObject3.has("start") ? jsonObject3.get("start").getAsLong() / 1000 : 0L);
            weatherForecastGlow.setEveningEnd(jsonObject3.has(TtmlNode.END) ? jsonObject3.get(TtmlNode.END).getAsLong() / 1000 : 0L);
            weatherForecastGlow.setEveningQuality(jsonObject3.has("quality") ? jsonObject3.get("quality").getAsInt() : 0);
            weatherForecastGlow.setEveningQualityProb(jsonObject3.has("qualityprob") ? jsonObject3.get("qualityprob").getAsInt() : 0);
        }
        return weatherForecastGlow;
    }

    private static WeatherForecastDay b(WeatherForecastDay weatherForecastDay, JsonElement jsonElement) {
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        if (asJsonObject == null || asJsonObject.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "parseConditionDay() conditionDay is null");
            return weatherForecastDay;
        }
        int iN = n(asJsonObject);
        int iC = c(asJsonObject);
        weatherForecastDay.setWeatherIcon(iN);
        weatherForecastDay.setCnWeatherIcon(iC);
        weatherForecastDay.setIsComplete(true);
        LogUtil.a("DataWeatherParseUtils", "parseConditionDay() forecastDay:", weatherForecastDay.toString());
        return weatherForecastDay;
    }

    private static int n(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("weatherId");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getWeatherIcon() weatherIdRoot is null");
            return 99;
        }
        Integer num = lqm.b().get(String.valueOf(jsonElement.getAsInt()));
        if (num == null) {
            LogUtil.j("DataWeatherParseUtils", "getWeatherIcon() weatherId is null");
            return 99;
        }
        return num.intValue();
    }

    private static int c(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("weatherId");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getWeatherIcon() weatherIdRoot is null");
            return 99;
        }
        Integer num = lqk.c().get(String.valueOf(jsonElement.getAsInt()));
        if (num == null) {
            LogUtil.j("DataWeatherParseUtils", "getWeatherIcon() weatherId is null");
            return 99;
        }
        return num.intValue();
    }

    private static int l(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("uvindex");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getUVIndex() uVIndexRoot is null");
            return -1;
        }
        int asInt = jsonElement.getAsInt();
        if (asInt >= 0 && asInt <= 15) {
            return asInt;
        }
        LogUtil.j("DataWeatherParseUtils", "getUVIndex() uVIndex is invalid value");
        return -1;
    }

    private static String d(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("humidity");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getHumidity() humidityRoot is null");
            return "";
        }
        return jsonElement.getAsString();
    }

    private static int p(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("windSpeed");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getWindSpeed() windSpeedRoot is null");
            return Integer.MAX_VALUE;
        }
        return jsonElement.getAsInt();
    }

    private static int h(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("realFeel");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getRealFeel() realFeelRoot is null");
            return Integer.MAX_VALUE;
        }
        return jsonElement.getAsInt();
    }

    private static String a(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("title");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getAlertTitle() titleRoot is null");
            return "";
        }
        return jsonElement.getAsString();
    }

    private static String e(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("areaName");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getAreaName() areaNameRoot is null");
            return "";
        }
        return jsonElement.getAsString();
    }

    private static int j(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("level");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getLevel() levelRoot is null");
            return -1;
        }
        return jsonElement.getAsInt();
    }

    private static String i(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("levelName");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getLevelName() levelNameRoot is null");
            return "";
        }
        return jsonElement.getAsString();
    }

    private static int f(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("type");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getType() typeRoot is null");
            return -1;
        }
        return jsonElement.getAsInt();
    }

    private static String o(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("typeName");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getTypeName() typeNameRoot is null");
            return "";
        }
        return jsonElement.getAsString();
    }

    private static String b(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("content");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getContent() contentRoot is null");
            return "";
        }
        return jsonElement.getAsString();
    }

    private static long g(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("publicTime");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getPublicTime() publicTimeRoot is null");
            return 0L;
        }
        return jsonElement.getAsLong();
    }

    private static int m(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("windLevel");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getWindLevel windLevelRoot is null");
            return -1;
        }
        int asInt = jsonElement.getAsInt();
        if (asInt >= 0 && asInt <= 17) {
            return asInt;
        }
        LogUtil.j("DataWeatherParseUtils", "getWindLevel windLevel is invalid value");
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ae  */
    private static int k(JsonObject jsonObject) {
        JsonElement jsonElement = jsonObject.get("windDir");
        if (jsonElement == null || jsonElement.isJsonNull()) {
            LogUtil.j("DataWeatherParseUtils", "getWindDirection windDirectionRoot is null");
            return -1;
        }
        String asString = jsonElement.getAsString();
        if (TextUtils.isEmpty(asString)) {
            LogUtil.j("DataWeatherParseUtils", "getWindDirection no wind");
            return 0;
        }
        asString.hashCode();
        switch (asString) {
            case "E":
                return 2;
            case "N":
                return 8;
            case "S":
                return 4;
            case "W":
                return 6;
            case "NE":
                return 1;
            case "NW":
                return 7;
            case "SE":
                return 3;
            case "SW":
                return 5;
            default:
                return -1;
        }
    }
}
