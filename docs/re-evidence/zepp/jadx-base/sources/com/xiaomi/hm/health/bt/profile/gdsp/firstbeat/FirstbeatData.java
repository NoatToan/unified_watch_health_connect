package com.xiaomi.hm.health.bt.profile.gdsp.firstbeat;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.watch.dataflow.model.firstbeat.FirstbeatParams;
import com.loc.z;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u0087\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002¢\u0006\u0004\bL\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0002HÆ\u0003J©\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u0002HÆ\u0001J\t\u0010%\u001a\u00020$HÖ\u0001J\t\u0010&\u001a\u00020\u0002HÖ\u0001J\u0013\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u0010-R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\u0017\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010-R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010-R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010-R\u0019\u0010\u001b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010+\u001a\u0004\b=\u0010-R\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b?\u0010-R\u0019\u0010\u001d\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010+\u001a\u0004\bA\u0010-R\u0019\u0010\u001e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010-R\u0019\u0010\u001f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010+\u001a\u0004\bE\u0010-R\u0019\u0010 \u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010+\u001a\u0004\bG\u0010-R\u0019\u0010!\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010+\u001a\u0004\bI\u0010-R\u0019\u0010\"\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010+\u001a\u0004\bK\u0010-¨\u0006O"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", FirstbeatParams.PARAM_DAY_ID, EcgData.TIMESTAMP_SERVER_UPDATED, "wltSum", "WtlSumOptimalMax", "WtlSumOptimalMin", FirstbeatParams.PARAM_TL_WEEKLY_SUM_OVERREACHING, "trainingLoadTrend", "wtlStatus", "fitnessClass", "uploadStatus", "fitnessLevelIncrease", "sportVo2Max", "walkVo2Max", "vo2MaxTrend", "zone", "currentDayTrainLoad", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getDayId", "()I", "b", "getUpdateTime", "c", "getWltSum", GoogleApiAvailabilityLight.a, "getWtlSumOptimalMax", "e", "getWtlSumOptimalMin", "f", "getWtlSumOverreaching", "g", "getTrainingLoadTrend", "h", "getWtlStatus", "i", "getFitnessClass", z.j, "getUploadStatus", hl.k, "getFitnessLevelIncrease", "l", "getSportVo2Max", "m", "getWalkVo2Max", GoogleApiAvailabilityLight.b, "getVo2MaxTrend", "o", "getZone", b.r, "getCurrentDayTrainLoad", "<init>", "(IIIIIIIIIIIIIIII)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FirstbeatData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FIRSTBEAT_SERIALIZATION_BYTE_LEN = 32;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int dayId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int updateTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int wltSum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int WtlSumOptimalMax;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int WtlSumOptimalMin;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int wtlSumOverreaching;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int trainingLoadTrend;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int wtlStatus;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int fitnessClass;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int uploadStatus;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int fitnessLevelIncrease;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    private final int sportVo2Max;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    private final int walkVo2Max;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    private final int vo2MaxTrend;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    private final int zone;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    private final int currentDayTrainLoad;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData$Companion;", "", "", HTTP.CONTENT_RANGE_BYTES, "", "offset", "Lcom/xiaomi/hm/health/bt/profile/gdsp/firstbeat/FirstbeatData;", "parseFromBytes", "FIRSTBEAT_SERIALIZATION_BYTE_LEN", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FirstbeatData parseFromBytes(@NotNull byte[] bytes, int offset) {
            int length = bytes.length;
            return new FirstbeatData(GattUtils.bytesToInt(bytes, offset + 0, 2), GattUtils.bytesToInt(bytes, offset + 4, 4), GattUtils.bytesToInt(bytes, offset + 8, 2), GattUtils.bytesToInt(bytes, offset + 10, 2), GattUtils.bytesToInt(bytes, offset + 12, 2), GattUtils.bytesToInt(bytes, offset + 14, 2), GattUtils.bytesToInt(bytes, offset + 16, 1), GattUtils.bytesToInt(bytes, offset + 17, 1), GattUtils.bytesToInt(bytes, offset + 18, 1), GattUtils.bytesToInt(bytes, offset + 19, 1), GattUtils.bytesToSignShort(bytes, offset + 20), GattUtils.bytesToInt(bytes, offset + 22, 2), GattUtils.bytesToInt(bytes, offset + 24, 2), GattUtils.bytesToInt(bytes, offset + 26, 1), GattUtils.bytesToSignedInt(bytes, offset + 27, 1), GattUtils.bytesToSignedInt(bytes, offset + 28));
        }
    }

    public FirstbeatData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.dayId = i;
        this.updateTime = i2;
        this.wltSum = i3;
        this.WtlSumOptimalMax = i4;
        this.WtlSumOptimalMin = i5;
        this.wtlSumOverreaching = i6;
        this.trainingLoadTrend = i7;
        this.wtlStatus = i8;
        this.fitnessClass = i9;
        this.uploadStatus = i10;
        this.fitnessLevelIncrease = i11;
        this.sportVo2Max = i12;
        this.walkVo2Max = i13;
        this.vo2MaxTrend = i14;
        this.zone = i15;
        this.currentDayTrainLoad = i16;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDayId() {
        return this.dayId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getUploadStatus() {
        return this.uploadStatus;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getFitnessLevelIncrease() {
        return this.fitnessLevelIncrease;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getSportVo2Max() {
        return this.sportVo2Max;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getWalkVo2Max() {
        return this.walkVo2Max;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getVo2MaxTrend() {
        return this.vo2MaxTrend;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getZone() {
        return this.zone;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getCurrentDayTrainLoad() {
        return this.currentDayTrainLoad;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getWltSum() {
        return this.wltSum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWtlSumOptimalMax() {
        return this.WtlSumOptimalMax;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWtlSumOptimalMin() {
        return this.WtlSumOptimalMin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWtlSumOverreaching() {
        return this.wtlSumOverreaching;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTrainingLoadTrend() {
        return this.trainingLoadTrend;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getWtlStatus() {
        return this.wtlStatus;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getFitnessClass() {
        return this.fitnessClass;
    }

    @NotNull
    public final FirstbeatData copy(int dayId, int updateTime, int wltSum, int WtlSumOptimalMax, int WtlSumOptimalMin, int wtlSumOverreaching, int trainingLoadTrend, int wtlStatus, int fitnessClass, int uploadStatus, int fitnessLevelIncrease, int sportVo2Max, int walkVo2Max, int vo2MaxTrend, int zone, int currentDayTrainLoad) {
        return new FirstbeatData(dayId, updateTime, wltSum, WtlSumOptimalMax, WtlSumOptimalMin, wtlSumOverreaching, trainingLoadTrend, wtlStatus, fitnessClass, uploadStatus, fitnessLevelIncrease, sportVo2Max, walkVo2Max, vo2MaxTrend, zone, currentDayTrainLoad);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FirstbeatData)) {
            return false;
        }
        FirstbeatData firstbeatData = (FirstbeatData) other;
        return this.dayId == firstbeatData.dayId && this.updateTime == firstbeatData.updateTime && this.wltSum == firstbeatData.wltSum && this.WtlSumOptimalMax == firstbeatData.WtlSumOptimalMax && this.WtlSumOptimalMin == firstbeatData.WtlSumOptimalMin && this.wtlSumOverreaching == firstbeatData.wtlSumOverreaching && this.trainingLoadTrend == firstbeatData.trainingLoadTrend && this.wtlStatus == firstbeatData.wtlStatus && this.fitnessClass == firstbeatData.fitnessClass && this.uploadStatus == firstbeatData.uploadStatus && this.fitnessLevelIncrease == firstbeatData.fitnessLevelIncrease && this.sportVo2Max == firstbeatData.sportVo2Max && this.walkVo2Max == firstbeatData.walkVo2Max && this.vo2MaxTrend == firstbeatData.vo2MaxTrend && this.zone == firstbeatData.zone && this.currentDayTrainLoad == firstbeatData.currentDayTrainLoad;
    }

    public final int getCurrentDayTrainLoad() {
        return this.currentDayTrainLoad;
    }

    public final int getDayId() {
        return this.dayId;
    }

    public final int getFitnessClass() {
        return this.fitnessClass;
    }

    public final int getFitnessLevelIncrease() {
        return this.fitnessLevelIncrease;
    }

    public final int getSportVo2Max() {
        return this.sportVo2Max;
    }

    public final int getTrainingLoadTrend() {
        return this.trainingLoadTrend;
    }

    public final int getUpdateTime() {
        return this.updateTime;
    }

    public final int getUploadStatus() {
        return this.uploadStatus;
    }

    public final int getVo2MaxTrend() {
        return this.vo2MaxTrend;
    }

    public final int getWalkVo2Max() {
        return this.walkVo2Max;
    }

    public final int getWltSum() {
        return this.wltSum;
    }

    public final int getWtlStatus() {
        return this.wtlStatus;
    }

    public final int getWtlSumOptimalMax() {
        return this.WtlSumOptimalMax;
    }

    public final int getWtlSumOptimalMin() {
        return this.WtlSumOptimalMin;
    }

    public final int getWtlSumOverreaching() {
        return this.wtlSumOverreaching;
    }

    public final int getZone() {
        return this.zone;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.dayId * 31) + this.updateTime) * 31) + this.wltSum) * 31) + this.WtlSumOptimalMax) * 31) + this.WtlSumOptimalMin) * 31) + this.wtlSumOverreaching) * 31) + this.trainingLoadTrend) * 31) + this.wtlStatus) * 31) + this.fitnessClass) * 31) + this.uploadStatus) * 31) + this.fitnessLevelIncrease) * 31) + this.sportVo2Max) * 31) + this.walkVo2Max) * 31) + this.vo2MaxTrend) * 31) + this.zone) * 31) + this.currentDayTrainLoad;
    }

    @NotNull
    public String toString() {
        return "FirstbeatData(dayId=" + this.dayId + ", updateTime=" + this.updateTime + ", wltSum=" + this.wltSum + ", WtlSumOptimalMax=" + this.WtlSumOptimalMax + ", WtlSumOptimalMin=" + this.WtlSumOptimalMin + ", wtlSumOverreaching=" + this.wtlSumOverreaching + ", trainingLoadTrend=" + this.trainingLoadTrend + ", wtlStatus=" + this.wtlStatus + ", fitnessClass=" + this.fitnessClass + ", uploadStatus=" + this.uploadStatus + ", fitnessLevelIncrease=" + this.fitnessLevelIncrease + ", sportVo2Max=" + this.sportVo2Max + ", walkVo2Max=" + this.walkVo2Max + ", vo2MaxTrend=" + this.vo2MaxTrend + ", zone=" + this.zone + ", currentDayTrainLoad=" + this.currentDayTrainLoad + ')';
    }
}
