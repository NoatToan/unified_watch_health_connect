package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.bluetooth.IBleChannelWriter;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleKeyValuePair;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class BleMessageParser {
    public static final byte CHANNEL_VERSION = 1;
    public static final byte COMPRESS_GZIP = 1;
    public static final byte COMPRESS_NONE = 0;
    public static final byte DEVICE_PROP_MSG_TYPE = 2;
    public static final byte ECHO_MSG_TYPE = 4;
    public static final byte ENCRYPTION_NONE = 0;
    public static final int HEADER_SIZE = 5;
    public static final byte RESULT_FAIL = 0;
    public static final byte RESULT_OK = 1;
    public static final byte RPC_MSG_TYPE = 1;
    public static final byte UNKNOWN_MSG_TYPE = 0;
    public static final byte WRITE_BLOCK_MSG_TYPE = 3;
    private static Map<String, IBleResponse> sBlockBleListenerMap = new ConcurrentHashMap();

    public static byte[] build(MiBTChannelData miBTChannelData, boolean z) {
        byte[] byteArray = miBTChannelData.data;
        if (z && miBTChannelData.data != null && miBTChannelData.data.length > 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(miBTChannelData.data);
                gZIPOutputStream.finish();
                gZIPOutputStream.close();
                byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(byteArray != null ? byteArray.length + 5 : 5).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) 1);
        byteBufferOrder.putShort(miBTChannelData.id);
        byteBufferOrder.put((byte) (miBTChannelData.getResult() | (miBTChannelData.getType() << 4)));
        byteBufferOrder.put((byte) ((z ? 1 : 0) << 5));
        if (byteArray != null) {
            byteBufferOrder.put(byteArray);
        }
        return byteBufferOrder.array();
    }

    private static void doEcho(short s, byte[] bArr, IBleChannelWriter iBleChannelWriter) {
        onResult((byte) 4, s, true, bArr, iBleChannelWriter);
    }

    public static void doRpc(final short s, JSONObject jSONObject, final IBleChannelWriter iBleChannelWriter) {
        Object obj;
        Object jSONArray;
        if (jSONObject == null) {
            BluetoothMyLogger.e("doRpc failure, jsonObject is null");
            onResult((byte) 1, s, false, null, iBleChannelWriter);
            return;
        }
        String strOptString = jSONObject.optString("did");
        String strOptString2 = jSONObject.optString("method");
        String strOptString3 = jSONObject.optString("params");
        if (TextUtils.isEmpty(strOptString3)) {
            obj = "";
        } else {
            String strSubstring = strOptString3.substring(0, 1);
            if (TextUtils.equals(strSubstring, "[")) {
                try {
                    jSONArray = new JSONArray(strOptString3);
                    obj = jSONArray;
                } catch (JSONException e) {
                    e.printStackTrace();
                    obj = "";
                }
            } else if (TextUtils.equals(strSubstring, "{")) {
                try {
                    obj = strOptString3;
                    jSONArray = new JSONObject(strOptString3);
                    obj = jSONArray;
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    obj = "";
                }
            }
        }
        obj = strOptString3;
        Device deviceByDid = BluetoothService.getBleCoreProvider().getDeviceByDid(strOptString);
        if (deviceByDid == null) {
            BluetoothMyLogger.e("doRpc failure, device is null");
            onResult((byte) 1, s, false, null, iBleChannelWriter);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", (int) ((Math.random() * 100000.0d) + 100000.0d));
            jSONObject2.put("method", strOptString2);
            jSONObject2.put("params", obj);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        BluetoothService.getBleCoreProvider().rpcAsync(strOptString, deviceByDid.getToken(), jSONObject2.toString(), new BleRpcCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BleMessageParser.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback
            public void onFailure(int i) {
                BluetoothMyLogger.e("doRpc failure, shError = " + i);
                BleMessageParser.onResult((byte) 1, s, false, null, iBleChannelWriter);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback
            public void onSuccess(String str) {
                BleMessageParser.onResult((byte) 1, s, true, str != null ? str.getBytes() : null, true, iBleChannelWriter);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleRpcCallback
            public void onFailure(int i, Object obj2) {
                BluetoothMyLogger.e("doRpc failure, shError = " + i + ", errorInfo = " + obj2.toString());
                BleMessageParser.onResult((byte) 1, s, false, obj2.toString() != null ? obj2.toString().getBytes() : null, iBleChannelWriter);
            }
        });
    }

    private static void getDeviceProp(final short s, final JSONArray jSONArray, final IBleChannelWriter iBleChannelWriter) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            BluetoothMyLogger.e("getDeviceProp failure, jsonArray is null");
            onResult((byte) 2, s, false, null, iBleChannelWriter);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BleKeyValuePair("data", jSONArray.toString()));
            BluetoothService.getBleCoreProvider().sendSmartHomeRequest(new BleNetRequest.Builder().method("POST").path("/device/batchdevicedatas").addQueries(arrayList).build(), new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BleMessageParser.2
                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
                public void onFailed(int i, String str) {
                    BluetoothMyLogger.e("getDeviceProp failure, " + str);
                    BleMessageParser.onResult((byte) 2, s, false, str != null ? str.getBytes() : null, iBleChannelWriter);
                }

                @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
                public void onSuccess(String str) {
                    Object objOptJSONObject;
                    try {
                        objOptJSONObject = new JSONObject(str).optJSONObject("result");
                    } catch (JSONException e) {
                        e.printStackTrace();
                        objOptJSONObject = null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("props", objOptJSONObject);
                        JSONObject jSONObject2 = new JSONObject();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                                if (jSONObjectOptJSONObject != null) {
                                    String strOptString = jSONObjectOptJSONObject.optString("did");
                                    if (!TextUtils.isEmpty(strOptString)) {
                                        Device deviceByDid = BluetoothService.getBleCoreProvider().getDeviceByDid(strOptString);
                                        if (deviceByDid != null) {
                                            jSONObject2.put(strOptString, deviceByDid.isOnline() ? 1 : 0);
                                        } else {
                                            jSONObject2.put(strOptString, 0);
                                        }
                                    }
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                        }
                        jSONObject.put("onlines", jSONObject2);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                    BleMessageParser.onResult((byte) 2, s, true, jSONObject.toString().getBytes(), iBleChannelWriter);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onResult(byte b2, short s, boolean z, byte[] bArr, IBleChannelWriter iBleChannelWriter) {
        onResult(b2, s, z, bArr, false, iBleChannelWriter);
    }

    private static MiBTChannelData parse(byte[] bArr) {
        if (bArr == null || bArr.length < 5) {
            BluetoothMyLogger.v("MiBTChannelUtil parse data invalid");
            return null;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.get();
        short s = byteBufferOrder.getShort();
        byte b2 = byteBufferOrder.get();
        byte b3 = byteBufferOrder.get();
        byte[] byteArray = new byte[0];
        if (bArr.length > 5) {
            byteArray = Arrays.copyOfRange(bArr, 5, bArr.length);
        }
        byte b4 = (byte) (b2 & 15);
        byte b5 = (byte) ((b2 & 255) >> 4);
        if (((byte) ((b3 & 255) >> 5)) == 1 && byteArray.length > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                byte[] bArr2 = new byte[256];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
                byteArray = byteArrayOutputStream.toByteArray();
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new MiBTChannelData(s, b5, b4, byteArray);
    }

    public static void parseMessage(String str, byte[] bArr, IBleChannelWriter iBleChannelWriter) {
        MiBTChannelData miBTChannelData = parse(bArr);
        if (miBTChannelData == null) {
            return;
        }
        byte type = miBTChannelData.getType();
        JSONObject jSONObject = null;
        JSONArray jSONArray = null;
        if (type == 1) {
            try {
                jSONObject = new JSONObject(new String(miBTChannelData.getData()));
            } catch (Exception unused) {
            }
            doRpc(miBTChannelData.getId(), jSONObject, iBleChannelWriter);
        } else if (type == 2) {
            try {
                jSONArray = new JSONArray(new String(miBTChannelData.getData()));
            } catch (Exception unused2) {
            }
            getDeviceProp(miBTChannelData.getId(), jSONArray, iBleChannelWriter);
        } else if (type == 3) {
            writeBlock(str, miBTChannelData.getData());
        } else {
            if (type != 4) {
                return;
            }
            doEcho(miBTChannelData.getId(), miBTChannelData.getData(), iBleChannelWriter);
        }
    }

    public static void registerBlockListener(String str, IBleResponse iBleResponse) {
        if (TextUtils.isEmpty(str) || iBleResponse == null) {
            return;
        }
        sBlockBleListenerMap.put(str, iBleResponse);
    }

    public static void unregisterBlockListener(String str) {
        sBlockBleListenerMap.remove(str);
    }

    private static void writeBlock(String str, byte[] bArr) {
        IBleResponse iBleResponse = sBlockBleListenerMap.get(str);
        if (iBleResponse != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray(IBluetoothService.EXTRA_BYTE_ARRAY, bArr);
            try {
                iBleResponse.onResponse(0, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    public static byte[] writeBlockMsgWrapper(byte[] bArr) {
        return build(new MiBTChannelData((short) 0, (byte) 3, (byte) 1, bArr), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void onResult(byte b2, short s, boolean z, byte[] bArr, boolean z2, IBleChannelWriter iBleChannelWriter) {
        BluetoothMyLogger.v(String.format("BleMessageParser onResult msg_type = %d, id = %d, result = %b, returnMsg = %s", Byte.valueOf(b2), Short.valueOf(s), Boolean.valueOf(z), bArr != null ? new String(bArr) : ""));
        byte[] bArrBuild = build(new MiBTChannelData(s, b2, z ? (byte) 1 : (byte) 0, bArr), z2);
        if (iBleChannelWriter != null) {
            try {
                iBleChannelWriter.write(bArrBuild, 0, new IBleResponse.Stub() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.BleMessageParser.3
                    @Override // com.xiaomi.smarthome.core.server.bluetooth.IBleResponse
                    public void onResponse(int i, Bundle bundle) throws RemoteException {
                    }
                });
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MiBTChannelData {
        private byte[] data;
        private short id;
        private byte result;
        private byte type;

        public MiBTChannelData(short s, byte b2, byte[] bArr) {
            this.result = (byte) 0;
            this.id = s;
            this.type = b2;
            this.data = bArr;
        }

        public byte[] getData() {
            return this.data;
        }

        public short getId() {
            return this.id;
        }

        public byte getResult() {
            return this.result;
        }

        public byte getType() {
            return this.type;
        }

        public boolean isResultOk() {
            return this.result == 1;
        }

        public String toString() {
            return "MiBTChannelUtil{id=" + ((int) this.id) + ", type=" + ((int) this.type) + ", data='" + this.data + '\'' + AbstractJsonLexerKt.END_OBJ;
        }

        public MiBTChannelData(short s, byte b2, byte b3, byte[] bArr) {
            this.id = s;
            this.type = b2;
            this.result = b3;
            this.data = bArr;
        }
    }
}
