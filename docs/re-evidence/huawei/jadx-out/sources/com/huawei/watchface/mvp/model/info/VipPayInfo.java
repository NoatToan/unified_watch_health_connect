package com.huawei.watchface.mvp.model.info;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hms.support.api.entity.pay.WithholdRequest;
import com.huawei.hms.support.api.entity.pay.internal.BaseReq;
import com.huawei.watchface.f4;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.MobileInfoHelper;
import com.huawei.watchface.x;
import java.util.Locale;

/* JADX INFO: loaded from: classes45.dex */
public class VipPayInfo extends x {
    private static final String TAG = "VipPayInfo";
    private String amount;
    private String applicationID;
    private String country;
    private String currency;
    private String extReserved;
    private String merchantId;
    private String merchantName;
    private String productDesc;
    private String productName;
    private String publicKey;
    private String requestId;
    private String reservedInfor;
    private String sdkChannel;
    private String serviceCatalog;
    private String sign;
    private String signPss;
    private String tradeType;
    private String url;

    @SerializedName(HwPayConstant.KEY_URLVER)
    private String urlVersion;

    public String getAmount() {
        return this.amount;
    }

    public String getApplicationID() {
        return this.applicationID;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getExtReserved() {
        return this.extReserved;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public BaseReq getPayInfoReq(VipPayInfo vipPayInfo) {
        Double dValueOf;
        VipPayInfoReq vipPayInfoReq = new VipPayInfoReq();
        if (vipPayInfo == null) {
            return vipPayInfoReq;
        }
        if (!f4.b(vipPayInfo.getSdkChannel())) {
            try {
                vipPayInfoReq.sdkChannel = Integer.parseInt(vipPayInfo.getSdkChannel());
            } catch (NumberFormatException e) {
                HwLog.i(TAG, "NumberFormatException: " + HwLog.printException((Exception) e));
            }
        }
        if (!f4.b(vipPayInfo.getCountry())) {
            vipPayInfoReq.country = vipPayInfo.getCountry();
        }
        if (!f4.b(vipPayInfo.getUrlVersion())) {
            vipPayInfoReq.urlVer = vipPayInfo.getUrlVersion();
        }
        if (!f4.b(vipPayInfo.getTradeType())) {
            vipPayInfoReq.setTradeType(vipPayInfo.getTradeType());
        }
        if (!f4.b(vipPayInfo.getUrl())) {
            vipPayInfoReq.url = vipPayInfo.getUrl();
        }
        if (!f4.b(vipPayInfo.getExtReserved())) {
            vipPayInfoReq.extReserved = vipPayInfo.getExtReserved();
        }
        if (!f4.b(vipPayInfo.getCurrency())) {
            vipPayInfoReq.currency = vipPayInfo.getCurrency();
        }
        vipPayInfoReq.productName = vipPayInfo.getProductName();
        vipPayInfoReq.productDesc = vipPayInfo.getProductDesc();
        vipPayInfoReq.merchantId = vipPayInfo.getMerchantId();
        vipPayInfoReq.applicationID = vipPayInfo.getApplicationID();
        if (!TextUtils.isEmpty(vipPayInfo.getAmount())) {
            try {
                dValueOf = Double.valueOf(vipPayInfo.getAmount());
            } catch (NumberFormatException e2) {
                HwLog.i(TAG, "NumberFormatException " + HwLog.printException((Exception) e2));
                dValueOf = null;
            }
            vipPayInfoReq.amount = String.format(Locale.ENGLISH, "%.2f", dValueOf);
        }
        vipPayInfoReq.requestId = vipPayInfo.getRequestId();
        vipPayInfoReq.merchantName = vipPayInfo.getMerchantName();
        vipPayInfoReq.serviceCatalog = vipPayInfo.getServiceCatalog();
        if (TextUtils.isEmpty(vipPayInfo.getSignPss()) || MobileInfoHelper.getAppVersionCode("com.huawei.hwid") <= 60000300) {
            vipPayInfoReq.sign = vipPayInfo.getSign();
        } else {
            vipPayInfoReq.signatureAlgorithm = "SHA256WithRSA/PSS";
            vipPayInfoReq.sign = vipPayInfo.getSignPss();
        }
        vipPayInfoReq.reservedInfor = vipPayInfo.reservedInfor;
        return vipPayInfoReq;
    }

    public String getProductDesc() {
        return this.productDesc;
    }

    public String getProductName() {
        return this.productName;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getReservedInfor() {
        return this.reservedInfor;
    }

    public String getSdkChannel() {
        return this.sdkChannel;
    }

    public String getServiceCatalog() {
        return this.serviceCatalog;
    }

    public String getSign() {
        return this.sign;
    }

    public String getSignPss() {
        return this.signPss;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUrlVersion() {
        return this.urlVersion;
    }

    public BaseReq getWithholdRequest(VipPayInfo vipPayInfo) {
        Double dValueOf;
        WithholdRequest withholdRequest = new WithholdRequest();
        if (vipPayInfo == null) {
            return withholdRequest;
        }
        withholdRequest.merchantId = vipPayInfo.getMerchantId();
        withholdRequest.applicationID = vipPayInfo.getApplicationID();
        withholdRequest.requestId = vipPayInfo.getRequestId();
        if (!f4.b(vipPayInfo.getUrlVersion())) {
            withholdRequest.urlVer = vipPayInfo.getUrlVersion();
        }
        if (!f4.b(vipPayInfo.getSdkChannel())) {
            try {
                withholdRequest.sdkChannel = Integer.parseInt(vipPayInfo.getSdkChannel());
            } catch (NumberFormatException e) {
                HwLog.i(TAG, "NumberFormatException: " + HwLog.printException((Exception) e));
            }
        }
        if (TextUtils.isEmpty(vipPayInfo.getSignPss()) || MobileInfoHelper.getAppVersionCode("com.huawei.hwid") <= 60000300) {
            withholdRequest.sign = vipPayInfo.getSign();
        } else {
            withholdRequest.signatureAlgorithm = "SHA256WithRSA/PSS";
            withholdRequest.sign = vipPayInfo.getSignPss();
        }
        withholdRequest.merchantName = vipPayInfo.getMerchantName();
        withholdRequest.serviceCatalog = vipPayInfo.getServiceCatalog();
        if (!f4.b(vipPayInfo.getExtReserved())) {
            withholdRequest.extReserved = vipPayInfo.getExtReserved();
        }
        withholdRequest.productName = vipPayInfo.getProductName();
        withholdRequest.productDesc = vipPayInfo.getProductDesc();
        if (!TextUtils.isEmpty(vipPayInfo.getAmount())) {
            try {
                dValueOf = Double.valueOf(vipPayInfo.getAmount());
            } catch (NumberFormatException e2) {
                HwLog.i(TAG, "NumberFormatException " + HwLog.printException((Exception) e2));
                dValueOf = null;
            }
            withholdRequest.amount = String.format(Locale.ENGLISH, "%.2f", dValueOf);
        }
        if (!f4.b(vipPayInfo.getCurrency())) {
            withholdRequest.currency = vipPayInfo.getCurrency();
        }
        if (!f4.b(vipPayInfo.getCountry())) {
            withholdRequest.country = vipPayInfo.getCountry();
        }
        if (!f4.b(vipPayInfo.getTradeType())) {
            withholdRequest.tradeType = vipPayInfo.getTradeType();
        }
        withholdRequest.url = vipPayInfo.getUrl();
        withholdRequest.reservedInfor = vipPayInfo.reservedInfor;
        return withholdRequest;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setApplicationID(String str) {
        this.applicationID = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public void setExtReserved(String str) {
        this.extReserved = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public void setProductDesc(String str) {
        this.productDesc = str;
    }

    public void setProductName(String str) {
        this.productName = str;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setReservedInfor(String str) {
        this.reservedInfor = str;
    }

    public void setSdkChannel(String str) {
        this.sdkChannel = str;
    }

    public void setServiceCatalog(String str) {
        this.serviceCatalog = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setSignPss(String str) {
        this.signPss = str;
    }

    public void setTradeType(String str) {
        this.tradeType = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUrlVersion(String str) {
        this.urlVersion = str;
    }
}
