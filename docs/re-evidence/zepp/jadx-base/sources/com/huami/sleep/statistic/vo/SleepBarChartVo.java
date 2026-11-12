package com.huami.sleep.statistic.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0003J-\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R2\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/sleep/statistic/vo/SleepBarChartVo;", "", "", "component1", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "component2", "index", "value", "copy", "", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getIndex", "()I", "b", "Ljava/util/ArrayList;", "getValue", "()Ljava/util/ArrayList;", "setValue", "(Ljava/util/ArrayList;)V", "<init>", "(ILjava/util/ArrayList;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepBarChartVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private ArrayList<Float> value;

    public SleepBarChartVo(int i, @NotNull ArrayList<Float> arrayList) {
        this.index = i;
        this.value = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepBarChartVo copy$default(SleepBarChartVo sleepBarChartVo, int i, ArrayList arrayList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sleepBarChartVo.index;
        }
        if ((i2 & 2) != 0) {
            arrayList = sleepBarChartVo.value;
        }
        return sleepBarChartVo.copy(i, arrayList);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ArrayList<Float> component2() {
        return this.value;
    }

    @NotNull
    public final SleepBarChartVo copy(int index, @NotNull ArrayList<Float> value) {
        return new SleepBarChartVo(index, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepBarChartVo)) {
            return false;
        }
        SleepBarChartVo sleepBarChartVo = (SleepBarChartVo) other;
        return this.index == sleepBarChartVo.index && Intrinsics.areEqual(this.value, sleepBarChartVo.value);
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final ArrayList<Float> getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.index * 31) + this.value.hashCode();
    }

    public final void setValue(@NotNull ArrayList<Float> arrayList) {
        this.value = arrayList;
    }

    @NotNull
    public String toString() {
        return "SleepBarChartVo(index=" + this.index + ", value=" + this.value + ")";
    }
}
