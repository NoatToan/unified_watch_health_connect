package com.xiaomi.fitness.rn.bean;

import com.xiaomi.fitness.mijia.sdk.data.BaseBean;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/rn/bean/DeleteDeviceResult;", "Lcom/xiaomi/fitness/mijia/sdk/data/BaseBean;", "result", "", "", "", "<init>", "(Ljava/util/Map;)V", "getResult", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "sdk_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DeleteDeviceResult extends BaseBean {

    @NotNull
    private final Map<String, Integer> result;

    public DeleteDeviceResult(@NotNull Map<String, Integer> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteDeviceResult copy$default(DeleteDeviceResult deleteDeviceResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = deleteDeviceResult.result;
        }
        return deleteDeviceResult.copy(map);
    }

    @NotNull
    public final Map<String, Integer> component1() {
        return this.result;
    }

    @NotNull
    public final DeleteDeviceResult copy(@NotNull Map<String, Integer> result) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new DeleteDeviceResult(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeleteDeviceResult) && Intrinsics.areEqual(this.result, ((DeleteDeviceResult) other).result);
    }

    @NotNull
    public final Map<String, Integer> getResult() {
        return this.result;
    }

    public int hashCode() {
        return this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeleteDeviceResult(result=" + this.result + ")";
    }
}
