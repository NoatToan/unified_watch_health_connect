package com.huawei.watchface;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.DetailedCreativeType;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.PayIap4InfoCn;
import com.huawei.watchface.mvp.model.datatype.VipOrderBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.tencent.open.SocialOperation;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class x0 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VipPackageBean f30649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30651c;
    public String d;

    public class a extends TypeToken<VipOrderBean<PayIap4InfoCn>> {
        public a(x0 x0Var) {
        }
    }

    public x0(VipPackageBean vipPackageBean, String str) {
        this.f30649a = vipPackageBean;
        this.f30650b = str;
    }

    public VipOrderBean b(String str) {
        Exception e;
        VipOrderBean vipOrderBean = null;
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetJoinCnVipIAP4Thread", "dealReceive json is empty");
            return null;
        }
        try {
            VipOrderBean vipOrderBean2 = (VipOrderBean) c5.a().a(str, new a(this).getType());
            try {
                if (vipOrderBean2 == null) {
                    HwLog.i("GetJoinCnVipIAP4Thread", "dealReceive vipOrderIAP4Bean is null");
                    return null;
                }
                HwLog.i("GetJoinCnVipIAP4Thread", "dealReceive vipOrderIAP4Bean resultInfo :" + vipOrderBean2.getResultinfo() + " code:" + vipOrderBean2.getResultcode());
                return vipOrderBean2;
            } catch (Exception e2) {
                e = e2;
                vipOrderBean = vipOrderBean2;
                HwLog.e("GetJoinCnVipIAP4Thread", "dealReceive " + HwLog.printException(e));
                return vipOrderBean;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f30651c = str;
    }

    public LinkedHashMap e() {
        LinkedHashMap<String, String> reqHeaders = super.getReqHeaders();
        reqHeaders.put("x-devicemodel", !TextUtils.isEmpty(this.d) ? this.d : HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        reqHeaders.put("x-brandChannel", String.valueOf(q0.d()));
        reqHeaders.put("x-accountBrand", String.valueOf(q0.b()));
        reqHeaders.put(ProfileRequestConstants.X_LANGUAGE_KEY, LanguageUtils.a(false));
        reqHeaders.put("x-appBrand", String.valueOf(q0.b()));
        reqHeaders.put("deviceid", q0.e());
        reqHeaders.put("deviceType", "5");
        if (!TextUtils.isEmpty(this.f30651c)) {
            reqHeaders.put(WatchFaceConstant.X_SIGN, this.f30651c);
        }
        reqHeaders.put("Content-Type", "application/json");
        reqHeaders.remove("usertoken");
        reqHeaders.remove("authtype");
        reqHeaders.remove("versionCode");
        reqHeaders.put("x-osversion", HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion());
        reqHeaders.put("x-phonetype", MobileInfoHelper.getDeviceName());
        reqHeaders.put("x-screen", a4.a());
        reqHeaders.put("x-clienttype", "1");
        reqHeaders.put("x-ostype", "emui");
        reqHeaders.put("x-servicetype", "health");
        reqHeaders.put("x-versioncode", CommonUtils.getVersionCode() + "");
        c2.a(Environment.getApplicationContext()).b(reqHeaders, d());
        return reqHeaders;
    }

    public String f() {
        return GsonHelper.toJson(g());
    }

    public LinkedHashMap g() {
        String reportedPrice;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VipPackageBean vipPackageBean = this.f30649a;
        if (vipPackageBean == null) {
            return linkedHashMap;
        }
        linkedHashMap.put("productCode", vipPackageBean.getProductCode());
        VipPackageBean vipPackageBean2 = this.f30649a;
        if (vipPackageBean2 instanceof VipPayInfoCoupons) {
            VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) vipPackageBean2;
            if (TextUtils.isEmpty(vipPayInfoCoupons.getReportedPrice())) {
                reportedPrice = TextUtils.isEmpty(vipPayInfoCoupons.getDiscountPrice()) ? vipPayInfoCoupons.getPrice() : vipPayInfoCoupons.getDiscountPrice();
            } else {
                reportedPrice = vipPayInfoCoupons.getReportedPrice();
            }
            linkedHashMap.put("reportedPrice", reportedPrice);
            linkedHashMap.put("orderChannel", Integer.valueOf(vipPayInfoCoupons.getOrderChannel()));
            linkedHashMap.put("couponId", vipPayInfoCoupons.getCouponId());
            linkedHashMap.put("productId", vipPayInfoCoupons.getProductId());
        } else {
            linkedHashMap.put("reportedPrice", TextUtils.isEmpty(vipPackageBean2.getDiscountPrice()) ? this.f30649a.getPrice() : this.f30649a.getDiscountPrice());
            linkedHashMap.put("orderChannel", Integer.valueOf(DetailedCreativeType.LONG_TEXT));
        }
        if (!TextUtils.isEmpty(this.f30650b)) {
            linkedHashMap.put(HwPayConstant.KEY_RESERVEDINFOR, this.f30650b);
        }
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put(SocialOperation.GAME_SIGNATURE, q4.e().a(c(linkedHashMap)));
        linkedHashMap.put("accessKey", q4.e().c());
        return linkedHashMap;
    }

    public String h() {
        return a(WatchFaceHttpUtil.e(), f(), e());
    }

    public String c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(linkedHashMap.get("productCode")));
        arrayList.add(String.valueOf(linkedHashMap.get("reportedPrice")));
        arrayList.add(String.valueOf(linkedHashMap.get("productId")));
        arrayList.add(String.valueOf(linkedHashMap.get("timestamp")));
        String strJoin = String.join("_", arrayList);
        FlavorConfig.safeHwLog("GetJoinCnVipIAP4Thread", "generateUcsToSignParam:" + strJoin);
        return strJoin;
    }
}
