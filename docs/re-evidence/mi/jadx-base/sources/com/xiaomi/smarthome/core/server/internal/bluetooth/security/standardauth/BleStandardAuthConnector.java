package com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SecureAuthChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.StandardAuthChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuthConnector;
import com.xiaomi.smarthome.core.server.internal.util.VersionUtils;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleStandardAuthConnector extends BleSecurityConnector {
    private static final int MSG_A4_TIMEOUT = 569;
    private IBleChannelReader mChannelReader;
    private IBleChannelWriter mChannelWriter;
    private Handler mLocalHandler;
    private BleNotifyResponse mSecureAuthNotifyResponse;

    public BleStandardAuthConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
        this.mLocalHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == BleStandardAuthConnector.MSG_A4_TIMEOUT) {
                    BluetoothMyLogger.d("MSG_A4_TIMEOUT");
                    BluetoothService.getReportCoreProvider().finishAction(37, 8);
                    if (BleStandardAuthConnector.this.mSecureAuthNotifyResponse != null) {
                        BleStandardAuthConnector.this.mSecureAuthNotifyResponse.onResponse(0, null);
                        BleStandardAuthConnector.this.mSecureAuthNotifyResponse = null;
                    }
                }
            }
        };
        this.mChannelReader = new IBleChannelReader() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector.2
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader
            public void onRead(String str, byte[] bArr, int i) throws RemoteException {
                BleStandardAuthConnector.this.onChannelRead(bArr, i);
            }
        };
        this.mSecureAuthNotifyResponse = null;
        this.mChannelWriter = StandardAuthChannelManager.getInstance().registerChannelReader(getMac(), this.mChannelReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendA4Step() {
        BluetoothService.getReportCoreProvider().startAction(40);
        getBleLockFirmwareVersion(getMac(), new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str) {
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(40, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(40, 2);
                    BleStandardAuthConnector.this.notifyA4Complete();
                    return;
                }
                BluetoothService.getReportCoreProvider().addContextByActionCode(40, "version", str);
                BluetoothService.getReportCoreProvider().finishAction(40);
                boolean zCheckVersionSupportBleOtaUpgrade = VersionUtils.checkVersionSupportBleOtaUpgrade(4, str);
                BluetoothLog.formatLog("before sendA4, check version , is standard auth Device, firmware version %s, need send A4 result is %s", str, String.valueOf(zCheckVersionSupportBleOtaUpgrade));
                String propModel = BluetoothCache.getPropModel(BleStandardAuthConnector.this.getMac());
                BluetoothLog.d("sendA4Step model: " + propModel);
                if ((!TextUtils.isEmpty(propModel) && propModel.startsWith("xiaomi.wifispeaker.") && !BluetoothService.getBleCoreProvider().isXiaoaiSupportA4(propModel)) || !zCheckVersionSupportBleOtaUpgrade) {
                    BluetoothLog.d("at send A4 step, check no need to send A4");
                    BleStandardAuthConnector.this.notifyA4Complete();
                } else {
                    BluetoothService.getReportCoreProvider().startAction(37);
                    BluetoothLog.d("connector start send A4");
                    BleStandardAuthConnector.this.mLocalHandler.sendEmptyMessageDelayed(BleStandardAuthConnector.MSG_A4_TIMEOUT, 5000L);
                    SecureAuthChannelManager.getInstance().startRequestMtu(BleStandardAuthConnector.this.getMac());
                }
            }
        });
    }

    public void doSendA4AfterGetDeviceInfo(BleNotifyResponse bleNotifyResponse) {
        this.mSecureAuthNotifyResponse = bleNotifyResponse;
        BluetoothLog.d("doSendA4AfterGetDeviceInfo connector start send A4");
        this.mLocalHandler.sendEmptyMessageDelayed(MSG_A4_TIMEOUT, 5000L);
        SecureAuthChannelManager.getInstance().startRequestMtu(getMac());
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void notifyA4Complete() {
        BluetoothLog.d("receive A4 result");
        this.mLocalHandler.removeMessages(MSG_A4_TIMEOUT);
        BleNotifyResponse bleNotifyResponse = this.mSecureAuthNotifyResponse;
        if (bleNotifyResponse != null) {
            bleNotifyResponse.onResponse(0, null);
            this.mSecureAuthNotifyResponse = null;
        }
    }

    public abstract void onChannelRead(byte[] bArr, int i);

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void onConnectFinished() {
        unregisterChannelReader();
    }

    public void openStandardAuthNotify(final BleNotifyResponse bleNotifyResponse) {
        BluetoothService.getReportCoreProvider().startAction(23);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_STANDARD_AUTH;
        reportCoreProvider.addContextByActionCode(23, "char", uuid.toString());
        BleConnectManager.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, uuid, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r6) {
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(23, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(23, 3);
                    bleNotifyResponse.onResponse(i, null);
                    return;
                }
                BleStandardAuthConnector.this.mSecureAuthNotifyResponse = bleNotifyResponse;
                BluetoothService.getReportCoreProvider().finishAction(23);
                BleStandardAuthConnector bleStandardAuthConnector = BleStandardAuthConnector.this;
                if (!(bleStandardAuthConnector instanceof BleComboStandardAuthConnector)) {
                    bleStandardAuthConnector.sendA4Step();
                } else {
                    bleNotifyResponse.onResponse(i, r6);
                    BleStandardAuthConnector.this.mSecureAuthNotifyResponse = null;
                }
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        ChannelManager.BleChannel channel;
        if (BluetoothConstants.MISERVICE.equals(uuid) && BluetoothConstants.CHARACTER_STANDARD_AUTH.equals(uuid2) && (channel = StandardAuthChannelManager.getInstance().getChannel(getMac())) != null) {
            channel.onRead(bArr);
        }
    }

    public void reportBleLockVersion(final String str, final String str2, final BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            getBleLockFirmwareVersion(str, new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector.5
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, String str3) {
                    if (i == 0 && !TextUtils.isEmpty(str3)) {
                        BluetoothCache.setPropFirVersion(BleStandardAuthConnector.this.getMac(), str3);
                        BleSecurityConnector.checkFirmwareNewVersion(str, str2, str3);
                        DeviceApi.reportCommonBleVersion(str2, str3, new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthConnector.5.1
                            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                            public void onFailure(BleNetError bleNetError) {
                                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                                if (bleAsyncCallback2 != null) {
                                    bleAsyncCallback2.onFailure(bleNetError);
                                }
                            }

                            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                            public void onSuccess(Void r2) {
                                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                                if (bleAsyncCallback2 != null) {
                                    bleAsyncCallback2.onSuccess(null);
                                }
                            }
                        });
                    } else {
                        BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                        if (bleAsyncCallback2 != null) {
                            bleAsyncCallback2.onFailure(new BleNetError(-1, "read version failed"));
                        }
                    }
                }
            });
        } else if (bleAsyncCallback != null) {
            bleAsyncCallback.onFailure(new BleNetError(-1, "mac or did is null"));
        }
    }

    public void unregisterChannelReader() {
        BluetoothMyLogger.d("unregisterChannelReader for standard ");
        StandardAuthChannelManager.getInstance().unregisterChannelReader(getMac(), this.mChannelReader);
    }

    public boolean writeChannel(byte[] bArr, int i, IBleResponse iBleResponse) {
        try {
            this.mChannelWriter.write(bArr, i, iBleResponse);
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
