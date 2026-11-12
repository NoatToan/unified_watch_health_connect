package com.xiaomi.market.sdk;

import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;

/* JADX INFO: loaded from: classes22.dex */
class DownloadInstallResultNotifier {
    public static final int ERROR_CONNECT_DOWNLOAD_MANAGER = -2;
    public static final int ERROR_SDCARD_NOT_AVAILABLE = -1;

    public static void notifyResult(int i) {
        if (i == -2) {
            showToast(R.string.xiaomi_update_sdk_connect_download_manager_fail);
        } else {
            if (i != -1) {
                return;
            }
            showToast(R.string.xiaomi_update_sdk_external_storage_unavailable);
        }
    }

    private static void showToast(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.xiaomi.market.sdk.DownloadInstallResultNotifier.1
            @Override // java.lang.Runnable
            public void run() {
                Toast.makeText(AppGlobal.getContext(), i, 0).show();
            }
        });
    }
}
