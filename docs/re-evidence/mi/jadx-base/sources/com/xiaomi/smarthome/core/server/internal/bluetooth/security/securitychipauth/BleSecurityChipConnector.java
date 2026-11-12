package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.os.Bundle;
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
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.util.VersionUtils;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleSecurityChipConnector extends BleSecurityConnector {
    private static final int MSG_A4_TIMEOUT = 569;
    private IBleChannelReader mChannelReader;
    private IBleChannelWriter mChannelWriter;
    private Handler mLocalHandler;
    private BleNotifyResponse mSecureAuthNotifyResponse;

    public BleSecurityChipConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
        this.mLocalHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == BleSecurityChipConnector.MSG_A4_TIMEOUT) {
                    BluetoothService.getReportCoreProvider().finishAction(37, 8);
                    if (BleSecurityChipConnector.this.mSecureAuthNotifyResponse != null) {
                        BleSecurityChipConnector.this.mSecureAuthNotifyResponse.onResponse(0, null);
                        BleSecurityChipConnector.this.mSecureAuthNotifyResponse = null;
                    }
                }
            }
        };
        this.mChannelReader = new IBleChannelReader() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector.2
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader
            public void onRead(String str, byte[] bArr, int i) throws RemoteException {
                BleSecurityChipConnector.this.onChannelRead(bArr, i);
            }
        };
        this.mSecureAuthNotifyResponse = null;
        this.mChannelWriter = SecureAuthChannelManager.getInstance().registerChannelReader(getMac(), this.mChannelReader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendA4Step() {
        BluetoothService.getReportCoreProvider().startAction(40);
        getBleLockFirmwareVersion(getMac(), new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str) {
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(40, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(40, 2);
                    BleSecurityChipConnector.this.notifyA4Complete();
                    return;
                }
                BluetoothService.getReportCoreProvider().addContextByActionCode(40, "version", str);
                BluetoothService.getReportCoreProvider().finishAction(40);
                int i2 = BleSecurityChipConnector.this.isMeshDevice() ? 5 : 1;
                boolean zCheckVersionSupportBleOtaUpgrade = VersionUtils.checkVersionSupportBleOtaUpgrade(i2, str);
                BluetoothLog.formatLog("before sendA4, check version , isMeshDevice %s, firmware version %s, need send A4 result is %s", String.valueOf(BleSecurityChipConnector.this.isMeshDevice()), str, String.valueOf(zCheckVersionSupportBleOtaUpgrade));
                if (!zCheckVersionSupportBleOtaUpgrade) {
                    BluetoothLog.d("at send A4 step, check no need to send A4");
                    BleSecurityChipConnector.this.notifyA4Complete();
                    return;
                }
                BluetoothLog.d("connector start send A4");
                BluetoothService.getReportCoreProvider().startAction(37);
                BluetoothService.getReportCoreProvider().addContextByActionCode(37, "auth-type", String.valueOf(i2));
                BleSecurityChipConnector.this.mLocalHandler.sendEmptyMessageDelayed(BleSecurityChipConnector.MSG_A4_TIMEOUT, 5000L);
                SecureAuthChannelManager.getInstance().startRequestMtu(BleSecurityChipConnector.this.getMac());
            }
        });
    }

    private void unregisterChannelReader() {
        SecureAuthChannelManager.getInstance().unregisterChannelReader(getMac(), this.mChannelReader);
    }

    public boolean isMeshDevice() {
        return false;
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

    public void openSecureAuthNotify(final BleNotifyResponse bleNotifyResponse) {
        BluetoothService.getReportCoreProvider().startAction(23);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_SECURE_AUTH;
        reportCoreProvider.addContextByActionCode(23, "char", uuid.toString());
        BleConnectManager.getInstance().notify(getMac(), BluetoothConstants.MISERVICE, uuid, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r5) {
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(23, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(23, 3);
                    bleNotifyResponse.onResponse(i, null);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(23, 0);
                    BleSecurityChipConnector.this.mSecureAuthNotifyResponse = bleNotifyResponse;
                    BleSecurityChipConnector.this.sendA4Step();
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
        if (BluetoothConstants.MISERVICE.equals(uuid) && BluetoothConstants.CHARACTER_SECURE_AUTH.equals(uuid2) && (channel = SecureAuthChannelManager.getInstance().getChannel(getMac())) != null) {
            channel.onRead(bArr);
        }
    }

    public void reportBleLockVersion(final String str, final String str2, final BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            getBleLockFirmwareVersion(str, new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector.5
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, String str3) {
                    if (i == 0 && !TextUtils.isEmpty(str3)) {
                        BleSecurityConnector.checkFirmwareNewVersion(str, str2, str3);
                        DeviceApi.reportCommonBleVersion(str2, str3, new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector.5.1
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

    public void showPaircode(String str) {
        BluetoothService.getReportCoreProvider().startAction(44);
        Bundle bundle = new Bundle();
        bundle.putString(BluetoothConstants.EXTRA_PAIR_CODE, str);
        this.mLauncher.notifyAuthProcess(-33, bundle);
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
