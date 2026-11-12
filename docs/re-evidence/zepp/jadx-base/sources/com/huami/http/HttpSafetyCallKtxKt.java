package com.huami.http;

import com.huami.http.bean.HttpResult;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.watch.transdata.transport.Actions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002\u001a1\u0010\b\u001a\u00020\u00032\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000f\u001a\u00020\u0003*\u00020\n2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0002\b\r\u001a\u0012\u0010\u000f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010\u001aB\u0010\u0017\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u001aJ\u0010\u001a\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u001aJ\u0010\u001b\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u001aN\u0010\u001c\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014\u001aW\u0010\u001d\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aW\u0010\u001f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a[\u0010 \u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001e\u001aO\u0010!\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00142\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lkotlin/Function0;", "Lokhttp3/Response;", "expression", "Lcom/huami/http/bean/HttpResult;", "a", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "b", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/http/HttpKit;", "Lokhttp3/Request$Builder;", "", "Lkotlin/ExtensionFunctionType;", "requestBuilder", "safeHttp", "Lokhttp3/Request;", "request", "", "url", "", "params", Actions.KEY_HEADERS, "safeHttpGet", "Lokhttp3/RequestBody;", "body", "safeHttpPost", "safeHttpPut", "safeHttpDelete", "safeAwaitHttpPost", "(Lcom/huami/http/HttpKit;Ljava/lang/String;Lokhttp3/RequestBody;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "safeAwaitHttpPut", "safeAwaitHttpDelete", "safeAwaitHttpGet", "(Lcom/huami/http/HttpKit;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "httpkit_release"}, k = 2, mv = {1, 5, 1})
public final class HttpSafetyCallKtxKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.http.HttpSafetyCallKtxKt$safeAwaitHttpDelete$2", f = "HttpSafetyCallKtx.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function1<Continuation<? super Response>, Object> {
        public int a;
        public final /* synthetic */ HttpKit b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RequestBody d;
        public final /* synthetic */ Map<String, String> e;
        public final /* synthetic */ Map<String, String> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HttpKit httpKit, String str, RequestBody requestBody, Map<String, String> map, Map<String, String> map2, Continuation<? super a> continuation) {
            super(1, continuation);
            this.b = httpKit;
            this.c = str;
            this.d = requestBody;
            this.e = map;
            this.f = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response> continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpKit httpKit = this.b;
                String str = this.c;
                RequestBody requestBody = this.d;
                Map<String, String> map = this.e;
                Map<String, String> map2 = this.f;
                this.a = 1;
                obj = HttpKitKtxKt.awaitHttpDelete(httpKit, str, requestBody, map, map2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.http.HttpSafetyCallKtxKt$safeAwaitHttpGet$2", f = "HttpSafetyCallKtx.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHESS}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function1<Continuation<? super Response>, Object> {
        public int a;
        public final /* synthetic */ HttpKit b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Map<String, String> d;
        public final /* synthetic */ Map<String, String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HttpKit httpKit, String str, Map<String, String> map, Map<String, String> map2, Continuation<? super b> continuation) {
            super(1, continuation);
            this.b = httpKit;
            this.c = str;
            this.d = map;
            this.e = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new b(this.b, this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response> continuation) {
            return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpKit httpKit = this.b;
                String str = this.c;
                Map<String, String> map = this.d;
                Map<String, String> map2 = this.e;
                this.a = 1;
                obj = HttpKitKtxKt.awaitHttpGet(httpKit, str, map, map2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.http.HttpSafetyCallKtxKt$safeAwaitHttpPost$2", f = "HttpSafetyCallKtx.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super Response>, Object> {
        public int a;
        public final /* synthetic */ HttpKit b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RequestBody d;
        public final /* synthetic */ Map<String, String> e;
        public final /* synthetic */ Map<String, String> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HttpKit httpKit, String str, RequestBody requestBody, Map<String, String> map, Map<String, String> map2, Continuation<? super c> continuation) {
            super(1, continuation);
            this.b = httpKit;
            this.c = str;
            this.d = requestBody;
            this.e = map;
            this.f = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpKit httpKit = this.b;
                String str = this.c;
                RequestBody requestBody = this.d;
                Map<String, String> map = this.e;
                Map<String, String> map2 = this.f;
                this.a = 1;
                obj = HttpKitKtxKt.awaitHttpPost(httpKit, str, requestBody, map, map2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.http.HttpSafetyCallKtxKt$safeAwaitHttpPut$2", f = "HttpSafetyCallKtx.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super Response>, Object> {
        public int a;
        public final /* synthetic */ HttpKit b;
        public final /* synthetic */ String c;
        public final /* synthetic */ RequestBody d;
        public final /* synthetic */ Map<String, String> e;
        public final /* synthetic */ Map<String, String> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HttpKit httpKit, String str, RequestBody requestBody, Map<String, String> map, Map<String, String> map2, Continuation<? super d> continuation) {
            super(1, continuation);
            this.b = httpKit;
            this.c = str;
            this.d = requestBody;
            this.e = map;
            this.f = map2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return new d(this.b, this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable Continuation<? super Response> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HttpKit httpKit = this.b;
                String str = this.c;
                RequestBody requestBody = this.d;
                Map<String, String> map = this.e;
                Map<String, String> map2 = this.f;
                this.a = 1;
                obj = HttpKitKtxKt.awaitHttpPut(httpKit, str, requestBody, map, map2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Response> {
        public final /* synthetic */ HttpKit a;
        public final /* synthetic */ Function1<Request.Builder, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(HttpKit httpKit, Function1<? super Request.Builder, Unit> function1) {
            super(0);
            this.a = httpKit;
            this.b = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke() {
            return HttpKitKtxKt.http(this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Response> {
        public final /* synthetic */ HttpKit a;
        public final /* synthetic */ Request b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HttpKit httpKit, Request request) {
            super(0);
            this.a = httpKit;
            this.b = request;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke() {
            return HttpKitKtxKt.http(this.a, this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<Response> {
        public final /* synthetic */ HttpKit a;
        public final /* synthetic */ String b;
        public final /* synthetic */ RequestBody c;
        public final /* synthetic */ Map<String, String> d;
        public final /* synthetic */ Map<String, String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HttpKit httpKit, String str, RequestBody requestBody, Map<String, String> map, Map<String, String> map2) {
            super(0);
            this.a = httpKit;
            this.b = str;
            this.c = requestBody;
            this.d = map;
            this.e = map2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke() {
            return HttpKitKtxKt.httpDelete(this.a, this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<Response> {
        public final /* synthetic */ HttpKit a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Map<String, String> c;
        public final /* synthetic */ Map<String, String> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HttpKit httpKit, String str, Map<String, String> map, Map<String, String> map2) {
            super(0);
            this.a = httpKit;
            this.b = str;
            this.c = map;
            this.d = map2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke() {
            return HttpKitKtxKt.httpGet(this.a, this.b, this.c, this.d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<Response> {
        public final /* synthetic */ HttpKit a;
        public final /* synthetic */ String b;
        public final /* synthetic */ RequestBody c;
        public final /* synthetic */ Map<String, String> d;
        public final /* synthetic */ Map<String, String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HttpKit httpKit, String str, RequestBody requestBody, Map<String, String> map, Map<String, String> map2) {
            super(0);
            this.a = httpKit;
            this.b = str;
            this.c = requestBody;
            this.d = map;
            this.e = map2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke() {
            return HttpKitKtxKt.httpPost(this.a, this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lokhttp3/Response;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<Response> {
        public final /* synthetic */ HttpKit a;
        public final /* synthetic */ String b;
        public final /* synthetic */ RequestBody c;
        public final /* synthetic */ Map<String, String> d;
        public final /* synthetic */ Map<String, String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(HttpKit httpKit, String str, RequestBody requestBody, Map<String, String> map, Map<String, String> map2) {
            super(0);
            this.a = httpKit;
            this.b = str;
            this.c = requestBody;
            this.d = map;
            this.e = map2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Response invoke() {
            return HttpKitKtxKt.httpPut(this.a, this.b, this.c, this.d, this.e);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.http.HttpSafetyCallKtxKt", f = "HttpSafetyCallKtx.kt", i = {}, l = {26}, m = "wrapHttpSuspendCall", n = {}, s = {})
    public static final class k extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int b;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return HttpSafetyCallKtxKt.b(null, this);
        }
    }

    private static final HttpResult a(Function0<Response> function0) {
        try {
            return new HttpResult.Response(function0.invoke());
        } catch (Throwable th) {
            return new HttpResult.Exception(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(Function1<? super Continuation<? super Response>, ? extends Object> function1, Continuation<? super HttpResult> continuation) {
        k kVar;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.b = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object objInvoke = kVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.b;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                kVar.b = 1;
                objInvoke = function1.invoke(kVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            return new HttpResult.Response((Response) objInvoke);
        } catch (Throwable th) {
            return new HttpResult.Exception(th);
        }
    }

    @Nullable
    public static final Object safeAwaitHttpDelete(@NotNull HttpKit httpKit, @NotNull String str, @Nullable RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super HttpResult> continuation) {
        return b(new a(httpKit, str, requestBody, map, map2, null), continuation);
    }

    @Nullable
    public static final Object safeAwaitHttpGet(@NotNull HttpKit httpKit, @NotNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super HttpResult> continuation) {
        return b(new b(httpKit, str, map, map2, null), continuation);
    }

    public static /* synthetic */ Object safeAwaitHttpGet$default(HttpKit httpKit, String str, Map map, Map map2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = null;
        }
        if ((i2 & 4) != 0) {
            map2 = null;
        }
        return safeAwaitHttpGet(httpKit, str, map, map2, continuation);
    }

    @Nullable
    public static final Object safeAwaitHttpPost(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super HttpResult> continuation) {
        return b(new c(httpKit, str, requestBody, map, map2, null), continuation);
    }

    @Nullable
    public static final Object safeAwaitHttpPut(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2, @NotNull Continuation<? super HttpResult> continuation) {
        return b(new d(httpKit, str, requestBody, map, map2, null), continuation);
    }

    @NotNull
    public static final HttpResult safeHttp(@NotNull HttpKit httpKit, @NotNull Function1<? super Request.Builder, Unit> function1) {
        return a(new e(httpKit, function1));
    }

    @NotNull
    public static final HttpResult safeHttpDelete(@NotNull HttpKit httpKit, @NotNull String str, @Nullable RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return a(new g(httpKit, str, requestBody, map, map2));
    }

    public static /* synthetic */ HttpResult safeHttpDelete$default(HttpKit httpKit, String str, RequestBody requestBody, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            requestBody = null;
        }
        if ((i2 & 4) != 0) {
            map = null;
        }
        if ((i2 & 8) != 0) {
            map2 = null;
        }
        return safeHttpDelete(httpKit, str, requestBody, map, map2);
    }

    @NotNull
    public static final HttpResult safeHttpGet(@NotNull HttpKit httpKit, @NotNull String str, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return a(new h(httpKit, str, map, map2));
    }

    public static /* synthetic */ HttpResult safeHttpGet$default(HttpKit httpKit, String str, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            map = null;
        }
        if ((i2 & 4) != 0) {
            map2 = null;
        }
        return safeHttpGet(httpKit, str, map, map2);
    }

    @NotNull
    public static final HttpResult safeHttpPost(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return a(new i(httpKit, str, requestBody, map, map2));
    }

    public static /* synthetic */ HttpResult safeHttpPost$default(HttpKit httpKit, String str, RequestBody requestBody, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = null;
        }
        if ((i2 & 8) != 0) {
            map2 = null;
        }
        return safeHttpPost(httpKit, str, requestBody, map, map2);
    }

    @NotNull
    public static final HttpResult safeHttpPut(@NotNull HttpKit httpKit, @NotNull String str, @NotNull RequestBody requestBody, @Nullable Map<String, String> map, @Nullable Map<String, String> map2) {
        return a(new j(httpKit, str, requestBody, map, map2));
    }

    public static /* synthetic */ HttpResult safeHttpPut$default(HttpKit httpKit, String str, RequestBody requestBody, Map map, Map map2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = null;
        }
        if ((i2 & 8) != 0) {
            map2 = null;
        }
        return safeHttpPut(httpKit, str, requestBody, map, map2);
    }

    @NotNull
    public static final HttpResult safeHttp(@NotNull HttpKit httpKit, @NotNull Request request) {
        return a(new f(httpKit, request));
    }
}
