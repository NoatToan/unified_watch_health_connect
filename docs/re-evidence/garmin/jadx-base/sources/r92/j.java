package r92;

import c83.b0;
import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lr92/j;", "", "<init>", "()V", "a", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f151451a = new a(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr92/j$a;", "", "<init>", "()V", "garmin-consent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Object a(Class cls, String str, OkHttpClient okHttpClient) {
            b0.b bVar = new b0.b();
            bVar.a(k.f151452a);
            bVar.a(h83.k.c());
            bVar.a(e83.a.d(new Gson()));
            bVar.d(okHttpClient);
            bVar.b(str);
            return bVar.c().b(cls);
        }

        private a() {
        }
    }
}
