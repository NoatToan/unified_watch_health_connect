package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.Vo2MaxItem;
import com.xiaomi.fitness.common.utils.TimeUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016J\b\u0010.\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\r\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010\"\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010%\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyVo2MaxReport;", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyBasicReport;", "time", "", "tag", "", "<init>", "(JLjava/lang/String;)V", "getTime", "()J", "setTime", "(J)V", "getTag", "()Ljava/lang/String;", "sid", "getSid", "setSid", "(Ljava/lang/String;)V", "vo2MaxList", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/TimesDataRecordInt;", "getVo2MaxList", "()Ljava/util/List;", "setVo2MaxList", "(Ljava/util/List;)V", "maxVo2Max", "", "getMaxVo2Max", "()I", "setMaxVo2Max", "(I)V", "minVo2Max", "getMinVo2Max", "setMinVo2Max", "avgVoxMax", "getAvgVoxMax", "setAvgVoxMax", "latestItem", "Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "getLatestItem", "()Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;", "setLatestItem", "(Lcom/xiaomi/fit/fitness/export/data/item/Vo2MaxItem;)V", "isEmpty", "", "simpleInfo", "toString", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DailyVo2MaxReport extends DailyBasicReport {
    private int avgVoxMax;

    @Nullable
    private Vo2MaxItem latestItem;
    private int maxVo2Max;
    private int minVo2Max;

    @Nullable
    private String sid;

    @NotNull
    private final String tag;
    private long time;

    @Nullable
    private List<TimesDataRecordInt> vo2MaxList;

    public DailyVo2MaxReport(long j, @NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.time = j;
        this.tag = tag;
        this.sid = "default";
    }

    public final int getAvgVoxMax() {
        return this.avgVoxMax;
    }

    @Nullable
    public final Vo2MaxItem getLatestItem() {
        return this.latestItem;
    }

    public final int getMaxVo2Max() {
        return this.maxVo2Max;
    }

    public final int getMinVo2Max() {
        return this.minVo2Max;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @Nullable
    public String getSid() {
        return this.sid;
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

    @Nullable
    public final List<TimesDataRecordInt> getVo2MaxList() {
        return this.vo2MaxList;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public boolean isEmpty() {
        List<TimesDataRecordInt> list = this.vo2MaxList;
        return list == null || list.isEmpty();
    }

    public final void setAvgVoxMax(int i) {
        this.avgVoxMax = i;
    }

    public final void setLatestItem(@Nullable Vo2MaxItem vo2MaxItem) {
        this.latestItem = vo2MaxItem;
    }

    public final void setMaxVo2Max(int i) {
        this.maxVo2Max = i;
    }

    public final void setMinVo2Max(int i) {
        this.minVo2Max = i;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setSid(@Nullable String str) {
        this.sid = str;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    public void setTime(long j) {
        this.time = j;
    }

    public final void setVo2MaxList(@Nullable List<TimesDataRecordInt> list) {
        this.vo2MaxList = list;
    }

    @Override // com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport
    @NotNull
    public String simpleInfo() {
        return toString();
    }

    @NotNull
    public String toString() {
        return "DailyVo2MaxReport(time=" + getTime() + ", time=" + TimeUtils.formatDate("yyyy-MM-dd HH:mm:ss", Long.valueOf(getTime() * ((long) 1000))) + ", tag='" + getTag() + "', maxVo2Max=" + this.maxVo2Max + ", minVo2Max=" + this.minVo2Max + ", avgVoxMax=" + this.avgVoxMax + ", latestItem=" + this.latestItem + ", vo2MaxList=" + this.vo2MaxList + ")";
    }
}
