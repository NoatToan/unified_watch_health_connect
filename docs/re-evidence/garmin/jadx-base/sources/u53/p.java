package u53;

import o53.k0;
import o53.t1;
import o53.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lu53/p;", "Lo53/t1;", "Lo53/k0;", "", "cause", "", "errorHint", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p extends t1 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f168763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f168764b;

    public /* synthetic */ p(Throwable th3, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(th3, (i14 & 2) != 0 ? null : str);
    }

    @Override // o53.k0
    public final void C(long j8, o53.k kVar) {
        T();
        throw null;
    }

    @Override // o53.t1
    public final t1 H() {
        return this;
    }

    public final void T() {
        Throwable th3 = this.f168763a;
        if (th3 == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        String str = this.f168764b;
        throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(str != null ? ". ".concat(str) : ""), th3);
    }

    @Override // o53.z
    public final void dispatch(t13.g gVar, Runnable runnable) {
        T();
        throw null;
    }

    @Override // o53.z
    public final boolean isDispatchNeeded(t13.g gVar) {
        T();
        throw null;
    }

    @Override // o53.k0
    public final u0 j(long j8, Runnable runnable, t13.g gVar) {
        T();
        throw null;
    }

    @Override // o53.t1, o53.z
    public final o53.z limitedParallelism(int i14, String str) {
        T();
        throw null;
    }

    @Override // o53.t1, o53.z
    /* JADX INFO: renamed from: toString */
    public final String getF168767c() {
        StringBuilder sb3 = new StringBuilder("Dispatchers.Main[missing");
        Throwable th3 = this.f168763a;
        return androidx.room.a0.m(sb3, th3 != null ? am.j.p(", cause=", th3) : "", ']');
    }

    public p(Throwable th3, String str) {
        this.f168763a = th3;
        this.f168764b = str;
    }
}
