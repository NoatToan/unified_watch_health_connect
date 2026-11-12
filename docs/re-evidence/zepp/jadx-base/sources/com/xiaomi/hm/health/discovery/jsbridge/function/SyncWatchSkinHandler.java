package com.xiaomi.hm.health.discovery.jsbridge.function;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinConstant;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinDetailDialog;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinInfo;
import com.xiaomi.hm.health.discovery.jsbridge.function.SyncWatchSkinHandler;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
public class SyncWatchSkinHandler implements ApiHandler {
    public static final long CACHE_SYNC_SUCCESS_CODE = 2001002;
    public static final String CACHE_SYNC_SUCCESS_MSG = "Use Cache file and sync success.";
    public static final long DEVICE_CONN_ERROR_CODE = 4041001;
    public static final String DEVICE_CONN_ERROR_MSG = "Miss connecting.";
    public static final long DOWNLOAD_ERROR_CODE = 4001001;
    public static final String DOWNLOAD_ERROR_MSG = "Download failed.";
    public static final long DOWNLOAD_SYNC_SUCCESS_CODE = 2001001;
    public static final String DOWNLOAD_SYNC_SUCCESS_MSG = "Download and sync success.";
    public static final long NET_ERROR_CODE = 4000001;
    public static final String NET_ERROR_MSG = "Network is disconnected.";
    public static final long SYNC_ERROR_CODE = 4001002;
    public static final String SYNC_ERROR_MSG = "Sync failure.";
    private static final String c = "SyncWatchSkinHandler";
    private static final Lazy<DeviceUtilsApi> d = KoinJavaComponent.inject(DeviceUtilsApi.class);
    private Context a;
    private a b;

    public interface a {
        void a(WatchSkinInfo watchSkinInfo, JsCallBackFunction jsCallBackFunction);
    }

    public SyncWatchSkinHandler(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c() {
        return "dialog showing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d() {
        return "currentActivity is not FragmentActivity.";
    }

    private void e(WatchSkinInfo watchSkinInfo, JsCallBackFunction jsCallBackFunction) {
        if (WatchSkinDetailDialog.SHOWING) {
            HMLog.info(c, new Function0() { // from class: dk7
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SyncWatchSkinHandler.c();
                }
            });
            return;
        }
        Activity topActivity = DeviceXFunctionsKt.getAppStateApi().getTopActivity();
        if (!(topActivity instanceof FragmentActivity)) {
            HMLog.info(c, new Function0() { // from class: ck7
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return SyncWatchSkinHandler.d();
                }
            });
            return;
        }
        WatchSkinDetailDialog.SHOWING = true;
        WatchSkinDetailDialog watchSkinDetailDialog = new WatchSkinDetailDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable(WatchSkinConstant.ARGS_SKIN_INFO, watchSkinInfo);
        watchSkinDetailDialog.setArguments(bundle);
        watchSkinDetailDialog.setFunction(jsCallBackFunction);
        ((FragmentActivity) topActivity).getSupportFragmentManager().beginTransaction().add(watchSkinDetailDialog, "watchSkinDetailDialog").commitAllowingStateLoss();
    }

    public static String getError(long j, String str) {
        JsBridgeError jsBridgeError = new JsBridgeError();
        jsBridgeError.errorCode = j;
        jsBridgeError.errorMessage = str;
        return d.getValue().getGson().toJson(jsBridgeError);
    }

    public static String getSuccess(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "success");
            jSONObject.put("code", String.valueOf(j));
            jSONObject.put("message", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return null;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String str, JsCallBackFunction jsCallBackFunction) {
        HMLog.i(c, "syncWatchSkin data: " + str, new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject(str);
            WatchSkinInfo watchSkinInfo = new WatchSkinInfo();
            watchSkinInfo.deviceType = jSONObject.optString("device_type");
            watchSkinInfo.downloads = jSONObject.optInt("downloads");
            watchSkinInfo.name = jSONObject.optString("name");
            watchSkinInfo.skinBin = jSONObject.optString("skin_bin");
            watchSkinInfo.skinSize = jSONObject.optString("skin_size");
            watchSkinInfo.fwVersion = jSONObject.optString("minimum_version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("thumbnails");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                HMLog.i(c, "watch skin thumbnail is null!", new Object[0]);
            } else {
                watchSkinInfo.thumbnails = new String[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    watchSkinInfo.thumbnails[i] = jSONArrayOptJSONArray.getString(i);
                }
            }
            a aVar = this.b;
            if (aVar == null) {
                e(watchSkinInfo, jsCallBackFunction);
            } else {
                aVar.a(watchSkinInfo, jsCallBackFunction);
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsCallBackFunction.onCallBack(d.getValue().getGson().toJson(JsBridgeError.jsonParseError()));
            IconToast.showError(this.a, R.string.load_error);
        }
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String str) {
        return false;
    }

    public void setSyncWatchSkin(a aVar) {
        this.b = aVar;
    }
}
