package com.xiaomi.fitness.health.ecg.data;

import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/data/EcgSnippetDataModel;", "", "hrName", "", "timestamp", "", "avgHr", "", "interpretationStatus", "symptomCount", "record", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "<init>", "(Ljava/lang/String;JIIILcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;)V", "getHrName", "()Ljava/lang/String;", "getTimestamp", "()J", "getAvgHr", "()I", "getInterpretationStatus", "getSymptomCount", "getRecord", "()Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EcgSnippetDataModel {
    private final int avgHr;

    @NotNull
    private final String hrName;
    private final int interpretationStatus;

    @Nullable
    private final DailyRecordItem record;
    private final int symptomCount;
    private final long timestamp;

    public EcgSnippetDataModel(@NotNull String hrName, long j, int i, @EcgInterpretationStatus int i2, int i3, @Nullable DailyRecordItem dailyRecordItem) {
        Intrinsics.checkNotNullParameter(hrName, "hrName");
        this.hrName = hrName;
        this.timestamp = j;
        this.avgHr = i;
        this.interpretationStatus = i2;
        this.symptomCount = i3;
        this.record = dailyRecordItem;
    }

    public static /* synthetic */ EcgSnippetDataModel copy$default(EcgSnippetDataModel ecgSnippetDataModel, String str, long j, int i, int i2, int i3, DailyRecordItem dailyRecordItem, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = ecgSnippetDataModel.hrName;
        }
        if ((i4 & 2) != 0) {
            j = ecgSnippetDataModel.timestamp;
        }
        long j2 = j;
        if ((i4 & 4) != 0) {
            i = ecgSnippetDataModel.avgHr;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = ecgSnippetDataModel.interpretationStatus;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = ecgSnippetDataModel.symptomCount;
        }
        int i7 = i3;
        if ((i4 & 32) != 0) {
            dailyRecordItem = ecgSnippetDataModel.record;
        }
        return ecgSnippetDataModel.copy(str, j2, i5, i6, i7, dailyRecordItem);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHrName() {
        return this.hrName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgHr() {
        return this.avgHr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getInterpretationStatus() {
        return this.interpretationStatus;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSymptomCount() {
        return this.symptomCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DailyRecordItem getRecord() {
        return this.record;
    }

    @NotNull
    public final EcgSnippetDataModel copy(@NotNull String hrName, long timestamp, int avgHr, @EcgInterpretationStatus int interpretationStatus, int symptomCount, @Nullable DailyRecordItem record) {
        Intrinsics.checkNotNullParameter(hrName, "hrName");
        return new EcgSnippetDataModel(hrName, timestamp, avgHr, interpretationStatus, symptomCount, record);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgSnippetDataModel)) {
            return false;
        }
        EcgSnippetDataModel ecgSnippetDataModel = (EcgSnippetDataModel) other;
        return Intrinsics.areEqual(this.hrName, ecgSnippetDataModel.hrName) && this.timestamp == ecgSnippetDataModel.timestamp && this.avgHr == ecgSnippetDataModel.avgHr && this.interpretationStatus == ecgSnippetDataModel.interpretationStatus && this.symptomCount == ecgSnippetDataModel.symptomCount && Intrinsics.areEqual(this.record, ecgSnippetDataModel.record);
    }

    public final int getAvgHr() {
        return this.avgHr;
    }

    @NotNull
    public final String getHrName() {
        return this.hrName;
    }

    public final int getInterpretationStatus() {
        return this.interpretationStatus;
    }

    @Nullable
    public final DailyRecordItem getRecord() {
        return this.record;
    }

    public final int getSymptomCount() {
        return this.symptomCount;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.hrName.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.avgHr)) * 31) + Integer.hashCode(this.interpretationStatus)) * 31) + Integer.hashCode(this.symptomCount)) * 31;
        DailyRecordItem dailyRecordItem = this.record;
        return iHashCode + (dailyRecordItem == null ? 0 : dailyRecordItem.hashCode());
    }

    @NotNull
    public String toString() {
        return "EcgSnippetDataModel(hrName=" + this.hrName + ", timestamp=" + this.timestamp + ", avgHr=" + this.avgHr + ", interpretationStatus=" + this.interpretationStatus + ", symptomCount=" + this.symptomCount + ", record=" + this.record + ")";
    }
}
