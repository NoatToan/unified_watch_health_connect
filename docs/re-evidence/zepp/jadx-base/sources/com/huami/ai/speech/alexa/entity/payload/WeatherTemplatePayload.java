package com.huami.ai.speech.alexa.entity.payload;

import com.amap.api.mapcore.util.hl;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010$\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b:\u0010;J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003R\u001c\u0010\r\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000e\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u000f\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0010\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\u0011\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R6\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b1\u00102\u0012\u0004\b7\u00108\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/WeatherTemplatePayload;", "Lcom/huami/ai/speech/alexa/entity/payload/BaseTemplateRuntimePayload;", "", "component1", "component2", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "component3", "Lcom/huami/ai/speech/alexa/entity/payload/Temperature;", "component4", "component5", "", "Lcom/huami/ai/speech/alexa/entity/payload/WeatherForecast;", "component6", "currentWeather", "description", "currentWeatherIcon", "highTemperature", "lowTemperature", "weatherForecast", "copy", "toString", "", "hashCode", "", "other", "", "equals", "e", "Ljava/lang/String;", "getCurrentWeather", "()Ljava/lang/String;", "f", "getDescription", "g", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "getCurrentWeatherIcon", "()Lcom/huami/ai/speech/alexa/entity/payload/Image;", "h", "Lcom/huami/ai/speech/alexa/entity/payload/Temperature;", "getHighTemperature", "()Lcom/huami/ai/speech/alexa/entity/payload/Temperature;", "i", "getLowTemperature", z.j, "Ljava/util/List;", "getWeatherForecast", "()Ljava/util/List;", "", "", hl.k, "Ljava/util/Map;", "getResource", "()Ljava/util/Map;", "setResource", "(Ljava/util/Map;)V", "getResource$annotations", "()V", "resource", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/speech/alexa/entity/payload/Image;Lcom/huami/ai/speech/alexa/entity/payload/Temperature;Lcom/huami/ai/speech/alexa/entity/payload/Temperature;Ljava/util/List;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherTemplatePayload extends BaseTemplateRuntimePayload {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("currentWeather")
    @NotNull
    private final String currentWeather;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("description")
    @NotNull
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName("currentWeatherIcon")
    @NotNull
    private final Image currentWeatherIcon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName("highTemperature")
    @NotNull
    private final Temperature highTemperature;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("lowTemperature")
    @NotNull
    private final Temperature lowTemperature;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("weatherForecast")
    @NotNull
    private final List<WeatherForecast> weatherForecast;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private Map<String, byte[]> resource;

    public WeatherTemplatePayload(@NotNull String str, @NotNull String str2, @NotNull Image image, @NotNull Temperature temperature, @NotNull Temperature temperature2, @NotNull List<WeatherForecast> list) {
        super(null, null, null, null, 15, null);
        this.currentWeather = str;
        this.description = str2;
        this.currentWeatherIcon = image;
        this.highTemperature = temperature;
        this.lowTemperature = temperature2;
        this.weatherForecast = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeatherTemplatePayload copy$default(WeatherTemplatePayload weatherTemplatePayload, String str, String str2, Image image, Temperature temperature, Temperature temperature2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = weatherTemplatePayload.currentWeather;
        }
        if ((i & 2) != 0) {
            str2 = weatherTemplatePayload.description;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            image = weatherTemplatePayload.currentWeatherIcon;
        }
        Image image2 = image;
        if ((i & 8) != 0) {
            temperature = weatherTemplatePayload.highTemperature;
        }
        Temperature temperature3 = temperature;
        if ((i & 16) != 0) {
            temperature2 = weatherTemplatePayload.lowTemperature;
        }
        Temperature temperature4 = temperature2;
        if ((i & 32) != 0) {
            list = weatherTemplatePayload.weatherForecast;
        }
        return weatherTemplatePayload.copy(str, str3, image2, temperature3, temperature4, list);
    }

    public static /* synthetic */ void getResource$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentWeather() {
        return this.currentWeather;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Image getCurrentWeatherIcon() {
        return this.currentWeatherIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Temperature getHighTemperature() {
        return this.highTemperature;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Temperature getLowTemperature() {
        return this.lowTemperature;
    }

    @NotNull
    public final List<WeatherForecast> component6() {
        return this.weatherForecast;
    }

    @NotNull
    public final WeatherTemplatePayload copy(@NotNull String currentWeather, @NotNull String description, @NotNull Image currentWeatherIcon, @NotNull Temperature highTemperature, @NotNull Temperature lowTemperature, @NotNull List<WeatherForecast> weatherForecast) {
        return new WeatherTemplatePayload(currentWeather, description, currentWeatherIcon, highTemperature, lowTemperature, weatherForecast);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherTemplatePayload)) {
            return false;
        }
        WeatherTemplatePayload weatherTemplatePayload = (WeatherTemplatePayload) other;
        return Intrinsics.areEqual(this.currentWeather, weatherTemplatePayload.currentWeather) && Intrinsics.areEqual(this.description, weatherTemplatePayload.description) && Intrinsics.areEqual(this.currentWeatherIcon, weatherTemplatePayload.currentWeatherIcon) && Intrinsics.areEqual(this.highTemperature, weatherTemplatePayload.highTemperature) && Intrinsics.areEqual(this.lowTemperature, weatherTemplatePayload.lowTemperature) && Intrinsics.areEqual(this.weatherForecast, weatherTemplatePayload.weatherForecast);
    }

    @NotNull
    public final String getCurrentWeather() {
        return this.currentWeather;
    }

    @NotNull
    public final Image getCurrentWeatherIcon() {
        return this.currentWeatherIcon;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final Temperature getHighTemperature() {
        return this.highTemperature;
    }

    @NotNull
    public final Temperature getLowTemperature() {
        return this.lowTemperature;
    }

    @Nullable
    public final Map<String, byte[]> getResource() {
        return this.resource;
    }

    @NotNull
    public final List<WeatherForecast> getWeatherForecast() {
        return this.weatherForecast;
    }

    public int hashCode() {
        return (((((((((this.currentWeather.hashCode() * 31) + this.description.hashCode()) * 31) + this.currentWeatherIcon.hashCode()) * 31) + this.highTemperature.hashCode()) * 31) + this.lowTemperature.hashCode()) * 31) + this.weatherForecast.hashCode();
    }

    public final void setResource(@Nullable Map<String, byte[]> map) {
        this.resource = map;
    }

    @NotNull
    public String toString() {
        return "WeatherTemplatePayload(currentWeather=" + this.currentWeather + ", description=" + this.description + ", currentWeatherIcon=" + this.currentWeatherIcon + ", highTemperature=" + this.highTemperature + ", lowTemperature=" + this.lowTemperature + ", weatherForecast=" + this.weatherForecast + ')';
    }
}
