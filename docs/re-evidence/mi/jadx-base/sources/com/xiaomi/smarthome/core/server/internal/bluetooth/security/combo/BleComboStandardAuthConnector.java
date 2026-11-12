package com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.miio.JNIBridge;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipEncrypt;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.ECCPointConvert;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.bluetooth.utils.DecryptUtil;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.IOUtils;
import com.xiaomi.smarthome.library.crypto.MD5Util;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.Arrays;
import java.util.UUID;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes10.dex */
public class BleComboStandardAuthConnector extends BleStandardAuthConnector {
    protected static final int MSG_GET_WUGAN_CONFIRM_MSG_TIMEOUT = 4113;
    private static final int MSG_NOTIFY_TIMEOUT = 4102;
    private static final int MSG_PULL_DEVICE_LOG_TIMEOUT = 4112;
    private static final int SUPPORT_STANDARD_AUTH_VERSION = 1;
    private static final int SUPPORT_STANDARD_AUTH_VERSION_V2 = 2;
    private static final int SUPPORT_STANDARD_AUTH_VERSION_V3 = 3;
    private static final String TAG = "BleComboStandardAuthConnector";
    protected SecretKey eShareKey;
    private volatile boolean hasDecrypt;
    private boolean isReceivingLog;
    protected byte[] mAppIv;
    protected byte[] mAppKey;
    private int mCurrentStandardAuthVersion;
    protected byte[] mDevIv;
    protected byte[] mDeviceKey;
    private String mDeviceLogFilePath;
    private IBleResponse mDeviceLogResponse;
    protected PublicKey mDevicePubKey;
    private String mDeviceVersion;
    protected BleSecurityChipEncrypt.EncryptCounter mEncryptCounter;
    private int mLastOrder;
    private boolean mNeedRealOOB;
    protected byte[] mOOB;
    private ConnectReceiver mReceiver;
    protected KeyPair mRegisterAppKeyPair;
    private String mRpcKey;
    private byte[] mTempDeviceId;
    private boolean mWaitingDeviceLog;
    protected BleComboWifiConfig mWifiConfig;
    private static final byte[] REQ_DEV_INFO = {-94, 0, 0, 0};
    private static final byte[] REQ_DEV_LOG = {-90, 0, 0, 0};
    protected static final byte[] REQ_WUGAN_CONFIRM_MSG = {-89, 0, 0, 0};
    private static final byte[] REG_SUCCESS = {17, 0, 0, 0};
    private static final byte[] REG_FAILED = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, 0, 0, 0};
    private static final byte[] REG_VERIFY_SUCCESS = {HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_ALL_DAY, 0, 0, 0};
    private static final byte[] REG_VERIFY_FAILED = {20, 0, 0, 0};
    private static final byte[] ERR_REGISTERED = {-31, 0, 0, 0};
    private static final byte[] ERR_NO_DEV_LOG = {-28, 0, 0, 0};

    public class ConnectReceiver extends BroadcastReceiver {
        private ConnectReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if (!"com.xiaomi.smarthome.bluetooth.character_changed".equalsIgnoreCase(action)) {
                if ("com.xiaomi.smarthome.bluetooth.connect_status_changed".equalsIgnoreCase(action)) {
                    String stringExtra = intent.getStringExtra("key_device_address");
                    int intExtra = intent.getIntExtra("key_connect_status", 5);
                    if (TextUtils.equals(stringExtra, BleComboStandardAuthConnector.this.getMac()) && intExtra == 32 && BleComboStandardAuthConnector.this.isReceivingLog) {
                        BleComboStandardAuthConnector bleComboStandardAuthConnector = BleComboStandardAuthConnector.this;
                        bleComboStandardAuthConnector.invokeDeviceLogCallback(bleComboStandardAuthConnector.mDeviceLogResponse, -32);
                        BleComboStandardAuthConnector.this.stopPullDeviceLog();
                        return;
                    }
                    return;
                }
                return;
            }
            if (BleComboStandardAuthConnector.this.getMac().equalsIgnoreCase(intent.getStringExtra("key_device_address"))) {
                UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                if (uuid == null || uuid2 == null || !BluetoothConstants.MISERVICE.equals(uuid) || !BluetoothConstants.CHARACTER_STANDARD_AUTH.equals(uuid2)) {
                    return;
                }
                BleComboStandardAuthConnector.this.processNotify(uuid, uuid2, byteArrayExtra);
            }
        }
    }

    public BleComboStandardAuthConnector(IBleDeviceLauncher iBleDeviceLauncher, BleComboWifiConfig bleComboWifiConfig) {
        super(iBleDeviceLauncher);
        this.mDeviceVersion = "";
        this.mNeedRealOOB = false;
        this.mWaitingDeviceLog = false;
        this.mEncryptCounter = new BleSecurityChipEncrypt.EncryptCounter();
        this.mDeviceLogResponse = null;
        this.mReceiver = null;
        this.hasDecrypt = false;
        this.mLastOrder = -1;
        this.isReceivingLog = false;
        this.mRpcKey = "";
        this.mWifiConfig = bleComboWifiConfig;
    }

    private byte[] generateWifiConfig() {
        return this.mWifiConfig.toBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x010c A[Catch: all -> 0x00f9, TryCatch #5 {all -> 0x00f9, blocks: (B:3:0x0001, B:6:0x000a, B:31:0x00cf, B:33:0x00dc, B:36:0x00fb, B:37:0x00ff, B:39:0x010c, B:40:0x0128, B:41:0x012b, B:44:0x0130, B:46:0x0134, B:49:0x0139), top: B:58:0x0001, inners: #3 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x010c, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0034: MOVE (r1 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:14:0x0034 */
    public synchronized void invokeDeviceLogCallback(IBleResponse iBleResponse, int i) {
        BufferedInputStream bufferedInputStream;
        InputStream inputStream;
        try {
            InputStream inputStream2 = null;
            if (!this.hasDecrypt && i == 100) {
                this.hasDecrypt = true;
                File file = new File(this.mDeviceLogFilePath);
                try {
                    try {
                        byte[] bArr = new byte[2048];
                        byte[] bArrJoinByteArray = new byte[0];
                        bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 2048);
                        int i2 = 0;
                        while (true) {
                            try {
                                int i3 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i3 == -1) {
                                    break;
                                }
                                bArrJoinByteArray = joinByteArray(bArrJoinByteArray, bArr);
                                i2 += i3;
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                            }
                        }
                        bufferedInputStream.close();
                        BluetoothMyLogger.e("receiveDeviceLog file total count: " + i2 + ", result size: " + bArrJoinByteArray.length);
                        if (new String(ByteUtils.get(bArrJoinByteArray, 65, 2)).equals("00")) {
                            JNIBridge.MiioMsg miioMsgBledecrypt = JNIBridge.bledecrypt(ByteUtils.get(bArrJoinByteArray, 256, i2 - 260), DecryptUtil.hexToBytes(MD5Util.getMd5Digest(this.mRpcKey)));
                            if (miioMsgBledecrypt.f13588a == null || iBleResponse == null) {
                                BluetoothMyLogger.e("receiveDeviceLog error:MiioLocalErrorCode.DEVICE_EXCEPTION");
                            } else {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr2 = miioMsgBledecrypt.f13588a;
                                byteArrayOutputStream.write(bArr2, 0, bArr2.length);
                                String strByteToString = ByteUtils.byteToString(miioMsgBledecrypt.f13588a);
                                MiJiaLog.writeLogOnAll(LogType.DEVICE, TAG, "BLE_DEVICE_LOG_START" + strByteToString + "BLE_DEVICE_LOG_END");
                                MiJiaLog.flushLog();
                            }
                        } else {
                            BluetoothMyLogger.e("receiveDeviceLog error: gs wrong");
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        if (new File(this.mDeviceLogFilePath).exists()) {
                            boolean zDelete = file.delete();
                            MiJiaLog.writeLogOnAll(LogType.DEVICE, TAG, "origin file delete result: " + zDelete);
                        }
                        IOUtils.closeQuietly(inputStream2);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (new File(this.mDeviceLogFilePath).exists()) {
                        boolean zDelete2 = file.delete();
                        MiJiaLog.writeLogOnAll(LogType.DEVICE, TAG, "origin file delete result: " + zDelete2);
                    }
                    IOUtils.closeQuietly(inputStream2);
                    throw th;
                }
                if (new File(this.mDeviceLogFilePath).exists()) {
                    boolean zDelete3 = file.delete();
                    MiJiaLog.writeLogOnAll(LogType.DEVICE, TAG, "origin file delete result: " + zDelete3);
                }
                IOUtils.closeQuietly(bufferedInputStream);
            }
            if (iBleResponse != null && i == 100) {
                try {
                    if (this.hasDecrypt) {
                        iBleResponse.onResponse(i, null);
                    }
                } catch (RemoteException e3) {
                    e3.printStackTrace();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static byte[] joinByteArray(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + bArr2.length).put(bArr).put(bArr2).array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleComboStandardAuthConnector Process Step 1 plus ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleComboStandardAuthConnector Step 1 plus onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleComboStandardAuthConnector.this.requestDeviceInfo();
                    } else {
                        BleComboStandardAuthConnector.this.dispatchResult(-27);
                    }
                }
            });
        }
    }

    private void receiveDeviceLog(byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(this.mDeviceLogFilePath)) {
            BluetoothMyLogger.e("receiveDeviceLog logFilePath  is empty,then return !");
            invokeDeviceLogCallback(this.mDeviceLogResponse, -100);
            stopPullDeviceLog();
            return;
        }
        if (this.mDeviceLogResponse == null) {
            BluetoothMyLogger.e("receiveDeviceLog log Response is null,then return !");
            return;
        }
        BluetoothMyLogger.v("receiveDeviceLog device file: " + this.mDeviceLogFilePath);
        final byte b2 = bArr[0];
        final byte b3 = bArr[1];
        BluetoothMyLogger.v("receiveDeviceLog detail: order=" + ((int) b2) + ",totalCount=" + ((int) b3) + ", mLastOrder=" + this.mLastOrder);
        if (b2 > b3) {
            BluetoothMyLogger.e("receiveDeviceLog order > totalCount,impossible!!!");
            invokeDeviceLogCallback(this.mDeviceLogResponse, -101);
            stopPullDeviceLog();
            return;
        }
        if (b2 <= this.mLastOrder) {
            BluetoothMyLogger.e("receiveDeviceLog invalid order, lastOrder=" + this.mLastOrder + ",current order=" + ((int) b2));
            invokeDeviceLogCallback(this.mDeviceLogResponse, -101);
            stopPullDeviceLog();
            return;
        }
        this.mLastOrder = b2;
        this.isReceivingLog = true;
        int length = bArr.length - 2;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 2, bArr2, 0, length);
        File file = new File(this.mDeviceLogFilePath);
        if (b2 == 1) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            if (file.exists()) {
                file.delete();
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    file.createNewFile();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            byte[] bArr3 = ByteUtils.get(bArr2, 21, 8);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.put(bArr3, 0, 8);
            byteBufferAllocate.flip();
            long j = byteBufferAllocate.getLong();
            String str = new String(ByteUtils.get(bArr2, 31, 32), 0, 32);
            BluetoothMyLogger.i("receiveDeviceLog did =" + j + ", random = " + str);
            DeviceApi.getOTKey(String.valueOf(j), str, new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.5
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    BluetoothMyLogger.i("receiveDeviceLog requestOTAKey error = " + bleNetError);
                    BleComboStandardAuthConnector bleComboStandardAuthConnector = BleComboStandardAuthConnector.this;
                    bleComboStandardAuthConnector.invokeDeviceLogCallback(bleComboStandardAuthConnector.mDeviceLogResponse, -102);
                    BleComboStandardAuthConnector.this.stopPullDeviceLog();
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(String str2) {
                    BleComboStandardAuthConnector.this.mRpcKey = str2;
                    BluetoothMyLogger.i("receiveDeviceLog requestOTAKey mRpcKey = " + BleComboStandardAuthConnector.this.mRpcKey);
                    if (b2 == b3) {
                        BleComboStandardAuthConnector bleComboStandardAuthConnector = BleComboStandardAuthConnector.this;
                        bleComboStandardAuthConnector.invokeDeviceLogCallback(bleComboStandardAuthConnector.mDeviceLogResponse, 100);
                        BleComboStandardAuthConnector.this.stopPullDeviceLog();
                    }
                }
            });
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
                try {
                    fileOutputStream.write(bArr2);
                } catch (FileNotFoundException e3) {
                    e = e3;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    fileOutputStream = fileOutputStream2;
                } catch (IOException e4) {
                    e = e4;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    IOUtils.closeQuietly(fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e5) {
            e = e5;
        } catch (IOException e6) {
            e = e6;
        }
        IOUtils.closeQuietly(fileOutputStream);
        int i = (this.mLastOrder * 100) / b3;
        Bundle bundle = new Bundle();
        bundle.putInt(BroadcastsKt.SILENT_PUSHING_PROGRESS, i);
        IBleResponse iBleResponse = this.mDeviceLogResponse;
        if (iBleResponse != null) {
            try {
                iBleResponse.onResponse(101, bundle);
            } catch (RemoteException e7) {
                e7.printStackTrace();
            }
        }
        if (this.mLastOrder != b3 || TextUtils.isEmpty(this.mRpcKey)) {
            return;
        }
        invokeDeviceLogCallback(this.mDeviceLogResponse, 100);
        stopPullDeviceLog();
    }

    private void receiveDeviceResult(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleComboStandardAuthConnector receiveDeviceResult ..., value = " + ByteUtils.byteToString(bArr));
        if (ByteUtils.equals(bArr, REG_SUCCESS)) {
            this.mHandler.removeMessages(4102);
            dispatchResult(0);
            return;
        }
        if (ByteUtils.equals(bArr, REG_FAILED)) {
            this.mHandler.removeMessages(4102);
            dispatchResult(-51);
        } else if (ByteUtils.equals(bArr, ERR_REGISTERED)) {
            this.mHandler.removeMessages(4102);
            dispatchResult(-17);
        } else if (ByteUtils.equals(bArr, ERR_NO_DEV_LOG)) {
            BluetoothMyLogger.e("receiveDeviceLog ,but device no log");
            this.isReceivingLog = false;
            invokeDeviceLogCallback(this.mDeviceLogResponse, -102);
            this.mDeviceLogResponse = null;
        }
    }

    private void recvDeviceInfo(byte[] bArr) {
        if (bArr.length < 4) {
            BluetoothMyLogger.e("BleComboStandardAuthConnector recvDeviceInfo data format error");
            dispatchResult(-47);
            return;
        }
        this.mCurrentStandardAuthVersion = bArr[0] + (bArr[1] << 8);
        BluetoothMyLogger.v("BleComboStandardAuthConnector recvDeviceInfo ...，combo standard protocol version=" + this.mCurrentStandardAuthVersion);
        if (this.mCurrentStandardAuthVersion > 3) {
            dispatchResult(-37);
            BluetoothCache.setSupportPollDeviceLog(getMac(), false);
            return;
        }
        BluetoothCache.setSupportPollDeviceLog(getMac(), this.mCurrentStandardAuthVersion > 1);
        if (bArr.length > 4) {
            if (this.mCurrentStandardAuthVersion < 3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 4, bArr.length);
                int i = 0;
                for (int i2 = 0; i2 < bArrCopyOfRange.length && bArrCopyOfRange[i2] != 0; i2++) {
                    i = i2;
                }
                this.mTempDeviceId = Arrays.copyOfRange(bArrCopyOfRange, 0, i + 1);
            } else {
                this.mTempDeviceId = ByteUtils.cutBeforeBytes(Arrays.copyOfRange(bArr, 4, 24), (byte) 0);
                if (ByteUtils.parseDevInfoFeature(Arrays.copyOfRange(bArr, 26, 28))[0] == 1) {
                    BluetoothCache.setSupportReportDeviceLog(getMac(), true);
                }
                BluetoothCache.setComboV3OrPlus(getDidText(), true);
            }
        }
        BluetoothMyLogger.v("BleComboStandardAuthConnector device id = " + getDidText());
        if (bArr[2] + (bArr[3] << 8) > 0) {
            this.mNeedRealOOB = true;
            dispatchResult(-37);
            return;
        }
        this.mNeedRealOOB = false;
        boolean zIsKuailianUseA4 = BluetoothService.getBleCoreProvider().isKuailianUseA4();
        if (this.mCurrentStandardAuthVersion < 3 || !zIsKuailianUseA4) {
            sendRegStart();
        } else {
            doSendA4AfterGetDeviceInfo(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.8
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i3, Void r2) {
                    BluetoothMyLogger.v("BleComboStandardAuthConnector doSendA4AfterGetDeviceInfo Successfully!");
                    BleComboStandardAuthConnector.this.doAfterMTUCompleted();
                }
            });
        }
    }

    private void recvDevicePubKey(byte[] bArr) {
        BluetoothMyLogger.v("BleComboStandardAuthConnector recvDevicePubKey ...");
        this.mHandler.removeMessages(4102);
        byte[] bArr2 = new byte[65];
        bArr2[0] = 4;
        System.arraycopy(bArr, 0, bArr2, 1, bArr.length);
        try {
            this.mDevicePubKey = ECCPointConvert.fromUncompressedPoint(bArr2, ((ECPublicKey) this.mRegisterAppKeyPair.getPublic()).getParams());
        } catch (Exception e) {
            e.printStackTrace();
        }
        verifyDeviceParams();
    }

    private void registerBleNotifyReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new ConnectReceiver();
            IntentFilter intentFilter = new IntentFilter("com.xiaomi.smarthome.bluetooth.character_changed");
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
            BluetoothUtils.registerReceiver(this.mReceiver, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestDeviceInfo() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleComboStandardAuthConnector requestDeviceInfo ...");
            BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, REQ_DEV_INFO, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.3
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r4) {
                    BluetoothMyLogger.v("BleComboStandardAuthConnector requestDeviceInfo onResponse: " + Code.toString(i));
                    if (i != 0) {
                        BleComboStandardAuthConnector.this.dispatchResult(-28);
                    } else {
                        ((BleSecurityConnector) BleComboStandardAuthConnector.this).mHandler.removeMessages(4102);
                        ((BleSecurityConnector) BleComboStandardAuthConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                    }
                }
            });
        }
    }

    private byte[] requestOOB() {
        return new byte[16];
    }

    private void sendWifiConfig(byte[] bArr) {
        BluetoothMyLogger.v("BleComboStandardAuthConnector sendWifiConfig");
        if (writeChannel(bArr, 15, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.9
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleComboStandardAuthConnector sendWifiConfig onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.dispatchResult(0);
                } else {
                    BleComboStandardAuthConnector.this.dispatchResult(-28);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    private void startSendWifiConfigAfterAuthSuccess() {
        BluetoothMyLogger.v("BleComboStandardAuthConnector startSendWifiConfigAfterAuthSuccess");
        byte[] bArrDeriveKeyFromOOB = deriveKeyFromOOB(this.eShareKey.getEncoded(), this.mOOB);
        byte[] bArr = new byte[16];
        this.mDeviceKey = bArr;
        System.arraycopy(bArrDeriveKeyFromOOB, 0, bArr, 0, 16);
        byte[] bArr2 = new byte[16];
        this.mAppKey = bArr2;
        System.arraycopy(bArrDeriveKeyFromOOB, 16, bArr2, 0, 16);
        byte[] bArr3 = new byte[4];
        this.mDevIv = bArr3;
        System.arraycopy(bArrDeriveKeyFromOOB, 32, bArr3, 0, 4);
        byte[] bArr4 = new byte[4];
        this.mAppIv = bArr4;
        System.arraycopy(bArrDeriveKeyFromOOB, 36, bArr4, 0, 4);
        byte[] bArrEncryptAppData = encryptAppData(this.mAppKey, this.mAppIv, generateWifiConfig());
        if (bArrEncryptAppData != null) {
            sendWifiConfig(bArrEncryptAppData);
        } else {
            BluetoothMyLogger.e("BleComboStandardAuthConnector encrypt wifi config failed");
            dispatchResult(-51);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPullDeviceLog() {
        this.mHandler.removeMessages(4112);
        unregisterBleNotifyReceiver();
        this.isReceivingLog = false;
        this.mDeviceLogResponse = null;
    }

    private void unregisterBleNotifyReceiver() {
        ConnectReceiver connectReceiver = this.mReceiver;
        if (connectReceiver != null) {
            BluetoothUtils.unregisterReceiver(connectReceiver);
            this.mReceiver = null;
        }
    }

    private void verifyDeviceParams() {
        BluetoothMyLogger.v("BleComboStandardAuthConnector verifyDeviceParams ..., mNeedRealOOB = " + this.mNeedRealOOB);
        PublicKey publicKey = this.mDevicePubKey;
        if (publicKey == null) {
            BluetoothMyLogger.v("BleComboStandardAuthConnector mDevicePubKey is null ...");
            dispatchResult(-51);
            return;
        }
        SecretKey secret = SecurityChipUtil.getSecret(publicKey, this.mRegisterAppKeyPair.getPrivate());
        this.eShareKey = secret;
        if (secret == null) {
            BluetoothMyLogger.v("BleComboStandardAuthConnector eShareKey is null ...");
            dispatchResult(-51);
        } else if (this.mNeedRealOOB) {
            dispatchResult(-37);
        } else {
            this.mOOB = requestOOB();
            startSendWifiConfigAfterAuthSuccess();
        }
    }

    public byte[] deriveKeyFromOOB(byte[] bArr, byte[] bArr2) {
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, bArr2);
            return hkdf.deriveKey("mible-setup-info".getBytes(), 64);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecurityConnect
    public void disconnect() {
        super.disconnect();
        if (this.mCurrentStandardAuthVersion > 1) {
            unregisterChannelReader();
        }
    }

    public void doAfterMTUCompleted() {
        sendRegStart();
    }

    public byte[] encryptAppData(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.mEncryptCounter.addAppLowCounter();
        short appLowCounter = this.mEncryptCounter.getAppLowCounter();
        byte[] appNonce = this.mEncryptCounter.getAppNonce();
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr2, 0, bArr4, 0, 4);
        System.arraycopy(appNonce, 0, bArr4, 8, 4);
        byte[] bArrAESEncrypt = SecurityChipUtil.AESEncrypt(bArr, bArr4, bArr3);
        if (bArrAESEncrypt == null) {
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(bArrAESEncrypt.length + 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.putShort((short) (65535 & appLowCounter));
        byteBufferOrder.put(bArrAESEncrypt);
        return byteBufferOrder.array();
    }

    public String getDidText() {
        return ByteUtils.isEmpty(this.mTempDeviceId) ? "" : new String(this.mTempDeviceId).trim();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public byte[] getGeneratedToken() {
        return null;
    }

    public int getInt(int i, int i2, int i3) {
        return (i >> i2) & ((1 << ((i3 - i2) + 1)) - 1);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector
    public void onChannelRead(byte[] bArr, int i) throws Throwable {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        if (i == 0) {
            recvDeviceInfo(bArr);
        } else if (i == 3) {
            recvDevicePubKey(bArr);
        } else {
            if (i != 17) {
                return;
            }
            receiveDeviceLog(bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void onConnectFinished() {
        if (this.mCurrentStandardAuthVersion <= 1) {
            unregisterChannelReader();
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        int i = message.what;
        if (i == 4102) {
            BluetoothMyLogger.w("BleComboStandardAuthConnector notify timeout");
            dispatchResult(-55);
            return;
        }
        if (i == 4112) {
            BluetoothMyLogger.w("BleComboStandardAuthConnector pull device log trigger timeout");
            invokeDeviceLogCallback(this.mDeviceLogResponse, -103);
            stopPullDeviceLog();
        } else {
            if (i != 4113) {
                return;
            }
            BluetoothMyLogger.w("BleComboStandardAuthConnector get wugan confirm msg timeout");
            invokeDeviceLogCallback(this.mDeviceLogResponse, -103);
            this.mHandler.removeMessages(4113);
            dispatchResult(-103);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            receiveDeviceResult(bArr);
        } else if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_STANDARD_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleComboStandardAuthConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        this.mEncryptCounter.resetAllCounter();
        getBleLockFirmwareVersion(getMac(), new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str) {
                if (i == 0) {
                    BleComboStandardAuthConnector.this.mDeviceVersion = str;
                    BluetoothMyLogger.v("BleComboStandardAuthConnector get device version: " + str);
                } else {
                    BluetoothMyLogger.v("BleComboStandardAuthConnector get device version failed");
                }
                BluetoothCache.setPropFirVersion(BleComboStandardAuthConnector.this.getMac(), BleComboStandardAuthConnector.this.mDeviceVersion);
                BleComboStandardAuthConnector.this.openStandardAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.1.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                    public void onResponse(int i2, Void r3) {
                        BluetoothMyLogger.v("BleComboStandardAuthConnector Step 1 onResponse: " + Code.toString(i2));
                        if (i2 == 0) {
                            BleComboStandardAuthConnector.this.processStep1Plus();
                        } else {
                            BleComboStandardAuthConnector.this.dispatchResult(-27);
                        }
                    }
                });
            }
        });
    }

    public void requestDeviceLog(String str, final IBleResponse iBleResponse) {
        if (this.isReceivingLog) {
            BluetoothMyLogger.v("requestDeviceLog, but now is receiving device log!");
            invokeDeviceLogCallback(iBleResponse, 102);
            return;
        }
        this.mDeviceLogFilePath = str;
        BluetoothMyLogger.v("BleComboStandardAuthConnector requestDeviceLog ...");
        if (TextUtils.isEmpty(str)) {
            BluetoothMyLogger.v("requestDeviceLog, params file path cannot be empty!");
            invokeDeviceLogCallback(iBleResponse, -100);
        } else {
            registerBleNotifyReceiver();
            BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, REQ_DEV_LOG, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.4
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r5) {
                    BluetoothMyLogger.v("BleComboStandardAuthConnector requestDeviceLog onResponse: " + Code.toString(i));
                    ((BleSecurityConnector) BleComboStandardAuthConnector.this).mHandler.sendEmptyMessageDelayed(4112, 30000L);
                    if (i == 0) {
                        BleComboStandardAuthConnector.this.mDeviceLogResponse = iBleResponse;
                    } else {
                        BleComboStandardAuthConnector.this.mDeviceLogResponse = null;
                    }
                    BleComboStandardAuthConnector.this.invokeDeviceLogCallback(iBleResponse, i);
                }
            });
        }
    }

    public void sendAppPublicKey() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleComboStandardAuthConnector sendAppPublicKey ...");
        KeyPair keyPairGenerateEcc256KeyPair = SecurityChipUtil.generateEcc256KeyPair();
        this.mRegisterAppKeyPair = keyPairGenerateEcc256KeyPair;
        if (writeChannel(SecurityChipUtil.getRawPublicKey(keyPairGenerateEcc256KeyPair.getPublic()), 3, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.7
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleComboStandardAuthConnector sendAppPublicKey onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleComboStandardAuthConnector.this.dispatchResult(-28);
                } else {
                    ((BleSecurityConnector) BleComboStandardAuthConnector.this).mHandler.removeMessages(4102);
                    ((BleSecurityConnector) BleComboStandardAuthConnector.this).mHandler.sendEmptyMessageDelayed(4102, 15000L);
                }
            }
        })) {
            return;
        }
        dispatchResult(-28);
    }

    public void sendRegStart() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleComboStandardAuthConnector sendRegStart ...");
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, new byte[]{21, 0, 0, 0}, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector.6
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleComboStandardAuthConnector sendRegStart onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleComboStandardAuthConnector.this.sendAppPublicKey();
                } else {
                    BleComboStandardAuthConnector.this.dispatchResult(-28);
                }
            }
        });
    }
}
