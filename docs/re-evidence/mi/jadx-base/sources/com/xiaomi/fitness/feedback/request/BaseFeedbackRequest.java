package com.xiaomi.fitness.feedback.request;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.feedback.data.DownloadFileModel;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.feedback.request.BaseFeedbackRequest;
import com.xiaomi.fitness.feedback.request.BaseFeedbackService;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
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
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001d*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u001dB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000bJJ\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000bJB\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000bJ8\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00142\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00070\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000b¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/BaseFeedbackRequest;", "S", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "Lcom/xiaomi/fitness/net/BaseRequest;", "<init>", "()V", "getFeedBackTypes", "", "params", "Lorg/json/JSONObject;", "success", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getUploadFileInfo", "scope", "Lkotlinx/coroutines/CoroutineScope;", "prefix", "", "suffix", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "feedback", "feedbackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "getDownloadFileInfo", "objName", "Lcom/xiaomi/fitness/feedback/data/DownloadFileModel$DownloadFileResult;", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBaseFeedbackRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseFeedbackRequest.kt\ncom/xiaomi/fitness/feedback/request/BaseFeedbackRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,65:1\n104#2,8:66\n110#2,2:74\n110#2,2:76\n104#2,8:78\n*S KotlinDebug\n*F\n+ 1 BaseFeedbackRequest.kt\ncom/xiaomi/fitness/feedback/request/BaseFeedbackRequest\n*L\n25#1:66,8\n38#1:74,2\n49#1:76,2\n60#1:78,8\n*E\n"})
public class BaseFeedbackRequest<S extends BaseFeedbackService> extends BaseRequest<S> {

