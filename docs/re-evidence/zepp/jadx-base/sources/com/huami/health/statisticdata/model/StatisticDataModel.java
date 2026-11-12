package com.huami.health.statisticdata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\bA\u0010BJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0007HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003Jl\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010 \u001a\u00020\u0002HÖ\u0001J\u0019\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010'\u001a\u0004\b4\u0010)R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010'\u001a\u0004\b:\u0010)R\"\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b<\u00102\"\u0004\b=\u0010>R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)¨\u0006C"}, d2 = {"Lcom/huami/health/statisticdata/model/StatisticDataModel;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "()Ljava/lang/Integer;", "", "component4", "component5", "", "component6", "component7", "component8", "component9", "version", "ageGroup", "timeGroup", "itemType", "gender", "category", "count", "location", "categoryCount", "copy", "(IILjava/lang/Integer;Ljava/lang/String;IFILjava/lang/String;I)Lcom/huami/health/statisticdata/model/StatisticDataModel;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", LogUtil.I, "getVersion", "()I", "b", "getAgeGroup", "c", "Ljava/lang/Integer;", "getTimeGroup", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getItemType", "()Ljava/lang/String;", "e", "getGender", "f", "F", "getCategory", "()F", "g", "getCount", "h", "getLocation", "setLocation", "(Ljava/lang/String;)V", "i", "getCategoryCount", "<init>", "(IILjava/lang/Integer;Ljava/lang/String;IFILjava/lang/String;I)V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class StatisticDataModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int version;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int ageGroup;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer timeGroup;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String itemType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int gender;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final float category;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int count;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private String location;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int categoryCount;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel) {
            return new StatisticDataModel(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object[] newArray(int i) {
            return new StatisticDataModel[i];
        }
    }

    public StatisticDataModel(int i, int i2, @Nullable Integer num, @NotNull String str, int i3, float f, int i4, @NotNull String str2, int i5) {
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

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAgeGroup() {
        return this.ageGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTimeGroup() {
        return this.timeGroup;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCategoryCount() {
        return this.categoryCount;
    }

    @NotNull
    public final StatisticDataModel copy(int version, int ageGroup, @Nullable Integer timeGroup, @NotNull String itemType, int gender, float category, int count, @NotNull String location, int categoryCount) {
        return new StatisticDataModel(version, ageGroup, timeGroup, itemType, gender, category, count, location, categoryCount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatisticDataModel)) {
            return false;
        }
        StatisticDataModel statisticDataModel = (StatisticDataModel) other;
        return this.version == statisticDataModel.version && this.ageGroup == statisticDataModel.ageGroup && Intrinsics.areEqual(this.timeGroup, statisticDataModel.timeGroup) && Intrinsics.areEqual(this.itemType, statisticDataModel.itemType) && this.gender == statisticDataModel.gender && Float.compare(this.category, statisticDataModel.category) == 0 && this.count == statisticDataModel.count && Intrinsics.areEqual(this.location, statisticDataModel.location) && this.categoryCount == statisticDataModel.categoryCount;
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

    public int hashCode() {
        int i = ((this.version * 31) + this.ageGroup) * 31;
        Integer num = this.timeGroup;
        int iHashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.itemType;
        int iHashCode2 = (((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.gender) * 31) + Float.floatToIntBits(this.category)) * 31) + this.count) * 31;
        String str2 = this.location;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.categoryCount;
    }

    public final void setLocation(@NotNull String str) {
        this.location = str;
    }

    @NotNull
    public String toString() {
        return "StatisticDataModel(version=" + this.version + ", ageGroup=" + this.ageGroup + ", timeGroup=" + this.timeGroup + ", itemType=" + this.itemType + ", gender=" + this.gender + ", category=" + this.category + ", count=" + this.count + ", location=" + this.location + ", categoryCount=" + this.categoryCount + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        parcel.writeInt(this.version);
        parcel.writeInt(this.ageGroup);
        Integer num = this.timeGroup;
        if (num != null) {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.itemType);
        parcel.writeInt(this.gender);
        parcel.writeFloat(this.category);
        parcel.writeInt(this.count);
        parcel.writeString(this.location);
        parcel.writeInt(this.categoryCount);
    }

    public /* synthetic */ StatisticDataModel(int i, int i2, Integer num, String str, int i3, float f, int i4, String str2, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i6 & 4) != 0 ? null : num, str, i3, f, i4, str2, i5);
    }
}
