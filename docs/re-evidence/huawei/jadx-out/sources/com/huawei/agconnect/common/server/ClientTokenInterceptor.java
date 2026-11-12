package com.huawei.agconnect.common.server;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.service.auth.CredentialsProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.hmf.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
final class ClientTokenInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4910b = "ClientTokenInterceptor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AGConnectInstance f4911a;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        try {
            Token token = (Token) Tasks.await(((CredentialsProvider) this.f4911a.getService(CredentialsProvider.class)).getTokens(), 5L, TimeUnit.SECONDS);
            return chain.proceed(chain.request().newBuilder().addHeader("Authorization", HealthEngineRequestManager.PREFIX_ACCESS_TOKEN + token.getTokenString()).build());
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException(e.getMessage());
        }
    }

    public ClientTokenInterceptor(AGConnectInstance aGConnectInstance) {
        this.f4911a = aGConnectInstance;
    }
}
