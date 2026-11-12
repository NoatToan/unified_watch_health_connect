package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.aa;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class fht {
    public static final Map o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pbt f17799b;
    public final String c;
    public boolean g;
    public final Intent h;
    public ServiceConnection l;
    public IInterface m;
    public final h4s n;
    public final List d = new ArrayList();

    @GuardedBy("attachedRemoteTasksLock")
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient j = new IBinder.DeathRecipient() { // from class: adt
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            fht.j(this.f911a);
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("attachedRemoteTasksLock")
    public final AtomicInteger f17800k = new AtomicInteger(0);
    public final WeakReference i = new WeakReference(null);

    public fht(Context context, pbt pbtVar, String str, Intent intent, h4s h4sVar, fft fftVar) {
        this.f17798a = context;
        this.f17799b = pbtVar;
        this.c = str;
        this.h = intent;
        this.n = h4sVar;
    }

    public static /* synthetic */ void j(fht fhtVar) {
        fhtVar.f17799b.d("reportBinderDeath", new Object[0]);
        fft fftVar = (fft) fhtVar.i.get();
        if (fftVar != null) {
            fhtVar.f17799b.d("calling onBinderDied", new Object[0]);
            fftVar.a();
        } else {
            fhtVar.f17799b.d("%s : Binder has died.", fhtVar.c);
            Iterator it = fhtVar.d.iterator();
            while (it.hasNext()) {
                ((bct) it.next()).c(fhtVar.v());
            }
            fhtVar.d.clear();
        }
        synchronized (fhtVar.f) {
            fhtVar.w();
        }
    }

    public static /* bridge */ /* synthetic */ void n(final fht fhtVar, final TaskCompletionSource taskCompletionSource) {
        fhtVar.e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: ndt
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f27828a.t(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void p(fht fhtVar, bct bctVar) {
        if (fhtVar.m != null || fhtVar.g) {
            if (!fhtVar.g) {
                bctVar.run();
                return;
            } else {
                fhtVar.f17799b.d("Waiting to bind to the service.", new Object[0]);
                fhtVar.d.add(bctVar);
                return;
            }
        }
        fhtVar.f17799b.d("Initiate binding to the service.", new Object[0]);
        fhtVar.d.add(bctVar);
        wgt wgtVar = new wgt(fhtVar, null);
        fhtVar.l = wgtVar;
        fhtVar.g = true;
        if (fhtVar.f17798a.bindService(fhtVar.h, wgtVar, 1)) {
            return;
        }
        fhtVar.f17799b.d("Failed to bind to the service.", new Object[0]);
        fhtVar.g = false;
        Iterator it = fhtVar.d.iterator();
        while (it.hasNext()) {
            ((bct) it.next()).c(new aa());
        }
        fhtVar.d.clear();
    }

    public static /* bridge */ /* synthetic */ void q(fht fhtVar) {
        fhtVar.f17799b.d("linkToDeath", new Object[0]);
        try {
            fhtVar.m.asBinder().linkToDeath(fhtVar.j, 0);
        } catch (RemoteException e) {
            fhtVar.f17799b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void r(fht fhtVar) {
        fhtVar.f17799b.d("unlinkToDeath", new Object[0]);
        fhtVar.m.asBinder().unlinkToDeath(fhtVar.j, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.m;
    }

    public final void s(bct bctVar, TaskCompletionSource taskCompletionSource) {
        c().post(new bet(this, bctVar.b(), taskCompletionSource, bctVar));
    }

    public final /* synthetic */ void t(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
    }

    public final void u(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        c().post(new pet(this));
    }

    public final RemoteException v() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    @GuardedBy("attachedRemoteTasksLock")
    public final void w() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(v());
        }
        this.e.clear();
    }
}
