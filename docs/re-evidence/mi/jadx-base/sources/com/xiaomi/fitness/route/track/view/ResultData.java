package com.xiaomi.fitness.route.track.view;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/ResultData;", "", "success", "", "code", "", "result", "<init>", "(ZILjava/lang/Integer;)V", "getSuccess", "()Z", "getCode", "()I", "getResult", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ZILjava/lang/Integer;)Lcom/xiaomi/fitness/route/track/view/ResultData;", "equals", "other", "hashCode", "toString", "", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ResultData {
    private final int code;

    @Nullable
    private final Integer result;
    private final boolean success;

    public ResultData(boolean z, int i, @Nullable Integer num) {
        this.success = z;
        this.code = i;
        this.result = num;
    }

    public static /* synthetic */ ResultData copy$default(ResultData resultData, boolean z, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = resultData.success;
        }
        if ((i2 & 2) != 0) {
            i = resultData.code;
        }
        if ((i2 & 4) != 0) {
            num = resultData.result;
        }
        return resultData.copy(z, i, num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getResult() {
        return this.result;
    }

    @NotNull
    public final ResultData copy(boolean success, int code, @Nullable Integer result) {
        return new ResultData(success, code, result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResultData)) {
            return false;
        }
        ResultData resultData = (ResultData) other;
        return this.success == resultData.success && this.code == resultData.code && Intrinsics.areEqual(this.result, resultData.result);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final Integer getResult() {
        return this.result;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.success) * 31) + Integer.hashCode(this.code)) * 31;
        Integer num = this.result;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ResultData(success=" + this.success + ", code=" + this.code + ", result=" + this.result + ")";
    }

    public /* synthetic */ ResultData(boolean z, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, (i2 & 4) != 0 ? null : num);
    }
}
