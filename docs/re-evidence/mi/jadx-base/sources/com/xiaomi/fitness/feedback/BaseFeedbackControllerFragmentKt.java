package com.xiaomi.fitness.feedback;

import android.annotation.SuppressLint;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"actionFeedback", "", "manager", "Landroidx/fragment/app/FragmentManager;", "feedbackController", "Lcom/xiaomi/fitness/feedback/BaseFeedbackControllerFragment;", "feedback_chinaProductRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BaseFeedbackControllerFragmentKt {
    @SuppressLint({"FragmentLiveDataObserve"})
    public static final void actionFeedback(@Nullable FragmentManager fragmentManager, @NotNull BaseFeedbackControllerFragment feedbackController) {
        Intrinsics.checkNotNullParameter(feedbackController, "feedbackController");
        if (fragmentManager == null) {
            return;
        }
        k kVarO = fragmentManager.o();
        Intrinsics.checkNotNullExpressionValue(kVarO, "beginTransaction(...)");
        kVarO.f(feedbackController, null);
        kVarO.m();
    }
}
