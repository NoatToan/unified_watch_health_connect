package com.huami.identity.auth.alexa;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/huami/identity/auth/alexa/CancelError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "code", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class CancelError extends Exception {
    public CancelError(@NotNull String str, @NotNull String str2) {
        super("code: " + str + ", description: " + str2);
    }
}
