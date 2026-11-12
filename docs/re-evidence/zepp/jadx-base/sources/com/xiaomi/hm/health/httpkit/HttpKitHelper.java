package com.xiaomi.hm.health.httpkit;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.datatheorem.android.trustkit.pinning.OkHttp3Helper;
import com.huami.http.GsonConverter;
import com.huami.http.HttpBuildScope;
import com.huami.http.HttpKitKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.webapi.ServerFaultHelper;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/HttpKitHelper;", "", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HttpKitHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long a = 60;

    @NotNull
    private static final String b = "HTTP_KIT";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/httpkit/HttpKitHelper$Companion;", "", "Lokhttp3/OkHttpClient;", "a", "", "initHttp", "", "TAG", "Ljava/lang/String;", "", "TIME_OUT", "J", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/http/HttpBuildScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<HttpBuildScope, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.httpkit.HttpKitHelper$Companion$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/OkHttpClient;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0972a extends Lambda implements Function0<OkHttpClient> {
                public static final C0972a a = new C0972a();

                public C0972a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final OkHttpClient invoke() {
                    return HttpKitHelper.INSTANCE.a();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/http/ResponseBodyConverter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<ResponseBodyConverter> {
                public static final b a = new b();

                public b() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ResponseBodyConverter invoke() {
                    return GsonConverter.Companion.create$default(GsonConverter.INSTANCE, null, 1, null);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "", "json", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Response, String, Boolean> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                public final boolean a(@NotNull Response response, @NotNull String str) {
                    ServerFaultHelper.handleApiStatus(response);
                    return TokenHandler.INSTANCE.needCancelBeforeResponse(response, str);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Boolean invoke(Response response, String str) {
                    return Boolean.valueOf(a(response, str));
                }
            }

            public a() {
                super(1);
            }

            public final void a(@NotNull HttpBuildScope httpBuildScope) {
                httpBuildScope.okHttpClient(C0972a.a);
                HttpBuildScope.baseUrl$default(httpBuildScope, HMServerDef.getHost(), false, 2, null);
                httpBuildScope.converter(b.a);
                httpBuildScope.handleToken(c.a);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(HttpBuildScope httpBuildScope) {
                a(httpBuildScope);
                return Unit.INSTANCE;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OkHttpClient a() {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            OkHttpClient.Builder timeout = builder.connectTimeout(60L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit);
            timeout.sslSocketFactory(OkHttp3Helper.getSSLSocketFactory(), OkHttp3Helper.getTrustManager()).addInterceptor(OkHttp3Helper.getPinningInterceptor());
            Iterator<T> it2 = RequestConfigKt.getOkHttpInterceptors().iterator();
            while (it2.hasNext()) {
                timeout.addInterceptor((Interceptor) it2.next());
            }
            Iterator<T> it3 = RequestConfigKt.getGlobalOkHttpNetworkInterceptors(HttpKitHelper.b).iterator();
            while (it3.hasNext()) {
                timeout.addNetworkInterceptor((Interceptor) it3.next());
            }
            timeout.addNetworkInterceptor(new LogcatInterceptor(new LogcatInterceptor.Logger() { // from class: com.xiaomi.hm.health.httpkit.HttpKitHelper$Companion$createOkHttpClient$logcat$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ String a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(String str) {
                        super(0);
                        this.a = str;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    public final String invoke() {
                        return this.a;
                    }
                }

                @Override // com.xiaomi.hm.health.httpkit.LogcatInterceptor.Logger
                public void log(@NotNull String message) {
                    HMLog.info("HTTP_KIT", new a(message));
                }
            }));
            return timeout.build();
        }

        @JvmStatic
        public final void initHttp() {
            HttpKitKt.setupHttpKit(a.a);
        }
    }

    @JvmStatic
    public static final void initHttp() {
        INSTANCE.initHttp();
    }
}
