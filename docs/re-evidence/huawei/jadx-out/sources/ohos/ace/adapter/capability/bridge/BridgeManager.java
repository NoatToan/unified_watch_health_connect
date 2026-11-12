package ohos.ace.adapter.capability.bridge;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import ohos.ace.adapter.ALog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class BridgeManager {
    private static final String CALL_METHOD_JSON_KEY = "result";
    private static final String DATA_ERROR = "data_error";
    private static final String JSON_ERROR_CODE = "errorCode";
    private static final String JSON_ERROR_MESSAGE = "errorMessage";
    private static final String LOG_TAG = "BridgeManager";
    private static final String MESSAGE_JSON_KEY = "result";
    private static final int NO_PARAM = 4;
    private static final String SEPARATOR = "$";
    private static volatile BridgeManager instance;
    private Lock bridgeMapLock_ = new ReentrantLock();
    private HashMap<String, BridgePlugin> bridgeMap_ = new HashMap<>();
    private static final Object INSTANCE_LOCK = new Object();
    private static BridgeBinaryCodec bridgeBinaryCodec_ = BridgeBinaryCodec.getInstance();

    /* JADX INFO: loaded from: classes46.dex */
    public static class BinaryResultHolder {
        public int errorCode;
        public ByteBuffer result;
    }

    private native boolean nativeJSBridgeExists(String str, int i);

    private native void nativePlatformCallMethod(String str, String str2, String str3);

    private native void nativePlatformCallMethodBinary(String str, String str2, ByteBuffer byteBuffer);

    private native String nativePlatformCallMethodSync(String str, String str2, String str3);

    private native BinaryResultHolder nativePlatformCallMethodSyncBinary(String str, String str2, ByteBuffer byteBuffer);

    private native void nativePlatformSendMessage(String str, String str2);

    private native void nativePlatformSendMessageBinary(String str, ByteBuffer byteBuffer);

    private native void nativePlatformSendMessageResponse(String str, String str2);

    private native void nativePlatformSendMethodResult(String str, String str2, String str3);

    private native void nativePlatformSendMethodResultBinary(String str, String str2, ByteBuffer byteBuffer, int i, String str3);

    public native void nativeInit();

    private BridgeManager() {
        nativeInit();
    }

    public static BridgeManager getInstance() {
        BridgeManager bridgeManager;
        if (instance != null) {
            return instance;
        }
        synchronized (INSTANCE_LOCK) {
            if (instance == null) {
                instance = new BridgeManager();
            }
            bridgeManager = instance;
        }
        return bridgeManager;
    }

    public boolean registerBridgePlugin(String str, BridgePlugin bridgePlugin) {
        this.bridgeMapLock_.lock();
        try {
            HashMap<String, BridgePlugin> map = this.bridgeMap_;
            int i = 0;
            if (map != null) {
                map.put(str, bridgePlugin);
                ALog.i(LOG_TAG, "The BridgePlugin registered successfully, The bridgeName is " + str);
                if (bridgePlugin.getBridgeType() != BridgePlugin.BridgeType.JSON_TYPE) {
                    i = 1;
                }
                if (nativeJSBridgeExists(str, i)) {
                    bridgePlugin.onRegisterResult(true);
                }
                return true;
            }
            ALog.e(LOG_TAG, "The BridgePlugin registration failure, The bridgeName is " + str);
            return false;
        } finally {
            this.bridgeMapLock_.unlock();
        }
    }

    public boolean unRegisterBridgePlugin(String str) {
        Lock lock;
        this.bridgeMapLock_.lock();
        try {
            HashMap<String, BridgePlugin> map = this.bridgeMap_;
            if (map == null || map.remove(str) == null) {
                ALog.e(LOG_TAG, "unRegisterBridgePlugin failed");
                return false;
            }
            return true;
        } finally {
            this.bridgeMapLock_.unlock();
        }
    }

    private BridgePlugin findBridgePlugin(String str) {
        this.bridgeMapLock_.lock();
        try {
            HashMap<String, BridgePlugin> map = this.bridgeMap_;
            if (map != null) {
                return map.get(str);
            }
            ALog.e(LOG_TAG, "No BridgePlugin found, bridgeName is " + str);
            return null;
        } finally {
            this.bridgeMapLock_.unlock();
        }
    }

    public void release() {
        Iterator<Map.Entry<String, BridgePlugin>> it = this.bridgeMap_.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().release();
            it.remove();
        }
        ALog.i(LOG_TAG, "BridgeManager release.");
    }

    private JSONObject createJsonMethodResult(BridgeErrorCode bridgeErrorCode, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", bridgeErrorCode.getId());
            jSONObject.put(JSON_ERROR_MESSAGE, bridgeErrorCode.getErrorMessage());
            if (obj != null && obj.getClass().isArray()) {
                JSONArray jSONArrayObjectTransformJsonArray = ParameterHelper.objectTransformJsonArray(obj);
                if (jSONArrayObjectTransformJsonArray == null) {
                    return null;
                }
                jSONObject.put("result", jSONArrayObjectTransformJsonArray);
                return jSONObject;
            }
            jSONObject.put("result", obj);
            return jSONObject;
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "createJsonMethodResult failed, JSONException.");
            return null;
        }
    }

    private String splitMethodName(String str) {
        return (str == null || !str.contains("$")) ? str : str.substring(0, str.indexOf("$"));
    }

    public void jsCallMethod(String str, final String str2, final String str3) {
        ALog.d(LOG_TAG, "jsCallMethod enter, bridgeName is " + str + ", methodName is " + str2);
        final BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsCallMethod bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        BridgeThreadExecutor.getInstance().execute(new Runnable() { // from class: ohos.ace.adapter.capability.bridge.BridgeManager.1
            @Override // java.lang.Runnable
            public void run() {
                BridgeManager.this.jsCallMethodInner(bridgePluginFindBridgePlugin, str2, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jsCallMethodInner(BridgePlugin bridgePlugin, String str, String str2) {
        Object objJsCallMethod;
        new JSONObject();
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        try {
            String strSplitMethodName = splitMethodName(str);
            if (str2.length() != 4) {
                objJsCallMethod = bridgePlugin.jsCallMethod(bridgePlugin, new MethodData(strSplitMethodName, ParameterHelper.jsonTransformObject(new JSONObject(str2))));
            } else {
                objJsCallMethod = bridgePlugin.jsCallMethod(bridgePlugin, new MethodData(strSplitMethodName, new Object[0]));
            }
            ALog.i(LOG_TAG, "End of method call, the methodName is " + strSplitMethodName);
            if (objJsCallMethod != null && !ParameterHelper.isExceedJsSafeInteger(objJsCallMethod)) {
                bridgeErrorCode = BridgeErrorCode.BRIDGE_EXCEEDS_SAFE_INTEGER;
            }
            if (objJsCallMethod != null && (objJsCallMethod instanceof BridgeErrorCode)) {
                bridgeErrorCode = (BridgeErrorCode) objJsCallMethod;
            }
            JSONObject jSONObjectCreateJsonMethodResult = createJsonMethodResult(bridgeErrorCode, objJsCallMethod);
            if (jSONObjectCreateJsonMethodResult == null) {
                ALog.e(LOG_TAG, "createJsonMethodResult failed");
                jSONObjectCreateJsonMethodResult = createJsonMethodResult(bridgeErrorCode, null);
            }
            platformSendMethodResult(bridgePlugin.getBridgeName(), str, jSONObjectCreateJsonMethodResult.toString());
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "jsCallMethod failed");
            platformSendMethodResult(bridgePlugin.getBridgeName(), str, createJsonMethodResult(BridgeErrorCode.BRIDGE_METHOD_UNIMPL, null).toString());
        }
    }

    public String jsCallMethodSync(String str, String str2, String str3) {
        ALog.d(LOG_TAG, "jsCallMethodSync enter, bridgeName is " + str + ", methodName is " + str2);
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsCallMethodSync bridgePlugin Not found, bridgeName is " + str);
            return null;
        }
        return jsCallMethodSyncInner(bridgePluginFindBridgePlugin, str2, str3);
    }

    private String jsCallMethodSyncInner(BridgePlugin bridgePlugin, String str, String str2) {
        JSONObject jSONObjectCreateJsonMethodResult;
        Object objJsCallMethod;
        new JSONObject();
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        try {
            String strSplitMethodName = splitMethodName(str);
            if (str2.length() != 4) {
                objJsCallMethod = bridgePlugin.jsCallMethod(bridgePlugin, new MethodData(strSplitMethodName, ParameterHelper.jsonTransformObject(new JSONObject(str2))));
            } else {
                objJsCallMethod = bridgePlugin.jsCallMethod(bridgePlugin, new MethodData(strSplitMethodName, new Object[0]));
            }
            ALog.i(LOG_TAG, "End of method call, the methodName is " + strSplitMethodName);
            if (objJsCallMethod != null && !ParameterHelper.isExceedJsSafeInteger(objJsCallMethod)) {
                bridgeErrorCode = BridgeErrorCode.BRIDGE_EXCEEDS_SAFE_INTEGER;
            }
            if (objJsCallMethod != null && (objJsCallMethod instanceof BridgeErrorCode)) {
                bridgeErrorCode = (BridgeErrorCode) objJsCallMethod;
            }
            jSONObjectCreateJsonMethodResult = createJsonMethodResult(bridgeErrorCode, objJsCallMethod);
            if (jSONObjectCreateJsonMethodResult == null) {
                ALog.e(LOG_TAG, "createJsonMethodResult failed");
                jSONObjectCreateJsonMethodResult = createJsonMethodResult(bridgeErrorCode, null);
            }
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "jsCallMethod failed");
            jSONObjectCreateJsonMethodResult = createJsonMethodResult(BridgeErrorCode.BRIDGE_METHOD_UNIMPL, null);
        }
        return jSONObjectCreateJsonMethodResult.toString();
    }

    public void platformSendMethodResult(String str, String str2, String str3) {
        if (findBridgePlugin(str) == null) {
            ALog.e(LOG_TAG, "platformSendMethodResult bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        nativePlatformSendMethodResult(str, str2, str3);
    }

    public BridgeErrorCode platformCallMethod(String str, MethodData methodData) {
        String string;
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        if (findBridgePlugin(str) == null) {
            ALog.e(LOG_TAG, "platformCallMethod bridgePlugin Not found, bridgeName is " + str);
            return BridgeErrorCode.BRIDGE_NAME_ERROR;
        }
        String methodName = methodData.getMethodName();
        if (methodData.getMethodParameter() == null || methodData.getMethodParameter().length == 0) {
            ALog.i(LOG_TAG, "The calling method has no parameters");
            string = new JSONObject().toString();
        } else {
            ALog.i(LOG_TAG, "The calling method has parameters");
            JSONObject jSONObjectObjectTransformJson = ParameterHelper.objectTransformJson(methodData.getMethodParameter());
            if (jSONObjectObjectTransformJson == null) {
                return BridgeErrorCode.BRIDGE_METHOD_PARAM_ERROR;
            }
            string = jSONObjectObjectTransformJson.toString();
        }
        nativePlatformCallMethod(str, methodName, string);
        return bridgeErrorCode;
    }

    public void jsSendMethodResult(String str, String str2, String str3) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsSendMethodResult bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        jsSendMethodResultInner(bridgePluginFindBridgePlugin, str2, str3);
    }

    private void jsSendMethodResultInner(BridgePlugin bridgePlugin, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int i = jSONObject.getInt("errorCode");
            Object obj = jSONObject.get("result");
            String errorMessage = BridgeErrorCode.BRIDGE_ERROR_NO.getErrorMessage();
            if (i == 0) {
                bridgePlugin.jsSendMethodResult(obj, str, i, errorMessage);
            } else {
                bridgePlugin.jsSendMethodResult(obj, str, i, jSONObject.getString(JSON_ERROR_MESSAGE));
            }
        } catch (JSONException unused) {
            BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_DATA_ERROR;
            bridgePlugin.jsSendMethodResult(null, str, bridgeErrorCode.getId(), bridgeErrorCode.getErrorMessage());
            ALog.e(LOG_TAG, "jsSendMethodResult failed, JSONException.");
        }
    }

    private void platformSendMessageResponseErrorInfo(String str, BridgeErrorCode bridgeErrorCode) {
        if (findBridgePlugin(str) == null) {
            ALog.e(LOG_TAG, "platformSendMessageResponseErrorInfo bridgePlugin Not found, bridgeName is " + str);
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", "errorCode");
                jSONObject.put("errorCode", bridgeErrorCode.getId());
                nativePlatformSendMessageResponse(str, jSONObject.toString());
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "platformSendMessageResponseErrorInfo failed, JSONException.");
            }
        }
    }

    public void jsSendMessage(String str, String str2) {
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            platformSendMessageResponseErrorInfo(str, BridgeErrorCode.BRIDGE_NAME_ERROR);
        } else {
            jsSendMessageInner(bridgePluginFindBridgePlugin, str, str2);
        }
    }

    private void jsSendMessageInner(BridgePlugin bridgePlugin, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            bridgePlugin.jsSendMessage(jSONObject.get("result") == JSONObject.NULL ? null : jSONObject.get("result"));
        } catch (JSONException unused) {
            platformSendMessageResponseErrorInfo(str, BridgeErrorCode.BRIDGE_DATA_ERROR);
            ALog.e(LOG_TAG, "jsSendMessage failed, JSONException.");
        }
    }

    public void platformSendMessageResponse(String str, Object obj) {
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        if (findBridgePlugin(str) != null) {
            try {
                if (obj == null) {
                    sendMessageResponseErrorCode(str, BridgeErrorCode.BRIDGE_DATA_ERROR);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                if (obj instanceof JSONObject) {
                    jSONObject.put("result", obj.toString());
                } else if (!obj.getClass().isArray()) {
                    if (!ParameterHelper.isExceedJsSafeInteger(obj)) {
                        sendMessageResponseErrorCode(str, BridgeErrorCode.BRIDGE_EXCEEDS_SAFE_INTEGER);
                        return;
                    }
                    jSONObject.put("result", obj);
                } else if (obj.getClass().isArray()) {
                    JSONArray jSONArrayObjectTransformJsonArray = ParameterHelper.objectTransformJsonArray(obj);
                    if (jSONArrayObjectTransformJsonArray == null) {
                        sendMessageResponseErrorCode(str, BridgeErrorCode.BRIDGE_DATA_ERROR);
                        return;
                    }
                    jSONObject.put("result", jSONArrayObjectTransformJsonArray);
                } else {
                    sendMessageResponseErrorCode(str, BridgeErrorCode.BRIDGE_DATA_ERROR);
                    return;
                }
                jSONObject.put("errorCode", 0);
                nativePlatformSendMessageResponse(str, jSONObject.toString());
                return;
            } catch (JSONException unused) {
                ALog.e(LOG_TAG, "platformSendMessageResponse failed, JSONException.");
                return;
            }
        }
        ALog.e(LOG_TAG, "platformSendMessageResponse bridgePlugin Not found, bridgeName is " + str);
    }

    private void sendMessageResponseErrorCode(String str, BridgeErrorCode bridgeErrorCode) {
        new JSONObject();
        nativePlatformSendMessageResponse(str, createJsonMethodResult(bridgeErrorCode, DATA_ERROR).toString());
    }

    public void platformSendMessage(String str, Object obj) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "platformSendMessage bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (obj == null) {
                jSONObject.put("result", obj);
                jSONObject.put("errorCode", 0);
                nativePlatformSendMessage(str, jSONObject.toString());
                return;
            }
            if (obj instanceof JSONObject) {
                jSONObject.put("result", obj.toString());
            } else if (obj.getClass().isArray()) {
                JSONArray jSONArrayObjectTransformJsonArray = ParameterHelper.objectTransformJsonArray(obj);
                if (jSONArrayObjectTransformJsonArray == null) {
                    jsSendMessageResponseErrorCode(bridgePluginFindBridgePlugin, BridgeErrorCode.BRIDGE_DATA_ERROR);
                    return;
                }
                jSONObject.put("result", jSONArrayObjectTransformJsonArray);
            } else {
                if (!ParameterHelper.isExceedJsSafeInteger(obj)) {
                    jsSendMessageResponseErrorCode(bridgePluginFindBridgePlugin, BridgeErrorCode.BRIDGE_EXCEEDS_SAFE_INTEGER);
                    return;
                }
                jSONObject.put("result", obj);
            }
            jSONObject.put("errorCode", 0);
            nativePlatformSendMessage(str, jSONObject.toString());
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "platformSendMessage failed, JSONException.");
        }
    }

    private void jsSendMessageResponseErrorCode(BridgePlugin bridgePlugin, BridgeErrorCode bridgeErrorCode) {
        new JSONObject();
        bridgePlugin.jsSendMessageResponse(createJsonMethodResult(bridgeErrorCode, null));
    }

    public void jsSendMessageResponse(String str, String str2) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsSendMessageResponse bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        jsSendMessageResponseInner(bridgePluginFindBridgePlugin, str2);
    }

    private void jsSendMessageResponseInner(BridgePlugin bridgePlugin, String str) {
        try {
            bridgePlugin.jsSendMessageResponse(new JSONObject(str).get("result"));
        } catch (JSONException unused) {
            ALog.e(LOG_TAG, "jsSendMessageResponse failed, JSONException.");
        }
    }

    public void jsCancelMethod(String str, String str2) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsCancelMethod bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        bridgePluginFindBridgePlugin.jsCancelMethod(str2);
    }

    public void platformSendMessageBinary(String str, Object obj) {
        if (findBridgePlugin(str) == null) {
            ALog.e(LOG_TAG, "platformSendMessageBinary bridgePlugin Not found, bridgeName is " + str);
        } else {
            BridgeBinaryCodec bridgeBinaryCodec = bridgeBinaryCodec_;
            if (bridgeBinaryCodec == null) {
                ALog.e(LOG_TAG, "The bridgeBinaryCodec is null.");
            } else {
                nativePlatformSendMessageBinary(str, bridgeBinaryCodec.encodeData(obj));
            }
        }
    }

    private void platformSendMethodResultBinaryInner(String str, String str2, ByteBuffer byteBuffer, BridgeErrorCode bridgeErrorCode) {
        nativePlatformSendMethodResultBinary(str, str2, byteBuffer, bridgeErrorCode.getId(), bridgeErrorCode.getErrorMessage());
    }

    public void jsCallMethodBinary(String str, String str2, ByteBuffer byteBuffer) {
        ALog.d(LOG_TAG, "jsCallMethodBinary enter, bridgeName is " + str + ", methodName is " + str2);
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsCallMethodBinary bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        jsCallMethodBinaryInner(bridgePluginFindBridgePlugin, str2, byteBuffer);
    }

    private void jsCallMethodBinaryInner(BridgePlugin bridgePlugin, String str, ByteBuffer byteBuffer) {
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        if (bridgePlugin.getBridgeType() != BridgePlugin.BridgeType.BINARY_TYPE) {
            ALog.e(LOG_TAG, "The bridge is not BINARY_TYPE.");
            bridgeErrorCode = BridgeErrorCode.BRIDGE_CODEC_TYPE_MISMATCH;
        }
        if (bridgeBinaryCodec_ == null) {
            ALog.e(LOG_TAG, "The bridgeBinaryCodec is null.");
            bridgeErrorCode = BridgeErrorCode.BRIDGE_CODEC_INVALID;
        }
        Object objDecodeData = bridgeBinaryCodec_.decodeData(byteBuffer);
        String strSplitMethodName = splitMethodName(str);
        ByteBuffer byteBufferEncodeData = bridgeBinaryCodec_.encodeData(null);
        if (objDecodeData == null) {
            bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        } else {
            Object[] objArrBinaryTransformObject = ParameterHelper.binaryTransformObject(objDecodeData);
            if (objArrBinaryTransformObject == null || ParameterHelper.containsNull(Arrays.asList(objArrBinaryTransformObject))) {
                ALog.e(LOG_TAG, "Parameter parsing failed.");
                bridgeErrorCode = BridgeErrorCode.BRIDGE_METHOD_PARAM_ERROR;
            } else {
                Object objJsCallMethod = bridgePlugin.jsCallMethod(bridgePlugin, new MethodData(strSplitMethodName, objArrBinaryTransformObject));
                ALog.i(LOG_TAG, "End of method call, the methodName is " + strSplitMethodName);
                if (objJsCallMethod != null && objJsCallMethod.getClass() == BridgeErrorCode.class) {
                    bridgeErrorCode = (BridgeErrorCode) objJsCallMethod;
                } else {
                    byteBufferEncodeData = bridgeBinaryCodec_.encodeData(objJsCallMethod);
                }
            }
        }
        platformSendMethodResultBinaryInner(bridgePlugin.getBridgeName(), str, byteBufferEncodeData, bridgeErrorCode);
    }

    public BinaryResultHolder jsCallMethodBinarySync(String str, String str2, ByteBuffer byteBuffer) {
        ALog.d(LOG_TAG, "jsCallMethodBinary enter, bridgeName is " + str + ", methodName is " + str2);
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsCallMethodBinary bridgePlugin Not found, bridgeName is " + str);
            BinaryResultHolder binaryResultHolder = new BinaryResultHolder();
            binaryResultHolder.errorCode = BridgeErrorCode.BRIDGE_INVALID.getId();
            binaryResultHolder.result = ByteBuffer.allocateDirect(0);
            return binaryResultHolder;
        }
        return jsCallMethodBinarySyncInner(bridgePluginFindBridgePlugin, str2, byteBuffer);
    }

    private BinaryResultHolder createResultHolder(int i, ByteBuffer byteBuffer) {
        BinaryResultHolder binaryResultHolder = new BinaryResultHolder();
        binaryResultHolder.errorCode = i;
        binaryResultHolder.result = byteBuffer;
        return binaryResultHolder;
    }

    private BinaryResultHolder jsCallMethodBinarySyncInner(BridgePlugin bridgePlugin, String str, ByteBuffer byteBuffer) {
        if (bridgePlugin.getBridgeType() != BridgePlugin.BridgeType.BINARY_TYPE) {
            ALog.e(LOG_TAG, "The bridge is not BINARY_TYPE.");
            return createResultHolder(BridgeErrorCode.BRIDGE_CODEC_TYPE_MISMATCH.getId(), ByteBuffer.allocateDirect(0));
        }
        BridgeBinaryCodec bridgeBinaryCodec = bridgeBinaryCodec_;
        if (bridgeBinaryCodec == null) {
            ALog.e(LOG_TAG, "The bridgeBinaryCodec is null.");
            return createResultHolder(BridgeErrorCode.BRIDGE_CODEC_INVALID.getId(), ByteBuffer.allocateDirect(0));
        }
        Object objDecodeData = bridgeBinaryCodec.decodeData(byteBuffer);
        String strSplitMethodName = splitMethodName(str);
        ByteBuffer byteBufferEncodeData = bridgeBinaryCodec_.encodeData(null);
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        if (objDecodeData != null) {
            bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        }
        Object[] objArrBinaryTransformObject = ParameterHelper.binaryTransformObject(objDecodeData);
        if (objArrBinaryTransformObject == null || ParameterHelper.containsNull(Arrays.asList(objArrBinaryTransformObject))) {
            ALog.e(LOG_TAG, "Parameter parsing failed.");
            bridgeErrorCode = BridgeErrorCode.BRIDGE_METHOD_PARAM_ERROR;
        } else {
            Object objJsCallMethod = bridgePlugin.jsCallMethod(bridgePlugin, new MethodData(strSplitMethodName, objArrBinaryTransformObject));
            ALog.i(LOG_TAG, "End of method call, the methodName is " + strSplitMethodName);
            if (objJsCallMethod != null && (objJsCallMethod instanceof BridgeErrorCode)) {
                bridgeErrorCode = (BridgeErrorCode) objJsCallMethod;
            } else {
                byteBufferEncodeData = bridgeBinaryCodec_.encodeData(objJsCallMethod);
            }
        }
        return createResultHolder(bridgeErrorCode.getId(), byteBufferEncodeData);
    }

    public void jsSendMessageBinary(String str, ByteBuffer byteBuffer) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsSendMessageBinary bridgePlugin Not found, bridgeName is " + str);
        } else {
            if (bridgePluginFindBridgePlugin.getBridgeType() != BridgePlugin.BridgeType.BINARY_TYPE) {
                ALog.e(LOG_TAG, "The bridge is not BINARY_TYPE.");
                return;
            }
            BridgeBinaryCodec bridgeBinaryCodec = bridgeBinaryCodec_;
            if (bridgeBinaryCodec == null) {
                ALog.e(LOG_TAG, "The bridgeBinaryCodec is null.");
            } else {
                bridgePluginFindBridgePlugin.jsSendMessage(bridgeBinaryCodec.decodeData(byteBuffer));
            }
        }
    }

    public BridgeErrorCode platformCallMethodBinary(String str, MethodData methodData) {
        BridgeErrorCode bridgeErrorCode = BridgeErrorCode.BRIDGE_ERROR_NO;
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "platformCallMethodBinary bridgePlugin Not found, bridgeName is " + str);
            bridgeErrorCode = BridgeErrorCode.BRIDGE_NAME_ERROR;
        }
        if (bridgePluginFindBridgePlugin.getBridgeType() != BridgePlugin.BridgeType.BINARY_TYPE) {
            ALog.e(LOG_TAG, "The bridge is not BINARY_TYPE.");
            bridgeErrorCode = BridgeErrorCode.BRIDGE_CODEC_TYPE_MISMATCH;
        }
        if (bridgeBinaryCodec_ == null) {
            ALog.e(LOG_TAG, "The bridgeBinaryCodec is null.");
            bridgeErrorCode = BridgeErrorCode.BRIDGE_CODEC_INVALID;
        }
        if (bridgeErrorCode == BridgeErrorCode.BRIDGE_ERROR_NO) {
            nativePlatformCallMethodBinary(str, methodData.getMethodName(), bridgeBinaryCodec_.encodeData(methodData.getMethodParameter()));
        }
        return bridgeErrorCode;
    }

    private ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        synchronized (this) {
            if (byteBuffer == null) {
                return null;
            }
            int iCapacity = byteBuffer.capacity();
            byte[] bArr = new byte[iCapacity];
            byteBuffer.get(bArr);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iCapacity);
            byteBufferAllocateDirect.put(bArr);
            byteBufferAllocateDirect.flip();
            return byteBufferAllocateDirect;
        }
    }

    public void jsSendMethodResultBinary(String str, String str2, ByteBuffer byteBuffer, int i, String str3) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsSendMethodResultBinary bridgePlugin Not found, bridgeName is " + str);
            return;
        }
        jsSendMethodResultBinaryInner(bridgePluginFindBridgePlugin, str2, copyByteBuffer(byteBuffer), i, str3);
    }

    private void jsSendMethodResultBinaryInner(BridgePlugin bridgePlugin, String str, ByteBuffer byteBuffer, int i, String str2) {
        if (bridgePlugin.getBridgeType() != BridgePlugin.BridgeType.BINARY_TYPE) {
            ALog.e(LOG_TAG, "The bridge is not BINARY_TYPE.");
            bridgePlugin.jsSendMethodResult(null, str, BridgeErrorCode.BRIDGE_CODEC_TYPE_MISMATCH.getId(), BridgeErrorCode.BRIDGE_CODEC_TYPE_MISMATCH.getErrorMessage());
        } else {
            bridgePlugin.jsSendMethodResult(bridgeBinaryCodec_.decodeData(byteBuffer), str, i, str2);
        }
    }

    public Object platformCallMethodSync(String str, MethodData methodData) {
        String string;
        if (findBridgePlugin(str) == null) {
            ALog.e(LOG_TAG, "platformCallMethod bridgePlugin Not found, bridgeName is " + str);
            throw new IllegalStateException("Bridge not found: " + str + ", errorCode = " + BridgeErrorCode.BRIDGE_NAME_ERROR.getId());
        }
        String methodName = methodData.getMethodName();
        if (methodData.getMethodParameter() == null || methodData.getMethodParameter().length == 0) {
            ALog.i(LOG_TAG, "The calling method has no parameters");
            string = new JSONObject().toString();
        } else {
            ALog.i(LOG_TAG, "The calling method has parameters");
            JSONObject jSONObjectObjectTransformJson = ParameterHelper.objectTransformJson(methodData.getMethodParameter());
            if (jSONObjectObjectTransformJson == null) {
                throw new IllegalStateException("Invalid method parameters, method=" + methodName + ", errorCode = " + BridgeErrorCode.BRIDGE_METHOD_PARAM_ERROR.getId());
            }
            string = jSONObjectObjectTransformJson.toString();
        }
        return parseSyncResultOrThrow(nativePlatformCallMethodSync(str, methodName, string), methodName);
    }

    private Object parseSyncResultOrThrow(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("errorCode");
            if (i == 0) {
                return jSONObject.get("result");
            }
            throw new IllegalStateException("Call method failed, method = " + str2 + ", errorCode = " + i);
        } catch (JSONException e) {
            ALog.e(LOG_TAG, "platformCallMethodSync parse result failed, JSONException.");
            throw new RuntimeException("platformCallMethodSync parse result failed.", e);
        }
    }

    public Object platformCallMethodSyncBinary(String str, MethodData methodData) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "platformCallMethodBinary bridgePlugin Not found, bridgeName is " + str);
            throw new IllegalStateException("Bridge not found: " + str + ", errorCode = " + BridgeErrorCode.BRIDGE_NAME_ERROR.getId());
        }
        if (bridgePluginFindBridgePlugin.getBridgeType() != BridgePlugin.BridgeType.BINARY_TYPE) {
            ALog.e(LOG_TAG, "The bridge is not BINARY_TYPE.");
            throw new IllegalStateException("Bridge type mismatch, bridge=" + str + ", errorCode = " + BridgeErrorCode.BRIDGE_CODEC_TYPE_MISMATCH.getId());
        }
        if (bridgeBinaryCodec_ == null) {
            ALog.e(LOG_TAG, "The bridgeBinaryCodec is null.");
            throw new IllegalStateException("Bridge binary codec invalid, bridge=" + str + ", errorCode = " + BridgeErrorCode.BRIDGE_CODEC_INVALID.getId());
        }
        String methodName = methodData.getMethodName();
        BinaryResultHolder binaryResultHolderNativePlatformCallMethodSyncBinary = nativePlatformCallMethodSyncBinary(str, methodName, bridgeBinaryCodec_.encodeData(methodData.getMethodParameter()));
        if (binaryResultHolderNativePlatformCallMethodSyncBinary == null) {
            throw new IllegalStateException("CallMethodSyncBinary failed, method = " + methodName);
        }
        if (binaryResultHolderNativePlatformCallMethodSyncBinary.errorCode != 0) {
            throw new IllegalStateException("CallMethodSyncBinary failed, method = " + methodName + ", errorCode = " + binaryResultHolderNativePlatformCallMethodSyncBinary.errorCode);
        }
        return bridgeBinaryCodec_.decodeData(copyByteBuffer(binaryResultHolderNativePlatformCallMethodSyncBinary.result));
    }

    public void jsOnRegisterResult(String str, int i, boolean z) {
        BridgePlugin bridgePluginFindBridgePlugin = findBridgePlugin(str);
        if (bridgePluginFindBridgePlugin == null) {
            ALog.e(LOG_TAG, "jsOnRegisterResult bridgePlugin Not found, bridgeName is " + str);
        } else {
            if (!z) {
                bridgePluginFindBridgePlugin.onRegisterResult(z);
                return;
            }
            if (i == (bridgePluginFindBridgePlugin.getBridgeType() == BridgePlugin.BridgeType.JSON_TYPE ? 0 : 1)) {
                bridgePluginFindBridgePlugin.onRegisterResult(z);
            }
        }
    }
}
