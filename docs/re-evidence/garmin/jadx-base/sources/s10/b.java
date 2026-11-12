package s10;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import bz0.o;
import com.garmin.android.apps.connectmobile.FlipperInitializer;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.connectiq.requests.oauth.ConnectIQOAuthActivity;
import com.garmin.android.apps.connectmobile.persistence.GCMUserPersistenceDatabase;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.device.ciq.http.requests.oauth.ConnectIQOAuthRequest;
import d53.u;
import e23.p;
import g22.m;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import okhttp3.OkHttpClient;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import r0.h;
import sc2.l;
import t13.d;
import v13.e;
import v13.i;
import w10.f;
import zy0.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ls10/b;", "Lsj2/a;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements sj2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f155861c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Logger f155862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<String> f155863e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f155864a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OkHttpClient f155865b;

    /* JADX INFO: renamed from: s10.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.connectiq.requests.CIQHTTPDelegate$onOpenWebPageRequest$1", f = "CIQHTTPDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C2948b extends i implements p<b0, d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xj2.a f155866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f155867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f155868c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2948b(xj2.a aVar, b bVar, Context context, d<? super C2948b> dVar) {
            super(2, dVar);
            this.f155866a = aVar;
            this.f155867b = bVar;
            this.f155868c = context;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new C2948b(this.f155866a, this.f155867b, this.f155868c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C2948b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            w10.c cVar = new w10.c(this.f155866a);
            ((GCMUserPersistenceDatabase) KoinJavaComponent.get$default(GCMUserPersistenceDatabase.class, null, null, 6, null)).g().b(cVar);
            this.f155867b.f155864a.post(new f(this.f155868c, cVar));
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f155862d = gt2.b.f79005a.h("CIQHTTPDelegate");
        f155863e = x.k("com.android.chrome", "com.microsoft.emmx", "org.mozilla.firefox", "com.sec.android.app.sbrowser");
    }

    public static final Intent h(Context context, ConnectIQOAuthRequest connectIQOAuthRequest) {
        f155861c.getClass();
        connectIQOAuthRequest.getClass();
        Intent intent = new Intent(context, (Class<?>) ConnectIQOAuthActivity.class);
        intent.putExtra("extra_oauth_request", connectIQOAuthRequest);
        intent.setFlags(872415232);
        intent.setAction("actionstring" + connectIQOAuthRequest.getDateReceived());
        return intent;
    }

    public static String i(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -2102012002) {
            return !str.equals("4e780e2c-26d5-4339-a75a-1b113e5524d7") ? "" : "https://connect.garmin.com/mobile-link/gcm/ciqApp/oauth";
        }
        if (iHashCode != -1065281353) {
            return (iHashCode == 138135113 && str.equals("6eb48a8f-9bd8-4fe0-99e7-28d787c8a711")) ? "gcm://spotify-signin" : "";
        }
        return !str.equals("84ab1994-b958-4258-9dda-112fb92271e8") ? "" : "gcm://oauth";
    }

    @Override // sj2.a
    public final zi2.a a() {
        return GCMSettingManager.k().f77335a;
    }

    @Override // sj2.a
    public final OkHttpClient b() {
        o.f22274a.getClass();
        return o.e();
    }

    @Override // sj2.a
    public final synchronized OkHttpClient c() {
        o.f22274a.getClass();
        return o.j();
    }

    @Override // sj2.a
    public final synchronized OkHttpClient d() {
        OkHttpClient okHttpClient;
        try {
            if (this.f155865b == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                m.a(builder);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderFollowSslRedirects = builder.connectTimeout(30L, timeUnit).writeTimeout(60L, timeUnit).readTimeout(60L, timeUnit).followRedirects(true).followSslRedirects(true);
                GarminConnectMobileApp.f28685g.getClass();
                OkHttpClient.Builder builderAddInterceptor = builderFollowSslRedirects.addInterceptor(new id2.o(GarminConnectMobileApp.a.a(), null, null)).addInterceptor(new j()).addInterceptor(new zy0.i(11657));
                FlipperInitializer.f28657a.getClass();
                OkHttpClient okHttpClientBuild = builderAddInterceptor.build();
                kg1.a.f104701a.getClass();
                if (kg1.a.C2003a.a().m()) {
                    jd2.b.b(okHttpClientBuild, jd2.a.HTTP_EVENTS);
                } else {
                    jd2.b.a(okHttpClientBuild, jd2.a.HTTP_EVENTS);
                }
                this.f155865b = okHttpClientBuild;
            }
            okHttpClient = this.f155865b;
            okHttpClient.getClass();
        } catch (Throwable th3) {
            throw th3;
        }
        return okHttpClient;
    }

    @Override // sj2.a
    public final void e(Context context, xj2.a aVar) {
        context.getClass();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new C2948b(aVar, this, context, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (r0.equals(org.apache.commons.lang3.BooleanUtils.TRUE) != false) goto L26;
     */
    @Override // sj2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Context context, ConnectIQOAuthRequest connectIQOAuthRequest) {
        context.getClass();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(connectIQOAuthRequest.getAppId());
        String string = new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString();
        string.getClass();
        String url = connectIQOAuthRequest.getUrl();
        url.getClass();
        int iHashCode = string.hashCode();
        Handler handler = this.f155864a;
        if (iHashCode != -2102012002) {
            if (iHashCode != -1065281353) {
                handler.post(new h(this, context, connectIQOAuthRequest));
                return;
            } else {
                handler.post(new h(this, context, connectIQOAuthRequest));
                return;
            }
        }
        if (string.equals("4e780e2c-26d5-4339-a75a-1b113e5524d7")) {
            Uri uri = Uri.parse(url);
            String queryParameter = uri.getQueryParameter("redirect_uri");
            String queryParameter2 = uri.getQueryParameter("secureOAuth");
            if (queryParameter != null) {
                if (queryParameter2 != null) {
                    if (u.p(queryParameter, "mobile-link/gcm/ciqApp/oauth", false)) {
                    }
                }
            }
        }
        handler.post(new u10.m(context, connectIQOAuthRequest));
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        n10.a aVar = new n10.a(connectIQOAuthRequest);
        c2513a.getClass();
        l73.c.b().e(aVar);
    }

    @Override // sj2.a
    public final String g() {
        String str;
        l lVarA = ((pu.a) KoinJavaComponent.get$default(pu.a.class, null, null, 6, null)).b().a(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h());
        return (lVarA == null || (str = lVarA.f158524a) == null) ? "" : str;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls10/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "SPOTIFY_CIQ_APP_ID", "Ljava/lang/String;", "AWA_CIQ_APP_ID", "TODO_CIQ_APP_ID", "REDIRECT_URI", "OAUTH_PATH", "SECURE_OAUTH", "OAUTH_RESULT_URL_FOR_SPOTIFY", "OAUTH_RESULT_URL_FOR_AWA", "OAUTH_RESULT_URL_FOR_TODO", "", "preferredBrowserPackages", "Ljava/util/List;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
