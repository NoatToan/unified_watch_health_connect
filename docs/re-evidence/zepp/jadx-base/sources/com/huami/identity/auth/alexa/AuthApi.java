package com.huami.identity.auth.alexa;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\bJ\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\rH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/huami/identity/auth/alexa/AuthApi;", "", "Landroid/os/Bundle;", "data", "Lcom/huami/identity/auth/alexa/AuthStatus;", "signIn", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getAccessToken", "", "forceRefreshToken", "", "isLogin", "auth-alexa_release"}, k = 1, mv = {1, 5, 1})
public interface AuthApi {
    void forceRefreshToken();

    @Nullable
    Object getAccessToken(@NotNull Continuation<? super String> continuation);

    boolean isLogin();

    @Nullable
    Object signIn(@NotNull Bundle bundle, @NotNull Continuation<? super AuthStatus> continuation);

    @Nullable
    Object signOut(@NotNull Continuation<? super AuthStatus> continuation);
}
