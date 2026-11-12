package com.xiaomi.fit.fitness.export.data.aggregation;

import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;

/* JADX INFO: renamed from: com.xiaomi.fit.fitness.export.data.aggregation.CurseRecord, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e¨\u0006\""}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "Ljava/io/Serializable;", "startMills", "", "endMills", "updateTime", "interval", "", "id", "<init>", "(JJJII)V", "getStartMills", "()J", "setStartMills", "(J)V", "getEndMills", "setEndMills", "getUpdateTime", "setUpdateTime", "getInterval", "()I", "setInterval", "(I)V", "getId", "setId", "modifySec", "getModifySec", "setModifySec", "toString", "", "isInPeriod", "", DialWidgetType.DATE, "Lorg/joda/time/LocalDate;", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Record implements Serializable {
    private long endMills;
    private int id;
    private int interval;
    private long modifySec;
    private long startMills;
    private long updateTime;

    public Record(long j, long j2, long j3, int i, int i2) {
        this.startMills = j;
        this.endMills = j2;
        this.updateTime = j3;
        this.interval = i;
        this.id = i2;
    }

    public final long getEndMills() {
        return this.endMills;
    }

    public final int getId() {
        return this.id;
    }

    public final int getInterval() {
        return this.interval;
    }

    public final long getModifySec() {
        return this.modifySec;
    }

    public final long getStartMills() {
        return this.startMills;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final boolean isInPeriod(@NotNull LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        long jChangZeroOfTheDayInner = TimeDateUtil.INSTANCE.changZeroOfTheDayInner(date);
        return jChangZeroOfTheDayInner >= this.startMills && jChangZeroOfTheDayInner <= this.endMills;
    }

    public final void setEndMills(long j) {
        this.endMills = j;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setInterval(int i) {
        this.interval = i;
    }

    public final void setModifySec(long j) {
        this.modifySec = j;
    }

    public final void setStartMills(long j) {
        this.startMills = j;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @NotNull
    public String toString() {
        return "Record(formatStart=" + new LocalDate(this.startMills) + ",formatEnd=" + new LocalDate(this.endMills) + ",formatUpdate=" + new LocalDate(this.updateTime * ((long) 1000)) + ",interval=" + this.interval + ", id=" + this.id + ")";
    }

    public /* synthetic */ Record(long j, long j2, long j3, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, i, (i3 & 16) != 0 ? 0 : i2);
    }
}
