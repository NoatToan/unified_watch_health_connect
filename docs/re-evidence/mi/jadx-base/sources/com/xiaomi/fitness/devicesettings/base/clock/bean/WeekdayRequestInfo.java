package com.xiaomi.fitness.devicesettings.base.clock.bean;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/clock/bean/WeekdayRequestInfo;", "", "country", "", "year", "", "<init>", "(Ljava/lang/String;I)V", "getCountry", "()Ljava/lang/String;", "getYear", "()I", "toJson", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeekdayRequestInfo {

    @NotNull
    private final String country;
    private final int year;

    public WeekdayRequestInfo(@NotNull String country, int i) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.country = country;
        this.year = i;
    }

    public static /* synthetic */ WeekdayRequestInfo copy$default(WeekdayRequestInfo weekdayRequestInfo, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = weekdayRequestInfo.country;
        }
        if ((i2 & 2) != 0) {
            i = weekdayRequestInfo.year;
        }
        return weekdayRequestInfo.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final WeekdayRequestInfo copy(@NotNull String country, int year) {
        Intrinsics.checkNotNullParameter(country, "country");
        return new WeekdayRequestInfo(country, year);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekdayRequestInfo)) {
            return false;
        }
        WeekdayRequestInfo weekdayRequestInfo = (WeekdayRequestInfo) other;
        return Intrinsics.areEqual(this.country, weekdayRequestInfo.country) && this.year == weekdayRequestInfo.year;
    }

    @NotNull
    public final String getCountry() {
        return this.country;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (this.country.hashCode() * 31) + Integer.hashCode(this.year);
    }

    @NotNull
    public final String toJson() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @NotNull
    public String toString() {
        return "WeekdayRequestInfo(country=" + this.country + ", year=" + this.year + ")";
    }
}
