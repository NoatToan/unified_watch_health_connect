package com.huami.http;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.http.bean.CommonTokenBean;
import com.huami.watch.notification.TransportUri;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b/\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bG\u0010HJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\u0014\u0010\u000b\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u0002J\u0014\u0010\u000e\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0002J\u0016\u0010\u0010\u001a\u00020\u00052\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002J\"\u0010\u0013\u001a\u00020\u00052\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0011J\u001c\u0010\u0016\u001a\u00020\u00052\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0014J\u001c\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002J \u0010\u0019\u001a\u00020\u00052\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u001aR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010!R6\u0010.\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u00102\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u0010\u001f\"\u0004\b1\u0010!R0\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R6\u0010@\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lcom/huami/http/HttpBuildScope;", "", "Lkotlin/Function0;", "Lokhttp3/OkHttpClient;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "", "okHttpClient", "", "url", "", "fixBaseUrl", "baseUrl", "Lokhttp3/HttpUrl;", "Lcom/huami/http/ResponseBodyConverter;", "converter", TransportUri.ACTION_BLOCK, "handleBakToken", "Lkotlin/Function2;", "Lokhttp3/Response;", "handleToken", "Lkotlin/Function1;", "Lcom/huami/http/bean/CommonTokenBean;", "handleMutualLogin", "key", "value", "addResponsePreHandler", "", "mutableMap", "okHttpClientLazy", "Lkotlin/jvm/functions/Function0;", "getOkHttpClientLazy$httpkit_release", "()Lkotlin/jvm/functions/Function0;", "setOkHttpClientLazy$httpkit_release", "(Lkotlin/jvm/functions/Function0;)V", "baseUrlLazy", "getBaseUrlLazy$httpkit_release", "setBaseUrlLazy$httpkit_release", "responseBodyConverterLazy", "getResponseBodyConverterLazy$httpkit_release", "setResponseBodyConverterLazy$httpkit_release", "a", "Lkotlin/jvm/functions/Function2;", "getTokenHandler", "()Lkotlin/jvm/functions/Function2;", "setTokenHandler", "(Lkotlin/jvm/functions/Function2;)V", "tokenHandler", "b", "getBadTokenHandler", "setBadTokenHandler", "badTokenHandler", "c", "Lkotlin/jvm/functions/Function1;", "getMutualLoginHandler", "()Lkotlin/jvm/functions/Function1;", "setMutualLoginHandler", "(Lkotlin/jvm/functions/Function1;)V", "mutualLoginHandler", GoogleApiAvailabilityLight.a, "Ljava/util/Map;", "getResponsePreHandleMap", "()Ljava/util/Map;", "setResponsePreHandleMap", "(Ljava/util/Map;)V", "responsePreHandleMap", "e", "Z", "getFixBaseUrl", "()Z", "setFixBaseUrl", "(Z)V", "<init>", "()V", "httpkit_release"}, k = 1, mv = {1, 5, 1})
public final class HttpBuildScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function2<? super Response, ? super String, Boolean> tokenHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> badTokenHandler;
    public Function0<HttpUrl> baseUrlLazy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function1<? super CommonTokenBean, Unit> mutualLoginHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private Map<String, Function0<Unit>> responsePreHandleMap = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean fixBaseUrl;
    public Function0<? extends OkHttpClient> okHttpClientLazy;
    public Function0<? extends ResponseBodyConverter> responseBodyConverterLazy;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lokhttp3/HttpUrl;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HttpUrl> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpUrl invoke() {
            return HttpUrl.get(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/HttpUrl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<HttpUrl> {
        public final /* synthetic */ Function0<HttpUrl> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function0<HttpUrl> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HttpUrl invoke() {
            return this.a.invoke();
        }
    }

    public static /* synthetic */ void baseUrl$default(HttpBuildScope httpBuildScope, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        httpBuildScope.baseUrl(str, z);
    }

    public final void addResponsePreHandler(@NotNull String key, @NotNull Function0<Unit> value) {
        this.responsePreHandleMap.put(key, value);
    }

    public final void baseUrl(@NotNull String url, boolean fixBaseUrl) {
        setBaseUrlLazy$httpkit_release(new a(url));
        this.fixBaseUrl = fixBaseUrl;
    }

    public final void converter(@NotNull Function0<? extends ResponseBodyConverter> converter) {
        setResponseBodyConverterLazy$httpkit_release(converter);
    }

    @Nullable
    public final Function0<Unit> getBadTokenHandler() {
        return this.badTokenHandler;
    }

    @NotNull
    public final Function0<HttpUrl> getBaseUrlLazy$httpkit_release() {
        Function0<HttpUrl> function0 = this.baseUrlLazy;
        Objects.requireNonNull(function0);
        return function0;
    }

    public final boolean getFixBaseUrl() {
        return this.fixBaseUrl;
    }

    @Nullable
    public final Function1<CommonTokenBean, Unit> getMutualLoginHandler() {
        return this.mutualLoginHandler;
    }

    @NotNull
    public final Function0<OkHttpClient> getOkHttpClientLazy$httpkit_release() {
        Function0 function0 = this.okHttpClientLazy;
        Objects.requireNonNull(function0);
        return function0;
    }

    @NotNull
    public final Function0<ResponseBodyConverter> getResponseBodyConverterLazy$httpkit_release() {
        Function0 function0 = this.responseBodyConverterLazy;
        Objects.requireNonNull(function0);
        return function0;
    }

    @NotNull
    public final Map<String, Function0<Unit>> getResponsePreHandleMap() {
        return this.responsePreHandleMap;
    }

    @Nullable
    public final Function2<Response, String, Boolean> getTokenHandler() {
        return this.tokenHandler;
    }

    public final void handleBakToken(@Nullable Function0<Unit> block) {
        this.badTokenHandler = block;
    }

    public final void handleMutualLogin(@Nullable Function1<? super CommonTokenBean, Unit> block) {
        this.mutualLoginHandler = block;
    }

    public final void handleToken(@Nullable Function2<? super Response, ? super String, Boolean> block) {
        this.tokenHandler = block;
    }

    public final void okHttpClient(@NotNull Function0<? extends OkHttpClient> client) {
        setOkHttpClientLazy$httpkit_release(client);
    }

    public final void setBadTokenHandler(@Nullable Function0<Unit> function0) {
        this.badTokenHandler = function0;
    }

    public final void setBaseUrlLazy$httpkit_release(@NotNull Function0<HttpUrl> function0) {
        this.baseUrlLazy = function0;
    }

    public final void setFixBaseUrl(boolean z) {
        this.fixBaseUrl = z;
    }

    public final void setMutualLoginHandler(@Nullable Function1<? super CommonTokenBean, Unit> function1) {
        this.mutualLoginHandler = function1;
    }

    public final void setOkHttpClientLazy$httpkit_release(@NotNull Function0<? extends OkHttpClient> function0) {
        this.okHttpClientLazy = function0;
    }

    public final void setResponseBodyConverterLazy$httpkit_release(@NotNull Function0<? extends ResponseBodyConverter> function0) {
        this.responseBodyConverterLazy = function0;
    }

    public final void setResponsePreHandleMap(@NotNull Map<String, Function0<Unit>> map) {
        this.responsePreHandleMap = map;
    }

    public final void setTokenHandler(@Nullable Function2<? super Response, ? super String, Boolean> function2) {
        this.tokenHandler = function2;
    }

    public final void addResponsePreHandler(@NotNull Map<String, Function0<Unit>> mutableMap) {
        this.responsePreHandleMap.putAll(mutableMap);
    }

    public final void baseUrl(@NotNull Function0<HttpUrl> url) {
        setBaseUrlLazy$httpkit_release(new b(url));
    }
}
