package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import defpackage.zmk;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements RequestCoordinator, zmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestCoordinator f7004b;
    public volatile zmk c;
    public volatile zmk d;

    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState e;

    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f;

    public a(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.f7003a = obj;
        this.f7004b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, defpackage.zmk
    public boolean a() {
        boolean z;
        synchronized (this.f7003a) {
            try {
                z = this.c.a() || this.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(zmk zmkVar) {
        synchronized (this.f7003a) {
            try {
                if (zmkVar.equals(this.c)) {
                    this.e = RequestCoordinator.RequestState.SUCCESS;
                } else if (zmkVar.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.f7004b;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zmk
    public void begin() {
        synchronized (this.f7003a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.e = requestState2;
                    this.c.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(zmk zmkVar) {
        boolean z;
        synchronized (this.f7003a) {
            try {
                z = l() && j(zmkVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.zmk
    public void clear() {
        synchronized (this.f7003a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.e = requestState;
                this.c.clear();
                if (this.f != requestState) {
                    this.f = requestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(zmk zmkVar) {
        boolean zM;
        synchronized (this.f7003a) {
            zM = m();
        }
        return zM;
    }

    @Override // defpackage.zmk
    public boolean e() {
        boolean z;
        synchronized (this.f7003a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean f() {
        boolean z;
        synchronized (this.f7003a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean g(zmk zmkVar) {
        if (!(zmkVar instanceof a)) {
            return false;
        }
        a aVar = (a) zmkVar;
        return this.c.g(aVar.c) && this.d.g(aVar.d);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f7003a) {
            try {
                RequestCoordinator requestCoordinator = this.f7004b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean h(zmk zmkVar) {
        boolean z;
        synchronized (this.f7003a) {
            try {
                z = k() && zmkVar.equals(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void i(zmk zmkVar) {
        synchronized (this.f7003a) {
            try {
                if (zmkVar.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.f7004b;
                    if (requestCoordinator != null) {
                        requestCoordinator.i(this);
                    }
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f = requestState2;
                    this.d.begin();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zmk
    public boolean isRunning() {
        boolean z;
        synchronized (this.f7003a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f == requestState2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final boolean j(zmk zmkVar) {
        RequestCoordinator.RequestState requestState;
        RequestCoordinator.RequestState requestState2 = this.e;
        RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
        if (requestState2 != requestState3) {
            return zmkVar.equals(this.c);
        }
        return zmkVar.equals(this.d) && ((requestState = this.f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3);
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        RequestCoordinator requestCoordinator = this.f7004b;
        return requestCoordinator == null || requestCoordinator.h(this);
    }

    @GuardedBy("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.f7004b;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @GuardedBy("requestLock")
    public final boolean m() {
        RequestCoordinator requestCoordinator = this.f7004b;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    public void n(zmk zmkVar, zmk zmkVar2) {
        this.c = zmkVar;
        this.d = zmkVar2;
    }

    @Override // defpackage.zmk
    public void pause() {
        synchronized (this.f7003a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
                if (this.f == requestState2) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
