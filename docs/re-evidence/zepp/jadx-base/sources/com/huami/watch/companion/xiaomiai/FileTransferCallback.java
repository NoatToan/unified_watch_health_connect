package com.huami.watch.companion.xiaomiai;

import android.content.Context;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.datatransactor.FileInfo;
import com.ingenic.iwds.datatransactor.FileTransactionModel;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public class FileTransferCallback implements FileTransactionModel.FileTransactionModelCallback {
    private static final String TAG = "TransferCallback";
    private Context mContext;
    private FileTransfer mFileTransfer = null;

    public FileTransferCallback(Context context) {
        this.mContext = null;
        this.mContext = context;
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onCancelForReceiveFile() {
        Log.d(TAG, "onCancelForReceiveFile", new Object[0]);
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onChannelAvailable(boolean z) {
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onConfirmForReceiveFile() {
        Log.d(TAG, "onConfirmForReceiveFile", new Object[0]);
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onFileArrived(File file) {
        if (file != null) {
            Log.d(TAG, "onFileArrived " + file.length(), new Object[0]);
        }
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onRecvFileProgress(int i) {
        Log.d(TAG, "onRecvFileProgress  progress:" + i, new Object[0]);
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onRequestSendFile(FileInfo fileInfo) {
        Log.d(TAG, "onRequestSendFile file info:" + fileInfo.name, new Object[0]);
        File file = new File(FileTransfer.transferFilePath + fileInfo.name);
        if (file.exists()) {
            if (file.delete()) {
                Log.d(TAG, "delete old transfer file success!", new Object[0]);
            } else {
                Log.d(TAG, "delete old transfer file failed!", new Object[0]);
            }
        }
        FileTransfer fileTransfer = this.mFileTransfer;
        if (fileTransfer == null) {
            Log.e(TAG, "not set file transfer!!!", new Object[0]);
        } else {
            fileTransfer.notifyConfirmForReceiveFile();
        }
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onSendFileProgress(int i) {
        Log.d(TAG, "onSendFileProgress  progress:" + i, new Object[0]);
    }

    @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
    public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
    }

    public void setFileTransfer(FileTransfer fileTransfer) {
        this.mFileTransfer = fileTransfer;
    }
}
