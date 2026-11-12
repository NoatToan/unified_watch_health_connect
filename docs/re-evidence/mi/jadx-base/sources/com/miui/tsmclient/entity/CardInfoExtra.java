package com.miui.tsmclient.entity;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class CardInfoExtra {
    private static final int BALANCE_CARD = 1;
    private static final int FLAG_ALLOW_QUERY_SITE_INFO = 512;
    private static final int FLAG_SUPPORT_AREA = 4;
    private static final int FLAG_SUPPORT_BALANCE_REMIND = 32768;
    private static final int FLAG_SUPPORT_SERVICE_FEE_REFUND = 256;
    private static final int FLAG_SUPPORT_TRADE_REMIND = 65536;
    private static final int POSTPAID_CARD = 2;

    @SerializedName("uwbSupported")
    private boolean isSupportUwb;

    @SerializedName("cardConfigs")
    private int mCardConfig;

    @SerializedName("cardMode")
    private int mCardMode = 1;

    @SerializedName("cardToast")
    private String mCardToast;

    @SerializedName("notShowInCardList")
    private boolean mNotShowInCardList;

    @SerializedName("notShowWhenUnissued")
    private boolean mNotShowWhenUnissued;

    @SerializedName("returnDeleteConfigs")
    private int mReturnDeleteConfigs;

    public static CardInfoExtra get(String str) {
        return (CardInfoExtra) new Gson().fromJson(str, CardInfoExtra.class);
    }

    public String getCardToast() {
        return this.mCardToast;
    }

    public boolean isAllowQuerySiteInfo() {
        return (this.mCardConfig & 512) != 0;
    }

    public boolean isBalanceCard() {
        return this.mCardMode == 1;
    }

    public boolean isNotShowInCardList() {
        return this.mNotShowInCardList;
    }

    public boolean isNotShowWhenUnissued() {
        return this.mNotShowWhenUnissued;
    }

    public boolean isPostPaidCard() {
        return this.mCardMode == 2;
    }

    public boolean isShowSupportedArea() {
        return (this.mCardConfig & 4) != 0;
    }

    public boolean isSupportBalanceRemind() {
        return (this.mCardConfig & 32768) != 0;
    }

    public boolean isSupportServiceFeeRefund() {
        return (this.mReturnDeleteConfigs & 256) != 0;
    }

    public boolean isSupportTradeRemind() {
        return (this.mCardConfig & 65536) != 0;
    }

    public boolean isSupportUwb() {
        return this.isSupportUwb;
    }
}
