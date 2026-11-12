package com.xiaomi.hm.health.discovery.jsbridge.function;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.discovery.bridge.jsbridge.JsBridgeError;
import com.huami.discovery.bridge.jsbridge.JsCallBackFunction;
import com.huami.discovery.bridge.jsbridge.api.ApiHandler;
import com.huami.discovery.bridge.jsbridge.common.ErrorMessage;
import com.huami.nfc.web.Constant;
import com.huami.tools.log.HMLog;
import com.huami.utils.easypermission.EasyPermissions;
import com.xiaomi.hm.health.discovery.jsbridge.function.GetLocationHandler;
import com.xiaomi.hm.health.locweather.LocWeatherKeeper;
import com.xiaomi.hm.health.locweather.LocWeatherManager;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public class GetLocationHandler implements ApiHandler {
    private static final float b = -1000.0f;
    private static final String c = "GetLocationHandler";
    private final Context a;

    public GetLocationHandler(Context context) {
        this.a = context;
    }

    private boolean c() {
        return EasyPermissions.hasPermissions(this.a, "android.permission.ACCESS_COARSE_LOCATION") || EasyPermissions.hasPermissions(this.a, "android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d(JSONException jSONException) {
        return "JSONException:" + jSONException.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(JSONObject jSONObject) {
        return "getLocation:" + jSONObject;
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public ErrorMessage getFailedResult() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:7:0x0026  */
    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public void handleData(String data, JsCallBackFunction function) {
        String str;
        String str2;
        String str3;
        float f;
        float f2;
        String str4;
        String locationAddressCode = LocWeatherManager.getInstance().getLocationAddressCode();
        String lastLocationStr = LocWeatherKeeper.getLastLocationStr();
        String str5 = "";
        if (TextUtils.isEmpty(lastLocationStr)) {
            str = "";
            str2 = str;
        } else {
            String[] strArrSplit = lastLocationStr.split(",");
            if (strArrSplit.length > 1) {
                str2 = strArrSplit[0];
                str = strArrSplit[1];
            } else {
                str = "";
                str2 = str;
            }
        }
        String lastLocationDetail = LocWeatherKeeper.getLastLocationDetail();
        if (TextUtils.isEmpty(lastLocationDetail)) {
            str3 = "";
            f = b;
            f2 = b;
        } else {
            String[] strArrSplit2 = lastLocationDetail.split(",");
            if (strArrSplit2.length > 3) {
                try {
                    f2 = Float.parseFloat(strArrSplit2[0]);
                    try {
                        f = Float.parseFloat(strArrSplit2[1]);
                        try {
                            str4 = strArrSplit2[2];
                            try {
                                str5 = strArrSplit2[3];
                            } catch (NumberFormatException e) {
                                e = e;
                                e.printStackTrace();
                            }
                        } catch (NumberFormatException e2) {
                            e = e2;
                            str4 = "";
                        }
                    } catch (NumberFormatException e3) {
                        e = e3;
                        str4 = "";
                        f = b;
                    }
                } catch (NumberFormatException e4) {
                    e = e4;
                    str4 = "";
                    f = b;
                    f2 = b;
                }
                str3 = str5;
                str5 = str4;
            } else {
                str3 = "";
                f = b;
                f2 = b;
            }
        }
        if (f2 == b || f == b) {
            if (c()) {
                function.onCallBack(new JsBridgeError(JsBridgeError.ERR_CODE_LOCATTION_NULL, new String[0]).toString());
                return;
            } else {
                function.onCallBack(new JsBridgeError(JsBridgeError.ERR_CODE_LOCATTION_PERMISSION, new String[0]).toString());
                return;
            }
        }
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constant.KEY_LATITUDE, f2);
            jSONObject.put(Constant.KEY_LONGITUDE, f);
            jSONObject.put("country", str5);
            jSONObject.put("province", str2);
            jSONObject.put("city", str);
            jSONObject.put("adcode", locationAddressCode);
            jSONObject.put(IntegrityManager.INTEGRITY_TYPE_ADDRESS, str3);
        } catch (JSONException e5) {
            HMLog.debug(c, new Function0() { // from class: qf2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetLocationHandler.d(e5);
                }
            });
            e5.printStackTrace();
        }
        HMLog.debug(c, new Function0() { // from class: rf2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLocationHandler.e(jSONObject);
            }
        });
        function.onCallBack(jSONObject.toString());
    }

    @Override // com.huami.discovery.bridge.jsbridge.api.ApiHandler
    public boolean handleData(String data) {
        return false;
    }
}
