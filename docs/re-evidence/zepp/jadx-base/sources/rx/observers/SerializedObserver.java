package rx.observers;

import rx.Observer;
import rx.exceptions.Exceptions;
import rx.exceptions.OnErrorThrowable;
import rx.internal.operators.NotificationLite;

/* JADX INFO: loaded from: classes23.dex */
public class SerializedObserver<T> implements Observer<T> {
    private final Observer<? super T> a;
    private boolean b;
    private volatile boolean c;
    private a d;

    public static final class a {
        public Object[] a;
        public int b;

        public void a(Object obj) {
            int i = this.b;
            Object[] objArr = this.a;
            if (objArr == null) {
                objArr = new Object[16];
                this.a = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[(i >> 2) + i];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.a = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.b = i + 1;
        }
    }

    public SerializedObserver(Observer<? super T> observer) {
        this.a = observer;
    }

    @Override // rx.Observer
    public void onCompleted() {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (!this.b) {
                this.b = true;
                this.a.onCompleted();
                return;
            }
            a aVar = this.d;
            if (aVar == null) {
                aVar = new a();
                this.d = aVar;
            }
            aVar.a(NotificationLite.completed());
        }
    }

    @Override // rx.Observer
    public void onError(Throwable th) {
        Exceptions.throwIfFatal(th);
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (!this.b) {
                this.b = true;
                this.a.onError(th);
                return;
            }
            a aVar = this.d;
            if (aVar == null) {
                aVar = new a();
                this.d = aVar;
            }
            aVar.a(NotificationLite.error(th));
        }
    }

    @Override // rx.Observer
    public void onNext(T t) {
        if (this.c) {
            return;
        }
        synchronized (this) {
            if (this.c) {
                return;
            }
            if (this.b) {
                a aVar = this.d;
                if (aVar == null) {
                    aVar = new a();
                    this.d = aVar;
                }
                aVar.a(NotificationLite.next(t));
                return;
            }
            this.b = true;
            try {
                this.a.onNext(t);
                while (true) {
                    synchronized (this) {
                        a aVar2 = this.d;
                        if (aVar2 == null) {
                            this.b = false;
                            return;
                        }
                        this.d = null;
                        for (Object obj : aVar2.a) {
                            if (obj == null) {
                                break;
                            }
                            try {
                                if (NotificationLite.accept(this.a, obj)) {
                                    this.c = true;
                                    return;
                                }
                            } catch (Throwable th) {
                                this.c = true;
                                Exceptions.throwIfFatal(th);
                                this.a.onError(OnErrorThrowable.addValueAsLastCause(th, t));
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                this.c = true;
                Exceptions.throwOrReport(th2, this.a, t);
            }
        }
    }
}
