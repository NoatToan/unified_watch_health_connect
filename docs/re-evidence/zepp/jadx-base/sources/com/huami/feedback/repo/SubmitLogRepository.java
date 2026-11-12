package com.huami.feedback.repo;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/huami/feedback/repo/SubmitLogRepository;", "", "", SDKConstants.PARAM_USER_ID, "", "userName", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, FeedbackActivity.KEY_FEEDBACK_SOURCE, "", "submitLog", "(JLjava/lang/String;Lcom/huami/feedback/entity/UserForm;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface SubmitLogRepository {
    @Nullable
    Object submitLog(long j, @Nullable String str, @NotNull UserForm userForm, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation);
}
