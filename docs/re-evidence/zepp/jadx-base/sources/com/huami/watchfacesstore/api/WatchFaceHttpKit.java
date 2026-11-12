package com.huami.watchfacesstore.api;

import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/huami/watchfacesstore/api/WatchFaceHttpKit;", "Lcom/huami/http/HttpKit;", "Lokhttp3/OkHttpClient;", "okHttpClient", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface WatchFaceHttpKit extends HttpKit {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/OkHttpClient;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<OkHttpClient> {
            public final /* synthetic */ OkHttpClient a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(OkHttpClient okHttpClient) {
                super(0);
                this.a = okHttpClient;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final OkHttpClient invoke() {
                return this.a;
            }
        }

        @NotNull
        public static HttpUrl baseUrl(@NotNull WatchFaceHttpKit watchFaceHttpKit) {
            return HttpKit.DefaultImpls.baseUrl(watchFaceHttpKit);
        }

        @NotNull
        public static OkHttpClient okHttpClient(@NotNull WatchFaceHttpKit watchFaceHttpKit) {
            HttpKitContext httpKitContext = HttpKitContext.INSTANCE;
            OkHttpClient clientOrNull = WatchFaceHttpKitKt.getClientOrNull(httpKitContext, "_￥_WatchFace");
            if (clientOrNull != null) {
                return clientOrNull;
            }
            OkHttpClient.Builder builderNewBuilder = HttpKit.DefaultImpls.okHttpClient(watchFaceHttpKit).newBuilder();
            builderNewBuilder.interceptors().add(0, new ParamsInterceptor());
            OkHttpClient okHttpClientBuild = builderNewBuilder.build();
            httpKitContext.setClient("_￥_WatchFace", new a(okHttpClientBuild));
            return okHttpClientBuild;
        }
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    OkHttpClient okHttpClient();
}
