package com.huami.bluetooth.profile.channel.module.voice.content;

import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.companion.transport.CompanionModule;
import com.loc.z;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \f2\u00020\u0001:\u0004\f\r\u000e\u000fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/NLPContent;", "", "version", "", "getBytes", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$WeatherInfo;", "b", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$WeatherInfo;", "weatherInfo", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$WeatherInfo;)V", "Companion", "ForecastWeather", "Icon", CompanionModule.KEY_WEATHER_INFO, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class WeatherContent extends NLPContent {
    public static final int FLAG_AQI = 1024;
    public static final int FLAG_CURRENT_TEMPERATURE = 64;
    public static final int FLAG_CURRENT_WEATHER_DESCRIPTION = 16;
    public static final int FLAG_CURRENT_WEATHER_ICON = 32;
    public static final int FLAG_DATE = 1;
    public static final int FLAG_FORECAST_WEATHER = 512;
    public static final int FLAG_HIGH_TEMPERATURE = 128;
    public static final int FLAG_LOCATION = 2;
    public static final int FLAG_LOW_TEMPERATURE = 256;
    public static final int FLAG_SUBTITLE = 8;
    public static final int FLAG_TITLE = 4;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WeatherInfo weatherInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$ForecastWeather;", "", "", "getBytes", "", "a", "J", "date", "", "b", "Ljava/lang/String;", "highTemperature", "c", "lowTemperature", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;", "icon", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class ForecastWeather {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String highTemperature;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final String lowTemperature;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private final Icon icon;

        public ForecastWeather(long j, @NotNull String str, @NotNull String str2, @NotNull Icon icon) {
            this.date = j;
            this.highTemperature = str;
            this.lowTemperature = str2;
            this.icon = icon;
        }

        @NotNull
        public final byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(GattUtils.intToBytes((int) this.date));
            String str = this.highTemperature;
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
            String str2 = this.lowTemperature;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str2.getBytes(charset));
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(this.icon.getBytes());
            return byteArrayOutputStream.toByteArray();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;", "", "", "getBytes", "", "a", "Ljava/lang/String;", "description", "b", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Icon {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String url;

        public Icon(@NotNull String str, @NotNull String str2) {
            this.description = str;
            this.url = str2;
        }

        @NotNull
        public final byte[] getBytes() {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            String str = this.description;
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str.getBytes(charset));
            byteArrayOutputStream.write(0);
            String str2 = this.url;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            byteArrayOutputStream.write(str2.getBytes(charset));
            byteArrayOutputStream.write(0);
            return byteArrayOutputStream.toByteArray();
        }
    }

    public WeatherContent(@NotNull WeatherInfo weatherInfo) {
        super(1);
        this.weatherInfo = weatherInfo;
    }

    @Override // com.huami.bluetooth.profile.channel.module.voice.content.NLPContent
    @NotNull
    public byte[] getBytes(int version) {
        return this.weatherInfo.getBytes();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\nR*\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\n¨\u0006&"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$WeatherInfo;", "", "", "getBytes", "", "a", "Ljava/lang/Long;", "date", "", "b", "Ljava/lang/String;", "location", "c", "title", GoogleApiAvailabilityLight.a, "subTitle", "e", "description", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;", "f", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;", "icon", "g", "temperature", "h", "highTemperature", "i", "lowTemperature", "Ljava/util/ArrayList;", "Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$ForecastWeather;", "Lkotlin/collections/ArrayList;", z.j, "Ljava/util/ArrayList;", "forecastWeather", hl.k, "aqi", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/bluetooth/profile/channel/module/voice/content/WeatherContent$Icon;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class WeatherInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private final Long date;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        private final String location;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private final String subTitle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private final String description;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private final Icon icon;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private final String temperature;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private final String highTemperature;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        private final String lowTemperature;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        private final ArrayList<ForecastWeather> forecastWeather;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        private final String aqi;

        public WeatherInfo() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public WeatherInfo(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Icon icon, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable ArrayList<ForecastWeather> arrayList, @Nullable String str8) {
            this.date = l;
            this.location = str;
            this.title = str2;
            this.subTitle = str3;
            this.description = str4;
            this.icon = icon;
            this.temperature = str5;
            this.highTemperature = str6;
            this.lowTemperature = str7;
            this.forecastWeather = arrayList;
            this.aqi = str8;
        }

        @NotNull
        public final byte[] getBytes() {
            int i;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Long l = this.date;
            if (l != null) {
                i = 1;
                byteArrayOutputStream.write(GattUtils.intToBytes((int) l.longValue()));
            } else {
                i = 0;
            }
            String str = this.location;
            if (str != null) {
                i |= 2;
                Charset charset = Charsets.UTF_8;
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str.getBytes(charset));
                byteArrayOutputStream.write(0);
            }
            String str2 = this.title;
            if (str2 != null) {
                i |= 4;
                Charset charset2 = Charsets.UTF_8;
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str2.getBytes(charset2));
                byteArrayOutputStream.write(0);
            }
            String str3 = this.subTitle;
            if (str3 != null) {
                i |= 8;
                Charset charset3 = Charsets.UTF_8;
                Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str3.getBytes(charset3));
                byteArrayOutputStream.write(0);
            }
            String str4 = this.description;
            if (str4 != null) {
                i |= 16;
                Charset charset4 = Charsets.UTF_8;
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str4.getBytes(charset4));
                byteArrayOutputStream.write(0);
            }
            Icon icon = this.icon;
            if (icon != null) {
                i |= 32;
                byteArrayOutputStream.write(icon.getBytes());
            }
            String str5 = this.temperature;
            if (str5 != null) {
                i |= 64;
                Charset charset5 = Charsets.UTF_8;
                Objects.requireNonNull(str5, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str5.getBytes(charset5));
                byteArrayOutputStream.write(0);
            }
            String str6 = this.highTemperature;
            if (str6 != null) {
                i |= 128;
                Charset charset6 = Charsets.UTF_8;
                Objects.requireNonNull(str6, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str6.getBytes(charset6));
                byteArrayOutputStream.write(0);
            }
            String str7 = this.lowTemperature;
            if (str7 != null) {
                i |= 256;
                Charset charset7 = Charsets.UTF_8;
                Objects.requireNonNull(str7, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str7.getBytes(charset7));
                byteArrayOutputStream.write(0);
            }
            ArrayList<ForecastWeather> arrayList = this.forecastWeather;
            if (arrayList != null) {
                i |= 512;
                byteArrayOutputStream.write(arrayList.size());
                if (this.forecastWeather.size() > 0) {
                    Iterator<ForecastWeather> it2 = this.forecastWeather.iterator();
                    while (it2.hasNext()) {
                        byteArrayOutputStream.write(it2.next().getBytes());
                    }
                }
            }
            String str8 = this.aqi;
            if (str8 != null) {
                i |= 1024;
                Charset charset8 = Charsets.UTF_8;
                Objects.requireNonNull(str8, "null cannot be cast to non-null type java.lang.String");
                byteArrayOutputStream.write(str8.getBytes(charset8));
                byteArrayOutputStream.write(0);
            }
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            byteArrayOutputStream2.write(GattUtils.intToBytes(i));
            byteArrayOutputStream2.write(byteArrayOutputStream.toByteArray());
            return byteArrayOutputStream2.toByteArray();
        }

        public /* synthetic */ WeatherInfo(Long l, String str, String str2, String str3, String str4, Icon icon, String str5, String str6, String str7, ArrayList arrayList, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : icon, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : arrayList, (i & 1024) == 0 ? str8 : null);
        }
    }
}
