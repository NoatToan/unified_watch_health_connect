package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.net.Uri;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2;
import com.huawei.hwdevicemgr.R;
import com.huawei.ui.commonui.dialog.CustomProgressDialog;
import com.huawei.watchface.videoedit.dfx.DfxGuard;
import com.huawei.watchface.videoedit.param.TemplateModel;
import com.huawei.watchface.videoedit.ui.SuperDefaultDialog;
import com.huawei.watchface.videoedit.utils.FileUtils;
import com.huawei.watchface.videoedit.utils.Rotatable;
import com.huawei.watchface.videoedit.utils.SaveResolutionUtils;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public class SaveManager {
    private static final String TAG = "SaveManager";
    private final Activity mContext;
    private CustomProgressDialog mCustomProgressDialog;
    private CustomProgressDialog.Builder mCustomProgressDialogBuilder;
    private SaveListener mSaveListener;
    private SaveThread2 mSaveThread;
    private SuperDefaultDialog mSuperProgressBar;

    public interface SaveListener {
        void onSaveCancel();

        void onSaveFail();

        void onSaveStart();

        void onSaveSuccess(File file, Uri uri);
    }

    static /* synthetic */ void lambda$saveFailed$0(DialogInterface dialogInterface, int i) {
    }

    public SaveManager(Activity activity, SaveListener saveListener) {
        this.mContext = activity;
        this.mSaveListener = saveListener;
    }

    public void startSave(TemplateModel templateModel, String str, boolean z, Rotatable rotatable, int i, int i2) {
        String canonicalPath;
        try {
            LogUtil.b(TAG, "startSave ", templateModel);
            if (str == null) {
                File file = FileUtils.SAVE_PATH;
                if (!file.exists()) {
                    DfxGuard.getPolicy().onWriteDisk();
                    if (!file.mkdirs()) {
                        LogUtil.d(TAG, "mkdirs failed");
                        return;
                    }
                }
                canonicalPath = new File(file, FileUtils.getCacheFilePath()).getCanonicalPath();
            } else {
                canonicalPath = str;
            }
            templateModel.getCanvasConfig().setResolution(SaveResolutionUtils.VideoResolution.RESOLUTION_MEDIUM_SIZE);
            this.mSaveThread = new SaveThread2(this.mContext, templateModel, canonicalPath, z, i, i2);
            showSaveProgressDialog();
            prepareSave();
            this.mSaveThread.start();
            LogUtil.b(TAG, "startSave videoSavePath: ", canonicalPath);
        } catch (IOException e) {
            LogUtil.d("startSave IOException ", ExceptionUtils.c(e));
        }
    }

    private void showSaveProgressDialog() {
        CustomProgressDialog customProgressDialog = this.mCustomProgressDialog;
        if (customProgressDialog != null && customProgressDialog.isShowing()) {
            LogUtil.d(TAG, "showSaveProgressDialog startDownloadProgress progress exist");
            return;
        }
        LogUtil.b(TAG, "showSaveProgressDialog entry");
        this.mCustomProgressDialog = new CustomProgressDialog(this.mContext);
        CustomProgressDialog.Builder builder = new CustomProgressDialog.Builder(this.mContext);
        this.mCustomProgressDialogBuilder = builder;
        builder.e(this.mContext.getString(R.string.saving));
        CustomProgressDialog customProgressDialogC = this.mCustomProgressDialogBuilder.c();
        this.mCustomProgressDialog = customProgressDialogC;
        customProgressDialogC.setCancelable(false);
        this.mCustomProgressDialog.setWindowGravityParams(17);
        this.mCustomProgressDialog.show();
    }

    private void prepareSave() {
        this.mSaveThread.setSaveListener(new SaveThread2.SaveListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager.1
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2.SaveListener
            public void onProgress(int i, int i2) {
                int i3 = (int) ((i / i2) * 100.0f);
                LogUtil.b(SaveManager.TAG, "prepareSave onProgress is ", Integer.valueOf(i3));
                if (SaveManager.this.mCustomProgressDialogBuilder != null) {
                    SaveManager.this.mCustomProgressDialogBuilder.b(i3);
                    SaveManager.this.mCustomProgressDialogBuilder.d(i3);
                }
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2.SaveListener
            public void onSaveSuccess(File file, Uri uri) {
                LogUtil.b(SaveManager.TAG, "prepareSave onSaveSuccess");
                try {
                    if (SaveManager.this.mCustomProgressDialog != null) {
                        SaveManager.this.mCustomProgressDialog.dismiss();
                    }
                } catch (IllegalStateException e) {
                    LogUtil.d(SaveManager.TAG, "prepareSave onSaveSuccess illegalStateException,exception is ", ExceptionUtils.c(e));
                }
                if (SaveManager.this.mSaveListener != null) {
                    SaveManager.this.mSaveListener.onSaveSuccess(file, uri);
                }
            }

            @Override // com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.presenter.SaveThread2.SaveListener
            public void onSaveFail() {
                LogUtil.b(SaveManager.TAG, "prepareSave onSaveFail");
                SaveManager.this.saveFailed();
            }
        });
        SaveListener saveListener = this.mSaveListener;
        if (saveListener != null) {
            saveListener.onSaveStart();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void saveFailed() {
        this.mContext.runOnUiThread(new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1437x5c562ad6();
            }
        });
    }

    /* JADX INFO: renamed from: lambda$saveFailed$2$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-SaveManager, reason: not valid java name */
    /* synthetic */ void m1437x5c562ad6() {
        AlertDialog alertDialogCreate = new AlertDialog.Builder(this.mContext).setMessage(R.string.IDS_hwh_show_save_failed).setPositiveButton("", new DialogInterface.OnClickListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SaveManager.lambda$saveFailed$0(dialogInterface, i);
            }
        }).setNegativeButton(R.string.IDS_dialog_checkbox_confirm, new DialogInterface.OnClickListener() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.videoedit.SaveManager$$ExternalSyntheticLambda2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m1436xf9fb13f7(dialogInterface, i);
            }
        }).create();
        if (!this.mContext.isFinishing()) {
            alertDialogCreate.show();
        }
        CustomProgressDialog customProgressDialog = this.mCustomProgressDialog;
        if (customProgressDialog != null) {
            customProgressDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: lambda$saveFailed$1$com-huawei-hwdevice-mainprocess-mgr-hwmywatchfacemgr-pluginvideo-videoedit-SaveManager, reason: not valid java name */
    /* synthetic */ void m1436xf9fb13f7(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        SaveListener saveListener = this.mSaveListener;
        if (saveListener != null) {
            saveListener.onSaveFail();
        }
    }

    public void destroy() {
        if (this.mSaveThread != null) {
            LogUtil.b(TAG, "destroy, saveThread requestStop.");
            this.mSaveThread.requestStop();
            this.mSaveThread = null;
        }
    }
}
