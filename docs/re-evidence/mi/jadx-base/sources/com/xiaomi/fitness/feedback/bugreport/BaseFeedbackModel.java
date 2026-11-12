package com.xiaomi.fitness.feedback.bugreport;

import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.BaseModel;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/BaseFeedbackModel;", "Lcom/xiaomi/fitness/baseui/BaseModel;", "<init>", "()V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BaseFeedbackModel extends BaseModel {
    public static final int MSG_DIALOG_DISMISS = 2;
    public static final int MSG_DIALOG_SHOW = 1;

    @Nullable
    private LifecycleOwner lifecycleOwner;

    @Nullable
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
    }
}
