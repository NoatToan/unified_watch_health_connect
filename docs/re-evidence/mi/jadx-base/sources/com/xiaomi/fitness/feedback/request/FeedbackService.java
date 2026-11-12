package com.xiaomi.fitness.feedback.request;

import com.xiaomi.fitness.feedback.history.HistoryResult;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.url.BaseUrl;
import com.xiaomi.fitness.net.url.Secret;
import defpackage.uua;
import defpackage.xfi;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@BaseUrl(host = "https://hlth.io.mi.com/", path = "healthapp/")
@Secret(pathPrefix = "healthapp/")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/feedback/request/FeedbackService;", "", "getFeedbackTypes", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/xiaomi/fitness/feedback/request/TagsResult;", "moduleIds", "", "locale", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHistories", "Lcom/xiaomi/fitness/feedback/history/HistoryResult;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface FeedbackService {
    @Nullable
    @uua("stat/feedback_tags_v2")
    Object getFeedbackTypes(@NotNull @xfi("data") String str, @NotNull @xfi("locale") String str2, @NotNull Continuation<? super BaseResult<TagsResult>> continuation);

    @Nullable
    @uua("stat/get_feedback_list_by_uid")
    Object getHistories(@NotNull @xfi("data") String str, @NotNull Continuation<? super BaseResult<HistoryResult>> continuation);
}
