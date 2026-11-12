package com.sogou.map.loc;

import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
final class s2 implements Runnable {
    private /* synthetic */ SGLocClient a;
    private final /* synthetic */ SGLocation b;

    public s2(SGLocClient sGLocClient, SGLocation sGLocation) {
        this.a = sGLocClient;
        this.b = sGLocation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r0.b("Got Result: " + this.b);
        if (this.b.g()) {
            r0.b("errListenerLs size: " + this.a.m.size());
            Iterator it2 = this.a.m.iterator();
            while (it2.hasNext()) {
                ((SGErrorListener) it2.next()).onError(this.b.c(), this.b.e());
            }
            return;
        }
        r0.b("locListenerLs size: " + this.a.l.size());
        Iterator it3 = this.a.l.iterator();
        while (it3.hasNext()) {
            ((SGLocListener) it3.next()).onLocationUpdate(this.b);
        }
    }
}
