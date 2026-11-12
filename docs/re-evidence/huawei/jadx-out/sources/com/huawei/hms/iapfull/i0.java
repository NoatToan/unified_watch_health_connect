package com.huawei.hms.iapfull;

import com.huawei.hms.framework.network.restclient.hwhttp.Interceptor;
import com.huawei.hms.framework.network.restclient.hwhttp.Request;
import com.huawei.hms.framework.network.restclient.hwhttp.Response;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public abstract class i0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f13682a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f13683b = 0;

    abstract boolean a(String str);

    @Override // com.huawei.hms.framework.network.restclient.hwhttp.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request();
        Response responseProceed = null;
        byte[] bArrBytes = null;
        do {
            try {
                if (this.f13683b != 0) {
                    Thread.sleep(300L);
                }
                this.f13683b++;
                responseProceed = chain.proceed(request);
                bArrBytes = responseProceed.getBody().bytes();
                if (!a(new String(bArrBytes, Charset.forName("UTF-8")))) {
                    return com.huawei.hms.iapfull.network.f.a(responseProceed, bArrBytes);
                }
            } catch (InterruptedException unused) {
                y0.b("AutoRetryInterceptor", "reQueryResult occur InterruptedException");
            }
        } while (this.f13683b < this.f13682a);
        this.f13683b = 0;
        if (responseProceed == null || bArrBytes == null) {
            throw new IOException("Canceled");
        }
        return com.huawei.hms.iapfull.network.f.a(responseProceed, bArrBytes);
    }
}
