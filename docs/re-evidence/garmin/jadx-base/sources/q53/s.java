package q53;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq53/s;", "E", "Lq53/j;", "Lq53/t;", "Lt13/g;", "parentContext", "Lq53/i;", "channel", "<init>", "(Lt13/g;Lq53/i;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s<E> extends j<E> implements t<E> {
    public s(t13.g gVar, i<E> iVar) {
        super(gVar, iVar, true, true);
    }

    @Override // q53.t
    public final s getChannel() {
        return this;
    }

    @Override // o53.a
    public final void t0(Throwable th3, boolean z14) {
        if (this.f142997d.q(th3) || z14) {
            return;
        }
        kotlinx.coroutines.a.a(th3, this.f129302c);
    }

    @Override // o53.a
    public final void u0(Unit unit) {
        this.f142997d.q(null);
    }
}
