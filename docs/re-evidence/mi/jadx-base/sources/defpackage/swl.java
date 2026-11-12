package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: loaded from: classes2.dex */
public final class swl<T> implements z5h<T>, jz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5h<? super T> f34064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34065b;
    public jz6 c;
    public boolean d;
    public ni1<Object> e;
    public volatile boolean f;

    public swl(z5h<? super T> z5hVar) {
        this(z5hVar, false);
    }

    public void a() {
        ni1<Object> ni1Var;
        do {
            synchronized (this) {
                try {
                    ni1Var = this.e;
                    if (ni1Var == null) {
                        this.d = false;
                        return;
                    }
                    this.e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!ni1Var.a(this.f34064a));
    }

    @Override // defpackage.jz6
    public void dispose() {
        this.c.dispose();
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.c.isDisposed();
    }

    @Override // defpackage.z5h
    public void onComplete() {
        if (this.f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.f = true;
                    this.d = true;
                    this.f34064a.onComplete();
                } else {
                    ni1<Object> ni1Var = this.e;
                    if (ni1Var == null) {
                        ni1Var = new ni1<>(4);
                        this.e = ni1Var;
                    }
                    ni1Var.b(NotificationLite.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        if (this.f) {
            t5l.p(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f) {
                    if (this.d) {
                        this.f = true;
                        ni1<Object> ni1Var = this.e;
                        if (ni1Var == null) {
                            ni1Var = new ni1<>(4);
                            this.e = ni1Var;
                        }
                        Object objError = NotificationLite.error(th);
                        if (this.f34065b) {
                            ni1Var.b(objError);
                        } else {
                            ni1Var.d(objError);
                        }
                        return;
                    }
                    this.f = true;
                    this.d = true;
                    z = false;
                }
                if (z) {
                    t5l.p(th);
                } else {
                    this.f34064a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.z5h
    public void onNext(T t) {
        if (this.f) {
            return;
        }
        if (t == null) {
            this.c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f) {
                    return;
                }
                if (!this.d) {
                    this.d = true;
                    this.f34064a.onNext(t);
                    a();
                } else {
                    ni1<Object> ni1Var = this.e;
                    if (ni1Var == null) {
                        ni1Var = new ni1<>(4);
                        this.e = ni1Var;
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
        if (DisposableHelper.validate(this.c, jz6Var)) {
            this.c = jz6Var;
            this.f34064a.onSubscribe(this);
        }
    }

    public swl(z5h<? super T> z5hVar, boolean z) {
        this.f34064a = z5hVar;
        this.f34065b = z;
    }
}
