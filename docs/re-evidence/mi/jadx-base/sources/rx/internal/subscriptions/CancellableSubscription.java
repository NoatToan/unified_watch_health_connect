package rx.internal.subscriptions;

import defpackage.koo;
import defpackage.p5l;
import defpackage.pf8;
import defpackage.qi3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class CancellableSubscription extends AtomicReference<qi3> implements koo {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableSubscription(qi3 qi3Var) {
        super(qi3Var);
    }

    @Override // defpackage.koo
    public boolean isUnsubscribed() {
        return get() == null;
    }

    @Override // defpackage.koo
    public void unsubscribe() {
        qi3 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e) {
            pf8.d(e);
            p5l.f(e);
        }
    }
}
