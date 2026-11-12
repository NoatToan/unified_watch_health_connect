package s53;

import ch.qos.logback.core.CoreConstants;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls53/q;", "T", "Lu53/t;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lt13/d;", "uCont", "<init>", "(Lt13/g;Lt13/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q<T> extends u53.t<T> {
    public q(t13.g gVar, t13.d<? super T> dVar) {
        super(gVar, dVar);
    }

    @Override // o53.p1
    public final boolean N(Throwable th3) {
        if (th3 instanceof ChildCancelledException) {
            return true;
        }
        return D(th3);
    }
}
