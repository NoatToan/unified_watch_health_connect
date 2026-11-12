package p10;

import c83.a0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.net.HttpHeaders;
import i83.f;
import i83.o;
import java.util.List;
import o13.m;
import o13.t;
import o53.i0;
import okhttp3.Interceptor;
import okhttp3.Response;
import ov1.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lp10/a;", "", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f134883c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f134884a = m.b(new oe0.e(24));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f134885b = m.b(new u(this, 5));

    /* JADX INFO: renamed from: p10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JI\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\t0\b0\u00072\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\b0\u00072\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\b\b\u0001\u0010\u0013\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lp10/a$a;", "", "", "unitId", "locale", "sku", "appType", "Lo53/i0;", "Lc83/a0;", "", "Lo10/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lo53/i0;", "Lq10/a;", "appInstallsRequest", "Lq10/b;", "d", "(Lq10/a;)Lo53/i0;", "", TtmlNode.TAG_BODY, "Lo10/a;", "b", "([Ljava/lang/String;)Lo53/i0;", "Lq10/d;", "c", "(Lq10/d;)Lo53/i0;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface InterfaceC2560a {
        @f("apps/downloads")
        i0<a0<List<o10.b>>> a(@i83.t("unitId") String unitId, @i83.t("locale") String locale, @i83.t("sku") String sku, @i83.t("appType") String appType);

        @o("apps/appIconUrl")
        i0<a0<List<o10.a>>> b(@i83.a String[] body);

        @o("apps/updates")
        i0<a0<List<o10.b>>> c(@i83.a q10.d body);

        @o("apps/installApps")
        i0<a0<List<q10.b>>> d(@i83.a q10.a appInstallsRequest);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "intercept", "okhttp3/OkHttpClient$Builder$addInterceptor$2"}, k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements Interceptor {
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            chain.getClass();
            return chain.proceed(chain.request().newBuilder().addHeader(HttpHeaders.ACCEPT, "application/json").addHeader(HttpHeaders.CONTENT_TYPE, "application/json").addHeader("X-garmin-client-id", "CONNECT_MOBILE").build());
        }
    }

    public final InterfaceC2560a a() {
        Object value = this.f134885b.getValue();
        value.getClass();
        return (InterfaceC2560a) value;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp10/a$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
