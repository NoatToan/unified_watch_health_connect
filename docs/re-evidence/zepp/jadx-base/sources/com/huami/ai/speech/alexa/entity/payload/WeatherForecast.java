package com.huami.ai.speech.alexa.entity.payload;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\f\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001c\u0010\r\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001c¨\u0006%"}, d2 = {"Lcom/huami/ai/speech/alexa/entity/payload/WeatherForecast;", "", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "component1", "", "component2", "component3", "component4", "component5", "image", "day", "date", "highTemperature", "lowTemperature", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/huami/ai/speech/alexa/entity/payload/Image;", "getImage", "()Lcom/huami/ai/speech/alexa/entity/payload/Image;", "b", "Ljava/lang/String;", "getDay", "()Ljava/lang/String;", "c", "getDate", GoogleApiAvailabilityLight.a, "getHighTemperature", "e", "getLowTemperature", "<init>", "(Lcom/huami/ai/speech/alexa/entity/payload/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherForecast {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("image")
    @NotNull
    private final Image image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("day")
    @NotNull
    private final String day;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("date")
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("highTemperature")
    @NotNull
    private final String highTemperature;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("lowTemperature")
    @NotNull
    private final String lowTemperature;

    public WeatherForecast(@NotNull Image image, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.image = image;
        this.day = str;
        this.date = str2;
        this.highTemperature = str3;
        this.lowTemperature = str4;
    }

    public static /* synthetic */ WeatherForecast copy$default(WeatherForecast weatherForecast, Image image, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            image = weatherForecast.image;
        }
        if ((i & 2) != 0) {
            str = weatherForecast.day;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = weatherForecast.date;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = weatherForecast.highTemperature;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = weatherForecast.lowTemperature;
        }
        return weatherForecast.copy(image, str5, str6, str7, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHighTemperature() {
        return this.highTemperature;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLowTemperature() {
        return this.lowTemperature;
    }

    @NotNull
    public final WeatherForecast copy(@NotNull Image image, @NotNull String day, @NotNull String date, @NotNull String highTemperature, @NotNull String lowTemperature) {
        return new WeatherForecast(image, day, date, highTemperature, lowTemperature);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherForecast)) {
            return false;
        }
        WeatherForecast weatherForecast = (WeatherForecast) other;
        return Intrinsics.areEqual(this.image, weatherForecast.image) && Intrinsics.areEqual(this.day, weatherForecast.day) && Intrinsics.areEqual(this.date, weatherForecast.date) && Intrinsics.areEqual(this.highTemperature, weatherForecast.highTemperature) && Intrinsics.areEqual(this.lowTemperature, weatherForecast.lowTemperature);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final String getDay() {
        return this.day;
    }

    @NotNull
    public final String getHighTemperature() {
        return this.highTemperature;
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    @NotNull
    public final String getLowTemperature() {
        return this.lowTemperature;
    }

    public int hashCode() {
        return (((((((this.image.hashCode() * 31) + this.day.hashCode()) * 31) + this.date.hashCode()) * 31) + this.highTemperature.hashCode()) * 31) + this.lowTemperature.hashCode();
    }

    @NotNull
    public String toString() {
        return "WeatherForecast(image=" + this.image + ", day=" + this.day + ", date=" + this.date + ", highTemperature=" + this.highTemperature + ", lowTemperature=" + this.lowTemperature + ')';
    }
}
