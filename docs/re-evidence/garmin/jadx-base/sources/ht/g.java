package ht;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lht/g;", "Lbl/a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements bl.a {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept", "okhttp3/OkHttpClient$Builder$addInterceptor$2"}, k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            chain.getClass();
            return chain.proceed(chain.request().newBuilder().header("X-app-ver", "5.30.1").header("X-Garmin-Paired-App-Version", "5.30.1").build());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // xc2.a
    public final ad2.a a() {
        return ad2.b.a(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h());
    }

    @Override // ed2.a
    public final OkHttpClient c() {
        bz0.o.f22274a.getClass();
        return bz0.o.b().newBuilder().addInterceptor(new a()).build();
    }
}
