package com.miui.tsmclient.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class PersonalCardFace {

    @SerializedName("cardFace")
    private String mCardFace;

    @SerializedName("cardName")
    private String mCardType;

    public String getCardFace() {
        return this.mCardFace;
    }

    public String getCardType() {
        return this.mCardType;
    }
}
