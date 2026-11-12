package com.service.mi.wallet.entity;

/* JADX INFO: loaded from: classes6.dex */
public class FundingAccountData {
    private AccountHolderData accountHolderData;
    private CardAccountData cardAccountData;
    private String source;

    public AccountHolderData getAccountHolderData() {
        return this.accountHolderData;
    }

    public CardAccountData getCardAccountData() {
        return this.cardAccountData;
    }

    public String getSource() {
        return this.source;
    }

    public void setAccountHolderData(AccountHolderData accountHolderData) {
        this.accountHolderData = accountHolderData;
    }

    public void setCardAccountData(CardAccountData cardAccountData) {
        this.cardAccountData = cardAccountData;
    }

    public void setSource(String str) {
        this.source = str;
    }
}
