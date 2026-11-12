package com.miui.tsmclient.entity;

/* JADX INFO: loaded from: classes6.dex */
public enum CardGroupType {
    TRANSCARD(1),
    BANKCARD(2),
    MIFARECARD(3),
    EIDCARD(4),
    QRBANKCARD(5),
    DCEP(6),
    CCC(7),
    PROPRIETARYCARKEY(8),
    BLECARKEY(9),
    ICCOACARKEY(10);

    private int mId;

    CardGroupType(int i) {
        this.mId = i;
    }

    public static CardGroupType newInstance(int i) {
        for (CardGroupType cardGroupType : values()) {
            if (cardGroupType.mId == i) {
                return cardGroupType;
            }
        }
        return null;
    }

    public int getId() {
        return this.mId;
    }
}
