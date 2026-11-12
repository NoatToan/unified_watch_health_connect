package com.beaglebuddy.id3.pojo;

import com.beaglebuddy.id3.enums.Currency;

/* JADX INFO: loaded from: classes2.dex */
public class Price {
    private Currency a;
    private String b;

    public Price() {
        this(Currency.USD, "0.00");
    }

    public String getAmount() {
        return this.b;
    }

    public Currency getCurrency() {
        return this.a;
    }

    public void setAmount(String str) {
        if (str.matches("^\\d+\\.?\\d*$")) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException(str + " is not valid amount.");
    }

    public void setCurrency(Currency currency) {
        this.a = currency;
    }

    public String toString() {
        return this.a.toString() + this.b;
    }

    public Price(Currency currency, String str) throws IllegalArgumentException {
        setCurrency(currency);
        setAmount(str);
    }
}
