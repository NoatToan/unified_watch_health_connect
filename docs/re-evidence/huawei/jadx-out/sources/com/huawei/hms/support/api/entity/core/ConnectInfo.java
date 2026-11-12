package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ConnectInfo implements IMessageEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Packed
    private List<String> f16506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Packed
    private List<Scope> f16507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Packed
    private String f16508c;

    @Packed
    private String d;

    public ConnectInfo() {
    }

    public List<String> getApiNameList() {
        return this.f16506a;
    }

    public String getFingerprint() {
        return this.f16508c;
    }

    public List<Scope> getScopeList() {
        return this.f16507b;
    }

    public String getSubAppID() {
        return this.d;
    }

    public void setApiNameList(List<String> list) {
        this.f16506a = list;
    }

    public void setFingerprint(String str) {
        this.f16508c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f16507b = list;
    }

    public void setSubAppID(String str) {
        this.d = str;
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f16506a = list;
        this.f16507b = list2;
        this.f16508c = str;
        this.d = str2;
    }
}
