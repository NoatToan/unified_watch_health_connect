package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.huawei.android.appbundle.remote.OnBinderDiedListener;
import com.huawei.android.appbundle.remote.RemoteCall;
import com.huawei.android.appbundle.remote.RemoteTask;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hmf.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class azj<T extends IInterface> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final HandlerCenter f840c = HandlerCenter.d((String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f841a;
    final azq d;
    private final Context e;
    private WeakReference<OnBinderDiedListener> f;
    private boolean h;
    private final String i;
    private final RemoteCall<T> j;
    private ServiceConnection l;
    private final Intent o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IBinder.DeathRecipient f842b = new azl(this);
    private final List<RemoteTask> g = new ArrayList();

    public azj(Context context, azq azqVar, String str, Intent intent, RemoteCall<T> remoteCall) {
        this.e = context;
        this.d = azqVar;
        this.i = str;
        this.o = intent;
        this.j = remoteCall;
    }

    public void e(OnBinderDiedListener onBinderDiedListener) {
        this.f = new WeakReference<>(onBinderDiedListener);
    }

    public T c() {
        return this.f841a;
    }

    public void c(RemoteTask remoteTask) {
        b(new azg(this, remoteTask));
    }

    void d(RemoteTask remoteTask) {
        if (this.f841a == null && !this.h) {
            this.d.d("Initiate binding to the service.", new Object[0]);
            this.g.add(remoteTask);
            azk azkVar = new azk(this);
            this.l = azkVar;
            this.h = true;
            if (this.e.bindService(this.o, azkVar, 1)) {
                return;
            }
            this.d.a("Failed to bind to the service.", new Object[0]);
            this.h = false;
            h();
            return;
        }
        if (this.h) {
            this.d.d("Waiting to bind to the service.", new Object[0]);
            this.g.add(remoteTask);
        } else {
            remoteTask.run();
        }
    }

    void a(IBinder iBinder) {
        this.f841a = this.j.asInterface(iBinder);
        i();
        this.h = false;
        g();
    }

    void e() {
        j();
        this.f841a = null;
        this.h = false;
    }

    public void a() {
        b(new azp(this));
    }

    void d() {
        if (this.f841a != null) {
            this.e.unbindService(this.l);
            this.h = false;
            this.f841a = null;
            this.l = null;
        }
    }

    private void i() {
        IBinder iBinderAsBinder;
        this.d.e("linkToDeath", new Object[0]);
        T t = this.f841a;
        if (t == null || (iBinderAsBinder = t.asBinder()) == null) {
            return;
        }
        try {
            iBinderAsBinder.linkToDeath(this.f842b, 0);
        } catch (RemoteException unused) {
            this.d.d("linkToDeath failed", new Object[0]);
        }
    }

    private void j() {
        IBinder iBinderAsBinder;
        this.d.e("unlinkToDeath", new Object[0]);
        T t = this.f841a;
        if (t == null || (iBinderAsBinder = t.asBinder()) == null) {
            return;
        }
        iBinderAsBinder.unlinkToDeath(this.f842b, 0);
    }

    private void g() {
        List<RemoteTask> list = this.g;
        Iterator<RemoteTask> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        list.clear();
    }

    private void h() {
        List<RemoteTask> list = this.g;
        if (list.isEmpty()) {
            return;
        }
        azm azmVar = new azm();
        Iterator<RemoteTask> it = list.iterator();
        while (it.hasNext()) {
            TaskCompletionSource task = it.next().getTask();
            if (task != null) {
                task.setException(azmVar);
            }
        }
        list.clear();
    }

    void b(RemoteTask remoteTask) {
        f840c.d(remoteTask, this.i);
    }

    void b() {
        OnBinderDiedListener onBinderDiedListener;
        this.d.d("reportBinderDeath", new Object[0]);
        WeakReference<OnBinderDiedListener> weakReference = this.f;
        if (weakReference == null || (onBinderDiedListener = weakReference.get()) == null) {
            return;
        }
        this.d.d("calling onBinderDied", new Object[0]);
        onBinderDiedListener.onBinderDied();
    }
}
