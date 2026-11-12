package com.xiaomi.fitness.net.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\"\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/net/response/BaseResult;", "T", "Lcom/xiaomi/fitness/net/response/BaseResponse;", "result", "<init>", "(Ljava/lang/Object;)V", "getResult", "()Ljava/lang/Object;", "setResult", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/xiaomi/fitness/net/response/BaseResult;", "equals", "", "other", "", "hashCode", "", "toString", "", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class BaseResult<T> extends BaseResponse {

    @SerializedName("result")
    @Nullable
    private T result;

    /* JADX WARN: Illegal instructions before constructor call */
    public BaseResult() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResult copy$default(BaseResult baseResult, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = baseResult.result;
        }
        return baseResult.copy(obj);
    }

    @Nullable
    public final T component1() {
        return this.result;
    }

    @NotNull
    public final BaseResult<T> copy(@Nullable T result) {
        return new BaseResult<>(result);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BaseResult) && Intrinsics.areEqual(this.result, ((BaseResult) other).result);
    }

    @Nullable
    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        T t = this.result;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final void setResult(@Nullable T t) {
        this.result = t;
    }

    @NotNull
    public String toString() {
        return "BaseResult(result=" + this.result + ")";
    }

    public /* synthetic */ BaseResult(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    public BaseResult(@Nullable T t) {
        this.result = t;
    }
}
