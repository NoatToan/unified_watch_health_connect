package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\"J\u0094\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\nHÖ\u0001J\t\u00107\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u001a\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"¨\u00068"}, d2 = {"Lcom/mi/health/course/export/data/CourseListItem;", "", "id", "", "type", "", "name", "subName", "cover", "duration", "", "maleCalorie", "femaleCalorie", "level", "pricingStatus", "trainedCount", "itemsCount", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getType", "()Ljava/lang/String;", "getName", "getSubName", "getCover", "getDuration", "()I", "getMaleCalorie", "getFemaleCalorie", "getLevel", "getPricingStatus", "getTrainedCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemsCount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/mi/health/course/export/data/CourseListItem;", "equals", "", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseListItem {

    @Nullable
    private final String cover;
    private final int duration;

    @SerializedName("female_calorie")
    private final int femaleCalorie;

    @Nullable
    private final Long id;

    @SerializedName("items_count")
    @Nullable
    private final Integer itemsCount;
    private final int level;

    @SerializedName("male_calorie")
    private final int maleCalorie;

    @Nullable
    private final String name;

    @SerializedName("pricing_status")
    private final int pricingStatus;

    @SerializedName("sub_name")
    @Nullable
    private final String subName;

    @SerializedName("trained_count")
    @Nullable
    private final Integer trainedCount;

    @Nullable
    private final String type;

    public CourseListItem() {
        this(null, null, null, null, null, 0, 0, 0, 0, 0, null, null, 4095, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getPricingStatus() {
        return this.pricingStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getTrainedCount() {
        return this.trainedCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubName() {
        return this.subName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getMaleCalorie() {
        return this.maleCalorie;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getFemaleCalorie() {
        return this.femaleCalorie;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final CourseListItem copy(@Nullable Long id, @Nullable String type, @Nullable String name, @Nullable String subName, @Nullable String cover, int duration, int maleCalorie, int femaleCalorie, int level, int pricingStatus, @Nullable Integer trainedCount, @Nullable Integer itemsCount) {
        return new CourseListItem(id, type, name, subName, cover, duration, maleCalorie, femaleCalorie, level, pricingStatus, trainedCount, itemsCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseListItem)) {
            return false;
        }
        CourseListItem courseListItem = (CourseListItem) other;
        return Intrinsics.areEqual(this.id, courseListItem.id) && Intrinsics.areEqual(this.type, courseListItem.type) && Intrinsics.areEqual(this.name, courseListItem.name) && Intrinsics.areEqual(this.subName, courseListItem.subName) && Intrinsics.areEqual(this.cover, courseListItem.cover) && this.duration == courseListItem.duration && this.maleCalorie == courseListItem.maleCalorie && this.femaleCalorie == courseListItem.femaleCalorie && this.level == courseListItem.level && this.pricingStatus == courseListItem.pricingStatus && Intrinsics.areEqual(this.trainedCount, courseListItem.trainedCount) && Intrinsics.areEqual(this.itemsCount, courseListItem.itemsCount);
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getFemaleCalorie() {
        return this.femaleCalorie;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getMaleCalorie() {
        return this.maleCalorie;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPricingStatus() {
        return this.pricingStatus;
    }

    @Nullable
    public final String getSubName() {
        return this.subName;
    }

    @Nullable
    public final Integer getTrainedCount() {
        return this.trainedCount;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.subName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cover;
        int iHashCode5 = (((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.maleCalorie)) * 31) + Integer.hashCode(this.femaleCalorie)) * 31) + Integer.hashCode(this.level)) * 31) + Integer.hashCode(this.pricingStatus)) * 31;
        Integer num = this.trainedCount;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.itemsCount;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CourseListItem(id=" + this.id + ", type=" + this.type + ", name=" + this.name + ", subName=" + this.subName + ", cover=" + this.cover + ", duration=" + this.duration + ", maleCalorie=" + this.maleCalorie + ", femaleCalorie=" + this.femaleCalorie + ", level=" + this.level + ", pricingStatus=" + this.pricingStatus + ", trainedCount=" + this.trainedCount + ", itemsCount=" + this.itemsCount + ")";
    }

    public CourseListItem(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i, int i2, int i3, int i4, int i5, @Nullable Integer num, @Nullable Integer num2) {
        this.id = l;
        this.type = str;
        this.name = str2;
        this.subName = str3;
        this.cover = str4;
        this.duration = i;
        this.maleCalorie = i2;
        this.femaleCalorie = i3;
        this.level = i4;
        this.pricingStatus = i5;
        this.trainedCount = num;
        this.itemsCount = num2;
    }

    public /* synthetic */ CourseListItem(Long l, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, Integer num, Integer num2, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0L : l, (i6 & 2) != 0 ? "" : str, (i6 & 4) != 0 ? "" : str2, (i6 & 8) != 0 ? "" : str3, (i6 & 16) == 0 ? str4 : "", (i6 & 32) != 0 ? 0 : i, (i6 & 64) != 0 ? 0 : i2, (i6 & 128) != 0 ? 0 : i3, (i6 & 256) != 0 ? 0 : i4, (i6 & 512) != 0 ? 0 : i5, (i6 & 1024) != 0 ? 0 : num, (i6 & 2048) != 0 ? 0 : num2);
    }
}
