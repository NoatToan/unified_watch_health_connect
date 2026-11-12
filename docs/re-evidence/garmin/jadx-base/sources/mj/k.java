package mj;

/* JADX INFO: loaded from: classes7.dex */
public class k implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f119074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f119075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile j f119076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile d f119077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.a f119078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.a f119079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f119080g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f119078e = aVar;
        this.f119079f = aVar;
        this.f119075b = obj;
        this.f119074a = eVar;
    }

    @Override // mj.e, mj.d
    public final boolean a() {
        boolean z14;
        synchronized (this.f119075b) {
            try {
                z14 = this.f119077d.a() || this.f119076c.a();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.d
    public final boolean b() {
        boolean z14;
        synchronized (this.f119075b) {
            z14 = this.f119078e == e.a.CLEARED;
        }
        return z14;
    }

    @Override // mj.e
    public final void c(d dVar) {
        synchronized (this.f119075b) {
            try {
                if (dVar.equals(this.f119077d)) {
                    this.f119079f = e.a.SUCCESS;
                    return;
                }
                this.f119078e = e.a.SUCCESS;
                e eVar = this.f119074a;
                if (eVar != null) {
                    eVar.c(this);
                }
                if (!this.f119079f.f119028a) {
                    this.f119077d.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.d
    public final void clear() {
        synchronized (this.f119075b) {
            this.f119080g = false;
            e.a aVar = e.a.CLEARED;
            this.f119078e = aVar;
            this.f119079f = aVar;
            this.f119077d.clear();
            this.f119076c.clear();
        }
    }

    @Override // mj.d
    public final boolean d(d dVar) {
        if (!(dVar instanceof k)) {
            return false;
        }
        k kVar = (k) dVar;
        if (this.f119076c == null) {
            if (kVar.f119076c != null) {
                return false;
            }
        } else if (!this.f119076c.d(kVar.f119076c)) {
            return false;
        }
        if (this.f119077d == null) {
            return kVar.f119077d == null;
        }
        return this.f119077d.d(kVar.f119077d);
    }

    @Override // mj.e
    public final boolean e(d dVar) {
        boolean z14;
        synchronized (this.f119075b) {
            try {
                e eVar = this.f119074a;
                z14 = (eVar == null || eVar.e(this)) && dVar.equals(this.f119076c) && !a();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.e
    public final boolean f(d dVar) {
        boolean z14;
        synchronized (this.f119075b) {
            try {
                e eVar = this.f119074a;
                z14 = (eVar == null || eVar.f(this)) && (dVar.equals(this.f119076c) || this.f119078e != e.a.SUCCESS);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.d
    public final void g() {
        synchronized (this.f119075b) {
            try {
                this.f119080g = true;
                try {
                    if (this.f119078e != e.a.SUCCESS) {
                        e.a aVar = this.f119079f;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f119079f = aVar2;
                            this.f119077d.g();
                        }
                    }
                    if (this.f119080g) {
                        e.a aVar3 = this.f119078e;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f119078e = aVar4;
                            this.f119076c.g();
                        }
                    }
                    this.f119080g = false;
                } catch (Throwable th3) {
                    this.f119080g = false;
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // mj.e
    public final e getRoot() {
        e root;
        synchronized (this.f119075b) {
            try {
                e eVar = this.f119074a;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return root;
    }

    @Override // mj.e
    public final boolean h(d dVar) {
        boolean z14;
        synchronized (this.f119075b) {
            try {
                e eVar = this.f119074a;
                z14 = (eVar == null || eVar.h(this)) && dVar.equals(this.f119076c) && this.f119078e != e.a.PAUSED;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.e
    public final void i(d dVar) {
        synchronized (this.f119075b) {
            try {
                if (!dVar.equals(this.f119076c)) {
                    this.f119079f = e.a.FAILED;
                    return;
                }
                this.f119078e = e.a.FAILED;
                e eVar = this.f119074a;
                if (eVar != null) {
                    eVar.i(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.d
    public final boolean isComplete() {
        boolean z14;
        synchronized (this.f119075b) {
            z14 = this.f119078e == e.a.SUCCESS;
        }
        return z14;
    }

    @Override // mj.d
    public final boolean isRunning() {
        boolean z14;
        synchronized (this.f119075b) {
            z14 = this.f119078e == e.a.RUNNING;
        }
        return z14;
    }

    @Override // mj.d
    public final void pause() {
        synchronized (this.f119075b) {
            try {
                if (!this.f119079f.f119028a) {
                    this.f119079f = e.a.PAUSED;
                    this.f119077d.pause();
                }
                if (!this.f119078e.f119028a) {
                    this.f119078e = e.a.PAUSED;
                    this.f119076c.pause();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
