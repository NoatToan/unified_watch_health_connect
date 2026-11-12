package com.huami.ai.entity.template;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b:\u0010;J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u007f\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u001a\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010!\u001a\u0004\b7\u0010#R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u0010#¨\u0006<"}, d2 = {"Lcom/huami/ai/entity/template/WeatherItem;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "Lcom/huami/ai/entity/template/Image;", "component8", "component9", "component10", "aqi", "date", "hTemperature", "lTemperature", "cTemperature", "description", "location", "image", "title", "subTitle", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getAqi", "()Ljava/lang/String;", "b", "J", "getDate", "()J", "c", "getHTemperature", GoogleApiAvailabilityLight.a, "getLTemperature", "e", "getCTemperature", "f", "getDescription", "g", "getLocation", "h", "Lcom/huami/ai/entity/template/Image;", "getImage", "()Lcom/huami/ai/entity/template/Image;", "i", "getTitle", z.j, "getSubTitle", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/ai/entity/template/Image;Ljava/lang/String;Ljava/lang/String;)V", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeatherItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final String aqi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String hTemperature;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String lTemperature;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String cTemperature;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String description;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String location;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Image image;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final String title;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @Nullable
    private final String subTitle;

    public WeatherItem(@Nullable String str, long j, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Image image, @Nullable String str7, @Nullable String str8) {
        this.aqi = str;
        this.date = j;
        this.hTemperature = str2;
        this.lTemperature = str3;
        this.cTemperature = str4;
        this.description = str5;
        this.location = str6;
        this.image = image;
        this.title = str7;
        this.subTitle = str8;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAqi() {
        return this.aqi;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getDate() {
        return this.date;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHTemperature() {
        return this.hTemperature;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLTemperature() {
        return this.lTemperature;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCTemperature() {
        return this.cTemperature;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Image getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final WeatherItem copy(@Nullable String aqi, long date, @Nullable String hTemperature, @Nullable String lTemperature, @Nullable String cTemperature, @Nullable String description, @Nullable String location, @Nullable Image image, @Nullable String title, @Nullable String subTitle) {
        return new WeatherItem(aqi, date, hTemperature, lTemperature, cTemperature, description, location, image, title, subTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeatherItem)) {
            return false;
        }
        WeatherItem weatherItem = (WeatherItem) other;
        return Intrinsics.areEqual(this.aqi, weatherItem.aqi) && this.date == weatherItem.date && Intrinsics.areEqual(this.hTemperature, weatherItem.hTemperature) && Intrinsics.areEqual(this.lTemperature, weatherItem.lTemperature) && Intrinsics.areEqual(this.cTemperature, weatherItem.cTemperature) && Intrinsics.areEqual(this.description, weatherItem.description) && Intrinsics.areEqual(this.location, weatherItem.location) && Intrinsics.areEqual(this.image, weatherItem.image) && Intrinsics.areEqual(this.title, weatherItem.title) && Intrinsics.areEqual(this.subTitle, weatherItem.subTitle);
    }

    @Nullable
    public final String getAqi() {
        return this.aqi;
    }

    @Nullable
    public final String getCTemperature() {
        return this.cTemperature;
    }

    public final long getDate() {
        return this.date;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getHTemperature() {
        return this.hTemperature;
    }

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    @Nullable
    public final String getLTemperature() {
        return this.lTemperature;
    }

    @Nullable
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.aqi;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + b.a(this.date)) * 31;
        String str2 = this.hTemperature;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lTemperature;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cTemperature;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.location;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Image image = this.image;
        int iHashCode7 = (iHashCode6 + (image == null ? 0 : image.hashCode())) * 31;
        String str7 = this.title;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.subTitle;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WeatherItem(aqi=" + ((Object) this.aqi) + ", date=" + this.date + ", hTemperature=" + ((Object) this.hTemperature) + ", lTemperature=" + ((Object) this.lTemperature) + ", cTemperature=" + ((Object) this.cTemperature) + ", description=" + ((Object) this.description) + ", location=" + ((Object) this.location) + ", image=" + this.image + ", title=" + ((Object) this.title) + ", subTitle=" + ((Object) this.subTitle) + ')';
    }

    public /* synthetic */ WeatherItem(String str, long j, String str2, String str3, String str4, String str5, String str6, Image image, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : image, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8);
    }
}
