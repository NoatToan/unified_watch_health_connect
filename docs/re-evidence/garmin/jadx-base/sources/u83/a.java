package u83;

import j83.n;
import java.util.Arrays;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.UnsubscribeFailedException;
import v83.s;
import v83.v;

/* JADX INFO: loaded from: classes11.dex */
public class a<T> extends n<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n<? super T> f169498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f169499f;

    public a(n<? super T> nVar) {
        super(nVar);
        this.f169498e = nVar;
    }

    @Override // j83.f
    public final void a() {
        if (this.f169499f) {
            return;
        }
        this.f169499f = true;
        try {
            this.f169498e.a();
            try {
                f();
            } catch (Throwable th3) {
                s.a(th3);
                throw new UnsubscribeFailedException(th3.getMessage(), th3);
            }
        } catch (Throwable th4) {
            try {
                m83.a.b(th4);
                s.a(th4);
                throw new OnCompletedFailedException(th4.getMessage(), th4);
            } catch (Throwable th5) {
                try {
                    f();
                    throw th5;
                } catch (Throwable th6) {
                    s.a(th6);
                    throw new UnsubscribeFailedException(th6.getMessage(), th6);
                }
            }
        }
    }

    @Override // j83.f
    public final void c(T t7) {
        try {
            if (this.f169499f) {
                return;
            }
            this.f169498e.c(t7);
        } catch (Throwable th3) {
            m83.a.c(th3, this);
        }
    }

    @Override // j83.f
    public final void onError(Throwable th3) {
        m83.a.b(th3);
        if (this.f169499f) {
            return;
        }
        this.f169499f = true;
        v.f176271f.b().getClass();
        try {
            this.f169498e.onError(th3);
            try {
                f();
            } catch (Throwable th4) {
                s.a(th4);
                throw new OnErrorFailedException(th4);
            }
        } catch (OnErrorNotImplementedException e4) {
            try {
                f();
                throw e4;
            } catch (Throwable th5) {
                s.a(th5);
                throw new OnErrorNotImplementedException("Observer.onError not implemented and error while unsubscribing.", new CompositeException(Arrays.asList(th3, th5)));
            }
        } catch (Throwable th6) {
            s.a(th6);
            try {
                f();
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError", new CompositeException(Arrays.asList(th3, th6)));
            } catch (Throwable th7) {
                s.a(th7);
                throw new OnErrorFailedException("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new CompositeException(Arrays.asList(th3, th6, th7)));
            }
        }
    }
}
