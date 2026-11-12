package com.mi.health.course.export.data;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\"\u0010'\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0010HÆ\u0003J~\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\u00102\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\bHÖ\u0001J\t\u0010/\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR'\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010!¨\u00060"}, d2 = {"Lcom/mi/health/course/export/data/CourseSeriesData;", "", "id", "", "name", "", "cover", "trainedCount", "", "itemsCount", "item", "Lkotlin/collections/ArrayList;", "Lcom/mi/health/course/export/data/CourseListItem;", "Ljava/util/ArrayList;", "introduce", "isError", "", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "()Ljava/lang/String;", "getCover", "getTrainedCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItemsCount", "getItem", "()Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "getIntroduce", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;Z)Lcom/mi/health/course/export/data/CourseSeriesData;", "equals", "other", "hashCode", "toString", "course-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseSeriesData {

    @Nullable
    private final String cover;

    @Nullable
    private final Long id;

    @Nullable
    private final String introduce;
    private final boolean isError;

    @Nullable
    private final ArrayList<CourseListItem> item;

    @SerializedName("items_count")
    @Nullable
    private final Integer itemsCount;

    @Nullable
    private final String name;

    @SerializedName("trained_count")
    @Nullable
    private final Integer trainedCount;

    public CourseSeriesData() {
        this(null, null, null, null, null, null, null, false, 255, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTrainedCount() {
        return this.trainedCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @Nullable
    public final ArrayList<CourseListItem> component6() {
        return this.item;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsError() {
        return this.isError;
    }

    @NotNull
    public final CourseSeriesData copy(@Nullable Long id, @Nullable String name, @Nullable String cover, @Nullable Integer trainedCount, @Nullable Integer itemsCount, @Nullable ArrayList<CourseListItem> item, @Nullable String introduce, boolean isError) {
        return new CourseSeriesData(id, name, cover, trainedCount, itemsCount, item, introduce, isError);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseSeriesData)) {
            return false;
        }
        CourseSeriesData courseSeriesData = (CourseSeriesData) other;
        return Intrinsics.areEqual(this.id, courseSeriesData.id) && Intrinsics.areEqual(this.name, courseSeriesData.name) && Intrinsics.areEqual(this.cover, courseSeriesData.cover) && Intrinsics.areEqual(this.trainedCount, courseSeriesData.trainedCount) && Intrinsics.areEqual(this.itemsCount, courseSeriesData.itemsCount) && Intrinsics.areEqual(this.item, courseSeriesData.item) && Intrinsics.areEqual(this.introduce, courseSeriesData.introduce) && this.isError == courseSeriesData.isError;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final Long getId() {
        return this.id;
    }

    @Nullable
    public final String getIntroduce() {
        return this.introduce;
    }

    @Nullable
    public final ArrayList<CourseListItem> getItem() {
        return this.item;
    }

    @Nullable
    public final Integer getItemsCount() {
        return this.itemsCount;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getTrainedCount() {
        return this.trainedCount;
    }

    public int hashCode() {
        Long l = this.id;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cover;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.trainedCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.itemsCount;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        ArrayList<CourseListItem> arrayList = this.item;
        int iHashCode6 = (iHashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str3 = this.introduce;
        return ((iHashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isError);
    }

    public final boolean isError() {
        return this.isError;
    }

    @NotNull
    public String toString() {
        return "CourseSeriesData(id=" + this.id + ", name=" + this.name + ", cover=" + this.cover + ", trainedCount=" + this.trainedCount + ", itemsCount=" + this.itemsCount + ", item=" + this.item + ", introduce=" + this.introduce + ", isError=" + this.isError + ")";
    }

    public CourseSeriesData(@Nullable Long l, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable Integer num2, @Nullable ArrayList<CourseListItem> arrayList, @Nullable String str3, boolean z) {
        this.id = l;
        this.name = str;
        this.cover = str2;
        this.trainedCount = num;
        this.itemsCount = num2;
        this.item = arrayList;
        this.introduce = str3;
        this.isError = z;
    }

    public /* synthetic */ CourseSeriesData(Long l, String str, String str2, Integer num, Integer num2, ArrayList arrayList, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? 0 : num, (i & 16) != 0 ? 0 : num2, (i & 32) != 0 ? null : arrayList, (i & 64) == 0 ? str3 : "", (i & 128) == 0 ? z : false);
    }
}
