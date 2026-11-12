package com.garmin.ephemeris;

import android.content.Context;
import c83.b0;
import c83.d;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ds.e0;
import e23.l;
import gt2.b;
import gt2.c;
import i83.f;
import i83.j;
import i83.t;
import id2.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import o13.r;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001/B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012JQ\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ[\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00182\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/garmin/ephemeris/GcsEphemerisApi;", "", "<init>", "()V", "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "fwVersion", "productNumber", "unitId", "", "createHeaders", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "Landroid/content/Context;", "ctx", "Lokhttp3/OkHttpClient;", "client", "", "setOkHttpClient", "(Landroid/content/Context;Lokhttp3/OkHttpClient;)V", "baseUrl", "accessToken", "", "segmentCount", "headers", "Lc83/d;", "", "Lcom/garmin/ephemeris/MtkData;", "getMtk", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/util/Map;)Lc83/d;", "modelId", "username", "password", "", "getRxNetworks", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lc83/d;", "addTokenAuth", "(Landroid/content/Context;Ljava/lang/String;)Lokhttp3/OkHttpClient;", "", "HTTP_READ_TIMEOUT_SECONDS", "J", "LIB_NAME", "Ljava/lang/String;", "httpClient", "Lokhttp3/OkHttpClient;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "Api", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GcsEphemerisApi {
    private static final long HTTP_READ_TIMEOUT_SECONDS = 30;
    public static final GcsEphemerisApi INSTANCE = new GcsEphemerisApi();
    public static final String LIB_NAME = "ephemeris";
    private static OkHttpClient httpClient;
    private static final Logger logger;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J;\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\n\u0010\u000bJI\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\r\u001a\u00020\u00032\b\b\u0001\u0010\u000e\u001a\u00020\u0003H'¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/garmin/ephemeris/GcsEphemerisApi$Api;", "", "", "", "headers", "", "segmentCount", "Lc83/d;", "", "Lcom/garmin/ephemeris/MtkData;", "getMtk", "(Ljava/util/Map;I)Lc83/d;", "modelId", "username", "password", "", "getRxNetworks", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lc83/d;", "ephemeris_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Api {
        @f("ephemeris/cpe/mtk/segments")
        d<List<MtkData>> getMtk(@j Map<String, String> headers, @t("segments") int segmentCount);

        @f("ephemeris/cpe/rxnetworks?cId=101243&mask=1073741824&seedType=7&mode=1&version=1")
        d<byte[]> getRxNetworks(@j Map<String, String> headers, @t("mID") String modelId, @t("un") String username, @t("pw") String password);
    }

    /* JADX INFO: renamed from: com.garmin.ephemeris.GcsEphemerisApi$addTokenAuth$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.garmin.ephemeris.GcsEphemerisApi$addTokenAuth$1", f = "GcsEphemerisApi.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements l<t13.d<? super String>, Object> {
        final /* synthetic */ String $accessToken;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, t13.d<? super AnonymousClass1> dVar) {
            super(1, dVar);
            this.$accessToken = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new AnonymousClass1(this.$accessToken, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super String> dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                r.b(obj);
                return this.$accessToken;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    static {
        int i14 = c.f79010a;
        logger = b.f79005a.i("EphemerisDataHandler");
    }

    private GcsEphemerisApi() {
    }

    private final OkHttpClient addTokenAuth(Context ctx, String accessToken) {
        if (httpClient == null) {
            setOkHttpClient(ctx, new OkHttpClient.Builder().readTimeout(HTTP_READ_TIMEOUT_SECONDS, TimeUnit.SECONDS).build());
        }
        OkHttpClient okHttpClient = httpClient;
        okHttpClient.getClass();
        OkHttpClient.Builder builderNewBuilder = okHttpClient.newBuilder();
        id2.i.a aVar = id2.i.f93051e;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(accessToken, null);
        i31.e eVar = new i31.e(21);
        aVar.getClass();
        return builderNewBuilder.addInterceptor(new id2.i(eVar, anonymousClass1, null)).build();
    }

    public static final Map<String, String> createHeaders(String appVersion, String fwVersion, String productNumber, String unitId) {
        appVersion.getClass();
        fwVersion.getClass();
        productNumber.getClass();
        unitId.getClass();
        HashMap map = new HashMap(4);
        map.put("X-Garmin-Paired-App-Version", appVersion);
        map.put("X-Garmin-Firmware-Version", fwVersion);
        map.put("X-Garmin-SW-Part-Number", "006-B" + productNumber + "-00");
        map.put("X-Garmin-Unit-Id", unitId);
        return map;
    }

    public static final d<List<MtkData>> getMtk(Context ctx, String baseUrl, String accessToken, int segmentCount, Map<String, String> headers) {
        ctx.getClass();
        baseUrl.getClass();
        accessToken.getClass();
        headers.getClass();
        b0.b bVar = new b0.b();
        bVar.b(baseUrl);
        bVar.d(INSTANCE.addTokenAuth(ctx, accessToken));
        bVar.a(e83.a.c());
        return ((Api) bVar.c().b(Api.class)).getMtk(headers, segmentCount);
    }

    public static /* synthetic */ d getMtk$default(Context context, String str, String str2, int i14, Map map, int i15, Object obj) {
        if ((i15 & 16) != 0) {
            map = Collections.EMPTY_MAP;
            map.getClass();
        }
        return getMtk(context, str, str2, i14, map);
    }

    public static final d<byte[]> getRxNetworks(Context ctx, String baseUrl, String accessToken, String modelId, String username, String password, Map<String, String> headers) {
        ctx.getClass();
        baseUrl.getClass();
        accessToken.getClass();
        modelId.getClass();
        username.getClass();
        password.getClass();
        headers.getClass();
        b0.b bVar = new b0.b();
        bVar.b(baseUrl);
        bVar.d(INSTANCE.addTokenAuth(ctx, accessToken));
        bVar.a(new bu2.a.C0299a());
        return ((Api) bVar.c().b(Api.class)).getRxNetworks(headers, modelId, username, password);
    }

    public static /* synthetic */ d getRxNetworks$default(Context context, String str, String str2, String str3, String str4, String str5, Map map, int i14, Object obj) {
        if ((i14 & 64) != 0) {
            map = Collections.EMPTY_MAP;
            map.getClass();
        }
        return getRxNetworks(context, str, str2, str3, str4, str5, map);
    }

    public static final void setOkHttpClient(Context ctx, OkHttpClient client) {
        Object next;
        Interceptor interceptor;
        ctx.getClass();
        client.getClass();
        Iterator<T> it = client.interceptors().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            interceptor = (Interceptor) next;
            if (interceptor instanceof id2.i) {
                break;
            }
        } while (!(interceptor instanceof o));
        if (((Interceptor) next) != null) {
            h.s("read KDoc, OAuth2Interceptor or UserAgentInterceptor was found on the client");
            return;
        }
        OkHttpClient.Builder builderNewBuilder = client.newBuilder();
        builderNewBuilder.addInterceptor(new o(ctx, "ephemeris", BuildConfig.MAVEN_VERSION));
        httpClient = builderNewBuilder.build();
    }

    public static final d<List<MtkData>> getMtk(Context context, String str, String str2, int i14) {
        e0.p(context, str, str2);
        return getMtk$default(context, str, str2, i14, null, 16, null);
    }

    public static final d<byte[]> getRxNetworks(Context context, String str, String str2, String str3, String str4, String str5) {
        context.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return getRxNetworks$default(context, str, str2, str3, str4, str5, null, 64, null);
    }
}
