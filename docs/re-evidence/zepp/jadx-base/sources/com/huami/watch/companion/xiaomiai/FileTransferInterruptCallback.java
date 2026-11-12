package com.huami.watch.companion.xiaomiai;

import com.huami.watch.util.Log;
import com.ingenic.iwds.datatransactor.FileTransactionModel;

/* JADX INFO: loaded from: classes16.dex */
public class FileTransferInterruptCallback implements FileTransactionModel.FileTransactionInterruptCallback {
    private static final String TAG = "InterruptCallback";

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
    public void onFileTransferError(int i) {
        Log.d(TAG, "onFileTransferError " + i, new Object[0]);
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
    public void onRecvFileInterrupted(int i) {
        Log.d(TAG, "onRecvFileInterrupted " + i, new Object[0]);
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
    public void onSendFileInterrupted(int i) {
        Log.d(TAG, "onSendFileInterrupted " + i, new Object[0]);
    }
}
