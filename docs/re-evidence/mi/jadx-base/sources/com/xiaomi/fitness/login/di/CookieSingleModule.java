package com.xiaomi.fitness.login.di;

import android.os.IBinder;
import com.xiaomi.fitness.account.token.CookieFetcher;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.login.di.CookieSingleModule;
import com.xiaomi.fitness.login.export.AccountCookieManager;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.login.request.RegionUrlSwitcherImpl;
import com.xiaomi.fitness.login.token.AccountServiceCookieImpl;
import com.xiaomi.fitness.login.token.TokenManagerDelegate;
import com.xiaomi.fitness.login.token.TokenManagerInternal;
import com.xiaomi.fitness.login.token.TokenManagerRemoteImpl;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0013H'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H'¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/login/di/CookieSingleModule;", "", "<init>", "()V", "bindDeviceManager", "Lcom/xiaomi/fitness/login/export/AccountCookieManager;", "accountServiceCookie", "Lcom/xiaomi/fitness/login/token/AccountServiceCookieImpl;", "bindRequestManager", "Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "regionUrlSwitcherImpl", "Lcom/xiaomi/fitness/login/request/RegionUrlSwitcherImpl;", "bindRegionManager", "Lcom/xiaomi/fitness/login/export/RegionManager;", "regionManager", "Lcom/xiaomi/fitness/login/region/RegionManagerImpl;", "bindTokenManger", "Lcom/xiaomi/fitness/account/token/TokenManager;", "tokenManager", "Lcom/xiaomi/fitness/login/token/TokenManagerDelegate;", "bindTokenMangerInternal", "Lcom/xiaomi/fitness/login/token/TokenManagerInternal;", "bindDeviceManagerBinder", "Landroid/os/IBinder;", "binder", "Lcom/xiaomi/fitness/login/token/TokenManagerRemoteImpl;", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CookieSingleModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/login/di/CookieSingleModule$Companion;", "", "<init>", "()V", "provideRegionCookie", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit provideRegionCookie$lambda$0(MiAccessToken token, Map map) {
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
        public final CookieFetcher provideRegionCookie() {
            return CookieFetcher.INSTANCE.newInstance("miothealth", new Function2() { // from class: mk4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CookieSingleModule.Companion.provideRegionCookie$lambda$0((MiAccessToken) obj, (Map) obj2);
                }
            });
        }
    }

    @NotNull
    public abstract AccountCookieManager bindDeviceManager(@NotNull AccountServiceCookieImpl accountServiceCookie);

    @NotNull
    public abstract IBinder bindDeviceManagerBinder(@NotNull TokenManagerRemoteImpl binder);

    @NotNull
    public abstract RegionManager bindRegionManager(@NotNull RegionManagerImpl regionManager);

    @NotNull
    public abstract HttpBeforeHandler bindRequestManager(@NotNull RegionUrlSwitcherImpl regionUrlSwitcherImpl);

    @NotNull
    public abstract TokenManager bindTokenManger(@NotNull TokenManagerDelegate tokenManager);

    @NotNull
    public abstract TokenManagerInternal bindTokenMangerInternal(@NotNull TokenManagerDelegate tokenManager);
}
