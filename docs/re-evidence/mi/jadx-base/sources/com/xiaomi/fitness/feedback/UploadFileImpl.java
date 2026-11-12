package com.xiaomi.fitness.feedback;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.feedback.bugreport.FeedBackDeviceActivity;
import com.xiaomi.fitness.feedback.ui.FeedbackQuestionActivity;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/feedback/UploadFileImpl;", "Lcom/xiaomi/fitness/feedback/BaseUploadFile;", "<init>", "()V", "launchFeedback", "", "context", "Landroid/content/Context;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UploadFileImpl extends BaseUploadFile {
    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void launchFeedback(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE)) ? new Intent(ApplicationExtKt.getApplication(), (Class<?>) FeedbackQuestionActivity.class) : new Intent(ApplicationExtKt.getApplication(), (Class<?>) FeedBackDeviceActivity.class));
    }
}
