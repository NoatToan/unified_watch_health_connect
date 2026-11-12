package ed2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import d53.w;
import e23.l;
import id2.f;
import id2.g;
import id2.h;
import id2.i;
import id2.m;
import id2.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import o13.t;
import o53.b0;
import okhttp3.Dns;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.internal.http2.Http2Connection;
import org.apache.commons.text.lookup.StringLookupFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import t13.d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001*Bç\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e\u0012 \b\u0002\u0010!\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001e\u0012 \b\u0002\u0010#\u001a\u001a\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060 \u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Led2/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "", "libName", "libVersion", "", "connectionTimeoutInMillis", "readTimeoutInMillis", "writeTimeoutInMillis", "", "generateAppInfoHeader", "generateUserAgentHeader", "generateGDPRHeader", "acceptMediaType", "Lvc2/c;", "networkConnectivityMonitor", "throwExceptionWhenNoNetworkAvailable", "Lkotlin/Function1;", "", "logger", "Lokhttp3/Dns;", StringLookupFactory.KEY_DNS, "userToken", "userSecret", "consumerKey", "consumerSecret", "Lkotlin/Function0;", "oAuth2TokenType", "Lt13/d;", "oAuth2AccessTokenAsync", "tokenType", "tokenCredentialsAsync", "", "Ljd2/a;", "logFields", "tokenAuthenticatorMaxRetryThreshold", "<init>", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;JJJZZZLjava/lang/String;Lvc2/c;ZLe23/l;Lokhttp3/Dns;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Le23/a;Le23/l;Le23/a;Le23/l;Ljava/util/Set;I)V", "a", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final a C = new a(null);
    public final HashSet<Interceptor> A;
    public final t B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f63887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f63888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f63889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f63890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f63891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f63892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f63893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public vc2.c f63894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f63895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l<? super String, Unit> f63896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Dns f63897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f63898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f63899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f63900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f63901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public e23.a<String> f63902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l<? super d<? super String>, ? extends Object> f63903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e23.a<String> f63904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public l<? super d<? super String>, ? extends Object> f63905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Set<? extends jd2.a> f63906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f63907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Context f63908y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final HashSet<Interceptor> f63909z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r20v2 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public /* synthetic */ c(Context context, int i14, String str, String str2, long j8, long j14, long j15, boolean z14, boolean z15, boolean z16, String str3, vc2.c cVar, boolean z17, l lVar, Dns dns, String str4, String str5, String str6, String str7, e23.a aVar, l lVar2, e23.a aVar2, l lVar3, Set set, int i15, int i16, j jVar) {
        int i17;
        Set set2;
        Dns aVar3;
        int i18 = (i16 & 2) != 0 ? -1 : i14;
        String str8 = (i16 & 4) != 0 ? null : str;
        String str9 = (i16 & 8) != 0 ? null : str2;
        long j16 = (i16 & 16) != 0 ? 30000L : j8;
        long j17 = (i16 & 32) != 0 ? 60000L : j14;
        long j18 = (i16 & 64) == 0 ? j15 : 60000L;
        boolean z18 = (i16 & 128) != 0 ? true : z14;
        boolean z19 = (i16 & 256) != 0 ? true : z15;
        boolean z24 = (i16 & 512) != 0 ? true : z16;
        String str10 = (i16 & 1024) != 0 ? "application/json" : str3;
        vc2.c cVar2 = (i16 & 2048) != 0 ? null : cVar;
        boolean z25 = (i16 & 4096) != 0 ? false : z17;
        int i19 = i18;
        l lVar4 = (i16 & 8192) != 0 ? null : lVar;
        if ((i16 & 16384) != 0) {
            i17 = 1;
            set2 = null;
            aVar3 = new gd2.a(0 == true ? 1 : 0, i17, 0 == true ? 1 : 0);
        } else {
            i17 = 1;
            set2 = null;
            aVar3 = dns;
        }
        this(context, i19, str8, str9, j16, j17, j18, z18, z19, z24, str10, cVar2, z25, lVar4, aVar3, (i16 & 32768) != 0 ? set2 : str4, (i16 & 65536) != 0 ? set2 : str5, (i16 & 131072) != 0 ? set2 : str6, (i16 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? set2 : str7, (i16 & 524288) != 0 ? set2 : aVar, (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? set2 : lVar2, (i16 & 2097152) != 0 ? set2 : aVar2, (i16 & 4194304) != 0 ? set2 : lVar3, (i16 & 8388608) == 0 ? set : set2, (i16 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? i17 : i15);
    }

    public static void b(c cVar, l lVar, e23.a aVar, l lVar2, int i14) {
        if ((i14 & 2) != 0) {
            aVar = new e51.c(12);
        }
        if ((i14 & 4) != 0) {
            lVar2 = null;
        }
        cVar.f63902s = aVar;
        cVar.f63903t = lVar;
        if (lVar2 != null) {
            cVar.f63904u = aVar;
            cVar.f63905v = lVar2;
        }
    }

    public final OkHttpClient a() {
        l<? super d<? super String>, ? extends Object> lVar;
        l<? super d<? super String>, ? extends Object> lVar2;
        String str;
        String str2;
        String str3;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        long j8 = this.f63887d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient.Builder builderWriteTimeout = builder.connectTimeout(j8, timeUnit).readTimeout(this.f63888e, timeUnit).writeTimeout(this.f63889f, timeUnit);
        boolean z14 = this.f63890g;
        t tVar = this.B;
        if (z14) {
            builderWriteTimeout.addInterceptor(new id2.b((String) tVar.getValue()));
        }
        if (this.f63891h) {
            Context context = this.f63908y;
            context.getClass();
            builderWriteTimeout.addInterceptor(new o(context, this.f63885b, this.f63886c));
        }
        if (this.f63892i) {
            builderWriteTimeout.addInterceptor(new id2.c((String) tVar.getValue()));
        }
        String str4 = this.f63893j;
        if (str4 != null) {
            builderWriteTimeout.addInterceptor(new id2.a(str4));
        }
        vc2.c cVar = this.f63894k;
        if (cVar != null) {
            builderWriteTimeout.addInterceptor(new m(cVar));
            if (this.f63895l) {
                builderWriteTimeout.addInterceptor(new g(cVar, null, 2, null));
            }
        }
        Iterator<Interceptor> it = this.f63909z.iterator();
        while (it.hasNext()) {
            builderWriteTimeout.addInterceptor(it.next());
        }
        Iterator<Interceptor> it3 = this.A.iterator();
        while (it3.hasNext()) {
            builderWriteTimeout.addNetworkInterceptor(it3.next());
        }
        String str5 = this.f63898o;
        if (str5 != null && !w.J(str5) && (str = this.f63899p) != null && !w.J(str) && (str2 = this.f63900q) != null && !w.J(str2) && (str3 = this.f63901r) != null && !w.J(str3)) {
            builderWriteTimeout.addInterceptor(new h(str5, str, str2, str3));
        }
        e23.a<String> aVar = this.f63902s;
        if (aVar != null && (lVar2 = this.f63903t) != null) {
            i.f93051e.getClass();
            builderWriteTimeout.addInterceptor(new i(aVar, lVar2, null));
        }
        e23.a<String> aVar2 = this.f63904u;
        if (aVar2 != null && (lVar = this.f63905v) != null) {
            fd2.a.f70497e.getClass();
            builderWriteTimeout.authenticator(new fd2.a(this.f63907x, aVar2, lVar));
        }
        l<? super String, Unit> lVar3 = this.f63896m;
        if (lVar3 != null) {
            hd2.b.f83444a.getClass();
            hd2.b.f83447d = lVar3;
            Set<? extends jd2.a> set = this.f63906w;
            if (set != null) {
                builderWriteTimeout.addInterceptor(new f(set, lVar3));
                if (set.contains(jd2.a.HTTP_EVENTS)) {
                    hd2.b.f83446c = true;
                }
            } else {
                builderWriteTimeout.addInterceptor(new f(lVar3));
            }
        }
        Dns dns = this.f63897n;
        if (dns != null) {
            builderWriteTimeout.dns(dns);
        }
        builderWriteTimeout.eventListenerFactory(hd2.b.f83444a);
        return builderWriteTimeout.build();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Led2/c$a;", "", "<init>", "()V", "", "BEARER_TOKEN_TYPE", "Ljava/lang/String;", "", "DEFAULT_401_RETRY_THRESHOLD", "I", "networking-okhttp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static String a(a aVar, b0 b0Var, l lVar) {
            aVar.getClass();
            b0Var.getClass();
            lVar.getClass();
            r0 r0Var = new r0();
            r0Var.f105810a = "";
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ge1.b.T(b0Var, null, null, new b(countDownLatch, r0Var, lVar, null), 3);
            countDownLatch.await(45L, TimeUnit.SECONDS);
            return (String) r0Var.f105810a;
        }

        private a() {
        }
    }

    public c(Context context, int i14, String str, String str2, long j8, long j14, long j15, boolean z14, boolean z15, boolean z16, String str3, vc2.c cVar, boolean z17, l<? super String, Unit> lVar, Dns dns, String str4, String str5, String str6, String str7, e23.a<String> aVar, l<? super d<? super String>, ? extends Object> lVar2, e23.a<String> aVar2, l<? super d<? super String>, ? extends Object> lVar3, Set<? extends jd2.a> set, int i15) {
        context.getClass();
        this.f63884a = i14;
        this.f63885b = str;
        this.f63886c = str2;
        this.f63887d = j8;
        this.f63888e = j14;
        this.f63889f = j15;
        this.f63890g = z14;
        this.f63891h = z15;
        this.f63892i = z16;
        this.f63893j = str3;
        this.f63894k = cVar;
        this.f63895l = z17;
        this.f63896m = lVar;
        this.f63897n = dns;
        this.f63898o = str4;
        this.f63899p = str5;
        this.f63900q = str6;
        this.f63901r = str7;
        this.f63902s = aVar;
        this.f63903t = lVar2;
        this.f63904u = aVar2;
        this.f63905v = lVar3;
        this.f63906w = set;
        this.f63907x = i15;
        this.f63908y = context.getApplicationContext();
        this.f63909z = new HashSet<>();
        this.A = new HashSet<>();
        this.B = o13.m.b(new e40.d(this, 2));
    }
}
