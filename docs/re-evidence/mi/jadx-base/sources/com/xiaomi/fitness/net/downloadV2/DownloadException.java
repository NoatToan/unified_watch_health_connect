package com.xiaomi.fitness.net.downloadV2;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0002j\u0002`\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/DownloadException;", "Lkotlin/Exception;", "Ljava/lang/Exception;", "error", "Lcom/xiaomi/fitness/net/downloadV2/ErrorCode;", "exception", "<init>", "(Lcom/xiaomi/fitness/net/downloadV2/ErrorCode;Ljava/lang/Exception;)V", "getError", "()Lcom/xiaomi/fitness/net/downloadV2/ErrorCode;", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DownloadException extends Exception {

    @NotNull
    private final ErrorCode error;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadException(@NotNull ErrorCode error, @Nullable Exception exc) {
        super(exc);
        Intrinsics.checkNotNullParameter(error, "error");
        this.error = error;
    }

    @NotNull
    public final ErrorCode getError() {
        return this.error;
    }

    public /* synthetic */ DownloadException(ErrorCode errorCode, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorCode, (i & 2) != 0 ? null : exc);
    }
}
