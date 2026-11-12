package com.xiaomi.fitness.feedback.bugreport;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.xiaomi.accountsdk.account.data.XiaomiUserCoreInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.feedback.bugreport.MiuiFeedBack;
import com.xiaomi.fitness.feedback.util.FeedbackConstants;
import com.xiaomi.fitness.feedback.util.FeedbackFileUtils;
import com.xiaomi.passport.data.XMPassportInfo;
import com.xiaomi.passport.utils.AccountHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.concurrent.ThreadsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jo\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010 \u001a\u00020\u00192\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010!\u001a\u00020\tJ\n\u0010\"\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010#\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001f\u001a\u00020\u000fJ\u0010\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010%\u001a\u00020\u000fJ\b\u0010&\u001a\u0004\u0018\u00010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/MiuiFeedBack;", "", "<init>", "()V", "sHandler", "Landroid/os/Handler;", "getSHandler", "()Landroid/os/Handler;", "intentToFeedback", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "tagId", "", "wideTagContent", "", "showContent", "json", "appName", "type", "wideTagId", "subTagId", "moduleId", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;I)V", "validFeedBack", "", "gotoMIUI", "gotoMIUIBugReport", "runnable", "Ljava/lang/Runnable;", "getFilesDirPath", "dir", "isInValid", "destroy", "getLogDirPath", "getExternalFilesDirPath", "getFilesDirFile", "file", "getDumpDirPath", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiFeedBack {

    @NotNull
    private final Handler sHandler = new Handler();

    @NotNull
    private final Runnable runnable = new Runnable() { // from class: p5g
        @Override // java.lang.Runnable
        public final void run() {
            MiuiFeedBack.runnable$lambda$5(this.f30017a);
        }
    };

    private final String getFilesDirPath(String dir) {
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(dir);
        if (externalFilesDir != null) {
            FileUtils.INSTANCE.deleteFile(externalFilesDir);
            String absolutePath = externalFilesDir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
        return ApplicationExtKt.getApplication().getFilesDir().getAbsolutePath() + File.separator + externalFilesDir;
    }

    private final String getLogDirPath() {
        return getExternalFilesDirPath(FeedbackFileUtils.INSTANCE.getLOG_DIR());
    }

    private final void gotoMIUI(Activity activity) {
        gotoMIUIBugReport(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gotoMIUIBugReport$lambda$1(Activity activity, MiuiFeedBack this$0) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        XMPassportInfo xMPassportInfoBuild = XMPassportInfo.build(activity, "passportapi");
        XiaomiUserCoreInfo xiaomiUserCoreInfo = null;
        if (xMPassportInfoBuild != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(XiaomiUserCoreInfo.Flag.BASE_INFO);
            arrayList.add(XiaomiUserCoreInfo.Flag.SETTING_INFO);
            try {
                xiaomiUserCoreInfo = AccountHelper.getXiaomiUserCoreInfo(xMPassportInfoBuild, "passportapi", arrayList);
            } catch (Exception e) {
                Logger.e("MiuiFeedBack", "gotoMIUIBugReport getXiaomiUserCoreInfo error " + e);
            }
        }
        if (xiaomiUserCoreInfo != null) {
            Intent mIUIBugReport = BugReportInfoManager.INSTANCE.getMIUIBugReport(xiaomiUserCoreInfo);
            Logger.d("MiuiFeedBack", "intent == " + mIUIBugReport + " -- " + xiaomiUserCoreInfo);
            activity.startActivity(mIUIBugReport);
            Logger.d("MiuiFeedBack", "runnable");
            this$0.sHandler.post(this$0.runnable);
        }
        return Unit.INSTANCE;
    }

    private final boolean isInValid(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$5(final MiuiFeedBack this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.d("MiuiFeedBack", "runnable start");
        final String filesDirPath = this$0.getFilesDirPath("uploadLog/log");
        final String filesDirPath2 = this$0.getFilesDirPath("uploadLog/dump");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNull(executorServiceNewSingleThreadExecutor);
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: r5g
            @Override // java.lang.Runnable
            public final void run() {
                MiuiFeedBack.runnable$lambda$5$lambda$4(this.f32204a, filesDirPath, filesDirPath2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runnable$lambda$5$lambda$4(MiuiFeedBack this$0, String targetFileLogPath, String targetFileDumpPath) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(targetFileLogPath, "$targetFileLogPath");
        Intrinsics.checkNotNullParameter(targetFileDumpPath, "$targetFileDumpPath");
        try {
            Logger.d("MiuiFeedBack", "getLogDirPath execute" + this$0.getLogDirPath());
            String logDirPath = this$0.getLogDirPath();
            if (logDirPath != null) {
                Logger.d("MiuiFeedBack", "getLogDirPath it" + logDirPath);
                FeedbackFileUtils.INSTANCE.copyDirOrFile(ApplicationExtKt.getApplication(), logDirPath, targetFileLogPath);
            }
            Logger.d("MiuiFeedBack", "getDumpDirPath execute" + this$0.getDumpDirPath());
            String dumpDirPath = this$0.getDumpDirPath();
            if (dumpDirPath != null) {
                Logger.d("MiuiFeedBack", "getDumpDirPath it " + dumpDirPath);
                FeedbackFileUtils.INSTANCE.copyDirOrFile(ApplicationExtKt.getApplication(), dumpDirPath, targetFileDumpPath);
            }
        } catch (Exception e) {
            Logger.i("MiuiFeedBack", "copyDirOrFile: " + e.getMessage());
        }
    }

    private final boolean validFeedBack() {
        try {
            PackageInfo packageInfo = ApplicationExtKt.getApplication().getPackageManager().getPackageInfo("com.miui.bugreport", 0);
            return packageInfo != null && packageInfo.versionCode >= 20303;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.i("MiuiFeedBack", "validFeedBack: " + e.getMessage());
            return false;
        }
    }

    public final void destroy() {
        Handler handler = this.sHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Nullable
    public final String getDumpDirPath() {
        return getExternalFilesDirPath(FeedbackFileUtils.INSTANCE.getDUMP_DIR());
    }

    @Nullable
    public final String getExternalFilesDirPath(@NotNull String dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        File externalFilesDir = ApplicationExtKt.getApplication().getExternalFilesDir(dir);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : getFilesDirFile(dir);
    }

    @Nullable
    public final String getFilesDirFile(@NotNull String file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return ApplicationExtKt.getApplication().getFilesDir().getAbsolutePath() + File.separator + file;
    }

    @NotNull
    public final Handler getSHandler() {
        return this.sHandler;
    }

    public final void gotoMIUIBugReport(@NotNull final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (isInValid(activity)) {
            return;
        }
        ThreadsKt.thread$default(false, false, null, null, 0, new Function0() { // from class: q5g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MiuiFeedBack.gotoMIUIBugReport$lambda$1(activity, this);
            }
        }, 31, null);
    }

    public final void intentToFeedback(@Nullable Activity activity, int tagId, @Nullable String wideTagContent, @Nullable String showContent, @Nullable String json, @Nullable String appName, @Nullable String type, @Nullable Integer wideTagId, @Nullable Integer subTagId, int moduleId) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent("miui.intent.action.BUGREPORT");
        if (validFeedBack() && intent.resolveActivity(activity.getPackageManager()) != null) {
            gotoMIUI(activity);
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra(FeedbackConstants.KEY_TAG_ID, tagId);
        intent2.putExtra(FeedbackConstants.KEY_SELECTED_TYPE, wideTagContent);
        intent2.putExtra(FeedbackConstants.KEY_CONTENT_TYPE, showContent);
        intent2.putExtra(FeedbackConstants.KEY_TAG_LIST, json);
        intent2.putExtra(FeedbackConstants.KEY_APP_NAME, appName);
        intent2.putExtra(FeedbackConstants.KEY_MAIN_TAG_ID, wideTagId);
        intent2.putExtra(FeedbackConstants.KEY_SUB_TAG_ID, subTagId);
        intent2.putExtra("type", type);
        intent2.putExtra(FeedbackConstants.KEY_MODULE_ID, moduleId);
        intent2.setClass(ApplicationExtKt.getApplication(), FeedbackActivity.class);
        activity.startActivity(intent2);
    }
}
