package com.huami.sleep.sleepstatefeel.vo;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Bo\u00122\u0010\u0007\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u0004\u00122\u0010\b\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u0005\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u0004HÆ\u0003J5\u0010\u0006\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u0004HÆ\u0003Ju\u0010\t\u001a\u00020\u000024\b\u0002\u0010\u0007\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u000424\b\u0002\u0010\b\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003RN\u0010\u0007\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015RN\u0010\b\u001a.\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002j\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/vo/WeekSleepStateFeelVo;", "", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "component1", "component2", "feelInfo", "stateInfo", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/ArrayList;", "getFeelInfo", "()Ljava/util/ArrayList;", "setFeelInfo", "(Ljava/util/ArrayList;)V", "b", "getStateInfo", "setStateInfo", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeekSleepStateFeelVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private ArrayList<ArrayList<Integer>> feelInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private ArrayList<ArrayList<Integer>> stateInfo;

    public WeekSleepStateFeelVo(@NotNull ArrayList<ArrayList<Integer>> arrayList, @NotNull ArrayList<ArrayList<Integer>> arrayList2) {
        this.feelInfo = arrayList;
        this.stateInfo = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeekSleepStateFeelVo copy$default(WeekSleepStateFeelVo weekSleepStateFeelVo, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = weekSleepStateFeelVo.feelInfo;
        }
        if ((i & 2) != 0) {
            arrayList2 = weekSleepStateFeelVo.stateInfo;
        }
        return weekSleepStateFeelVo.copy(arrayList, arrayList2);
    }

    @NotNull
    public final ArrayList<ArrayList<Integer>> component1() {
        return this.feelInfo;
    }

    @NotNull
    public final ArrayList<ArrayList<Integer>> component2() {
        return this.stateInfo;
    }

    @NotNull
    public final WeekSleepStateFeelVo copy(@NotNull ArrayList<ArrayList<Integer>> feelInfo, @NotNull ArrayList<ArrayList<Integer>> stateInfo) {
        return new WeekSleepStateFeelVo(feelInfo, stateInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekSleepStateFeelVo)) {
            return false;
        }
        WeekSleepStateFeelVo weekSleepStateFeelVo = (WeekSleepStateFeelVo) other;
        return Intrinsics.areEqual(this.feelInfo, weekSleepStateFeelVo.feelInfo) && Intrinsics.areEqual(this.stateInfo, weekSleepStateFeelVo.stateInfo);
    }

    @NotNull
    public final ArrayList<ArrayList<Integer>> getFeelInfo() {
        return this.feelInfo;
    }

    @NotNull
    public final ArrayList<ArrayList<Integer>> getStateInfo() {
        return this.stateInfo;
    }

    public int hashCode() {
        return (this.feelInfo.hashCode() * 31) + this.stateInfo.hashCode();
    }

    public final void setFeelInfo(@NotNull ArrayList<ArrayList<Integer>> arrayList) {
        this.feelInfo = arrayList;
    }

    public final void setStateInfo(@NotNull ArrayList<ArrayList<Integer>> arrayList) {
        this.stateInfo = arrayList;
    }

    @NotNull
    public String toString() {
        return "WeekSleepStateFeelVo(feelInfo=" + this.feelInfo + ", stateInfo=" + this.stateInfo + ")";
    }
}
