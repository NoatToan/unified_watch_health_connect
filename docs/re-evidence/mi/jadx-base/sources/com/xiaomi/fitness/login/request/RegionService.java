package com.xiaomi.fitness.login.request;

import com.xiaomi.fitness.account.api.bean.CountryRegion;
import com.xiaomi.fitness.account.api.bean.RegionInfo;
import com.xiaomi.fitness.account.api.bean.UserRegion;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.zk9;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eJ\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J$\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00032\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH§@¢\u0006\u0002\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/login/request/RegionService;", "", "getUserRegion", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/account/api/bean/UserRegion;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCountryRegions", "", "Lcom/xiaomi/fitness/account/api/bean/CountryRegion;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setUserRegion", "Lcom/xiaomi/fitness/account/api/bean/RegionInfo;", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RegionService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HEALTH_REGION_HOST = "hlth.io.mi.com";

    @NotNull
    public static final String HEALTH_REGION_URL = "https://hlth.io.mi.com/";

    @NotNull
    public static final String REGION_PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/login/request/RegionService$Companion;", "", "<init>", "()V", "REGION_PATH", "", "HEALTH_REGION_HOST", "HEALTH_REGION_URL", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HEALTH_REGION_HOST = "hlth.io.mi.com";

        @NotNull
        public static final String HEALTH_REGION_URL = "https://hlth.io.mi.com/";

        @NotNull
        public static final String REGION_PATH = "healthapp/";

        private Companion() {
        }
    }

    @u0a
    @ngh("region/country_to_region")
    @Nullable
    Object getCountryRegions(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<List<CountryRegion>>> continuation);

    @Nullable
    @uua("region/user_region")
    Object getUserRegion(@NotNull Continuation<? super BaseResult<UserRegion>> continuation);

    @u0a
    @ngh("region/set_user_region")
    @Nullable
    Object setUserRegion(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<RegionInfo>> continuation);
}
