package com.huawei.openalliance.ad;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class dv implements com.huawei.openalliance.ad.download.a<dx> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, Set<com.huawei.openalliance.ad.download.a<dx>>> f18649a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.huawei.openalliance.ad.analysis.h f18650b;

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void onDownloadFail(dx dxVar) {
        a("2", dxVar);
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().onDownloadFail(dxVar);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void b(dx dxVar) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().b(dxVar);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onDownloadSuccess(dx dxVar) {
        a("5", dxVar);
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().onDownloadSuccess(dxVar);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onDownloadProgress(dx dxVar) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().onDownloadProgress(dxVar);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void c(dx dxVar, boolean z) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().c(dxVar, z);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onDownloadStart(dx dxVar) {
        dxVar.a(Long.valueOf(com.huawei.openalliance.ad.utils.as.c()));
        a("72", dxVar);
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().onDownloadStart(dxVar);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void b(dx dxVar, boolean z) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().b(dxVar, z);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(dx dxVar) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().a(dxVar);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    public void a(dx dxVar, boolean z) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().a(dxVar, z);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.download.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onDownloadWaiting(dx dxVar) {
        Set<com.huawei.openalliance.ad.download.a<dx>> setA = a(dxVar.n());
        if (setA != null) {
            Iterator<com.huawei.openalliance.ad.download.a<dx>> it = setA.iterator();
            while (it.hasNext()) {
                it.next().onDownloadWaiting(dxVar);
            }
        }
    }

    private void a(final String str, final dx dxVar) {
        if (this.f18650b != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.dv.1
                @Override // java.lang.Runnable
                public void run() {
                    dv.this.f18650b.a(dxVar, str, jCurrentTimeMillis);
                }
            });
        }
    }

    private Set<com.huawei.openalliance.ad.download.a<dx>> a(String str) {
        Set<com.huawei.openalliance.ad.download.a<dx>> set;
        synchronized (this) {
            set = this.f18649a.get(str);
        }
        return set;
    }

    dv(Context context) {
        this.f18650b = new com.huawei.openalliance.ad.analysis.h(context);
    }
}
