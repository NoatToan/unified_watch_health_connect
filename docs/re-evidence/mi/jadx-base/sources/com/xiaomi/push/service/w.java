package com.xiaomi.push.service;

import defpackage.x9s;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class w implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f14267a;

    public w(v vVar) {
        this.f14267a = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Iterator it = this.f14267a.d.values().iterator();
            while (it.hasNext()) {
                ((v.a) it.next()).run();
            }
        } catch (Exception e) {
            x9s.o("Sync job exception :" + e.getMessage());
        }
        this.f14267a.c = false;
    }
}
