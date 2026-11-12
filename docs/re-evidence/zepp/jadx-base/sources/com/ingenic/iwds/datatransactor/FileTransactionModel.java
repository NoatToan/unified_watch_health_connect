package com.ingenic.iwds.datatransactor;

import android.content.Context;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.common.exception.FileStatusException;
import com.ingenic.iwds.common.exception.FileTransferException;
import com.ingenic.iwds.common.exception.SDCardFullException;
import com.ingenic.iwds.common.exception.SDCardNotMountedException;
import com.ingenic.iwds.utils.IwdsAssert;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class FileTransactionModel implements DataTransactor.DataTransactorCallback, DataTransactor.DataTransactorInterruptCallback {
    private FileTransactionInterruptCallback i_callback;
    private FileTransactionModelCallback m_callback;
    private File m_file;
    private FileInfo m_fileInfo = new FileInfo();
    public DataTransactor m_transactor;

    public static class CancelForReceiveFile implements Serializable {
        private static final long serialVersionUID = 3611791257589864674L;

        private CancelForReceiveFile() {
        }
    }

    public static class ConfirmForReceiveFile implements Serializable {
        private static final long serialVersionUID = -7030085924484744118L;

        private ConfirmForReceiveFile() {
        }
    }

    public interface FileTransactionInterruptCallback {
        void onFileTransferError(int i);

        void onRecvFileInterrupted(int i);

        void onSendFileInterrupted(int i);
    }

    public interface FileTransactionModelCallback {
        void onCancelForReceiveFile();

        void onChannelAvailable(boolean z);

        void onConfirmForReceiveFile();

        void onFileArrived(File file);

        void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z);

        void onRecvFileProgress(int i);

        void onRequestSendFile(FileInfo fileInfo);

        void onSendFileProgress(int i);

        void onSendResult(DataTransactor.DataTransactResult dataTransactResult);
    }

    public static class RequestSendFile implements Serializable {
        private static final long serialVersionUID = 5098980108404157152L;
        private FileInfo info;

        public RequestSendFile(FileInfo fileInfo) {
            this.info = fileInfo;
        }
    }

    public FileTransactionModel(Context context, FileTransactionModelCallback fileTransactionModelCallback, String str) {
        this.m_callback = null;
        this.i_callback = null;
        IwdsAssert.dieIf(this, fileTransactionModelCallback == null, "Callback is null.");
        this.m_callback = fileTransactionModelCallback;
        this.i_callback = null;
        this.m_transactor = new DataTransactor(context, this, this, str);
    }

    public boolean isStarted() {
        return this.m_transactor.isStarted();
    }

    public void notifyCancelForReceiveFile() {
        this.m_transactor.send(new CancelForReceiveFile());
    }

    public void notifyConfirmForReceiveFile() {
        this.m_transactor.send(new ConfirmForReceiveFile());
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onChannelAvailable(boolean z) {
        this.m_callback.onChannelAvailable(z);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onDataArrived(Object obj) {
        if (obj instanceof RequestSendFile) {
            this.m_callback.onRequestSendFile(((RequestSendFile) obj).info);
            return;
        }
        if (obj instanceof ConfirmForReceiveFile) {
            this.m_transactor.send(this.m_file, this.m_fileInfo.chunkIndex);
            this.m_callback.onConfirmForReceiveFile();
            return;
        }
        if (obj instanceof CancelForReceiveFile) {
            this.m_callback.onCancelForReceiveFile();
            return;
        }
        if (obj instanceof File) {
            this.m_callback.onFileArrived((File) obj);
            return;
        }
        if (obj instanceof FileTransferException) {
            Throwable cause = ((FileTransferException) obj).getCause();
            FileTransactionInterruptCallback fileTransactionInterruptCallback = this.i_callback;
            if (fileTransactionInterruptCallback == null) {
                return;
            }
            if (cause instanceof FileStatusException) {
                fileTransactionInterruptCallback.onFileTransferError(1);
                stop();
            } else if (cause instanceof SDCardNotMountedException) {
                fileTransactionInterruptCallback.onFileTransferError(2);
            } else if (cause instanceof SDCardFullException) {
                fileTransactionInterruptCallback.onFileTransferError(3);
            } else {
                IwdsAssert.dieIf((Object) this, true, "Implement me.");
            }
        }
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
        this.m_callback.onLinkConnected(deviceDescriptor, z);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorInterruptCallback
    public void onRecvFileInterrupted(int i) {
        FileTransactionInterruptCallback fileTransactionInterruptCallback = this.i_callback;
        if (fileTransactionInterruptCallback != null) {
            fileTransactionInterruptCallback.onRecvFileInterrupted(i);
        }
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onRecvFileProgress(int i) {
        this.m_callback.onRecvFileProgress(i);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorInterruptCallback
    public void onSendFileInterrupted(int i) {
        FileTransactionInterruptCallback fileTransactionInterruptCallback = this.i_callback;
        if (fileTransactionInterruptCallback != null) {
            fileTransactionInterruptCallback.onSendFileInterrupted(i);
        }
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendFileProgress(int i) {
        this.m_callback.onSendFileProgress(i);
    }

    @Override // com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
    public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
        this.m_callback.onSendResult(dataTransactResult);
    }

    public void requestSendFile(String str) throws FileNotFoundException {
        requestSendFile(str, 0);
    }

    public void start() {
        this.m_transactor.start();
    }

    public void stop() {
        this.m_transactor.stop();
    }

    public void requestSendFile(String str, int i) throws FileNotFoundException {
        IwdsAssert.dieIf(this, str == null || str.isEmpty(), "File path is null or empty");
        File file = new File(str);
        if (file.isDirectory()) {
            throw new FileNotFoundException("File can not be a directory.");
        }
        IwdsAssert.dieIf(this, !file.canRead(), "file can not be read");
        long length = file.length();
        if (length <= 0) {
            throw new FileNotFoundException("File does not exist or is empty.");
        }
        long j = 65536;
        IwdsAssert.dieIf(this, i > ((int) (((length % j) > 0L ? 1 : ((length % j) == 0L ? 0 : -1)) == 0 ? length / j : (length / j) + 1)) || i < 0, "Invalid index");
        this.m_fileInfo.name = file.getName();
        FileInfo fileInfo = this.m_fileInfo;
        fileInfo.length = length;
        fileInfo.chunkIndex = i;
        fileInfo.chunkSize = 65536;
        this.m_file = file;
        this.m_transactor.send(new RequestSendFile(fileInfo));
    }

    public FileTransactionModel(Context context, FileTransactionModelCallback fileTransactionModelCallback, FileTransactionInterruptCallback fileTransactionInterruptCallback, String str) {
        this.m_callback = null;
        this.i_callback = null;
        IwdsAssert.dieIf(this, fileTransactionModelCallback == null, "Callback is null.");
        IwdsAssert.dieIf(this, fileTransactionInterruptCallback == null, "Callback is null.");
        this.m_callback = fileTransactionModelCallback;
        this.i_callback = fileTransactionInterruptCallback;
        this.m_transactor = new DataTransactor(context, this, this, str);
    }
}
