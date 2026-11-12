package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.c2;
import com.huawei.watchface.c5;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageResp;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "productInfoList")})
public class GetVipProductInfoThread extends BaseHttpRequest<VipPackageBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30358c;

    public GetVipProductInfoThread(String str) {
        this.f30356a = str;
    }

    private String f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(this.f30356a)) {
            linkedHashMap.put("productCode", this.f30356a);
        }
        linkedHashMap.put("productType", "2");
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        String strA = a(linkedHashMap);
        HwLog.i("GetVipProductInfoThread", "getRequestParams -- mProductId:" + this.f30356a);
        return strA;
    }

    public VipPackageBean b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetVipProductInfoThread", "dealReceive json is empty");
            return null;
        }
        try {
            VipPackageResp vipPackageResp = (VipPackageResp) c5.a().a(str, VipPackageResp.class);
            if (vipPackageResp != null) {
                HwLog.i("GetVipProductInfoThread", "receive");
                if (vipPackageResp.getProductInfoList() != null && !vipPackageResp.getProductInfoList().isEmpty()) {
                    return vipPackageResp.getProductInfoList().get(0);
                }
            }
        } catch (JsonSyntaxException e) {
            HwLog.e("GetVipProductInfoThread", "dealReceive " + HwLog.printException((Exception) e));
        }
        return null;
    }

    public String c(String str) {
        HwLog.i("GetVipProductInfoThread", "getResponse url");
        return a(WatchFaceHttpUtil.z() + f(), "", e());
    }

    public void d(String str) {
        this.f30358c = str;
    }

    public void e(String str) {
        this.f30357b = str;
    }

    private LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0));
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-devicemodel", !TextUtils.isEmpty(this.f30358c) ? this.f30358c : HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("deviceid", q0.e());
        linkedHashMap.put("deviceType", "5");
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("x-accountBrand", String.valueOf(q0.b()));
        linkedHashMap.put("x-appBrand", String.valueOf(q0.b()));
        linkedHashMap.put(WatchFaceConstant.X_UID, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getUserId());
        linkedHashMap.put("Content-Type", "application/json");
        if (!TextUtils.isEmpty(this.f30357b)) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, this.f30357b);
        } else if (WatchFaceHttpUtil.A() != null) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        linkedHashMap.put("terminalType", "1");
        linkedHashMap.put(WatchFaceConstant.CIPHER_VERSION, "2");
        c2.a(Environment.getApplicationContext()).a(linkedHashMap, d());
        return linkedHashMap;
    }
}
