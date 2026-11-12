package com.xiaomi.fitness.health.todayhealth.model;

import com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport;
import com.xiaomi.fitness.common.log.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010I\u001a\u00020JH\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\u001d\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010O\u001a\u00020J2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020\u000fHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R\u001a\u0010#\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010&\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010\u0013R\u001a\u0010)\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R\u001a\u0010,\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R\"\u0010/\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00106\u001a\n\u0012\u0004\u0012\u000207\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001c\u0010:\u001a\u0004\u0018\u000101X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\r\"\u0004\bG\u0010H¨\u0006S"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/DailyHrHealthReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "hrHealthStatus", "", "getHrHealthStatus", "()I", "setHrHealthStatus", "(I)V", "sumAbnormalCount", "getSumAbnormalCount", "setSumAbnormalCount", "sumNormalCount", "getSumNormalCount", "setSumNormalCount", "sumOtherCount", "getSumOtherCount", "setSumOtherCount", "ppgAbnormalCount", "getPpgAbnormalCount", "setPpgAbnormalCount", "ppgNormalCount", "getPpgNormalCount", "setPpgNormalCount", "ppgOtherCount", "getPpgOtherCount", "setPpgOtherCount", "ecgAbnormalCount", "getEcgAbnormalCount", "setEcgAbnormalCount", "ecgNormalCount", "getEcgNormalCount", "setEcgNormalCount", "ecgOtherCount", "getEcgOtherCount", "setEcgOtherCount", "hrStatusRecords", "", "Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthValueItem;", "getHrStatusRecords", "()Ljava/util/List;", "setHrStatusRecords", "(Ljava/util/List;)V", "heartHealthStatItemList", "Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthStatItem;", "getHeartHealthStatItemList", "setHeartHealthStatItemList", "lastHrRecord", "getLastHrRecord", "()Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthValueItem;", "setLastHrRecord", "(Lcom/xiaomi/fitness/health/todayhealth/model/HeartHealthValueItem;)V", "sumAbnormalRadio", "", "getSumAbnormalRadio", "()F", "setSumAbnormalRadio", "(F)V", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "isEmpty", "", "toString", "component1", "component2", "copy", "equals", "other", "", "hashCode", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DailyHrHealthReport extends DailyBasicReport {
    private int ecgAbnormalCount;
    private int ecgNormalCount;
    private int ecgOtherCount;

    @Nullable
    private List<HeartHealthStatItem> heartHealthStatItemList;
    private int hrHealthStatus;

    @Nullable
    private List<HeartHealthValueItem> hrStatusRecords;

    @Nullable
    private HeartHealthValueItem lastHrRecord;
    private int ppgAbnormalCount;
    private int ppgNormalCount;
    private int ppgOtherCount;

    @Nullable
    private String sid;
    private int sumAbnormalCount;
    private float sumAbnormalRadio;
    private int sumNormalCount;
    private int sumOtherCount;

    @NotNull
    private final String tag;
    private long time;

    public DailyHrHealthReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    public static /* synthetic */ DailyHrHealthReport copy$default(DailyHrHealthReport dailyHrHealthReport, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dailyHrHealthReport.time;
        }
        if ((i & 2) != 0) {
            str = dailyHrHealthReport.tag;
        }
        return dailyHrHealthReport.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final DailyHrHealthReport copy(long time, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new DailyHrHealthReport(time, tag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyHrHealthReport)) {
            return false;
        }
        DailyHrHealthReport dailyHrHealthReport = (DailyHrHealthReport) other;
        return this.time == dailyHrHealthReport.time && Intrinsics.areEqual(this.tag, dailyHrHealthReport.tag);
    }

    public final int getEcgAbnormalCount() {
        return this.ecgAbnormalCount;
    }

    public final int getEcgNormalCount() {
        return this.ecgNormalCount;
    }

    public final int getEcgOtherCount() {
        return this.ecgOtherCount;
    }

    @Nullable
    public final List<HeartHealthStatItem> getHeartHealthStatItemList() {
        return this.heartHealthStatItemList;
    }

    public final int getHrHealthStatus() {
        return this.hrHealthStatus;
    }

    @Nullable
    public final List<HeartHealthValueItem> getHrStatusRecords() {
        return this.hrStatusRecords;
    }

    @Nullable
    public final HeartHealthValueItem getLastHrRecord() {
        return this.lastHrRecord;
    }

    public final int getPpgAbnormalCount() {
        return this.ppgAbnormalCount;
    }

    public final int getPpgNormalCount() {
        return this.ppgNormalCount;
    }

    public final int getPpgOtherCount() {
        return this.ppgOtherCount;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    public final int getSumAbnormalCount() {
        return this.sumAbnormalCount;
    }

    public final float getSumAbnormalRadio() {
        return this.sumAbnormalRadio;
    }

    public final int getSumNormalCount() {
        return this.sumNormalCount;
    }

    public final int getSumOtherCount() {
        return this.sumOtherCount;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.tag.hashCode();
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<HeartHealthValueItem> list = this.hrStatusRecords;
        if (list == null || list.isEmpty()) {
            Logger.i("DailyHrHealthReport", "DailyHrHealthReport is empty " + getTime() + " count " + (this.sumNormalCount + this.sumAbnormalCount + this.sumOtherCount));
        }
        List<HeartHealthValueItem> list2 = this.hrStatusRecords;
        return list2 == null || list2.isEmpty();
    }

    public final void setEcgAbnormalCount(int i) {
        this.ecgAbnormalCount = i;
    }

    public final void setEcgNormalCount(int i) {
        this.ecgNormalCount = i;
    }

    public final void setEcgOtherCount(int i) {
        this.ecgOtherCount = i;
    }

    public final void setHeartHealthStatItemList(@Nullable List<HeartHealthStatItem> list) {
        this.heartHealthStatItemList = list;
    }

    public final void setHrHealthStatus(int i) {
        this.hrHealthStatus = i;
    }

    public final void setHrStatusRecords(@Nullable List<HeartHealthValueItem> list) {
        this.hrStatusRecords = list;
    }

    public final void setLastHrRecord(@Nullable HeartHealthValueItem heartHealthValueItem) {
        this.lastHrRecord = heartHealthValueItem;
    }

    public final void setPpgAbnormalCount(int i) {
        this.ppgAbnormalCount = i;
    }

    public final void setPpgNormalCount(int i) {
        this.ppgNormalCount = i;
    }

    public final void setPpgOtherCount(int i) {
        this.ppgOtherCount = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSumAbnormalCount(int i) {
        this.sumAbnormalCount = i;
    }

    public final void setSumAbnormalRadio(float f) {
        this.sumAbnormalRadio = f;
    }

    public final void setSumNormalCount(int i) {
        this.sumNormalCount = i;
    }

    public final void setSumOtherCount(int i) {
        this.sumOtherCount = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "DailyHrHealthReport(time=" + getTime() + ", tag='" + getTag() + "', hrHealthStatus=" + this.hrHealthStatus + ", sumAbnormalCount=" + this.sumAbnormalCount + ", sumNormalCount=" + this.sumNormalCount + ", sumOtherCount=" + this.sumOtherCount + ", ppgAbnormalCount=" + this.ppgAbnormalCount + ", ppgNormalCount=" + this.ppgNormalCount + ", ppgOtherCount=" + this.ppgOtherCount + ", ecgAbnormalCount=" + this.ecgAbnormalCount + ", ecgNormalCount=" + this.ecgNormalCount + ", ecgOtherCount=" + this.ecgOtherCount + ", hrStatusRecords=" + this.hrStatusRecords + ", heartHealthStatItemList=" + this.heartHealthStatItemList + ", lastHrRecord=" + this.lastHrRecord + ", sumAbnormalRadio=" + this.sumAbnormalRadio + ", sid=" + getSid() + ")";
    }
}
