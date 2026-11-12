package com.smarthome.core.device;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.smarthome.core.SmartCallBack;
import com.smarthome.core.SmartHomeSDK;
import com.xiaomi.smarthome.core.entity.net.KeyValuePair;
import com.xiaomi.smarthome.core.entity.net.NetError;
import com.xiaomi.smarthome.core.entity.net.NetRequest;
import com.xiaomi.smarthome.core.entity.net.NetResult;
import com.xiaomi.smarthome.core.server.internal.NetCallback;
import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.device.Device;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import defpackage.t86;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b \u0010!J+\u0010\b\u001a\u00020\u00072\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ;\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/smarthome/core/device/SmartDeviceManager;", "", "Lcom/smarthome/core/SmartCallBack;", "Ljava/util/ArrayList;", "Lcom/xiaomi/smarthome/device/Device;", "Lkotlin/collections/ArrayList;", "smartCallBack", "", "refreshDeviceList", "(Lcom/smarthome/core/SmartCallBack;)V", "", "pathValue", "methodValue", "queryParamsValue", "callback", "callSmartHomeApi", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/smarthome/core/SmartCallBack;)V", "did", "enableXiaoAiBleSwitch", "(Ljava/lang/String;Lcom/smarthome/core/SmartCallBack;)V", "Landroid/os/Handler;", "mUIHandler", "Landroid/os/Handler;", "getMUIHandler", "()Landroid/os/Handler;", "setMUIHandler", "(Landroid/os/Handler;)V", "TAG", "Ljava/lang/String;", "Lt86;", "deviceListApi", "Lt86;", "<init>", "()V", "smarthome-core_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"StaticFieldLeak"})
public final class SmartDeviceManager {

    @NotNull
    private Handler mUIHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private final String TAG = "SmartDeviceManager";

    @NotNull
    private final t86 deviceListApi = new t86();

    public final void callSmartHomeApi(@Nullable String pathValue, @Nullable String methodValue, @Nullable String queryParamsValue, @Nullable final SmartCallBack<String> callback) {
        SmartHomeSDK smartHomeSDK = SmartHomeSDK.INSTANCE;
        if (!smartHomeSDK.isInit$smarthome_core_release()) {
            if (callback == null) {
                return;
            }
            callback.onFailure(-1, "sdk not init");
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (queryParamsValue == null) {
            queryParamsValue = new JSONObject().toString();
        }
        if (TextUtils.isEmpty(methodValue)) {
            methodValue = "GET";
        }
        arrayList.add(new KeyValuePair("data", queryParamsValue));
        SmartHomeRc4Api.getInstance(smartHomeSDK.getContext()).sendRequest(new NetRequest.Builder().method(methodValue).path(pathValue).addQueries(arrayList).build(), new NetCallback<NetResult, NetError>() { // from class: com.smarthome.core.device.SmartDeviceManager.callSmartHomeApi.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(@Nullable NetResult result) {
                String str;
                SmartCallBack<String> smartCallBack = callback;
                if (smartCallBack == null) {
                    return;
                }
                String str2 = "";
                if (result != null && (str = result.mResponse) != null) {
                    str2 = str;
                }
                smartCallBack.onSuccess(str2);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(@Nullable NetError error) {
                String detail;
                SmartCallBack<String> smartCallBack = callback;
                if (smartCallBack == null) {
                    return;
                }
                int code = error == null ? -1 : error.getCode();
                String str = "";
                if (error != null && (detail = error.getDetail()) != null) {
                    str = detail;
                }
                smartCallBack.onFailure(code, str);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(@Nullable NetResult result) {
                String str;
                SmartCallBack<String> smartCallBack = callback;
                if (smartCallBack == null) {
                    return;
                }
                String str2 = "";
                if (result != null && (str = result.mResponse) != null) {
                    str2 = str;
                }
                smartCallBack.onSuccess(str2);
            }
        });
    }

    public final void enableXiaoAiBleSwitch(@NotNull String did, @Nullable SmartCallBack<String> callback) throws JSONException {
        Intrinsics.checkNotNullParameter(did, "did");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(did);
        jSONObject.put("dids", jSONArray);
        callSmartHomeApi("/v2/device/enable_xiaoai_ble_switch", "POST", jSONObject.toString(), callback);
    }

    @NotNull
    public final Handler getMUIHandler() {
        return this.mUIHandler;
    }

    public final void refreshDeviceList(@NotNull final SmartCallBack<ArrayList<Device>> smartCallBack) {
        Intrinsics.checkNotNullParameter(smartCallBack, "smartCallBack");
        this.deviceListApi.b(new NetCallback<ArrayList<Device>, NetError>() { // from class: com.smarthome.core.device.SmartDeviceManager.refreshDeviceList.1
            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onCache(@Nullable ArrayList<Device> result) {
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onFailure(@Nullable NetError error) {
                MiJiaLog.writeLogOnAll(LogType.DEVICE_LIST, this.TAG, Intrinsics.stringPlus("refreshDeviceList onFailure ", error));
                if (error == null) {
                    smartCallBack.onFailure(-1, AbstractJsonLexerKt.NULL);
                    return;
                }
                SmartCallBack<ArrayList<Device>> smartCallBack2 = smartCallBack;
                int code = error.getCode();
                String string = error.toString();
                Intrinsics.checkNotNullExpressionValue(string, "error.toString()");
                smartCallBack2.onFailure(code, string);
            }

            @Override // com.xiaomi.smarthome.core.server.internal.NetCallback
            public void onSuccess(@Nullable ArrayList<Device> result) {
                if (result != null) {
                    smartCallBack.onSuccess(result);
                } else {
                    smartCallBack.onFailure(-1, AbstractJsonLexerKt.NULL);
                }
            }
        });
    }

    public final void setMUIHandler(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.mUIHandler = handler;
    }
}
