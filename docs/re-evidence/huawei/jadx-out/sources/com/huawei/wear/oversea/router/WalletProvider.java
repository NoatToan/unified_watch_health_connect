package com.huawei.wear.oversea.router;

import android.content.Context;
import defpackage.xoh;
import defpackage.xoj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public abstract class WalletProvider {
    private HashMap<String, WalletAction> actionMap = new HashMap<>();
    private String domain;
    private String schema;

    public abstract String getName();

    protected abstract void registerActions();

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public xoj invokeAction(String str, Context context, Map<String, Object> map) {
        WalletAction walletActionFindAction = findAction(str);
        if (walletActionFindAction != null) {
            return walletActionFindAction.invoke(context, new xoh(str, map));
        }
        xoj xojVar = new xoj();
        xojVar.e("");
        xojVar.a("Action not found,domain: " + this.domain + " actionName: " + str);
        return xojVar;
    }

    protected void registerAction(String str, WalletAction walletAction) {
        this.actionMap.put(str, walletAction);
    }

    public WalletAction findAction(String str) {
        return this.actionMap.get(str);
    }

    public String getSchema() {
        return this.schema;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public String getAbsoluteName() {
        if (getSchema() != null) {
            return getSchema() + ":" + getDomain() + "_" + getName();
        }
        return getDomain() + "_" + getName();
    }
}
