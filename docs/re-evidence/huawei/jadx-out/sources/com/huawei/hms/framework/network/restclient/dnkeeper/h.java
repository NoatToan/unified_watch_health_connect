package com.huawei.hms.framework.network.restclient.dnkeeper;

import com.huawei.hms.framework.network.restclient.hwhttp.dns.DnsResult;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes10.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Future f13386c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f13384a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f13385b = 0;
    private DnsResult d = new DnsResult();

    public boolean d() {
        return this.f13384a;
    }

    public long c() {
        return this.f13385b;
    }

    public Future b() {
        return this.f13386c;
    }

    public void a(boolean z) {
        this.f13384a = z;
    }

    public void a(Future future) {
        this.f13386c = future;
    }

    public void a(DnsResult dnsResult) {
        this.d = dnsResult;
    }

    public void a(long j) {
        this.f13385b = j;
    }

    public DnsResult a() {
        return this.d;
    }
}
