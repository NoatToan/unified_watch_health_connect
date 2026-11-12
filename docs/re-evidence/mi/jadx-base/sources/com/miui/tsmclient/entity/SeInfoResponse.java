package com.miui.tsmclient.entity;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;

/* JADX INFO: loaded from: classes6.dex */
public class SeInfoResponse extends CommonResponseInfo {

    @SerializedName("data")
    private ResponseData mData;

    public static class ResponseData {

        @SerializedName("cplc")
        private String mCplc;

        @SerializedName("seid")
        private String mSeid;

        @SerializedName("userId")
        private String mUserId;

        public static ResponseData fromJson(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (ResponseData) new Gson().fromJson(str, ResponseData.class);
        }

        public String getCplc() {
            return this.mCplc;
        }

        public String getUserId() {
            return this.mUserId;
        }

        public String toString() {
            return new Gson().toJson(this);
        }
    }

    public ResponseData getData() {
        return this.mData;
    }
}
