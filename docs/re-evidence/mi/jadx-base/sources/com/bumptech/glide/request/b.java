package com.bumptech.glide.request;

import androidx.annotation.GuardedBy;
import defpackage.zmk;

/* JADX INFO: loaded from: classes4.dex */
public class b implements RequestCoordinator, zmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestCoordinator f7005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7006b;
    public volatile zmk c;
    public volatile zmk d;

    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState e;

    @GuardedBy("requestLock")
    public RequestCoordinator.RequestState f;

    @GuardedBy("requestLock")
    public boolean g;

    public b(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.f7006b = obj;
        this.f7005a = requestCoordinator;
    }

    @GuardedBy("requestLock")
    private boolean j() {
        RequestCoordinator requestCoordinator = this.f7005a;
        return requestCoordinator == null || requestCoordinator.h(this);
    }

    @GuardedBy("requestLock")
    private boolean k() {
        RequestCoordinator requestCoordinator = this.f7005a;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @GuardedBy("requestLock")
    private boolean l() {
        RequestCoordinator requestCoordinator = this.f7005a;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, defpackage.zmk
    public boolean a() {
        boolean z;
        synchronized (this.f7006b) {
            try {
                z = this.d.a() || this.c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void b(zmk zmkVar) {
        synchronized (this.f7006b) {
            try {
                if (zmkVar.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f7005a;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
                if (!this.f.isComplete()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zmk
    public void begin() {
        synchronized (this.f7006b) {
            try {
                this.g = true;
                try {
                    if (this.e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f = requestState2;
                            this.d.begin();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator.RequestState requestState3 = this.e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.e = requestState4;
                            this.c.begin();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean c(zmk zmkVar) {
        boolean z;
        synchronized (this.f7006b) {
            try {
                z = k() && zmkVar.equals(this.c) && !a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.zmk
    public void clear() {
        synchronized (this.f7006b) {
            this.g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.e = requestState;
            this.f = requestState;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public boolean d(zmk zmkVar) {
        boolean z;
        synchronized (this.f7006b) {
            try {
                z = l() && (zmkVar.equals(this.c) || this.e != RequestCoordinator.RequestState.SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean e() {
        boolean z;
        synchronized (this.f7006b) {
            z = this.e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean f() {
        boolean z;
        synchronized (this.f7006b) {
            z = this.e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean g(zmk zmkVar) {
        if (!(zmkVar instanceof b)) {
            return false;
        }
        b bVar = (b) zmkVar;
        if (this.c == null) {
            if (bVar.c != null) {
                return false;
            }
        } else if (!this.c.g(bVar.c)) {
            return false;
        }
        if (this.d == null) {
            if (bVar.d != null) {
                return false;
            }
        } else if (!this.d.g(bVar.d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f7006b) {
            try {
                RequestCoordinator requestCoordinator = this.f7005a;
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
        synchronized (this.f7006b) {
            try {
                z = j() && zmkVar.equals(this.c) && this.e != RequestCoordinator.RequestState.PAUSED;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public void i(zmk zmkVar) {
        synchronized (this.f7006b) {
            try {
                if (!zmkVar.equals(this.c)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f7005a;
                if (requestCoordinator != null) {
                    requestCoordinator.i(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zmk
    public boolean isRunning() {
        boolean z;
        synchronized (this.f7006b) {
            z = this.e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    public void m(zmk zmkVar, zmk zmkVar2) {
        this.c = zmkVar;
        this.d = zmkVar2;
    }

    @Override // defpackage.zmk
    public void pause() {
        synchronized (this.f7006b) {
            try {
                if (!this.f.isComplete()) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
                if (!this.e.isComplete()) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
