package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.smarthome.core.SmartHomeSDK;
import com.xiaomi.fitness.devicesettings.bluttooth.wearmode.SwitchWearModeViewModel;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.NetHandle;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.core.server.internal.device.DeviceFactory;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.frame.ErrorCode;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class t86 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NetHandle f34443a;

    public class a implements NetCallback<NetResult, NetError> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList<Device> f34444a = new ArrayList<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NetCallback f34445b;
        public final /* synthetic */ JSONObject c;

        public a(NetCallback netCallback, JSONObject jSONObject) {
            this.f34445b = netCallback;
            this.c = jSONObject;
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCache(NetResult netResult) {
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onFailure(NetError netError) {
            StringBuilder sb = new StringBuilder();
            sb.append("core /v2/home/device_list_page onFailure times:");
            sb.append(this.f34444a.size());
            if (this.f34445b != null) {
                if (netError == null) {
                    netError = new NetError(SwitchWearModeViewModel.EXIT_ACCESSORY_MODE, "NetError fail");
                }
                this.f34445b.onFailure(new NetError(netError.getCode(), netError.getDetail()));
            }
        }

        @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onSuccess(NetResult netResult) {
            if (netResult == null || TextUtils.isEmpty(netResult.mResponse)) {
                StringBuilder sb = new StringBuilder();
                sb.append("core /v2/home/device_list_page no netResult times:");
                sb.append(this.f34444a.size());
                NetCallback netCallback = this.f34445b;
                if (netCallback != null) {
                    netCallback.onSuccess(this.f34444a);
                    return;
                }
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(netResult.mResponse);
                int iOptInt = jSONObject.optInt("code");
                if (iOptInt != ErrorCode.SUCCESS.getCode()) {
                    MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, "DeviceListApi", "core /v2/home/device_list_page error errorCode=" + iOptInt);
                    NetCallback netCallback2 = this.f34445b;
                    if (netCallback2 != null) {
                        netCallback2.onFailure(new NetError(iOptInt, ""));
                        return;
                    }
                    return;
                }
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
                if (jSONObjectOptJSONObject == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("core /v2/home/device_list_page resultObject null times:");
                    sb2.append(this.f34444a.size());
                    NetCallback netCallback3 = this.f34445b;
                    if (netCallback3 != null) {
                        netCallback3.onSuccess(this.f34444a);
                        return;
                    }
                    return;
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("list");
                if (jSONArrayOptJSONArray != null) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject2 != null) {
                            this.f34444a.add(DeviceFactory.createDevice(jSONObjectOptJSONObject2));
                        }
                    }
                }
                if (jSONObjectOptJSONObject.optBoolean("has_more")) {
                    String strOptString = jSONObjectOptJSONObject.optString("next_start_did");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("core /v2/home/device_list_page request next page with did:");
                    sb3.append(strOptString);
                    this.c.put("start_did", strOptString);
                    SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(t86.a(this.c, "/v2/user/device_list_page"), this);
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("core /v2/home/device_list_page success times:");
                sb4.append(this.f34444a.size());
                NetCallback netCallback4 = this.f34445b;
                if (netCallback4 != null) {
                    netCallback4.onSuccess(this.f34444a);
                }
            } catch (JSONException e) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("core /v2/home/device_list_page JSONException times:");
                sb5.append(this.f34444a.size());
                NetCallback netCallback5 = this.f34445b;
                if (netCallback5 != null) {
                    netCallback5.onFailure(new NetError(-1, Log.getStackTraceString(e)));
                }
            }
        }
    }

    public static NetRequest a(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new KeyValuePair("data", jSONObject.toString()));
        return new NetRequest.Builder().method("POST").path(str).addQueries(arrayList).build();
    }

    public NetHandle b(NetCallback<ArrayList<Device>, NetError> netCallback) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("getVirtualModel", false);
        } catch (JSONException unused) {
        }
        NetHandle netHandleSendRequest = SmartHomeRc4Api.getInstance(SmartHomeSDK.INSTANCE.getContext()).sendRequest(a(jSONObject, "/v2/user/device_list_page"), new a(netCallback, jSONObject));
        this.f34443a = netHandleSendRequest;
        return netHandleSendRequest;
    }
}
