package com.xiaomi.ai.domain.phonecall.common;

/* JADX INFO: loaded from: classes7.dex */
public enum CardType {
    DEFAULT("default"),
    CARD_ONE("card_one"),
    CARD_TWO("card_two"),
    SIM_CARD("sim_card");

    private String text;

    CardType(String str) {
        this.text = str;
    }

    public static CardType fromString(String str) {
        for (CardType cardType : values()) {
            if (cardType.getText().equalsIgnoreCase(str)) {
                return cardType;
            }
        }
        return null;
    }

    public String getText() {
        return this.text;
    }
}
