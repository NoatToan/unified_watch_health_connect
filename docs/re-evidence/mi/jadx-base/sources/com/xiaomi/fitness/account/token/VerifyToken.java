package com.xiaomi.fitness.account.token;

import com.xiaomi.fitness.account.extensions.LogExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.interceptor.HttpBeforeHandler;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.ErrorCode;
import com.xiaomi.fitness.net.url.ApiHolder;
import com.xiaomi.fitness.net.url.SecretData;
import com.xiaomi.onetrack.api.b;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.fee;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B5\b\u0007\u0012\u001a\b\u0001\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00020!\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b0\u00101J#\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u00152\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R&\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\"0\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/account/token/VerifyToken;", "Lcom/xiaomi/fitness/net/interceptor/HttpBeforeHandler;", "", "", "", "cookies", "cookieHeader", "(Ljava/util/Map;)Ljava/lang/String;", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", b.I, "", "refreshToken", "cookie", "(Lokhttp3/Request;Lokhttp3/Response;Z)Lokhttp3/Request;", "getOldToken", "(Lokhttp3/Response;)Ljava/lang/String;", "sid", "Lcom/xiaomi/fitness/account/token/MiAccessToken;", "token", "", "adjustTimeDiff", "(Lokhttp3/Response;Ljava/lang/String;Lcom/xiaomi/fitness/account/token/MiAccessToken;)V", "Lokhttp3/Interceptor$Chain;", "chain", "onHttpRequestBefore", "(Lokhttp3/Interceptor$Chain;Lokhttp3/Request;)Lokhttp3/Request;", "onHttpResponseBefore", "(Lokhttp3/Interceptor$Chain;Lokhttp3/Response;)Lokhttp3/Response;", "", "priority", "()I", "Lfee;", "Lcom/xiaomi/fitness/account/token/CookieFetcher;", "mCookieFetchers", "Lfee;", "Lcom/xiaomi/fitness/account/token/TokenManager;", "mTokenManager", "Lcom/xiaomi/fitness/account/token/TokenManager;", "Lcom/xiaomi/fitness/net/url/ApiHolder;", "mApiHolder", "Lcom/xiaomi/fitness/net/url/ApiHolder;", "mCount", "I", "Ljava/util/concurrent/Semaphore;", "mSemaphore", "Ljava/util/concurrent/Semaphore;", "<init>", "(Lfee;Lcom/xiaomi/fitness/account/token/TokenManager;Lcom/xiaomi/fitness/net/url/ApiHolder;)V", "Companion", "account_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nVerifyToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerifyToken.kt\ncom/xiaomi/fitness/account/token/VerifyToken\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,181:1\n216#2,2:182\n*S KotlinDebug\n*F\n+ 1 VerifyToken.kt\ncom/xiaomi/fitness/account/token/VerifyToken\n*L\n44#1:182,2\n*E\n"})
public final class VerifyToken implements HttpBeforeHandler {

    @NotNull
    private static final String KEY_COOKIE = "Cookie";
    private static final int RETRY_MAX_NUM = 3;

    @NotNull
    private final ApiHolder mApiHolder;

    @NotNull
    private final fee<Map<String, CookieFetcher>> mCookieFetchers;
    private volatile int mCount;

    @NotNull
    private final Semaphore mSemaphore;

    @NotNull
    private final TokenManager mTokenManager;

    public VerifyToken(@NotNull fee<Map<String, CookieFetcher>> mCookieFetchers, @NotNull TokenManager mTokenManager, @NotNull ApiHolder mApiHolder) {
        Intrinsics.checkNotNullParameter(mCookieFetchers, "mCookieFetchers");
        Intrinsics.checkNotNullParameter(mTokenManager, "mTokenManager");
        Intrinsics.checkNotNullParameter(mApiHolder, "mApiHolder");
        this.mCookieFetchers = mCookieFetchers;
        this.mTokenManager = mTokenManager;
        this.mApiHolder = mApiHolder;
        this.mSemaphore = new Semaphore(1, true);
    }

