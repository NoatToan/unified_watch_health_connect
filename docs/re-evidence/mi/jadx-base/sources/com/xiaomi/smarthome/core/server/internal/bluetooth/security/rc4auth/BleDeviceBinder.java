package com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothHelper;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.common.util.ByteUtils;

/* JADX INFO: loaded from: classes10.dex */
public class BleDeviceBinder implements IBleDeviceBinder {
    public static final int BIND_FAILED = -381567184;
    public static final int BIND_SUCCESS = -1402883792;
    private byte[] mBeaconKey;
    private boolean mCanceld;
    private IBleDeviceLauncher mLauncher;
    private BleBindResponse mResponse;
    private byte[] mTempSN;
    private int mRetryApplyDidTimes = 1;
    private final BleReadResponse mReadSNResponse = new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.1
        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
        public void onResponse(int i, byte[] bArr) {
            if (i != 0 || ByteUtils.isEmpty(bArr)) {
                if (ByteUtils.isEmpty(bArr)) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(8, "msg", "sn is empty");
                }
                BluetoothService.getReportCoreProvider().addContextByActionCode(8, "error_code", String.valueOf(i));
                BluetoothService.getReportCoreProvider().finishAction(8, 2);
            } else {
                BluetoothLog.w("local did(encrypted): " + ByteUtils.byteToString(bArr));
                BluetoothLog.w("local token is " + BleDeviceBinder.this.getTokenText());
                byte[] bArrEncrypt = BLECipher.encrypt(BleDeviceBinder.this.getToken(), bArr);
                BluetoothLog.w("local did(decrypted): " + ByteUtils.byteToString(bArrEncrypt));
                if (!ByteUtils.isAllFF(bArrEncrypt)) {
                    BleDeviceBinder.this.mTempSN = ByteUtils.cutBeforeBytes(bArrEncrypt, (byte) 0);
                    if (ByteUtils.getText(BleDeviceBinder.this.mTempSN).startsWith(BluetoothConstants.DID_PREFIX)) {
                        BluetoothCache.setPropDid(BleDeviceBinder.this.getMac(), BleDeviceBinder.this.getSNText());
                    } else {
                        BleDeviceBinder.this.mTempSN = ByteUtils.EMPTY_BYTES;
                    }
                }
                BluetoothService.getReportCoreProvider().finishAction(8);
            }
            BluetoothService.getReportCoreProvider().startAction(9);
            BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
            bleDeviceBinder.readBeaconKeyFromDevice(bleDeviceBinder.mReadBeaconKeyResponse);
        }
    };
    private final BleReadResponse mReadBeaconKeyResponse = new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.2
        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
        public void onResponse(int i, byte[] bArr) {
            if (i != 0 || ByteUtils.isEmpty(bArr)) {
                if (ByteUtils.isEmpty(bArr)) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(9, "msg", "beacon key is empty");
                }
                BluetoothService.getReportCoreProvider().addContextByActionCode(9, "error_code", String.valueOf(i));
            } else {
                BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
                bleDeviceBinder.mBeaconKey = BLECipher.encrypt(bleDeviceBinder.getToken(), bArr);
                BluetoothService.getReportCoreProvider().finishAction(9);
            }
            BleDeviceBinder bleDeviceBinder2 = BleDeviceBinder.this;
            bleDeviceBinder2.applySNFromServer(bleDeviceBinder2.mApplySNResponse);
        }
    };
    private final BleReadResponse mApplySNResponse = new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.3
        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
        public void onResponse(final int i, byte[] bArr) {
            if (i != 0) {
                BleDeviceBinder.this.writeBindResultToDevice(i, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.3.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                    public void onResponse(int i2, Void r2) {
                        BleDeviceBinder.this.dispatchResult(i);
                    }
                });
                return;
            }
            if (!ByteUtils.isEmpty(BleDeviceBinder.this.mTempSN) || ByteUtils.isEmpty(bArr)) {
                if (ByteUtils.isEmpty(BleDeviceBinder.this.mTempSN) || !ByteUtils.byteEquals(BleDeviceBinder.this.mTempSN, bArr)) {
                    throw new IllegalStateException("strange exception");
                }
                BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
                bleDeviceBinder.bindSNToServer(bleDeviceBinder.mBindSNResponse);
                return;
            }
            BleDeviceBinder.this.mTempSN = bArr;
            byte[] bArrFillBeforeBytes = ByteUtils.fillBeforeBytes(bArr, 20, (byte) 0);
            BluetoothLog.w("write SN to Device: " + ByteUtils.byteToString(bArrFillBeforeBytes));
            byte[] bArrEncrypt = BLECipher.encrypt(BleDeviceBinder.this.getToken(), bArrFillBeforeBytes);
            BluetoothService.getReportCoreProvider().startAction(11);
            BleDeviceBinder bleDeviceBinder2 = BleDeviceBinder.this;
            bleDeviceBinder2.writeSNToDevice(bArrEncrypt, bleDeviceBinder2.mWriteSNResponse);
            BluetoothCache.setPropDid(BleDeviceBinder.this.getMac(), BleDeviceBinder.this.getSNText());
        }
    };
    private final BleWriteResponse mWriteSNResponse = new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.4
        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
        public void onResponse(int i, Void r5) {
            if (i == 0) {
                BluetoothService.getReportCoreProvider().finishAction(11);
                BleDeviceBinder bleDeviceBinder = BleDeviceBinder.this;
                bleDeviceBinder.bindSNToServer(bleDeviceBinder.mBindSNResponse);
            } else {
                BluetoothService.getReportCoreProvider().addContextByActionCode(11, "error_code", String.valueOf(i));
                BluetoothService.getReportCoreProvider().finishAction(11, 2);
                BleDeviceBinder.this.dispatchResult(i);
            }
        }
    };
    private final BleWriteResponse mBindSNResponse = new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.5
        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
        public void onResponse(final int i, Void r3) {
            if (i == 0) {
                BluetoothCache.setPropOwnerId(BleDeviceBinder.this.getMac(), BluetoothService.getBleCoreProvider().getMiId());
                BluetoothCache.setPropBoundStatus(BleDeviceBinder.this.getMac(), 2);
            } else {
                BluetoothCache.setPropBoundStatus(BleDeviceBinder.this.getMac(), 1);
            }
            BleDeviceBinder.this.writeBindResultToDevice(i, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.5.1
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i2, Void r2) {
                    BleDeviceBinder.this.dispatchResult(i);
                }
            });
        }
    };

    public interface BleBindResponse extends BleResponse<Void> {
    }

    public BleDeviceBinder(IBleDeviceLauncher iBleDeviceLauncher) {
        this.mLauncher = iBleDeviceLauncher;
        if (iBleDeviceLauncher == null) {
            throw new NullPointerException("launcher should not be null");
        }
    }

    public static /* synthetic */ int access$1210(BleDeviceBinder bleDeviceBinder) {
        int i = bleDeviceBinder.mRetryApplyDidTimes;
        bleDeviceBinder.mRetryApplyDidTimes = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchResult(int i) {
        this.mResponse.onResponse(i, null);
    }

    private String getBeaconKeyText() {
        return getByteHexText(this.mBeaconKey);
    }

    private String getByteHexText(byte[] bArr) {
        return ByteUtils.isEmpty(bArr) ? "" : ByteUtils.byteToString(bArr);
    }

    private String getByteText(byte[] bArr) {
        return ByteUtils.isEmpty(bArr) ? "" : new String(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMac() {
        return this.mLauncher.getDeviceMac();
    }

    private int getProductId() {
        return this.mLauncher.getDeviceProductId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getSNText() {
        return getByteText(this.mTempSN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getToken() {
        return this.mLauncher.getDeviceToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getTokenText() {
        return getByteHexText(getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeBindResultToDevice(int i, BleWriteResponse bleWriteResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
            return;
        }
        if (getBindStyle() == 2) {
            i = 0;
        }
        byte[] bArrFromInt = ByteUtils.fromInt(i == 0 ? BIND_SUCCESS : BIND_FAILED);
        BluetoothMyLogger.w(String.format("writeBindResultToDevice %d: %s", Integer.valueOf(i), ByteUtils.byteToString(bArrFromInt)));
        BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, BLECipher.encrypt(getToken(), bArrFromInt), bleWriteResponse);
    }

    public void applySNFromServer(final BleReadResponse bleReadResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
            return;
        }
        String modelByProductId = BluetoothService.getBleCoreProvider().getModelByProductId(getProductId());
        BluetoothService.getReportCoreProvider().startAction(10);
        DeviceApi.getDeviceSN(getSNText(), getMac(), modelByProductId, getTokenText(), new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.6
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BluetoothMyLogger.v(">>> onFailure " + bleNetError);
                if (BleDeviceBinder.this.mRetryApplyDidTimes > 0) {
                    BleDeviceBinder.access$1210(BleDeviceBinder.this);
                    BluetoothService.getReportCoreProvider().addContextByActionCode(10, "msg", "try again");
                    BluetoothService.getReportCoreProvider().finishAction(10, 11);
                    BleDeviceBinder.this.applySNFromServer(bleReadResponse);
                    return;
                }
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(10, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(10, 11);
                BleDeviceBinder.this.mRetryApplyDidTimes = 1;
                bleReadResponse.onResponse(-29, null);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str) {
                BluetoothMyLogger.v(">>> onSuccess " + str);
                if (!TextUtils.isEmpty(str)) {
                    BluetoothService.getReportCoreProvider().finishAction(10);
                    bleReadResponse.onResponse(0, str.getBytes());
                } else {
                    if (BleDeviceBinder.this.mRetryApplyDidTimes > 0) {
                        BleDeviceBinder.access$1210(BleDeviceBinder.this);
                        BluetoothService.getReportCoreProvider().addContextByActionCode(10, "msg", "try again");
                        BluetoothService.getReportCoreProvider().finishAction(10, 11);
                        BleDeviceBinder.this.applySNFromServer(bleReadResponse);
                        return;
                    }
                    BluetoothService.getReportCoreProvider().addContextByActionCode(10, "msg", "did is empty");
                    BluetoothService.getReportCoreProvider().finishAction(10, 11);
                    BleDeviceBinder.this.mRetryApplyDidTimes = 1;
                    bleReadResponse.onResponse(-29, null);
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void bindDeviceToServer(BleBindResponse bleBindResponse) {
        this.mResponse = bleBindResponse;
        if (bleBindResponse == null) {
            throw new NullPointerException("bind response should not be null");
        }
        BluetoothService.getReportCoreProvider().startAction(8);
        readSNFromDevice(this.mReadSNResponse);
    }

    public void bindSNToServer(final BleWriteResponse bleWriteResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
            return;
        }
        String propSMac = BluetoothCache.getPropSMac(getMac());
        BluetoothService.getReportCoreProvider().startAction(12);
        DeviceApi.bindDeviceSN(getSNText(), getBeaconKeyText(), getTokenText(), propSMac, new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleDeviceBinder.7
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(12, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(12, 11);
                BluetoothMyLogger.v("bindSNToServer return failed: " + bleNetError);
                if (bleNetError.getCode() != -1) {
                    bleWriteResponse.onResponse(-30, null);
                    return;
                }
                String detail = bleNetError.getDetail();
                if (TextUtils.isEmpty(detail) || detail.contains("Unable to resolve")) {
                    bleWriteResponse.onResponse(-30, null);
                } else {
                    bleWriteResponse.onResponse(-14, null);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Boolean bool) {
                BluetoothMyLogger.v("bindSNToServer return " + bool);
                if (bool.booleanValue()) {
                    BluetoothService.getReportCoreProvider().finishAction(12);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(12, 11);
                }
                bleWriteResponse.onResponse(bool.booleanValue() ? 0 : -30, null);
            }
        });
    }

    public void cancel() {
        this.mCanceld = true;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public int getBindStyle() {
        return BluetoothHelper.getBindStyle(getProductId());
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void readBeaconKeyFromDevice(BleReadResponse bleReadResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            BleConnectManager.getInstance().read(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_BEACONKEY, bleReadResponse);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void readSNFromDevice(BleReadResponse bleReadResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            BleConnectManager.getInstance().read(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_SN, bleReadResponse);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.IBleDeviceBinder
    public void writeSNToDevice(byte[] bArr, BleWriteResponse bleWriteResponse) {
        if (this.mCanceld) {
            dispatchResult(-2);
        } else {
            BleConnectManager.getInstance().write(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_SN, bArr, bleWriteResponse);
        }
    }
}
