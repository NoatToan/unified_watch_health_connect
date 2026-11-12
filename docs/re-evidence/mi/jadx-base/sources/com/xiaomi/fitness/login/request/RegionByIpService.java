package com.xiaomi.fitness.login.request;

import com.xiaomi.fitness.account.api.bean.CountryRegion;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.emb;
import defpackage.uua;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "/")
@Secret(pathPrefix = "/")
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/login/request/RegionByIpService;", "", "getUserRegionByIP", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/account/api/bean/CountryRegion;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RegionByIpService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_REGION_BY_IP_HOST = "hlth.io.mi.com";

    @NotNull
    public static final String HEALTH_REGION_URL = "https://hlth.io.mi.com/";

    @NotNull
    public static final String REGION_PATH = "/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/login/request/RegionByIpService$Companion;", "", "<init>", "()V", "REGION_PATH", "", "HEALTH_REGION_BY_IP_HOST", "HEALTH_REGION_URL", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEALTH_REGION_BY_IP_HOST = "hlth.io.mi.com";

        @NotNull
        public static final String HEALTH_REGION_URL = "https://hlth.io.mi.com/";

        @NotNull
        public static final String REGION_PATH = "/";

        private Companion() {
        }
    }

    @emb({"Cookie: auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @uua("app/v1/public/user_region_by_ip")
    @Secret(loginPolicy = 1, pathPrefix = "/")
    Object getUserRegionByIP(@NotNull Continuation<? super BaseResult<CountryRegion>> continuation);
}
