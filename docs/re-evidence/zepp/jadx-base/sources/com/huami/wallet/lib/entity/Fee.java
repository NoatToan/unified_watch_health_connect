package com.huami.wallet.lib.entity;

/* JADX INFO: loaded from: classes13.dex */
public class Fee {
    public int id;
    public int rechargeAmountDiscount;
    public int rechargeAmountRaw;
    public int serviceChargeDiscount;
    public int serviceChargeRaw;
    public int type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fee)) {
            return false;
        }
        Fee fee = (Fee) obj;
        return this.id == fee.id && this.serviceChargeRaw == fee.serviceChargeRaw && this.serviceChargeDiscount == fee.serviceChargeDiscount && this.rechargeAmountRaw == fee.rechargeAmountRaw && this.rechargeAmountDiscount == fee.rechargeAmountDiscount && this.type == fee.type;
    }
}
