package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.text.TextUtils;
import com.xiaomi.smarthome.cache.BleCacheManager;
import com.xiaomi.smarthome.core.entity.bluetooth.BleDeviceInfo;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleKeyValuePair;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetError;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetRequest;
import com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetResponseParser;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.core.server.internal.util.LtmkEncryptUtil;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceApi {
    private static final String TAG = "DeviceApi";

    public static void askSecurityShareKey(String str, String str2, String str3, final BleAsyncCallback<JSONObject, BleNetError> bleAsyncCallback) {
        long jLongValue;
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", str);
            jSONObject.put("did", str2);
            try {
                jLongValue = Long.valueOf(str3).longValue();
            } catch (Exception unused) {
                jLongValue = 0;
            }
            jSONObject.put("keyid", jLongValue);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("askSecurityShareKey: [%s]", jSONObject));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/share/askbluetoothkey").addQueries(arrayList).build();
        final BleJsonParser<JSONObject> bleJsonParser = new BleJsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.12
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                return jSONObject2;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.13
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str4) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str4));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str4) {
                BleNetResponseParser.getInstance().parse(str4, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void authBleMesh(int i, String str, String str2, String str3, String str4, String str5, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pdid", i);
            jSONObject.put("dev_mesh_pub", str);
            jSONObject.put("manu_cert_id", str2);
            jSONObject.put("dev_cert", str3);
            jSONObject.put("dev_info", str4);
            jSONObject.put("code", str5);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("authBleMesh: [%s]", jSONObject));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/blemesh/auth").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.19
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                BluetoothLog.v(String.format("authBleMesh Http Response: [%S]", jSONObject2));
                return jSONObject2.toString();
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.20
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str6) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str6));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str6) {
                BleNetResponseParser.getInstance().parse(str6, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void bindBleMesh(long j, String str, String str2, String str3, String str4, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pdid", j);
            jSONObject.put("mac", str);
            jSONObject.put("sign", str2);
            jSONObject.put("did", str3);
            jSONObject.put("token", str4);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("bindBleMesh: [%s]", jSONObject));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/blemesh/bind").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.21
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                BluetoothLog.v(String.format("bindBleMesh Http Response: [%S]", jSONObject2));
                return jSONObject2.toString();
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.22
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str5) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str5));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str5) {
                BleNetResponseParser.getInstance().parse(str5, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void bindDeviceSN(String str, String str2, String str3, String str4, final BleAsyncCallback<Boolean, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("token", str3);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "prop");
            jSONObject2.put("key", "bind_key");
            jSONObject2.put("value", str2);
            jSONArray.put(0, jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "prop");
            jSONObject3.put("key", "smac");
            jSONObject3.put("value", str4);
            jSONArray.put(1, jSONObject3);
            jSONObject.put("props", jSONArray);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException unused) {
        }
        BluetoothLog.v(String.format("Bind did: [%s]", jSONObject));
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/device/bltbind").addQueries(arrayList).build();
        final BleJsonParser<Boolean> bleJsonParser = new BleJsonParser<Boolean>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public Boolean parse(JSONObject jSONObject4) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject4));
                return jSONObject4 != null ? Boolean.valueOf(jSONObject4.optBoolean("result")) : Boolean.FALSE;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.6
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str5) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str5));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str5) {
                BleNetResponseParser.getInstance().parse(str5, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void bindDeviceSnV2(String str, String str2, String str3, String str4, final BleAsyncCallback<JSONObject, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("token", str3);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "prop");
            jSONObject2.put("key", "bind_key");
            jSONObject2.put("value", str2);
            jSONArray.put(0, jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("type", "prop");
            jSONObject3.put("key", "smac");
            jSONObject3.put("value", str4);
            jSONArray.put(1, jSONObject3);
            jSONObject.put("props", jSONArray);
            jSONObject.put("beacon_key", str2);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException unused) {
        }
        BluetoothLog.v(String.format("Bind did: [%s]", jSONObject));
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/device/ble_standard_bind").addQueries(arrayList).build();
        final BleJsonParser<JSONObject> bleJsonParser = new BleJsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.3
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public JSONObject parse(JSONObject jSONObject4) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject4));
                return jSONObject4;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.4
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str5) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str5));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str5) {
                BleNetResponseParser.getInstance().parse(str5, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getBindKey(final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/user/get_bindkey").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.37
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                return jSONObject2.optString("bindkey");
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.38
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str) {
                BleNetResponseParser.getInstance().parse(str, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getBleDeviceRemoteVersion(String str, final String str2, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/device/latest_ver").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.35
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                String string = jSONObject2.toString();
                if (!TextUtils.isEmpty(string) && string.contains("version")) {
                    BluetoothCache.setBleFirmwareUpdateInfo(str2, string);
                }
                String strOptString = jSONObject2.optString("version");
                if (!TextUtils.isEmpty(strOptString)) {
                    BleCacheManager.getInstance().getBleDeviceState(str2).setLatestVersion(strOptString);
                }
                return strOptString;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.36
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str3) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str3));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str3) {
                BleNetResponseParser.getInstance().parse(str3, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getDeviceSN(String str, String str2, String str3, String str4, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", str2);
            jSONObject.put("model", str3);
            jSONObject.put("token", str4);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("did", str);
            }
        } catch (JSONException unused) {
        }
        BluetoothLog.v(String.format("Apply did: [%s]", jSONObject));
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/device/bltapplydid").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.1
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%s]", jSONObject2));
                if (jSONObject2 != null) {
                    return jSONObject2.optString("did");
                }
                return null;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.2
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str5) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str5));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str5) {
                BleNetResponseParser.getInstance().parse(str5, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getOTKey(String str, String str2, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", String.valueOf(str));
            jSONObject.put("random", str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/device/get_rpc_msg_sign").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.39
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                BluetoothLog.v(String.format("get_rpc_msg_sign resposne : [%S]", jSONObject2));
                return jSONObject2.optString("result");
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.40
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str3) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str3));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str3) {
                BleNetResponseParser.getInstance().parse(str3, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getOwnLtmk(String str, BleAsyncCallback<JSONObject, BleNetError> bleAsyncCallback) {
        askSecurityShareKey("own", str, "0", bleAsyncCallback);
    }

    public static void getShareLockCloudToken(String str, int i, final BleAsyncCallback<JSONObject, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("key_id", i);
        } catch (JSONException unused) {
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/share/get_ble_lock_cloudtoken").addQueries(arrayList).build();
        final BleJsonParser<JSONObject> bleJsonParser = new BleJsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.14
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                return jSONObject2;
            }
        };
        MiJiaLog.writeLogOnAll(LogType.DEVICE_CONTROL, TAG, "/share/get_ble_lock_cloudtoken " + str);
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.15
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str2) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str2));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str2) {
                MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, "lock_share", "get cloud token response : " + str2);
                BleNetResponseParser.getInstance().parse(str2, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void getSharedKey(String str, String str2, BleAsyncCallback<JSONObject, BleNetError> bleAsyncCallback) {
        askSecurityShareKey("share", str, str2, bleAsyncCallback);
    }

    public static void getUTCFromServer(final BleAsyncCallback<Long, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/device/get_utc_time").addQueries(arrayList).build();
        final BleJsonParser<Long> bleJsonParser = new BleJsonParser<Long>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public Long parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                return Long.valueOf(jSONObject2.optLong("result", -1L));
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.18
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str) {
                BleNetResponseParser.getInstance().parse(str, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void queryBleMeshBindInfo(String str, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("authBleMesh: [%s]", jSONObject));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/blemesh/query_dev").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.31
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                return jSONObject2.toString();
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.32
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

    public static void queryBleMeshCtlInfo(final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/blemesh/ctl_info").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.23
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("queryBleMeshCtlInfo Http Response: [%S]", jSONObject2));
                return jSONObject2.toString();
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.24
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str) {
                BleNetResponseParser.getInstance().parse(str, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void queryBleMeshModelInfo(int i, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pdid", i);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/blemesh/query_model").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.25
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("queryBleMeshModelInfo Http Response: [%S]", jSONObject2));
                return jSONObject2.toString();
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.26
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str) {
                BleNetResponseParser.getInstance().parse(str, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void reportBleDeiceInfo(String str, String str2, String str3, BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        reportBleDeviceInfo(new BleDeviceInfo(str, str2, str3, null), bleAsyncCallback);
    }

    public static void reportBleDeviceInfo(BleDeviceInfo bleDeviceInfo, final BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        if (bleDeviceInfo == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", bleDeviceInfo.did);
            if (!TextUtils.isEmpty(bleDeviceInfo.fwVersion)) {
                jSONObject.put("fw_ver", bleDeviceInfo.fwVersion);
            }
            if (!TextUtils.isEmpty(bleDeviceInfo.mcuVersion)) {
                jSONObject.put("mcu_ver", bleDeviceInfo.mcuVersion);
            }
            if (!TextUtils.isEmpty(bleDeviceInfo.devSN)) {
                jSONObject.put("sn", bleDeviceInfo.devSN);
            }
            if (!TextUtils.isEmpty(bleDeviceInfo.hardwareVersion)) {
                jSONObject.put("hw_ver", bleDeviceInfo.hardwareVersion);
            }
            if (!TextUtils.isEmpty(bleDeviceInfo.latitude)) {
                jSONObject.put("latitude", bleDeviceInfo.latitude);
            }
            if (!TextUtils.isEmpty(bleDeviceInfo.longitude)) {
                jSONObject.put("longitude", bleDeviceInfo.longitude);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("reportCommonBleVersion: [%s]", jSONObject));
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(new BleNetRequest.Builder().method("POST").path("/v2/device/bledevice_info").addQueries(arrayList).build(), new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.34
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onSuccess(null);
                }
            }
        });
    }

    public static void reportBleMcuVersion(String str, String str2, String str3, BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        reportBleDeviceInfo(new BleDeviceInfo(str, null, str2, str3), bleAsyncCallback);
    }

    public static void reportBleMeshDevInfo(String str, String str2, String str3, String str4, String str5, String str6, final BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("fw_ver", str2);
            jSONObject.put("hw_ver", str3);
            jSONObject.put("latitude", str4);
            jSONObject.put("longitude", str5);
            jSONObject.put("iternetip", str6);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("reportBleMeshDevInfo: [%s]", jSONObject));
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(new BleNetRequest.Builder().method("POST").path("/v2/blemesh/dev_info").addQueries(arrayList).build(), new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.29
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str7) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str7));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str7) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onSuccess(null);
                }
            }
        });
    }

    public static void reportBleMeshVersion(final String str, final String str2, final BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        BluetoothApi.getBleMeshFirmwareVersion(str, new BleResponse<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.30
            @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
            public void onResponse(int i, String str3) {
                if (i == 0 && !TextUtils.isEmpty(str3)) {
                    BleSecurityConnector.checkFirmwareNewVersion(str, str2, str3);
                    DeviceApi.reportBleMeshDevInfo(str2, str3, "", "", "", "", new BleAsyncCallback<Void, BleNetError>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.30.1
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
    }

    public static void reportCommonBleVersion(String str, String str2, BleAsyncCallback<Void, BleNetError> bleAsyncCallback) {
        reportBleDeviceInfo(new BleDeviceInfo(str, str2), bleAsyncCallback);
    }

    public static void reportDeviceEvent(String str, String str2, String str3, String str4, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", str2);
            jSONObject2.put("key", str3);
            jSONObject2.put("value", str4);
            jSONArray.put(jSONObject2);
            jSONObject.put("datas", jSONArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("reportDeviceEvent: [%s]", jSONObject));
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(new BleNetRequest.Builder().method("POST").path("/device/event").addQueries(arrayList).build(), new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.16
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str5) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str5));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str5) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onSuccess("");
                }
            }
        });
    }

    public static void securityChipBindLtmkToServer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, final BleAsyncCallback<Boolean, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", str);
            jSONObject.put("model", str2);
            jSONObject.put("token", str3);
            jSONObject.put(BluetoothConstants.KEY_LTMK, str4);
            jSONObject.put("device_cert", str5);
            jSONObject.put("manu_cert", str6);
            jSONObject.put("app_signature", str9);
            jSONObject.put("sign_data", str10);
            if (!TextUtils.isEmpty(str7)) {
                jSONObject.put("beacon_key", str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                jSONObject.put("cloud_key", str8);
            }
            if (i != 0) {
                jSONObject.put("encrypt_type", i);
            }
            if (!TextUtils.isEmpty(str11)) {
                jSONObject.put("bindkey", str11);
            }
            jSONObject.put("props", new JSONArray());
        } catch (JSONException unused) {
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/device/blelockbind").addQueries(arrayList).build();
        final BleJsonParser<Boolean> bleJsonParser = new BleJsonParser<Boolean>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                if (jSONObject2 == null || !jSONObject2.has("code")) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(jSONObject2.getInt("code") == 0);
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.8
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str12) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str12));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str12) {
                BleNetResponseParser.getInstance().parse(str12, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void securityChipBindLtmkToServerV205(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, final BleAsyncCallback<JSONObject, BleNetError> bleAsyncCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mac", str);
            jSONObject.put("model", str2);
            jSONObject.put("token", str3);
            jSONObject.put(BluetoothConstants.KEY_LTMK, str4);
            jSONObject.put("device_cert", str5);
            jSONObject.put("manu_cert", str6);
            jSONObject.put("app_signature", str9);
            jSONObject.put("sign_data", str10);
            if (!TextUtils.isEmpty(str7)) {
                jSONObject.put("beacon_key", str7);
            }
            if (!TextUtils.isEmpty(str8)) {
                jSONObject.put("cloud_key", str8);
            }
            if (i != 0) {
                jSONObject.put("encrypt_type", i);
            }
            if (!TextUtils.isEmpty(str11)) {
                jSONObject.put("bindkey", str11);
            }
            jSONObject.put("props", new JSONArray());
        } catch (JSONException unused) {
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/device/ble_secure_bind").addQueries(arrayList).build();
        final BleJsonParser<JSONObject> bleJsonParser = new BleJsonParser<JSONObject>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.10
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public JSONObject parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("Http Response: [%S]", jSONObject2));
                return jSONObject2;
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.11
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str12) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str12));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str12) {
                BleNetResponseParser.getInstance().parse(str12, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void sendBleMeshProvisionResult(boolean z, String str, String str2, String str3, final BleAsyncCallback<Boolean, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", !z ? 1 : 0);
            jSONObject.put("did", str);
            jSONObject.put("device_key", str2);
            jSONObject.put("auth", str3);
            setCommonDataForSharedHome(jSONObject, BluetoothService.getBleCoreProvider().getCurrentHome());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BluetoothLog.v(String.format("sendBleMeshProvisionResult: [%s]", jSONObject));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/blemesh/provision_done").addQueries(arrayList).build();
        final BleJsonParser<Boolean> bleJsonParser = new BleJsonParser<Boolean>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.27
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public Boolean parse(JSONObject jSONObject2) throws JSONException {
                BluetoothLog.v(String.format("sendBleMeshProvisionResult Http Response: [%S]", jSONObject2));
                return Boolean.valueOf(jSONObject2.optInt("code", -1) == 0);
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.28
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str4) {
                BluetoothMyLogger.v("sendBleMeshProvisionResult failed = " + str4);
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i, str4));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str4) {
                BleNetResponseParser.getInstance().parse(str4, bleJsonParser, bleAsyncCallback);
            }
        });
    }

    public static void setCommonDataForSharedHome(JSONObject jSONObject, Home home) {
        if (home == null || home.getPermitLevel() != 9) {
            return;
        }
        try {
            jSONObject.put("homeId", Long.valueOf(home.getId()));
            jSONObject.put("uid", home.getOwnerUid());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void setShowSecurePin(String str, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(LtmkEncryptUtil.KEY_SHOW_SECURE_PIN, z ? "1" : "0");
            jSONObject.put("extra_data", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/v2/device/set_extra_data").addQueries(arrayList).build();
        BluetoothLog.v(String.format("setShowSecurePin: [%s]", jSONObject));
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.33
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i, String str2) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str2) {
                BluetoothLog.v(String.format("setShowSecurePin response: [%s]", str2));
            }
        });
    }

    public static void unbindDevice(final String str, final int i, final BleAsyncCallback<Boolean, BleNetError> bleAsyncCallback) {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", str);
            jSONObject.put("pid", i);
            Home currentHome = BluetoothService.getBleCoreProvider().getCurrentHome();
            if (currentHome != null && currentHome.getPermitLevel() == 9) {
                jSONObject.put("ownerUid", currentHome.getOwnerUid());
            }
        } catch (JSONException unused) {
        }
        jSONArray.put(jSONObject);
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("devList", jSONArray);
        } catch (JSONException unused2) {
        }
        arrayList.add(new BleKeyValuePair("data", jSONObject2.toString()));
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(new BleNetRequest.Builder().method("POST").path("/user/del_owner_device_batch").addQueries(arrayList).build(), new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.9
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str2) {
                BluetoothLog.formatLog("unbindDevice (did=%s, pid=%d), onFailure, errorCode=%d, detail=%s", str, Integer.valueOf(i), Integer.valueOf(i2), str2);
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str2));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str2) {
                JSONObject jSONObjectOptJSONObject;
                BluetoothLog.formatLog("unbindDevice (did=%s, pid=%d), onSuccess, response=%s", str, Integer.valueOf(i), str2);
                try {
                    JSONObject jSONObject3 = new JSONObject(str2);
                    if (jSONObject3.optInt("code", -1) == 0 && (jSONObjectOptJSONObject = jSONObject3.optJSONObject("result")) != null && jSONObjectOptJSONObject.has(str)) {
                        BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                        if (bleAsyncCallback2 != null) {
                            bleAsyncCallback2.onSuccess(Boolean.TRUE);
                            return;
                        }
                        return;
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                BleAsyncCallback bleAsyncCallback3 = bleAsyncCallback;
                if (bleAsyncCallback3 != null) {
                    bleAsyncCallback3.onSuccess(Boolean.FALSE);
                }
            }
        });
    }

    public static void updateWuganDeviceStatus(String str, final int i, final BleAsyncCallback<String, BleNetError> bleAsyncCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("did", String.valueOf(str));
            jSONObject.put("status", i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BleKeyValuePair("data", jSONObject.toString()));
        BleNetRequest bleNetRequestBuild = new BleNetRequest.Builder().method("POST").path("/smc/update_dev_status").addQueries(arrayList).build();
        final BleJsonParser<String> bleJsonParser = new BleJsonParser<String>() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.41
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleJsonParser
            public String parse(JSONObject jSONObject2) {
                return jSONObject2.optString("result");
            }
        };
        BluetoothService.getBleCoreProvider().sendSmartHomeRequest(bleNetRequestBuild, new BleNetCallback() { // from class: com.xiaomi.smarthome.core.server.internal.bluetooth.security.DeviceApi.42
            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onFailed(int i2, String str2) {
                BleAsyncCallback bleAsyncCallback2 = bleAsyncCallback;
                if (bleAsyncCallback2 != null) {
                    bleAsyncCallback2.onFailure(new BleNetError(i2, str2));
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.blecore.BleNetCallback
            public void onSuccess(String str2) {
                MiJiaLog.onlyLogcat("Wugan", "updateWuganDeviceStatus status: " + i + ", response: " + str2);
                BleNetResponseParser.getInstance().parse(str2, bleJsonParser, bleAsyncCallback);
            }
        });
    }
}
