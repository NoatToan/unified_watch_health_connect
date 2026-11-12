package com.huawei.watchface;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;
import com.huawei.watchface.mvp.model.info.VipPayInfoCoupons;
import com.huawei.watchface.mvp.model.webview.JsInteractAddition;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.analytice.data.BaseEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes20.dex */
public class k extends BaseEvent {
    public static Map l = new ConcurrentHashMap();
    public String g;
    public String i;
    public String j;
    public StringBuilder h = new StringBuilder();
    public LinkedHashMap k = new LinkedHashMap();

    public static k a(String str, VipPayInfoCoupons vipPayInfoCoupons) {
        k kVarA = a(str, (VipPackageBean) vipPayInfoCoupons);
        if (kVarA != null && vipPayInfoCoupons != null) {
            kVarA.a("couponId", vipPayInfoCoupons.getCouponId());
        }
        return kVarA;
    }

    public static k d(String str) {
        k kVar;
        HwLog.i("AnalyticsPayEvent", "getPayEvents hitopid " + str);
        if (l == null) {
            l = new ConcurrentHashMap();
        }
        try {
            kVar = (k) l.get(str);
        } catch (ClassCastException | NullPointerException e) {
            HwLog.i("AnalyticsPayEvent", "getPayEvents error " + HwLog.printException((Exception) e));
            kVar = null;
        }
        if (kVar == null) {
            kVar = (k) ((k) new k().b(System.currentTimeMillis())).b(str);
            if (str != null) {
                l.put(str, kVar);
            }
        }
        return kVar;
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            l.remove(str);
        } catch (Exception e) {
            HwLog.e("AnalyticsPayEvent", "removePayEvent error:" + HwLog.printException(e));
        }
    }

    public static Map n() {
        if (l == null) {
            l = new ConcurrentHashMap();
        }
        return l;
    }

    @Override // com.huawei.watchface.s3
    public LinkedHashMap b() {
        return this.k;
    }

    public void f(String str) {
        this.j = str;
    }

    public k g(String str) {
        this.g = str;
        return this;
    }

    public k h(String str) {
        this.i = str;
        return this;
    }

    public String k() {
        return this.j;
    }

    public String l() {
        if (this.h == null) {
            this.h = new StringBuilder();
        }
        return this.h.toString();
    }

    public String m() {
        return this.g;
    }

    public String o() {
        return this.i;
    }

    public static k a(String str, VipPackageBean vipPackageBean) {
        if (str == null) {
            return new k();
        }
        k kVarD = d(str);
        if (kVarD != null && vipPackageBean != null) {
            kVarD.f(vipPackageBean.getProductName());
            kVarD.h("1").a("productCode", vipPackageBean.getProductCode()).a(HwPayConstant.KEY_PRODUCTNAME, vipPackageBean.getProductName()).a(ParsedFieldTag.PRICE, vipPackageBean.getPrice()).a("discountPrice", vipPackageBean.getDiscountPrice());
            return kVarD;
        }
        return new k();
    }

    public k a(String str, String str2) {
        if (this.h == null) {
            this.h = new StringBuilder();
        }
        if (!TextUtils.isEmpty(this.h)) {
            this.h.append('|');
        }
        StringBuilder sb = this.h;
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return this;
    }

    @Override // com.huawei.watchface.s3
    public String a() {
        return "WATCHFACE_BUY";
    }

    public static void a(String str, int i, String str2) {
        k kVarD = d(str);
        ((k) kVarD.a(System.currentTimeMillis())).a(String.valueOf(i));
        if (kVarD.k == null) {
            kVarD.k = new LinkedHashMap();
        }
        kVarD.k.put("startts", String.valueOf(kVarD.f()));
        kVarD.k.put("endts", String.valueOf(kVarD.c()));
        kVarD.k.put("totalTime", String.valueOf(kVarD.c() - kVarD.f()));
        HwWatchFaceApi hwWatchFaceApi = HwWatchFaceApi.getInstance(Environment.getApplicationContext());
        if (!hwWatchFaceApi.isOversea() && TextUtils.equals(hwWatchFaceApi.getCommonCountryCode(), "CN")) {
            kVarD.k.put("orderId", kVarD.m());
        }
        kVarD.k.put(JsInteractAddition.HI_TOP_ID, kVarD.e());
        kVarD.k.put(BaseEvent.KEY_CONTENTINFO, kVarD.l());
        kVarD.k.put("errorCode", String.valueOf(i));
        LinkedHashMap linkedHashMap = kVarD.k;
        if (TextUtils.isEmpty(str2)) {
            str2 = (String) g3.g.get(i);
        }
        linkedHashMap.put(BaseEvent.KEY_DESCINFO, str2);
        kVarD.k.put("sourceType", kVarD.o());
        kVarD.k.put("cnTitle", kVarD.k());
        kVarD.k.put("title", kVarD.k());
        kVarD.j();
        e(str);
    }
}
