package com.huami.account.ui.login;

import android.os.AsyncTask;
import android.os.Environment;
import androidx.appcompat.app.AppCompatActivity;
import com.facebook.internal.AnalyticsEvents;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.R;
import com.huami.account.ui.common.LoadingDialogContainer;
import com.huami.account.ui.common.LoadingDialogContainerKt;
import com.huami.account.utils.LogFileUtils;
import com.huami.widget.toast.CustomToast;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u001cB\u0019\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0014J%\u0010\b\u001a\u0004\u0018\u00010\u00032\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0006\"\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0014R\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/huami/account/ui/login/MovingLogFileTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Ljava/io/File;", "", "onPreExecute", "", "params", "doInBackground", "([Ljava/lang/Void;)Ljava/io/File;", "result", "onPostExecute", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "a", "Lcom/huami/account/ui/common/LoadingDialogContainer;", "getDialogContainer", "()Lcom/huami/account/ui/common/LoadingDialogContainer;", "dialogContainer", "Ljava/lang/ref/WeakReference;", "Landroidx/appcompat/app/AppCompatActivity;", "b", "Ljava/lang/ref/WeakReference;", "getReference", "()Ljava/lang/ref/WeakReference;", "reference", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Lcom/huami/account/ui/common/LoadingDialogContainer;)V", "Companion", "accountui_release"}, k = 1, mv = {1, 5, 1})
public final class MovingLogFileTask extends AsyncTask<Void, Void, File> {

    @NotNull
    public static final String LOG_FILE_NAME = "exported_log.zip";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LoadingDialogContainer dialogContainer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<AppCompatActivity> reference;

    public MovingLogFileTask(@NotNull AppCompatActivity appCompatActivity, @NotNull LoadingDialogContainer loadingDialogContainer) {
        this.dialogContainer = loadingDialogContainer;
        this.reference = new WeakReference<>(appCompatActivity);
    }

    @NotNull
    public final LoadingDialogContainer getDialogContainer() {
        return this.dialogContainer;
    }

    @NotNull
    public final WeakReference<AppCompatActivity> getReference() {
        return this.reference;
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        AppCompatActivity appCompatActivity = this.reference.get();
        if (appCompatActivity == null || appCompatActivity.isFinishing()) {
            return;
        }
        LoadingDialogContainerKt.showLoadingDialog(this.dialogContainer, R.string.account_ui_wait);
    }

    @Override // android.os.AsyncTask
    @Nullable
    public File doInBackground(@NotNull Void... params) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), LOG_FILE_NAME);
        AppCompatActivity appCompatActivity = this.reference.get();
        if (appCompatActivity != null && AccountExternalsKt.getCommonDelegate().archiveDir(appCompatActivity, file)) {
            return file;
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(@Nullable File result) {
        super.onPostExecute(result);
        AppCompatActivity appCompatActivity = this.reference.get();
        if (appCompatActivity == null || appCompatActivity.isFinishing()) {
            return;
        }
        this.dialogContainer.hideDialog();
        if (result == null) {
            CustomToast.makeText(appCompatActivity, AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 0).show();
        } else {
            CustomToast.makeText(appCompatActivity, "Success", 0).show();
            LogFileUtils.INSTANCE.shareFile(appCompatActivity, result);
        }
    }
}
