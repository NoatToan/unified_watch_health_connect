package com.xiaomi.fitness.account.di;

import com.xiaomi.fitness.account.ParameterInterceptor;
import com.xiaomi.fitness.account.di.AccountModule;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.manager.AccountManagerImpl;
import com.xiaomi.fitness.account.manager.IMiAccountManager;
import com.xiaomi.fitness.account.manager.MiAccountInternalManager;
import com.xiaomi.fitness.account.token.CookieFetcher;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.account.token.TokenManagerImpl;
import com.xiaomi.fitness.account.token.VerifyToken;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000eH'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H'J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H'¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/account/di/AccountModule;", "", "<init>", "()V", "bindVerifyToken", "Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "verifyToken", "Lcom/xiaomi/fitness/account/token/VerifyToken;", "bindMiAccountManager", "Lcom/xiaomi/fitness/account/manager/IMiAccountManager;", "accountManager", "Lcom/xiaomi/fitness/account/manager/MiAccountInternalManager;", "bindAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "Lcom/xiaomi/fitness/account/manager/AccountManagerImpl;", "bindTokenMangerInternal", "Lcom/xiaomi/fitness/account/token/TokenManager;", "tokenManager", "Lcom/xiaomi/fitness/account/token/TokenManagerImpl;", "bindParameterInterceptor", "cloudInterceptor", "Lcom/xiaomi/fitness/account/ParameterInterceptor;", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AccountModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/account/di/AccountModule$Companion;", "", "<init>", "()V", "provideCookie", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit provideCookie$lambda$0(MiAccessToken token, Map map) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(map, "map");
            String cUserId = token.getCUserId();
            Intrinsics.checkNotNull(cUserId);
            map.put("cUserId", cUserId);
            String serviceToken = token.getServiceToken();
            Intrinsics.checkNotNull(serviceToken);
            map.put("serviceToken", serviceToken);
            return Unit.INSTANCE;
        }

        @NotNull
        public final CookieFetcher provideCookie() {
            return CookieFetcher.INSTANCE.newInstance("miothealth", new Function2() { // from class: l90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountModule.Companion.provideCookie$lambda$0((MiAccessToken) obj, (Map) obj2);
                }
            });
        }
    }

    @NotNull
    public abstract AccountManager bindAccountManager(@NotNull AccountManagerImpl accountManager);

    @NotNull
    public abstract IMiAccountManager bindMiAccountManager(@NotNull MiAccountInternalManager accountManager);

    @NotNull
    public abstract HttpBeforeHandler bindParameterInterceptor(@NotNull ParameterInterceptor cloudInterceptor);

    @NotNull
    public abstract TokenManager bindTokenMangerInternal(@NotNull TokenManagerImpl tokenManager);

    @NotNull
    public abstract HttpBeforeHandler bindVerifyToken(@NotNull VerifyToken verifyToken);
}
