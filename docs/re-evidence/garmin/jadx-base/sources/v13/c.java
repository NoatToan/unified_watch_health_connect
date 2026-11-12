package v13;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lv13/c;", "Lv13/a;", "Lt13/d;", "", "completion", "Lt13/g;", "_context", "<init>", "(Lt13/d;Lt13/g;)V", "(Lt13/d;)V", "intercepted", "()Lt13/d;", "", "releaseIntercepted", "()V", "Lt13/g;", "Lt13/d;", "getContext", "()Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c extends a {
    private final t13.g _context;
    private transient t13.d<Object> intercepted;

    public c(t13.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getF129362e() : null);
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public t13.g getF129362e() {
        t13.g gVar = this._context;
        gVar.getClass();
        return gVar;
    }

    public final t13.d<Object> intercepted() {
        t13.d<Object> dVarInterceptContinuation = this.intercepted;
        if (dVarInterceptContinuation == null) {
            t13.e eVar = (t13.e) getF129362e().get(t13.e.f161746w0);
            if (eVar == null || (dVarInterceptContinuation = eVar.interceptContinuation(this)) == null) {
                dVarInterceptContinuation = this;
            }
            this.intercepted = dVarInterceptContinuation;
        }
        return dVarInterceptContinuation;
    }

    @Override // v13.a
    public void releaseIntercepted() {
        t13.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            t13.g.a aVar = getF129362e().get(t13.e.f161746w0);
            aVar.getClass();
            ((t13.e) aVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = b.f174830a;
    }

    public c(t13.d<Object> dVar, t13.g gVar) {
        super(dVar);
        this._context = gVar;
    }
}
