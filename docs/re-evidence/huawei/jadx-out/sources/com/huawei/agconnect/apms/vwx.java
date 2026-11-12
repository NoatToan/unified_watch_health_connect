package com.huawei.agconnect.apms;

import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class vwx {
    public static vwx efg;
    public final HashSet bcd = new HashSet();
    public AtomicBoolean cde = new AtomicBoolean(false);
    public AtomicLong def = new AtomicLong(0);
    public ExecutorService abc = Executors.newSingleThreadExecutor(new m("AppStateMonitor"));

    public static vwx abc() {
        if (efg == null) {
            efg = new vwx();
        }
        return efg;
    }

    public final void abc(rst rstVar) {
        synchronized (this.bcd) {
            this.bcd.add(rstVar);
        }
    }
}
