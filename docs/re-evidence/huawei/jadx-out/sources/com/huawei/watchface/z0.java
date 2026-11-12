package com.huawei.watchface;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.DetailedCreativeType;
import com.huawei.profile.coordinator.ProfileRequestConstants;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.datatype.PayIap4Info;
import com.huawei.watchface.mvp.model.datatype.VipOrderBean;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.mvp.model.thread.BaseHttpRequest;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.LanguageUtils;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import com.tencent.open.SocialOperation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes45.dex */
public class z0 extends BaseHttpRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VipPackageBean f30682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30684c;
    public String d;

    public class a extends TypeToken<VipOrderBean<PayIap4Info>> {
        public a(z0 z0Var) {
        }
    }

    public z0(VipPackageBean vipPackageBean, String str) {
        this.f30682a = vipPackageBean;
        this.f30683b = str;
    }

    private boolean a(VipPackageBean vipPackageBean) {
        return TextUtils.equals("1", a(vipPackageBean, "purchaseScene"));
    }

    private LinkedHashMap e() {
        LinkedHashMap<String, String> reqHeaders = super.getReqHeaders();
        reqHeaders.put("x-devicemodel", !TextUtils.isEmpty(this.d) ? this.d : HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getDeviceModel());
        reqHeaders.put("x-brandChannel", String.valueOf(q0.d()));
        reqHeaders.put("x-accountBrand", String.valueOf(q0.b()));
        reqHeaders.put(ProfileRequestConstants.X_LANGUAGE_KEY, LanguageUtils.a(false));
        reqHeaders.put("x-appBrand", String.valueOf(q0.b()));
        reqHeaders.put("deviceid", q0.e());
        reqHeaders.put("deviceType", "5");
        if (!TextUtils.isEmpty(this.f30684c)) {
            reqHeaders.put(WatchFaceConstant.X_SIGN, this.f30684c);
        }
        reqHeaders.put("Content-Type", "application/json");
        reqHeaders.put("x-ability", a());
        return reqHeaders;
    }

    private String f() {
        String reportedPrice;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VipPackageBean vipPackageBean = this.f30682a;
        if (vipPackageBean == null) {
            return GsonHelper.toJson(linkedHashMap);
        }
        linkedHashMap.put("productCode", vipPackageBean.getProductCode());
        VipPackageBean vipPackageBean2 = this.f30682a;
        if (vipPackageBean2 instanceof VipPayInfoCoupons) {
            VipPayInfoCoupons vipPayInfoCoupons = (VipPayInfoCoupons) vipPackageBean2;
            if (TextUtils.isEmpty(vipPayInfoCoupons.getReportedPrice())) {
                reportedPrice = TextUtils.isEmpty(vipPayInfoCoupons.getDiscountPrice()) ? vipPayInfoCoupons.getPrice() : vipPayInfoCoupons.getDiscountPrice();
            } else {
                reportedPrice = vipPayInfoCoupons.getReportedPrice();
            }
            linkedHashMap.put("reportedPrice", reportedPrice);
            linkedHashMap.put("orderChannel", Integer.valueOf(vipPayInfoCoupons.getOrderChannel()));
        } else {
            linkedHashMap.put("reportedPrice", TextUtils.isEmpty(vipPackageBean2.getDiscountPrice()) ? this.f30682a.getPrice() : this.f30682a.getDiscountPrice());
            linkedHashMap.put("orderChannel", Integer.valueOf(DetailedCreativeType.LONG_TEXT));
        }
        if (!TextUtils.isEmpty(this.f30683b)) {
            linkedHashMap.put(HwPayConstant.KEY_RESERVEDINFOR, this.f30683b);
        }
        if (a(this.f30682a)) {
            linkedHashMap.put("orderChannel", Integer.valueOf(TypedValues.Custom.TYPE_REFERENCE));
        }
        String strA = a(this.f30682a, "campaignId");
        if (!TextUtils.isEmpty(strA)) {
            linkedHashMap.put("promotionId", strA);
        }
        if (!TextUtils.isEmpty(this.f30682a.getMagicExtendInfo())) {
            linkedHashMap.put("extInfo", this.f30682a.getMagicExtendInfo());
        }
        linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
        linkedHashMap.put(SocialOperation.GAME_SIGNATURE, q4.e().a(c(linkedHashMap)));
        linkedHashMap.put("accessKey", q4.e().c());
        return GsonHelper.toJson(linkedHashMap);
    }

    public VipOrderBean b(String str) {
        Exception e;
        VipOrderBean vipOrderBean = null;
        if (TextUtils.isEmpty(str)) {
            HwLog.i("GetJoinVipIAP4Thread", "dealReceive json is empty");
            return null;
        }
        try {
            VipOrderBean vipOrderBean2 = (VipOrderBean) c5.a().a(str, new a(this).getType());
            try {
                if (vipOrderBean2 == null) {
                    HwLog.i("GetJoinVipIAP4Thread", "dealReceive vipOrderIAP4Bean is null");
                    return null;
                }
                HwLog.i("GetJoinVipIAP4Thread", "dealReceive vipOrderIAP4Bean resultInfo :" + vipOrderBean2.getResultinfo() + " code:" + vipOrderBean2.getResultcode());
                return vipOrderBean2;
            } catch (Exception e2) {
                e = e2;
                vipOrderBean = vipOrderBean2;
                HwLog.e("GetJoinVipIAP4Thread", "dealReceive " + HwLog.printException(e));
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
        this.f30684c = str;
    }

    public String g() {
        return a(WatchFaceHttpUtil.l(), f(), e());
    }

    public String c(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.valueOf(linkedHashMap.get("productCode")));
        arrayList.add(String.valueOf(linkedHashMap.get("reportedPrice")));
        arrayList.add(String.valueOf(linkedHashMap.get("promotionId")));
        arrayList.add(String.valueOf(linkedHashMap.get("timestamp")));
        arrayList.add(String.valueOf(linkedHashMap.get("extInfo")));
        String strJoin = String.join("_", arrayList);
        FlavorConfig.safeHwLog("GetJoinVipIAP4Thread", "generateUcsToSignParam:" + strJoin);
        return strJoin;
    }

    private String a(VipPackageBean vipPackageBean, String str) {
        if (vipPackageBean == null) {
            return "";
        }
        String magicExtendInfo = vipPackageBean.getMagicExtendInfo();
        if (TextUtils.isEmpty(magicExtendInfo)) {
            return "";
        }
        try {
            return new JSONObject(magicExtendInfo).optString(str);
        } catch (JSONException e) {
            HwLog.e("GetJoinVipIAP4Thread", "getMagicExtendInfoByKey, JSONException" + HwLog.printException((Exception) e));
            return "";
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return String.valueOf(CommonUtils.getVersionCode());
    }
}
