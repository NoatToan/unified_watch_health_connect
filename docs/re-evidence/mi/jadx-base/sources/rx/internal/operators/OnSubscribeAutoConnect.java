package rx.internal.operators;

import defpackage.hoo;
import defpackage.koo;
import defpackage.p4h;
import defpackage.qe4;
import defpackage.tc0;
import defpackage.xno;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeAutoConnect<T> extends AtomicInteger implements p4h.a<T> {
    final tc0<? super koo> connection;
    final int numberOfSubscribers;
    final qe4<? extends T> source;

    public OnSubscribeAutoConnect(qe4<? extends T> qe4Var, int i, tc0<? super koo> tc0Var) {
        if (i <= 0) {
            throw new IllegalArgumentException("numberOfSubscribers > 0 required");
        }
        this.source = qe4Var;
        this.numberOfSubscribers = i;
        this.connection = tc0Var;
    }

    @Override // defpackage.tc0
    public void call(xno<? super T> xnoVar) {
        this.source.B(hoo.a(xnoVar));
        if (incrementAndGet() == this.numberOfSubscribers) {
            this.source.C(this.connection);
        }
    }
}
