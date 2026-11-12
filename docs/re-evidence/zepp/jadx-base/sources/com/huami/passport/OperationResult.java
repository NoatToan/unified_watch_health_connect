package com.huami.passport;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u00020\f8F@\u0006¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/passport/OperationResult;", "SuccessResult", "", "result", "Ljava/lang/Object;", "getResult", "()Ljava/lang/Object;", "Lcom/huami/passport/ErrorCode;", "errorCode", "Lcom/huami/passport/ErrorCode;", "getErrorCode", "()Lcom/huami/passport/ErrorCode;", "", "isSuccess", "()Z", "isSuccess$annotations", "()V", "<init>", "(Ljava/lang/Object;Lcom/huami/passport/ErrorCode;)V", "passport_release"}, k = 1, mv = {1, 5, 1})
public final class OperationResult<SuccessResult> {

    @Nullable
    private final ErrorCode errorCode;

    @Nullable
    private final SuccessResult result;

    public OperationResult(@Nullable SuccessResult successresult, @Nullable ErrorCode errorCode) {
        this.result = successresult;
        this.errorCode = errorCode;
    }

    public static /* synthetic */ void isSuccess$annotations() {
    }

    @Nullable
    public final ErrorCode getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final SuccessResult getResult() {
        return this.result;
    }

    public final boolean isSuccess() {
        return this.result != null;
    }
}
