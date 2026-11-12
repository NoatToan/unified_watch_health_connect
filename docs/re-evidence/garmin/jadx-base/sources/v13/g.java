package v13;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lv13/g;", "Lv13/a;", "Lt13/d;", "", "completion", "<init>", "(Lt13/d;)V", "Lt13/g;", "getContext", "()Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class g extends a {
    public g(t13.d<Object> dVar) {
        super(dVar);
        if (dVar == null || dVar.getF157466b() == t13.h.f161748a) {
            return;
        }
        vb.h.s("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext */
    public t13.g getF157466b() {
        return t13.h.f161748a;
    }
}
