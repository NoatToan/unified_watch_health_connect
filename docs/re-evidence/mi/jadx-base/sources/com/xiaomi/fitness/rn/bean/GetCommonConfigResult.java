package com.xiaomi.fitness.rn.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/GetCommonConfigResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "Lcom/xiaomi/fitness/rn/bean/ConfigInfos;", "<init>", "(Lcom/xiaomi/fitness/rn/bean/ConfigInfos;)V", "getResult", "()Lcom/xiaomi/fitness/rn/bean/ConfigInfos;", "setResult", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetCommonConfigResult extends BaseBean {

    @NotNull
    private ConfigInfos result;

    public GetCommonConfigResult(@NotNull ConfigInfos result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    public static /* synthetic */ GetCommonConfigResult copy$default(GetCommonConfigResult getCommonConfigResult, ConfigInfos configInfos, int i, Object obj) {
        if ((i & 1) != 0) {
            configInfos = getCommonConfigResult.result;
        }
        return getCommonConfigResult.copy(configInfos);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConfigInfos getResult() {
        return this.result;
    }

    @NotNull
    public final GetCommonConfigResult copy(@NotNull ConfigInfos result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new GetCommonConfigResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetCommonConfigResult) && Intrinsics.areEqual(this.result, ((GetCommonConfigResult) other).result);
    }

    @NotNull
    public final ConfigInfos getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    public final void setResult(@NotNull ConfigInfos configInfos) {
        Intrinsics.checkNotNullParameter(configInfos, "<set-?>");
        this.result = configInfos;
    }

    @NotNull
    public String toString() {
        return "GetCommonConfigResult(result=" + this.result + ")";
    }
}
