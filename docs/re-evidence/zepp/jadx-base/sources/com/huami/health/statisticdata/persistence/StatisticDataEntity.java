package com.huami.health.statisticdata.persistence;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = "statistic_data_entity_table")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010&\u001a\u00020!\u0012\u0006\u0010)\u001a\u00020\n\u0012\u0006\u0010.\u001a\u00020\u0018\u0012\u0006\u00101\u001a\u00020\n¢\u0006\u0004\b2\u00103R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001d\u001a\u00020\u00188\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010&\u001a\u00020!8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010)\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000eR\"\u0010.\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001a\u001a\u0004\b+\u0010\u001c\"\u0004\b,\u0010-R\u001c\u00101\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\f\u001a\u0004\b0\u0010\u000e¨\u00064"}, d2 = {"Lcom/huami/health/statisticdata/persistence/StatisticDataEntity;", "", "", "a", "J", "getId", "()J", WebConst.QueryParam.SET_ID, "(J)V", "id", "", "b", LogUtil.I, "getVersion", "()I", "version", "c", "getAgeGroup", "ageGroup", GoogleApiAvailabilityLight.a, "Ljava/lang/Integer;", "getTimeGroup", "()Ljava/lang/Integer;", "timeGroup", "", "e", "Ljava/lang/String;", "getItemType", "()Ljava/lang/String;", "itemType", "f", "getGender", "gender", "", "g", "F", "getCategory", "()F", "category", "h", "getCount", "count", "i", "getLocation", "setLocation", "(Ljava/lang/String;)V", "location", z.j, "getCategoryCount", "categoryCount", "<init>", "(JIILjava/lang/Integer;Ljava/lang/String;IFILjava/lang/String;I)V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final class StatisticDataEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @ColumnInfo(name = "version")
    private final int version;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @ColumnInfo(name = "age_group")
    private final int ageGroup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @ColumnInfo(name = "time_group")
    @Nullable
    private final Integer timeGroup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @ColumnInfo(name = "item_type")
    @NotNull
    private final String itemType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @ColumnInfo(name = "gender")
    private final int gender;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @ColumnInfo(name = "category")
    private final float category;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @ColumnInfo(name = "count")
    private final int count;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @ColumnInfo(name = "location")
    @NotNull
    private String location;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @ColumnInfo(name = "category_count")
    private final int categoryCount;

    public StatisticDataEntity(long j, int i, int i2, @Nullable Integer num, @NotNull String str, int i3, float f, int i4, @NotNull String str2, int i5) {
        this.id = j;
        this.version = i;
        this.ageGroup = i2;
        this.timeGroup = num;
        this.itemType = str;
        this.gender = i3;
        this.category = f;
        this.count = i4;
        this.location = str2;
        this.categoryCount = i5;
    }

    public final int getAgeGroup() {
        return this.ageGroup;
    }

    public final float getCategory() {
        return this.category;
    }

    public final int getCategoryCount() {
        return this.categoryCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getGender() {
        return this.gender;
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getItemType() {
        return this.itemType;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @Nullable
    public final Integer getTimeGroup() {
        return this.timeGroup;
    }

    public final int getVersion() {
        return this.version;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setLocation(@NotNull String str) {
        this.location = str;
    }

    public /* synthetic */ StatisticDataEntity(long j, int i, int i2, Integer num, String str, int i3, float f, int i4, String str2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : j, i, i2, (i6 & 8) != 0 ? null : num, str, i3, f, i4, str2, i5);
    }
}
