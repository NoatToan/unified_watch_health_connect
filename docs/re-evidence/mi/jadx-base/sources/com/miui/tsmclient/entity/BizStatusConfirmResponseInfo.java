package com.miui.tsmclient.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class BizStatusConfirmResponseInfo extends CommonResponseInfo {
    private static final String STATUS_BIZ_RESULT_FAIL = "FAILED";
    private static final String STATUS_BIZ_RESULT_WAIT = "WAIT";

    @SerializedName("data")
    private BizStatusInfo mData;

    public static class BizStatusInfo {

        @SerializedName("bizStatus")
        private String mBizStatus;

        @SerializedName("msg")
        private String mMsg;

        public String getMsg() {
            return this.mMsg;
        }

        public void setMsg(String str) {
            this.mMsg = str;
        }
    }

    public String getBizStatus() {
        BizStatusInfo bizStatusInfo = this.mData;
        if (bizStatusInfo == null) {
            return null;
        }
        return bizStatusInfo.mBizStatus;
    }

    public BizStatusInfo getData() {
        return this.mData;
    }

    public String getMessage() {
        BizStatusInfo bizStatusInfo = this.mData;
        if (bizStatusInfo == null) {
            return null;
        }
        return bizStatusInfo.mMsg;
    }

    public boolean isFailed() {
        return TextUtils.equals(getBizStatus(), "FAILED");
    }

    public boolean needWait() {
        return TextUtils.equals(getBizStatus(), STATUS_BIZ_RESULT_WAIT);
    }

    public void setData(BizStatusInfo bizStatusInfo) {
        this.mData = bizStatusInfo;
    }
}
