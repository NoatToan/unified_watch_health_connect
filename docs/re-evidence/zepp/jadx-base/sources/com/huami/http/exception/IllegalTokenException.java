package com.huami.http.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00038\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/huami/http/exception/IllegalTokenException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "a", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "code", "b", "getMessage", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class IllegalTokenException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public IllegalTokenException() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public IllegalTokenException(@NotNull String str, @NotNull String str2) {
        super(str2);
        this.code = str;
        this.message = str2;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ IllegalTokenException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
