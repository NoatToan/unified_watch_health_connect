package com.bumptech.glide.manager;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.c;
import defpackage.kfe;
import defpackage.mfe;
import defpackage.nfe;
import defpackage.ulq;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class LifecycleLifecycle implements kfe, nfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<mfe> f6993a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lifecycle f6994b;

    public LifecycleLifecycle(Lifecycle lifecycle) {
        this.f6994b = lifecycle;
        lifecycle.addObserver(this);
    }

    @Override // defpackage.kfe
    public void a(mfe mfeVar) {
        this.f6993a.add(mfeVar);
        if (this.f6994b.getState() == Lifecycle.State.DESTROYED) {
            mfeVar.onDestroy();
        } else if (this.f6994b.getState().isAtLeast(Lifecycle.State.STARTED)) {
            mfeVar.onStart();
        } else {
            mfeVar.onStop();
        }
    }

    @Override // defpackage.kfe
    public void b(mfe mfeVar) {
        this.f6993a.remove(mfeVar);
    }

    @c(Lifecycle.Event.ON_DESTROY)
    public void onDestroy(LifecycleOwner lifecycleOwner) {
        Iterator it = ulq.k(this.f6993a).iterator();
        while (it.hasNext()) {
            ((mfe) it.next()).onDestroy();
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    @c(Lifecycle.Event.ON_START)
    public void onStart(LifecycleOwner lifecycleOwner) {
        Iterator it = ulq.k(this.f6993a).iterator();
        while (it.hasNext()) {
            ((mfe) it.next()).onStart();
        }
    }

    @c(Lifecycle.Event.ON_STOP)
    public void onStop(LifecycleOwner lifecycleOwner) {
        Iterator it = ulq.k(this.f6993a).iterator();
        while (it.hasNext()) {
            ((mfe) it.next()).onStop();
        }
    }
}
