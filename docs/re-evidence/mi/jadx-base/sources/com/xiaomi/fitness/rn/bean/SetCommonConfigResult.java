package com.xiaomi.fitness.rn.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/SetCommonConfigResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "", "<init>", "(Ljava/lang/String;)V", "getResult", "()Ljava/lang/String;", "setResult", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetCommonConfigResult extends BaseBean {

    @NotNull
    private String result;

    public SetCommonConfigResult(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ SetCommonConfigResult copy$default(SetCommonConfigResult setCommonConfigResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setCommonConfigResult.result;
        }
        return setCommonConfigResult.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    @NotNull
    public final SetCommonConfigResult copy(@NotNull String result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new SetCommonConfigResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SetCommonConfigResult) && Intrinsics.areEqual(this.result, ((SetCommonConfigResult) other).result);
    }

    @NotNull
    public final String getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public final void setResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.result = str;
    }

    @NotNull
    public String toString() {
        return "SetCommonConfigResult(result=" + this.result + ")";
    }
}
