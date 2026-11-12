package com.miui.tsmclient.entity;

/* JADX INFO: loaded from: classes6.dex */
public enum CardActionType {
    UNKNOWN(-1),
    ISSUE(1),
    RECHARGE(2),
    TRANSFER(3),
    TRANSFER_OUT(4),
    TRANSFER_IN(5),
    AFTER_SALE(10);

    private int mId;

    CardActionType(int i) {
        this.mId = i;
    }

    public static CardActionType get(int i) {
        for (CardActionType cardActionType : values()) {
            if (cardActionType.mId == i) {
                return cardActionType;
            }
        }
        return UNKNOWN;
    }

    public int getId() {
        return this.mId;
    }
}
