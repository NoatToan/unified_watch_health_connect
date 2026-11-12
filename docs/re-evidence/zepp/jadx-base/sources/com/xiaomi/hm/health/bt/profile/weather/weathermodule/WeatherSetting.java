package com.xiaomi.hm.health.bt.profile.weather.weathermodule;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B+\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J4\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001b\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "Ljava/io/Serializable;", "", "toString", "", "toByteArray", "", "component1", "()Ljava/lang/Boolean;", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "component2", "component3", "weatherAlarmSwitch", "currentLocatedCity", "defaultCity", "copy", "(Ljava/lang/Boolean;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;)Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "", "hashCode", "", "other", "equals", "a", "Ljava/lang/Boolean;", "getWeatherAlarmSwitch", "b", "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "getCurrentLocatedCity", "()Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;", "c", "getDefaultCity", "<init>", "(Ljava/lang/Boolean;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/City;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherSetting implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 4;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Boolean weatherAlarmSwitch;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final City currentLocatedCity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final City defaultCity;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting$Companion;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", AbstractJSONTokenResponse.RESPONSE, "Lcom/xiaomi/hm/health/bt/profile/weather/weathermodule/WeatherSetting;", "fromByteArray", "", "FLAG_ALARM_SWITCH", LogUtil.I, "FLAG_CURRENT_LOCATED_CITY", "FLAG_DEFAULT_CITY", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final WeatherSetting fromByteArray(@NotNull ModuleResult<byte[]> response) {
            if (!(response instanceof Success)) {
                return null;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap((byte[]) ((Success) response).getData());
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferWrap.get();
            if (byteBufferWrap.get() != 1) {
                return null;
            }
            int i = byteBufferWrap.getInt();
            return new WeatherSetting((i & 1) != 0 ? Boolean.valueOf(ByteBufferExtendsKt.getBoolean(byteBufferWrap)) : null, (i & 2) != 0 ? new City(ByteBufferExtendsKt.getString(byteBufferWrap), ByteBufferExtendsKt.getString(byteBufferWrap)) : null, (i & 4) != 0 ? new City(ByteBufferExtendsKt.getString(byteBufferWrap), ByteBufferExtendsKt.getString(byteBufferWrap)) : null);
        }
    }

    public WeatherSetting() {
        this(null, null, null, 7, null);
    }

    public WeatherSetting(@Nullable Boolean bool, @Nullable City city, @Nullable City city2) {
        this.weatherAlarmSwitch = bool;
        this.currentLocatedCity = city;
        this.defaultCity = city2;
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
    public final byte[] toByteArray() {
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
        byteArrayOutputStream.write(GattUtils.intToBytes(i));
        Boolean bool2 = this.weatherAlarmSwitch;
        if (bool2 != null) {
            byteArrayOutputStream.write(ByteUtilsKt.toInt(bool2.booleanValue()));
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
        return "WeatherSetting[weatherAlarmSwitch:" + this.weatherAlarmSwitch + ", currentLocatedCity: " + this.currentLocatedCity + ", defaultCity: " + this.defaultCity + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ WeatherSetting(Boolean bool, City city, City city2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : city, (i & 4) != 0 ? null : city2);
    }
}
