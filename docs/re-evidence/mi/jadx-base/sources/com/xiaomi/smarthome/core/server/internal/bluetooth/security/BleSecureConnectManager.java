package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothHelper;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboStandardAuth;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWifiConfig;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.combo.BleComboWuganStandardAuth;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleSecurityLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.rc4auth.BleSecurityRegister;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegister;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipRegister;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipSharedLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityDoubleFactorSharedLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthLogin;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.standardauth.BleStandardAuthRegister;
import com.xiaomi.smarthome.core.server.internal.util.LtmkEncryptUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleSecureConnectManager {
    private static final BleConnectOptions CONNECT_OPTIONS;
    private static final SecureConnectOptions SECURE_CONNECT_OPTIONS;
    private static ConcurrentMap<String, SecureConnectInfo> mActiveLauncher;

    public static class ConnectResponse implements IBleSecureConnectResponse {
        String mac;
        IBleSecureConnectResponse response;

        public ConnectResponse(String str, IBleSecureConnectResponse iBleSecureConnectResponse) {
            this.mac = str;
            this.response = iBleSecureConnectResponse;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onAuthResponse(int i, Bundle bundle) {
            BluetoothMyLogger.w(String.format("ConnectResponse onAuthResponse: code = %d", Integer.valueOf(i)));
            IBleSecureConnectResponse iBleSecureConnectResponse = this.response;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onAuthResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onBindResponse(int i, Bundle bundle) {
            BluetoothMyLogger.w(String.format("ConnectResponse onBindResponse: code = %d", Integer.valueOf(i)));
            IBleSecureConnectResponse iBleSecureConnectResponse = this.response;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onBindResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onConnectResponse(int i, Bundle bundle) {
            BluetoothMyLogger.w(String.format("ConnectResponse onConnectResponse: code = %d", Integer.valueOf(i)));
            IBleSecureConnectResponse iBleSecureConnectResponse = this.response;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onConnectResponse(i, bundle);
            }
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.IBleSecureConnectResponse
        public void onLastResponse(int i, Bundle bundle) {
            BluetoothMyLogger.w(String.format("ConnectResponse onLastResponse: code = %d", Integer.valueOf(i)));
            BleSecureConnectManager.mActiveLauncher.remove(this.mac);
            if (i == 0) {
                BleCacheManager.getInstance().getBleDeviceState(this.mac).notifyConnected();
            } else {
                BleCacheManager.getInstance().getBleDeviceState(this.mac).notifyDisconnect();
            }
            IBleSecureConnectResponse iBleSecureConnectResponse = this.response;
            if (iBleSecureConnectResponse != null) {
                iBleSecureConnectResponse.onLastResponse(i, bundle);
            }
        }
    }

    public static class SecureConnectHandler extends ISecureConnectHandler.Stub {
        BleSecurityLauncher launcher;
        String mac;

        public SecureConnectHandler(String str, BleSecurityLauncher bleSecurityLauncher) {
            this.mac = str;
            this.launcher = bleSecurityLauncher;
        }

        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler
        public void cancel() throws RemoteException {
            BleSecurityLauncher bleSecurityLauncher = this.launcher;
            if (bleSecurityLauncher != null) {
                bleSecurityLauncher.cancel();
            }
        }

        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.ISecureConnectHandler
        public void sendCommand(int i, Bundle bundle, IBleResponse iBleResponse) throws RemoteException {
            BleSecurityLauncher bleSecurityLauncher = this.launcher;
            if (bleSecurityLauncher != null) {
                bleSecurityLauncher.sendCommand(i, bundle, iBleResponse);
            }
        }

        public void setLauncher(BleSecurityLauncher bleSecurityLauncher) {
            this.launcher = bleSecurityLauncher;
        }
    }

    public static class SecureConnectInfo {
        ISecureConnectHandler handler;
        BleSecurityLauncher launcher;
        String mac;

        public SecureConnectInfo(String str, BleSecurityLauncher bleSecurityLauncher, ISecureConnectHandler iSecureConnectHandler) {
            this.mac = str;
            this.launcher = bleSecurityLauncher;
            this.handler = iSecureConnectHandler;
        }

        public void setLauncher(BleSecurityLauncher bleSecurityLauncher) {
            this.launcher = bleSecurityLauncher;
        }
    }

    static {
        BleConnectOptions bleConnectOptionsBuild = new BleConnectOptions.Builder().setConnectRetry(3).setConnectTimeout(25000).setServiceDiscoverRetry(2).setServiceDiscoverTimeout(ErrorCode.ERROR_CODE_INVALID_PARAM).build();
        CONNECT_OPTIONS = bleConnectOptionsBuild;
        SECURE_CONNECT_OPTIONS = new SecureConnectOptions.Builder().setConnectOptions(bleConnectOptionsBuild).build();
        mActiveLauncher = new ConcurrentHashMap();
    }

    public static ISecureConnectHandler bleComboStandardAuth(String str, BleComboWifiConfig bleComboWifiConfig, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("bleComboStandardAuth for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleComboStandardAuth bleComboStandardAuth = new BleComboStandardAuth(str, BluetoothHelper.getProductId(str), bleComboWifiConfig, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleComboStandardAuth);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleComboStandardAuth, secureConnectHandler));
        bleComboStandardAuth.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler bleComboWuganStandardAuth(String str, BleComboWifiConfig bleComboWifiConfig, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("bleComboStandardAuth for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleComboWuganStandardAuth bleComboWuganStandardAuth = new BleComboWuganStandardAuth(str, BluetoothHelper.getProductId(str), bleComboWifiConfig, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleComboWuganStandardAuth);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleComboWuganStandardAuth, secureConnectHandler));
        bleComboWuganStandardAuth.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler bleMeshBind(String str, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("bleMeshBind for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        int productId = BluetoothHelper.getProductId(str);
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleMeshRegister bleMeshRegister = new BleMeshRegister(str, productId, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleMeshRegister);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleMeshRegister, secureConnectHandler));
        bleMeshRegister.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler bleMeshConnect(final String str, String str2, final String str3, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("bleMeshConnect for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        final int productId = BluetoothHelper.getProductId(str);
        final ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        final BleConnectOptions connectOptions = secureConnectOptions.getConnectOptions();
        final SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, null);
        final SecureConnectInfo secureConnectInfo = new SecureConnectInfo(str, null, secureConnectHandler);
        String propToken = BluetoothCache.getPropToken(str);
        String propLtmk = BluetoothCache.getPropLtmk(str);
        mActiveLauncher.put(str, secureConnectInfo);
        if (!TextUtils.equals(propToken, str3) || TextUtils.isEmpty(propLtmk)) {
            getBleMeshGattLtmk(str2, new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager.2
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    BluetoothMyLogger.v(String.format("bleMeshConnect for %s error: getGattLtmk failed(%s)", BluetoothMyLogger.getBase64(str), bleNetError.getDetail()));
                    IBleSecureConnectResponse iBleSecureConnectResponse2 = connectResponse;
                    if (iBleSecureConnectResponse2 != null) {
                        iBleSecureConnectResponse2.onLastResponse(-15, null);
                    }
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(String str4) {
                    if (TextUtils.isEmpty(str4)) {
                        BluetoothMyLogger.v(String.format("bleMeshConnect for %s error: gatt ltmk is null", BluetoothMyLogger.getBase64(str)));
                        IBleSecureConnectResponse iBleSecureConnectResponse2 = connectResponse;
                        if (iBleSecureConnectResponse2 != null) {
                            iBleSecureConnectResponse2.onLastResponse(-15, null);
                            return;
                        }
                        return;
                    }
                    BluetoothCache.setPropToken(str, str3);
                    BluetoothCache.setPropLtmk(str, str4);
                    BleMeshLogin bleMeshLogin = new BleMeshLogin(str, productId, ByteUtils.stringToBytes(str4), connectOptions);
                    secureConnectHandler.setLauncher(bleMeshLogin);
                    secureConnectInfo.setLauncher(bleMeshLogin);
                    bleMeshLogin.start(connectResponse);
                }
            });
        } else {
            BleMeshLogin bleMeshLogin = new BleMeshLogin(str, productId, ByteUtils.stringToBytes(propLtmk), connectOptions);
            secureConnectHandler.setLauncher(bleMeshLogin);
            secureConnectInfo.setLauncher(bleMeshLogin);
            bleMeshLogin.start(connectResponse);
        }
        return secureConnectHandler;
    }

    public static ISecureConnectHandler bleStandardAuthBind(String str, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("bleStandardAuthBind for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("bleStandardAuthBind for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleStandardAuthRegister bleStandardAuthRegister = new BleStandardAuthRegister(str, productId, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleStandardAuthRegister);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleStandardAuthRegister, secureConnectHandler));
        bleStandardAuthRegister.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler bleStandardAuthConnect(String str, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("bleStandardAuthConnect for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("bleStandardAuthConnect for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        if (ByteUtils.isEmpty(propTokenBytes)) {
            BluetoothMyLogger.e(String.format("bleStandardAuthConnect for %s error: token is empty!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-54, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleStandardAuthLogin bleStandardAuthLogin = new BleStandardAuthLogin(str, productId, propTokenBytes, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleStandardAuthLogin);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleStandardAuthLogin, secureConnectHandler));
        bleStandardAuthLogin.start(connectResponse);
        return secureConnectHandler;
    }

    public static void clearLauncher(String str) {
        mActiveLauncher.remove(str);
    }

    private static void getBleMeshGattLtmk(String str, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        DeviceApi.queryBleMeshBindInfo(str, new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager.3
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(bleNetError);
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str2) {
                String strOptString;
                try {
                    strOptString = new JSONObject(str2).optString("gatt_ltmk");
                } catch (JSONException e) {
                    e.printStackTrace();
                    strOptString = "";
                }
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onSuccess(strOptString);
                }
            }
        });
    }

    public static ISecureConnectHandler secureConnect(String str, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("SecureConnect for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("SecureConnect for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleConnectOptions connectOptions = secureConnectOptions.getConnectOptions();
        BleSecurityLauncher bleSecurityRegister = ByteUtils.isEmpty(propTokenBytes) ? new BleSecurityRegister(str, productId, connectOptions) : new BleSecurityLogin(str, productId, propTokenBytes, connectOptions);
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleSecurityRegister);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleSecurityRegister, secureConnectHandler));
        bleSecurityRegister.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler securityChipConnect(final String str, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        BleSecurityLauncher bleSecurityChipRegister = null;
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("securityChipConnect for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        final int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("securityChipConnect for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        final BleConnectOptions connectOptions = secureConnectOptions.getConnectOptions();
        byte[] propLtmkBytes = BluetoothCache.getPropLtmkBytes(str);
        String propDid = BluetoothCache.getPropDid(str);
        final SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, null);
        final SecureConnectInfo secureConnectInfo = new SecureConnectInfo(str, null, secureConnectHandler);
        mActiveLauncher.put(str, secureConnectInfo);
        if (!ByteUtils.isEmpty(propLtmkBytes)) {
            String propPincode = BluetoothCache.getPropPincode(str);
            int propLtmkEncryptType = BluetoothCache.getPropLtmkEncryptType(str);
            if (propLtmkEncryptType == 0) {
                bleSecurityChipRegister = new BleSecurityChipLogin(str, productId, propLtmkBytes, connectOptions);
            } else if (!TextUtils.isEmpty(propPincode)) {
                bleSecurityChipRegister = new BleSecurityChipLogin(str, productId, ByteUtils.stringToBytes(LtmkEncryptUtil.decryptLtmk(propPincode, ByteUtils.byteToString(propLtmkBytes), propLtmkEncryptType)), connectOptions);
            } else if (connectResponse != null) {
                connectResponse.onLastResponse(-38, null);
            }
        } else if (TextUtils.isEmpty(propDid)) {
            bleSecurityChipRegister = new BleSecurityChipRegister(str, productId, connectOptions);
        } else {
            final ConnectResponse connectResponse2 = connectResponse;
            DeviceApi.getOwnLtmk(propDid, new BleAsyncCallback<JSONObject, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecureConnectManager.1
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    BluetoothMyLogger.v(String.format("securityChipConnect for %s error: getOwnLtmk failed(%s), try to register", BluetoothMyLogger.getBase64(str), bleNetError.getDetail()));
                    BleSecurityChipRegister bleSecurityChipRegister2 = new BleSecurityChipRegister(str, productId, connectOptions);
                    secureConnectHandler.setLauncher(bleSecurityChipRegister2);
                    secureConnectInfo.setLauncher(bleSecurityChipRegister2);
                    bleSecurityChipRegister2.start(connectResponse2);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(JSONObject jSONObject) {
                    String strOptString = jSONObject != null ? jSONObject.optString("key") : "";
                    if (TextUtils.isEmpty(strOptString)) {
                        BleSecurityChipRegister bleSecurityChipRegister2 = new BleSecurityChipRegister(str, productId, connectOptions);
                        secureConnectHandler.setLauncher(bleSecurityChipRegister2);
                        secureConnectInfo.setLauncher(bleSecurityChipRegister2);
                        bleSecurityChipRegister2.start(connectResponse2);
                        return;
                    }
                    BluetoothCache.setPropLtmk(str, strOptString);
                    int iOptInt = jSONObject.optInt("encrypt_type", 0);
                    if (iOptInt == 0) {
                        BleSecurityChipLogin bleSecurityChipLogin = new BleSecurityChipLogin(str, productId, ByteUtils.stringToBytes(strOptString), connectOptions);
                        secureConnectHandler.setLauncher(bleSecurityChipLogin);
                        secureConnectInfo.setLauncher(bleSecurityChipLogin);
                        bleSecurityChipLogin.start(connectResponse2);
                        return;
                    }
                    String propPincode2 = BluetoothCache.getPropPincode(str);
                    if (TextUtils.isEmpty(propPincode2)) {
                        IBleSecureConnectResponse iBleSecureConnectResponse2 = connectResponse2;
                        if (iBleSecureConnectResponse2 != null) {
                            iBleSecureConnectResponse2.onLastResponse(-38, null);
                            return;
                        }
                        return;
                    }
                    BleSecurityChipLogin bleSecurityChipLogin2 = new BleSecurityChipLogin(str, productId, ByteUtils.stringToBytes(LtmkEncryptUtil.decryptLtmk(propPincode2, strOptString, iOptInt)), connectOptions);
                    secureConnectHandler.setLauncher(bleSecurityChipLogin2);
                    secureConnectInfo.setLauncher(bleSecurityChipLogin2);
                    bleSecurityChipLogin2.start(connectResponse2);
                }
            });
        }
        if (bleSecurityChipRegister != null) {
            secureConnectHandler.setLauncher(bleSecurityChipRegister);
            secureConnectInfo.setLauncher(bleSecurityChipRegister);
            bleSecurityChipRegister.start(connectResponse);
        }
        return secureConnectHandler;
    }

    public static ISecureConnectHandler securityChipPincodeConnect(String str, String str2, String str3, int i, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        BleSecurityLauncher bleSecurityLauncher;
        IBleSecureConnectResponse iBleSecureConnectResponse2;
        SecureConnectInfo secureConnectInfoRemove = mActiveLauncher.remove(str);
        if (secureConnectInfoRemove != null && (bleSecurityLauncher = secureConnectInfoRemove.launcher) != null && (iBleSecureConnectResponse2 = bleSecurityLauncher.mResponse) != null) {
            bleSecurityLauncher.mResponse = null;
            Bundle bundle = new Bundle();
            bundle.putString("result", "new request");
            BleConnectManager.getInstance().disconnect(str);
            iBleSecureConnectResponse2.onLastResponse(-2, bundle);
            BluetoothMyLogger.e(String.format("securityChipConnect for %s previous cancel for new request!!", BluetoothMyLogger.getBase64(str)));
        }
        int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("securityChipConnect for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleSecurityChipLogin bleSecurityChipLogin = new BleSecurityChipLogin(str, productId, ByteUtils.stringToBytes(LtmkEncryptUtil.decryptLtmk(str2, str3, i)), secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleSecurityChipLogin);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleSecurityChipLogin, secureConnectHandler));
        bleSecurityChipLogin.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler securityChipSharedDeviceConnect(String str, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("securityChipSharedDeviceConnect for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("securityChipSharedDeviceConnect for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleSecurityChipSharedLogin bleSecurityChipSharedLogin = new BleSecurityChipSharedLogin(str, productId, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleSecurityChipSharedLogin);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleSecurityChipSharedLogin, secureConnectHandler));
        bleSecurityChipSharedLogin.start(connectResponse);
        return secureConnectHandler;
    }

    public static ISecureConnectHandler securityDoubleFactorSharedDeviceConnect(String str, String str2, SecureConnectOptions secureConnectOptions, IBleSecureConnectResponse iBleSecureConnectResponse) {
        if (mActiveLauncher.containsKey(str)) {
            BluetoothMyLogger.e(String.format("securityDoubleFactorSharedDeviceConnect for %s error: previous ongoing!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-13, null);
            return null;
        }
        int productId = BluetoothHelper.getProductId(str);
        if (productId <= 0) {
            BluetoothMyLogger.e(String.format("securityChipSharedDeviceConnect for %s error: productId invalid!!", BluetoothMyLogger.getBase64(str)));
            iBleSecureConnectResponse.onLastResponse(-12, null);
            return null;
        }
        ConnectResponse connectResponse = iBleSecureConnectResponse != null ? new ConnectResponse(str, iBleSecureConnectResponse) : null;
        if (secureConnectOptions == null) {
            secureConnectOptions = SECURE_CONNECT_OPTIONS;
        }
        BleSecurityDoubleFactorSharedLogin bleSecurityDoubleFactorSharedLogin = new BleSecurityDoubleFactorSharedLogin(str, str2, productId, secureConnectOptions.getConnectOptions());
        SecureConnectHandler secureConnectHandler = new SecureConnectHandler(str, bleSecurityDoubleFactorSharedLogin);
        mActiveLauncher.put(str, new SecureConnectInfo(str, bleSecurityDoubleFactorSharedLogin, secureConnectHandler));
        bleSecurityDoubleFactorSharedLogin.start(connectResponse);
        return secureConnectHandler;
    }
}
