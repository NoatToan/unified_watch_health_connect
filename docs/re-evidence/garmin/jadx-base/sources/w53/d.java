package w53;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.g;
import w3.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lw53/d;", "Lo53/a;", "", "Lt13/g;", "parentContext", "Lq03/c;", "subscriber", "<init>", "(Lt13/g;Lq03/c;)V", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d extends o53.a<Unit> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q03.c f182772d;

    public d(g gVar, q03.c cVar) {
        super(gVar, false, true);
        this.f182772d = cVar;
    }

    @Override // o53.a
    public final void t0(Throwable th3, boolean z14) {
        try {
            if (((z03.c.a) this.f182772d).d(th3)) {
                return;
            }
        } catch (Throwable th4) {
            o13.g.a(th3, th4);
        }
        x.o(th3, this.f129302c);
    }

    @Override // o53.a
    public final void u0(Unit unit) {
        try {
            ((z03.c.a) this.f182772d).a();
        } catch (Throwable th3) {
            x.o(th3, this.f129302c);
        }
    }
}
