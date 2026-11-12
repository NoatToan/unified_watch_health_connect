package ra2;

import c83.b0;
import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lra2/h;", "", "<init>", "()V", "exportable-reports_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f151495a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wa2.b f151496b = new wa2.b("ReportsRetrofitBuilder", null, 2, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static g f151497c;

    private h() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b0 a() {
        f151496b.getClass();
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        pa2.b.f136781a.getClass();
        OkHttpClient.Builder builderNewBuilder = pa2.b.a.a().f136772d.newBuilder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builderNewBuilder.readTimeout(45L, timeUnit);
        builderNewBuilder.connectTimeout(45L, timeUnit);
        builderNewBuilder.interceptors().add(httpLoggingInterceptor);
        b0.b bVar = new b0.b();
        bVar.b(pa2.b.a.a().f136771c);
        bVar.d(builderNewBuilder.build());
        bVar.a(e83.a.d(new GsonBuilder().setLenient().create()));
        return bVar.c();
    }
}
