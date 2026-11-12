package com.huawei.agconnect.common.server;

import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.core.service.auth.AuthProvider;
import com.huawei.agconnect.core.service.auth.Token;
import com.huawei.hmf.tasks.Tasks;
import com.tencent.connect.common.Constants;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
final class AccessTokenInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AGConnectInstance f4865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4867c;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request requestBuild;
        if (((AuthProvider) this.f4865a.getService(AuthProvider.class)) == null) {
            if (this.f4866b) {
                throw new IOException("Please intergrate agconnect-auth in project");
            }
            return chain.proceed(chain.request());
        }
        try {
            Token token = (Token) Tasks.await(((AuthProvider) this.f4865a.getService(AuthProvider.class)).getTokens(), 5L, TimeUnit.SECONDS);
            if (token != null) {
                Request request = chain.request();
                requestBuild = (this.f4867c ? request.newBuilder().addHeader(Constants.PARAM_ACCESS_TOKEN, token.getTokenString()).addHeader("accessToken", token.getTokenString()) : request.newBuilder().addHeader(Constants.PARAM_ACCESS_TOKEN, token.getTokenString())).build();
            } else {
                if (this.f4866b) {
                    throw new IOException("no user is signed");
                }
                requestBuild = chain.request();
            }
            return chain.proceed(requestBuild);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            throw new IOException(e.getMessage());
        }
    }

    public AccessTokenInterceptor(AGConnectInstance aGConnectInstance, boolean z, boolean z2) {
        this.f4865a = aGConnectInstance;
        this.f4866b = z;
        this.f4867c = z2;
    }
}
