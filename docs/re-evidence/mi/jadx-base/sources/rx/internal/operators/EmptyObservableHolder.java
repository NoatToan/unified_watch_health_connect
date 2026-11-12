package rx.internal.operators;

import defpackage.p4h;
import defpackage.xno;

/* JADX INFO: loaded from: classes3.dex */
public enum EmptyObservableHolder implements p4h.a<Object> {
    INSTANCE;

    static final p4h<Object> EMPTY = p4h.A(INSTANCE);

    public static <T> p4h<T> instance() {
        return (p4h<T>) EMPTY;
    }

    @Override // defpackage.tc0
    public void call(xno<? super Object> xnoVar) {
        xnoVar.onCompleted();
    }
}
