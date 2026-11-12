package com.huawei.watchface.mvp.model.thread;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.openalliance.ad.constant.JsbMapKeyNames;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.d0;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.WatchFaceOrderBean;
import com.huawei.watchface.mvp.model.helper.GsonHelper;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.WatchFaceHttpUtil;
import com.huawei.watchface.utils.analytice.interf.ReportPolicy;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
@ReportPolicy(collectedFields = {@d0(name = "resultinfo"), @d0(name = "resultcode"), @d0(name = "tradeId")})
public class HitopReqOrderBatchCreateThread extends BaseHttpRequest<WatchFaceOrderBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f30369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f30370c;
    public String d;
    public String e;

    public HitopReqOrderBatchCreateThread(String str, String str2, String str3, String str4, String str5) {
        this.f30368a = str;
        this.f30369b = str2;
        this.f30370c = str3;
        this.d = str4;
        this.e = str5;
    }

    private String buildRequestParams() {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isoCode", HwWatchFaceApi.getInstance(Environment.getApplicationContext()).getCommonCountryCode());
            linkedHashMap.put("productId", this.f30368a);
            linkedHashMap.put("versionCode", this.e);
            linkedHashMap.put("payAmount", this.f30369b);
            linkedHashMap.put(JsbMapKeyNames.H5_USER_ID, WatchFaceHttpUtil.A().getUserId());
            linkedHashMap.put("isGift", Boolean.FALSE);
            linkedHashMap.put("isVipVersion", Integer.valueOf(CommonUtils.B()));
            if (!TextUtils.isEmpty(this.f30370c)) {
                linkedHashMap.put("couponId", this.f30370c);
            }
            if (!TextUtils.isEmpty(this.d)) {
                try {
                    linkedHashMap.put(HwPayConstant.KEY_RESERVEDINFOR, URLEncoder.encode(this.d, StandardCharsets.UTF_8.name()));
                } catch (UnsupportedEncodingException unused) {
                    HwLog.e("HitopReqOrderBatchCreateThread", "getWatchFacePayResultParams, UnsupportedEncodingException");
                }
            }
            return a(linkedHashMap);
        } catch (Exception e) {
            HwLog.i("HitopReqOrderBatchCreateThread", "Exception : " + HwLog.printException(e));
            return "";
        }
    }

    public WatchFaceOrderBean b(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.i("HitopReqOrderBatchCreateThread", "dealReceive json is empty");
            return new WatchFaceOrderBean();
        }
        try {
            WatchFaceOrderBean watchFaceOrderBean = (WatchFaceOrderBean) GsonHelper.fromJson(str, WatchFaceOrderBean.class);
            if ("0".equals(watchFaceOrderBean.getResultCode())) {
                watchFaceOrderBean.mCouponId = this.f30370c;
                watchFaceOrderBean.mReservedInfor = this.d;
            }
            return watchFaceOrderBean;
        } catch (Exception e) {
            HwLog.i("HitopReqOrderBatchCreateThread", "handleJsonData exception: " + HwLog.printException(e));
            return new WatchFaceOrderBean();
        }
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public String c() {
        return this.e;
    }

    public String e() {
        return a(WatchFaceHttpUtil.c(), buildRequestParams(), getReqHeaders());
    }

    public String f() {
        String str;
        try {
            str = (String) getReqHeaders().get(WatchFaceConstant.X_CLIENTTRACEID);
        } catch (NullPointerException e) {
            HwLog.e("HitopReqOrderBatchCreateThread", "getTraceid error " + HwLog.printException((Exception) e));
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // com.huawei.watchface.mvp.model.thread.BaseHttpRequest
    public LinkedHashMap getReqHeaders() {
        return super.getReqHeaders();
    }
}
