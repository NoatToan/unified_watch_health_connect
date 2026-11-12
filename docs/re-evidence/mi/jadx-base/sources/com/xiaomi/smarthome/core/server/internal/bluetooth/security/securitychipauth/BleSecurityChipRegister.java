package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.bluetooth.Response;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.SecureAuthChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.SecureConnectOptions;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecurityChipRegister extends BleSecurityLauncher {
    private IBleChannelReader mChannelReader;
    private IBleChannelWriter mChannelWriter;
    private Handler mHander;
    ConnectReceiver mReceiver;
    private BleSecurityChipRegisterConnector mRegisterConnector;

    /* JADX INFO: renamed from: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister$4, reason: invalid class name */
    public class AnonymousClass4 implements IBleSecureConnectResponse {
        final /* synthetic */ Response.BleResponse val$response;
        final /* synthetic */ int val$retryTimes;

        /* JADX INFO: renamed from: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister$4$1, reason: invalid class name */
        public class AnonymousClass1 implements BleWriteResponse {
            public AnonymousClass1() {
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                if (i != 0) {
                    AnonymousClass4.this.val$response.onResponse(-28, null);
                    return;
                }
                BleComboWifiConfig bleComboWifiConfig = ((BleSecurityLauncher) BleSecurityChipRegister.this).mConnectOptions.getBleComboWifiConfig();
                bleComboWifiConfig.bleToken = BluetoothCache.getPropToken(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac);
                BleSecurityChipEncrypt.encrypt(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac, bleComboWifiConfig.toBytes(), new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.4.1.1
                    @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                    public void onResponse(int i2, byte[] bArr) {
                        BluetoothMyLogger.v(" BleSecurityChipEncrypt encrypt code: " + i2);
                        if (i2 != 0) {
                            BluetoothMyLogger.e(" BleSecurityChipEncrypt encrypt wifi config failed!");
                            AnonymousClass4.this.val$response.onResponse(-28, null);
                        } else {
                            if (BleSecurityChipRegister.this.writeChannel(bArr, 15, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.4.1.1.1
                                @Override // android.os.IInterface
                                public IBinder asBinder() {
                                    return null;
                                }

                                @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
                                public void onResponse(int i3, Bundle bundle) throws RemoteException {
                                    BluetoothMyLogger.v(" sendWifiConfig onResponse: " + i3);
                                    AnonymousClass4.this.val$response.onResponse(i3, bundle);
                                }
                            })) {
                                return;
                            }
                            BluetoothMyLogger.e(" BleSecurityChipEncrypt write failed!");
                            AnonymousClass4.this.val$response.onResponse(-28, null);
                        }
                    }
                });
            }
        }

        public AnonymousClass4(Response.BleResponse bleResponse, int i) {
            this.val$response = bleResponse;
            this.val$retryTimes = i;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            BluetoothMyLogger.v(" securityChipConnect onResponse: " + i);
            if (i == 0) {
                BleSecurityChipRegister.this.mChannelWriter = SecureAuthChannelManager.getInstance().registerChannelReader(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac, BleSecurityChipRegister.this.mChannelReader);
                BleSecurityChipRegister.this.registerBleNotifyReceiver();
                BleConnectManager.getInstance().writeNoRsp(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, new byte[]{-91}, new AnonymousClass1());
            } else if (i != -6 || this.val$retryTimes <= 0) {
                this.val$response.onResponse(-28, null);
            } else if (BleSecurityChipRegister.this.mHander != null) {
                BleConnectManager.getInstance().disconnectAllDevices();
                BleSecurityChipRegister.this.mHander.postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                        BleSecurityChipRegister.this.connectAndSendWifiConfig(anonymousClass4.val$response, anonymousClass4.val$retryTimes - 1);
                    }
                }, 3000L);
            }
        }
    }

    public class ConnectReceiver extends BroadcastReceiver {
        private ConnectReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            BluetoothMyLogger.v("get mReceiver action： " + action);
            if ("com.xiaomi.smarthome.bluetooth.character_changed".equalsIgnoreCase(action)) {
                if (((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac.equalsIgnoreCase(intent.getStringExtra("key_device_address"))) {
                    UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                    UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                    byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                    if (uuid == null || uuid2 == null) {
                        return;
                    }
                    BleSecurityChipRegister.this.processNotify(uuid, uuid2, byteArrayExtra);
                }
            }
        }
    }

    public BleSecurityChipRegister(String str, int i, BleConnectOptions bleConnectOptions) {
        super(str, i, bleConnectOptions);
        this.mChannelReader = new IBleChannelReader() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.5
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader
            public void onRead(String str2, byte[] bArr, int i2) throws RemoteException {
            }
        };
        this.mRegisterConnector = new BleSecurityChipRegisterConnector(this.mLauncher, bleConnectOptions);
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mHander = new Handler(looperMyLooper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void connectAndSendWifiConfig(Response.BleResponse bleResponse, int i) {
        SecureConnectOptions secureConnectOptionsBuild = new SecureConnectOptions.Builder().setConnectOptions(this.mConnectOptions).build();
        BluetoothMyLogger.v(" securityChipConnect start retryTime = " + i);
        BleSecureConnectManager.securityChipConnect(this.mDeviceMac, secureConnectOptionsBuild, new AnonymousClass4(bleResponse, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySuccess(final int i) {
        if (this.mConnectOptions.getBleComboWifiConfig() == null) {
            notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
            dispatchResult(i);
            this.mRegisterConnector.disconnect();
        } else {
            BleSecureConnectManager.clearLauncher(this.mDeviceMac);
            this.mRegisterConnector.disconnect();
            Handler handler = this.mHander;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.3
                    @Override // java.lang.Runnable
                    public void run() {
                        BleSecurityChipRegister.this.connectAndSendWifiConfig(new Response.BleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.3.1
                            @Override // com.xiaomi.smarthome.bluetooth.Response.BleResponse
                            public void onResponse(int i2, Object obj) {
                                BleSecurityChipRegister.this.unregisterBleNotifyReceiver();
                                SecureAuthChannelManager.getInstance().unregisterChannelReader(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac, BleSecurityChipRegister.this.mChannelReader);
                                BleSecurityChipRegister.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_BIND, 0);
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                BleSecurityChipRegister.this.dispatchResult(i);
                                BleConnectManager.getInstance().disconnect(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac);
                            }
                        }, 1);
                    }
                }, 3000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerBleNotifyReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new ConnectReceiver();
            BluetoothUtils.registerReceiver(this.mReceiver, new IntentFilter("com.xiaomi.smarthome.bluetooth.character_changed"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterBleNotifyReceiver() {
        ConnectReceiver connectReceiver = this.mReceiver;
        if (connectReceiver != null) {
            BluetoothUtils.unregisterReceiver(connectReceiver);
            this.mReceiver = null;
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public BleSecurityConnector getSecurityConnector() {
        return this.mRegisterConnector;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnect(final int i, Bundle bundle) {
        if (i != 0) {
            dispatchResult(i);
            return;
        }
        byte[] byteArray = bundle.getByteArray(BluetoothConstants.KEY_LTMK);
        byte[] byteArray2 = bundle.getByteArray(BluetoothConstants.KEY_TOKEN);
        BluetoothCache.setPropBoundStatus(this.mDeviceMac, 2);
        BluetoothCache.setPropDid(this.mDeviceMac, this.mRegisterConnector.getDeviceDid());
        BluetoothCache.setPropTokenBytes(this.mDeviceMac, byteArray2);
        BluetoothCache.setPropLtmkBytes(this.mDeviceMac, byteArray);
        BleSecurityChipRegisterConnector bleSecurityChipRegisterConnector = this.mRegisterConnector;
        bleSecurityChipRegisterConnector.reportBleLockVersion(this.mDeviceMac, bleSecurityChipRegisterConnector.getDeviceDid(), new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BleSecurityChipRegister.this.notifySuccess(i);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Void r2) {
                BleSecurityChipRegister.this.notifySuccess(i);
            }
        });
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void onPostConnectFailed(int i) {
        if (i == 0 || BluetoothCache.getPropBoundStatus(this.mDeviceMac) != 2 || TextUtils.isEmpty(this.mRegisterConnector.getDeviceDid())) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mRegisterConnector.getDeviceDid());
        BluetoothService.getBleCoreProvider().delDeviceBatch(arrayList, new BleDeleteDeviceCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback
            public void onFailure(Bundle bundle) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleDeleteDeviceCallback
            public void onSuccess(Bundle bundle) {
                BluetoothCache.setPropBoundStatus(((BleSecurityLauncher) BleSecurityChipRegister.this).mDeviceMac, 0);
            }
        });
    }

    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        ChannelManager.BleChannel channel;
        if (BluetoothConstants.MISERVICE.equals(uuid) && BluetoothConstants.CHARACTER_SECURE_AUTH.equals(uuid2) && (channel = SecureAuthChannelManager.getInstance().getChannel(this.mDeviceMac)) != null) {
            channel.onRead(bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher
    public void start(IBleSecureConnectResponse iBleSecureConnectResponse) {
        BluetoothService.getReportCoreProvider().startAction(3);
        super.start(iBleSecureConnectResponse);
    }

    public boolean writeChannel(byte[] bArr, int i, IBleResponse iBleResponse) {
        try {
            IBleChannelWriter iBleChannelWriter = this.mChannelWriter;
            if (iBleChannelWriter != null) {
                iBleChannelWriter.write(bArr, i, iBleResponse);
                return true;
            }
            BluetoothMyLogger.e(" channel writer is null,so can not write");
            return true;
        } catch (RemoteException e) {
            e.printStackTrace();
            return false;
        }
    }
}
