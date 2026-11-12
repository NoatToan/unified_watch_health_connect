package com.huami.watch.transport;

import android.content.Context;
import androidx.annotation.NonNull;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.datatransactor.FileInfo;
import com.ingenic.iwds.datatransactor.FileTransactionModel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes5.dex */
public class FileTransporter {
    private static final String e = "Trans-File";
    private static final String f = "c37721af-c98f-49d9-af33-329bb84e17f2";
    private static FileTransporter g;
    private FileTransactionModel a;
    private FileTransactionModel.FileTransactionModelCallback b = new a();
    private List<Transporter.ChannelListener> c = new ArrayList();
    private List<FileListener> d = new ArrayList();

    public interface FileListener {
        void onFileArrived(File file);

        void onReceiveFileProgress(int i);

        void onSendFileProgress(int i);

        void onSendResult(DataTransactor.DataTransactResult dataTransactResult);
    }

    public class a implements FileTransactionModel.FileTransactionModelCallback {
        public a() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onCancelForReceiveFile() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onChannelAvailable(boolean z) {
            Iterator it2 = FileTransporter.this.c.iterator();
            while (it2.hasNext()) {
                ((Transporter.ChannelListener) it2.next()).onChannelChanged(z);
            }
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onConfirmForReceiveFile() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onFileArrived(File file) {
            Log.d(FileTransporter.e, "OnFileArrived : " + file, new Object[0]);
            Iterator it2 = FileTransporter.this.d.iterator();
            while (it2.hasNext()) {
                ((FileListener) it2.next()).onFileArrived(file);
            }
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onRecvFileProgress(int i) {
            Log.d(FileTransporter.e, "OnReceiveFileProgress : " + i, new Object[0]);
            Iterator it2 = FileTransporter.this.d.iterator();
            while (it2.hasNext()) {
                ((FileListener) it2.next()).onReceiveFileProgress(i);
            }
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onRequestSendFile(FileInfo fileInfo) {
            Log.d(FileTransporter.e, "OnRequestSendFile : <Name:" + fileInfo.name + ", Length:" + fileInfo.length + ", ChunkSize:" + fileInfo.chunkSize + ", ChunkIndex:" + fileInfo.chunkIndex + SearchCriteria.GT, new Object[0]);
            FileTransporter.this.a.notifyConfirmForReceiveFile();
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onSendFileProgress(int i) {
            Log.d(FileTransporter.e, "OnSendFileProgress : " + i, new Object[0]);
            Iterator it2 = FileTransporter.this.d.iterator();
            while (it2.hasNext()) {
                ((FileListener) it2.next()).onSendFileProgress(i);
            }
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
            Log.d(FileTransporter.e, "OnSendResult : " + dataTransactResult.getResultCode() + ", " + dataTransactResult.getTransferedObject(), new Object[0]);
            if (dataTransactResult.getTransferedObject() == null || !(dataTransactResult.getTransferedObject() instanceof File)) {
                return;
            }
            Iterator it2 = FileTransporter.this.d.iterator();
            while (it2.hasNext()) {
                ((FileListener) it2.next()).onSendResult(dataTransactResult);
            }
        }
    }

    private FileTransporter(Context context) {
        Log.d(e, "UUID : c37721af-c98f-49d9-af33-329bb84e17f2", new Object[0]);
        this.a = new FileTransactionModel(context, this.b, f);
    }

    public static FileTransporter getTransporter(Context context) {
        if (g == null) {
            g = new FileTransporter(context);
        }
        return g;
    }

    public void addChannelListener(Transporter.ChannelListener channelListener) {
        this.c.add(channelListener);
    }

    public void addFileListener(FileListener fileListener) {
        this.d.add(fileListener);
    }

    public void removeChannelListener(Transporter.ChannelListener channelListener) {
        this.c.remove(channelListener);
    }

    public void removeFileListener(FileListener fileListener) {
        this.d.remove(fileListener);
    }

    public void send(@NonNull File file) {
        Log.d(e, "Send File : " + file.getAbsolutePath() + ", " + file.length(), new Object[0]);
        try {
            this.a.requestSendFile(file.getAbsolutePath());
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public void start() {
        if (this.a.isStarted()) {
            return;
        }
        Log.d(e, "Start!!", new Object[0]);
        this.a.start();
    }
}
