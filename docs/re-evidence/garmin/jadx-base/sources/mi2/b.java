package mi2;

import c83.b0;
import com.google.gson.GsonBuilder;
import h83.k;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmi2/b;", "", "Lli2/d;", "networkConfiguration", "<init>", "(Lli2/d;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f118988b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f118989c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mi2.a f118990a;

    /* JADX WARN: Multi-variable type inference failed */
    private b(li2.d dVar) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient.Builder builderNewBuilder = dVar.f112915a.newBuilder();
        builderNewBuilder.interceptors().add(httpLoggingInterceptor);
        b0.b bVar = new b0.b();
        bVar.b(dVar.f112916b);
        bVar.d(builderNewBuilder.build());
        bVar.a(k.c());
        bVar.a(e83.a.d(new GsonBuilder().setLenient().create()));
        Object objB = bVar.c().b(mi2.a.class);
        objB.getClass();
        this.f118990a = (mi2.a) objB;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmi2/b$a;", "", "<init>", "()V", "Lmi2/b;", "INSTANCE", "Lmi2/b;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public final synchronized b a(li2.d dVar) {
            b bVar;
            dVar.getClass();
            bVar = b.f118989c;
            if (bVar == null) {
                bVar = new b(dVar, null);
                b.f118989c = bVar;
            }
            return bVar;
        }

        private a() {
        }
    }

    public /* synthetic */ b(li2.d dVar, j jVar) {
        this(dVar);
    }
}
