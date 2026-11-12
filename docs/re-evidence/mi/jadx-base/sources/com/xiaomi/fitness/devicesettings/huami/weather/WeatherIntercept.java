package com.xiaomi.fitness.devicesettings.huami.weather;

import com.google.gson.Gson;
import com.huami.bluetooth.profile.channel.module.DeviceHttpRequest;
import com.huami.bluetooth.profile.channel.module.DeviceHttpResponse;
import com.xiaomi.fitness.common.extensions.NetworkExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sync.export.model.HuamiCurrentWeatherRequest;
import com.xiaomi.fitness.sync.export.model.HuamiDailyWeather;
import com.xiaomi.fitness.sync.export.model.HuamiHourlyWeather;
import com.xiaomi.fitness.sync.export.model.HuamiWeatherAlertsResponse;
import com.xiaomi.fitness.sync.export.model.HuamiWeatherResponse;
import com.xiaomi.hm.health.bt.sdk.proxy.RequestInterceptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherIntercept;", "Lcom/xiaomi/hm/health/bt/sdk/proxy/RequestInterceptor;", "<init>", "()V", "mHuamiWeatherRequest", "Lcom/xiaomi/fitness/devicesettings/huami/weather/HuaMiWeatherRequest;", "interceptor", "", "deviceHttpRequest", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpRequest;", "request", "Lcom/huami/bluetooth/profile/channel/module/DeviceHttpResponse;", "getHuamiCurrentWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResponse;", "Lcom/xiaomi/fitness/sync/export/model/HuamiCurrentWeatherRequest;", "getHuamiAlertsWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherAlertsResponse;", "getHuamiDailyWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiDailyWeather;", "getHuamiHoulyWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiHourlyWeather;", "checkParameter", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeatherIntercept implements RequestInterceptor {

    @NotNull
    public static final String TAG = "WeatherIntercept";

    @NotNull
    private final HuaMiWeatherRequest mHuamiWeatherRequest = new HuaMiWeatherRequest();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Regex regex = new Regex("(/weather+)(/v[0-9]+)?(/+)(current|forecast|forecast/hourly|cityInfo|tide|alerts+)");

    @NotNull
    private static final Regex currentWeatherRegex = new Regex("(/weather+)(/v[0-9]+)?(/+)(current+)");

    @NotNull
    private static final Regex alertWeatherRegex = new Regex("(/weather+)(/v[0-9]+)?(/+)(alerts+)");

    @NotNull
    private static final Regex hourlyWeatherRegex = new Regex("(/weather+)(/v[0-9]+)?(/+)(forecast/hourly+)");

    @NotNull
    private static final Regex dailyWeatherRegex = new Regex("(/weather+)(/v[0-9]+)?(/+)(forecast+)");

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/WeatherIntercept$Companion;", "", "<init>", "()V", "TAG", "", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "currentWeatherRegex", "getCurrentWeatherRegex", "alertWeatherRegex", "getAlertWeatherRegex", "hourlyWeatherRegex", "getHourlyWeatherRegex", "dailyWeatherRegex", "getDailyWeatherRegex", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Regex getAlertWeatherRegex() {
            return WeatherIntercept.alertWeatherRegex;
        }

        @NotNull
        public final Regex getCurrentWeatherRegex() {
            return WeatherIntercept.currentWeatherRegex;
        }

        @NotNull
        public final Regex getDailyWeatherRegex() {
            return WeatherIntercept.dailyWeatherRegex;
        }

        @NotNull
        public final Regex getHourlyWeatherRegex() {
            return WeatherIntercept.hourlyWeatherRegex;
        }

        @NotNull
        public final Regex getRegex() {
            return WeatherIntercept.regex;
        }
    }

    private final boolean checkParameter(DeviceHttpRequest deviceHttpRequest) {
        return (deviceHttpRequest.getUrl() == null || deviceHttpRequest.getMethod() == null || deviceHttpRequest.getHeader() == null) ? false : true;
    }

    private final HuamiWeatherAlertsResponse getHuamiAlertsWeather(HuamiCurrentWeatherRequest request) {
        return this.mHuamiWeatherRequest.getHuamiAlertsWeather(request).execute().a();
    }

    private final HuamiWeatherResponse getHuamiCurrentWeather(HuamiCurrentWeatherRequest request) {
        return this.mHuamiWeatherRequest.getHuamiCurrentWeather(request).execute().a();
    }

    private final HuamiDailyWeather getHuamiDailyWeather(HuamiCurrentWeatherRequest request) {
        return this.mHuamiWeatherRequest.getHuamiDailyWeather(request).execute().a();
    }

    private final HuamiHourlyWeather getHuamiHoulyWeather(HuamiCurrentWeatherRequest request) {
        return this.mHuamiWeatherRequest.getHuamiHoulyWeather(request).execute().a();
    }

    @Override // com.xiaomi.hm.health.bt.sdk.proxy.RequestInterceptor
    public boolean interceptor(@NotNull DeviceHttpRequest deviceHttpRequest) {
        Intrinsics.checkNotNullParameter(deviceHttpRequest, "deviceHttpRequest");
        if (deviceHttpRequest.getUrl() == null) {
            return false;
        }
        Regex regex2 = regex;
        String url = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url);
        boolean z = Regex.find$default(regex2, url, 0, 2, null) != null;
        Logger.i(TAG, "huami interceptor deviceHttpRequest.url =  " + deviceHttpRequest.getUrl() + " interceptor matched  =  " + z);
        return z;
    }

    @Override // com.huami.bluetooth.profile.channel.module.IHttpRequest
    @NotNull
    public DeviceHttpResponse request(@NotNull DeviceHttpRequest deviceHttpRequest) {
        Intrinsics.checkNotNullParameter(deviceHttpRequest, "deviceHttpRequest");
        if (!checkParameter(deviceHttpRequest)) {
            Logger.i(TAG, "request  checkParameter false");
            return new DeviceHttpResponse(4, 0, null, 6, null);
        }
        if (!NetworkExtKt.isNetworkAvailable()) {
            return new DeviceHttpResponse(4, 0, null, 6, null);
        }
        Regex regex2 = currentWeatherRegex;
        String url = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url);
        MatchResult matchResultFind$default = Regex.find$default(regex2, url, 0, 2, null);
        Regex regex3 = alertWeatherRegex;
        String url2 = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url2);
        MatchResult matchResultFind$default2 = Regex.find$default(regex3, url2, 0, 2, null);
        Regex regex4 = hourlyWeatherRegex;
        String url3 = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url3);
        MatchResult matchResultFind$default3 = Regex.find$default(regex4, url3, 0, 2, null);
        Regex regex5 = dailyWeatherRegex;
        String url4 = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url4);
        MatchResult matchResultFind$default4 = Regex.find$default(regex5, url4, 0, 2, null);
        HuaMiWeatherRequest huaMiWeatherRequest = this.mHuamiWeatherRequest;
        String url5 = deviceHttpRequest.getUrl();
        Intrinsics.checkNotNull(url5);
        String oneParameter = huaMiWeatherRequest.getOneParameter(url5, "locationKey");
        Logger.i(TAG, "request  current location deviceHttpRequest.url =  " + deviceHttpRequest.getUrl() + "  locationKey = " + oneParameter);
        if (oneParameter == null || oneParameter.length() == 0) {
            return new DeviceHttpResponse(0, 0, null, 6, null);
        }
        HuamiCurrentWeatherRequest huamiCurrentWeatherRequest = new HuamiCurrentWeatherRequest();
        huamiCurrentWeatherRequest.locationKey = oneParameter;
        if (matchResultFind$default != null) {
            try {
                HuamiWeatherResponse huamiCurrentWeather = getHuamiCurrentWeather(huamiCurrentWeatherRequest);
                Logger.i(TAG, " getHuamiCurrentWeather res DeviceHttpResponse =  " + (huamiCurrentWeather != null ? Integer.valueOf(huamiCurrentWeather.getCode()) : null) + ", message = " + (huamiCurrentWeather != null ? huamiCurrentWeather.getMessage() : null) + "  DeviceHttpResponse =  " + (huamiCurrentWeather != null ? huamiCurrentWeather.getResult() : null));
                if (huamiCurrentWeather != null) {
                    String json = new Gson().toJson(huamiCurrentWeather.getResult());
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    byte[] bytes = json.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    return new DeviceHttpResponse(1, 200, bytes);
                }
            } catch (Exception unused) {
                return new DeviceHttpResponse(0, 0, null, 6, null);
            }
        }
        if (matchResultFind$default2 != null) {
            try {
                HuamiWeatherAlertsResponse huamiAlertsWeather = getHuamiAlertsWeather(huamiCurrentWeatherRequest);
                Logger.i(TAG, " getHuamiAlertsWeather res DeviceHttpResponse =  " + (huamiAlertsWeather != null ? Integer.valueOf(huamiAlertsWeather.getCode()) : null) + ", message = " + (huamiAlertsWeather != null ? huamiAlertsWeather.getMessage() : null) + "  DeviceHttpResponse =  " + (huamiAlertsWeather != null ? huamiAlertsWeather.getResult() : null));
                if (huamiAlertsWeather != null) {
                    String json2 = new Gson().toJson(huamiAlertsWeather.getResult());
                    Intrinsics.checkNotNullExpressionValue(json2, "toJson(...)");
                    byte[] bytes2 = json2.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
                    return new DeviceHttpResponse(1, 200, bytes2);
                }
            } catch (Exception unused2) {
                return new DeviceHttpResponse(0, 0, null, 6, null);
            }
        }
        if (matchResultFind$default3 != null) {
            try {
                HuamiHourlyWeather huamiHoulyWeather = getHuamiHoulyWeather(huamiCurrentWeatherRequest);
                Logger.i(TAG, " getHuamiHoulyWeather res DeviceHttpResponse =  " + (huamiHoulyWeather != null ? Integer.valueOf(huamiHoulyWeather.getCode()) : null) + ", message = " + (huamiHoulyWeather != null ? huamiHoulyWeather.getMessage() : null) + "  DeviceHttpResponse =  " + (huamiHoulyWeather != null ? huamiHoulyWeather.getResult() : null));
                if (huamiHoulyWeather != null) {
                    String json3 = new Gson().toJson(huamiHoulyWeather.getResult());
                    Intrinsics.checkNotNullExpressionValue(json3, "toJson(...)");
                    byte[] bytes3 = json3.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
                    return new DeviceHttpResponse(1, 200, bytes3);
                }
            } catch (Exception unused3) {
                return new DeviceHttpResponse(0, 0, null, 6, null);
            }
        }
        if (matchResultFind$default4 != null) {
            try {
                HuamiDailyWeather huamiDailyWeather = getHuamiDailyWeather(huamiCurrentWeatherRequest);
                Logger.i(TAG, " getHuamiDailyWeather res DeviceHttpResponse =  " + (huamiDailyWeather != null ? Integer.valueOf(huamiDailyWeather.getCode()) : null) + ", message = " + (huamiDailyWeather != null ? huamiDailyWeather.getMessage() : null) + "  DeviceHttpResponse =  " + (huamiDailyWeather != null ? huamiDailyWeather.getResult() : null));
                if (huamiDailyWeather != null) {
                    String json4 = new Gson().toJson(huamiDailyWeather.getResult());
                    Intrinsics.checkNotNullExpressionValue(json4, "toJson(...)");
                    byte[] bytes4 = json4.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes4, "getBytes(...)");
                    return new DeviceHttpResponse(1, 200, bytes4);
                }
            } catch (Exception unused4) {
                return new DeviceHttpResponse(0, 0, null, 6, null);
            }
        }
        return new DeviceHttpResponse(0, 0, null, 6, null);
    }
}
