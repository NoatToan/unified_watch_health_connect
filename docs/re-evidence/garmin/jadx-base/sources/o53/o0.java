package o53;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lo53/o0;", "T", "Lu53/t;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lt13/d;", "uCont", "<init>", "(Lt13/g;Lt13/d;)V", "", "_decision", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0<T> extends u53.t<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f129375e = AtomicIntegerFieldUpdater.newUpdater(o0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public o0(t13.g gVar, t13.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // u53.t, o53.p1
    public final void A(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f129375e;
            int i14 = atomicIntegerFieldUpdater.get(this);
            if (i14 != 0) {
                if (i14 != 1) {
                    vb.h.z("Already resumed");
                    return;
                } else {
                    u53.g.a(w.a(obj), u13.f.b(this.f168769d));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }

    @Override // u53.t, o53.p1
    public final void t(Object obj) {
        A(obj);
    }
}
