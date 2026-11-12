package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class r4h<T> extends o4h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5h<T> f32177a;

    public static final class a<T> extends AtomicReference<jz6> implements v4h<T>, jz6 {
        private static final long serialVersionUID = -3434801548987643227L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z5h<? super T> f32178a;

        public a(z5h<? super T> z5hVar) {
            this.f32178a = z5hVar;
        }

        @Override // defpackage.v4h
        public boolean a(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (isDisposed()) {
                return false;
            }
            try {
                this.f32178a.onError(th);
                return true;
            } finally {
                dispose();
            }
        }

        @Override // defpackage.jz6
        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // defpackage.v4h, defpackage.jz6
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // defpackage.r88
        public void onComplete() {
            if (isDisposed()) {
                return;
            }
            try {
                this.f32178a.onComplete();
            } finally {
                dispose();
            }
        }

        @Override // defpackage.r88
        public void onError(Throwable th) {
            if (a(th)) {
                return;
            }
            t5l.p(th);
        }

        @Override // defpackage.r88
        public void onNext(T t) {
            if (t == null) {
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (isDisposed()) {
                    return;
                }
                this.f32178a.onNext(t);
            }
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public r4h(j5h<T> j5hVar) {
        this.f32177a = j5hVar;
    }

    @Override // defpackage.o4h
    public void R(z5h<? super T> z5hVar) {
        a aVar = new a(z5hVar);
        z5hVar.onSubscribe(aVar);
        try {
            this.f32177a.subscribe(aVar);
        } catch (Throwable th) {
            qf8.b(th);
            aVar.onError(th);
        }
    }
}
