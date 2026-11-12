package dz0;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz0/f;", "Lokhttp3/Interceptor;", "Ldz0/e;", "responseCodeHandler", "<init>", "(Ldz0/e;)V", "gcm-network_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f61664a;

    public f(e eVar) {
        eVar.getClass();
        this.f61664a = eVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        Response responseProceed = chain.proceed(request);
        this.f61664a.a(responseProceed.code(), request.url().getUrl());
        return responseProceed;
    }
}
