package com.xiaomi.fitness.app;

import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.account.token.MiAccessToken;
import com.xiaomi.fitness.account.token.TokenManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.net.url.ApiHolder;
import com.xiaomi.fitness.net.url.SecretData;
import defpackage.x24;
import defpackage.yhd;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 &2\u00020\u0001:\u0001&B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J:\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J:\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002JR\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u001e2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0!2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J \u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002J\u0012\u0010$\u001a\u00020%2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/app/CloudInterceptor;", "Lokhttp3/Interceptor;", "mApiHolder", "Lcom/xiaomi/fitness/net/url/ApiHolder;", "mTokenManager", "Lcom/xiaomi/fitness/account/token/TokenManager;", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "<init>", "(Lcom/xiaomi/fitness/net/url/ApiHolder;Lcom/xiaomi/fitness/account/token/TokenManager;Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "subpath", "", "pathPrefix", "path", "handleGetParams", "", "requestBuilder", "Lokhttp3/Request$Builder;", "request", "Lokhttp3/Request;", "secret", "Lcom/xiaomi/fitness/net/url/SecretData;", "nonce", "security", "handlePostParams", "getEncryptedParams", "", "method", "params", "", "decryptResponse", MiuiCursorConstants.CONTENT, "encryptResponse", "", "Companion", "fit-app_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CloudInterceptor implements Interceptor {

    @NotNull
    private static final String HANDLE_PARAMS_TAG = "HandleParams";

    @NotNull
    private final AccountManager mAccountManager;

    @NotNull
    private final ApiHolder mApiHolder;

    @NotNull
    private final TokenManager mTokenManager;

    @NotNull
    private static final HashSet<String> mEncryptionParams = SetsKt__SetsKt.hashSetOf(MiTsmConstants.KEY_SIGNATURE, "rc4_hash__", "_nonce");

    public CloudInterceptor(@NotNull ApiHolder mApiHolder, @NotNull TokenManager mTokenManager, @NotNull AccountManager mAccountManager) {
        Intrinsics.checkNotNullParameter(mApiHolder, "mApiHolder");
        Intrinsics.checkNotNullParameter(mTokenManager, "mTokenManager");
        Intrinsics.checkNotNullParameter(mAccountManager, "mAccountManager");
        this.mApiHolder = mApiHolder;
        this.mTokenManager = mTokenManager;
        this.mAccountManager = mAccountManager;
    }

    private final String decryptResponse(String content, String nonce, String security) throws Exception {
        String strB = x24.b(content, nonce, security);
        Intrinsics.checkNotNullExpressionValue(strB, "decryptResponse(...)");
        return strB;
    }

    private final boolean encryptResponse(SecretData secret) {
        if (!this.mAccountManager.isLogin()) {
            return false;
        }
        if (secret != null) {
            return secret.getEncryptResponse();
        }
        return true;
    }

    private final Map<String, String> getEncryptedParams(String method, String path, Map<String, String> params, SecretData secret, String nonce, String security) throws Exception {
        if (!StringsKt__StringsJVMKt.startsWith$default(path, "/", false, 2, null)) {
            path = "/" + path;
        }
        if (encryptResponse(secret)) {
            Map<String, String> mapC = x24.c(method, path, params, nonce, security);
            Intrinsics.checkNotNull(mapC);
            return mapC;
        }
        Map<String, String> mapD = x24.d(path, params, nonce, security);
        Intrinsics.checkNotNull(mapD);
        return mapD;
    }

    private final void handleGetParams(Request.Builder requestBuilder, Request request, String path, SecretData secret, String nonce, String security) throws IOException {
        yhd yhdVar;
        HttpUrl httpUrlUrl = request.url();
        HttpUrl.Builder builderEncodedPath = new HttpUrl.Builder().scheme(httpUrlUrl.scheme()).host(httpUrlUrl.host()).encodedPath(httpUrlUrl.encodedPath());
        try {
            HashMap map = new HashMap();
            int iQuerySize = httpUrlUrl.querySize();
            List<?> listA = null;
            String[] filterSignatureKeys = secret != null ? secret.getFilterSignatureKeys() : null;
            boolean zAreEqual = Intrinsics.areEqual(request.header(HANDLE_PARAMS_TAG), "true");
            if (zAreEqual && (yhdVar = (yhd) request.tag(yhd.class)) != null) {
                listA = yhdVar.a();
            }
            if (iQuerySize > 0) {
                int i = 0;
                while (i < iQuerySize) {
                    String strQueryParameterName = httpUrlUrl.queryParameterName(i);
                    String strQueryParameterValue = (!zAreEqual || listA == null || i >= listA.size()) ? httpUrlUrl.queryParameterValue(i) : String.valueOf(listA.get(i));
                    if (filterSignatureKeys == null || ArraysKt___ArraysKt.contains(filterSignatureKeys, strQueryParameterName)) {
                        if (strQueryParameterValue == null) {
                            strQueryParameterValue = "";
                        }
                        map.put(strQueryParameterName, strQueryParameterValue);
                    } else if (!mEncryptionParams.contains(strQueryParameterName)) {
                        builderEncodedPath.setQueryParameter(strQueryParameterName, strQueryParameterValue);
                    }
                    i++;
                }
            }
            for (Map.Entry<String, String> entry : getEncryptedParams(request.method(), path, map, secret, nonce, security).entrySet()) {
                builderEncodedPath.setQueryParameter(entry.getKey(), entry.getValue());
            }
            requestBuilder.url(builderEncodedPath.build());
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.nio.charset.Charset, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    private final void handlePostParams(Request.Builder requestBuilder, Request request, String path, SecretData secret, String nonce, String security) throws IOException {
        String strValue;
        yhd yhdVar;
        RequestBody requestBodyBody = request.body();
        if (requestBodyBody instanceof FormBody) {
            ?? A = 0;
            A = 0;
            FormBody.Builder builder = new FormBody.Builder(A, 1, A);
            HashMap map = new HashMap();
            String[] filterSignatureKeys = secret != null ? secret.getFilterSignatureKeys() : null;
            boolean zAreEqual = Intrinsics.areEqual(request.header(HANDLE_PARAMS_TAG), "true");
            if (zAreEqual && (yhdVar = (yhd) request.tag(yhd.class)) != null) {
                A = yhdVar.a();
            }
            FormBody formBody = (FormBody) requestBodyBody;
            int size = formBody.size();
            for (int i = 0; i < size; i++) {
                String strName = formBody.name(i);
                if (!zAreEqual || A == 0 || i >= A.size()) {
                    strValue = formBody.value(i);
                } else {
                    Object obj = A.get(i);
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    strValue = (String) obj;
                }
                if (filterSignatureKeys == null || ArraysKt___ArraysKt.contains(filterSignatureKeys, strName)) {
                    map.put(strName, strValue);
                } else if (!mEncryptionParams.contains(strName)) {
                    builder.add(strName, strValue);
                }
            }
            try {
                for (Map.Entry<String, String> entry : getEncryptedParams(request.method(), path, map, secret, nonce, security).entrySet()) {
                    builder.add(entry.getKey(), entry.getValue());
                }
                requestBuilder.post(builder.build());
            } catch (Exception e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    private final String subpath(String pathPrefix, String path) {
        if (pathPrefix == null || pathPrefix.length() == 0) {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) path, '/', 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                return path;
            }
            String strSubstring = path.substring(iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        }
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) path, pathPrefix, 0, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            return path;
        }
        String strSubstring2 = path.substring(iIndexOf$default2 + pathPrefix.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        String security;
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        Request.Builder builderNewBuilder = request.newBuilder();
        HttpUrl httpUrlUrl = request.url();
        SecretData secret = this.mApiHolder.getSecret(httpUrlUrl);
        if (!encryptResponse(secret)) {
            builderNewBuilder.header("X-XIAOMI-PROTOCAL-FLAG-CLI", "PROTOCAL-HTTP2");
        }
        Logger.i("baronqi", "intercept() called with: secret " + secret);
        if (secret == null) {
            return chain.proceed(request);
        }
        String strMethod = request.method();
        String strSubpath = subpath(secret.getPathPrefix(), httpUrlUrl.encodedPath());
        MiAccessToken serviceToken$default = TokenManager.DefaultImpls.getServiceToken$default(this.mTokenManager, secret.getSid(), false, secret.getLoginPolicy(), 2, null);
        String strE = x24.e(serviceToken$default != null ? serviceToken$default.getTimeDiff() : 0L);
        Logger.i("baronqi", "intercept() called with: nonce " + strE + ", " + strMethod);
        if (serviceToken$default == null || (security = serviceToken$default.getSecurity()) == null) {
            security = "";
        }
        String str = security;
        if (Intrinsics.areEqual("GET", strMethod)) {
            Intrinsics.checkNotNull(strE);
            handleGetParams(builderNewBuilder, request, strSubpath, secret, strE, str);
        } else if (Intrinsics.areEqual("POST", strMethod)) {
            Intrinsics.checkNotNull(strE);
            handlePostParams(builderNewBuilder, request, strSubpath, secret, strE, str);
        }
        builderNewBuilder.header(HANDLE_PARAMS_TAG, "true");
        Response responseProceed = chain.proceed(builderNewBuilder.build());
        if (!responseProceed.isSuccessful() || !encryptResponse(secret)) {
            return responseProceed;
        }
        ResponseBody responseBodyBody = responseProceed.body();
        Intrinsics.checkNotNull(responseBodyBody);
        String strString = responseBodyBody.string();
        try {
            Intrinsics.checkNotNull(strE);
            return responseProceed.newBuilder().body(ResponseBody.INSTANCE.create(decryptResponse(strString, strE, str), responseBodyBody.get$contentType())).build();
        } catch (Exception e) {
            Logger.d("request " + request.url(), e);
            throw new IOException("decrypt failed:" + strString);
        }
    }
}
