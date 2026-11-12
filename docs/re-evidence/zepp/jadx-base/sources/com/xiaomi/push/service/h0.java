package com.xiaomi.push.service;

import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
class h0 implements Runnable {
    public final /* synthetic */ bp a;

    public h0(bp bpVar) {
        this.a = bpVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Iterator it2 = this.a.d.values().iterator();
            while (it2.hasNext()) {
                ((bp.a) it2.next()).run();
            }
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("Sync job exception :" + e.getMessage());
        }
        this.a.c = false;
    }
}
