package com.huawei.openalliance.ad;

/* JADX INFO: loaded from: classes12.dex */
public class kb implements kw {
    @Override // com.huawei.openalliance.ad.kw
    public void a(final Object obj) {
        if (obj == null) {
            return;
        }
        final String name = Thread.currentThread().getName();
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.kb.1
            @Override // java.lang.Runnable
            public void run() {
                hw.b("HiAdResponseDataLogger", "upper thread name: %s response data: %s ", name, com.huawei.openalliance.ad.utils.bk.c(obj));
            }
        });
    }
}
