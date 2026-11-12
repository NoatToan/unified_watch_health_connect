package com.huami.sleep.sleepstatefeel.vo;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003J\u0019\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0003J=\u0010\t\u001a\u00020\u00002\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00042\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R)\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R)\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelVo;", "", "Ljava/util/ArrayList;", "Lcom/huami/sleep/sleepstatefeel/vo/MonthSleepStateFeelInfo;", "Lkotlin/collections/ArrayList;", "component1", "component2", "feelInfo", "stateInfo", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/ArrayList;", "getFeelInfo", "()Ljava/util/ArrayList;", "b", "getStateInfo", "<init>", "(Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class MonthSleepStateFeelVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<MonthSleepStateFeelInfo> feelInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final ArrayList<MonthSleepStateFeelInfo> stateInfo;

    public MonthSleepStateFeelVo(@NotNull ArrayList<MonthSleepStateFeelInfo> arrayList, @NotNull ArrayList<MonthSleepStateFeelInfo> arrayList2) {
        this.feelInfo = arrayList;
        this.stateInfo = arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MonthSleepStateFeelVo copy$default(MonthSleepStateFeelVo monthSleepStateFeelVo, ArrayList arrayList, ArrayList arrayList2, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = monthSleepStateFeelVo.feelInfo;
        }
        if ((i & 2) != 0) {
            arrayList2 = monthSleepStateFeelVo.stateInfo;
        }
        return monthSleepStateFeelVo.copy(arrayList, arrayList2);
    }

    @NotNull
    public final ArrayList<MonthSleepStateFeelInfo> component1() {
        return this.feelInfo;
    }

    @NotNull
    public final ArrayList<MonthSleepStateFeelInfo> component2() {
        return this.stateInfo;
    }

    @NotNull
    public final MonthSleepStateFeelVo copy(@NotNull ArrayList<MonthSleepStateFeelInfo> feelInfo, @NotNull ArrayList<MonthSleepStateFeelInfo> stateInfo) {
        return new MonthSleepStateFeelVo(feelInfo, stateInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MonthSleepStateFeelVo)) {
            return false;
        }
        MonthSleepStateFeelVo monthSleepStateFeelVo = (MonthSleepStateFeelVo) other;
        return Intrinsics.areEqual(this.feelInfo, monthSleepStateFeelVo.feelInfo) && Intrinsics.areEqual(this.stateInfo, monthSleepStateFeelVo.stateInfo);
    }

    @NotNull
    public final ArrayList<MonthSleepStateFeelInfo> getFeelInfo() {
        return this.feelInfo;
    }

    @NotNull
    public final ArrayList<MonthSleepStateFeelInfo> getStateInfo() {
        return this.stateInfo;
    }

    public int hashCode() {
        return (this.feelInfo.hashCode() * 31) + this.stateInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "MonthSleepStateFeelVo(feelInfo=" + this.feelInfo + ", stateInfo=" + this.stateInfo + ")";
    }
}
