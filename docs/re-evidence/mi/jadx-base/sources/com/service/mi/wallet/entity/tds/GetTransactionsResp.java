package com.service.mi.wallet.entity.tds;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class GetTransactionsResp extends BaseTdsResp {
    private String authenticationCode;
    private String lastUpdatedTag;
    private List<Transaction> transactions;

    public GetTransactionsResp(String str, String str2) {
        super(str, str2);
    }

    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public String getLastUpdatedTag() {
        return this.lastUpdatedTag;
    }

    public List<Transaction> getTransactions() {
        return this.transactions;
    }

    public void setAuthenticationCode(String str) {
        this.authenticationCode = str;
    }

    public void setLastUpdatedTag(String str) {
        this.lastUpdatedTag = str;
    }

    public void setTransactions(List<Transaction> list) {
        this.transactions = list;
    }
}
