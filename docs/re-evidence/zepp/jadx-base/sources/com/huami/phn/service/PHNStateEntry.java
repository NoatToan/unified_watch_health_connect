package com.huami.phn.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.loc.z;
import defpackage.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b$\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\bC\u0010DJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003Js\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\f2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u0011HÆ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0015\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010$\u001a\u0004\b0\u0010&R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u0019\u0010\u0018\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u0019\u0010\u0019\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u0019\u0010\u001a\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u001c\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/huami/phn/service/PHNStateEntry;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "Lcom/huami/phn/service/PHNStateType;", "component8", "", "Lcom/huami/phn/service/PHNCardTipsData;", "component9", "", "component10", "tsbType", "tsbTypeName", "tsbValue", "dailyPercent", "planStateDescription", "subDescription", "supportPHNDeviceH5Url", "phnState", "tips", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getTsbType", "()I", "b", "Ljava/lang/String;", "getTsbTypeName", "()Ljava/lang/String;", "c", "F", "getTsbValue", "()F", GoogleApiAvailabilityLight.a, "getDailyPercent", "e", "getPlanStateDescription", "f", "getSubDescription", "g", "getSupportPHNDeviceH5Url", "h", "Lcom/huami/phn/service/PHNStateType;", "getPhnState", "()Lcom/huami/phn/service/PHNStateType;", "i", "Ljava/util/List;", "getTips", "()Ljava/util/List;", z.j, "J", "getUpdateTime", "()J", "<init>", "(ILjava/lang/String;FILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huami/phn/service/PHNStateType;Ljava/util/List;J)V", "phn_service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class PHNStateEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int tsbType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String tsbTypeName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final float tsbValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int dailyPercent;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String planStateDescription;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String subDescription;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String supportPHNDeviceH5Url;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final PHNStateType phnState;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<PHNCardTipsData> tips;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final long updateTime;

    public PHNStateEntry(int i, @NotNull String str, float f, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull PHNStateType pHNStateType, @NotNull List<PHNCardTipsData> list, long j) {
        this.tsbType = i;
        this.tsbTypeName = str;
        this.tsbValue = f;
        this.dailyPercent = i2;
        this.planStateDescription = str2;
        this.subDescription = str3;
        this.supportPHNDeviceH5Url = str4;
        this.phnState = pHNStateType;
        this.tips = list;
        this.updateTime = j;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTsbType() {
        return this.tsbType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTsbTypeName() {
        return this.tsbTypeName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getTsbValue() {
        return this.tsbValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDailyPercent() {
        return this.dailyPercent;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlanStateDescription() {
        return this.planStateDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubDescription() {
        return this.subDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSupportPHNDeviceH5Url() {
        return this.supportPHNDeviceH5Url;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PHNStateType getPhnState() {
        return this.phnState;
    }

    @NotNull
    public final List<PHNCardTipsData> component9() {
        return this.tips;
    }

    @NotNull
    public final PHNStateEntry copy(int tsbType, @NotNull String tsbTypeName, float tsbValue, int dailyPercent, @NotNull String planStateDescription, @NotNull String subDescription, @NotNull String supportPHNDeviceH5Url, @NotNull PHNStateType phnState, @NotNull List<PHNCardTipsData> tips, long updateTime) {
        return new PHNStateEntry(tsbType, tsbTypeName, tsbValue, dailyPercent, planStateDescription, subDescription, supportPHNDeviceH5Url, phnState, tips, updateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PHNStateEntry)) {
            return false;
        }
        PHNStateEntry pHNStateEntry = (PHNStateEntry) other;
        return this.tsbType == pHNStateEntry.tsbType && Intrinsics.areEqual(this.tsbTypeName, pHNStateEntry.tsbTypeName) && Intrinsics.areEqual((Object) Float.valueOf(this.tsbValue), (Object) Float.valueOf(pHNStateEntry.tsbValue)) && this.dailyPercent == pHNStateEntry.dailyPercent && Intrinsics.areEqual(this.planStateDescription, pHNStateEntry.planStateDescription) && Intrinsics.areEqual(this.subDescription, pHNStateEntry.subDescription) && Intrinsics.areEqual(this.supportPHNDeviceH5Url, pHNStateEntry.supportPHNDeviceH5Url) && this.phnState == pHNStateEntry.phnState && Intrinsics.areEqual(this.tips, pHNStateEntry.tips) && this.updateTime == pHNStateEntry.updateTime;
    }

    public final int getDailyPercent() {
        return this.dailyPercent;
    }

    @NotNull
    public final PHNStateType getPhnState() {
        return this.phnState;
    }

    @NotNull
    public final String getPlanStateDescription() {
        return this.planStateDescription;
    }

    @NotNull
    public final String getSubDescription() {
        return this.subDescription;
    }

    @NotNull
    public final String getSupportPHNDeviceH5Url() {
        return this.supportPHNDeviceH5Url;
    }

    @NotNull
    public final List<PHNCardTipsData> getTips() {
        return this.tips;
    }

    public final int getTsbType() {
        return this.tsbType;
    }

    @NotNull
    public final String getTsbTypeName() {
        return this.tsbTypeName;
    }

    public final float getTsbValue() {
        return this.tsbValue;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((((this.tsbType * 31) + this.tsbTypeName.hashCode()) * 31) + Float.floatToIntBits(this.tsbValue)) * 31) + this.dailyPercent) * 31) + this.planStateDescription.hashCode()) * 31) + this.subDescription.hashCode()) * 31) + this.supportPHNDeviceH5Url.hashCode()) * 31) + this.phnState.hashCode()) * 31) + this.tips.hashCode()) * 31) + b.a(this.updateTime);
    }

    @NotNull
    public String toString() {
        return "PHNStateEntry(tsbType=" + this.tsbType + ", tsbTypeName=" + this.tsbTypeName + ", tsbValue=" + this.tsbValue + ", dailyPercent=" + this.dailyPercent + ", planStateDescription=" + this.planStateDescription + ", subDescription=" + this.subDescription + ", supportPHNDeviceH5Url=" + this.supportPHNDeviceH5Url + ", phnState=" + this.phnState + ", tips=" + this.tips + ", updateTime=" + this.updateTime + ")";
    }

    public /* synthetic */ PHNStateEntry(int i, String str, float f, int i2, String str2, String str3, String str4, PHNStateType pHNStateType, List list, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i3 & 4) != 0 ? -1.0f : f, (i3 & 8) != 0 ? -1 : i2, str2, str3, str4, pHNStateType, list, j);
    }
}
