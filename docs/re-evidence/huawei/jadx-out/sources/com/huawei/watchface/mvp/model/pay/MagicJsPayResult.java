package com.huawei.watchface.mvp.model.pay;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.openalliance.ad.constant.DetailedCreativeType;
import com.huawei.watchface.e5;
import com.huawei.watchface.mvp.model.datatype.VipPackageBean;

/* JADX INFO: loaded from: classes45.dex */
public class MagicJsPayResult {
    private int buttonType;
    private String discountPrice;
    private boolean isVip;
    private String orderId;
    private String packagePrice;
    private String productCode;
    private String productCurrency;
    private String productDesc;
    private String productName;
    private String productPrice;
    private String productType;
    private String renewCode;
    private String requestCode;
    private int resultCode;
    private String resultDesc;
    private String timestamp;

    public void copyInfo(VipPackageBean vipPackageBean) {
        if (vipPackageBean != null) {
            if (TextUtils.isEmpty(vipPackageBean.getMagicExtendInfo())) {
                setButtonType(DetailedCreativeType.LONG_TEXT);
            } else {
                setButtonType(TypedValues.Custom.TYPE_REFERENCE);
            }
            setDiscountPrice(vipPackageBean.getDiscountPrice());
            setProductCurrency(vipPackageBean.getCurrency());
            setVip(e5.c().g());
            setRenewCode(vipPackageBean.getRenewCode());
            setProductCode(vipPackageBean.getProductCode());
            setProductName(vipPackageBean.getProductName());
            setProductType(vipPackageBean.getProductType());
            setProductDesc(vipPackageBean.getProductDesc());
            setProductPrice(vipPackageBean.getPrice());
        }
    }

    public int getButtonType() {
        return this.buttonType;
    }

    public String getDiscountPrice() {
        return this.discountPrice;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getPackagePrice() {
        return this.packagePrice;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductCurrency() {
        return this.productCurrency;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getProductPrice() {
        return this.productPrice;
    }

    public String getProductType() {
        return this.productType;
    }

    public String getRenewCode() {
        return this.renewCode;
    }

    public String getRequestCode() {
        return this.requestCode;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public String getResultDesc() {
        return this.resultDesc;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public boolean isVip() {
        return this.isVip;
    }

    public void setButtonType(int i) {
        this.buttonType = i;
    }

    public void setDiscountPrice(String str) {
        this.discountPrice = str;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public void setPackagePrice(String str) {
        this.packagePrice = str;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public void setProductCurrency(String str) {
        this.productCurrency = str;
    }

    public void setProductDesc(String str) {
        this.productDesc = str;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setProductPrice(String str) {
        this.productPrice = str;
    }

    public void setProductType(String str) {
        this.productType = str;
    }

    public void setRenewCode(String str) {
        this.renewCode = str;
    }

    public void setRequestCode(String str) {
        this.requestCode = str;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setResultDesc(String str) {
        this.resultDesc = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setVip(boolean z) {
        this.isVip = z;
    }

    public void copyInfo(PayResultInfo payResultInfo) {
        if (payResultInfo != null) {
            setResultCode(payResultInfo.getReturnCode());
            setResultDesc(payResultInfo.getErrMsg());
            setPackagePrice(payResultInfo.getAmount());
            setOrderId(payResultInfo.getOrderID());
            setRequestCode(payResultInfo.getRequestId());
            setTimestamp(payResultInfo.getTime());
        }
    }
}
