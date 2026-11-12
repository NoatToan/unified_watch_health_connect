package com.xiaomi.fitness.common.concurrent;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u0012*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0012B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/Result;", "T", "", "isSuccess", "", "code", "", "data", "<init>", "(ZILjava/lang/Object;)V", "()Z", "getCode", "()I", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "toString", "", "Companion", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Result<T> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Result<?> FAILURE = new Result<>(false, -1, null);
    private final int code;
    private final T data;
    private final boolean isSuccess;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u0002H\u0007¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0005\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00020\tJ\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00070\u0005\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0001\u0010\u0007R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/common/concurrent/Result$Companion;", "", "<init>", "()V", "FAILURE", "Lcom/xiaomi/fitness/common/concurrent/Result;", "success", "T", "code", "", "data", "(ILjava/lang/Object;)Lcom/xiaomi/fitness/common/concurrent/Result;", "failure", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final <T> Result<T> failure(int code) {
            return new Result<>(false, code, null);
        }

        @NotNull
        public final <T> Result<T> success(int code, T data) {
            return new Result<>(true, code, data);
        }

        @NotNull
        public final <T> Result<T> failure() {
            Result<T> result = Result.FAILURE;
            Intrinsics.checkNotNull(result, "null cannot be cast to non-null type com.xiaomi.fitness.common.concurrent.Result<T of com.xiaomi.fitness.common.concurrent.Result.Companion.failure>");
            return result;
        }

        @NotNull
        public final <T> Result<T> success(int code) {
            return new Result<>(true, code, null);
        }
    }

    public Result(boolean z, int i, T t) {
        this.isSuccess = z;
        this.code = i;
        this.data = t;
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: isSuccess, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        return "Result{succ=" + this.isSuccess + ", data=" + this.data + ", code=" + this.code + "}";
    }
}
