package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.db.bean.ContentRecord;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18377a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static de f18378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Map<String, ContentRecord> f18379c = new ConcurrentHashMap();

    public void b(String str) {
        if (this.f18379c.containsKey(str)) {
            this.f18379c.remove(str);
        }
    }

    public void a(String str, ContentRecord contentRecord) {
        hw.a("AdRecordManager", "task size before: %s", Integer.valueOf(this.f18379c.size()));
        contentRecord.i(System.currentTimeMillis());
        this.f18379c.put(str, contentRecord);
        b();
    }

    public ContentRecord a(String str) {
        return this.f18379c.get(str);
    }

    private void b() {
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.de.1
            @Override // java.lang.Runnable
            public void run() {
                for (Map.Entry entry : new ConcurrentHashMap(de.this.f18379c).entrySet()) {
                    hw.a("AdRecordManager", "entry key: %s time: %s", entry.getKey(), Long.valueOf(((ContentRecord) entry.getValue()).bg()));
                    if (System.currentTimeMillis() - ((ContentRecord) entry.getValue()).bg() > 86400000) {
                        de.this.f18379c.remove(entry.getKey());
                    }
                }
            }
        });
    }

    public static de a() {
        de deVar;
        synchronized (f18377a) {
            if (f18378b == null) {
                f18378b = new de();
            }
            deVar = f18378b;
        }
        return deVar;
    }

    private de() {
    }
}
