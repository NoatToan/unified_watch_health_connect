package com.huami.device.core.sync.api.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/device/core/sync/api/exception/NotSupportException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "e", "<init>", "(Ljava/lang/String;Ljava/lang/Exception;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class NotSupportException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public NotSupportException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NotSupportException(String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : exc);
    }

    public NotSupportException(@NotNull String str, @Nullable Exception exc) {
        super(Intrinsics.stringPlus("not yet implement, message ", str), exc);
    }
}
