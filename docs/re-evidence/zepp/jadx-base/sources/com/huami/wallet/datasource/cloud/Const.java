package com.huami.wallet.datasource.cloud;

/* JADX INFO: loaded from: classes13.dex */
interface Const {

    public interface CardState {
        public static final String BINDING = "BINDING";
        public static final String EXCEPTION = "EXCEPTION";
        public static final String OFFLINE = "OFFLINE";
        public static final String RESET = "RESET";
        public static final String RETURN_EXCEPTION = "RETURN_EXCEPTION";
        public static final String SHIFT_IN = "SHIFT_IN";
        public static final String SHIFT_IN_EXCEPTION = "SHIFT_IN_EXCEPTION";
        public static final String SHIFT_OUT_EXCEPTION = "SHIFT_OUT_EXCEPTION";
        public static final String SHIFT_UNAVAILABLE_LIMIT = "SHIFT_UNAVAILABLE_LIMIT";
        public static final String SHIFT_UNAVAILABLE_LIMIT_LNT = "SHIFT_UNAVAILABLE_LIMIT_LNT";
        public static final String SHIFT_UNAVAILABLE_LIMIT_MOT = "SHIFT_UNAVAILABLE_LIMIT_MOT";
        public static final String SHIFT_UNAVAILABLE_SAME_BINDING = "SHIFT_UNAVAILABLE_SAME_BINDING";
        public static final String UNAVAILABLE = "UNAVAILABLE";
        public static final String UNAVAILABLE_LIMIT = "UNAVAILABLE_LIMIT";
        public static final String UNAVAILABLE_LIMIT_LNT = "UNAVAILABLE_LIMIT_LNT";
        public static final String UNAVAILABLE_LIMIT_MOT = "UNAVAILABLE_LIMIT_MOT";
        public static final String UNBINDING = "UNBINDING";
        public static final String UNOPENED = "UNOPENED";
    }

    public interface InternalErrorCode {
        public static final String CANCEL_ALIPAY = "6001";
        public static final String CODE_NO_BALANCE = "c0002";
        public static final String CODE_NO_CARD_DETAIL = "c0003";
        public static final String CODE_NO_CARD_NUMBER = "c0011";
        public static final String CODE_NO_CITY = "c0008";
        public static final String CODE_NO_CITY_DETAIL = "c0009";
        public static final String CODE_NO_CPLC = "c0001";
        public static final String CODE_NO_ORDER_INFO = "c0010";
        public static final String CODE_NO_ORDER_TOKEN = "c0012";
        public static final String CODE_NO_ORDER_TYPE = "c0004";
        public static final String CODE_NO_PAY_RESPONSE = "c0013";
        public static final String CODE_NO_RECHARGE_AMOUNTS = "c0005";
        public static final String CODE_NO_VERIFIED_PHONE = "c0007";
        public static final String HTTP_SMS_CODE_NOT_MATCHED = "http409";
    }

    public interface OrderStatus {
        public static final String CREATED = "1000";
        public static final String DEDUCTED_BUT_DOUBTFUL = "1009";
        public static final String DEDUCTED_BUT_NOT_CONFIRM = "1007";
        public static final String DEDUCTED_BUT_NOT_HANDLE = "1006";
        public static final String DEDUCTED_BUT_OPEN_FAIL = "1001";
        public static final String DEDUCTED_BUT_RECHARGE_FAIL = "1002";
        public static final String DEDUCTED_BUT_REFUNDING = "1004";
        public static final String DEDUCTED_BUT_REFUND_FAIL = "1005";
        public static final String DEDUCTION_FAIL = "1003";
        public static final String REFUND_SUCCESS = "1008";
        public static final String SHIFT_IN_SUCCESS = "1012";
        public static final String SHIFT_OUT_SUCCESS = "1010";
        public static final String SUCCESS = "0000";
    }

    public interface Tag {
        public static final String BENCHAMRK = "Wallet-Benchmark";
        public static final String PREFIX = "Wallet-";
    }

    public interface XiaomiOrderType {
        public static final int OPEN = 1;
        public static final int OPEN_AND_RECHARGE = 3;
        public static final int RECHARGE = 2;
    }
}
