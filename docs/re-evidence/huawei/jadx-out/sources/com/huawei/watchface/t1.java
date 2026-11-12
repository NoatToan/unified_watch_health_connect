package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.watchface.mvp.model.datatype.WatchFacePayResultBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class t1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30574c;
    public String d;

    public t1(String str, String str2, String str3, String str4) {
        this.f30572a = str;
        this.f30573b = str2;
        this.f30574c = str3;
        this.d = str4;
    }

    private String e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tradeId", this.f30573b);
        linkedHashMap.put("payResult", this.f30574c);
        linkedHashMap.put("reason", this.d);
        linkedHashMap.put("productId", this.f30572a);
        String strA = a(linkedHashMap);
        HwLog.i("HitopReqPayResultThread", "getRequestParams -- mProductId:" + this.f30572a);
        return strA;
    }

    public Integer b(String str) {
        int i = -1;
        if (str == null || TextUtils.isEmpty(str)) {
            HwLog.e("HitopReqPayResultThread", "dealReceive json is empty");
            return -1;
        }
        try {
            WatchFacePayResultBean watchFacePayResultBean = (WatchFacePayResultBean) GsonHelper.fromJson(str, WatchFacePayResultBean.class);
            if (watchFacePayResultBean != null) {
                i = Integer.parseInt(watchFacePayResultBean.getResultCode());
                HwLog.i("HitopReqPayResultThread", "watchFacePayResultBean errCode = " + i);
            } else {
                HwLog.e("HitopReqPayResultThread", "dealReceive watch face unknown error!");
            }
            return Integer.valueOf(i);
        } catch (Exception e) {
            HwLog.e("HitopReqPayResultThread", "handleJsonData exception: " + HwLog.printException(e));
            return -1;
        }
    }

    public String c(String str) {
        return a(WatchFaceHttpUtil.s() + e(), str, getReqHeaders());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }
}
