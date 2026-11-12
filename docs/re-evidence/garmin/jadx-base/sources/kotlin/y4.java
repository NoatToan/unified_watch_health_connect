package kotlin;

import o13.h;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p3.e;
import p3.p;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
public final /* synthetic */ class y4 implements r2.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f91665a;

    public y4(p pVar) {
        this.f91665a = pVar;
    }

    @Override // i5.r2.a
    public final e a(s2 s2Var) {
        return this.f91665a.v(s2Var);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof r2.a) && (obj instanceof n)) {
            return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p005kotlin.jvm.internal.n
    public final h<?> getFunctionDelegate() {
        return new q(1, this.f91665a, p.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
