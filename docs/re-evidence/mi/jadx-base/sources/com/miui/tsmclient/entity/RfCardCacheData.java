package com.miui.tsmclient.entity;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class RfCardCacheData {
    public static final int PICK_TYPE_INTELLIGENT = 2;
    public static final int PICK_TYPE_QUICK = 1;
    private static final String SEPARATOR = "&";
    private String mAid;
    private int mCardGroupId;
    private int mPickType;

    public RfCardCacheData(CardInfo cardInfo, int i) {
        if (cardInfo == null) {
            this.mAid = "none";
            return;
        }
        this.mAid = cardInfo.mAid;
        this.mCardGroupId = cardInfo.mCardGroupId;
        this.mPickType = i;
    }

    public String buildCacheStr() {
        return this.mAid + "&" + this.mCardGroupId + "&" + this.mPickType;
    }

    public String getAid() {
        return this.mAid;
    }

    public CardGroupType getCardGroupType() {
        return CardGroupType.newInstance(this.mCardGroupId);
    }

    public CardInfo getCardInfo() {
        CardInfo cardInfo = new CardInfo(CardInfo.CARD_TYPE_DUMMY);
        cardInfo.mAid = this.mAid;
        cardInfo.mCardGroupId = this.mCardGroupId;
        return cardInfo;
    }

    public int getPickType() {
        return this.mPickType;
    }

    public RfCardCacheData(CardInfo cardInfo) {
        this(cardInfo, 0);
    }

    public RfCardCacheData(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArrSplit = str.split("&");
        if (strArrSplit.length > 0) {
            this.mAid = strArrSplit[0];
        }
        if (strArrSplit.length > 1 && TextUtils.isDigitsOnly(strArrSplit[1])) {
            this.mCardGroupId = Integer.valueOf(strArrSplit[1]).intValue();
        }
        if (strArrSplit.length <= 2 || !TextUtils.isDigitsOnly(strArrSplit[2])) {
            return;
        }
        this.mPickType = Integer.valueOf(strArrSplit[2]).intValue();
    }
}