    private final void adjustTimeDiff(Response response, String sid, MiAccessToken token) {
        Headers headers;
        Date date = (response == null || (headers = response.headers()) == null) ? null : headers.getDate(HTTP.DATE_HEADER);
        if (date != null) {
            token.setTimeDiff(date.getTime() - System.currentTimeMillis());
            this.mTokenManager.setServiceToken(sid, token);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00c5, please report this as an issue */
    private final Request cookie(Request request, Response response, boolean refreshToken) throws IOException {
        Integer numValueOf;
        CookieFetcher cookieFetcher;
        MiAccessToken serviceToken;
        Request.Builder builderNewBuilder;
        Request request2;
        HttpUrl httpUrlUrl = request.url();
        if (response == null) {
            LogExtKt.safePrintI("cookie newRequest response == null url is " + httpUrlUrl);
            SecretData secret = this.mApiHolder.getSecret(httpUrlUrl);
            if (secret != null) {
                numValueOf = Integer.valueOf(secret.getLoginPolicy());
            } else {
                numValueOf = null;
            }
        } else {
            LogExtKt.safePrintI("cookie response.request.url is " + response.request().url() + " url is " + httpUrlUrl);
            SecretData secret2 = this.mApiHolder.getSecret(response.request().url());
            if (secret2 != null) {
                numValueOf = Integer.valueOf(secret2.getLoginPolicy());
            } else {
                numValueOf = null;
            }
        }
        if (((numValueOf != null && numValueOf.intValue() == 2) || (numValueOf != null && numValueOf.intValue() == 3)) && (cookieFetcher = this.mCookieFetchers.get().get(httpUrlUrl.host())) != null) {
            if (refreshToken) {
                String oldToken = getOldToken(response);
                serviceToken = this.mTokenManager.getServiceToken(cookieFetcher.get$sid(), false, numValueOf.intValue());
                if (oldToken == null) {
                    LogExtKt.logi("getServiceToken url forceRefresh " + request.url() + ";policy=" + numValueOf);
                    serviceToken = this.mTokenManager.getServiceToken(cookieFetcher.get$sid(), true, numValueOf.intValue());
                } else {
                    if (Intrinsics.areEqual(serviceToken != null ? serviceToken.getServiceToken() : null, oldToken)) {
                        LogExtKt.logi("getServiceToken url forceRefresh " + request.url() + ";policy=" + numValueOf);
                        serviceToken = this.mTokenManager.getServiceToken(cookieFetcher.get$sid(), true, numValueOf.intValue());
                    } else {
                        LogExtKt.logi("token have been refreshed, use new token");
                    }
                }
            } else {
                LogExtKt.logi("getServiceToken url " + request.url() + ";policy=" + numValueOf);
                serviceToken = this.mTokenManager.getServiceToken(cookieFetcher.get$sid(), false, numValueOf.intValue());
            }
            if (serviceToken == null) {
                LogExtKt.logi("token is null");
                if (numValueOf == null || numValueOf.intValue() != 3) {
                    throw new ApiException("Token is null, may not be login", ErrorCode.NO_TOKEN);
                }
            } else {
                if (refreshToken) {
                    adjustTimeDiff(response, cookieFetcher.get$sid(), serviceToken);
                }
                Map<String, Object> mapFetch = cookieFetcher.fetch(serviceToken, refreshToken);
                LogExtKt.logi("refreshToken is " + refreshToken + ", re-fetch cookie for " + httpUrlUrl.encodedPath());
                LogExtKt.safePrintI("cookie is " + mapFetch + " url is " + httpUrlUrl);
                if (!mapFetch.isEmpty()) {
                    if (response == null || (request2 = response.request()) == null || (builderNewBuilder = request2.newBuilder()) == null) {
                        builderNewBuilder = request.newBuilder();
                    }
                    return builderNewBuilder.header("Cookie", cookieHeader(mapFetch)).build();
                }
            }
        }
        return request;
    }

    private final String cookieHeader(Map<String, ? extends Object> cookies) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ? extends Object> entry : cookies.entrySet()) {
            String key = entry.getKey();
            sb.append(((Object) key) + "=" + entry.getValue());
            sb.append("; ");
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    private final String getOldToken(Response response) {
        String str;
        List listSplit$default;
        Object next;
        Request request;
        Headers headers;
        String str2 = (response == null || (request = response.request()) == null || (headers = request.headers()) == null) ? null : headers.get("Cookie");
        if (str2 == null || (listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str2, new String[]{"; "}, false, 0, 6, (Object) null)) == null) {
            str = null;
        } else {
            Iterator it = listSplit$default.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt__StringsJVMKt.startsWith$default((String) next, "serviceToken=", false, 2, null));
            str = (String) next;
        }
        if (str == null) {
            return null;
        }
        String strSubstring = str.substring(13);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    @NotNull
    public Request onHttpRequestBefore(@NotNull Interceptor.Chain chain, @NotNull Request request) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            LogExtKt.logi("First request");
            return cookie(request, null, false);
        } catch (Throwable th) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new ApiException(th);
        }
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    @NotNull
    public Response onHttpResponseBefore(@NotNull Interceptor.Chain chain, @NotNull Response response) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(response, "response");
        LogExtKt.safePrintI("onHttpResponseBefore: " + response);
        LogExtKt.logi("onHttpResponseBefore begin");
        if (response.code() == 401) {
            LogExtKt.logi("401, try again, already retried " + this.mCount + " time");
            try {
                if (this.mCount >= 3) {
                    LogExtKt.logi("retries exceeded, return!");
                    return response;
                }
                try {
                    LogExtKt.logi("onHttpResponseBefore  mSemaphore.tryAcquire before");
                    this.mSemaphore.tryAcquire(3L, TimeUnit.MINUTES);
                    LogExtKt.logi("onHttpResponseBefore  mSemaphore.tryAcquire after");
                    Request request = chain.request();
                    Request requestCookie = cookie(request, response, true);
                    LogExtKt.safePrintI("request is  " + request + " newRequest is " + requestCookie);
                    if (!Intrinsics.areEqual(request, requestCookie)) {
                        this.mCount++;
                        LogExtKt.logi("Create a new request, already retried " + this.mCount + " times");
                        response.close();
                        Response responseProceed = chain.proceed(requestCookie);
                        LogExtKt.logi("onHttpResponseBefore  mSemaphore.release");
                        this.mSemaphore.release();
                        return responseProceed;
                    }
                } catch (InterruptedException e) {
                    Logger.e("onHttpResponseBefore  Semaphore is interrupted because " + e, new Object[0]);
                } catch (Throwable th) {
                    Logger.e("onHttpResponseBefore  throw an exception " + th, new Object[0]);
                    if (th instanceof IOException) {
                        throw th;
                    }
                    throw new ApiException(th);
                }
                LogExtKt.logi("onHttpResponseBefore  mSemaphore.release");
                this.mSemaphore.release();
            } catch (Throwable th2) {
                LogExtKt.logi("onHttpResponseBefore  mSemaphore.release");
                this.mSemaphore.release();
                throw th2;
            }
        }
        LogExtKt.logi("onHttpResponseBefore  reset count");
        this.mCount = 0;
        return response;
    }

    @Override // com.xiaomi.fitness.net.interceptor.HttpBeforeHandler
    public int priority() {
        return 50;
    }
}
