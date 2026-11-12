package com.huawei.operation.br;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.operation.h5pro.H5proUtil;
import defpackage.lsy;
import health.compact.a.util.LogUtil;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.UUID;

/* JADX INFO: loaded from: classes13.dex */
public class BrClient {
    private static final int READ_DATA_SIZE = 1024;
    private static final String TAG = "BrClient";
    private BluetoothSocket mBluetoothSocket;
    private BtListener mBtListener;
    private DataInputStream mDataInputStream = null;
    private DataOutputStream mDataOutputStream;
    private boolean mIsRead;
    private boolean mIsSending;
    protected UUID mSppUuid;

    public interface BtListener {
        public static final int CONNECTED = 1;
        public static final int DISCONNECTED = 0;
        public static final int MSG_FILE_SENDED_PERCENT = 6;
        public static final int MSG_RECEIVED = 5;
        public static final int MSG_SEND = 2;
        public static final int MSG_SEND_FAIL = 3;
        public static final int MSG_SEND_SENDING = 4;

        void socketNotify(int i, String str);
    }

    public BrClient(BtListener btListener) {
        this.mBtListener = btListener;
    }

    public void setSppUuid(String str) {
        this.mSppUuid = UUID.fromString(str);
    }

    /* JADX INFO: renamed from: loopRead, reason: merged with bridge method [inline-methods] */
    public void m1524lambda$connect$1$comhuaweioperationbrBrClient(BluetoothSocket bluetoothSocket) {
        this.mBluetoothSocket = bluetoothSocket;
        try {
            if (!bluetoothSocket.isConnected()) {
                LogUtil.a(TAG, "loopRead connect");
                this.mBluetoothSocket.connect();
            }
            notifyUi(1);
            BrConnectHelper.getInstance().setFound(false);
            this.mDataOutputStream = new DataOutputStream(this.mBluetoothSocket.getOutputStream());
            this.mIsRead = true;
            LogUtil.a(TAG, "Enter loopRead");
            doReadInputStream();
            LogUtil.a(TAG, "After loopRead");
        } catch (IOException | SecurityException e) {
            LogUtil.c(TAG, "loopRead Exception ", ExceptionUtils.c(e));
            releaseResource();
            BrConnectHelper.getInstance().setFound(false);
        }
    }

    private void closeDataInputStream(DataInputStream dataInputStream) {
        this.mIsRead = false;
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                LogUtil.c(TAG, "closeDataInputStream DataOutputStream or FileOutputStream IOException ", e.getMessage());
            }
        }
    }

    private void doReadInputStream() {
        byte[] bArr = new byte[1024];
        while (this.mIsRead) {
            try {
                if (this.mBluetoothSocket == null) {
                    LogUtil.d(TAG, "doReadInputStream bluetoothSocket is null");
                    return;
                }
                DataInputStream dataInputStream = new DataInputStream(this.mBluetoothSocket.getInputStream());
                this.mDataInputStream = dataInputStream;
                int i = dataInputStream.read(bArr);
                LogUtil.e(TAG, "readLength ", Integer.valueOf(i));
                if (i > 0) {
                    if (i < 1024) {
                        byte[] bArr2 = new byte[i];
                        System.arraycopy(bArr, 0, bArr2, 0, i);
                        notifyUi(5, H5proUtil.bytesToHexString(bArr2, null));
                    } else {
                        notifyUi(5, H5proUtil.bytesToHexString(bArr, null));
                    }
                }
            } catch (IOException e) {
                LogUtil.c(TAG, "doReadInputStream IOException = ", e.toString());
                releaseResource();
                return;
            }
        }
    }

    public void sendMsg(final String str) {
        LogUtil.a(TAG, "sendMsg");
        lsy.a(new Runnable() { // from class: com.huawei.operation.br.BrClient$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m1525lambda$sendMsg$0$comhuaweioperationbrBrClient(str);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$sendMsg$0$com-huawei-operation-br-BrClient, reason: not valid java name */
    /* synthetic */ void m1525lambda$sendMsg$0$comhuaweioperationbrBrClient(String str) {
        if (this.mIsSending) {
            notifyUi(4, str);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            notifyUi(3, str);
            return;
        }
        this.mIsSending = true;
        try {
            this.mDataOutputStream.write(H5proUtil.hexStringToBytes(str));
            notifyUi(2, str);
        } catch (IOException e) {
            LogUtil.c(TAG, "sendMsg IOException ", e.toString());
            notifyUi(3, str);
            releaseResource();
        }
        this.mIsSending = false;
    }

    public void releaseResource() {
        LogUtil.a(TAG, "releaseResource");
        try {
            closeDataInputStream(this.mDataInputStream);
            BluetoothSocket bluetoothSocket = this.mBluetoothSocket;
            if (bluetoothSocket != null) {
                LogUtil.a(TAG, "mBluetoothSocket ", bluetoothSocket);
                this.mBluetoothSocket.close();
                notifyUi(0, null);
            }
        } catch (IOException e) {
            LogUtil.c(TAG, "close IOException ", e.toString());
        }
    }

    private void notifyUi(int i, String str) {
        BtListener btListener = this.mBtListener;
        if (btListener != null) {
            btListener.socketNotify(i, str);
        }
    }

    private void notifyUi(int i) {
        notifyUi(i, "");
    }

    public void connect(BluetoothDevice bluetoothDevice) {
        releaseResource();
        try {
            final BluetoothSocket bluetoothSocketCreateInsecureRfcommSocketToServiceRecord = bluetoothDevice.createInsecureRfcommSocketToServiceRecord(this.mSppUuid);
            if (bluetoothSocketCreateInsecureRfcommSocketToServiceRecord == null) {
                LogUtil.d(TAG, "loopRead bluetoothSocket is null");
                notifyUi(0);
            } else {
                lsy.a(new Runnable() { // from class: com.huawei.operation.br.BrClient$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m1524lambda$connect$1$comhuaweioperationbrBrClient(bluetoothSocketCreateInsecureRfcommSocketToServiceRecord);
                    }
                });
            }
        } catch (IOException | SecurityException e) {
            LogUtil.c(TAG, "connect Exception ", ExceptionUtils.c(e));
            BrConnectHelper.getInstance().setFound(false);
            releaseResource();
        }
    }
}
