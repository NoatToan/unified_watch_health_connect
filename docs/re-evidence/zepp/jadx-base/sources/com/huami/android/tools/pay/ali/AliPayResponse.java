package com.huami.android.tools.pay.ali;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/huami/android/tools/pay/ali/AliPayResponse;", "", "", "isSuccessful", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getMessage", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "paycompat_release"}, k = 1, mv = {1, 5, 1})
public final class AliPayResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String message;

    public AliPayResponse(@NotNull String str, @NotNull String str2) {
        this.code = str;
        this.message = str2;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final boolean isSuccessful() {
        return Intrinsics.areEqual(this.code, "9000");
    }
}
