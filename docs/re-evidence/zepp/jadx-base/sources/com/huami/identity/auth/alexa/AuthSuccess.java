package com.huami.identity.auth.alexa;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/identity/auth/alexa/AuthSuccess;", "Lcom/huami/identity/auth/alexa/AuthStatus;", "Lcom/huami/identity/auth/alexa/Token;", "a", "Lcom/huami/identity/auth/alexa/Token;", "getToken", "()Lcom/huami/identity/auth/alexa/Token;", "token", "<init>", "(Lcom/huami/identity/auth/alexa/Token;)V", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class AuthSuccess extends AuthStatus {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Token token;

    public AuthSuccess(@Nullable Token token) {
        super(null);
        this.token = token;
    }

    @Nullable
    public final Token getToken() {
        return this.token;
    }
}
