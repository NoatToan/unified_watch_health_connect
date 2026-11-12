package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class v5h extends o4h<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hfl f36503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36504b;
    public final TimeUnit c;

    public static final class a extends AtomicReference<jz6> implements jz6, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super Long> f36505a;

        public a(z5h<? super Long> z5hVar) {
            this.f36505a = z5hVar;
        }

        public void a(jz6 jz6Var) {
            DisposableHelper.trySet(this, jz6Var);
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // defpackage.jz6
        public boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (isDisposed()) {
                return;
            }
            this.f36505a.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.f36505a.onComplete();
        }
    }

    public v5h(long j, TimeUnit timeUnit, hfl hflVar) {
        this.f36504b = j;
        this.c = timeUnit;
        this.f36503a = hflVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super Long> z5hVar) {
        a aVar = new a(z5hVar);
        z5hVar.onSubscribe(aVar);
        aVar.a(this.f36503a.d(aVar, this.f36504b, this.c));
    }
}
