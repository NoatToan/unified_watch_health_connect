package com.huawei.hianalytics.framework;

import com.huawei.hianalytics.core.storage.IStorageHandler;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public IStorageHandler f11518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f11519b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f11520c = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public final void a(String str) {
        Integer num = (Integer) this.d.get(str);
        int iIntValue = (num != null ? num.intValue() : 0) + 1;
        this.d.put(str, Integer.valueOf(iIntValue));
        if (iIntValue <= 0 || iIntValue > 4) {
            this.f11520c.put(str, 1800000L);
        } else {
            this.f11520c.put(str, Long.valueOf(((long) iIntValue) * 300000));
        }
    }
}
