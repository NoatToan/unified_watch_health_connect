package com.xiaomi.fitness.feedback;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.feedback.BaseUploadFile;
import com.xiaomi.fitness.feedback.export.UploadFileManager;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.feedback.preference.FeedbackPreference;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.util.UploadFileUtil;
import com.xiaomi.fitness.net.response.ApiException;
import defpackage.a0j;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import miuix.appcompat.app.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J2\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016JH\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0018H\u0016J@\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00050\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020!H\u0016¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/feedback/BaseUploadFile;", "Lcom/xiaomi/fitness/feedback/export/UploadFileManager;", "<init>", "()V", "uploadFile", "", "uploadUrl", "", "gotoFragmentManager", "manager", "Landroidx/fragment/app/FragmentManager;", "uploadLogFile", "isUploadFile", "", "objName", "logPath", "extraFile", "Ljava/io/File;", "getUploadFileInfo", "scope", "Lkotlinx/coroutines/CoroutineScope;", "prefix", "suffix", "success", "Lkotlin/Function1;", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "feedback", "feedbackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "popCommentIfNeed", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseUploadFile implements UploadFileManager {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feedback$lambda$2(Function1 success, String it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit feedback$lambda$3(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$0(Function1 success, UploadFileModel.UploadFileResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$1(Function1 error, ApiException it) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(it, "it");
        error.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popCommentIfNeed$lambda$4(int i, BaseUploadFile this$0, FragmentActivity fragmentActivity, int i2, DialogInterface dialogInterface, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentActivity, "$fragmentActivity");
        if (i3 == i) {
            this$0.gotoFragmentManager(fragmentActivity.getSupportFragmentManager());
        } else if (i3 != i2) {
            AppUtil.INSTANCE.goMiOrPlayMarket();
        }
    }

    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void feedback(@NotNull CoroutineScope scope, @NotNull FeedBackModelData feedbackModel, @NotNull final Function1<? super String, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(feedbackModel, "feedbackModel");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new FeedbackRequest().feedback(scope, feedbackModel, new Function1() { // from class: af2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseUploadFile.feedback$lambda$2(success, (String) obj);
            }
        }, new Function1() { // from class: bf2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseUploadFile.feedback$lambda$3(error, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void getUploadFileInfo(@NotNull CoroutineScope scope, @NotNull String prefix, @NotNull String suffix, @NotNull final Function1<? super UploadFileModel.UploadFileResult, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new FeedbackRequest().getUploadFileInfo(scope, prefix, suffix, new Function1() { // from class: cf2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseUploadFile.getUploadFileInfo$lambda$0(success, (UploadFileModel.UploadFileResult) obj);
            }
        }, new Function1() { // from class: df2
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return BaseUploadFile.getUploadFileInfo$lambda$1(error, (ApiException) obj);
            }
        });
    }

    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void gotoFragmentManager(@Nullable FragmentManager manager) {
        BaseFeedbackControllerFragmentKt.actionFeedback(manager, new FeedbackControllerFragment());
    }

    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void popCommentIfNeed(@NotNull final FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        FeedbackPreference feedbackPreference = FeedbackPreference.INSTANCE;
        long comment_version = feedbackPreference.getCOMMENT_VERSION();
        boolean zIsXiaomi = RomUtils.isXiaomi();
        long versionCode = AppUtil.getVersionCode();
        if ((zIsXiaomi || AppUtil.INSTANCE.isPlayChannel()) && versionCode != comment_version) {
            c.a aVar = new c.a(fragmentActivity);
            final int i = 1;
            aVar.i(true);
            aVar.h(true);
            aVar.z(ApplicationExtKt.getApplication().getString(a0j.g));
            aVar.m(ApplicationExtKt.getApplication().getString(a0j.e));
            final int i2 = 0;
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: ef2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    BaseUploadFile.popCommentIfNeed$lambda$4(i2, this, fragmentActivity, i, dialogInterface, i3);
                }
            };
            aVar.d(true);
            aVar.a(ResourceExtKt.getString(a0j.d), onClickListener, 0);
            aVar.a(ResourceExtKt.getString(a0j.c), onClickListener, 1);
            aVar.a(ResourceExtKt.getString(a0j.f), onClickListener, 2);
            c cVarB = aVar.b();
            Intrinsics.checkNotNullExpressionValue(cVarB, "create(...)");
            cVarB.show();
            feedbackPreference.setCOMMENT_VERSION(versionCode);
        }
    }

    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void uploadFile(@Nullable String uploadUrl, @Nullable String uploadFile) throws Throwable {
        UploadFileUtil.INSTANCE.uploadFile(uploadUrl, uploadFile);
    }

    @Override // com.xiaomi.fitness.feedback.export.UploadFileManager
    public void uploadLogFile(boolean isUploadFile, @NotNull String objName, @NotNull String uploadUrl, @NotNull String logPath, @Nullable File extraFile) {
        Intrinsics.checkNotNullParameter(objName, "objName");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(logPath, "logPath");
        UploadFileUtil.INSTANCE.uploadLogFile(isUploadFile, objName, uploadUrl, logPath, extraFile);
    }
}
