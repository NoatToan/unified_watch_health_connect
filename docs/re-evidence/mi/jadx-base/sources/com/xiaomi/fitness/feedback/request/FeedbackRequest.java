package com.xiaomi.fitness.feedback.request;

import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.feedback.history.HistoryDetail;
import com.xiaomi.fitness.feedback.history.HistoryResult;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.request.TagsResult;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004JH\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0012JH\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u001a\u0010\u0011\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u0012R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackRequest;", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;", "<init>", "()V", "mRequestService", "Lcom/xiaomi/fitness/feedback/request/FeedbackService;", "getMRequestService", "()Lcom/xiaomi/fitness/feedback/request/FeedbackService;", "mRequestService$delegate", "Lkotlin/Lazy;", "getFeedbackTypes", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "params", "Lorg/json/JSONObject;", "success", "Lkotlin/Function1;", "", "Lcom/xiaomi/fitness/feedback/request/TagsResult$Tag;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "getHistories", "scope", "Lkotlinx/coroutines/CoroutineScope;", "moduleIds", "", "Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedbackRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackRequest.kt\ncom/xiaomi/fitness/feedback/request/FeedbackRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,53:1\n93#2:54\n93#2:55\n*S KotlinDebug\n*F\n+ 1 FeedbackRequest.kt\ncom/xiaomi/fitness/feedback/request/FeedbackRequest\n*L\n29#1:54\n44#1:55\n*E\n"})
public final class FeedbackRequest extends BaseFeedbackRequest<BaseFeedbackService> {

    /* JADX INFO: renamed from: mRequestService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRequestService = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ak9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FeedbackRequest.mRequestService_delegate$lambda$0(this.f1123a);
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.request.FeedbackRequest$getFeedbackTypes$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/feedback/request/TagsResult;", "it", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.request.FeedbackRequest$getFeedbackTypes$2", f = "FeedbackRequest.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<BaseFeedbackService, Continuation<? super BaseResult<TagsResult>>, Object> {
        final /* synthetic */ JSONObject $params;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(JSONObject jSONObject, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$params = jSONObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FeedbackRequest.this.new AnonymousClass2(this.$params, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseFeedbackService baseFeedbackService, Continuation<? super BaseResult<TagsResult>> continuation) {
            return ((AnonymousClass2) create(baseFeedbackService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FeedbackService mRequestService = FeedbackRequest.this.getMRequestService();
                String string = this.$params.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                String currentLocale = LocaleUtil.getCurrentLocale();
                this.label = 1;
                obj = mRequestService.getFeedbackTypes(string, currentLocale, this);
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

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.request.FeedbackRequest$getHistories$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "it", "Lcom/xiaomi/fitness/feedback/request/BaseFeedbackService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.request.FeedbackRequest$getHistories$2", f = "FeedbackRequest.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class C23912 extends SuspendLambda implements Function2<BaseFeedbackService, Continuation<? super List<? extends HistoryDetail>>, Object> {
        final /* synthetic */ String $moduleIds;
        int label;
        final /* synthetic */ FeedbackRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23912(String str, FeedbackRequest feedbackRequest, Continuation<? super C23912> continuation) {
            super(2, continuation);
            this.$moduleIds = str;
            this.this$0 = feedbackRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C23912(this.$moduleIds, this.this$0, continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(BaseFeedbackService baseFeedbackService, Continuation<? super List<HistoryDetail>> continuation) {
            return ((C23912) create(baseFeedbackService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws JSONException {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("module_ids", this.$moduleIds);
                FeedbackService mRequestService = this.this$0.getMRequestService();
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                obj = mRequestService.getHistories(string, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            HistoryResult historyResult = (HistoryResult) ((BaseResult) obj).getResult();
            if (historyResult != null) {
                return historyResult.getData();
            }
            return null;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(BaseFeedbackService baseFeedbackService, Continuation<? super List<? extends HistoryDetail>> continuation) {
            return invoke2(baseFeedbackService, (Continuation<? super List<HistoryDetail>>) continuation);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getFeedbackTypes$default(FeedbackRequest feedbackRequest, LifecycleOwner lifecycleOwner, JSONObject jSONObject, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: zj9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FeedbackRequest.getFeedbackTypes$lambda$1((ApiException) obj2);
                }
            };
        }
        feedbackRequest.getFeedbackTypes(lifecycleOwner, jSONObject, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFeedbackTypes$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFeedbackTypes$lambda$2(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getFeedbackTypes$lambda$3(Function1 success, TagsResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it.getTagList());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getHistories$default(FeedbackRequest feedbackRequest, CoroutineScope coroutineScope, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: yj9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FeedbackRequest.getHistories$lambda$4((ApiException) obj2);
                }
            };
        }
        feedbackRequest.getHistories(coroutineScope, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHistories$lambda$4(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackService getMRequestService() {
        return (FeedbackService) this.mRequestService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FeedbackService mRequestService_delegate$lambda$0(FeedbackRequest this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return (FeedbackService) this$0.getRepository().getService(FeedbackService.class);
    }

    public final void getFeedbackTypes(@Nullable LifecycleOwner lifecycleOwner, @NotNull JSONObject params, @NotNull final Function1<? super List<TagsResult.Tag>, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(lifecycleOwner, null, null, 6, null), getMService(), new AnonymousClass2(params, null)).error(new Function1() { // from class: wj9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackRequest.getFeedbackTypes$lambda$2(error, (ApiException) obj);
            }
        }).success(new Function1() { // from class: xj9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackRequest.getFeedbackTypes$lambda$3(success, (TagsResult) obj);
            }
        });
    }

    public final void getHistories(@NotNull CoroutineScope scope, @NotNull String moduleIds, @NotNull Function1<? super List<HistoryDetail>, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(moduleIds, "moduleIds");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(scope, getMService(), new C23912(moduleIds, this, null)).error(error).success(success);
    }
}
