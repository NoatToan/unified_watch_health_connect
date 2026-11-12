package com.xiaomi.mi_connect_sdk.api;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.xiaomi.mi_connect_service.IApStateCallback;
import com.xiaomi.mi_connect_service.IDeviceScannerCallback;
import com.xiaomi.mi_connect_service.IIPCDataCallback;
import com.xiaomi.mi_connect_service.IMiConnect;
import com.xiaomi.mi_connect_service.IMiConnectCallback;
import com.xiaomi.mi_connect_service.ISoundBoxWhiteNameCallBack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultMiApp extends BinderBase implements InnerMiApp {
    private static final int MIN_VERSION = 2;
    private static final String TAG = "DefaultMiApp";
    private List<Command> commandList;
    private volatile boolean isAdvertising;
    private volatile boolean isDestroying;
    private volatile boolean isDiscovering;
    private int mAppId;
    private IMiConnectCallback mCallback;
    private Handler uiHandler;

    public class Command {
        private Runnable worker;

        public Command(Runnable runnable) {
            this.worker = runnable;
        }

        public void execute() {
            this.worker.run();
        }
    }

    public DefaultMiApp(Context context, MiAppCallback miAppCallback, int i) {
        super(context, miAppCallback);
        this.commandList = new ArrayList();
        this.isAdvertising = false;
        this.isDiscovering = false;
        this.isDestroying = false;
        this.uiHandler = new Handler(Looper.getMainLooper());
        this.mCallback = new IMiConnectCallback.Stub() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1
            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onAdvertisingResult(final int i2, final int i3) {
                if (i3 == ResultCode.START_ADVERTISING_SUCCESS.getCode()) {
                    DefaultMiApp.this.isAdvertising = true;
                }
                if (i3 == ResultCode.STOP_ADVERTISING_SUCCESS.getCode()) {
                    DefaultMiApp.this.isAdvertising = false;
                }
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        DefaultMiApp.this.mMiAppCallback.onAdvertingResult(i2, i3);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onConnectionInitiated(final int i2, final int i3, final String str, final byte[] bArr, final byte[] bArr2) {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        MiAppCallback miAppCallback2 = DefaultMiApp.this.mMiAppCallback;
                        int i4 = i2;
                        int i5 = i3;
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        byte[] bArr3 = bArr;
                        if (bArr3 == null) {
                            bArr3 = new byte[0];
                        }
                        byte[] bArr4 = bArr2;
                        if (bArr4 == null) {
                            bArr4 = new byte[0];
                        }
                        miAppCallback2.onConnectionInitiated(i4, i5, str3, bArr3, bArr4);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onConnectionResult(final int i2, final int i3, final String str, final int i4) {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        DefaultMiApp.this.mMiAppCallback.onConnectionResult(i2, i3, str, i4);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onDisconnection(final int i2, final int i3) {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        DefaultMiApp.this.mMiAppCallback.onDisconnection(i2, i3);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onDiscoveryResult(final int i2, final int i3) {
                if (i3 == ResultCode.START_DISCOVERY_SUCCESS.getCode()) {
                    DefaultMiApp.this.isDiscovering = true;
                }
                if (i3 == ResultCode.STOP_DISCOVERY_SUCCESS.getCode()) {
                    DefaultMiApp.this.isDiscovering = false;
                }
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        DefaultMiApp.this.mMiAppCallback.onDiscoveryResult(i2, i3);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onEndpointFound(final int i2, final int i3, final String str, final byte[] bArr) {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        MiAppCallback miAppCallback2 = DefaultMiApp.this.mMiAppCallback;
                        int i4 = i2;
                        int i5 = i3;
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "";
                        }
                        byte[] bArr2 = bArr;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        miAppCallback2.onEndpointFound(i4, i5, str2, bArr2);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onEndpointLost(final int i2, final int i3, final String str) throws RemoteException {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        MiAppCallback miAppCallback2 = DefaultMiApp.this.mMiAppCallback;
                        int i4 = i2;
                        int i5 = i3;
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "";
                        }
                        miAppCallback2.onEndpointLost(i4, i5, str2);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onPayloadReceived(final int i2, final int i3, final byte[] bArr) {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        MiAppCallback miAppCallback2 = DefaultMiApp.this.mMiAppCallback;
                        int i4 = i2;
                        int i5 = i3;
                        byte[] bArr2 = bArr;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                        miAppCallback2.onPayloadReceived(i4, i5, bArr2);
                    }
                });
            }

            @Override // com.xiaomi.mi_connect_service.IMiConnectCallback
            public void onPayloadSentResult(final int i2, final int i3, final int i4) {
                DefaultMiApp.this.uiHandler.post(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        DefaultMiApp.this.mMiAppCallback.onPayloadSentResult(i2, i3, i4);
                    }
                });
            }
        };
        if (context == null || miAppCallback == null) {
            throw new IllegalArgumentException("context or callback can not be null");
        }
        this.mAppId = i;
    }

    private boolean requestServiceFromOtherApp(int i, AppConfig appConfig) {
        if (appConfig.getDiscAppIds().length < 1) {
            return false;
        }
        return (appConfig.getDiscAppIds().length == 1 && appConfig.getDiscAppIds()[0] == i) ? false : true;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void acceptConnection(ConnectionConfig connectionConfig) {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return;
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.acceptConnection(this.mAppId, connectionConfig.getRoleType(), connectionConfig.getEndPointId(), connectionConfig.isEndPointTrusted());
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.InnerMiApp
    public void destroy(int i) {
        doDestroy();
        this.isDestroying = true;
        try {
            IMiConnect iMiConnect = this.mService;
            if (iMiConnect != null) {
                iMiConnect.destroy(this.mAppId, i);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        unbindService();
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public byte[] deviceInfoIDM() {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return null;
        }
        if (BinderBase.sServiceApiVersion < 5) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return null;
        }
        try {
            return this.mService.deviceInfoIDM();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void disconnectFromEndPoint(ConnectionConfig connectionConfig) {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return;
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.disconnectFromEndPoint(this.mAppId, connectionConfig.getRoleType(), connectionConfig.getEndPointId());
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public byte[] getIdHash() {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return null;
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return null;
        }
        try {
            return this.mService.getIdHash();
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.BinderBase
    public int getMinVersion() {
        return 2;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.BinderBase
    public void onServiceConnected() {
        super.onServiceConnected();
        List<Command> list = this.commandList;
        int size = list.size();
        for (int i = 0; size > 0 && i < size; i++) {
            list.get(i).execute();
        }
        list.clear();
    }

    public int publish(String str, String str2, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("publish resource: ");
        sb.append(str);
        sb.append(" did: ");
        sb.append(str2);
        if (serviceAvailable()) {
            try {
                return this.mService.publish(this.mAppId, str, str2, bArr);
            } catch (RemoteException unused) {
                return 0;
            }
        }
        this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        return -1;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public int registerSoundBoxWhiteName(ISoundBoxWhiteNameCallBack iSoundBoxWhiteNameCallBack) {
        if (serviceAvailable()) {
            try {
                return this.mService.registerSoundBoxWhiteName(iSoundBoxWhiteNameCallBack);
            } catch (RemoteException unused) {
                return -1;
            }
        }
        this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        return -1;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void rejectConnection(ConnectionConfig connectionConfig) {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return;
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.rejectConnection(this.mAppId, connectionConfig.getRoleType(), connectionConfig.getEndPointId());
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void requestConnection(ConnectionConfig connectionConfig) {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return;
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.requestConnection(this.mAppId, connectionConfig.getEndPointId(), connectionConfig.getCommData());
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void sendPayload(PayloadConfig payloadConfig) {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return;
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.sendPayload(this.mAppId, payloadConfig.getRoleType(), payloadConfig.getEndPointId(), payloadConfig.getPayload());
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    public int setIPCDataCallback(String str, IIPCDataCallback iIPCDataCallback) {
        if (serviceAvailable()) {
            try {
                return this.mService.setIPCDataCallback(this.mAppId, str, iIPCDataCallback);
            } catch (RemoteException unused) {
                return -1;
            }
        }
        this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        return -1;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void startAdvertising(final AppConfig appConfig) {
        if (this.isDestroying) {
            return;
        }
        if (!serviceAvailable()) {
            this.commandList.add(new Command(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.2
                @Override // java.lang.Runnable
                public void run() {
                    DefaultMiApp.this.startAdvertising(appConfig);
                }
            }));
            bindService();
        } else {
            if (!isVersionSatisfied()) {
                this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
                return;
            }
            try {
                this.mService.setCallback(this.mAppId, 1, this.mCallback);
                this.mService.startAdvertising(this.mAppId, appConfig.getAdvData(), appConfig.getDiscType(), appConfig.getAppCommType(), appConfig.getCommData());
            } catch (RemoteException e) {
                e.printStackTrace();
                this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            }
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public long startAp(String str, String str2, int i, boolean z, IApStateCallback iApStateCallback) {
        int code;
        if (!serviceAvailable()) {
            MiAppCallback miAppCallback = this.mMiAppCallback;
            ResultCode resultCode = ResultCode.SERVICE_ERROR;
            miAppCallback.onServiceError(resultCode.getCode());
            code = resultCode.getCode();
        } else {
            if (BinderBase.sServiceApiVersion >= 7) {
                try {
                    return this.mService.startSap(str, str2, i, z, iApStateCallback);
                } catch (RemoteException unused) {
                    return -1L;
                }
            }
            MiAppCallback miAppCallback2 = this.mMiAppCallback;
            ResultCode resultCode2 = ResultCode.SERVICE_API_VERSION_TOO_LOW;
            miAppCallback2.onServiceError(resultCode2.getCode());
            code = resultCode2.getCode();
        }
        return code;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void startDiscovery(final AppConfig appConfig) {
        if (this.isDestroying) {
            return;
        }
        if (!serviceAvailable()) {
            this.commandList.add(new Command(new Runnable() { // from class: com.xiaomi.mi_connect_sdk.api.DefaultMiApp.3
                @Override // java.lang.Runnable
                public void run() {
                    DefaultMiApp.this.startDiscovery(appConfig);
                }
            }));
            bindService();
        } else {
            if (!isVersionSatisfied()) {
                this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
                return;
            }
            try {
                this.mService.setCallback(this.mAppId, 2, this.mCallback);
                if (!requestServiceFromOtherApp(this.mAppId, appConfig) || BinderBase.sServiceApiVersion <= 3) {
                    this.mService.startDiscovery(this.mAppId, appConfig.getCommData(), appConfig.getDiscType(), appConfig.getAppCommType(), appConfig.getAppCommDataType());
                } else {
                    this.mService.startDiscoveryV2(this.mAppId, appConfig.getCommData(), appConfig.getDiscType(), appConfig.getAppCommType(), appConfig.getAppCommDataType(), appConfig.getDiscAppIds());
                }
            } catch (RemoteException unused) {
                this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            }
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public int startScannerList(IDeviceScannerCallback iDeviceScannerCallback, String str) {
        if (serviceAvailable()) {
            try {
                return this.mService.startScannerList(this.mAppId, iDeviceScannerCallback, str);
            } catch (RemoteException unused) {
                return -1;
            }
        }
        this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        return -1;
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void stopAdvertising() {
        if (!serviceAvailable()) {
            if (this.isAdvertising) {
                this.mMiAppCallback.onServiceError(ResultCode.STOP_ADVERTISING_ERROR.getCode());
                return;
            } else {
                this.mMiAppCallback.onAdvertingResult(this.mAppId, ResultCode.STOP_ADVERTISING_SUCCESS.getCode());
                return;
            }
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.stopAdvertising(this.mAppId);
        } catch (RemoteException unused) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void stopAp(long j) {
        if (!serviceAvailable()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        } else if (BinderBase.sServiceApiVersion < 7) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
        } else {
            try {
                this.mService.stopSap(j);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public void stopDiscovery() {
        if (!serviceAvailable()) {
            if (this.isDiscovering) {
                this.mMiAppCallback.onServiceError(ResultCode.STOP_DISCOVERY_ERROR.getCode());
                return;
            } else {
                this.mMiAppCallback.onDiscoveryResult(this.mAppId, ResultCode.STOP_DISCOVERY_SUCCESS.getCode());
                return;
            }
        }
        if (!isVersionSatisfied()) {
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode());
            return;
        }
        try {
            this.mService.stopDiscovery(this.mAppId);
        } catch (RemoteException e) {
            e.printStackTrace();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
        }
    }

    @Override // com.xiaomi.mi_connect_sdk.api.MiApp
    public int updateCommConfig(AppConfig appConfig) {
        if (!serviceAvailable()) {
            MiAppCallback miAppCallback = this.mMiAppCallback;
            ResultCode resultCode = ResultCode.SERVICE_ERROR;
            miAppCallback.onServiceError(resultCode.getCode());
            return resultCode.getCode();
        }
        if (BinderBase.sServiceApiVersion < 8) {
            MiAppCallback miAppCallback2 = this.mMiAppCallback;
            ResultCode resultCode2 = ResultCode.SERVICE_API_VERSION_TOO_LOW;
            miAppCallback2.onServiceError(resultCode2.getCode());
            return resultCode2.getCode();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Service Api version too low:\n   required min version: 8\n   current version: ");
        sb.append(BinderBase.sServiceApiVersion);
        ResultCode.UNKNOWN_ERROR.getCode();
        try {
            return this.mService.updateCommConfig(this.mAppId, appConfig.getAppRoleType(), appConfig.getAppCommType(), appConfig.getCommData(), appConfig.getAppCommDataType());
        } catch (RemoteException e) {
            e.getMessage();
            this.mMiAppCallback.onServiceError(ResultCode.SERVICE_ERROR.getCode());
            return ResultCode.SERVICE_API_VERSION_TOO_LOW.getCode();
        }
    }
}
