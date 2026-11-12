package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes41.dex */
public abstract class oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected gk f19808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ht f19809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19810c = "min_show_time_task" + hashCode();
    private final String d = "max_show_time_task" + hashCode();

    public void a() {
    }

    protected void d() {
        com.huawei.openalliance.ad.utils.dq.a(this.f19810c);
    }

    protected void c() {
        ht htVar = this.f19809b;
        if (htVar != null) {
            htVar.b();
        }
    }

    protected void b(long j) {
        hw.b(getClass().getSimpleName(), "start min show time task duration: %d", Long.valueOf(j));
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.oa.2
            @Override // java.lang.Runnable
            public void run() {
                oa.this.b();
            }
        }, this.f19810c, j);
    }

    protected void b() {
        ht htVar = this.f19809b;
        if (htVar != null) {
            htVar.a();
        }
    }

    protected void a(long j) {
        hw.b(getClass().getSimpleName(), "start max show time task duration: %d", Long.valueOf(j));
        com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.oa.1
            @Override // java.lang.Runnable
            public void run() {
                hw.a(getClass().getSimpleName(), "cancelMinShowTimeCountTask and cancelMinShowTimeCountTask");
                oa.this.d();
                oa.this.c();
            }
        }, this.d, j);
    }

    public oa(gk gkVar, ht htVar) {
        this.f19808a = gkVar;
        this.f19809b = htVar;
    }
}
