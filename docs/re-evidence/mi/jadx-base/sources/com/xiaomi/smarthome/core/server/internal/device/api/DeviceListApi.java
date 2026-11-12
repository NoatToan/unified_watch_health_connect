package com.xiaomi.smarthome.core.server.internal.device.api;

import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.device.DeviceFactory;
import com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi;
import com.xiaomi.smarthome.core.server.internal.homeroom.CoreSharedHomeManager;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.bg4;
import defpackage.cua;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.v4h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceListApi {
    private static final String TAG = "DeviceListApi";
    private volatile NetHandle mNetHandle;

    private void cancel() {
        if (this.mNetHandle != null) {
            synchronized (this) {
                try {
                    if (this.mNetHandle != null) {
                        this.mNetHandle.cancel();
                        this.mNetHandle = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static NetRequest getNetRequest(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ArrayList lambda$updateAllDeviceList$0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) throws Exception {
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateAllDeviceList$1(NetCallback netCallback, ArrayList arrayList) throws Exception {
        netCallback.onSuccess(arrayList);
        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "updateAllDeviceList onSuccess size:" + arrayList.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$updateAllDeviceList$2(NetCallback netCallback, Throwable th) throws Exception {
        String stackTraceString = Log.getStackTraceString(th);
        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "updateAllDeviceList onFailure error:" + stackTraceString);
        netCallback.onFailure(new NetError(-1, stackTraceString));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateLocalDeviceList$3(final v4h v4hVar) throws Exception {
        SmartHomeRc4Api.getInstance().sendRequest(getNetRequest(new JSONObject(), "/v2/home/local_device_list"), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi.2
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(NetResult netResult) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(NetError netError) {
                MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, DeviceListApi.TAG, "core /v2/home/local_device_list onFailure error:" + netError);
                v4hVar.a(new Exception(String.valueOf(netError)));
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(NetResult netResult) {
                if (netResult == null || netResult.mResponse == null) {
                    MiJiaLog.writeLogOnGrey(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/local_device_list result.mResponse null");
                    v4hVar.a(new Exception("result.mResponse null"));
                    return;
                }
                try {
                    ArrayList arrayList = new ArrayList();
                    JSONObject jSONObject = new JSONObject(netResult.mResponse);
                    int iOptInt = jSONObject.optInt("code");
                    if (iOptInt != ErrorCode.SUCCESS.getCode()) {
                        MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, DeviceListApi.TAG, "core /v2/home/local_device_list onSuccess error errorCode=" + iOptInt);
                        v4hVar.a(new Exception("core /v2/home/local_device_list onSuccess error errorCode=" + iOptInt));
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                    if (jSONObjectOptJSONObject != null) {
                        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("local_list");
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("third_list");
                        if (jSONArrayOptJSONArray != null) {
                            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                                if (jSONObjectOptJSONObject2 != null) {
                                    arrayList.add(DeviceFactory.createDevice(jSONObjectOptJSONObject2));
                                }
                            }
                        }
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                                if (jSONObjectOptJSONObject3 != null) {
                                    arrayList.add(DeviceFactory.createDevice(jSONObjectOptJSONObject3));
                                }
                            }
                        }
                        MiJiaLog.writeLogOnGrey(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/local_device_list onSuccess size:" + arrayList.size());
                    } else {
                        MiJiaLog.writeLogOnGrey(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/local_device_list onSuccess result:" + netResult.mResponse);
                    }
                    v4hVar.onNext(arrayList);
                    v4hVar.onComplete();
                } catch (Exception e) {
                    MiJiaLog.writeLogOnGrey(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/local_device_list Exception result:" + netResult.mResponse);
                    v4hVar.a(e);
                }
            }
        });
    }

    private o4h<ArrayList<Device>> updateBindDeviceList(final JSONObject jSONObject) {
        MiJiaLog.writeLogOnAll(LogType.NETWORK, TAG, "updateBindDeviceList core /v2/home/device_list_page");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        return o4h.f(new j5h<ArrayList<Device>>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi.4
            @Override // defpackage.j5h
            public void subscribe(final v4h<ArrayList<Device>> v4hVar) throws Exception {
                SmartHomeRc4Api.getInstance().sendRequest(DeviceListApi.getNetRequest(jSONObject, "/v2/home/device_list_page"), new NetCallback<NetResult, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi.4.1
                    private final ArrayList<Device> result = new ArrayList<>();

                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                    public void onCache(NetResult netResult) {
                    }

                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                    public void onFailure(NetError netError) {
                        MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, DeviceListApi.TAG, "core /v2/home/device_list_page onFailure times:" + this.result.size() + " " + netError);
                        v4hVar.a(new Exception("updateBindDeviceList onFailure null error"));
                    }

                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                    public void onSuccess(NetResult netResult) {
                        if (netResult == null || TextUtils.isEmpty(netResult.mResponse)) {
                            MiJiaLog.writeLogOnAll(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/device_list_page no netResult times:" + this.result.size() + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                            v4hVar.onNext(this.result);
                            v4hVar.onComplete();
                            return;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject(netResult.mResponse);
                            int iOptInt = jSONObject2.optInt("code");
                            if (iOptInt != ErrorCode.SUCCESS.getCode()) {
                                MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, DeviceListApi.TAG, "core /v2/home/device_list_page error errorCode=" + iOptInt);
                                v4hVar.a(new Exception("updateBindDeviceList error errorCode " + iOptInt));
                                return;
                            }
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("result");
                            if (jSONObjectOptJSONObject == null) {
                                MiJiaLog.writeLogOnAll(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/device_list_page resultObject null times:" + this.result.size() + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                                v4hVar.onNext(this.result);
                                v4hVar.onComplete();
                                return;
                            }
                            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list");
                            if (jSONArrayOptJSONArray != null) {
                                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                                    if (jSONObjectOptJSONObject2 != null) {
                                        this.result.add(DeviceFactory.createDevice(jSONObjectOptJSONObject2));
                                    }
                                }
                            }
                            LogType logType = LogType.NETWORK;
                            StringBuilder sb = new StringBuilder();
                            sb.append("core /v2/home/device_list_page content:list=");
                            sb.append(jSONArrayOptJSONArray == null ? null : Integer.valueOf(jSONArrayOptJSONArray.length()));
                            sb.append(",has_more=");
                            sb.append(jSONObjectOptJSONObject.optBoolean("has_more"));
                            MiJiaLog.writeLogOnAll(logType, DeviceListApi.TAG, sb.toString());
                            if (jSONObjectOptJSONObject.optBoolean("has_more")) {
                                String strOptString = jSONObjectOptJSONObject.optString("next_start_did");
                                MiJiaLog.writeLogOnGrey(logType, DeviceListApi.TAG, "core /v2/home/device_list_page request next page with did:" + strOptString);
                                jSONObject.put("start_did", strOptString);
                                SmartHomeRc4Api.getInstance().sendRequest(DeviceListApi.getNetRequest(jSONObject, "/v2/home/device_list_page"), this);
                                return;
                            }
                            MiJiaLog.writeLogOnAll(logType, DeviceListApi.TAG, "core /v2/home/device_list_page success times:" + this.result.size() + " time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                            v4hVar.onNext(this.result);
                            v4hVar.onComplete();
                        } catch (JSONException e) {
                            MiJiaLog.writeLogOnAll(LogType.NETWORK, DeviceListApi.TAG, "core /v2/home/device_list_page JSONException times:" + this.result.size());
                            v4hVar.a(e);
                        }
                    }
                });
            }
        });
    }

    private o4h<ArrayList<Device>> updateLocalDeviceList() {
        MiJiaLog.writeLogOnGrey(LogType.NETWORK, TAG, "updateLocalDeviceList core /v2/home/local_device_list");
        return o4h.f(new j5h() { // from class: s86
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f33398a.lambda$updateLocalDeviceList$3(v4hVar);
            }
        });
    }

    private o4h<ArrayList<Device>> updateSharedHomeDeviceList() {
        return o4h.f(new j5h<ArrayList<Device>>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi.3
            @Override // defpackage.j5h
            public void subscribe(final v4h<ArrayList<Device>> v4hVar) throws Exception {
                CoreSharedHomeManager.getInstance().updateSharedHomeDeviceList(new NetCallback<ArrayList<Device>, NetError>() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi.3.1
                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                    public void onCache(ArrayList<Device> arrayList) {
                    }

                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                    public void onFailure(NetError netError) {
                        String str;
                        LogType logType = LogType.DEVICE_LIST;
                        StringBuilder sb = new StringBuilder();
                        sb.append("updateSharedHomeDeviceList onFailure ");
                        if (netError == null) {
                            str = null;
                        } else {
                            str = netError.getCode() + ":" + netError.getDetail();
                        }
                        sb.append(str);
                        MiJiaLog.writeLogOnAll(logType, DeviceListApi.TAG, sb.toString());
                        v4hVar.a(new Exception(String.valueOf(netError)));
                    }

                    @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
                    public void onSuccess(ArrayList<Device> arrayList) {
                        MiJiaLog.writeLogOnAll(LogType.HOME_ROOM, DeviceListApi.TAG, "updateSharedHomeDeviceList onSuccess");
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        v4hVar.onNext(arrayList);
                        v4hVar.onComplete();
                    }
                });
            }
        });
    }

    public NetHandle updateAllDeviceList(JSONObject jSONObject, final NetCallback<ArrayList<Device>, NetError> netCallback) {
        cancel();
        final jz6 jz6VarO = o4h.h0(updateBindDeviceList(jSONObject), updateLocalDeviceList(), updateSharedHomeDeviceList(), new cua() { // from class: p86
            @Override // defpackage.cua
            public final Object a(Object obj, Object obj2, Object obj3) {
                return DeviceListApi.lambda$updateAllDeviceList$0((ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3);
            }
        }).O(new bg4() { // from class: q86
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                DeviceListApi.lambda$updateAllDeviceList$1(netCallback, (ArrayList) obj);
            }
        }, new bg4() { // from class: r86
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                DeviceListApi.lambda$updateAllDeviceList$2(netCallback, (Throwable) obj);
            }
        });
        return new NetHandle.NetHandleWrap() { // from class: com.xiaomi.smarthome.core.server.internal.device.api.DeviceListApi.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetHandle.NetHandleWrap, com.xiaomi.smarthome.core.server.internal.NetHandle, com.xiaomi.smarthome.frame.cancel.Cancelable
            public void cancel() {
                MiJiaLog.writeLogOnAll(LogType.NETWORK, DeviceListApi.TAG, "updateAllDeviceList onFailure cancel");
                netCallback.onFailure(new NetError(-1, BroadcastsKt.SILENT_PUSHING_CANCEL));
                super.cancel();
                jz6VarO.dispose();
            }
        };
    }
}
