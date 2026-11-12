package com.service.mi.entity;

import com.service.mi.common.MiPayStatus;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class BaseResponse implements Serializable {
    private Integer codeExpiration;
    private Object data;
    private Integer maxOTPRequestsAllowed;
    private Integer maxOTPVerificationAllowed;
    private String msg;
    private String requestId;
    private String resultCode;
    private List<SpError> spErrors;

    public BaseResponse(String str, String str2, String str3) {
        this.resultCode = str;
        this.msg = str2;
        this.requestId = str3;
    }

    public Integer getCodeExpiration() {
        return this.codeExpiration;
    }

    public Object getData() {
        return this.data;
    }

    public Integer getMaxOTPRequestsAllowed() {
        return this.maxOTPRequestsAllowed;
    }

    public Integer getMaxOTPVerificationAllowed() {
        return this.maxOTPVerificationAllowed;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getResultCode() {
        return this.resultCode;
    }

    public List<SpError> getSpErrors() {
        return this.spErrors;
    }

    public boolean isStatusOK() {
        return this.resultCode.equalsIgnoreCase(MiPayStatus.STATUS_OK.getStatus());
    }

    public void setCodeExpiration(Integer num) {
        this.codeExpiration = num;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public void setMaxOTPRequestsAllowed(Integer num) {
        this.maxOTPRequestsAllowed = num;
    }

    public void setMaxOTPVerificationAllowed(Integer num) {
        this.maxOTPVerificationAllowed = num;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setResultCode(String str) {
        this.resultCode = str;
    }

    public void setSpErrors(List<SpError> list) {
        this.spErrors = list;
    }

    public String toString() {
        return "BaseResponse{resultCode='" + this.resultCode + "', msg='" + this.msg + "', data=" + this.data + ", requestId='" + this.requestId + "', spErrors=" + this.spErrors + AbstractJsonLexerKt.END_OBJ;
    }

    public BaseResponse(String str, String str2, String str3, List<SpError> list) {
        this.resultCode = str;
        this.msg = str2;
        this.requestId = str3;
        this.spErrors = list;
    }

    public BaseResponse(String str, String str2, Object obj, String str3) {
        this.resultCode = str;
        this.msg = str2;
        this.data = obj;
        this.requestId = str3;
    }

    public BaseResponse(String str, String str2, Object obj, String str3, List<SpError> list) {
        this.resultCode = str;
        this.msg = str2;
        this.data = obj;
        this.requestId = str3;
        this.spErrors = list;
    }

    public BaseResponse(String str, String str2, String str3, List<SpError> list, Integer num, Integer num2, Integer num3) {
        this.resultCode = str;
        this.msg = str2;
        this.requestId = str3;
        this.spErrors = list;
        this.maxOTPVerificationAllowed = num;
        this.maxOTPRequestsAllowed = num2;
        this.codeExpiration = num3;
    }
}
