package com.huawei.watchface;

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.DetailedCreativeType;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.HwWatchFaceBtManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.PayInfo;
import com.huawei.watchface.mvp.model.datatype.VipOrderBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes45.dex */
public class a1 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VipPackageBean f30046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30048c;
    public String d;
    public String e;

    public class a extends TypeToken<VipOrderBean<PayInfo>> {
        public a(a1 a1Var) {
        }
    }

    public a1(VipPackageBean vipPackageBean, String str) {
        this.f30046a = vipPackageBean;
        this.f30047b = str;
    }

    public VipOrderBean b(String str) {
        Exception e;
        VipOrderBean vipOrderBean = null;
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetJoinVipThread", "dealReceive json is empty");
            return null;
        }
        try {
            VipOrderBean vipOrderBean2 = (VipOrderBean) c5.a().a(str, new a(this).getType());
            try {
                if (vipOrderBean2 == null) {
                    HwLog.e("GetJoinVipThread", "dealReceive vipOrderBean is null");
                    return null;
                }
                HwLog.i("GetJoinVipThread", "dealReceive PayInfo resultinfo :" + vipOrderBean2.getResultinfo() + " code:" + vipOrderBean2.getResultcode());
                PayInfo payInfo = (PayInfo) vipOrderBean2.getPayInfo();
                if (payInfo != null) {
                    payInfo.setReservedInfor(this.f30047b);
                    return vipOrderBean2;
                }
                PayInfo payInfo2 = new PayInfo();
                payInfo2.setAmount(this.f30048c);
                vipOrderBean2.setPayInfo(payInfo2);
                return vipOrderBean2;
            } catch (Exception e2) {
                e = e2;
                vipOrderBean = vipOrderBean2;
                HwLog.e("GetJoinVipThread", "dealReceive " + HwLog.printException(e));
                return vipOrderBean;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public void c(String str) {
        this.e = str;
    }

    public void d(String str) {
        this.d = str;
    }

    public LinkedHashMap e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FaqConstants.FAQ_EMUIVERSION, HwWatchFaceBtManager.getInstance(Environment.getApplicationContext()).getWatchFaceMaxVersion(false, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceConnectState() == 0));
        linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
        linkedHashMap.put(WatchFaceConstant.X_CLIENTTRACEID, MobileInfoHelper.generateUUID());
        linkedHashMap.put("x-hc", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
        linkedHashMap.put(ProfileRequestConstants.X_APPID_KEY, "10003");
        linkedHashMap.put("x-devicemodel", !TextUtils.isEmpty(this.e) ? this.e : HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        linkedHashMap.put("deviceid", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceIdAsTheme(true));
        linkedHashMap.put("deviceType", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceType());
        linkedHashMap.put("x-brandChannel", String.valueOf(q0.d()));
        linkedHashMap.put("x-accountBrand", String.valueOf(q0.b()));
        linkedHashMap.put("x-appBrand", String.valueOf(q0.b()));
        linkedHashMap.put(WatchFaceConstant.X_UID, HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getUserId());
        if (!TextUtils.isEmpty(this.d)) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, this.d);
        } else if (WatchFaceHttpUtil.A() != null) {
            linkedHashMap.put(WatchFaceConstant.X_SIGN, WatchFaceHttpUtil.A().getSign());
        }
        linkedHashMap.put("Content-Type", "application/json");
        linkedHashMap.put("terminalType", "1");
        linkedHashMap.put(WatchFaceConstant.CIPHER_VERSION, "2");
        c2.a(Environment.getApplicationContext()).a(linkedHashMap, d());
        return linkedHashMap;
    }

    public String f() {
        return GsonHelper.toJson(g());
    }

    public LinkedHashMap g() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VipPackageBean vipPackageBean = this.f30046a;
        if (vipPackageBean != null) {
            linkedHashMap.put("productCode", vipPackageBean.getProductCode());
            linkedHashMap.put("productType", this.f30046a.getProductType());
            linkedHashMap.put("versionCode", CommonUtils.getVersionCode() + "");
            VipPackageBean vipPackageBean2 = this.f30046a;
            if (vipPackageBean2 instanceof VipPayInfoCoupons) {
                VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) vipPackageBean2;
                if (!TextUtils.isEmpty(vipPayInfoCoupons.getReportedPrice())) {
                    linkedHashMap.put("reportedPrice", vipPayInfoCoupons.getReportedPrice());
                } else if (TextUtils.isEmpty(vipPayInfoCoupons.getDiscountPrice())) {
                    linkedHashMap.put("reportedPrice", vipPayInfoCoupons.getPrice());
                } else {
                    linkedHashMap.put("reportedPrice", vipPayInfoCoupons.getDiscountPrice());
                }
                linkedHashMap.put("orderChannel", Integer.valueOf(vipPayInfoCoupons.getOrderChannel()));
                linkedHashMap.put("relProductCode", vipPayInfoCoupons.getRelProductCode());
                linkedHashMap.put("couponId", vipPayInfoCoupons.getCouponId());
                linkedHashMap.put("promotionId", vipPayInfoCoupons.getPromotionId());
                linkedHashMap.put("promotionName", vipPayInfoCoupons.getPromotionName());
                linkedHashMap.put("orderType", vipPayInfoCoupons.getOrderType());
            } else {
                linkedHashMap.put("reportedPrice", TextUtils.isEmpty(vipPackageBean2.getDiscountPrice()) ? this.f30046a.getPrice() : this.f30046a.getDiscountPrice());
                linkedHashMap.put("orderChannel", Integer.valueOf(DetailedCreativeType.LONG_TEXT));
                linkedHashMap.put("relProductCode", this.f30046a.getRelProductCode());
                if (TextUtils.isEmpty(this.f30046a.getRelProductCode())) {
                    linkedHashMap.put("orderType", "1");
                } else {
                    linkedHashMap.put("orderType", "2");
                }
            }
            this.f30048c = (String) linkedHashMap.get("reportedPrice");
            if (!TextUtils.isEmpty(this.f30047b)) {
                try {
                    linkedHashMap.put(HwPayConstant.KEY_RESERVEDINFOR, URLEncoder.encode(this.f30047b, StandardCharsets.UTF_8.name()));
                    return linkedHashMap;
                } catch (UnsupportedEncodingException e) {
                    HwLog.e("GetJoinVipThread", "GetJoinVipThread, UnsupportedEncodingException" + HwLog.printException((Exception) e));
                }
            }
        }
        return linkedHashMap;
    }

    public String h() {
        return a(WatchFaceHttpUtil.m(), f(), e());
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return CommonUtils.getVersionCode() + "";
    }
}
