package cf2;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcf2/e;", "Lokhttp3/Interceptor;", "<init>", "()V", "promotionlibrary_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header("X-Garmin-Client-Platform", "ANDROID");
        ff2.c.f71140c.getClass();
        String str = ff2.c.f71141d;
        if (str == null) {
            p005kotlin.jvm.internal.s.m("appBuildVersion");
            throw null;
        }
        if (str.length() > 0) {
            String str2 = ff2.c.f71141d;
            if (str2 == null) {
                p005kotlin.jvm.internal.s.m("appBuildVersion");
                throw null;
            }
            builderNewBuilder.header("X-Garmin-Paired-App-Version", str2);
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
