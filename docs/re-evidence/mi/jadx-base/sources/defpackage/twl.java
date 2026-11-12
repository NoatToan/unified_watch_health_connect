package defpackage;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes2.dex */
public final class twl<T> extends qno<T> implements ni1.a<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qno<T> f35141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f35142b;
    public ni1<Object> c;
    public volatile boolean d;

    public twl(qno<T> qnoVar) {
        this.f35141a = qnoVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        this.f35141a.a(z5hVar);
    }

    public void k0() {
        ni1<Object> ni1Var;
        while (true) {
            synchronized (this) {
                try {
                    ni1Var = this.c;
                    if (ni1Var == null) {
                        this.f35142b = false;
                        return;
                    }
                    this.c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ni1Var.c(this);
        }
    }

    @Override // defpackage.z5h
    public void onComplete() {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                this.d = true;
                if (!this.f35142b) {
                    this.f35142b = true;
                    this.f35141a.onComplete();
                    return;
                }
                ni1<Object> ni1Var = this.c;
                if (ni1Var == null) {
                    ni1Var = new ni1<>(4);
                    this.c = ni1Var;
                }
                ni1Var.b(NotificationLite.complete());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        if (this.d) {
            t5l.p(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.d) {
                    this.d = true;
                    if (this.f35142b) {
                        ni1<Object> ni1Var = this.c;
                        if (ni1Var == null) {
                            ni1Var = new ni1<>(4);
                            this.c = ni1Var;
                        }
                        ni1Var.d(NotificationLite.error(th));
                        return;
                    }
                    this.f35142b = true;
                    z = false;
                }
                if (z) {
                    t5l.p(th);
                } else {
                    this.f35141a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        if (this.d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.d) {
                    return;
                }
                if (!this.f35142b) {
                    this.f35142b = true;
                    this.f35141a.onNext(t);
                    k0();
                } else {
                    ni1<Object> ni1Var = this.c;
                    if (ni1Var == null) {
                        ni1Var = new ni1<>(4);
                        this.c = ni1Var;
                    }
                    ni1Var.b(NotificationLite.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z5h
    public void onSubscribe(jz6 jz6Var) {
        if (!this.d) {
            synchronized (this) {
                try {
                    boolean z = true;
                    if (!this.d) {
                        if (this.f35142b) {
                            ni1<Object> ni1Var = this.c;
                            if (ni1Var == null) {
                                ni1Var = new ni1<>(4);
                                this.c = ni1Var;
                            }
                            ni1Var.b(NotificationLite.disposable(jz6Var));
                            return;
                        }
                        this.f35142b = true;
                        z = false;
                    }
                    if (!z) {
                        this.f35141a.onSubscribe(jz6Var);
                        k0();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        jz6Var.dispose();
    }

    @Override // ni1.a, defpackage.i6i
    public boolean test(Object obj) {
        return NotificationLite.acceptFull(obj, this.f35141a);
    }
}
