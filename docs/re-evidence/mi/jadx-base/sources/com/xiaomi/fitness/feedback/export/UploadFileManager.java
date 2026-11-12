package com.xiaomi.fitness.feedback.export;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 #2\u00020\u0001:\u0001#J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J2\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&JL\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0016H&JD\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00030\u0016H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"H&¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/UploadFileManager;", "", "uploadFile", "", "uploadUrl", "", "gotoFragmentManager", "manager", "Landroidx/fragment/app/FragmentManager;", "uploadLogFile", "isUploadFile", "", "objName", "logPath", "extraFile", "Ljava/io/File;", "getUploadFileInfo", "scope", "Lkotlinx/coroutines/CoroutineScope;", "prefix", "suffix", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "feedback", "feedbackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "popCommentIfNeed", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "launchFeedback", "context", "Landroid/content/Context;", "Companion", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UploadFileManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/feedback/export/UploadFileManager$Companion;", "", "<init>", "()V", "feedback-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void feedback$default(UploadFileManager uploadFileManager, CoroutineScope coroutineScope, FeedBackModelData feedBackModelData, Function1 function1, Function1 function2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: feedback");
            }
            if ((i & 1) != 0) {
                coroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            }
            if ((i & 8) != 0) {
                function2 = new Function1() { // from class: ucq
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UploadFileManager.DefaultImpls.feedback$lambda$1((ApiException) obj2);
                    }
                };
            }
            uploadFileManager.feedback(coroutineScope, feedBackModelData, function1, function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit feedback$lambda$1(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void getUploadFileInfo$default(UploadFileManager uploadFileManager, CoroutineScope coroutineScope, String str, String str2, Function1 function1, Function1 function2, int i, Object obj) {
            CoroutineScope netCoroutineScope;
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUploadFileInfo");
            }
            if ((i & 1) != 0) {
                netCoroutineScope = new NetCoroutineScope(null, null, null, 7, null);
            } else {
                netCoroutineScope = coroutineScope;
            }
            uploadFileManager.getUploadFileInfo(netCoroutineScope, str, str2, function1, (i & 16) != 0 ? new Function1() { // from class: tcq
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return UploadFileManager.DefaultImpls.getUploadFileInfo$lambda$0((ApiException) obj2);
                }
            } : function2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Unit getUploadFileInfo$lambda$0(ApiException it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    void feedback(@NotNull CoroutineScope scope, @NotNull FeedBackModelData feedbackModel, @NotNull Function1<? super String, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void getUploadFileInfo(@NotNull CoroutineScope scope, @NotNull String prefix, @NotNull String suffix, @NotNull Function1<? super UploadFileModel.UploadFileResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error);

    void gotoFragmentManager(@Nullable FragmentManager manager);

    void launchFeedback(@NotNull Context context);

    void popCommentIfNeed(@NotNull FragmentActivity fragmentActivity);

    void uploadFile(@Nullable String uploadUrl, @Nullable String uploadFile);

    void uploadLogFile(boolean isUploadFile, @NotNull String objName, @NotNull String uploadUrl, @NotNull String logPath, @Nullable File extraFile);
}
