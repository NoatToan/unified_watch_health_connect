package com.mi.health.sleep.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, d2 = {"Lcom/mi/health/sleep/bean/SleepEvaluateInfo;", "", "type", "", "name", "resultId", "", "normalValues", "", "Lcom/mi/health/sleep/bean/EvaluateItem;", "indicatorList", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;)V", "getType", "()Ljava/lang/String;", "getName", "getResultId", "()I", "getNormalValues", "()Ljava/util/List;", "getIndicatorList", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepEvaluateInfo {

    @NotNull
    private final List<EvaluateItem> indicatorList;

    @NotNull
    private final String name;

    @NotNull
    private final List<EvaluateItem> normalValues;
    private final int resultId;

    @NotNull
    private final String type;

    public SleepEvaluateInfo(@NotNull String type, @NotNull String name, int i, @NotNull List<EvaluateItem> normalValues, @NotNull List<EvaluateItem> indicatorList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(normalValues, "normalValues");
        Intrinsics.checkNotNullParameter(indicatorList, "indicatorList");
        this.type = type;
        this.name = name;
        this.resultId = i;
        this.normalValues = normalValues;
        this.indicatorList = indicatorList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepEvaluateInfo copy$default(SleepEvaluateInfo sleepEvaluateInfo, String str, String str2, int i, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sleepEvaluateInfo.type;
        }
        if ((i2 & 2) != 0) {
            str2 = sleepEvaluateInfo.name;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            i = sleepEvaluateInfo.resultId;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            list = sleepEvaluateInfo.normalValues;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = sleepEvaluateInfo.indicatorList;
        }
        return sleepEvaluateInfo.copy(str, str3, i3, list3, list2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getResultId() {
        return this.resultId;
    }

    @NotNull
    public final List<EvaluateItem> component4() {
        return this.normalValues;
    }

    @NotNull
    public final List<EvaluateItem> component5() {
        return this.indicatorList;
    }

    @NotNull
    public final SleepEvaluateInfo copy(@NotNull String type, @NotNull String name, int resultId, @NotNull List<EvaluateItem> normalValues, @NotNull List<EvaluateItem> indicatorList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(normalValues, "normalValues");
        Intrinsics.checkNotNullParameter(indicatorList, "indicatorList");
        return new SleepEvaluateInfo(type, name, resultId, normalValues, indicatorList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepEvaluateInfo)) {
            return false;
        }
        SleepEvaluateInfo sleepEvaluateInfo = (SleepEvaluateInfo) other;
        return Intrinsics.areEqual(this.type, sleepEvaluateInfo.type) && Intrinsics.areEqual(this.name, sleepEvaluateInfo.name) && this.resultId == sleepEvaluateInfo.resultId && Intrinsics.areEqual(this.normalValues, sleepEvaluateInfo.normalValues) && Intrinsics.areEqual(this.indicatorList, sleepEvaluateInfo.indicatorList);
    }

    @NotNull
    public final List<EvaluateItem> getIndicatorList() {
        return this.indicatorList;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<EvaluateItem> getNormalValues() {
        return this.normalValues;
    }

    public final int getResultId() {
        return this.resultId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.resultId)) * 31) + this.normalValues.hashCode()) * 31) + this.indicatorList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SleepEvaluateInfo(type=" + this.type + ", name=" + this.name + ", resultId=" + this.resultId + ", normalValues=" + this.normalValues + ", indicatorList=" + this.indicatorList + ")";
    }
}
