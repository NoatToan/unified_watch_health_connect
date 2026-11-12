package com.huawei.hwversionmgr.utils.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.nui;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AppDownloadHandler extends Handler {
    private static final String TAG = "AppDownloadHandler";

    public abstract void doDownloadFailed(int i);

    public abstract void doDownloadSuccess(nui nuiVar);

    public abstract void doInDownloadProgress(nui nuiVar);

    public AppDownloadHandler() {
    }

    public AppDownloadHandler(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        LogUtil.d(TAG, "handleMessage msg.what = ", Integer.valueOf(message.what));
        switch (message.what) {
            case 1:
                doDownloadFailed(message.what);
                break;
            case 2:
                doDownloadFailed(message.what);
                break;
            case 3:
                doDownloadFailed(message.what);
                break;
            case 4:
                doDownloadFailed(message.what);
                break;
            case 5:
                doDownloadFailed(message.what);
                break;
            case 6:
                doDownloadFailed(message.what);
                break;
            case 7:
                doInDownloadProgress((nui) message.obj);
                break;
            case 8:
                if (message.obj != null && !(message.obj instanceof nui)) {
                    LogUtil.e(TAG, "handleMessage DOWNLOAD_SUCCESS instance error");
                } else {
                    doDownloadSuccess((nui) message.obj);
                }
                break;
            case 9:
                doDownloadFailed(message.what);
                break;
            case 10:
            default:
                LogUtil.a(TAG, "handleMessage default");
                break;
            case 11:
                doDownloadFailed(message.what);
                break;
        }
    }
}
