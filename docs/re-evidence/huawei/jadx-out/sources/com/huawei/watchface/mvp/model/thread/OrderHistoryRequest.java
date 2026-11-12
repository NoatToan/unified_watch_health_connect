package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.c2;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.orderhistory.OrderHistoryResponse;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = TtmlNode.TAG_BODY), @d0(name = "recordCount")})
public class OrderHistoryRequest extends BaseHttpRequest<OrderHistoryResponse> {
    private LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-devicemodel", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("deviceid", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdAsTheme(true));
        linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType());
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("x-accountBrand", String.valueOf(q0.b()));
        linkedHashMap.put("x-appBrand", String.valueOf(q0.b()));
        if (WatchFaceHttpUtil.A() != null) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        linkedHashMap.put("terminalType", "1");
        c2.a(Environment.getApplicationContext()).a(linkedHashMap, d());
        return linkedHashMap;
    }

    public final String a(List list) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("byidsReq", list);
            return GsonHelper.toJson(linkedHashMap);
        } catch (Exception e) {
            HwLog.e("OrderHistoryRequest", "Exception message: " + HwLog.printException(e));
            return "";
        }
    }

    public String b(List list) {
        return a(WatchFaceHttpUtil.r(), a(list), e());
    }

    public OrderHistoryResponse b(String str) {
        if (str != null && !TextUtils.isEmpty(str)) {
            try {
                return (OrderHistoryResponse) GsonHelper.fromJson(str, OrderHistoryResponse.class);
            } catch (Exception e) {
                HwLog.e("OrderHistoryRequest", "Exception message: " + HwLog.printException(e));
                return null;
            }
        }
        HwLog.i("OrderHistoryRequest", "dealReceive json is empty");
        return null;
    }
}
