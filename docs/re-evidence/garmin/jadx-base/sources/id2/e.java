package id2;

import d53.w;
import java.util.Iterator;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lid2/e;", "Lokhttp3/Interceptor;", "<init>", "()V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f93040a;

    static {
        new a(null);
        f93040a = x.k("garmin", "gar.mn", "fit-pay.com", "inreach");
    }

    public abstract Response a(Interceptor.Chain chain);

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        String strHost = request.url().host();
        List<String> list = f93040a;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (w.z(strHost, (String) it.next(), false)) {
                    return a(chain);
                }
            }
        }
        return chain.proceed(request);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid2/e$a;", "", "<init>", "()V", "", "", "GARMIN_HOST_SUBSTRINGS", "Ljava/util/List;", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
