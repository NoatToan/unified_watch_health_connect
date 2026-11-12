package com.huawei.watchface.mvp.model.pay;

import com.huawei.hms.support.api.pay.PayResultInfo;
import com.huawei.watchface.h3;

/* JADX INFO: loaded from: classes45.dex */
public class JsPayResult extends h3 {
    private String amount;
    private String errMsg;
    private String orderID;
    private String requestId;
    private int resultCode;
    private int returnCode;
    private String sign;
    private String time;
    private String userName;
    private String withholdID;

    public String getAmount() {
        return this.amount;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public int getReturnCode() {
        return this.returnCode;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTime() {
        return this.time;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getWithholdID() {
        return this.withholdID;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setOrderID(String str) {
        this.orderID = str;
    }

    public void setPayResultInfo(PayResultInfo payResultInfo) {
        if (payResultInfo == null) {
            return;
        }
        setResultCode(payResultInfo.getReturnCode());
        setErrMsg(payResultInfo.getErrMsg());
        setOrderID(payResultInfo.getOrderID());
        setAmount(payResultInfo.getAmount());
        setCurrency(payResultInfo.getCurrency());
        setCountry(payResultInfo.getCountry());
        setTime(payResultInfo.getTime());
        setWithholdID(payResultInfo.getWithholdID());
        setRequestId(payResultInfo.getRequestId());
        setUserName(payResultInfo.getUserName());
        setSign(payResultInfo.getSign());
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public void setReturnCode(int i) {
        this.returnCode = i;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setWithholdID(String str) {
        this.withholdID = str;
    }
}
