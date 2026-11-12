package com.huami.http;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.http.bean.CommonTokenBean;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\b\u001a\u00020\u0007J\u001c\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000bR\u0016\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R6\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010?\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010\u000fR\u0016\u0010A\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010\u000fR(\u0010C\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000b078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00109¨\u0006F"}, d2 = {"Lcom/huami/http/HttpKitContext;", "", "Lcom/huami/http/HttpBuildScope;", "scope", "", "a", "setup", "", "key", "Lokhttp3/OkHttpClient;", "getClientOrThrow", "Lkotlin/Function0;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "setClient", "mutualLoginCode", "Ljava/lang/String;", "Lkotlin/Function2;", "Lokhttp3/Response;", "", "Lkotlin/jvm/functions/Function2;", "getTokenHandler", "()Lkotlin/jvm/functions/Function2;", "setTokenHandler", "(Lkotlin/jvm/functions/Function2;)V", "tokenHandler", "Lkotlin/Function1;", "Lcom/huami/http/bean/CommonTokenBean;", "b", "Lkotlin/jvm/functions/Function1;", "getMutualLoginHandler", "()Lkotlin/jvm/functions/Function1;", "setMutualLoginHandler", "(Lkotlin/jvm/functions/Function1;)V", "mutualLoginHandler", "c", "Z", "getFixBaseUrl", "()Z", "setFixBaseUrl", "(Z)V", "fixBaseUrl", "Lokhttp3/HttpUrl;", "baseUrl", "Lokhttp3/HttpUrl;", "getBaseUrl", "()Lokhttp3/HttpUrl;", "setBaseUrl", "(Lokhttp3/HttpUrl;)V", "Lcom/huami/http/ResponseBodyConverter;", "converter", "Lcom/huami/http/ResponseBodyConverter;", "getConverter", "()Lcom/huami/http/ResponseBodyConverter;", "setConverter", "(Lcom/huami/http/ResponseBodyConverter;)V", "", "responsePreHandleMap", "Ljava/util/Map;", "getResponsePreHandleMap", "()Ljava/util/Map;", "setResponsePreHandleMap", "(Ljava/util/Map;)V", GoogleApiAvailabilityLight.a, "tokenInvalidCode", "e", "KEY_HTTP_COMPONENT", "f", "okHttpClientMap", "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class HttpKitContext {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Function2<? super Response, ? super String, Boolean> tokenHandler = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Function1<? super CommonTokenBean, Unit> mutualLoginHandler = null;
    public static HttpUrl baseUrl = null;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean fixBaseUrl = false;
    public static ResponseBodyConverter converter = null;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private static final String tokenInvalidCode = "0102";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final String KEY_HTTP_COMPONENT = "_￥_HttpKit";

    @NotNull
    public static final String mutualLoginCode = "0108";
    public static Map<String, Function0<Unit>> responsePreHandleMap;

    @NotNull
    public static final HttpKitContext INSTANCE = new HttpKitContext();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final Map<String, Function0<OkHttpClient>> okHttpClientMap = new LinkedHashMap();

    private HttpKitContext() {
    }

    private final void a(HttpBuildScope scope) {
        setResponsePreHandleMap(scope.getResponsePreHandleMap());
        getResponsePreHandleMap().put("0102", scope.getBadTokenHandler());
        mutualLoginHandler = scope.getMutualLoginHandler();
        tokenHandler = scope.getTokenHandler();
    }

    public static /* synthetic */ OkHttpClient getClientOrThrow$default(HttpKitContext httpKitContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = KEY_HTTP_COMPONENT;
        }
        return httpKitContext.getClientOrThrow(str);
    }

    @NotNull
    public final HttpUrl getBaseUrl() {
        HttpUrl httpUrl = baseUrl;
        Objects.requireNonNull(httpUrl);
        return httpUrl;
    }

    @NotNull
    public final OkHttpClient getClientOrThrow(@NotNull String key) {
        Function0<OkHttpClient> function0 = okHttpClientMap.get(key);
        OkHttpClient okHttpClientInvoke = function0 == null ? null : function0.invoke();
        if (okHttpClientInvoke != null) {
            return okHttpClientInvoke;
        }
        throw new IllegalArgumentException("未找到 " + key + " 所对应的 OkHttpClient，请检查传参是否正确");
    }

    @NotNull
    public final ResponseBodyConverter getConverter() {
        ResponseBodyConverter responseBodyConverter = converter;
        Objects.requireNonNull(responseBodyConverter);
        return responseBodyConverter;
    }

    public final boolean getFixBaseUrl() {
        return fixBaseUrl;
    }

    @Nullable
    public final Function1<CommonTokenBean, Unit> getMutualLoginHandler() {
        return mutualLoginHandler;
    }

    @NotNull
    public final Map<String, Function0<Unit>> getResponsePreHandleMap() {
        Map<String, Function0<Unit>> map = responsePreHandleMap;
        Objects.requireNonNull(map);
        return map;
    }

    @Nullable
    public final Function2<Response, String, Boolean> getTokenHandler() {
        return tokenHandler;
    }

    public final void setBaseUrl(@NotNull HttpUrl httpUrl) {
        baseUrl = httpUrl;
    }

    public final void setClient(@NotNull String key, @NotNull Function0<? extends OkHttpClient> client) {
        okHttpClientMap.put(key, client);
    }

    public final void setConverter(@NotNull ResponseBodyConverter responseBodyConverter) {
        converter = responseBodyConverter;
    }

    public final void setFixBaseUrl(boolean z) {
        fixBaseUrl = z;
    }

    public final void setMutualLoginHandler(@Nullable Function1<? super CommonTokenBean, Unit> function1) {
        mutualLoginHandler = function1;
    }

    public final void setResponsePreHandleMap(@NotNull Map<String, Function0<Unit>> map) {
        responsePreHandleMap = map;
    }

    public final void setTokenHandler(@Nullable Function2<? super Response, ? super String, Boolean> function2) {
        tokenHandler = function2;
    }

    public final void setup(@NotNull HttpBuildScope scope) {
        setBaseUrl(scope.getBaseUrlLazy$httpkit_release().invoke());
        fixBaseUrl = scope.getFixBaseUrl();
        setConverter(scope.getResponseBodyConverterLazy$httpkit_release().invoke());
        setClient(KEY_HTTP_COMPONENT, scope.getOkHttpClientLazy$httpkit_release());
        a(scope);
    }
}
