package com.miui.tsmclient.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.mibi.sdk.component.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class CouponDetail {

    @SerializedName("couponTitle")
    private String mCouponTitle;

    @SerializedName(Constants.KEY_RECHARGE_DISCOUNT_DESC)
    private String mDiscountDesc;

    @SerializedName("discountFee")
    private String mDiscountFee;

    @SerializedName("expireToast")
    private String mExpireToast;

    @SerializedName("highLight")
    private boolean mHighLight;

    public static CouponDetail get(String str) {
        return (CouponDetail) new Gson().fromJson(str, CouponDetail.class);
    }

    public String getCouponTitle() {
        return this.mCouponTitle;
    }

    public String getDiscountDesc() {
        return this.mDiscountDesc;
    }

    public String getDiscountFee() {
        return this.mDiscountFee;
    }

    public String getExpireToast() {
        return this.mExpireToast;
    }

    public boolean isHighLight() {
        return this.mHighLight;
    }
}
