package com.xiaomi.fitness.feedback.di;

import com.xiaomi.fitness.feedback.UploadFileImpl;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.WearosBugreportInter;
import com.xiaomi.fitness.feedback.util.FeedbackUploadDeviceLogDialogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/feedback/di/FeedbackSingleModule;", "", "<init>", "()V", "bindDeviceManager", "Lcom/xiaomi/fitness/feedback/export/UploadFileManager;", "uploadFileImpl", "Lcom/xiaomi/fitness/feedback/UploadFileImpl;", "bindFeedbackUploadDeviceLogDialogUtil", "Lcom/xiaomi/fitness/feedback/export/WearosBugreportInter;", "feedbackUploadDeviceLogDialogUtil", "Lcom/xiaomi/fitness/feedback/util/FeedbackUploadDeviceLogDialogUtil;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class FeedbackSingleModule {
    @NotNull
    public abstract UploadFileManager bindDeviceManager(@NotNull UploadFileImpl uploadFileImpl);

    @NotNull
    public abstract WearosBugreportInter bindFeedbackUploadDeviceLogDialogUtil(@NotNull FeedbackUploadDeviceLogDialogUtil feedbackUploadDeviceLogDialogUtil);
}
