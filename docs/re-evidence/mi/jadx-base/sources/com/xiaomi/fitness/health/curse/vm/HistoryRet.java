package com.xiaomi.fitness.health.curse.vm;

import com.xiaomi.fit.fitness.export.data.aggregation.Record;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/curse/vm/HistoryRet;", "", "period", "Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "symptoms", "", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "<init>", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;Ljava/util/List;)V", "getPeriod", "()Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;", "setPeriod", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/CurseRecord;)V", "getSymptoms", "()Ljava/util/List;", "setSymptoms", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HistoryRet {

    @Nullable
    private Record period;

    @NotNull
    private List<WomenHealthSymptoms> symptoms;

    public HistoryRet(@Nullable Record record, @NotNull List<WomenHealthSymptoms> symptoms) {
        Intrinsics.checkNotNullParameter(symptoms, "symptoms");
        this.period = record;
        this.symptoms = symptoms;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HistoryRet copy$default(HistoryRet historyRet, Record record, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            record = historyRet.period;
        }
        if ((i & 2) != 0) {
            list = historyRet.symptoms;
        }
        return historyRet.copy(record, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Record getPeriod() {
        return this.period;
    }

    @NotNull
    public final List<WomenHealthSymptoms> component2() {
        return this.symptoms;
    }

    @NotNull
    public final HistoryRet copy(@Nullable Record period, @NotNull List<WomenHealthSymptoms> symptoms) {
        Intrinsics.checkNotNullParameter(symptoms, "symptoms");
        return new HistoryRet(period, symptoms);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryRet)) {
            return false;
        }
        HistoryRet historyRet = (HistoryRet) other;
        return Intrinsics.areEqual(this.period, historyRet.period) && Intrinsics.areEqual(this.symptoms, historyRet.symptoms);
    }

    @Nullable
    public final Record getPeriod() {
        return this.period;
    }

    @NotNull
    public final List<WomenHealthSymptoms> getSymptoms() {
        return this.symptoms;
    }

    public int hashCode() {
        Record record = this.period;
        return ((record == null ? 0 : record.hashCode()) * 31) + this.symptoms.hashCode();
    }

    public final void setPeriod(@Nullable Record record) {
        this.period = record;
    }

    public final void setSymptoms(@NotNull List<WomenHealthSymptoms> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.symptoms = list;
    }

    @NotNull
    public String toString() {
        return "HistoryRet(period=" + this.period + ", symptoms=" + this.symptoms + ")";
    }

    public /* synthetic */ HistoryRet(Record record, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(record, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
