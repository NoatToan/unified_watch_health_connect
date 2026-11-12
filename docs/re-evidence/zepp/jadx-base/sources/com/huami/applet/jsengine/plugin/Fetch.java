package com.huami.applet.jsengine.plugin;

import android.content.Context;
import android.util.Base64;
import com.amap.api.mapcore.util.hl;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.huami.applet.AppletConfig;
import com.huami.applet.ConstantKt;
import com.huami.applet.extension.ContextExtKt;
import com.huami.applet.extension.JavascriptExecuteExtKt;
import com.huami.applet.utils.CurlInterceptor;
import com.huami.assistant.ocr.camera.CameraActivity;
import com.huami.tools.log.HMLog;
import com.huami.watch.transdata.transport.Actions;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.loc.z;
import com.xiaomi.ai.core.AivsConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.cybergarage.upnp.Argument;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u00104\u001a\u000202¢\u0006\u0004\b=\u0010>J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0002J<\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J(\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00022\u000e\u0010\u001f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\"H\u0002J\b\u0010$\u001a\u00020\u0012H\u0002J4\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0017H\u0002J$\u0010+\u001a\u00020\u000e2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010(\u001a\u00020\u0017H\u0002J$\u0010,\u001a\u00020\u000e2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010(\u001a\u00020\u0017H\u0002J\u0015\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0017H\u0016R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R(\u00109\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020706058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00108R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010:R\u0016\u0010<\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010:¨\u0006?"}, d2 = {"Lcom/huami/applet/jsengine/plugin/Fetch;", "Lcom/huami/applet/jsengine/plugin/AppletPlugin;", "", Argument.ELEM_NAME, "Lcom/huami/applet/jsengine/plugin/FetchRequest;", "f", "id", "", "l", "requestData", "Lokhttp3/Request$Builder;", "c", CameraActivity.KEY_CONTENT_TYPE, "requestBuilder", "", "e", "g", GoogleApiAvailabilityLight.a, "Lokhttp3/OkHttpClient;", "okHttpClient", "Lokhttp3/Request;", "request", "responseData", "Lcom/huami/applet/jsengine/plugin/JavascriptExecuteInterface;", "handler", hl.k, "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, z.j, "i", "data", "responseHeaders", "Lorg/json/JSONObject;", "h", "Lokhttp3/OkHttpClient$Builder;", "a", "b", "", "throwable", "errorMsg", "result", "o", "fetchResponse", GoogleApiAvailabilityLight.b, "m", "", "moduleName", "()[Ljava/lang/String;", "actionNames", "invokeMethod", "Landroid/content/Context;", "Landroid/content/Context;", "appContext", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lokhttp3/Cookie;", "Ljava/util/concurrent/ConcurrentHashMap;", "cookieStore", "Lokhttp3/OkHttpClient;", "httpClient", "httpCustomClient", "<init>", "(Landroid/content/Context;)V", "applet_release"}, k = 1, mv = {1, 5, 1})
public final class Fetch implements AppletPlugin {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context appContext;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ConcurrentHashMap<String, List<Cookie>> cookieStore = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final OkHttpClient httpClient = a().build();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final OkHttpClient httpCustomClient = b();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    public Fetch(@NotNull Context context) {
        this.appContext = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final OkHttpClient.Builder a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.cookieJar(new CookieJar() { // from class: com.huami.applet.jsengine.plugin.Fetch$buildClient$1$1
            @Override // okhttp3.CookieJar
            @NotNull
            public List<Cookie> loadForRequest(@NotNull HttpUrl url) {
                List<Cookie> list = (List) this.a.cookieStore.get(url.host());
                return list == null ? new ArrayList() : list;
            }

            @Override // okhttp3.CookieJar
            public void saveFromResponse(@NotNull HttpUrl url, @NotNull List<Cookie> cookies) {
                this.a.cookieStore.put(url.host(), cookies);
            }
        });
        if (ContextExtKt.isDebug(this.appContext)) {
            builder.addInterceptor(new CurlInterceptor(null, 1, 0 == true ? 1 : 0));
        }
        return builder;
    }

    private final OkHttpClient b() {
        OkHttpClient.Builder builderA = a();
        List<Interceptor> interceptors = AppletConfig.INSTANCE.getInterceptors();
        if (interceptors != null) {
            Iterator<T> it2 = interceptors.iterator();
            while (it2.hasNext()) {
                builderA.addInterceptor((Interceptor) it2.next());
            }
        }
        return builderA.build();
    }

