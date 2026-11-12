package com.huami.watch.companion.eid;

import android.content.Context;
import android.os.Build;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.nfc.base.PayResponse;
import com.huami.nfc.bus.ConstantKt;
import com.huami.nfc.eid.ConsatntKt;
import com.huami.nfc.web.PayHeaderKt;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceSource;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.util.Log;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;
import okhttp3.Response;

/* JADX INFO: loaded from: classes16.dex */
public class EidDeviceUtil {
    private static final String a = "EidDeviceUtil";

    public class a extends TypeToken<PayResponse<Void>> {
    }

    public static boolean isSupportEid(Context context) {
        return isSupportEid(DeviceManager.getManager(context).getCurrentDevice());
    }

    public static PayResponse<Void> revoke(Context context) throws Exception {
        Map<String, String> systemHeader = HMWebUtil.getSystemHeader();
        systemHeader.put("clientId", String.valueOf(HMAppConfig.APP_ID));
        systemHeader.put("x-snbps-product-type", ConsatntKt.EID_PRODUCT_TYPE);
        systemHeader.put(PayHeaderKt.HEADER_CPLC, "0");
        systemHeader.put(PayHeaderKt.HEADER_MODEL, "huami");
        systemHeader.put(PayHeaderKt.HEADER_IMEI, "0");
        systemHeader.put(PayHeaderKt.HEADER_ROM_VERSION, Constants.VIA_REPORT_TYPE_CHAT_VIDEO);
        systemHeader.put(PayHeaderKt.HEADER_OS_VERSION, "" + Build.VERSION.SDK_INT);
        systemHeader.put("Content-Type", "application/json");
        HashMap map = new HashMap(4);
        map.put(ConstantKt.KEY_APP_CODE, ConsatntKt.APP_CODE_EID);
        map.put("product_sub_type", "1");
        map.put(ShareConstants.WEB_DIALOG_PARAM_ACTION_TYPE, "revoke");
        map.put("bizSerialNo", "");
        Gson gson = new Gson();
        Response responseDoRequest = CloudClient.doRequest(context, CloudClient.newPost(HMServerDef.getUrl("nfc/card/init"), systemHeader, gson.toJson(map)));
        String strResponseBodyString = CloudClient.responseBodyString(responseDoRequest);
        Log.i(a, "bodyString:" + strResponseBodyString, new Object[0]);
        if (responseDoRequest.isSuccessful()) {
            return (PayResponse) gson.fromJson(strResponseBodyString, new a().getType());
        }
        return PayResponse.error("" + responseDoRequest.code(), null);
    }

    public static boolean isSupportEid(Device device) {
        if (device == null) {
            return false;
        }
        if (DeviceSource.isModelQogirMainland(device)) {
            return DeviceUtil.isRomSupport(device, new String[]{"3", "0", "50", "0"});
        }
        if (DeviceSource.isModelXihu(device)) {
            if (DeviceSource.isModelXihuDisney(device)) {
                return DeviceUtil.isRomSupport(device, new String[]{"1", "3", Constants.VIA_REPORT_TYPE_START_WAP, "5"});
            }
            return DeviceUtil.isRomSupport(device, new String[]{"1", "0", Constants.VIA_REPORT_TYPE_START_WAP, "5"});
        }
        if (DeviceSource.isModelXihuE(device)) {
            return DeviceUtil.isRomSupport(device, new String[]{"1", "1", Constants.VIA_REPORT_TYPE_START_WAP, "5"});
        }
        return false;
    }
}
