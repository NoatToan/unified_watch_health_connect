package defpackage;

import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;

/* JADX INFO: loaded from: classes3.dex */
public class g9l<T> extends xno<T> {
    public final xno<? super T> c;
    public boolean d;

    public g9l(xno<? super T> xnoVar) {
        super(xnoVar);
        this.c = xnoVar;
    }

    public void a(Throwable th) {
        s5l.c().b().a(th);
        try {
            this.c.onError(th);
            try {
                unsubscribe();
            } catch (Throwable th2) {
                p5l.f(th2);
                throw new OnErrorFailedException(th2);
            }
        } catch (OnErrorNotImplementedException e) {
            try {
                unsubscribe();
                throw e;
            } catch (Throwable th3) {
                p5l.f(th3);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th, th3)));
            }
        } catch (Throwable th4) {
            p5l.f(th4);
            try {
                unsubscribe();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th, th4)));
            } catch (Throwable th5) {
                p5l.f(th5);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th, th4, th5)));
            }
        }
    }

    @Override // defpackage.a6h
    public void onCompleted() {
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            this.c.onCompleted();
            try {
                unsubscribe();
            } catch (Throwable th) {
                p5l.f(th);
                throw new UnsubscribeFailedException(th.getMessage(), th);
            }
        } catch (Throwable th2) {
            try {
                pf8.d(th2);
                p5l.f(th2);
                throw new OnCompletedFailedException(th2.getMessage(), th2);
            } catch (Throwable th3) {
                try {
                    unsubscribe();
                    throw th3;
                } catch (Throwable th4) {
                    p5l.f(th4);
                    throw new UnsubscribeFailedException(th4.getMessage(), th4);
                }
            }
        }
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        pf8.d(th);
        if (this.d) {
            return;
        }
        this.d = true;
        a(th);
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
        try {
            if (this.d) {
                return;
            }
            this.c.onNext(t);
        } catch (Throwable th) {
            pf8.e(th, this);
        }
    }
}
