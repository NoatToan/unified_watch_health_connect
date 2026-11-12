package com.huami.wallet.lib.entity;

/* JADX INFO: loaded from: classes13.dex */
public interface OrderState {
    public static final int OPEN_CARD_FAILED = 2;
    public static final int OPEN_CARD_SUCCESS = 1;
    public static final int OPEN_CARD_SUCCESS_BUT_RECHARGE_FAILED = 3;
    public static final int PURE_OPEN_CARD_FAILED = 11;
    public static final int PURE_OPEN_CARD_SUCCESS = 10;
    public static final int RECHARGE_FAILED = 5;
    public static final int RECHARGE_SUCCESS = 4;
    public static final int REFUNDING = 7;
    public static final int REFUND_FAIL = 8;
    public static final int REFUND_SUCCESS = 9;
    public static final int SHIFT_IN_FAILED = 13;
    public static final int SHIFT_IN_SUCCESS = 12;
    public static final int SHIFT_OUT_FAILED = 15;
    public static final int SHIFT_OUT_SUCCESS = 14;
    public static final int UNKNOWN = 0;
}
