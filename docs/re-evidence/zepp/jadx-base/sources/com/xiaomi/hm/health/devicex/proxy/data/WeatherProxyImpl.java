package com.xiaomi.hm.health.devicex.proxy.data;

import com.huami.devicex.injection.data.WeatherApi;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import com.xiaomi.hm.health.locweather.model.CityInfo;
import com.xiaomi.hm.health.locweather.model.WeatherInfos;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R%\u0010\u001b\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/data/WeatherProxyImpl;", "Lcom/huami/devicex/injection/data/WeatherApi;", "", "getLocationCode", "getLocationCity", "getLocationProvince", "Lcom/xiaomi/hm/health/locweather/model/WeatherInfos;", "getWeatherInfoForDevice", "getWeatherInfo", "", "updateAlert", "name", "", "source", "", "Lcom/xiaomi/hm/health/locweather/model/CityInfo;", "searchCities", "requestLocation", "requestLocationOnly", "requestLocationLimited", "cancelLocation", "clearData", "Lcom/xiaomi/hm/health/locweather/LocWeatherManager;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/locweather/LocWeatherManager;", "weatherManager", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WeatherProxyImpl implements WeatherApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy weatherManager = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/locweather/LocWeatherManager;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<LocWeatherManager> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LocWeatherManager invoke() {
            return LocWeatherManager.getInstance();
        }
    }

    private final LocWeatherManager a() {
        return (LocWeatherManager) this.weatherManager.getValue();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    public void cancelLocation() {
        a().cancelLocation();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    public void clearData() {
        a().clearData();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    @NotNull
    public String getLocationCity() {
        return a().getLocationCity();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    @NotNull
    public String getLocationCode() {
        return a().getLocationAddressCode();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    @NotNull
    public String getLocationProvince() {
        return a().getLocationProvince();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    @Nullable
    public WeatherInfos getWeatherInfo() {
        return a().getWeatherInfos();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    @Nullable
    public WeatherInfos getWeatherInfoForDevice() {
        return a().getWeatherInfosForDevice();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    public void requestLocation() {
        a().requestLocation();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    public void requestLocationLimited() {
        a().requestLocationLimited();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    public void requestLocationOnly() {
        a().requestLocationOnly();
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    @Nullable
    public List<CityInfo> searchCities(@Nullable String name, int source) {
        return LocWeatherManager.searchCities(name, source);
    }

    @Override // com.huami.devicex.injection.data.WeatherApi
    public void updateAlert() {
        a().updateAlert();
    }
}
