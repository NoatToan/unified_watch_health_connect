package com.huawei.watchface.utils.callback;

import android.app.Activity;
import android.content.Context;
import com.huawei.watchface.utils.PermissionUtils;

/* JADX INFO: loaded from: classes20.dex */
public interface OperateWatchFaceCallback {
    void callGetWatchFaceDeleteIdJsFunction();

    void callTransmitProgressJsFunction(String str, int i, String str2);

    void cancelSearchImage(boolean z, boolean z2);

    void chooseToClip(int i, boolean z);

    Context getCustomWebViewContext();

    int getSoftKeyboardHeight();

    void handleCallbackResult(String str, int i);

    void hideLoadingDialog();

    void notifyBackgroundChange(boolean z);

    void notifyCurrentWatchfaceIsVipFree(String str, String str2);

    void notifyGetShortCutIsCreate();

    void notifyGetWatchfaceStore();

    void notifyKaleidoscopePackageName(String str);

    void notifyPhotoPackageName(String str);

    void notifyRefreshPage(String str);

    void notifyVideoAlbumPackageName(String str);

    void notifyWatchfaceModeChange(int i);

    void notifyWearAlbumPackageName(String str);

    void requestPermissionAsync(Activity activity, String[] strArr, PermissionUtils.PermissonListener permissonListener, int i);

    void reselectionWearTransmit();

    void resetKaleidoscopeCurrentMaxIndex();

    void resetWatchFaceAlbumInfoStatus(int i);

    void saveSuccessComeback();

    void setWatchFaceConfirmButton();

    void showLoadingDialog(String str);

    void showToast(String str);

    void transmitAppGoBack();

    void transmitCancelInstallWatchFaceResult(String str, String str2, int i);

    void transmitDecryptResult(int i, String str);

    void transmitDeleteWatchFaceResult(String str, String str2, int i);

    void transmitDeviceConnectState(boolean z, String str);

    void transmitDialRecycleResult(String str, String str2, String str3);

    void transmitDownloadProgressWatchFace(String str, int i, String str2);

    void transmitDownloadUrl(int i, String str);

    void transmitDownloadWatchFaceResult(String str, String str2, int i);

    void transmitFinishPay(String str);

    void transmitGetResult();

    void transmitHealthChildStatusChange(String str);

    void transmitInstallWatchFaceResult(String str, String str2, int i);

    void transmitInstallWatchFaceResultNew(String str, String str2, int i);

    void transmitLoadingOpen();

    void transmitLocalWatchInfoChange(int i);

    void transmitMembershipDialogStatus();

    void transmitOperationScene(String str);

    void transmitPayWatchFaceResult(String str, String str2, String str3);

    void transmitRefreshPullData();

    void transmitSearchToImgCut();

    void transmitSelectImageFailed();

    void transmitSendMemberSignatureResult(int i, String str);

    void transmitSetDefaultWatchFaceResult(String str, String str2, int i);

    void transmitShareResult(String str, int i, String str2);

    void transmitTryOutOver(String str, String str2, String str3);

    void transmitUploadImageResult(int i, String str);

    void transmitUserTokenUpdate();

    void transmitVerityPwsRes(String str, String str2);

    void transmitWatchFaceAlbumApplyResult(int i);

    void transmitWatchFaceAlbumInstallResult(int i);

    void transmitWatchFaceGoBack();

    void transmitWatchFaceKaleidoscopeInfo(String str);

    void transmitWatchFaceKaleidoscopeInstallResult(int i);

    void transmitWatchFaceKaleidoscopeLoadingProgress(String str);

    void transmitWatchFaceLoginResult(String str);

    void transmitWatchFaceNames(String str);

    void transmitWatchFaceThemeAlbumInfo(String str);

    void transmitWatchFaceThemeAlbumLoadingProgress(String str);

    void transmitWatchFaceThemeWearInfo(String str);

    void transmitWatchFaceThemeWearLoadingProgress(String str);

    void transmitWatchFaceTimeWidgetColor(int i);

    void transmitWatchFaceVideoAlbumInfo(String str);

    void transmitWatchFaceVideoAlbumLoadingProgress(String str);

    void transmitWatchFaceVideoInstallResult(int i);

    void transmitWatchFaceWearInstallResult(int i);

    void transmitWatchInfoChange(int i);
}
