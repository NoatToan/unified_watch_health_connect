package com.xiaomi.fitness.aivs.request;

import com.xiaomi.fitness.aivs.request.model.UserCredentialScopeResp;
import com.xiaomi.fitness.aivs.request.model.UserCredentialsIssuedTokenResp;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.dl9;
import defpackage.ngh;
import defpackage.u0a;
import defpackage.uua;
import defpackage.yfi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@BaseUrl(host = "https://account.xiaomi.com/", path = "oauth2/")
@Secret(encryptResponse = false, pathPrefix = "oauth2/", sid = "oauth2.0")
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ)\u0010\u0002\u001a\u00020\u00032\u0019\b\u0001\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00070\u0005H§@¢\u0006\u0002\u0010\bJ)\u0010\t\u001a\u00020\n2\u0019\b\u0001\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00070\u0005H§@¢\u0006\u0002\u0010\bJ)\u0010\u000b\u001a\u00020\n2\u0019\b\u0001\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00070\u0005H§@¢\u0006\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/AivsApiService;", "", "userCredentialScope", "Lcom/xiaomi/fitness/aivs/request/model/UserCredentialScopeResp;", "map", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userCredentialsIssuedToken", "Lcom/xiaomi/fitness/aivs/request/model/UserCredentialsIssuedTokenResp;", "refreshUserCredentialsToken", "Companion", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AivsApiService {

    @NotNull
    public static final String AIVSHOST = "https://account.xiaomi.com/";

    @NotNull
    public static final String AIVSPATH = "oauth2/";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/AivsApiService$Companion;", "", "<init>", "()V", "AIVSHOST", "", "AIVSPATH", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        public static final String AIVSHOST = "https://account.xiaomi.com/";

        @NotNull
        public static final String AIVSPATH = "oauth2/";

        private Companion() {
        }
    }

    @u0a
    @ngh("refresh/token")
    @Nullable
    Object refreshUserCredentialsToken(@dl9 @NotNull Map<String, Object> map, @NotNull Continuation<? super UserCredentialsIssuedTokenResp> continuation);

    @Nullable
    @uua("user-credentials/scopes")
    Object userCredentialScope(@yfi @NotNull Map<String, Object> map, @NotNull Continuation<? super UserCredentialScopeResp> continuation);

    @u0a
    @ngh("user-credentials/issued-token")
    @Nullable
    Object userCredentialsIssuedToken(@dl9 @NotNull Map<String, Object> map, @NotNull Continuation<? super UserCredentialsIssuedTokenResp> continuation);
}
