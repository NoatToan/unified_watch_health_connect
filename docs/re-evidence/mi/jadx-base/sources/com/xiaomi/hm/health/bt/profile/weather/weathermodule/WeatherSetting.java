package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import defpackage.c3;
import defpackage.fu;
import defpackage.ol;
import defpackage.tet;
import defpackage.z2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB+\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "Ljava/io/Serializable;", "", "toString", "", "toByteArray", "", "component1", "()Ljava/lang/Boolean;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "component2", "component3", "weatherAlarmSwitch", "currentLocatedCity", "defaultCity", "copy", "(Ljava/lang/Boolean;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;)Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "", "hashCode", "", "other", "equals", "Ljava/lang/Boolean;", "getWeatherAlarmSwitch", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "getCurrentLocatedCity", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "getDefaultCity", "<init>", "(Ljava/lang/Boolean;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class WeatherSetting implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int FLAG_ALARM_SWITCH = 1;
    private static final int FLAG_CURRENT_LOCATED_CITY = 2;
    private static final int FLAG_DEFAULT_CITY = 4;
    private static final long serialVersionUID = 1;

    @Nullable
    private final City currentLocatedCity;

    @Nullable
    private final City defaultCity;

    @Nullable
    private final Boolean weatherAlarmSwitch;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.profile.weather.weathermodule.WeatherSetting$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting$a;", "", "Lol;", "", b.I, "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", PluginDeviceInfo.FMODEL, "", "FLAG_ALARM_SWITCH", "I", "FLAG_CURRENT_LOCATED_CITY", "FLAG_DEFAULT_CITY", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final WeatherSetting a(@NotNull ol<byte[]> response) {
            Boolean boolValueOf;
            City city;
            Intrinsics.checkNotNullParameter(response, "response");
            City city2 = null;
            if (!(response instanceof fu)) {
                return null;
            }
            ByteBuffer byteBuffer = ByteBuffer.wrap((byte[]) ((fu) response).a());
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.get();
            if (byteBuffer.get() != 1) {
                return null;
            }
            int i = byteBuffer.getInt();
            if ((i & 1) != 0) {
                Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                boolValueOf = Boolean.valueOf(z2.l(byteBuffer));
            } else {
                boolValueOf = null;
            }
            if ((i & 2) != 0) {
                Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                city = new City(z2.q(byteBuffer), z2.q(byteBuffer));
            } else {
                city = null;
            }
            if ((i & 4) != 0) {
                Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                city2 = new City(z2.q(byteBuffer), z2.q(byteBuffer));
            }
            return new WeatherSetting(boolValueOf, city, city2);
        }
    }

    public WeatherSetting() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ WeatherSetting copy$default(WeatherSetting weatherSetting, Boolean bool, City city, City city2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = weatherSetting.weatherAlarmSwitch;
        }
        if ((i & 2) != 0) {
            city = weatherSetting.currentLocatedCity;
        }
        if ((i & 4) != 0) {
            city2 = weatherSetting.defaultCity;
        }
        return weatherSetting.copy(bool, city, city2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getWeatherAlarmSwitch() {
        return this.weatherAlarmSwitch;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final City getCurrentLocatedCity() {
        return this.currentLocatedCity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final City getDefaultCity() {
        return this.defaultCity;
    }

    @NotNull
    public final WeatherSetting copy(@Nullable Boolean weatherAlarmSwitch, @Nullable City currentLocatedCity, @Nullable City defaultCity) {
        return new WeatherSetting(weatherAlarmSwitch, currentLocatedCity, defaultCity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherSetting)) {
            return false;
        }
        WeatherSetting weatherSetting = (WeatherSetting) other;
        return Intrinsics.areEqual(this.weatherAlarmSwitch, weatherSetting.weatherAlarmSwitch) && Intrinsics.areEqual(this.currentLocatedCity, weatherSetting.currentLocatedCity) && Intrinsics.areEqual(this.defaultCity, weatherSetting.defaultCity);
    }

    @Nullable
    public final City getCurrentLocatedCity() {
        return this.currentLocatedCity;
    }

    @Nullable
    public final City getDefaultCity() {
        return this.defaultCity;
    }

    @Nullable
    public final Boolean getWeatherAlarmSwitch() {
        return this.weatherAlarmSwitch;
    }

    public int hashCode() {
        Boolean bool = this.weatherAlarmSwitch;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        City city = this.currentLocatedCity;
        int iHashCode2 = (iHashCode + (city == null ? 0 : city.hashCode())) * 31;
        City city2 = this.defaultCity;
        return iHashCode2 + (city2 != null ? city2.hashCode() : 0);
    }

    @Nullable
    public final byte[] toByteArray() throws IOException {
        Boolean bool = this.weatherAlarmSwitch;
        if (bool == null && this.currentLocatedCity == null && this.defaultCity == null) {
            return null;
        }
        int i = bool != null ? 1 : 0;
        if (this.currentLocatedCity != null) {
            i |= 2;
        }
        if (this.defaultCity != null) {
            i |= 4;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(tet.p(i));
        Boolean bool2 = this.weatherAlarmSwitch;
        if (bool2 != null) {
            byteArrayOutputStream.write(c3.b(bool2.booleanValue()));
        }
        City city = this.currentLocatedCity;
        if (city != null) {
            byteArrayOutputStream.write(city.toByteArray());
        }
        City city2 = this.defaultCity;
        if (city2 != null) {
            byteArrayOutputStream.write(city2.toByteArray());
        }
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public String toString() {
        return "WeatherSetting[weatherAlarmSwitch:" + this.weatherAlarmSwitch + ", currentLocatedCity: " + this.currentLocatedCity + ", defaultCity: " + this.defaultCity + AbstractJsonLexerKt.END_LIST;
    }

    public WeatherSetting(@Nullable Boolean bool, @Nullable City city, @Nullable City city2) {
        this.weatherAlarmSwitch = bool;
        this.currentLocatedCity = city;
        this.defaultCity = city2;
    }

    public /* synthetic */ WeatherSetting(Boolean bool, City city, City city2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : city, (i & 4) != 0 ? null : city2);
    }
}
