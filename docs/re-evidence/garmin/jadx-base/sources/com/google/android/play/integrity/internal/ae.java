package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class ae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f53408a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f53409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f53410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53411d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f53415h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Intent f53416i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final z f53417j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ServiceConnection f53421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private IInterface f53422o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f53412e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f53413f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f53414g = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final IBinder.DeathRecipient f53419l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae.k(this.f53448a);
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f53420m = new AtomicInteger(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f53418k = new WeakReference(null);

    public ae(Context context, s sVar, String str, Intent intent, z zVar, y yVar) {
        this.f53409b = context;
        this.f53410c = sVar;
        this.f53411d = str;
        this.f53416i = intent;
        this.f53417j = zVar;
    }

    public static /* synthetic */ void k(ae aeVar) {
        aeVar.f53410c.d("reportBinderDeath", new Object[0]);
        y yVar = (y) aeVar.f53418k.get();
        s sVar = aeVar.f53410c;
        if (yVar != null) {
            sVar.d("calling onBinderDied", new Object[0]);
            yVar.a();
        } else {
            sVar.d("%s : Binder has died.", aeVar.f53411d);
            Iterator it = aeVar.f53412e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).a(aeVar.w());
            }
            aeVar.f53412e.clear();
        }
        synchronized (aeVar.f53414g) {
            aeVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void o(final ae aeVar, final TaskCompletionSource taskCompletionSource) {
        aeVar.f53413f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                this.f53449a.u(taskCompletionSource, task);
            }
        });
    }

    public static /* bridge */ /* synthetic */ void q(ae aeVar, t tVar) {
        if (aeVar.f53422o != null || aeVar.f53415h) {
            if (!aeVar.f53415h) {
                tVar.run();
                return;
            } else {
                aeVar.f53410c.d("Waiting to bind to the service.", new Object[0]);
                aeVar.f53412e.add(tVar);
                return;
            }
        }
        aeVar.f53410c.d("Initiate binding to the service.", new Object[0]);
        aeVar.f53412e.add(tVar);
        ad adVar = new ad(aeVar, null);
        aeVar.f53421n = adVar;
        aeVar.f53415h = true;
        if (aeVar.f53409b.bindService(aeVar.f53416i, adVar, 1)) {
            return;
        }
        aeVar.f53410c.d("Failed to bind to the service.", new Object[0]);
        aeVar.f53415h = false;
        Iterator it = aeVar.f53412e.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af());
        }
        aeVar.f53412e.clear();
    }

    public static /* bridge */ /* synthetic */ void r(ae aeVar) {
        aeVar.f53410c.d("linkToDeath", new Object[0]);
        try {
            aeVar.f53422o.asBinder().linkToDeath(aeVar.f53419l, 0);
        } catch (RemoteException e4) {
            aeVar.f53410c.c(e4, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(ae aeVar) {
        aeVar.f53410c.d("unlinkToDeath", new Object[0]);
        aeVar.f53422o.asBinder().unlinkToDeath(aeVar.f53419l, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f53411d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f53413f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f53413f.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f53408a;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f53411d)) {
                    HandlerThread handlerThread = new HandlerThread(this.f53411d, 10);
                    handlerThread.start();
                    map.put(this.f53411d, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f53411d);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f53422o;
    }

    public final void t(t tVar, TaskCompletionSource taskCompletionSource) {
        c().post(new w(this, tVar.c(), taskCompletionSource, tVar));
    }

    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f53414g) {
            this.f53413f.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f53414g) {
            this.f53413f.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }
}
