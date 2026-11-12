package com.xiaomi.fitness.watch.face.request;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import com.xiaomi.fitness.watch.face.data.FaceIconZipRes;
import com.xiaomi.fitness.watch.face.export.data.FaceData;
import com.xiaomi.fitness.watch.face.request.FaceApiRequest;
import com.xiaomi.fitness.watch.face.request.FaceResult;
import java.util.ArrayList;
import java.util.List;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004Ji\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u000f`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u0014JQ\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00162\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0017`\u000e2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u0010j\u0002`\u0012¢\u0006\u0002\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/watch/face/request/FaceApiRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/xiaomi/fitness/watch/face/request/FaceApiService;", "<init>", "()V", "getFaceDetail", "", "model", "", "id", "version", "ids", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getFaceDataIcon", "", "Lcom/xiaomi/fitness/watch/face/data/FaceIconZipRes$DataBean;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaceApiRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaceApiRequest.kt\ncom/xiaomi/fitness/watch/face/request/FaceApiRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,55:1\n89#2,5:56\n89#2,5:61\n*S KotlinDebug\n*F\n+ 1 FaceApiRequest.kt\ncom/xiaomi/fitness/watch/face/request/FaceApiRequest\n*L\n23#1:56,5\n40#1:61,5\n*E\n"})
public final class FaceApiRequest extends BaseRequest<FaceApiService> {

    @NotNull
    private static final String TAG = "FaceApiRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequest$getFaceDataIcon$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/watch/face/request/FaceResult;", "Lcom/xiaomi/fitness/watch/face/data/FaceIconZipRes$DataBean;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequest$getFaceDataIcon$1", f = "FaceApiRequest.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<FaceApiService, Continuation<? super FaceResult<FaceIconZipRes.DataBean>>, Object> {
        final /* synthetic */ String $model;
        final /* synthetic */ int $version;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$version = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$model, this.$version, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiService faceApiService, Continuation<? super FaceResult<FaceIconZipRes.DataBean>> continuation) {
            return ((AnonymousClass1) create(faceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiService faceApiService = (FaceApiService) this.L$0;
                String str = this.$model;
                int i2 = this.$version;
                this.label = 1;
                obj = faceApiService.getFaceDataIcon(str, i2, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.request.FaceApiRequest$getFaceDetail$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/watch/face/request/FaceResult;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceData;", "it", "Lcom/xiaomi/fitness/watch/face/request/FaceApiService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.watch.face.request.FaceApiRequest$getFaceDetail$1", f = "FaceApiRequest.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {})
    public static final class C33841 extends SuspendLambda implements Function2<FaceApiService, Continuation<? super FaceResult<FaceData>>, Object> {
        final /* synthetic */ String $id;
        final /* synthetic */ List<String> $ids;
        final /* synthetic */ String $model;
        final /* synthetic */ String $version;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FaceApiRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33841(String str, String str2, String str3, FaceApiRequest faceApiRequest, List<String> list, Continuation<? super C33841> continuation) {
            super(2, continuation);
            this.$model = str;
            this.$id = str2;
            this.$version = str3;
            this.this$0 = faceApiRequest;
            this.$ids = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C33841 c33841 = new C33841(this.$model, this.$id, this.$version, this.this$0, this.$ids, continuation);
            c33841.L$0 = obj;
            return c33841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FaceApiService faceApiService, Continuation<? super FaceResult<FaceData>> continuation) {
            return ((C33841) create(faceApiService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FaceApiService faceApiService = (FaceApiService) this.L$0;
                String str = this.$model;
                String str2 = this.$id;
                String str3 = this.$version;
                String json = this.this$0.getMGson().toJson(this.$ids);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = faceApiService.getFaceDetail(str, str2, str3, json, this);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceDataIcon$lambda$1(Function1 success, Function1 fail, FaceResult result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.isSuccess() || result.getData() == null) {
            fail.invoke2(new ApiException(result.getMsg(), result.getCode()));
        } else {
            Object data = result.getData();
            Intrinsics.checkNotNull(data);
            success.invoke2(data);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFaceDetail$default(FaceApiRequest faceApiRequest, String str, String str2, String str3, List list, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            list = new ArrayList();
        }
        faceApiRequest.getFaceDetail(str, str2, str3, list, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFaceDetail$lambda$0(Function1 success, Function1 fail, FaceResult result) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(fail, "$fail");
        Intrinsics.checkNotNullParameter(result, "result");
        if (!result.isSuccess() || result.getData() == null) {
            fail.invoke2(new ApiException(result.getMsg(), result.getCode()));
        } else {
            Object data = result.getData();
            Intrinsics.checkNotNull(data);
            success.invoke2(data);
        }
        return Unit.INSTANCE;
    }

    public final void getFaceDataIcon(@NotNull String model, int version, @NotNull final Function1<? super FaceIconZipRes.DataBean, Unit> success, @NotNull final Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(model, version, null)).error(fail).success(new Function1() { // from class: om8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequest.getFaceDataIcon$lambda$1(success, fail, (FaceResult) obj);
            }
        });
    }

    public final void getFaceDetail(@NotNull String model, @NotNull String id, @NotNull String version, @NotNull List<String> ids, @NotNull final Function1<? super FaceData, Unit> success, @NotNull final Function1<? super ApiException, Unit> fail) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(fail, "fail");
        Logger.i(TAG, "try getFaceDetail: " + id);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C33841(model, id, version, this, ids, null)).error(fail).success(new Function1() { // from class: nm8
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FaceApiRequest.getFaceDetail$lambda$0(success, fail, (FaceResult) obj);
            }
        });
    }
}
