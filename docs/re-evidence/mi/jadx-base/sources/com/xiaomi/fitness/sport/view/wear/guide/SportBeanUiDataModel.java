package com.xiaomi.fitness.sport.view.wear.guide;

import com.xiaomi.fitness.sport.bean.SportingItemData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003JO\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/sport/view/wear/guide/SportBeanUiDataModel;", "", "modeChangedStr", "", "lowBatteryStr", "commonList", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "sportBeanRunningPostureList", "landingImageResId", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)V", "getModeChangedStr", "()Ljava/lang/String;", "setModeChangedStr", "(Ljava/lang/String;)V", "getLowBatteryStr", "setLowBatteryStr", "getCommonList", "()Ljava/util/List;", "setCommonList", "(Ljava/util/List;)V", "getSportBeanRunningPostureList", "setSportBeanRunningPostureList", "getLandingImageResId", "()I", "setLandingImageResId", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportBeanUiDataModel {

    @Nullable
    private List<SportingItemData> commonList;
    private int landingImageResId;

    @Nullable
    private String lowBatteryStr;

    @Nullable
    private String modeChangedStr;

    @Nullable
    private List<SportingItemData> sportBeanRunningPostureList;

    public SportBeanUiDataModel() {
        this(null, null, null, null, 0, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportBeanUiDataModel copy$default(SportBeanUiDataModel sportBeanUiDataModel, String str, String str2, List list, List list2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sportBeanUiDataModel.modeChangedStr;
        }
        if ((i2 & 2) != 0) {
            str2 = sportBeanUiDataModel.lowBatteryStr;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            list = sportBeanUiDataModel.commonList;
        }
        List list3 = list;
        if ((i2 & 8) != 0) {
            list2 = sportBeanUiDataModel.sportBeanRunningPostureList;
        }
        List list4 = list2;
        if ((i2 & 16) != 0) {
            i = sportBeanUiDataModel.landingImageResId;
        }
        return sportBeanUiDataModel.copy(str, str3, list3, list4, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModeChangedStr() {
        return this.modeChangedStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLowBatteryStr() {
        return this.lowBatteryStr;
    }

    @Nullable
    public final List<SportingItemData> component3() {
        return this.commonList;
    }

    @Nullable
    public final List<SportingItemData> component4() {
        return this.sportBeanRunningPostureList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLandingImageResId() {
        return this.landingImageResId;
    }

    @NotNull
    public final SportBeanUiDataModel copy(@Nullable String modeChangedStr, @Nullable String lowBatteryStr, @Nullable List<SportingItemData> commonList, @Nullable List<SportingItemData> sportBeanRunningPostureList, int landingImageResId) {
        return new SportBeanUiDataModel(modeChangedStr, lowBatteryStr, commonList, sportBeanRunningPostureList, landingImageResId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportBeanUiDataModel)) {
            return false;
        }
        SportBeanUiDataModel sportBeanUiDataModel = (SportBeanUiDataModel) other;
        return Intrinsics.areEqual(this.modeChangedStr, sportBeanUiDataModel.modeChangedStr) && Intrinsics.areEqual(this.lowBatteryStr, sportBeanUiDataModel.lowBatteryStr) && Intrinsics.areEqual(this.commonList, sportBeanUiDataModel.commonList) && Intrinsics.areEqual(this.sportBeanRunningPostureList, sportBeanUiDataModel.sportBeanRunningPostureList) && this.landingImageResId == sportBeanUiDataModel.landingImageResId;
    }

    @Nullable
    public final List<SportingItemData> getCommonList() {
        return this.commonList;
    }

    public final int getLandingImageResId() {
        return this.landingImageResId;
    }

    @Nullable
    public final String getLowBatteryStr() {
        return this.lowBatteryStr;
    }

    @Nullable
    public final String getModeChangedStr() {
        return this.modeChangedStr;
    }

    @Nullable
    public final List<SportingItemData> getSportBeanRunningPostureList() {
        return this.sportBeanRunningPostureList;
    }

    public int hashCode() {
        String str = this.modeChangedStr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lowBatteryStr;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SportingItemData> list = this.commonList;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<SportingItemData> list2 = this.sportBeanRunningPostureList;
        return ((iHashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + Integer.hashCode(this.landingImageResId);
    }

    public final void setCommonList(@Nullable List<SportingItemData> list) {
        this.commonList = list;
    }

    public final void setLandingImageResId(int i) {
        this.landingImageResId = i;
    }

    public final void setLowBatteryStr(@Nullable String str) {
        this.lowBatteryStr = str;
    }

    public final void setModeChangedStr(@Nullable String str) {
        this.modeChangedStr = str;
    }

    public final void setSportBeanRunningPostureList(@Nullable List<SportingItemData> list) {
        this.sportBeanRunningPostureList = list;
    }

    @NotNull
    public String toString() {
        return "SportBeanUiDataModel(modeChangedStr=" + this.modeChangedStr + ", lowBatteryStr=" + this.lowBatteryStr + ", commonList=" + this.commonList + ", sportBeanRunningPostureList=" + this.sportBeanRunningPostureList + ", landingImageResId=" + this.landingImageResId + ")";
    }

    public SportBeanUiDataModel(@Nullable String str, @Nullable String str2, @Nullable List<SportingItemData> list, @Nullable List<SportingItemData> list2, int i) {
        this.modeChangedStr = str;
        this.lowBatteryStr = str2;
        this.commonList = list;
        this.sportBeanRunningPostureList = list2;
        this.landingImageResId = i;
    }

    public /* synthetic */ SportBeanUiDataModel(String str, String str2, List list, List list2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : list, (i2 & 8) == 0 ? list2 : null, (i2 & 16) != 0 ? 0 : i);
    }
}
