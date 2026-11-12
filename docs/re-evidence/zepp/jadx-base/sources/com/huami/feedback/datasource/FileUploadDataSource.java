package com.huami.feedback.datasource;

import com.huami.feedback.entity.PostFeedbackInfoResult;
import com.huami.feedback.entity.UploadBaseParams;
import com.huami.feedback.entity.UploadDeviceInfo;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H¦@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/huami/feedback/datasource/FileUploadDataSource;", "", "Lcom/huami/feedback/entity/UploadBaseParams;", "baseParams", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, "Lcom/huami/feedback/entity/UploadDeviceInfo;", "uploadDeviceInfo", "Lcom/huami/feedback/entity/PostFeedbackInfoResult;", "postFeedbackInfo", "(Lcom/huami/feedback/entity/UploadBaseParams;Lcom/huami/feedback/entity/UserForm;Lcom/huami/feedback/entity/UploadDeviceInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "putUrl", "Ljava/io/File;", "zipFile", "", "uploadLogFile", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "loginUID", "syncTime", "reportLogFileUploadResult", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public interface FileUploadDataSource {
    @Nullable
    Object postFeedbackInfo(@NotNull UploadBaseParams uploadBaseParams, @NotNull UserForm userForm, @NotNull UploadDeviceInfo uploadDeviceInfo, @NotNull Continuation<? super PostFeedbackInfoResult> continuation);

    @Nullable
    Object reportLogFileUploadResult(long j, long j2, @NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object uploadLogFile(@NotNull String str, @NotNull File file, @NotNull Continuation<? super Boolean> continuation);
}
