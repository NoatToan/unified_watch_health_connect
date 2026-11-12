package com.xiaomi.fitness.devicesettings.huami.weather;

import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.sync.export.model.HuamiDailyWeather;
import com.xiaomi.fitness.sync.export.model.HuamiHourlyWeather;
import com.xiaomi.fitness.sync.export.model.HuamiWeatherAlertsResponse;
import com.xiaomi.fitness.sync.export.model.HuamiWeatherResponse;
import defpackage.ka3;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/weather/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\u0007J\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/HuamiWeatherService;", "", "", "data", "Lka3;", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherResponse;", "getHuamiCurrentWeather", "(Ljava/lang/String;)Lka3;", "Lcom/xiaomi/fitness/sync/export/model/HuamiWeatherAlertsResponse;", "getHuamiAlertsWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiHourlyWeather;", "getHuamiHourlyWeather", "Lcom/xiaomi/fitness/sync/export/model/HuamiDailyWeather;", "getHuamiDailyWeather", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface HuamiWeatherService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String WEATHER_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String WEATHER_PATH = "app/v1/weather/";

    @NotNull
    public static final String WEATHER_SID = "miothealth";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/weather/HuamiWeatherService$Companion;", "", "<init>", "()V", "WEATHER_SID", "", "WEATHER_HOST", "WEATHER_PATH", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String WEATHER_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String WEATHER_PATH = "app/v1/weather/";

        @NotNull
        public static final String WEATHER_SID = "miothealth";

        private Companion() {
        }
    }

    @NotNull
    @uua("alerts_for_huami")
    ka3<HuamiWeatherAlertsResponse> getHuamiAlertsWeather(@NotNull @xfi("data") String data);

    @NotNull
    @uua("current_for_huami")
    ka3<HuamiWeatherResponse> getHuamiCurrentWeather(@NotNull @xfi("data") String data);

    @NotNull
    @uua("daily_for_huami")
    ka3<HuamiDailyWeather> getHuamiDailyWeather(@NotNull @xfi("data") String data);

    @NotNull
    @uua("hourly_for_huami")
    ka3<HuamiHourlyWeather> getHuamiHourlyWeather(@NotNull @xfi("data") String data);
}
