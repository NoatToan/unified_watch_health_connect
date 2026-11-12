package mj;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements e, d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f119016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f119017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile d f119018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile d f119019d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e.a f119020e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e.a f119021f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f119020e = aVar;
        this.f119021f = aVar;
        this.f119016a = obj;
        this.f119017b = eVar;
    }

    @Override // mj.e, mj.d
    public final boolean a() {
        boolean z14;
        synchronized (this.f119016a) {
            try {
                z14 = this.f119018c.a() || this.f119019d.a();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.d
    public final boolean b() {
        boolean z14;
        synchronized (this.f119016a) {
            try {
                e.a aVar = this.f119020e;
                e.a aVar2 = e.a.CLEARED;
                z14 = aVar == aVar2 && this.f119021f == aVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.e
    public final void c(d dVar) {
        synchronized (this.f119016a) {
            try {
                if (dVar.equals(this.f119018c)) {
                    this.f119020e = e.a.SUCCESS;
                } else if (dVar.equals(this.f119019d)) {
                    this.f119021f = e.a.SUCCESS;
                }
                e eVar = this.f119017b;
                if (eVar != null) {
                    eVar.c(this);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.d
    public final void clear() {
        synchronized (this.f119016a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f119020e = aVar;
                this.f119018c.clear();
                if (this.f119021f != aVar) {
                    this.f119021f = aVar;
                    this.f119019d.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.d
    public final boolean d(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f119018c.d(bVar.f119018c) && this.f119019d.d(bVar.f119019d)) {
                return true;
            }
        }
        return false;
    }

    @Override // mj.e
    public final boolean e(d dVar) {
        boolean z14;
        boolean zEquals;
        e.a aVar;
        synchronized (this.f119016a) {
            e eVar = this.f119017b;
            z14 = false;
            if (eVar == null || eVar.e(this)) {
                e.a aVar2 = this.f119020e;
                e.a aVar3 = e.a.FAILED;
                if (aVar2 != aVar3) {
                    zEquals = dVar.equals(this.f119018c);
                } else {
                    zEquals = dVar.equals(this.f119019d) && ((aVar = this.f119021f) == e.a.SUCCESS || aVar == aVar3);
                }
                if (zEquals) {
                    z14 = true;
                }
            }
        }
        return z14;
    }

    @Override // mj.e
    public final boolean f(d dVar) {
        boolean z14;
        synchronized (this.f119016a) {
            e eVar = this.f119017b;
            z14 = eVar == null || eVar.f(this);
        }
        return z14;
    }

    @Override // mj.d
    public final void g() {
        synchronized (this.f119016a) {
            try {
                e.a aVar = this.f119020e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f119020e = aVar2;
                    this.f119018c.g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.e
    public final e getRoot() {
        e root;
        synchronized (this.f119016a) {
            try {
                e eVar = this.f119017b;
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
        synchronized (this.f119016a) {
            e eVar = this.f119017b;
            z14 = (eVar == null || eVar.h(this)) && dVar.equals(this.f119018c);
        }
        return z14;
    }

    @Override // mj.e
    public final void i(d dVar) {
        synchronized (this.f119016a) {
            try {
                if (dVar.equals(this.f119019d)) {
                    this.f119021f = e.a.FAILED;
                    e eVar = this.f119017b;
                    if (eVar != null) {
                        eVar.i(this);
                    }
                    return;
                }
                this.f119020e = e.a.FAILED;
                e.a aVar = this.f119021f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f119021f = aVar2;
                    this.f119019d.g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.d
    public final boolean isComplete() {
        boolean z14;
        synchronized (this.f119016a) {
            try {
                e.a aVar = this.f119020e;
                e.a aVar2 = e.a.SUCCESS;
                z14 = aVar == aVar2 || this.f119021f == aVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.d
    public final boolean isRunning() {
        boolean z14;
        synchronized (this.f119016a) {
            try {
                e.a aVar = this.f119020e;
                e.a aVar2 = e.a.RUNNING;
                z14 = aVar == aVar2 || this.f119021f == aVar2;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // mj.d
    public final void pause() {
        synchronized (this.f119016a) {
            try {
                e.a aVar = this.f119020e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f119020e = e.a.PAUSED;
                    this.f119018c.pause();
                }
                if (this.f119021f == aVar2) {
                    this.f119021f = e.a.PAUSED;
                    this.f119019d.pause();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
