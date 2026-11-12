package com.huami.device.feature.quickcards.cloud.resouce.impl;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.device.feature.quickcards.cloud.resouce.ResourceFactoryBuilder;
import com.huami.device.feature.quickcards.cloud.resouce.api.CloudResourceApi;
import com.huami.device.feature.quickcards.cloud.resouce.api.NetworkApi;
import com.huami.tools.log.HMLog;
import com.huami.watch.transdata.transport.Actions;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J;\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R%\u0010\u001c\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/NetworkImpl;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "", "type", "", "", "ids", "lang", "source", "e", "(ILjava/lang/Iterable;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "Lokhttp3/Headers;", GoogleApiAvailabilityLight.a, "(Ljava/lang/String;Ljava/lang/Integer;)Lokhttp3/Headers;", "url", Actions.KEY_HEADERS, "Lokhttp3/Response;", "b", "c", "request", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "a", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;", "appInfo", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "Lkotlin/Lazy;", "()Lokhttp3/OkHttpClient;", "httpClient", "<init>", "(Lcom/huami/device/feature/quickcards/cloud/resouce/api/CloudResourceApi$AppInfo;)V", "Companion", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class NetworkImpl implements NetworkApi {

    @NotNull
    private static final String c = "NetworkImpl";

    @NotNull
    private static final String d = "market/app/setting";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CloudResourceApi.AppInfo appInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy httpClient = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<OkHttpClient> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            return new OkHttpClient.Builder().build();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("request code --> request url is ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Headers a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Headers headers) {
            super(0);
            this.a = headers;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("request header : ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Response a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Response response) {
            super(0);
            this.a = response;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("request code --> ", Integer.valueOf(this.a.code()));
        }
    }

    public NetworkImpl(@NotNull CloudResourceApi.AppInfo appInfo) {
        this.appInfo = appInfo;
    }

    private final OkHttpClient a() {
        return (OkHttpClient) this.httpClient.getValue();
    }

    private final Response b(String url, Headers headers) {
        return FirebasePerfOkHttpClient.execute(a().newCall(new Request.Builder().method("GET", null).url(url).headers(headers).build()));
    }

    private final String c() throws Exception {
        String strStringPlus = m.endsWith$default(this.appInfo.getHost(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, false, 2, null) ? Intrinsics.stringPlus(this.appInfo.getHost(), d) : Intrinsics.stringPlus(this.appInfo.getHost(), "/market/app/setting");
        if (m.startsWith$default(strStringPlus, "https://", false, 2, null)) {
            return strStringPlus;
        }
        throw new Exception("请确认url地址是否正确");
    }

    private final Headers d(String lang, Integer source) {
        Headers.Builder builder = new Headers.Builder();
        if (lang == null) {
            lang = ResourceFactoryBuilder.INSTANCE.getDeviceLang$quick_card_api_release();
        }
        return builder.add("device_language", lang).add("apptoken", this.appInfo.getToken()).add("appname", this.appInfo.getAppName()).add("lang", this.appInfo.getLang()).add("device_source", String.valueOf(source)).build();
    }

    private final String e(int type, Iterable<String> ids, String lang, Integer source) throws Exception {
        String str = c() + "?userid=" + this.appInfo.getUserId() + "&type=" + type + "&ids=" + CollectionsKt___CollectionsKt.joinToString$default(ids, ",", null, null, 0, null, null, 62, null) + "&device_source=" + source;
        HMLog.debug(c, new b(str));
        try {
            Headers headersD = d(lang, source);
            HMLog.info(c, new c(headersD));
            Response responseB = b(str, headersD);
            HMLog.debug(c, new d(responseB));
            if (!responseB.isSuccessful()) {
                throw new Exception(Intrinsics.stringPlus("request failure with code ", Integer.valueOf(responseB.code())));
            }
            ResponseBody responseBodyBody = responseB.body();
            if (responseBodyBody == null) {
                return null;
            }
            return responseBodyBody.string();
        } catch (IOException e) {
            throw new Exception("get remote response error", e);
        }
    }

    @Override // com.huami.device.feature.quickcards.cloud.resouce.api.NetworkApi
    @Nullable
    public String request(int type, @NotNull Iterable<String> ids, @Nullable String lang, @Nullable Integer source) throws Exception {
        if (source != null) {
            return e(type, ids, lang, source);
        }
        throw new Exception("请先确认Source");
    }
}
