package com.xiaomi.fitness.login.request;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import com.xiaomi.fitness.net.url.ApiHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0017\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u001a\u0010\u000b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/login/request/RegionUrlSwitcherImpl;", "Lcom/xiaomi/fitness/login/request/RegionUrlSwitcher;", "Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "mApiHolder", "Lcom/xiaomi/fitness/net/url/ApiHolder;", "<init>", "(Lcom/xiaomi/fitness/net/url/ApiHolder;)V", "processRequest", "Lokhttp3/Request;", "oldRequest", "pruneIdentification", "newBuilder", "Lokhttp3/Request$Builder;", "url", "", "ignore", "Lokhttp3/HttpUrl$Builder;", "oldHttpUrl", "Lokhttp3/HttpUrl;", "httpUrl", "onHttpRequestBefore", "chain", "Lokhttp3/Interceptor$Chain;", "request", "getUrlWithRegionIfNeed", "region", "priority", "", "Companion", "login_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class RegionUrlSwitcherImpl implements RegionUrlSwitcher, HttpBeforeHandler {

    @NotNull
    public static final String TAG = "UrlManagerImpl";

    @NotNull
    private final ApiHolder mApiHolder;

    public RegionUrlSwitcherImpl(@NotNull ApiHolder mApiHolder) {
        Intrinsics.checkNotNullParameter(mApiHolder, "mApiHolder");
        this.mApiHolder = mApiHolder;
    }

    private final String getUrlWithRegionIfNeed(String url, String region) {
        if (Intrinsics.areEqual("cn", region)) {
            return url;
        }
        String strReplace$default = StringsKt__StringsJVMKt.replace$default(url, "://", "://" + region + ".", false, 4, (Object) null);
        StringBuilder sb = new StringBuilder();
        sb.append("getUrlWithRegionIfNeed: url:");
        sb.append(strReplace$default);
        return strReplace$default;
    }

    private final HttpUrl.Builder newBuilder(HttpUrl oldHttpUrl, HttpUrl httpUrl) {
        HttpUrl.Builder builderNewBuilder = oldHttpUrl.newBuilder();
        if (httpUrl != null && !Intrinsics.areEqual(oldHttpUrl.host(), httpUrl.host())) {
            builderNewBuilder.host(httpUrl.host());
        }
        return builderNewBuilder;
    }

    private final Request pruneIdentification(Request.Builder newBuilder, String url, String ignore) {
        return newBuilder.url(StringsKt__StringsJVMKt.replace$default(url, ignore, "", false, 4, (Object) null)).build();
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    @NotNull
    public Request onHttpRequestBefore(@NotNull Interceptor.Chain chain, @NotNull Request request) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(request, "request");
        return processRequest(request);
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    @NotNull
    public Response onHttpResponseBefore(@NotNull Interceptor.Chain chain, @NotNull Response response) {
        return HttpBeforeHandler.DefaultImpls.onHttpResponseBefore(this, chain, response);
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    public int priority() {
        return 40;
    }

    @Override // com.xiaomi.fitness.login.request.RegionUrlSwitcher
    @NotNull
    public Request processRequest(@NotNull Request oldRequest) {
        Intrinsics.checkNotNullParameter(oldRequest, "oldRequest");
        Request.Builder builderNewBuilder = oldRequest.newBuilder();
        HttpUrl httpUrlUrl = oldRequest.url();
        String url = httpUrlUrl.getUrl();
        String strHeader = oldRequest.header("RegionTag");
        if (strHeader != null && strHeader.length() != 0) {
            Logger.d("This url ignore region switch, url=" + url, new Object[0]);
            builderNewBuilder.removeHeader("RegionTag");
            return builderNewBuilder.build();
        }
        String currentRegion = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion();
        Logger.d(TAG, "Current region is " + currentRegion);
        boolean zContentEquals = StringsKt__StringsJVMKt.contentEquals(currentRegion, "cn", true) ^ true;
        if (zContentEquals) {
            url = getUrlWithRegionIfNeed(url, currentRegion);
            Logger.d(TAG, "switch to current region's url(" + url + ")");
        }
        HttpUrl httpUrl = url != null ? HttpUrl.INSTANCE.parse(url) : httpUrlUrl;
        if (zContentEquals) {
            this.mApiHolder.updateSecret(httpUrlUrl, httpUrl);
        }
        HttpUrl.Builder builderNewBuilder2 = newBuilder(httpUrlUrl, httpUrl);
        builderNewBuilder.addHeader("region_tag", currentRegion);
        return builderNewBuilder.url(builderNewBuilder2.build()).build();
    }
}
