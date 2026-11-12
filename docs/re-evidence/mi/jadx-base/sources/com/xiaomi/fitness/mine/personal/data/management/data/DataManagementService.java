package com.xiaomi.fitness.mine.personal.data.management.data;

import com.xiaomi.fitness.mine.personal.data.management.data.model.GetLabCollaborationAuthConfigResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetMiAppAuthScopeListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyAuthConfigListResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GetThirdPartyResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.GrantLabAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.RevokeLabAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.SetThirdPartyAuthResult;
import com.xiaomi.fitness.mine.personal.data.management.data.model.UpdateMiAppAuthScopeListResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "app/v1/")
@Secret(pathPrefix = "")
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementService;", "", "getAuthConfigList", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyAuthConfigListResult;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMiAppAuthScopeList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetMiAppAuthScopeListResult;", "updateMiAppAuthScopeList", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/UpdateMiAppAuthScopeListResult;", "getLabCollaborationAuthConfig", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetLabCollaborationAuthConfigResult;", "grantLabAuth", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GrantLabAuthResult;", "revokeLabAuth", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/RevokeLabAuthResult;", "setThirdPartyAuth", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/SetThirdPartyAuthResult;", "getThirdParty", "Lcom/xiaomi/fitness/mine/personal/data/management/data/model/GetThirdPartyResult;", "Companion", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DataManagementService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HTTP_HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String HTTP_PATH = "app/v1/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/mine/personal/data/management/data/DataManagementService$Companion;", "", "<init>", "()V", "HTTP_PATH", "", "HTTP_HOST", "mine_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HTTP_HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String HTTP_PATH = "app/v1/";

        private Companion() {
        }
    }

    @Nullable
    @uua("auth/get_thirdparty_auth_config")
    Object getAuthConfigList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetThirdPartyAuthConfigListResult>> continuation);

    @Nullable
    @uua("auth/lab/get_auth_config")
    Object getLabCollaborationAuthConfig(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetLabCollaborationAuthConfigResult>> continuation);

    @Nullable
    @uua("auth/miapp/get_scopes")
    Object getMiAppAuthScopeList(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<GetMiAppAuthScopeListResult>> continuation);

    @u0a
    @ngh("auth/get_third_party")
    @Nullable
    Object getThirdParty(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GetThirdPartyResult>> continuation);

    @u0a
    @ngh("auth/lab/grant")
    @Nullable
    Object grantLabAuth(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<GrantLabAuthResult>> continuation);

    @u0a
    @ngh("auth/lab/revoke")
    @Nullable
    Object revokeLabAuth(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<RevokeLabAuthResult>> continuation);

    @u0a
    @ngh("auth/third_party")
    @Nullable
    Object setThirdPartyAuth(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<SetThirdPartyAuthResult>> continuation);

    @u0a
    @ngh("auth/miapp/update_scopes")
    @Nullable
    Object updateMiAppAuthScopeList(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResult<UpdateMiAppAuthScopeListResult>> continuation);
}
