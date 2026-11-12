package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes45.dex */
public class CouponsAndVipPackageBean {
    private CouponsByproductBean couponsByproductBean;
    private VipPackageBean vipPackageBean;

    public CouponsAndVipPackageBean(VipPackageBean vipPackageBean, CouponsByproductBean couponsByproductBean) {
        this.vipPackageBean = vipPackageBean;
        this.couponsByproductBean = couponsByproductBean;
    }

    public CouponsByproductBean getCouponsByproductBean() {
        return this.couponsByproductBean;
    }

    public VipPackageBean getVipPackageBean() {
        return this.vipPackageBean;
    }

    public void setCouponsByproductBean(CouponsByproductBean couponsByproductBean) {
        this.couponsByproductBean = couponsByproductBean;
    }

    public void setVipPackageBean(VipPackageBean vipPackageBean) {
        this.vipPackageBean = vipPackageBean;
    }
}
