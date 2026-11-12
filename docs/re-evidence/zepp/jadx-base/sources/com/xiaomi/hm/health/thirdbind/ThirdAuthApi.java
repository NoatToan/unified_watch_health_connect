package com.xiaomi.hm.health.thirdbind;

import com.google.gson.reflect.TypeToken;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitContext;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.ResponseBodyConverter;
import com.huami.network.hmnetwork.httpdns.HMHttpDnsManager;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/ThirdAuthApi;", "Lcom/huami/http/HttpKit;", "", DTransferConstants.PAGE, "size", "", "a", "Lcom/xiaomi/hm/health/thirdbind/Result;", "query", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ThirdAuthApi implements HttpKit {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String a = "https://auth.huami.com/";

    @NotNull
    private static final String b = "https://auth-staging.huami.com/";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0006\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/thirdbind/ThirdAuthApi$Companion;", "", "", "isProduct", "", "getOriHost", "getUrl", "HOST_PROD", "Ljava/lang/String;", "HOST_STAGING", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getOriHost(boolean isProduct) {
            return isProduct ? ThirdAuthApi.a : ThirdAuthApi.b;
        }

        @NotNull
        public final String getUrl() {
            return HMHttpDnsManager.getHttpDnsUrlBySrc(getOriHost(HMServerDef.isProductUrl()));
        }
    }

    private final String a(int page, int size) {
        return INSTANCE.getUrl() + "v2/oauth2/queryAuthorizeApp?pageNum=" + page + "&pageSize=" + size;
    }

    @JvmStatic
    @NotNull
    public static final String getOriHost(boolean z) {
        return INSTANCE.getOriHost(z);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Nullable
    public final Result query(int page, int size) {
        Object objM3845constructorimpl;
        Object objConvert;
        Response responseHttpGet$default = HttpKitKtxKt.httpGet$default(this, a(page, size), null, HMWebUtil.getSystemHeader(), 2, null);
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            ConverterKt.checkToken(responseHttpGet$default, ConverterKt.responseToJsonStr(responseHttpGet$default));
            if (responseHttpGet$default.isSuccessful()) {
                ResponseBodyConverter converter = HttpKitContext.INSTANCE.getConverter();
                ResponseBody responseBodyBody = responseHttpGet$default.body();
                if (responseBodyBody == null) {
                    Intrinsics.throwNpe();
                }
                objConvert = converter.convert(responseBodyBody, new TypeToken<Result>() { // from class: com.xiaomi.hm.health.thirdbind.ThirdAuthApi$query$$inlined$deserialize$1
                }.getType());
            } else {
                objM3845constructorimpl = kotlin.Result.m3845constructorimpl(null);
                objConvert = kotlin.Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl;
            }
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        return (Result) objConvert;
    }
}
