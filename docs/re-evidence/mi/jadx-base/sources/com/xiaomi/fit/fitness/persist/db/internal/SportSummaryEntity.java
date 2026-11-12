package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.Entity;
import androidx.room.TypeConverters;
import com.xiaomi.fit.data.common.data.sport.SportSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@TypeConverters({SportSummaryConverter.class})
@Entity(primaryKeys = {"category", "dimen", "timeIn0TZ"}, tableName = "sport_summary")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/SportSummaryEntity;", "", "category", "", "dimen", "timeIn0TZ", "", "zoneOffsetSec", "", "summary", "Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "<init>", "(Ljava/lang/String;Ljava/lang/String;JILcom/xiaomi/fit/data/common/data/sport/SportSummary;)V", "getCategory", "()Ljava/lang/String;", "getDimen", "getTimeIn0TZ", "()J", "getZoneOffsetSec", "()I", "getSummary", "()Lcom/xiaomi/fit/data/common/data/sport/SportSummary;", "setSummary", "(Lcom/xiaomi/fit/data/common/data/sport/SportSummary;)V", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SportSummaryEntity {

    @NotNull
    private final String category;

    @NotNull
    private final String dimen;

    @NotNull
    private SportSummary summary;
    private final long timeIn0TZ;
    private final int zoneOffsetSec;

    public SportSummaryEntity(@NotNull String category, @NotNull String dimen, long j, int i, @NotNull SportSummary summary) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(dimen, "dimen");
        Intrinsics.checkNotNullParameter(summary, "summary");
        this.category = category;
        this.dimen = dimen;
        this.timeIn0TZ = j;
        this.zoneOffsetSec = i;
        this.summary = summary;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getDimen() {
        return this.dimen;
    }

    @NotNull
    public final SportSummary getSummary() {
        return this.summary;
    }

    public final long getTimeIn0TZ() {
        return this.timeIn0TZ;
    }

    public final int getZoneOffsetSec() {
        return this.zoneOffsetSec;
    }

    public final void setSummary(@NotNull SportSummary sportSummary) {
        Intrinsics.checkNotNullParameter(sportSummary, "<set-?>");
        this.summary = sportSummary;
    }
}
