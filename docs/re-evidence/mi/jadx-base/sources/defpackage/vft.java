package defpackage;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class vft extends bct {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f36858b;
    public final /* synthetic */ wgt c;

    public vft(wgt wgtVar, IBinder iBinder) {
        this.f36858b = iBinder;
        this.c = wgtVar;
    }

    @Override // defpackage.bct
    public final void a() {
        this.c.f37966a.m = kns.h4(this.f36858b);
        fht.q(this.c.f37966a);
        this.c.f37966a.g = false;
        Iterator it = this.c.f37966a.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.c.f37966a.d.clear();
    }
}
