package com.huami.health.statisticdata.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.statisticdata.constants.DistributionTypeEnum;
import com.huami.health.statisticdata.constants.GenderType;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bW\u0010XJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\r\u001a\u00020\fHÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000bJ\u008e\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b \u0010!J\t\u0010\"\u001a\u00020\u0002HÖ\u0001J\t\u0010#\u001a\u00020\bHÖ\u0001J\u0013\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010(\u001a\u00020\bHÖ\u0001J\u0019\u0010-\u001a\u00020,2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u0015\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u0016\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0017\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R$\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010BR\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010/\u001a\u0004\bJ\u00101R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010/\u001a\u0004\bL\u00101R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010/\u001a\u0004\bN\u00101R\u0019\u0010\u001d\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010;\u001a\u0004\bP\u0010=R$\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010\u000b\"\u0004\bS\u0010BR$\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010?\u001a\u0004\bU\u0010\u000b\"\u0004\bV\u0010B¨\u0006Y"}, d2 = {"Lcom/huami/health/statisticdata/model/BasicArgumentsData;", "Landroid/os/Parcelable;", "", "component1", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "component2", "Lcom/huami/health/statisticdata/constants/GenderType;", "component3", "", "component4", "component5", "()Ljava/lang/Integer;", "", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "childUserId", "distributionTypeEnum", "genderType", "ageGroup", "timeGroup", "personCurrentValue", "chartTitle", "chartSubTitle", "unitText", "goalIconResId", "chartTitleColorResId", "chartSubTitleColorResId", "copy", "(Ljava/lang/String;Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Lcom/huami/health/statisticdata/constants/GenderType;ILjava/lang/Integer;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lcom/huami/health/statisticdata/model/BasicArgumentsData;", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getChildUserId", "()Ljava/lang/String;", "b", "Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "getDistributionTypeEnum", "()Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;", "c", "Lcom/huami/health/statisticdata/constants/GenderType;", "getGenderType", "()Lcom/huami/health/statisticdata/constants/GenderType;", GoogleApiAvailabilityLight.a, LogUtil.I, "getAgeGroup", "()I", "e", "Ljava/lang/Integer;", "getTimeGroup", "setTimeGroup", "(Ljava/lang/Integer;)V", "f", "F", "getPersonCurrentValue", "()F", "setPersonCurrentValue", "(F)V", "g", "getChartTitle", "h", "getChartSubTitle", "i", "getUnitText", z.j, "getGoalIconResId", hl.k, "getChartTitleColorResId", "setChartTitleColorResId", "l", "getChartSubTitleColorResId", "setChartSubTitleColorResId", "<init>", "(Ljava/lang/String;Lcom/huami/health/statisticdata/constants/DistributionTypeEnum;Lcom/huami/health/statisticdata/constants/GenderType;ILjava/lang/Integer;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)V", "statisticdata_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BasicArgumentsData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String childUserId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final DistributionTypeEnum distributionTypeEnum;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final GenderType genderType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int ageGroup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer timeGroup;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private float personCurrentValue;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String chartTitle;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String chartSubTitle;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final String unitText;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int goalIconResId;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer chartTitleColorResId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer chartSubTitleColorResId;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel parcel) {
            return new BasicArgumentsData(parcel.readString(), (DistributionTypeEnum) Enum.valueOf(DistributionTypeEnum.class, parcel.readString()), (GenderType) Enum.valueOf(GenderType.class, parcel.readString()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object[] newArray(int i) {
            return new BasicArgumentsData[i];
        }
    }

    public BasicArgumentsData(@NotNull String str, @NotNull DistributionTypeEnum distributionTypeEnum, @NotNull GenderType genderType, int i, @Nullable Integer num, float f, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i2, @Nullable Integer num2, @Nullable Integer num3) {
        this.childUserId = str;
        this.distributionTypeEnum = distributionTypeEnum;
        this.genderType = genderType;
        this.ageGroup = i;
        this.timeGroup = num;
        this.personCurrentValue = f;
        this.chartTitle = str2;
        this.chartSubTitle = str3;
        this.unitText = str4;
        this.goalIconResId = i2;
        this.chartTitleColorResId = num2;
        this.chartSubTitleColorResId = num3;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChildUserId() {
        return this.childUserId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getGoalIconResId() {
        return this.goalIconResId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getChartTitleColorResId() {
        return this.chartTitleColorResId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getChartSubTitleColorResId() {
        return this.chartSubTitleColorResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DistributionTypeEnum getDistributionTypeEnum() {
        return this.distributionTypeEnum;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GenderType getGenderType() {
        return this.genderType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getAgeGroup() {
        return this.ageGroup;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTimeGroup() {
        return this.timeGroup;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getPersonCurrentValue() {
        return this.personCurrentValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getChartTitle() {
        return this.chartTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChartSubTitle() {
        return this.chartSubTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUnitText() {
        return this.unitText;
    }

    @NotNull
    public final BasicArgumentsData copy(@NotNull String childUserId, @NotNull DistributionTypeEnum distributionTypeEnum, @NotNull GenderType genderType, int ageGroup, @Nullable Integer timeGroup, float personCurrentValue, @NotNull String chartTitle, @NotNull String chartSubTitle, @NotNull String unitText, int goalIconResId, @Nullable Integer chartTitleColorResId, @Nullable Integer chartSubTitleColorResId) {
        return new BasicArgumentsData(childUserId, distributionTypeEnum, genderType, ageGroup, timeGroup, personCurrentValue, chartTitle, chartSubTitle, unitText, goalIconResId, chartTitleColorResId, chartSubTitleColorResId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicArgumentsData)) {
            return false;
        }
        BasicArgumentsData basicArgumentsData = (BasicArgumentsData) other;
        return Intrinsics.areEqual(this.childUserId, basicArgumentsData.childUserId) && Intrinsics.areEqual(this.distributionTypeEnum, basicArgumentsData.distributionTypeEnum) && Intrinsics.areEqual(this.genderType, basicArgumentsData.genderType) && this.ageGroup == basicArgumentsData.ageGroup && Intrinsics.areEqual(this.timeGroup, basicArgumentsData.timeGroup) && Float.compare(this.personCurrentValue, basicArgumentsData.personCurrentValue) == 0 && Intrinsics.areEqual(this.chartTitle, basicArgumentsData.chartTitle) && Intrinsics.areEqual(this.chartSubTitle, basicArgumentsData.chartSubTitle) && Intrinsics.areEqual(this.unitText, basicArgumentsData.unitText) && this.goalIconResId == basicArgumentsData.goalIconResId && Intrinsics.areEqual(this.chartTitleColorResId, basicArgumentsData.chartTitleColorResId) && Intrinsics.areEqual(this.chartSubTitleColorResId, basicArgumentsData.chartSubTitleColorResId);
    }

    public final int getAgeGroup() {
        return this.ageGroup;
    }

    @NotNull
    public final String getChartSubTitle() {
        return this.chartSubTitle;
    }

    @Nullable
    public final Integer getChartSubTitleColorResId() {
        return this.chartSubTitleColorResId;
    }

    @NotNull
    public final String getChartTitle() {
        return this.chartTitle;
    }

    @Nullable
    public final Integer getChartTitleColorResId() {
        return this.chartTitleColorResId;
    }

    @NotNull
    public final String getChildUserId() {
        return this.childUserId;
    }

    @NotNull
    public final DistributionTypeEnum getDistributionTypeEnum() {
        return this.distributionTypeEnum;
    }

    @NotNull
    public final GenderType getGenderType() {
        return this.genderType;
    }

    public final int getGoalIconResId() {
        return this.goalIconResId;
    }

    public final float getPersonCurrentValue() {
        return this.personCurrentValue;
    }

    @Nullable
    public final Integer getTimeGroup() {
        return this.timeGroup;
    }

    @NotNull
    public final String getUnitText() {
        return this.unitText;
    }

    public int hashCode() {
        String str = this.childUserId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        DistributionTypeEnum distributionTypeEnum = this.distributionTypeEnum;
        int iHashCode2 = (iHashCode + (distributionTypeEnum != null ? distributionTypeEnum.hashCode() : 0)) * 31;
        GenderType genderType = this.genderType;
        int iHashCode3 = (((iHashCode2 + (genderType != null ? genderType.hashCode() : 0)) * 31) + this.ageGroup) * 31;
        Integer num = this.timeGroup;
        int iHashCode4 = (((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + Float.floatToIntBits(this.personCurrentValue)) * 31;
        String str2 = this.chartTitle;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.chartSubTitle;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.unitText;
        int iHashCode7 = (((iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.goalIconResId) * 31;
        Integer num2 = this.chartTitleColorResId;
        int iHashCode8 = (iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.chartSubTitleColorResId;
        return iHashCode8 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setChartSubTitleColorResId(@Nullable Integer num) {
        this.chartSubTitleColorResId = num;
    }

    public final void setChartTitleColorResId(@Nullable Integer num) {
        this.chartTitleColorResId = num;
    }

    public final void setPersonCurrentValue(float f) {
        this.personCurrentValue = f;
    }

    public final void setTimeGroup(@Nullable Integer num) {
        this.timeGroup = num;
    }

    @NotNull
    public String toString() {
        return "BasicArgumentsData(childUserId=" + this.childUserId + ", distributionTypeEnum=" + this.distributionTypeEnum + ", genderType=" + this.genderType + ", ageGroup=" + this.ageGroup + ", timeGroup=" + this.timeGroup + ", personCurrentValue=" + this.personCurrentValue + ", chartTitle=" + this.chartTitle + ", chartSubTitle=" + this.chartSubTitle + ", unitText=" + this.unitText + ", goalIconResId=" + this.goalIconResId + ", chartTitleColorResId=" + this.chartTitleColorResId + ", chartSubTitleColorResId=" + this.chartSubTitleColorResId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.childUserId);
        parcel.writeString(this.distributionTypeEnum.name());
        parcel.writeString(this.genderType.name());
        parcel.writeInt(this.ageGroup);
        Integer num = this.timeGroup;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeFloat(this.personCurrentValue);
        parcel.writeString(this.chartTitle);
        parcel.writeString(this.chartSubTitle);
        parcel.writeString(this.unitText);
        parcel.writeInt(this.goalIconResId);
        Integer num2 = this.chartTitleColorResId;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.chartSubTitleColorResId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public /* synthetic */ BasicArgumentsData(String str, DistributionTypeEnum distributionTypeEnum, GenderType genderType, int i, Integer num, float f, String str2, String str3, String str4, int i2, Integer num2, Integer num3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, distributionTypeEnum, genderType, i, (i3 & 16) != 0 ? null : num, f, str2, str3, str4, i2, (i3 & 1024) != 0 ? null : num2, (i3 & 2048) != 0 ? null : num3);
    }
}
