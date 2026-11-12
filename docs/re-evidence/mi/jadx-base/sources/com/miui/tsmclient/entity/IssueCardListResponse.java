package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.common.data.CommonResponseInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class IssueCardListResponse extends CommonResponseInfo {

    @SerializedName("data")
    private List<IssuedCardExtraData> mData;

    public static class IssuedCardExtraData {

        @SerializedName("aid")
        private String mAid;

        @SerializedName("cardId")
        private String mCardId;

        @SerializedName("cardName")
        private String mCardName;

        @SerializedName("cplc")
        private String mCplc;

        @SerializedName("faceNo")
        private String mFaceNO;

        @SerializedName(TSMAuthContants.PARAM_LOGICAL_NO)
        private String mLogicalNO;

        @SerializedName("orderId")
        private String mOrderId;

        @SerializedName("dpanCode")
        private String mPanCode;

        @SerializedName("physicalNo")
        private String mPhysicalNO;

        @SerializedName("userId")
        private String mUserId;

        @SerializedName("uwbProperties")
        private int mUwbProperties;

        public String getAid() {
            return this.mAid;
        }

        public String getCardId() {
            return this.mCardId;
        }

        public String getCardName() {
            return this.mCardName;
        }

        public String getCplc() {
            return this.mCplc;
        }

        public String getFaceNO() {
            return this.mFaceNO;
        }

        public String getLogicalNO() {
            return this.mLogicalNO;
        }

        public String getOrderId() {
            return this.mOrderId;
        }

        public String getPanCode() {
            return this.mPanCode;
        }

        public String getPhysicalNO() {
            return this.mPhysicalNO;
        }

        public String getUserId() {
            return this.mUserId;
        }

        public int getUwbProperties() {
            return this.mUwbProperties;
        }
    }

    public List<IssuedCardExtraData> getData() {
        return this.mData;
    }
}