    private final Request.Builder c(FetchRequest requestData) {
        Request.Builder builder = new Request.Builder();
        g(requestData, builder);
        e(d(requestData, builder), requestData, builder);
        return builder;
    }

    private final String d(FetchRequest requestData, Request.Builder requestBuilder) throws JSONException {
        JSONObject headers = requestData.getHeaders();
        Iterator<String> itKeys = headers.keys();
        String str = "";
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = headers.getString(next);
            Locale locale = Locale.ROOT;
            Objects.requireNonNull(next, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = next.toLowerCase(locale);
            if (!Intrinsics.areEqual(lowerCase, AbstractJSONTokenResponse.COOKIE)) {
                Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
                if (Intrinsics.areEqual(lowerCase.toLowerCase(locale), "content-type")) {
                    str = string;
                }
                requestBuilder.header(next, string);
            }
        }
        return str;
    }

    private final void e(String contentType, FetchRequest requestData, Request.Builder requestBuilder) {
        String method = requestData.getMethod();
        Locale locale = Locale.ROOT;
        Objects.requireNonNull(method, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = method.toLowerCase(locale);
        if (Intrinsics.areEqual(lowerCase, "get")) {
            return;
        }
        RequestBody requestBodyCreate = RequestBody.create(MediaType.parse(contentType), requestData.getBody());
        int iHashCode = lowerCase.hashCode();
        if (iHashCode == -1335458389) {
            if (lowerCase.equals("delete")) {
                requestBuilder.delete(requestBodyCreate);
            }
        } else if (iHashCode == 111375) {
            if (lowerCase.equals(DataItem.HTTP_METHOD_PUT)) {
                requestBuilder.put(requestBodyCreate);
            }
        } else if (iHashCode == 3446944 && lowerCase.equals(DataItem.HTTP_METHOD_POST)) {
            requestBuilder.post(requestBodyCreate);
        }
    }

    private final FetchRequest f(String argument) {
        Object objM3845constructorimpl;
        String str;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            JSONObject jSONObject = new JSONObject(argument);
            String strOptString = jSONObject.optString("id");
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
            String strOptString2 = jSONObjectOptJSONObject.optString("method");
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(Actions.KEY_HEADERS);
            if (jSONObjectOptJSONObject2 == null) {
                jSONObjectOptJSONObject2 = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObjectOptJSONObject2;
            String strOptString3 = jSONObjectOptJSONObject.optString("url");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("querys");
            if (jSONObjectOptJSONObject3 == null) {
                jSONObjectOptJSONObject3 = new JSONObject();
            }
            JSONObject jSONObject3 = jSONObjectOptJSONObject3;
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("body");
            String string = jSONObjectOptJSONObject4 == null ? null : jSONObjectOptJSONObject4.toString();
            if (string == null) {
                String strOptString4 = jSONObjectOptJSONObject.optString("body");
                if (strOptString4 == null) {
                    strOptString4 = "";
                }
                str = strOptString4;
            } else {
                str = string;
            }
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(new FetchRequest(strOptString, str, jSONObject2, strOptString2, jSONObject3, strOptString3, jSONObjectOptJSONObject.optLong("timeout"), jSONObjectOptJSONObject.optString("responseType")));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
            HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, new a(thM3848exceptionOrNullimpl), 4, null);
        }
        return (FetchRequest) (kotlin.Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    private final void g(FetchRequest requestData, Request.Builder requestBuilder) {
        HttpUrl.Builder builderNewBuilder = HttpUrl.parse(requestData.getUrl()).newBuilder();
        Iterator<String> itKeys = requestData.getQuery().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            builderNewBuilder.addQueryParameter(next, requestData.getQuery().getString(next));
        }
        requestBuilder.url(builderNewBuilder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject h(String data, Map<?, ?> responseHeaders, Response response) throws JSONException {
        Object objM3845constructorimpl;
        JSONObject jSONObject = new JSONObject();
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(new JSONObject(data));
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            jSONObject.put("body", data);
        }
        if (kotlin.Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            jSONObject.put("body", (JSONObject) objM3845constructorimpl);
        }
        jSONObject.put("status", response.code());
        jSONObject.put("statusText", response.message());
        jSONObject.put(Actions.KEY_HEADERS, new JSONObject(responseHeaders));
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> i(Response response) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : response.headers().toMultimap().entrySet()) {
            String key = entry.getKey();
            String str = "";
            for (String str2 : entry.getValue()) {
                str = str.length() == 0 ? str2 : str + ';' + ((Object) str2);
            }
            linkedHashMap.put(key, str);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String j(FetchRequest requestData, Response response) {
        String strString;
        if (Intrinsics.areEqual(requestData.getResponseType(), AivsConfig.Tts.AUDIO_TYPE_STREAM)) {
            ResponseBody responseBodyBody = response.body();
            return Base64.encodeToString(responseBodyBody == null ? null : responseBodyBody.bytes(), 2);
        }
        ResponseBody responseBodyBody2 = response.body();
        return (responseBodyBody2 == null || (strString = responseBodyBody2.string()) == null) ? "" : strString;
    }

    private final void k(final FetchRequest requestData, OkHttpClient okHttpClient, Request request, final Map<String, String> responseData, final JavascriptExecuteInterface handler) {
        FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(request), new Callback() { // from class: com.huami.applet.jsengine.plugin.Fetch$enqueue$1
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                this.a.o(e, responseData, "request onFailure", handler);
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call, @NotNull Response response) {
                Object objM3845constructorimpl;
                Fetch fetch = this.a;
                FetchRequest fetchRequest = requestData;
                Map<String, String> map = responseData;
                JavascriptExecuteInterface javascriptExecuteInterface = handler;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    map.put("result", fetch.h(fetch.j(fetchRequest, response), fetch.i(response), response).toString());
                    fetch.n(map, javascriptExecuteInterface);
                    objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Fetch fetch2 = this.a;
                Map<String, String> map2 = responseData;
                JavascriptExecuteInterface javascriptExecuteInterface2 = handler;
                Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl != null) {
                    fetch2.o(thM3848exceptionOrNullimpl, map2, "onResponse error", javascriptExecuteInterface2);
                }
            }
        });
    }

