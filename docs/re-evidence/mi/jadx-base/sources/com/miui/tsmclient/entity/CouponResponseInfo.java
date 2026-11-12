package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CouponResponseInfo extends CommonResponseInfo {

    @SerializedName("data")
    private List<CouponInfo> mCouponInfoList;

    public List<CouponInfo> getCouponInfoList() {
        return this.mCouponInfoList;
    }

    public CouponInfo getFirstValidCoupon() {
        if (isEmpty()) {
            return null;
        }
        for (CouponInfo couponInfo : this.mCouponInfoList) {
            if (couponInfo.isValid()) {
                return couponInfo;
            }
        }
        return null;
    }

    public boolean isEmpty() {
        List<CouponInfo> list = this.mCouponInfoList;
        return list == null || list.isEmpty();
    }
}
