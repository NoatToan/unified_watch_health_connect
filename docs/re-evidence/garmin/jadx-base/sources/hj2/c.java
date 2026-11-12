package hj2;

import com.google.common.net.HttpHeaders;
import lc.u0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lhj2/c;", "Lokhttp3/Interceptor;", "", "userItToken", "Lhj2/c$a;", "interceptorType", "<init>", "(Ljava/lang/String;Lhj2/c$a;)V", "a", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f84017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ij2.a f84018c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhj2/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "customer-management_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        HEADER,
        NO_HEADER
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84022a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.NO_HEADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84022a = iArr;
        }
    }

    public c(String str, a aVar) {
        aVar.getClass();
        this.f84016a = str;
        this.f84017b = aVar;
        this.f84018c = (ij2.a) KoinJavaComponent.get$default(ij2.a.class, null, null, 6, null);
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        int i14 = b.f84022a[this.f84017b.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return chain.proceed(chain.request().newBuilder().build());
            }
            u0.r();
            return null;
        }
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        builderNewBuilder.header(HttpHeaders.AUTHORIZATION, "Bearer " + this.f84016a);
        builderNewBuilder.header(com.mapbox.common.HttpHeaders.ACCEPT, "application/json");
        this.f84018c.getClass();
        builderNewBuilder.header("X-garmin-client-id", "GarminConnectMobileAndroid");
        return chain.proceed(builderNewBuilder.build());
    }

    public /* synthetic */ c(String str, a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, aVar);
    }
}
