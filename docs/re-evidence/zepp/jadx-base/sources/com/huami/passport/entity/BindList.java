package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class BindList extends Entity {

    @SerializedName("data")
    private List<BindAccount> accounts;

    public List<BindAccount> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(List<BindAccount> list) {
        this.accounts = list;
    }
}