    @NotNull
    public static final String TAG = "FeedbackRequest";

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$feedback$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "", "S", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$feedback$2", f = "BaseFeedbackRequest.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<S, Continuation<? super BaseResult<String>>, Object> {
        final /* synthetic */ FeedBackModelData $feedbackModel;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseFeedbackRequest<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BaseFeedbackRequest<S> baseFeedbackRequest, FeedBackModelData feedBackModelData, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = baseFeedbackRequest;
            this.$feedbackModel = feedBackModelData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$feedbackModel, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(S s, Continuation<? super BaseResult<String>> continuation) {
            return ((AnonymousClass2) create(s, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseFeedbackService baseFeedbackService = (BaseFeedbackService) this.L$0;
                String json = this.this$0.getMGson().toJson(this.$feedbackModel);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = baseFeedbackService.feedback(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$getDownloadFileInfo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/feedback/data/DownloadFileModel$DownloadFileResult;", "S", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$getDownloadFileInfo$2", f = "BaseFeedbackRequest.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23882 extends SuspendLambda implements Function2<S, Continuation<? super BaseResult<DownloadFileModel.DownloadFileResult>>, Object> {
        final /* synthetic */ String $objName;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseFeedbackRequest<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23882(BaseFeedbackRequest<S> baseFeedbackRequest, String str, Continuation<? super C23882> continuation) {
            super(2, continuation);
            this.this$0 = baseFeedbackRequest;
            this.$objName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C23882 c23882 = new C23882(this.this$0, this.$objName, continuation);
            c23882.L$0 = obj;
            return c23882;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(S s, Continuation<? super BaseResult<DownloadFileModel.DownloadFileResult>> continuation) {
            return ((C23882) create(s, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseFeedbackService baseFeedbackService = (BaseFeedbackService) this.L$0;
                String json = this.this$0.getMGson().toJson(new DownloadFileModel.DownloadFileRequest(this.$objName));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = baseFeedbackService.getDownloadFileInfo(json, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$getFeedBackTypes$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0004j\b\u0012\u0004\u0012\u00020\u0003`\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u0002H\u0005H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData$FeedBackType;", "Ljava/util/ArrayList;", "S", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$getFeedBackTypes$2", f = "BaseFeedbackRequest.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23892 extends SuspendLambda implements Function2<S, Continuation<? super BaseResult<ArrayList<FeedBackModelData.FeedBackType>>>, Object> {
        final /* synthetic */ JSONObject $params;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseFeedbackRequest<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23892(BaseFeedbackRequest<S> baseFeedbackRequest, JSONObject jSONObject, Continuation<? super C23892> continuation) {
            super(2, continuation);
            this.this$0 = baseFeedbackRequest;
            this.$params = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C23892 c23892 = new C23892(this.this$0, this.$params, continuation);
            c23892.L$0 = obj;
            return c23892;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(S s, Continuation<? super BaseResult<ArrayList<FeedBackModelData.FeedBackType>>> continuation) {
            return ((C23892) create(s, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseFeedbackService baseFeedbackService = (BaseFeedbackService) this.L$0;
                String json = this.this$0.getMGson().toJson(this.$params);
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
                this.label = 1;
                obj = baseFeedbackService.getFeedBackTypes(json, currentLocale$default, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$getUploadFileInfo$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "S", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.request.BaseFeedbackRequest$getUploadFileInfo$2", f = "BaseFeedbackRequest.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23902 extends SuspendLambda implements Function2<S, Continuation<? super BaseResult<UploadFileModel.UploadFileResult>>, Object> {
        final /* synthetic */ String $prefix;
        final /* synthetic */ String $suffix;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BaseFeedbackRequest<S> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23902(BaseFeedbackRequest<S> baseFeedbackRequest, String str, String str2, Continuation<? super C23902> continuation) {
            super(2, continuation);
            this.this$0 = baseFeedbackRequest;
            this.$prefix = str;
            this.$suffix = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C23902 c23902 = new C23902(this.this$0, this.$prefix, this.$suffix, continuation);
            c23902.L$0 = obj;
            return c23902;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(S s, Continuation<? super BaseResult<UploadFileModel.UploadFileResult>> continuation) {
            return ((C23902) create(s, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseFeedbackService baseFeedbackService = (BaseFeedbackService) this.L$0;
                String json = this.this$0.getMGson().toJson(new UploadFileModel.UploadFileRequest(this.$prefix, this.$suffix));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                this.label = 1;
                obj = baseFeedbackService.getUploadFileInfo(json, this);
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
    public static /* synthetic */ void feedback$default(BaseFeedbackRequest baseFeedbackRequest, CoroutineScope coroutineScope, FeedBackModelData feedBackModelData, Function1 function1, Function1 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedback");
        }
        if ((i & 1) != 0) {
            coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        }
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: q72
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BaseFeedbackRequest.feedback$lambda$2((ApiException) obj2);
                }
            };
        }
        baseFeedbackRequest.feedback(coroutineScope, feedBackModelData, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feedback$lambda$2(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getDownloadFileInfo$default(BaseFeedbackRequest baseFeedbackRequest, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDownloadFileInfo");
        }
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: n72
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BaseFeedbackRequest.getDownloadFileInfo$lambda$3((ApiException) obj2);
                }
            };
        }
        baseFeedbackRequest.getDownloadFileInfo(str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getDownloadFileInfo$lambda$3(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFeedBackTypes$default(BaseFeedbackRequest baseFeedbackRequest, JSONObject jSONObject, Function1 function1, Function1 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedBackTypes");
        }
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: o72
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BaseFeedbackRequest.getFeedBackTypes$lambda$0((ApiException) obj2);
                }
            };
        }
        baseFeedbackRequest.getFeedBackTypes(jSONObject, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFeedBackTypes$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUploadFileInfo$default(BaseFeedbackRequest baseFeedbackRequest, CoroutineScope coroutineScope, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) {
        CoroutineScope netCoroutineScope;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUploadFileInfo");
        }
        if ((i & 1) != 0) {
            netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
        } else {
            netCoroutineScope = coroutineScope;
        }
        baseFeedbackRequest.getUploadFileInfo(netCoroutineScope, str, str2, function1, (i & 16) != 0 ? new Function1() { // from class: p72
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj2) {
                return BaseFeedbackRequest.getUploadFileInfo$lambda$1((ApiException) obj2);
            }
        } : function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void feedback(@NotNull CoroutineScope scope, @NotNull FeedBackModelData feedbackModel, @NotNull Function1<? super String, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(feedbackModel, "feedbackModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(scope, getMService(), new AnonymousClass2(this, feedbackModel, null)).error(error).success(success);
    }

    public final void getDownloadFileInfo(@NotNull String objName, @NotNull Function1<? super DownloadFileModel.DownloadFileResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(objName, "objName");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.i(TAG, "getDownloadFileInfo obj:" + objName);
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C23882(this, objName, null)).error(error).success(success);
    }

    public final void getFeedBackTypes(@NotNull JSONObject params, @NotNull Function1<? super List<FeedBackModelData.FeedBackType>, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C23892(this, params, null)).error(error).success(success);
    }

    public final void getUploadFileInfo(@NotNull CoroutineScope scope, @NotNull String prefix, @NotNull String suffix, @NotNull Function1<? super UploadFileModel.UploadFileResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        Logger.i(TAG, "getUploadFileInfo prefix:" + prefix + ";suffix:" + suffix);
        new HttpFlow(scope, getMService(), new C23902(this, prefix, suffix, null)).error(error).success(success);
    }
}
