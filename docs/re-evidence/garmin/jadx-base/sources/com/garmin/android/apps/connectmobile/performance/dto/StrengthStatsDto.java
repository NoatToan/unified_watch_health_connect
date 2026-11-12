package com.garmin.android.apps.connectmobile.performance.dto;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Type;
import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/StrengthStatsDto;", "", "Lorg/joda/time/LocalDate;", "calendarDate", "", "Lcom/garmin/android/apps/connectmobile/performance/dto/d;", "exerciseSummaries", "<init>", "(Lorg/joda/time/LocalDate;Ljava/util/List;)V", "a", "Lorg/joda/time/LocalDate;", "()Lorg/joda/time/LocalDate;", "b", "Ljava/util/List;", "()Ljava/util/List;", "LocalDateAdapter", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StrengthStatsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSummaries")
    private final List<d> exerciseSummaries;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/dto/StrengthStatsDto$LocalDateAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lorg/joda/time/LocalDate;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocalDateAdapter implements JsonDeserializer<LocalDate> {
        @Override // com.google.gson.JsonDeserializer
        public final LocalDate deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
            jsonElement.getClass();
            type.getClass();
            jsonDeserializationContext.getClass();
            LocalDate localDate = LocalDate.parse(jsonElement.getAsString());
            localDate.getClass();
            return localDate;
        }
    }

    public StrengthStatsDto(LocalDate localDate, List<d> list) {
        localDate.getClass();
        list.getClass();
        this.calendarDate = localDate;
        this.exerciseSummaries = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCalendarDate() {
        return this.calendarDate;
    }

    public final List<d> b() {
        return this.exerciseSummaries;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrengthStatsDto)) {
            return false;
        }
        StrengthStatsDto strengthStatsDto = (StrengthStatsDto) obj;
        return s.g(this.calendarDate, strengthStatsDto.calendarDate) && s.g(this.exerciseSummaries, strengthStatsDto.exerciseSummaries);
    }

    public final int hashCode() {
        return this.exerciseSummaries.hashCode() + (this.calendarDate.hashCode() * 31);
    }

    public final String toString() {
        return "StrengthStatsDto(calendarDate=" + this.calendarDate + ", exerciseSummaries=" + this.exerciseSummaries + ")";
    }
}
