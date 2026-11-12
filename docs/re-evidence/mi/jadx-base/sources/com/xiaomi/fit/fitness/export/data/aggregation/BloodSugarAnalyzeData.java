package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J]\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0006HÖ\u0001J\t\u00102\u001a\u000203HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u00064"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/BloodSugarAnalyzeData;", "", "startTime", "", "endTime", "normalPercent", "", "lowBSCount", "lowBSDurationInMin", "bsDiff", "", "dataMap", "", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "<init>", "(JJIIIFLjava/util/Map;)V", "getStartTime", "()J", "setStartTime", "(J)V", "getEndTime", "setEndTime", "getNormalPercent", "()I", "setNormalPercent", "(I)V", "getLowBSCount", "setLowBSCount", "getLowBSDurationInMin", "setLowBSDurationInMin", "getBsDiff", "()F", "setBsDiff", "(F)V", "getDataMap", "()Ljava/util/Map;", "setDataMap", "(Ljava/util/Map;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BloodSugarAnalyzeData {
    private float bsDiff;

    @Nullable
    private Map<Long, BloodSugarItem> dataMap;
    private long endTime;
    private int lowBSCount;
    private int lowBSDurationInMin;
    private int normalPercent;
    private long startTime;

    public BloodSugarAnalyzeData(long j, long j2, int i, int i2, int i3, float f, @Nullable Map<Long, BloodSugarItem> map) {
        this.startTime = j;
        this.endTime = j2;
        this.normalPercent = i;
        this.lowBSCount = i2;
        this.lowBSDurationInMin = i3;
        this.bsDiff = f;
        this.dataMap = map;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNormalPercent() {
        return this.normalPercent;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLowBSCount() {
        return this.lowBSCount;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLowBSDurationInMin() {
        return this.lowBSDurationInMin;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getBsDiff() {
        return this.bsDiff;
    }

    @Nullable
    public final Map<Long, BloodSugarItem> component7() {
        return this.dataMap;
    }

    @NotNull
    public final BloodSugarAnalyzeData copy(long startTime, long endTime, int normalPercent, int lowBSCount, int lowBSDurationInMin, float bsDiff, @Nullable Map<Long, BloodSugarItem> dataMap) {
        return new BloodSugarAnalyzeData(startTime, endTime, normalPercent, lowBSCount, lowBSDurationInMin, bsDiff, dataMap);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodSugarAnalyzeData)) {
            return false;
        }
        BloodSugarAnalyzeData bloodSugarAnalyzeData = (BloodSugarAnalyzeData) other;
        return this.startTime == bloodSugarAnalyzeData.startTime && this.endTime == bloodSugarAnalyzeData.endTime && this.normalPercent == bloodSugarAnalyzeData.normalPercent && this.lowBSCount == bloodSugarAnalyzeData.lowBSCount && this.lowBSDurationInMin == bloodSugarAnalyzeData.lowBSDurationInMin && Float.compare(this.bsDiff, bloodSugarAnalyzeData.bsDiff) == 0 && Intrinsics.areEqual(this.dataMap, bloodSugarAnalyzeData.dataMap);
    }

    public final float getBsDiff() {
        return this.bsDiff;
    }

    @Nullable
    public final Map<Long, BloodSugarItem> getDataMap() {
        return this.dataMap;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getLowBSCount() {
        return this.lowBSCount;
    }

    public final int getLowBSDurationInMin() {
        return this.lowBSDurationInMin;
    }

    public final int getNormalPercent() {
        return this.normalPercent;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Integer.hashCode(this.normalPercent)) * 31) + Integer.hashCode(this.lowBSCount)) * 31) + Integer.hashCode(this.lowBSDurationInMin)) * 31) + Float.hashCode(this.bsDiff)) * 31;
        Map<Long, BloodSugarItem> map = this.dataMap;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final void setBsDiff(float f) {
        this.bsDiff = f;
    }

    public final void setDataMap(@Nullable Map<Long, BloodSugarItem> map) {
        this.dataMap = map;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setLowBSCount(int i) {
        this.lowBSCount = i;
    }

    public final void setLowBSDurationInMin(int i) {
        this.lowBSDurationInMin = i;
    }

    public final void setNormalPercent(int i) {
        this.normalPercent = i;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    @NotNull
    public String toString() {
        return "BloodSugarAnalyzeData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", normalPercent=" + this.normalPercent + ", lowBSCount=" + this.lowBSCount + ", lowBSDurationInMin=" + this.lowBSDurationInMin + ", bsDiff=" + this.bsDiff + ", dataMap=" + this.dataMap + ")";
    }

    public /* synthetic */ BloodSugarAnalyzeData(long j, long j2, int i, int i2, int i3, float f, Map map, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? 0.0f : f, (i4 & 64) != 0 ? null : map);
    }
}
