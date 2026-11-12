package com.huami.third.alexa;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/third/alexa/AlexaHolder;", "", "Lcom/huami/third/alexa/AuthCallback;", "a", "Lcom/huami/third/alexa/AuthCallback;", "getAuthCallback", "()Lcom/huami/third/alexa/AuthCallback;", "setAuthCallback", "(Lcom/huami/third/alexa/AuthCallback;)V", "authCallback", "<init>", "()V", "alexa-ui_release"}, k = 1, mv = {1, 5, 1})
public final class AlexaHolder {

    @NotNull
    public static final AlexaHolder INSTANCE = new AlexaHolder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static AuthCallback authCallback;

    private AlexaHolder() {
    }

    @Nullable
    public final AuthCallback getAuthCallback() {
        return authCallback;
    }

    public final void setAuthCallback(@Nullable AuthCallback authCallback2) {
        authCallback = authCallback2;
    }
}
