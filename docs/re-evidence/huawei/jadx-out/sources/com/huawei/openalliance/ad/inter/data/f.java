package com.huawei.openalliance.ad.inter.data;

import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class f implements IPreCheckInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f19217c;
    private int d = -1;
    private boolean e;

    @Override // com.huawei.openalliance.ad.inter.data.IPreCheckInfo
    public boolean isStrategyFiltered() {
        return this.e;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPreCheckInfo
    public String getSlotId() {
        return this.f19215a;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPreCheckInfo
    public int getPreCheckResult() {
        return this.d;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPreCheckInfo
    public Map<String, String> getExt() {
        return this.f19217c;
    }

    @Override // com.huawei.openalliance.ad.inter.data.IPreCheckInfo
    public String getContentId() {
        return this.f19216b;
    }

    public void b(String str) {
        this.f19216b = str;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void a(Map<String, String> map) {
        this.f19217c = map;
    }

    public void a(String str) {
        this.f19215a = str;
    }

    public void a(int i) {
        this.d = i;
    }
}