    private final Map<String, String> l(String id) {
        HashMap map = new HashMap();
        map.put("id", id);
        map.put("status", "unknown error");
        map.put("statusText", "unknown error");
        return map;
    }

    private final void m(Map<String, String> fetchResponse, JavascriptExecuteInterface result) {
        JavascriptExecuteExtKt.onRpcMessage(result, "{\"jsonrpc\":\"hmV1.0\",\"id\":\"" + ((Object) fetchResponse.get("id")) + "\",\"error\":\"" + ((Object) fetchResponse.get("error")) + "\",\"result\":{\"status\":\"" + ((Object) fetchResponse.get("status")) + "\",\"statusText\":\"" + ((Object) fetchResponse.get("statusText")) + "\",\"headers\":null,\"body\":null}}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(Map<String, String> fetchResponse, JavascriptExecuteInterface result) {
        JavascriptExecuteExtKt.onRpcMessage(result, "{\"jsonrpc\":\"hmV1.0\",\"id\":\"" + ((Object) fetchResponse.get("id")) + "\",\"error\":null,\"result\":" + ((Object) fetchResponse.get("result")) + '}');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Throwable throwable, Map<String, String> responseData, String errorMsg, JavascriptExecuteInterface result) {
        responseData.put("error", errorMsg);
        m(responseData, result);
        throwable.printStackTrace();
        HMLog.error$default(ConstantKt.TAG_APPLET, ConstantKt.CODE_PLUGIN, null, new b(throwable), 4, null);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] actionNames() {
        return new String[]{RemoteConfigComponent.FETCH_FILE_NAME, "zeppOpenApi"};
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    public void invokeMethod(@NotNull String argument, @NotNull JavascriptExecuteInterface result) {
        Object objM3845constructorimpl;
        FetchRequest fetchRequestF = f(argument);
        if (fetchRequestF == null) {
            return;
        }
        Map<String, String> mapL = l(fetchRequestF.getId());
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            k(fetchRequestF, (new JSONObject(argument).getJSONObject("method").getString("module").equals("app.internal.network") && new JSONObject(argument).getJSONObject("method").getString("action").equals("zeppOpenApi")) ? this.httpCustomClient : this.httpClient, c(fetchRequestF).build(), mapL, result);
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            objM3845constructorimpl = kotlin.Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = kotlin.Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            o(thM3848exceptionOrNullimpl, mapL, "init error", result);
        }
        kotlin.Result.m3844boximpl(objM3845constructorimpl);
    }

    @Override // com.huami.applet.jsengine.plugin.AppletPlugin
    @NotNull
    public String[] moduleName() {
        return new String[]{"worker.service.network", "app.internal.network"};
    }
}
