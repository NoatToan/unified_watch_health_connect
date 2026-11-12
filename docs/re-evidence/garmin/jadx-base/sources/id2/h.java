package id2;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lid2/h;", "Lid2/e;", "", "userToken", "userSecret", "consumerKey", "consumerSecret", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ldd2/c;", "credential", "(Ldd2/c;)V", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f93050b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(dd2.c cVar) {
        this(cVar.f59212a, cVar.f59213b, cVar.f59214c, cVar.f59215d);
        cVar.getClass();
    }

    @Override // id2.e
    public final Response a(Interceptor.Chain chain) {
        l lVar;
        k kVar = this.f93050b;
        Request request = chain.request();
        synchronized (kVar) {
            try {
                if (request == null) {
                    throw new IllegalArgumentException("okhttp3.Request is expected.");
                }
                lVar = new l(request);
                kVar.d(lVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Request request2 = lVar.f93058a;
        request2.getClass();
        return chain.proceed(request2);
    }

    public h(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.f93050b = new k(str, str2, str3, str4);
    }
}
