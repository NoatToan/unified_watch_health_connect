package com.xiaomi.smarthome.core.server.internal.device.api;

import android.text.TextUtils;
import com.xiaomi.smarthome.account.AccountDepApi;
import com.xiaomi.smarthome.core.entity.account.AccountType;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.device.DeviceHandle;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.framework.api.AsyncResponseCallback;
import com.xiaomi.smarthome.homeroom.model.Home;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceApiInternal {
    private static final String TAG = "DeviceApiInternal";
    private static volatile DeviceApiInternal sInstance;
    private static final Object sLock = new Object();

    private DeviceApiInternal() {
    }

    public static DeviceApiInternal getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new DeviceApiInternal();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public DeviceHandle batchRpcAsync(String str, final AsyncResponseCallback<String> asyncResponseCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", str));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/home/batchrpc").addQueries(arrayList).build();
        if (AccountDepApi.getInstance().getAccountType() != AccountType.MI) {
            if (asyncResponseCallback != null) {
                asyncResponseCallback.onFailure(-9999, "Account type not supported!");
            }
            return null;
        }
        NetHandle netHandleSendRequest = SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceApiInternal.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                AsyncResponseCallback asyncResponseCallback2 = asyncResponseCallback;
                if (asyncResponseCallback2 != null) {
                    asyncResponseCallback2.onFailure(netError.getCode(), netError.getDetail());
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                AsyncResponseCallback asyncResponseCallback2 = asyncResponseCallback;
                if (asyncResponseCallback2 != null) {
                    asyncResponseCallback2.onSuccess(netResult.mResponse);
                }
            }
        });
        if (netHandleSendRequest != null) {
            return new DeviceHandle(netHandleSendRequest);
        }
        return null;
    }

    public NetHandle delDeviceBatch(JSONArray jSONArray, Home home, NetCallback<NetResult, NetError> netCallback) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(-9999, "list empty"));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (home != null && home.getPermitLevel() == 9) {
                jSONObject2.put("ownerUid", home.getOwnerUid());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("devList", jSONArray);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/user/del_owner_device_batch").addQueries(arrayList).build();
        if (AccountDepApi.getInstance().getAccountType() == AccountType.MI) {
            return SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, netCallback);
        }
        if (netCallback != null) {
            netCallback.onFailure(new NetError(-9999, "account type not supported!"));
        }
        return null;
    }

    public NetHandle delHuamiDevice(JSONArray jSONArray, NetCallback<NetResult, NetError> netCallback) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(-9999, "list empty"));
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devList", jSONArray);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/v2/home/unbind_huami_devs").addQueries(arrayList).build();
        if (AccountDepApi.getInstance().getAccountType() == AccountType.MI) {
            return SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, netCallback);
        }
        if (netCallback != null) {
            netCallback.onFailure(new NetError(-9999, "account type not supported!"));
        }
        return null;
    }

    public NetHandle delRouterFromSmarthomeServer(Device device, int i, NetCallback<NetResult, NetError> netCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("did", device.getDid());
            jSONObject2.put("pid", device.getPid());
            if (device.isHomeShared()) {
                jSONObject2.put("ownerUid", device.getOwnerId());
            }
            jSONArray.put(jSONObject2);
            jSONObject.put("devList", jSONArray);
            jSONObject.put("errorCode", i);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/home/batch_unbind").addQueries(arrayList).build();
        if (AccountDepApi.getInstance().getAccountType() == AccountType.MI) {
            return SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, netCallback);
        }
        if (netCallback == null) {
            return null;
        }
        netCallback.onFailure(new NetError(-9999, "account type not supported!"));
        return null;
    }

    public NetHandle renameDevice(String str, String str2, NetCallback<NetResult, NetError> netCallback) {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("newName", str2);
            jSONObject.put("did", str);
        } catch (JSONException unused) {
        }
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/device/rename").addQueries(arrayList).build();
        if (AccountDepApi.getInstance().getAccountType() == AccountType.MI) {
            return SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, netCallback);
        }
        if (netCallback == null) {
            return null;
        }
        netCallback.onFailure(new NetError(-9999, "account type not supported!"));
        return null;
    }

    public DeviceHandle rpcAsync(String str, String str2, final AsyncResponseCallback<String> asyncResponseCallback) {
        String str3;
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.has("model")) {
                String strOptString = jSONObject.optString("model");
                jSONObject.remove("model");
                str3 = strOptString;
                str2 = jSONObject.toString();
            } else {
                str3 = null;
            }
            arrayList.add(new KeyValuePair("data", str2));
            NetRequest.Builder builderAddQueries = new NetRequest.Builder().method("POST").path("/home/rpc/" + str).addQueries(arrayList);
            if (!TextUtils.isEmpty(str3)) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new KeyValuePair("MIOT-REQUEST-MODEL", str3));
                builderAddQueries.addHeaders(arrayList2);
            }
            NetRequest netRequestBuild = builderAddQueries.build();
            if (AccountDepApi.getInstance().getAccountType() != AccountType.MI) {
                if (asyncResponseCallback != null) {
                    asyncResponseCallback.onFailure(-9999, "Account type not supported!");
                }
                return null;
            }
            NetHandle netHandleSendRequest = SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceApiInternal.2
                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onCache(NetResult netResult) {
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onFailure(NetError netError) {
                    AsyncResponseCallback asyncResponseCallback2 = asyncResponseCallback;
                    if (asyncResponseCallback2 != null) {
                        asyncResponseCallback2.onFailure(netError.getCode(), netError.getDetail());
                    }
                }

                @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                public void onSuccess(NetResult netResult) {
                    AsyncResponseCallback asyncResponseCallback2 = asyncResponseCallback;
                    if (asyncResponseCallback2 != null) {
                        asyncResponseCallback2.onSuccess(netResult.mResponse);
                    }
                }
            });
            if (netHandleSendRequest != null) {
                return new DeviceHandle(netHandleSendRequest);
            }
            return null;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public DeviceHandle rpcAsync2(String str, String str2, final AsyncResponseCallback<String> asyncResponseCallback) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", str2));
        NetRequest netRequestBuild = new NetRequest.Builder().method("POST").path("/home/rpcv2/" + str).addQueries(arrayList).build();
        if (AccountDepApi.getInstance().getAccountType() != AccountType.MI) {
            if (asyncResponseCallback != null) {
                asyncResponseCallback.onFailure(-9999, "Account type not supported!");
            }
            return null;
        }
        NetHandle netHandleSendRequest = SmartHomeRc4Api.getInstance().sendRequest(netRequestBuild, new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceApiInternal.3
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                AsyncResponseCallback asyncResponseCallback2 = asyncResponseCallback;
                if (asyncResponseCallback2 != null) {
                    asyncResponseCallback2.onFailure(netError.getCode(), netError.getDetail());
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                AsyncResponseCallback asyncResponseCallback2 = asyncResponseCallback;
                if (asyncResponseCallback2 != null) {
                    asyncResponseCallback2.onSuccess(netResult.mResponse);
                }
            }
        });
        if (netHandleSendRequest != null) {
            return new DeviceHandle(netHandleSendRequest);
        }
        return null;
    }

    public NetHandle updateDeviceBatch(List<String> list, NetCallback<ArrayList<Device>, NetError> netCallback) {
        if (list == null || list.isEmpty()) {
            if (netCallback != null) {
                netCallback.onFailure(new NetError(-9999, "list empty"));
            }
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dids", jSONArray);
            jSONObject.put("get_split_device", true);
            jSONObject.put("support_smart_home", true);
            jSONObject.put("get_cariot_device", true);
            if (AccountDepApi.getInstance().getAccountType() == AccountType.MI) {
                return new DeviceListApi().updateAllDeviceList(jSONObject, netCallback);
            }
            if (netCallback != null) {
                netCallback.onFailure(new NetError(-9999, "account type not supported!"));
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
            if (netCallback != null) {
                netCallback.onFailure(new NetError(-9999, "param exception"));
            }
            return null;
        }
    }
}
