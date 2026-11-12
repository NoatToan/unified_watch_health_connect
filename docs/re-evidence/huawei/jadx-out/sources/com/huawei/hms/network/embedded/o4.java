package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;

/* JADX INFO: loaded from: classes34.dex */
public class o4 extends Interceptor {
    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
        Response<ResponseBody> responseProceed;
        h1.d dVar = (h1.d) chain.request();
        z2 rCEventListener = ((h1.b) chain).getRCEventListener();
        rCEventListener.cpNetworkInterceptorReqEnd();
        if (dVar.getNetConfig().enableInnerConnectEmptyBody()) {
            responseProceed = chain.proceed(chain.request());
        } else {
            p4.f().d();
            try {
                responseProceed = chain.proceed(chain.request());
                p4.f().c(true);
            } catch (Throwable th) {
                p4.f().c(false);
                p4.f().a(chain);
                throw th;
            }
        }
        p4.f().a(chain);
        rCEventListener.cpNetworkInterceptorResStart();
        return responseProceed;
    }
}
