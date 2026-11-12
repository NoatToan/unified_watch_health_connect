package com.huami.feedback.api;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J.\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\u000e"}, d2 = {"Lcom/huami/feedback/api/FeedbackService;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Lcom/huami/feedback/api/FeedbackParams;", "params", "", "feedback", "clearFeedbackNotification", "showAutoUploadLogConfigDialogIfNeeded", "feedback-api_release"}, k = 1, mv = {1, 5, 1})
public interface FeedbackService {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ void feedback$default(FeedbackService feedbackService, CoroutineScope coroutineScope, Context context, FragmentManager fragmentManager, FeedbackParams feedbackParams, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedback");
            }
            if ((i & 8) != 0) {
                feedbackParams = null;
            }
            feedbackService.feedback(coroutineScope, context, fragmentManager, feedbackParams);
        }
    }

    void clearFeedbackNotification(@NotNull Context context);

    void feedback(@Nullable CoroutineScope coroutineScope, @NotNull Context context, @NotNull FragmentManager fragmentManager, @Nullable FeedbackParams params);

    void showAutoUploadLogConfigDialogIfNeeded(@NotNull Context context, @NotNull FragmentManager fragmentManager);
}
