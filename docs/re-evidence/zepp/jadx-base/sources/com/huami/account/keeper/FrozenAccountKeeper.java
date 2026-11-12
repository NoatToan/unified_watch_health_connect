package com.huami.account.keeper;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huami/account/keeper/FrozenAccountKeeper;", "", "", "unfreezeReset", "", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "b", "getUserToken", "setUserToken", "userToken", "c", "getUserProvider", "setUserProvider", "userProvider", "<init>", "()V", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class FrozenAccountKeeper {

    @NotNull
    public static final FrozenAccountKeeper INSTANCE = new FrozenAccountKeeper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static String userToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private static String userProvider;

    private FrozenAccountKeeper() {
    }

    @Nullable
    public final String getUserId() {
        return userId;
    }

    @Nullable
    public final String getUserProvider() {
        return userProvider;
    }

    @Nullable
    public final String getUserToken() {
        return userToken;
    }

    public final void setUserId(@Nullable String str) {
        userId = str;
    }

    public final void setUserProvider(@Nullable String str) {
        userProvider = str;
    }

    public final void setUserToken(@Nullable String str) {
        userToken = str;
    }

    public final void unfreezeReset() {
        userId = null;
        userToken = null;
        userProvider = null;
    }
}
