package com.huami.http;

import androidx.core.app.NotificationCompat;
import com.amazon.alexa.avs.http.HttpHeaders;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.watch.notification.TransportUri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008a\u0001\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u001a9\u0010\u0005\u001a\u00020\u00042*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t\u001a\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0001\u001a\"\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\b\u001a.\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\b\u001a.\u0010\u001b\u001a\u00020\u00042#\b\u0004\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\r0\u000bH\u0086\b\u001a\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u001a,\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!\u001a3\u0010'\u001a\u00020$*\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00012\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e\u001a#\u0010*\u001a\u00020)2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e\u001a\u0012\u0010.\u001a\u00020-*\u00020+2\u0006\u0010,\u001a\u00020)¨\u0006/"}, d2 = {"", "", "", SportAnalytics.ParamValue.MapButtonType.MAP, "Lokhttp3/RequestBody;", "buildRequestJsonBody", "", "Lkotlin/Pair;", "kvs", "([Lkotlin/Pair;)Lokhttp3/RequestBody;", "body", "Lkotlin/Function1;", "Lokhttp3/FormBody$Builder;", "", "Lkotlin/ExtensionFunctionType;", TransportUri.ACTION_BLOCK, "Lokhttp3/FormBody;", "buildRequestFormBody", HttpHeaders.Parameters.BOUNDARY, "Lokhttp3/MultipartBody$Builder;", "Lokhttp3/MultipartBody;", "buildRequestMultipartBody", "Lokio/BufferedSink;", "Lkotlin/ParameterName;", "name", "sink", "writeToBlock", "buildRequestStreamBody", "Ljava/io/InputStream;", "input", "type", "", "content", "", "offset", "byteCount", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl$Builder;", "newHttpUrl", "Lokhttp3/Request$Builder;", "Lokhttp3/Request;", "buildRequest", "Lokhttp3/OkHttpClient;", "request", "Lokhttp3/Response;", NotificationCompat.CATEGORY_CALL, "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class OkHttpKtxKt {
    @NotNull
    public static final Request buildRequest(@Nullable Function1<? super Request.Builder, Unit> function1) {
        Request.Builder builder = new Request.Builder();
        if (function1 != null) {
            function1.invoke(builder);
        }
        return builder.build();
    }

    public static /* synthetic */ Request buildRequest$default(Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return buildRequest(function1);
    }

    @NotNull
    public static final FormBody buildRequestFormBody(@NotNull Function1<? super FormBody.Builder, Unit> function1) {
        FormBody.Builder builder = new FormBody.Builder();
        function1.invoke(builder);
        return builder.build();
    }

    @NotNull
    public static final RequestBody buildRequestJsonBody(@NotNull Map<String, ? extends Object> map) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }

    @NotNull
    public static final MultipartBody buildRequestMultipartBody(@Nullable String str, @NotNull Function1<? super MultipartBody.Builder, Unit> function1) {
        MultipartBody.Builder builder = str == null ? new MultipartBody.Builder() : new MultipartBody.Builder(str);
        function1.invoke(builder);
        return builder.build();
    }

    public static /* synthetic */ MultipartBody buildRequestMultipartBody$default(String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MultipartBody.Builder builder = str == null ? new MultipartBody.Builder() : new MultipartBody.Builder(str);
        function1.invoke(builder);
        return builder.build();
    }

    @NotNull
    public static final RequestBody buildRequestStreamBody(@NotNull final Function1<? super BufferedSink, Unit> function1) {
        return new RequestBody() { // from class: com.huami.http.OkHttpKtxKt.buildRequestStreamBody.1
            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.get("application/octet-stream");
            }

            @Override // okhttp3.RequestBody
            public void writeTo(@NotNull BufferedSink sink) {
                function1.invoke(sink);
            }
        };
    }

    public static /* synthetic */ RequestBody buildRequestStreamBody$default(String str, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = "application/octet-stream";
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return buildRequestStreamBody(str, bArr, i, i2);
    }

    @NotNull
    public static final Response call(@NotNull OkHttpClient okHttpClient, @NotNull Request request) {
        return FirebasePerfOkHttpClient.execute(okHttpClient.newCall(request));
    }

    @NotNull
    public static final HttpUrl newHttpUrl(@NotNull HttpUrl httpUrl, @Nullable String str, @Nullable Function1<? super HttpUrl.Builder, Unit> function1) {
        HttpUrl.Builder builderNewBuilder;
        HttpUrl.Builder builderNewBuilder2 = (str == null || (builderNewBuilder = httpUrl.newBuilder(str)) == null) ? httpUrl.newBuilder() : builderNewBuilder;
        if (function1 != null) {
            function1.invoke(builderNewBuilder2);
        }
        return builderNewBuilder2.build();
    }

    public static /* synthetic */ HttpUrl newHttpUrl$default(HttpUrl httpUrl, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        return newHttpUrl(httpUrl, str, function1);
    }

    @NotNull
    public static final RequestBody buildRequestStreamBody(@NotNull final InputStream inputStream) {
        return new RequestBody() { // from class: com.huami.http.OkHttpKtxKt.buildRequestStreamBody.2
            @Override // okhttp3.RequestBody
            @Nullable
            public MediaType contentType() {
                return MediaType.get("application/octet-stream");
            }

            @Override // okhttp3.RequestBody
            public void writeTo(@NotNull BufferedSink sink) throws IOException {
                sink.writeAll(Okio.source(inputStream));
            }
        };
    }

    @NotNull
    public static final RequestBody buildRequestStreamBody(@NotNull String str, @NotNull byte[] bArr, int i, int i2) {
        return RequestBody.create(MediaType.parse(str), bArr, i, i2);
    }

    @NotNull
    public static final RequestBody buildRequestJsonBody(@NotNull Pair<String, String>... pairArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int length = pairArr.length;
        int i = 0;
        while (i < length) {
            Pair<String, String> pair = pairArr[i];
            i++;
            jSONObject.put(pair.component1(), pair.component2());
        }
        return RequestBody.create(MediaType.parse("application/json"), jSONObject.toString());
    }

    @NotNull
    public static final RequestBody buildRequestJsonBody(@NotNull String str) {
        return RequestBody.create(MediaType.parse("application/json"), str);
    }
}
