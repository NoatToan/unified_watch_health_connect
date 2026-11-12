package o53;

import kotlinx.coroutines.DispatchException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lo53/s1;", "Lo53/c2;", "Lt13/g;", "parentContext", "Lkotlin/Function2;", "Lo53/b0;", "Lt13/d;", "", "", "block", "<init>", "(Lt13/g;Le23/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 extends c2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t13.d<Unit> f129408d;

    public s1(t13.g gVar, e23.p<? super b0, ? super t13.d<? super Unit>, ? extends Object> pVar) {
        super(gVar, false);
        this.f129408d = u13.f.a(pVar, this, this);
    }

    @Override // o53.p1
    public final void m0() throws Throwable {
        try {
            t13.d dVarB = u13.f.b(this.f129408d);
            int i14 = o13.q.f128596b;
            u53.g.a(Unit.INSTANCE, dVarB);
        } catch (Throwable th3) {
            th = th3;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            int i15 = o13.q.f128596b;
            resumeWith(o13.r.a(th));
            throw th;
        }
    }
}
