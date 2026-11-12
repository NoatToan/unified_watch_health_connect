package com.xiaomi.smarthome.core.server.internal.bluetooth.mesh;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.smarthome.cache.SmartConfigCache;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleMeshUpgradeResponse;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.MeshDfuChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuEvent;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.util.VersionUtils;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.OTAErrorCode;
import com.xiaomi.smarthome.library.bluetooth.channel.CRC32;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public final class MeshDfuManager {
    private static final int CHECK_MCU_VERSION_INTERVAL_TIME = 5000;
    private static final int MSG_CHECK_MCU_TIMEOUT = 12293;
    private static final int MSG_CHECK_MCU_VERSION = 12292;
    private static final int MSG_SEND_COMMAND_TIMEOUT = 12289;
    private static final int MSG_SEND_NEXT_FRAGMENT = 12291;
    private static final int MSG_UPDATE_PROGRESS = 12290;
    private static final int PROTOCOL_VERSION_V2 = 2;
    private static final int PROTOCOL_VERSION_V3 = 3;
    private static final int PROTOCOL_VERSION_V4 = 4;
    private static final int SEND_TIMEOUT = 20000;
    private static final String TAG = "Ble-OTA:MeshDfuManager";
    private static volatile MeshDfuManager sInstance;
    private IBleChannelWriter mChannelWriter;
    private String mCurrentFirmwareVersion;
    private DfuHandler mDfuHandler;
    private String mFilePath;
    private SendCommandRequest mLastSendCommandRequest;
    private MeshFileLoader mMeshFileLoader;
    private IBleMeshUpgradeResponse mResponse;
    private TransferFragmentCallback mTransferFragmentCallback;
    private String mUpgradeMac;
    private Map<String, UpgradeCommonStep> commonStepMap = new HashMap();
    private int mcuInstallingTimeout = 30;
    private boolean mIsUpdating = false;
    private boolean mIsMcuUpdating = false;
    private boolean mWouldFirmwareUpgrade = false;
    private HandlerThread mHandlerThread = new HandlerThread("MeshDfuManager-Thread");
    private int mProtocolVersion = 1;
    private BroadcastReceiver mBluetoothReceiver = new BroadcastReceiver() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (TextUtils.equals(action, "com.xiaomi.smarthome.bluetooth.connect_status_changed")) {
                String stringExtra = intent.getStringExtra("key_device_address");
                if (MeshDfuManager.this.mUpgradeMac == null || !MeshDfuManager.this.mUpgradeMac.equalsIgnoreCase(stringExtra) || intent.getIntExtra("key_connect_status", 5) != 32 || MeshDfuManager.this.mResponse == null) {
                    return;
                }
                if (MeshDfuManager.this.mIsUpdating) {
                    MeshDfuManager.this.onUpgradeFailed(-101, "BLE DISCONNECT");
                    return;
                } else {
                    MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.BLE_DISCONNECTED_STATUS, " BLE disconnect");
                    return;
                }
            }
            if (TextUtils.equals(action, "com.xiaomi.smarthome.bluetooth.character_changed")) {
                String stringExtra2 = intent.getStringExtra("key_device_address");
                if (MeshDfuManager.this.mUpgradeMac == null || !MeshDfuManager.this.mUpgradeMac.equalsIgnoreCase(stringExtra2)) {
                    return;
                }
                UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                if (uuid == null || uuid2 == null) {
                    return;
                }
                MeshDfuManager.this.processNotify(uuid, uuid2, byteArrayExtra);
            }
        }
    };
    private IBleChannelReader mChannelReader = new IBleChannelReader() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.2
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader
        public void onRead(String str, byte[] bArr, int i) throws RemoteException {
        }
    };

    public class DfuHandler extends Handler {
        public DfuHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case MeshDfuManager.MSG_SEND_COMMAND_TIMEOUT /* 12289 */:
                    if (MeshDfuManager.this.mLastSendCommandRequest != null && MeshDfuManager.this.mLastSendCommandRequest.sendCallback != null) {
                        MeshDfuManager.this.mLastSendCommandRequest.sendCallback.onFailure(-7, "send command timeout");
                    }
                    MeshDfuManager.this.mLastSendCommandRequest = null;
                    break;
                case MeshDfuManager.MSG_UPDATE_PROGRESS /* 12290 */:
                    if (MeshDfuManager.this.mResponse != null) {
                        try {
                            MeshDfuManager.this.mResponse.onProgress(MeshDfuManager.this.mMeshFileLoader.getProgress());
                        } catch (RemoteException e) {
                            e.printStackTrace();
                        }
                        MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_UPDATE_PROGRESS, 400L);
                    }
                    break;
                case MeshDfuManager.MSG_SEND_NEXT_FRAGMENT /* 12291 */:
                    MeshDfuManager.this.sendFragmentData();
                    break;
                case MeshDfuManager.MSG_CHECK_MCU_VERSION /* 12292 */:
                    MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_CHECK_MCU_VERSION);
                    MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_CHECK_MCU_VERSION, 5000L);
                    MeshDfuManager.this.pollMcuVersion();
                    break;
                case MeshDfuManager.MSG_CHECK_MCU_TIMEOUT /* 12293 */:
                    MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_CHECK_MCU_VERSION);
                    MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.ACTIVATE_MCU_TIMEOUT, "switch mcu firmware, but activate timeout");
                    break;
            }
        }
    }

    public class MeshFileLoader {
        private byte[] fileBuffer;
        private FileInputStream fis;
        private byte[] fragmentBuffer;
        private int fragmentSize;
        private long totalFileSize;
        private long sendFileSize = 0;
        private int fileBufferCount = 0;
        private int fileBufferIndex = 0;
        private boolean complete = false;
        short fragmentIndex = 1;

        public MeshFileLoader(String str, int i) {
            this.fragmentSize = i;
            this.fileBuffer = new byte[i * 10];
            this.fragmentBuffer = new byte[i + 2];
            File file = new File(str);
            this.totalFileSize = file.length();
            try {
                this.fis = new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        private boolean loadFromFile() {
            boolean z;
            try {
                this.fileBufferCount = this.fis.read(this.fileBuffer);
                z = true;
            } catch (IOException e) {
                e.printStackTrace();
                z = false;
            }
            this.fileBufferIndex = 0;
            return z;
        }

        public byte[] getFragmentBuffer() {
            byte[] bArr;
            if (this.complete) {
                BluetoothLog.v("Ble-OTA:MeshDfuManager getFragmentBuffer has send complete");
                return null;
            }
            if (this.fis == null) {
                BluetoothMyLogger.v("Ble-OTA:MeshDfuManager getFragmentBuffer fis is null");
                return null;
            }
            if (this.fileBufferIndex >= this.fileBufferCount && !loadFromFile()) {
                BluetoothMyLogger.v("Ble-OTA:MeshDfuManager loadFromFile failed");
                return null;
            }
            int i = this.fileBufferCount;
            if (i == 0 || i == -1) {
                BluetoothLog.v("Ble-OTA:MeshDfuManager getFragmentBuffer fileBufferCount is " + this.fileBufferCount);
                return null;
            }
            int i2 = this.fileBufferIndex;
            int i3 = i - i2;
            int i4 = this.fragmentSize;
            if (i3 >= i4) {
                System.arraycopy(this.fileBuffer, i2, this.fragmentBuffer, 2, i4);
                bArr = this.fragmentBuffer;
                long j = this.sendFileSize;
                int i5 = this.fragmentSize;
                this.sendFileSize = j + ((long) i5);
                this.fileBufferIndex += i5;
            } else {
                byte[] bArr2 = new byte[(i - i2) + 2];
                System.arraycopy(this.fileBuffer, i2, bArr2, 2, i - i2);
                long j2 = this.sendFileSize;
                int i6 = this.fileBufferCount;
                this.sendFileSize = j2 + ((long) (i6 - this.fileBufferIndex));
                this.fileBufferIndex = i6;
                bArr = bArr2;
            }
            byte[] bArrFromShort = ByteUtils.fromShort(this.fragmentIndex);
            bArr[0] = bArrFromShort[0];
            bArr[1] = bArrFromShort[1];
            this.fragmentIndex = (short) (this.fragmentIndex + 1);
            if (this.sendFileSize >= this.totalFileSize) {
                this.complete = true;
            }
            return bArr;
        }

        public int getProgress() {
            long j = (this.sendFileSize * 100) / this.totalFileSize;
            return (int) (j <= 100 ? j : 100L);
        }

        public boolean isComplete() {
            return this.complete;
        }

        public void release() {
            FileInputStream fileInputStream = this.fis;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.fis = null;
            }
            this.fileBuffer = null;
            this.fragmentBuffer = null;
        }

        public boolean updateLastFragmentIndex(int i) {
            long j = this.fragmentSize * i;
            long j2 = this.totalFileSize;
            if (j > j2) {
                j = j2;
            }
            try {
                if (this.fis.skip(j) != j) {
                    return false;
                }
                this.fragmentIndex = (short) (((short) i) + 1);
                this.sendFileSize = j;
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }
    }

    public interface SendCommandCallback {
        void onFailure(int i, String str);

        void onSuccess(byte[] bArr);
    }

    public class SendCommandRequest {
        int opcode;
        SendCommandCallback sendCallback;

        public SendCommandRequest(int i, SendCommandCallback sendCommandCallback) {
            this.opcode = i;
            this.sendCallback = sendCommandCallback;
        }
    }

    public interface TransferFragmentCallback {
        void onFailure(int i, String str);

        void onSuccess(int i, int i2);
    }

    public class UpgradeCommonStep {
        String firmwareCurrentVersion;
        String firmwareFilePath;
        String mcuCurrentVersion;
        String mcuFilePath;
        boolean isOpenCommandNotify = false;
        boolean isOpenDataNotify = false;
        int protocolVersion = 0;
        int fragmentSize = -1;
        boolean isUpgradingMcu = false;
        boolean isMeshDevice = false;

        public UpgradeCommonStep() {
        }
    }

    private MeshDfuManager() {
        this.mHandlerThread.start();
        this.mDfuHandler = new DfuHandler(this.mHandlerThread.getLooper());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.xiaomi.smarthome.bluetooth.character_changed");
        intentFilter.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
        BluetoothUtils.registerReceiver(this.mBluetoothReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int channelCode2OtaCode(int i) {
        if (i != -3) {
            return i != -2 ? OTAErrorCode.PACKET_UNKNOWN_ERROR : OTAErrorCode.PACKET_RESPONE_TIMEOUT;
        }
        return OTAErrorCode.PACKET_RESPONSE_BUSY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkLastFragmentIndex(int i, int i2, int i3) throws Throwable {
        String currentFilePath = getCurrentFilePath();
        if (!isFileExist(currentFilePath)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                File file = new File(currentFilePath);
                long length = file.length();
                long j = i * i2;
                BluetoothLog.formatLog("check last fragment Index,fragmentSize =%d, lastIndex =%d,fileSize = %d,crc32=%d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(length), Integer.valueOf(i3));
                if (j <= length) {
                    length = j;
                }
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    int inputStreamCRC32 = readInputStreamCRC32(fileInputStream2, length);
                    BluetoothLog.d("check local CRC32=" + inputStreamCRC32);
                    boolean z = i3 == inputStreamCRC32;
                    try {
                        fileInputStream2.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return z;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileInputStream = fileInputStream2;
                    e.printStackTrace();
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
        }
    }

    private String getCurrentFilePath() {
        UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        String str = this.mFilePath;
        return (upgradeCommonStep == null || !upgradeCommonStep.isUpgradingMcu || TextUtils.isEmpty(upgradeCommonStep.mcuFilePath)) ? str : upgradeCommonStep.mcuFilePath;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getFragmentSize() {
        int i;
        final UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        if (upgradeCommonStep == null || (i = upgradeCommonStep.fragmentSize) <= 0) {
            sendCommand(2, null, new SendCommandCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.6
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
                public void onFailure(int i2, String str) {
                    BluetoothLog.formatLog("getFragmentSize fail, code = %d,msg = %s", Integer.valueOf(i2), str);
                    MeshDfuManager.this.onUpgradeFailed(i2, str);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
                public void onSuccess(byte[] bArr) {
                    if (bArr == null || bArr.length < 2) {
                        MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.DFU_READ_FRAGMENT_SIZE_FAIL, "get fragment size failed");
                        return;
                    }
                    short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
                    if (s <= 0) {
                        MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.DFU_READ_FRAGMENT_SIZE_FAIL, "fragment size is 0");
                    } else {
                        upgradeCommonStep.fragmentSize = s;
                        MeshDfuManager.this.handleFragmentSize(s);
                    }
                }
            });
        } else {
            handleFragmentSize(i);
        }
    }

    public static MeshDfuManager getInstance() {
        if (sInstance == null) {
            synchronized (MeshDfuManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new MeshDfuManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void getLastFragmentIndex(final int i) {
        sendCommand(3, null, new SendCommandCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.8
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
            public void onFailure(int i2, String str) {
                MeshDfuManager.this.onUpgradeFailed(i2, str);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
            public void onSuccess(byte[] bArr) throws Throwable {
                if (bArr == null || bArr.length < 2) {
                    MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.DFU_READ_LAST_INDEX_FAIL, "get last fragment index failed");
                    return;
                }
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                short s = byteBufferOrder.getShort();
                int i2 = byteBufferOrder.getInt();
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder2.putInt(i2);
                BluetoothLog.d("remote hex = " + ByteUtils.byteToString(byteBufferOrder2.array()));
                if (s == 0) {
                    BluetoothLog.d("getLastFragmentIndex =0");
                    MeshDfuManager.this.sendData(i);
                    return;
                }
                boolean zCheckLastFragmentIndex = MeshDfuManager.this.checkLastFragmentIndex(i, s, i2);
                BluetoothLog.d("getLastFragmentIndex,check result=" + zCheckLastFragmentIndex);
                if (zCheckLastFragmentIndex) {
                    MeshDfuManager.this.sendData(i, s);
                } else {
                    MeshDfuManager.this.sendData(i);
                }
            }
        });
    }

    private void getMCULastFragmentIndex(final int i) {
        sendCommand(5, null, new SendCommandCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.7
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
            public void onFailure(int i2, String str) {
                MeshDfuManager.this.onUpgradeFailed(i2, str);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
            public void onSuccess(byte[] bArr) throws Throwable {
                if (bArr == null || bArr.length < 2) {
                    MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.READ_MCU_LAST_FRAGMENT_INDEX_FAIL, "get mcu last fragment index failed");
                    return;
                }
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                short s = byteBufferOrder.getShort();
                int i2 = byteBufferOrder.getInt();
                ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder2.putInt(i2);
                BluetoothLog.d("remote hex = " + ByteUtils.byteToString(byteBufferOrder2.array()));
                if (s == 0) {
                    BluetoothLog.d("getMCULastFragmentIndex =0");
                    MeshDfuManager.this.sendData(i);
                    return;
                }
                boolean zCheckLastFragmentIndex = MeshDfuManager.this.checkLastFragmentIndex(i, s, i2);
                BluetoothLog.d("getMCULastFragmentIndex,check result=" + zCheckLastFragmentIndex);
                if (zCheckLastFragmentIndex) {
                    MeshDfuManager.this.sendData(i, s);
                } else {
                    MeshDfuManager.this.sendData(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getProtocolVersion() {
        int i;
        final UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        if (upgradeCommonStep == null || (i = upgradeCommonStep.protocolVersion) == 0) {
            sendCommand(1, null, new SendCommandCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.5
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
                public void onFailure(int i2, String str) {
                    BluetoothLog.formatLog("get protocol version fail, error code=%d,msg=%s", Integer.valueOf(i2), str);
                    MeshDfuManager.this.onUpgradeFailed(i2, str);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
                public void onSuccess(byte[] bArr) {
                    if (bArr == null || bArr.length < 2) {
                        MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.DFU_READ_PROTOCOL_VERSION_FAIL, "get fragment size failed");
                        return;
                    }
                    short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
                    BluetoothLog.formatLog("get Protocol version %d", Integer.valueOf(s));
                    MeshDfuManager.this.mProtocolVersion = s;
                    upgradeCommonStep.protocolVersion = s;
                    MeshDfuManager.this.handleProtocolVersion(s);
                }
            });
        } else {
            handleProtocolVersion(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleProtocolVersion(int i) {
        if (i <= 4) {
            getFragmentSize();
            return;
        }
        onUpgradeFailed(3, "should update app , current app not suit protocol version " + i);
    }

    private void invokeResponse(IBleMeshUpgradeResponse iBleMeshUpgradeResponse, int i, String str) {
        if (iBleMeshUpgradeResponse != null) {
            try {
                iBleMeshUpgradeResponse.onResponse(i, str);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private boolean isFileExist(String str) {
        File file = new File(str);
        return file.exists() && file.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUpgradeFailed(int i, String str) {
        BluetoothMyLogger.v(String.format("Ble-OTA:MeshDfuManager onUpgradeFailed errorCode = %d, errorMsg = %s", Integer.valueOf(i), str));
        invokeResponse(this.mResponse, i, str);
        release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onUpgradeSuccess() {
        BluetoothMyLogger.v("Ble-OTA:MeshDfuManager onUpgradeSuccess ");
        invokeResponse(this.mResponse, 0, null);
        if (this.mWouldFirmwareUpgrade) {
            return;
        }
        BluetoothMyLogger.d("Ble-OTA:MeshDfuManager start release ");
        release();
    }

    private void openCommandNotify() {
        final UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        if (upgradeCommonStep == null || !upgradeCommonStep.isOpenCommandNotify) {
            BleConnectManager.getInstance().notify(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_CONTROL_POINT, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.3
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    if (i != 0) {
                        MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.OPEN_CONTROL_POINT_NOTIFY_FAIL, "open command notify failed");
                        return;
                    }
                    UpgradeCommonStep upgradeCommonStep2 = upgradeCommonStep;
                    if (upgradeCommonStep2 != null) {
                        upgradeCommonStep2.isOpenCommandNotify = true;
                    }
                    MeshDfuManager.this.openDataNotify();
                }
            });
        } else {
            openDataNotify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pollMcuVersion() {
        BluetoothLog.d("Ble-OTA:MeshDfuManager：start poll mcu version");
        BleConnectManager.getInstance().write(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MCU_VERSION, new byte[]{1}, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.11
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, MeshDfuManager.TAG, "pollMcuVersion[write] onResponse code=" + i);
            }
        });
    }

    private void processCommandEvent(DfuCommandCompleteEvent dfuCommandCompleteEvent) {
        SendCommandRequest sendCommandRequest = this.mLastSendCommandRequest;
        if (sendCommandRequest == null || sendCommandRequest.opcode != dfuCommandCompleteEvent.getCommandOpcode()) {
            BluetoothMyLogger.v(String.format("Ble-OTA:MeshDfuManager processCommandEvent (%s) error, can't find callback", dfuCommandCompleteEvent.toString()));
            return;
        }
        this.mDfuHandler.removeMessages(MSG_SEND_COMMAND_TIMEOUT);
        if (this.mLastSendCommandRequest.sendCallback != null) {
            if (dfuCommandCompleteEvent.getStatus() == 0) {
                this.mLastSendCommandRequest.sendCallback.onSuccess(dfuCommandCompleteEvent.getValue());
            } else {
                this.mLastSendCommandRequest.sendCallback.onFailure(status2otaCode(dfuCommandCompleteEvent.getStatus()), null);
                BluetoothMyLogger.v(String.format("Ble-OTA:MeshDfuManager processCommandEvent (%s) error, status failed", dfuCommandCompleteEvent.toString()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UpgradeCommonStep upgradeCommonStep;
        if (BluetoothConstants.MISERVICE.equals(uuid)) {
            if (BluetoothConstants.CHARACTER_MESH_DFU_CONTROL_POINT.equals(uuid2)) {
                if (bArr == null || bArr.length <= 0) {
                    return;
                }
                byte b2 = bArr[0];
                if (b2 == 1) {
                    processCommandEvent(new DfuCommandCompleteEvent(bArr));
                    return;
                } else {
                    if (b2 != 2) {
                        return;
                    }
                    processTransferEvent(new DfuTransferCompleteEvent(bArr));
                    return;
                }
            }
            if (BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT.equals(uuid2)) {
                ChannelManager.BleChannel channel = MeshDfuChannelManager.getInstance().getChannel(this.mUpgradeMac);
                if (channel != null) {
                    channel.onRead(bArr);
                    return;
                }
                return;
            }
            if (BluetoothConstants.CHARACTER_MCU_VERSION.equals(uuid2)) {
                McuEvent value = McuEvent.parseValue(bArr);
                if (value.getOpCode() == 1) {
                    MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "receive mcu version notify, result code=" + value.getResultCode() + ",value=" + value.getValue());
                    if (value.getResultCode() == 0 && (upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac)) != null && upgradeCommonStep.isUpgradingMcu) {
                        String value2 = value.getValue();
                        String str = upgradeCommonStep.mcuCurrentVersion;
                        if (VersionUtils.compareMcuVersion(value2, str) <= 0) {
                            BluetoothLog.d("Ble-OTA:MeshDfuManager：read mcu version success, but still is old version= " + value2);
                            return;
                        }
                        Pair<Boolean, String> pairIsMeshDevice = BluetoothService.getBleCoreProvider().isMeshDevice(this.mUpgradeMac);
                        DeviceApi.reportBleMcuVersion(((Boolean) pairIsMeshDevice.first).booleanValue() ? (String) pairIsMeshDevice.second : BluetoothCache.getPropDid(this.mUpgradeMac), value2, null, null);
                        SmartConfigCache.getInstance().setMcuVersion(this.mUpgradeMac, value2);
                        BluetoothLog.d("Ble-OTA:MeshDfuManager：read mcu version success, and upgrade mcu version ,success,old version=" + str + ",new version =" + value2);
                        this.mDfuHandler.removeMessages(MSG_CHECK_MCU_TIMEOUT);
                        this.mDfuHandler.removeMessages(MSG_CHECK_MCU_VERSION);
                        upgradeCommonStep.isUpgradingMcu = false;
                        upgradeCommonStep.mcuCurrentVersion = value2;
                        this.mIsMcuUpdating = false;
                        onUpgradeSuccess();
                    }
                }
            }
        }
    }

    private void processTransferEvent(DfuTransferCompleteEvent dfuTransferCompleteEvent) {
        if (this.mTransferFragmentCallback == null) {
            BluetoothMyLogger.v(String.format("Ble-OTA:MeshDfuManager processTransferEvent (%s) error, can't find callback", dfuTransferCompleteEvent.toString()));
        } else if (dfuTransferCompleteEvent.getStatus() == 0) {
            this.mTransferFragmentCallback.onSuccess(dfuTransferCompleteEvent.getStatus(), dfuTransferCompleteEvent.getIndex());
        } else {
            this.mTransferFragmentCallback.onFailure(status2otaCode(dfuTransferCompleteEvent.getStatus()), null);
            BluetoothMyLogger.v(String.format("Ble-OTA:MeshDfuManager processTransferEvent (%s) error, status failed", dfuTransferCompleteEvent.toString()));
        }
    }

    public static int readInputStreamCRC32(InputStream inputStream, long j) {
        byte[] bArr = new byte[2048];
        int i = 0;
        int iCrc32 = 0;
        while (true) {
            boolean z = true;
            i++;
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == 0) {
                    break;
                }
                long j2 = i2;
                if (j2 < j) {
                    j -= j2;
                    z = false;
                } else {
                    i2 = (int) j;
                }
                iCrc32 = CRC32.crc32(bArr, i2, iCrc32);
                BluetoothLog.d("length =" + i2);
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN);
                byteBufferOrder.putInt(iCrc32);
                if (z) {
                    BluetoothLog.d("index =" + i + " ,crc32 hex =" + ByteUtils.byteToString(byteBufferOrder.array()));
                    break;
                }
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return iCrc32;
    }

    private void release() {
        if (this.mChannelWriter != null) {
            MeshDfuChannelManager.getInstance().unregisterChannelReader(this.mUpgradeMac, this.mChannelReader);
            this.mChannelWriter = null;
        }
        MeshFileLoader meshFileLoader = this.mMeshFileLoader;
        if (meshFileLoader != null) {
            meshFileLoader.release();
            this.mMeshFileLoader = null;
        }
        if (!TextUtils.isEmpty(this.mUpgradeMac)) {
            this.commonStepMap.remove(this.mUpgradeMac);
        }
        this.mDfuHandler.removeMessages(MSG_SEND_COMMAND_TIMEOUT);
        this.mDfuHandler.removeMessages(MSG_UPDATE_PROGRESS);
        this.mLastSendCommandRequest = null;
        this.mTransferFragmentCallback = null;
        this.mResponse = null;
        this.mIsUpdating = false;
        this.mWouldFirmwareUpgrade = false;
        this.mUpgradeMac = null;
        this.mFilePath = null;
    }

    private void sendCommand(int i, byte[] bArr, final SendCommandCallback sendCommandCallback) {
        try {
            DfuCommand dfuCommand = new DfuCommand(i, bArr);
            this.mLastSendCommandRequest = new SendCommandRequest(i, sendCommandCallback);
            this.mDfuHandler.sendEmptyMessageDelayed(MSG_SEND_COMMAND_TIMEOUT, 20000L);
            BleConnectManager.getInstance().write(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_CONTROL_POINT, dfuCommand.toBytes(), new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.12
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i2, Void r3) {
                    if (i2 == 0) {
                        return;
                    }
                    MeshDfuManager.this.mLastSendCommandRequest = null;
                    MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_SEND_COMMAND_TIMEOUT);
                    sendCommandCallback.onFailure(i2, "send command failed");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            sendCommandCallback.onFailure(-11, "params exceed max size");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendData(int i) {
        BluetoothLog.v("Ble-OTA:MeshDfuManager sendData fragmentSize = " + i);
        String currentFilePath = getCurrentFilePath();
        try {
            if (!new File(currentFilePath).exists()) {
                onUpgradeFailed(-104, "file don't exist");
            } else {
                this.mMeshFileLoader = new MeshFileLoader(currentFilePath, i);
                sendFragmentData();
            }
        } catch (Exception e) {
            BluetoothMyLogger.i("Ble-OTA:MeshDfuManager, sendData exception=" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendFragmentData() {
        MeshFileLoader meshFileLoader = this.mMeshFileLoader;
        if (meshFileLoader == null) {
            return;
        }
        if (meshFileLoader.isComplete()) {
            switchFirmware();
            return;
        }
        byte[] fragmentBuffer = this.mMeshFileLoader.getFragmentBuffer();
        if (fragmentBuffer == null) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager sendFragmentData buffer is null");
            onUpgradeFailed(-1, "read file error");
            return;
        }
        this.mDfuHandler.removeMessages(MSG_UPDATE_PROGRESS);
        this.mDfuHandler.sendEmptyMessage(MSG_UPDATE_PROGRESS);
        StringBuilder sb = new StringBuilder();
        sb.append("Ble-OTA:MeshDfuManager sendFragmentData fragment index = ");
        sb.append(this.mMeshFileLoader.fragmentIndex - 1);
        BluetoothLog.v(sb.toString());
        transferFragment(fragmentBuffer, new TransferFragmentCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.9
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.TransferFragmentCallback
            public void onFailure(int i, String str) {
                MeshDfuManager.this.onUpgradeFailed(i, str);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.TransferFragmentCallback
            public void onSuccess(int i, int i2) {
                MeshDfuManager.this.mDfuHandler.sendEmptyMessage(MeshDfuManager.MSG_SEND_NEXT_FRAGMENT);
            }
        });
    }

    private int status2otaCode(int i) {
        switch (i) {
            case 1:
                return OTAErrorCode.SWITCH_FIRMWARE_COMMAND_WRONG;
            case 2:
                return OTAErrorCode.SWITCH_FIRMWARE_AUTH_FAIL;
            case 3:
                return OTAErrorCode.SWITCH_FIRMWARE_ILLGAL_PARAMS;
            case 4:
                return OTAErrorCode.SWITCH_FIRMWARE_MEMORY_IS_FULL;
            case 5:
                return OTAErrorCode.SWITCH_FIRMWARE_DEVICE_BUSY;
            case 6:
                return OTAErrorCode.SWITCH_FIRMWARE_SIGN_FAIL;
            case 7:
                return OTAErrorCode.RECEIVE_FIRMWARE_FRAGMENT_FAIL;
            case 8:
                return OTAErrorCode.DEVICE_LOW_BATTERY;
            default:
                return OTAErrorCode.SWITCH_FIRMWARE_UNKNOWN_ERROR;
        }
    }

    private void switchFirmware() {
        final boolean z;
        int i;
        BluetoothLog.v("Ble-OTA:MeshDfuManager switchFirmware");
        UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        if (upgradeCommonStep == null || !upgradeCommonStep.isUpgradingMcu) {
            z = false;
            i = 4;
        } else {
            i = 6;
            z = true;
        }
        if (z) {
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, TAG, "mcu installing timeout=" + this.mcuInstallingTimeout);
            invokeResponse(this.mResponse, 4, null);
        }
        sendCommand(i, ByteUtils.fromInt(1), new SendCommandCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.10
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
            public void onFailure(int i2, String str) {
                if (-7 != i2) {
                    MeshDfuManager.this.onUpgradeFailed(i2, str + ":switch firmware fail");
                    return;
                }
                if (!z) {
                    MeshDfuManager.this.onUpgradeSuccess();
                    return;
                }
                MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_CHECK_MCU_TIMEOUT);
                MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_CHECK_MCU_VERSION);
                MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_CHECK_MCU_TIMEOUT, MeshDfuManager.this.mcuInstallingTimeout * 1000);
                MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_CHECK_MCU_VERSION, 5000L);
                MeshDfuManager.this.pollMcuVersion();
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.SendCommandCallback
            public void onSuccess(byte[] bArr) {
                if (MeshDfuManager.this.mResponse != null) {
                    try {
                        MeshDfuManager.this.mResponse.onProgress(100);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                if (!z) {
                    MeshDfuManager.this.onUpgradeSuccess();
                    return;
                }
                MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_CHECK_MCU_TIMEOUT);
                MeshDfuManager.this.mDfuHandler.removeMessages(MeshDfuManager.MSG_CHECK_MCU_VERSION);
                MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_CHECK_MCU_TIMEOUT, MeshDfuManager.this.mcuInstallingTimeout * 1000);
                MeshDfuManager.this.mDfuHandler.sendEmptyMessageDelayed(MeshDfuManager.MSG_CHECK_MCU_VERSION, 5000L);
                MeshDfuManager.this.pollMcuVersion();
            }
        });
    }

    private void transferFragment(byte[] bArr, final TransferFragmentCallback transferFragmentCallback) {
        IBleChannelWriter iBleChannelWriter = this.mChannelWriter;
        if (iBleChannelWriter == null) {
            transferFragmentCallback.onFailure(-1, "channel write is null");
            return;
        }
        try {
            this.mTransferFragmentCallback = transferFragmentCallback;
            iBleChannelWriter.write(bArr, 0, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.13
                @Override // android.os.IInterface
                public IBinder asBinder() {
                    return null;
                }

                @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
                public void onResponse(int i, Bundle bundle) throws RemoteException {
                    if (i == 0) {
                        return;
                    }
                    MeshDfuManager.this.mTransferFragmentCallback = null;
                    transferFragmentCallback.onFailure(MeshDfuManager.this.channelCode2OtaCode(i), "channel write failed");
                }
            });
        } catch (RemoteException e) {
            e.printStackTrace();
            transferFragmentCallback.onFailure(-1, "channel write exception");
        }
    }

    public void cancelUpgrade(String str) {
        BluetoothMyLogger.v(String.format("Ble-OTA:MeshDfuManager cancelUpgrade mac = %s", BluetoothMyLogger.getBase64(str)));
        if (this.mIsUpdating && TextUtils.equals(str, this.mUpgradeMac)) {
            ChannelManager.BleChannel channel = MeshDfuChannelManager.getInstance().getChannel(this.mUpgradeMac);
            if (channel != null) {
                channel.reset();
            }
            onUpgradeFailed(2, "cancel upgrade");
        }
    }

    public int compareFirmwareVersion(String str, String str2) {
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return 0;
        }
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (TextUtils.isEmpty(str2)) {
            return 1;
        }
        String[] strArrSplit = str.split("[._]");
        String[] strArrSplit2 = str2.split("[._]");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        for (int i = 0; i < iMin; i++) {
            try {
                int i2 = Integer.parseInt(strArrSplit[i]);
                int i3 = Integer.parseInt(strArrSplit2[i]);
                if (i2 != i3) {
                    return i2 - i3;
                }
            } catch (Exception e) {
                BluetoothLog.e(e);
                return 0;
            }
        }
        return strArrSplit.length - strArrSplit2.length;
    }

    public String getCurrentUpgradeMac() {
        return this.mUpgradeMac;
    }

    public void handleFragmentSize(int i) {
        UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        if (upgradeCommonStep == null || !upgradeCommonStep.isUpgradingMcu) {
            if (this.mProtocolVersion >= 2) {
                getLastFragmentIndex(i);
                return;
            } else {
                sendData(i);
                return;
            }
        }
        if (this.mProtocolVersion >= 3) {
            getMCULastFragmentIndex(i);
            return;
        }
        onUpgradeFailed(3, "should update app , current app cannot read mcu fragment index , device protocol version is:" + this.mProtocolVersion);
    }

    public boolean isUpgrading() {
        return this.mIsUpdating || this.mIsMcuUpdating;
    }

    public void openDataNotify() {
        final UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(this.mUpgradeMac);
        if (upgradeCommonStep == null || !upgradeCommonStep.isOpenDataNotify) {
            BleConnectManager.getInstance().notify(this.mUpgradeMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_MESH_DFU_DATA_FRAGMENT, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.mesh.MeshDfuManager.4
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    if (i != 0) {
                        MeshDfuManager.this.onUpgradeFailed(OTAErrorCode.OPEN_DATA_FRAGMENT_NOTIFY_FAIL, "open data notify failed");
                        return;
                    }
                    if (upgradeCommonStep.isMeshDevice) {
                        MeshDfuManager meshDfuManager = MeshDfuManager.this;
                        if (meshDfuManager.compareFirmwareVersion("1.4.0", meshDfuManager.mCurrentFirmwareVersion) > 0) {
                            BluetoothLog.formatLog("mesh device skip protocol version,current version is %s", MeshDfuManager.this.mCurrentFirmwareVersion);
                            MeshDfuManager.this.mProtocolVersion = -1;
                            upgradeCommonStep.protocolVersion = -1;
                            MeshDfuManager.this.getFragmentSize();
                            return;
                        }
                    }
                    MeshDfuManager.this.getProtocolVersion();
                }
            });
        } else if (!upgradeCommonStep.isMeshDevice || compareFirmwareVersion("1.4.0", upgradeCommonStep.firmwareCurrentVersion) <= 0) {
            getProtocolVersion();
        } else {
            getFragmentSize();
        }
    }

    public void startMcuUpgrade(String str, String str2, boolean z, String str3, String str4, int i, IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        BluetoothLog.v(String.format("Ble-OTA:MeshDfuManager startMcuUpgrade mac = %s, filePath = %s", str3, str4));
        if (iBleMeshUpgradeResponse == null) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startMcuUpgrade failed, callback is null");
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startMcuUpgrade failed, mac is null");
            invokeResponse(iBleMeshUpgradeResponse, -102, "mac is null");
            return;
        }
        if (this.mIsUpdating) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startMcuUpgrade failed, has another updating");
            invokeResponse(iBleMeshUpgradeResponse, -103, "has another updating");
            return;
        }
        if (!BluetoothUtils.isBleDeviceConnected(str3)) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startMcuUpgrade failed, device is not connected");
            invokeResponse(iBleMeshUpgradeResponse, -100, "device is not connected");
            return;
        }
        if (!isFileExist(str4)) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startMcuUpgrade failed, file is not exist : " + str4);
            invokeResponse(iBleMeshUpgradeResponse, -104, "file is not exist");
            return;
        }
        if (i > this.mcuInstallingTimeout) {
            this.mcuInstallingTimeout = i;
        }
        this.mIsMcuUpdating = true;
        this.mUpgradeMac = str3;
        this.mWouldFirmwareUpgrade = z;
        this.mResponse = iBleMeshUpgradeResponse;
        UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(str3);
        if (upgradeCommonStep == null) {
            upgradeCommonStep = new UpgradeCommonStep();
            this.commonStepMap.put(str3, upgradeCommonStep);
        }
        this.mCurrentFirmwareVersion = str2;
        upgradeCommonStep.isUpgradingMcu = true;
        upgradeCommonStep.mcuCurrentVersion = str;
        upgradeCommonStep.firmwareCurrentVersion = str2;
        upgradeCommonStep.mcuFilePath = str4;
        try {
            upgradeCommonStep.isMeshDevice = iBleMeshUpgradeResponse.isMeshDevice();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (this.mChannelWriter == null) {
            this.mChannelWriter = MeshDfuChannelManager.getInstance().registerChannelReader(str3, this.mChannelReader);
        }
        openCommandNotify();
    }

    public void startUpgrade(String str, String str2, String str3, IBleMeshUpgradeResponse iBleMeshUpgradeResponse) {
        BluetoothLog.v(String.format("Ble-OTA:MeshDfuManager startUpgrade mac = %s, filePath = %s", str2, str3));
        if (iBleMeshUpgradeResponse == null) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startUpdate failed, callback is null");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startUpdate failed, mac is null");
            invokeResponse(iBleMeshUpgradeResponse, -102, "mac is null");
            return;
        }
        if (this.mIsUpdating) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startUpdate failed, has another updating");
            invokeResponse(iBleMeshUpgradeResponse, -103, "has another updating");
            return;
        }
        if (!BluetoothUtils.isBleDeviceConnected(str2)) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startUpdate failed, device is not connected");
            invokeResponse(iBleMeshUpgradeResponse, -100, "device is not connected");
            return;
        }
        if (!isFileExist(str3)) {
            BluetoothMyLogger.d("Ble-OTA:MeshDfuManager startUpdate failed, file is not exist : " + str3);
            invokeResponse(iBleMeshUpgradeResponse, -104, "file is not exist");
            return;
        }
        this.mIsUpdating = true;
        this.mWouldFirmwareUpgrade = false;
        this.mUpgradeMac = str2;
        this.mFilePath = str3;
        this.mResponse = iBleMeshUpgradeResponse;
        this.mCurrentFirmwareVersion = str;
        UpgradeCommonStep upgradeCommonStep = this.commonStepMap.get(str2);
        if (upgradeCommonStep == null) {
            upgradeCommonStep = new UpgradeCommonStep();
            this.commonStepMap.put(str2, upgradeCommonStep);
        }
        upgradeCommonStep.isUpgradingMcu = false;
        upgradeCommonStep.firmwareCurrentVersion = str;
        upgradeCommonStep.firmwareFilePath = str3;
        try {
            upgradeCommonStep.isMeshDevice = iBleMeshUpgradeResponse.isMeshDevice();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        if (this.mChannelWriter == null) {
            this.mChannelWriter = MeshDfuChannelManager.getInstance().registerChannelReader(str2, this.mChannelReader);
        }
        openCommandNotify();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendData(int i, int i2) {
        String currentFilePath = getCurrentFilePath();
        BluetoothLog.formatLog("send data fragment size = %d,last fragment index =%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (!new File(currentFilePath).exists()) {
            onUpgradeFailed(-104, "file don't exist");
            return;
        }
        MeshFileLoader meshFileLoader = new MeshFileLoader(currentFilePath, i);
        this.mMeshFileLoader = meshFileLoader;
        meshFileLoader.updateLastFragmentIndex(i2);
        sendFragmentData();
    }
}
