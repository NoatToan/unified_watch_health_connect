package com.xiaomi.fitness.feedback;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/feedback/FeedbackControllerFragment;", "Lcom/xiaomi/fitness/feedback/BaseFeedbackControllerFragment;", "<init>", "()V", "judgGotoDeviceFragment", "", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackControllerFragment extends BaseFeedbackControllerFragment {
    @Override // com.xiaomi.fitness.feedback.BaseFeedbackControllerFragment
    public void judgGotoDeviceFragment() {
        Intent intent = RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) ? new Intent(ApplicationExtKt.getApplication(), (Class<?>) FeedbackQuestionActivity.class) : new Intent(ApplicationExtKt.getApplication(), (Class<?>) FeedBackDeviceActivity.class);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.startActivityFromFragment(this, intent, 100);
        }
    }
}
