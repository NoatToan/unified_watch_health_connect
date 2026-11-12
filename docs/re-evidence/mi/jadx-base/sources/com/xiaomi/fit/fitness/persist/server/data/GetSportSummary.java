package com.xiaomi.fit.fitness.persist.server.data;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.fitness.persist.db.internal.SportSummaryDaoKt;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003Jf\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\tHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017¨\u0006*"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/server/data/GetSportSummary;", "", "category", "", "granularity", SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, "", SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, "limit", "", RouteRequest.KEY_NEXT_KEY, "stats_type", "zone_offset", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;I)V", "getCategory", "()Ljava/lang/String;", "getGranularity", "getStart_time", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEnd_time", "getLimit", "()I", "getNext_key", "getStats_type", "getZone_offset", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;ILjava/lang/String;Ljava/lang/String;I)Lcom/xiaomi/fit/fitness/persist/server/data/GetSportSummary;", "equals", "", "other", "hashCode", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetSportSummary {

    @Nullable
    private final String category;

    @Nullable
    private final Long end_time;

    @NotNull
    private final String granularity;
    private final int limit;

    @Nullable
    private final String next_key;

    @Nullable
    private final Long start_time;

    @NotNull
    private final String stats_type;
    private final int zone_offset;

    public GetSportSummary() {
        this(null, null, null, null, 0, null, null, 0, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGranularity() {
        return this.granularity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getStart_time() {
        return this.start_time;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getEnd_time() {
        return this.end_time;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStats_type() {
        return this.stats_type;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getZone_offset() {
        return this.zone_offset;
    }

    @NotNull
    public final GetSportSummary copy(@Nullable String category, @NotNull String granularity, @Nullable Long start_time, @Nullable Long end_time, int limit, @Nullable String next_key, @NotNull String stats_type, int zone_offset) {
        Intrinsics.checkNotNullParameter(granularity, "granularity");
        Intrinsics.checkNotNullParameter(stats_type, "stats_type");
        return new GetSportSummary(category, granularity, start_time, end_time, limit, next_key, stats_type, zone_offset);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetSportSummary)) {
            return false;
        }
        GetSportSummary getSportSummary = (GetSportSummary) other;
        return Intrinsics.areEqual(this.category, getSportSummary.category) && Intrinsics.areEqual(this.granularity, getSportSummary.granularity) && Intrinsics.areEqual(this.start_time, getSportSummary.start_time) && Intrinsics.areEqual(this.end_time, getSportSummary.end_time) && this.limit == getSportSummary.limit && Intrinsics.areEqual(this.next_key, getSportSummary.next_key) && Intrinsics.areEqual(this.stats_type, getSportSummary.stats_type) && this.zone_offset == getSportSummary.zone_offset;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Long getEnd_time() {
        return this.end_time;
    }

    @NotNull
    public final String getGranularity() {
        return this.granularity;
    }

    public final int getLimit() {
        return this.limit;
    }

    @Nullable
    public final String getNext_key() {
        return this.next_key;
    }

    @Nullable
    public final Long getStart_time() {
        return this.start_time;
    }

    @NotNull
    public final String getStats_type() {
        return this.stats_type;
    }

    public final int getZone_offset() {
        return this.zone_offset;
    }

    public int hashCode() {
        String str = this.category;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.granularity.hashCode()) * 31;
        Long l = this.start_time;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.end_time;
        int iHashCode3 = (((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + Integer.hashCode(this.limit)) * 31;
        String str2 = this.next_key;
        return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.stats_type.hashCode()) * 31) + Integer.hashCode(this.zone_offset);
    }

    @NotNull
    public String toString() {
        return "GetSportSummary(category=" + this.category + ", granularity=" + this.granularity + ", start_time=" + this.start_time + ", end_time=" + this.end_time + ", limit=" + this.limit + ", next_key=" + this.next_key + ", stats_type=" + this.stats_type + ", zone_offset=" + this.zone_offset + ")";
    }

    public GetSportSummary(@Nullable String str, @NotNull String granularity, @Nullable Long l, @Nullable Long l2, int i, @Nullable String str2, @NotNull String stats_type, int i2) {
        Intrinsics.checkNotNullParameter(granularity, "granularity");
        Intrinsics.checkNotNullParameter(stats_type, "stats_type");
        this.category = str;
        this.granularity = granularity;
        this.start_time = l;
        this.end_time = l2;
        this.limit = i;
        this.next_key = str2;
        this.stats_type = stats_type;
        this.zone_offset = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetSportSummary(String str, String str2, Long l, Long l2, int i, String str3, String str4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        String str5;
        String str6 = (i3 & 1) != 0 ? null : str;
        String str7 = (i3 & 2) != 0 ? SportDataTypeKt.DIMEN_TOTAL : str2;
        Long l3 = (i3 & 4) != 0 ? null : l;
        Long l4 = (i3 & 8) != 0 ? null : l2;
        if ((i3 & 16) != 0) {
            i4 = Intrinsics.areEqual(str7, SportDataTypeKt.DIMEN_TOTAL) ? 1 : 100;
        } else {
            i4 = i;
        }
        String str8 = (i3 & 32) == 0 ? str3 : null;
        if ((i3 & 64) != 0) {
            str5 = (str6 == null || str6.length() == 0) ? "sport_stats_all" : SportSummaryDaoKt.SPORT_CATEGORY_SPECIFY;
        } else {
            str5 = str4;
        }
        this(str6, str7, l3, l4, i4, str8, str5, (i3 & 128) != 0 ? 0 : i2);
    }
}
