package defpackage;

import java.util.concurrent.Callable;
import rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class z9h<T> implements p4h.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable<? extends T> f41050a;

    public z9h(Callable<? extends T> callable) {
        this.f41050a = callable;
    }

    @Override // defpackage.tc0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(xno<? super T> xnoVar) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(xnoVar);
        xnoVar.setProducer(singleDelayedProducer);
        try {
            singleDelayedProducer.setValue(this.f41050a.call());
        } catch (Throwable th) {
            pf8.e(th, xnoVar);
        }
    }
}
