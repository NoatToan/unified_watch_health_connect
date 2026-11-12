package k9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public class i implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f103419a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f103421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f103422d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f103424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IBinder f103425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f103426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f103427i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f103420b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f103423e = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h f103428j = new IBinder.DeathRecipient() { // from class: k9.h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            i iVar = this.f103418a;
            String str = iVar.f103421c.f103408b;
            int i14 = l9.a.f111509a;
            iVar.d(new RemoteException("Binder died"));
        }
    };

    public interface a {
        void a(i iVar);

        void b(i iVar, long j8);
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [k9.h] */
    public i(Context context, b bVar, e eVar, a aVar) {
        this.f103419a = (Context) Preconditions.checkNotNull(context);
        this.f103421c = (b) Preconditions.checkNotNull(bVar);
        this.f103422d = (e) Preconditions.checkNotNull(eVar);
        this.f103424f = (a) Preconditions.checkNotNull(aVar);
    }

    public final void a() {
        if (this.f103426h) {
            return;
        }
        try {
            Context context = this.f103419a;
            Intent intent = new Intent();
            this.f103424f.getClass();
            this.f103426h = context.bindService(intent.setPackage(this.f103421c.f103407a).setAction(this.f103421c.f103409c), this, 129);
            if (this.f103426h) {
                return;
            }
            String str = this.f103421c.f103407a;
            int i14 = l9.a.f111509a;
            RemoteException remoteException = new RemoteException("Binding to service failed");
            this.f103427i = 10;
            d(remoteException);
        } catch (SecurityException e4) {
            this.f103421c.a();
            int i15 = l9.a.f111509a;
            this.f103426h = false;
            this.f103425g = null;
            throw e4;
        }
    }

    public final void b(g gVar) {
        IBinder iBinder = this.f103425g;
        if (iBinder != null && iBinder.isBinderAlive()) {
            c(gVar);
        } else {
            this.f103420b.add(gVar);
            a();
        }
    }

    public final void c(g gVar) {
        try {
            gVar.d(this.f103422d);
            gVar.b((IBinder) Preconditions.checkNotNull(this.f103425g));
        } catch (DeadObjectException e4) {
            d(e4);
        } catch (RemoteException e14) {
            e = e14;
            gVar.c(e);
        } catch (RuntimeException e15) {
            e = e15;
            gVar.c(e);
        }
    }

    public final synchronized void d(RemoteException remoteException) {
        IBinder iBinder = this.f103425g;
        if (iBinder != null && iBinder.isBinderAlive()) {
            int i14 = l9.a.f111509a;
            return;
        }
        e();
        this.f103422d.b(remoteException);
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f103420b;
        for (g gVar : new ArrayList(concurrentLinkedQueue)) {
            if (concurrentLinkedQueue.remove(gVar)) {
                gVar.c(remoteException);
            }
        }
        if (this.f103427i < 10) {
            String str = this.f103421c.f103408b;
            int i15 = l9.a.f111509a;
            this.f103424f.b(this, 200 << this.f103427i);
        } else {
            int i16 = l9.a.f111509a;
        }
    }

    public final void e() {
        if (this.f103426h) {
            try {
                this.f103419a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                int i14 = l9.a.f111509a;
            }
            this.f103426h = false;
        }
        IBinder iBinder = this.f103425g;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.f103428j, 0);
            } catch (NoSuchElementException unused2) {
                int i15 = l9.a.f111509a;
            }
            this.f103425g = null;
        }
        int i16 = l9.a.f111509a;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        String str = this.f103421c.f103408b;
        int i14 = l9.a.f111509a;
        d(new RemoteException("Binding died"));
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        String str = this.f103421c.f103408b;
        int i14 = l9.a.f111509a;
        d(new RemoteException("Null binding"));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Objects.toString(componentName);
        int i14 = l9.a.f111509a;
        if (iBinder == null) {
            return;
        }
        this.f103427i = 0;
        try {
            iBinder.linkToDeath(this.f103428j, 0);
        } catch (RemoteException e4) {
            int i15 = l9.a.f111509a;
            d(e4);
        }
        this.f103425g = iBinder;
        this.f103424f.a(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Objects.toString(componentName);
        int i14 = l9.a.f111509a;
    }
}
