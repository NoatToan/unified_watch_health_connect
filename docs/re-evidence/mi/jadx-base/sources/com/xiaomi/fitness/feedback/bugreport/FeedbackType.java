package com.xiaomi.fitness.feedback.bugreport;

import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackType;", "", "<init>", "()V", Constants.ENTRY_TYPE_APP, "", "WEARDEVICE", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FeedbackType {
    public static final int APP = 1;

    @NotNull
    public static final FeedbackType INSTANCE = new FeedbackType();
    public static final int WEARDEVICE = 2;

    private FeedbackType() {
    }
}
