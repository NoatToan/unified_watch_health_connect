package com.xiaomi.fitness.account.api;

import com.xiaomi.fitness.account.user.UserInfoProfile;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H§@¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH§@¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H§@¢\u0006\u0002\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/account/api/AccountService;", "", "getUserProfile", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/account/user/UserInfoProfile;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserProfile", "", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeUserProfile", "Companion", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccountService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/account/api/AccountService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "account_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "healthapp/";

        private Companion() {
        }
    }

    @Nullable
    @uua("user/get_miot_user_profile")
    Object getUserProfile(@NotNull Continuation<? super BaseResult<UserInfoProfile>> continuation);

    @Nullable
    @uua("user/remove_miot_user_profile")
    Object removeUserProfile(@NotNull Continuation<? super BaseResult<Boolean>> continuation);

    @u0a
    @ngh("user/set_miot_user_profile")
    @Nullable
    Object updateUserProfile(@NotNull @zk9(encoded = true, value = "data") String str, @NotNull Continuation<? super BaseResult<Boolean>> continuation);
}
