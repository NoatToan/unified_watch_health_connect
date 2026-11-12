package com.xiaomi.fitness.rn.share.request;

import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import com.xiaomi.fitness.rn.share.bean.UserBean;
import com.xiaomi.fitness.rn.share.bean.UserListBean;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \n2\u00020\u0001:\u0001\nJ \u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/rn/share/request/AccountProfileHttpService;", "", "userProfile", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/rn/share/bean/UserBean;", "data", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userProfiles", "Lcom/xiaomi/fitness/rn/share/bean/UserListBean;", "Companion", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AccountProfileHttpService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/rn/share/request/AccountProfileHttpService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "share_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
    @uua("home/profile")
    Object userProfile(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<UserBean>> continuation);

    @Nullable
    @uua("home/profiles")
    Object userProfiles(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<UserListBean>> continuation);
}
