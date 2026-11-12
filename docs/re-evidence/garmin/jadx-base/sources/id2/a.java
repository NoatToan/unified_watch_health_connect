package id2;

import com.google.common.net.HttpHeaders;
import okhttp3.Interceptor;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lid2/a;", "Lokhttp3/Interceptor;", "", "mediaType", "<init>", "(Ljava/lang/String;)V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93035a;

    static {
        new C1776a(null);
    }

    public /* synthetic */ a(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "application/json" : str);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        return chain.proceed(chain.request().newBuilder().header(HttpHeaders.ACCEPT, this.f93035a).build());
    }

    /* JADX INFO: renamed from: id2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lid2/a$a;", "", "<init>", "()V", "", "JSON", "Ljava/lang/String;", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1776a {
        public /* synthetic */ C1776a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1776a() {
        }
    }

    public a(String str) {
        str.getClass();
        this.f93035a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
