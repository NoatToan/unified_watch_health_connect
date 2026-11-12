package com.xiaomi.fit.fitness.export.data.stat;

import com.xiaomi.fit.fitness.export.data.ITimeData;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0019\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\t\u0010\"\u001a\u00020\u0004HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0003J#\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006HÆ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/stat/SleepAnimalReport;", "Lcom/xiaomi/fit/fitness/export/data/ITimeData;", "Ljava/io/Serializable;", "time", "", "sampleDates", "", "<init>", "(JLjava/util/List;)V", "getTime", "()J", "getSampleDates", "()Ljava/util/List;", "dbTime", "getDbTime", "()Ljava/lang/Long;", "setDbTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "animal", "Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;", "getAnimal", "()Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;", "setAnimal", "(Lcom/xiaomi/fit/fitness/export/data/stat/AnimalInfo;)V", "getTimestamp", "setTimestamp", "", "toString", "", "equals", "", "other", "", "component1", "component2", "copy", "hashCode", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepAnimalReport implements ITimeData, Serializable {

    @Nullable
    private AnimalInfo animal;

    @Nullable
    private Long dbTime;

    @NotNull
    private final List<Long> sampleDates;
    private final long time;

    public SleepAnimalReport(long j, @NotNull List<Long> sampleDates) {
        Intrinsics.checkNotNullParameter(sampleDates, "sampleDates");
        this.time = j;
        this.sampleDates = sampleDates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepAnimalReport copy$default(SleepAnimalReport sleepAnimalReport, long j, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepAnimalReport.time;
        }
        if ((i & 2) != 0) {
            list = sleepAnimalReport.sampleDates;
        }
        return sleepAnimalReport.copy(j, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final List<Long> component2() {
        return this.sampleDates;
    }

    @NotNull
    public final SleepAnimalReport copy(long time, @NotNull List<Long> sampleDates) {
        Intrinsics.checkNotNullParameter(sampleDates, "sampleDates");
        return new SleepAnimalReport(time, sampleDates);
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof SleepAnimalReport)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        SleepAnimalReport sleepAnimalReport = (SleepAnimalReport) other;
        return this.time == sleepAnimalReport.time && Intrinsics.areEqual(this.animal, sleepAnimalReport.animal);
    }

    @Nullable
    public final AnimalInfo getAnimal() {
        return this.animal;
    }

    @Nullable
    public final Long getDbTime() {
        return this.dbTime;
    }

    @NotNull
    public final List<Long> getSampleDates() {
        return this.sampleDates;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + this.sampleDates.hashCode();
    }

    public final void setAnimal(@Nullable AnimalInfo animalInfo) {
        this.animal = animalInfo;
    }

    public final void setDbTime(@Nullable Long l) {
        this.dbTime = l;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @NotNull
    public String toString() {
        return "SleepAnimalReport{time=" + this.time + ", sampleDates=" + this.sampleDates + ", animal=" + this.animal + "}";
    }
}
