package com.huawei.agconnect.common.server;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.BackendService;
import com.huawei.agconnect.common.api.BaseResponse;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.agconnect.https.adapter.JsonAdapterFactory;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hmf.tasks.Tasks;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Authenticator;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* JADX INFO: loaded from: classes3.dex */
final class AGCAuthenticator implements Authenticator {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4856c = "AGCAuthenticator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AGConnectInstance f4857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BackendService.Options f4858b;

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) throws IOException {
        boolean z;
        Logger.i(f4856c, "authenticate");
        BaseResponse baseResponse = (BaseResponse) new JsonAdapterFactory().responseBodyAdapter(BaseResponse.class).adapter(response.body());
        Request.Builder builderNewBuilder = response.request().newBuilder();
        if (baseResponse == null) {
            return null;
        }
        int code = baseResponse.getRet().getCode();
        if (code != 205524993 || this.f4858b.isClientTokenRefreshed()) {
            z = false;
        } else {
            this.f4858b.setClientTokenRefreshed(true);
            try {
                String tokenString = ((Token) Tasks.await(((CredentialsProvider) this.f4857a.getService(CredentialsProvider.class)).getTokens(true), 3L, TimeUnit.SECONDS)).getTokenString();
                builderNewBuilder.removeHeader("Authorization");
                builderNewBuilder.addHeader("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + tokenString);
                z = true;
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                throw new IOException(e.getMessage());
            }
        }
        if (code != 205524994 || this.f4858b.isAccessTokenRefreshed()) {
            if (!z) {
                return null;
            }
        } else {
            if (((AuthProvider) this.f4857a.getService(AuthProvider.class)) == null) {
                throw new IOException("Please intergrate agconnect-auth in project");
            }
            this.f4858b.setAccessTokenRefreshed(true);
            try {
                Token token = (Token) Tasks.await(((AuthProvider) this.f4857a.getService(AuthProvider.class)).getTokens(true), 3L, TimeUnit.SECONDS);
                builderNewBuilder.removeHeader(Constants.PARAM_ACCESS_TOKEN);
                builderNewBuilder.addHeader(Constants.PARAM_ACCESS_TOKEN, token.getTokenString());
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                throw new IOException(e2.getMessage());
            }
        }
        return builderNewBuilder.build();
    }

    public AGCAuthenticator(BackendService.Options options) {
        this.f4857a = options.getApp();
        this.f4858b = options;
    }
}
