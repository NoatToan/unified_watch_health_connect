package com.mi.health.appupgrade.net;

import com.mi.health.appupgrade.model.AppUpgradeResult;
import com.mi.health.appupgrade.model.AppVersionDetailResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.emb;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/mi/health/appupgrade/net/AppUpgradeService;", "", "getAppUpgrade", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "data", "", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppVersionDetail", "Lcom/mi/health/appupgrade/model/AppVersionDetailResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AppUpgradeService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/mi/health/appupgrade/net/AppUpgradeService$Companion;", "", "<init>", "()V", "PATH", "", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String PATH = "app/v1/";

        private Companion() {
        }
    }

    @ngh("version/check_upgrade")
    @emb({"Cookie:auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @u0a
    @Secret(loginPolicy = 3)
    Object getAppUpgrade(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull @xfi(encoded = true, value = "locale") String str2, @NotNull Continuation<? super BaseResult<AppUpgradeResult>> continuation);

    @ngh("version/get_version_detail")
    @emb({"Cookie:auth_key=rwelJuWBFJxmbMKD"})
    @Nullable
    @u0a
    @Secret(loginPolicy = 3)
    Object getAppVersionDetail(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<AppVersionDetailResult>> continuation);
}
