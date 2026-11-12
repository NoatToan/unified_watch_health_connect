package com.huawei.hwbasemgr;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public class LifeBaseResponseCallback implements IBaseResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<LifecycleBoundObserver> f17001a;
    private final AtomicReference<IBaseResponseCallback> e;

    public interface IDetachObserver {
        void onDetachObserver();
    }

    public LifeBaseResponseCallback(LifecycleOwner lifecycleOwner, IBaseResponseCallback iBaseResponseCallback) {
        AtomicReference<IBaseResponseCallback> atomicReference = new AtomicReference<>();
        this.e = atomicReference;
        AtomicReference<LifecycleBoundObserver> atomicReference2 = new AtomicReference<>();
        this.f17001a = atomicReference2;
        if (lifecycleOwner.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
            LogUtil.j("LifeBaseResponseCallback", "create LifeBaseResponseCallback Lifecycle DESTROYED");
        } else {
            atomicReference.set(iBaseResponseCallback);
            atomicReference2.set(new LifecycleBoundObserver(lifecycleOwner, new IDetachObserver() { // from class: llw
                @Override // com.huawei.hwbasemgr.LifeBaseResponseCallback.IDetachObserver
                public final void onDetachObserver() {
                    this.e.c();
                }
            }));
        }
    }

    public /* synthetic */ void c() {
        this.e.set(null);
        this.f17001a.set(null);
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        IBaseResponseCallback andSet = this.e.getAndSet(null);
        if (andSet != null) {
            andSet.a(i, obj);
            b();
        } else {
            LogUtil.a("LifeBaseResponseCallback", "onResponse sourceCallback is null");
        }
    }

    private void b() {
        LifecycleBoundObserver andSet = this.f17001a.getAndSet(null);
        if (andSet != null) {
            andSet.c();
        }
    }

    public static class LifecycleBoundObserver implements LifecycleEventObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LifecycleOwner f17002a;
        private final IDetachObserver d;
        private volatile boolean e;

        public LifecycleBoundObserver(LifecycleOwner lifecycleOwner, IDetachObserver iDetachObserver) {
            this.f17002a = lifecycleOwner;
            this.d = iDetachObserver;
            d();
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (this.f17002a.getLifecycle().getState() == Lifecycle.State.DESTROYED) {
                LogUtil.a("LifeBaseResponseCallback", "onStateChanged DESTROYED");
                c();
            }
        }

        void d() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f17002a.getLifecycle().addObserver(this);
            } else {
                HandlerExecutor.c(new Runnable() { // from class: llv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.b();
                    }
                });
            }
        }

        public /* synthetic */ void b() {
            if (this.e) {
                return;
            }
            this.f17002a.getLifecycle().addObserver(this);
        }

        void c() {
            this.e = true;
            this.d.onDetachObserver();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f17002a.getLifecycle().removeObserver(this);
            } else {
                HandlerExecutor.c(new Runnable() { // from class: llx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.a();
                    }
                });
            }
        }

        public /* synthetic */ void a() {
            this.f17002a.getLifecycle().removeObserver(this);
        }
    }
}
