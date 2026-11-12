package com.miui.tsmclient.entity;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.miui.tsmclient.net.TSMAuthContants;
import com.miui.tsmclient.pay.OrderInfo;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class OrderDetailInfo {
    private static final int FLAG_REFUND = 2;
    private static final int FLAG_REFUND_SUCCESS = 8;
    private static final int FLAG_RETRY = 4;
    private static final int FLAG_SUCCESS = 1;

    @SerializedName("cardName")
    private String mCardType;

    @SerializedName("hint")
    private String mHint;

    @SerializedName("orderFlow")
    private List<OrderFlow> mOrderFlows;

    @SerializedName("orderId")
    private String mOrderId;

    @SerializedName("refundDesc")
    private String mRefundDesc;

    @SerializedName(TSMAuthContants.PARAM_SPORDERID)
    private String mSpOrderId;

    @SerializedName("status")
    private int mStatus;

    @SerializedName("statusDesc")
    private String mStatusDesc;

    @SerializedName("shouldReadCardWhenRefund")
    private boolean mSyncBeforeRefund;

    @SerializedName("time")
    private String mTime;

    @SerializedName("unfinishedOrder")
    private OrderInfo mUnfinishedOrder;

    public static class OrderFlow {

        @SerializedName("copyable")
        private boolean isCopyable;

        @SerializedName("amount")
        private int mAmount;

        @SerializedName("desc")
        private String mDesc;

        @SerializedName("leftTitle")
        private String mKey;

        @SerializedName("leftContent")
        private String mSubKey;

        @SerializedName("rightContent")
        private String mSubValue;

        @SerializedName("time")
        private String mTime;

        @SerializedName("title")
        private String mTitle;

        @SerializedName("rightTitle")
        private String mValue;

        public int getAmount() {
            return this.mAmount;
        }

        public String getDesc() {
            return this.mDesc;
        }

        public String getKey() {
            return this.mKey;
        }

        public String getSubKey() {
            return this.mSubKey;
        }

        public String getSubValue() {
            return this.mSubValue;
        }

        public String getTime() {
            return this.mTime;
        }

        public String getTitle() {
            return this.mTitle;
        }

        public String getValue() {
            return this.mValue;
        }

        public boolean isCopyable() {
            return this.isCopyable;
        }

        public boolean shouldShowNewOrderFlow() {
            return (TextUtils.isEmpty(this.mKey) && TextUtils.isEmpty(this.mSubKey) && TextUtils.isEmpty(this.mValue) && TextUtils.isEmpty(this.mSubValue)) ? false : true;
        }
    }

    public boolean canRefund() {
        return (this.mStatus & 2) == 2;
    }

    public boolean canRetry() {
        return (this.mStatus & 4) == 4;
    }

    public String getCardType() {
        return this.mCardType;
    }

    public String getHint() {
        return this.mHint;
    }

    public List<OrderFlow> getOrderFlows() {
        return this.mOrderFlows;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public int getRechargeAmount() {
        if (isRechargeOrder()) {
            return this.mUnfinishedOrder.getRechargeAmount();
        }
        return 0;
    }

    public String getRefundDesc() {
        return this.mRefundDesc;
    }

    public String getSpOrderId() {
        return this.mSpOrderId;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStatusDesc() {
        return this.mStatusDesc;
    }

    public String getTime() {
        return this.mTime;
    }

    public OrderInfo getUnfinishedOrder() {
        return this.mUnfinishedOrder;
    }

    public boolean isIssuable(CardInfo cardInfo) {
        return (cardInfo == null || cardInfo.mHasIssue || !isIssueOrWithdrawOrder()) ? false : true;
    }

    public boolean isIssueOrWithdrawOrder() {
        OrderInfo orderInfo = this.mUnfinishedOrder;
        return orderInfo != null && orderInfo.isIssueOrWithdrawOrder();
    }

    public boolean isRechargeOrder() {
        OrderInfo orderInfo = this.mUnfinishedOrder;
        if (orderInfo != null) {
            return orderInfo.isRechargeOrder();
        }
        return false;
    }

    public boolean isRefundSuccess() {
        return (this.mStatus & 8) == 8;
    }

    public boolean isSuccess() {
        return (this.mStatus & 1) == 1 || isRefundSuccess();
    }

    public boolean isSyncBeforeRefund() {
        return this.mSyncBeforeRefund;
    }
}
