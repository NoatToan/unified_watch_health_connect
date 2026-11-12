package o53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo53/v0;", "Lo53/i;", "Lo53/u0;", "handle", "<init>", "(Lo53/u0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f129417a;

    public v0(u0 u0Var) {
        this.f129417a = u0Var;
    }

    @Override // o53.i
    public final void a(Throwable th3) {
        this.f129417a.dispose();
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f129417a + ']';
    }
}
