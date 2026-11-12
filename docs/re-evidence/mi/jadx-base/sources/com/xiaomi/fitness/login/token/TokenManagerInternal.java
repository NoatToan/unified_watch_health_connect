package com.xiaomi.fitness.login.token;

import com.xiaomi.fitness.account.token.AccessTokenObserver;
import com.xiaomi.fitness.account.token.TokenManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/login/token/TokenManagerInternal;", "Lcom/xiaomi/fitness/account/token/TokenManager;", "registerObserver", "", "sid", "", "observer", "Lcom/xiaomi/fitness/account/token/AccessTokenObserver;", "unregisterObserver", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface TokenManagerInternal extends TokenManager {
    void registerObserver(@NotNull String sid, @NotNull AccessTokenObserver observer);

    void unregisterObserver(@NotNull String sid, @NotNull AccessTokenObserver observer);
}
