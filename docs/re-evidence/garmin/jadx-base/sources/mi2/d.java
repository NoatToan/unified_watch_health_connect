package mi2;

import c83.b0;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmi2/d;", "", "Lli2/d;", "networkConfiguration", "<init>", "(Lli2/d;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f118991b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile d f118992c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f118993a;

    /* JADX WARN: Multi-variable type inference failed */
    private d(li2.d dVar) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, 0 == true ? 1 : 0);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.NONE);
        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient().newBuilder().addInterceptor(httpLoggingInterceptor);
        b0.b bVar = new b0.b();
        bVar.b(dVar.f112917c);
        bVar.d(builderAddInterceptor.build());
        bVar.a(e83.a.c());
        Object objB = bVar.c().b(c.class);
        objB.getClass();
        this.f118993a = (c) objB;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmi2/d$a;", "", "<init>", "()V", "Lmi2/d;", "INSTANCE", "Lmi2/d;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ d(li2.d dVar, j jVar) {
        this(dVar);
    }
}
