package com.xiaomi.onetrack.b;

import com.xiaomi.onetrack.util.p;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ArrayList f13815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13816b;

    public i(h hVar, ArrayList arrayList) {
        this.f13816b = hVar;
        this.f13815a = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (p.f13986a) {
            p.a("ConfigDbManager", "update: " + this.f13815a);
        }
        this.f13816b.b((ArrayList<l>) this.f13815a);
    }
}
