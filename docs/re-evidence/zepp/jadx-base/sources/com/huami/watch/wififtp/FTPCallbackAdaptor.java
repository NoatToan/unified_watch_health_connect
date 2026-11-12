package com.huami.watch.wififtp;

/* JADX INFO: loaded from: classes17.dex */
public abstract class FTPCallbackAdaptor implements PhoneWifiFtpUtil.FTPCallback {
    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onConnected() {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onDisconnected() {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onFileDelete(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onFileDownload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onFileUpload(PhoneWifiFtpUtil.TransferTask transferTask, boolean z) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onFileUploadProgress(PhoneWifiFtpUtil.TransferTask transferTask, int i) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onNeedRetryTask(PhoneWifiFtpUtil.TransferTask... transferTaskArr) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onTaskAdd(PhoneWifiFtpUtil.TransferTask transferTask) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onTaskRemove(PhoneWifiFtpUtil.TransferTask transferTask) {
    }

    @Override // com.huami.watch.wififtp.PhoneWifiFtpUtil.FTPCallback
    public void onTaskStateChanged(PhoneWifiFtpUtil.TransferTask transferTask) {
    }
}
