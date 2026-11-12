package ex2;

import android.content.Context;
import com.google.common.net.HttpHeaders;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept", "okhttp3/OkHttpClient$Builder$addInterceptor$2"}, k = 3, mv = {2, 2, 0}, xi = 48)
public final class d implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f66953a;

    public d(Context context) {
        this.f66953a = context;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        Request request = chain.request();
        cx2.i.f56681a.getClass();
        Context context = this.f66953a;
        context.getClass();
        tw2.b.f166803b.getClass();
        return chain.proceed(tw2.b.a.a(context) ? request.newBuilder().header(HttpHeaders.CACHE_CONTROL, "public, max-age=604800").build() : request.newBuilder().header(HttpHeaders.CACHE_CONTROL, "public, only-if-cached, max-stale=604800").build());
    }
}
