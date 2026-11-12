package u53;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu53/d;", "Lo53/b0;", "Lt13/g;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lt13/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f168725a;

    public d(t13.g gVar) {
        this.f168725a = gVar;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final t13.g getF168725a() {
        return this.f168725a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f168725a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
