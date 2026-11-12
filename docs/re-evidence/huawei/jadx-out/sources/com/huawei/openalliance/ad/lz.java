package com.huawei.openalliance.ad;

import com.iab.omid.library.huawei.adsession.AdEvents;
import com.iab.omid.library.huawei.adsession.AdSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lz extends ma implements me {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19511a = mi.a("com.iab.omid.library.huawei.adsession.AdEvents");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<AdEvents> f19512b = new ArrayList();

    @Override // com.huawei.openalliance.ad.mu
    public void f() {
        hw.b("DisplayEventAgent", "load");
        if (this.f19512b.isEmpty()) {
            hw.b("DisplayEventAgent", "load, AdEventList isEmpty");
            return;
        }
        try {
            Iterator<AdEvents> it = this.f19512b.iterator();
            while (it.hasNext()) {
                it.next().loaded();
            }
        } catch (IllegalStateException unused) {
            hw.b("DisplayEventAgent", "loaded, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mu
    public void e() {
        hw.b("DisplayEventAgent", "impressionOccurred");
        if (this.f19512b.isEmpty()) {
            hw.c("DisplayEventAgent", "impressionOccurred, mAdEventList isEmpty");
            return;
        }
        try {
            Iterator<AdEvents> it = this.f19512b.iterator();
            while (it.hasNext()) {
                it.next().impressionOccurred();
            }
        } catch (IllegalStateException unused) {
            hw.b("DisplayEventAgent", "impressionOccurred, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.me
    public void b() {
        this.f19512b.clear();
    }

    @Override // com.huawei.openalliance.ad.me
    public void a(mq mqVar) {
        if (mqVar instanceof lx) {
            List<AdSession> listB = ((lx) mqVar).b();
            if (listB.isEmpty()) {
                return;
            }
            for (AdSession adSession : listB) {
                if (adSession != null) {
                    this.f19512b.add(AdEvents.createAdEvents(adSession));
                }
            }
        }
    }

    public static boolean a() {
        return f19511a;
    }

    lz() {
    }
}
