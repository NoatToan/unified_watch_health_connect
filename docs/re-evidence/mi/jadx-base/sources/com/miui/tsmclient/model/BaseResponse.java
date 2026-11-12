package com.miui.tsmclient.model;

import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class BaseResponse {
    public Object[] mDatas;
    public String mMsg;
    public int mResultCode;

    public BaseResponse() {
        this.mResultCode = -1;
    }

    public boolean hasData() {
        Object[] objArr = this.mDatas;
        return objArr != null && objArr.length > 0;
    }

    public boolean isNotExist() {
        return this.mResultCode == 2003;
    }

    public boolean isSuccess() {
        return this.mResultCode == 0;
    }

    public void setDatas(Object... objArr) {
        this.mDatas = objArr;
    }

    public void setResponseFrom(CommonResponseInfo commonResponseInfo) {
        if (commonResponseInfo.isSuccess()) {
            this.mResultCode = 0;
        } else {
            this.mResultCode = commonResponseInfo.getErrorCode();
        }
        this.mMsg = commonResponseInfo.getErrorDesc();
    }

    public BaseResponse(int i, Object... objArr) {
        this.mResultCode = i;
        this.mDatas = objArr;
    }

    public BaseResponse(int i, String str, Object... objArr) {
        this.mResultCode = i;
        this.mMsg = str;
        this.mDatas = objArr;
    }
}
