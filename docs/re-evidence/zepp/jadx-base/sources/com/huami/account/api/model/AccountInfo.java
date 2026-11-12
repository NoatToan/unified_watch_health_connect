package com.huami.account.api.model;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class AccountInfo implements Serializable {
    private static final long serialVersionUID = 3;
    private Map<String, String> a = new HashMap();

    public Set<String> getBoundProviders() {
        return this.a.keySet();
    }

    public String getIdByProvider(String str) {
        return this.a.get(str);
    }

    public List<String> getOtherList() {
        ArrayList arrayList = new ArrayList(this.a.keySet());
        arrayList.remove("xiaomi");
        arrayList.remove("wechat");
        return arrayList;
    }

    public String getWechatId() {
        return this.a.get("wechat");
    }

    public String getXiaomiId() {
        return this.a.get("xiaomi");
    }

    public boolean isBind(String str) {
        return !TextUtils.isEmpty(this.a.get(str));
    }

    public boolean isUniqueProvider(String str) {
        Set<String> setKeySet = this.a.keySet();
        return setKeySet.size() == 1 && setKeySet.contains(str);
    }

    public void setAccountId(String str, String str2) {
        this.a.put(str, str2);
    }
}
