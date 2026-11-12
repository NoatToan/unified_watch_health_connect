package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s8t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f33421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IntentFilter f33422b;
    public final Context c;
    public final Set d = new HashSet();
    public a7t e = null;
    public volatile boolean f = false;

    public s8t(pbt pbtVar, IntentFilter intentFilter, Context context) {
        this.f33421a = pbtVar;
        this.f33422b = intentFilter;
        this.c = i5s.a(context);
    }

    public final void a() {
        a7t a7tVar;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            a7t a7tVar2 = new a7t(this, null);
            this.e = a7tVar2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.c.registerReceiver(a7tVar2, this.f33422b, 2);
            } else {
                this.c.registerReceiver(a7tVar2, this.f33422b);
            }
        }
        if (this.f || !this.d.isEmpty() || (a7tVar = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(a7tVar);
        this.e = null;
    }

    public abstract void b(Context context, Intent intent);

    public final synchronized void c(boolean z) {
        this.f = z;
        a();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((zco) it.next()).a(obj);
        }
    }

    public final synchronized boolean e() {
        return this.e != null;
    }
}
