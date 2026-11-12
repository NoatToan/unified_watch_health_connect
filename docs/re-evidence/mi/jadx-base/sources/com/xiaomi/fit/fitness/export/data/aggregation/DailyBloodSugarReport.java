package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.extentions.BloodSugarItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010K\u001a\u00020LH\u0016J\b\u0010M\u001a\u00020\u0005H\u0016J\u0006\u0010N\u001a\u00020LJ\u0006\u0010O\u001a\u00020LR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R-\u0010$\u001a\u0015\u0012\t\u0012\u00070%¢\u0006\u0002\b&\u0012\u0004\u0012\u00020%\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001b\"\u0004\b(\u0010\u001dR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R\u001c\u00104\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0015\"\u0004\b6\u0010\u0017R.\u00107\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130*\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010\u001dR\u001c\u0010:\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R-\u0010=\u001a\u0015\u0012\t\u0012\u00070%¢\u0006\u0002\b&\u0012\u0004\u0012\u00020%\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER-\u0010F\u001a\u0015\u0012\t\u0012\u00070%¢\u0006\u0002\bG\u0012\u0004\u0012\u00020H\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001b\"\u0004\bJ\u0010\u001d¨\u0006P"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBloodSugarReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "latestItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "getLatestItem", "()Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "setLatestItem", "(Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;)V", "bloodSugarMap", "", "getBloodSugarMap", "()Ljava/util/Map;", "setBloodSugarMap", "(Ljava/util/Map;)V", "statisticBloodSugar", "Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "getStatisticBloodSugar", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;", "setStatisticBloodSugar", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/StatisticBloodSugar;)V", "targetDistMap", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarLevel;", "getTargetDistMap", "setTargetDistMap", "sleepDataList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SleepBloodSugarData;", "getSleepDataList", "()Ljava/util/List;", "setSleepDataList", "(Ljava/util/List;)V", "sportDataList", "Lcom/xiaomi/fit/fitness/export/data/aggregation/SportBloodSugarData;", "getSportDataList", "setSportDataList", "latestFingerItem", "getLatestFingerItem", "setLatestFingerItem", "fingerBSMap", "getFingerBSMap", "setFingerBSMap", "statisticFingerBS", "getStatisticFingerBS", "setStatisticFingerBS", "targetDistFingerMap", "getTargetDistFingerMap", "setTargetDistFingerMap", "fingerBSDiff", "Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;", "getFingerBSDiff", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;", "setFingerBSDiff", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/PostMealBSDiff;)V", "avgFingerBSByPeriod", "Lcom/xiaomi/fit/fitness/export/data/annotation/BloodSugarMeasurePeriod;", "", "getAvgFingerBSByPeriod", "setAvgFingerBSByPeriod", "isEmpty", "", "toString", "hasAbnormalData", "hasAbnormalDataByLatestItem", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyBloodSugarReport extends DailyBasicReport {

    @Nullable
    private Map<Integer, Float> avgFingerBSByPeriod;

    @Nullable
    private Map<Long, BloodSugarItem> bloodSugarMap;

    @Nullable
    private PostMealBSDiff fingerBSDiff;

    @Nullable
    private Map<Long, ? extends List<BloodSugarItem>> fingerBSMap;

    @Nullable
    private BloodSugarItem latestFingerItem;

    @Nullable
    private BloodSugarItem latestItem;

    @Nullable
    private String sid;

    @Nullable
    private List<SleepBloodSugarData> sleepDataList;

    @Nullable
    private List<SportBloodSugarData> sportDataList;

    @Nullable
    private StatisticBloodSugar statisticBloodSugar;

    @Nullable
    private StatisticBloodSugar statisticFingerBS;

    @NotNull
    private final String tag;

    @Nullable
    private Map<Integer, Integer> targetDistFingerMap;

    @Nullable
    private Map<Integer, Integer> targetDistMap;
    private long time;

    public DailyBloodSugarReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    @Nullable
    public final Map<Integer, Float> getAvgFingerBSByPeriod() {
        return this.avgFingerBSByPeriod;
    }

    @Nullable
    public final Map<Long, BloodSugarItem> getBloodSugarMap() {
        return this.bloodSugarMap;
    }

    @Nullable
    public final PostMealBSDiff getFingerBSDiff() {
        return this.fingerBSDiff;
    }

    @Nullable
    public final Map<Long, List<BloodSugarItem>> getFingerBSMap() {
        return this.fingerBSMap;
    }

    @Nullable
    public final BloodSugarItem getLatestFingerItem() {
        return this.latestFingerItem;
    }

    @Nullable
    public final BloodSugarItem getLatestItem() {
        return this.latestItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
    }

    @Nullable
    public final List<SleepBloodSugarData> getSleepDataList() {
        return this.sleepDataList;
    }

    @Nullable
    public final List<SportBloodSugarData> getSportDataList() {
        return this.sportDataList;
    }

    @Nullable
    public final StatisticBloodSugar getStatisticBloodSugar() {
        return this.statisticBloodSugar;
    }

    @Nullable
    public final StatisticBloodSugar getStatisticFingerBS() {
        return this.statisticFingerBS;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Nullable
    public final Map<Integer, Integer> getTargetDistFingerMap() {
        return this.targetDistFingerMap;
    }

    @Nullable
    public final Map<Integer, Integer> getTargetDistMap() {
        return this.targetDistMap;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public long getTime() {
        return this.time;
    }

    public final boolean hasAbnormalData() {
        StatisticBloodSugar statisticBloodSugar = this.statisticBloodSugar;
        if (statisticBloodSugar == null) {
            return false;
        }
        Intrinsics.checkNotNull(statisticBloodSugar);
        if (!BloodSugarItemExtKt.isAbnormal(statisticBloodSugar.getMaxItem())) {
            StatisticBloodSugar statisticBloodSugar2 = this.statisticBloodSugar;
            Intrinsics.checkNotNull(statisticBloodSugar2);
            if (!BloodSugarItemExtKt.isAbnormal(statisticBloodSugar2.getMinItem())) {
                return false;
            }
        }
        return true;
    }

    public final boolean hasAbnormalDataByLatestItem() {
        BloodSugarItem bloodSugarItem = this.latestItem;
        if (bloodSugarItem == null) {
            return false;
        }
        Intrinsics.checkNotNull(bloodSugarItem);
        return BloodSugarItemExtKt.isAbnormal(bloodSugarItem);
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        return this.latestItem == null && this.latestFingerItem == null;
    }

    public final void setAvgFingerBSByPeriod(@Nullable Map<Integer, Float> map) {
        this.avgFingerBSByPeriod = map;
    }

    public final void setBloodSugarMap(@Nullable Map<Long, BloodSugarItem> map) {
        this.bloodSugarMap = map;
    }

    public final void setFingerBSDiff(@Nullable PostMealBSDiff postMealBSDiff) {
        this.fingerBSDiff = postMealBSDiff;
    }

    public final void setFingerBSMap(@Nullable Map<Long, ? extends List<BloodSugarItem>> map) {
        this.fingerBSMap = map;
    }

    public final void setLatestFingerItem(@Nullable BloodSugarItem bloodSugarItem) {
        this.latestFingerItem = bloodSugarItem;
    }

    public final void setLatestItem(@Nullable BloodSugarItem bloodSugarItem) {
        this.latestItem = bloodSugarItem;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setSleepDataList(@Nullable List<SleepBloodSugarData> list) {
        this.sleepDataList = list;
    }

    public final void setSportDataList(@Nullable List<SportBloodSugarData> list) {
        this.sportDataList = list;
    }

    public final void setStatisticBloodSugar(@Nullable StatisticBloodSugar statisticBloodSugar) {
        this.statisticBloodSugar = statisticBloodSugar;
    }

    public final void setStatisticFingerBS(@Nullable StatisticBloodSugar statisticBloodSugar) {
        this.statisticFingerBS = statisticBloodSugar;
    }

    public final void setTargetDistFingerMap(@Nullable Map<Integer, Integer> map) {
        this.targetDistFingerMap = map;
    }

    public final void setTargetDistMap(@Nullable Map<Integer, Integer> map) {
        this.targetDistMap = map;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        long time = getTime();
        BloodSugarItem bloodSugarItem = this.latestItem;
        BloodSugarItem bloodSugarItem2 = this.latestFingerItem;
        Map<Long, BloodSugarItem> map = this.bloodSugarMap;
        Integer numValueOf = map != null ? Integer.valueOf(map.size()) : null;
        Map<Long, ? extends List<BloodSugarItem>> map2 = this.fingerBSMap;
        return "DailyBloodSugarReport{time=" + time + ", latestItem(" + bloodSugarItem + "), latestFingerItem(" + bloodSugarItem2 + "), bloodSugarSize(" + numValueOf + "), fingerBSSize(" + (map2 != null ? Integer.valueOf(map2.size()) : null) + "), statisticBloodSugar(" + this.statisticBloodSugar + "), bloodSugarDistribute(" + this.targetDistMap + "), statisticFingerBS(" + this.statisticFingerBS + ")}";
    }
}
