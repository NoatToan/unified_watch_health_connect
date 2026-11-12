package com.huami.watch.companion.otaphone.service;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.util.Log;
import com.ingenic.iwds.DeviceDescriptor;
import com.ingenic.iwds.datatransactor.DataTransactor;
import com.ingenic.iwds.datatransactor.FileInfo;
import com.ingenic.iwds.datatransactor.FileTransactionModel;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes16.dex */
public class OtaModel {
    private static final int d = 20;
    private static final int e = 21;
    private static final int f = 24;
    private static final int g = 25;
    private static final int h = 26;
    private static final int i = 27;
    private static final int j = 28;
    private static final int k = 29;
    private static final int l = 34;
    private static final int m = 41;
    private static final String n = "OtaModel";
    private static OtaModel o = null;
    private static boolean p = false;
    private static boolean q = false;
    private static b r;
    private Context a;
    private Callback b;
    private Handler c = new a();

    public interface Callback {
        void OnSendfileFinished(boolean z);

        void onCancelByWatch();

        void onCancelForReceiveFile();

        void onChannelAvailable(boolean z);

        void onConfirmForReceiveFile();

        void onSendFileProgress(int i);

        void onTransferInterrupt(int i);

        void onWatchRecovery(int i);
    }

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 20) {
                if (OtaModel.this.b != null) {
                    OtaModel.this.b.OnSendfileFinished(true);
                }
                UpdateUtils.setUpdateState(OtaModel.this.a, UpdateUtils.STATE_FILE_TRANSED_SUCCESS);
            } else if (i == 21) {
                if (OtaModel.this.b != null) {
                    OtaModel.this.b.OnSendfileFinished(false);
                }
                UpdateUtils.setUpdateState(OtaModel.this.a, UpdateUtils.STATE_FILE_TRANSED_ERROR);
            } else if (i != 34) {
                if (i != 41) {
                    switch (i) {
                        case 24:
                            if (OtaModel.this.b != null) {
                                OtaModel.this.b.onChannelAvailable(true);
                            }
                            break;
                        case 25:
                            if (OtaModel.this.b != null) {
                                OtaModel.this.b.onChannelAvailable(false);
                            }
                            break;
                        case 26:
                            if (OtaModel.this.b != null) {
                                OtaModel.this.b.onConfirmForReceiveFile();
                            }
                            UpdateUtils.setUpdateState(OtaModel.this.a, UpdateUtils.STATE_FILE_TRANSING);
                            break;
                        case 27:
                            if (OtaModel.this.b != null) {
                                OtaModel.this.b.onCancelForReceiveFile();
                            }
                            break;
                        case 28:
                            if (OtaModel.this.b != null) {
                                OtaModel.this.b.onTransferInterrupt(message.arg1);
                            }
                            break;
                        case 29:
                            if (OtaModel.this.b != null) {
                                OtaModel.this.b.onCancelByWatch();
                            }
                            break;
                    }
                } else {
                    if (OtaModel.this.b != null) {
                        OtaModel.this.b.onWatchRecovery(message.arg1);
                    }
                    UpdateUtils.setUpdateState(OtaModel.this.a, UpdateUtils.STATE_RECOVERING);
                }
            } else if (OtaModel.this.b != null) {
                OtaModel.this.b.onSendFileProgress(message.arg1);
            }
            super.handleMessage(message);
        }
    }

    public class b extends FileTransactionModel {
        public b(Context context, c cVar, d dVar, String str) {
            super(context, cVar, dVar, str);
        }

        public void a(RomInfo romInfo) {
            this.m_transactor.send(romInfo);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel, com.ingenic.iwds.datatransactor.DataTransactor.DataTransactorCallback
        public void onDataArrived(Object obj) {
            try {
                super.onDataArrived(obj);
                if (obj instanceof String) {
                    Log.i(OtaModel.n, "onDataArrived command:" + obj.toString(), new Object[0]);
                    String[] strArrSplit = ((String) obj).split(UpdateUtils.CMD_FILTER);
                    if (strArrSplit[0].equals(UpdateUtils.CMD_RECOVERYING)) {
                        Log.d(OtaModel.n, "watch is going to reboot recovery mode for update", new Object[0]);
                        UpdateUtils.setUpdateLasttime(OtaModel.this.a, System.currentTimeMillis());
                        OtaModel.this.c.obtainMessage(41, 0, 0).sendToTarget();
                    }
                    if (strArrSplit[0].equals(UpdateUtils.CMD_SEND_RESULT)) {
                        if (strArrSplit[1].equals("success")) {
                            OtaModel.this.c.obtainMessage(20).sendToTarget();
                        } else {
                            OtaModel.this.c.obtainMessage(21).sendToTarget();
                        }
                    }
                    if (strArrSplit[0].equals(UpdateUtils.CMD_UPDATE_CANCEL)) {
                        Log.d(OtaModel.n, "slience update cancel by watch", new Object[0]);
                        UpdateUtils.setUpdateState(OtaModel.this.a, 65535);
                        OtaModel.this.c.obtainMessage(29).sendToTarget();
                        OtaModel.this.stopTransaction();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void sendCmd(String str) {
            this.m_transactor.send(str);
        }
    }

    public class c implements FileTransactionModel.FileTransactionModelCallback {
        private c() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onCancelForReceiveFile() {
            Log.d(OtaModel.n, "onCancelForReceiveFile ", new Object[0]);
            OtaModel.this.c.obtainMessage(27).sendToTarget();
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onChannelAvailable(boolean z) {
            Log.d(OtaModel.n, "onChannelAvailable: " + z, new Object[0]);
            OtaModel.p = z;
            if (OtaModel.p) {
                OtaModel.this.c.obtainMessage(24).sendToTarget();
            } else {
                OtaModel.this.c.obtainMessage(25).sendToTarget();
            }
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onConfirmForReceiveFile() {
            Log.d(OtaModel.n, "onConfirmForReceiveFile ", new Object[0]);
            OtaModel.this.c.obtainMessage(26).sendToTarget();
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onFileArrived(File file) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onLinkConnected(DeviceDescriptor deviceDescriptor, boolean z) {
            if (!z) {
                UpdateUtils.setWatchVersionInfo(OtaModel.this.a, "", "");
                return;
            }
            UpdateUtils.setWatchVersionInfo(OtaModel.this.a, deviceDescriptor.model, deviceDescriptor.displayID);
            Log.d(OtaModel.n, "OtaModel onLinkConnected model: " + deviceDescriptor.model + " display: " + deviceDescriptor.displayID + " isConnected: " + z, new Object[0]);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onRecvFileProgress(int i) {
            Log.d(OtaModel.n, "onRecvFileProgress", new Object[0]);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onRequestSendFile(FileInfo fileInfo) {
            Log.d(OtaModel.n, "onRequestSendFile", new Object[0]);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onSendFileProgress(int i) {
            OtaModel.this.c.obtainMessage(34, i, 0).sendToTarget();
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionModelCallback
        public void onSendResult(DataTransactor.DataTransactResult dataTransactResult) {
        }
    }

    public class d implements FileTransactionModel.FileTransactionInterruptCallback {
        private d() {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
        public void onFileTransferError(int i) {
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
        public void onRecvFileInterrupted(int i) {
            Log.d(OtaModel.n, "onRecvFileInterrupted value : " + i, new Object[0]);
        }

        @Override // com.ingenic.iwds.datatransactor.FileTransactionModel.FileTransactionInterruptCallback
        public void onSendFileInterrupted(int i) {
            Log.d(OtaModel.n, "onSendFileInterrupted value : " + i, new Object[0]);
            OtaModel.this.c.obtainMessage(28, i, 0).sendToTarget();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OtaModel(Context context) {
        this.a = context;
        r = new b(context, new c(), new d(), UpdateUtils.UUID_OTAFILE);
    }

    public static synchronized OtaModel getInstance(Context context) {
        if (o == null) {
            o = new OtaModel(context);
        }
        UpdateUtils.putStringToSP(context, UpdateUtils.CONFIG_URL, UpdateUtils.URL_PRODUCTS_UPDATE);
        return o;
    }

    public boolean IsOtaLinkConnect() {
        return p;
    }

    public void registCallback(Callback callback) {
        this.b = callback;
    }

    public void sendCmd2watch(String str) {
        if (p) {
            r.sendCmd(str);
        }
    }

    public void sendOtaInfo2watch(RomInfo romInfo) {
        if (p) {
            r.a(romInfo);
        }
    }

    public void startTransaction() {
        Log.d(n, "startTransaction", new Object[0]);
        if (q) {
            return;
        }
        r.start();
        q = true;
    }

    public void stopTransaction() {
        Log.d(n, "stopTransaction", new Object[0]);
        if (q) {
            r.stop();
            q = false;
        }
    }

    public void transferUpdateFiletoWatch(String str, int i2) {
        File file = new File(str);
        if (!file.exists()) {
            Log.d(n, "update.zip file is not exists", new Object[0]);
            return;
        }
        try {
            Log.d(n, "+++++send request file = " + file.getAbsolutePath() + " to watch by index = " + i2, new Object[0]);
            r.requestSendFile(file.getAbsolutePath(), i2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public void unRegistCallback(Callback callback) {
        this.b = null;
    }
}
