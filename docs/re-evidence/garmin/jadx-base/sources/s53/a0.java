package s53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ls53/a0;", "T", "Lt13/d;", "Lv13/d;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "uCont", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lt13/d;Lt13/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a0<T> implements t13.d<T>, v13.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.d<T> f157465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t13.g f157466b;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(t13.d<? super T> dVar, t13.g gVar) {
        this.f157465a = dVar;
        this.f157466b = gVar;
    }

    @Override // v13.d
    public final v13.d getCallerFrame() {
        t13.d<T> dVar = this.f157465a;
        if (dVar instanceof v13.d) {
            return (v13.d) dVar;
        }
        return null;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final t13.g getF157466b() {
        return this.f157466b;
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        this.f157465a.resumeWith(obj);
    }
}
