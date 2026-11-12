package com.xiaomi.fitness.feedback.history;

import com.xiaomi.fitness.feedback.bugreport.BaseFeedbackModel;
import com.xiaomi.fitness.feedback.history.HistoryModel;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JU\u0010\n\u001a\u00020\u000b2,\u0010\f\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010j\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u0001`\r2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010j\u0004\u0018\u0001`\u0012¢\u0006\u0002\u0010\u0014R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/feedback/history/HistoryModel;", "Lcom/xiaomi/fitness/feedback/bugreport/BaseFeedbackModel;", "<init>", "()V", "mRequest", "Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "getMRequest", "()Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "setMRequest", "(Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;)V", "getHistories", "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "", "Lcom/xiaomi/fitness/feedback/history/HistoryDetail;", "Lkotlin/Function1;", "fail", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HistoryModel extends BaseFeedbackModel {
    public static final int NO_HISTORY = 1000;
    public FeedbackRequest mRequest;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHistories$lambda$0(Function1 function1, Function1 function2, List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            if (function1 != null) {
                function1.invoke(new ApiException(1000));
            }
        } else if (function2 != null) {
            function2.invoke(list);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getHistories$lambda$1(Function1 function1, ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    public final void getHistories(@Nullable final Function1<? super List<HistoryDetail>, Unit> success, @Nullable final Function1<? super ApiException, Unit> fail) {
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.arrayListOf(239, 273, 401, 400), ",", null, null, 0, null, null, 62, null);
        CoroutineDispatcher coroutineDispatcher = null;
        getMRequest().getHistories(new NetCoroutineScope(getLifecycleOwner(), null, coroutineDispatcher, 6, null), strJoinToString$default, new Function1() { // from class: r8c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryModel.getHistories$lambda$0(fail, success, (List) obj);
            }
        }, new Function1() { // from class: s8c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return HistoryModel.getHistories$lambda$1(fail, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final FeedbackRequest getMRequest() {
        FeedbackRequest feedbackRequest = this.mRequest;
        if (feedbackRequest != null) {
            return feedbackRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mRequest");
        return null;
    }

    public final void setMRequest(@NotNull FeedbackRequest feedbackRequest) {
        Intrinsics.checkNotNullParameter(feedbackRequest, "<set-?>");
        this.mRequest = feedbackRequest;
    }
}
