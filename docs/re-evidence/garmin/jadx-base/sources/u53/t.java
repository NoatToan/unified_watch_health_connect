package u53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lu53/t;", "T", "Lo53/a;", "Lv13/d;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lt13/d;", "uCont", "<init>", "(Lt13/g;Lt13/d;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class t<T> extends o53.a<T> implements v13.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t13.d<T> f168769d;

    /* JADX WARN: Multi-variable type inference failed */
    public t(t13.g gVar, t13.d<? super T> dVar) {
        super(gVar, true, true);
        this.f168769d = dVar;
    }

    @Override // o53.p1
    public void A(Object obj) {
        this.f168769d.resumeWith(o53.w.a(obj));
    }

    @Override // o53.p1
    public final boolean f0() {
        return true;
    }

    @Override // v13.d
    public final v13.d getCallerFrame() {
        t13.d<T> dVar = this.f168769d;
        if (dVar instanceof v13.d) {
            return (v13.d) dVar;
        }
        return null;
    }

    @Override // o53.p1
    public void t(Object obj) {
        g.a(o53.w.a(obj), u13.f.b(this.f168769d));
    }

    public void w0() {
    }
}
