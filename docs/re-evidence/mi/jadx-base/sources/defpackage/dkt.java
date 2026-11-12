package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dkt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gkt f15641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f15642b;
    public final Context c;
    public final Set d = new HashSet();
    public akt e = null;
    public volatile boolean f = false;

    public dkt(gkt gktVar, IntentFilter intentFilter, Context context) {
        this.f15641a = gktVar;
        this.f15642b = intentFilter;
        this.c = vit.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(boolean z) {
        this.f = true;
        d();
    }

    public final synchronized void c(Object obj) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((zco) it.next()).a(obj);
        }
    }

    public final void d() {
        akt aktVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            akt aktVar2 = new akt(this, null);
            this.e = aktVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.c.registerReceiver(aktVar2, this.f15642b, 2);
            } else {
                this.c.registerReceiver(aktVar2, this.f15642b);
            }
        }
        if (this.f || !this.d.isEmpty() || (aktVar = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(aktVar);
        this.e = null;
    }
}
