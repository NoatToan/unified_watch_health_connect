package com.huawei.agconnect.common.server;

import android.text.TextUtils;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.common.api.Logger;
import com.huawei.agconnect.common.api.PackageUtils;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes3.dex */
public class ApiKeyInterceptor implements Interceptor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4868b = "ApiKeyInterceptor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AGConnectInstance f4869a;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        String installedAppSign256 = PackageUtils.getInstalledAppSign256(this.f4869a.getContext(), this.f4869a.getContext().getPackageName());
        String string = this.f4869a.getOptions().getString("/client/api_key");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(installedAppSign256)) {
            Logger.e(f4868b, "no apikey or fingerPrinter");
        }
        return chain.proceed(chain.request().newBuilder().addHeader("x-apik", string).addHeader("x-cert-fp", installedAppSign256).removeHeader("client_id").removeHeader("Authorization").build());
    }

    public ApiKeyInterceptor(AGConnectInstance aGConnectInstance) {
        this.f4869a = aGConnectInstance;
    }
}
