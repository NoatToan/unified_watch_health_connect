package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.health.platform.client.impl.logger.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class eyl implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17195a;
    public final re4 c;
    public final uf8 d;
    public final a f;

    @VisibleForTesting
    public IBinder g;

    @VisibleForTesting
    public volatile boolean h;
    public int i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<egi> f17196b = new ConcurrentLinkedQueue();
    public final Map<the, egi> e = new HashMap();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: dyl
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.f16069a.o();
        }
    };

    public interface a {
        boolean a();

        void b(eyl eylVar);

        void c(eyl eylVar, long j);
    }

    public eyl(Context context, re4 re4Var, uf8 uf8Var, a aVar) {
        this.f17195a = (Context) c6i.o(context);
        this.c = (re4) c6i.o(re4Var);
        this.d = (uf8) c6i.o(uf8Var);
        this.f = (a) c6i.o(aVar);
    }

    public static int k(int i) {
        return 200 << i;
    }

    public final void b(Throwable th) {
        for (egi egiVar : new ArrayList(this.f17196b)) {
            if (this.f17196b.remove(egiVar)) {
                egiVar.b(th);
            }
        }
    }

    public final void c(IBinder iBinder) {
        try {
            iBinder.linkToDeath(this.j, 0);
        } catch (RemoteException e) {
            Logger.warning("ServiceConnection", "Cannot link to death, binder already died. Cleaning operations.", e);
            m(e);
        }
    }

    @VisibleForTesting
    public void d(Throwable th) {
        t();
        this.d.b(th);
        b(th);
    }

    public boolean e() {
        if (!this.f17196b.isEmpty() || !this.e.isEmpty()) {
            return false;
        }
        t();
        return true;
    }

    public void f() {
        if (this.h) {
            return;
        }
        try {
            this.h = this.f17195a.bindService(new Intent().setPackage(j()).setAction(this.c.a()), this, 129);
            if (this.h) {
                return;
            }
            Logger.error("ServiceConnection", "Connection to service is not available for package '" + this.c.d() + "' and action '" + this.c.a() + "'.");
            l(new RemoteException("Binding to service failed"));
        } catch (SecurityException e) {
            Logger.warning("ServiceConnection", "Failed to bind connection '" + this.c.c() + "', no permission or service not found.", e);
            this.h = false;
            this.g = null;
            throw e;
        }
    }

    public void g(egi egiVar) {
        if (n()) {
            h(egiVar);
        } else {
            this.f17196b.add(egiVar);
            f();
        }
    }

    @VisibleForTesting
    public void h(egi egiVar) {
        try {
            egiVar.d(this.d);
            egiVar.c((IBinder) c6i.o(this.g));
        } catch (DeadObjectException e) {
            m(e);
        } catch (RemoteException e2) {
            e = e2;
            egiVar.b(e);
        } catch (RuntimeException e3) {
            e = e3;
            egiVar.b(e);
        }
    }

    public void i() {
        for (egi egiVar : new ArrayList(this.f17196b)) {
            if (this.f17196b.remove(egiVar)) {
                h(egiVar);
            }
        }
    }

    public final String j() {
        return this.f.a() ? this.f17195a.getPackageName() : this.c.d();
    }

    public final void l(Throwable th) {
        this.i = 10;
        m(th);
    }

    public final synchronized void m(Throwable th) {
        if (n()) {
            Logger.warning("ServiceConnection", "Connection is already re-established. No need to reconnect again");
            return;
        }
        d(th);
        if (this.i < 10) {
            Logger.warning("ServiceConnection", "WCS SDK Client '" + this.c.b() + "' disconnected, retrying connection. Retry attempt: " + this.i, th);
            this.f.c(this, (long) k(this.i));
        } else {
            Logger.error("ServiceConnection", "Connection disconnected and maximum number of retries reached.", th);
        }
    }

    public final boolean n() {
        IBinder iBinder = this.g;
        return iBinder != null && iBinder.isBinderAlive();
    }

    public final /* synthetic */ void o() {
        Logger.warning("ServiceConnection", "Binder died for client:" + this.c.b());
        m(new RemoteException("Binder died"));
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        Logger.error("ServiceConnection", "Binding died for client '" + this.c.b() + "'.");
        m(new RemoteException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        Logger.error("ServiceConnection", "Cannot bind client '" + this.c.b() + "', binder is null");
        m(new RemoteException("Null binding"));
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Logger.debug("ServiceConnection", "onServiceConnected(), componentName = " + componentName);
        if (iBinder == null) {
            Logger.error("ServiceConnection", "Service connected but binder is null.");
            return;
        }
        this.i = 0;
        c(iBinder);
        this.g = iBinder;
        this.f.b(this);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Logger.debug("ServiceConnection", "onServiceDisconnected(), componentName = " + componentName);
    }

    public void p() {
        if (this.e.isEmpty()) {
            Logger.debug("ServiceConnection", "No listeners registered, service " + this.c.b() + " is not automatically reconnected.");
            return;
        }
        this.i++;
        Logger.debug("ServiceConnection", "Listeners for service " + this.c.b() + " are registered, reconnecting.");
        f();
    }

    public void q() {
        for (Map.Entry<the, egi> entry : this.e.entrySet()) {
            Logger.debug("ServiceConnection", "Re-registering listener: " + entry.getKey());
            h(entry.getValue());
        }
    }

    public void r() {
        this.f17196b.add(this.c.e());
    }

    public void s(the theVar, egi egiVar) {
        this.e.put(theVar, egiVar);
        if (n()) {
            g(egiVar);
        } else {
            f();
        }
    }

    public final void t() {
        if (this.h) {
            try {
                this.f17195a.unbindService(this);
            } catch (IllegalArgumentException e) {
                Logger.error("ServiceConnection", "Failed to unbind the service. Ignoring and continuing", e);
            }
            this.h = false;
        }
        IBinder iBinder = this.g;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.j, 0);
            } catch (NoSuchElementException e2) {
                Logger.error("ServiceConnection", "mDeathRecipient not linked", e2);
            }
            this.g = null;
        }
        Logger.debug("ServiceConnection", "unbindService called");
    }

    public void u(the theVar, egi egiVar) {
        this.e.remove(theVar);
        g(egiVar);
    }
}
