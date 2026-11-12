package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.util.VersionUtils;
import com.xiaomi.smarthome.device.api.BleMeshFirmwareUpdateInfo;
import com.xiaomi.smarthome.device.api.McuUpdateInfo;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.channel.Channel;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattService;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleSecurityConnector implements ISecurityConnect {
    protected Bundle mBundle;
    private boolean mCanceled;
    protected IBleDeviceLauncher mLauncher;
    private ConnectReceiver mReceiver;
    protected BleConnectResponse mResponse;
    private boolean doneStep1 = false;
    private McuController mcuController = null;
    private final BleConnectResponse mBleConnectResponse = new BleConnectResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.1
        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
        public void onResponse(int i, Bundle bundle) {
            BleSecurityConnector.this.mLauncher.notifyConnectProcess(i, bundle);
            if (i != 0) {
                BluetoothService.getReportCoreProvider().addContextByActionCode(3, "error_code", String.valueOf(i));
                BluetoothService.getReportCoreProvider().finishAction(3, 7);
                BleSecurityConnector.this.dispatchResult(i, true);
                return;
            }
            BluetoothService.getReportCoreProvider().finishAction(3, 0);
            if (bundle != null) {
                BleSecurityConnector.this.mBundle.putAll(bundle);
            }
            BleSecurityConnector.this.onConnectSuccess(bundle);
            BleSecurityConnector.this.doneStep1 = false;
            BleSecurityConnector.this.registerBleNotifyReceiver();
            if (BleSecurityConnector.this.checkSupportSpecV2Notify(bundle)) {
                BluetoothService.getReportCoreProvider().addContextByActionCode(3, "support_spec_v2", String.valueOf(true));
                BluetoothMyLogger.d("check support character SPEC true ");
                BleSecurityConnector.this.openSpecNotify();
            } else if (BleSecurityConnector.this.checkSupportMcuNotify(bundle)) {
                BleSecurityConnector.this.startMcuProcess();
                MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, "MCU-bluetooth", " current ble device support mcu version");
            } else {
                BluetoothService.getReportCoreProvider().addContextByActionCode(3, "support_spec_v2", String.valueOf(false));
                BleSecurityConnector.this.doneStep1 = true;
                BleSecurityConnector.this.processStep1();
            }
        }
    };
    protected final Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.7
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            BleSecurityConnector.this.processHandlerMessage(message);
        }
    };

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
                    if (BleSecurityConnector.this.getMac().equalsIgnoreCase(intent.getStringExtra("key_device_address")) && intent.getIntExtra("key_connect_status", 5) == 32) {
                        BleSecurityConnector.this.dispatchResult(-32);
                        return;
                    }
                    return;
                }
                if (Channel.ACTION_A4_RESULT.equals(action)) {
                    BluetoothMyLogger.d("ACTION_A4_RESULT");
                    BluetoothService.getReportCoreProvider().finishAction(37);
                    BleSecurityConnector.this.notifyA4Complete();
                    return;
                }
                return;
            }
            if (BleSecurityConnector.this.getMac().equalsIgnoreCase(intent.getStringExtra("key_device_address"))) {
                UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                if (uuid == null || uuid2 == null) {
                    return;
                }
                if (!BluetoothConstants.MISERVICE.equals(uuid) || !BluetoothConstants.CHARACTER_MCU_VERSION.equals(uuid2)) {
                    BleSecurityConnector.this.processNotify(uuid, uuid2, byteArrayExtra);
                } else if (BleSecurityConnector.this.mcuController != null) {
                    BleSecurityConnector.this.mcuController.receiveMcuEvent(byteArrayExtra);
                }
            }
        }
    }

    public BleSecurityConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        this.mLauncher = iBleDeviceLauncher;
        if (iBleDeviceLauncher == null) {
            throw new NullPointerException("launcher should not be null");
        }
        this.mBundle = new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void broadcastSpec(String str) {
        Intent intent = new Intent(BluetoothConstants.ACTION_DEVICE_SUPPORT_BLE_SPEC_PROTOCOL);
        intent.putExtra("mac", str);
        BluetoothUtils.sendBroadcast(intent);
    }

    public static void checkFirmwareNewVersion(final String str, final String str2, final String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            BluetoothMyLogger.e("checkFirmwareNewVersion did or ble firmware version is null,return");
        } else {
            BluetoothService.getExecutorService().submit(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.8
                @Override // java.lang.Runnable
                public void run() {
                    DeviceApi.getBleDeviceRemoteVersion(str2, str, new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.8.1
                        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                        public void onFailure(BleNetError bleNetError) {
                        }

                        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                        public void onSuccess(String str4) {
                            McuUpdateInfo mcuUpdateInfo;
                            if (TextUtils.isEmpty(str4)) {
                                BluetoothMyLogger.e("checkFirmwareNewVersion remote version is null,return");
                                return;
                            }
                            BluetoothMyLogger.d("checkFirmwareNewVersion current version=" + str3 + ",latest version=" + str4);
                            if (VersionUtils.compareFirmwareVersion(str4, str3) > 0) {
                                Intent intent = new Intent(BluetoothConstants.ACTION_FIRMWARE_HAS_NEW_VERSION);
                                intent.putExtra("current_version", str3);
                                intent.putExtra("latest_version", str4);
                                intent.putExtra("did", str2);
                                BleMeshFirmwareUpdateInfo bleFirmwareUpdateInfo = BluetoothCache.getBleFirmwareUpdateInfo(str);
                                if (bleFirmwareUpdateInfo != null && (mcuUpdateInfo = bleFirmwareUpdateInfo.mcuUpdateInfo) != null && !TextUtils.isEmpty(mcuUpdateInfo.version)) {
                                    intent.putExtra("mcu_version", bleFirmwareUpdateInfo.mcuUpdateInfo.version);
                                }
                                BluetoothUtils.sendBroadcast(intent);
                            }
                        }
                    });
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkSupportMcuNotify(Bundle bundle) {
        BleGattProfile bleGattProfile;
        BleGattService service;
        return (bundle == null || (bleGattProfile = (BleGattProfile) bundle.getParcelable("key_gatt_profile")) == null || (service = bleGattProfile.getService(BluetoothConstants.MISERVICE)) == null || !service.contains(BluetoothConstants.CHARACTER_MCU_VERSION)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean checkSupportSpecV2Notify(Bundle bundle) {
        BleGattService service;
        BleGattProfile bleGattProfile = (BleGattProfile) bundle.getParcelable("key_gatt_profile");
        return bleGattProfile != null && (service = bleGattProfile.getService(BluetoothConstants.MISERVICE)) != null && service.contains(BluetoothConstants.CHARACTER_BLE_SPEC_WRITE) && service.contains(BluetoothConstants.CHARACTER_BLE_SPEC_READ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchResultInMainThread(int i, boolean z) {
        if (isCanceled()) {
            i = -2;
        }
        boolean z2 = i == 0;
        unregisterBleNotifyReceiver();
        onConnectFinished();
        if (this.mResponse != null) {
            if (z2) {
                this.mBundle.putByteArray(BluetoothConstants.KEY_TOKEN, getGeneratedToken());
            }
            this.mBundle.putBoolean(BluetoothConstants.KEY_IS_CONNECT_FAILED, z);
            this.mResponse.onResponse(i, this.mBundle);
        }
        McuController mcuController = this.mcuController;
        if (mcuController != null) {
            mcuController.reportMcuVersion();
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mResponse = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openSpecNotify() {
        BluetoothService.getReportCoreProvider().startAction(23);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_BLE_SPEC_READ;
        reportCoreProvider.addContextByActionCode(23, "char", uuid.toString());
        BleConnectManager.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, uuid, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.5
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r5) {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(23, 0);
                    BluetoothMyLogger.d("open spec READ notify success ");
                    BluetoothService.getReportCoreProvider().startAction(23);
                    IReportCoreProvider reportCoreProvider2 = BluetoothService.getReportCoreProvider();
                    UUID uuid2 = BluetoothConstants.CHARACTER_BLE_SPEC_WRITE;
                    reportCoreProvider2.addContextByActionCode(23, "char", uuid2.toString());
                    BleConnectManager.getInstance().notify(BleSecurityConnector.this.getMac(), BluetoothConstants.MISERVICE, uuid2, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.5.1
                        @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                        public void onResponse(int i2, Void r6) {
                            if (i2 == 0) {
                                BluetoothService.getReportCoreProvider().finishAction(23, 0);
                                BluetoothMyLogger.d("open spec WRITE notify success");
                                BluetoothCache.addSupportBleSpecMac(BleSecurityConnector.this.getMac());
                                BleSecurityConnector bleSecurityConnector = BleSecurityConnector.this;
                                bleSecurityConnector.broadcastSpec(bleSecurityConnector.getMac());
                            } else {
                                BluetoothService.getReportCoreProvider().addContextByActionCode(23, "error_code", String.valueOf(i2));
                                BluetoothMyLogger.d("open spec WRITE notify <<Fail>> code=" + i2);
                                BluetoothService.getReportCoreProvider().finishAction(23, 3);
                            }
                            BleSecurityConnector bleSecurityConnector2 = BleSecurityConnector.this;
                            if (bleSecurityConnector2.checkSupportMcuNotify(bleSecurityConnector2.mBundle)) {
                                BleSecurityConnector.this.startMcuProcess();
                            } else {
                                BleSecurityConnector.this.doneStep1 = true;
                                BleSecurityConnector.this.processStep1();
                            }
                        }
                    });
                    return;
                }
                BluetoothService.getReportCoreProvider().addContextByActionCode(23, "error_code", String.valueOf(i));
                BluetoothService.getReportCoreProvider().finishAction(23, 3);
                BluetoothMyLogger.d("open spec READ notify <<Fail>>,onResponse code=" + i);
                BleSecurityConnector bleSecurityConnector = BleSecurityConnector.this;
                if (bleSecurityConnector.checkSupportMcuNotify(bleSecurityConnector.mBundle)) {
                    BleSecurityConnector.this.startMcuProcess();
                } else {
                    BleSecurityConnector.this.doneStep1 = true;
                    BleSecurityConnector.this.processStep1();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerBleNotifyReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new ConnectReceiver();
            IntentFilter intentFilter = new IntentFilter("com.xiaomi.smarthome.bluetooth.character_changed");
            intentFilter.addAction("com.xiaomi.smarthome.bluetooth.connect_status_changed");
            intentFilter.addAction(Channel.ACTION_A4_RESULT);
            BluetoothUtils.registerReceiver(this.mReceiver, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startMcuProcess() {
        McuController mcuController = new McuController(getMac());
        this.mcuController = mcuController;
        mcuController.startMcuProcess(new McuController.McuResultCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.4
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.mcu.McuController.McuResultCallback
            public void onFinish() {
                try {
                    BleSecurityConnector.this.processStep1();
                } catch (Exception e) {
                    MiJiaLog.writeLogOnAll(LogType.KUAILIAN, "ERROR", "startMcuProcess error=" + e.getMessage());
                }
            }
        });
    }

    private void unregisterBleNotifyReceiver() {
        ConnectReceiver connectReceiver = this.mReceiver;
        if (connectReceiver != null) {
            BluetoothUtils.unregisterReceiver(connectReceiver);
            this.mReceiver = null;
        }
    }

    public void cancel() {
        this.mCanceled = true;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecurityConnect
    public void connect(BleConnectOptions bleConnectOptions, BleConnectResponse bleConnectResponse) {
        this.mResponse = bleConnectResponse;
        BluetoothApi.connect(getMac(), bleConnectOptions, this.mBleConnectResponse);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecurityConnect
    public void disconnect() {
        BleConnectManager.getInstance().disconnect(this.mLauncher.getDeviceMac());
    }

    public void dispatchResult(int i) {
        BluetoothMyLogger.v(String.format("%s.dispatchResult code = %s", getClass().getSimpleName(), Code.toString(i)));
        dispatchResult(i, false);
    }

    public void getBleLockFirmwareVersion(final String str, final BleResponse<String> bleResponse) {
        BleConnectManager.getInstance().read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr) {
                if (i != 0 || ByteUtils.isEmpty(bArr)) {
                    bleResponse.onResponse(-1, "");
                    return;
                }
                int i2 = 0;
                for (int i3 = 0; i3 < bArr.length && bArr[i3] != 0; i3++) {
                    i2++;
                }
                if (i2 == 0) {
                    bleResponse.onResponse(-1, "");
                    return;
                }
                byte[] bArr2 = new byte[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr2[i4] = bArr[i4];
                }
                String str2 = new String(bArr2);
                BluetoothCache.setPropFirVersion(str, str2);
                BleCacheManager.getInstance().getBleDeviceState(str).setCurrentFirmwareVersion(str2);
                bleResponse.onResponse(0, str2);
            }
        });
    }

    public byte[] getGeneratedToken() {
        return null;
    }

    public String getMac() {
        return this.mLauncher.getDeviceMac();
    }

    public int getProductId() {
        return this.mLauncher.getDeviceProductId();
    }

    public byte[] getToken() {
        return this.mLauncher.getDeviceToken();
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public void notifyA4Complete() {
    }

    public void onConnectFinished() {
    }

    public void onConnectSuccess(Bundle bundle) {
    }

    public void openAuthNotify(final BleNotifyResponse bleNotifyResponse) {
        BluetoothService.getReportCoreProvider().startAction(23);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_AUTH;
        reportCoreProvider.addContextByActionCode(23, "char", uuid.toString());
        BleConnectManager.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, uuid, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.2
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r5) {
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(23);
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(23, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(23);
                }
                bleNotifyResponse.onResponse(i, null);
            }
        });
    }

    public abstract void processHandlerMessage(Message message);

    public abstract void processNotify(UUID uuid, UUID uuid2, byte[] bArr);

    public abstract void processStep1();

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchResult(final int i, final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector.6
            @Override // java.lang.Runnable
            public void run() {
                BleSecurityConnector.this.dispatchResultInMainThread(i, z);
            }
        });
    }
}
