package com.huami.http;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.http.annotation.DelicateHttpApi;
import com.huami.http.helper.DownLoadHelper;
import com.huami.http.listener.DownLoadListener;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.huami.watch.transdata.transport.Actions;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.m;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0007\u001a\u0014\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0007\u001aD\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0007\u001aL\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0007\u001aL\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0007\u001aP\u0010\u0014\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0007\u001aW\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aW\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a[\u0010\u0018\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001aO\u0010\u0019\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a5\u0010\"\u001a\u0004\u0018\u00010\u001b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004\u001aX\u0010%\u001a\u00020\b*\u00020\u00002\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#H\u0002\u001a\u0014\u0010'\u001a\u00020&*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Lcom/huami/http/HttpKit;", "Lkotlin/Function1;", "Lokhttp3/Request$Builder;", "", "Lkotlin/ExtensionFunctionType;", "requestBuilder", "Lokhttp3/Response;", "http", "Lokhttp3/Request;", "request", "", "url", "", "params", Actions.KEY_HEADERS, "httpGet", "Lokhttp3/RequestBody;", "body", "httpPost", "httpPut", "httpDelete", "awaitHttpPost", "(Lcom/huami/http/HttpKit;Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitHttpPut", "awaitHttpDelete", "awaitHttpGet", "(Lcom/huami/http/HttpKit;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, GoogleApiAvailabilityLight.a, "(Lokhttp3/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePath", "Lcom/huami/http/listener/DownLoadListener;", WatchFaceApi.SORT_DOWNLOAD, "downloadFile", "Lcom/huami/http/RequestType;", "requestType", "a", "Lokhttp3/HttpUrl;", "c", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class HttpKitKtxKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Throwable, Unit> {
        public final /* synthetic */ Call a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Call call) {
            super(1);
            this.a = call;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            this.a.cancel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lokhttp3/Request$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Request.Builder, Unit> {
        public final /* synthetic */ Function1<Request.Builder, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Request.Builder, Unit> function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull Request.Builder builder) {
            this.a.invoke(builder);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Request.Builder builder) {
            a(builder);
            return Unit.INSTANCE;
        }
    }

    private static final Request a(final HttpKit httpKit, final Map<String, String> map, final String str, final RequestBody requestBody, final Map<String, String> map2, final RequestType requestType) {
        return OkHttpKtxKt.buildRequest(new Function1<Request.Builder, Unit>() { // from class: com.huami.http.HttpKitKtxKt$buildRequest$1

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RequestType.values().length];
                    iArr[RequestType.POST.ordinal()] = 1;
                    iArr[RequestType.PUT.ordinal()] = 2;
                    iArr[RequestType.DELETE.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lokhttp3/HttpUrl$Builder;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function1<HttpUrl.Builder, Unit> {
                public final /* synthetic */ Map<String, String> a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Map<String, String> map) {
                    super(1);
                    this.a = map;
                }

                public final void a(@NotNull HttpUrl.Builder builder) {
                    for (Map.Entry<String, String> entry : this.a.entrySet()) {
                        builder.addQueryParameter(entry.getKey(), entry.getValue());
                    }
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(HttpUrl.Builder builder) {
                    a(builder);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@NotNull Request.Builder builder) {
                builder.url(map == null ? HttpKitKtxKt.c(httpKit, str) : OkHttpKtxKt.newHttpUrl$default(HttpKitKtxKt.c(httpKit, str), null, new a(map), 1, null));
                RequestType requestType2 = requestType;
                int i = requestType2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[requestType2.ordinal()];
                if (i == 1) {
                    RequestBody requestBody2 = requestBody;
                    if (requestBody2 == null) {
                        Intrinsics.throwNpe();
                    }
                    builder.post(requestBody2);
                } else if (i == 2) {
                    RequestBody requestBody3 = requestBody;
                    if (requestBody3 == null) {
                        Intrinsics.throwNpe();
                    }
                    builder.put(requestBody3);
                } else if (i == 3) {
                    builder.delete(requestBody);
                }
                Map<String, String> map3 = map2;
                if (map3 == null || !(!map3.isEmpty())) {
                    return;
                }
                builder.headers(Headers.of((Map<String, String>) r.toMutableMap(map2)));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Request.Builder builder) {
                a(builder);
                return Unit.INSTANCE;
            }
        });
    }

    @DelicateHttpApi
    @Nullable
    public static final Object awaitHttpDelete(@NotNull HttpKit httpKit, @NotNull String str, @Nullable RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super Response> continuation) {
        return d(httpKit.okHttpClient().newCall(a(httpKit, map, str, requestBody, map2, RequestType.DELETE)), continuation);
    }

    @DelicateHttpApi
    @Nullable
    public static final Object awaitHttpGet(@NotNull HttpKit httpKit, @NotNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super Response> continuation) {
        return d(httpKit.okHttpClient().newCall(b(httpKit, map, str, null, map2, null, 20, null)), continuation);
    }

    public static /* synthetic */ Object awaitHttpGet$default(HttpKit httpKit, String str, Map map, Map map2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        return awaitHttpGet(httpKit, str, map, map2, continuation);
    }

    @DelicateHttpApi
    @Nullable
    public static final Object awaitHttpPost(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super Response> continuation) {
        return d(httpKit.okHttpClient().newCall(a(httpKit, map, str, requestBody, map2, RequestType.POST)), continuation);
    }

    @DelicateHttpApi
    @Nullable
    public static final Object awaitHttpPut(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super Response> continuation) {
        return d(httpKit.okHttpClient().newCall(a(httpKit, map, str, requestBody, map2, RequestType.PUT)), continuation);
    }

    public static /* synthetic */ Request b(HttpKit httpKit, Map map, String str, RequestBody requestBody, Map map2, RequestType requestType, int i, Object obj) {
        return a(httpKit, map, str, (i & 4) != 0 ? null : requestBody, map2, (i & 16) != 0 ? null : requestType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HttpUrl c(HttpKit httpKit, String str) {
        if (m.startsWith(str, "http://", true) || m.startsWith(str, "https://", true)) {
            return HttpUrl.get(str);
        }
        HttpKitContext httpKitContext = HttpKitContext.INSTANCE;
        if (httpKitContext.getFixBaseUrl()) {
            return HttpUrl.get(httpKitContext.getBaseUrl().toString() + str);
        }
        return HttpUrl.get(httpKit.baseUrl().toString() + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Call call, Continuation<? super Response> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.invokeOnCancellation(new a(call));
        FirebasePerfOkHttpClient.enqueue(call, new Callback() { // from class: com.huami.http.HttpKitKtxKt$enqueueCall$2$2
            @Override // okhttp3.Callback
            public void onFailure(@NotNull Call call2, @NotNull IOException e) {
                CancellableContinuation<Response> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(ResultKt.createFailure(e)));
            }

            @Override // okhttp3.Callback
            public void onResponse(@NotNull Call call2, @NotNull Response response) {
                CancellableContinuation<Response> cancellableContinuation = cancellableContinuationImpl;
                Result.Companion companion = Result.Companion;
                cancellableContinuation.resumeWith(Result.m3845constructorimpl(response));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Nullable
    public static final Call downloadFile(@NotNull HttpKit httpKit, @NotNull String str, @NotNull String str2, @NotNull Function1<? super DownLoadListener, Unit> function1) {
        Object objM3845constructorimpl;
        Pair<DownLoadListener, File> pairInitDownload$httpkit_release = DownLoadHelper.INSTANCE.initDownload$httpkit_release(function1, str2);
        DownLoadListener downLoadListenerComponent1 = pairInitDownload$httpkit_release.component1();
        File fileComponent2 = pairInitDownload$httpkit_release.component2();
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(httpKit.okHttpClient().newCall(b(httpKit, null, str, null, null, null, 16, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Function1<Throwable, Unit> failed$httpkit_release = downLoadListenerComponent1.getFailed$httpkit_release();
            if (failed$httpkit_release != null) {
                failed$httpkit_release.invoke(thM3848exceptionOrNullimpl);
            }
            return null;
        }
        DownLoadHelper.Companion companion3 = DownLoadHelper.INSTANCE;
        Object obj = Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl;
        if (obj == null) {
            Intrinsics.throwNpe();
        }
        companion3.downLoadTaskEnqueue$httpkit_release((Call) obj, downLoadListenerComponent1, fileComponent2, str2, str);
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Call) objM3845constructorimpl;
    }

    @DelicateHttpApi
    @NotNull
    public static final Response http(@NotNull HttpKit httpKit, @NotNull Function1<? super Request.Builder, Unit> function1) {
        return OkHttpKtxKt.call(httpKit.okHttpClient(), OkHttpKtxKt.buildRequest(new b(function1)));
    }

    @DelicateHttpApi
    @NotNull
    public static final Response httpDelete(@NotNull HttpKit httpKit, @NotNull String str, @Nullable RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return OkHttpKtxKt.call(httpKit.okHttpClient(), a(httpKit, map, str, requestBody, map2, RequestType.DELETE));
    }

    public static /* synthetic */ Response httpDelete$default(HttpKit httpKit, String str, RequestBody requestBody, Map map, Map map2, int i, Object obj) {
        if ((i & 2) != 0) {
            requestBody = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        return httpDelete(httpKit, str, requestBody, map, map2);
    }

    @DelicateHttpApi
    @NotNull
    public static final Response httpGet(@NotNull HttpKit httpKit, @NotNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return OkHttpKtxKt.call(httpKit.okHttpClient(), b(httpKit, map, str, null, map2, null, 20, null));
    }

    public static /* synthetic */ Response httpGet$default(HttpKit httpKit, String str, Map map, Map map2, int i, Object obj) {
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        return httpGet(httpKit, str, map, map2);
    }

    @DelicateHttpApi
    @NotNull
    public static final Response httpPost(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return OkHttpKtxKt.call(httpKit.okHttpClient(), a(httpKit, map, str, requestBody, map2, RequestType.POST));
    }

    public static /* synthetic */ Response httpPost$default(HttpKit httpKit, String str, RequestBody requestBody, Map map, Map map2, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        return httpPost(httpKit, str, requestBody, map, map2);
    }

    @DelicateHttpApi
    @NotNull
    public static final Response httpPut(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return OkHttpKtxKt.call(httpKit.okHttpClient(), a(httpKit, map, str, requestBody, map2, RequestType.PUT));
    }

    public static /* synthetic */ Response httpPut$default(HttpKit httpKit, String str, RequestBody requestBody, Map map, Map map2, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            map2 = null;
        }
        return httpPut(httpKit, str, requestBody, map, map2);
    }

    @DelicateHttpApi
    @NotNull
    public static final Response http(@NotNull HttpKit httpKit, @NotNull Request request) {
        return OkHttpKtxKt.call(httpKit.okHttpClient(), request);
    }
}
