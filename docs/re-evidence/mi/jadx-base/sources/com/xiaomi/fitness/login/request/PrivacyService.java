package com.xiaomi.fitness.login.request;

import com.xiaomi.fitness.login.bean.PrivacyModel;
import com.xiaomi.fitness.net.response.BaseResponse;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.xfi;
import defpackage.zk9;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \r2\u00020\u0001:\u0001\rJ,\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/login/request/PrivacyService;", "", "checkPrivacyUpdate", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/login/bean/PrivacyModel$ChangeResult;", "Lcom/xiaomi/fitness/login/bean/PrivacyModel;", "data", "", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportAgreePrivacy", "Lcom/xiaomi/fitness/net/response/BaseResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PrivacyService {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    public static final String HOST = "https://hlth.io.mi.com/";

    @NotNull
    public static final String PATH = "healthapp/";

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/login/request/PrivacyService$Companion;", "", "<init>", "()V", "HOST", "", "PATH", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String HOST = "https://hlth.io.mi.com/";

        @NotNull
        public static final String PATH = "healthapp/";

        private Companion() {
        }
    }

    @u0a
    @ngh("privacy/get_privacy_change")
    @Nullable
    Object checkPrivacyUpdate(@NotNull @zk9("data") String str, @NotNull @xfi(encoded = true, value = "locale") String str2, @NotNull Continuation<? super BaseResult<PrivacyModel.ChangeResult>> continuation);

    @u0a
    @ngh("device/set_privacy_confirmation")
    @Nullable
    Object reportAgreePrivacy(@NotNull @zk9("data") String str, @NotNull Continuation<? super BaseResponse> continuation);
}
