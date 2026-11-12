package androidx.lifecycle;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class b2 implements e23.l<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.z f7840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f7841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f7842c;

    public b2(o53.z zVar, b0 b0Var, c2 c2Var) {
        this.f7840a = zVar;
        this.f7841b = b0Var;
        this.f7842c = c2Var;
    }

    @Override // e23.l
    public final Unit invoke(Throwable th3) {
        t13.h hVar = t13.h.f161748a;
        o53.z zVar = this.f7840a;
        boolean zIsDispatchNeeded = zVar.isDispatchNeeded(hVar);
        c2 c2Var = this.f7842c;
        b0 b0Var = this.f7841b;
        if (zIsDispatchNeeded) {
            zVar.dispatch(hVar, new a2(b0Var, c2Var));
        } else {
            b0Var.d(c2Var);
        }
        return Unit.INSTANCE;
    }
}
