package com.mapbox.common.experimental;

import hs2.e;
import java.util.Iterator;
import jn2.u;
import org.slf4j.Logger;
import p1.z;
import wr.g;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f54361b;

    public /* synthetic */ a(long j8, int i14) {
        this.f54360a = i14;
        this.f54361b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f54360a) {
            case 0:
                MapboxSupport.setPeer$lambda$0(this.f54361b);
                break;
            case 1:
                z<hs2.a> zVar = u.f99684e;
                long j8 = this.f54361b;
                hs2.a aVarB = zVar.b(j8);
                if (aVarB != null) {
                    u.f99680a.getClass();
                    u.c(aVarB, j8);
                }
                break;
            default:
                Logger logger = u.f99681b;
                long j14 = this.f54361b;
                g.v("handleDeviceDisconnected(", j14, "): notifying listeners...", logger);
                Iterator it = u.f99682c.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c(j14);
                }
                break;
        }
    }
}
