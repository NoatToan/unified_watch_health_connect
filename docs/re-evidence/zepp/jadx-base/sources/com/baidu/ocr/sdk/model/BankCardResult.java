package com.baidu.ocr.sdk.model;

/* JADX INFO: loaded from: classes2.dex */
public class BankCardResult extends ResponseResult {
    private String bankCardNumber;
    private BankCardType bankCardType;
    private String bankName;

    public enum BankCardType {
        Unknown(0),
        Debit(1),
        Credit(2);

        private final int id;

        BankCardType(int i) {
            this.id = i;
        }

        public static BankCardType FromId(int i) {
            if (i != 1) {
                return i != 2 ? Unknown : Credit;
            }
            return Debit;
        }
    }

    public String getBankCardNumber() {
        return this.bankCardNumber;
    }

    public BankCardType getBankCardType() {
        return this.bankCardType;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankCardNumber(String str) {
        this.bankCardNumber = str;
    }

    public void setBankCardType(BankCardType bankCardType) {
        this.bankCardType = bankCardType;
    }

    public void setBankName(String str) {
        this.bankName = str;
    }

    public void setBankCardType(int i) {
        this.bankCardType = BankCardType.FromId(i);
    }
}
