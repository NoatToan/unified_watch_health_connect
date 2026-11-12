package bz0;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "it", "Lokhttp3/Interceptor$Chain;", "intercept", "okhttp3/Interceptor$Companion$invoke$1"}, k = 3, mv = {2, 3, 0}, xi = 48)
public final class d implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        o.f22274a.getClass();
        o.h().getClass();
        return chain.proceed(builderNewBuilder.header("X-garmin-client-id", "GarminConnectMobileAndroid").build());
    }
}
