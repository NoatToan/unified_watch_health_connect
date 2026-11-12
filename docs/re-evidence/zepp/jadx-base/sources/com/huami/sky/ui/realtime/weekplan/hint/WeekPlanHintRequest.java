package com.huami.sky.ui.realtime.weekplan.hint;

import androidx.annotation.Keep;
import com.huami.sleep.service.SleepWithTonalityInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006¨\u0006\u0018"}, d2 = {"Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintRequest;", "", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "component1", "", "component2", "()Ljava/lang/Integer;", "sleepInfo", "lastStrId", "copy", "(Lcom/huami/sleep/service/SleepWithTonalityInfo;Ljava/lang/Integer;)Lcom/huami/sky/ui/realtime/weekplan/hint/WeekPlanHintRequest;", "", "toString", "hashCode", "other", "", "equals", "Lcom/huami/sleep/service/SleepWithTonalityInfo;", "getSleepInfo", "()Lcom/huami/sleep/service/SleepWithTonalityInfo;", "Ljava/lang/Integer;", "getLastStrId", "<init>", "(Lcom/huami/sleep/service/SleepWithTonalityInfo;Ljava/lang/Integer;)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WeekPlanHintRequest {

    @Nullable
    private final Integer lastStrId;

    @Nullable
    private final SleepWithTonalityInfo sleepInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public WeekPlanHintRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public WeekPlanHintRequest(@Nullable SleepWithTonalityInfo sleepWithTonalityInfo, @Nullable Integer num) {
        this.sleepInfo = sleepWithTonalityInfo;
        this.lastStrId = num;
    }

    public static /* synthetic */ WeekPlanHintRequest copy$default(WeekPlanHintRequest weekPlanHintRequest, SleepWithTonalityInfo sleepWithTonalityInfo, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            sleepWithTonalityInfo = weekPlanHintRequest.sleepInfo;
        }
        if ((i & 2) != 0) {
            num = weekPlanHintRequest.lastStrId;
        }
        return weekPlanHintRequest.copy(sleepWithTonalityInfo, num);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SleepWithTonalityInfo getSleepInfo() {
        return this.sleepInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getLastStrId() {
        return this.lastStrId;
    }

    @NotNull
    public final WeekPlanHintRequest copy(@Nullable SleepWithTonalityInfo sleepInfo, @Nullable Integer lastStrId) {
        return new WeekPlanHintRequest(sleepInfo, lastStrId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeekPlanHintRequest)) {
            return false;
        }
        WeekPlanHintRequest weekPlanHintRequest = (WeekPlanHintRequest) other;
        return Intrinsics.areEqual(this.sleepInfo, weekPlanHintRequest.sleepInfo) && Intrinsics.areEqual(this.lastStrId, weekPlanHintRequest.lastStrId);
    }

    @Nullable
    public final Integer getLastStrId() {
        return this.lastStrId;
    }

    @Nullable
    public final SleepWithTonalityInfo getSleepInfo() {
        return this.sleepInfo;
    }

    public int hashCode() {
        SleepWithTonalityInfo sleepWithTonalityInfo = this.sleepInfo;
        int iHashCode = (sleepWithTonalityInfo == null ? 0 : sleepWithTonalityInfo.hashCode()) * 31;
        Integer num = this.lastStrId;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WeekPlanHintRequest(sleepInfo=" + this.sleepInfo + ", lastStrId=" + this.lastStrId + ")";
    }

    public /* synthetic */ WeekPlanHintRequest(SleepWithTonalityInfo sleepWithTonalityInfo, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : sleepWithTonalityInfo, (i & 2) != 0 ? null : num);
    }
}
