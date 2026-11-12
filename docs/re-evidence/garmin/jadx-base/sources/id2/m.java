package id2;

import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid2/m;", "Lid2/e;", "Lvc2/c;", "networkConnectivityMonitor", "<init>", "(Lvc2/c;)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vc2.c f93059b;

    public m(vc2.c cVar) {
        cVar.getClass();
        this.f93059b = cVar;
    }

    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        Response responseProceed = chain.proceed(chain.request());
        this.f93059b.a(responseProceed.code());
        return responseProceed;
    }
}
