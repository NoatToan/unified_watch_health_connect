package m13;

import i13.f;
import q03.p;
import u03.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b<T> extends c<T> implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<T> f115922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f115923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i13.a<Object> f115924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f115925d;

    public b(c<T> cVar) {
        this.f115922a = cVar;
    }

    @Override // q03.p
    public final void a(s03.b bVar) {
        boolean z14 = true;
        if (!this.f115925d) {
            synchronized (this) {
                try {
                    if (!this.f115925d) {
                        if (this.f115923b) {
                            i13.a<Object> aVar = this.f115924c;
                            if (aVar == null) {
                                aVar = new i13.a<>(4);
                                this.f115924c = aVar;
                            }
                            f fVar = f.COMPLETE;
                            aVar.a(new f.a(bVar));
                            return;
                        }
                        this.f115923b = true;
                        z14 = false;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (z14) {
            bVar.dispose();
        } else {
            this.f115922a.a(bVar);
            i();
        }
    }

    @Override // q03.p
    public final void c(T t7) {
        if (this.f115925d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f115925d) {
                    return;
                }
                if (!this.f115923b) {
                    this.f115923b = true;
                    this.f115922a.c(t7);
                    i();
                } else {
                    i13.a<Object> aVar = this.f115924c;
                    if (aVar == null) {
                        aVar = new i13.a<>(4);
                        this.f115924c = aVar;
                    }
                    f fVar = f.COMPLETE;
                    aVar.a(t7);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // q03.l
    public final void f(p<? super T> pVar) {
        this.f115922a.b(pVar);
    }

    public final void i() {
        i13.a<Object> aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f115924c;
                    if (aVar == null) {
                        this.f115923b = false;
                        return;
                    }
                    this.f115924c = null;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            int i14 = aVar.f87102a;
            for (Object[] objArr = aVar.f87103b; objArr != null; objArr = objArr[i14]) {
                for (int i15 = 0; i15 < i14; i15++) {
                    Object[] objArr2 = objArr[i15];
                    if (objArr2 == null) {
                        break;
                    } else {
                        if (test(objArr2)) {
                            break;
                        }
                    }
                }
            }
        }
    }

    @Override // q03.p
    public final void onComplete() {
        if (this.f115925d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f115925d) {
                    return;
                }
                this.f115925d = true;
                if (!this.f115923b) {
                    this.f115923b = true;
                    this.f115922a.onComplete();
                    return;
                }
                i13.a<Object> aVar = this.f115924c;
                if (aVar == null) {
                    aVar = new i13.a<>(4);
                    this.f115924c = aVar;
                }
                aVar.a(f.COMPLETE);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // q03.p
    public final void onError(Throwable th3) {
        if (this.f115925d) {
            k13.a.b(th3);
            return;
        }
        synchronized (this) {
            try {
                boolean z14 = true;
                if (!this.f115925d) {
                    this.f115925d = true;
                    if (this.f115923b) {
                        i13.a<Object> aVar = this.f115924c;
                        if (aVar == null) {
                            aVar = new i13.a<>(4);
                            this.f115924c = aVar;
                        }
                        f fVar = f.COMPLETE;
                        aVar.f87103b[0] = new f.b(th3);
                        return;
                    }
                    this.f115923b = true;
                    z14 = false;
                }
                if (z14) {
                    k13.a.b(th3);
                } else {
                    this.f115922a.onError(th3);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // u03.g
    public final boolean test(Object obj) {
        f fVar = f.COMPLETE;
        c<T> cVar = this.f115922a;
        if (obj == fVar) {
            cVar.onComplete();
            return true;
        }
        if (obj instanceof f.b) {
            cVar.onError(((f.b) obj).f87110a);
            return true;
        }
        if (obj instanceof f.a) {
            cVar.a(((f.a) obj).f87109a);
            return false;
        }
        cVar.c(obj);
        return false;
    }
}
