package com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.IBleDeviceLauncher;
import com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.utils.SecurityChipUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import com.xiaomi.smarthome.library.bluetooth.connect.Code;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleNotifyResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleWriteResponse;
import com.xiaomi.smarthome.library.common.util.ByteUtils;
import com.xiaomi.smarthome.library.crypto.Base64Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.report.IReportCoreProvider;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleMeshRegisterConnector extends BleSecurityChipConnector {
    private static final int MSG_NOTIFY_TIMEOUT = 4101;
    private static final String TAG = "BleMeshRegisterConnector";
    private int mDefaultFailedCode;
    private byte[] mDevCertRaw;
    private byte[] mDevInfo;
    private byte[] mDevPub;
    private String mDid;
    private byte[] mGattLtmk;
    private byte[] mManuId;
    private byte[] mMeshAppKey;
    private byte[] mMeshDevKey;
    public Map<Integer, List<Integer>> mMeshElementMap;
    private int mMeshIvIndex;
    private byte[] mMeshNetKey;
    private String mMeshStaticOOB;
    private int mMeshUnicastAddress;
    private String mServerCert;
    private String mServerPub;
    private String mServerSign;
    private static final byte[] MESH_REG_START = {64, 0, 0, 0};
    private static final byte[] MESH_REG_SUCCESS = {HMProSyncDataBaseProfile.DATA_LOW_OSA_NOTIFICATION, 0, 0, 0};
    private static final byte[] MESH_REG_FAILED = {66, 0, 0, 0};
    private static final byte[] MESH_REG_VERIFY_SUCCESS = {67, 0, 0, 0};
    private static final byte[] MESH_REG_S_CERT_INVALID = {68, 0, 0, 0};
    private static final byte[] MESH_REG_S_PUBKEY_INVALID = {69, 0, 0, 0};
    private static final byte[] MESH_REG_S_SIGN_INVALID = {70, 0, 0, 0};
    private static final byte[] MESH_REG_D_CERT_INVALID = {71, 0, 0, 0};
    private static final byte[] MESH_REG_D_PUBKEY_INVALID = {72, 0, 0, 0};
    private static final byte[] MESH_REG_D_SIGN_INVALID = {73, 0, 0, 0};
    private static final byte[] ERR_REGISTERED = {-31, 0, 0, 0};

    public BleMeshRegisterConnector(IBleDeviceLauncher iBleDeviceLauncher) {
        super(iBleDeviceLauncher);
        this.mMeshIvIndex = 0;
        this.mMeshElementMap = new LinkedHashMap();
        this.mDefaultFailedCode = -7;
    }

    public static final byte[] generateRandomNumber() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private int getBindModelCount() {
        Iterator<Map.Entry<Integer, List<Integer>>> it = this.mMeshElementMap.entrySet().iterator();
        int size = 0;
        while (it.hasNext()) {
            size += it.next().getValue().size();
        }
        return size;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMeshProvisionCtrInfo() {
        BluetoothService.getReportCoreProvider().startAction(31);
        DeviceApi.queryBleMeshCtlInfo(new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.10
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(31, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(31, 11);
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        String strOptString = jSONObject.optString("iv_index");
                        BleMeshRegisterConnector.this.mMeshIvIndex = Integer.parseInt(strOptString, 16);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("primary_netkey");
                    if (jSONObjectOptJSONObject != null) {
                        BleMeshRegisterConnector.this.mMeshNetKey = ByteUtils.stringToBytes(jSONObjectOptJSONObject.optString("key"));
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("ctl_appkey");
                    if (jSONObjectOptJSONObject2 != null) {
                        BleMeshRegisterConnector.this.mMeshAppKey = ByteUtils.stringToBytes(jSONObjectOptJSONObject2.optString("key"));
                    }
                    if (BleMeshRegisterConnector.this.mMeshNetKey != null && BleMeshRegisterConnector.this.mMeshAppKey != null) {
                        BluetoothService.getReportCoreProvider().finishAction(31);
                        BleMeshRegisterConnector.this.getMeshProvisionModelInfo();
                        return;
                    }
                    BluetoothService.getReportCoreProvider().addContextByActionCode(31, "netKey", ByteUtils.byteToString(BleMeshRegisterConnector.this.mMeshNetKey));
                    BluetoothService.getReportCoreProvider().addContextByActionCode(31, "appKey", ByteUtils.byteToString(BleMeshRegisterConnector.this.mMeshAppKey));
                    BluetoothService.getReportCoreProvider().finishAction(31, 11);
                    BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                    BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMeshProvisionModelInfo() {
        int propProductId = BluetoothCache.getPropProductId(getMac());
        BluetoothService.getReportCoreProvider().startAction(34);
        DeviceApi.queryBleMeshModelInfo(propProductId, new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.11
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(34, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(34, 11);
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str) {
                try {
                    JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("elements");
                    if (jSONArrayOptJSONArray != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                            if (jSONObjectOptJSONObject != null) {
                                int iOptInt = jSONObjectOptJSONObject.optInt("num");
                                ArrayList arrayList = new ArrayList();
                                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("model_id");
                                if (jSONArrayOptJSONArray2 != null) {
                                    for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                        try {
                                            arrayList.add(Integer.valueOf(Integer.parseInt(jSONArrayOptJSONArray2.optString(i2), 16)));
                                        } catch (NumberFormatException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                }
                                BleMeshRegisterConnector.this.mMeshElementMap.put(Integer.valueOf(iOptInt), arrayList);
                            }
                        }
                    }
                    if (BleMeshRegisterConnector.this.mMeshElementMap != null) {
                        BluetoothService.getReportCoreProvider().finishAction(34);
                        BleMeshRegisterConnector.this.sendMeshProvisionInfoToDevice();
                    } else {
                        BluetoothService.getReportCoreProvider().addContextByActionCode(34, "msg", str);
                        BluetoothService.getReportCoreProvider().finishAction(34, 11);
                        BleMeshRegisterConnector.this.mDefaultFailedCode = -44;
                        BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_FAILED);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    public static byte[] getSHA2Digest(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    private void processDeviceNotify(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleMeshRegisterConnector Process Step 10 ..., value = " + ByteUtils.byteToString(bArr));
        BluetoothService.getReportCoreProvider().addContextByActionCode(14, "data", ByteUtils.byteToString(bArr));
        this.mHandler.removeMessages(4101);
        if (ByteUtils.equals(bArr, MESH_REG_SUCCESS)) {
            BluetoothService.getReportCoreProvider().finishAction(14, 0);
            sendMeshProvisionSuccessToServer();
            return;
        }
        if (ByteUtils.equals(bArr, MESH_REG_S_CERT_INVALID)) {
            BluetoothService.getReportCoreProvider().finishAction(14, 13);
            dispatchResult(-41);
            return;
        }
        if (ByteUtils.equals(bArr, MESH_REG_S_SIGN_INVALID)) {
            BluetoothService.getReportCoreProvider().finishAction(14, 13);
            dispatchResult(-42);
        } else if (ByteUtils.equals(bArr, MESH_REG_S_PUBKEY_INVALID)) {
            BluetoothService.getReportCoreProvider().finishAction(14, 13);
            dispatchResult(-43);
        } else if (ByteUtils.equals(bArr, ERR_REGISTERED)) {
            BluetoothService.getReportCoreProvider().finishAction(14, 13);
            dispatchResult(-17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep1Plus() {
        if (isCanceled()) {
            dispatchResult(-2);
        } else {
            BluetoothMyLogger.v("BleMeshRegisterConnector Process Step 1 plus ...");
            openAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.2
                @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
                public void onResponse(int i, Void r3) {
                    BluetoothMyLogger.v("BleMeshRegisterConnector Step 1 plus onResponse: " + Code.toString(i));
                    if (i == 0) {
                        BleMeshRegisterConnector.this.processStep2();
                    } else {
                        BleMeshRegisterConnector.this.dispatchResult(-27);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStep2() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleMeshRegisterConnector Process Step 2 ...");
        BluetoothService.getReportCoreProvider().startAction(4);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_AUTH;
        reportCoreProvider.addContextByActionCode(4, "char", uuid.toString());
        IReportCoreProvider reportCoreProvider2 = BluetoothService.getReportCoreProvider();
        byte[] bArr = MESH_REG_START;
        reportCoreProvider2.addContextByActionCode(4, "data", ByteUtils.byteToString(bArr));
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, uuid, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.3
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("BleMeshRegisterConnector Step 2 onResponse: " + Code.toString(i));
                if (i != 0) {
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                    return;
                }
                ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.removeMessages(4101);
                BluetoothService.getReportCoreProvider().startAction(24);
                ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4101, 15000L);
            }
        });
    }

    private void recvDeviceCert(byte[] bArr) {
        BluetoothMyLogger.v("BleMeshRegisterConnector Process recvDeviceCert ...");
        this.mDevCertRaw = Arrays.copyOf(bArr, bArr.length);
        BluetoothService.getReportCoreProvider().addContextByActionCode(24, "data", ByteUtils.byteToString(bArr));
        BluetoothService.getReportCoreProvider().finishAction(24, 0);
        this.mHandler.removeMessages(4101);
        BluetoothService.getReportCoreProvider().startAction(17);
        this.mHandler.sendEmptyMessageDelayed(4101, 15000L);
    }

    private void recvDevicePub(byte[] bArr) {
        BluetoothMyLogger.v("BleMeshRegisterConnector Process recvDevicePub ...");
        BluetoothService.getReportCoreProvider().addContextByActionCode(17, "data", ByteUtils.byteToString(bArr));
        BluetoothService.getReportCoreProvider().finishAction(17, 0);
        this.mDevInfo = Arrays.copyOfRange(bArr, 0, 12);
        this.mManuId = Arrays.copyOfRange(bArr, 12, 20);
        this.mDevPub = Arrays.copyOfRange(bArr, 20, 84);
        this.mHandler.removeMessages(4101);
        sendDeviceCertToServer();
    }

    private void recvDeviceSign(byte[] bArr) {
        BluetoothMyLogger.v("BleMeshRegisterConnector Process recvDeviceSign ...");
        this.mHandler.removeMessages(4101);
        BluetoothService.getReportCoreProvider().addContextByActionCode(29, "data", ByteUtils.byteToString(bArr));
        BluetoothService.getReportCoreProvider().finishAction(29);
        sendDeviceSignToServer(bArr);
    }

    private void sendDeviceCertToServer() {
        int propProductId = BluetoothCache.getPropProductId(getMac());
        String strEncodeBytes = Base64Coder.encodeBytes(this.mDevCertRaw, 24);
        String strEncodeBytes2 = Base64Coder.encodeBytes(this.mDevPub, 24);
        BluetoothService.getReportCoreProvider().startAction(25);
        DeviceApi.authBleMesh(propProductId, strEncodeBytes2, ByteUtils.byteToStringLittleEndian(this.mManuId), strEncodeBytes, ByteUtils.byteToString(this.mDevInfo), "123456", new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.4
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BleMeshRegisterConnector.this.mDefaultFailedCode = -39;
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(26, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(26, 11);
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_CERT_INVALID);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    BleMeshRegisterConnector.this.mServerSign = jSONObject.optString("sign");
                    BleMeshRegisterConnector.this.mServerPub = jSONObject.optString("pub");
                    BleMeshRegisterConnector.this.mServerCert = jSONObject.optString("server_cert");
                    jSONObject.optString("code");
                    BleMeshRegisterConnector.this.mDid = jSONObject.optString("did");
                    if (TextUtils.isEmpty(BleMeshRegisterConnector.this.mServerSign) || TextUtils.isEmpty(BleMeshRegisterConnector.this.mServerPub) || TextUtils.isEmpty(BleMeshRegisterConnector.this.mServerCert) || TextUtils.isEmpty(BleMeshRegisterConnector.this.mDid)) {
                        HashMap map = new HashMap();
                        map.put("sign", BleMeshRegisterConnector.this.mServerSign);
                        map.put("pub", BleMeshRegisterConnector.this.mServerPub);
                        map.put("server_cert", BleMeshRegisterConnector.this.mServerCert);
                        map.put("did", BleMeshRegisterConnector.this.mDid);
                        BluetoothService.getReportCoreProvider().finishCurrentActionWithContext(10, map);
                        BleMeshRegisterConnector.this.mDefaultFailedCode = -39;
                        BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_CERT_INVALID);
                    } else {
                        BluetoothService.getReportCoreProvider().finishAction(25);
                        BleMeshRegisterConnector.this.sendServerCertToDevice();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void sendDeviceSignToServer(byte[] bArr) {
        int propProductId = BluetoothCache.getPropProductId(getMac());
        String strEncodeBytes = Base64Coder.encodeBytes(bArr, 24);
        BluetoothService.getReportCoreProvider().startAction(30);
        DeviceApi.bindBleMesh(propProductId, getMac(), strEncodeBytes, this.mDid, "", new BleAsyncCallback<String, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.8
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                BleMeshRegisterConnector.this.mDefaultFailedCode = -40;
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(30, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(30, 11);
                BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_SIGN_INVALID);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(String str) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    BleMeshRegisterConnector.this.mMeshStaticOOB = jSONObject.optString("static_oob");
                    String strOptString = jSONObject.optString("gatt_ltmk");
                    BleMeshRegisterConnector.this.mMeshUnicastAddress = jSONObject.optInt(Home.JSON_KEY_ADDRESS);
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("appkey");
                    if (jSONObjectOptJSONObject != null) {
                        jSONObjectOptJSONObject.optString("key");
                        jSONObjectOptJSONObject.optString("appkey_id");
                    }
                    if (TextUtils.isEmpty(strOptString)) {
                        BluetoothService.getReportCoreProvider().addContextByActionCode(30, "msg", "gatt LTMK is empty");
                        BluetoothService.getReportCoreProvider().finishAction(30, 11);
                        BleMeshRegisterConnector.this.mDefaultFailedCode = -40;
                        BleMeshRegisterConnector.this.sendErrorCodeToDevice(BleMeshRegisterConnector.MESH_REG_D_SIGN_INVALID);
                        return;
                    }
                    BluetoothCache.setPropMeshBindInfo(BleMeshRegisterConnector.this.getMac(), str);
                    BluetoothService.getReportCoreProvider().finishAction(30);
                    BleMeshRegisterConnector.this.mGattLtmk = Base64Coder.decode(strOptString, 24);
                    BleMeshRegisterConnector.this.sendRegVerifySuccessToDevice();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendErrorCodeToDevice(byte[] bArr) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothService.getReportCoreProvider().startAction(13);
        BluetoothService.getReportCoreProvider().addContextByActionCode(13, "data", ByteUtils.byteToString(bArr));
        BluetoothMyLogger.v("BleMeshRegisterConnector, sendErrorCodeToDevice errorCode = " + ByteUtils.byteToString(bArr));
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_AUTH, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.13
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("BleMeshRegisterConnector sendErrorCodeToDevice onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(13, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(13, 2);
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(13);
                    ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.removeMessages(4101);
                    BluetoothService.getReportCoreProvider().startAction(14);
                    ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4101, 15000L);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMeshProvisionInfoToDevice() {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(1024).order(ByteOrder.LITTLE_ENDIAN);
        this.mMeshDevKey = generateRandomNumber();
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.put((byte) 16);
        byteBufferOrder.put(this.mMeshDevKey);
        byteBufferOrder.put((byte) 2);
        byteBufferOrder.put((byte) 25);
        byteBufferOrder.put(this.mMeshNetKey);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putInt(this.mMeshIvIndex);
        byteBufferOrder.putShort((short) this.mMeshUnicastAddress);
        byteBufferOrder.put((byte) 3);
        byteBufferOrder.put((byte) 20);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.putShort((short) 0);
        byteBufferOrder.put(this.mMeshAppKey);
        byteBufferOrder.put((byte) 4);
        int bindModelCount = getBindModelCount();
        byteBufferOrder.put((byte) (bindModelCount * 8));
        if (bindModelCount != 0) {
            for (Map.Entry<Integer, List<Integer>> entry : this.mMeshElementMap.entrySet()) {
                Integer key = entry.getKey();
                for (Integer num : entry.getValue()) {
                    byteBufferOrder.putShort(key.shortValue());
                    Integer numValueOf = Integer.valueOf(num.intValue() >> 16);
                    Integer numValueOf2 = Integer.valueOf(num.intValue() & 65535);
                    byteBufferOrder.putShort(numValueOf.shortValue());
                    byteBufferOrder.putShort(numValueOf2.shortValue());
                    byteBufferOrder.putShort((short) 0);
                }
            }
        }
        int iPosition = byteBufferOrder.position();
        byte[] bArr = new byte[iPosition];
        System.arraycopy(byteBufferOrder.array(), 0, bArr, 0, iPosition);
        byte[] bArrStringToBytes = ByteUtils.stringToBytes(this.mMeshStaticOOB);
        byte[] bArr2 = new byte[8];
        System.arraycopy(bArrStringToBytes, 0, bArr2, 0, 8);
        byte[] bArrAESEncrypt = SecurityChipUtil.AESEncrypt(bArrStringToBytes, bArr2, bArr);
        BluetoothService.getReportCoreProvider().startAction(35);
        if (writeChannel(bArrAESEncrypt, 9, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.12
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleMeshRegisterConnector sendMeshProvisionInfoToDevice onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(35, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(35, 2);
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(35);
                    ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.removeMessages(4101);
                    BluetoothService.getReportCoreProvider().startAction(14);
                    ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4101, 20000L);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(35, 2);
        dispatchResult(-28);
    }

    private void sendMeshProvisionSuccessToServer() {
        String lowerCase = ByteUtils.byteToString(getSHA2Digest(ByteUtils.stringToBytes(this.mMeshStaticOOB))).toLowerCase();
        BluetoothService.getReportCoreProvider().startAction(36);
        DeviceApi.sendBleMeshProvisionResult(true, this.mDid, ByteUtils.byteToString(this.mMeshDevKey), lowerCase.substring(0, 32), new BleAsyncCallback<Boolean, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.14
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onFailure(BleNetError bleNetError) {
                if (bleNetError != null) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(36, "msg", bleNetError.toString());
                }
                BluetoothService.getReportCoreProvider().finishAction(36, 11);
                BleMeshRegisterConnector.this.dispatchResult(-45);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    BluetoothService.getReportCoreProvider().finishAction(36);
                    BleMeshRegisterConnector.this.dispatchResult(0);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(36, 11);
                    BleMeshRegisterConnector.this.dispatchResult(-45);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRegVerifySuccessToDevice() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothService.getReportCoreProvider().startAction(13);
        IReportCoreProvider reportCoreProvider = BluetoothService.getReportCoreProvider();
        UUID uuid = BluetoothConstants.CHARACTER_AUTH;
        reportCoreProvider.addContextByActionCode(13, "char", uuid.toString());
        IReportCoreProvider reportCoreProvider2 = BluetoothService.getReportCoreProvider();
        byte[] bArr = MESH_REG_VERIFY_SUCCESS;
        reportCoreProvider2.addContextByActionCode(13, "data", ByteUtils.byteToString(bArr));
        BluetoothMyLogger.v("BleMeshRegisterConnector, sendRegVerifySuccessToDevice");
        BleConnectManager.getInstance().writeNoRsp(getMac(), BluetoothConstants.MISERVICE, uuid, bArr, new BleWriteResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.9
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r4) {
                BluetoothMyLogger.v("BleMeshRegisterConnector sendRegVerifySuccessToDevice onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(13);
                    BleMeshRegisterConnector.this.getMeshProvisionCtrInfo();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(13, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(13, 2);
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendServerCertToDevice() {
        BluetoothService.getReportCoreProvider().startAction(26);
        if (writeChannel(Base64Coder.decode(this.mServerCert, 24), 7, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.5
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleMeshRegisterConnector Step 3 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(26);
                    BleMeshRegisterConnector.this.sendServerPubToDevice();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(26, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(26, 2);
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(26, 2);
        dispatchResult(-28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendServerPubToDevice() {
        BluetoothService.getReportCoreProvider().startAction(27);
        if (writeChannel(Base64Coder.decode(this.mServerPub, 24), 3, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.6
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleMeshRegisterConnector Step 4 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BluetoothService.getReportCoreProvider().finishAction(27);
                    BleMeshRegisterConnector.this.sendServerSignToDevice();
                } else {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(27, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(27, 2);
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(27, 2);
        dispatchResult(-28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendServerSignToDevice() {
        BluetoothService.getReportCoreProvider().startAction(28);
        if (writeChannel(Base64Coder.decode(this.mServerSign, 24), 8, new IBleResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.7
            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
            public void onResponse(int i, Bundle bundle) throws RemoteException {
                BluetoothMyLogger.v("BleMeshRegisterConnector Step 5 onResponse: " + Code.toString(i));
                if (i != 0) {
                    BluetoothService.getReportCoreProvider().addContextByActionCode(28, "error_code", String.valueOf(i));
                    BluetoothService.getReportCoreProvider().finishAction(28, 2);
                    BleMeshRegisterConnector.this.dispatchResult(-28);
                } else {
                    BluetoothService.getReportCoreProvider().finishAction(28);
                    ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.removeMessages(4101);
                    BluetoothService.getReportCoreProvider().startAction(29);
                    ((BleSecurityConnector) BleMeshRegisterConnector.this).mHandler.sendEmptyMessageDelayed(4101, 20000L);
                }
            }
        })) {
            return;
        }
        BluetoothService.getReportCoreProvider().finishAction(28, 2);
        dispatchResult(-28);
    }

    public String getDeviceDid() {
        return this.mDid;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public byte[] getGeneratedToken() {
        return null;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector
    public boolean isMeshDevice() {
        return true;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector
    public void onChannelRead(byte[] bArr, int i) {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        if (i == 1) {
            recvDeviceCert(bArr);
        } else if (i == 3) {
            recvDevicePub(bArr);
        } else {
            if (i != 4) {
                return;
            }
            recvDeviceSign(bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processHandlerMessage(Message message) {
        if (message.what != 4101) {
            return;
        }
        BluetoothMyLogger.w("BleMeshRegisterConnector notify timeout");
        BluetoothService.getReportCoreProvider().finishCurrentActionWithResult(8);
        dispatchResult(this.mDefaultFailedCode);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleSecurityChipConnector, com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processNotify(UUID uuid, UUID uuid2, byte[] bArr) {
        UUID uuid3 = BluetoothConstants.MISERVICE;
        if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_AUTH)) {
            processDeviceNotify(bArr);
        } else if (uuid.equals(uuid3) && uuid2.equals(BluetoothConstants.CHARACTER_SECURE_AUTH)) {
            super.processNotify(uuid, uuid2, bArr);
        }
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.security.BleSecurityConnector
    public void processStep1() {
        if (isCanceled()) {
            dispatchResult(-2);
            return;
        }
        BluetoothMyLogger.v("BleMeshRegisterConnector Process Step 1 ...");
        BluetoothCache.setPropSessionKeyBytes(getMac(), "".getBytes());
        openSecureAuthNotify(new BleNotifyResponse() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.securitychipauth.BleMeshRegisterConnector.1
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, Void r3) {
                BluetoothMyLogger.v("BleMeshRegisterConnector Step 1 onResponse: " + Code.toString(i));
                if (i == 0) {
                    BleMeshRegisterConnector.this.processStep1Plus();
                } else {
                    BleMeshRegisterConnector.this.dispatchResult(-27);
                }
            }
        });
    }
}
