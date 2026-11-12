package com.xiaomi.fit.fitness.persist.db.internal;

import androidx.room.ColumnInfo;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010#\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0005H&J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020/H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 \u0082\u0001\u0003012¨\u00063"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "", "<init>", "()V", "sid", "", "getSid", "()Ljava/lang/String;", "key", "getKey", "time", "", "getTime", "()J", "zoneOffsetInSec", "", "getZoneOffsetInSec", "()I", "setZoneOffsetInSec", "(I)V", "zoneName", "getZoneName", "setZoneName", "(Ljava/lang/String;)V", FitnessDBConstants.COL_TIME_0_TZ, "getTimeIn0Tz", "setTimeIn0Tz", "(J)V", "isUpload", "", "()Z", "setUpload", "(Z)V", "isDeleted", "setDeleted", "getRecordValue", "setRecordValue", "", "value", "setRecordItem", "item", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "setFromLocalRecord", "recordModel", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "setFromServerRecord", "record", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordCommonEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/VitalityRecordEntity;", "Lcom/xiaomi/fit/fitness/persist/db/internal/WeightItemEntity;", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DailyRecordBaseEntity {

    @ColumnInfo(name = "isDeleted")
    private boolean isDeleted;

    @ColumnInfo(name = "isUpload")
    private boolean isUpload;

    @ColumnInfo(name = FitnessDBConstants.COL_TIME_0_TZ)
    private long timeIn0Tz;

    @Nullable
    private String zoneName;
    private int zoneOffsetInSec;

    private DailyRecordBaseEntity() {
    }

    public /* synthetic */ DailyRecordBaseEntity(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public abstract String getKey();

    @Nullable
    public abstract String getRecordValue();

    @NotNull
    public abstract String getSid();

    public abstract long getTime();

    public final long getTimeIn0Tz() {
        return this.timeIn0Tz;
    }

    @Nullable
    public final String getZoneName() {
        return this.zoneName;
    }

    public final int getZoneOffsetInSec() {
        return this.zoneOffsetInSec;
    }

    /* JADX INFO: renamed from: isDeleted, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    /* JADX INFO: renamed from: isUpload, reason: from getter */
    public final boolean getIsUpload() {
        return this.isUpload;
    }

    public final void setDeleted(boolean z) {
        this.isDeleted = z;
    }

    public void setFromLocalRecord(@NotNull DailyRecordItemModel recordModel) {
        Intrinsics.checkNotNullParameter(recordModel, "recordModel");
        this.zoneOffsetInSec = recordModel.getZoneOffsetInSec();
        this.zoneName = recordModel.getZoneName();
        setRecordItem(recordModel.getItem());
        this.isUpload = false;
        this.isDeleted = false;
        this.timeIn0Tz = getTime() + ((long) this.zoneOffsetInSec);
    }

    public void setFromServerRecord(@NotNull FitnessDataModel record) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(record, "record");
        if (record.getZoneOffsetInSec() != null) {
            Integer zoneOffsetInSec = record.getZoneOffsetInSec();
            Intrinsics.checkNotNull(zoneOffsetInSec);
            iIntValue = zoneOffsetInSec.intValue();
        } else {
            iIntValue = 0;
        }
        this.zoneOffsetInSec = iIntValue;
        this.zoneName = record.getZoneName();
        String value = record.getValue();
        Intrinsics.checkNotNull(value);
        setRecordValue(value);
        this.isUpload = true;
        this.isDeleted = false;
        this.timeIn0Tz = getTime() + ((long) this.zoneOffsetInSec);
    }

    public void setRecordItem(@NotNull DailyRecordItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String dbKey = item.getDbKey();
        Long dbTime = item.getDbTime();
        String sid = item.getSid();
        item.clearDataNotSaveToDb();
        String json = FitnessPersistUtils.INSTANCE.toJson(item);
        item.setDbKey(dbKey);
        item.setDbTime(dbTime);
        item.setSid(sid);
        setRecordValue(json);
    }

    public abstract void setRecordValue(@NotNull String value);

    public final void setTimeIn0Tz(long j) {
        this.timeIn0Tz = j;
    }

    public final void setUpload(boolean z) {
        this.isUpload = z;
    }

    public final void setZoneName(@Nullable String str) {
        this.zoneName = str;
    }

    public final void setZoneOffsetInSec(int i) {
        this.zoneOffsetInSec = i;
    }
}
