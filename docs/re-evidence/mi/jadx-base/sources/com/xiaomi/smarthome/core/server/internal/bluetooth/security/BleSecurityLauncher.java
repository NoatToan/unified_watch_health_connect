package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.os.Bundle;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleSecurityLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipSharedLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLogin;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleSecurityLauncher {
    public static final String ACTION_BLE_AUTH = "action.ble.auth";
    public static final String ACTION_BLE_BIND = "action.ble.bind";
    public static final String ACTION_BLE_CONNECT = "action.ble.connect";
    public static final String LAUNCHER_TYPE = "launcher_type_statis";
    public static final int METHOD_REQUEST_DEVICE_LOG = 10;
    protected Bundle mBundle;
    protected volatile boolean mCanceled;
    protected BleConnectOptions mConnectOptions;
    protected String mDeviceMac;
    protected IBleDeviceLauncher mLauncher;
    protected int mProductId;
    protected IBleSecureConnectResponse mResponse;
    protected byte[] mToken;

    public BleSecurityLauncher(String str, int i, BleConnectOptions bleConnectOptions) {
        this(str, i, null, bleConnectOptions);
    }

    public void cancel() {
        this.mCanceled = true;
        BleSecurityConnector securityConnector = getSecurityConnector();
        if (securityConnector != null) {
            securityConnector.cancel();
        }
        onCanceled();
    }

    public void dispatchResult(int i) {
        if (isCanceled()) {
            i = -2;
        }
        if (BluetoothService.getBleCoreProvider().isEuropeServer()) {
            MiJiaLog.writeLogOnAll(LogType.EUROPE, "core-bluetooth", getClass().getSimpleName() + ", SecureConnect onResponse: code = " + i + ", time=" + System.currentTimeMillis());
        } else {
            BluetoothMyLogger.v(String.format("SecureConnect onResponse: code = %s, time=%s", Code.toString(i), Long.valueOf(System.currentTimeMillis())));
        }
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(this.mDeviceMac);
        if (!ByteUtils.isEmpty(propTokenBytes)) {
            this.mBundle.putByteArray("token", propTokenBytes);
        }
        if (this.mResponse != null) {
            try {
                this.mBundle.putString(BluetoothConstants.KEY_VERSION, BluetoothCache.getFirmwareVersion(this.mDeviceMac));
                this.mResponse.onLastResponse(i, this.mBundle);
            } catch (Exception e) {
                BluetoothLog.w(e);
            }
        }
        this.mResponse = null;
        if (i == 0 || BluetoothUtils.isBleDeviceDisconnected(this.mDeviceMac)) {
            return;
        }
        BleConnectManager.getInstance().disconnect(this.mDeviceMac);
    }

    public abstract BleSecurityConnector getSecurityConnector();

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public void notifyBindProcess(String str, int i) {
        notifyBindProcess(str, i, this.mBundle);
    }

    public void onCanceled() {
    }

    public abstract void onPostConnect(int i, Bundle bundle);

    public void onPostConnectFailed(int i) {
    }

    public void sendCommand(int i, Bundle bundle, IBleResponse iBleResponse) {
    }

    public void start(IBleSecureConnectResponse iBleSecureConnectResponse) {
        BluetoothMyLogger.v(String.format("%s for %s", getClass().getSimpleName(), BluetoothMyLogger.getBase64(this.mDeviceMac)));
        this.mResponse = iBleSecureConnectResponse;
        BleSecurityConnector securityConnector = getSecurityConnector();
        if (securityConnector == null) {
            throw new IllegalArgumentException("Ble security connector should not be null");
        }
        securityConnector.connect(this.mConnectOptions, new BleConnectResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Bundle bundle) {
                if (i == 0) {
                    BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_AUTH, i, bundle);
                    if (bundle != null) {
                        BleSecurityLauncher.this.mBundle.putAll(bundle);
                    }
                    BleSecurityLauncher.this.onPostConnect(i, bundle);
                    return;
                }
                if (bundle == null || !bundle.getBoolean(BluetoothConstants.KEY_IS_CONNECT_FAILED, false)) {
                    BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_AUTH, i, bundle);
                }
                BleSecurityLauncher.this.onPostConnectFailed(i);
                BleSecurityLauncher.this.dispatchResult(i);
            }
        });
    }

    public BleSecurityLauncher(String str, int i, byte[] bArr, BleConnectOptions bleConnectOptions) {
        this.mLauncher = new IBleDeviceLauncher() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityLauncher.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher
            public String getDeviceMac() {
                return BleSecurityLauncher.this.mDeviceMac;
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher
            public int getDeviceProductId() {
                return BleSecurityLauncher.this.mProductId;
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher
            public byte[] getDeviceToken() {
                return BleSecurityLauncher.this.mToken;
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher
            public void notifyAuthProcess(int i2, Bundle bundle) {
                BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_AUTH, i2, bundle);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher
            public void notifyConnectProcess(int i2, Bundle bundle) {
                BleSecurityLauncher.this.notifyBindProcess(BleSecurityLauncher.ACTION_BLE_CONNECT, i2, bundle);
            }
        };
        this.mDeviceMac = str;
        this.mProductId = i;
        this.mToken = bArr;
        this.mConnectOptions = bleConnectOptions;
        Bundle bundle = new Bundle();
        this.mBundle = bundle;
        bundle.setClassLoader(getClass().getClassLoader());
        this.mBundle.putString(LAUNCHER_TYPE, ((this instanceof BleSecurityLogin) || (this instanceof BleMeshLogin) || (this instanceof BleSecurityChipLogin) || (this instanceof BleSecurityChipSharedLogin) || (this instanceof BleSecurityDoubleFactorSharedLogin)) ? "login" : LoginPreferenceConfig.TYPE_REGISTER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBindProcess(String str, int i, Bundle bundle) {
        str.hashCode();
        switch (str) {
            case "action.ble.auth":
                IBleSecureConnectResponse iBleSecureConnectResponse = this.mResponse;
                if (iBleSecureConnectResponse != null) {
                    iBleSecureConnectResponse.onAuthResponse(i, bundle);
                    break;
                }
                break;
            case "action.ble.bind":
                IBleSecureConnectResponse iBleSecureConnectResponse2 = this.mResponse;
                if (iBleSecureConnectResponse2 != null) {
                    iBleSecureConnectResponse2.onBindResponse(i, bundle);
                    break;
                }
                break;
            case "action.ble.connect":
                IBleSecureConnectResponse iBleSecureConnectResponse3 = this.mResponse;
                if (iBleSecureConnectResponse3 != null) {
                    iBleSecureConnectResponse3.onConnectResponse(i, bundle);
                    break;
                }
                break;
            default:
                BluetoothMyLogger.e(String.format("notifyBindProcess: unknown action = %s, code = %d", str, Integer.valueOf(i)));
                break;
        }
    }
}
