package com.huami.ai.speech.alexa;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.ai.helper.SpeechKeeper;
import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.speech.alexa.capability.apigateway.ApiGatewayEventsImpl;
import com.huami.ai.speech.alexa.uitls.ConstantsKt;
import com.huami.tools.log.HMLog;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.m;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J%\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\tH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0014H\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\"R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/huami/ai/speech/alexa/DownChannelImpl;", "Lcom/huami/ai/speech/alexa/DownChannelApi;", "Lorg/koin/core/component/KoinComponent;", "", HTTP.CONTENT_RANGE_BYTES, "b", "a", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "", "e", "(Lkotlinx/coroutines/flow/FlowCollector;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "Ljava/io/InputStream;", "inputStream", "g", "", "note", "f", "c", "Lkotlinx/coroutines/flow/Flow;", "establish", "close", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "Lcom/huami/ai/speech/alexa/AlexaWebApi;", "webApi", "Lcom/huami/ai/notify/EngineExceptionNotify;", "Lcom/huami/ai/notify/EngineExceptionNotify;", "exceptionNotify", "Lokhttp3/Response;", "Lokhttp3/Response;", AbstractJSONTokenResponse.RESPONSE, "[B", "httpBoundaryIndicator", "Ljava/lang/String;", "startBoundaryIndicatorText", "startBoundaryIndicator", "partIndicator", "Lcom/huami/ai/speech/alexa/capability/apigateway/ApiGatewayEventsImpl;", "h", "Lcom/huami/ai/speech/alexa/capability/apigateway/ApiGatewayEventsImpl;", "apiGatewayEvents", "<init>", "(Lcom/huami/ai/speech/alexa/AlexaWebApi;Lcom/huami/ai/notify/EngineExceptionNotify;)V", "Companion", "speech-alexa_release"}, k = 1, mv = {1, 5, 1})
public final class DownChannelImpl implements DownChannelApi, KoinComponent {
    private static final long i = 8196;
    private static final byte j = 45;
    private static final byte k = 13;
    private static final byte l = 10;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AlexaWebApi webApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final EngineExceptionNotify exceptionNotify;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Response response;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final byte[] httpBoundaryIndicator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String startBoundaryIndicatorText;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final byte[] startBoundaryIndicator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String partIndicator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final ApiGatewayEventsImpl apiGatewayEvents;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Alexa endPoint不正确，重新连接DownChannel";
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
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("DownChannel response close error:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "DownChannel establish";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus(" full direct: ", new String(this.a, Charset.defaultCharset()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/ai/speech/alexa/MultipartResponse;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.alexa.DownChannelImpl$establish$1", f = "DownChannelApi.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<FlowCollector<? super MultipartResponse>, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        private /* synthetic */ Object d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "===========\n " + this.a + " \n===========";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public static final b a = new b();

            public b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "Alexa Down Channel closed";
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            e eVar = DownChannelImpl.this.new e(continuation);
            eVar.d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super MultipartResponse> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            BufferedSource bufferedSourceSource;
            Buffer buffer;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.d;
                Response response = DownChannelImpl.this.response;
                Objects.requireNonNull(response);
                ResponseBody responseBodyBody = response.body();
                flowCollector = flowCollector2;
                bufferedSourceSource = responseBodyBody == null ? null : responseBodyBody.source();
                buffer = new Buffer();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                buffer = (Buffer) this.b;
                bufferedSourceSource = (BufferedSource) this.a;
                flowCollector = (FlowCollector) this.d;
                ResultKt.throwOnFailure(obj);
            }
            while (bufferedSourceSource != null && !bufferedSourceSource.exhausted()) {
                if (bufferedSourceSource.read(buffer, DownChannelImpl.i) > 0) {
                    byte[] byteArray = buffer.readByteArray();
                    String str = new String(byteArray, Charset.defaultCharset());
                    HMLog.debug("speech", new a(str));
                    if (Arrays.equals(byteArray, DownChannelImpl.this.startBoundaryIndicator)) {
                        continue;
                    } else if (m.endsWith(str, DownChannelImpl.this.partIndicator, false)) {
                        byte[] bArrA = DownChannelImpl.this.a(DownChannelImpl.this.b(byteArray));
                        DownChannelImpl downChannelImpl = DownChannelImpl.this;
                        this.d = flowCollector;
                        this.a = bufferedSourceSource;
                        this.b = buffer;
                        this.c = 1;
                        if (downChannelImpl.e(flowCollector, bArrA, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        DownChannelImpl.this.f(str);
                    }
                }
            }
            HMLog.warn$default("speech", null, b.a, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("unHandle DownChannel Exception:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ JsonMultipart a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JsonMultipart jsonMultipart) {
            super(0);
            this.a = jsonMultipart;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a.getJson();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DownChannelImpl(@NotNull AlexaWebApi alexaWebApi, @NotNull EngineExceptionNotify engineExceptionNotify) {
        this.webApi = alexaWebApi;
        this.exceptionNotify = engineExceptionNotify;
        Charset charset = Charsets.UTF_8;
        this.httpBoundaryIndicator = "------abcde123".getBytes(charset);
        this.startBoundaryIndicatorText = "--------abcde123\r\n";
        Objects.requireNonNull("--------abcde123\r\n", "null cannot be cast to non-null type java.lang.String");
        this.startBoundaryIndicator = "--------abcde123\r\n".getBytes(charset);
        this.partIndicator = "------abcde123\r\n";
        this.apiGatewayEvents = new ApiGatewayEventsImpl(alexaWebApi, (Gson) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(Gson.class), null, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] a(byte[] bytes) {
        bytes[bytes.length - 2] = 45;
        bytes[bytes.length - 1] = 45;
        return ArraysKt___ArraysJvmKt.plus(bytes, new byte[]{13, 10});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] b(byte[] bytes) {
        return !m.startsWith$default(new String(bytes, Charset.defaultCharset()), this.startBoundaryIndicatorText, false, 2, null) ? ArraysKt___ArraysJvmKt.plus(this.startBoundaryIndicator, bytes) : bytes;
    }

    private final void c() {
        String strVerifyGateway = this.apiGatewayEvents.verifyGateway();
        if (strVerifyGateway != null) {
            HMLog.info("speech", a.a);
            SpeechKeeper.INSTANCE.saveAlexaEndPoint(strVerifyGateway);
            close();
            d();
        }
    }

    private final void d() {
        this.response = this.webApi.directives();
        HMLog.info("speech", c.a);
        Response response = this.response;
        Objects.requireNonNull(response);
        if (response.body() == null) {
            throw new RuntimeException("Alexa down channel establish failed!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(FlowCollector<? super MultipartResponse> flowCollector, byte[] bArr, Continuation<? super Unit> continuation) {
        HMLog.info("speech", new d(bArr));
        MultipartResponse multipartResponseG = g(new ByteArrayInputStream(bArr));
        if (multipartResponseG != null) {
            Object objEmit = flowCollector.emit(multipartResponseG, continuation);
            return objEmit == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objEmit : Unit.INSTANCE;
        }
        this.exceptionNotify.engineException(20);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(String note) {
        if (StringsKt__StringsKt.contains$default((CharSequence) note, (CharSequence) ConstantsKt.DOWN_CHANNEL_INVALID_TOKEN, false, 2, (Object) null)) {
            this.exceptionNotify.engineException(18);
        } else {
            HMLog.warn$default("speech", null, new f(note), 2, null);
        }
    }

    private final MultipartResponse g(InputStream inputStream) {
        Object objM3845constructorimpl;
        List<JsonMultipart> jsonParts;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(MultipartResponseKt.asMultipart$default(inputStream, this.httpBoundaryIndicator, 0, 2, (Object) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        MultipartResponse multipartResponse = (MultipartResponse) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        if (multipartResponse != null && (jsonParts = multipartResponse.getJsonParts()) != null) {
            Iterator<T> it2 = jsonParts.iterator();
            while (it2.hasNext()) {
                HMLog.info("speech", new g((JsonMultipart) it2.next()));
            }
        }
        return multipartResponse;
    }

    @Override // com.huami.ai.speech.alexa.DownChannelApi
    public void close() {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            Response response = this.response;
            if (response != null) {
                if (response == null) {
                    throw null;
                }
                response.close();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default("speech", null, null, new b(thM3848exceptionOrNullimpl), 6, null);
        }
    }

    @Override // com.huami.ai.speech.alexa.DownChannelApi
    @NotNull
    public Flow<MultipartResponse> establish() {
        d();
        c();
        return FlowKt.flow(new e(null));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
