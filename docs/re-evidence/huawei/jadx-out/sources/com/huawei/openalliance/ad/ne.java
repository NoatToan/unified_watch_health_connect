package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.beans.metadata.App;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class ne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<App> f19674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile long f19675b;

    public long b() {
        return this.f19675b;
    }

    public void a(List<App> list) {
        this.f19674a = list;
    }

    public void a(long j) {
        this.f19675b = j;
    }

    public List<App> a() {
        return this.f19674a;
    }
}
