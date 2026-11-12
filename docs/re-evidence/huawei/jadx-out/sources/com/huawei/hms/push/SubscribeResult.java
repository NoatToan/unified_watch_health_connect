package com.huawei.hms.push;

import com.huawei.hms.push.notification.SubscribedItem;
import com.huawei.hms.support.api.client.Result;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class SubscribeResult extends Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f15855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<SubscribedItem> f15856b;

    public String getErrorMsg() {
        return this.f15855a;
    }

    public List<SubscribedItem> getSubscribedItems() {
        return this.f15856b;
    }

    public void setErrorMsg(String str) {
        this.f15855a = str;
    }

    public void setSubscribedItems(List<SubscribedItem> list) {
        this.f15856b = list;
    }
}
