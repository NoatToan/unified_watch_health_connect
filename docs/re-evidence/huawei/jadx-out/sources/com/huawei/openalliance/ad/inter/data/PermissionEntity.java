package com.huawei.openalliance.ad.inter.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class PermissionEntity implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f19190b;

    public int getType() {
        return this.f19190b;
    }

    public String getName() {
        return this.f19189a;
    }

    public void a(String str) {
        this.f19189a = str;
    }

    public void a(int i) {
        this.f19190b = i;
    }

    public PermissionEntity(String str, int i) {
        this.f19189a = str;
        this.f19190b = i;
    }

    public PermissionEntity() {
    }
}
