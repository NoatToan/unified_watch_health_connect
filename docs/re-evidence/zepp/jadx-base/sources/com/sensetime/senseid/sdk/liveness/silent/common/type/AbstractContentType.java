package com.sensetime.senseid.sdk.liveness.silent.common.type;

import android.os.Build;
import com.sensetime.senseid.sdk.liveness.silent.common.util.DeviceUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.cybergarage.upnp.RootDescription;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractContentType {
    public static final String PARAM_DURATION = "duration";
    public static final String PARAM_RESULT = "result";
    public static final String PARAM_SDK_VERSION = "sdk_ver";
    public static final int RESULT_MISS = 3;
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_TIMEOUT = 2;

    public JSONObject generateCommonContentJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", URLEncoder.encode(Build.MANUFACTURER + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.DEVICE, "UTF-8"));
            jSONObject.put(com.tencent.connect.common.Constants.PARAM_PLATFORM, 1);
            jSONObject.put("sys_ver", Build.VERSION.RELEASE);
            jSONObject.put(RootDescription.ROOT_ELEMENT, DeviceUtil.isRoot());
        } catch (UnsupportedEncodingException | JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public abstract JSONObject generateContentJson(long j, int i, String str);
}
