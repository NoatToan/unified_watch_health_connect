package com.xiaomi.fitness.health.net;

import com.xiaomi.fitness.health.net.SchemaRequest;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J8\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\nJ8\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/health/net/SchemaRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/health/net/SchemaService;", "<init>", "()V", "getSchemaUrl", "", "data", "Lcom/xiaomi/fitness/health/net/SchemaRequestData;", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/health/net/SchemaRes;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "downloadSchemaZip", "url", "", "Lokhttp3/ResponseBody;", "Companion", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchemaRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchemaRequest.kt\ncom/xiaomi/fitness/health/net/SchemaRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,48:1\n104#2,8:49\n104#2,8:57\n*S KotlinDebug\n*F\n+ 1 SchemaRequest.kt\ncom/xiaomi/fitness/health/net/SchemaRequest\n*L\n32#1:49,8\n41#1:57,8\n*E\n"})
public final class SchemaRequest extends BaseRequest<SchemaService> {

    @NotNull
    public static final String TAG = "SchemaRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.net.SchemaRequest$downloadSchemaZip$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lokhttp3/ResponseBody;", "it", "Lcom/xiaomi/fitness/health/net/SchemaService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.net.SchemaRequest$downloadSchemaZip$2", f = "SchemaRequest.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<SchemaService, Continuation<? super ResponseBody>, Object> {
        final /* synthetic */ String $url;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$url, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SchemaService schemaService, Continuation<? super ResponseBody> continuation) {
            return ((AnonymousClass2) create(schemaService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SchemaService schemaService = (SchemaService) this.L$0;
                String str = this.$url;
                this.label = 1;
                obj = schemaService.download(str, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.net.SchemaRequest$getSchemaUrl$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/health/net/SchemaRes;", "it", "Lcom/xiaomi/fitness/health/net/SchemaService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.net.SchemaRequest$getSchemaUrl$2", f = "SchemaRequest.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24762 extends SuspendLambda implements Function2<SchemaService, Continuation<? super BaseResult<SchemaRes>>, Object> {
        final /* synthetic */ SchemaRequestData $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24762(SchemaRequestData schemaRequestData, Continuation<? super C24762> continuation) {
            super(2, continuation);
            this.$data = schemaRequestData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C24762 c24762 = SchemaRequest.this.new C24762(this.$data, continuation);
            c24762.L$0 = obj;
            return c24762;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SchemaService schemaService, Continuation<? super BaseResult<SchemaRes>> continuation) {
            return ((C24762) create(schemaService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SchemaService schemaService = (SchemaService) this.L$0;
                String json = SchemaRequest.this.getMGson().toJson(this.$data);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = schemaService.getSchema(json, this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadSchemaZip$default(SchemaRequest schemaRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: egl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SchemaRequest.downloadSchemaZip$lambda$1((ApiException) obj2);
                }
            };
        }
        schemaRequest.downloadSchemaZip(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit downloadSchemaZip$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getSchemaUrl$default(SchemaRequest schemaRequest, SchemaRequestData schemaRequestData, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: dgl
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return SchemaRequest.getSchemaUrl$lambda$0((ApiException) obj2);
                }
            };
        }
        schemaRequest.getSchemaUrl(schemaRequestData, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getSchemaUrl$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void downloadSchemaZip(@NotNull String url, @NotNull Function1<? super ResponseBody, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass2(url, null)).error(error).success(success);
    }

    public final void getSchemaUrl(@NotNull SchemaRequestData data, @NotNull Function1<? super SchemaRes, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C24762(data, null)).error(error).success(success);
    }
}
