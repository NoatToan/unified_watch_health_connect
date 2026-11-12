package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchRequest;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchResult;
import com.xiaomi.smarthome.core.entity.bluetooth.SearchTask;
import com.xiaomi.smarthome.core.entity.device.BtDevice;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.bluetooth.SearchResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleKeyValuePair;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetResponseParser;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.ChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.channel.IPCChannelManager;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.BluetoothRecognizeResult;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.BluetoothRecognizer;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizeResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipEncrypt;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipOperate;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.Hkdf;
import com.xiaomi.smarthome.core.server.internal.util.LtmkEncryptUtil;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.device.bluetooth.security.BLECipher;
import com.xiaomi.smarthome.frame.AsyncCallback;
import com.xiaomi.smarthome.frame.Error;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BleConnectOptions;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;
import com.xiaomi.smarthome.library.bluetooth.connect.BleGattService;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadRssiResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleRequestMtuResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchHelper;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchRequest;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResponse;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.common.util.ListUtils;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothApi {
    private static final long DEFAULT_DISCONNECT_DELAY = 10000;
    private static final int DISCONNECT_CHECK_RECYCLE = 10000;
    private static final int MSG_DISCONNECT_ADD = 2;
    private static final int MSG_DISCONNECT_CHECK = 1;
    private static List<DisconnectionHolder> mDisconnectRecords = new ArrayList();
    private static Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                BluetoothApi.checkDisconnection();
                BluetoothApi.mHandler.sendEmptyMessageDelayed(1, 10000L);
            } else {
                if (i != 2) {
                    return;
                }
                Bundle data = message.getData();
                DisconnectionHolder disconnectionHolder = new DisconnectionHolder();
                disconnectionHolder.mac = data.getString(IBluetoothService.EXTRA_MAC, "");
                disconnectionHolder.deadline = data.getLong(IBluetoothService.EXTRA_DELAY, 10000L) + System.currentTimeMillis();
                BluetoothApi.mDisconnectRecords.add(disconnectionHolder);
                Collections.sort(BluetoothApi.mDisconnectRecords);
            }
        }
    };
    private static IBleChannelReader sIPCChannelReader = new ChannelManager.BleChannelReader() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.6
        @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleChannelReader
        public void onRead(String str, byte[] bArr, int i) throws RemoteException {
            if (i == 0) {
                byte[] bArrEncrypt = BLECipher.encrypt(BluetoothCache.getPropTokenBytes(str), bArr);
                IBleChannelWriter writer = IPCChannelManager.getInstance().getWriter(str);
                if (writer != null) {
                    BleMessageParser.parseMessage(str, bArrEncrypt, writer);
                }
            }
        }
    };

    public static void bindDevice(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        if (ByteUtils.isEmpty(propTokenBytes) || !MiuiSDKHelper.getInstance().bindDevice(str, propTokenBytes)) {
            return;
        }
        BluetoothCache.setPropExtra(str, BtConstants.KEY_MIUI_BIND, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkDisconnection() {
        while (!ListUtils.isEmpty(mDisconnectRecords)) {
            DisconnectionHolder disconnectionHolder = mDisconnectRecords.get(0);
            if (System.currentTimeMillis() < disconnectionHolder.deadline) {
                break;
            }
            mDisconnectRecords.remove(0);
            disconnect(disconnectionHolder.mac);
        }
        if (ListUtils.isEmpty(mDisconnectRecords)) {
            mHandler.removeMessages(1);
        }
    }

    public static void clearAllDisconnection() {
        BluetoothLog.v(String.format("clearAllDisconnection", new Object[0]));
        mDisconnectRecords.clear();
        mHandler.removeMessages(1);
    }

    public static void clearDisconnection(String str) {
        BluetoothLog.v(String.format("clearDisconnection %s", str));
        mDisconnectRecords.remove(new DisconnectionHolder(str));
        if (ListUtils.isEmpty(mDisconnectRecords)) {
            mHandler.removeMessages(1);
        }
    }

    public static void connect(final String str, BleConnectOptions bleConnectOptions, final IBleResponse iBleResponse) {
        connect(str, bleConnectOptions, new BleConnectResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Bundle bundle) {
                Pair<Boolean, String> pairIsMeshDevice;
                if (i == 0 && (pairIsMeshDevice = BluetoothService.getBleCoreProvider().isMeshDevice(str)) != null && ((Boolean) pairIsMeshDevice.first).booleanValue()) {
                    DeviceApi.reportBleMeshVersion(str, (String) pairIsMeshDevice.second, null);
                }
                IBleResponse iBleResponse2 = iBleResponse;
                if (iBleResponse2 != null) {
                    try {
                        iBleResponse2.onResponse(i, bundle);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    private static void disconnect(String str) {
        BluetoothMyLogger.d("disconnect mac = " + BluetoothMyLogger.getBase64(str));
        BleConnectManager.getInstance().disconnect(str);
    }

    public static void disconnectAll() {
        BluetoothMyLogger.w("BluetoothApi.disconnectAll");
        BleConnectManager.getInstance().disconnectAllDevices();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispatchDeviceStatus(Bundle bundle, IBleResponse iBleResponse) {
        try {
            iBleResponse.onResponse(0, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void dispatchOneTimePasswordResult(int i, String str, int[] iArr, IBleResponse iBleResponse) {
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString(IBluetoothService.EXTRA_MESSAGE, str);
        }
        if (iArr != null) {
            bundle.putIntArray(IBluetoothService.EXTRA_INT_ARRAY, iArr);
        }
        try {
            iBleResponse.onResponse(i, bundle);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void findComboMac(final String str, final IBleResponse iBleResponse) {
        BluetoothService.getBleCoreProvider().writeLogOnGrey("BluetoothApi", String.format("BluetoothApi.findComboMac subMac = %s", str));
        if (str == null || str.length() != 4) {
            BluetoothService.getBleCoreProvider().writeLogOnGrey("BluetoothApi", "findComboMac error subMac must 4 char but get " + str);
            return;
        }
        String address = ComboCollector.getAddress(str);
        final Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(address)) {
            final BluetoothSearchRequest bluetoothSearchRequestBuild = new BluetoothSearchRequest.Builder().searchBluetoothLeDevice(5000, 4).build();
            BluetoothSearchHelper.getInstance().startSearch(bluetoothSearchRequestBuild, new BluetoothSearchResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.31
                @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
                public void onSearchCanceled() {
                    if (bundle.containsKey(IBluetoothService.EXTRA_MAC)) {
                        return;
                    }
                    try {
                        iBleResponse.onResponse(-1, bundle);
                    } catch (Exception e) {
                        BluetoothService.getBleCoreProvider().writeLogOnGrey("BluetoothApi", "findComboMac onSearchCanceled" + Log.getStackTraceString(e));
                        e.printStackTrace();
                    }
                }

                @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
                public void onSearchStarted() {
                }

                @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
                public void onSearchStopped() {
                    if (bundle.containsKey(IBluetoothService.EXTRA_MAC)) {
                        return;
                    }
                    try {
                        iBleResponse.onResponse(-1, bundle);
                    } catch (Exception e) {
                        BluetoothService.getBleCoreProvider().writeLogOnGrey("BluetoothApi", "findComboMac onSearchStopped" + Log.getStackTraceString(e));
                        e.printStackTrace();
                    }
                }

                @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
                public void onDeviceFounded(final BluetoothSearchResult bluetoothSearchResult) {
                    BluetoothRecognizer.getInstance().recognizeAsync(bluetoothSearchResult, new IBluetoothRecognizeResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.31.1
                        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizeResponse
                        public void onRecognized(BluetoothRecognizeResult bluetoothRecognizeResult) {
                            if (TextUtils.isEmpty(ComboCollector.getAddress(str))) {
                                return;
                            }
                            BluetoothSearchHelper.getInstance().cancelSearch(bluetoothSearchRequestBuild);
                            bundle.putString(IBluetoothService.EXTRA_MAC, bluetoothSearchResult.getAddress());
                            try {
                                AnonymousClass31 anonymousClass31 = AnonymousClass31.this;
                                iBleResponse.onResponse(0, bundle);
                            } catch (Exception e) {
                                BluetoothService.getBleCoreProvider().writeLogOnGrey("BluetoothApi", "findComboMac onRecognized" + Log.getStackTraceString(e));
                                e.printStackTrace();
                            }
                        }
                    });
                }
            });
            return;
        }
        BluetoothLog.w("findComboMac by BluetoothDeviceSearch");
        bundle.putString(IBluetoothService.EXTRA_MAC, address);
        try {
            iBleResponse.onResponse(0, bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void generateOneTimePassword(int i, int i2, byte[] bArr, long j, IBleResponse iBleResponse) {
        byte[] bArrDeriveKey;
        byte[] bArrDoFinal;
        int[] iArr;
        try {
            Hkdf hkdf = Hkdf.getInstance("HmacSHA256");
            hkdf.init(bArr, "mi-lock-otp-salt".getBytes());
            bArrDeriveKey = hkdf.deriveKey("mi-lock-otp-info".getBytes(), 32);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            bArrDeriveKey = null;
        }
        if (bArrDeriveKey != null) {
            try {
                Mac mac = Mac.getInstance("HmacSHA256");
                mac.init(new SecretKeySpec(bArrDeriveKey, "HmacSHA256"));
                int i3 = (int) (j / ((long) (i * 60)));
                bArrDoFinal = mac.doFinal(new byte[]{(byte) (i3 & 255), (byte) ((i3 >> 8) & 255), (byte) ((i3 >> 16) & 255), (byte) ((i3 >> 24) & 255)});
            } catch (InvalidKeyException e2) {
                e2.printStackTrace();
                bArrDoFinal = null;
            } catch (NoSuchAlgorithmException e3) {
                e3.printStackTrace();
                bArrDoFinal = null;
            }
        } else {
            bArrDoFinal = null;
        }
        if (bArrDoFinal == null || bArrDoFinal.length != 32) {
            iArr = null;
        } else {
            iArr = new int[8];
            int i4 = 1;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 *= 10;
            }
            for (int i6 = 0; i6 < bArrDoFinal.length; i6 += 4) {
                iArr[i6 / 4] = (int) ((((long) ((((bArrDoFinal[i6] & 255) | ((bArrDoFinal[i6 + 1] & 255) << 8)) | ((bArrDoFinal[i6 + 2] & 255) << 16)) | ((bArrDoFinal[i6 + 3] & 255) << 24))) & 4294967295L) % ((long) i4));
            }
        }
        if (iArr != null) {
            dispatchOneTimePasswordResult(0, "", iArr, iBleResponse);
        } else {
            BluetoothMyLogger.d("generateOneTimePassword generate failed");
            dispatchOneTimePasswordResult(-1, "generate failed", null, iBleResponse);
        }
    }

    public static void generateOneTimePwdBySelf(String str, final IBleResponse iBleResponse) {
        BluetoothService.getBleCoreProvider().generateOneTimePwdBySelf(str, new AsyncCallback<String, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.30
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                if (iBleResponse != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString(IBluetoothService.EXTRA_MESSAGE, error.getDetail());
                        iBleResponse.onResponse(error.getCode(), bundle);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(String str2) {
                if (iBleResponse != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString(IBluetoothService.EXTRA_MESSAGE, str2);
                        iBleResponse.onResponse(0, bundle);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void getBleDeviceByGateway(final String str, final List<String> list, final BleAsyncCallback<Boolean, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dids", new JSONArray((Collection) list));
        } catch (JSONException unused) {
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("getBleDeviceByGateway: [%s]", jSONObject));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/device/get_bledevice_by_gateway").addQueries(arrayList).build();
        final BleJsonParser<Boolean> bleJsonParser = new BleJsonParser<Boolean>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%s]", jSONObject2));
                if (jSONObject2 != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(jSONObject2.optString((String) it.next()));
                            if (jSONObject3.length() > 0) {
                                Iterator<String> itKeys = jSONObject3.keys();
                                while (itKeys.hasNext()) {
                                    if (TextUtils.equals(str, itKeys.next())) {
                                        return Boolean.TRUE;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                return Boolean.FALSE;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.13
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str2) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str2));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str2) {
                BleNetResponseParser.getInstance().parse(str2, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getBleMeshFirmwareVersion(final String str, final BleResponse<String> bleResponse) {
        BluetoothMyLogger.d("getBleMeshFirmwareVersion mac = " + BluetoothMyLogger.getBase64(str));
        BleConnectManager.getInstance().read(str, BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_FIRMWARE_VERSION, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.27
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

    public static void getBleMeshVersion(String str, final IBleResponse iBleResponse) {
        getBleMeshFirmwareVersion(str, new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.25
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str2) {
                if (iBleResponse != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(IBluetoothService.EXTRA_VALUE, str2);
                    try {
                        iBleResponse.onResponse(i, bundle);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void getBleStandardAuthFirmwareVersion(String str, final IBleResponse iBleResponse) {
        getBleMeshFirmwareVersion(str, new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.26
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str2) {
                if (iBleResponse != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString(IBluetoothService.EXTRA_VALUE, str2);
                    try {
                        iBleResponse.onResponse(i, bundle);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static List<Device> getBluetoothGatewayDevices() {
        List<Device> deviceList = BluetoothService.getBleCoreProvider().getDeviceList();
        ArrayList arrayList = new ArrayList();
        for (Device device : deviceList) {
            if (device.isOwner() && BluetoothService.getBleCoreProvider().isBluetoothGatewayDevice(device.getModel())) {
                arrayList.add(device);
            }
        }
        return arrayList;
    }

    public static ArrayList<BtDevice> getLocalBoundedDevices() {
        return BluetoothCache.getLocalBoundedDevices();
    }

    public static ArrayList<BtDevice> getLocalRemovedDevices() {
        return BluetoothCache.getLocalRemovedDevices();
    }

    public static void getOneTimePassword(final String str, final int i, final int i2, final long j, final IBleResponse iBleResponse) {
        BluetoothMyLogger.d("getOneTimePassword mac = " + BluetoothMyLogger.getBase64(str));
        if (i < 1 || i > 60) {
            BluetoothMyLogger.d("getOneTimePassword interval illegal");
            dispatchOneTimePasswordResult(-1, "interval illegal", null, iBleResponse);
            return;
        }
        if (i2 < 6 || i2 > 8) {
            BluetoothMyLogger.d("getOneTimePassword digits illegal");
            dispatchOneTimePasswordResult(-1, "digits illegal", null, iBleResponse);
            return;
        }
        String propDid = BluetoothCache.getPropDid(str);
        if (TextUtils.isEmpty(propDid)) {
            BluetoothMyLogger.d("getOneTimePassword can't find this device did");
            dispatchOneTimePasswordResult(-1, "can't find this device did", null, iBleResponse);
            return;
        }
        if (BluetoothService.getBleCoreProvider().isShareDevice(propDid) && !TextUtils.isEmpty(BluetoothCache.getLockShareUserKey(str))) {
            String lockShareUserKey = BluetoothCache.getLockShareUserKey(str);
            BluetoothMyLogger.d("getOneTimePassword userKey is : " + lockShareUserKey);
            getOneTimePasswordUTC(ByteUtils.stringToBytes(ByteUtils.decodeBase36(lockShareUserKey)), i, i2, j, iBleResponse);
            return;
        }
        byte[] propLtmkBytes = BluetoothCache.getPropLtmkBytes(str);
        if (ByteUtils.isEmpty(propLtmkBytes)) {
            DeviceApi.getOwnLtmk(propDid, new BleAsyncCallback<JSONObject, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.23
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    BluetoothMyLogger.v(String.format("getOneTimePassword %s error: getOwnLtmk failed(%s)", BluetoothMyLogger.getBase64(str), bleNetError.getDetail()));
                    BluetoothApi.dispatchOneTimePasswordResult(-1, "get ltmk failed", null, iBleResponse);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(JSONObject jSONObject) {
                    String strOptString = jSONObject != null ? jSONObject.optString("key") : "";
                    if (TextUtils.isEmpty(strOptString)) {
                        BluetoothMyLogger.d("getOneTimePassword get ltmk failed");
                        BluetoothApi.dispatchOneTimePasswordResult(-1, "get ltmk failed", null, iBleResponse);
                        return;
                    }
                    BluetoothCache.setPropLtmk(str, strOptString);
                    int iOptInt = jSONObject.optInt("encrypt_type", 0);
                    if (iOptInt == 0) {
                        BluetoothApi.getOneTimePasswordUTC(ByteUtils.stringToBytes(strOptString), i, i2, j, iBleResponse);
                        return;
                    }
                    String propPincode = BluetoothCache.getPropPincode(str);
                    if (!TextUtils.isEmpty(propPincode)) {
                        BluetoothApi.getOneTimePasswordUTC(ByteUtils.stringToBytes(LtmkEncryptUtil.decryptLtmk(propPincode, strOptString, iOptInt)), i, i2, j, iBleResponse);
                    } else {
                        BluetoothMyLogger.d("getOneTimePassword pincode is empty");
                        BluetoothApi.dispatchOneTimePasswordResult(-38, "pincode is empty", null, iBleResponse);
                    }
                }
            });
            return;
        }
        int propLtmkEncryptType = BluetoothCache.getPropLtmkEncryptType(str);
        if (propLtmkEncryptType == 0) {
            getOneTimePasswordUTC(propLtmkBytes, i, i2, j, iBleResponse);
            return;
        }
        String propPincode = BluetoothCache.getPropPincode(str);
        if (!TextUtils.isEmpty(propPincode)) {
            getOneTimePasswordUTC(ByteUtils.stringToBytes(LtmkEncryptUtil.decryptLtmk(propPincode, ByteUtils.byteToString(propLtmkBytes), propLtmkEncryptType)), i, i2, j, iBleResponse);
        } else {
            BluetoothMyLogger.d("getOneTimePassword pincode is empty");
            dispatchOneTimePasswordResult(-38, "pincode is empty", null, iBleResponse);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getOneTimePasswordUTC(final byte[] bArr, final int i, final int i2, long j, final IBleResponse iBleResponse) {
        if (j > 0) {
            generateOneTimePassword(i, i2, bArr, j, iBleResponse);
        } else {
            DeviceApi.getUTCFromServer(new BleAsyncCallback<Long, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.24
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onFailure(BleNetError bleNetError) {
                    if (bleNetError != null) {
                        BluetoothApi.dispatchOneTimePasswordResult(-1, bleNetError.getDetail(), null, iBleResponse);
                    } else {
                        BluetoothApi.dispatchOneTimePasswordResult(-1, "get utc time failed", null, iBleResponse);
                    }
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                public void onSuccess(Long l) {
                    if (l == null || l.longValue() == -1) {
                        BluetoothApi.dispatchOneTimePasswordResult(-1, "get utc time failed(1)", null, iBleResponse);
                    } else {
                        BluetoothApi.generateOneTimePassword(i, i2, bArr, l.longValue(), iBleResponse);
                    }
                }
            });
        }
    }

    public static ArrayList<BtDevice> getRemoteBoundedDevices() {
        return BluetoothCache.getRemoteBoundedDevices();
    }

    public static void indication(String str, UUID uuid, UUID uuid2, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().indication(str, uuid, uuid2, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.17
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                try {
                    iBleResponse.onResponse(i, null);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void initOneTimeContextBySelf(String str, int i, int i2, final IBleResponse iBleResponse) {
        BluetoothService.getBleCoreProvider().initOneTimeContextBySelf(str, i, i2, new AsyncCallback<String, Error>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.29
            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onFailure(Error error) {
                if (iBleResponse != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString(IBluetoothService.EXTRA_MESSAGE, error.getDetail());
                        iBleResponse.onResponse(error.getCode(), bundle);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override // com.xiaomi.smarthome.frame.AsyncCallback
            public void onSuccess(String str2) {
                if (iBleResponse != null) {
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putString(IBluetoothService.EXTRA_PASSWORD_COUNT, str2);
                        iBleResponse.onResponse(0, bundle);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static boolean isBeaconProtocolSupported(int i) {
        return 5 >= i;
    }

    public static void isBleCharacterExist(String str, UUID uuid, UUID uuid2, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().isCharacterExist(str, uuid, uuid2, new BleResponse<Void>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.28
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                IBleResponse iBleResponse2 = iBleResponse;
                if (iBleResponse2 != null) {
                    try {
                        iBleResponse2.onResponse(i, new Bundle());
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    public static void isBleGatewayConnected(final String str, final IBleResponse iBleResponse) {
        if (iBleResponse == null) {
            return;
        }
        BluetoothService.getExecutorService().submit(new Runnable() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.11
            @Override // java.lang.Runnable
            public void run() {
                List<Device> deviceList = BluetoothService.getBleCoreProvider().getDeviceList();
                ArrayList arrayList = new ArrayList();
                String did = "";
                for (Device device : deviceList) {
                    if (TextUtils.equals(str, device.getMac())) {
                        did = device.getDid();
                    }
                    if (device.isOwner() && BluetoothService.getBleCoreProvider().isBluetoothGatewayDevice(device.getModel())) {
                        arrayList.add(device.getDid());
                    }
                }
                if (!TextUtils.isEmpty(did) && arrayList.size() != 0) {
                    BluetoothApi.getBleDeviceByGateway(did, arrayList, new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.11.1
                        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                        public void onFailure(BleNetError bleNetError) {
                            try {
                                iBleResponse.onResponse(-1, null);
                            } catch (RemoteException e) {
                                e.printStackTrace();
                            }
                        }

                        @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
                        public void onSuccess(Boolean bool) {
                            if (bool.booleanValue()) {
                                try {
                                    iBleResponse.onResponse(0, null);
                                    return;
                                } catch (RemoteException e) {
                                    e.printStackTrace();
                                    return;
                                }
                            }
                            try {
                                iBleResponse.onResponse(-1, null);
                            } catch (RemoteException e2) {
                                e2.printStackTrace();
                            }
                        }
                    });
                    return;
                }
                try {
                    iBleResponse.onResponse(-1, null);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void miotBleDecrypt(String str, byte[] bArr, IBleResponse iBleResponse) {
        BluetoothMyLogger.d("miotBleDecrypt mac = " + BluetoothMyLogger.getBase64(str));
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        if (propTokenBytes == null || propTokenBytes.length == 0) {
            try {
                iBleResponse.onResponse(-1, new Bundle());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            BluetoothMyLogger.d("miotBleDecrypt failed, token is empty");
            return;
        }
        byte[] bArrEncrypt = BLECipher.encrypt(propTokenBytes, bArr);
        Bundle bundle = new Bundle();
        bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArrEncrypt);
        try {
            iBleResponse.onResponse(0, bundle);
        } catch (Exception e2) {
            BluetoothLog.e(e2);
        }
    }

    public static byte[] miotBleDecryptSync(String str, byte[] bArr) {
        BluetoothMyLogger.d("miotBleDecryptSync mac = " + BluetoothMyLogger.getBase64(str));
        if (!TextUtils.isEmpty(str) && bArr != null) {
            byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
            if (propTokenBytes != null && propTokenBytes.length != 0) {
                return BLECipher.encrypt(propTokenBytes, bArr);
            }
            BluetoothMyLogger.d("miotBleDecryptSync failed, token is empty");
        }
        return null;
    }

    public static void miotBleEncrypt(String str, byte[] bArr, IBleResponse iBleResponse) {
        BluetoothMyLogger.d("miotBleEncrypt mac = " + BluetoothMyLogger.getBase64(str));
        byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
        if (propTokenBytes == null || propTokenBytes.length == 0) {
            try {
                iBleResponse.onResponse(-1, new Bundle());
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            BluetoothMyLogger.d("miotBleEncrypt failed, token is empty");
            return;
        }
        byte[] bArrEncrypt = BLECipher.encrypt(propTokenBytes, bArr);
        Bundle bundle = new Bundle();
        bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArrEncrypt);
        try {
            iBleResponse.onResponse(0, bundle);
        } catch (Exception e2) {
            BluetoothLog.e(e2);
        }
    }

    public static byte[] miotBleEncryptSync(String str, byte[] bArr) {
        BluetoothMyLogger.d("miotBleEncryptSync mac = " + BluetoothMyLogger.getBase64(str));
        if (!TextUtils.isEmpty(str) && bArr != null) {
            byte[] propTokenBytes = BluetoothCache.getPropTokenBytes(str);
            if (propTokenBytes != null && propTokenBytes.length != 0) {
                return BLECipher.encrypt(propTokenBytes, bArr);
            }
            BluetoothMyLogger.d("miotBleEncryptSync failed, token is empty");
        }
        return null;
    }

    public static void notify(String str, UUID uuid, UUID uuid2, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().notify(str, uuid, uuid2, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.16
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                try {
                    iBleResponse.onResponse(i, null);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void read(String str, UUID uuid, UUID uuid2, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().read(str, uuid, uuid2, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.7
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr) {
                Bundle bundle = new Bundle();
                bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr);
                try {
                    iBleResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void readRssi(String str, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().readRemoteRssi(str, new BleReadRssiResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.18
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Integer num) {
                Bundle bundle = new Bundle();
                bundle.putInt(IBluetoothService.EXTRA_RSSI, num.intValue());
                try {
                    iBleResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void refreshDeviceStatus(final String str, long j, final IBleResponse iBleResponse) {
        final Bundle bundle = new Bundle();
        Iterator<BluetoothSearchResult> it = BluetoothUtils.getConnectedBluetoothLeDevices().iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next().getAddress())) {
                bundle.putInt(IBluetoothService.EXTRA_DEVICE_STATUS, 16);
                dispatchDeviceStatus(bundle, iBleResponse);
                return;
            }
        }
        final BluetoothSearchRequest bluetoothSearchRequestBuild = new BluetoothSearchRequest.Builder().searchBluetoothLeDevice(1000, (int) (Math.min(Math.max(j, 5000L), 15000L) / 1000)).build();
        BluetoothSearchHelper.getInstance().startSearch(bluetoothSearchRequestBuild, new BluetoothSearchResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.22
            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchCanceled() {
                if (bundle.containsKey(IBluetoothService.EXTRA_DEVICE_STATUS)) {
                    return;
                }
                bundle.putInt(IBluetoothService.EXTRA_DEVICE_STATUS, 64);
                BluetoothApi.dispatchDeviceStatus(bundle, iBleResponse);
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStarted() {
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStopped() {
                if (bundle.containsKey(IBluetoothService.EXTRA_DEVICE_STATUS)) {
                    return;
                }
                bundle.putInt(IBluetoothService.EXTRA_DEVICE_STATUS, 64);
                BluetoothApi.dispatchDeviceStatus(bundle, iBleResponse);
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
                if (bluetoothSearchResult.getAddress().equalsIgnoreCase(str)) {
                    BluetoothRecognizer.getInstance().recognizeSync(bluetoothSearchResult);
                    bundle.putInt(IBluetoothService.EXTRA_DEVICE_STATUS, 48);
                    BluetoothApi.dispatchDeviceStatus(bundle, iBleResponse);
                    BluetoothSearchHelper.getInstance().cancelSearch(bluetoothSearchRequestBuild);
                }
            }
        });
    }

    public static void refreshGattCache(String str) {
        BleConnectManager.getInstance().refreshGattCache(str);
    }

    public static void registerBlockListener(String str, IBleResponse iBleResponse) {
        BleMessageParser.registerBlockListener(str, iBleResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void registerChannelReaderIfSupported(final String str, BleGattProfile bleGattProfile) {
        UUID uuid;
        BleGattService service;
        BluetoothLog.v(String.format("registerChannelReaderIfSupported mac = %s", str));
        if (bleGattProfile == null || (service = bleGattProfile.getService((uuid = BluetoothConstants.MISERVICE))) == null) {
            return;
        }
        UUID uuid2 = BluetoothConstants.CHARACTER_IPC;
        if (service.contains(uuid2)) {
            BleConnectManager.getInstance().notify(str, uuid, uuid2, new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.5
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    if (i == 0) {
                        IPCChannelManager.getInstance().registerChannelReader(str, BluetoothApi.sIPCChannelReader);
                    }
                }
            });
        }
    }

    public static void registerCharacterChanged(String str, UUID uuid, UUID uuid2, IBleResponse iBleResponse) {
        BleCharacterChangedManager.registerCharacterChanged(str, uuid, uuid2, iBleResponse);
    }

    public static void report(String str, String str2) {
        BluetoothService.getBleCoreProvider().reportStat(str, str2);
    }

    public static void requestMtu(String str, int i, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().requestMtu(str, i, new BleRequestMtuResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.19
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, Integer num) {
                Bundle bundle = new Bundle();
                bundle.putInt(IBluetoothService.EXTRA_MTU, num.intValue());
                try {
                    iBleResponse.onResponse(i2, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void searchBluetoothDevice(SearchRequest searchRequest, final SearchResponse searchResponse) {
        if (searchRequest == null) {
            BluetoothMyLogger.e("searchBluetoothDevice request is null");
            if (searchResponse != null) {
                try {
                    searchResponse.onSearchCanceled();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        BluetoothSearchRequest.Builder builder = new BluetoothSearchRequest.Builder();
        for (SearchTask searchTask : searchRequest.getTasks()) {
            if (searchTask.getSearchType() == 2) {
                builder.searchBluetoothLeDevice(searchTask.getSearchDuration(), searchTask.getUuids());
            } else if (searchTask.getSearchType() == 1) {
                builder.searchBluetoothClassicDevice(searchTask.getSearchDuration());
            }
        }
        BluetoothSearchHelper.getInstance().startSearch(builder.build(), new BluetoothSearchResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.2
            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchCanceled() {
                try {
                    searchResponse.onSearchCanceled();
                } catch (Exception e2) {
                    BluetoothLog.e(e2);
                }
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStarted() {
                try {
                    searchResponse.onSearchStarted();
                } catch (Exception e2) {
                    BluetoothLog.e(e2);
                }
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onSearchStopped() {
                try {
                    searchResponse.onSearchStopped();
                } catch (Exception e2) {
                    BluetoothLog.e(e2);
                }
            }

            @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
            public void onDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
                try {
                    searchResponse.onDeviceFounded(new SearchResult(bluetoothSearchResult));
                } catch (Exception e2) {
                    BluetoothLog.e(e2);
                }
            }
        });
    }

    public static void securityChipDecrypt(final String str, byte[] bArr, final IBleResponse iBleResponse) {
        BluetoothMyLogger.d("securityChipDecrypt mac = " + BluetoothMyLogger.getBase64(str));
        BleSecurityChipEncrypt.decrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.9
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr2) {
                BluetoothMyLogger.d("securityChipDecrypt mac = " + BluetoothMyLogger.getBase64(str) + ", code = " + i);
                Bundle bundle = new Bundle();
                bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr2);
                try {
                    iBleResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void securityChipEncrypt(final String str, byte[] bArr, final IBleResponse iBleResponse) {
        BluetoothMyLogger.d("securityChipEncrypt mac = " + BluetoothMyLogger.getBase64(str));
        BleSecurityChipEncrypt.encrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.8
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr2) {
                BluetoothMyLogger.d("securityChipEncrypt mac = " + BluetoothMyLogger.getBase64(str) + ", code = " + i);
                Bundle bundle = new Bundle();
                bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr2);
                try {
                    iBleResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void securityChipOperate(final String str, int i, final IBleResponse iBleResponse) {
        BluetoothMyLogger.d("securityChipOperate mac = " + BluetoothMyLogger.getBase64(str) + ", operator = " + i);
        BleSecurityChipOperate.operate(str, i, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.10
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i2, byte[] bArr) {
                BluetoothMyLogger.d("securityChipOperate mac = " + BluetoothMyLogger.getBase64(str) + ", code = " + i2);
                Bundle bundle = new Bundle();
                bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr);
                try {
                    iBleResponse.onResponse(i2, bundle);
                } catch (RemoteException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void standardAuthDecrypt(final String str, byte[] bArr, final IBleResponse iBleResponse) {
        BluetoothMyLogger.d("standardAuthDecrypt mac = " + BluetoothMyLogger.getBase64(str));
        BleSecurityChipEncrypt.decrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.21
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr2) {
                BluetoothMyLogger.d("standardAuthDecrypt mac = " + BluetoothMyLogger.getBase64(str) + ", code = " + i);
                Bundle bundle = new Bundle();
                bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr2);
                try {
                    iBleResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void standardAuthEncrypt(final String str, byte[] bArr, final IBleResponse iBleResponse) {
        BluetoothMyLogger.d("standardAuthEncrypt mac = " + BluetoothMyLogger.getBase64(str));
        BleSecurityChipEncrypt.encrypt(str, bArr, new BleReadResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.20
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, byte[] bArr2) {
                BluetoothMyLogger.d("standardAuthEncrypt mac = " + BluetoothMyLogger.getBase64(str) + ", code = " + i);
                Bundle bundle = new Bundle();
                bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr2);
                try {
                    iBleResponse.onResponse(i, bundle);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void unBindDevice(String str) {
        if (TextUtils.isEmpty(str) || !MiuiSDKHelper.getInstance().unbindDevice(str)) {
            return;
        }
        BluetoothCache.setPropExtra(str, BtConstants.KEY_MIUI_BIND, false);
    }

    public static void unindication(String str, UUID uuid, UUID uuid2) {
        BleConnectManager.getInstance().unindication(str, uuid, uuid2);
    }

    public static void unnotify(String str, UUID uuid, UUID uuid2) {
        BleConnectManager.getInstance().unnotify(str, uuid, uuid2);
    }

    public static void unregisterBlockListener(String str) {
        BleMessageParser.unregisterBlockListener(str);
    }

    public static void unregisterCharacterChanged(String str, UUID uuid, UUID uuid2) {
        BleCharacterChangedManager.unregisterCharacterChanged(str, uuid, uuid2);
    }

    public static void write(String str, UUID uuid, UUID uuid2, byte[] bArr, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().write(str, uuid, uuid2, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.14
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                try {
                    iBleResponse.onResponse(i, null);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void writeBlock(String str, byte[] bArr, IBleResponse iBleResponse) {
        IPCChannelManager.getInstance().writeBlock(str, bArr, iBleResponse);
    }

    public static void writeNoRsp(String str, UUID uuid, UUID uuid2, byte[] bArr, final IBleResponse iBleResponse) {
        BleConnectManager.getInstance().writeNoRsp(str, uuid, uuid2, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.15
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                try {
                    iBleResponse.onResponse(i, null);
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void connect(final String str, BleConnectOptions bleConnectOptions, final BleConnectResponse bleConnectResponse) {
        BluetoothMyLogger.d("connect mac = " + BluetoothMyLogger.getBase64(str));
        BleConnectManager.getInstance().connect(str, bleConnectOptions, new BleConnectResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi.4
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Bundle bundle) {
                BluetoothMyLogger.d("connect mac = " + BluetoothMyLogger.getBase64(str) + ", code = " + i);
                try {
                    BleGattProfile bleGattProfile = (BleGattProfile) bundle.getParcelable("key_gatt_profile");
                    if (bleGattProfile != null) {
                        BluetoothCache.setPropGattProfile(str, bleGattProfile);
                    }
                    BluetoothApi.registerChannelReaderIfSupported(str, bleGattProfile);
                    BleConnectResponse bleConnectResponse2 = bleConnectResponse;
                    if (bleConnectResponse2 != null) {
                        bleConnectResponse2.onResponse(i, bundle);
                    }
                } catch (Exception e) {
                    BluetoothLog.e(e);
                }
            }
        });
    }

    public static void disconnect(String str, long j) {
        if (j < 0) {
            j = 0;
        }
        if (j == 0) {
            disconnect(str);
            return;
        }
        Message messageObtainMessage = mHandler.obtainMessage(2);
        Bundle bundle = new Bundle();
        bundle.putString(IBluetoothService.EXTRA_MAC, str);
        bundle.putLong(IBluetoothService.EXTRA_DELAY, j);
        messageObtainMessage.setData(bundle);
        mHandler.sendMessage(messageObtainMessage);
        if (mHandler.hasMessages(1)) {
            return;
        }
        mHandler.sendEmptyMessage(1);
    }
}
