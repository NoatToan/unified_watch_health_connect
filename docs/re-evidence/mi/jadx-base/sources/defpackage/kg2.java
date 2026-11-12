package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kg2<T, R> implements z5h<T>, bgi<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z5h<? super R> f23814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public jz6 f23815b;
    public bgi<T> c;
    public boolean d;
    public int e;

    public kg2(z5h<? super R> z5hVar) {
        this.f23814a = z5hVar;
    }

    public void a() {
    }

    public boolean b() {
        return true;
    }

    public final void c(Throwable th) {
        qf8.b(th);
        this.f23815b.dispose();
        onError(th);
    }

    @Override // defpackage.jdm
    public void clear() {
        this.c.clear();
    }

    public final int d(int i) {
        bgi<T> bgiVar = this.c;
        if (bgiVar == null || (i & 4) != 0) {
            return 0;
        }
        int iRequestFusion = bgiVar.requestFusion(i);
        if (iRequestFusion != 0) {
            this.e = iRequestFusion;
        }
        return iRequestFusion;
    }

    @Override // defpackage.jz6
    public void dispose() {
        this.f23815b.dispose();
    }

    @Override // defpackage.jz6
    public boolean isDisposed() {
        return this.f23815b.isDisposed();
    }

    @Override // defpackage.jdm
    public boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // defpackage.jdm
    public final boolean offer(R r2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.z5h
    public void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f23814a.onComplete();
    }

    @Override // defpackage.z5h
    public void onError(Throwable th) {
        if (this.d) {
            t5l.p(th);
        } else {
            this.d = true;
            this.f23814a.onError(th);
        }
    }

    @Override // defpackage.z5h
    public final void onSubscribe(jz6 jz6Var) {
        if (DisposableHelper.validate(this.f23815b, jz6Var)) {
            this.f23815b = jz6Var;
            if (jz6Var instanceof bgi) {
                this.c = (bgi) jz6Var;
            }
            if (b()) {
                this.f23814a.onSubscribe(this);
                a();
            }
        }
    }
}
